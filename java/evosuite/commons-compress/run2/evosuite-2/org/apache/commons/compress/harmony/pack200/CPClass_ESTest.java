
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPClass_ESTest extends CPClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("f-$6GgO/!C~rvF,{ N|");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      assertTrue(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.toString();
      assertFalse(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      boolean boolean0 = cPClass0.isInnerClass();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPUTF8_0.setIndex(0);
      cPClass0.getIndexInCpUtf8();
      assertFalse(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPUTF8_0.setIndex(1419);
      cPClass0.getIndexInCpUtf8();
      assertFalse(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.CPClass");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      CPClass cPClass1 = new CPClass(cPUTF8_1);
      int int0 = cPClass0.compareTo(cPClass1);
      assertEquals(51, int0);
      assertFalse(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("PZN'");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPUTF8 cPUTF8_1 = new CPUTF8("tPje?`");
      CPClass cPClass1 = new CPClass(cPUTF8_1);
      int int0 = cPClass0.compareTo(cPClass1);
      assertFalse(cPClass1.isInnerClass());
      assertEquals((-36), int0);
      assertTrue(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.CPUTF8");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      // Undeclared exception!
      try { 
        cPClass0.compareTo((CPClass) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPClass cPClass0 = null;
      try {
        cPClass0 = new CPClass(cPUTF8_0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.CPUTF8");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.getIndexInCpUtf8();
      assertFalse(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":(");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      boolean boolean0 = cPClass0.isInnerClass();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ZwSAznu?OtaX2");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.compareTo(cPClass0);
      assertFalse(cPClass0.isInnerClass());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ZwSAznu?OtaX2");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.toString();
      assertFalse(cPClass0.isInnerClass());
  }
}
