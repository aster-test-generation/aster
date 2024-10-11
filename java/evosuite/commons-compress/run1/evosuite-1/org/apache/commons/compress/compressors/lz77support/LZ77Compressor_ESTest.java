
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertEquals((-4172), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals(5, lZ77Compressor_LiteralBlock1.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock0.equals((Object)lZ77Compressor_LiteralBlock1));
      assertFalse(int1 == int0);
      assertNotSame(lZ77Compressor_LiteralBlock0, lZ77Compressor_LiteralBlock1);
      assertEquals((-1), int1);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(parameters0).getLazyMatching();
      doReturn((-2359), 3621).when(parameters0).getLazyMatchingThreshold();
      doReturn((-4172), (-134)).when(parameters0).getMaxBackReferenceLength();
      doReturn((int)(byte)0, 2).when(parameters0).getMaxCandidates();
      doReturn((int)(byte) (-1)).when(parameters0).getMaxLiteralLength();
      doReturn(9976, 255, (int)(byte)0, 369).when(parameters0).getMaxOffset();
      doReturn((-1), 0, (-854), 16, 1024).when(parameters0).getMinBackReferenceLength();
      doReturn((-1434), 1733).when(parameters0).getNiceBackReferenceLength();
      doReturn((int)(byte)16, 6).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertEquals(5, lZ77Compressor_LiteralBlock1.getLength());
      assertEquals((-4172), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(int1 == int0);
      assertFalse(lZ77Compressor_LiteralBlock0.equals((Object)lZ77Compressor_LiteralBlock1));
      assertNotSame(lZ77Compressor_LiteralBlock0, lZ77Compressor_LiteralBlock1);
      assertEquals((-1), int1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(parameters0).getLazyMatching();
      doReturn(0, 32).when(parameters0).getLazyMatchingThreshold();
      doReturn((int)(byte)0, (int)(byte) (-1)).when(parameters0).getMaxBackReferenceLength();
      doReturn(128, (-3285)).when(parameters0).getMaxCandidates();
      doReturn(3, (-3285), (-10)).when(parameters0).getMaxOffset();
      doReturn((-1), (int)(byte) (-1), (int)(byte)0, (int)(byte)117, (-1500)).when(parameters0).getMinBackReferenceLength();
      doReturn((-12), (int)(byte)87).when(parameters0).getNiceBackReferenceLength();
      doReturn((int)(byte)16, 6).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertEquals(5, lZ77Compressor_LiteralBlock1.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals((-4172), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(int1 == int0);
      assertFalse(lZ77Compressor_LiteralBlock0.equals((Object)lZ77Compressor_LiteralBlock1));
      assertNotSame(lZ77Compressor_LiteralBlock0, lZ77Compressor_LiteralBlock1);
      assertEquals((-1), int1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(parameters0).getLazyMatching();
      doReturn((-1057), (int)(byte)117).when(parameters0).getLazyMatchingThreshold();
      doReturn(2, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn((-1733), (int)(byte) (-1)).when(parameters0).getMaxCandidates();
      doReturn(32768).when(parameters0).getMaxLiteralLength();
      doReturn(1, (-2327), (-4172), (-1733), (int)(byte)87).when(parameters0).getMaxOffset();
      doReturn((-1), 1052, (int)(byte)0, (-721), (int)(byte)117).when(parameters0).getMinBackReferenceLength();
      doReturn(4239, (int)(byte) (-1)).when(parameters0).getNiceBackReferenceLength();
      doReturn((int)(byte)16, 6).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(378, 1385, 378, 1385, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte) (-14);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)108;
      byteArray0[4] = (byte) (-26);
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-14), (byte) (-14), (byte)1, (byte)108, (byte) (-26)}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      lZ77Compressor0.finish();
      byte[] byteArray1 = new byte[5];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-14), (byte) (-14), (byte)1, (byte)108, (byte) (-26)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertNotSame(byteArray0, byteArray1);
      assertEquals(5, byteArray0.length);
      
      lZ77Compressor0.compress(byteArray1, 1596, (-3222));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray1, byteArray0);
      assertEquals(5, byteArray1.length);
      
      byteArray1[0] = (byte)2;
      byteArray1[1] = (byte)91;
      byteArray1[2] = (byte)1;
      byteArray1[3] = (byte) (-36);
      byteArray1[4] = (byte)68;
      lZ77Compressor0.compress(byteArray1, 2260, (int) (byte) (-36));
      assertArrayEquals(new byte[] {(byte)2, (byte)91, (byte)1, (byte) (-36), (byte)68}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray1, byteArray0);
      assertEquals(5, byteArray1.length);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      lZ77Compressor0.finish();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals((-4172), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(5, lZ77Compressor_LiteralBlock1.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(int1 == int0);
      assertFalse(lZ77Compressor_LiteralBlock0.equals((Object)lZ77Compressor_LiteralBlock1));
      assertNotSame(lZ77Compressor_LiteralBlock0, lZ77Compressor_LiteralBlock1);
      assertEquals((-1), int1);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)117).when(parameters0).getMinBackReferenceLength();
      doReturn(1, 2, 1).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertEquals(5, lZ77Compressor_LiteralBlock1.getLength());
      assertEquals((-4172), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(int1 == int0);
      assertFalse(lZ77Compressor_LiteralBlock0.equals((Object)lZ77Compressor_LiteralBlock1));
      assertNotSame(lZ77Compressor_LiteralBlock0, lZ77Compressor_LiteralBlock1);
      assertEquals((-1), int1);
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(parameters0).getLazyMatching();
      doReturn((-2061), 16).when(parameters0).getLazyMatchingThreshold();
      doReturn((-1)).when(parameters0).getMaxBackReferenceLength();
      doReturn((-1209)).when(parameters0).getMaxCandidates();
      doReturn(128, 8).when(parameters0).getMaxOffset();
      doReturn((-1), 1503, (-247), 98).when(parameters0).getMinBackReferenceLength();
      doReturn(810).when(parameters0).getNiceBackReferenceLength();
      doReturn((int)(byte)16, 6).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
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
  public void test06()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(1596).when(parameters0).getLazyMatchingThreshold();
      doReturn((-1423), 1596).when(parameters0).getMinBackReferenceLength();
      doReturn(1596, 1596, 1596).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte)0;
      lZ77Compressor0.finish();
      lZ77Compressor0.compress(byteArray0, 827, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      byteArray0[3] = (byte)75;
      lZ77Compressor0.finish();
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
  public void test07()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn((-1075)).when(parameters0).getLazyMatchingThreshold();
      doReturn(9997).when(parameters0).getMaxBackReferenceLength();
      doReturn(32).when(parameters0).getMaxCandidates();
      doReturn(9989, 9989).when(parameters0).getMaxOffset();
      doReturn((-1075), 9997).when(parameters0).getMinBackReferenceLength();
      doReturn(43).when(parameters0).getNiceBackReferenceLength();
      doReturn(1596, 32, 1596, 32, 516).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte)0;
      lZ77Compressor0.compress(byteArray0, 827, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      byteArray0[3] = (byte)75;
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)75}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)75}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 3, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-105);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)16;
      byteArray0[4] = (byte) (-48);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)53;
      byteArray0[7] = (byte) (-125);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, (byte) (-105));
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertEquals("LiteralBlock starting at 0 with length -105", string0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 0 with length -105", string1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("LiteralBlock starting at 0 with length -105", string2);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(string2);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertEquals((-105), int0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, 5, (int)(byte)0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, 1, (int) (byte)16);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(parameters0).getLazyMatching();
      doReturn(1596).when(parameters0).getLazyMatchingThreshold();
      doReturn(28, 28).when(parameters0).getMaxBackReferenceLength();
      doReturn(59, 3).when(parameters0).getMaxCandidates();
      doReturn((-2247), 1191, (-1423), (-1019)).when(parameters0).getMaxOffset();
      doReturn((-1423), 1596, (-1423)).when(parameters0).getMinBackReferenceLength();
      doReturn(59, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(1596, 1596, 1596, 1596, (-409)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte)0;
      lZ77Compressor0.compress(byteArray0, 827, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      byteArray0[3] = (byte)75;
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)75}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)75}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 3, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(14, 14);
      assertEquals(14, lZ77Compressor_BackReference0.getOffset());
      assertEquals(14, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 14 and length 14", string0);
      assertEquals(14, lZ77Compressor_BackReference0.getOffset());
      assertEquals(14, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertTrue(string1.equals((Object)string0));
      assertEquals("BackReference with offset 14 and length 14", string1);
      assertEquals(14, lZ77Compressor_BackReference0.getOffset());
      assertEquals(14, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("BackReference with offset 14 and length 14", string2);
      assertEquals(14, lZ77Compressor_BackReference0.getOffset());
      assertEquals(14, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string2);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(14, int0);
      assertEquals(14, lZ77Compressor_BackReference0.getOffset());
      assertEquals(14, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertEquals("BackReference with offset 14 and length 14", string3);
      assertEquals(14, lZ77Compressor_BackReference0.getOffset());
      assertEquals(14, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string3);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(14, 14).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[1];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte) (-19);
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray1);
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
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(1596, 32, 1596, 32, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte)0;
      lZ77Compressor0.compress(byteArray0, 827, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      byteArray0[3] = (byte)75;
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)75}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)75}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, 3, 2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertEquals(5, lZ77Compressor_LiteralBlock1.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals((-4172), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(int1 == int0);
      assertFalse(lZ77Compressor_LiteralBlock0.equals((Object)lZ77Compressor_LiteralBlock1));
      assertNotSame(lZ77Compressor_LiteralBlock0, lZ77Compressor_LiteralBlock1);
      assertEquals((-1), int1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)117).when(parameters0).getMinBackReferenceLength();
      doReturn(1, 2, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)98;
      byteArray0[1] = (byte) (-82);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)73;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)59;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-114);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-82), 0);
      assertArrayEquals(new byte[] {(byte)98, (byte) (-82), (byte)0, (byte)73, (byte)0, (byte)59, (byte)0, (byte) (-114)}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-82), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)98, (byte) (-82), (byte)0, (byte)73, (byte)0, (byte)59, (byte)0, (byte) (-114)}, byteArray0);
      assertEquals("LiteralBlock starting at -82 with length 0", string0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-82), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)98, (byte) (-82), (byte)0, (byte)73, (byte)0, (byte)59, (byte)0, (byte) (-114)}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at -82 with length 0", string1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-82), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)98, (byte) (-82), (byte)0, (byte)73, (byte)0, (byte)59, (byte)0, (byte) (-114)}, byteArray0);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertEquals("LiteralBlock starting at -82 with length 0", string2);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-82), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(string2);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)98, (byte) (-82), (byte)0, (byte)73, (byte)0, (byte)59, (byte)0, (byte) (-114)}, byteArray0);
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      assertEquals("LiteralBlock starting at -82 with length 0", string3);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-82), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(string3);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0).when(parameters0).getMaxCandidates();
      doReturn(0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0).when(parameters0).getMaxOffset();
      doReturn((int)(byte)59, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0).when(parameters0).getNiceBackReferenceLength();
      doReturn(1132, 16, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)98, (byte) (-82), (byte)0, (byte)73, (byte)0, (byte)59, (byte)0, (byte) (-114)}, byteArray0);
      assertEquals(8, byteArray0.length);
      
      lZ77Compressor0.finish();
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(3504, 1514);
      assertEquals(3504, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(1514, lZ77Compressor_BackReference0.getLength());
      assertNotNull(lZ77Compressor_BackReference0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(566).when(parameters0).getMinBackReferenceLength();
      doReturn(566, 3504).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)54;
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
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
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(1596, 32, (-6)).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      byteArray0[1] = (byte) (-86);
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
  public void test16()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(839, 839).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)14;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)126;
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)14, (byte)3, (byte)0, (byte)2, (byte)0, (byte)126}, byteArray0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(128, 1904, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)96;
      byteArray0[1] = (byte) (-122);
      byteArray0[2] = (byte) (-122);
      byteArray0[3] = (byte)66;
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, 32768, 4096);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-2164), (-2460));
      assertEquals((-2164), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2460), lZ77Compressor_BackReference0.getLength());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals((-2164), int0);
      assertEquals((-2164), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-2460), lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((-4218), 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(9, 9).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)107;
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte)121;
      byteArray0[3] = (byte)0;
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 0, (int) (byte)107);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals("LiteralBlock starting at 0 with length 0", string0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, byteArray0.length);
      assertNotNull(string0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
      
      int int0 = 0;
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 255);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertNotNull(lZ77Compressor_BackReference0);
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertFalse(string1.equals((Object)string0));
      assertEquals("BackReference with offset 0 and length 255", string1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertSame(byteArray0, byteArray1);
      assertEquals("LiteralBlock starting at 0 with length 0", string2);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, byteArray0.length);
      assertNotNull(string2);
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertEquals("BackReference with offset 0 and length 255", string3);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string3);
      
      String string4 = lZ77Compressor_BackReference0.toString();
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string2));
      assertFalse(string4.equals((Object)string0));
      assertEquals("BackReference with offset 0 and length 255", string4);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string4);
      
      String string5 = lZ77Compressor_BackReference0.toString();
      assertTrue(string5.equals((Object)string4));
      assertFalse(string5.equals((Object)string2));
      assertTrue(string5.equals((Object)string3));
      assertFalse(string5.equals((Object)string0));
      assertTrue(string5.equals((Object)string1));
      assertEquals("BackReference with offset 0 and length 255", string5);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string5);
      
      int int1 = lZ77Compressor_BackReference0.getOffset();
      assertTrue(int1 == int0);
      assertEquals(0, int1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(byteArray0, byteArray1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, byteArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(255, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(255, 0).when(parameters0).getWindowSize();
      String string6 = lZ77Compressor_BackReference0.toString();
      assertFalse(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string3));
      assertTrue(string6.equals((Object)string1));
      assertTrue(string6.equals((Object)string4));
      assertFalse(string6.equals((Object)string0));
      assertTrue(string6.equals((Object)string5));
      assertEquals("BackReference with offset 0 and length 255", string6);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(255, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string6);
      
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      String string7 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string7.equals((Object)string0));
      assertFalse(string7.equals((Object)string1));
      assertFalse(string7.equals((Object)string4));
      assertTrue(string7.equals((Object)string2));
      assertFalse(string7.equals((Object)string3));
      assertFalse(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string6));
      assertSame(byteArray0, byteArray1);
      assertEquals("LiteralBlock starting at 0 with length 0", string7);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, byteArray0.length);
      assertNotNull(string7);
      
      String string8 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertFalse(string8.equals((Object)string5));
      assertFalse(string8.equals((Object)string6));
      assertTrue(string8.equals((Object)string2));
      assertFalse(string8.equals((Object)string4));
      assertTrue(string8.equals((Object)string0));
      assertFalse(string8.equals((Object)string1));
      assertFalse(string8.equals((Object)string3));
      assertTrue(string8.equals((Object)string7));
      assertSame(byteArray0, byteArray1);
      assertEquals("LiteralBlock starting at 0 with length 0", string8);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, byteArray0.length);
      assertNotNull(string8);
      
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, 0, 3);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(2, 2);
      assertEquals(2, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(2, lZ77Compressor_BackReference0.getLength());
      assertNotNull(lZ77Compressor_BackReference0);
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 2 and length 2", string0);
      assertEquals(2, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(2, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertTrue(string1.equals((Object)string0));
      assertEquals("BackReference with offset 2 and length 2", string1);
      assertEquals(2, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(2, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_BackReference0.toString();
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertEquals("BackReference with offset 2 and length 2", string2);
      assertEquals(2, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(2, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string2);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(2, int0);
      assertEquals(2, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(2, lZ77Compressor_BackReference0.getLength());
      
      String string3 = lZ77Compressor_BackReference0.toString();
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string1));
      assertEquals("BackReference with offset 2 and length 2", string3);
      assertEquals(2, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(2, lZ77Compressor_BackReference0.getLength());
      assertNotNull(string3);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(2, 2, 2).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-91);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)51;
      byteArray0[5] = (byte) (-35);
      byteArray0[6] = (byte) (-19);
      lZ77Compressor0.compress(byteArray0, (-2333), 0);
      assertArrayEquals(new byte[] {(byte)2, (byte)0, (byte) (-91), (byte)0, (byte)51, (byte) (-35), (byte) (-19)}, byteArray0);
      assertEquals(7, byteArray0.length);
      
      byte[] byteArray1 = new byte[1];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      lZ77Compressor0.prefill(byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray1, byteArray0);
      assertEquals(1, byteArray1.length);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxCandidates();
      doReturn(0, 0, 0, 0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMaxOffset();
      doReturn((-445), 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0, 0, 0).when(parameters0).getNiceBackReferenceLength();
      doReturn(3, 5).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)0;
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
  public void test22()  throws Throwable  {
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(2139, 2139);
      assertEquals(2139, lZ77Compressor_BackReference0.getLength());
      assertEquals(2139, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 2139 and length 2139", string0);
      assertEquals(2139, lZ77Compressor_BackReference0.getLength());
      assertEquals(2139, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(2139, int0);
      assertEquals(2139, lZ77Compressor_BackReference0.getLength());
      assertEquals(2139, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      String string1 = lZ77Compressor_BackReference0.toString();
      assertTrue(string1.equals((Object)string0));
      assertEquals("BackReference with offset 2139 and length 2139", string1);
      assertEquals(2139, lZ77Compressor_BackReference0.getLength());
      assertEquals(2139, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string1);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)82;
      String string2 = lZ77Compressor_BackReference0.toString();
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("BackReference with offset 2139 and length 2139", string2);
      assertEquals(2139, lZ77Compressor_BackReference0.getLength());
      assertEquals(2139, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string2);
      
      byteArray0[2] = (byte) (-16);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)82, (-2793));
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray0);
      assertEquals(82, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-2793), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray0);
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertEquals("LiteralBlock starting at 82 with length -2793", string3);
      assertEquals(82, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-2793), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, byteArray0.length);
      assertNotNull(string3);
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray0);
      assertTrue(string4.equals((Object)string3));
      assertFalse(string4.equals((Object)string2));
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string1));
      assertEquals("LiteralBlock starting at 82 with length -2793", string4);
      assertEquals(82, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-2793), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, byteArray0.length);
      assertNotNull(string4);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(82, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-2793), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, byteArray0.length);
      assertEquals(3, byteArray1.length);
      assertNotNull(byteArray1);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals(2139, lZ77Compressor_BackReference0.getLength());
      assertEquals(2139, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      String string5 = lZ77Compressor_BackReference0.toString();
      assertFalse(string5.equals((Object)string4));
      assertFalse(string5.equals((Object)string3));
      assertTrue(string5.equals((Object)string2));
      assertTrue(string5.equals((Object)string0));
      assertTrue(string5.equals((Object)string1));
      assertEquals("BackReference with offset 2139 and length 2139", string5);
      assertEquals(2139, lZ77Compressor_BackReference0.getLength());
      assertEquals(2139, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string5);
      
      String string6 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray0);
      assertTrue(string6.equals((Object)string4));
      assertFalse(string6.equals((Object)string5));
      assertFalse(string6.equals((Object)string0));
      assertFalse(string6.equals((Object)string1));
      assertFalse(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string3));
      assertSame(byteArray0, byteArray1);
      assertEquals("LiteralBlock starting at 82 with length -2793", string6);
      assertEquals(82, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-2793), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, byteArray0.length);
      assertNotNull(string6);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(parameters0).getLazyMatching();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0).when(parameters0).getMaxBackReferenceLength();
      doReturn(0).when(parameters0).getMaxCandidates();
      doReturn(0).when(parameters0).getMaxLiteralLength();
      doReturn(0, 0).when(parameters0).getMaxOffset();
      doReturn(0, 0, 0, 0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(0).when(parameters0).getNiceBackReferenceLength();
      doReturn(2139, 2139, (int)(byte) (-16), 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(82, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-2793), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, byteArray0.length);
      assertEquals(3, byteArray1.length);
      
      lZ77Compressor0.compress(byteArray0, (-487), (-2793));
      assertArrayEquals(new byte[] {(byte)0, (byte)82, (byte) (-16)}, byteArray0);
      assertSame(byteArray0, byteArray1);
      assertEquals(3, byteArray0.length);
      
      lZ77Compressor0.finish();
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = (-1508);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (-1508), (-1508));
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals("LiteralBlock starting at -1508 with length -1508", string0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string2);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(string2);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string3);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(string3);
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string3));
      assertTrue(string4.equals((Object)string2));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string4);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(string4);
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(int1 == int0);
      assertEquals((-1508), int1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(32, (-1508)).when(parameters0).getWindowSize();
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
  public void test24()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(0).when(parameters0).getLazyMatchingThreshold();
      doReturn(0, 0).when(parameters0).getMinBackReferenceLength();
      doReturn(1596, 32, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte)0;
      lZ77Compressor0.compress(byteArray0, 827, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      byteArray0[3] = (byte)75;
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)32, (byte) (-86), (byte)0, (byte)75}, byteArray0);
      assertEquals(4, byteArray0.length);
      
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, 3, 2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)18;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 128, (byte)0);
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(128, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals("LiteralBlock starting at 128 with length 0", string0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(128, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 128 with length 0", string1);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(128, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("LiteralBlock starting at 128 with length 0", string2);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(128, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string2);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string1));
      assertEquals("LiteralBlock starting at 128 with length 0", string3);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(128, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string3);
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string3));
      assertTrue(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string0));
      assertEquals("LiteralBlock starting at 128 with length 0", string4);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(128, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string4);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, int0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(128, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(1410, (int)(byte)8).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)8, (byte)18, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)22;
      byteArray0[1] = (byte) (-113);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-1), 643);
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertEquals("LiteralBlock starting at -1 with length 643", string0);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at -1 with length 643", string1);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("LiteralBlock starting at -1 with length 643", string2);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string2);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string3.equals((Object)string1));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string2));
      assertEquals("LiteralBlock starting at -1 with length 643", string3);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string3);
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string3));
      assertTrue(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string2));
      assertEquals("LiteralBlock starting at -1 with length 643", string4);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string4);
      
      String string5 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string5.equals((Object)string1));
      assertTrue(string5.equals((Object)string4));
      assertTrue(string5.equals((Object)string2));
      assertTrue(string5.equals((Object)string0));
      assertTrue(string5.equals((Object)string3));
      assertEquals("LiteralBlock starting at -1 with length 643", string5);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string5);
      
      String string6 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string6.equals((Object)string1));
      assertTrue(string6.equals((Object)string5));
      assertTrue(string6.equals((Object)string0));
      assertTrue(string6.equals((Object)string4));
      assertTrue(string6.equals((Object)string2));
      assertTrue(string6.equals((Object)string3));
      assertEquals("LiteralBlock starting at -1 with length 643", string6);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string6);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertEquals(4, byteArray1.length);
      assertNotNull(byteArray1);
      
      String string7 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string7.equals((Object)string0));
      assertTrue(string7.equals((Object)string2));
      assertTrue(string7.equals((Object)string4));
      assertTrue(string7.equals((Object)string1));
      assertTrue(string7.equals((Object)string6));
      assertTrue(string7.equals((Object)string3));
      assertTrue(string7.equals((Object)string5));
      assertSame(byteArray0, byteArray1);
      assertEquals("LiteralBlock starting at -1 with length 643", string7);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string7);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)0, (byte)0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte) (-113)).when(parameters0).getWindowSize();
      String string8 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string8.equals((Object)string4));
      assertTrue(string8.equals((Object)string0));
      assertTrue(string8.equals((Object)string3));
      assertTrue(string8.equals((Object)string2));
      assertTrue(string8.equals((Object)string7));
      assertTrue(string8.equals((Object)string1));
      assertTrue(string8.equals((Object)string6));
      assertTrue(string8.equals((Object)string5));
      assertSame(byteArray0, byteArray1);
      assertEquals("LiteralBlock starting at -1 with length 643", string8);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string8);
      
      String string9 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)22, (byte) (-113), (byte) (-1), (byte)0}, byteArray0);
      assertTrue(string9.equals((Object)string1));
      assertTrue(string9.equals((Object)string5));
      assertTrue(string9.equals((Object)string8));
      assertTrue(string9.equals((Object)string4));
      assertTrue(string9.equals((Object)string7));
      assertTrue(string9.equals((Object)string3));
      assertTrue(string9.equals((Object)string6));
      assertTrue(string9.equals((Object)string0));
      assertTrue(string9.equals((Object)string2));
      assertSame(byteArray0, byteArray1);
      assertEquals("LiteralBlock starting at -1 with length 643", string9);
      assertEquals(643, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(4, byteArray0.length);
      assertNotNull(string9);
      
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
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = (-1508);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (-1508), (-1508));
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals("LiteralBlock starting at -1508 with length -1508", string0);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string1);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string2);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      assertNotNull(string2);
      
      String string3 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string3.equals((Object)string2));
      assertTrue(string3.equals((Object)string0));
      assertTrue(string3.equals((Object)string1));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string3);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      assertNotNull(string3);
      
      String string4 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string4.equals((Object)string1));
      assertTrue(string4.equals((Object)string0));
      assertTrue(string4.equals((Object)string2));
      assertTrue(string4.equals((Object)string3));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string4);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      assertNotNull(string4);
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(int1 == int0);
      assertEquals((-1508), int1);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, byteArray0.length);
      
      String string5 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertTrue(string5.equals((Object)string4));
      assertTrue(string5.equals((Object)string2));
      assertTrue(string5.equals((Object)string0));
      assertTrue(string5.equals((Object)string3));
      assertTrue(string5.equals((Object)string1));
      assertEquals("LiteralBlock starting at -1508 with length -1508", string5);
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1508), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, byteArray0.length);
      assertNotNull(string5);
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, byteArray0.length);
      
      // Undeclared exception!
      try { 
        LZ77Compressor.Block.BlockType.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock((byte[]) null, 1, 0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(1, lZ77Compressor_LiteralBlock0.getOffset());
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
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
  public void test29()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress((byte[]) null, 3, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = 0;
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 0 and length 0", string0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(string0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_BackReference0.getType();
      assertSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType1);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
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
  public void test31()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte) (-49);
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte)55;
      byteArray0[4] = (byte)12;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte) (-65);
      byteArray0[7] = (byte) (-105);
      byteArray0[8] = (byte)0;
      lZ77Compressor0.compress(byteArray0, (-2062), 0);
      assertArrayEquals(new byte[] {(byte) (-128), (byte) (-49), (byte)124, (byte)55, (byte)12, (byte) (-1), (byte) (-65), (byte) (-105), (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-105);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)16;
      byteArray0[4] = (byte) (-48);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)53;
      byteArray0[7] = (byte) (-125);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, (byte) (-105));
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertEquals("LiteralBlock starting at 0 with length -105", string0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 0 with length -105", string1);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertEquals("LiteralBlock starting at 0 with length -105", string2);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      assertNotNull(string2);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-105), (byte)0, (byte)16, (byte) (-48), (byte)0, (byte)53, (byte) (-125)}, byteArray0);
      assertEquals((-105), int0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-105), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(8, byteArray0.length);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.finish();
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0, 1, (int) (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(lZ77Compressor_LiteralBlock1.equals((Object)lZ77Compressor_LiteralBlock0));
      assertEquals((-4172), lZ77Compressor_LiteralBlock1.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock1.getType());
      assertEquals(5, lZ77Compressor_LiteralBlock1.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)0, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(int1 == int0);
      assertFalse(lZ77Compressor_LiteralBlock0.equals((Object)lZ77Compressor_LiteralBlock1));
      assertNotSame(lZ77Compressor_LiteralBlock0, lZ77Compressor_LiteralBlock1);
      assertEquals((-1), int1);
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameters0).getMinBackReferenceLength();
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
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
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte) (-104);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-96);
      byteArray0[5] = (byte) (-116);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-118);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 3, 1876);
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte) (-104), (byte)0, (byte) (-96), (byte) (-116), (byte)0, (byte) (-118)}, byteArray0);
      assertEquals(3, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1876, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte) (-104), (byte)0, (byte) (-96), (byte) (-116), (byte)0, (byte) (-118)}, byteArray0);
      assertEquals("LiteralBlock starting at 3 with length 1876", string0);
      assertEquals(3, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1876, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(string0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte) (-104), (byte)0, (byte) (-96), (byte) (-116), (byte)0, (byte) (-118)}, byteArray0);
      assertEquals(1876, int0);
      assertEquals(3, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1876, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte) (-104), (byte)0, (byte) (-96), (byte) (-116), (byte)0, (byte) (-118)}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 3 with length 1876", string1);
      assertEquals(3, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1876, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(string1);
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)0, (byte) (-104));
      assertEquals((-104), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertNotNull(lZ77Compressor_BackReference0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      lZ77Compressor0.compress(byteArray0, (int) (byte) (-96), (int) (byte) (-104));
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte) (-104), (byte)0, (byte) (-96), (byte) (-116), (byte)0, (byte) (-118)}, byteArray0);
      assertEquals(8, byteArray0.length);
      
      lZ77Compressor0.finish();
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals((-104), lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      int int1 = lZ77Compressor_LiteralBlock0.getOffset();
      assertArrayEquals(new byte[] {(byte)0, (byte)3, (byte) (-104), (byte)0, (byte) (-96), (byte) (-116), (byte)0, (byte) (-118)}, byteArray0);
      assertFalse(int1 == int0);
      assertEquals(3, int1);
      assertEquals(3, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(1876, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)74;
      byteArray0[1] = (byte) (-59);
      byteArray0[2] = (byte)32;
      byteArray0[3] = (byte) (-127);
      byteArray0[4] = (byte) (-52);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)32, (byte) (-52));
      assertArrayEquals(new byte[] {(byte)74, (byte) (-59), (byte)32, (byte) (-127), (byte) (-52)}, byteArray0);
      assertEquals((-52), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(32, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)74, (byte) (-59), (byte)32, (byte) (-127), (byte) (-52)}, byteArray0);
      assertEquals("LiteralBlock starting at 32 with length -52", string0);
      assertEquals((-52), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(32, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)74, (byte) (-59), (byte)32, (byte) (-127), (byte) (-52)}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 32 with length -52", string1);
      assertEquals((-52), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(32, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string1);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)74, (byte) (-59), (byte)32, (byte) (-127), (byte) (-52)}, byteArray0);
      assertTrue(string2.equals((Object)string0));
      assertTrue(string2.equals((Object)string1));
      assertEquals("LiteralBlock starting at 32 with length -52", string2);
      assertEquals((-52), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(32, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      assertNotNull(string2);
      
      int int0 = lZ77Compressor_LiteralBlock0.getOffset();
      assertArrayEquals(new byte[] {(byte)74, (byte) (-59), (byte)32, (byte) (-127), (byte) (-52)}, byteArray0);
      assertEquals(32, int0);
      assertEquals((-52), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(32, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(5, byteArray0.length);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      // Undeclared exception!
      try { 
        LZ77Compressor.Block.BlockType.valueOf("LiteralBlock starting at 32 with length -52");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LiteralBlock starting at 32 with length -52
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)32;
      byte byte0 = (byte) (-13);
      byteArray0[3] = (byte) (-13);
      byteArray0[4] = (byte)0;
      byte byte1 = (byte)60;
      byteArray0[5] = (byte)60;
      byteArray0[6] = (byte)118;
      byteArray0[7] = (byte)59;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)118, (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte) (-13), (byte)0, (byte)60, (byte)118, (byte)59}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(118, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte) (-13), (byte)0, (byte)60, (byte)118, (byte)59}, byteArray0);
      assertEquals("LiteralBlock starting at 118 with length 0", string0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(118, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(string0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte) (-13), (byte)0, (byte)60, (byte)118, (byte)59}, byteArray0);
      assertEquals(0, int0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(118, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte) (-13), (byte)0, (byte)60, (byte)118, (byte)59}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 118 with length 0", string1);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(118, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(string1);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      String string2 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte) (-13), (byte)0, (byte)60, (byte)118, (byte)59}, byteArray0);
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertEquals("LiteralBlock starting at 118 with length 0", string2);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(118, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(8, byteArray0.length);
      assertNotNull(string2);
      
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte) (-13), (byte)0, (byte)60, (byte)118, (byte)59}, byteArray0);
      assertEquals(8, byteArray0.length);
      
      lZ77Compressor0.compress(byteArray0, (-2710), (-798));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)32, (byte) (-13), (byte)0, (byte)60, (byte)118, (byte)59}, byteArray0);
      assertEquals(8, byteArray0.length);
      
      // Undeclared exception!
      try { 
        LZ77Compressor.Block.BlockType.valueOf("LiteralBlock starting at 118 with length 0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LiteralBlock starting at 118 with length 0
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-4);
      byteArray0[1] = (byte)114;
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-53);
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)8;
      byteArray0[8] = (byte)3;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-4), 774);
      assertArrayEquals(new byte[] {(byte) (-4), (byte)114, (byte)2, (byte)0, (byte) (-53), (byte)1, (byte)0, (byte)8, (byte)3}, byteArray0);
      assertEquals(774, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-4), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(9, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte) (-4), (byte)114, (byte)2, (byte)0, (byte) (-53), (byte)1, (byte)0, (byte)8, (byte)3}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(774, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals((-4), lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-1023), (-1023));
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1023), lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1023), lZ77Compressor_BackReference0.getLength());
      assertNotNull(lZ77Compressor_BackReference0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1023), lZ77Compressor_BackReference0.getOffset());
      assertEquals((-1023), lZ77Compressor_BackReference0.getLength());
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte)2;
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)12, (byte)2}, byteArray0);
      assertEquals(2, byteArray0.length);
      
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
  public void test39()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-325), (-1));
      assertEquals((-325), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals((-325), int0);
      assertEquals((-325), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      
      byte[] byteArray0 = new byte[0];
      int int1 = 0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType1);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset -325 and length -1", string0);
      assertEquals((-325), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      assertNotNull(string0);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals((-325), lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals((-1), lZ77Compressor_BackReference0.getLength());
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertFalse(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 0 with length 0", string1);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(0, byteArray0.length);
      assertNotNull(string1);
      
      LZ77Compressor lZ77Compressor0 = null;
      try {
        lZ77Compressor0 = new LZ77Compressor((Parameters) null, (LZ77Compressor.Callback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // params
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_EOD0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-38);
      byteArray0[6] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (byte)8);
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte) (-38), (byte)0}, byteArray0);
      assertEquals(8, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(7, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte) (-38), (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte) (-38), (byte)0}, byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(8, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(7, byteArray0.length);
      assertEquals(7, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(0, 0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertNotNull(lZ77Compressor_BackReference0);
      
      String string0 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 0 and length 0", string0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      assertNotNull(string0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_BackReference0.getType();
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertEquals(0, lZ77Compressor_BackReference0.getOffset());
      
      lZ77Compressor_BackReference0.getType();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-83);
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.getType();
      lZ77Compressor_BackReference0.getType();
      lZ77Compressor_BackReference0.getType();
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray1, 930, (-1951));
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at 930 with length -1951", string1);
      
      int int0 = lZ77Compressor_BackReference0.getLength();
      assertEquals(0, int0);
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertEquals((-1951), int1);
      
      lZ77Compressor_LiteralBlock0.getData();
      String string2 = lZ77Compressor_BackReference0.toString();
      assertEquals("BackReference with offset 0 and length 0", string2);
      
      lZ77Compressor_LiteralBlock0.getType();
      assertEquals((-1951), lZ77Compressor_LiteralBlock0.getLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte)83;
      byteArray0[2] = (byte)7;
      byteArray0[3] = (byte)2;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 0, 32767);
      assertArrayEquals(new byte[] {(byte)11, (byte)83, (byte)7, (byte)2, (byte)0, (byte)0}, byteArray0);
      assertEquals(32767, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(6, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)11, (byte)83, (byte)7, (byte)2, (byte)0, (byte)0}, byteArray0);
      assertEquals("LiteralBlock starting at 0 with length 32767", string0);
      assertEquals(32767, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(6, byteArray0.length);
      assertNotNull(string0);
      
      String string1 = lZ77Compressor_LiteralBlock0.toString();
      assertArrayEquals(new byte[] {(byte)11, (byte)83, (byte)7, (byte)2, (byte)0, (byte)0}, byteArray0);
      assertTrue(string1.equals((Object)string0));
      assertEquals("LiteralBlock starting at 0 with length 32767", string1);
      assertEquals(32767, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(6, byteArray0.length);
      assertNotNull(string1);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      int int0 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)11, (byte)83, (byte)7, (byte)2, (byte)0, (byte)0}, byteArray0);
      assertEquals(32767, int0);
      assertEquals(32767, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference(1517, 256);
      assertEquals(1517, lZ77Compressor_BackReference0.getOffset());
      assertEquals(256, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getLength();
      assertEquals(256, int0);
      assertEquals(1517, lZ77Compressor_BackReference0.getOffset());
      assertEquals(256, lZ77Compressor_BackReference0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)82;
      byteArray0[1] = (byte) (-128);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)6;
      byteArray0[4] = (byte)113;
      byteArray0[5] = (byte) (-92);
      byteArray0[6] = (byte)2;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)0, (byte)6);
      assertArrayEquals(new byte[] {(byte)82, (byte) (-128), (byte)1, (byte)6, (byte)113, (byte) (-92), (byte)2, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(6, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(9, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)82, (byte) (-128), (byte)1, (byte)6, (byte)113, (byte) (-92), (byte)2, (byte)0, (byte)0}, byteArray0);
      assertFalse(int1 == int0);
      assertEquals(6, int1);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(6, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-80);
      byteArray0[1] = (byte) (-122);
      byteArray0[2] = (byte)3;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)3, 0);
      assertArrayEquals(new byte[] {(byte) (-80), (byte) (-122), (byte)3}, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      byte[] byteArray1 = lZ77Compressor_LiteralBlock0.getData();
      assertArrayEquals(new byte[] {(byte) (-80), (byte) (-122), (byte)3}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-80), (byte) (-122), (byte)3}, byteArray1);
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(3, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(3, byteArray0.length);
      assertEquals(3, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte)5;
      byteArray0[7] = (byte) (-1);
      byteArray0[8] = (byte) (-85);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)5, (-1255));
      assertArrayEquals(new byte[] {(byte)0, (byte)14, (byte)1, (byte) (-128), (byte)5, (byte)1, (byte)5, (byte) (-1), (byte) (-85)}, byteArray0);
      assertEquals((-1255), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(5, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(9, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)0, (byte)14, (byte)1, (byte) (-128), (byte)5, (byte)1, (byte)5, (byte) (-1), (byte) (-85)}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals((-1255), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals(5, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = LZ77Compressor.Block.BlockType.EOD;
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType0);
      
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
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      assertArrayEquals(new byte[] {(byte)87, (byte)4, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      assertNotNull(lZ77Compressor_LiteralBlock0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType0 = lZ77Compressor_LiteralBlock0.getType();
      assertArrayEquals(new byte[] {(byte)87, (byte)4, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_Block_BlockType0);
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      assertNotNull(lZ77Compressor_EOD0);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType1 = lZ77Compressor_EOD0.getType();
      assertFalse(lZ77Compressor_Block_BlockType1.equals((Object)lZ77Compressor_Block_BlockType0));
      assertNotSame(lZ77Compressor_Block_BlockType1, lZ77Compressor_Block_BlockType0);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.EOD, lZ77Compressor_EOD0.getType());
      
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      assertNotNull(lZ77Compressor_BackReference0);
      
      int int0 = lZ77Compressor_BackReference0.getOffset();
      assertEquals(98, int0);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      int int1 = lZ77Compressor_LiteralBlock0.getLength();
      assertArrayEquals(new byte[] {(byte)87, (byte)4, (byte)5, (byte)117, (byte) (-1), (byte)0, (byte)98, (byte)16}, byteArray0);
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      assertEquals(2, lZ77Compressor_LiteralBlock0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.LITERAL, lZ77Compressor_LiteralBlock0.getType());
      assertEquals((-1), lZ77Compressor_LiteralBlock0.getLength());
      assertEquals(8, byteArray0.length);
      
      LZ77Compressor.Block.BlockType lZ77Compressor_Block_BlockType2 = lZ77Compressor_BackReference0.getType();
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType0));
      assertFalse(lZ77Compressor_Block_BlockType2.equals((Object)lZ77Compressor_Block_BlockType1));
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType0);
      assertNotSame(lZ77Compressor_Block_BlockType2, lZ77Compressor_Block_BlockType1);
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_Block_BlockType2);
      assertEquals(0, lZ77Compressor_BackReference0.getLength());
      assertEquals(98, lZ77Compressor_BackReference0.getOffset());
      assertEquals(LZ77Compressor.Block.BlockType.BACK_REFERENCE, lZ77Compressor_BackReference0.getType());
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)117).when(parameters0).getMinBackReferenceLength();
      doReturn(1, 2, 9997).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      // Undeclared exception!
      try { 
        lZ77Compressor0.compress(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(parameters0).getLazyMatching();
      doReturn(378).when(parameters0).getLazyMatchingThreshold();
      doReturn(641).when(parameters0).getMinBackReferenceLength();
      doReturn(378, 1385, 378, 1385, 2242).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      assertNotNull(lZ77Compressor0);
      
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte) (-14);
      byteArray0[2] = (byte)1;
      byteArray0[0] = (byte)108;
      byteArray0[4] = (byte) (-26);
      lZ77Compressor0.prefill(byteArray0);
      assertArrayEquals(new byte[] {(byte)108, (byte) (-14), (byte)1, (byte)0, (byte) (-26)}, byteArray0);
      assertEquals(5, byteArray0.length);
      
      lZ77Compressor0.finish();
      byte[] byteArray1 = new byte[5];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      lZ77Compressor0.compress(byteArray0);
      assertArrayEquals(new byte[] {(byte)108, (byte) (-14), (byte)1, (byte)0, (byte) (-26)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertNotSame(byteArray0, byteArray1);
      assertEquals(5, byteArray0.length);
      
      lZ77Compressor0.compress(byteArray1, 1596, (-3222));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray1, byteArray0);
      assertEquals(5, byteArray1.length);
      
      byteArray1[0] = (byte)2;
      byteArray1[1] = (byte)91;
      byteArray1[2] = (byte)1;
      byteArray1[3] = (byte) (-36);
      byteArray1[4] = (byte)1;
      lZ77Compressor0.compress(byteArray1, 2260, (int) (byte) (-36));
      assertArrayEquals(new byte[] {(byte)2, (byte)91, (byte)1, (byte) (-36), (byte)1}, byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray1, byteArray0);
      assertEquals(5, byteArray1.length);
      
      LZ77Compressor.Block.BlockType[] lZ77Compressor_Block_BlockTypeArray0 = LZ77Compressor.Block.BlockType.values();
      assertEquals(3, lZ77Compressor_Block_BlockTypeArray0.length);
      assertNotNull(lZ77Compressor_Block_BlockTypeArray0);
      
      lZ77Compressor0.finish();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-105);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)16;
      byteArray0[4] = (byte) (-48);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)53;
      byteArray0[7] = (byte) (-125);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)0, 5, (int)(byte)0).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.finish();
      // Undeclared exception!
      lZ77Compressor0.compress(byteArray0, (int) (byte)0, (int) (byte)16);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-4);
      byteArray0[1] = (byte)114;
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-53);
      byteArray0[5] = (byte)1;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)8;
      byteArray0[8] = (byte)1;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte) (-4), 774);
      String string0 = lZ77Compressor_LiteralBlock0.toString();
      assertEquals("LiteralBlock starting at -4 with length 774", string0);
      
      lZ77Compressor_LiteralBlock0.getType();
      lZ77Compressor_LiteralBlock0.getType();
      assertEquals((-4), lZ77Compressor_LiteralBlock0.getOffset());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)117;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)98;
      byteArray0[7] = (byte)16;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, (byte) (-1));
      lZ77Compressor_LiteralBlock0.getType();
      LZ77Compressor.EOD lZ77Compressor_EOD0 = new LZ77Compressor.EOD();
      lZ77Compressor_EOD0.getType();
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock1 = new LZ77Compressor.LiteralBlock(byteArray0, (-4172), (byte)5);
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((byte)98, 0);
      lZ77Compressor_LiteralBlock0.getLength();
      lZ77Compressor_BackReference0.getType();
      LZ77Compressor.Block.BlockType.values();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(parameters0).getLazyMatching();
      doReturn((-1308), (int)(byte)0).when(parameters0).getLazyMatchingThreshold();
      doReturn(2).when(parameters0).getMaxBackReferenceLength();
      doReturn(1).when(parameters0).getMaxCandidates();
      doReturn(65, 32767).when(parameters0).getMaxOffset();
      doReturn((-1), (int)(byte)0, 86, 0).when(parameters0).getMinBackReferenceLength();
      doReturn((int)(byte)87).when(parameters0).getNiceBackReferenceLength();
      doReturn((int)(byte)16, 6).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      lZ77Compressor0.compress(byteArray0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LZ77Compressor.BackReference lZ77Compressor_BackReference0 = new LZ77Compressor.BackReference((-975), (-975));
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      lZ77Compressor_BackReference0.toString();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-3);
      byteArray0[1] = (byte) (-3);
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte) (-74);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)32;
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, (byte)3, (byte) (-3));
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.toString();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((-3765)).when(parameters0).getWindowSize();
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
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)41;
      byteArray0[1] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-41);
      LZ77Compressor.LiteralBlock lZ77Compressor_LiteralBlock0 = new LZ77Compressor.LiteralBlock(byteArray0, 2, 0);
      lZ77Compressor_LiteralBlock0.toString();
      lZ77Compressor_LiteralBlock0.getLength();
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      doReturn((int)(byte)41, 0, (int)(byte)41).when(parameters0).getWindowSize();
      LZ77Compressor.Callback lZ77Compressor_Callback0 = mock(LZ77Compressor.Callback.class, new ViolatedAssumptionAnswer());
      LZ77Compressor lZ77Compressor0 = new LZ77Compressor(parameters0, lZ77Compressor_Callback0);
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-41);
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)41;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte) (-41);
      byteArray1[6] = (byte)0;
      lZ77Compressor0.prefill(byteArray1);
      lZ77Compressor0.prefill(byteArray0);
      byte[] byteArray2 = new byte[3];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)3;
      byteArray2[2] = (byte)0;
      // Undeclared exception!
      try { 
        lZ77Compressor0.prefill(byteArray2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The compressor has already started to accept data, can't prefill anymore
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.LZ77Compressor", e);
      }
  }
}
