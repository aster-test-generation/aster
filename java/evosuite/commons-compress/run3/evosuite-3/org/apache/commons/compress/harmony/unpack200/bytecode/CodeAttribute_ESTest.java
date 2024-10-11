
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
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodeAttribute_ESTest extends CodeAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 3280);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(2663, 3280, (-2709), cPClass0);
      linkedList0.offer(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, (byte)4, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      int int0 = codeAttribute0.getLength();
      assertEquals(4, codeAttribute0.maxLocals);
      assertEquals(21, int0);
      assertEquals(12, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte) (-60);
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-2194), 1343, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(1343, codeAttribute0.maxLocals);
      assertEquals(9, codeAttribute0.codeLength);
      assertEquals((-2194), codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1467), (-1467), byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-1467), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      codeAttribute0.addAttribute(localVariableTypeTableAttribute0);
      int int0 = codeAttribute0.getLength();
      assertEquals((-14650), int0);
      assertEquals((-1467), codeAttribute0.maxLocals);
      assertEquals((-1467), codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(10, 10, byteArray0, (Segment) null, operandManager0, linkedList0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        codeAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(240, 919, byteArray0, (Segment) null, operandManager0, linkedList0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("TkmZ'/<{NL2Y`");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        codeAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(110, (-4735), byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
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
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-388), 122, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        codeAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-680), (byte)0, 0, (CPClass) null);
      linkedList0.add(exceptionTableEntry0);
      // Undeclared exception!
      try { 
        codeAttribute0.renumber((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1526), (-1526), byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      CPUTF8 cPUTF8_0 = new CPUTF8("Code: ", (-1526));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-1665), 8, (-1526), cPClass0);
      linkedList0.offerFirst(exceptionTableEntry0);
      // Undeclared exception!
      try { 
        codeAttribute0.renumber(linkedList1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1665, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-680), (byte)0, 0, (CPClass) null);
      linkedList0.add(exceptionTableEntry0);
      // Undeclared exception!
      try { 
        codeAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      linkedList0.addFirst((ExceptionTableEntry) null);
      CodeAttribute codeAttribute0 = new CodeAttribute(4, 1316, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        codeAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(1908, (-701), byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        codeAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-20);
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(328, 896, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-86);
      int[] intArray0 = new int[5];
      intArray0[0] = (int) (byte) (-86);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(8, 8, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-56);
      int[] intArray0 = new int[9];
      intArray0[0] = 924;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0);
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 924, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)21;
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(170, (-1070), byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      MockFile mockFile0 = new MockFile("", "bLO-m8>cM}Fl");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      CodeAttribute codeAttribute0 = new CodeAttribute(3280, 3280, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      int[] intArray0 = new int[18];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((byte)1, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      codeAttribute0.addAttribute(localVariableTypeTableAttribute0);
      // Undeclared exception!
      try { 
        codeAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPClass cPClass0 = new CPClass(cPUTF8_0, 3280);
      MockFile mockFile0 = new MockFile("", "bO*m8>6M}9l");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      classConstantPool0.resolve((Segment) null);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(2663, 3280, (-2709), cPClass0);
      linkedList0.offer(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, (byte)4, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      codeAttribute0.resolve(classConstantPool0);
      codeAttribute0.writeBody(dataOutputStream0);
      assertEquals(21L, mockFile0.length());
      assertEquals(12, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-680), (byte)0, 0, (CPClass) null);
      linkedList0.add(exceptionTableEntry0);
      ClassFileEntry[] classFileEntryArray0 = codeAttribute0.getNestedClassFileEntries();
      assertEquals(1, codeAttribute0.codeLength);
      assertEquals(0, codeAttribute0.maxStack);
      assertEquals(2, classFileEntryArray0.length);
      assertEquals(0, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8 cPUTF8_0 = new CPUTF8("Codo: ", 196);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-10), (byte)1, (byte)3, cPClass0);
      linkedList0.add(exceptionTableEntry0);
      ClassFileEntry[] classFileEntryArray0 = codeAttribute0.getNestedClassFileEntries();
      assertEquals(0, codeAttribute0.maxStack);
      assertEquals(1, codeAttribute0.codeLength);
      assertEquals(3, classFileEntryArray0.length);
      assertEquals(0, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(659, 659, byteArray0, (Segment) null, operandManager0, linkedList0);
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      codeAttribute0.addAttribute(deprecatedAttribute0);
      String string0 = codeAttribute0.toString();
      assertEquals("Code: 19 bytes", string0);
      assertEquals(659, codeAttribute0.maxStack);
      assertEquals(659, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, 8, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      codeAttribute0.addAttribute(localVariableTableAttribute0);
      assertEquals(8, codeAttribute0.maxLocals);
      assertEquals(5, codeAttribute0.codeLength);
      assertEquals(8, codeAttribute0.maxStack);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-60);
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-390), (-390), byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals((-390), codeAttribute0.maxLocals);
      assertEquals(8, codeAttribute0.codeLength);
      assertEquals((-390), codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Codo: ", 196);
      CodeAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)4, ConstantPoolEntry.CP_Float);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(0, linkedList0.size());
      
      codeAttribute0.renumber((List<Integer>) null);
      assertEquals(0, codeAttribute0.maxStack);
      assertEquals(1, codeAttribute0.codeLength);
      assertEquals(0, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(3280, 3280, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      codeAttribute0.getStartPCs();
      assertEquals(0, codeAttribute0.codeLength);
      assertEquals(3280, codeAttribute0.maxStack);
      assertEquals(3280, codeAttribute0.maxLocals);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, (byte)4, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      // Undeclared exception!
      try { 
        codeAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }
}
