/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnAsset extends GnDataObject {
  private long swigCPtr;

  protected GnAsset(long cPtr, boolean cMemoryOwn) {
    super(gnsdk_javaJNI.GnAsset_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnAsset obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnAsset(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String dimension() {
    return gnsdk_javaJNI.GnAsset_dimension(swigCPtr, this);
  }

  public int bytes() {
    return gnsdk_javaJNI.GnAsset_bytes(swigCPtr, this);
  }

  public GnImageSize size() {
    return GnImageSize.swigToEnum(gnsdk_javaJNI.GnAsset_size(swigCPtr, this));
  }

  public String url() {
    return gnsdk_javaJNI.GnAsset_url(swigCPtr, this);
  }

}
