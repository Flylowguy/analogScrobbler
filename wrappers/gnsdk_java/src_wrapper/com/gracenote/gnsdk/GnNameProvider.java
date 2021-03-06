/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnNameProvider {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnNameProvider(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnNameProvider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnNameProvider(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnNameProvider(GnDataObject obj, String key) {
    this(gnsdk_javaJNI.new_GnNameProvider(GnDataObject.getCPtr(obj), obj, key), true);
  }

  public GnName getData(long pos) {
    return new GnName(gnsdk_javaJNI.GnNameProvider_getData(swigCPtr, this, pos), true);
  }

  public long count() {
    return gnsdk_javaJNI.GnNameProvider_count(swigCPtr, this);
  }

}
