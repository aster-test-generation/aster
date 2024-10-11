
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.InflaterInputStreamWithStatistics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InflaterInputStreamWithStatistics_ESTest extends InflaterInputStreamWithStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(bufferedInputStream0);
      inflaterInputStreamWithStatistics0.fill();
      assertEquals(4L, inflaterInputStreamWithStatistics0.getCompressedCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0, inflater0);
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, (int) (byte)1, 6);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // invalid stored block lengths
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Inflater inflater0 = new Inflater(false);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0, inflater0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, 2930, (-733));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0, inflater0);
      inflaterInputStreamWithStatistics0.close();
      byte[] byteArray0 = new byte[5];
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, 0, (-3098));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile("@}HU?+RgI65<>K.Un", "J<6$splN,", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(mockFileInputStream0, inflater0, 1555);
      byte[] byteArray0 = new byte[2];
      try { 
        inflaterInputStreamWithStatistics0.read(byteArray0, 0, 1);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(bufferedInputStream0);
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // unknown compression method
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (byte)1);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)1);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(bufferedInputStream0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pipedInputStream0);
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(sequenceInputStream0, inflater0);
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(pushbackInputStream0);
      try { 
        inflaterInputStreamWithStatistics0.fill();
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
      byte[] byteArray0 = new byte[13];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)39);
      byteArrayInputStream0.read(byteArray0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      try { 
        inflaterInputStreamWithStatistics0.fill();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics((InputStream) null, inflater0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Inflater inflater0 = new Inflater();
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics((InputStream) null, inflater0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0, inflater0);
      int int0 = inflaterInputStreamWithStatistics0.read(byteArray0, (int) (byte)1, 0);
      assertEquals(0L, inflaterInputStreamWithStatistics0.getUncompressedCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)56;
      byteArray0[1] = (byte) (-53);
      byteArray0[2] = (byte) (-53);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0);
      int int0 = inflaterInputStreamWithStatistics0.read();
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(104, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile("@}HU?+RgI65<>K.Un", "J<6$splN,", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      Inflater inflater0 = new Inflater(true);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(mockFileInputStream0, inflater0, 1555);
      long long0 = inflaterInputStreamWithStatistics0.getCompressedCount();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0);
      long long0 = inflaterInputStreamWithStatistics0.getUncompressedCount();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)9, (byte)9);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(byteArrayInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(inflaterInputStreamWithStatistics0, (byte)108);
      Inflater inflater0 = new Inflater(false);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics1 = null;
      try {
        inflaterInputStreamWithStatistics1 = new InflaterInputStreamWithStatistics(pushbackInputStream0, inflater0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // buffer size <= 0
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Inflater inflater0 = new Inflater(false);
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics(dataInputStream0, inflater0);
      // Undeclared exception!
      try { 
        inflaterInputStreamWithStatistics0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InflaterInputStreamWithStatistics inflaterInputStreamWithStatistics0 = null;
      try {
        inflaterInputStreamWithStatistics0 = new InflaterInputStreamWithStatistics((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.InflaterInputStream", e);
      }
  }
}
