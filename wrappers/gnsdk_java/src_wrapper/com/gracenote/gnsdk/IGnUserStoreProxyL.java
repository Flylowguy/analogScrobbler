/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class IGnUserStoreProxyL {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IGnUserStoreProxyL(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IGnUserStoreProxyL obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_IGnUserStoreProxyL(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    gnsdk_javaJNI.IGnUserStoreProxyL_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    gnsdk_javaJNI.IGnUserStoreProxyL_change_ownership(this, swigCPtr, true);
  }

  public GnString LoadSerializedUser(String clientId) {
    return new GnString(gnsdk_javaJNI.IGnUserStoreProxyL_LoadSerializedUser(swigCPtr, this, clientId), true);
  }

  public boolean StoreSerializedUser(String clientId, String userData) {
    return gnsdk_javaJNI.IGnUserStoreProxyL_StoreSerializedUser(swigCPtr, this, clientId, userData);
  }

  public IGnUserStoreProxyL() {
    this(gnsdk_javaJNI.new_IGnUserStoreProxyL(), true);
    gnsdk_javaJNI.IGnUserStoreProxyL_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
