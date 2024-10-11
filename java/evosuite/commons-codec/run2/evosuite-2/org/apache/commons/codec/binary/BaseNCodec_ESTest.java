
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
      Base32 base32_0 = new Base32(true);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      
      byte[] byteArray0 = new byte[7];
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      baseNCodec_Context0.readPos = 2361;
      int int0 = base32_0.readResults(byteArray0, (byte)0, 0, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(7, byteArray0.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Base64 base64_0 = new Base64(83, byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(8, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(base64_0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      long long0 = base64_0.getEncodedLength(byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(8, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(20L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      byte[] byteArray0 = new byte[2];
      baseNCodec_Context0.readPos = (int) (byte) (-114);
      Base64 base64_0 = new Base64();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(base64_0);
      
      // Undeclared exception!
      try { 
        base64_0.readResults(byteArray0, 112, 64, baseNCodec_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      baseNCodec_Context0.readPos = 623;
      String string0 = baseNCodec_Context0.toString();
      assertNotNull(string0);
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=0, readPos=623]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      baseNCodec_Context0.modulus = 49;
      String string0 = baseNCodec_Context0.toString();
      assertNotNull(string0);
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=49, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      baseNCodec_Context0.ibitWorkArea = 64;
      String string0 = baseNCodec_Context0.toString();
      assertNotNull(string0);
      assertEquals("Context[buffer=null, currentLinePos=0, eof=false, ibitWorkArea=64, lbitWorkArea=0, modulus=0, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      baseNCodec_Context0.currentLinePos = (int) (byte)26;
      String string0 = baseNCodec_Context0.toString();
      assertNotNull(string0);
      assertEquals("Context[buffer=null, currentLinePos=26, eof=false, ibitWorkArea=0, lbitWorkArea=0, modulus=0, pos=0, readPos=0]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = Base64.decodeBase64(byteArray0);
      assertEquals(5, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      int int0 = BaseNCodec.toLength(byteArray1);
      assertEquals(5, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = BaseNCodec.toLength(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-13));
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      base32_0.decode((byte[]) null, (int) (byte) (-13), (-2965), baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertTrue(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.STRICT, base16_0.getCodecPolicy());
      assertNotNull(base16_0);
      
      int int0 = base16_0.readResults((byte[]) null, 659, 64, baseNCodec_Context0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertTrue(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.STRICT, base16_0.getCodecPolicy());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte)13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Base64 base64_0 = new Base64();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(base64_0);
      
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      boolean boolean0 = base64_0.hasData(baseNCodec_Context0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Base16 base16_0 = new Base16();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertFalse(base16_0.isStrictDecoding());
      assertNotNull(base16_0);
      
      byte[] byteArray0 = new byte[2];
      long long0 = base16_0.getEncodedLength(byteArray0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(2, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertFalse(base16_0.isStrictDecoding());
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.STRICT, base16_0.getCodecPolicy());
      assertTrue(base16_0.isStrictDecoding());
      assertNotNull(base16_0);
      
      int int0 = base16_0.getDefaultBufferSize();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.STRICT, base16_0.getCodecPolicy());
      assertTrue(base16_0.isStrictDecoding());
      assertEquals(8192, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      baseNCodec_Context0.buffer = byteArray0;
      byte[] byteArray1 = base32_0.ensureBufferSize((-2432), baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Base16 base16_0 = new Base16();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertFalse(base16_0.isStrictDecoding());
      assertNotNull(base16_0);
      
      String string0 = base16_0.encodeToString(byteArray0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(5, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertFalse(base16_0.isStrictDecoding());
      assertNotNull(string0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals("0000000000", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string0 = base32_0.encodeToString(byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(string0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      
      String string0 = base32_0.encodeAsString((byte[]) null);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertNotNull(base16_0);
      
      byte[] byteArray0 = new byte[0];
      String string0 = base16_0.encodeAsString(byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertFalse(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertNotNull(string0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base64 base64_0 = new Base64(95);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(base64_0);
      
      byte[] byteArray0 = base64_0.encode((byte[]) null, 95, 2589);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(base64_0);
      
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      byte[] byteArray0 = base64_0.ensureBufferSize(8192, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(8192, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(byteArray0);
      
      Base16 base16_0 = new Base16();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertNotNull(base16_0);
      
      byte[] byteArray1 = base16_0.encode(byteArray0, 0, 64);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(8192, byteArray0.length);
      assertEquals(128, byteArray1.length);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Base64.encodeBase64(byteArray0, false, false, (-1));
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      Base32 base32_0 = new Base32((byte)64);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
      byte[] byteArray2 = base32_0.encode(byteArray1);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertEquals(0, byteArray2.length);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(byteArray2);
      assertSame(byteArray0, byteArray2);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertSame(byteArray1, byteArray2);
      assertSame(byteArray2, byteArray0);
      assertSame(byteArray2, byteArray1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertArrayEquals(new byte[] {}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Base32 base32_0 = new Base32((byte) (-13));
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      
      byte[] byteArray0 = base32_0.decode((byte[]) null);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(base64_0);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)101;
      byteArray0[4] = (byte)54;
      byte[] byteArray1 = base64_0.decode(byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(9, byteArray0.length);
      assertEquals(1, byteArray1.length);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)101, (byte)0, (byte)0, (byte)54, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)123}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
      byte[] byteArray0 = base32_0.decode((String) null);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Base16 base16_0 = new Base16(false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertFalse(base16_0.isStrictDecoding());
      assertNotNull(base16_0);
      
      byte[] byteArray0 = base16_0.decode("");
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertFalse(base16_0.isStrictDecoding());
      assertNotNull(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      byte[] byteArray1 = base32_0.ensureBufferSize(0, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(8192, byteArray1.length);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      baseNCodec_Context0.pos = 76;
      // Undeclared exception!
      try { 
        base32_0.readResults(byteArray1, 0, (-2432), baseNCodec_Context0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Base32 base32_0 = new Base32(0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
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
  public void test28()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
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
  public void test29()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)64);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
      // Undeclared exception!
      try { 
        base32_0.hasData((BaseNCodec.Context) null);
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
      Base64 base64_0 = new Base64(false);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(base64_0);
      
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
  public void test31()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)64);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
      // Undeclared exception!
      try { 
        base32_0.ensureBufferSize(0, (BaseNCodec.Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Base32 base32_0 = new Base32();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
      // Undeclared exception!
      try { 
        base32_0.encode(byteArray0, 0, 1504);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Base16 base16_0 = new Base16();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertNotNull(base16_0);
      
      byte[] byteArray0 = new byte[4];
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
  public void test34()  throws Throwable  {
      Base16 base16_0 = new Base16();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertFalse(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertNotNull(base16_0);
      
      // Undeclared exception!
      try { 
        base16_0.decode("org.apache.commons.codec.binary.BaseNCodec");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 111
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Base16 base16_0 = new Base16(true);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base16_0.getCodecPolicy());
      assertFalse(base16_0.isStrictDecoding());
      assertNotNull(base16_0);
      
      // Undeclared exception!
      try { 
        base16_0.decode((Object) "`p_z{(K4w$u$cLyp");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 96
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(4, byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      assertNotNull(baseNCodec_Context0);
      
      byte[] byteArray1 = base32_0.ensureBufferSize(4, baseNCodec_Context0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(8192, byteArray1.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      Base64 base64_0 = new Base64(4112, byteArray1);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(8192, byteArray1.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(base64_0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {}, byteArray0);
      
      // Undeclared exception!
      base64_0.containsAlphabetOrPad(byteArray1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Base64 base64_0 = new Base64(80);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertNotNull(base64_0);
      
      boolean boolean0 = base64_0.isStrictDecoding();
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Base32 base32_0 = new Base32((byte)64);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)64;
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, true);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(5, byteArray0.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertArrayEquals(new byte[] {(byte)64, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)52;
      Base32 base32_0 = new Base32((-226), byteArray0, false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(3, byteArray0.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertNotNull(base32_0);
      assertArrayEquals(new byte[] {(byte)52, (byte)0, (byte)0}, byteArray0);
      
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(3, byteArray0.length);
      assertFalse(base32_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertArrayEquals(new byte[] {(byte)52, (byte)0, (byte)0}, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Base64 base64_0 = new Base64(false);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(base64_0);
      
      byte[] byteArray0 = base64_0.getLineSeparator();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(2, byteArray0.length);
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(byteArray0);
      assertArrayEquals(new byte[] {(byte)13, (byte)10}, byteArray0);
      
      boolean boolean0 = base64_0.isInAlphabet(byteArray0, true);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(2, byteArray0.length);
      assertFalse(base64_0.isUrlSafe());
      assertFalse(base64_0.isStrictDecoding());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertArrayEquals(new byte[] {(byte)13, (byte)10}, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Base64 base64_0 = new Base64();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(base64_0);
      
      byte[] byteArray0 = BaseNCodec.getChunkSeparator();
      assertEquals(2, byteArray0.length);
      assertNotNull(byteArray0);
      assertArrayEquals(new byte[] {(byte)13, (byte)10}, byteArray0);
      
      byte[] byteArray1 = base64_0.encode(byteArray0, 0, (-14));
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(2, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte)13, (byte)10}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Base32 base32_0 = new Base32();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      
      byte[] byteArray0 = base32_0.encode((byte[]) null);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(false, codecPolicy0);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertTrue(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.STRICT, base16_0.getCodecPolicy());
      assertNotNull(base16_0);
      
      boolean boolean0 = base16_0.isStrictDecoding();
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertTrue(base16_0.isStrictDecoding());
      assertEquals(CodecPolicy.STRICT, base16_0.getCodecPolicy());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64(0, byteArray0, false);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(4, byteArray0.length);
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertNotNull(base64_0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      boolean boolean0 = base64_0.isInAlphabet("nv8NBQ==");
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(4, byteArray0.length);
      assertFalse(base64_0.isStrictDecoding());
      assertFalse(base64_0.isUrlSafe());
      assertEquals(CodecPolicy.LENIENT, base64_0.getCodecPolicy());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertNotNull(base32_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      boolean boolean0 = base32_0.isInAlphabet(byteArray0, false);
      assertEquals(76, BaseNCodec.MIME_CHUNK_SIZE);
      assertEquals(64, BaseNCodec.PEM_CHUNK_SIZE);
      assertEquals(0, byteArray0.length);
      assertEquals(CodecPolicy.LENIENT, base32_0.getCodecPolicy());
      assertFalse(base32_0.isStrictDecoding());
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = base16_0.ensureBufferSize(0, baseNCodec_Context0);
      byte[] byteArray1 = Base64.encodeBase64Chunked(byteArray0);
      // Undeclared exception!
      base16_0.encode(byteArray1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray1 = base32_0.ensureBufferSize(0, baseNCodec_Context0);
      Base64.encodeBase64String(byteArray1);
      assertEquals(8192, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Base64 base64_0 = new Base64(2491);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      try { 
        base64_0.encode((Object) codecPolicy0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N encode is not a byte[]
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64(0, byteArray0, false);
      Object object0 = base64_0.decode((Object) "nv8NBQ==");
      Object object1 = base64_0.encode(object0);
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      try { 
        base64_0.decode((Object) baseNCodec_Context0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Base-N decode is not a byte[] or a String
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64(0, byteArray0, false);
      Object object0 = base64_0.decode((Object) "nv8NBQ==");
      Object object1 = base64_0.decode(object0);
      assertNotSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      byte[] byteArray1 = base32_0.decode(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)109;
      Base64 base64_0 = null;
      try {
        base64_0 = new Base64(2758, byteArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000\u0000\u0000m\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)26;
      Base32 base32_0 = null;
      try {
        base32_0 = new Base32(64, byteArray0, true, (byte)26);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u001A\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Base32 base32_0 = new Base32(true);
      boolean boolean0 = base32_0.containsAlphabetOrPad((byte[]) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Base64 base64_0 = new Base64();
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      int int0 = base64_0.available(baseNCodec_Context0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Base64 base64_0 = new Base64(true);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray0 = new byte[9];
      baseNCodec_Context0.buffer = byteArray0;
      byte[] byteArray1 = base64_0.ensureBufferSize(433, baseNCodec_Context0);
      assertEquals(433, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Base32 base32_0 = new Base32(0, byteArray0);
      BaseNCodec.Context baseNCodec_Context0 = new BaseNCodec.Context();
      byte[] byteArray1 = base32_0.ensureBufferSize(0, baseNCodec_Context0);
      byte[] byteArray2 = base32_0.encode(byteArray1);
      assertEquals(8192, byteArray1.length);
      assertEquals(13112, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Base32.Builder base32_Builder0 = Base32.builder();
      assertNotNull(base32_Builder0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = BaseNCodec.getChunkSeparator();
      String string0 = base64_0.encodeAsString(byteArray0);
      assertEquals("DQo=", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = BaseNCodec.isWhiteSpace((byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Base64 base64_0 = new Base64();
      boolean boolean0 = base64_0.isInAlphabet("Parameter supplied to Base-N encode is not a byte[]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Base16 base16_0 = new Base16();
      String string0 = base16_0.encodeToString((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Base64 base64_0 = new Base64(64, (byte[]) null);
      CodecPolicy codecPolicy0 = base64_0.getCodecPolicy();
      assertEquals(CodecPolicy.LENIENT, codecPolicy0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Base64 base64_0 = new Base64();
      assertFalse(base64_0.isStrictDecoding());
      
      byte[] byteArray0 = base64_0.decode("Invalid octet in encoded value: ");
      assertEquals(19, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = BaseNCodec.getChunkSeparator();
      Base64 base64_0 = new Base64(255, byteArray0);
      byte[] byteArray1 = new byte[7];
      byteArray1[1] = (byte)104;
      boolean boolean0 = base64_0.containsAlphabetOrPad(byteArray1);
      assertTrue(boolean0);
  }
}
