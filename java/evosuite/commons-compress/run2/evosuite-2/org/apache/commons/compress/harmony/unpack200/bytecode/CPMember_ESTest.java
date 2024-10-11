
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
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMember_ESTest extends CPMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("descriptor", 0);
      CPUTF8 cPUTF8_1 = new CPUTF8("descriptor");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, 0L, (List<Attribute>) null);
      String string0 = cPMember0.toString();
      assertEquals("CPMember: UTF-8:descriptor(UTF-8:descriptor)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("H+qB $a%aSHc\"WG=", 0);
      CPUTF8 cPUTF8_1 = new CPUTF8("H+qB $a%aSHc\"WG=");
      byte[] byteArray0 = new byte[4];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)4, (byte)3, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, 0L, codeAttribute0.attributes);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPMember0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("M'");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPUTF8 cPUTF8_1 = new CPUTF8("M'");
      CPField cPField0 = new CPField(cPUTF8_1, cPUTF8_0, (byte)10, linkedList0);
      cPField0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("IObv\"z&Fh|", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 1L, linkedList0);
      int[] intArray0 = new int[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(145, intArray0, intArray0);
      linkedList0.add((Attribute) lineNumberTableAttribute0);
      linkedList0.add((Attribute) null);
      ClassFileEntry[] classFileEntryArray0 = cPField0.getNestedClassFileEntries();
      assertEquals(4, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")", (-1));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)8, linkedList0);
      CPClass[] cPClassArray0 = new CPClass[1];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      linkedList0.add((Attribute) exceptionsAttribute0);
      cPMethod0.nameIndex = 1406;
      ClassFileEntry[] classFileEntryArray0 = cPMethod0.getNestedClassFileEntries();
      assertEquals(3, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPUTF8 cPUTF8_1 = new CPUTF8("", (byte)11);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)5, (List<Attribute>) null);
      ClassFileEntry[] classFileEntryArray0 = cPMethod0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", (-154));
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)1, (byte)10, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)11, codeAttribute0.attributes);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (-154), codeAttribute0.attributes);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(boolean0);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7A;:ifkKaYa.", (-1405));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 0L, linkedList0);
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute((String) null);
      linkedList0.add((Attribute) innerClassesAttribute0);
      MockFile mockFile0 = new MockFile("TLJuP");
      linkedList0.offer(innerClassesAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPMethod0.doWrite(dataOutputStream0);
      assertEquals(24L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)1, 1766, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)1, codeAttribute0.attributes);
      cPMember0.nameIndex = (int) (byte)3;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(11);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      cPMember0.doWrite(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("DjV)U9P", 0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 0, (List<Attribute>) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPField0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<LqOuFarE+joq");
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[16];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(0, (byte)10, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 0, codeAttribute0.attributes);
      // Undeclared exception!
      try { 
        cPMethod0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("if3y\"?kd<\"6$! p<H#", 2);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (byte)10, (List<Attribute>) null);
      cPField0.attributes = null;
      // Undeclared exception!
      try { 
        cPField0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Hp2~ tX++N2O");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 1L, (List<Attribute>) null);
      cPMember0.attributes = null;
      // Undeclared exception!
      try { 
        cPMember0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("?)'W>", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)11, linkedList0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPMember0.doWrite(dataOutputStream0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("IObv\"z&Fh|", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 1L, linkedList0);
      int[] intArray0 = new int[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(145, intArray0, intArray0);
      linkedList0.add((Attribute) lineNumberTableAttribute0);
      File file0 = MockFile.createTempFile("Field: UTF-8:IObv\"z&Fh|(UTF-8:IObv\"z&Fh|)", "IObv\"z&Fh|");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        cPField0.doWrite(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)10, (-511), byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 0L, codeAttribute0.attributes);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPMethod0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("multianewarray");
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)8, 25, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = null;
      try {
        cPMember0 = new CPMember(cPUTF8_0, (CPUTF8) null, (byte)4, codeAttribute0.attributes);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // descriptor
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", 9);
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)1, (byte)10, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)11, codeAttribute0.attributes);
      cPMethod0.flags = (short) (byte)9;
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, 9, codeAttribute0.attributes);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7A;:ifkKaYa.", (-1405));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(877, (byte)7, byteArray0, (Segment) null, operandManager0, linkedList1);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (-490L), linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)9, codeAttribute0.attributes);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("IObv\"z&Fh|", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 1L, linkedList0);
      boolean boolean0 = cPField0.equals("IObv\"z&Fh|");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7A;:ifkKaYa.", (-1405));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 0L, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("descriptor", 0);
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)9, (byte)1, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 4645L, codeAttribute0.attributes);
      boolean boolean0 = cPMethod0.equals((Object) null);
      assertFalse(boolean0);
  }
}
