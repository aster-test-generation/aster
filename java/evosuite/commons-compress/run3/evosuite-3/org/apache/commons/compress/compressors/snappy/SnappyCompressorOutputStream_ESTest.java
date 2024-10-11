
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
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
      MockFile mockFile0 = new MockFile("3]FVn26", "3]FVn26");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-1169L));
      byte[] byteArray0 = new byte[4];
      snappyCompressorOutputStream0.write(byteArray0, 440, 0);
      assertEquals(1L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(bufferedOutputStream0, (-3649L), 16);
      snappyCompressorOutputStream0.write(498);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = SnappyCompressorOutputStream.createParameterBuilder(16);
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = MockFile.createTempFile("6B>EGS(", "6B>EGS(");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0L, 8);
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write((byte[]) null, (-1457), 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(737);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 737, parameters0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(byteArray0, (int) (byte)2, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" and length ", true);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-3687L), parameters0);
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write((-986));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SnappyCompressorOutputStream.createParameterBuilder(2002);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, 2678);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(bufferedOutputStream0, 748L, (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("cIbb8hV", "XS&l Fp+U=LV?3jw/");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-2146193867)).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 127L, parameters0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, 0L, parameters0);
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
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 0L, 128);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("h\"<;f }^A8KoKhBSO", false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(dataOutputStream0, 374L, (-47));
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
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 2075L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3]FVn26", "3]FVn26");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-1169L));
      snappyCompressorOutputStream0.close();
      snappyCompressorOutputStream0.finish();
      assertEquals(1L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("~Vv5POwz6F<-K:uU");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 1L);
      snappyCompressorOutputStream0.finish();
      snappyCompressorOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("vDohX");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(93).when(parameters0).getLazyMatchingThreshold();
      doReturn((-2124), (-419)).when(parameters0).getMinBackReferenceLength();
      doReturn(93, 93).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 3418L, parameters0);
      // Undeclared exception!
      snappyCompressorOutputStream0.write(93);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(dataOutputStream0, 1040L, parameters0);
      SnappyCompressorOutputStream snappyCompressorOutputStream1 = null;
      try {
        snappyCompressorOutputStream1 = new SnappyCompressorOutputStream(snappyCompressorOutputStream0, (-1519L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("/$");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(256).when(parameters0).getMinBackReferenceLength();
      doReturn(4, 4).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-549L), parameters0);
      byte[] byteArray0 = new byte[4];
      snappyCompressorOutputStream0.write(byteArray0);
      snappyCompressorOutputStream0.finish();
  }
}
