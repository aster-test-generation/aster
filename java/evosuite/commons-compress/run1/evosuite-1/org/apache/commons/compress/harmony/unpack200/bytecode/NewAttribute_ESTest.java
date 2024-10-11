
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
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
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
      CPUTF8 cPUTF8_0 = new CPUTF8(";CM[1*U[-[L ");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)4);
      newAttribute0.addBCOffset((byte)10, (byte)8);
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(1185, 1406, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(4, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("9XsgH", 2351);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1325);
      newAttribute0.toString();
      assertEquals(1325, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("9XsgH", 2351);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1325);
      int int0 = newAttribute0.getLength();
      assertEquals(0, int0);
      assertEquals(1325, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2@KGdQ=xyQaVcS*vf");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 297);
      newAttribute0.addBCLength((byte)8, (byte)10);
      int int0 = newAttribute0.getLength();
      assertEquals(8, int0);
      assertEquals(297, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, 776);
      newAttribute0.addBCOffset((-123), (-1));
      int int0 = newAttribute0.getLength();
      assertEquals(776, newAttribute0.getLayoutIndex());
      assertEquals((-123), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":ZN|Y)8jS{z");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("$");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 30);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCLength", (-651));
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
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2897));
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
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("$");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 30);
      newAttribute0.addBCIndex((byte)11, (byte)6);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        newAttribute0.renumber(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("TO3UO{ )JT^");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-648));
      newAttribute0.addInteger((byte)7, (byte)8);
      newAttribute0.addBCLength((byte)1, (byte)11);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)8, 721, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Long cannot be cast to org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("1");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      newAttribute0.addInteger((byte)8, (-1L));
      MockPrintStream mockPrintStream0 = new MockPrintStream("multianewarray");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(3, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-3521));
      newAttribute0.addInteger((byte)6, (byte)7);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-3521), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("TO3UO{ )JT^");
      MockPrintStream mockPrintStream0 = new MockPrintStream("TO3UO{ )JT^");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-648));
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.addToBody(4, "4;=w|O<VT|)3$ou}}");
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-648), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$1", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1070);
      newAttribute0.addBCOffset((byte)3, (-1));
      PipedInputStream pipedInputStream0 = new PipedInputStream(1142);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(1070, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("TO3UO{ )JT^");
      MockPrintStream mockPrintStream0 = new MockPrintStream("TO3UO{ )JT^");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-648));
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.addBCOffset((byte)1, (byte)4);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-648), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("1");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-660), (byte)10, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)6, codeAttribute0.attributes);
      newAttribute0.addToBody((byte)9, cPMember0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("multianewarray");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
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
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("TO3UO{ )JT^");
      MockPrintStream mockPrintStream0 = new MockPrintStream("TO3UO{ )JT^");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-648));
      newAttribute0.addInteger((byte)7, (byte)8);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals((-648), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, 199);
      newAttribute0.addBCLength((-2461), 199);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      newAttribute0.resolve(classConstantPool0);
      assertEquals(199, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("TO3UO{ )JT^");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-648));
      newAttribute0.addBCLength((byte)1, (byte)11);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)8, 721, byteArray0, (Segment) null, operandManager0, linkedList0);
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
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$1", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1070);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      newAttribute0.renumber(linkedList0);
      newAttribute0.renumber(linkedList0);
      assertEquals(1070, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("1");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-660), (byte)10, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)6, codeAttribute0.attributes);
      newAttribute0.addToBody((byte)9, cPMember0);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
      assertEquals(3, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("faload", (-3527));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)4);
      newAttribute0.addToBody((-3527), "faload");
      MockFile mockFile0 = new MockFile("A_r9mRE2w?.bH@-#k");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, (byte)11);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.doWrite(dataOutputStream0);
      assertEquals(4, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-912));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)1);
      newAttribute0.getStartPCs();
      assertEquals(1, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":ZN|Y)8jS{z");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-9));
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals((-9), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":ZN|Y)8jS{z");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-9));
      newAttribute0.addBCIndex((-9), (byte)11);
      byte[] byteArray0 = new byte[16];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager((int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)6, (byte)5, byteArray0, (Segment) null, operandManager0, linkedList0);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals((-9), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-912));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)1);
      newAttribute0.toString();
      assertEquals(1, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-912));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)1);
      newAttribute0.addInteger((byte)7, 242L);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
      assertEquals(1, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-912));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)1);
      newAttribute0.addBCOffset((byte)8, (-987));
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, (byte)10, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
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
}
