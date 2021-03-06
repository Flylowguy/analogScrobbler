/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnLinkOptions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnLinkOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnLinkOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnLinkOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void lookupMode(GnLookupMode lookupMode) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLinkOptions_lookupMode(swigCPtr, this, lookupMode.swigValue());
  }

  public void trackOrdinal(long number) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLinkOptions_trackOrdinal(swigCPtr, this, number);
  }

  public void dataSource(String datasource) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLinkOptions_dataSource(swigCPtr, this, datasource);
  }

  public void dataType(String datatype) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLinkOptions_dataType(swigCPtr, this, datatype);
  }

  public void networkInterface(String ipAddress) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLinkOptions_networkInterface(swigCPtr, this, ipAddress);
  }

  public void clear() throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLinkOptions_clear(swigCPtr, this);
  }

}
