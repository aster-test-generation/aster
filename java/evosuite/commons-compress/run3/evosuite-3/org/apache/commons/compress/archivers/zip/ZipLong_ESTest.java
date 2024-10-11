
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
      byte[] byteArray0 = new byte[4];
      ZipLong zipLong0 = new ZipLong(byteArray0, 0);
      ZipLong zipLong1 = new ZipLong((-3558));
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertFalse(boolean0);
      assertFalse(zipLong1.equals((Object)zipLong0));
      assertEquals((-3558L), zipLong1.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long long0 = ZipLong.getValue(byteArray0, (int) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes(0L);
      ZipLong.getValue(byteArray0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)79;
      ZipLong zipLong0 = new ZipLong(byteArray0);
      long long0 = zipLong0.getValue();
      assertEquals(79L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-4429));
      long long0 = zipLong0.getValue();
      assertEquals((-4429L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      int int0 = zipLong0.getIntValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-676L));
      int int0 = zipLong0.getIntValue();
      assertEquals((-676), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      // Undeclared exception!
      try { 
        zipLong0.AED_SIG.putLong((byte[]) null, (-1459));
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
      ZipLong zipLong0 = ZipLong.AED_SIG;
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        zipLong0.LFH_SIG.putLong(byteArray0, 134630224);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 134630224
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.putLong(1452L, (byte[]) null, 0);
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
      // Undeclared exception!
      try { 
        ZipLong.getValue((byte[]) null, (-190));
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
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0, (int) (byte)96);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 96
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong((byte[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0, (byte) (-94));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -94
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ZipLong.putLong((long) 134630224, byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)80, (byte)75, (byte)6, (byte)8}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes((-3625L));
      long long0 = ZipLong.getValue(byteArray0, 0);
      assertEquals(4294963671L, long0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0);
      long long0 = zipLong0.getValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes(0L);
      // Undeclared exception!
      try { 
        ZipLong.putLong(0L, byteArray0, 661);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 661
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      ZipLong zipLong1 = ZipLong.AED_SIG;
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertEquals(134630224L, zipLong1.getValue());
      assertFalse(zipLong1.equals((Object)zipLong0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(3666);
      boolean boolean0 = zipLong0.equals("ZipLong value: 67324752");
      assertFalse(boolean0);
      assertEquals(3666, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      boolean boolean0 = zipLong0.equals(zipLong0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(3666);
      byte[] byteArray0 = zipLong0.getBytes();
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(3666L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(3666);
      int int0 = zipLong0.getIntValue();
      assertEquals(3666, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(3666);
      String string0 = zipLong0.LFH_SIG.toString();
      assertEquals("ZipLong value: 67324752", string0);
      assertEquals(3666, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(3666);
      zipLong0.hashCode();
      assertEquals(3666, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      Object object0 = zipLong0.clone();
      assertNotSame(zipLong0, object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(3666);
      byte[] byteArray0 = zipLong0.getBytes();
      zipLong0.CFH_SIG.putLong(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)80, (byte)75, (byte)1, (byte)2}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }
}
