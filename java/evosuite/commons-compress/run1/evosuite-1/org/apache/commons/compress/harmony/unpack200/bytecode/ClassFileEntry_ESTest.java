
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassFileEntry_ESTest extends ClassFileEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1924);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      cPUTF8_0.resolve(classConstantPool0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("HnGF$3$-[!/F`");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPUTF8_0.write(dataOutputStream0);
      assertEquals("", cPUTF8_0.underlyingString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Float float0 = new Float(3945.705F);
      CPFloat cPFloat0 = new CPFloat(float0, (-1144));
      String string0 = cPFloat0.toString();
      assertEquals("Float: 3945.705", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1924);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)1);
      String string0 = newAttribute0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, 2016);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("$]|9L'p#(p-&4:p9'?", 3185);
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute(cPUTF8_0);
      Object object0 = new Object();
      boolean boolean0 = sourceFileAttribute0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("o#g.apac#e.commons.compress.hamony.unpack20bytecodeplassFileEnt$y");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      cPUTF8_0.resolve(classConstantPool0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPUTF8_0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("PN%fhDJ1e");
      // Undeclared exception!
      try { 
        innerClassesAttribute0.write((DataOutputStream) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("=");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)3);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)5);
      int int0 = cPFieldRef0.objectHashCode();
      //  // Unstable assertion: assertEquals(1766185120, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Entry has not been resolved");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      cPUTF8_0.resolve(classConstantPool0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPUTF8_0.write(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("bN8cVh'W.l.qaJ");
      ClassFileEntry[] classFileEntryArray0 = cPUTF8_0.getNestedClassFileEntries();
      assertEquals(0, classFileEntryArray0.length);
  }
}
