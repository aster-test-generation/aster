
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
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BaseNCodecOutputStream_ESTest extends BaseNCodecOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(") than the specified maximum size of ", false);
      Base64 base64_0 = new Base64(120);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base64_0, true);
      baseNCodecOutputStream0.flush();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">TwDxubQc-IU9", "dgh/@3a;");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32((-1935), byteArray0, true, (byte)0, codecPolicy0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base32_0, true);
      boolean boolean0 = baseNCodecOutputStream0.isStrictDecoding();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32((-1), (byte[]) null, true, (byte)43, codecPolicy0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write((byte[]) null, (int) (byte)43, (int) (byte)43);
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
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, (BaseNCodec) null, true);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write((-1021));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("susqZ");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 1378);
      Base16 base16_0 = new Base16();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(bufferedOutputStream0, base16_0, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(64);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid octet in encoded value: 64
         //
         verifyException("org.apache.commons.codec.binary.Base16", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base16 base16_0 = new Base16(true, codecPolicy0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(pipedOutputStream0, base16_0, true);
      try { 
        baseNCodecOutputStream0.write((-146));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(filterOutputStream0, (BaseNCodec) null, true);
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
  public void test07()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("*");
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64(16, byteArray0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base64_0, true);
      mockFileOutputStream0.close();
      baseNCodecOutputStream0.write(byteArray0, 0, 1);
      try { 
        baseNCodecOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, (BaseNCodec) null, false);
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
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">TwDxubQc-IU9", "dgh/@3a;");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32 base32_0 = new Base32((-1935), byteArray0, true, (byte)0, codecPolicy0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base32_0, true);
      baseNCodecOutputStream0.eof();
      assertTrue(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("*");
      byte[] byteArray0 = new byte[4];
      Base64 base64_0 = new Base64(16, byteArray0);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockFileOutputStream0, base64_0, true);
      byte[] byteArray1 = Base64.decodeBase64("");
      baseNCodecOutputStream0.write(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Base64 base64_0 = new Base64();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base64_0, false);
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, 0, 64);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3661);
      Base64 base64_0 = new Base64();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(byteArrayOutputStream0, base64_0, true);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, 64, 3661);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("G,$aup_uOW", "G,$aup_uOW");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Base64 base64_0 = new Base64(false);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base64_0, false);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, 76, (int) (byte) (-83));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Is'u72Z5qg_i/f@P");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      Base32 base32_0 = new Base32(6338);
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(mockPrintStream0, base32_0, false);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        baseNCodecOutputStream0.write(byteArray0, (int) (byte) (-41), (int) (byte)1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.BaseNCodecOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, false);
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)107;
      baseNCodecOutputStream0.write(byteArray0);
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
  public void test16()  throws Throwable  {
      Base32 base32_0 = new Base32();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base32_0, false);
      boolean boolean0 = baseNCodecOutputStream0.isStrictDecoding();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3661);
      Base64 base64_0 = new Base64();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(byteArrayOutputStream0, base64_0, true);
      baseNCodecOutputStream0.close();
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3661);
      Base64 base64_0 = new Base64();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream(byteArrayOutputStream0, base64_0, true);
      baseNCodecOutputStream0.write(3661);
      assertFalse(baseNCodecOutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Base16 base16_0 = new Base16();
      BaseNCodecOutputStream baseNCodecOutputStream0 = new BaseNCodecOutputStream((OutputStream) null, base16_0, false);
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
}
