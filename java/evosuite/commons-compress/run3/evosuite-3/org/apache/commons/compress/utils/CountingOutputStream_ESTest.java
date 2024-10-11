
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.utils.CountingOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CountingOutputStream_ESTest extends CountingOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("L6#h:_2Cc");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      countingOutputStream0.write(0);
      assertEquals(1L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("d-_~CI?&psDPEzX+L", "]I,$");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      countingOutputStream0.count((-5429));
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals((-5429L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, 0, (int) (byte) (-119));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(objectOutputStream0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, (int) (byte) (-42), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 365);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(dataOutputStream0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, (-368), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.utils.CountingOutputStream", "Z8'|HWT![");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[1];
      try { 
        countingOutputStream0.write(byteArray0, (int) (byte) (-106), (int) (byte) (-106));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[9];
      try { 
        countingOutputStream0.write(byteArray0);
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
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(pipedOutputStream0);
      try { 
        countingOutputStream0.write((int) (byte)61);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("L6#h:_2Cc");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      countingOutputStream0.write(byteArray0, 4143, (-1));
      assertEquals(0L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        countingOutputStream0.write(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[5];
      countingOutputStream0.write(byteArray0);
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals(5, byteArrayOutputStream0.size());
      assertEquals(5L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(byteArrayOutputStream0);
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals(0L, long0);
  }
}
