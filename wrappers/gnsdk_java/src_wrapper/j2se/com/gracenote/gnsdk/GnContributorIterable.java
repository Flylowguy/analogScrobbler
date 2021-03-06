/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnContributorIterable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnContributorIterable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnContributorIterable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnContributorIterable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnContributorIterable(GnContributorProvider provider, long start) {
    this(gnsdk_javaJNI.new_GnContributorIterable(GnContributorProvider.getCPtr(provider), provider, start), true);
  }

  public GnContributorIterator getIterator() {
    return new GnContributorIterator(gnsdk_javaJNI.GnContributorIterable_getIterator(swigCPtr, this), true);
  }

  public GnContributorIterator end() {
    return new GnContributorIterator(gnsdk_javaJNI.GnContributorIterable_end(swigCPtr, this), true);
  }

  public long count() {
    return gnsdk_javaJNI.GnContributorIterable_count(swigCPtr, this);
  }

  public GnContributorIterator at(long index) {
    return new GnContributorIterator(gnsdk_javaJNI.GnContributorIterable_at(swigCPtr, this, index), true);
  }

  public GnContributorIterator getByIndex(long index) {
    return new GnContributorIterator(gnsdk_javaJNI.GnContributorIterable_getByIndex(swigCPtr, this, index), true);
  }

}
