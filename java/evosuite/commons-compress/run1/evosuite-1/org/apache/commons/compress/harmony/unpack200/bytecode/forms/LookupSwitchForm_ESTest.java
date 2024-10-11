
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LookupSwitchForm_ESTest extends LookupSwitchForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(73, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[7];
      int[] intArray1 = new int[4];
      intArray1[0] = 257;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 1641);
      assertEquals(11, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(161, "");
      ByteCode byteCode0 = ByteCode.getByteCode(54);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, (OperandManager) null, 161);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1019), "");
      ByteCode byteCode0 = ByteCode.getByteCode((-1019));
      int[] intArray0 = new int[5];
      intArray0[0] = (-1019);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-1019));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(73, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[7];
      intArray0[1] = 73;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 1641);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1);
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(1, "1O");
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 1);
      assertEquals(19, byteCode0.getLength());
  }
}
