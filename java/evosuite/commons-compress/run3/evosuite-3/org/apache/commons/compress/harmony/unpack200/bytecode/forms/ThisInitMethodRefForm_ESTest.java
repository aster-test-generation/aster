
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ThisInitMethodRefForm_ESTest extends ThisInitMethodRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm(0, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setCurrentClass("org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm");
      String string0 = thisInitMethodRefForm0.context(operandManager0);
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm((-5286), "", intArray0);
      OperandManager operandManager0 = new OperandManager((int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0);
      operandManager0.setCurrentClass("");
      String string0 = thisInitMethodRefForm0.context(operandManager0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm(0, "", intArray0);
      // Undeclared exception!
      try { 
        thisInitMethodRefForm0.context((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThisInitMethodRefForm thisInitMethodRefForm0 = null;
      try {
        thisInitMethodRefForm0 = new ThisInitMethodRefForm(0, "B2_/1t{w+iZkyn", (int[]) null);
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
      int[] intArray0 = new int[2];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm((-1959), "\"FG0idu<NlQCtpV8,{", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        thisInitMethodRefForm0.context(operandManager0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Current class not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}