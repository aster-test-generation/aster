
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPConstant_ESTest extends CPConstant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("tableswitch");
      CPString cPString0 = new CPString(cPUTF8_0, 0);
      CPUTF8 cPUTF8_1 = (CPUTF8)cPString0.getValue();
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Float float0 = new Float((float) (byte)12);
      CPFloat cPFloat0 = new CPFloat(float0, (byte)7);
      Float float1 = new Float((float) (byte)5);
      CPFloat cPFloat1 = new CPFloat(float1, (byte)3);
      boolean boolean0 = cPFloat0.equals(cPFloat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Float float0 = new Float((float) (byte)12);
      CPFloat cPFloat0 = new CPFloat(float0, (byte)7);
      CPFloat cPFloat1 = new CPFloat(float0, (byte)7);
      boolean boolean0 = cPFloat0.equals(cPFloat1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Float float0 = new Float((float) 26);
      CPFloat cPFloat0 = new CPFloat(float0, (byte)5);
      boolean boolean0 = cPFloat0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Float float0 = new Float((float) 26);
      CPFloat cPFloat0 = new CPFloat(float0, (byte)5);
      boolean boolean0 = cPFloat0.equals(cPFloat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Float float0 = new Float((float) (byte)12);
      CPFloat cPFloat0 = new CPFloat(float0, (byte)7);
      boolean boolean0 = cPFloat0.equals(float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer((-1180));
      CPInteger cPInteger0 = new CPInteger(integer0, (-1180));
      cPInteger0.hashCode();
  }
}
