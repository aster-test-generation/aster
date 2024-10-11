
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
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
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
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)104);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (byte)0, (-622L));
      try { 
        checksumVerifyingInputStream0.skip(4316L);
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
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, (-1L), 1L);
      byte[] byteArray0 = new byte[4];
      try { 
        checksumVerifyingInputStream0.read(byteArray0, 0, 2329);
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
      File file0 = MockFile.createTempFile("6H|ym-S~#0rTf", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, 0L, (-3296L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
      assertEquals(0L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-101);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, bufferedInputStream0, (byte)33, (byte) (-26));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(155, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-2492));
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, 2098L, 0L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(2098L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, (InputStream) null, (-1542L), (byte) (-37));
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals((-1542L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, (InputStream) null, 0L, 0L);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte)0, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CheckedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, pipedInputStream0, 0L, (-1150L));
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte)0, (int) (byte) (-39));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      File file0 = MockFile.createTempFile("6H|ym-S~#0rTf", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, 0L, (-3296L));
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (-132), (-1477));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Adler32", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 1L, (-913L));
      try { 
        checksumVerifyingInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 0L, 0L);
      byte[] byteArray0 = new byte[0];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, 0, (-1165));
      assertEquals(0L, checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      File file0 = MockFile.createTempFile("PASt~}-", "PASt~}-");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, mockFileInputStream0, 0L, 0L);
      byte[] byteArray0 = new byte[9];
      try { 
        checksumVerifyingInputStream0.read(byteArray0, 0, (int) (byte) (-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, bufferedInputStream0, (byte)33, (byte) (-26));
      int int0 = checksumVerifyingInputStream0.read(byteArray0, 0, 0);
      assertEquals(33L, checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, bufferedInputStream0, (byte)33, (byte) (-26));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 3645L, (-1L));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(3645L, checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, (InputStream) null, (-1542L), (byte) (-37));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1542L), checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, (InputStream) null, 427L, 0L);
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
  public void test17()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, (InputStream) null, 0L, 0L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(0L, long0);
  }
}
