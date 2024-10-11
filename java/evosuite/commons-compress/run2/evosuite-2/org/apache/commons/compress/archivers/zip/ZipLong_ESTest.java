
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
      ZipLong zipLong0 = ZipLong.AED_SIG;
      ZipLong zipLong1 = ZipLong.LFH_SIG;
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertFalse(boolean0);
      assertFalse(zipLong1.equals((Object)zipLong0));
      assertEquals(67324752L, zipLong1.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipLong zipLong0 = new ZipLong(byteArray0, 0);
      assertEquals(0L, zipLong0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0);
      byte[] byteArray0 = new byte[8];
      zipLong0.CFH_SIG.putLong(byteArray0, 0);
      assertEquals(0, zipLong0.getIntValue());
      assertArrayEquals(new byte[] {(byte)80, (byte)75, (byte)1, (byte)2, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      long long0 = ZipLong.getValue(byteArray0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      long long0 = ZipLong.getValue(byteArray0, (int) (byte)0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(1);
      long long0 = zipLong0.getValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-1));
      long long0 = zipLong0.getValue();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0L);
      int int0 = zipLong0.getIntValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      int int0 = zipLong0.getIntValue();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.AED_SIG;
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        zipLong0.SINGLE_SEGMENT_SPLIT_MARKER.putLong(byteArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.putLong((-290L), (byte[]) null, 0);
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
      byte[] byteArray0 = new byte[18];
      // Undeclared exception!
      try { 
        ZipLong.putLong((long) (byte)0, byteArray0, 3463);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3463
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipLong.getValue((byte[]) null, 932);
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
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong((byte[]) null, 2763);
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
      byte[] byteArray0 = new byte[2];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0, (byte)7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipLong zipLong0 = null;
      try {
        zipLong0 = new ZipLong(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(1);
      byte[] byteArray0 = zipLong0.LFH_SIG.getBytes();
      assertArrayEquals(new byte[] {(byte)80, (byte)75, (byte)3, (byte)4}, byteArray0);
      
      ZipLong.putLong(0L, byteArray0, 0);
      assertEquals(1L, zipLong0.getValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ZipLong.getValue(byteArray0, (-2763));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2763
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(0);
      long long0 = zipLong0.getValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = ZipLong.getBytes((long) (byte)0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      ZipLong zipLong1 = ZipLong.ZIP64_MAGIC;
      boolean boolean0 = zipLong0.equals(zipLong1);
      assertFalse(boolean0);
      assertEquals(4294967295L, zipLong1.getValue());
      assertFalse(zipLong1.equals((Object)zipLong0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-482L));
      boolean boolean0 = zipLong0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals((-482), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      boolean boolean0 = zipLong0.equals(zipLong0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      byte[] byteArray0 = zipLong0.LFH_SIG.getBytes();
      long long0 = ZipLong.getValue(byteArray0);
      assertEquals(67324752L, long0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(1);
      int int0 = zipLong0.getIntValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      String string0 = zipLong0.toString();
      assertEquals("ZipLong value: 67324752", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      zipLong0.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong((-482L));
      ZipLong zipLong1 = (ZipLong)zipLong0.clone();
      assertEquals((-482), zipLong1.getIntValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
      // Undeclared exception!
      try { 
        zipLong0.putLong((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(1);
      byte[] byteArray0 = zipLong0.getBytes();
      ZipLong zipLong1 = new ZipLong(byteArray0);
      assertEquals(1L, zipLong1.getValue());
      assertEquals(4, byteArray0.length);
  }
}
