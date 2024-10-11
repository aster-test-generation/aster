
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
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64_ESTest extends Base64_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)123;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = new Base64(770, byteArray0, false, codecPolicy0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-33);
      String string0 = Base64.encodeBase64String(byteArray0);
      assertEquals("3wAAAA==", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("xmCs91#Gl3{W.T])H");
      assertArrayEquals(new byte[] {(byte) (-58), (byte)96, (byte) (-84), (byte) (-9), (byte)81, (byte) (-91), (byte) (-35), (byte)100, (byte) (-57)}, byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base64.Builder base64_Builder0 = new Base64.Builder();
      base64_Builder0.setPadding((byte) (-117));
      Base64 base64_0 = base64_Builder0.get();
      byte[] byteArray1 = base64_0.decode(byteArray0);
      assertFalse(base64_0.isUrlSafe());
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base64_0.decode(byteArray0, (int) (byte)0, (int) (byte)0, baseNCodec_Context0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true, 42);
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray1);
      byte[] byteArray2 = Base64.encodeInteger(bigInteger0);
      assertEquals(4, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)47, (byte)119, (byte)65, (byte)65}, byteArray2);
      assertArrayEquals(new byte[] {(byte)95, (byte)119, (byte)65, (byte)65, (byte)13, (byte)10}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)70;
      byteArray0[1] = (byte)123;
      boolean boolean0 = Base64.isBase64(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true);
      Base64 base64_0 = new Base64(true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base64_0.encode(byteArray1, 6, 0, baseNCodec_Context0);
      assertTrue(base64_0.isUrlSafe());
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64(false);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      base64_0.decode(byteArray0, (-1798), (-1798), baseNCodec_Context0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      boolean boolean0 = base64_0.isUrlSafe();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      boolean boolean0 = base64_0.isInAlphabet((byte)47);
      assertTrue(boolean0);
      assertTrue(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Base64.isBase64("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = base64_0.encode(byteArray0, (int) (byte)0, (int) (byte) (-102));
      boolean boolean0 = Base64.isArrayByteBase64(byteArray1);
      assertTrue(base64_0.isUrlSafe());
      assertTrue(boolean0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Base64 base64_0 = new Base64(5);
      base64_0.getLineSeparator();
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64(1878, byteArray0, false);
      byte[] byteArray1 = base64_0.getLineSeparator();
      assertEquals(0, byteArray1.length);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Base64.encodeBase64URLSafeString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      String string0 = Base64.encodeBase64URLSafeString(byteArray1);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64URLSafe((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      byte[] byteArray2 = Base64.encodeBase64URLSafe(byteArray1);
      assertEquals(0, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Base64.encodeBase64String((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Base64.encodeBase64String(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)61, (byte)61, (byte)13, (byte)10}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)43;
      byteArray0[3] = (byte)48;
      byteArray0[4] = (byte)112;
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray0);
      assertEquals((short) (-1206), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-59);
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true, 42);
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray1);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)68, (byte)70, (byte)13, (byte)10}, byteArray1);
      assertEquals((short)197, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = Base64.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.toIntegerBytes((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.isBase64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Base64 base64_0 = new Base64();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base64_0.ensureBufferSize((byte)31, baseNCodec_Context0);
      String string0 = Base64.encodeBase64String(byteArray0);
      // Undeclared exception!
      Base64.isBase64(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.isBase64((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.encodeInteger((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // bigInteger
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base64_0.encode((byte[]) null, 1178, 13, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Base64 base64_0 = new Base64((byte)126, byteArray0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, (int) (byte)4, 997, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.decodeInteger((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Base64.Builder base64_Builder0 = Base64.builder();
      Base64 base64_0 = base64_Builder0.get();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0, 256, 458, baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)76;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-3193), byteArray0, true, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [L\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)89;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-819), byteArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000Y\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, true, true);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = new Base64((byte) (-71), byteArray1, false, codecPolicy0);
      base64_0.isInAlphabet((byte) (-71));
      assertEquals(0, byteArray1.length);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)76);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte) (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)61);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64((byte[]) null, false, false, 1801);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)56;
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64((byte) (-85), byteArray1, true, codecPolicy0);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)56;
      byteArray0[4] = (byte)52;
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64 base64_0 = new Base64((byte) (-85), byteArray1, true, codecPolicy0);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)126;
      Base64 base64_0 = new Base64((byte)126, byteArray0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base64 base64_0 = new Base64((-2859), byteArray0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = 52;
      // Undeclared exception!
      try { 
        base64_0.encode(byteArray0, 1637, (-2859), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus 52
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = BaseNCodec.CHUNK_SEPARATOR;
      String string0 = Base64.encodeBase64URLSafeString(byteArray0);
      assertEquals("DQo", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Base64.Builder base64_Builder0 = new Base64.Builder();
      Base64 base64_0 = base64_Builder0.get();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      baseNCodec_Context0.modulus = (-1720);
      // Undeclared exception!
      try { 
        base64_0.decode(byteArray0, (int) (byte) (-74), (int) (byte) (-117), baseNCodec_Context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Impossible modulus -1720
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-81);
      BigInteger bigInteger0 = Base64.decodeInteger(byteArray0);
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0);
      byte[] byteArray2 = Base64.decodeBase64(byteArray1);
      assertEquals(8, byteArray1.length);
      assertEquals(4, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = Base64.encodeInteger(bigInteger0);
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64((-2152), byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [Cg==]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = Base64.toIntegerBytes(bigInteger0);
      Base64.Builder base64_Builder0 = new Base64.Builder();
      base64_Builder0.setEncodeTable(byteArray0);
      // Undeclared exception!
      try { 
        base64_Builder0.get();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // encodeTable must have exactly 64 entries.
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = BaseNCodec.CHUNK_SEPARATOR;
      boolean boolean0 = Base64.isBase64(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = Base64.isBase64((byte)126);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Base64.encodeBase64(byteArray0, false, false, (int) (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Input array too big, the output array would be bigger (4) than the specified maximum size of 0
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Base64.Builder base64_Builder0 = new Base64.Builder();
      Base64 base64_0 = base64_Builder0.get();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      // Undeclared exception!
      try { 
        base64_0.decode((byte[]) null, 0, 4134, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = Base64.encodeBase64Chunked((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64 base64_0 = new Base64(113, (byte[]) null, false, codecPolicy0);
      assertFalse(base64_0.isUrlSafe());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = base64_0.getLineSeparator();
      assertFalse(base64_0.isUrlSafe());
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = Base64.isArrayByteBase64(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Base64.encodeBase64URLSafe(byteArray0);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = Base64.encodeBase64URLSafeString(byteArray0);
      assertEquals("AAAAAA", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = Base64.isBase64("org.apache.commons.codec.DecoderException");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      boolean boolean0 = base64_0.isUrlSafe();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      byte[] byteArray2 = Base64.encodeBase64(byteArray1, true, true, 76);
      assertEquals(0, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Base64.Builder base64_Builder0 = Base64.builder();
      Base64.Builder base64_Builder1 = base64_Builder0.setUrlSafe(true);
      assertSame(base64_Builder0, base64_Builder1);
  }
}
