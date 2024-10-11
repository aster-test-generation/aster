
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.Locale;
import org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BlockLZ4CompressorOutputStream_ESTest extends BlockLZ4CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32768, 81);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(13, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000F\u0000\uFFFD>", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("AeDM@@E", "AeDM@@E");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[9];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, (byte)0, (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-365), 81);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(10, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000F", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[15];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(17, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      byteArrayOutputStream0.write(byteArray0);
      byteArray0[2] = (byte)1;
      blockLZ4CompressorOutputStream0.write(byteArray0);
      byteArrayOutputStream0.writeTo(blockLZ4CompressorOutputStream0);
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte)125);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      assertEquals(23, byteArrayOutputStream0.size());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000@\u0000\u0000\u0001\u0000\u0001\u0000\u0004\u0001\u0000*\uFFFDn\u0010\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[23];
      byteArray0[2] = (byte)1;
      blockLZ4CompressorOutputStream0.write(byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(blockLZ4CompressorOutputStream0);
      Locale locale0 = Locale.JAPAN;
      Object[] objectArray0 = new Object[5];
      mockPrintStream0.printf(locale0, "org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$1", objectArray0);
      assertEquals(37, byteArrayOutputStream0.size());
      assertEquals("O\u0000\u0000\u0001\u0000\u0001\u0000\u0000\uFFFD\u0003org.apache.commons\b\u0000Fpres\t\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(4);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[9];
      blockLZ4CompressorOutputStream0.write(byteArray0, (-5226), (int) (byte)0);
      assertEquals(9, byteArray0.length);
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
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.canBeWritten((-449));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.close();
      assertEquals(9, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = BlockLZ4CompressorOutputStream.createParameterBuilder();
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("bSk{i/~SaS'");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((byte[]) null, 0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("p?j5r'NZgC");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(objectOutputStream0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0, 12, (int) (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream$1", true);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn((int)(byte)113, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", true);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill((byte[]) null, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, 3, 2537);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, 3, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("|o");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
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
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".Cr*");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
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
  public void test21()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("r");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 32768);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(bufferedOutputStream0, parameters0);
      try { 
        blockLZ4CompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0, (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-1252)).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0, parameters0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      blockLZ4CompressorOutputStream0.write((-2205));
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
  public void test25()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[9];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 0, (byte)47);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 2887, (-1628));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(2, 2);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      blockLZ4CompressorOutputStream0.write(byteArray0);
      blockLZ4CompressorOutputStream0.finish();
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(9, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-38);
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte)55);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      assertEquals(25, byteArrayOutputStream0.size());
      assertEquals("0\uFFFD(\u0000\u0001\u0000/\uFFFD\u0000\u0001\u0000\u0011\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(byteArrayOutputStream0);
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(291, 2887);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
}
