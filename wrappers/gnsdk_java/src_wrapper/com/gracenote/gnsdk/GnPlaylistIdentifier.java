/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnPlaylistIdentifier {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnPlaylistIdentifier(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnPlaylistIdentifier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnPlaylistIdentifier(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String mediaIdentifier() {
    return gnsdk_javaJNI.GnPlaylistIdentifier_mediaIdentifier(swigCPtr, this);
  }

  public String collectionName() {
    return gnsdk_javaJNI.GnPlaylistIdentifier_collectionName(swigCPtr, this);
  }

}
