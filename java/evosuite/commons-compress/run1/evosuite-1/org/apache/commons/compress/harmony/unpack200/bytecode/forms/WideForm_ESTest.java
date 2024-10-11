
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
      WideForm wideForm0 = new WideForm(132, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[2];
      intArray0[0] = 2366;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat2(2366, byteCode0, operandManager0, 132);
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WideForm wideForm0 = new WideForm(132, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[2];
      intArray0[0] = 2366;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 132);
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WideForm wideForm0 = new WideForm(6, "");
      ByteCode byteCode0 = ByteCode.getByteCode(6);
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0);
      wideForm0.setByteCodeOperandsFormat1(6, byteCode0, operandManager0, 4);
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WideForm wideForm0 = new WideForm(6, "");
      ByteCode byteCode0 = ByteCode.getByteCode(6);
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0);
      wideForm0.setByteCodeOperandsFormat2(4, byteCode0, operandManager0, 6);
      operandManager0.nextShort();
      wideForm0.setByteCodeOperandsFormat2(3793, byteCode0, operandManager0, 0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2(6, byteCode0, operandManager0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "$");
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1(0, (ByteCode) null, (OperandManager) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-205), "rEC^I|{tD;/6");
      ByteCode byteCode0 = ByteCode.getByteCode(1232);
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1(132, byteCode0, operandManager0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, (OperandManager) null, 1325);
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
      WideForm wideForm0 = new WideForm(132, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat2(2366, byteCode0, operandManager0, 132);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 132);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 2366);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      WideForm wideForm0 = new WideForm(132, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[2];
      intArray0[1] = 132;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 132);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 2366);
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-1), "org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm");
      ByteCode byteCode0 = ByteCode.getByteCode((-1));
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2((-1), byteCode0, (OperandManager) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm", e);
      }
  }
}
