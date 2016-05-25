/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class int_bitfield_map {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected int_bitfield_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(int_bitfield_map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_int_bitfield_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int_bitfield_map() {
    this(libtorrent_jni.new_int_bitfield_map__SWIG_0(), true);
  }

  public int_bitfield_map(int_bitfield_map arg0) {
    this(libtorrent_jni.new_int_bitfield_map__SWIG_1(int_bitfield_map.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return libtorrent_jni.int_bitfield_map_size(swigCPtr, this);
  }

  public boolean empty() {
    return libtorrent_jni.int_bitfield_map_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.int_bitfield_map_clear(swigCPtr, this);
  }

  public bitfield get(int key) {
    return new bitfield(libtorrent_jni.int_bitfield_map_get(swigCPtr, this, key), false);
  }

  public void set(int key, bitfield x) {
    libtorrent_jni.int_bitfield_map_set(swigCPtr, this, key, bitfield.getCPtr(x), x);
  }

  public void erase(int key) {
    libtorrent_jni.int_bitfield_map_erase(swigCPtr, this, key);
  }

  public boolean has_key(int key) {
    return libtorrent_jni.int_bitfield_map_has_key(swigCPtr, this, key);
  }

  public int_vector keys() {
    return new int_vector(libtorrent_jni.int_bitfield_map_keys(swigCPtr, this), true);
  }

}