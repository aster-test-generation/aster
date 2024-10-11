
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


package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BCIRenumberedAttribute_ESTest extends BCIRenumberedAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2D.|^eCIPf>}F3K", (-577));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      String string0 = newAttribute0.toString();
      assertEquals("2D.|^eCIPf>}F3K", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      String string0 = newAttribute0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        codeAttribute0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      newAttribute0.addBCLength(649, 0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        newAttribute0.renumber(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 2478;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1621), (byte)10, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2478, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      newAttribute0.addInteger(2310, 0L);
      newAttribute0.addBCLength(649, 0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        newAttribute0.renumber(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Long cannot be cast to org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1103);
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute((-1103), 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[11];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      byte[] byteArray0 = new byte[2];
      lineNumberTableAttribute0.renumbered = true;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(168, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to renumber a line number table that has already been renumbered
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[3];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute((-1103), 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertTrue(codeAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("4LV&La=W4");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      boolean boolean0 = newAttribute0.hasBCIRenumbering();
      assertTrue(boolean0);
  }
}