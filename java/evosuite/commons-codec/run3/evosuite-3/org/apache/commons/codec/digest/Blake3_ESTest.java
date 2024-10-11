
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.digest.Blake3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Blake3_ESTest extends Blake3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = blake3_0.doFinalize((int) (byte)73);
      assertEquals(73, byteArray0.length);
      assertNotNull(byteArray0);
      
      // Undeclared exception!
      try { 
        Blake3.keyedHash(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[3];
      Blake3 blake3_1 = blake3_0.update(byteArray0);
      assertEquals(3, byteArray0.length);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      
      Blake3 blake3_2 = blake3_0.update(byteArray0);
      assertEquals(3, byteArray0.length);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_0, blake3_2);
      assertSame(blake3_2, blake3_0);
      assertSame(blake3_2, blake3_1);
      assertNotNull(blake3_2);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(2, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.update(byteArray0, (int) (byte)0, 1);
      assertEquals(2, byteArray0.length);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(2, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(2, byteArray0.length);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = blake3_0.doFinalize(0);
      assertEquals(0, byteArray0.length);
      assertNotNull(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        blake3_0.update(byteArray0, (int) (byte)19, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 19 and length 0 out of bounds with buffer length 6
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      // Undeclared exception!
      try { 
        blake3_0.update((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.keyedHash((byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.initKeyedHash((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.initKeyDerivationFunction((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.hash((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((byte[]) null, 213, 4316);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = Blake3.hash(byteArray0);
      assertEquals(3, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      
      Blake3 blake3_0 = Blake3.initKeyedHash(byteArray1);
      assertEquals(3, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(blake3_0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Blake3.initKeyedHash(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      // Undeclared exception!
      try { 
        blake3_0.update((byte[]) null, 519, 519);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      assertEquals(0, byteArray0.length);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((int) (byte) (-56));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested bytes must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = Blake3.hash(byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertNotNull(byteArray1);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      byte[] byteArray2 = Blake3.keyedHash(byteArray1, byteArray1);
      assertEquals(7, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertEquals(32, byteArray2.length);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteArray1, byteArray2);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotNull(byteArray2);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        blake3_0.doFinalize(byteArray0, 2135, 2135);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 2135 and length 2135 out of bounds with buffer length 1
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(7, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize(byteArray0, 7, (-108));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Length must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize(byteArray0, (int) (byte) (-52), (-878));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      Blake3 blake3_1 = blake3_0.reset();
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      assertNotNull(blake3_1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      byte[] byteArray0 = blake3_0.doFinalize(5210);
      Blake3 blake3_1 = Blake3.initKeyDerivationFunction(byteArray0);
      assertNotSame(blake3_0, blake3_1);
  }
}
