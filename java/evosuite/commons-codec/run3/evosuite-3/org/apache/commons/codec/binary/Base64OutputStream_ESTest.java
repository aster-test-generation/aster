
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
import java.io.File;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64OutputStream_ESTest extends Base64OutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("O8~d,NRrkhk", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 6);
      Base64OutputStream base64OutputStream0 = new Base64OutputStream(bufferedOutputStream0);
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64OutputStream base64OutputStream1 = new Base64OutputStream(base64OutputStream0, false, 6, (byte[]) null, codecPolicy0);
      assertFalse(base64OutputStream1.equals((Object)base64OutputStream0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("f'2i2~*29RYOe", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)81;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base64OutputStream base64OutputStream0 = null;
      try {
        base64OutputStream0 = new Base64OutputStream(mockPrintStream0, false, 457, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [Q\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<JZz@\"M0m", false);
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)118;
      Base64OutputStream base64OutputStream0 = null;
      try {
        base64OutputStream0 = new Base64OutputStream(mockFileOutputStream0, false, 0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [\u0000v\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("O8~d,NRrkhk", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 6);
      Base64OutputStream base64OutputStream0 = new Base64OutputStream(bufferedOutputStream0);
      Base64OutputStream base64OutputStream1 = new Base64OutputStream(base64OutputStream0, false, 34, (byte[]) null);
      assertFalse(base64OutputStream1.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      File file0 = MockFile.createTempFile("f'2i2~*29RYOe", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Base64OutputStream base64OutputStream0 = new Base64OutputStream(mockPrintStream0, false);
      assertFalse(base64OutputStream0.isStrictDecoding());
  }
}
