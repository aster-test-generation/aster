
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
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IincForm_ESTest extends IincForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 1183;
      IincForm iincForm0 = new IincForm(1183, "^=6/):%HqX@L~a|PDf0", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(1183);
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1);
      iincForm0.setByteCodeOperands(byteCode0, operandManager0, 1183);
      assertEquals((-1), iincForm0.firstOperandIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      IincForm iincForm0 = new IincForm(1183, "^=6/):%HqX@L~a|PDf0", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(1183);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      iincForm0.setByteCodeOperands(byteCode0, operandManager0, 1183);
      assertEquals(3, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      IincForm iincForm0 = new IincForm(1183, "^=6/):%HqX@L~a|PDf0", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(1183);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands(byteCode0, (OperandManager) null, 1183);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[3];
      IincForm iincForm0 = new IincForm(0, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode((-2298));
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite iconst_3 that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IincForm iincForm0 = null;
      try {
        iincForm0 = new IincForm(0, ")%TkF=`sH3qE[Qo&v?", (int[]) null);
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
      int[] intArray0 = new int[0];
      IincForm iincForm0 = new IincForm(157, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(157);
      int[] intArray1 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands(byteCode0, operandManager0, 214);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
