
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
import java.io.FilterOutputStream;
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
      MockPrintStream mockPrintStream0 = new MockPrintStream("!%rd\u0007Q~%<KKr7EMP");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0L, 256);
      byte[] byteArray0 = new byte[14];
      byteArray0[1] = (byte)89;
      snappyCompressorOutputStream0.write(byteArray0);
      assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("A+Mp;TykhoB;p)&}`");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-2601L), parameters0);
      byte[] byteArray0 = new byte[8];
      snappyCompressorOutputStream0.write(byteArray0, (int) (byte)0, (-2136));
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = SnappyCompressorOutputStream.createParameterBuilder(32768);
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("g5U{zaa\"K}IL gBp");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 1L, parameters0);
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write((byte[]) null, 3073, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("OcS");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(objectOutputStream0, (-88L));
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        snappyCompressorOutputStream0.write(byteArray0, 1, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("A+Mp;TykhoB;p)&}`");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockFileOutputStream0, (-2601L), parameters0);
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
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SnappyCompressorOutputStream.createParameterBuilder(180);
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
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, 16L, (Parameters) null);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(filterOutputStream0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-2146435582)).when(parameters0).getWindowSize();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 1665L, parameters0);
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
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, 591L, parameters0);
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
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, (-1553L), 128);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 2026L, 1737);
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
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, (-1848L), 1024);
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
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream((OutputStream) null, (-1L));
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
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = null;
      try {
        snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(pipedOutputStream0, (-1260L));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("OcS");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(objectOutputStream0, (-88L));
      snappyCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(byteArrayOutputStream0, 1998L, 65536);
      assertEquals(2, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u000F", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("!%rd\u0007Q~%<KKr7EMP");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0L, 256);
      snappyCompressorOutputStream0.write(256);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(";HfY");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, (-316L));
      snappyCompressorOutputStream0.close();
      snappyCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("!%rd\u0007Q~%<KKr7EMP");
      SnappyCompressorOutputStream snappyCompressorOutputStream0 = new SnappyCompressorOutputStream(mockPrintStream0, 0L, 256);
      byte[] byteArray0 = new byte[8];
      snappyCompressorOutputStream0.write(byteArray0);
      byte[] byteArray1 = new byte[10];
      byteArray1[0] = (byte)27;
      byteArray1[2] = (byte)49;
      byteArray1[5] = (byte)27;
      snappyCompressorOutputStream0.write(byteArray1);
      snappyCompressorOutputStream0.write(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }
}
