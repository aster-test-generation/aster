
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base16;
import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.commons.codec.binary.BaseNCodecOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseNCodecOutputStream_ESTest extends BaseNCodecOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("lmY'?v[N0}:zA+*");
      Base64 base64_0 = new Base64(2108);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base64_0, false);
      byte[] byteArray0 = new byte[0];
      baseNCodecOutputStream0.write(byteArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "array");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base16_0, false);
      boolean boolean0 = baseNCodecOutputStream0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CY");
      Base32 base32_0 = new Base32((byte) (-102));
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base32_0, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write((byte[]) null, 64, 48);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // array
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[5];
      Base16 base16_0 = new Base16(true);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base16_0, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 0
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base64 base64_0 = new Base64(70);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base64_0, true);
      byte[] byteArray0 = new byte[6];
      try { 
        baseNCodecOutputStream0.write(byteArray0, 1, (int) (byte)3);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, (BaseNCodec) null, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write((-1006));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Base16 base16_0 = new Base16(true);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base16_0, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write((int) (byte)91);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 91
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base16 base16_0 = new Base16();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base16_0, true);
      try { 
        baseNCodecOutputStream0.write(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, (BaseNCodec) null, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.isStrictDecoding();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(bufferedOutputStream0, (BaseNCodec) null, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("L3#'J.sI@");
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, (BaseNCodec) null, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.eof();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = MockFile.createTempFile("?[7u+>T]zrU%I", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, (BaseNCodec) null, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base32 base32_0 = new Base32(true, (byte)1);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base32_0, false);
      byte[] byteArray0 = new byte[8];
      baseNCodecOutputStream0.write(byteArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      Base64 base64_0 = new Base64('D');
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base64_0, true);
      baseNCodecOutputStream0.eof();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      Base64 base64_0 = new Base64('D');
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base64_0, true);
      baseNCodecOutputStream0.flush();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(108, byteArray0, false);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, false);
      baseNCodecOutputStream0.write((int) (byte)0);
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Base16 base16_0 = new Base16(true);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base16_0, true);
      byte[] byteArray0 = new byte[6];
      baseNCodecOutputStream0.write(byteArray0, 0, 0);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(108, byteArray0, false);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, (int) (byte)0, 108);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Base64 base64_0 = new Base64();
      byte[] byteArray0 = new byte[4];
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(byteArrayOutputStream0, base64_0, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, 2546, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      Base64 base64_0 = new Base64('D');
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base64_0, true);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, 302, (int) (byte) (-43));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Base16 base16_0 = new Base16(true);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base16_0, true);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, (int) (byte) (-110), (-387));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base32 base32_0 = new Base32(108, byteArray0, false);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, false);
      baseNCodecOutputStream0.eof();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      Base64 base64_0 = new Base64('D');
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base64_0, true);
      boolean boolean0 = baseNCodecOutputStream0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      Base64 base64_0 = new Base64('D');
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base64_0, true);
      baseNCodecOutputStream0.close();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }
}
