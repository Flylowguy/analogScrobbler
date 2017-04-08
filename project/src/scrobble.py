#!/usr/bin/env python
import pylast
import webbrowser
import time
import os
import subprocess
import json

API_KEY = "596ef01976cabe55d2736863e1f32401"
API_SECRET = "60557685c3d1a22d70256a530e343c75"
SESSION_KEY_FILE = "sessionKey.txt"

GRACENOTE_CID = "1454665727"
GRACENOTE_CTAG = "241808D3D1D5E2E4005CF5D4169098FB"
GRACENOTE_LFILE = "license"

username = "CamJohn96"
password = 'QjcX]r]9;~^B{iJB<]W~^`X`#s37L}wMD"j'
password_hash = pylast.md5(password)

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

while True:
    try_again = True
    while try_again:
        #run C program to listen to music
        completed = subprocess.run(["./scrobbler", GRACENOTE_CID, GRACENOTE_CTAG, GRACENOTE_LFILE, "online"], stdout=subprocess.PIPE, stderr=subprocess.PIPE)

        #process output of C program

        output = completed.stdout.decode("utf-8")

        #if album is not recognized, try again
        try:
            json_data = json.loads(output)
        except JSONDecodeError:
            #try to recognize song again
            print("Song was not recognized. Trying again.")
        else:
            try_again = False
    artist = json_data["artist"]
    track_title = json_data["track_title"]
    album_title = json_data["album_title"]
    track_duration = json_data["track_duration"]
    track_position = json_data["track_position"]

    #add song to now playing
    network.update_now_playing(artist, track_title, album=album_title, duration=track_duration)
    #scrobble song
    #sleep until song is over
    remaining = (float(track_duration) - float(track_position)) / 1000.0

    time.sleep(remaining + 5)

    #scrobble previous song
    time_started = int(time.time() - (float(track_duration) / 1000))
    network.scrobble(artist, track_title, time_started, album=album_title, duration=track_duration)



