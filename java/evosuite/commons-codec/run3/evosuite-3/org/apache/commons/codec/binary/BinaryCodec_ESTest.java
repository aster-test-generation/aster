
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
      Object object0 = binaryCodec0.decode((Object) "8;lvBvlqaml4!E");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte)104;
      byte[] byteArray1 = BinaryCodec.fromAscii(byteArray0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = BinaryCodec.isEmpty(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = BinaryCodec.isEmpty(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = binaryCodec0.encode(byteArray0);
      assertArrayEquals(new byte[] {(byte)48, (byte)48, (byte)48, (byte)48, (byte)48, (byte)48, (byte)48, (byte)48}, byteArray1);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      byte[] byteArray2 = BinaryCodec.toAsciiBytes(byteArray1);
      BinaryCodec.toAsciiChars(byteArray2);
      // Undeclared exception!
      BinaryCodec.toAsciiString(byteArray2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[3] = '1';
      byte[] byteArray0 = BinaryCodec.fromAscii(charArray0);
      assertArrayEquals(new byte[] {(byte)32}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = BinaryCodec.toAsciiChars(byteArray0);
      byte[] byteArray1 = BinaryCodec.fromAscii(charArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-66);
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      byte[] byteArray2 = BinaryCodec.fromAscii(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-66), (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = BinaryCodec.fromAscii(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray((String) null);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      try { 
        binaryCodec0.encode((Object) "00000000000000000000100000000000");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // argument not a byte array
         //
         verifyException("org.apache.commons.codec.binary.BinaryCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) "&");
      Object object1 = binaryCodec0.encode(object0);
      Object object2 = binaryCodec0.decode(object1);
      assertNotSame(object2, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) "&");
      Object object1 = binaryCodec0.decode(object0);
      assertNotSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      Object object0 = binaryCodec0.decode((Object) null);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)8;
      String string0 = BinaryCodec.toAsciiString(byteArray0);
      assertEquals("00000000000000000000100000000000", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray("");
      byte[] byteArray1 = BinaryCodec.fromAscii(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.toByteArray("00000000000000000000100000000000");
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = BinaryCodec.fromAscii((char[]) null);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)8;
      byte[] byteArray1 = BinaryCodec.toAsciiBytes(byteArray0);
      byte[] byteArray2 = binaryCodec0.decode(byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)8, (byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = binaryCodec0.decode(byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = BinaryCodec.toAsciiString((byte[]) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BinaryCodec binaryCodec0 = new BinaryCodec();
      byte[] byteArray0 = binaryCodec0.encode((byte[]) null);
      assertArrayEquals(new byte[] {}, byteArray0);
  }
}
