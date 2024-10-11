
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
      ByteCode byteCode0 = ByteCode.getByteCode(163);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes(163, 163);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite if_icmpgt with an int at position 163 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1952);
      int[] intArray0 = new int[2];
      byteCode0.setOperandBytes(intArray0);
      assertEquals(160, byteCode0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(220);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite invokevirtual_super with 0 but bytecode has length 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(18);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(19, 18);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite ldc with an byte at position 18 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(16);
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byteCode0.extractOperands(operandManager0, (Segment) null, 164);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(16, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = new ByteCode(217, classFileEntryArray0);
      byteCode0.setOperand2Bytes(3, (-1));
      assertEquals("putstatic_super", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1299);
      byteCode0.setOperand2Bytes(0, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("ldc_w", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0);
      byteCode0.extractOperands(operandManager0, (Segment) null, (-1306));
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2231));
      byteCode0.applyByteCodeTargetFixup((CodeAttribute) null);
      assertEquals("dstore_2", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(18);
      boolean boolean0 = byteCode0.nestedMustStartClassPool();
      assertTrue(boolean0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-42));
      boolean boolean0 = byteCode0.hasMultipleByteCodes();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_invokespecial_this", byteCode0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1743));
      byteCode0.hasMultipleByteCodes();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("daload", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(6);
      int[] intArray0 = new int[0];
      byteCode0.setRewrite(intArray0);
      byteCode0.getRewrite();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(6, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int int0 = byteCode0.getOpcode();
      assertEquals(0, int0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(16);
      int[][] intArray0 = new int[2][2];
      byteCode0.setNestedPositions(intArray0);
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(16, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[][] intArray0 = new int[3][6];
      byteCode0.setNestedPositions(intArray0);
      byteCode0.getNestedPosition(0);
      assertEquals(0, byteCode0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(158);
      byteCode0.setNested((ClassFileEntry[]) null);
      ClassFileEntry[] classFileEntryArray0 = byteCode0.getNestedClassFileEntries();
      assertNull(classFileEntryArray0);
      assertEquals(158, byteCode0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[6];
      ByteCode byteCode0 = new ByteCode(223, classFileEntryArray0);
      ClassFileEntry[] classFileEntryArray1 = byteCode0.getNestedClassFileEntries();
      assertEquals(6, classFileEntryArray1.length);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_getstatic_super", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-908));
      String string0 = byteCode0.getName();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(3786);
      byteCode0.setByteCodeIndex(3786);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals(3786, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(18);
      byteCode0.getByteCodeForm();
      assertEquals("ldc", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-32));
      byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_putstatic_super", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      ByteCodeForm byteCodeForm0 = byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(209);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes(0, (-1741));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1739
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(227);
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
      ByteCode byteCode0 = ByteCode.getByteCode(19);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(19, (-2359));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2358
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(17);
      int[][] intArray0 = new int[0][5];
      byteCode0.setNestedPositions(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition((-1533));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1533
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteCode.getByteCode(765);
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
      ByteCode byteCode0 = ByteCode.getByteCode(1299);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(158);
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, (-157));
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
      ByteCode byteCode0 = new ByteCode(214);
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
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
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
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(250, (ClassFileEntry[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[1];
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode((-5313), classFileEntryArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5313
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(512);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 512
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(19);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(3, 3);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite ldc_w with an int at position 3 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(17);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition((-1533));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(18);
      String string0 = byteCode0.toString();
      assertEquals("ldc", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-19));
      byteCode0.setOperandSigned2Bytes(0, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("ildc_w", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int[] intArray0 = new int[4];
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
  public void test40()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(5);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(5, 65280);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite iconst_2 that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-19));
      byteCode0.setOperandByte(56, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("ildc_w", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(156);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-1094), 2073);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite ifge with an int at position 2073 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(112);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(2, (-716));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite irem that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(16);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes((-321), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[2];
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      ByteCode byteCode0 = new ByteCode(1, classFileEntryArray0);
      int[][] intArray0 = new int[3][7];
      byteCode0.setNestedPositions(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unhandled resolve aconst_null
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[5];
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      ByteCode byteCode0 = new ByteCode(1, classFileEntryArray0);
      int[][] intArray0 = new int[4][4];
      int[] intArray1 = new int[9];
      intArray1[1] = 1;
      intArray0[0] = intArray1;
      byteCode0.setNestedPositions(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      byteCode0.resolve(classConstantPool0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      boolean boolean0 = byteCode0.equals(byteCode0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertTrue(boolean0);
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      Object object0 = new Object();
      boolean boolean0 = byteCode0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(16);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(65536);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      byteCode0.doWrite(dataOutputStream0);
      assertEquals(2, byteArrayOutputStream0.size());
      assertEquals("\u0010\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(18);
      String string0 = byteCode0.getName();
      assertEquals("ldc", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(112);
      byteCode0.hashCode();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("irem", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = new ByteCode(217, classFileEntryArray0);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals((-1), int0);
      assertEquals(217, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[3];
      byteCode0.setByteCodeTargets(intArray0);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.nestedMustStartClassPool();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[1];
      ByteCode byteCode0 = new ByteCode(99, classFileEntryArray0);
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
  public void test57()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = byteCode0.getRewrite();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = new ByteCode(217, classFileEntryArray0);
      byteCode0.getNestedPositions();
      assertEquals("putstatic_super", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1608, (byte)6, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertTrue(codeAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = new ByteCode(217, classFileEntryArray0);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite putstatic_super with 3 but bytecode has length 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = new ByteCode(217, classFileEntryArray0);
      byteCode0.getLength();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("putstatic_super", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = new ByteCode(217, classFileEntryArray0);
      int int0 = byteCode0.getOpcode();
      assertEquals(217, int0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.getName());
  }
}
