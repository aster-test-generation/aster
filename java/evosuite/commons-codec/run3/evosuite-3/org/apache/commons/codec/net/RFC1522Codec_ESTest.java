
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
import org.apache.commons.codec.net.QCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RFC1522Codec_ESTest extends RFC1522Codec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.encodeText((String) null, charset0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Charset charset0 = Charset.defaultCharset();
      String string0 = qCodec0.encodeText("", charset0);
      assertNotNull(string0);
      assertEquals("=?UTF-8?Q??=", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      String string0 = bCodec0.encodeText("=?UTF-8?Q??=", "UTF-8");
      assertNotNull(string0);
      assertEquals("=?UTF-8?B?PT9VVEYtOD9RPz89?=", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decodeText("=?UTF-8?Q?:;/p#<B?=?=");
      assertEquals(":;/p#<B", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decodeText("=?UTF-8?Q??=");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encodeText("\"h;@Ane-*C/a", (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      Charset charset0 = qCodec0.getCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      // Undeclared exception!
      try { 
        bCodec0.encodeText("org.apache.commons.codec.net.RFC1522Codec", "org.apache.commons.codec.net.RFC1522Codec");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.apache.commons.codec.net.RFC1522Codec
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      QCodec qCodec0 = new QCodec(charset0);
      // Undeclared exception!
      try { 
        qCodec0.encodeText("RFC 1522 violation: charset token not found", "?=");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ?=
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      // Undeclared exception!
      try { 
        qCodec0.encodeText("O>", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.encodeText((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      BCodec bCodec0 = new BCodec(charset0, codecPolicy0);
      try { 
        bCodec0.decode("=?UTF-8?Q??=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This codec cannot decode Q encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decode("=?=?d=Aj{K^6:_-8AB=?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: encoding token not found
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decodeText("=?d=AKE^6:_-8A?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: charset token not found
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      try { 
        qCodec0.decode("=?=?=?d=A{K^6:-8ABA==");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      try { 
        bCodec0.decode("?=");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // RFC 1522 violation: malformed encoded content
         //
         verifyException("org.apache.commons.codec.net.RFC1522Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QCodec qCodec0 = new QCodec();
      String string0 = qCodec0.decodeText((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BCodec bCodec0 = new BCodec();
      String string0 = bCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }
}
