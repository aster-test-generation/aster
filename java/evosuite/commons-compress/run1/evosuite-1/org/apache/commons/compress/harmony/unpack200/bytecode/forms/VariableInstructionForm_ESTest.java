
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
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1), "_0OI");
      int[] intArray0 = new int[8];
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      intArray0[5] = (-1);
      intArray0[6] = (-1828);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1828), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(_0OI) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(65258, "U<wsk.} Q0[8| ");
      int[] intArray0 = new int[9];
      intArray0[3] = (-1);
      intArray0[4] = (-1331);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes((-1331), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(U<wsk.} Q0[8| ) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-517), "ifle");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes((-517), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm(ifle) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-321), "a!{{_a");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes((-321), 2737, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm(a!{{_a) with an int at position 2737 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WideForm wideForm0 = new WideForm(2027, "NameAndType: ");
      ByteCode byteCode0 = ByteCode.getByteCode(24);
      int[] intArray0 = new int[4];
      intArray0[0] = 2027;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat1(2027, byteCode0, operandManager0, 2027);
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(47, "xTOS7eAy`V1{j`8G;Sd");
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite2Bytes(102, 47, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(xTOS7eAy`V1{j`8G;Sd) with an int at position 47 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(65280, "U<wsk[.)} +Q][8| ");
      int[] intArray0 = new int[6];
      lookupSwitchForm0.setRewrite4Bytes((-1302), 0, intArray0);
      assertArrayEquals(new int[] {(-1), 255, 250, 234, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, "");
      int[] intArray0 = new int[6];
      tableSwitchForm0.setRewrite2Bytes(0, 0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-3058), ",g4vatctvFGw]C?'");
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes((-3058), (int[]) null);
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
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, "2@!6^q2<kDWk9q'i+<");
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
  public void test10()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, (String) null);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(0, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WideForm wideForm0 = new WideForm(77, "e72)F4");
      // Undeclared exception!
      try { 
        wideForm0.setRewrite2Bytes(3, 112, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(8, (String) null);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes(33, 4, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1), "_0OI");
      int[] intArray0 = new int[8];
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      intArray0[5] = (-1);
      intArray0[6] = (-1);
      tableSwitchForm0.setRewrite4Bytes((-1), intArray0);
      assertArrayEquals(new int[] {0, 0, 0, (-1), 255, 255, 255, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1), "_0OI");
      int[] intArray0 = new int[8];
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      intArray0[5] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(_0OI) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1), "_0OI");
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(_0OI) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1), "_0OI");
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes(255, (-1), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(_0OI) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(162, "EDO}_!`[@!MO8Z?mw");
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes(162, (-1308), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(EDO}_!`[@!MO8Z?mw) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }
}
