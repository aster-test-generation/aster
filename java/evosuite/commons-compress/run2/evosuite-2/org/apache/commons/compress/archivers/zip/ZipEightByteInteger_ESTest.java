
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
      byte[] byteArray0 = new byte[9];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, 1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(65280L);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-1), (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((short) (-256), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-15);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, (int) (byte)0);
      assertEquals((short)241, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-75);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertEquals((short) (-19200), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      BigInteger bigInteger1 = ZipEightByteInteger.getValue(byteArray0);
      assertSame(bigInteger1, bigInteger0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte) (-86);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = ZipEightByteInteger.getBytes(bigInteger0);
      BigInteger bigInteger1 = ZipEightByteInteger.getValue(byteArray1);
      assertEquals(8, byteArray1.length);
      assertTrue(bigInteger1.equals((Object)bigInteger0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      BigInteger bigInteger1 = zipEightByteInteger0.getValue();
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)96;
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, (int) (byte)0);
      assertEquals(96L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-22);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 0);
      assertEquals((-1585267068834414592L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(0L);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(0L, long0);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(65280L);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(65280L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-2999L));
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals((-2999L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue((byte[]) null, (-2196));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue(byteArray0, 63);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 70
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue((byte[]) null, 0);
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
        ZipEightByteInteger.getLongValue(byteArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger((byte[]) null, 0);
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
      byte[] byteArray0 = new byte[7];
      ZipEightByteInteger zipEightByteInteger0 = null;
      try {
        zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte) (-86);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, 1);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      BigInteger bigInteger1 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertSame(bigInteger1, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = ZipEightByteInteger.getBytes(bigInteger0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1642L));
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((short) (-1642), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, (int) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      boolean boolean0 = zipEightByteInteger0.equals(bigInteger0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      String string0 = zipEightByteInteger0.toString();
      assertEquals("ZipEightByteInteger value: 0", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      boolean boolean0 = zipEightByteInteger0.ZERO.equals(zipEightByteInteger0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      zipEightByteInteger0.hashCode();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = ZipEightByteInteger.ZERO;
      byte[] byteArray0 = zipEightByteInteger0.getBytes();
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertEquals((byte)0, bigInteger0.byteValue());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes((long) (-352));
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(8, byteArray0.length);
      assertEquals((-352L), long0);
  }
}
