
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.DoubleForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCodeForm_ESTest extends ByteCodeForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[22];
      intArray0[0] = 43;
      DoubleForm doubleForm0 = new DoubleForm(0, (String) null, intArray0);
      boolean boolean0 = doubleForm0.hasMultipleByteCodes();
      assertEquals((-1), doubleForm0.operandLength());
      assertEquals(0, doubleForm0.getOpcode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[7] = (-54);
      intArray0[8] = 175;
      ByteForm byteForm0 = new ByteForm(175, (String) null, intArray0);
      assertEquals(1, byteForm0.operandLength());
      assertEquals(175, byteForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[9];
      ByteForm byteForm0 = new ByteForm(132, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(132);
      assertEquals(132, byteCode0.getOpcode());
      
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byteForm0.setByteCodeOperands(byteCode0, operandManager0, 794);
      assertEquals((-1), byteForm0.firstOperandIndex());
      assertEquals(132, byteForm0.getOpcode());
      assertFalse(byteForm0.hasNoOperand());
      assertEquals((-1), byteForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[0];
      LocalForm localForm0 = new LocalForm(59, "Get value incomplete", intArray0);
      localForm0.fixUpByteCodeTargets((ByteCode) null, (CodeAttribute) null);
      assertEquals((-1), localForm0.operandLength());
      assertEquals(59, localForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-1954);
      FieldRefForm fieldRefForm0 = new FieldRefForm((-1954), "", intArray0);
      int int0 = fieldRefForm0.operandLength();
      assertEquals((-1954), fieldRefForm0.getOpcode());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      StringRefForm stringRefForm0 = new StringRefForm(4292, ",]&E ~", intArray0);
      int int0 = stringRefForm0.operandLength();
      assertEquals((-1), int0);
      assertEquals(4292, stringRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      FloatRefForm floatRefForm0 = new FloatRefForm(16, (String) null, intArray0);
      floatRefForm0.nestedMustStartClassPool();
      assertEquals((-1), floatRefForm0.operandLength());
      assertEquals(16, floatRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[18];
      ShortForm shortForm0 = new ShortForm((-561), "", intArray0);
      boolean boolean0 = shortForm0.hasNoOperand();
      assertFalse(boolean0);
      assertEquals((-561), shortForm0.getOpcode());
      assertEquals((-1), shortForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      LabelForm labelForm0 = new LabelForm(194, "]:1Qy5wO~{bUKB|CxL", intArray0);
      labelForm0.getRewriteCopy();
      assertEquals((-1), labelForm0.operandLength());
      assertEquals(194, labelForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(8, "opNh-xVsU<>Zs`N", intArray0);
      superInitMethodRefForm0.getRewriteCopy();
      assertEquals(8, superInitMethodRefForm0.getOpcode());
      assertEquals((-1), superInitMethodRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[5];
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm(0, (String) null, intArray0);
      narrowClassRefForm0.getRewrite();
      assertEquals(0, narrowClassRefForm0.getOpcode());
      assertEquals((-1), narrowClassRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      StringRefForm stringRefForm0 = new StringRefForm(4292, ",]&E ~", intArray0);
      stringRefForm0.getRewrite();
      assertEquals((-1), stringRefForm0.operandLength());
      assertEquals(4292, stringRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      FieldRefForm fieldRefForm0 = new FieldRefForm(0, "b^2", intArray0);
      int int0 = fieldRefForm0.getOpcode();
      assertEquals(0, int0);
      assertEquals((-1), fieldRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[0];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(803, "Zh__\"/*SDa7Jp", intArray0);
      int int0 = thisFieldRefForm0.getOpcode();
      assertEquals(803, int0);
      assertEquals((-1), thisFieldRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-993), "xOkJ>");
      int int0 = wideForm0.getOpcode();
      assertEquals(1, wideForm0.operandLength());
      assertEquals((-993), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[6];
      LongForm longForm0 = new LongForm(230, (String) null, intArray0);
      longForm0.getName();
      assertEquals(230, longForm0.getOpcode());
      assertEquals((-1), longForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[0];
      FloatRefForm floatRefForm0 = new FloatRefForm((-2004), "ifeq", intArray0);
      floatRefForm0.getName();
      assertEquals((-1), floatRefForm0.operandLength());
      assertEquals((-2004), floatRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[18];
      ShortForm shortForm0 = new ShortForm((-561), "", intArray0);
      shortForm0.getName();
      assertEquals((-1), shortForm0.operandLength());
      assertEquals((-561), shortForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(241);
      assertNull(byteCodeForm0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(18);
      assertEquals(18, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LabelForm labelForm0 = (LabelForm)ByteCodeForm.get(200);
      labelForm0.calculateOperandPosition();
      assertEquals(4, labelForm0.operandLength());
      assertEquals("goto_w", labelForm0.getName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(0);
      assertEquals(0, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1254), (String) null);
      int int0 = lookupSwitchForm0.firstOperandIndex();
      assertEquals((-1254), lookupSwitchForm0.getOpcode());
      assertEquals(0, int0);
      assertEquals(1, lookupSwitchForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[18];
      intArray0[2] = (-561);
      ShortForm shortForm0 = new ShortForm((-561), "", intArray0);
      int int0 = shortForm0.firstOperandIndex();
      assertEquals(2, int0);
      assertEquals(1, shortForm0.operandLength());
      assertEquals((-561), shortForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[5];
      ShortForm shortForm0 = new ShortForm(528, "", intArray0);
      int int0 = shortForm0.firstOperandIndex();
      assertEquals((-1), shortForm0.operandLength());
      assertEquals(528, shortForm0.getOpcode());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(194, "!v", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(11);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        superMethodRefForm0.setByteCodeOperands(byteCode0, operandManager0, 194);
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
      int[] intArray0 = new int[0];
      NewClassRefForm newClassRefForm0 = new NewClassRefForm(1396, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(7);
      int[] intArray1 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1);
      // Undeclared exception!
      try { 
        newClassRefForm0.setByteCodeOperands(byteCode0, operandManager0, 5);
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
        ByteCodeForm.get((-2930));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2930
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[7];
      ShortForm shortForm0 = new ShortForm((-561), "gTkT/[*\"e0'q0^OK?C", intArray0);
      boolean boolean0 = shortForm0.hasMultipleByteCodes();
      assertEquals((-561), shortForm0.getOpcode());
      assertFalse(boolean0);
      assertEquals((-1), shortForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[5];
      LongForm longForm0 = new LongForm((-337), "JSt%HW[A`E%", intArray0);
      boolean boolean0 = longForm0.nestedMustStartClassPool();
      assertEquals((-1), longForm0.operandLength());
      assertFalse(boolean0);
      assertEquals((-337), longForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[4];
      byte[] byteArray0 = new byte[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(2965, 2965, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(2965, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[7];
      ShortForm shortForm0 = new ShortForm((-561), "gTkT/[*\"e0'q0^OK?C", intArray0);
      String string0 = shortForm0.toString();
      assertEquals((-1), shortForm0.operandLength());
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ShortForm(gTkT/[*\"e0'q0^OK?C)", string0);
      assertEquals((-561), shortForm0.getOpcode());
  }
}
