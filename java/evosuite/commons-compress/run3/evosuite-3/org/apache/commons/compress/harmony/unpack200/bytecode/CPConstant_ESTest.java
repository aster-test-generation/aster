
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPConstant_ESTest extends CPConstant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant", 0);
      CPString cPString0 = new CPString(cPUTF8_0, (byte)10);
      Object object0 = cPString0.getValue();
      assertSame(object0, cPUTF8_0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      CPFloat cPFloat0 = new CPFloat(float0, 983);
      Float float1 = new Float((float) (byte)11);
      CPFloat cPFloat1 = new CPFloat(float1, (byte)6);
      boolean boolean0 = cPFloat0.equals(cPFloat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Double double0 = new Double(741.9834566559176);
      CPDouble cPDouble0 = new CPDouble(double0, 204);
      boolean boolean0 = cPDouble0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double(741.9834566559176);
      CPDouble cPDouble0 = new CPDouble(double0, 204);
      boolean boolean0 = cPDouble0.equals(cPDouble0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      CPFloat cPFloat0 = new CPFloat(float0, 983);
      CPFloat cPFloat1 = new CPFloat(float0, (byte)6);
      boolean boolean0 = cPFloat0.equals(cPFloat1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      CPFloat cPFloat0 = new CPFloat(float0, 983);
      cPFloat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("?");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)8);
      boolean boolean0 = cPString0.equals(cPUTF8_0);
      assertFalse(boolean0);
  }
}
