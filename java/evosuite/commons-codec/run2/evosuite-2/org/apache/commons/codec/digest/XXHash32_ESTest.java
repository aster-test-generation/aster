
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
import org.apache.commons.codec.digest.XXHash32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XXHash32_ESTest extends XXHash32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[5];
      xXHash32_0.update(byteArray0, 1336530510, 1336530510);
      assertEquals(2363252416L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[20];
      xXHash32_0.update(byteArray0, 0, 0);
      assertEquals(46947589L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[20];
      byteArray0[13] = (byte)20;
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte)0, 3673);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(0);
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-95);
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte)0, 80);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.update(572);
      long long0 = xXHash32_0.getValue();
      assertEquals(3236746499L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.update(600);
      xXHash32_0.update(2726);
      xXHash32_0.update((-1));
      xXHash32_0.update(0);
      long long0 = xXHash32_0.getValue();
      assertEquals(3059330217L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(0);
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)42;
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte)1, 145);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[20];
      xXHash32_0.update(891);
      xXHash32_0.update(572);
      xXHash32_0.update((-1791));
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte)0, 3673);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[20];
      byteArray0[9] = (byte)20;
      xXHash32_0.update(byteArray0, (int) (byte)0, 16);
      long long0 = xXHash32_0.getValue();
      assertEquals(1864147619L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(1);
      byte[] byteArray0 = new byte[7];
      xXHash32_0.update(byteArray0, 1, 1);
      assertEquals(47929707L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      // Undeclared exception!
      try { 
        xXHash32_0.update((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[20];
      xXHash32_0.update(0);
      xXHash32_0.update(byteArray0, 0, 16);
      assertEquals(3043956479L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[20];
      xXHash32_0.update(byteArray0, 924, (-1791));
      assertEquals(46947589L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[33];
      xXHash32_0.update(byteArray0, 6, 26);
      long long0 = xXHash32_0.getValue();
      assertEquals(1613349335L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.reset();
      assertEquals(46947589L, xXHash32_0.getValue());
  }
}
