
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCodeForm_ESTest extends ByteCodeForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-213);
      intArray0[1] = (-213);
      IntRefForm intRefForm0 = new IntRefForm((-213), "X20(f", intArray0);
      assertEquals((-213), intRefForm0.getOpcode());
      assertEquals(2, intRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1083);
      intArray0[1] = 195;
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm(196, (String) null, intArray0);
      assertEquals(196, narrowClassRefForm0.getOpcode());
      assertEquals(1, narrowClassRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[3];
      IincForm iincForm0 = new IincForm(65280, "aload_0_invokespecial_this", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(19);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      iincForm0.setByteCodeOperands(byteCode0, operandManager0, 3);
      assertEquals(65280, iincForm0.getOpcode());
      assertEquals((-1), iincForm0.operandLength());
      assertFalse(iincForm0.hasNoOperand());
      assertEquals("ldc_w", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[6];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(175, "b", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(175);
      newInitMethodRefForm0.fixUpByteCodeTargets(byteCode0, (CodeAttribute) null);
      assertFalse(newInitMethodRefForm0.hasNoOperand());
      assertEquals(175, newInitMethodRefForm0.getOpcode());
      assertEquals((-1), newInitMethodRefForm0.operandLength());
      assertEquals(175, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WideForm wideForm0 = new WideForm(20, "*OI_=q7");
      wideForm0.calculateOperandPosition();
      assertEquals((-1), wideForm0.operandLength());
      assertEquals(20, wideForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-2441);
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm((-2441), "", intArray0);
      int int0 = iMethodRefForm0.operandLength();
      assertEquals(1, int0);
      assertEquals((-2441), iMethodRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WideForm wideForm0 = new WideForm(20, "*OI_=q7");
      int int0 = wideForm0.operandLength();
      assertEquals((-1), int0);
      assertEquals(20, wideForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[9];
      IntRefForm intRefForm0 = new IntRefForm(170, "Hq|^", intArray0, false);
      intRefForm0.nestedMustStartClassPool();
      assertEquals(170, intRefForm0.getOpcode());
      assertEquals((-1), intRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WideForm wideForm0 = new WideForm(197, ",^p");
      boolean boolean0 = wideForm0.hasNoOperand();
      assertFalse(boolean0);
      assertEquals((-1), wideForm0.operandLength());
      assertEquals(197, wideForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[2];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(43, "n", intArray0);
      boolean boolean0 = superInitMethodRefForm0.hasMultipleByteCodes();
      assertEquals(43, superInitMethodRefForm0.getOpcode());
      assertEquals((-1), superInitMethodRefForm0.operandLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WideForm wideForm0 = new WideForm(20, "*OI_=q7");
      wideForm0.getRewriteCopy();
      assertEquals((-1), wideForm0.operandLength());
      assertEquals(20, wideForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      IntRefForm intRefForm0 = new IntRefForm((-248), "#z.Hl vl=y2p\"0I!?", intArray0, false);
      intRefForm0.getRewriteCopy();
      assertEquals((-1), intRefForm0.operandLength());
      assertEquals((-248), intRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm(1465, "% &d", intArray0);
      narrowClassRefForm0.getRewrite();
      assertEquals(1465, narrowClassRefForm0.getOpcode());
      assertEquals((-1), narrowClassRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(2210, "l", intArray0);
      superMethodRefForm0.getRewrite();
      assertEquals((-1), superMethodRefForm0.operandLength());
      assertEquals(2210, superMethodRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      LabelForm labelForm0 = new LabelForm(0, "wr1K^[lE5p0gS", intArray0);
      int int0 = labelForm0.getOpcode();
      assertEquals((-1), labelForm0.operandLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[6];
      LocalForm localForm0 = new LocalForm(226, "", intArray0);
      int int0 = localForm0.getOpcode();
      assertEquals((-1), localForm0.operandLength());
      assertEquals(226, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[5];
      IntRefForm intRefForm0 = new IntRefForm((-213), "X20(f", intArray0);
      int int0 = intRefForm0.getOpcode();
      assertEquals((-213), int0);
      assertEquals((-1), intRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[7];
      ByteForm byteForm0 = new ByteForm(0, (String) null, intArray0);
      byteForm0.getName();
      assertEquals(0, byteForm0.getOpcode());
      assertEquals((-1), byteForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[8];
      FloatRefForm floatRefForm0 = new FloatRefForm(1232, "N[hL", intArray0, false);
      floatRefForm0.getName();
      assertEquals(1232, floatRefForm0.getOpcode());
      assertEquals((-1), floatRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[8];
      ClassRefForm classRefForm0 = new ClassRefForm((-3961), "", intArray0, false);
      classRefForm0.getName();
      assertEquals((-1), classRefForm0.operandLength());
      assertEquals((-3961), classRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(226);
      assertFalse(byteCodeForm0.hasNoOperand());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(19);
      assertEquals("ldc_w", byteCodeForm0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(2);
      assertEquals(2, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-3961);
      ClassRefForm classRefForm0 = new ClassRefForm((-3961), "", intArray0, false);
      int int0 = classRefForm0.firstOperandIndex();
      assertEquals((-3961), classRefForm0.getOpcode());
      assertEquals(1, classRefForm0.operandLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[4] = (-1778);
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(24, "C=S<$`Z=`Y$UIT[~i^w", intArray0);
      int int0 = thisFieldRefForm0.firstOperandIndex();
      assertEquals(1, thisFieldRefForm0.operandLength());
      assertEquals(24, thisFieldRefForm0.getOpcode());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[8];
      NewClassRefForm newClassRefForm0 = new NewClassRefForm(236, "|&", intArray0);
      newClassRefForm0.firstOperandIndex();
      assertEquals(236, newClassRefForm0.getOpcode());
      assertEquals((-1), newClassRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[3];
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm((-16777216), (String) null, intArray0, true);
      ByteCode byteCode0 = ByteCode.getByteCode((-16777216));
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0);
      // Undeclared exception!
      try { 
        narrowClassRefForm0.setByteCodeOperands(byteCode0, operandManager0, (-16777216));
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
        ByteCodeForm.get(512);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 512
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(181, (String) null);
      boolean boolean0 = tableSwitchForm0.nestedMustStartClassPool();
      assertEquals((-1), tableSwitchForm0.operandLength());
      assertEquals(181, tableSwitchForm0.getOpcode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[8];
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte) (-102);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(145, (-503), byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(11, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[2];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(43, "n", intArray0);
      String string0 = superInitMethodRefForm0.toString();
      assertEquals((-1), superInitMethodRefForm0.operandLength());
      assertEquals(43, superInitMethodRefForm0.getOpcode());
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm(n)", string0);
  }
}
