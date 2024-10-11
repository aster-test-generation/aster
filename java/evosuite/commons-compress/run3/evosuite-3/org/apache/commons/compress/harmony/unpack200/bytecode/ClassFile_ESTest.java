
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
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
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
  public void test0()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("<");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      int[] intArray0 = new int[7];
      intArray0[3] = (-1);
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
  public void test1()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      classFile0.superClass = 4;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
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
  public void test2()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      classFile0.thisClass = 6;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
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
  public void test3()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      classFile0.major = 1;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
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
  public void test4()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      File file0 = MockFile.createTempFile("/Q`Z{BB", "/Q`Z{BB");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      classFile0.minor = 167;
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
  public void test5()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[9];
      CPUTF8 cPUTF8_0 = new CPUTF8("LocalVariableTypeTable: ", 96);
      classFileEntryArray0[0] = (ClassFileEntry) cPUTF8_0;
      int[] intArray0 = new int[7];
      MockFile mockFile0 = new MockFile("LocalVariableTypeTable: ");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      classFile0.interfaces = intArray0;
      classFile0.fields = classFileEntryArray0;
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  public void test7()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      CPUTF8 cPUTF8_0 = new CPUTF8("LocalVariableTypeTable: ", 0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      cPUTF8Array0[0] = cPUTF8_0;
      cPUTF8_0.resolve(classFile0.pool);
      classFile0.methods = (ClassFileEntry[]) cPUTF8Array0;
      MockFile mockFile0 = new MockFile("LocalVariableTypeTable: ", "LocalVariableTypeTable: ");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      int[] intArray0 = new int[2];
      classFile0.interfaces = intArray0;
      classFile0.fields = classFile0.methods;
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
}
