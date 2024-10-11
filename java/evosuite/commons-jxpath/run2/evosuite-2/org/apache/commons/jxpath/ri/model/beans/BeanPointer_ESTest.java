
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


package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BeanPointer_ESTest extends BeanPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      QName qName1 = beanPointer0.getName();
      assertEquals("", qName1.getPrefix());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer1 = new BeanPointer((QName) null, beanPointer0, jXPathBasicBeanInfo0, (Locale) null);
      BeanPointer beanPointer2 = (BeanPointer)beanPointer1.getBaseValue();
      assertFalse(beanPointer2.isAttribute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("' and '", (String) null);
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      VariablePointer variablePointer1 = new VariablePointer((QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer1, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer1 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.equals(beanPointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      Locale locale0 = new Locale("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      // Undeclared exception!
      try { 
        nodePointer0.asPath();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("*9(B.ez/oU^");
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("*9(B.ez/oU^", "*9(B.ez/oU^");
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "KIc@>\t^c-=V", jXPathBasicBeanInfo0);
      String string0 = beanPointer0.toString();
      assertEquals("$KIc@>\t^c-=V", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "KIc@>\t^c-=V", jXPathBasicBeanInfo0);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer2 = new BeanPointer(qName0, beanPointer1, jXPathBasicBeanInfo0, locale0);
      beanPointer1.setIndex(1);
      boolean boolean0 = beanPointer1.equals(beanPointer2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      QName qName1 = new QName("KIc@>\t^c-=V", "KIc@>\t^c-=V");
      Locale locale0 = new Locale("<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName1, qName0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer1 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      Pointer pointer0 = jXPathContext0.getContextPointer();
      boolean boolean0 = beanPointer0.equals(pointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "KIc@>\t^c-=V", jXPathBasicBeanInfo0);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer2 = new BeanPointer(qName0, beanPointer1, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer1.equals(beanPointer2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "KIc@>\t^c-=V", jXPathBasicBeanInfo0);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "KIc@>\t^c-=V", jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "KIc@>\t^c-=V", jXPathBasicBeanInfo0);
      Object object0 = new Object();
      boolean boolean0 = beanPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      beanPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("KIc@>\t^c-=V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "KIc@>\t^c-=V", jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName((String) null, "aBL<qnM");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, (Locale) null);
      boolean boolean0 = beanPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, locale0, (JXPathBeanInfo) null, locale0);
      int int0 = beanPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      Object object0 = beanPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, locale0, (JXPathBeanInfo) null, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, (QName) null, locale0, (JXPathBeanInfo) null);
      // Undeclared exception!
      try { 
        beanPointer1.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.US;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, locale0, (JXPathBeanInfo) null, locale0);
      boolean boolean0 = beanPointer0.isCollection();
      assertFalse(boolean0);
  }
}
