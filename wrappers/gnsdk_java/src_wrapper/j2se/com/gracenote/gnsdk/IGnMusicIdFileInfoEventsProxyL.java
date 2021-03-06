/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

class IGnMusicIdFileInfoEventsProxyL {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IGnMusicIdFileInfoEventsProxyL(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IGnMusicIdFileInfoEventsProxyL obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_IGnMusicIdFileInfoEventsProxyL(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  protected void swigReleaseOwnership() {
    swigCMemOwn = false;
    gnsdk_javaJNI.IGnMusicIdFileInfoEventsProxyL_change_ownership(this, swigCPtr, false);
  }

  protected void swigTakeOwnership() {
    swigCMemOwn = true;
    gnsdk_javaJNI.IGnMusicIdFileInfoEventsProxyL_change_ownership(this, swigCPtr, true);
  }

    private IGnMusicIdFileInfoEventsProxyU fileInfoEventHandlerProxy;
    private long getCancellerCPtrFromCancellable(IGnCancellable cancellable) {
    	if ( cancellable instanceof IGnCancellableProxy ){
    		IGnCancellableProxy canceller = (IGnCancellableProxy)cancellable;
    		return IGnCancellableProxy.getCPtr(canceller);
    	}
    	return 0;
    }    

  public void gatherFingerprint(GnMusicIdFileInfo fileinfo, long currentFile, long totalFiles, IGnCancellable canceller) {
IGnCancellableProxy iGnCanceller = (canceller instanceof IGnCancellableProxy)?(IGnCancellableProxy)canceller:null;
    {
      gnsdk_javaJNI.IGnMusicIdFileInfoEventsProxyL_gatherFingerprint(swigCPtr, this, GnMusicIdFileInfo.getCPtr(fileinfo), fileinfo, currentFile, totalFiles, getCancellerCPtrFromCancellable(canceller), iGnCanceller);
    }
  }

  public void gatherMetadata(GnMusicIdFileInfo fileinfo, long currentFile, long totalFiles, IGnCancellable canceller) {
IGnCancellableProxy iGnCanceller = (canceller instanceof IGnCancellableProxy)?(IGnCancellableProxy)canceller:null;
    {
      gnsdk_javaJNI.IGnMusicIdFileInfoEventsProxyL_gatherMetadata(swigCPtr, this, GnMusicIdFileInfo.getCPtr(fileinfo), fileinfo, currentFile, totalFiles, getCancellerCPtrFromCancellable(canceller), iGnCanceller);
    }
  }

  public IGnMusicIdFileInfoEventsProxyL() {
    this(gnsdk_javaJNI.new_IGnMusicIdFileInfoEventsProxyL(), true);
    gnsdk_javaJNI.IGnMusicIdFileInfoEventsProxyL_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
