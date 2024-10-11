
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


package org.apache.commons.compress.compressors.gzip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GzipCompressorOutputStream_ESTest extends GzipCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setModificationTime(1315L);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream((OutputStream) null, gzipParameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("x=3(ZE-Tx%x*", "x=3(ZE-Tx%x*");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[1];
      gzipCompressorOutputStream0.write(byteArray0, (int) (byte) (-22), (int) (byte) (-22));
      assertEquals(10L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("iZ{9T'");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write(byteArray0, 252, 328);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("0tD");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("k=zpAqX2eBwGnv(Y");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0);
      gzipCompressorOutputStream0.finish();
      try { 
        gzipCompressorOutputStream0.write((int) (byte) (-126));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.compressors.FileNameUtil", "org.apache.commons.compress.compressors.FileNameUtil");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      mockFileOutputStream0.close();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      try { 
        gzipCompressorOutputStream0.flush();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".!lu|# MQ", ".!lu|# MQ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      mockFile0.setWritable(false, false);
      try { 
        gzipCompressorOutputStream0.finish();
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
      MockFile mockFile0 = new MockFile(".!lu|# MQ", ".!lu|# MQ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      mockFile0.setReadOnly();
      try { 
        gzipCompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setDeflateStrategy(512);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream((OutputStream) null, gzipParameters0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream(pipedOutputStream0, gzipParameters0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(10);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      byteArrayOutputStream0.writeTo(gzipCompressorOutputStream0);
      assertEquals(10, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@]m_szwH$+ZnU R", false);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write((byte[]) null, (-1616), 512);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("pJ@", false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      gzipCompressorOutputStream0.close();
      try { 
        gzipCompressorOutputStream0.write((byte[]) null, (-1), (-1248));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(objectOutputStream0, gzipParameters0);
      gzipCompressorOutputStream0.finish();
      gzipCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@]m_szwH$+ZnU R", false);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel(1);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@]m_szwH$+ZnU R", false);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel(9);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setFileName("J7_Bc9=vv6j!3`Lg");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(objectOutputStream0, gzipParameters0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".!lu|# MQ", ".!lu|# MQ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      byte[] byteArray0 = new byte[4];
      gzipCompressorOutputStream0.write(byteArray0, 0, (int) (byte)0);
      assertEquals(10L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(objectOutputStream0, gzipParameters0);
      gzipCompressorOutputStream0.close();
      byte[] byteArray0 = new byte[0];
      try { 
        gzipCompressorOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@]m_szwH$+ZnU R", false);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setComment("@]m_szwH$+ZnU R");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@]m_szwH$+ZnU R", false);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
      gzipCompressorOutputStream0.close();
      gzipCompressorOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("k=zpAqX2eBwGnv(Y");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0);
      gzipCompressorOutputStream0.flush();
      assertEquals(10L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("k=zpAqX2eBwGnv(Y");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0);
      byte[] byteArray0 = new byte[7];
      gzipCompressorOutputStream0.write(byteArray0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("k=zpAqX2eBwGnv(Y");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0);
      gzipCompressorOutputStream0.write((int) (byte) (-126));
  }
}
