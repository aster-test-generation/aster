
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


package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import org.apache.commons.codec.net.QuotedPrintableCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class QuotedPrintableCodec_ESTest extends QuotedPrintableCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte)33;
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertNotNull(byteArray1);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, false);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BitSet bitSet0 = new BitSet(1);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.encode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      String string0 = quotedPrintableCodec0.encode("", "UTF-8");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.encode("|=PEC3af#*WsK7 ");
      assertEquals("|=3DPEC3af#*WsK7=20", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      byte[] byteArray0 = quotedPrintableCodec0.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = quotedPrintableCodec0.decode(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.decode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.decode("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      String string0 = quotedPrintableCodec0.decode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.getDefaultCharset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("Objects of type ", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("<\"@+1r#J", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      try { 
        quotedPrintableCodec0.encode("org.apache.commons.codec.EncoderException", "f/ i");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode((Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)61;
      try { 
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 0
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte)61;
      try { 
        quotedPrintableCodec0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 0
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      try { 
        quotedPrintableCodec0.decode("jp '=`g", charset0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 96
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      try { 
        quotedPrintableCodec0.decode("0>9^9%=", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid quoted-printable encoding
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      try { 
        quotedPrintableCodec0.decode("Invalid quoted-printable encoding", "Invalid quoted-printable encoding");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, false);
      try { 
        quotedPrintableCodec0.decode("!WMy'>}:=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid quoted-printable encoding
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, false);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("oI\"Edr4?o");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode((Object) "K*(YHGg");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("x1d");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // x1d
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.encode("org.apache.commons.codec.DecoderException", charset0);
      assertEquals("org.apache.commons.codec.DecoderException", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.encode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.decode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.decode("org.apache.commons.codec.DecoderException", charset0);
      assertEquals("org.apache.commons.codec.DecoderException", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)126;
      byteArray0[6] = (byte)1;
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-44);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)43;
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, true);
      assertArrayEquals(new byte[] {(byte)43, (byte)61, (byte)48, (byte)48, (byte)61, (byte)48, (byte)48}, byteArray1);
      assertEquals(7, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)0);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(61);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, (byte[]) null, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = quotedPrintableCodec0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.encode("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      long[] longArray0 = new long[1];
      LongBuffer longBuffer0 = LongBuffer.wrap(longArray0);
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      try { 
        quotedPrintableCodec0.encode((Object) longBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.nio.HeapLongBuffer cannot be quoted-printable encoded
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      Object object0 = quotedPrintableCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.decode((String) null, "{6a~9;Y:713*bo$B^");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      String string0 = quotedPrintableCodec0.decode("", "UTF-8");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      Object object0 = new Object();
      try { 
        quotedPrintableCodec0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.lang.Object cannot be quoted-printable decoded
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Object object0 = quotedPrintableCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-125);
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertEquals(18, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byteArray0[2] = (byte) (-15);
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte)126;
      byteArray0[3] = (byte)3;
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      assertEquals(160, byteArray2.length);
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)9;
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertEquals(22, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte)126;
      byteArray0[6] = (byte)1;
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      assertEquals(93, byteArray2.length);
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, (byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.encode((Object) "Objects of type ");
      assertEquals("Objects of type=20", object0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)13;
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.decode((Object) "Objects of type=3D20");
      assertEquals("Objects of type=20", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = QuotedPrintableCodec.decodeQuotedPrintable((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      byte[] byteArray3 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray2);
      assertEquals(54, byteArray3.length);
      assertNotNull(byteArray3);
      assertEquals(168, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      String string0 = quotedPrintableCodec0.decode("RwBkWm[N");
      assertNotNull(string0);
      assertEquals("RwBkWm[N", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, false);
      Charset charset0 = quotedPrintableCodec0.getCharset();
      assertNull(charset0);
  }
}
