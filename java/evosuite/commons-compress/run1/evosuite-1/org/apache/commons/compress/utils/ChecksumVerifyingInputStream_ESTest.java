
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
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import org.apache.commons.compress.utils.ChecksumVerifyingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChecksumVerifyingInputStream_ESTest extends ChecksumVerifyingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[18];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (-2166L), (byte)1);
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte)1, (int) (byte)1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (byte)0, 0L);
      try { 
        checksumVerifyingInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, bufferedInputStream0, 0L, 0L);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[18];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, 2230L, (byte)1);
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (int) (byte)1, (int) (byte)1);
      assertEquals(17, byteArrayInputStream0.available());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-107);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 1322L, (-1453L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals(149, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, pipedInputStream0, 0L, (-1L));
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (-2749L), 0L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals((-2749L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      File file0 = MockFile.createTempFile("A\"gYJbcO", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, (-1L), 1L);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read((byte[]) null, 1, 2100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (-1083L), 922L);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte)62, (-3345));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      MockFile mockFile0 = new MockFile("c_`^$LCb*6");
      File file0 = MockFile.createTempFile("c_`^$LCb*6", "c_`^$LCb*6", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, 0L, 0L);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (-588), (int) (byte) (-58));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, (InputStream) null, 64L, 509L);
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CheckedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 1);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 1L, (-2080L));
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, mockFileInputStream0, 281L, 0L);
      try { 
        checksumVerifyingInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 0L, 0L);
      byte[] byteArray0 = new byte[1];
      int int0 = checksumVerifyingInputStream0.read(byteArray0);
      assertEquals((-1), int0);
      assertEquals(0L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, mockFileInputStream0, 281L, 0L);
      byte[] byteArray0 = new byte[0];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, 0, (-1038));
      assertEquals(0, int0);
      assertEquals(281L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 0L, 0L);
      byte[] byteArray0 = new byte[1];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, 3168L, 3168L);
      byte[] byteArray0 = new byte[9];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (int) (byte)4, (int) (byte)4);
      assertEquals((-1), int0);
      assertEquals(3168L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 1322L, (-1453L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (-2749L), 0L);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-2749L), checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, 3168L, 3168L);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
      assertEquals(3168L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, 3168L, 3168L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(3168L, long0);
  }
}
