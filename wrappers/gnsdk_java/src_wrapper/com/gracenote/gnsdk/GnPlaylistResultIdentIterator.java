/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnPlaylistResultIdentIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnPlaylistResultIdentIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnPlaylistResultIdentIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnPlaylistResultIdentIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnPlaylistIdentifier __ref__() throws com.gracenote.gnsdk.GnException {
    return new GnPlaylistIdentifier(gnsdk_javaJNI.GnPlaylistResultIdentIterator___ref__(swigCPtr, this), false);
  }

  public GnPlaylistIdentifier next() throws com.gracenote.gnsdk.GnException {
    return new GnPlaylistIdentifier(gnsdk_javaJNI.GnPlaylistResultIdentIterator_next(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return gnsdk_javaJNI.GnPlaylistResultIdentIterator_hasNext(swigCPtr, this);
  }

  public long distance(GnPlaylistResultIdentIterator itr) {
    return gnsdk_javaJNI.GnPlaylistResultIdentIterator_distance(swigCPtr, this, GnPlaylistResultIdentIterator.getCPtr(itr), itr);
  }

  public GnPlaylistResultIdentIterator(result_provider provider, long pos) {
    this(gnsdk_javaJNI.new_GnPlaylistResultIdentIterator(result_provider.getCPtr(provider), provider, pos), true);
  }

}
