
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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.BandSet;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPDouble;
import org.apache.commons.compress.harmony.pack200.CPInt;
import org.apache.commons.compress.harmony.pack200.CPMethodOrField;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.harmony.pack200.CPSignature;
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
      int[] intArray0 = new int[2];
      intArray0[0] = 2186;
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[7];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      segmentHeader0.pack(byteArrayOutputStream0);
      assertEquals(20, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\uFFFD\r\u0007\uFFFD\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long(0L);
      linkedList0.add(long0);
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertArrayEquals(new long[] {0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.offer((Integer) bHSDCodec0.lastBandLength);
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[0];
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeScalar((-1635), bHSDCodec0);
      assertArrayEquals(new byte[] {(byte) (-53), (byte)99}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[0][4];
      byte[] byteArray0 = segmentHeader0.encodeFlags("9]VHFG`B", longArray0, (BHSDCodec) null, (BHSDCodec) null, false);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        segmentHeader0.pack(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      intArray0[0] = 2429;
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeScalar(intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 2429
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeScalar(1853, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 1853
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      // Undeclared exception!
      try { 
        segmentHeader0.encodeScalar((-225), (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      long[][] longArray0 = new long[4][8];
      long[] longArray1 = new long[7];
      longArray1[3] = (-1141L);
      longArray0[1] = longArray1;
      BHSDCodec bHSDCodec1 = Codec.CHAR3;
      try { 
        segmentHeader0.encodeFlags("$H;$tE,dOKFX", longArray0, bHSDCodec1, bHSDCodec0, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -1141
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      long[][] longArray0 = new long[1][6];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("", longArray0, (BHSDCodec) null, bHSDCodec0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[3];
      longArray0[0] = (long) (-1838);
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeFlags(" bytes from bcCaseCount[", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[7];
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("=^rY[p\"f8P", longArray0, (BHSDCodec) null, (BHSDCodec) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[9];
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        segmentHeader0.encodeFlags("{@`", longArray0, bHSDCodec0, bHSDCodec0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[8];
      intArray0[0] = (-3077);
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        segmentHeader0.encodeBandInt("Index should be > 0", intArray0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -3077
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPDouble> linkedList0 = new LinkedList<CPDouble>();
      linkedList0.add((CPDouble) null);
      // Undeclared exception!
      try { 
        segmentHeader0.cpEntryListToArray(linkedList0);
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
      int[] intArray0 = new int[9];
      intArray0[0] = 248;
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("", intArray0, bHSDCodec0);
      assertEquals(12, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[6];
      intArray0[0] = (-2027);
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("qjI]/aGEGC sOd j", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte) (-21), (byte)123, (byte) (-50), (byte)39, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[6];
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("qjI]/aGEGC sOd j", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[0];
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt("\"@6=92]M,`y8-_kE", intArray0, bHSDCodec0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 128);
      // Undeclared exception!
      try { 
        icBands0.encodeBandInt("d}|$*{|eha", (int[]) null, (BHSDCodec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[2];
      longArray0[0] = (long) 220;
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("# sfVs7'", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertArrayEquals(new byte[] {(byte) (-23), (byte)0, (byte) (-36), (byte)0, (byte) (-28), (byte) (-7), (byte) (-4), (byte) (-4), (byte) (-4)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      intArray0[0] = 2186;
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt(" bytes from bcLongRef[", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte) (-54), (byte)31, (byte) (-10), (byte) (-38), (byte) (-4), (byte) (-4), (byte) (-4)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[2][2];
      long[] longArray1 = new long[6];
      longArray1[0] = (-3728L);
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
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
      long[][] longArray0 = new long[5][2];
      long[] longArray1 = new long[2];
      longArray1[0] = (long) (-5889);
      longArray0[0] = longArray1;
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("d", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = segmentHeader0.encodeBandInt(" bytes from bcLongRef[", intArray0, bHSDCodec0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[][] longArray0 = new long[8][1];
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = segmentHeader0.encodeFlags("bcShort", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      long[] longArray0 = new long[0];
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = segmentHeader0.encodeFlags("Index should be > 0", longArray0, bHSDCodec0, bHSDCodec0, false);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      CPUTF8 cPUTF8_0 = new CPUTF8("5$[q.BG1|Pf");
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("5$[q.BG1|Pf", cPUTF8_0, linkedList1);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      linkedList0.add(cPNameAndType0);
      cPNameAndType0.setIndex(812);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {813}, intArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPDouble> linkedList0 = new LinkedList<CPDouble>();
      linkedList0.add((CPDouble) null);
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPMethodOrField> linkedList0 = new LinkedList<CPMethodOrField>();
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      linkedList0.add(cPMethodOrField0);
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
  public void test38()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPInt> linkedList0 = new LinkedList<CPInt>();
      int[] intArray0 = segmentHeader0.cpEntryOrNullListToArray(linkedList0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      CPUTF8 cPUTF8_0 = new CPUTF8("5$[q.BG1|Pf");
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("5$[q.BG1|Pf", cPUTF8_0, linkedList1);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      linkedList0.add(cPNameAndType0);
      cPNameAndType0.setIndex(812);
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      assertArrayEquals(new int[] {812}, intArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPNameAndType> linkedList0 = new LinkedList<CPNameAndType>();
      CPUTF8 cPUTF8_0 = new CPUTF8("5$[q.BG1|Pf");
      LinkedList<CPClass> linkedList1 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("5$[q.BG1|Pf", cPUTF8_0, linkedList1);
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
  public void test41()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      intArray0[0] = (-2028);
      intArray0[1] = (-1810);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[2];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.wellCorrelated();
      assertFalse(bandSet_BandData0.anyNegatives());
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      bandSet_BandData0.numDistinctValues();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertFalse(bandSet_BandData0.anyNegatives());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[0];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlySmallDeltas();
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[6];
      intArray0[1] = (-1129);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(bandSet_BandData0.mainlyPositiveDeltas());
      assertTrue(boolean0);
      assertFalse(bandSet_BandData0.wellCorrelated());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<CPMethodOrField> linkedList0 = new LinkedList<CPMethodOrField>();
      int[] intArray0 = segmentHeader0.cpEntryListToArray(linkedList0);
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.anyNegatives();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[4];
      BandSet.BandData bandSet_BandData0 = segmentHeader0.new BandData(intArray0);
      boolean boolean0 = bandSet_BandData0.mainlyPositiveDeltas();
      assertTrue(bandSet_BandData0.mainlySmallDeltas());
      assertFalse(boolean0);
      assertFalse(bandSet_BandData0.anyNegatives());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      BandSet.BandAnalysisResults bandSet_BandAnalysisResults0 = segmentHeader0.new BandAnalysisResults();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      IcBands icBands0 = new IcBands(segmentHeader0, (CpBands) null, 90);
      long[][] longArray0 = new long[1][6];
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        icBands0.encodeFlags("", longArray0, bHSDCodec0, bHSDCodec0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 90
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BandSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      long[] longArray0 = segmentHeader0.longListToArray(linkedList0);
      assertEquals(0, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[8];
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
}
