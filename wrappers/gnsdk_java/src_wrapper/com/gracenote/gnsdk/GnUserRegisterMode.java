/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public enum GnUserRegisterMode {
  kUserRegisterModeOnline(1),
  kUserRegisterModeLocalOnly;

  protected final int swigValue() {
    return swigValue;
  }

  protected static GnUserRegisterMode swigToEnum(int swigValue) {
    GnUserRegisterMode[] swigValues = GnUserRegisterMode.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GnUserRegisterMode swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GnUserRegisterMode.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GnUserRegisterMode() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GnUserRegisterMode(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GnUserRegisterMode(GnUserRegisterMode swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

