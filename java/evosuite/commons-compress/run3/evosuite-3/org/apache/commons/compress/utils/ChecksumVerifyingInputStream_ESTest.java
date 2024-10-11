
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
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
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
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, byteArrayInputStream0, (byte)0, 2825L);
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
  public void test01()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, 1L, 924L);
      byte[] byteArray0 = new byte[7];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (int) (byte)96, 1);
      assertEquals((-1), int0);
      assertEquals(1L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (byte) (-63), (byte) (-83));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
      assertEquals((-63L), checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-79);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, dataInputStream0, (byte)77, (byte) (-82));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(7, byteArrayInputStream0.available());
      assertEquals(177, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, (-1561));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, pushbackInputStream0, 1L, (byte)0);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, (InputStream) null, (-871L), (-4703L));
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals((-871L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, (InputStream) null, 0L, 0L);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (-1765), (-1508));
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
      File file0 = MockFile.createTempFile(")/!BsJs2YOF-Hza[>Q", ")/!BsJs2YOF-Hza[>Q");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, mockFileInputStream0, 1755L, 0L);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte)89, (-2127));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream((Checksum) null, (InputStream) null, 1L, 1L);
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
  public void test09()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, 1L, (byte)0);
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
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)5, (byte)107);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, byteArrayInputStream0, (-2068L), (-1558L));
      try { 
        checksumVerifyingInputStream0.skip(580L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 0L, 0L);
      byte[] byteArray0 = new byte[9];
      checksumVerifyingInputStream0.close();
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (-1189), (-1));
      assertEquals((-1), int0);
      assertEquals(0L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 0L, 0L);
      byte[] byteArray0 = new byte[9];
      int int0 = checksumVerifyingInputStream0.read(byteArray0, (int) (byte)59, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, dataInputStream0, (byte)77, (byte) (-82));
      // Undeclared exception!
      try { 
        checksumVerifyingInputStream0.read(byteArray0, (int) (byte) (-82), (int) (byte) (-57));
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
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, dataInputStream0, (byte)77, (byte) (-82));
      dataInputStream0.read(byteArray0);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
      assertEquals(77L, checksumVerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 0L, 0L);
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, dataInputStream0, (byte)77, (byte) (-82));
      int int0 = checksumVerifyingInputStream0.read();
      assertEquals(76L, checksumVerifyingInputStream0.getBytesRemaining());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(cRC32_0, sequenceInputStream0, 0L, 0L);
      long long0 = checksumVerifyingInputStream0.getBytesRemaining();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ChecksumVerifyingInputStream checksumVerifyingInputStream0 = new ChecksumVerifyingInputStream(adler32_0, sequenceInputStream0, (-1L), (-1L));
      byte[] byteArray0 = new byte[1];
      try { 
        checksumVerifyingInputStream0.read(byteArray0, 0, (-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Checksum verification failed
         //
         verifyException("org.apache.commons.compress.utils.ChecksumVerifyingInputStream", e);
      }
  }
}
