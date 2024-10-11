
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
import java.util.HashSet;
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMethod_ESTest extends CPMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aload_0_getstatic_super", 300);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, 196, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)12, codeAttribute0.attributes);
      String string0 = cPMethod0.toString();
      assertEquals("Method: UTF-8:aload_0_getstatic_super(UTF-8:)", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("aload_0_getstatic_super", 300);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)12, 196, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)12, codeAttribute0.attributes);
      cPMethod0.hashCode();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashSet<ConstantValueAttribute> hashSet0 = new HashSet<ConstantValueAttribute>();
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>(hashSet0);
      CPMethod cPMethod0 = null;
      try {
        cPMethod0 = new CPMethod((CPUTF8) null, (CPUTF8) null, (byte)8, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (-1426L), linkedList0);
      cPMethod0.hashCode();
      cPMethod0.hashCode();
  }
}
