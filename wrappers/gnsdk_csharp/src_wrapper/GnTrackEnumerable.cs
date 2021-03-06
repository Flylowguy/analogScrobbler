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

public class GnTrackEnumerable : System.Collections.Generic.IEnumerable<GnTrack>, IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal GnTrackEnumerable(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(GnTrackEnumerable obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~GnTrackEnumerable() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          gnsdk_csharp_marshalPINVOKE.delete_GnTrackEnumerable(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

			System.Collections.Generic.IEnumerator<GnTrack> System.Collections.Generic.IEnumerable<GnTrack> .GetEnumerator( )
			{
				return GetEnumerator( );
			}
			System.Collections.IEnumerator System.Collections.IEnumerable.
			    GetEnumerator( )
			{
				return GetEnumerator( );
			}

		
  public GnTrackEnumerable(GnTrackProvider provider, uint start) : this(gnsdk_csharp_marshalPINVOKE.new_GnTrackEnumerable(GnTrackProvider.getCPtr(provider), start), true) {
    if (gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Pending) throw gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Retrieve();
  }

  public GnTrackEnumerator GetEnumerator() {
    GnTrackEnumerator ret = new GnTrackEnumerator(gnsdk_csharp_marshalPINVOKE.GnTrackEnumerable_GetEnumerator(swigCPtr), true);
    return ret;
  }

  public GnTrackEnumerator end() {
    GnTrackEnumerator ret = new GnTrackEnumerator(gnsdk_csharp_marshalPINVOKE.GnTrackEnumerable_end(swigCPtr), true);
    return ret;
  }

  public uint count() {
    uint ret = gnsdk_csharp_marshalPINVOKE.GnTrackEnumerable_count(swigCPtr);
    return ret;
  }

  public GnTrackEnumerator at(uint index) {
    GnTrackEnumerator ret = new GnTrackEnumerator(gnsdk_csharp_marshalPINVOKE.GnTrackEnumerable_at(swigCPtr, index), true);
    return ret;
  }

  public GnTrackEnumerator getByIndex(uint index) {
    GnTrackEnumerator ret = new GnTrackEnumerator(gnsdk_csharp_marshalPINVOKE.GnTrackEnumerable_getByIndex(swigCPtr, index), true);
    return ret;
  }

}

}
