
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
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipLong_ESTest extends ZipLong_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)19;
      ZipLong zipLong0 = new ZipLong(byteArray0);
      ZipLong zipLong1 = new ZipLong(3119);
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertFalse(boolean0);
      assertFalse(zipLong1.equals((Object)zipLong0));
      assertEquals(1245184L, zipLong0.getValue());
      assertEquals(3119, zipLong1.getIntValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ZipLong.putLong((-2162L), byteArray0, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte) (-114), (byte) (-9), (byte) (-1), (byte) (-1), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipLong zipLong0 = new ZipLong(byteArray0, 0);
      assertEquals(0, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes(0L);
      ZipLong.getValue(byteArray0, 0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      byte[] byteArray0 = zipLong0.DD_SIG.getBytes();
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(134695760L, long0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(504);
      long long0 = zipLong0.getValue();
      assertEquals(504L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-2230L));
      long long0 = zipLong0.getValue();
      assertEquals((-2230L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((long) (byte)0);
      int int0 = zipLong0.getIntValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      int int0 = zipLong0.getIntValue();
      assertEquals(67324752, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      // Undeclared exception!
      try { 
        zipLong0.DD_SIG.putLong((byte[]) null, 67324752);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      // Undeclared exception!
      try { 
        zipLong0.putLong(byteArray0, (int) (byte) (-54));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -54
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.putLong((-2382L), (byte[]) null, 181);
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
      // Undeclared exception!
      try { 
        ZipLong.getValue((byte[]) null, (-4561));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.getValue((byte[]) null);
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
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong((byte[]) null, 1237);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0, (byte)103);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 103
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        ZipLong.putLong(0L, byteArray0, 2133);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2133
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      byte[] byteArray0 = zipLong0.LFH_SIG.getBytes();
      long long0 = ZipLong.getValue(byteArray0, 0);
      assertEquals(67324752L, long0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      long long0 = zipLong0.getValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes(0L);
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0, (-1355));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1355
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-10L));
      ZipLong zipLong1 = new ZipLong(0);
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertFalse(boolean0);
      assertFalse(zipLong1.equals((Object)zipLong0));
      assertEquals(0, zipLong1.getIntValue());
      assertEquals((-10L), zipLong0.getValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.DD_SIG;
      Object object0 = new Object();
      boolean boolean0 = zipLong0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-10L));
      boolean boolean0 = zipLong0.equals(zipLong0);
      assertTrue(boolean0);
      assertEquals((-10L), zipLong0.getValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-10L));
      int int0 = zipLong0.getIntValue();
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-10L));
      String string0 = zipLong0.toString();
      assertEquals("ZipLong value: -10", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-10L));
      zipLong0.hashCode();
      assertEquals((-10), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-10L));
      ZipLong zipLong1 = (ZipLong)zipLong0.clone();
      assertEquals((-10L), zipLong1.getValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-10L));
      byte[] byteArray0 = new byte[6];
      zipLong0.putLong(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte) (-10), (byte) (-1), (byte) (-1), (byte) (-1), (byte)0, (byte)0}, byteArray0);
      assertEquals((-10), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }
}
