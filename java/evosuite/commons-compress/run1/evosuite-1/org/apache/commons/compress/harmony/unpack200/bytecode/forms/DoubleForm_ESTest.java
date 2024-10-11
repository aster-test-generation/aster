
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DoubleForm_ESTest extends DoubleForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      DoubleForm doubleForm0 = new DoubleForm((-24), "aOKsZ3=K\"0%GD[,", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = doubleForm0.getOffset(operandManager0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[1];
      DoubleForm doubleForm0 = new DoubleForm((-2744), "*Z|:n", intArray0);
      int[] intArray1 = new int[6];
      intArray1[0] = 5;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1);
      int int0 = doubleForm0.getOffset(operandManager0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[0];
      DoubleForm doubleForm0 = new DoubleForm((-1443), "O~6l@K0ni)3]K", intArray0);
      int[] intArray1 = new int[0];
      int[] intArray2 = new int[5];
      intArray2[0] = (-1443);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray2, intArray0, intArray1, intArray2, intArray1, intArray0, intArray1, intArray2, intArray1, intArray1, intArray2, intArray2, intArray0, intArray2, intArray1, intArray2, intArray2, intArray1, intArray1);
      int int0 = doubleForm0.getOffset(operandManager0);
      assertEquals((-1443), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[7];
      DoubleForm doubleForm0 = new DoubleForm(1162, "Null nested entries are not allowed", intArray0);
      // Undeclared exception!
      try { 
        doubleForm0.getOffset((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[5];
      DoubleForm doubleForm0 = new DoubleForm(19, "Brv1/", intArray0);
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        doubleForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[1];
      DoubleForm doubleForm0 = new DoubleForm((-1969), " kfYO]?;@", intArray0);
      int int0 = doubleForm0.getPoolID();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DoubleForm doubleForm0 = null;
      try {
        doubleForm0 = new DoubleForm(113, "HuIkj1FK", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }
}
