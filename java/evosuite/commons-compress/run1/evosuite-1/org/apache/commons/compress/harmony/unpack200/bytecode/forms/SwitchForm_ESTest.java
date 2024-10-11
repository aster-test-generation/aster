
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
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SwitchForm_ESTest extends SwitchForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(1, "");
      ByteCode byteCode0 = ByteCode.getByteCode(1);
      byteCode0.setByteCodeIndex(1);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byte[] byteArray0 = new byte[3];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1, 1, byteArray0, (Segment) null, operandManager0, linkedList0);
      int[] intArray1 = new int[9];
      intArray1[0] = 1;
      OperandManager operandManager1 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager1, 1);
      lookupSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
      assertFalse(lookupSwitchForm0.hasNoOperand());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-55);
      byteArray0[3] = (byte) (-86);
      CodeAttribute codeAttribute0 = new CodeAttribute(1745, 1745, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      assertEquals(1745, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, "");
      ByteCode byteCode0 = ByteCode.getByteCode(1643);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.fixUpByteCodeTargets(byteCode0, (CodeAttribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-17), "");
      ByteCode byteCode0 = ByteCode.getByteCode((-17));
      byteCode0.setByteCodeIndex(7);
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      byte[] byteArray0 = new byte[6];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-17), (-17), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 7, Size: 6
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-737), "{");
      ByteCode byteCode0 = ByteCode.getByteCode(1105);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 1105);
      byte[] byteArray0 = new byte[7];
      CodeAttribute codeAttribute0 = new CodeAttribute(1745, 1745, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-17), "");
      ByteCode byteCode0 = ByteCode.getByteCode((-17));
      byteCode0.setByteCodeIndex(0);
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      byte[] byteArray0 = new byte[6];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-17), (-17), byteArray0, (Segment) null, operandManager0, linkedList0);
      lookupSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm() but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }
}
