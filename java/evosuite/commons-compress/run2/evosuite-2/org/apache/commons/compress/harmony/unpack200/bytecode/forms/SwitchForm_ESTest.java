
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
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SwitchForm_ESTest extends SwitchForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-2548), (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode((-2548));
      byte[] byteArray0 = new byte[10];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int[] intArray1 = new int[7];
      intArray1[0] = (-2548);
      byteCode0.setByteCodeTargets(intArray1);
      byteCode0.setByteCodeIndex(0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-2548), (-2548), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-2622), "");
      ByteCode byteCode0 = ByteCode.getByteCode((-2622));
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1), (-1484), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-2548), (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode((-2548));
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[3];
      byteCode0.setByteCodeTargets(intArray0);
      byteCode0.setByteCodeIndex((byte)103);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-2548), (-2548), byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 103, Size: 9
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-2548), (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode((-2548));
      byte[] byteArray0 = new byte[10];
      int[] intArray0 = new int[4];
      byteCode0.setByteCodeIndex(0);
      byteCode0.setByteCodeTargets(intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-2548), (-2548), byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(null) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-2548), (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode((-2548));
      byte[] byteArray0 = new byte[10];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      byteCode0.setByteCodeIndex(8);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-2548), (-2548), byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
      assertEquals(8, byteCode0.getByteCodeIndex());
  }
}
