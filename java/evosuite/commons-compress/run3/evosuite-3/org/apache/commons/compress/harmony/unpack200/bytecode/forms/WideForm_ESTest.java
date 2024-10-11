
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WideForm_ESTest extends WideForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-653), "Nx<)gf5Mt|U,");
      ByteCode byteCode0 = ByteCode.getByteCode(1034);
      int[] intArray0 = new int[3];
      intArray0[0] = 1978;
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      wideForm0.setByteCodeOperandsFormat2(1034, byteCode0, operandManager0, (-653));
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WideForm wideForm0 = new WideForm(203, "-g,v");
      ByteCode byteCode0 = ByteCode.getByteCode(6);
      int[] intArray0 = new int[2];
      intArray0[0] = 203;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat1(0, byteCode0, operandManager0, 203);
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WideForm wideForm0 = new WideForm(132, (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode(132);
      int[] intArray0 = new int[3];
      intArray0[0] = 132;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 42);
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WideForm wideForm0 = new WideForm(203, "-g,v");
      ByteCode byteCode0 = ByteCode.getByteCode(6);
      int[] intArray0 = new int[2];
      intArray0[0] = 203;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 253);
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WideForm wideForm0 = new WideForm(141, "");
      ByteCode byteCode0 = ByteCode.getByteCode(141);
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2((-1221), byteCode0, operandManager0, 368);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-653), "Nx<)gf5Mt|U,");
      ByteCode byteCode0 = ByteCode.getByteCode(1034);
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      wideForm0.setByteCodeOperandsFormat2(1034, byteCode0, operandManager0, (-653));
      wideForm0.setByteCodeOperandsFormat2(1978, byteCode0, operandManager0, (-1354));
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2(1978, byteCode0, operandManager0, (-653));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WideForm wideForm0 = new WideForm(433, "So:1^A0uH`o<aU");
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1(0, (ByteCode) null, operandManager0, 43);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WideForm wideForm0 = new WideForm(16, "");
      ByteCode byteCode0 = ByteCode.getByteCode(16);
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[0];
      int[] intArray2 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray2, intArray2, intArray1, intArray2, intArray1, intArray1, intArray0, intArray2, intArray1, intArray2, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1(4056, byteCode0, operandManager0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-376), "org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm");
      ByteCode byteCode0 = ByteCode.getByteCode((-376));
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, (OperandManager) null, 755);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      WideForm wideForm0 = new WideForm(203, "-g,v");
      ByteCode byteCode0 = ByteCode.getByteCode(6);
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat2(0, byteCode0, operandManager0, 0);
      wideForm0.setByteCodeOperandsFormat1(0, byteCode0, operandManager0, 203);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 253);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
