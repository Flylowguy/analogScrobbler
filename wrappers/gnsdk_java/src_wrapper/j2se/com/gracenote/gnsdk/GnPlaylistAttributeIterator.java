
package com.gracenote.gnsdk;

/** 
* <b>Experimental</b>: Iterate through a collection of attributes 
*/ 
 
public class GnPlaylistAttributeIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnPlaylistAttributeIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnPlaylistAttributeIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnPlaylistAttributeIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String __ref__() {
    return gnsdk_javaJNI.GnPlaylistAttributeIterator___ref__(swigCPtr, this);
  }

  public String next() throws com.gracenote.gnsdk.GnException {
    return gnsdk_javaJNI.GnPlaylistAttributeIterator_next(swigCPtr, this);
  }

  public boolean hasNext() {
    return gnsdk_javaJNI.GnPlaylistAttributeIterator_hasNext(swigCPtr, this);
  }

  public long distance(GnPlaylistAttributeIterator itr) {
    return gnsdk_javaJNI.GnPlaylistAttributeIterator_distance(swigCPtr, this, GnPlaylistAttributeIterator.getCPtr(itr), itr);
  }

  public GnPlaylistAttributeIterator(attribute_provider provider, long pos) {
    this(gnsdk_javaJNI.new_GnPlaylistAttributeIterator__SWIG_0(attribute_provider.getCPtr(provider), provider, pos), true);
  }

  public GnPlaylistAttributeIterator(GnPlaylistAttributeIterator copy) {
    this(gnsdk_javaJNI.new_GnPlaylistAttributeIterator__SWIG_1(GnPlaylistAttributeIterator.getCPtr(copy), copy), true);
  }

}