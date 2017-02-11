/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkPrng {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkPrng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkPrng obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkPrng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkPrng() {
    this(chilkatJNI.new_CkPrng(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkPrng_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkPrng_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkPrng_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkPrng_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkPrng_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkPrng_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkPrng_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkPrng_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkPrng_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkPrng_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkPrng_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkPrng_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkPrng_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkPrng_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_PrngName(CkString str) {
    chilkatJNI.CkPrng_get_PrngName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String prngName() {
    return chilkatJNI.CkPrng_prngName(swigCPtr, this);
  }

  public void put_PrngName(String newVal) {
    chilkatJNI.CkPrng_put_PrngName(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkPrng_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkPrng_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkPrng_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkPrng_version(swigCPtr, this);
  }

  public boolean AddEntropy(String entropy, String encoding) {
    return chilkatJNI.CkPrng_AddEntropy(swigCPtr, this, entropy, encoding);
  }

  public boolean AddEntropyBytes(CkByteData entropy) {
    return chilkatJNI.CkPrng_AddEntropyBytes(swigCPtr, this, CkByteData.getCPtr(entropy), entropy);
  }

  public boolean ExportEntropy(CkString outStr) {
    return chilkatJNI.CkPrng_ExportEntropy(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String exportEntropy() {
    return chilkatJNI.CkPrng_exportEntropy(swigCPtr, this);
  }

  public boolean FirebasePushId(CkString outStr) {
    return chilkatJNI.CkPrng_FirebasePushId(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String firebasePushId() {
    return chilkatJNI.CkPrng_firebasePushId(swigCPtr, this);
  }

  public boolean GenRandom(int numBytes, String encoding, CkString outStr) {
    return chilkatJNI.CkPrng_GenRandom(swigCPtr, this, numBytes, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String genRandom(int numBytes, String encoding) {
    return chilkatJNI.CkPrng_genRandom(swigCPtr, this, numBytes, encoding);
  }

  public boolean GenRandomBytes(int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkPrng_GenRandomBytes(swigCPtr, this, numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetEntropy(int numBytes, String encoding, CkString outStr) {
    return chilkatJNI.CkPrng_GetEntropy(swigCPtr, this, numBytes, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getEntropy(int numBytes, String encoding) {
    return chilkatJNI.CkPrng_getEntropy(swigCPtr, this, numBytes, encoding);
  }

  public String entropy(int numBytes, String encoding) {
    return chilkatJNI.CkPrng_entropy(swigCPtr, this, numBytes, encoding);
  }

  public boolean GetEntropyBytes(int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkPrng_GetEntropyBytes(swigCPtr, this, numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ImportEntropy(String entropy) {
    return chilkatJNI.CkPrng_ImportEntropy(swigCPtr, this, entropy);
  }

  public int RandomInt(int low, int high) {
    return chilkatJNI.CkPrng_RandomInt(swigCPtr, this, low, high);
  }

  public boolean RandomPassword(int length, boolean mustIncludeDigit, boolean upperAndLowercase, String mustHaveOneOf, String excludeChars, CkString outStr) {
    return chilkatJNI.CkPrng_RandomPassword(swigCPtr, this, length, mustIncludeDigit, upperAndLowercase, mustHaveOneOf, excludeChars, CkString.getCPtr(outStr), outStr);
  }

  public String randomPassword(int length, boolean mustIncludeDigit, boolean upperAndLowercase, String mustHaveOneOf, String excludeChars) {
    return chilkatJNI.CkPrng_randomPassword(swigCPtr, this, length, mustIncludeDigit, upperAndLowercase, mustHaveOneOf, excludeChars);
  }

  public boolean RandomString(int length, boolean bDigits, boolean bLower, boolean bUpper, CkString outStr) {
    return chilkatJNI.CkPrng_RandomString(swigCPtr, this, length, bDigits, bLower, bUpper, CkString.getCPtr(outStr), outStr);
  }

  public String randomString(int length, boolean bDigits, boolean bLower, boolean bUpper) {
    return chilkatJNI.CkPrng_randomString(swigCPtr, this, length, bDigits, bLower, bUpper);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkPrng_SaveLastError(swigCPtr, this, path);
  }

}
