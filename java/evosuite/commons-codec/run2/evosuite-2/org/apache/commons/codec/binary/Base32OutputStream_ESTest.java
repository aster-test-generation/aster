
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
import java.io.OutputStream;
import java.io.PipedOutputStream;
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
      MockFile mockFile0 = new MockFile("J(F");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)86;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32OutputStream base32OutputStream1 = null;
      try {
        base32OutputStream1 = new Base32OutputStream(base32OutputStream0, true, 1, byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [V\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)78;
      Base32OutputStream base32OutputStream0 = null;
      try {
        base32OutputStream0 = new Base32OutputStream(pipedOutputStream0, false, 1858, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain Base32 characters: [N\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base32", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.codec.binary.Base32OutputStream");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockFileOutputStream0, true);
      assertFalse(base32OutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base32OutputStream base32OutputStream0 = new Base32OutputStream((OutputStream) null, false, (-993), byteArray0, codecPolicy0);
      assertTrue(base32OutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.codec.binary.Base32OutputStream");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      byte[] byteArray0 = new byte[4];
      Base32OutputStream base32OutputStream0 = new Base32OutputStream(mockFileOutputStream0, true, 0, byteArray0);
      Base32OutputStream base32OutputStream1 = new Base32OutputStream(base32OutputStream0);
      assertFalse(base32OutputStream1.equals((Object)base32OutputStream0));
  }
}