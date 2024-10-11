
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
import java.io.File;
import java.io.FilterOutputStream;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GzipCompressorOutputStream_ESTest extends GzipCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9f8/]_z2pJO", true);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setModificationTime(1085L);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0, gzipParameters0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile(".cpio", "J'j");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(filterOutputStream0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/.cpio0J'j");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
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
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(".cpio");
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0, gzipParameters0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write((byte[]) null, 385, 385);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1559);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.write(byteArray0, (int) (byte)2, 512);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("xK'v]TijLWyE");
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0, gzipParameters0);
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
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("rEmv3K.%", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockPrintStream0, gzipParameters0);
      gzipCompressorOutputStream0.close();
      byte[] byteArray0 = new byte[6];
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
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.close();
      try { 
        gzipCompressorOutputStream0.write(434);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = MockFile.createTempFile(".cpio", "J'j");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(filterOutputStream0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/.cpio0J'j");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
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
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setDeflateStrategy(9);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = null;
      try {
        gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      byte[] byteArray0 = new byte[8];
      gzipCompressorOutputStream0.write(byteArray0, 863, (int) (byte) (-82));
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("q{DmD@`?", true);
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[7];
      gzipCompressorOutputStream0.finish();
      try { 
        gzipCompressorOutputStream0.write(byteArray0, 1, (int) (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot write more data, the end of the compressed data stream has been reached
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel(1);
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
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(gzipCompressorOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(objectOutputStream0);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel(9);
      GzipCompressorOutputStream gzipCompressorOutputStream1 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setFileName("Cannot write more data, the end of the compressed data stream has been reached");
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      assertEquals(89, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\b\u0000\u0000\u0000\u0000\u0000\uFFFDCannot write more data, the end of the compressed data stream has been reached\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0, gzipParameters0);
      byte[] byteArray0 = new byte[0];
      gzipCompressorOutputStream0.write(byteArray0);
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(gzipCompressorOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(objectOutputStream0);
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setComment("");
      GzipCompressorOutputStream gzipCompressorOutputStream1 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.close();
      gzipCompressorOutputStream0.finish();
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.close();
      gzipCompressorOutputStream0.close();
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.flush();
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(byteArrayOutputStream0);
      gzipCompressorOutputStream0.write(434);
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      GzipParameters gzipParameters0 = new GzipParameters();
      GzipCompressorOutputStream gzipCompressorOutputStream0 = new GzipCompressorOutputStream(bufferedOutputStream0, gzipParameters0);
      // Undeclared exception!
      try { 
        gzipCompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }
}
