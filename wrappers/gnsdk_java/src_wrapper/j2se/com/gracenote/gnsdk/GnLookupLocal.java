
package com.gracenote.gnsdk;

/** 
* Provides services for local lookup of various identification queries such as 
* text and CD TOC search; plus provides services for local retreival of content 
* such as cover art. 
* <p> 
* When enabled other GNSDK query objects are able to perform local lookups for 
* various types of Gracenote searches. For example your application can perform 
* a local text search via {@link GnMusicId} by enabling {@link GnLookupLocal} and setting the 
* {@link GnMusicId} lookup mode such that local lookups are allowed. 
* <p> 
* {@link GnLookupLocal} uses Gracenote databases that are pre-generated by Gracenote 
* based on region. You application must make these databases available to GNSDK 
* by placing them in read/write portion of the filesystem accessible by the 
* application and then set the storage location accordingly. 
* <p> 
* The Gracenote databases are regularly updated. When new versions of the 
* databases are made available you application is responsible for replacing 
* the old databases with the new version. This is typically accomplished by 
* shutting down GNSDK and replacing the database files. 
*/ 
 
public class GnLookupLocal {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnLookupLocal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnLookupLocal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnLookupLocal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

/** 
* Enable local lookup for various identification queries such as 
* text and CD TOC search; plus enable services for local retreival of 
* content such as cover art. 
* 
*/ 
 
  public static GnLookupLocal enable() throws com.gracenote.gnsdk.GnException {
    return new GnLookupLocal(gnsdk_javaJNI.GnLookupLocal_enable(), false);
  }

/** 
*  Version 
*  Retrieves the Lookup Local SDK version string. 
*  @return version string if successful 
*  @return GNSDK_NULL if not successful 
*  <p><b>Remarks:</b></p> 
*  This API can be called at any time, after getting instance of {@link GnManager} successfully. The returned 
*  string is a constant. Do not attempt to modify or delete. 
*  Example version string: 1.2.3.123 (Major.Minor.Improvement.Build) 
*  Major: New functionality 
*  Minor: New or changed features 
*  Improvement: Improvements and fixes 
*  Build: Internal build number 
*/ 
 
  public static String version() {
    return gnsdk_javaJNI.GnLookupLocal_version();
  }

/** 
*  BuildDate 
*  Retrieves the Lookup Local SDK's build date string. 
*  @return Note Build date string of the format: YYYY-MM-DD hh:mm UTC 
*  <p><b>Remarks:</b></p> 
*  This API can be called at any time, after getting instance of {@link GnManager} successfully. The returned 
*   string is a constant. Do not attempt to modify or delete. 
*  Example build date string: 2008-02-12 00:41 UTC 
*/ 
 
  public static String buildDate() {
    return gnsdk_javaJNI.GnLookupLocal_buildDate();
  }

  public void storageCompact(GnLocalStorageName storageName) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLookupLocal_storageCompact(swigCPtr, this, storageName.swigValue());
  }

/** 
*  Sets location where GNSDK can find a specific local lookup database 
*	@param storageName 		[in] local storage name 
*	@param storageLocation 	[in] local storage location 
*/ 
 
  public void storageLocation(GnLocalStorageName storageName, String storageLocation) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLookupLocal_storageLocation(swigCPtr, this, storageName.swigValue(), storageLocation);
  }

/** 
*  Performs validation on named local storage. 
*	@param storageName [in] local storage name 
*/ 
 
  public void storageValidate(GnLocalStorageName storageName) throws com.gracenote.gnsdk.GnException {
    gnsdk_javaJNI.GnLookupLocal_storageValidate(swigCPtr, this, storageName.swigValue());
  }

/** 
*  Retrieves the Local Storage information for specific storage 
*  @param storageName 		[in] local storage name 
*  @param storageInfo 		[in] local storage info type 
*  @param ordinal 			[in] ordinal 
*  @return info string if successful, GNSDK_NULL if not successful 
*/ 
 
  public String storageInfo(GnLocalStorageName storageName, GnLocalStorageInfo storageInfo, long ordinal) throws com.gracenote.gnsdk.GnException {
    return gnsdk_javaJNI.GnLookupLocal_storageInfo(swigCPtr, this, storageName.swigValue(), storageInfo.swigValue(), ordinal);
  }

/** 
*  Retrieves the Local Storage information count for specific storage 
*  @param storageName 		[in] local storage name 
*  @param storageInfo 		[in] local storage info type 
*  @return count if successful, 0 if not successful 
*/ 
 
  public long storageInfoCount(GnLocalStorageName storageName, GnLocalStorageInfo storageInfo) throws com.gracenote.gnsdk.GnException {
    return gnsdk_javaJNI.GnLookupLocal_storageInfoCount(swigCPtr, this, storageName.swigValue(), storageInfo.swigValue());
  }

}
