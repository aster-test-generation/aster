
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
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InnerClassesAttribute_ESTest extends InnerClassesAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("APQ~vsgg1ryVZl");
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("APQ~vsgg1ryVZl");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPClass cPClass1 = new CPClass(cPUTF8_0, (byte)7);
      // Undeclared exception!
      try { 
        innerClassesAttribute0.addInnerClassesEntry(cPClass1, cPClass0, cPUTF8_0, (byte)1);
       //  fail("Expecting exception: IncompatibleClassChangeError");
       // Unstable assertion
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.attributeName
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("InnerClasses: null");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      innerClassesAttribute0.writeBody(dataOutputStream0);
      assertFalse(innerClassesAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("?sy2&p3zep");
      int int0 = innerClassesAttribute0.getLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute((String) null);
      // Undeclared exception!
      try { 
        innerClassesAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        innerClassesAttribute0.writeBody(dataOutputStream0);
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
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("getstatic");
      // Undeclared exception!
      try { 
        innerClassesAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("$h#S?~ChL)/g");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        innerClassesAttribute0.resolve(classConstantPool0);
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
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("ldc_w");
      // Undeclared exception!
      try { 
        innerClassesAttribute0.doWrite((DataOutputStream) null);
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
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("?[ZK>.Z|");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        innerClassesAttribute0.doWrite(dataOutputStream0);
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
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("nQ3Aqu?>{j");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      innerClassesAttribute0.resolve(classConstantPool0);
      assertFalse(innerClassesAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("ldc_w");
      innerClassesAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("ldc_w");
      Object object0 = new Object();
      boolean boolean0 = innerClassesAttribute0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      boolean boolean0 = innerClassesAttribute0.equals(innerClassesAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      InnerClassesAttribute innerClassesAttribute1 = new InnerClassesAttribute("");
      boolean boolean0 = innerClassesAttribute0.equals(innerClassesAttribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("APQ~vsgg1ryVZl", 3735);
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("APQ~vsgg1ryVZl");
      // Undeclared exception!
      try { 
        innerClassesAttribute0.addInnerClassesEntry((CPClass) null, (CPClass) null, cPUTF8_0, (byte)4);
       //  fail("Expecting exception: IncompatibleClassChangeError");
       // Unstable assertion
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.attributeName
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      String string0 = innerClassesAttribute0.toString();
      assertEquals("InnerClasses: null", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      ClassFileEntry[] classFileEntryArray0 = innerClassesAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("^xcTM[opne?DJIF-jX");
      InnerClassesAttribute.setAttributeName(cPUTF8_0);
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("^xcTM[opne?DJIF-jX");
      innerClassesAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("InnerClasses: null");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      innerClassesAttribute0.doWrite(dataOutputStream0);
      assertFalse(innerClassesAttribute0.isSourceFileAttribute());
  }
}
