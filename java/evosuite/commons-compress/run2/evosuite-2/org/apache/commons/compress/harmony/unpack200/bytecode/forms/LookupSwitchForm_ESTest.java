
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
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(1, "e_|TzFpi.;|)y|A");
      ByteCode byteCode0 = ByteCode.getByteCode(1719);
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      intArray0[1] = 1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 53);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      assertEquals(20, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(71, "&S&h%*T19+yK+..+q");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, (OperandManager) null, (-348));
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
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(1, "e_|TzFpi.;|)y|A");
      ByteCode byteCode0 = ByteCode.getByteCode(1719);
      int[] intArray0 = new int[5];
      intArray0[2] = 1719;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 53);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-3622), "");
      ByteCode byteCode0 = ByteCode.getByteCode(2587);
      int[] intArray0 = new int[6];
      intArray0[0] = (-3622);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 2587);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm", e);
      }
  }
}
