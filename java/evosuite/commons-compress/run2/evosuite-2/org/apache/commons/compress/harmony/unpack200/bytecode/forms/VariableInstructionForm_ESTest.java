
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
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1), (String) null);
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = (-1783);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes((-1783), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(null) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(10, "Lli\"U'_,B`:I");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1513), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(Lli\"U'_,B`:I) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(16, "E{^|MQ*O.OY+\"l'~|");
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes(16, 1185, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(E{^|MQ*O.OY+\"l'~|) with an int at position 1185 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WideForm wideForm0 = new WideForm(1360, "");
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        wideForm0.setRewrite2Bytes(126, 637, intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm() with an int at position 637 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, "BSALfzo&*9En~5KkYbx");
      int[] intArray0 = new int[7];
      tableSwitchForm0.setRewrite2Bytes((-2234), 0, intArray0);
      assertArrayEquals(new int[] {247, 70, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, (String) null);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1458), (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "");
      // Undeclared exception!
      try { 
        wideForm0.setRewrite4Bytes(2, 2, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[3];
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1000), "_");
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
  public void test08()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1825), "");
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes(2, 1073, (int[]) null);
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
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(8, "");
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite2Bytes((-215), 7, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, "LineNumberTable: ");
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite4Bytes((-1), (-971), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(LineNumberTable: ) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(16, "E{^|MQ*O.OY+\"l'~|");
      int[] intArray0 = new int[5];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[4] = (-1);
      intArray0[3] = (-1);
      tableSwitchForm0.setRewrite4Bytes((-1), intArray0);
      assertArrayEquals(new int[] {0, (-1), 255, 255, 255}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(16, "E{^|MQ*O.OY+\"l'~|");
      int[] intArray0 = new int[5];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(E{^|MQ*O.OY+\"l'~|) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(16, "E{^|MQ*O.OY+\"l'~|");
      int[] intArray0 = new int[5];
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(E{^|MQ*O.OY+\"l'~|) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(16, "E{^|MQ*O.OY+\"l'~|");
      int[] intArray0 = new int[5];
      intArray0[1] = (-1);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setRewrite4Bytes((-1), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(E{^|MQ*O.OY+\"l'~|) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[9];
      WideForm wideForm0 = new WideForm(0, "_");
      wideForm0.setRewrite4Bytes(0, 0, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-2098), "\u0004");
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setRewrite2Bytes((-2098), (-2098), intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm(\u0004) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }
}
