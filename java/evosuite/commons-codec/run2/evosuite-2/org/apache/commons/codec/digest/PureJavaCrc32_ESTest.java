
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
import org.apache.commons.codec.digest.PureJavaCrc32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PureJavaCrc32_ESTest extends PureJavaCrc32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      pureJavaCrc32_0.update((int) (byte)16);
      assertEquals(3484811241L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[15];
      byteArray0[5] = (byte) (-76);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, 1, (int) (byte)42);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)77;
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, 0, (int) (byte)106);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[15];
      byteArray0[3] = (byte) (-105);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, 1, (int) (byte)42);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-1);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, 0, (int) (byte)125);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-36);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (int) (byte)0, 2096);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      pureJavaCrc32_0.update(0);
      long long0 = pureJavaCrc32_0.getValue();
      assertEquals(3523407757L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update((byte[]) null, 1704161785, 1704161785);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[14];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (int) (byte)116, (-153));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 116
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (int) (byte)113, (-354));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 113
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[7];
      pureJavaCrc32_0.update(byteArray0, (int) (byte)0, (-4315));
      assertEquals(3324180253L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (-276), (-276));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -276
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[7];
      pureJavaCrc32_0.update(byteArray0, (int) (byte)0, (-381));
      assertEquals(4282505490L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (-100), (int) (byte) (-6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -100
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[7];
      pureJavaCrc32_0.update(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      pureJavaCrc32_0.reset();
      assertEquals(0L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      long long0 = pureJavaCrc32_0.getValue();
      assertEquals(0L, long0);
  }
}
