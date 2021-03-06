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

public class GnVideoCreditProvider : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal GnVideoCreditProvider(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(GnVideoCreditProvider obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~GnVideoCreditProvider() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          gnsdk_csharp_marshalPINVOKE.delete_GnVideoCreditProvider(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public GnVideoCreditProvider(GnDataObject obj, string key) : this(gnsdk_csharp_marshalPINVOKE.new_GnVideoCreditProvider(GnDataObject.getCPtr(obj), key), true) {
    if (gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Pending) throw gnsdk_csharp_marshalPINVOKE.SWIGPendingException.Retrieve();
  }

  public GnVideoCredit get_data(uint pos) {
    GnVideoCredit ret = new GnVideoCredit(gnsdk_csharp_marshalPINVOKE.GnVideoCreditProvider_get_data(swigCPtr, pos), true);
    return ret;
  }

  public uint count() {
    uint ret = gnsdk_csharp_marshalPINVOKE.GnVideoCreditProvider_count(swigCPtr);
    return ret;
  }

  public static readonly uint kOrdinalStart = gnsdk_csharp_marshalPINVOKE.GnVideoCreditProvider_kOrdinalStart_get();
  public static readonly uint kCountOffset = gnsdk_csharp_marshalPINVOKE.GnVideoCreditProvider_kCountOffset_get();
}

}
