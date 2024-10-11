
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


package org.apache.commons.compress.compressors.lz4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BlockLZ4CompressorOutputStream_ESTest extends BlockLZ4CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "Failed to find a block containing offset ");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[0];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 145, (-1226));
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.write((int) (byte)22);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte) (-55), (byte) (-55));
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.canBeWritten((byte) (-82));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[20];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      byteArray0[15] = (byte)22;
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[20];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[6];
      blockLZ4CompressorOutputStream0.write(byteArray0, 0, (int) (byte) (-1));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      int int0 = blockLZ4CompressorOutputStream_Pair0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.hasBackReference();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = BlockLZ4CompressorOutputStream.createParameterBuilder();
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((byte[]) null, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, parameters0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0, 3, (int) (byte)5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("4=lF-es");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(16, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(2300);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((-4936));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(128);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill((byte[]) null, 128, 128);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, 2, (byte)22);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, (byte) (-102), 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("l", true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write((-1));
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("l");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null, (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("4=lF-es");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-1628)).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("4=l-es");
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(881, 881);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, false).when(parameters0).getLazyMatching();
      doReturn(16, 65535, (-2306), 65535).when(parameters0).getLazyMatchingThreshold();
      doReturn(65535, 19, 5, (-2174), 3168).when(parameters0).getMinBackReferenceLength();
      doReturn(16, 16, 1255, 3168, 458).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      blockLZ4CompressorOutputStream0.prefill((byte[]) null, 124, 0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("l", true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(2488);
      blockLZ4CompressorOutputStream0.close();
      blockLZ4CompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.write(3570);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      byte[] byteArray0 = new byte[4];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, 770);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      blockLZ4CompressorOutputStream_Pair0.writeTo(byteArrayOutputStream0);
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(774, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(10, 19);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("4=l-es");
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(881, 881);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, true, false, false).when(parameters0).getLazyMatching();
      doReturn(12, 4, (-223), 24, 1684).when(parameters0).getLazyMatchingThreshold();
      doReturn(881, 2570).when(parameters0).getMaxBackReferenceLength();
      doReturn(2570, 2054).when(parameters0).getMaxCandidates();
      doReturn(737, (-584), (-223)).when(parameters0).getMaxOffset();
      doReturn(25, 18, (-1), (-584), 32768).when(parameters0).getMinBackReferenceLength();
      doReturn(3, (-584)).when(parameters0).getNiceBackReferenceLength();
      doReturn(16, 16, 19, 2045, 2379).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      byte[] byteArray0 = new byte[9];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 3, 256);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      try { 
        blockLZ4CompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.close();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[25];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.finish();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(blockLZ4CompressorOutputStream0);
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        mockPrintStream0.printf("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$Pair", e);
      }
  }
}
