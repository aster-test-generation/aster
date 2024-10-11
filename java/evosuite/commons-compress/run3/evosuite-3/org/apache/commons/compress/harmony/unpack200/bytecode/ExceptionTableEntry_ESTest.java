
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
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExceptionTableEntry_ESTest extends ExceptionTableEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!", 1985);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1985, 0, 165, cPClass0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1, 1, 0, (CPClass) null);
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 1, byteArray0, (Segment) null, operandManager0, linkedList0);
      exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(0, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-3369), (-3369), (-3369), (CPClass) null);
      CPClass cPClass0 = exceptionTableEntry0.getCatchType();
      assertNull(cPClass0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!", 1985);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1985, 0, 165, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      cPClass1.tag = (byte)0;
      CPClass cPClass2 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)12, ConstantPoolEntry.CP_NameAndType);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType", 77);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)3);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(77, 77, 77, cPClass0);
      cPClass0.tag = (byte) (-126);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)11, ConstantPoolEntry.CP_InterfaceMethodref);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("lookupswitch");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-1453), 70, (-1453), cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals("lookupswitch", cPClass1.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("YD0$", 760);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-942));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(760, 760, (-1161), cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)1, ConstantPoolEntry.CP_UTF8);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">]6u#ou!mk>");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-1), 0, (-1), cPClass0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.write((DataOutputStream) null);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("n 'DzSqs$4B/oPuye:", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1927, 1927, 1927, cPClass0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        exceptionTableEntry0.write(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<sbTa'lj1Hh", 558);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-276));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 54, cPClass0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1649));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-1), (-1), (-1), cPClass0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("`ZlSyVzemO#7Es");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 3191, cPClass0);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, (-230), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3191, Size: 6
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-3369), (-3369), (-3369), (CPClass) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("K%'HLV!KYVkR2^", 200);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 200);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-3397), 1584, 1219, cPClass0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("K%'HLV!KYVkR2^", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      exceptionTableEntry0.write(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("K%'HLV!KYVkR2^", 200);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 200);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-3397), 1584, 1219, cPClass0);
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)7, (-1547), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!", 1985);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1985, 0, 0, cPClass0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        exceptionTableEntry0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }
}
