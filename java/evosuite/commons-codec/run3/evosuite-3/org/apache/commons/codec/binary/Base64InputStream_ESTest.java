
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
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PushbackInputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base64InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64InputStream_ESTest extends Base64InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Base64InputStream base64InputStream0 = new Base64InputStream(byteArrayInputStream0, false);
      assertFalse(base64InputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)102;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64InputStream base64InputStream0 = null;
      try {
        base64InputStream0 = new Base64InputStream((InputStream) null, false, 0, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000\u0000f]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)75;
      Base64InputStream base64InputStream0 = null;
      try {
        base64InputStream0 = new Base64InputStream((InputStream) null, true, 0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [K\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64InputStream base64InputStream0 = new Base64InputStream((InputStream) null, false, 0, byteArray0, codecPolicy0);
      assertFalse(base64InputStream0.markSupported());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Base64InputStream base64InputStream0 = new Base64InputStream(mockFileInputStream0);
      assertEquals(1, base64InputStream0.available());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      byte[] byteArray0 = new byte[2];
      Base64InputStream base64InputStream0 = new Base64InputStream(pushbackInputStream0, false, (-2102), byteArray0);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64InputStream base64InputStream1 = new Base64InputStream(base64InputStream0, false, (-1393), byteArray0, codecPolicy0);
      assertEquals(1, base64InputStream1.available());
  }
}
