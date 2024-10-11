
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
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPFieldRef_ESTest extends CPFieldRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 1390);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)4);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, 2247);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)3);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      cPFieldRef0.nameAndTypeIndex = 1;
      cPFieldRef0.writeBody(dataOutputStream0);
      assertEquals("\u0000\u0000\u0000\u0001", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aload_0_putfield_this");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)4);
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)8);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPFieldRef0.resolve(classConstantPool0);
      assertEquals(8, cPFieldRef0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("qfX'}s|%8]h~|{`", 126);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 12);
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)7);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPFieldRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("FieldRef: ");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)1);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)6);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPFieldRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("wb]OG!7O0EG/90`2m'", (-727));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPFieldRef0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("FieldRef: ");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)1);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)6);
      cPFieldRef0.hashCode();
      cPFieldRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aload_0_putfield_this");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)4);
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)8);
      cPFieldRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte) (-119));
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)6);
      cPFieldRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte) (-119));
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)6);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-1794));
      CPFieldRef cPFieldRef1 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("FieldRef: ");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)1);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)6);
      CPFieldRef cPFieldRef1 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)3);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("FieldRef: ");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)1);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)6);
      boolean boolean0 = cPFieldRef0.equals(cPUTF8_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("FieldRef: ");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)1);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)6);
      boolean boolean0 = cPFieldRef0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aload_0_putfield_this");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)4);
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)8);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte) (-119));
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)6);
      CPFieldRef cPFieldRef1 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)8);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-470));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-999));
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, 0);
      // Undeclared exception!
      try { 
        cPFieldRef0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte) (-119));
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)6);
      String string0 = cPFieldRef0.toString();
      assertEquals("FieldRef: Class: #null", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte) (-119));
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)6);
      ClassFileEntry[] classFileEntryArray0 = cPFieldRef0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }
}
