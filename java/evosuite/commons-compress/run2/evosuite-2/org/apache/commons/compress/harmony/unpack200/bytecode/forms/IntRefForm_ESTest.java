
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
      int[] intArray0 = new int[9];
      IntRefForm intRefForm0 = new IntRefForm(0, "][8N$-RP\"", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = intRefForm0.getOffset(operandManager0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      IntRefForm intRefForm0 = new IntRefForm(1, "", intArray0, true);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      intRefForm0.getOffset(operandManager0);
      assertFalse(intRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      IntRefForm intRefForm0 = new IntRefForm(1, "u^cg+2@p]!e;/WA' #A", intArray0, false);
      int[] intArray1 = new int[6];
      intArray1[0] = (-1320);
      OperandManager operandManager0 = new OperandManager(intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0);
      intRefForm0.getOffset(operandManager0);
      assertTrue(intRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      IntRefForm intRefForm0 = new IntRefForm((-4439), "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm", intArray0, true);
      int[] intArray1 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        intRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IntRefForm intRefForm0 = null;
      try {
        intRefForm0 = new IntRefForm((-3435), "", (int[]) null, false);
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
      int[] intArray0 = new int[6];
      IntRefForm intRefForm0 = new IntRefForm(39, (String) null, intArray0, true);
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
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[6];
      IntRefForm intRefForm0 = new IntRefForm(39, (String) null, intArray0, true);
      int int0 = intRefForm0.getPoolID();
      assertEquals(2, int0);
      assertFalse(intRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IntRefForm intRefForm0 = null;
      try {
        intRefForm0 = new IntRefForm((-1981), "~6]X_{Pq'", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }
}
