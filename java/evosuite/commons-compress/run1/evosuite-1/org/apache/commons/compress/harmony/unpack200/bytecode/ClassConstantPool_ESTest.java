
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
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassConstantPool_ESTest extends ClassConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[6];
      CPInteger cPInteger0 = new CPInteger((Integer) intArray0[2], (-197));
      classConstantPool0.addWithNestedEntries(cPInteger0);
      classConstantPool0.resolve((Segment) null);
      assertEquals(1, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Double double0 = new Double((-55.16128613));
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      classConstantPool0.addWithNestedEntries(cPDouble0);
      int int0 = classConstantPool0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      int int0 = classConstantPool0.indexOf((ClassFileEntry) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)9);
      classConstantPool0.addWithNestedEntries(newAttribute0);
      CPUTF8 cPUTF8_1 = (CPUTF8)classConstantPool0.get((byte)1);
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-824), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      classConstantPool0.add(localVariableTableAttribute0);
      // Undeclared exception!
      try { 
        classConstantPool0.resolve((Segment) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries((ClassFileEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[8];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(5377, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries(localVariableTypeTableAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-1), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      classConstantPool0.add(localVariableTypeTableAttribute0);
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
  public void test09()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(68, classConstantPool0);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[4];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[3];
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)7, (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute((CPUTF8) null, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      classConstantPool0.add(runtimeVisibleorInvisibleParameterAnnotationsAttribute0);
      // Undeclared exception!
      try { 
        classConstantPool0.addNestedEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.entriesContainsSet = null;
      Double double0 = new Double((-1.0));
      CPDouble cPDouble0 = new CPDouble(double0, 1220);
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
  public void test11()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("impdep1", 654);
      SignatureAttribute signatureAttribute0 = new SignatureAttribute(cPUTF8_0);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(signatureAttribute0);
      SignatureAttribute signatureAttribute1 = (SignatureAttribute)classConstantPool0.add(classFileEntry0);
      assertFalse(signatureAttribute1.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool");
      CPString cPString0 = new CPString(cPUTF8_0, 0);
      classConstantPool0.add(cPString0);
      classConstantPool0.add(cPString0);
      assertEquals(1, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      ByteCode byteCode0 = new ByteCode(0);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(byteCode0);
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Double double0 = new Double((-55.16128613));
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      classConstantPool0.addWithNestedEntries(cPDouble0);
      classConstantPool0.sortClassPool();
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Long long0 = new Long(147L);
      CPLong cPLong0 = new CPLong(long0, 512);
      classConstantPool0.addWithNestedEntries(cPLong0);
      classConstantPool0.sortClassPool();
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)6);
      classConstantPool0.addWithNestedEntries(cPClass0);
      classConstantPool0.resolve((Segment) null);
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)9);
      classConstantPool0.addWithNestedEntries(newAttribute0);
      classConstantPool0.resolve((Segment) null);
      int int0 = classConstantPool0.indexOf(cPUTF8_0);
      assertEquals(1, classConstantPool0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      classConstantPool0.indexCache = null;
      // Undeclared exception!
      try { 
        classConstantPool0.indexOf(cPUTF8_0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Index cache is not initialized!
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Double double0 = new Double((-55.16128613));
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      // Undeclared exception!
      try { 
        classConstantPool0.indexOf(cPDouble0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        classConstantPool0.get((-309));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      classConstantPool0.addWithNestedEntries(newAttribute0);
      HashSet<ClassFileEntry> hashSet0 = classConstantPool0.entriesContainsSet;
      classConstantPool0.othersContainsSet = hashSet0;
      classConstantPool0.addNestedEntries();
      assertEquals(1, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-1603));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)12, linkedList0);
      classConstantPool0.add(cPMember0);
      classConstantPool0.addNestedEntries();
      assertEquals(1, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int int0 = classConstantPool0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get((byte)1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      List<ClassFileEntry> list0 = classConstantPool0.entries();
      assertEquals(0, list0.size());
  }
}
