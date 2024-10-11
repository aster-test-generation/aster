
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
      QName qName0 = new QName(":$`!s^{8r[2)XE");
      assertEquals("$`!s^{8r[2)XE", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      String string0 = qName0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      String string0 = qName0.toString();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("W\"hKvG{");
      qName0.getPrefix();
      assertEquals("W\"hKvG{", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("", "=d$_BMGPYH)mPWY");
      String string0 = qName0.getPrefix();
      assertEquals(":=d$_BMGPYH)mPWY", qName0.toString());
      assertEquals("=d$_BMGPYH)mPWY", qName0.getName());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      String string0 = qName0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      String string0 = qName0.getName();
      assertEquals("", qName0.toString());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
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
      QName qName0 = new QName((String) null, (String) null);
      QName qName1 = new QName("B%}K&.(");
      // Undeclared exception!
      try { 
        qName0.equals(qName1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      QName qName0 = new QName("6v)k:WR|zl9&");
      boolean boolean0 = qName0.equals("WR|zl9&");
      assertEquals("6v)k", qName0.getPrefix());
      assertEquals("WR|zl9&", qName0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("6v)k:WR|zl9&");
      boolean boolean0 = qName0.equals(qName0);
      assertEquals("6v)k", qName0.getPrefix());
      assertEquals("WR|zl9&", qName0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("6v)k:WR|zl9&");
      String string0 = qName0.getName();
      assertEquals("6v)k", qName0.getPrefix());
      assertEquals("WR|zl9&", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("6v)k:WR|zl9&");
      qName0.toString();
      assertEquals("WR|zl9&", qName0.getName());
      assertEquals("6v)k", qName0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("6v)k:WR|zl9&");
      qName0.hashCode();
      assertEquals("6v)k", qName0.getPrefix());
      assertEquals("WR|zl9&", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("6v)k:WR|zl9&");
      String string0 = qName0.getPrefix();
      assertNotNull(string0);
      assertEquals("6v)k", string0);
      assertEquals("WR|zl9&", qName0.getName());
  }
}
