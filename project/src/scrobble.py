#!/usr/bin/env python
import pylast
import webbrowser
import time
import os
import subprocess
import json
import signal
import sys
from RPLCD.gpio import CharLCD
from RPLCD import Alignment, CursorMode, ShiftMode
from RPLCD import cursor
from RPLCD import BacklightMode
import RPi.GPIO as GPIO


def write_to_lcd(lcd, framebuffer, num_cols):
    lcd.home()
    for row in framebuffer:
        lcd.write_string(row.ljust(num_cols)[:num_cols])
        lcd.write_string('\r\n')

def loop_string(string, lcd, framebuffer, row, num_cols, delay=0.4):
    padding = ' ' * num_cols
    s = padding + string + padding
    for i in range(len(s) - num_cols + 1):
        framebuffer[row] = s[i:i+num_cols]
        write_to_lcd(lcd, framebuffer, num_cols)
        time.sleep(delay)
def exit_handler(signal, frame):
    global lcd
    lcd.clear()
    lcd.backlight_enabled = False
    sys.exit(0)

def switchCallback(channel):
    #switch was deactivated, shut down system and go to sleep
    print("Entered callback")
    lcd.clear()
    lcd.backlight_enabled = False
    global RUN
    RUN = False

lcd = CharLCD(cols=16, rows=2, pin_backlight=7, backlight_mode=BacklightMode.active_high, pins_data=[22, 32, 36, 38, 40, 29, 33, 31])
lcd.backlight_enabled = False
API_KEY = "596ef01976cabe55d2736863e1f32401"
API_SECRET = "60557685c3d1a22d70256a530e343c75"
SESSION_KEY_FILE = "sessionKey.txt"

GRACENOTE_CID = "1454665727"
GRACENOTE_CTAG = "241808D3D1D5E2E4005CF5D4169098FB"
GRACENOTE_LFILE = "license"

OPENING_STRING = "Authenticating\n\rwith LastFM..."
LISTENING_PROMPT = "Listening..."
NOW_LISTENING_PROMPT = "Now listening:"
nowListeningFrameBuffer = [
    NOW_LISTENING_PROMPT,
    '',
]

SWITCH_CHANNEL = 12

RUN = False

def main():
    username = "CamJohn96"
    password = 'QjcX]r]9;~^B{iJB<]W~^`X`#s37L}wMD"j'
    password_hash = pylast.md5(password)

    #start by checking if switch is on

    lcd.backlight_enabled = True

    #print starting string and record session start time
    session_start = time.time()
    lcd.write_string(OPENING_STRING)

    #signal.signal(signal.SIGINT, exit_handler)

    network = pylast.LastFMNetwork(api_key=API_KEY, api_secret=API_SECRET)

    if not os.path.exists(SESSION_KEY_FILE):

        skg = pylast.SessionKeyGenerator(network)
        url = skg.get_web_auth_url()

        print("Please authenticate with last.fm to use scrobbler.\nOpen the following URL in a web browser to authenticate.")
        print(url)

        while True:
            try:
                session_key = skg.get_web_auth_session_key(url)
                fp = open(SESSION_KEY_FILE, "w")
                fp.write(session_key)
                fp.close()
                break
            except pylast.WSError:
                time.sleep(1)
    else:
        session_key = open(SESSION_KEY_FILE).read()

    network.session_key = session_key

    while RUN:
        attempts = 0

        try_again = True
        while try_again:
            print("Run: " + str(RUN))
            if not RUN:
                print("Quitting")
                return()
            #print listening promp
            lcd.clear()
            lcd.write_string(LISTENING_PROMPT + "\n\rAttempts: " + str(attempts))
            #run C program to listen to music
            completed = subprocess.run(["./scrobbler", GRACENOTE_CID, GRACENOTE_CTAG, GRACENOTE_LFILE, "online"], stdout=subprocess.PIPE, stderr=subprocess.PIPE)

            #process output of C program

            output = completed.stdout.decode("utf-8")

            #if album is not recognized, try again
            try:
                json_data = json.loads(output)
            except json.decoder.JSONDecodeError as err:
                #try to recognize song again
                print("Song was not recognized. Trying again.")
                attempts += 1
            else:
                try_again = False

        artist = json_data["artist"]
        track_title = json_data["track_title"]
        album_title = json_data["album_title"]
        track_duration = json_data["track_duration"]
        track_position = json_data["track_position"]

        #add song to now playing
        network.update_now_playing(artist, track_title, album=album_title, duration=track_duration)
        #print song title to lcd
        remaining = (float(track_duration) - float(track_position)) / 1000.0
        stopTime = time.time() + remaining
        lcd.clear()
        lcd.write_string(NOW_LISTENING_PROMPT)

        if len(track_title) > 16:
            while time.time() < (stopTime + 5):
                loop_string(track_title, lcd, nowListeningFrameBuffer, 1, 16)
        else:
            lcd.write_string("\n\r" + track_title)
            time.sleep(remaining + 5)
        #scrobble song


        #time.sleep(remaining + 5)

        #scrobble previous song
        time_started = int(time.time() - (float(track_duration) / 1000))
        network.scrobble(artist, track_title, time_started, album=album_title, duration=track_duration)

#run no longer active, wait for edge and start over
GPIO.setup(SWITCH_CHANNEL, GPIO.IN)
while True:
    print(GPIO.input(SWITCH_CHANNEL))
    if not GPIO.input(SWITCH_CHANNEL):
        #switch is not activated, wait for edge

        GPIO.wait_for_edge(12, GPIO.RISING, bouncetime=200)
        print("Past initial wait")
    RUN = True
    GPIO.add_event_detect(SWITCH_CHANNEL, GPIO.RISING, bouncetime=200)
    GPIO.add_event_callback(SWITCH_CHANNEL, switchCallback)
    main()
    GPIO.remove_event_detect(SWITCH_CHANNEL)
    GPIO.wait_for_edge(SWITCH_CHANNEL, GPIO.RISING, bouncetime=200)
