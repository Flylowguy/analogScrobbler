/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnMusicIdFileInfoIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnMusicIdFileInfoIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnMusicIdFileInfoIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnMusicIdFileInfoIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnMusicIdFileInfo __ref__() throws com.gracenote.gnsdk.GnException {
    return new GnMusicIdFileInfo(gnsdk_javaJNI.GnMusicIdFileInfoIterator___ref__(swigCPtr, this), false);
  }

  public GnMusicIdFileInfo next() throws com.gracenote.gnsdk.GnException {
    return new GnMusicIdFileInfo(gnsdk_javaJNI.GnMusicIdFileInfoIterator_next(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return gnsdk_javaJNI.GnMusicIdFileInfoIterator_hasNext(swigCPtr, this);
  }

  public long distance(GnMusicIdFileInfoIterator itr) {
    return gnsdk_javaJNI.GnMusicIdFileInfoIterator_distance(swigCPtr, this, GnMusicIdFileInfoIterator.getCPtr(itr), itr);
  }

  public GnMusicIdFileInfoIterator(musicid_file_info_provider provider, long pos) {
    this(gnsdk_javaJNI.new_GnMusicIdFileInfoIterator(musicid_file_info_provider.getCPtr(provider), provider, pos), true);
  }

}
