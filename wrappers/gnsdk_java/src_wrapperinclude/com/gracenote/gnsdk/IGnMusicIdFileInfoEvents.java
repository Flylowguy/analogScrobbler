package com.gracenote.gnsdk;

/** 
*  Defines the structure of callback functions for data retrieval for 
*  specific GnMusicIdFileInfo's 
*/ 
 
public interface IGnMusicIdFileInfoEvents {

/** 
*  Callback function declaration for a fingerprint generation request. 
*  @param fileinfo 		[in] FileInfo object that the callback operates on 
*  @param currentFile 		[in] Current number of the file being processed 
*  @param totalFiles 		[in] Total number of files to be processed 
*  @param canceller		[in] Object that can be used to cancel processing if desired 
*  <p><b>Remarks:</b></p> 
*  The application can implement this callback to use the fingerprint_begin(), fingerprint_write() and fingerprint_end() APIs with the given FileInfo object to 
			   generate a fingerprint from raw audio. If your application already has created the fingerprint for the respective file, 
			   the application should implement this callback to use the GnMusicIdFileInfo.set*() API to set any metadata values in the FileInfo object. 
			   This callback is called only if no fingerprint has already been set for the passed FileInfo object. 
*/ 
 
  	public void gatherFingerprint(GnMusicIdFileInfo fileinfo, long currentFile, long totalFiles, IGnCancellable canceller);

/** 
*  Callback function declaration for a metadata gathering request. 
*  @param fileinfo 		[in] FileInfo object that the callback operates on 
*  @param currentFile 		[in] Current number of the file being processed 
*  @param totalFiles 		[in] Total number of files to be processed 
*  @param canceller		[in] Object that can be used to cancel processing if desired 
*  <p><b>Remarks:</b></p> 
*   The application should implement this callback to use the GnMusicIdFileInfo.set*() API to set any metadata values in the FileInfo object. 
			   This callback is called only if no metadata has already been set for the passed FileInfo. 
*/ 
 
  	public void gatherMetadata(GnMusicIdFileInfo fileinfo, long currentFile, long totalFiles, IGnCancellable canceller);

}
