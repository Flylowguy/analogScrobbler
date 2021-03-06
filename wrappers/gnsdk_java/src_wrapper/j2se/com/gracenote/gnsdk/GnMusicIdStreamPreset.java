
package com.gracenote.gnsdk;

/** Application type mobile, i.e. audio is captured by microphone 
* 
*/ 
 
public enum GnMusicIdStreamPreset {
/** Application type radio, i.e. audio is captured at source (e.g. speaker) 
* 
*/ 
 
  kPresetInvalid(0),
 
 
  kPresetMicrophone,
 
 
  kPresetRadio;

  protected final int swigValue() {
    return swigValue;
  }

  protected static GnMusicIdStreamPreset swigToEnum(int swigValue) {
    GnMusicIdStreamPreset[] swigValues = GnMusicIdStreamPreset.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GnMusicIdStreamPreset swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GnMusicIdStreamPreset.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GnMusicIdStreamPreset() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GnMusicIdStreamPreset(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GnMusicIdStreamPreset(GnMusicIdStreamPreset swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

