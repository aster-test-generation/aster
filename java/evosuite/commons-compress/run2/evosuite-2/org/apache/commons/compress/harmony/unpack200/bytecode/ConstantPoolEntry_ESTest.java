
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
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantPoolEntry_ESTest extends ConstantPoolEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(3);
      CPInteger cPInteger0 = new CPInteger(integer0, 3);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)7);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPInteger0.doWrite(dataOutputStream0);
      assertEquals("\u0003\u0000\u0000\u0000\u0003", byteArrayOutputStream0.toString());
      assertEquals((byte)3, cPInteger0.getTag());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      assertEquals((byte)1, cPUTF8_0.getTag());
      
      cPUTF8_0.tag = (byte)0;
      byte byte0 = cPUTF8_0.getTag();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Rq}V06@`Lb&");
      cPUTF8_0.tag = (byte) (-25);
      byte byte0 = cPUTF8_0.getTag();
      assertEquals((byte) (-25), byte0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-1462));
      CPInteger cPInteger0 = new CPInteger(integer0, 0);
      int int0 = cPInteger0.getGlobalIndex();
      assertEquals((byte)3, cPInteger0.getTag());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double(414.1933);
      CPDouble cPDouble0 = new CPDouble(double0, (-2695));
      cPDouble0.globalIndex = 26;
      int int0 = cPDouble0.getGlobalIndex();
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Float float0 = new Float(0.0F);
      CPFloat cPFloat0 = new CPFloat(float0, (-1148));
      cPFloat0.equals(cPFloat0);
      assertEquals((-1148), cPFloat0.getGlobalIndex());
      assertEquals((byte)4, cPFloat0.getTag());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Long long0 = new Long(358L);
      CPLong cPLong0 = new CPLong(long0, 0);
      cPLong0.equals(long0);
      assertEquals((byte)5, cPLong0.getTag());
      assertEquals(0, cPLong0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(1327);
      CPInteger cPInteger0 = new CPInteger(integer0, 1327);
      // Undeclared exception!
      try { 
        cPInteger0.doWrite((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Rq}06@`Lb&");
      byte byte0 = cPUTF8_0.getTag();
      assertEquals((-1), cPUTF8_0.getGlobalIndex());
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPUTF8_0.doWrite(dataOutputStream0);
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
      Double double0 = new Double(448.26333385158904);
      CPDouble cPDouble0 = new CPDouble(double0, (-2662));
      int int0 = cPDouble0.getGlobalIndex();
      assertEquals((byte)6, cPDouble0.getTag());
      assertEquals((-2662), int0);
  }
}
