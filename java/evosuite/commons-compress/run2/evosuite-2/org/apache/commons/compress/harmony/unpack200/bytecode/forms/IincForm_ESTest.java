
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
      int[] intArray0 = new int[1];
      intArray0[0] = (-416);
      IincForm iincForm0 = new IincForm((-416), ",$)U 0g@$L^i,", intArray0);
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands((ByteCode) null, operandManager0, 917);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[6];
      IincForm iincForm0 = new IincForm(480, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(480);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      iincForm0.setByteCodeOperands(byteCode0, operandManager0, 2171);
      assertEquals(224, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      IincForm iincForm0 = new IincForm(1267, ")hU&:C:+<T@", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode((-2109));
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite monitorexit that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[3];
      IincForm iincForm0 = new IincForm(1, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, (int[]) null, (int[]) null, (int[]) null, intArray1, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, (int[]) null, intArray1, intArray0, intArray1, intArray0);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
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
      IincForm iincForm0 = null;
      try {
        iincForm0 = new IincForm(0, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }
}
