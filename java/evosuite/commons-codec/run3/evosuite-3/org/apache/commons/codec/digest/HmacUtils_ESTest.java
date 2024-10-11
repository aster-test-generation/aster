
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import javax.crypto.Mac;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HmacUtils_ESTest extends HmacUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[7];
      String string0 = HmacUtils.hmacSha512Hex(byteArray0, byteArray1);
      assertEquals("2121570bd4cf13b39ec4c090c4df4cb2eab511638c17457f0a5fac39b08852ce5e2385fc1ca51c4afd786c1732cd655d78bee6ab5f7abda3cb6b8bd677b6009f", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha512(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = HmacUtils.hmacSha384Hex("!", "U");
      assertEquals("9e9c633091cb975b5efd71e9b3f78b91e8080fab735866eeffd28f1098e6d4ea6e224c6f4e1787c0076668f04f5bfc37", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("org.apache.commons.codec.binary.StringUtils", "rszb=J?7");
      File file0 = MockFile.createTempFile("org.apache.commons.codec.binary.StringUtils", "org.apache.commons.codec.digest.HmacUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, (InputStream) mockFileInputStream0);
      String string0 = HmacUtils.hmacSha384Hex(byteArray1, byteArray0);
      assertEquals("e829f0c2ff69820ef8405f488951a765f0837c3b6277a8f5f97f27e3416aa064db08e8da15c70a3ee6e31925ffe8f750", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[8];
      byte[] byteArray2 = HmacUtils.hmacSha384(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[8];
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, byteArray1);
      assertEquals("f375180aba92888401f1919be4a8715a62763b65c1c10e1d0858e81d4d6f9fd2", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("org.apache.commons.codec.digest.HmacUtils", "");
      byte[] byteArray1 = new byte[9];
      byte[] byteArray2 = HmacUtils.hmacSha256(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray2);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, (byte[]) null);
      assertEquals("fbdb1d1b18aa6c08324b7d64b71fb76370690e1d", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[8];
      byte[] byteArray2 = HmacUtils.hmacSha1(byteArray1, byteArray0);
      assertNotSame(byteArray1, byteArray2);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[2];
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, byteArray1);
      assertEquals("cbc26d6c1022a9a33b5f5a4c12b99dcd", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[8];
      byte[] byteArray2 = HmacUtils.hmacMd5(byteArray0, byteArray1);
      assertNotSame(byteArray2, byteArray1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      HmacUtils hmacUtils0 = new HmacUtils("HmacSHA1", byteArray0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable("HmacSHA1");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)40);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, (InputStream) pushbackInputStream0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("k0Zw);;", "c?=W9<41eQ#)u");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("9385ebe41389e6e43d0f1d2b769d7ef48cdee20c", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      String string0 = HmacUtils.hmacSha1Hex("org.apache.commons.codec.digest.HmacUtils", "M");
      assertEquals("6c966996faecbae5f06821445f92c7d7513f1401", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "HmacSHA256");
      String string0 = hmacUtils0.hmacHex("HmacSHA256");
      assertEquals("63074d97d803cee134bc8163b9cf1d7ce526a0c21772ee8c29aff8a7", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)0);
      byte[] byteArray1 = hmacUtils0.hmac(byteBuffer0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[2];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      byte[] byteArray1 = hmacUtils0.hmac("org.apache.commons.codec.digest.HmacUtils");
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, "CE4F%MUl]Jm8aQ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 6);
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, (InputStream) pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Mac mac0 = HmacUtils.getHmacSha1(byteArray0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        HmacUtils.updateHmac(mac0, (InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.isAvailable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("<0hh", "<0hh");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex("", "bU<U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, (byte)40);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512("", "Null key");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-6), (byte)54);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex((String) null, "39dd3698254ebfd4e61eeabfb085ad5a129b42e9cf192bf159b639138352b777");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray1, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((byte[]) null, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-13), (byte)26);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("2:fnf=B", "2:fnf=B");
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384("", "(,(v");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[4];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256(byteArray0, byteArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256("", "Pm!R;yCLH4^Y3:/o$~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex("", "k0Zw);;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(820);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1((byte[]) null, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1((String) null, "!nQYF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((byte[]) null, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("Um(4EGJ+|WjQ$", "Um(4EGJ+|WjQ$");
      HmacUtils hmacUtils0 = new HmacUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedOutputStream0.close();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((InputStream) bufferedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        hmacUtils0.hmacHex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      MockFile mockFile0 = new MockFile("45370852c7a23718adb8a2a9e08c965a878979de88f307c0d597c14ff854398e", "");
      try { 
        hmacUtils0.hmacHex((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((InputStream) byteArrayInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      byte[] byteArray0 = new byte[2];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      MockFile mockFile0 = new MockFile("U5qOU");
      try { 
        hmacUtils0.hmac((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac(hmacAlgorithms0, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("[charsetName=", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("50f40495a22be2449351208bc821b960625f6756", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm 50f40495a22be2449351208bc821b960625f6756 not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha512(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha512((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha384((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha256(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha256((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha1(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha1((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacMd5(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacMd5((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils((String) null, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("4#Ck`ONh", "4#Ck`ONh");
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("org.apache.commons.codec.digest.HmacUtils", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm org.apache.commons.codec.digest.HmacUtils not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("Odd number of characters.", "Odd number of characters.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm Odd number of characters. not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      byte[] byteArray0 = new byte[1];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = hmacUtils0.hmac((InputStream) byteArrayInputStream0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      byte[] byteArray0 = new byte[7];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = hmacUtils0.hmacHex((InputStream) byteArrayInputStream0);
      assertEquals("9fff24da1f43d7e0629f93e2a95ab89aa7e24fda7cb9b8d7c3444516", string0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmac("]RX;3zn5@@:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, " <I*i>@Q\"");
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = hmacUtils0.hmac(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, ")i9lAdEPq");
      byte[] byteArray0 = new byte[6];
      String string0 = hmacUtils0.hmacHex(byteArray0);
      assertEquals("39a6052feca0148d6463809d205cd6ea94c8249d03f74f938b6d0501", string0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("i", "ajFKj\"2jSZ{5eDs[");
      HmacUtils hmacUtils0 = new HmacUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex("$VALUES");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile("HmacSHA384", "", (File) mockFile0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[3];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      MockFile mockFile0 = new MockFile("Null key", "[/I'f");
      File file0 = MockFile.createTempFile("$VALUES", "", (File) mockFile0);
      String string0 = hmacUtils0.hmacHex(file0);
      assertEquals("b613679a0814d9ec772f95d778c35fc5ff1697c493715653c6c712144292c5ad", string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils("HmacSHA224", "HmacSHA224");
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = HmacUtils.hmacSha512Hex("$VALUES", "Null key");
      assertEquals("24e8ed015b6368578d9b695f3baab2be95cd076c29d6ec4f8b48ba28a7b09a891ba0af505ad351a99f50784aa74bf34c8f425a16e4954b508447968564a474e4", string0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("i", "ajFKj\"2jSZ{5eDs[");
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      String string0 = HmacUtils.hmacMd5Hex("i", (String) null);
      assertEquals("d1583c0bb9190125a4196e04869a6922", string0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable("4#Ck`ONh");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        HmacUtils.hmacSha256(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("y46Ljm'-v", "80c6c15d2d5ff78d4a418d6b552fc58082ac295a222665b97af99207d78b7411");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Mac mac0 = HmacUtils.getHmacSha1(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, (InputStream) byteArrayInputStream0);
      assertSame(mac0, mac1);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Mac mac0 = HmacUtils.getHmacSha512(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha1("Null key", "");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      String string0 = HmacUtils.hmacSha256Hex("4#Ck`ONh", (String) null);
      assertEquals("5cb53c8536574429904a1b8d14e7155063e3a646dce2c15341f844b7e0bad18c", string0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      Mac mac0 = HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, byteArray0);
      assertSame(mac1, mac0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacMd5(byteArray0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("z$e@4]&?kIjk~XJr{t", "Null key");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("i");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "org.apache.commons.codec.binary.Hex");
      byte[] byteArray0 = HmacUtils.hmacMd5("i", "ajFKj\"2jSZ{5eDs[");
      MockFile mockFile0 = new MockFile((File) null, "i");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, (InputStream) mockFileInputStream0);
      assertEquals((-2), mockFileInputStream0.available());
      assertEquals("60d01e5744ef40dd8c9af4d061442d1641a84ec16224cdece8dac34fb5dd00e9", string0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("4#Ck`ONh", "4#Ck`ONh");
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = HmacUtils.hmacSha384Hex(byteArray0, (InputStream) sequenceInputStream0);
      assertEquals("6c1f2ee938fad2e24bd91298474382ca218c75db3d83e114b3d4367776d14d3551289e75e8209cd4b792302840234adc", string0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Mac mac0 = HmacUtils.getHmacSha384(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      boolean boolean0 = HmacUtils.isAvailable(hmacAlgorithms0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex((String) null, "(o^%P>f(;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)0);
      String string0 = hmacUtils0.hmacHex(byteBuffer0);
      assertEquals("b613679a0814d9ec772f95d778c35fc5ff1697c493715653c6c712144292c5ad", string0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      String string0 = HmacUtils.hmacSha512Hex(byteArray0, (InputStream) bufferedInputStream0);
      assertEquals("b936cee86c9f87aa5d3c6f2e84cb5a4239a5fe50480a6ec66b70ab5b1f4ac6730c6c515421b327ec1d69402e53dfb49ad7381eb067b338fd7b0cb22247225d47", string0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((byte[]) null, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("3ab9e23e446dba90ea30eb504630aeb7", string0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("4#Ck`ONh", "4#Ck`ONh");
      Mac mac0 = HmacUtils.getHmacSha256(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, "Q}mT#m\"<5G=yACrbTF1");
      assertSame(mac1, mac0);
  }
}
