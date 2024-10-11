
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
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
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
      File file0 = MockFile.createTempFile("?T+=DG&}", "?T+=DG&}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[7];
      countingOutputStream0.write(byteArray0);
      assertEquals(7L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("8\"+T");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      countingOutputStream0.count((-459L));
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals((-459L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, (int) (byte)0, 2074);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(473);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(filterOutputStream0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, 4455, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 3168);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(bufferedOutputStream0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        countingOutputStream0.write(byteArray0, 0, (-4406));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[8];
      try { 
        countingOutputStream0.write(byteArray0, (int) (byte)0, (-753));
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
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[2];
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(pipedOutputStream0);
      try { 
        countingOutputStream0.write((int) (byte) (-123));
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
      MockPrintStream mockPrintStream0 = new MockPrintStream("7`vrG=]!S*iT6");
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[7];
      countingOutputStream0.write(byteArray0, (int) (byte)57, (int) (byte)104);
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals(104L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File file0 = MockFile.createTempFile("?T+=DG&}", "?T+=DG&}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      countingOutputStream0.count((-1L));
      assertEquals(0L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = MockFile.createTempFile("?T+=DG&}", "?T+=DG&}");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      CountingOutputStream countingOutputStream0 = new CountingOutputStream(mockFileOutputStream0);
      countingOutputStream0.write((-16));
      assertEquals(1L, countingOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
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
  public void test13()  throws Throwable  {
      CountingOutputStream countingOutputStream0 = new CountingOutputStream((OutputStream) null);
      long long0 = countingOutputStream0.getBytesWritten();
      assertEquals(0L, long0);
  }
}
