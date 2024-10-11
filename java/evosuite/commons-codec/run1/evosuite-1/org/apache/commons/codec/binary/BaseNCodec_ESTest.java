
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
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[4];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = 64;
      int int0 = base32_0.readResults(byteArray0, (-623), 0, baseNCodec_Context0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("Impossible modulus ");
      byte[] byteArray1 = new byte[6];
      Base32 base32_0 = new Base32(600, byteArray1);
      long long0 = base32_0.getEncodedLength(byteArray0);
      assertEquals(30L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64((-2912), (byte[]) null, true, codecPolicy0);
      CodecPolicy codecPolicy1 = base64_0.getCodecPolicy();
      assertEquals(CodecPolicy.STRICT, codecPolicy1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = 64;
      baseNCodec_Context0.pos = 64;
      baseNCodec_Context0.pos = 76;
      int int0 = base32_0.available(baseNCodec_Context0);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = (-96);
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=-96, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = 468;
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=468, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.readPos = (-1069);
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=0, readPos=-1069]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.ibitWorkArea = (-745);
      String string0 = baseNCodec_Context0.toString();
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=-745, lbitWorkArea=0, modulus=0, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = BaseNCodec.toLength(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = BaseNCodec.toLength(byteArray0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32((-522), byteArray0, false, (byte) (-77), codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode(byteArray0, (int) (byte) (-77), (int) (byte) (-77), baseNCodec_Context0);
      int int0 = base32_0.readResults(byteArray0, 76, (byte)13, baseNCodec_Context0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte)13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Base16 base16_0 = new Base16();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = 2395;
      boolean boolean0 = base16_0.hasData(baseNCodec_Context0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      boolean boolean0 = base32_0.hasData(baseNCodec_Context0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      Base32 base32_0 = new Base32((byte)0, byteArray0, true);
      long long0 = base32_0.getEncodedLength(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-114));
      int int0 = base32_0.getDefaultBufferSize();
      assertEquals(8192, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base16 base16_0 = new Base16();
      String string0 = base16_0.encodeToString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64();
      String string0 = base64_0.encodeToString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base32 base32_0 = new Base32((-1895));
      String string0 = base32_0.encodeAsString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base32 base32_0 = new Base32(468);
      byte[] byteArray0 = base32_0.encode((byte[]) null, 1, 1);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = base32_0.encode(byteArray0, 0, (int) (byte)1);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)61, (byte)61, (byte)61, (byte)61, (byte)61, (byte)61}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base32 base32_0 = new Base32(0, (byte[]) null);
      byte[] byteArray0 = base32_0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base16 base16_0 = new Base16();
      byte[] byteArray1 = base16_0.encode(byteArray0);
      assertArrayEquals(new byte[] {(byte)48, (byte)48}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = base32_0.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Base64 base64_0 = new Base64(68);
      assertFalse(base64_0.isStrictDecoding());
      
      byte[] byteArray0 = base64_0.decode("_5/h6[/>r4UHK");
      byte[] byteArray1 = base64_0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte)62}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)0);
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      Base32 base32_0 = new Base32((byte)0, byteArray0, false);
      byte[] byteArray1 = base32_0.decode("");
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Base32 base32_0 = new Base32(468);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = 468;
      // Undeclared exception!
      try { 
        base32_0.readResults((byte[]) null, 948, 1326, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.pos = 2395;
      baseNCodec_Context0.buffer = byteArray0;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64(1033, byteArray0, true, codecPolicy0);
      // Undeclared exception!
      try { 
        base64_0.readResults(byteArray0, (-2336), (byte) (-68), baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-1));
      // Undeclared exception!
      try { 
        base32_0.isInAlphabet((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base32 base32_0 = new Base32(485, byteArray0);
      // Undeclared exception!
      try { 
        base32_0.isInAlphabet((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
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
  public void test32()  throws Throwable  {
      Base32 base32_0 = new Base32((-1));
      // Undeclared exception!
      try { 
        base32_0.ensureBufferSize((-1), (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Base64 base64_0 = new Base64((-676));
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, 4, (int) (byte)106);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(47, byteArray0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray1 = base32_0.ensureBufferSize(358, baseNCodec_Context0);
      String string0 = Base64.encodeBase64URLSafeString(byteArray1);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      // Undeclared exception!
      base16_0.decode(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      // Undeclared exception!
      try { 
        base16_0.decode("Pn[\"^D&T*#`w{s;iD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 80
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base32 base32_0 = new Base32();
      // Undeclared exception!
      try { 
        base32_0.available((BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)49);
      boolean boolean0 = base32_0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)65;
      Base32 base32_0 = new Base32(0, byteArray0, false);
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = base16_0.encode(byteArray0, (int) (byte)7, (-2336));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[7];
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
  public void test41()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      boolean boolean0 = base16_0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Base64 base64_0 = new Base64((byte) (-100));
      boolean boolean0 = base64_0.isInAlphabet("Parameter supplied to Base-N decode is not a byte[] or a String");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-30));
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-30);
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = new Base64(0, byteArray0, true, codecPolicy0);
      boolean boolean0 = base64_0.isInAlphabet(byteArray0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      try { 
        base32_0.encode((Object) "org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N encode is not a byte[]
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      Base32 base32_0 = new Base32((byte)0, byteArray0, true);
      String string0 = base32_0.encodeAsString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Base64 base64_0 = new Base64(3755);
      Object object0 = base64_0.decode((Object) "Bxw=");
      base64_0.decode(object0);
      assertFalse(base64_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = new Base64(0, byteArray0, true, codecPolicy0);
      CodecPolicy codecPolicy1 = CodecPolicy.STRICT;
      try { 
        base64_0.decode((Object) codecPolicy1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N decode is not a byte[] or a String
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      Base32 base32_0 = new Base32((byte)0, byteArray0, false);
      byte[] byteArray1 = base32_0.decode((String) null);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)31, byteArray1, true, (byte)0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [AAA=\u0007\u001C]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)0);
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = base32_0.containsAlphabetOrPad(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      boolean boolean0 = base16_0.containsAlphabetOrPad((byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Base64 base64_0 = new Base64();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      int int0 = base64_0.available(baseNCodec_Context0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(8192, byteArray0, true);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-114));
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = base32_0.encode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = BaseNCodec.CHUNK_SEPARATOR;
      Base32 base32_0 = new Base32((byte)0, byteArray0, false, (byte) (-5));
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.buffer = byteArray1;
      base32_0.encode(byteArray0, (int) (byte)0, 2, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Base64.Builder base64_Builder0 = Base64.builder();
      assertNotNull(base64_Builder0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Base64 base64_0 = new Base64((-676));
      byte[] byteArray0 = new byte[5];
      String string0 = base64_0.encodeAsString(byteArray0);
      assertEquals("AAAAAAA=", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte) (-114));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Base64 base64_0 = new Base64((byte)0);
      boolean boolean0 = base64_0.isInAlphabet("codecPolicy");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Base16 base16_0 = new Base16();
      byte[] byteArray0 = new byte[7];
      String string0 = base16_0.encodeToString(byteArray0);
      assertEquals("00000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = BaseNCodec.getChunkSeparator();
      assertArrayEquals(new byte[] {(byte)13, (byte)10}, byteArray0);
  }
}
