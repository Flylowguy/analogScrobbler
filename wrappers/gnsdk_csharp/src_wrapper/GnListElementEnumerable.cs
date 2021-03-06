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

public class GnListElementEnumerable : System.Collections.Generic.IEnumerable<GnListElement>, IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal GnListElementEnumerable(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(GnListElementEnumerable obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~GnListElementEnumerable() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          gnsdk_csharp_marshalPINVOKE.delete_GnListElementEnumerable(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

System.Collections.Generic.IEnumerator<GnListElement> System.Collections.Generic.IEnumerable<GnListElement>.GetEnumerator( )
{
	return GetEnumerator( );
}
System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator( )
{
	return GetEnumerator( );
}

  public GnListElementEnumerable(list_element_provider provider, uint start) : this(gnsdk_csharp_marshalPINVOKE.new_GnListElementEnumerable(list_element_provider.getCPtr(provider), start), true) {
    if (gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Pending) throw gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Retrieve();
  }

  public GnListElementEnumerator GetEnumerator() {
    GnListElementEnumerator ret = new GnListElementEnumerator(gnsdk_csharp_marshalPINVOKE.GnListElementEnumerable_GetEnumerator(swigCPtr), true);
    return ret;
  }

  public GnListElementEnumerator end() {
    GnListElementEnumerator ret = new GnListElementEnumerator(gnsdk_csharp_marshalPINVOKE.GnListElementEnumerable_end(swigCPtr), true);
    return ret;
  }

  public uint count() {
    uint ret = gnsdk_csharp_marshalPINVOKE.GnListElementEnumerable_count(swigCPtr);
    return ret;
  }

  public GnListElementEnumerator at(uint index) {
    GnListElementEnumerator ret = new GnListElementEnumerator(gnsdk_csharp_marshalPINVOKE.GnListElementEnumerable_at(swigCPtr, index), true);
    return ret;
  }

  public GnListElementEnumerator getByIndex(uint index) {
    GnListElementEnumerator ret = new GnListElementEnumerator(gnsdk_csharp_marshalPINVOKE.GnListElementEnumerable_getByIndex(swigCPtr, index), true);
    return ret;
  }

}

}
