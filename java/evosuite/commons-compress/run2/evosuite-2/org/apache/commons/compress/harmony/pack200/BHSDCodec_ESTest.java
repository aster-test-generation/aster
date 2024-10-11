
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
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BHSDCodec_ESTest extends BHSDCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      bHSDCodec0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      bHSDCodec0.encode(128);
      int[] intArray0 = new int[9];
      intArray0[0] = 3;
      intArray0[1] = 3;
      intArray0[2] = 3;
      intArray0[3] = 3;
      intArray0[4] = 3;
      intArray0[5] = 3;
      intArray0[6] = 3;
      intArray0[7] = 3;
      intArray0[8] = 3;
      bHSDCodec0.SIGNED5.encode(intArray0);
      bHSDCodec0.cardinality();
      bHSDCodec0.getH();
      bHSDCodec0.hashCode();
      bHSDCodec0.isDelta();
      bHSDCodec0.BYTE1.encode(3);
      bHSDCodec0.hashCode();
      bHSDCodec0.toString();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 3);
      try { 
        bHSDCodec0.decode((InputStream) bufferedInputStream0, 4294967296L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2);
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(2147483646, 2);
      assertEquals(765L, bHSDCodec0.largest());
      assertArrayEquals(new byte[] {(byte) (-4), (byte) (-4), (byte) (-4), (byte) (-4), (byte) (-4)}, byteArray0);
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[3];
      intArray0[0] = 256;
      byte[] byteArray0 = bHSDCodec0.MDELTA5.encode(intArray0);
      assertArrayEquals(new byte[] {(byte) (-43), (byte)2, (byte) (-1), (byte)12, (byte)0}, byteArray0);
      assertFalse(bHSDCodec0.isSigned());
      assertFalse(bHSDCodec0.isDelta());
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(5, 5);
      assertEquals(199155L, bHSDCodec0.largest());
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      long long0 = bHSDCodec0.smallest();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      int int0 = bHSDCodec0.getS();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int int0 = bHSDCodec0.getL();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte)125);
      assertEquals(8, byteArrayInputStream0.available());
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)28;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(8, byteArrayInputStream0.available());
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      try { 
        bHSDCodec0.encode((-4805), (-4805));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value -4805
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(3, 3);
      try { 
        bHSDCodec0.encode((-2147483646));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,3) does not encode the value -2147483646
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2);
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts(2, (InputStream) null, 3588);
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
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 3);
      // Undeclared exception!
      try { 
        bHSDCodec0.UDELTA5.decodeInts(4, (InputStream) pipedInputStream0, 4);
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
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-2131922171), (InputStream) null, 4);
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
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      // Undeclared exception!
      try { 
        bHSDCodec0.MDELTA5.decodeInts(64, (InputStream) null);
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
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        bHSDCodec0.BRANCH5.decodeInts((int) (byte) (-76), (InputStream) sequenceInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-2073432486), (InputStream) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      // Undeclared exception!
      try { 
        bHSDCodec0.BYTE1.decode((InputStream) null, (long) 256);
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
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        bHSDCodec0.SIGNED5.decode((InputStream) pipedInputStream0);
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
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.BRANCH5.decode((InputStream) sequenceInputStream0);
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
      String string0 = bHSDCodec0.toString();
      assertEquals("(5,4,2)", string0);
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
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      boolean boolean0 = bHSDCodec0.encodes(164L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(3, 3);
      boolean boolean0 = bHSDCodec0.encodes((-1L));
      assertEquals(3315L, bHSDCodec0.largest());
      assertFalse(bHSDCodec0.isDelta());
      assertFalse(boolean0);
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = new int[7];
      intArray0[1] = 5;
      byte[] byteArray0 = bHSDCodec0.UDELTA5.encode(intArray0);
      assertFalse(bHSDCodec0.isDelta());
      assertFalse(bHSDCodec0.isSigned());
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      String string0 = bHSDCodec0.UDELTA5.toString();
      assertEquals("(5,64,0,1)", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2);
      bHSDCodec0.equals((Object) null);
      assertEquals(765L, bHSDCodec0.largest());
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(3, 3);
      boolean boolean0 = bHSDCodec0.encodes(86956L);
      assertEquals(3315L, bHSDCodec0.largest());
      assertFalse(boolean0);
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2);
      int[] intArray0 = bHSDCodec0.BYTE1.decodeInts(0, (InputStream) null, 40);
      assertFalse(bHSDCodec0.isDelta());
      assertEquals(765L, bHSDCodec0.largest());
      assertEquals(0L, bHSDCodec0.smallest());
      assertArrayEquals(new int[] {40}, intArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2);
      bHSDCodec0.decodeInts(0, (InputStream) null);
      assertFalse(bHSDCodec0.isDelta());
      assertEquals(0L, bHSDCodec0.smallest());
      assertEquals(765L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-125);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.BRANCH5.decode((InputStream) byteArrayInputStream0);
      assertEquals(4, byteArrayInputStream0.available());
      assertEquals((-33), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.BRANCH5.decode((InputStream) byteArrayInputStream0);
      assertEquals(4, byteArrayInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = bHSDCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte)125);
      assertEquals(8, byteArrayInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      try { 
        bHSDCodec0.DELTA5.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Delta encoding used without passing in last value; this is a coding error
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decode((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(3, 1);
      assertEquals(0L, bHSDCodec0.smallest());
      assertEquals(765L, bHSDCodec0.largest());
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(1, 64);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // b=1 -> h=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(2, 2, 2, 425);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=d<=1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(4, 4, 98, 98);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=s<=2
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(2, 2, (-2164));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=s<=2
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(3, 2002);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(3, (-701));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(980, 980, 980);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec((-1), 128, (-90));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 2, 2);
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 882, (-6814));
      try { 
        bHSDCodec0.CHAR3.decode((InputStream) byteArrayInputStream0, (long) (-6814));
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int int0 = bHSDCodec0.getB();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      long long0 = bHSDCodec0.largest();
      assertEquals(86955L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int int0 = bHSDCodec0.getS();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int int0 = bHSDCodec0.getL();
      assertEquals(252, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      long long0 = bHSDCodec0.smallest();
      assertEquals((-21739L), long0);
  }
}
