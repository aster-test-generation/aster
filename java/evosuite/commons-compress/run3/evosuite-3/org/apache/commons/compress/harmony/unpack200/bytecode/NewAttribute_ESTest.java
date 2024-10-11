
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
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NewAttribute_ESTest extends NewAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("value", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCIndex(891, (byte)5);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[12];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)1, 1, byteArray0, (Segment) null, operandManager0, linkedList0);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 75);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)9);
      newAttribute0.toString();
      assertEquals(9, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("t");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-688));
      newAttribute0.addBCOffset((-3133), 0);
      int int0 = newAttribute0.getLength();
      assertEquals((-688), newAttribute0.getLayoutIndex());
      assertEquals((-3133), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("=o\t!);");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 131);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(131, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-739));
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals((-739), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, 0);
      // Undeclared exception!
      try { 
        newAttribute0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Y00&!uk~");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1);
      // Undeclared exception!
      try { 
        newAttribute0.resolve((ClassConstantPool) null);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-1543));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        newAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addToBody((byte)4, "");
      newAttribute0.addBCLength((byte)9, (byte)11);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        newAttribute0.renumber(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g", (-3038));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      newAttribute0.addBCOffset((byte)11, (-402));
      byte[] byteArray0 = new byte[6];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(7, (-1021), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Kr{Lb9AJMBm");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2898));
      newAttribute0.addBCLength((byte)7, (byte)6);
      File file0 = MockFile.createTempFile("Kr{Lb9AJMBm", "Kr{Lb9AJMBm");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-2898), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      newAttribute0.addInteger(6, (byte)4);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(10, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-BX^}enf68", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      MockFile mockFile0 = new MockFile("-BX^}enf68", "-BX^}enf68");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.addBCOffset((byte)5, 0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      newAttribute0.addBCOffset(2, 2);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        newAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Kr{Lb9AJMBm");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2898));
      newAttribute0.addBCLength((byte)1, 182);
      File file0 = MockFile.createTempFile("Kr{Lb9AJMBm", "Kr{Lb9AJMBm");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-2898), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Kr{Lb9AJMBm");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2898));
      File file0 = MockFile.createTempFile("Kr{Lb9AJMBm", "Kr{Lb9AJMBm");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.addToBody((byte)4, mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-2898), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-BX^}enf68", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      MockFile mockFile0 = new MockFile("-BX^}enf68", "-BX^}enf68");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.addToBody(0, cPUTF8_0);
      // Undeclared exception!
      try { 
        newAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g", (-3038));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      newAttribute0.addInteger((-1), (byte)4);
      newAttribute0.writeBody((DataOutputStream) null);
      assertEquals(10, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Kr{Lb9AJMBm");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2898));
      newAttribute0.addBCOffset((byte)8, (byte)12);
      File file0 = MockFile.createTempFile("Kr{Lb9AJMBm", "Kr{Lb9AJMBm");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-2898), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("=o#t!)B");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)11);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[8];
      byte[] byteArray0 = new byte[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-716), 5, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (-1L), codeAttribute0.attributes);
      newAttribute0.addToBody(12, cPMember0);
      classConstantPool0.resolve((Segment) null);
      newAttribute0.resolve(classConstantPool0);
      assertEquals(11, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g", (-3038));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      newAttribute0.addBCOffset((byte)11, (-402));
      newAttribute0.resolve(classConstantPool0);
      assertEquals(10, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCLength((byte)9, (byte)11);
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
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("value", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCIndex((byte)9, (byte)5);
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[12];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)1, (byte)12, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Kr{Lb9AJMBm");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2898));
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      newAttribute0.renumber(linkedList0);
      newAttribute0.renumber(linkedList0);
      assertEquals((-2898), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("=o#t!)B");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)11);
      int[] intArray0 = new int[8];
      byte[] byteArray0 = new byte[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-716), 5, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (-1L), codeAttribute0.attributes);
      newAttribute0.addToBody(12, cPMember0);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
      assertEquals(11, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Kr{Lb9AJMBm");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2898));
      newAttribute0.addBCOffset((byte)8, (byte)12);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
      assertEquals((-2898), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-BX^}enf68", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCOffset((byte)5, 0);
      int int0 = newAttribute0.getLength();
      assertEquals(5, int0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-BX^}enf68", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      int int0 = newAttribute0.getLength();
      assertEquals(0, newAttribute0.getLayoutIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g", (-3038));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      newAttribute0.getStartPCs();
      assertEquals(10, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g", (-3038));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      newAttribute0.addBCLength((byte)3, 10);
      newAttribute0.writeBody((DataOutputStream) null);
      assertEquals(10, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-BX^}enf68", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("m2z?g", (-3038));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      newAttribute0.toString();
      assertEquals(10, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("-BX^}enf68", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCOffset((byte)5, 0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = Integer.valueOf((-2436));
      linkedList0.add(integer0);
      newAttribute0.renumber(linkedList0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }
}
