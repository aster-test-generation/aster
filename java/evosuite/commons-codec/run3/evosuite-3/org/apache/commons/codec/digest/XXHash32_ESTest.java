
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
      XXHash32 xXHash32_0 = new XXHash32((-1));
      xXHash32_0.update((-1));
      byte[] byteArray0 = new byte[25];
      xXHash32_0.update(byteArray0, (int) (byte)7, 8);
      xXHash32_0.update(byteArray0, (int) (byte)14, 8);
      assertEquals(3113165886L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-1));
      byte[] byteArray0 = new byte[25];
      xXHash32_0.update(byteArray0, (int) (byte)7, 8);
      xXHash32_0.update(byteArray0, (int) (byte)14, 8);
      assertEquals(349117316L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[0];
      xXHash32_0.update(byteArray0, 0, 0);
      assertEquals(46947589L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-1));
      byte[] byteArray0 = new byte[25];
      byteArray0[13] = (byte)7;
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte)0, 768);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 25
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-1));
      byte[] byteArray0 = new byte[25];
      byteArray0[0] = (byte)14;
      xXHash32_0.update(byteArray0, (int) (byte)7, 8);
      xXHash32_0.update(byteArray0, (int) (byte)0, 16);
      assertEquals(4266215613L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(0);
      xXHash32_0.update(0);
      xXHash32_0.update(0);
      xXHash32_0.update((-533));
      xXHash32_0.update(1729);
      long long0 = xXHash32_0.getValue();
      assertEquals(396176290L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-1));
      xXHash32_0.update((-1103));
      byte[] byteArray0 = new byte[25];
      byteArray0[5] = (byte)48;
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte)0, 768);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 25
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(0);
      // Undeclared exception!
      try { 
        xXHash32_0.update((byte[]) null, (-248), 5485);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-1));
      byte[] byteArray0 = new byte[25];
      xXHash32_0.update(byteArray0, (int) (byte)14, (-2));
      assertEquals(2422332061L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[25];
      xXHash32_0.update(byteArray0, (int) (byte)7, 8);
      long long0 = xXHash32_0.getValue();
      assertEquals(3736311059L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-1));
      byte[] byteArray0 = new byte[25];
      xXHash32_0.update(byteArray0, (int) (byte)0, 16);
      long long0 = xXHash32_0.getValue();
      assertEquals(349117316L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-1));
      xXHash32_0.reset();
      assertEquals(2422332061L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.update((-1));
      long long0 = xXHash32_0.getValue();
      assertEquals(2528958668L, long0);
  }
}
