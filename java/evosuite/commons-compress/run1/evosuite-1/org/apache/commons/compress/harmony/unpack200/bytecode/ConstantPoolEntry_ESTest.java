
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantPoolEntry_ESTest extends ConstantPoolEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass");
      assertEquals((byte)1, cPUTF8_0.getTag());
      
      cPUTF8_0.tag = (byte)0;
      byte byte0 = cPUTF8_0.getTag();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass");
      cPUTF8_0.tag = (byte) (-88);
      byte byte0 = cPUTF8_0.getTag();
      assertEquals((byte) (-88), byte0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("i2l", 0);
      int int0 = cPUTF8_0.getGlobalIndex();
      assertEquals((byte)1, cPUTF8_0.getTag());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+u");
      CPString cPString0 = new CPString(cPUTF8_0, 29);
      int int0 = cPString0.getGlobalIndex();
      assertEquals((byte)8, cPString0.getTag());
      assertEquals((byte)1, cPUTF8_0.getTag());
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-565));
      Integer integer0 = new Integer((byte)12);
      cPUTF8_0.equals(integer0);
      assertEquals((byte)1, cPUTF8_0.getTag());
      assertEquals((-565), cPUTF8_0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Zl?", 1004);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, 2645);
      // Undeclared exception!
      try { 
        cPFieldRef0.doWrite((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ZUt*0e|:sb>", (-1397));
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
  public void test7()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.comress.harmn.unpack20.bysecode.CPCls");
      byte byte0 = cPUTF8_0.getTag();
      assertEquals((byte)1, byte0);
      assertEquals((-1), cPUTF8_0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dPload");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)12);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      cPUTF8_0.doWrite(dataOutputStream0);
      assertEquals("\u0001\u0000\u0006dPload", byteArrayOutputStream0.toString());
      assertEquals((-1), cPUTF8_0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dPload");
      int int0 = cPUTF8_0.getGlobalIndex();
      assertEquals((byte)1, cPUTF8_0.getTag());
      assertEquals((-1), int0);
  }
}
