/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnPlaylistCollectionIdentIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnPlaylistCollectionIdentIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnPlaylistCollectionIdentIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnPlaylistCollectionIdentIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnPlaylistIdentifier __ref__() throws com.gracenote.gnsdk.GnException {
    return new GnPlaylistIdentifier(gnsdk_javaJNI.GnPlaylistCollectionIdentIterator___ref__(swigCPtr, this), false);
  }

  public GnPlaylistIdentifier next() throws com.gracenote.gnsdk.GnException {
    return new GnPlaylistIdentifier(gnsdk_javaJNI.GnPlaylistCollectionIdentIterator_next(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return gnsdk_javaJNI.GnPlaylistCollectionIdentIterator_hasNext(swigCPtr, this);
  }

  public long distance(GnPlaylistCollectionIdentIterator itr) {
    return gnsdk_javaJNI.GnPlaylistCollectionIdentIterator_distance(swigCPtr, this, GnPlaylistCollectionIdentIterator.getCPtr(itr), itr);
  }

  public GnPlaylistCollectionIdentIterator(collection_ident_provider provider, long pos) {
    this(gnsdk_javaJNI.new_GnPlaylistCollectionIdentIterator(collection_ident_provider.getCPtr(provider), provider, pos), true);
  }

}
