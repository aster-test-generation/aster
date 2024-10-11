
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
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
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
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = new int[5];
      byte[] byteArray0 = bHSDCodec0.encode(intArray0);
      assertFalse(bHSDCodec0.isDelta());
      assertFalse(bHSDCodec0.isSigned());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int[] intArray0 = new int[9];
      intArray0[0] = 2;
      byte[] byteArray0 = bHSDCodec0.BRANCH5.encode(intArray0);
      assertFalse(bHSDCodec0.isSigned());
      assertArrayEquals(new byte[] {(byte)2, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      long long0 = bHSDCodec0.smallest();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      int int0 = bHSDCodec0.getS();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int int0 = bHSDCodec0.getL();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(1, 1);
      assertArrayEquals(new byte[] {(byte)2}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.BCI5.decodeInts(37, (InputStream) null, 2147483605);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        bHSDCodec0.DELTA5.decodeInts(1, (InputStream) pushbackInputStream0, 1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        bHSDCodec0.BYTE1.decodeInts(2, (InputStream) pipedInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      // Undeclared exception!
      try { 
        bHSDCodec0.decodeInts((-616), (InputStream) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      // Undeclared exception!
      try { 
        bHSDCodec0.BCI5.decode((InputStream) null, (long) 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1035), (byte)3);
      // Undeclared exception!
      try { 
        bHSDCodec0.BRANCH5.decode((InputStream) byteArrayInputStream0, (-5197L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1035
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        bHSDCodec0.decode((InputStream) mockFileInputStream0, 4294967293L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
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
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-90), 2453);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)4);
      // Undeclared exception!
      try { 
        bHSDCodec0.BRANCH5.decode((InputStream) pushbackInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -90
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.decode((InputStream) sequenceInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      String string0 = bHSDCodec0.UNSIGNED5.toString();
      assertEquals("(5,64)", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      boolean boolean0 = bHSDCodec0.isSigned();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      boolean boolean0 = bHSDCodec0.isDelta();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      boolean boolean0 = bHSDCodec0.encodes(3L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      boolean boolean0 = bHSDCodec0.encodes((-30L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      long long0 = bHSDCodec0.cardinality();
      assertEquals(4346097856L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      String string0 = bHSDCodec0.UDELTA5.toString();
      assertEquals("(5,64,0,1)", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      String string0 = bHSDCodec0.SIGNED5.toString();
      assertEquals("(5,64,1)", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      Object object0 = new Object();
      boolean boolean0 = bHSDCodec0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      try { 
        bHSDCodec0.BYTE1.encode(1260, 2168);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (1,256) does not encode the value 1260
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(4, 4);
      int[] intArray0 = new int[2];
      intArray0[0] = 4;
      byte[] byteArray0 = bHSDCodec0.UDELTA5.encode(intArray0);
      assertArrayEquals(new byte[] {(byte)4, (byte) (-4), (byte) (-4), (byte) (-4), (byte) (-4), (byte) (-4)}, byteArray0);
      assertEquals(21675L, bHSDCodec0.largest());
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int[] intArray0 = new int[2];
      intArray0[0] = (-3285);
      byte[] byteArray0 = bHSDCodec0.SIGNED5.encode(intArray0);
      assertArrayEquals(new byte[] {(byte) (-23), (byte)99, (byte)0}, byteArray0);
      assertFalse(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      try { 
        bHSDCodec0.CHAR3.encode((-1542));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The codec (3,128) does not encode the value -1542
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        bHSDCodec0.MDELTA5.decodeInts(1632, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 37);
      int int0 = bHSDCodec0.UDELTA5.decode((InputStream) pushbackInputStream0, (-250L));
      assertEquals(7, byteArrayInputStream0.available());
      assertEquals((-250), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(5, 5);
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.DELTA5.decode((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Delta encoding used without passing in last value; this is a coding error
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        bHSDCodec0.decode((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(2, 1);
      assertEquals(510L, bHSDCodec0.largest());
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(3, 64, 64);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0<=s<=2
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(2, 2100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(5, (-946), 1458, 1503);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=h<=256
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec(2078, 2078, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BHSDCodec bHSDCodec0 = null;
      try {
        bHSDCodec0 = new BHSDCodec((-502), (-2012), (-2012));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1<=b<=5
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int int0 = bHSDCodec0.getB();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      long long0 = bHSDCodec0.largest();
      assertEquals(4210815L, long0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      int int0 = bHSDCodec0.getS();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BHSDCodec bHSDCodec0 = new BHSDCodec(4, 4);
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bHSDCodec0.DELTA5.decode((InputStream) sequenceInputStream0, (long) 0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      int int0 = bHSDCodec0.getL();
      assertEquals(192, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      int int0 = bHSDCodec0.getH();
      assertEquals(256, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = bHSDCodec0.encode(3);
      assertArrayEquals(new byte[] {(byte)4}, byteArray0);
      assertFalse(bHSDCodec0.isDelta());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      long long0 = bHSDCodec0.smallest();
      assertEquals((-2147483648L), long0);
  }
}
