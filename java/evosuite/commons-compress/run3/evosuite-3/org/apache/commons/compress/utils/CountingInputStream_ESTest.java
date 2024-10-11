
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.utils.CountingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CountingInputStream_ESTest extends CountingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0, (int) (byte)1, (int) (byte)1);
      assertEquals(3, byteArrayInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-102);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read();
      assertEquals(1L, countingInputStream0.getBytesRead());
      assertEquals(154, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.read();
      long long0 = countingInputStream0.getBytesRead();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.count((-1961L));
      long long0 = countingInputStream0.getBytesRead();
      assertEquals((-1961L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        countingInputStream0.read((byte[]) null, (-1857), (-1857));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      CountingInputStream countingInputStream0 = new CountingInputStream(mockFileInputStream0);
      byte[] byteArray0 = new byte[2];
      try { 
        countingInputStream0.read(byteArray0, (int) (byte)4, 1979);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 1107);
      CountingInputStream countingInputStream0 = new CountingInputStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[4];
      countingInputStream0.close();
      try { 
        countingInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        countingInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-26), (byte)1);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        countingInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1781);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      CountingInputStream countingInputStream0 = new CountingInputStream(pushbackInputStream0);
      try { 
        countingInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      CountingInputStream countingInputStream0 = new CountingInputStream(mockFileInputStream0);
      byte[] byteArray0 = new byte[2];
      int int0 = countingInputStream0.read(byteArray0, (int) (byte) (-111), (-418));
      assertEquals(0, int0);
      assertEquals(0L, countingInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      CountingInputStream countingInputStream0 = new CountingInputStream(sequenceInputStream0);
      byte[] byteArray0 = new byte[3];
      int int0 = countingInputStream0.read(byteArray0, (-141), (-2408));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0, 1, (-127));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read(byteArray0, 750, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      int int0 = countingInputStream0.read();
      assertEquals((-1), int0);
      assertEquals(0L, countingInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      countingInputStream0.count((-1L));
      assertEquals(0L, countingInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 0);
      CountingInputStream countingInputStream0 = new CountingInputStream(byteArrayInputStream0);
      long long0 = countingInputStream0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CountingInputStream countingInputStream0 = new CountingInputStream((InputStream) null);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        countingInputStream0.read(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.CountingInputStream", e);
      }
  }
}
