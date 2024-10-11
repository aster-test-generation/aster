
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
import org.apache.commons.compress.harmony.pack200.CPString;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPString_ESTest extends CPString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPString cPString0 = new CPString(cPUTF8_0);
      String string0 = cPString0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0);
      String string0 = cPString0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dhW&S");
      cPUTF8_0.setIndex(0);
      CPString cPString0 = new CPString(cPUTF8_0);
      int int0 = cPString0.getIndexInCpUtf8();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2o=MOMotKFWD");
      cPUTF8_0.setIndex(5535);
      CPString cPString0 = new CPString(cPUTF8_0);
      int int0 = cPString0.getIndexInCpUtf8();
      assertEquals(5535, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("M&");
      CPString cPString0 = new CPString(cPUTF8_0);
      CPUTF8 cPUTF8_1 = new CPUTF8("?pW>0|qgo");
      CPString cPString1 = new CPString(cPUTF8_1);
      int int0 = cPString0.compareTo(cPString1);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0);
      CPUTF8 cPUTF8_1 = new CPUTF8("|:");
      CPString cPString1 = new CPString(cPUTF8_1);
      int int0 = cPString0.compareTo(cPString1);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ZrUF)^@w1\"z");
      CPString cPString0 = new CPString(cPUTF8_0);
      // Undeclared exception!
      try { 
        cPString0.compareTo((CPString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPString", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPString cPString0 = null;
      try {
        cPString0 = new CPString((CPUTF8) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPString", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2o=MOMotKFWD");
      CPString cPString0 = new CPString(cPUTF8_0);
      String string0 = cPString0.toString();
      assertEquals("2o=MOMotKFWD", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2o=MOMotKFWD");
      CPString cPString0 = new CPString(cPUTF8_0);
      int int0 = cPString0.getIndexInCpUtf8();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2o=MOMotKFWD");
      CPString cPString0 = new CPString(cPUTF8_0);
      int int0 = cPString0.compareTo(cPString0);
      assertEquals(0, int0);
  }
}
