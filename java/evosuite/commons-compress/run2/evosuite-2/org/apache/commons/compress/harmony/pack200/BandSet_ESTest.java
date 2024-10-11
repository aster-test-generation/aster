
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.BandSet;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.harmony.pack200.CPString;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.ConstantPoolEntry;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.harmony.pack200.IcBands;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BandSet_ESTest extends BandSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[3][1];
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      BHSDCodec bHSDCodec1 = Codec.SIGNED5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("Packed META-INF/MANIFEST.MF", longArray0, bHSDCodec0, bHSDCodec1, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 0);
      long[] longArray0 = new long[3];
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      BHSDCodec bHSDCodec1 = Codec.UNSIGNED5;
      byte[] byteArray0 = icBands0.encodeFlags(")[jJ&RtVK2T$ I", longArray0, bHSDCodec0, bHSDCodec1, false);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPString> linkedList0 = new LinkedList<CPString>();
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPString cPString0 = new CPString(cPUTF8_0);
      cPString0.setIndex(1048576);
      linkedList0.add(cPString0);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {1048577}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPString> linkedList0 = new LinkedList<CPString>();
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPString cPString0 = new CPString(cPUTF8_0);
      cPString0.setIndex(1048576);
      linkedList0.add(cPString0);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertArrayEquals(new int[] {1048576}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      intArray0[4] = 1740;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[8];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlyPositiveDeltas();
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      segmentHeader0.pack(bufferedOutputStream0);
      assertTrue(segmentHeader0.have_file_options());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long((-1567L));
      linkedList0.add(long0);
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertArrayEquals(new long[] {(-1567L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[0];
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[0][7];
      byte[] byteArray0 = segmentHeader0.encodeFlags(" bytes from classFileVersionMinor[", longArray0, (BHSDCodec) null, (BHSDCodec) null, false);
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
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      linkedList0.add((Long) null);
      // Undeclared exception!
      try { 
        segmentHeader0.longListToArray(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.ReferencePipeline$5$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      // Undeclared exception!
      try { 
        segmentHeader0.integerListToArray(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.ReferencePipeline$4$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1238);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -1238
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
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
        segmentHeader0.encodeScalar((-259), bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -259
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar(23, (BHSDCodec) null);
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
      long[][] longArray0 = new long[3][1];
      long[] longArray1 = new long[4];
      longArray1[2] = (long) (-2284);
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeFlags("Packed META-INF/MANIFEST.MF", longArray0, bHSDCodec0, bHSDCodec0, true);
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
      long[][] longArray0 = new long[7][5];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags(">LT7}pb", longArray0, (BHSDCodec) null, (BHSDCodec) null, false);
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
      long[] longArray0 = new long[7];
      longArray0[0] = (-1443L);
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeFlags("$5hx:", longArray0, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -1443
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[1];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags(" bytes from classFileVersionMinor[", longArray0, (BHSDCodec) null, (BHSDCodec) null, true);
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
      int[] intArray0 = new int[6];
      intArray0[3] = (-1886);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeBandInt("", intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -1886
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeBandInt(" bytes from attributeDefinitionName[", intArray0, (BHSDCodec) null);
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      intArray0[0] = 1695;
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt((String) null, intArray0, bHSDCodec0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt((String) null, intArray0, bHSDCodec0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("/d3<)U", intArray0, bHSDCodec0);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[0];
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("G5 39C`pU'4w.&<", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      long[] longArray0 = new long[9];
      longArray0[0] = (long) 252;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[7][2];
      long[] longArray1 = new long[0];
      longArray0[0] = longArray1;
      longArray0[1] = longArray0[0];
      long[] longArray2 = new long[2];
      longArray2[0] = 1444L;
      longArray0[2] = longArray2;
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("~LVlGp^B&;2I8", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(15, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[7][0];
      long[] longArray1 = new long[5];
      longArray1[0] = (long) (-27);
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("%G<S", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int[] intArray0 = new int[8];
      intArray0[0] = (-3576);
      byte[] byteArray0 = segmentHeader0.encodeBandInt("", intArray0, bHSDCodec0);
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPString> linkedList0 = new LinkedList<CPString>();
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPString cPString0 = new CPString(cPUTF8_0);
      cPString0.setIndex(0);
      linkedList0.add(cPString0);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPString> linkedList0 = new LinkedList<CPString>();
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPString cPString0 = new CPString(cPUTF8_0);
      linkedList0.add(cPString0);
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
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      CPUTF8 cPUTF8_0 = new CPUTF8("*(=0$>f{B{?\"");
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("*(=0$>f{B{?\"", cPUTF8_0, linkedList1);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      cPNameAndType0.setIndex(0);
      linkedList0.add(cPNameAndType0);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      CPUTF8 cPUTF8_0 = new CPUTF8("*(=0$>f{B{?\"");
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("*(=0$>f{B{?\"", cPUTF8_0, linkedList1);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      linkedList0.add(cPNameAndType0);
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
  public void test39()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      bandSet_BandData0.numDistinctValues();
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
      assertFalse(bandSet_BandData0.anyNegatives());
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[7];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlyPositiveDeltas();
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      intArray0[3] = (-1765);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.wellCorrelated());
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[5];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(26);
      linkedList0.add(integer0);
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BandSet.BandAnalysisResults bandSet_BandAnalysisResults0 = segmentHeader0.new BandAnalysisResults();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(3177, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte) (-23), (byte)46}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("Index should be > 0", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[1];
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertEquals(1, byteArray0.length);
  }
}
