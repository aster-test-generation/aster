
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BHSDCodec_ESTest extends BHSDCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      bHSDCodec0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(64);
      assertArrayEquals(new byte[] {(byte) (-128)}, byteArray0);
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-86);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (-856L));
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals((-728), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-43);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte)44);
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals(160, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(5, 1662, 1662);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      long long0 = bHSDCodec0.smallest();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int int0 = bHSDCodec0.getS();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int int0 = bHSDCodec0.getL();
      assertEquals(252, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      bHSDCodec0.SIGNED5.decode((InputStream) byteArrayInputStream0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (-1L));
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(683, (InputStream) null, 683);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 256, 3);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 3);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, bufferedInputStream0);
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(2, (InputStream) sequenceInputStream0, (int) (byte)3);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-4616), (InputStream) null, 51);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.BYTE1.decodeInts(5, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        bHSDCodec0.UNSIGNED5.decodeInts(44, (InputStream) pipedInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      // Undeclared exception!
      try { 
        bHSDCodec0.CHAR3.decodeInts((-2136240277), (InputStream) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) null, 3356L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[2];
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1524), 625);
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) byteArrayInputStream0, (-325L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1524
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PipedInputStream pipedInputStream0 = new PipedInputStream(44);
      try { 
        bHSDCodec0.BCI5.decode((InputStream) pipedInputStream0, 398L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.BRANCH5.decode((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        bHSDCodec0.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = bHSDCodec0.MDELTA5.encode(1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 3);
      try { 
        bHSDCodec0.CHAR3.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      String string0 = bHSDCodec0.CHAR3.toString();
      assertEquals("(3,128)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      boolean boolean0 = bHSDCodec0.encodes(606L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      boolean boolean0 = bHSDCodec0.encodes((-2644L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int[] intArray0 = new int[7];
      intArray0[0] = (-2764);
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(intArray0);
      assertEquals(8, byteArray0.length);
      assertFalse(bHSDCodec0.isSigned());
      assertArrayEquals(new byte[] {(byte) (-41), (byte)83, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[1];
      byte[] byteArray0 = bHSDCodec0.BRANCH5.encode(intArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertFalse(bHSDCodec0.isSigned());
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = bHSDCodec0.CHAR3.encode(3, 3);
      assertArrayEquals(new byte[] {(byte)3}, byteArray0);
      assertFalse(bHSDCodec0.isDelta());
      assertFalse(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      String string0 = bHSDCodec0.UDELTA5.toString();
      assertEquals("(5,64,0,1)", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      String string0 = bHSDCodec0.SIGNED5.toString();
      assertEquals("(5,64,1)", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      Object object0 = new Object();
      boolean boolean0 = bHSDCodec0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      try { 
        bHSDCodec0.encode((-984));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (5,4) does not encode the value -984
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      byte[] byteArray0 = bHSDCodec0.UDELTA5.encode((-3470), 5);
      assertArrayEquals(new byte[] {(byte) (-19), (byte) (-58), (byte) (-4), (byte) (-4), (byte) (-4)}, byteArray0);
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        bHSDCodec0.encode(256, (-703));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int[] intArray0 = bHSDCodec0.CHAR3.decodeInts(0, (InputStream) null, 40);
      assertFalse(bHSDCodec0.isDelta());
      assertArrayEquals(new int[] {40}, intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      bHSDCodec0.decodeInts(0, (InputStream) null);
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-113);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.SIGNED5.decode((InputStream) byteArrayInputStream0);
      assertEquals((-72), int0);
      assertFalse(bHSDCodec0.isSigned());
      assertTrue(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.DELTA5.decode((InputStream) sequenceInputStream0, 4294967296L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      try { 
        bHSDCodec0.MDELTA5.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Delta encoding used without passing in last value; this is a coding error
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      byte[] byteArray0 = bHSDCodec0.BRANCH5.encode(1713);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 5);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0, 40);
      assertEquals(3, byteArrayInputStream0.available());
      
      int int0 = bHSDCodec0.BCI5.decode((InputStream) bufferedInputStream0);
      assertEquals(2284, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // b=1 -> h=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(2, 2, 2, 256);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=d<=1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(2, 3, 3, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=s<=2
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(3, 256, (-1935));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=s<=2
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(3, (-2360));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(255, 3, 255, 255);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec((-914), 760, (-914));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(4, 4);
      assertEquals(21675L, bHSDCodec0.largest());
      assertEquals(0L, bHSDCodec0.smallest());
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int int0 = bHSDCodec0.getB();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      long long0 = bHSDCodec0.largest();
      assertEquals(2147483646L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      int int0 = bHSDCodec0.getS();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      long long0 = bHSDCodec0.cardinality();
      assertEquals(256L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      bHSDCodec0.hashCode();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int int0 = bHSDCodec0.getL();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int int0 = bHSDCodec0.getH();
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = bHSDCodec0.UNSIGNED5.encode(57);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      int int0 = bHSDCodec0.BYTE1.decode((InputStream) dataInputStream0, (-2874L));
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals(57, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      long long0 = bHSDCodec0.smallest();
      assertEquals((-2147483648L), long0);
  }
}
