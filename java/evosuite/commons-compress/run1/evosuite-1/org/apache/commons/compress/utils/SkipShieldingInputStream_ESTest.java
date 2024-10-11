
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import org.apache.commons.compress.utils.SkipShieldingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SkipShieldingInputStream_ESTest extends SkipShieldingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 2714);
      SkipShieldingInputStream skipShieldingInputStream0 = new SkipShieldingInputStream(byteArrayInputStream0);
      long long0 = skipShieldingInputStream0.skip(1L);
      assertEquals(1, byteArrayInputStream0.available());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, (byte)0);
      SkipShieldingInputStream skipShieldingInputStream0 = new SkipShieldingInputStream(byteArrayInputStream0);
      long long0 = skipShieldingInputStream0.skip(1394L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SkipShieldingInputStream skipShieldingInputStream0 = new SkipShieldingInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        skipShieldingInputStream0.skip(0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (byte)1);
      PipedInputStream pipedInputStream0 = new PipedInputStream(2152);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, pipedInputStream0);
      SkipShieldingInputStream skipShieldingInputStream0 = new SkipShieldingInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        skipShieldingInputStream0.skip(2094L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, (byte)0);
      SkipShieldingInputStream skipShieldingInputStream0 = new SkipShieldingInputStream(byteArrayInputStream0);
      long long0 = skipShieldingInputStream0.skip((-878L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SkipShieldingInputStream skipShieldingInputStream0 = new SkipShieldingInputStream(mockFileInputStream0);
      try { 
        skipShieldingInputStream0.skip(1833L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }
}
