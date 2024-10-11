
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
import java.math.BigInteger;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipEightByteInteger_ESTest extends ZipEightByteInteger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((-2866L));
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte) (-50), (byte) (-12), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-37);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, (int) (byte)0);
      assertEquals((short) (-9472), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      BigInteger bigInteger1 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-38);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, (int) (byte)0);
      assertEquals((short)218, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((-388L));
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertEquals((short) (-388), bigInteger0.shortValue());
      assertArrayEquals(new byte[] {(byte)124, (byte) (-2), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      byte[] byteArray0 = zipEightByteInteger0.ZERO.getBytes();
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertEquals((short)0, bigInteger0.shortValue());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(147L);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-109), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((short)147, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1367L));
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((short) (-1367), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((byte)1, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(0L);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((-3011L));
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 0);
      assertEquals((-3011L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      byte[] byteArray0 = zipEightByteInteger0.ZERO.getBytes();
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)62;
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(62L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(1L);
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1321L));
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals((-1321L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      // Undeclared exception!
      try { 
        zipEightByteInteger0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue((byte[]) null, 148);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue(byteArray0, (int) (byte)71);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 78
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      byte[] byteArray0 = zipEightByteInteger0.getBytes();
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue(byteArray0, 1998);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2005
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      // Undeclared exception!
      try { 
        zipEightByteInteger0.getLongValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getBytes((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      // Undeclared exception!
      try { 
        zipEightByteInteger0.getBytes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger((byte[]) null, 1996);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, (-119));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -112
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      byte[] byteArray0 = zipEightByteInteger0.ZERO.getBytes();
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertEquals((byte)0, bigInteger0.byteValue());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[7] = (byte) (-82);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(147L);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertArrayEquals(new byte[] {(byte) (-109), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((short)147, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-31);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = ZipEightByteInteger.getBytes(bigInteger0);
      long long0 = ZipEightByteInteger.getLongValue(byteArray1);
      assertEquals((-133143986176L), long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      String string0 = zipEightByteInteger0.toString();
      assertEquals("ZipEightByteInteger value: null", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      boolean boolean0 = zipEightByteInteger0.equals(bigInteger0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      boolean boolean0 = zipEightByteInteger0.equals(zipEightByteInteger0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      zipEightByteInteger0.hashCode();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue((byte[]) null, (-1273));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }
}
