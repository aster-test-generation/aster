
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCode_ESTest extends ByteCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(3549);
      int[] intArray0 = new int[2];
      byteCode0.setOperandBytes(intArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("invokespecial_super", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(997);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite aload_0_invokestatic_super with 0 but bytecode has length 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-793));
      byteCode0.setOperandByte((-793), 0);
      assertEquals(231, byteCode0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[3];
      int[] intArray0 = new int[9];
      intArray0[1] = 2818;
      ByteCode byteCode0 = new ByteCode(0, classFileEntryArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[][] intArray1 = new int[4][9];
      intArray1[0] = intArray0;
      byteCode0.setNestedPositions(intArray1);
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unhandled resolve nop
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(223);
      byteCode0.setOperandSigned2Bytes(1342, 0);
      assertEquals(223, byteCode0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(997);
      byteCode0.setOperandByte((-2887), (-1));
      assertEquals("aload_0_invokestatic_super", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byteCode0.extractOperands(operandManager0, (Segment) null, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2);
      int[] intArray0 = new int[5];
      byte[] byteArray0 = new byte[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      byteCode0.applyByteCodeTargetFixup(codeAttribute0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("iconst_m1", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-3212));
      String string0 = byteCode0.toString();
      assertEquals("", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(211, (ClassFileEntry[]) null);
      byteCode0.hasMultipleByteCodes();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_getfield_this", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.hasMultipleByteCodes();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int int0 = byteCode0.getOpcode();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[][] intArray0 = new int[1][0];
      byteCode0.setNestedPositions(intArray0);
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[][] intArray0 = new int[1][0];
      int[] intArray1 = new int[5];
      intArray0[0] = intArray1;
      byteCode0.setNestedPositions(intArray0);
      byteCode0.getNestedPosition(0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(208, (ClassFileEntry[]) null);
      ClassFileEntry[] classFileEntryArray0 = byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertNull(classFileEntryArray0);
      assertFalse(byteCode0.hasMultipleByteCodes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(63);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[9];
      byteCode0.setNested(classFileEntryArray0);
      ClassFileEntry[] classFileEntryArray1 = byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(9, classFileEntryArray1.length);
      assertEquals("lstore_0", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-68));
      int int0 = byteCode0.getLength();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2099);
      byteCode0.setByteCodeIndex(65536);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals(65536, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(211, (ClassFileEntry[]) null);
      ByteCodeForm byteCodeForm0 = byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(211, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-68));
      byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(188, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      ByteCodeForm byteCodeForm0 = byteCode0.getByteCodeForm();
      assertEquals(0, byteCodeForm0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(233);
      boolean boolean0 = byteCode0.nestedMustStartClassPool();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("cldc", byteCode0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(18);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-792), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(933);
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(211, (ClassFileEntry[]) null);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(211, (-951));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -949
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[][] intArray0 = new int[1][0];
      byteCode0.setNestedPositions(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition(4262);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4262
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteCode.getByteCode(2555);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-315));
      // Undeclared exception!
      try { 
        byteCode0.extractOperands((OperandManager) null, (Segment) null, 150);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1357));
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, (int[]) null, intArray0, intArray1, intArray0, intArray0, (int[]) null, intArray1, intArray1, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray1, (int[]) null, intArray0);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, (-792));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.doWrite((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2244));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        byteCode0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(156);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        byteCode0.applyByteCodeTargetFixup(codeAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(364, classFileEntryArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 364
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(241);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(1089);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1089
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(25);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(25, (-1228));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1227
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(951);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(730, 951);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite invokespecial with an int at position 951 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-3092));
      byteCode0.setOperand2Bytes((-1), (-1));
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(236, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(514);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(0, 514);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite iconst_m1 that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-68));
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition(40);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1970));
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals((-1), int0);
      assertEquals(78, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2529));
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("lload_1", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1737);
      int[] intArray0 = new int[5];
      byteCode0.setByteCodeTargets(intArray0);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("jsr_w", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(156);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("ifge", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-3092));
      String string0 = byteCode0.toString();
      assertEquals("cldc_w", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(211);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite aload_0_getfield_this with 9 but bytecode has length 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte)16;
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(387, 180, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(10, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-3909));
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte((-3909), 627);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite new with an byte at position 627 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1359);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-792), 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite iastore that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(156);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      byteCode0.resolve(classConstantPool0);
      assertEquals("ifge", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      boolean boolean0 = byteCode0.equals(byteCode0);
      assertTrue(boolean0);
      assertEquals("nop", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(156);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      boolean boolean0 = byteCode0.equals(classConstantPool0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("ifge", byteCode0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-3092));
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      byteCode0.doWrite(dataOutputStream0);
      assertEquals(3, byteArrayOutputStream0.size());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-68));
      String string0 = byteCode0.getName();
      assertEquals("newarray", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(7);
      int[] intArray0 = new int[5];
      byteCode0.setRewrite(intArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("iconst_4", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(7);
      byteCode0.hashCode();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("iconst_4", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[3];
      ByteCode byteCode0 = new ByteCode(0, classFileEntryArray0);
      byteCode0.nestedMustStartClassPool();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[3];
      ByteCode byteCode0 = new ByteCode(0, classFileEntryArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int[] intArray0 = new int[5];
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-93);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(10, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(223);
      int int0 = byteCode0.getOpcode();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(223, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-3092));
      byteCode0.getRewrite();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("cldc_w", byteCode0.getName());
  }
}
