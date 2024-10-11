
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
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipEightByteInteger_ESTest extends ZipEightByteInteger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(910L);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte) (-114), (byte)3, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-393L));
      byte[] byteArray0 = zipEightByteInteger0.getBytes();
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)119, (byte) (-2), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
      assertEquals((short) (-393), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-128);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0, 1);
      assertEquals((short)128, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-110);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertEquals((short) (-28160), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(2320L);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertArrayEquals(new byte[] {(byte)16, (byte)9, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((short)2320, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-67);
      BigInteger bigInteger0 = ZipEightByteInteger.getValue(byteArray0);
      assertEquals((short)189, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-1081L));
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((short) (-1081), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)112;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertEquals((short)112, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1));
      BigInteger bigInteger0 = new BigInteger(799, (-1), mockRandom0);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      BigInteger bigInteger1 = zipEightByteInteger0.getValue();
      assertEquals((byte) (-49), bigInteger1.byteValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(0L);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-43);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0, (int) (byte)0);
      assertEquals((-3098476543630901248L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = ZipEightByteInteger.getBytes(2320L);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(2320L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-7);
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals((-504403158265495552L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-393L));
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals((-393L), long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue((byte[]) null, (-128));
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
      BigInteger bigInteger0 = BigInteger.ONE;
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getValue(byteArray0, (int) (short)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-393L));
      byte[] byteArray0 = zipEightByteInteger0.getBytes();
      ZipEightByteInteger zipEightByteInteger1 = null;
      try {
        zipEightByteInteger1 = new ZipEightByteInteger(byteArray0, 1324);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1331
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
      byte[] byteArray0 = new byte[6];
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
      MockRandom mockRandom0 = new MockRandom(65280L);
      BigInteger bigInteger0 = new BigInteger(0, mockRandom0);
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      BigInteger bigInteger1 = ZipEightByteInteger.getValue(byteArray0, 0);
      assertTrue(bigInteger1.equals((Object)bigInteger0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-4);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      byte[] byteArray1 = ZipEightByteInteger.getBytes(bigInteger0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-4)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      BigInteger bigInteger0 = zipEightByteInteger0.getValue();
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      boolean boolean0 = zipEightByteInteger0.equals(bigInteger0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      long long0 = zipEightByteInteger0.getLongValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long long0 = ZipEightByteInteger.getLongValue(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      byte[] byteArray0 = zipEightByteInteger0.getBytes();
      ZipEightByteInteger.getValue(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      String string0 = zipEightByteInteger0.toString();
      assertEquals("ZipEightByteInteger value: 0", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      boolean boolean0 = zipEightByteInteger0.equals(zipEightByteInteger0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(0L);
      zipEightByteInteger0.hashCode();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipEightByteInteger.getLongValue(byteArray0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }
}
