
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipShort_ESTest extends ZipShort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipShort zipShort0 = ZipShort.ZERO;
      ZipShort zipShort1 = new ZipShort((-1942));
      boolean boolean0 = zipShort0.equals(zipShort1);
      assertEquals((-1942), zipShort1.getValue());
      assertFalse(boolean0);
      assertFalse(zipShort1.equals((Object)zipShort0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = ZipShort.getValue(byteArray0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)69;
      int int0 = ZipShort.getValue(byteArray0, 0);
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = ZipShort.getValue(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)69;
      int int0 = ZipShort.getValue(byteArray0);
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)69;
      ZipShort zipShort0 = new ZipShort(byteArray0, (byte)0);
      int int0 = zipShort0.getValue();
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipShort zipShort0 = new ZipShort((-564));
      int int0 = zipShort0.getValue();
      assertEquals((-564), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipShort.putShort(2, (byte[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipShort.putShort(1, byteArray0, (byte)6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ZipShort.getValue(byteArray0, (-508));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -508
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipShort.getValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort((byte[]) null, (-537));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort(byteArray0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipShort zipShort0 = null;
      try {
        zipShort0 = new ZipShort(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipShort zipShort0 = new ZipShort(byteArray0, (byte)0);
      int int0 = zipShort0.getValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipShort.putShort((byte) (-1), byteArray0, 0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipShort.getValue((byte[]) null, (-1263));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipShort zipShort0 = ZipShort.ZERO;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)45;
      ZipShort zipShort1 = new ZipShort(byteArray0);
      boolean boolean0 = zipShort0.equals(zipShort1);
      assertFalse(zipShort1.equals((Object)zipShort0));
      assertFalse(boolean0);
      assertEquals(45, zipShort1.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ZipShort zipShort0 = new ZipShort(byteArray0);
      Object object0 = new Object();
      boolean boolean0 = zipShort0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipShort zipShort0 = new ZipShort(1);
      String string0 = zipShort0.toString();
      assertEquals("ZipShort value: 1", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipShort zipShort0 = new ZipShort(byteArray0, (byte)0);
      zipShort0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipShort zipShort0 = new ZipShort(1);
      ZipShort zipShort1 = (ZipShort)zipShort0.clone();
      assertEquals(1, zipShort1.getValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ZipShort zipShort0 = new ZipShort(byteArray0);
      boolean boolean0 = zipShort0.equals(zipShort0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ZipShort zipShort0 = new ZipShort(byteArray0);
      byte[] byteArray1 = zipShort0.getBytes();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        ZipShort.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = ZipShort.getBytes(1463);
      assertArrayEquals(new byte[] {(byte) (-73), (byte)5}, byteArray0);
  }
}
