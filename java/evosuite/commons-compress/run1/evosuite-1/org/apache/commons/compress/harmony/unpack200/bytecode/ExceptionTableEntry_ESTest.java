
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
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExceptionTableEntry_ESTest extends ExceptionTableEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 38, 2913, cPClass0);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)9, (byte)8, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 38, Size: 7
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(+DAgF8p^+L|5gP");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(833, (-885), 833, cPClass0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aload_0_invokespecial_super");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, cPClass0);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, (byte)3, byteArray0, (Segment) null, operandManager0, linkedList0);
      exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(0, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-3042), 0, (-3042), (CPClass) null);
      CPClass cPClass0 = exceptionTableEntry0.getCatchType();
      assertNull(cPClass0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("bc>lc!4JF6g/V*g/3R", 2167);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 59);
      cPClass0.tag = (byte)0;
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(2167, 172, 59, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)11, ConstantPoolEntry.CP_InterfaceMethodref);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("6OpgPY^|#8E");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)6);
      cPClass0.tag = (byte)7;
      cPClass0.tag = (byte) (-81);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1323, 1222, 0, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)1, ConstantPoolEntry.CP_UTF8);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-913));
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(613, 0, (-913), cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)3, ConstantPoolEntry.CP_Integer);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("B\";I+e");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1968));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 196, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)9, ConstantPoolEntry.CP_Fieldref);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 233);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-3463), 233, 0, cPClass0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)12);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(432, (-1), (-1), cPClass0);
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
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ldc");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(618, 618, 0, cPClass0);
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
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("CPMember: ", 2578);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(2578, (-1469), (-1469), cPClass0);
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
  public void test12()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-2107), 206, (-2107), (CPClass) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":6hPwf9LkvP|=");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)6);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(4825, 0, 0, cPClass0);
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

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-2107), 206, (-2107), (CPClass) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      exceptionTableEntry0.write(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";8");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-791));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, (-791), cPClass0);
      byte[] byteArray0 = new byte[9];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1, (byte)9, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
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
}