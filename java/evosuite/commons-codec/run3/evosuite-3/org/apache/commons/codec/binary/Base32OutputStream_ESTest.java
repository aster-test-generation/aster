
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base32OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base32OutputStream_ESTest extends Base32OutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("UWV(v!<4Waf", "~5U#&xovv$9lna[", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockFileOutputStream0, true);
      assertFalse(base32OutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("y2c<", "y2c<");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)61;
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32OutputStream base32OutputStream1 = null;
      try {
        base32OutputStream1 = new Base32OutputStream(base32OutputStream0, false, 3191, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [\u0000\u0000\u0000=]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("h4ZtT#,Fu");
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)72;
      Base32OutputStream base32OutputStream0 = null;
      try {
        base32OutputStream0 = new Base32OutputStream(mockPrintStream0, false, 65, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [H\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = MockFile.createTempFile("UWV(v!<4Waf", "~5U#&xovv$9lna[", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      byte[] byteArray0 = new byte[0];
      CodecPolicy codecPolicy0 = CodecPolicy.LENIENT;
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockFileOutputStream0, true, 0, byteArray0, codecPolicy0);
      Base32OutputStream base32OutputStream1 = new Base32OutputStream(base32OutputStream0);
      assertFalse(base32OutputStream1.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(939);
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(byteArrayOutputStream0, false, (-1), (byte[]) null);
      Base32OutputStream base32OutputStream1 = new Base32OutputStream(base32OutputStream0, false);
      assertFalse(base32OutputStream1.equals((Object)base32OutputStream0));
  }
}
