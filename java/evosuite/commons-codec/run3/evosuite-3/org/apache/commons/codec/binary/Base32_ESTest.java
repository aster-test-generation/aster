
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
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)127);
      byte[] byteArray1 = base32_0.encode(byteArray0);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)127, (byte)127, (byte)127, (byte)127, (byte)127, (byte)127}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(1915);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [A
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = base32_0.decode("-R'");
      String string0 = base32_0.encodeAsString(byteArray0);
      assertEquals("AQ======", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = base32_0.encode(byteArray0, (int) (byte)0, 0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = new byte[1];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, (int) (byte)4, 2844, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(2433, byteArray0, true, (byte) (-1), codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base32_0.encode(byteArray0, (-43), (-43), baseNCodec_Context0);
      assertEquals(CodecPolicy.STRICT, base32_0.getCodecPolicy());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(1910);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [A
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(1, byteArray0, true);
      byte[] byteArray1 = base32_0.getLineSeparator();
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.encode((byte[]) null, (-1944), 1713, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(23);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [A
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(0, byteArray0, false, (byte)127);
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 255, 8192, (BaseNCodec.Context) null);
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
      Base32 base32_0 = new Base32((-1995));
      byte[] byteArray0 = new byte[8];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base32_0.decode(byteArray0, 0, (int) (byte)86, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)5, byteArray0, true, (byte)49, (CodecPolicy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // codecPolicy
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)116;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(299, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [t\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32((byte)122);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base32 base32_0 = new Base32(1078, byteArray0);
      boolean boolean0 = base32_0.isInAlphabet((byte) (-103));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(2433, byteArray0, true, (byte) (-1), codecPolicy0);
      boolean boolean0 = base32_0.isInAlphabet((byte)14);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(2433, byteArray0, true, (byte) (-1), codecPolicy0);
      boolean boolean0 = base32_0.isInAlphabet((byte)52);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(false, (byte)9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      byte[] byteArray0 = new byte[25];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      base32_Builder0.setDecodingPolicy(codecPolicy0);
      byteArray0[5] = (byte)98;
      Base32 base32_0 = base32_Builder0.get();
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
      Base32 base32_0 = new Base32(false);
      boolean boolean0 = base32_0.isInAlphabet((byte)123);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Base32 base32_0 = new Base32(true, (byte)0);
      byte[] byteArray0 = new byte[8];
      String string0 = base32_0.encodeAsString(byteArray0);
      assertEquals("0000000000000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(2433, byteArray0, true, (byte) (-1), codecPolicy0);
      byte[] byteArray1 = base32_0.encode(byteArray0, 48, (-425));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32 base32_0 = new Base32((-2260), (byte[]) null, true, (byte) (-90), codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 76;
      // Undeclared exception!
      try { 
        base32_0.decode((byte[]) null, 64, (-2260), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 76
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Base32.Builder base32_Builder0 = new Base32.Builder();
      Base32 base32_0 = base32_Builder0.get();
      byte[] byteArray0 = base32_0.decode("STRICT");
      assertArrayEquals(new byte[] {(byte) (-108), (byte) (-30), (byte) (-127)}, byteArray0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = base32_0.decode("!6rrH$#D");
      assertArrayEquals(new byte[] {(byte) (-12), (byte)98, (byte)113}, byteArray0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = base32_0.decode("b`j!0D\"4=`W#hqr`");
      assertArrayEquals(new byte[] {(byte)10, (byte)71}, byteArray0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(1, byteArray0, true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.eof = true;
      base32_0.decode(byteArray0, 722, (-520), baseNCodec_Context0);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(6);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [A
         // ]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(7, byteArray0, true, (byte)49, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // pad must not be in alphabet or whitespace
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(61, byteArray0, true, (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32(2433, byteArray0, true, (byte) (-1), codecPolicy0);
      byte[] byteArray1 = base32_0.decode("k0)KN5}wF0#r-CG");
      assertArrayEquals(new byte[] {(byte) (-96), (byte)41, (byte)114, (byte) (-68), (byte)27, (byte)100}, byteArray1);
      assertEquals(6, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 64;
      // Undeclared exception!
      try { 
        base32_0.encode((byte[]) null, 63, (int) (byte) (-118), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 64
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      byte[] byteArray0 = base32_0.decode("encodeTable");
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)35, (byte)68, (byte) (-31), (byte) (-110), (byte)96, (byte)10}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-12));
      byte[] byteArray0 = base32_0.getLineSeparator();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(490, (byte[]) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineLength 490 > 0, but lineSeparator is null
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }
}
