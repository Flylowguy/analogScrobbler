/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnMoodgrid extends GnObject {
  private long swigCPtr;

  protected GnMoodgrid(long cPtr, boolean cMemoryOwn) {
    super(gnsdk_javaJNI.GnMoodgrid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnMoodgrid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnMoodgrid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GnMoodgrid() {
    this(gnsdk_javaJNI.new_GnMoodgrid(), true);
  }

  public static String version() {
    return gnsdk_javaJNI.GnMoodgrid_version();
  }

  public static String buildDate() {
    return gnsdk_javaJNI.GnMoodgrid_buildDate();
  }

  public GnMoodgridProviderIterable providers() {
    return new GnMoodgridProviderIterable(gnsdk_javaJNI.GnMoodgrid_providers(swigCPtr, this), true);
  }

  public GnMoodgridPresentation createPresentation(GnUser user, GnMoodgridPresentationType type, GnMoodgridCoordinateType coordinate) throws com.gracenote.gnsdk.GnException {
    return new GnMoodgridPresentation(gnsdk_javaJNI.GnMoodgrid_createPresentation(swigCPtr, this, GnUser.getCPtr(user), user, type.swigValue(), coordinate.swigValue()), true);
  }

  public GnMoodgridDataPoint dimensions(GnMoodgridPresentationType type) throws com.gracenote.gnsdk.GnException {
    return new GnMoodgridDataPoint(gnsdk_javaJNI.GnMoodgrid_dimensions(swigCPtr, this, type.swigValue()), true);
  }

}