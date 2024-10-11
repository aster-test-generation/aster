
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


package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IntRefForm_ESTest extends IntRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 1034;
      IntRefForm intRefForm0 = new IntRefForm(165, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = intRefForm0.getOffset(operandManager0);
      assertEquals(1034, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-4084);
      IntRefForm intRefForm0 = new IntRefForm((-4084), "", intArray0, false);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      intRefForm0.getOffset(operandManager0);
      assertTrue(intRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      IntRefForm intRefForm0 = new IntRefForm((-4084), "", intArray0, false);
      // Undeclared exception!
      try { 
        intRefForm0.getOffset((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IntRefForm intRefForm0 = null;
      try {
        intRefForm0 = new IntRefForm(2224, "HimZ y&JS=5&%6Y", (int[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IntRefForm intRefForm0 = null;
      try {
        intRefForm0 = new IntRefForm(0, "+9)_lFfOX4&R", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[8];
      IntRefForm intRefForm0 = new IntRefForm(0, "org.aTache.comsons.compress.harmony.unpack200.bytecode.forms.IntRefForm", intArray0, true);
      int int0 = intRefForm0.getPoolID();
      assertEquals(2, int0);
      assertFalse(intRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[1];
      IntRefForm intRefForm0 = new IntRefForm(0, "pS_avG'V/@?:xf+", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      intRefForm0.getOffset(operandManager0);
      // Undeclared exception!
      try { 
        intRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}