
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocalForm_ESTest extends LocalForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalForm localForm0 = new LocalForm((-2190), "{BLh,P", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(570);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      localForm0.setByteCodeOperands(byteCode0, operandManager0, (-2190));
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      LocalForm localForm0 = new LocalForm(1, "z;WvO?O$IFk5WKl9:K", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(2377);
      // Undeclared exception!
      try { 
        localForm0.setByteCodeOperands(byteCode0, (OperandManager) null, (-2868));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalForm localForm0 = new LocalForm(1570, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(538);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        localForm0.setByteCodeOperands(byteCode0, operandManager0, 1570);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite iload_0 that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LocalForm localForm0 = null;
      try {
        localForm0 = new LocalForm(0, "mpI_yaBz!ue", (int[]) null);
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
      int[] intArray0 = new int[0];
      LocalForm localForm0 = new LocalForm(0, "fconst_2", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray1 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1);
      // Undeclared exception!
      try { 
        localForm0.setByteCodeOperands(byteCode0, operandManager0, (-143));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
