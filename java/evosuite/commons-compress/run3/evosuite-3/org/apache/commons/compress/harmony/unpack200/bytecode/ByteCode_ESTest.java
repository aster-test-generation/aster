
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
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCode_ESTest extends ByteCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes(0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite aconst_null that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(182);
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite invokevirtual with 7 but bytecode has length 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(534);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte((-7), 534);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite lload with an byte at position 534 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2797);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte((-612), (-3148));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3147
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1839));
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes((-1839), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[1];
      int[][] intArray0 = new int[3][2];
      int[] intArray1 = new int[9];
      intArray1[1] = 732;
      intArray0[0] = intArray1;
      byteCode0.setNestedPositions(intArray0);
      byteCode0.setNested(classFileEntryArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
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
  public void test06()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2935));
      MockPrintStream mockPrintStream0 = new MockPrintStream("%a%h{[cq:vAgAnEr");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      byteCode0.doWrite(dataOutputStream0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("l2f", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(128);
      byteCode0.applyByteCodeTargetFixup((CodeAttribute) null);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("ior", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(534);
      byteCode0.setOperandByte(0, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("lload", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(489);
      boolean boolean0 = byteCode0.nestedMustStartClassPool();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(233, byteCode0.getOpcode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1321));
      boolean boolean0 = byteCode0.hasMultipleByteCodes();
      assertEquals("aload_0_invokestatic_this", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.hasMultipleByteCodes();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0, (ClassFileEntry[]) null);
      int[][] intArray0 = new int[6][7];
      int[] intArray1 = new int[0];
      intArray0[1] = intArray1;
      byteCode0.setRewrite(intArray0[1]);
      byteCode0.getRewrite();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
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
      ByteCode byteCode0 = ByteCode.getByteCode((-1321));
      int int0 = byteCode0.getOpcode();
      assertEquals(215, int0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(12);
      int[][] intArray0 = new int[6][3];
      byteCode0.setNestedPositions(intArray0);
      byteCode0.getNestedPositions();
      assertEquals("fconst_1", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0, (ClassFileEntry[]) null);
      ClassFileEntry[] classFileEntryArray0 = byteCode0.getNestedClassFileEntries();
      assertNull(classFileEntryArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(72);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[2];
      byteCode0.setNested(classFileEntryArray0);
      ClassFileEntry[] classFileEntryArray1 = byteCode0.getNestedClassFileEntries();
      assertEquals("dstore_1", byteCode0.toString());
      assertEquals(2, classFileEntryArray1.length);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0, (ClassFileEntry[]) null);
      int[][] intArray0 = new int[6][7];
      int[] intArray1 = new int[0];
      intArray0[1] = intArray1;
      byteCode0.setRewrite(intArray0[1]);
      byteCode0.getLength();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.getLength();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0, (ClassFileEntry[]) null);
      int[][] intArray0 = new int[6][7];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      byteCode0.setByteCodeTargets(intArray0[0]);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(2);
      byteCode0.setByteCodeIndex(95);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals(95, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(226);
      byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(226, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(232);
      byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(232, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      ByteCodeForm byteCodeForm0 = byteCode0.getByteCodeForm();
      assertEquals(0, byteCodeForm0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1321));
      int[] intArray0 = new int[1];
      byteCode0.setByteCodeTargets(intArray0);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_invokestatic_this", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-609));
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-3044), (-3044));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3043
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[2];
      int[][] intArray0 = new int[3][2];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      byteCode0.setNestedPositions(intArray0);
      byteCode0.setNested(classFileEntryArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0, (ClassFileEntry[]) null);
      int[][] intArray0 = new int[6][7];
      byteCode0.setNestedPositions(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition((byte) (-86));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -86
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.setRewrite((int[]) null);
      // Undeclared exception!
      try { 
        byteCode0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteCode.getByteCode(498);
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
      ByteCode byteCode0 = ByteCode.getByteCode((-1101));
      int[] intArray0 = new int[8];
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
  public void test32()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(171);
      int[] intArray0 = new int[1];
      intArray0[0] = 171;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(37);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        byteCode0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(8);
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
  public void test35()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[5];
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode((-728), classFileEntryArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -728
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(248);
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
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(4935);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4935
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-609));
      int[] intArray0 = new int[2];
      byteCode0.setOperandBytes(intArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(159, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(0, (-2424));
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
      ByteCode byteCode0 = ByteCode.getByteCode(234);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition(0);
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
      ByteCode byteCode0 = new ByteCode(12);
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("fconst_1", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(220);
      String string0 = byteCode0.toString();
      assertEquals("invokevirtual_super", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-609));
      byteCode0.setOperandSigned2Bytes(1723, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("if_icmpeq", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-609));
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite if_icmpeq with 0 but bytecode has length 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-4181));
      int[][] intArray0 = new int[9][0];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0[0]);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite lookupswitch that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(220);
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
  public void test47()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode((byte)1);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(1, (byte)12);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite aconst_null that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((byte) (-24));
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes((byte) (-116), 8);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite invokespecial_new_init with an int at position 8 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(216);
      byteCode0.setOperand2Bytes(216, 0);
      assertEquals("getstatic_super", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      boolean boolean0 = byteCode0.equals(byteCode0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertTrue(boolean0);
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(72);
      Object object0 = new Object();
      boolean boolean0 = byteCode0.equals(object0);
      assertFalse(boolean0);
      assertEquals("dstore_1", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-187));
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      byteCode0.resolve(classConstantPool0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      byteCode0.write(dataOutputStream0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(69, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-187));
      String string0 = byteCode0.getName();
      assertEquals("fstore_2", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = byteCode0.getRewrite();
      byteCode0.setRewrite(intArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.hashCode();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(8);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals((-1), int0);
      assertEquals("iconst_5", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-187));
      byteCode0.nestedMustStartClassPool();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(69, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(534);
      byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("lload", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(534);
      int[] intArray0 = byteCode0.getRewrite();
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byteCode0.extractOperands(operandManager0, (Segment) null, 0);
      assertArrayEquals(new int[] {22, 22}, intArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[1];
      byteCode0.setNested(classFileEntryArray0);
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
      ByteCode byteCode0 = ByteCode.getByteCode((-187));
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("fstore_2", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-187));
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-187), 1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite fstore_2 that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }
}
