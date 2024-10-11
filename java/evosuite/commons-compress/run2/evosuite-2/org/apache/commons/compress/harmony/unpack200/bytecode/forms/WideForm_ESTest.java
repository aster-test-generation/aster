
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
  public void test00()  throws Throwable  {
      WideForm wideForm0 = new WideForm(118, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      intArray0[0] = 118;
      operandManager0.nextShort();
      wideForm0.setByteCodeOperandsFormat2(118, byteCode0, operandManager0, 4);
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WideForm wideForm0 = new WideForm(1231, "iload");
      ByteCode byteCode0 = ByteCode.getByteCode(1231);
      int[] intArray0 = new int[7];
      intArray0[0] = 1231;
      int[] intArray1 = new int[2];
      intArray1[0] = 132;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 54);
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WideForm wideForm0 = new WideForm(237, ".class");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[8];
      intArray0[0] = 237;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat1(237, byteCode0, operandManager0, (-3));
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WideForm wideForm0 = new WideForm(237, ".class");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat1(237, byteCode0, operandManager0, (-3));
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WideForm wideForm0 = new WideForm(140, "W");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[8];
      intArray0[0] = 140;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 2921);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-758), "");
      ByteCode byteCode0 = ByteCode.getByteCode((-1629));
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager((int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2((-758), byteCode0, operandManager0, 2001);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WideForm wideForm0 = new WideForm(255, "");
      ByteCode byteCode0 = ByteCode.getByteCode(254);
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2(0, byteCode0, operandManager0, 255);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "");
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1(833, (ByteCode) null, operandManager0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-2182), "");
      ByteCode byteCode0 = ByteCode.getByteCode((-2182));
      int[] intArray0 = new int[9];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray1, (int[]) null, intArray0, intArray1, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1((-1), byteCode0, operandManager0, 833);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WideForm wideForm0 = new WideForm(237, ".class");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 264);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WideForm wideForm0 = new WideForm(140, "W");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 2921);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
