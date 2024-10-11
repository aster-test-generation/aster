
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


package org.apache.commons.compress.compressors.snappy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.Locale;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SnappyCompressorOutputStream_ESTest extends SnappyCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("VYp1:(NCj");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-44L));
      byte[] byteArray0 = new byte[4];
      snappyCompressorOutputStream0.write(byteArray0, (int) (byte)0, (-1794));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream$1");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0L);
      snappyCompressorOutputStream0.write((-2869));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = MockFile.createTempFile("t.XV_ayfN#", "_|HLUt~g`$U=w9P");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, 127L, 1024);
      assertEquals(1L, file0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = SnappyCompressorOutputStream.createParameterBuilder(1024);
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("y");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, 32768, parameters0);
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write((byte[]) null, 8, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = MockFile.createTempFile("yi^3HN", "@Y19:MniArc&X");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 3680L, parameters0);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(byteArray0, 90, 90);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 172L, parameters0);
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        SnappyCompressorOutputStream.createParameterBuilder(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 964L, (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(2146435583).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, (-1155L), parameters0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, (-1844L), parameters0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 0L, (-1030));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, (-2269L), 8);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 2879L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(547);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 0L, parameters0);
      SnappyCompressorOutputStream snappyCompressorOutputStream1 = null;
      try {
        snappyCompressorOutputStream1 = new SnappyCompressorOutputStream(snappyCompressorOutputStream0, (-1L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, 1L);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream$1");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0L);
      snappyCompressorOutputStream0.close();
      snappyCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0);
      snappyCompressorOutputStream0.finish();
      assertEquals("\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("?%5-i");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(1833, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 380L, parameters0);
      // Undeclared exception!
      snappyCompressorOutputStream0.write(1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(snappyCompressorOutputStream0);
      Locale locale0 = new Locale("H>KYhv|", "H>KYhv|", "H>KYhv|");
      mockPrintStream1.format(locale0, "org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream$1", (Object[]) null);
      assertEquals(48, byteArrayOutputStream0.size());
      assertEquals("\u0000Dorg.apache.commons\u0001\b\fpres\u0019\t,ors.snappy.S\u0005\u0007\u0000C\u0015\u0019", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(snappyCompressorOutputStream0);
      Locale locale0 = new Locale("H>KYhv|", "H>KYhv|", "H>KYhv|");
      mockPrintStream1.println("Aw8xokWG,$1=}N");
      mockPrintStream1.format(locale0, "Aw8xokWG,$1=}N", (Object[]) null);
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\u00008Aw8xokWG,$1=}N\n6\u000F\u0000", byteArrayOutputStream0.toString());
  }
}
