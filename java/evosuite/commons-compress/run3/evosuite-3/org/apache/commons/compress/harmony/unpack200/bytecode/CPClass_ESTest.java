
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
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
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
public class CPClass_ESTest extends CPClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      cPClass0.resolve(classConstantPool0);
      assertEquals((byte)12, ConstantPoolEntry.CP_NameAndType);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("name");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 2164);
      String string0 = cPClass0.getName();
      assertEquals("name", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 23);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1484));
      // Undeclared exception!
      try { 
        cPClass0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EnclosingMethod", 142);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("EnclosingMethod");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.close();
      try { 
        cPClass0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-1));
      CPClass cPClass0 = new CPClass(cPUTF8_0, 992);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPClass0.resolve(classConstantPool0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      String string0 = cPClass0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("name");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      cPClass0.hashCode();
      cPClass0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("name");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPClass cPClass1 = new CPClass(cPUTF8_0, (byte)11);
      boolean boolean0 = cPClass0.equals(cPClass1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("q^Gv|DvZ3M3?2l", (-1992));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      boolean boolean0 = cPClass0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("name");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      boolean boolean0 = cPClass0.equals(cPClass0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("name");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      boolean boolean0 = cPClass0.equals("name");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("q^Gv|DvZ3M3?2l", (-1992));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      MockPrintStream mockPrintStream0 = new MockPrintStream("q^Gv|DvZ3M3?2l");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPClass0.writeBody(dataOutputStream0);
      assertEquals(9, cPClass0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1776);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      // Undeclared exception!
      try { 
        cPClass0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("name");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      String string0 = cPClass0.toString();
      assertEquals("Class: name", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("name");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      ClassFileEntry[] classFileEntryArray0 = cPClass0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPClass cPClass0 = null;
      try {
        cPClass0 = new CPClass((CPUTF8) null, (byte)7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }
}
