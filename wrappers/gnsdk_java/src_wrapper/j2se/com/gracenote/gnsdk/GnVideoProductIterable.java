/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnVideoProductIterable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnVideoProductIterable(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnVideoProductIterable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnVideoProductIterable(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnVideoProductIterable(GnVideoProductProvider provider, long start) {
    this(gnsdk_javaJNI.new_GnVideoProductIterable(GnVideoProductProvider.getCPtr(provider), provider, start), true);
  }

  public GnVideoProductIterator getIterator() {
    return new GnVideoProductIterator(gnsdk_javaJNI.GnVideoProductIterable_getIterator(swigCPtr, this), true);
  }

  public GnVideoProductIterator end() {
    return new GnVideoProductIterator(gnsdk_javaJNI.GnVideoProductIterable_end(swigCPtr, this), true);
  }

  public long count() {
    return gnsdk_javaJNI.GnVideoProductIterable_count(swigCPtr, this);
  }

  public GnVideoProductIterator at(long index) {
    return new GnVideoProductIterator(gnsdk_javaJNI.GnVideoProductIterable_at(swigCPtr, this, index), true);
  }

  public GnVideoProductIterator getByIndex(long index) {
    return new GnVideoProductIterator(gnsdk_javaJNI.GnVideoProductIterable_getByIndex(swigCPtr, this, index), true);
  }

}
