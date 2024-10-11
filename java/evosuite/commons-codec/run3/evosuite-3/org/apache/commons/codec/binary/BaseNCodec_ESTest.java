
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base16;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseNCodec_ESTest extends BaseNCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(60, byteArray0, false);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = 1474;
      int int0 = base32_0.readResults(byteArray0, 1474, (-890), baseNCodec_Context0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Base64 base64_0 = new Base64(244);
      byte[] byteArray0 = new byte[7];
      long long0 = base64_0.getEncodedLength(byteArray0);
      assertEquals(14L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base64 base64_0 = new Base64((byte) (-128), byteArray0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray1 = base64_0.ensureBufferSize(104, baseNCodec_Context0);
      String string0 = Base64.encodeBase64URLSafeString(byteArray1);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 64;
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=64, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = (-485);
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=-485, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = (-4667);
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=0, readPos=-4667]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = 524;
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=524, lbitWorkArea=0, modulus=0, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = BaseNCodec.toLength(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = BaseNCodec.toLength(byteArray0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-60));
      byte[] byteArray0 = new byte[7];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.eof = true;
      int int0 = base32_0.readResults(byteArray0, 1288, (byte) (-128), baseNCodec_Context0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte)30);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base32 base32_0 = new Base32(0, byteArray0);
      boolean boolean0 = base32_0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Base32 base32_0 = new Base32();
      boolean boolean0 = base32_0.isInAlphabet("AE======");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base16 base16_0 = new Base16();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = 1;
      boolean boolean0 = base16_0.hasData(baseNCodec_Context0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Base16 base16_0 = new Base16();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      boolean boolean0 = base16_0.hasData(baseNCodec_Context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[0];
      long long0 = base16_0.getEncodedLength(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      int int0 = base16_0.getDefaultBufferSize();
      assertEquals(8192, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)41);
      String string0 = base32_0.encodeToString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base64 base64_0 = new Base64((-5095));
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      String string0 = base64_0.encodeToString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base32 base32_0 = new Base32();
      String string0 = base32_0.encodeAsString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[0];
      String string0 = base32_0.encodeAsString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base32_0.ensureBufferSize((byte)57, baseNCodec_Context0);
      byte[] byteArray1 = base32_0.encode(byteArray0, 0, 7);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = base32_0.encode(byteArray0, (int) (byte)0, (-541));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = base16_0.encode(byteArray0);
      assertArrayEquals(new byte[] {(byte)48, (byte)48, (byte)48, (byte)48}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base16 base16_0 = new Base16(true);
      byte[] byteArray1 = base16_0.encode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder");
      Base32 base32_0 = new Base32();
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-60), (byte)96, (byte) (-108)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      byte[] byteArray0 = base16_0.decode((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = base32_0.decode("<9bo0qsHS5\"");
      assertArrayEquals(new byte[] {(byte)74, (byte) (-16), (byte)13, (byte)114, (byte)60, (byte) (-31)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = base16_0.decode("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)79;
      boolean boolean0 = base64_0.containsAlphabetOrPad(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = (int) (byte) (-22);
      int int0 = base16_0.available(baseNCodec_Context0);
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = 16;
      // Undeclared exception!
      try { 
        base16_0.readResults((byte[]) null, 1549, 0, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)5);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.ensureBufferSize(0, baseNCodec_Context0);
      baseNCodec_Context0.pos = 76;
      // Undeclared exception!
      try { 
        base32_0.readResults(baseNCodec_Context0.buffer, (-774), 0, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Base16 base16_0 = new Base16();
      // Undeclared exception!
      try { 
        base16_0.isInAlphabet((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      // Undeclared exception!
      try { 
        base16_0.isInAlphabet((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64(85, byteArray0, true, codecPolicy0);
      // Undeclared exception!
      try { 
        base64_0.hasData((BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)0);
      // Undeclared exception!
      try { 
        base32_0.ensureBufferSize((byte)0, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base16_0.ensureBufferSize(599, baseNCodec_Context0);
      base16_0.encodeAsString(byteArray0);
      // Undeclared exception!
      base16_0.encodeToString(byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      // Undeclared exception!
      try { 
        base16_0.decode((Object) "bV");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 86
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, 352, (int) (byte)42);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(12, byteArray0, false, (byte)7, codecPolicy0);
      boolean boolean0 = base32_0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Base64 base64_0 = new Base64((-5095));
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = base64_0.isInAlphabet(byteArray0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      boolean boolean0 = base32_0.isInAlphabet(byteArray1, true);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65, (byte)13, (byte)10}, byteArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      try { 
        base16_0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N encode is not a byte[]
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      Object object0 = base32_0.decode((Object) "encodeTable must have exactly 64 entries.");
      Base16 base16_0 = new Base16(true);
      Object object1 = base16_0.encode(object0);
      assertNotSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base64 base64_0 = new Base64(1652, byteArray0, true);
      byte[] byteArray1 = base64_0.encode((byte[]) null, (-805), (int) (byte)16);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = base32_0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      Base64.Builder base64_Builder0 = Base64.builder();
      try { 
        base32_0.decode((Object) base64_Builder0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N decode is not a byte[] or a String
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      Object object0 = base32_0.decode((Object) "encodeTable must have exactly 64 entries.");
      Object object1 = base32_0.decode(object0);
      assertNotSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      byte[] byteArray0 = base16_0.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)17;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(1447, byteArray0, false, (byte)17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0011\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Base16 base16_0 = new Base16();
      boolean boolean0 = base16_0.containsAlphabetOrPad((byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      int int0 = base32_0.available(baseNCodec_Context0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Base64 base64_0 = new Base64(880, (byte[]) null);
      // Undeclared exception!
      try { 
        base64_0.getEncodedLength((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.buffer = byteArray1;
      Base16 base16_0 = new Base16(false);
      // Undeclared exception!
      try { 
        base16_0.decode(byteArray0, (int) (byte)0, 1409, baseNCodec_Context0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      boolean boolean0 = base16_0.isInAlphabet("i`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      CodecPolicy codecPolicy0 = base16_0.getCodecPolicy();
      assertEquals(CodecPolicy.LENIENT, codecPolicy0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Base16 base16_0 = new Base16();
      // Undeclared exception!
      try { 
        base16_0.decode(":]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 58
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base16_0.ensureBufferSize(599, baseNCodec_Context0);
      base16_0.encodeToString(byteArray0);
      assertEquals(8192, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = BaseNCodec.getChunkSeparator();
      assertArrayEquals(new byte[] {(byte)13, (byte)10}, byteArray0);
  }
}
