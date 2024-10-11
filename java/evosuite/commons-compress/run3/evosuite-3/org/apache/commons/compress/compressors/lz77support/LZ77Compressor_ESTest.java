
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


package org.apache.commons.compress.compressors.lz77support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LZ77Compressor_ESTest extends LZ77Compressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(32).when(parameters0).getLazyMatchingThreshold();
      doReturn(90, 32768, 20, 1, 1533).when(parameters0).getMaxBackReferenceLength();
      doReturn(1533, 32, 39, 32768, 39).when(parameters0).getMaxCandidates();
      doReturn(2, 22, 1533, 33, 10).when(parameters0).getMaxOffset();
      doReturn((-1011), 33, 20, (-1011), 10).when(parameters0).getMinBackReferenceLength();
      doReturn((-1011), (-1011), (-1620), (-2243), (-1011)).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      lZ77Compressor0.finish();
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = LZ77Compressor.Block.BlockType.EOD;
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(516, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(2, 2).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)17;
      byteArray0[1] = (byte) (-48);
      byteArray0[2] = (byte)11;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)87;
      byteArray0[5] = (byte)104;
      byteArray0[6] = (byte)104;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte) (-123);
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false).when(parameters0).getLazyMatching();
      doReturn((-1011), 32, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(32, (-1)).when(parameters0).getMaxBackReferenceLength();
      doReturn(32, (-384)).when(parameters0).getMaxCandidates();
      doReturn(32771, 32, 32, 8).when(parameters0).getMaxOffset();
      doReturn((-1011), 0, 2443, 32768, 32).when(parameters0).getMinBackReferenceLength();
      doReturn(8, 9).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5, 3).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      lZ77Compressor0.compress(byteArray0);
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.getLength();
      lZ77Compressor_BackReference0.getType();
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte)0;
      byteArray2[3] = (byte)0;
      lZ77Compressor0.compress(byteArray2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(parameters0).getLazyMatching();
      doReturn(610, 32).when(parameters0).getLazyMatchingThreshold();
      doReturn(32768, 2, 2, 3365).when(parameters0).getMaxBackReferenceLength();
      doReturn(255, 5, 3, 214).when(parameters0).getMaxCandidates();
      doReturn((-2601), 210, 3373, 5, 1).when(parameters0).getMaxOffset();
      doReturn((-1011), 510, 880, (-1), 4120).when(parameters0).getMinBackReferenceLength();
      doReturn(32, 1, 3371, 255).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5, 200).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      lZ77Compressor0.compress(byteArray0);
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.getLength();
      lZ77Compressor_BackReference0.getType();
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte)0;
      byteArray2[3] = (byte)0;
      lZ77Compressor0.compress(byteArray2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-2900);
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, (-2900));
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(13, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(13, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)88;
      lZ77Compressor_BackReference0.toString();
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)8;
      byteArray0[3] = (byte)36;
      byte byte0 = (byte)0;
      lZ77Compressor0.finish();
      byteArray0[4] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(4166).when(parameters0).getMinBackReferenceLength();
      doReturn(4166, 3026, 3026).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte) (-72);
      byteArray0[2] = (byte) (-8);
      byteArray0[3] = (byte) (-48);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)2;
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0, (int) (byte) (-8), 0);
      lZ77Compressor0.compress(byteArray0, 0, (int) (byte)2);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)97;
      byteArray0[8] = (byte)88;
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(482, 482, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-36);
      byteArray1[1] = (byte) (-109);
      byteArray1[2] = (byte)16;
      lZ77Compressor0.compress(byteArray1);
      byteArray0[0] = (byte)61;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)110;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 1263, 482);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(289, 289).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      lZ77Compressor0.prefill(byteArray0);
      byteArray0[1] = (byte) (-113);
      byteArray0[2] = (byte)81;
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(32).when(parameters0).getLazyMatchingThreshold();
      doReturn(90, 32768, 20, 1, 1533).when(parameters0).getMaxBackReferenceLength();
      doReturn(1533, 32, 39, 32768, 39).when(parameters0).getMaxCandidates();
      doReturn(2, 22, 1533, 39, 10).when(parameters0).getMaxOffset();
      doReturn((-1011), 39, 20, (-1011), 10).when(parameters0).getMinBackReferenceLength();
      doReturn((-1011), (-1011), (-1620), (-2243), (-1011)).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)0;
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(5).when(parameters0).getLazyMatchingThreshold();
      doReturn(5, 32).when(parameters0).getMaxBackReferenceLength();
      doReturn((-3148), (-1)).when(parameters0).getMaxCandidates();
      doReturn(1, (-1041), (-1668), 1, (-1011)).when(parameters0).getMaxOffset();
      doReturn((-1011), (-1), 91).when(parameters0).getMinBackReferenceLength();
      doReturn(9, 32).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)0;
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)100;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 191, (byte)100);
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(255).when(parameters0).getMinBackReferenceLength();
      doReturn(2987, 998).when(parameters0).getWindowSize();
      lZ77Compressor_LiteralBlock0.toString();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      lZ77Compressor_LiteralBlock0.toString();
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0);
      lZ77Compressor_LiteralBlock0.getType();
      lZ77Compressor_LiteralBlock0.toString();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)100, 384);
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getLength();
      lZ77Compressor0.finish();
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getType();
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.getLength();
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((-1011), 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      lZ77Compressor0.compress(byteArray0);
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.getLength();
      lZ77Compressor_BackReference0.getType();
      byte[] byteArray2 = new byte[4];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte)0;
      byteArray2[3] = (byte)0;
      lZ77Compressor0.compress(byteArray2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32).when(parameters0).getMinBackReferenceLength();
      doReturn(2029, 32, 259, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-63);
      lZ77Compressor0.prefill(byteArray0);
      byteArray0[1] = (byte) (-14);
      lZ77Compressor0.compress(byteArray0);
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0, 0, (-1711));
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(3, (-2879)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)31;
      byteArray0[0] = (byte)31;
      byte byte1 = (byte)122;
      byteArray0[1] = (byte)122;
      byteArray0[2] = (byte) (-88);
      byte byte2 = (byte)0;
      byteArray0[3] = (byte)0;
      byte byte3 = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)33;
      byteArray0[6] = (byte)0;
      byte byte4 = (byte)72;
      byteArray0[7] = (byte)72;
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(7, 32767, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = null;
      // Undeclared exception!
      lZ77Compressor0.compress((byte[]) null, 256, 256);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(2391, 2391).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)80;
      byteArray0[1] = (byte) (-35);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)8;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, (int) (byte) (-35), 1042);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LZ77Compressor.Block.BlockType.values();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32768, 32768).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-21);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-118);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)12;
      byteArray0[6] = (byte)0;
      byteArray0[8] = (byte)0;
      lZ77Compressor0.prefill(byteArray0);
      byte[] byteArray1 = null;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = null;
      try {
        lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LZ77Compressor.Block.BlockType.values();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-21);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-118);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)12;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte) (-92);
      lZ77Compressor0.prefill(byteArray0);
      byte[] byteArray1 = null;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 8, (-956));
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(8, (-956));
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getOffset();
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-956), 8);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.compress(byteArray0);
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      lZ77Compressor_EOD0.getType();
      lZ77Compressor_BackReference0.toString();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LZ77Compressor.Block.BlockType.values();
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 3, 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)25;
      byteArray0[1] = (byte)119;
      byteArray0[2] = (byte)80;
      byteArray0[3] = (byte)103;
      byteArray0[4] = (byte) (-110);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)81;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (-3185), (byte)80);
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      lZ77Compressor_EOD0.getType();
      lZ77Compressor_LiteralBlock0.toString();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1530, 0);
      lZ77Compressor_BackReference0.getLength();
      lZ77Compressor_BackReference0.getLength();
      lZ77Compressor_LiteralBlock0.getLength();
      LZ77Compressor.Block.BlockType.values();
      lZ77Compressor_EOD0.getType();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.compress(byteArray0, (-81), 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      lZ77Compressor_EOD0.getType();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-22);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-105);
      lZ77Compressor0.compress(byteArray0, 2139, (int) (byte) (-22));
      lZ77Compressor0.finish();
      LZ77Compressor.Block.BlockType.values();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-19);
      byteArray0[4] = (byte)95;
      byteArray0[5] = (byte)126;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, (-1589));
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.getType();
      lZ77Compressor_LiteralBlock0.getData();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, (-971));
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getLength();
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(0, 1229);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 32);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-6);
      byteArray0[1] = (byte) (-33);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-87);
      byteArray0[4] = (byte)88;
      byteArray0[5] = (byte)112;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-49);
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-91);
      byteArray0[1] = (byte)5;
      lZ77Compressor0.finish();
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte)2;
      lZ77Compressor0.prefill(byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = null;
      try {
        lZ77Compressor0 = new LZ77Compressor((Parameters) null, lZ77Compressor_Callback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true).when(parameters0).getLazyMatching();
      doReturn((-1011), 32, 386).when(parameters0).getLazyMatchingThreshold();
      doReturn(32, (-1)).when(parameters0).getMaxBackReferenceLength();
      doReturn(32, (-384)).when(parameters0).getMaxCandidates();
      doReturn(32771, 32, 32, 8).when(parameters0).getMaxOffset();
      doReturn((-1011), 0, 2443, 32768, 32).when(parameters0).getMinBackReferenceLength();
      doReturn(8, 9).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5, 3).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      lZ77Compressor0.compress(byteArray0);
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.getLength();
      lZ77Compressor_BackReference0.getType();
      byte[] byteArray2 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray2[1] = (byte)0;
      byteArray2[2] = (byte)0;
      byteArray2[3] = (byte)0;
      lZ77Compressor0.compress(byteArray2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = (-1235);
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1235), 32);
      lZ77Compressor_BackReference0.toString();
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = LZ77Compressor.Block.BlockType.EOD;
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = null;
      try {
        lZ77Compressor0 = new LZ77Compressor((Parameters) null, lZ77Compressor_Callback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.finish();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(3, (-1733));
      lZ77Compressor_BackReference0.toString();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1500), 425);
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getOffset();
      LZ77Compressor.Block.BlockType.values();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.toString();
      LZ77Compressor.Block.BlockType.values();
      lZ77Compressor0.finish();
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      lZ77Compressor_EOD0.getType();
      lZ77Compressor_BackReference0.getLength();
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock((byte[]) null, 425, (-153));
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_BackReference0.getOffset();
      lZ77Compressor_LiteralBlock0.getOffset();
      lZ77Compressor_EOD0.getType();
      lZ77Compressor_LiteralBlock0.getLength();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_LiteralBlock0.getType();
      lZ77Compressor0.finish();
      lZ77Compressor_BackReference0.getType();
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null, 425, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(385, 2, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(385, 1024, 2, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)114;
      lZ77Compressor0.compress(byteArray0);
      byte byte0 = (byte) (-121);
      byteArray0[1] = (byte)114;
      lZ77Compressor0.compress(byteArray0);
      byte[] byteArray1 = new byte[0];
      lZ77Compressor0.compress(byteArray1);
      lZ77Compressor0.finish();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-180), 2684);
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)52;
      byteArray0[1] = (byte) (-106);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-110);
      byteArray0[4] = (byte) (-69);
      byteArray0[5] = (byte) (-67);
      byteArray0[6] = (byte)62;
      byteArray0[7] = (byte) (-1);
      byteArray0[8] = (byte)3;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 768, (byte) (-67));
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.getOffset();
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 768 with length -67", string0);
      
      lZ77Compressor_LiteralBlock0.getType();
      int int0 = lZ77Compressor_LiteralBlock0.getOffset();
      assertEquals(768, int0);
      
      lZ77Compressor_LiteralBlock0.getType();
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)62, (byte) (-106));
      int int1 = lZ77Compressor_BackReference0.getLength();
      assertEquals((-106), int1);
      assertEquals(62, lZ77Compressor_BackReference0.getOffset());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1205, 1933);
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-15);
      byteArray0[1] = (byte)6;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)16;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)3;
      byteArray0[8] = (byte)72;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)3, (byte)16);
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.getData();
      LZ77Compressor.BackReference lZ77Compressor_BackReference1 = new LZ77Compressor.BackReference(1205, 1100);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = null;
      try {
        lZ77Compressor0 = new LZ77Compressor(parameters0, (LZ77Compressor.Callback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // callback
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(32, 5);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(32).when(parameters0).getLazyMatchingThreshold();
      doReturn(90, 32768, 20, 1, 1533).when(parameters0).getMaxBackReferenceLength();
      doReturn(1533, 32, 39, 32768, 39).when(parameters0).getMaxCandidates();
      doReturn(2, 22, 1533, 39, 10).when(parameters0).getMaxOffset();
      doReturn((-1011), 39, 20, (-1011), 10).when(parameters0).getMinBackReferenceLength();
      doReturn((-1011), (-1011), (-1620), (-2243), (-1011)).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 5, 5).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      byteArray0[0] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }
}
