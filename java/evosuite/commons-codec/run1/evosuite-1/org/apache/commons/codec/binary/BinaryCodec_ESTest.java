
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


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.binary.BinaryCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BinaryCodec_ESTest extends BinaryCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)50;
      byte[] byteArray1 = binaryCodec0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      String string0 = BinaryCodec.toAsciiString(byteArray0);
      assertEquals("0000000000000000000000000000000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = BinaryCodec.isEmpty((byte[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = BinaryCodec.isEmpty(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = BinaryCodec.toAsciiChars((byte[]) null);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = BinaryCodec.fromAscii(charArray0);
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = BinaryCodec.fromAscii((char[]) null);
      byte[] byteArray1 = BinaryCodec.fromAscii(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray((String) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      try { 
        binaryCodec0.encode((Object) "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // argument not a byte array
         //
         verifyException("org.apache.commons.codec.binary.BinaryCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = new Object();
      try { 
        binaryCodec0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // argument not a byte array
         //
         verifyException("org.apache.commons.codec.binary.BinaryCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) "00000000000000000000000000000000000000001110110000000000");
      Object object1 = binaryCodec0.encode(object0);
      Object object2 = binaryCodec0.decode(object1);
      assertNotSame(object2, object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) "");
      Object object1 = binaryCodec0.decode(object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)99;
      char[] charArray0 = BinaryCodec.toAsciiChars(byteArray0);
      byte[] byteArray1 = BinaryCodec.fromAscii(charArray0);
      assertArrayEquals(new byte[] {(byte)99, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray("");
      byte[] byteArray1 = binaryCodec0.encode(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)2;
      byte[] byteArray1 = binaryCodec0.encode(byteArray0);
      byte[] byteArray2 = BinaryCodec.fromAscii(byteArray1);
      assertArrayEquals(new byte[] {(byte)48, (byte)48, (byte)48, (byte)48, (byte)48, (byte)48, (byte)49, (byte)48}, byteArray1);
      assertArrayEquals(new byte[] {(byte)2}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray("org.apache.commons.codec.EncoderException");
      byte[] byteArray1 = binaryCodec0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = BinaryCodec.fromAscii((char[]) null);
      String string0 = BinaryCodec.toAsciiString(byteArray0);
      assertEquals("", string0);
  }
}
