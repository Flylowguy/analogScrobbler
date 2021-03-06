/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public enum GnMusicIdStreamIdentifyingStatus {
  kStatusIdentifyingInvalid(0),
  kStatusIdentifyingStarted,
  kStatusIdentifyingFpGenerated,
  kStatusIdentifyingLocalQueryStarted,
  kStatusIdentifyingLocalQueryEnded,
  kStatusIdentifyingOnlineQueryStarted,
  kStatusIdentifyingOnlineQueryEnded,
  kStatusIdentifyingEnded;

  protected final int swigValue() {
    return swigValue;
  }

  protected static GnMusicIdStreamIdentifyingStatus swigToEnum(int swigValue) {
    GnMusicIdStreamIdentifyingStatus[] swigValues = GnMusicIdStreamIdentifyingStatus.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GnMusicIdStreamIdentifyingStatus swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GnMusicIdStreamIdentifyingStatus.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GnMusicIdStreamIdentifyingStatus() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GnMusicIdStreamIdentifyingStatus(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GnMusicIdStreamIdentifyingStatus(GnMusicIdStreamIdentifyingStatus swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

