/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnVideoSide extends GnDataObject {
  private long swigCPtr;

  protected GnVideoSide(long cPtr, boolean cMemoryOwn) {
    super(gnsdk_javaJNI.GnVideoSide_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnVideoSide obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnVideoSide(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public long ordinal() {
    return gnsdk_javaJNI.GnVideoSide_ordinal(swigCPtr, this);
  }

  public boolean matched() {
    return gnsdk_javaJNI.GnVideoSide_matched(swigCPtr, this);
  }

  public String notes() {
    return gnsdk_javaJNI.GnVideoSide_notes(swigCPtr, this);
  }

  public GnTitle officialTitle() {
    return new GnTitle(gnsdk_javaJNI.GnVideoSide_officialTitle(swigCPtr, this), true);
  }

  public GnVideoLayerIterable layers() {
    return new GnVideoLayerIterable(gnsdk_javaJNI.GnVideoSide_layers(swigCPtr, this), true);
  }

}
