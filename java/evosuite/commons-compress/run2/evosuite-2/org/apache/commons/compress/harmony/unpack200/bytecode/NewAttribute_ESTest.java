
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
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NewAttribute_ESTest extends NewAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("/2q6ybDK8t[UdG");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      newAttribute0.addBCOffset(1554, (byte)6);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)6, (byte)7, byteArray0, (Segment) null, operandManager0, linkedList0);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(7, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 241);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)1);
      newAttribute0.toString();
      assertEquals(1, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 254);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.addInteger(2013, (byte)7);
      int int0 = newAttribute0.getLength();
      assertEquals(2013, int0);
      assertEquals(12, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("kr~\")|fYdv ");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@t");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2153));
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals((-2153), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      HashSet<ClassFileEntry> hashSet0 = classConstantPool0.othersContainsSet;
      newAttribute0.addToBody((byte)1, hashSet0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        newAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-592));
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
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("n`&Ns`M-,<A8m&", 1015);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)4);
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
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Dg;ja]", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1);
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
  public void test09()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, 0);
      newAttribute0.addToBody(94, "|g:Rrk2@r6");
      newAttribute0.addBCLength(47, 0);
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(183, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("o3w@$N1*rPP");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1201);
      newAttribute0.addBCOffset(1, (-182));
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1, 1, byteArray0, (Segment) null, operandManager0, linkedList0);
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
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 188);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 188);
      newAttribute0.addBCIndex((byte)8, 94);
      MockPrintStream mockPrintStream0 = new MockPrintStream("R*m`+83eLoDFvc");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(188, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 188);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 188);
      newAttribute0.addBCOffset((byte)6, (byte)9);
      MockPrintStream mockPrintStream0 = new MockPrintStream("R*m`+83eLoDFvc");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(188, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.addBCOffset((byte)5, (byte)8);
      PipedInputStream pipedInputStream0 = new PipedInputStream(932);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(12, newAttribute0.getLayoutIndex());
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 188);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 188);
      Object object0 = new Object();
      newAttribute0.addToBody((byte)4, object0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("R*m`+83eLoDFvc");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(188, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.addToBody(0, cPUTF8_0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(932);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
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
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 254);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.addInteger(2013, (byte)7);
      MockPrintStream mockPrintStream0 = new MockPrintStream("lM?T@ G");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.doWrite(dataOutputStream0);
      assertEquals(12, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 167);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCOffset((byte)9, (byte)12);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      newAttribute0.resolve(classConstantPool0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, 0);
      newAttribute0.addBCLength(47, 0);
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(183, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 96);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      newAttribute0.addBCIndex((byte)7, 0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        newAttribute0.renumber(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 254);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.renumbered = true;
      newAttribute0.renumber((List<Integer>) null);
      assertEquals(12, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.addToBody(0, cPUTF8_0);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(12, newAttribute0.getLayoutIndex());
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-592));
      newAttribute0.addBCOffset((-1304), (-592));
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
      assertEquals((-592), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-592));
      newAttribute0.addBCOffset((-1304), (-592));
      int int0 = newAttribute0.getLength();
      assertEquals((-592), newAttribute0.getLayoutIndex());
      assertEquals((-1304), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-592));
      int int0 = newAttribute0.getLength();
      assertEquals(0, int0);
      assertEquals((-592), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.getStartPCs();
      assertEquals(12, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-592));
      newAttribute0.addBCLength((-4568), (-1304));
      assertEquals((-592), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.toString();
      assertEquals(12, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      HashSet<ClassFileEntry> hashSet0 = classConstantPool0.othersContainsSet;
      newAttribute0.addToBody((byte)1, hashSet0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(932);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(1, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p9 qBIx%sk4KbQi^f", 932);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.addInteger((byte)7, 1515L);
      PipedInputStream pipedInputStream0 = new PipedInputStream(932);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(12, newAttribute0.getLayoutIndex());
  }
}
