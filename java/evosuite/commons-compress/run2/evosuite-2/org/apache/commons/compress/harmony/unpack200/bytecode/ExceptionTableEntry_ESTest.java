
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
import java.io.FilterOutputStream;
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
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExceptionTableEntry_ESTest extends ExceptionTableEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("SD&lZd0^aCABcR");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 836, cPClass0);
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1699, (byte)9, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 836, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)0, (byte)0, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1, (-1), 0, (CPClass) null);
      exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
      assertFalse(codeAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)6);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, (-1), cPClass0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, (CPClass) null);
      CPClass cPClass0 = exceptionTableEntry0.getCatchType();
      assertNull(cPClass0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("9ct", (-1270));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-397));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, (-1270), cPClass0);
      cPClass0.tag = (byte)0;
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)3, ConstantPoolEntry.CP_Integer);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("g*?");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 166);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(166, 153, 2485, cPClass0);
      cPClass0.tag = (byte) (-124);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)5, ConstantPoolEntry.CP_Long);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("\"yDALzRe]O,[RqoHV");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(479, 1613, 479, cPClass0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 210);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, cPClass0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("x", (-3477));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)1);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(831, (-1732), (-1732), cPClass0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8(">bZ8oCPQ))", (-2775));
      CPClass cPClass0 = new CPClass(cPUTF8_0, 923);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(923, 923, (-2775), cPClass0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("anewarray", 235);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 1625);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-1), 0, (-1), cPClass0);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)4, 23, byteArray0, (Segment) null, operandManager0, linkedList0);
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
  public void test12()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, (CPClass) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1698));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1049, 1049, 0, cPClass0);
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
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(752, 752, 752, (CPClass) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("+^{Qe^e~yTo#cDjG");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      exceptionTableEntry0.write(dataOutputStream0);
  }
}
