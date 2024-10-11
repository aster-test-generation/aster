
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
      xXHash32_0.update(byteArray0, 1, (int) (byte)3);
      assertEquals(4270428348L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-360));
      byte[] byteArray0 = new byte[27];
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte) (-1), 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-360));
      byte[] byteArray0 = new byte[27];
      xXHash32_0.update(byteArray0, (-360), (int) (byte) (-1));
      assertEquals(1972945379L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[27];
      byteArray0[13] = (byte)18;
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, (int) (byte)0, 1857);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 27
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[27];
      byteArray0[4] = (byte)61;
      xXHash32_0.update(byteArray0, (int) (byte)0, (int) (byte)18);
      assertEquals(625374352L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(0);
      xXHash32_0.update((-102));
      long long0 = xXHash32_0.getValue();
      assertEquals(4148290360L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.update(0);
      xXHash32_0.update((-1178));
      xXHash32_0.update(0);
      xXHash32_0.update(0);
      long long0 = xXHash32_0.getValue();
      assertEquals(2934208697L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[27];
      byteArray0[8] = (byte)79;
      xXHash32_0.update(byteArray0, (int) (byte)0, (int) (byte)18);
      long long0 = xXHash32_0.getValue();
      assertEquals(2431895857L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[27];
      byteArray0[4] = (byte)61;
      xXHash32_0.update(byteArray0, (int) (byte)1, (int) (byte)18);
      assertEquals(38502588L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[27];
      byteArray0[2] = (byte) (-55);
      xXHash32_0.update((-962));
      xXHash32_0.update(byteArray0, (int) (byte)1, (int) (byte)18);
      assertEquals(1243084478L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-354));
      byte[] byteArray0 = new byte[18];
      xXHash32_0.update(byteArray0, (int) (byte)0, (int) (byte)16);
      assertEquals(3357675497L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-354));
      byte[] byteArray0 = new byte[18];
      xXHash32_0.update(byteArray0, (-354), (int) (byte)0);
      assertEquals(3370979831L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[40];
      xXHash32_0.update(byteArray0, (int) (byte)0, (int) (byte)38);
      long long0 = xXHash32_0.getValue();
      assertEquals(1478623256L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.reset();
      assertEquals(46947589L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32((-3425));
      // Undeclared exception!
      try { 
        xXHash32_0.update((byte[]) null, (-3425), 2763);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.XXHash32", e);
      }
  }
}
