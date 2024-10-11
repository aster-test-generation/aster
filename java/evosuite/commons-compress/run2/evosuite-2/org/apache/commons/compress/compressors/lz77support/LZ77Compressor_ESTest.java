
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)88;
      byteArray0[2] = (byte) (-7);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)88, (byte)88);
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(5279, 0).when(parameters0).getMinBackReferenceLength();
      doReturn((int)(byte)0, (int)(byte)0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.finish();
      lZ77Compressor0.finish();
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 3, (int) (byte)88);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(32768).when(parameters0).getLazyMatchingThreshold();
      doReturn(16).when(parameters0).getMaxBackReferenceLength();
      doReturn((-877)).when(parameters0).getMaxCandidates();
      doReturn(2278).when(parameters0).getMaxLiteralLength();
      doReturn(16, 1377).when(parameters0).getMaxOffset();
      doReturn((-1022), 2, 177).when(parameters0).getMinBackReferenceLength();
      doReturn(2305).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[7];
      lZ77Compressor0.compress(byteArray0);
      byteArray0[0] = (byte)75;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)23;
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn((-872)).when(parameters0).getLazyMatchingThreshold();
      doReturn((-1022), 1377).when(parameters0).getMaxBackReferenceLength();
      doReturn((-2303), 1).when(parameters0).getMaxCandidates();
      doReturn((-3614), 0, 8, (-1022), (-32)).when(parameters0).getMaxOffset();
      doReturn((-1022), (-2140), (-872), 438).when(parameters0).getMinBackReferenceLength();
      doReturn(1, 1432).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)75;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn((-1022)).when(parameters0).getLazyMatchingThreshold();
      doReturn(1377).when(parameters0).getMaxBackReferenceLength();
      doReturn(3288).when(parameters0).getMaxCandidates();
      doReturn((-1022), 1377, 1377).when(parameters0).getMaxOffset();
      doReturn((-1022), 1377).when(parameters0).getMinBackReferenceLength();
      doReturn(8).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377, 1377).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte) (-37);
      lZ77Compressor0.prefill(byteArray0);
      lZ77Compressor0.finish();
      byte[] byteArray1 = new byte[7];
      byte byte0 = (byte)75;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(1222).when(parameters0).getLazyMatchingThreshold();
      doReturn(1222, 32768).when(parameters0).getMaxBackReferenceLength();
      doReturn(16, 1222).when(parameters0).getMaxCandidates();
      doReturn(1024, 0, 3, 422).when(parameters0).getMaxOffset();
      doReturn((-1022), (-1109), 426, 1221).when(parameters0).getMinBackReferenceLength();
      doReturn(3, 1024).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[7];
      lZ77Compressor0.compress(byteArray0);
      byteArray0[0] = (byte)75;
      byteArray0[1] = (byte)38;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)75;
      byteArray0[4] = (byte) (-1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(2109).when(parameters0).getLazyMatchingThreshold();
      doReturn(2935).when(parameters0).getMaxBackReferenceLength();
      doReturn(2935).when(parameters0).getMaxCandidates();
      doReturn((-1), 4147, 905).when(parameters0).getMaxOffset();
      doReturn((-1022), (-66039), 3189).when(parameters0).getMinBackReferenceLength();
      doReturn(905).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)75;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-124);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)49;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (byte)32);
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.getData();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((int)(byte)32, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(1099, 4, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.compress(byteArray0);
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn((-1022)).when(parameters0).getLazyMatchingThreshold();
      doReturn(32768, 16, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn((-1022), 32768, (-238)).when(parameters0).getMaxCandidates();
      doReturn(16, 0, 1377, 1, 1).when(parameters0).getMaxOffset();
      doReturn((-1022), (-1022), 512, (-869), 65536).when(parameters0).getMinBackReferenceLength();
      doReturn((-2769), 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[7];
      lZ77Compressor0.compress(byteArray0);
      byteArray0[0] = (byte)75;
      byte byte0 = (byte)2;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)23;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-83);
      byteArray0[6] = (byte)0;
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
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32768).when(parameters0).getMinBackReferenceLength();
      doReturn(32768, 2234).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-88);
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-2297), 624);
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_EOD0.getType();
      LZ77Compressor.EOD lZ77Compressor_EOD1 = new LZ77Compressor.EOD();
      LZ77Compressor.Block.BlockType.values();
      lZ77Compressor_BackReference0.getType();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)77;
      byteArray0[1] = (byte)24;
      byteArray0[2] = (byte)43;
      byteArray0[3] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)43, 0);
      LZ77Compressor.EOD lZ77Compressor_EOD2 = new LZ77Compressor.EOD();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0).when(parameters0).getMaxCandidates();
      doReturn(0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0).when(parameters0).getMaxOffset();
      doReturn(256, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0).when(parameters0).getNiceBackReferenceLength();
      doReturn(32, 16, (int)(byte)24, (int)(byte)0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.prefill(byteArray0);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)77;
      lZ77Compressor0.compress(byteArray1, (int) (byte)0, 0);
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((-1022), 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[7];
      lZ77Compressor0.compress(byteArray0);
      assertEquals(7, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      byteArray0[0] = (byte)75;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)23;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-83);
      byteArray0[6] = (byte)0;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((-2002), 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(1376, 1376, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)28;
      byteArray0[1] = (byte)1;
      lZ77Compressor0.compress(byteArray0);
      assertEquals(8, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)28, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      byteArray0[2] = (byte)56;
      lZ77Compressor0.finish();
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte)42;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-1);
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, (int) (byte)0, 528);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32767, 1448).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-81);
      lZ77Compressor0.finish();
      byteArray0[1] = (byte)0;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 3, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-2169), 0);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals((-2169), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string0);
      assertEquals("BackReference with offset -2169 and length 0", string0);
      assertEquals((-2169), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      int int0 = lZ77Compressor_BackReference0.getLength();
      assertEquals(0, int0);
      assertEquals((-2169), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals((-2169), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, 0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, (-2169)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-59);
      byteArray0[1] = (byte)28;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)16;
      byteArray0[5] = (byte)102;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)5;
      byteArray0[8] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-59), (-701));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-59), (byte)28, (byte)0, (byte)2, (byte)16, (byte)102, (byte)0, (byte)5, (byte)0}, byteArray0);
      assertEquals((-59), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-701), lZ77Compressor_LiteralBlock0.getLength());
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string0);
      assertEquals(9, byteArray0.length);
      assertEquals("LiteralBlock starting at -59 with length -701", string0);
      assertArrayEquals(new byte[] {(byte) (-59), (byte)28, (byte)0, (byte)2, (byte)16, (byte)102, (byte)0, (byte)5, (byte)0}, byteArray0);
      assertEquals((-59), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-701), lZ77Compressor_LiteralBlock0.getLength());
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertEquals(9, byteArray0.length);
      assertEquals("LiteralBlock starting at -59 with length -701", string1);
      assertArrayEquals(new byte[] {(byte) (-59), (byte)28, (byte)0, (byte)2, (byte)16, (byte)102, (byte)0, (byte)5, (byte)0}, byteArray0);
      assertEquals((-59), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-701), lZ77Compressor_LiteralBlock0.getLength());
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string2);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertEquals(9, byteArray0.length);
      assertEquals("LiteralBlock starting at -59 with length -701", string2);
      assertArrayEquals(new byte[] {(byte) (-59), (byte)28, (byte)0, (byte)2, (byte)16, (byte)102, (byte)0, (byte)5, (byte)0}, byteArray0);
      assertEquals((-59), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-701), lZ77Compressor_LiteralBlock0.getLength());
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string3);
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertEquals(9, byteArray0.length);
      assertEquals("LiteralBlock starting at -59 with length -701", string3);
      assertArrayEquals(new byte[] {(byte) (-59), (byte)28, (byte)0, (byte)2, (byte)16, (byte)102, (byte)0, (byte)5, (byte)0}, byteArray0);
      assertEquals((-59), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-701), lZ77Compressor_LiteralBlock0.getLength());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(9, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertArrayEquals(new byte[] {(byte) (-59), (byte)28, (byte)0, (byte)2, (byte)16, (byte)102, (byte)0, (byte)5, (byte)0}, byteArray0);
      assertEquals((-59), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-701), lZ77Compressor_LiteralBlock0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(1526, 1337).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray1 = new byte[8];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte)5;
      byteArray1[1] = (byte)102;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte) (-59);
      byteArray1[4] = (byte)102;
      byteArray1[5] = (byte)0;
      byteArray1[6] = (byte)2;
      byteArray1[7] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals(8, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)5, (byte)102, (byte)0, (byte) (-59), (byte)102, (byte)0, (byte)2, (byte)0}, byteArray1);
      
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
  public void test15()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-353), (-445));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-445), lZ77Compressor_BackReference0.getLength());
      assertEquals((-353), lZ77Compressor_BackReference0.getOffset());
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string0);
      assertEquals("BackReference with offset -353 and length -445", string0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-445), lZ77Compressor_BackReference0.getLength());
      assertEquals((-353), lZ77Compressor_BackReference0.getOffset());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-445)).when(parameters0).getWindowSize();
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
  public void test16()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(9, 256, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[16];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-85);
      byteArray0[4] = (byte) (-8);
      byteArray0[5] = (byte)3;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-15);
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(16, byteArray0.length);
      
      byteArray0[8] = (byte)0;
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
  public void test17()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 0);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string0);
      assertEquals("BackReference with offset 0 and length 0", string0);
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      byte[] byteArray0 = null;
      int int0 = 0;
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
  public void test18()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)119;
      byteArray0[0] = (byte)119;
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, (-1328));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(2, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)119, (byte)0}, byteArray0);
      assertEquals((-1328), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string0);
      assertEquals(2, byteArray0.length);
      assertEquals("LiteralBlock starting at 0 with length -1328", string0);
      assertArrayEquals(new byte[] {(byte)119, (byte)0}, byteArray0);
      assertEquals((-1328), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertEquals(2, byteArray0.length);
      assertEquals("LiteralBlock starting at 0 with length -1328", string1);
      assertArrayEquals(new byte[] {(byte)119, (byte)0}, byteArray0);
      assertEquals((-1328), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertEquals(2, byteArray0.length);
      assertEquals(2, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)119, (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)119, (byte)0}, byteArray1);
      assertEquals((-1328), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      
      int int0 = (-1);
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1), (-1328));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1328), lZ77Compressor_BackReference0.getLength());
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertEquals("BackReference with offset -1 and length -1328", string2);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1328), lZ77Compressor_BackReference0.getLength());
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string3);
      assertFalse(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertEquals("BackReference with offset -1 and length -1328", string3);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1328), lZ77Compressor_BackReference0.getLength());
      
      String string4 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string4);
      assertTrue(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string1));
      assertEquals("BackReference with offset -1 and length -1328", string4);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1328), lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.EOD lZ77Compressor_EOD1 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD1);
      assertFalse(lZ77Compressor_EOD1.equals((Object)lZ77Compressor_EOD0));
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD1.getType());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray1, 3, (int) (byte)119);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
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
  public void test22()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = null;
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
  public void test23()  throws Throwable  {
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (-1159));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1159), lZ77Compressor_LiteralBlock0.getLength());
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string0);
      assertEquals(1, byteArray0.length);
      assertEquals("LiteralBlock starting at 0 with length -1159", string0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1159), lZ77Compressor_LiteralBlock0.getLength());
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertEquals(1, byteArray0.length);
      assertEquals("LiteralBlock starting at 0 with length -1159", string1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1159), lZ77Compressor_LiteralBlock0.getLength());
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string2);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals(1, byteArray0.length);
      assertEquals("LiteralBlock starting at 0 with length -1159", string2);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1159), lZ77Compressor_LiteralBlock0.getLength());
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string3);
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertEquals(1, byteArray0.length);
      assertEquals("LiteralBlock starting at 0 with length -1159", string3);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1159), lZ77Compressor_LiteralBlock0.getLength());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(1, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1159), lZ77Compressor_LiteralBlock0.getLength());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray1 = LZ77Compressor.Block.BlockType.values();
      assertNotSame(lZ77Compressor_Block_BlockTypeArray1, lZ77Compressor_Block_BlockTypeArray0);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray1);
      assertFalse(lZ77Compressor_Block_BlockTypeArray1.equals((Object)lZ77Compressor_Block_BlockTypeArray0));
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray1.length);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, (byte)0);
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      String string4 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string4);
      assertFalse(string4.equals((Object)string2));
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string1));
      assertEquals("BackReference with offset 0 and length 0", string4);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(0, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-2412), (-2412));
      assertNotNull(lZ77Compressor_BackReference0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2412), lZ77Compressor_BackReference0.getLength());
      assertEquals((-2412), lZ77Compressor_BackReference0.getOffset());
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string0);
      assertEquals("BackReference with offset -2412 and length -2412", string0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2412), lZ77Compressor_BackReference0.getLength());
      assertEquals((-2412), lZ77Compressor_BackReference0.getOffset());
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertEquals("BackReference with offset -2412 and length -2412", string1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2412), lZ77Compressor_BackReference0.getLength());
      assertEquals((-2412), lZ77Compressor_BackReference0.getOffset());
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertNotNull(string2);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("BackReference with offset -2412 and length -2412", string2);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2412), lZ77Compressor_BackReference0.getLength());
      assertEquals((-2412), lZ77Compressor_BackReference0.getOffset());
      
      int int0 = lZ77Compressor_BackReference0.getLength();
      assertEquals((-2412), int0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2412), lZ77Compressor_BackReference0.getLength());
      assertEquals((-2412), lZ77Compressor_BackReference0.getOffset());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[0];
      lZ77Compressor0.compress(byteArray0);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0, 0, (-2412));
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byte[] byteArray1 = new byte[0];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      lZ77Compressor0.prefill(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals(0, byteArray1.length);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      byte[] byteArray2 = new byte[1];
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      
      byteArray2[0] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray2, 1170, 0);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1170, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotNull(string3);
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string2));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray2.length);
      assertEquals("LiteralBlock starting at 1170 with length 0", string3);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1170, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      int int1 = lZ77Compressor_LiteralBlock0.getOffset();
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(int1 == int0);
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray2.length);
      assertEquals(1170, int1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1170, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      int int2 = lZ77Compressor_LiteralBlock0.getOffset();
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertTrue(int2 == int1);
      assertFalse(int2 == int0);
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray2.length);
      assertEquals(1170, int2);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1170, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertNotNull(lZ77Compressor_EOD0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      int int3 = lZ77Compressor_BackReference0.getOffset();
      assertFalse(int3 == int1);
      assertTrue(int3 == int0);
      assertFalse(int3 == int2);
      assertEquals((-2412), int3);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2412), lZ77Compressor_BackReference0.getLength());
      assertEquals((-2412), lZ77Compressor_BackReference0.getOffset());
      
      lZ77Compressor0.prefill(byteArray2);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      
      byte[] byteArray3 = lZ77Compressor_LiteralBlock0.getData();
      assertNotSame(byteArray3, byteArray0);
      assertNotSame(byteArray3, byteArray1);
      assertSame(byteArray3, byteArray2);
      assertSame(byteArray2, byteArray3);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotNull(byteArray3);
      assertFalse(byteArray3.equals((Object)byteArray0));
      assertFalse(byteArray3.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray3.length);
      assertEquals(1, byteArray2.length);
      assertArrayEquals(new byte[] {(byte)0}, byteArray3);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1170, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_LiteralBlock0.getType();
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertSame(byteArray2, byteArray3);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray2.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1170, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      lZ77Compressor0.finish();
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_LiteralBlock0.getType();
      assertSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertSame(byteArray2, byteArray3);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertEquals(1, byteArray2.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType2);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertEquals(1170, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType3 = lZ77Compressor_BackReference0.getType();
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType2);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType3, lZ77Compressor_Block_BlockType1);
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType2));
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType3.equals((Object)lZ77Compressor_Block_BlockType1));
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType3);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2412), lZ77Compressor_BackReference0.getLength());
      assertEquals((-2412), lZ77Compressor_BackReference0.getOffset());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-23);
      byteArray0[1] = (byte) (-87);
      byteArray0[2] = (byte) (-49);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-49), (byte) (-87));
      assertNotNull(lZ77Compressor_LiteralBlock0);
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-23), (byte) (-87), (byte) (-49)}, byteArray0);
      assertEquals((-87), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-49), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertNotNull(string0);
      assertEquals(3, byteArray0.length);
      assertEquals("LiteralBlock starting at -49 with length -87", string0);
      assertArrayEquals(new byte[] {(byte) (-23), (byte) (-87), (byte) (-49)}, byteArray0);
      assertEquals((-87), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-49), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals(3, byteArray0.length);
      assertEquals((-87), int0);
      assertArrayEquals(new byte[] {(byte) (-23), (byte) (-87), (byte) (-49)}, byteArray0);
      assertEquals((-87), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-49), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertEquals(3, byteArray0.length);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertArrayEquals(new byte[] {(byte) (-23), (byte) (-87), (byte) (-49)}, byteArray0);
      assertEquals((-87), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-49), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-23), (byte) (-87), (byte) (-49)}, byteArray0);
      
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
      int int0 = (-327);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(32768, 1377).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)75;
      lZ77Compressor0.compress(byteArray0);
      byteArray0[0] = byte0;
      byte byte1 = (byte)2;
      byteArray0[1] = byte1;
      int int1 = 1;
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(int0, int1);
      lZ77Compressor_BackReference0.getType();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, (-2148));
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getType();
      lZ77Compressor_BackReference0.getType();
      LZ77Compressor.Block.BlockType.values();
      lZ77Compressor_BackReference0.getOffset();
      // Undeclared exception!
      try { 
        LZ77Compressor.Block.BlockType.valueOf("BackReference with offset 0 and length -2148");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BackReference with offset 0 and length -2148
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1), (-1));
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getType();
      LZ77Compressor.Block.BlockType.values();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.finish();
      LZ77Compressor.Block.BlockType.values();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)28;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-83);
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)28, (byte)0, (byte)0, (byte) (-83)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(8, (-2336)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-85);
      byteArray0[4] = (byte) (-8);
      byteArray0[5] = (byte)3;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-15);
      byteArray0[8] = (byte)0;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)88;
      byteArray0[2] = (byte) (-7);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)88, (byte)88);
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.getOffset();
      lZ77Compressor_LiteralBlock0.toString();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.finish();
      lZ77Compressor0.finish();
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 3, (int) (byte)88);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }
}
