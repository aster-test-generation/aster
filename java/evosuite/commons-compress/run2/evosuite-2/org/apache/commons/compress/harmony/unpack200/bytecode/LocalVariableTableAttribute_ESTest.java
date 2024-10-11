
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
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocalVariableTableAttribute_ESTest extends LocalVariableTableAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1, (byte)8, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(1);
      linkedList0.add(integer0);
      localVariableTableAttribute0.renumber(linkedList0);
      assertArrayEquals(new int[] {(-1)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[8];
      intArray0[5] = (int) (byte)7;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)3, (byte)3, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 14, Size: 8
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-793), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      ClassFileEntry[] classFileEntryArray0 = localVariableTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      CPUTF8[] cPUTF8Array1 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array1, cPUTF8Array0, intArray0);
      assertFalse(localVariableTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-1206), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)3);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      localVariableTableAttribute0.writeBody(dataOutputStream0);
      assertEquals("\uFFFDJ", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-793), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      int[] intArray0 = localVariableTableAttribute0.getStartPCs();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-445), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int[] intArray1 = localVariableTableAttribute0.getStartPCs();
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int[] intArray1 = localVariableTableAttribute0.getStartPCs();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[4];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-497), intArray0, (int[]) null, (CPUTF8[]) null, (CPUTF8[]) null, (int[]) null);
      int int0 = localVariableTableAttribute0.getLength();
      assertEquals((-4968), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1592, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      MockFile mockFile0 = new MockFile("rcbvySwTjP9&", "org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(48, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1701, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        localVariableTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-1477), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[3];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-2713), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[8];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(740, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[4];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(62, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      localVariableTableAttribute0.renumber(linkedList0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber(linkedList0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to renumber a line number table that has already been renumbered
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-445);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-445), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-445), (-445), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[3];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(10, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[1];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(202, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      CPUTF8 cPUTF8_0 = new CPUTF8("7hF~|V5%gWyyx@!fsYC", 1);
      cPUTF8Array0[0] = cPUTF8_0;
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      localVariableTableAttribute0.resolve(classConstantPool0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("7hF~|V5%gWyyx@!fsYC");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      localVariableTableAttribute0.writeBody(dataOutputStream0);
      assertTrue(localVariableTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[5] = 1;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byte[] byteArray0 = new byte[2];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)8, (byte)8, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, (-1)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1001));
      linkedList0.add(integer0);
      try { 
        localVariableTableAttribute0.renumber(linkedList0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error renumbering bytecode indexes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassFileEntry[] classFileEntryArray0 = localVariableTableAttribute0.getNestedClassFileEntries();
      assertEquals(3, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      String string0 = localVariableTableAttribute0.toString();
      assertEquals("LocalVariableTable: 1 variables", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      localVariableTableAttribute0.setCodeLength(1);
      assertFalse(localVariableTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalVariableTableAttribute.setAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      int int0 = localVariableTableAttribute0.getLength();
      assertEquals(12, int0);
  }
}
