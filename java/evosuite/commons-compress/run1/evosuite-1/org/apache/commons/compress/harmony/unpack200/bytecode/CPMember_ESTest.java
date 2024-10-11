
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
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMember_ESTest extends CPMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, 0L, linkedList0);
      String string0 = cPMember0.toString();
      assertEquals("CPMember: UTF-8:(UTF-8:)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(", 5);
      CPUTF8 cPUTF8_1 = new CPUTF8("(");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_1, (byte)10, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPField0.resolve(classConstantPool0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("bCX0uzN[c", 0);
      CPUTF8 cPUTF8_1 = new CPUTF8("f]ts`PGr)D7`");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)9, linkedList0);
      cPMember0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)4, linkedList0);
      int[] intArray0 = new int[5];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(6, intArray0, intArray0);
      linkedList0.add((Attribute) lineNumberTableAttribute0);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute((CPClass) null, (CPNameAndType) null);
      linkedList0.add((Attribute) enclosingMethodAttribute0);
      ClassFileEntry[] classFileEntryArray0 = cPMember0.getNestedClassFileEntries();
      assertEquals(4, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)4, linkedList0);
      cPMember0.nameIndex = (int) (byte)6;
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute((CPClass) null, (CPNameAndType) null);
      linkedList0.add((Attribute) enclosingMethodAttribute0);
      ClassFileEntry[] classFileEntryArray0 = cPMember0.getNestedClassFileEntries();
      assertEquals(3, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(", 5);
      CPUTF8 cPUTF8_1 = new CPUTF8("(");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_1, (byte)10, linkedList0);
      ClassFileEntry[] classFileEntryArray0 = cPField0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("getstatic");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)10, linkedList0);
      cPMethod1.flags = (short) (byte)5;
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("getstatic");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPUTF8 cPUTF8_1 = new CPUTF8("getstatic");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)6, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("`6(zc*<0Etd^\"B)h2s", (-139));
      LinkedList<ConstantValueAttribute> linkedList0 = new LinkedList<ConstantValueAttribute>();
      LinkedList<Attribute> linkedList1 = new LinkedList<Attribute>(linkedList0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 2634L, linkedList1);
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("8fLF<^Ek8azSeGfd=");
      linkedList1.add((Attribute) innerClassesAttribute0);
      linkedList1.add((Attribute) innerClassesAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("8fLF<^Ek8azSeGfd=");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      cPField0.doWrite(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("]I&Yuk#$*{N!6Z");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("]I&Yuk#$*{N!6Z", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPMethod0.descriptorIndex = (int) (byte)6;
      cPMethod0.doWrite(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("80+u_");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)1, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPMember0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("z]e/F", 1);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-990), (byte)4, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (-503L), codeAttribute0.attributes);
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

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("{H5gDSkGoZV1+8Fj", 31);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 0L, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      cPUTF8Array0[0] = cPUTF8_0;
      cPUTF8Array0[1] = cPUTF8_0;
      cPUTF8Array0[2] = cPUTF8_0;
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(6, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray1);
      linkedList0.add((Attribute) localVariableTableAttribute0);
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        cPMember0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-1485));
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)8, 2042, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)4, codeAttribute0.attributes);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPMethod0.doWrite(dataOutputStream0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("`6(zc*<0Etd^\"B)h2s", (-139));
      LinkedList<ConstantValueAttribute> linkedList0 = new LinkedList<ConstantValueAttribute>();
      LinkedList<Attribute> linkedList1 = new LinkedList<Attribute>(linkedList0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 2634L, linkedList1);
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList2 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)1, 58, byteArray0, (Segment) null, operandManager0, linkedList2);
      linkedList1.add((Attribute) codeAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("`6(zc*<0Etd^\"B)h2s");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        cPField0.doWrite(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("`6(zc*<0Etd^\"B)h2s", (-139));
      LinkedList<ConstantValueAttribute> linkedList0 = new LinkedList<ConstantValueAttribute>();
      LinkedList<Attribute> linkedList1 = new LinkedList<Attribute>(linkedList0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 2634L, linkedList1);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[8];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[6];
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(2138, deprecatedAttribute0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValueArray0[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-2971), cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      annotationsAttribute_AnnotationArray0[1] = annotationsAttribute_AnnotationArray0[0];
      annotationsAttribute_AnnotationArray0[2] = annotationsAttribute_AnnotationArray0[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation1 = new AnnotationsAttribute.Annotation(503, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[3] = annotationsAttribute_Annotation1;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      linkedList1.add((Attribute) runtimeVisibleorInvisibleParameterAnnotationsAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("8fLF<^Ek8azSeGfd=");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        cPField0.doWrite(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("gtstatic");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CPMember: UTF-8:gtstatic(UTF-8:gtstatic)");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        cPMethod0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, (byte)11, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = null;
      try {
        cPMember0 = new CPMember((CPUTF8) null, (CPUTF8) null, (byte)12, codeAttribute0.attributes);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aload_0_invokevirtual_super");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)1, linkedList0);
      CPUTF8 cPUTF8_1 = new CPUTF8("K<,IrsZnI'V@");
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)1, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ge}cMtstatic");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1447, (-3191), byteArray0, (Segment) null, operandManager0, linkedList1);
      cPMethod1.attributes = codeAttribute0.attributes;
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      linkedList0.add((Attribute) exceptionsAttribute0);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("{H5gDSkGoZV1+8Fj", 31);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 0L, linkedList0);
      boolean boolean0 = cPMember0.equals(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("5o\u0004vI1J#/");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)4, linkedList0);
      boolean boolean0 = cPMember0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("getstatic");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("gtstatic");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)10, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(boolean0);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("A{;");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 2063L, (List<Attribute>) null);
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
}
