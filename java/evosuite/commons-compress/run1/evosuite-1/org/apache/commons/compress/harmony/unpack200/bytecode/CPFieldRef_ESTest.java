
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
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPFieldRef_ESTest extends CPFieldRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, 0);
      cPFieldRef0.classNameIndex = (-565);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("#");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPFieldRef0.doWrite(dataOutputStream0);
      assertEquals((byte)12, ConstantPoolEntry.CP_NameAndType);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":}j(K");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("yr)Wu?`[!7U-7}:Kk1");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPFieldRef0.writeBody(dataOutputStream0);
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)3);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)7);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPFieldRef0.resolve(classConstantPool0);
      assertEquals((byte)11, ConstantPoolEntry.CP_InterfaceMethodref);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, 0);
      // Undeclared exception!
      try { 
        cPFieldRef0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dload_3");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1092));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)4);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)9);
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
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)1);
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
  public void test06()  throws Throwable  {
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, (-4886));
      cPFieldRef0.hashCode();
      cPFieldRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)10);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      cPFieldRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)10);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      CPFieldRef cPFieldRef1 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)12);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-842));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)10);
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)3);
      CPFieldRef cPFieldRef1 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)3);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-842));
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)10);
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)3);
      Object object0 = new Object();
      boolean boolean0 = cPFieldRef0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":}j(K");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)1);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 22);
      CPFieldRef cPFieldRef1 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)10);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, 0);
      boolean boolean0 = cPFieldRef0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, 0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8(":}j(K");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)1);
      String string0 = cPFieldRef0.toString();
      assertEquals("FieldRef: Class: :}j(K#null", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)10);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      ClassFileEntry[] classFileEntryArray0 = cPFieldRef0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }
}
