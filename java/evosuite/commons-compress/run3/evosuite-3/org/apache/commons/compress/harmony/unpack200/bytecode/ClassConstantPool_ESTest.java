
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
import java.util.HashSet;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassConstantPool_ESTest extends ClassConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.sortClassPool();
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("M> SAq(Su/2l7egCSE");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      classConstantPool0.addWithNestedEntries(cPClass0);
      int int0 = classConstantPool0.size();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("caload", 512);
      classConstantPool0.add(cPUTF8_0);
      Double double0 = new Double(0.0);
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      classConstantPool0.addWithNestedEntries(cPDouble0);
      classConstantPool0.resolve((Segment) null);
      classConstantPool0.get((byte)3);
      assertEquals(3, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.add((ClassFileEntry) null);
      // Undeclared exception!
      try { 
        classConstantPool0.resolve((Segment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get((-645));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("jFUQ 2{");
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries(innerClassesAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(997, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries(localVariableTypeTableAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1619, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      classConstantPool0.add(localVariableTypeTableAttribute0);
      // Undeclared exception!
      try { 
        classConstantPool0.addNestedEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Double double0 = new Double(0.0);
      CPDouble cPDouble0 = new CPDouble(double0, (-145));
      classConstantPool0.entriesContainsSet = null;
      // Undeclared exception!
      try { 
        classConstantPool0.add(cPDouble0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("caload", 512);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(cPUTF8_0);
      classConstantPool0.add(classFileEntry0);
      assertEquals(1, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Double double0 = new Double(0.0);
      CPDouble cPDouble0 = new CPDouble(double0, (-16));
      classConstantPool0.addWithNestedEntries(cPDouble0);
      classConstantPool0.resolve((Segment) null);
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("M> SAq(Su/2l7egCSE");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      classConstantPool0.addWithNestedEntries(cPClass0);
      classConstantPool0.resolve((Segment) null);
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Long long0 = new Long(2833L);
      CPLong cPLong0 = new CPLong(long0, 512);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(cPLong0);
      classConstantPool0.resolve((Segment) null);
      int int0 = classConstantPool0.indexOf(classFileEntry0);
      assertEquals(2, classConstantPool0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("error");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)1);
      // Undeclared exception!
      try { 
        classConstantPool0.indexOf(cPClass0);
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
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Long long0 = new Long(2833L);
      CPLong cPLong0 = new CPLong(long0, 512);
      classConstantPool0.resolve((Segment) null);
      int int0 = classConstantPool0.indexOf(cPLong0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        classConstantPool0.get(10);
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
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("I]EuW{ReeAboMy|5]A");
      classConstantPool0.add(innerClassesAttribute0);
      HashSet<ClassFileEntry> hashSet0 = classConstantPool0.entriesContainsSet;
      classConstantPool0.othersContainsSet = hashSet0;
      // Undeclared exception!
      try { 
        classConstantPool0.addNestedEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("", 500);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 249);
      classConstantPool0.add(cPClass0);
      classConstantPool0.addNestedEntries();
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("I]EuW{ReeAboMy|5]A");
      classConstantPool0.add(innerClassesAttribute0);
      // Undeclared exception!
      try { 
        classConstantPool0.addNestedEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.add((ClassFileEntry) null);
      classConstantPool0.add((ClassFileEntry) null);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(byteCode0);
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int int0 = classConstantPool0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get((byte)7);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      List<ClassFileEntry> list0 = classConstantPool0.entries();
      assertTrue(list0.isEmpty());
  }
}
