
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
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base32_ESTest extends Base32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)123;
      Base32 base32_0 = new Base32(1488, byteArray0);
      assertFalse(base32_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-96));
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-96);
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("UAAAAAAAAA\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base32 base32_0 = new Base32((-1250));
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = (-1250);
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, (-1250), (-1250), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus -1250
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = base32_0.decode("AaFbw");
      assertArrayEquals(new byte[] {(byte)82, (byte) (-98)}, byteArray0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = new byte[4];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, 627, (int) (byte)0, baseNCodec_Context0);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Base32 base32_0 = new Base32((-1250));
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, 33, (-1250), baseNCodec_Context0);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte) (-28));
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base32 base32_0 = new Base32((-1250));
      boolean boolean0 = base32_0.isInAlphabet((byte)107);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(1656, byteArray0, true);
      byte[] byteArray1 = base32_0.getLineSeparator();
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32(42, byteArray0, false, (byte)48, codecPolicy0);
      byte[] byteArray1 = base32_0.getLineSeparator();
      assertNotNull(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base32_0.ensureBufferSize((byte)0, baseNCodec_Context0);
      base32_0.encode(byteArray0);
      // Undeclared exception!
      base32_0.encode(byteArray0, (int) (byte)126, 1894, baseNCodec_Context0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode((byte[]) null, (-1890), 23, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-96));
      byte[] byteArray0 = new byte[6];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, 0, 1761, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base32 base32_0 = new Base32((-587));
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, (-4615), 0, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(36, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 36 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)124);
      boolean boolean0 = base32_0.isInAlphabet((byte)124);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32(42, byteArray0, false, (byte)48, codecPolicy0);
      boolean boolean0 = base32_0.isInAlphabet((byte) (-55));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base32 base32_0 = new Base32(0, byteArray0, true);
      boolean boolean0 = base32_0.isInAlphabet("krL[0@[U");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)98;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte) (-87), codecPolicy0);
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(61);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\rA]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-27));
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-27);
      byte[] byteArray1 = base32_0.encode(byteArray0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(9);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\rA]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Base32 base32_0 = new Base32((-587));
      byte[] byteArray0 = new byte[9];
      String string0 = base32_0.encodeAsString(byteArray0);
      assertEquals("AAAAAAAAAAAAAAA=", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base32_0.ensureBufferSize((byte)0, baseNCodec_Context0);
      byte[] byteArray1 = base32_0.encode(byteArray0);
      // Undeclared exception!
      base32_0.decode(byteArray1, (int) (byte)0, 2563, baseNCodec_Context0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(1656, byteArray0, true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode(byteArray0, 64, (int) (byte) (-85), baseNCodec_Context0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base32 base32_0 = new Base32(0, byteArray0, true);
      byte[] byteArray1 = base32_0.encode(byteArray0, 2070, 0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32(42, byteArray0, false, (byte)48, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.eof = true;
      base32_0.encode(byteArray0, 9, 67, baseNCodec_Context0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = new byte[8];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 76;
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 5904, (-3625), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 76
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-81));
      byte[] byteArray0 = base32_0.decode("+Y8(JZv(|z4\"");
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-62), (byte)115, (byte)92}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32(42, byteArray0, false, (byte)48, codecPolicy0);
      byte[] byteArray1 = base32_0.decode("org.apache.commons.codec.DecoderException");
      assertEquals(23, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Base32 base32_0 = new Base32(0, byteArray0, true);
      byte[] byteArray1 = base32_0.decode("RdWSW");
      assertEquals(1, byteArray1.length);
      assertArrayEquals(new byte[] {(byte) (-37)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)124);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = base32_0.encode(byteArray0);
      byte[] byteArray2 = base32_0.decode(byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)124, (byte)124, (byte)124, (byte)124, (byte)124, (byte)124}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Base32 base32_0 = new Base32((-1250));
      byte[] byteArray0 = base32_0.decode("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]");
      assertArrayEquals(new byte[] {(byte) (-112), (byte)104, (byte)82, (byte) (-110)}, byteArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((-215), byteArray0, false, (byte)13, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(true, (byte)70);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)55;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(371, byteArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u00007\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(82, (byte[]) null, false, (byte)2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 82 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      Base32 base32_0 = base32_Builder0.get();
      assertFalse(base32_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      assertNotNull(base32_Builder0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-30);
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Base32 base32_0 = new Base32((-1250));
      byte[] byteArray0 = base32_0.getLineSeparator();
      assertNull(byteArray0);
  }
}
