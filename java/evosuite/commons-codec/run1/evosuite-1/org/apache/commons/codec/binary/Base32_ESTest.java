
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
      Base32 base32_0 = new Base32(true, (byte)119);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte) (-69));
      byte[] byteArray0 = new byte[1];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.lbitWorkArea = (long) (byte) (-69);
      baseNCodec_Context0.modulus = 1;
      base32_0.encode(byteArray0, (int) (byte) (-69), (int) (byte) (-69), baseNCodec_Context0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)116;
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("EG00000000======", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base32 base32_0 = new Base32(false, (byte)3);
      byte[] byteArray0 = base32_0.decode("PTy{%oWm2;6i.VX#BVf");
      assertArrayEquals(new byte[] {(byte)124, (byte) (-16), (byte) (-21), (byte)51, (byte)94, (byte)69, (byte)110, (byte)26}, byteArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = new byte[0];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 50, 61, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 50
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base32 base32_0 = new Base32((-2026), byteArray0, true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, (int) (byte)126, 0, baseNCodec_Context0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-68));
      byte[] byteArray0 = new byte[2];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.decode(byteArray0, (-1), (int) (byte) (-68), baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      base32_Builder0.setLineLength((byte)5);
      Base32 base32_0 = base32_Builder0.get();
      base32_0.getLineSeparator();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(11, byteArray0, true, (byte)6);
      byte[] byteArray1 = base32_0.getLineSeparator();
      assertNotNull(byteArray1);
      assertEquals(0, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Base32 base32_0 = new Base32(false);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode((byte[]) null, 0, 3552, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, (int) (byte)0, 74, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(false, (byte)109);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)76;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)14, byteArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000L]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)98;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(57, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000b\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)121;
      Base32 base32_0 = new Base32((-2026), byteArray0, true);
      boolean boolean0 = base32_0.containsAlphabetOrPad(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      Base32 base32_0 = base32_Builder0.get();
      boolean boolean0 = base32_0.isInAlphabet((byte) (-84));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      boolean boolean0 = base32_0.isInAlphabet((byte)98);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32((-41), byteArray0, false, (byte) (-118), codecPolicy0);
      // Undeclared exception!
      try { 
        base32_0.decode("Impossible modulus ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes.
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      base32_Builder0.setDecodingPolicy(codecPolicy0);
      Base32 base32_0 = base32_Builder0.get();
      // Undeclared exception!
      try { 
        base32_0.decode("A^7G]o@:n~kk");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      base32_Builder0.setDecodingPolicy(codecPolicy0);
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = base32_0.decode("Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      base32_Builder0.setLineLength(494);
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = new byte[8];
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("AAAAAAAAAAAAA===\r\n", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[6];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = (int) (byte) (-85);
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, (-2079), (-3579), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus -85
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Base32 base32_0 = new Base32(11, byteArray0);
      byte[] byteArray1 = new byte[9];
      String string0 = base32_0.encodeToString(byteArray1);
      assertEquals("AAAAAAAA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000AAAAAAA=\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base32 base32_0 = new Base32(75, byteArray0, true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode(byteArray0, 75, (int) (byte) (-10), baseNCodec_Context0);
      assertFalse(base32_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[6];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode(byteArray0, (-2079), (-3579), baseNCodec_Context0);
      base32_0.encode(byteArray0, 119, (-1736), baseNCodec_Context0);
      assertFalse(base32_0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)41);
      byte[] byteArray0 = new byte[3];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 786;
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 61, (-1387), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 786
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = base32_0.decode("A^7G]o@:n~kk");
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)7, (byte) (-52), (byte) (-26), (byte) (-87)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)116;
      byteArray0[1] = (byte)116;
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-17)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Base32 base32_0 = new Base32(0, byteArray0, true, (byte)124);
      byte[] byteArray1 = base32_0.decode("FG00000000000|||");
      assertArrayEquals(new byte[] {(byte)124, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = base32_0.decode("Q=%GaU`");
      assertArrayEquals(new byte[] {(byte)4}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = base32_0.decode("!SS-MX");
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals("SSMQ====", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(0, byteArray0, true, (byte)48);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[7] = (byte)66;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(1219, byteArray0, true, (byte)22, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000\u0000\u0000\u0000\u0000B\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(3023, (byte[]) null, true, (byte)2, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 3023 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-85);
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = base32_0.decode("`E$fO");
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)33}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base32 base32_0 = new Base32();
      byte[] byteArray0 = base32_0.getLineSeparator();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Base32 base32_0 = new Base32(131);
      byte[] byteArray0 = new byte[2];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, 925, (int) (byte)113, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 925
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-94));
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode((byte[]) null, (int) (byte)9, 0, baseNCodec_Context0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
  }
}
