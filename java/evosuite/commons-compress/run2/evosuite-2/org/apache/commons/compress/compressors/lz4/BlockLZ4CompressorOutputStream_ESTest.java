
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
import java.io.File;
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
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BlockLZ4CompressorOutputStream_ESTest extends BlockLZ4CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", false);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(1593).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      byte[] byteArray0 = new byte[1];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 872, (-1));
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      String string0 = ",Ik6)&VRm[\\u";
      MockFile mockFile0 = new MockFile(string0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(1024);
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32768, 32768);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream0.finish();
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
      assertEquals(298L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to find a block containing offset ");
      byte[] byteArray0 = new byte[3];
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 4178);
      blockLZ4CompressorOutputStream_Pair0.addLiteral(lZ77Compressor_LiteralBlock0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-2413), 181);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.hasBackReference();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      int int0 = blockLZ4CompressorOutputStream_Pair0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      boolean boolean0 = blockLZ4CompressorOutputStream_Pair0.canBeWritten(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = BlockLZ4CompressorOutputStream.createParameterBuilder();
      assertNotNull(parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((byte[]) null, 0, 1733);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(byteArray0, (int) (byte) (-1), 3755);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", false);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(872, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(872, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((int) (byte) (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", false);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write((int) (byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = MockFile.createTempFile("Failed to find a block containing offset ", "LoX|bM9u|");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill((byte[]) null, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", false);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(1593).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, parameters0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.prefill(byteArray0, 872, 4806);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
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
  public void test14()  throws Throwable  {
      String string0 = ",Ik6)&VRm[\\u";
      MockFile mockFile0 = new MockFile(string0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(1024);
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(pipedOutputStream0);
      blockLZ4CompressorOutputStream0.write(611);
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
  public void test17()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", true);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = null;
      try {
        blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0, (Parameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-987)).when(parameters0).getWindowSize();
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
  public void test19()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to find a block containing offset ");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(parameters0).getLazyMatching();
      doReturn(4405, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(32767).when(parameters0).getMaxBackReferenceLength();
      doReturn(29689).when(parameters0).getMaxCandidates();
      doReturn(29689, (-999)).when(parameters0).getMaxOffset();
      doReturn(32768, (-999), 2621).when(parameters0).getMinBackReferenceLength();
      doReturn(4).when(parameters0).getNiceBackReferenceLength();
      doReturn(4405, 4405, 4405, 2621).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      byte[] byteArray0 = new byte[0];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 0, 2192);
      blockLZ4CompressorOutputStream0.write(2468);
      blockLZ4CompressorOutputStream0.finish();
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      blockLZ4CompressorOutputStream_Pair0.writeTo(blockLZ4CompressorOutputStream0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to find a block containing offset ");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(4405).when(parameters0).getLazyMatchingThreshold();
      doReturn(4405, (-1496)).when(parameters0).getMaxBackReferenceLength();
      doReturn(4178, 164).when(parameters0).getMaxCandidates();
      doReturn(4405, 2194, (-444)).when(parameters0).getMaxOffset();
      doReturn((-444), (-1496), 4405).when(parameters0).getMinBackReferenceLength();
      doReturn((-300), (-1496)).when(parameters0).getNiceBackReferenceLength();
      doReturn(4405, 4405, 4405).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      byte[] byteArray0 = new byte[0];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 0, 2192);
      blockLZ4CompressorOutputStream0.write(0);
      blockLZ4CompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 12);
      blockLZ4CompressorOutputStream_Pair0.setBackReference(lZ77Compressor_BackReference0);
      MockFile mockFile0 = new MockFile("r*(=Hr),N$!_}kjBnB", "LITERAL");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      blockLZ4CompressorOutputStream_Pair0.writeTo(mockPrintStream0);
      assertEquals(1L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = ",Ik6)&VRm[\\u";
      MockFile mockFile0 = new MockFile(string0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[2];
      blockLZ4CompressorOutputStream0.write(byteArray0, 256, (-4));
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to find a block containing offset ");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(4405).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      byte[] byteArray0 = new byte[0];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, (-1745), 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to find a block containing offset ");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32768).when(parameters0).getMinBackReferenceLength();
      doReturn(4405, 4405).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      blockLZ4CompressorOutputStream0.write(4405);
      blockLZ4CompressorOutputStream0.finish();
      blockLZ4CompressorOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to find a block containing offset ");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(15).when(parameters0).getLazyMatchingThreshold();
      doReturn(32, 12).when(parameters0).getMaxBackReferenceLength();
      doReturn(15, 4405).when(parameters0).getMaxCandidates();
      doReturn(4657).when(parameters0).getMaxLiteralLength();
      doReturn((-1207), 32, (-1207), 32, 5).when(parameters0).getMaxOffset();
      doReturn((-2033), (-2581), 1593).when(parameters0).getMinBackReferenceLength();
      doReturn(15, 1024).when(parameters0).getNiceBackReferenceLength();
      doReturn(4405, 4405, 4405).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
      byte[] byteArray0 = new byte[0];
      blockLZ4CompressorOutputStream0.prefill(byteArray0, 0, 2192);
      // Undeclared exception!
      try { 
        blockLZ4CompressorOutputStream0.write(2468);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Failed to find a block containing offset 2194
         //
         verifyException("org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlockLZ4CompressorOutputStream.Pair blockLZ4CompressorOutputStream_Pair0 = new BlockLZ4CompressorOutputStream.Pair();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(256, 1);
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
  public void test27()  throws Throwable  {
      String string0 = ",Ik6)&VRm[\\u";
      MockFile mockFile0 = new MockFile(string0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockFileOutputStream0);
      blockLZ4CompressorOutputStream0.write(1024);
      blockLZ4CompressorOutputStream0.finish();
      blockLZ4CompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("Failed to find a block containing offset ");
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(4405).when(parameters0).getWindowSize();
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream(mockPrintStream0, parameters0);
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
  public void test29()  throws Throwable  {
      BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream0 = new BlockLZ4CompressorOutputStream((OutputStream) null);
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
}
