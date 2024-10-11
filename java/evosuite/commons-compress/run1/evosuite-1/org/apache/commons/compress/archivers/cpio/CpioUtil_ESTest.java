
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


package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.cpio.CpioUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CpioUtil_ESTest extends CpioUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray((-117L), 2, false);
      assertArrayEquals(new byte[] {(byte) (-117), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = CpioUtil.fileType((-1320L));
      assertEquals(61440L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-1);
      long long0 = CpioUtil.byteArray2long(byteArray0, false);
      assertEquals(16711680L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray((-2423L), 108, true);
      long long0 = CpioUtil.byteArray2long(byteArray0, true);
      assertEquals((-2423L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CpioUtil.long2byteArray(0L, 3592, true);
      CpioUtil.long2byteArray(0L, 3592, true);
      // Undeclared exception!
      CpioUtil.long2byteArray(0L, 3592, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.long2byteArray(1193L, (-1368), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = CpioUtil.long2byteArray(0L, 1982, false);
      CpioUtil.byteArray2long(byteArray0, false);
      CpioUtil.byteArray2long(byteArray0, true);
      CpioUtil.byteArray2long(byteArray0, true);
      CpioUtil.byteArray2long(byteArray0, true);
      CpioUtil.byteArray2long(byteArray0, false);
      // Undeclared exception!
      CpioUtil.byteArray2long(byteArray0, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.byteArray2long((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        CpioUtil.byteArray2long(byteArray0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.long2byteArray((-353L), (byte)0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        CpioUtil.long2byteArray(3529, 3529, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        CpioUtil.byteArray2long(byteArray0, false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = CpioUtil.fileType(142);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CpioUtil cpioUtil0 = new CpioUtil();
  }
}
