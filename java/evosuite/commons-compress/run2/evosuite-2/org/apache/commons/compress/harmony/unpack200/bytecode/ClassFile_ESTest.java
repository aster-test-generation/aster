
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
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassFile_ESTest extends ClassFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      int[] intArray0 = new int[3];
      intArray0[1] = 23;
      MockPrintStream mockPrintStream0 = new MockPrintStream("[f}");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      classFile0.interfaces = intArray0;
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Of}");
      CPUTF8 cPUTF8_0 = new CPUTF8("d5dq", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 683);
      classFile0.pool.addWithNestedEntries(cPClass0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
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
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("En&9Ph");
      classFile0.superClass = (-821);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      File file0 = MockFile.createTempFile("d[x-{ vt~jF", "d[x-{ vt~jF");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      classFile0.thisClass = (-518);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      classFile0.minor = 625;
      MockFile mockFile0 = new MockFile(";g<OM7lBrs0", ";g<OM7lBrs0");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("ddiv");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      classFile0.accessFlags = 2101;
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      Attribute[] attributeArray0 = new Attribute[6];
      int[] intArray0 = new int[3];
      classFile0.attributes = attributeArray0;
      classFile0.fields = classFileEntryArray0;
      classFile0.methods = classFileEntryArray0;
      MockPrintStream mockPrintStream0 = new MockPrintStream("[f}");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      classFile0.interfaces = intArray0;
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      Attribute[] attributeArray0 = new Attribute[6];
      int[] intArray0 = new int[3];
      classFile0.fields = classFileEntryArray0;
      classFile0.methods = (ClassFileEntry[]) attributeArray0;
      MockPrintStream mockPrintStream0 = new MockPrintStream("[f}");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      classFile0.interfaces = intArray0;
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("v[f}");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      int[] intArray0 = new int[11];
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[4];
      classFile0.fields = classFileEntryArray0;
      classFile0.interfaces = intArray0;
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Of}");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      CPUTF8 cPUTF8_0 = new CPUTF8("Of}", 20);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 0);
      classFile0.pool.add(cPNameAndType0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }
}
