
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPUTF8_ESTest extends CPUTF8_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("u789'dH^i+Ha", 218);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("%<Q.~uLaHyVsd}}5", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPUTF8_0.writeBody(dataOutputStream0);
      assertEquals("u789'dH^i+Ha", cPUTF8_0.underlyingString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      String string0 = cPUTF8_0.underlyingString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("mUY9sShUbARRA");
      // Undeclared exception!
      try { 
        cPUTF8_0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("LocalVariableTypeTable: ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("LocalVariableTypeTable: ", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      mockFileOutputStream0.close();
      try { 
        cPUTF8_0.writeBody(dataOutputStream0);
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
      CPUTF8 cPUTF8_0 = null;
      try {
        cPUTF8_0 = new CPUTF8((String) null, (-390));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // utf8
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = null;
      try {
        cPUTF8_0 = new CPUTF8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // utf8
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EQ");
      Object object0 = new Object();
      boolean boolean0 = cPUTF8_0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EQ");
      boolean boolean0 = cPUTF8_0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@FfV:=s1,3`mT%5rQ");
      boolean boolean0 = cPUTF8_0.equals(cPUTF8_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@FfV:=s1,3`mT%5rQ");
      CPUTF8 cPUTF8_1 = new CPUTF8("@FfV:=s1,3`mT%5rQ");
      boolean boolean0 = cPUTF8_0.equals(cPUTF8_1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("LocalVariableTypeTable: ");
      String string0 = cPUTF8_0.toString();
      assertEquals("UTF-8:LocalVariableTypeTable: ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@FfV:=s1,3`mT%5rQ");
      cPUTF8_0.setGlobalIndex((byte)3);
      assertEquals(3, cPUTF8_0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@FfV:=s1,3`mT%5rQ");
      String string0 = cPUTF8_0.underlyingString();
      assertEquals("@FfV:=s1,3`mT%5rQ", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EQ");
      cPUTF8_0.hashCode();
      cPUTF8_0.hashCode();
  }
}
