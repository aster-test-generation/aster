
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
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPRef_ESTest extends CPRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("{Z_zy");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, 92);
      cPMethodRef0.nameAndTypeIndex = 859;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("{Z_zy", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPMethodRef0.writeBody(dataOutputStream0);
      assertEquals((byte)6, ConstantPoolEntry.CP_Double);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("~qZw=592`aAj}tlk", 2110);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 16);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, 106);
      cPMethodRef0.tag = (byte)12;
      String string0 = cPMethodRef0.toString();
      assertEquals("unknown: Class: ~qZw=592`aAj}tlk#NameAndType: UTF-8:~qZw=592`aAj}tlk(UTF-8:~qZw=592`aAj}tlk)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("T8$.*G|;B<Pt", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      CPInterfaceMethodRef cPInterfaceMethodRef1 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPInterfaceMethodRef0.equals(cPInterfaceMethodRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1451));
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, 1028);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPMethodRef0.resolve(classConstantPool0);
      assertEquals((byte)11, ConstantPoolEntry.CP_InterfaceMethodref);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("~qZw=592`aAj}tlk", 2110);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, 106);
      cPMethodRef0.cachedToString = "";
      String string0 = cPMethodRef0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("*", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 0);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)10);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPInterfaceMethodRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("T8$.*G|;B<Pt", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPInterfaceMethodRef0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aaloud");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 2);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)1);
      cPInterfaceMethodRef0.tag = (byte)3;
      String string0 = cPInterfaceMethodRef0.toString();
      assertEquals("unknown: Class: aaloud#NameAndType: UTF-8:aaloud(UTF-8:aaloud)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aaloud");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 2);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, (byte)3);
      String string0 = cPMethodRef0.toString();
      assertNotNull(string0);
      assertEquals("MethoddRef: Class: aaloud#NameAndType: UTF-8:aaloud(UTF-8:aaloud)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("~qZw=592`aAj}tlk", 2110);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)1);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, (byte)12);
      cPMethodRef0.tag = (byte)9;
      String string0 = cPMethodRef0.toString();
      assertNotNull(string0);
      assertEquals("FieldRef: Class: ~qZw=592`aAj}tlk#NameAndType: UTF-8:~qZw=592`aAj}tlk(UTF-8:~qZw=592`aAj}tlk)", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      cPInterfaceMethodRef0.toString();
      String string0 = cPInterfaceMethodRef0.toString();
      assertNotNull(string0);
      assertEquals("InterfaceMethodRef: Class: #NameAndType: UTF-8:(UTF-8:)", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      CPInterfaceMethodRef cPInterfaceMethodRef1 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPInterfaceMethodRef0.equals(cPInterfaceMethodRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("T8$.*G|;B<Pt", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPInterfaceMethodRef0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("TP8.*G|;B<Pt", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPInterfaceMethodRef0.equals(cPInterfaceMethodRef0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPRef", 12);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)11);
      boolean boolean0 = cPInterfaceMethodRef0.equals(cPNameAndType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPRef", 12);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)11);
      ClassFileEntry[] classFileEntryArray0 = cPInterfaceMethodRef0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (-1095));
      // Undeclared exception!
      try { 
        cPInterfaceMethodRef0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7+4", 70);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (-2199));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPInterfaceMethodRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
}
