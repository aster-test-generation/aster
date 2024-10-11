
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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMember_ESTest extends CPMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("s(I$JTRpev;on+faFW");
      CPUTF8 cPUTF8_1 = new CPUTF8("s(I$JTRpev;on+faFW", (byte)4);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)4, linkedList0);
      String string0 = cPMember0.toString();
      assertEquals("CPMember: UTF-8:s(I$JTRpev;on+faFW(UTF-8:s(I$JTRpev;on+faFW)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPUTF8 cPUTF8_0 = new CPUTF8("JffNv_5", 2);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)11, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPMethod0.resolve(classConstantPool0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("s(I$JTRpev;on+faFW");
      CPUTF8 cPUTF8_1 = new CPUTF8("s(I$JTRpev;on+faFW", (byte)4);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)4, linkedList0);
      cPMember0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3o^J\"9VQG");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 979L, linkedList0);
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      byte[] byteArray0 = new byte[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, 805, byteArray0, (Segment) null, operandManager0, linkedList1);
      linkedList0.add((Attribute) codeAttribute0);
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((byte)7, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      linkedList0.add((Attribute) localVariableTableAttribute0);
      ClassFileEntry[] classFileEntryArray0 = cPMember0.getNestedClassFileEntries();
      assertEquals(4, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("};/`Hi[|x[@)u6/+");
      CPUTF8 cPUTF8_1 = new CPUTF8("F,.7f<");
      HashSet<SignatureAttribute> hashSet0 = new HashSet<SignatureAttribute>();
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>(hashSet0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_1, (byte)11, linkedList0);
      ClassFileEntry[] classFileEntryArray0 = cPField0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3o^J\"9VQG");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 1000L, linkedList0);
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)4, linkedList0);
      boolean boolean0 = cPMember1.equals(cPMember0);
      assertFalse(boolean0);
      assertFalse(cPMember0.equals((Object)cPMember1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("J&kr md\\(wuNb", (-1245));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)5, linkedList0);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_1, 1312L, linkedList0);
      boolean boolean0 = cPMethod1.equals(cPMethod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3o^J\"9VQG");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 979L, linkedList0);
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      byte[] byteArray0 = new byte[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, 805, byteArray0, (Segment) null, operandManager0, linkedList1);
      linkedList0.add((Attribute) codeAttribute0);
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((byte)7, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      linkedList0.add((Attribute) localVariableTableAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-gdU{qB>m", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        cPMember0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("T6]hbNi1J/6X");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(794, (byte)5, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)10, codeAttribute0.attributes);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      cPMember0.nameIndex = 794;
      cPMember0.doWrite(dataOutputStream0);
      assertEquals("\u0000\n\u0003\u001A\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("fcmpg");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (-3571L), linkedList0);
      cPField0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("};Cb`Hi[A|x[@)6/+");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      cPMember0.attributes = null;
      // Undeclared exception!
      try { 
        cPMember0.hashCode();
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
      CPUTF8 cPUTF8_0 = new CPUTF8("F", 1470);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)12, (List<Attribute>) null);
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
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("};Cb`Hi[A|x[@)6/+");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (-3L), (List<Attribute>) null);
      cPMember0.attributes = null;
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_0, 1L, (List<Attribute>) null);
      // Undeclared exception!
      try { 
        cPMember0.equals(cPMember1);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("3o^J\"9VQG");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 979L, linkedList0);
      int[] intArray0 = new int[2];
      byte[] byteArray0 = new byte[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, 805, byteArray0, (Segment) null, operandManager0, linkedList1);
      linkedList0.add((Attribute) codeAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-gdU{qB>m", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        cPMember0.doWrite(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPMember0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 9, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = null;
      try {
        cPMember0 = new CPMember((CPUTF8) null, (CPUTF8) null, (byte)6, codeAttribute0.attributes);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("9k*", 821);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[10];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, (byte)12, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 0L, codeAttribute0.attributes);
      CPField cPField1 = new CPField(cPUTF8_0, cPUTF8_0, 0, codeAttribute0.attributes);
      boolean boolean0 = cPField0.equals(cPField1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("};Cb`Hi[A|x[@)6/+");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (-3L), (List<Attribute>) null);
      CPUTF8 cPUTF8_1 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm");
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_1, 1L, (List<Attribute>) null);
      boolean boolean0 = cPMember0.equals(cPMember1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3o^J\"9VQG");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)12, linkedList0);
      int[] intArray0 = new int[2];
      byte[] byteArray0 = new byte[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, 805, byteArray0, (Segment) null, operandManager0, linkedList1);
      linkedList0.add((Attribute) codeAttribute0);
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)3, codeAttribute0.attributes);
      boolean boolean0 = cPMember0.equals(cPMember1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3o^J\"9VQG");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)12, linkedList0);
      int[] intArray0 = new int[2];
      byte[] byteArray0 = new byte[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, 805, byteArray0, (Segment) null, operandManager0, linkedList1);
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)3, codeAttribute0.attributes);
      boolean boolean0 = cPMember0.equals(cPMember1);
      assertFalse(boolean0);
      assertFalse(cPMember1.equals((Object)cPMember0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("\"{+:r9q2(#UuD+!lV*D", 0);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (byte)11, codeAttribute0.attributes);
      boolean boolean0 = cPField0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("9k*", 821);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, (byte)12, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (byte)6, codeAttribute0.attributes);
      boolean boolean0 = cPField0.equals(cPField0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3o^J\"9VQG");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)12, linkedList0);
      boolean boolean0 = cPMember0.equals("3o^J\"9VQG");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      // Undeclared exception!
      try { 
        cPMember0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }
}
