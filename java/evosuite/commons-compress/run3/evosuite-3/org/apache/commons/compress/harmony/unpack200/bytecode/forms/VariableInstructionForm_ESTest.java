
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VariableInstructionForm_ESTest extends VariableInstructionForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1603), "");
      int[] intArray0 = new int[8];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = (-1603);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(24, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm() but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(134, "");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes(1010, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm() but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-921), "S:z)Ke]O(=Zv_X-r^u");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-5));
      assertEquals(17, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WideForm wideForm0 = new WideForm(1, "");
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes(1, 532, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm() with an int at position 532 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, (String) null);
      int[] intArray0 = new int[9];
      lookupSwitchForm0.setRewrite4Bytes(0, 0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, (String) null);
      int[] intArray0 = new int[9];
      lookupSwitchForm0.setRewrite2Bytes(0, 0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      WideForm wideForm0 = new WideForm(0, "+ -Xi3VD{`}R[L");
      ByteCode byteCode0 = ByteCode.getByteCode(66);
      wideForm0.setByteCodeOperandsFormat1(0, byteCode0, operandManager0, 0);
      assertEquals("+ -Xi3VD{`}R[L", wideForm0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1150), (String) null);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes((-1150), (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, "");
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes(0, 0, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WideForm wideForm0 = new WideForm(255, "Y\"9}Gn@4Xyp6");
      // Undeclared exception!
      try { 
        wideForm0.setRewrite2Bytes(0, 0, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-2874), "#^#5Iv9B=`oS%hp$");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes(642, (-2874), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(#^#5Iv9B=`oS%hp$) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(507, "U");
      int[] intArray0 = new int[8];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(507, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(U) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(512, "]%h");
      int[] intArray0 = new int[8];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      tableSwitchForm0.setRewrite4Bytes(24, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 24, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1851), "dup2");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite2Bytes((-1851), 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[1];
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-2865), "K");
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes((-2865), (-2865), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(K) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(512, "]%h");
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes((-1), 512, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(]%h) with an int at position 512 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(2, (String) null);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes(2, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }
}
