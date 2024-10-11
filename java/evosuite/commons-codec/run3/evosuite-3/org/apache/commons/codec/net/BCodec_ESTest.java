
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
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.net.BCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BCodec_ESTest extends BCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.getEncoding();
      assertEquals("B", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = bCodec0.encode((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      String string0 = bCodec0.encode("',oFzKxJy", charset0);
      assertEquals("=?UTF-8?B?JyxvRnpLeEp5?=", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = bCodec0.doEncoding(byteArray0);
      assertArrayEquals(new byte[] {(byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65, (byte)65}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = bCodec0.doEncoding(byteArray0);
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte)87;
      byte[] byteArray1 = bCodec0.doDecoding(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = bCodec0.doDecoding(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.decode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      String string0 = bCodec0.decode("=?UTF-8?B?JyxvRnpLeEp5?=");
      assertEquals("',oFzKxJy", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.decode("=?UTF-8?B??=");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.encode("o", "o");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // o
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("G$eK7M7{V$", " cannot be decoded using BCodec");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         //  cannot be decoded using BCodec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)95;
      // Undeclared exception!
      try { 
        bCodec0.doDecoding(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0, (CodecPolicy) null);
      // Undeclared exception!
      try { 
        bCodec0.decode((Object) "=?UTF-8?B?SztFWCAyPA==?=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // codecPolicy
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec((Charset) null, codecPolicy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec((Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec("org.apache.commons.codec.net.BCodec");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.net.BCodec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decode("i0");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      boolean boolean0 = bCodec0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      boolean boolean0 = bCodec0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      try { 
        bCodec0.encode((Object) codecPolicy0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type org.apache.commons.codec.CodecPolicy cannot be encoded using BCodec
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      Object object0 = bCodec0.encode((Object) "=?UTF-8?B??=");
      assertEquals("=?UTF-8?B?PT9VVEYtOD9CPz89?=", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = bCodec0.doEncoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      byte[] byteArray0 = bCodec0.doDecoding((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decode((Object) charset0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type sun.nio.cs.UTF_8 cannot be decoded using BCodec
         //
         verifyException("org.apache.commons.codec.net.BCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      Object object0 = bCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      Object object0 = bCodec0.decode((Object) "=?UTF-8?B?PT9VVEYtOD9CPz89?=");
      assertEquals("=?UTF-8?B??=", object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      BCodec bCodec0 = new BCodec(charset0);
      // Undeclared exception!
      try { 
        bCodec0.encode("3}plWq[>^$Ml", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BCodec bCodec0 = null;
      try {
        bCodec0 = new BCodec("");
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
      BCodec bCodec0 = new BCodec(charset0);
      String string0 = bCodec0.encode("");
      assertEquals("=?UTF-8?B??=", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      // Undeclared exception!
      try { 
        bCodec0.encode("MgLsP_9x]?", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
