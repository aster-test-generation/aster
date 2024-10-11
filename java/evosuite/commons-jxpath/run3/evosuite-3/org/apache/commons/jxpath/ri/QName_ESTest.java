
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.QName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class QName_ESTest extends QName_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      assertEquals("", qName0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName(":");
      assertEquals("", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      String string0 = qName0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("Kp=Qb-)d%sc/<e6tHk");
      String string0 = qName0.toString();
      assertEquals("Kp=Qb-)d%sc/<e6tHk", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("VIhO)/>NV_pfyM I:=", "VIhO)/>NV_pfyM I:=");
      qName0.getPrefix();
      assertEquals("VIhO)/>NV_pfyM I:=:VIhO)/>NV_pfyM I:=", qName0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      String string0 = qName0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("Kp=Qb-)d%sc/<e6tHk");
      String string0 = qName0.getName();
      assertEquals("Kp=Qb-)d%sc/<e6tHk", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      // Undeclared exception!
      try { 
        qName0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = null;
      try {
        qName0 = new QName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("Kp=Qb-)d%sc/<e6tHk");
      boolean boolean0 = qName0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("VIhO)/>NV_pfyM I:=", "VIhO)/>NV_pfyM I:=");
      boolean boolean0 = qName0.equals(qName0);
      assertEquals("VIhO)/>NV_pfyM I:=:VIhO)/>NV_pfyM I:=", qName0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("Kp=Qb-)d%sc/<e6tHk");
      QName qName1 = new QName("", "Kp=Qb-)d%sc/<e6tHk");
      boolean boolean0 = qName0.equals(qName1);
      assertFalse(boolean0);
      assertEquals(":Kp=Qb-)d%sc/<e6tHk", qName1.toString());
      assertEquals("", qName1.getPrefix());
      assertEquals("Kp=Qb-)d%sc/<e6tHk", qName1.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      QName qName1 = new QName("", "");
      // Undeclared exception!
      try { 
        qName0.equals(qName1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("", "Kp=Qb-)d%sc/<e6tHk");
      String string0 = qName0.getPrefix();
      assertEquals("", string0);
      assertEquals(":Kp=Qb-)d%sc/<e6tHk", qName0.toString());
      assertEquals("Kp=Qb-)d%sc/<e6tHk", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("{Rs_!A /T:T{\"^x5");
      assertEquals("{Rs_!A /T", qName0.getPrefix());
      assertEquals("T{\"^x5", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("");
      String string0 = qName0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      String string0 = qName0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("");
      qName0.hashCode();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("");
      String string0 = qName0.getPrefix();
      assertNull(string0);
  }
}
