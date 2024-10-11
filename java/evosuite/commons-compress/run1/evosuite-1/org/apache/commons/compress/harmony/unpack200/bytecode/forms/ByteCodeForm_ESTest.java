
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCodeForm_ESTest extends ByteCodeForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 2811;
      IntRefForm intRefForm0 = new IntRefForm(2811, " but bytecode has length ", intArray0);
      boolean boolean0 = intRefForm0.hasMultipleByteCodes();
      assertFalse(boolean0);
      assertEquals(2811, intRefForm0.getOpcode());
      assertEquals((-1), intRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-3153);
      intArray0[1] = (-3153);
      NewClassRefForm newClassRefForm0 = new NewClassRefForm((-3153), (String) null, intArray0);
      assertEquals(2, newClassRefForm0.operandLength());
      assertEquals((-3153), newClassRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = (-2536);
      intArray0[2] = 195;
      FloatRefForm floatRefForm0 = new FloatRefForm(195, (String) null, intArray0, false);
      assertEquals(195, floatRefForm0.getOpcode());
      assertEquals(1, floatRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(172);
      ByteCode byteCode0 = ByteCode.getByteCode(255);
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byteCodeForm0.setByteCodeOperands(byteCode0, operandManager0, 4914);
      assertFalse(byteCodeForm0.hasNoOperand());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[9];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(239, "FieldRef: ", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(19);
      superMethodRefForm0.fixUpByteCodeTargets(byteCode0, (CodeAttribute) null);
      assertEquals(239, superMethodRefForm0.getOpcode());
      assertEquals((-1), superMethodRefForm0.operandLength());
      assertEquals("ldc_w", byteCode0.getName());
      assertFalse(superMethodRefForm0.hasNoOperand());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm((-189), "OmPDI}+y:_o/", intArray0);
      superMethodRefForm0.calculateOperandPosition();
      assertEquals((-1), superMethodRefForm0.operandLength());
      assertEquals((-189), superMethodRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-838);
      LongForm longForm0 = new LongForm((-838), "Integer: ", intArray0);
      int int0 = longForm0.operandLength();
      assertEquals(1, int0);
      assertEquals((-838), longForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalForm localForm0 = new LocalForm(23, "dconst_1", intArray0);
      int int0 = localForm0.operandLength();
      assertEquals((-1), int0);
      assertEquals(23, localForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[7];
      FloatRefForm floatRefForm0 = new FloatRefForm(195, (String) null, intArray0, false);
      floatRefForm0.nestedMustStartClassPool();
      assertEquals((-1), floatRefForm0.operandLength());
      assertEquals(195, floatRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[1];
      LongForm longForm0 = new LongForm(178, "*i", intArray0);
      boolean boolean0 = longForm0.hasNoOperand();
      assertFalse(boolean0);
      assertEquals(178, longForm0.getOpcode());
      assertEquals((-1), longForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[7];
      ClassRefForm classRefForm0 = new ClassRefForm(127, "9Fw`j*<9T^", intArray0, true);
      classRefForm0.getRewriteCopy();
      assertEquals(127, classRefForm0.getOpcode());
      assertEquals((-1), classRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperFieldRefForm superFieldRefForm0 = new SuperFieldRefForm(3, ">?NQXX", intArray0);
      superFieldRefForm0.getRewriteCopy();
      assertEquals(3, superFieldRefForm0.getOpcode());
      assertEquals((-1), superFieldRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[2];
      StringRefForm stringRefForm0 = new StringRefForm(20, "BEh!C\"Yf\">e%#WW", intArray0);
      stringRefForm0.getRewrite();
      assertEquals(20, stringRefForm0.getOpcode());
      assertEquals((-1), stringRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[0];
      DoubleForm doubleForm0 = new DoubleForm(0, "", intArray0);
      doubleForm0.getRewrite();
      assertEquals((-1), doubleForm0.operandLength());
      assertEquals(0, doubleForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[13];
      LocalForm localForm0 = new LocalForm(0, "", intArray0);
      int int0 = localForm0.getOpcode();
      assertEquals((-1), localForm0.operandLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[9];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm(64, (String) null, intArray0);
      int int0 = thisMethodRefForm0.getOpcode();
      assertEquals(64, int0);
      assertEquals((-1), thisMethodRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[5];
      DoubleForm doubleForm0 = new DoubleForm((-2470), "aconst_null", intArray0);
      int int0 = doubleForm0.getOpcode();
      assertEquals((-2470), int0);
      assertEquals((-1), doubleForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[7];
      FloatRefForm floatRefForm0 = new FloatRefForm(195, (String) null, intArray0, false);
      floatRefForm0.getName();
      assertEquals((-1), floatRefForm0.operandLength());
      assertEquals(195, floatRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NoArgumentForm noArgumentForm0 = new NoArgumentForm((-1033), "aload_0");
      noArgumentForm0.getName();
      assertEquals(1, noArgumentForm0.operandLength());
      assertEquals((-1033), noArgumentForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[5];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(188, "", intArray0);
      superInitMethodRefForm0.getName();
      assertEquals((-1), superInitMethodRefForm0.operandLength());
      assertEquals(188, superInitMethodRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get((byte)0);
      assertEquals(0, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(18);
      assertEquals("ldc", byteCodeForm0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1);
      IincForm iincForm0 = new IincForm((-1), "", intArray0);
      int int0 = iincForm0.firstOperandIndex();
      assertEquals(1, iincForm0.operandLength());
      assertEquals(0, int0);
      assertEquals((-1), iincForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = (-189);
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm((-189), "OmPDI+y:_o/", intArray0);
      int int0 = superMethodRefForm0.firstOperandIndex();
      assertEquals(1, superMethodRefForm0.operandLength());
      assertEquals(1, int0);
      assertEquals((-189), superMethodRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(2, "");
      int int0 = tableSwitchForm0.firstOperandIndex();
      assertEquals((-1), tableSwitchForm0.operandLength());
      assertEquals((-1), int0);
      assertEquals(2, tableSwitchForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[6];
      StringRefForm stringRefForm0 = new StringRefForm(2340, "Exceptions: ", intArray0, false);
      ByteCode byteCode0 = ByteCode.getByteCode(401);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        stringRefForm0.setByteCodeOperands(byteCode0, operandManager0, 166);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[1];
      LongForm longForm0 = new LongForm(1609, "Nothing but CP_METHOD can be an <init>", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(4);
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0);
      // Undeclared exception!
      try { 
        longForm0.setByteCodeOperands(byteCode0, operandManager0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteCodeForm.get(868);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 868
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 42;
      intArray0[1] = 42;
      LabelForm labelForm0 = new LabelForm(42, "lstore_0", intArray0);
      boolean boolean0 = labelForm0.hasMultipleByteCodes();
      assertEquals(42, labelForm0.getOpcode());
      assertTrue(boolean0);
      assertEquals((-1), labelForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 42;
      LabelForm labelForm0 = new LabelForm(42, "lstore_0", intArray0);
      boolean boolean0 = labelForm0.hasMultipleByteCodes();
      assertEquals(42, labelForm0.getOpcode());
      assertFalse(boolean0);
      assertEquals((-1), labelForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[3];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm((-189), "OmPDI}+y:_o/", intArray0);
      boolean boolean0 = superMethodRefForm0.hasMultipleByteCodes();
      assertEquals((-189), superMethodRefForm0.getOpcode());
      assertFalse(boolean0);
      assertEquals((-1), superMethodRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[3];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm((-189), "OmPDI}+y:_o/", intArray0);
      boolean boolean0 = superMethodRefForm0.nestedMustStartClassPool();
      assertEquals((-1), superMethodRefForm0.operandLength());
      assertFalse(boolean0);
      assertEquals((-189), superMethodRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[3];
      byte[] byteArray0 = new byte[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 8, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(0, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[3];
      LabelForm labelForm0 = new LabelForm(42, "lstore_0", intArray0);
      String string0 = labelForm0.toString();
      assertEquals(42, labelForm0.getOpcode());
      assertEquals((-1), labelForm0.operandLength());
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm(lstore_0)", string0);
  }
}
