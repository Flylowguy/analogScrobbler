/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace GracenoteSDK {

using System;
using System.Runtime.InteropServices;

public class GnPlaylistStorageEnumerable : System.Collections.Generic.IEnumerable<String >, IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal GnPlaylistStorageEnumerable(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(GnPlaylistStorageEnumerable obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~GnPlaylistStorageEnumerable() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          gnsdk_csharp_marshalPINVOKE.delete_GnPlaylistStorageEnumerable(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

System.Collections.Generic.IEnumerator<string> System.Collections.Generic.IEnumerable<string>.GetEnumerator( )
{
	return GetEnumerator( );
}
System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator( )
{
	return GetEnumerator( );
}

  public GnPlaylistStorageEnumerable(collection_storage_provider provider, uint start) : this(gnsdk_csharp_marshalPINVOKE.new_GnPlaylistStorageEnumerable(collection_storage_provider.getCPtr(provider), start), true) {
    if (gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Pending) throw gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Retrieve();
  }

  public GnPlaylistStorageEnumerator GetEnumerator() {
    GnPlaylistStorageEnumerator ret = new GnPlaylistStorageEnumerator(gnsdk_csharp_marshalPINVOKE.GnPlaylistStorageEnumerable_GetEnumerator(swigCPtr), true);
    return ret;
  }

  public GnPlaylistStorageEnumerator end() {
    GnPlaylistStorageEnumerator ret = new GnPlaylistStorageEnumerator(gnsdk_csharp_marshalPINVOKE.GnPlaylistStorageEnumerable_end(swigCPtr), true);
    return ret;
  }

  public uint count() {
    uint ret = gnsdk_csharp_marshalPINVOKE.GnPlaylistStorageEnumerable_count(swigCPtr);
    return ret;
  }

  public GnPlaylistStorageEnumerator at(uint index) {
    GnPlaylistStorageEnumerator ret = new GnPlaylistStorageEnumerator(gnsdk_csharp_marshalPINVOKE.GnPlaylistStorageEnumerable_at(swigCPtr, index), true);
    return ret;
  }

  public GnPlaylistStorageEnumerator getByIndex(uint index) {
    GnPlaylistStorageEnumerator ret = new GnPlaylistStorageEnumerator(gnsdk_csharp_marshalPINVOKE.GnPlaylistStorageEnumerable_getByIndex(swigCPtr, index), true);
    return ret;
  }

}

}
