
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LineNumberTableAttribute_ESTest extends LineNumberTableAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedOutputStream0.connect(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      lineNumberTableAttribute0.writeBody(dataOutputStream0);
      assertTrue(lineNumberTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[6];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(65280, intArray0, intArray1);
      assertTrue(lineNumberTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-2672), intArray0, intArray0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 198);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      lineNumberTableAttribute0.writeBody(dataOutputStream0);
      assertFalse(lineNumberTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[9];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-2195), intArray0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      lineNumberTableAttribute0.resolve(classConstantPool0);
      assertFalse(lineNumberTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-2672), (int[]) null, (int[]) null);
      int[] intArray0 = lineNumberTableAttribute0.getStartPCs();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(5, intArray0, intArray0);
      int[] intArray1 = lineNumberTableAttribute0.getStartPCs();
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.getLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[5];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-1), intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.getLength();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[0];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(2, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[2];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(3910, intArray0, intArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        lineNumberTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-2672), intArray0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[6];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(1973, intArray0, intArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)5);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[6];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(1973, intArray0, intArray0);
      boolean boolean0 = lineNumberTableAttribute0.equals(lineNumberTableAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[6];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(1973, intArray0, intArray0);
      Object object0 = new Object();
      boolean boolean0 = lineNumberTableAttribute0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[4];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-3043), intArray0, intArray0);
      int[] intArray1 = lineNumberTableAttribute0.getStartPCs();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[4];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-3043), intArray0, intArray0);
      ClassFileEntry[] classFileEntryArray0 = lineNumberTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-3043), intArray0, intArray0);
      String string0 = lineNumberTableAttribute0.toString();
      assertEquals("LineNumberTable: -3043 lines", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("LineNumberTable: -3043 lines", 0);
      LineNumberTableAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)11, ConstantPoolEntry.CP_InterfaceMethodref);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[4];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-3043), intArray0, intArray0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }
}
