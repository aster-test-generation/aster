
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
      long[] longArray0 = new long[3];
      longArray0[0] = 1631L;
      BitSet bitSet0 = BitSet.valueOf(longArray0);
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertNotNull(byteArray1);
      assertEquals(7, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte) (-38);
      byteArray0[2] = (byte) (-88);
      byteArray0[3] = (byte) (-92);
      byteArray0[4] = (byte) (-38);
      byteArray0[6] = (byte) (-112);
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      BitSet bitSet0 = BitSet.valueOf(byteArray1);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      assertNotNull(byteArray2);
      assertEquals(139, bitSet0.cardinality());
      assertEquals(88, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.encode("6Fm");
      assertEquals("6Fm", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-78);
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      byte[] byteArray2 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-78), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray2);
      assertEquals(18, byteArray1.length);
      assertEquals(6, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, false);
      Charset charset0 = quotedPrintableCodec0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      byte[] byteArray0 = quotedPrintableCodec0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      String string0 = quotedPrintableCodec0.encode("h)}0Q\"+", charset0);
      assertEquals("h)}0Q\"+", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.encode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.encode(" cannot be quoted-printable encoded", "UTF-8");
      assertEquals(" cannot be quoted-printable encoded", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      byte[] byteArray0 = quotedPrintableCodec0.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      String string0 = quotedPrintableCodec0.decode("", charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.decode("Jav{jkqO2@e[?", "UTF-8");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      String string0 = quotedPrintableCodec0.decode("", "UTF-8");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode("vURy2I#7:&g]l<`");
      assertEquals("vURy2I#7:&g]l<`", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.decode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Object object0 = quotedPrintableCodec0.decode((Object) " cannot be quoted-printable decoded");
      assertEquals(" cannot be quoted-printable decoded", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("vURy2I#7:&g]l<`", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.encode((Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte)61;
      try { 
        QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
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
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      byteArray1[4] = (byte) (-56);
      try { 
        quotedPrintableCodec0.decode(byteArray1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): -56
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, true);
      try { 
        quotedPrintableCodec0.decode("=on`", (Charset) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 111
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode(" cannot be quoted-printable decoded", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, false);
      try { 
        quotedPrintableCodec0.decode("=4.[QKS%PEl", " cannot be quoted-printable decoded");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 46
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode("org.apache.commons.codec.net.QuotedPrintableCodec", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(false);
      try { 
        quotedPrintableCodec0.decode("srH&4JZG=;%W");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 59
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null, true);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode((Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("org.apache.commons.codec.DecoderException");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.DecoderException
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.encode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = quotedPrintableCodec0.decode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0, true);
      String string0 = quotedPrintableCodec0.decode("UTF-8", charset0);
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)32;
      byte[] byteArray1 = new byte[8];
      byteArray1[4] = (byte)15;
      BitSet bitSet0 = BitSet.valueOf(byteArray1);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, false);
      assertEquals(1, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = quotedPrintableCodec0.decode(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray1);
      BitSet bitSet0 = BitSet.valueOf(byteBuffer0);
      byte[] byteArray2 = new byte[5];
      byteArray2[2] = (byte) (-1);
      byte[] byteArray3 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray2, false);
      assertNotSame(byteArray1, byteArray3);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[15];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      BitSet bitSet0 = BitSet.valueOf(byteArray1);
      assertEquals(358, bitSet0.length());
      
      bitSet0.clear();
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      assertEquals(138, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      long[] longArray0 = new long[2];
      BitSet bitSet0 = BitSet.valueOf(longArray0);
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray0, true);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0, false);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      long[] longArray0 = new long[0];
      LongBuffer longBuffer0 = LongBuffer.wrap(longArray0);
      BitSet bitSet0 = BitSet.valueOf(longBuffer0);
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, (byte[]) null, true);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[15];
      byteArray0[5] = (byte)62;
      byteArray0[6] = (byte)62;
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      byteArray1[17] = (byte)13;
      byte[] byteArray2 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray1);
      assertEquals(16, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.encode((String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      try { 
        quotedPrintableCodec0.encode("", "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
      try { 
        quotedPrintableCodec0.encode((Object) charset0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type sun.nio.cs.UTF_8 cannot be quoted-printable encoded
         //
         verifyException("org.apache.commons.codec.net.QuotedPrintableCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      String string0 = quotedPrintableCodec0.decode((String) null, "org.apache.commons.codec.DecoderException");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      try { 
        quotedPrintableCodec0.decode("Jav{jkqO2@e[?", "Jav{jkqO2@e[?");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(charset0);
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
  public void test54()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.encode("Invalid URL encoding: not a valid digit (radix 16): ");
      assertEquals("Invalid URL encoding: not a valid digit (radix 16):=20", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte) (-88);
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      BitSet bitSet0 = BitSet.valueOf(byteArray1);
      byte[] byteArray2 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray1, true);
      assertNotNull(byteArray2);
      assertEquals(80, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      Object object0 = quotedPrintableCodec0.encode((Object) "lFRCuqs9J>PVc+d (-");
      assertNotNull(object0);
      assertEquals("lFRCuqs9J>PVc+d (-", object0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = QuotedPrintableCodec.encodeQuotedPrintable((BitSet) null, byteArray0);
      assertEquals(24, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BitSet bitSet0 = new BitSet(256);
      byte[] byteArray0 = QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, (byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      byte[] byteArray0 = new byte[36];
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      byte[] byteArray2 = QuotedPrintableCodec.decodeQuotedPrintable(byteArray1);
      assertEquals(111, byteArray1.length);
      assertEquals(36, byteArray2.length);
      assertNotNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec();
      byte[] byteArray0 = new byte[15];
      byteArray0[5] = (byte)62;
      byteArray0[6] = (byte)62;
      byte[] byteArray1 = quotedPrintableCodec0.encode(byteArray0);
      assertNotNull(byteArray1);
      
      byteArray1[17] = (byte)13;
      byte[] byteArray2 = quotedPrintableCodec0.decode(byteArray1);
      assertEquals(16, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = QuotedPrintableCodec.decodeQuotedPrintable((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec((Charset) null);
      // Undeclared exception!
      try { 
        quotedPrintableCodec0.decode(",DET[");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = new QuotedPrintableCodec(true);
      String string0 = quotedPrintableCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QuotedPrintableCodec quotedPrintableCodec0 = null;
      try {
        quotedPrintableCodec0 = new QuotedPrintableCodec("FmVLcGvC; J4xR;Q>k7");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // FmVLcGvC; J4xR;Q>k7
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
