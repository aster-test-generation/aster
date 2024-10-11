
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.BandSet;
import org.apache.commons.compress.harmony.pack200.CPDouble;
import org.apache.commons.compress.harmony.pack200.CPFloat;
import org.apache.commons.compress.harmony.pack200.CPInt;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.ConstantPoolEntry;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.harmony.pack200.MetadataBandGroup;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BandSet_ESTest extends BandSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      BHSDCodec bHSDCodec1 = Codec.DELTA5;
      long[][] longArray0 = new long[5][5];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags((String) null, longArray0, bHSDCodec1, bHSDCodec0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[6];
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      BHSDCodec bHSDCodec1 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeFlags((String) null, longArray0, bHSDCodec0, bHSDCodec1, false);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      intArray0[0] = 1880;
      intArray0[1] = 1244;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.wellCorrelated());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MockFile mockFile0 = new MockFile("", "O&+}*");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      segmentHeader0.pack(mockFileOutputStream0);
      assertEquals(20L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(0L);
      linkedList0.add(long0);
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertArrayEquals(new long[] {0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-571));
      linkedList0.add(integer0);
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[0];
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = segmentHeader0.encodeScalar(0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[0][9];
      byte[] byteArray0 = segmentHeader0.encodeFlags("GPW! )n,&jk]", longArray0, (BHSDCodec) null, (BHSDCodec) null, false);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPDouble> linkedList0 = new LinkedList<CPDouble>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.pack((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.SegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.longListToArray((List<Long>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.integerListToArray((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      intArray0[1] = 1048576;
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      try { 
        segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4,2) does not encode the value 1048576
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar(intArray0, (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeScalar((-254), bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -254
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar(1633, (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[1][6];
      long[] longArray1 = new long[8];
      longArray1[0] = (-3225L);
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeFlags("org.apache.commons.compress.harmony.pack200.BandSet$BandData", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("?9X[MJzmC", (long[][]) null, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[3];
      longArray0[0] = (-83L);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeFlags("!WX+f6PsG;gBQd", longArray0, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -83
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults", (long[]) null, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeBandInt("~5w]UwT}IA", intArray0, (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryOrNullListToArray((List<? extends ConstantPoolEntry>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryListToArray((List<? extends ConstantPoolEntry>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      intArray0[0] = 1633;
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("", intArray0, bHSDCodec0);
      assertEquals(10, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("code_LocalVariableTable_bciP", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[9];
      longArray0[0] = 427L;
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("OELSNuTf:oXq8qwz", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[6][6];
      long[] longArray1 = new long[6];
      longArray1[0] = 2097152L;
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("Tde&{yb7x", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(43, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[3];
      longArray0[0] = (long) (-1514);
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("KYTBo8( B", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int[] intArray0 = new int[5];
      intArray0[0] = (-3348);
      byte[] byteArray0 = segmentHeader0.encodeBandInt("code_LocalVariableTable_bci_P", intArray0, bHSDCodec0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("code_LocalVariableTable_bci_P", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      long[][] longArray0 = new long[2][0];
      long[] longArray1 = new long[5];
      longArray0[0] = longArray1;
      byte[] byteArray0 = segmentHeader0.encodeFlags("org.apache.commons.compress.harmony.pack200.BandSet$BandData", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("f)VSvcScK;Q", (-1481), (CpBands) null, segmentHeader0, 2587);
      int[] intArray0 = new int[7];
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      // Undeclared exception!
      try { 
        metadataBandGroup0.encodeBandInt("f)VSvcScK;Q", intArray0, bHSDCodec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2587
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPDouble> linkedList0 = new LinkedList<CPDouble>();
      CPDouble cPDouble0 = new CPDouble(0.02);
      cPDouble0.setIndex(25);
      linkedList0.push(cPDouble0);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {26}, intArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPDouble> linkedList0 = new LinkedList<CPDouble>();
      CPDouble cPDouble0 = new CPDouble(0.02);
      linkedList0.push(cPDouble0);
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryOrNullListToArray(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index should be > 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPFloat> linkedList0 = new LinkedList<CPFloat>();
      linkedList0.add((CPFloat) null);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPInt> linkedList0 = new LinkedList<CPInt>();
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.BandSet$BandData");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      cPNameAndType0.setIndex(659);
      linkedList0.add(cPNameAndType0);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertArrayEquals(new int[] {659}, intArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPFloat> linkedList0 = new LinkedList<CPFloat>();
      CPFloat cPFloat0 = new CPFloat((-1070.0F));
      linkedList0.add(cPFloat0);
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryListToArray(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index should be > 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      intArray0[1] = Integer.MIN_VALUE;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertTrue(boolean0);
      assertTrue(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[21];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      bandSet_BandData0.numDistinctValues();
      assertFalse(bandSet_BandData0.anyNegatives());
      assertTrue(bandSet_BandData0.mainlyPositiveDeltas());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[6];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(bandSet_BandData0.anyNegatives());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[21];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlyPositiveDeltas();
      assertFalse(bandSet_BandData0.anyNegatives());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlyPositiveDeltas();
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      intArray0[1] = (-1514);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.wellCorrelated());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      intArray0[0] = 26;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertEquals(0, longArray0.length);
  }
}
