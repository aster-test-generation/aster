
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base32InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base32InputStream_ESTest extends Base32InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(23);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)108;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32InputStream base32InputStream0 = null;
      try {
        base32InputStream0 = new Base32InputStream(pipedInputStream0, true, 23, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000l\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)121;
      Base32InputStream base32InputStream0 = null;
      try {
        base32InputStream0 = new Base32InputStream(bufferedInputStream0, true, 54, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000y]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Base32InputStream base32InputStream0 = new Base32InputStream(bufferedInputStream0, false);
      Base32InputStream base32InputStream1 = new Base32InputStream(base32InputStream0, false, (byte)0, byteArray0);
      assertFalse(base32InputStream1.markSupported());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Base32InputStream base32InputStream0 = new Base32InputStream(bufferedInputStream0, false);
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32InputStream base32InputStream1 = new Base32InputStream(base32InputStream0, true, 0, byteArray0, codecPolicy0);
      assertFalse(base32InputStream1.markSupported());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Base32InputStream base32InputStream0 = new Base32InputStream((InputStream) null);
      assertFalse(base32InputStream0.markSupported());
  }
}
