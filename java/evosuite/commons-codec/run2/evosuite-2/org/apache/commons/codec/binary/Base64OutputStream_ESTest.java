
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
import java.io.PipedOutputStream;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64OutputStream_ESTest extends Base64OutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base64OutputStream base64OutputStream0 = new Base64OutputStream(pipedOutputStream0, false);
      assertFalse(base64OutputStream0.isStrictDecoding());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("XBoA,");
      Base64OutputStream base64OutputStream0 = new Base64OutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)104;
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64OutputStream base64OutputStream1 = null;
      try {
        base64OutputStream1 = new Base64OutputStream(base64OutputStream0, false, (-2900), byteArray0, codecPolicy0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [h\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)55;
      Base64OutputStream base64OutputStream0 = null;
      try {
        base64OutputStream0 = new Base64OutputStream(byteArrayOutputStream0, false, 2670, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lineSeparator must not contain base64 characters: [7\u0000\u0000\u0000\u0000\u0000\u0000]
         //
         verifyException("org.apache.commons.codec.binary.Base64", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[2];
      CodecPolicy codecPolicy0 = CodecPolicy.STRICT;
      Base64OutputStream base64OutputStream0 = new Base64OutputStream(pipedOutputStream0, true, 0, byteArray0, codecPolicy0);
      Base64OutputStream base64OutputStream1 = new Base64OutputStream(base64OutputStream0, false, (-1167), byteArray0);
      assertFalse(base64OutputStream1.equals((Object)base64OutputStream0));
  }
}
