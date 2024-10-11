
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
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BeanPointer_ESTest extends BeanPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("LNLdFs-");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      QName qName1 = beanPointer1.getName();
      assertNull(qName1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.KOREA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      Object object0 = beanPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINA;
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
  public void test03()  throws Throwable  {
      QName qName0 = new QName(")F*a)rc!-aEui");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = (QName)beanPointer0.getBaseValue();
      assertNull(qName1.getPrefix());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("zu;F[[z");
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "zu;F[[z", jXPathBasicBeanInfo0, (Locale) null);
      String string0 = beanPointer0.asPath();
      assertEquals("'zu;F[[z'", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("zu;F[[z", "zu;F[[z");
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, (Locale) null);
      String string0 = beanPointer0.asPath();
      assertEquals("null()", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName(")F*a)rc!-aEui");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, qName0, jXPathBasicBeanInfo0);
      String string0 = beanPointer1.asPath();
      assertEquals("/)F*a)rc!-aEui", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName(")F*a)rc!-aEui");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      String string0 = beanPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("org.apache.common.jxpath.ri.model.beans.BeanPinter");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathBasicBeanInfo0);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "org.apache.commons.jxpath.ri.model.beans.BeanPointer", jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("zu;F[[z");
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, (Locale) null);
      BeanPointer beanPointer1 = new BeanPointer(qName0, "zu;F[[z", jXPathBasicBeanInfo0, (Locale) null);
      beanPointer1.setIndex(1507);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("zu;F[[z");
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, (Locale) null);
      beanPointer0.setIndex(500);
      BeanPointer beanPointer1 = new BeanPointer(qName0, "zu;F[[z", jXPathBasicBeanInfo0, (Locale) null);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(qName1, propertyPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("jj/^94m;M");
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer((QName) null, object0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("org.apache.common.jxpath.ri.model.beans.BeanPinter");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathBasicBeanInfo0);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer((QName) null, "org.apache.common.jxpath.ri.model.beans.BeanPinter", jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(qName0, beanPointer0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("GS<qIe#*m?/");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, jXPathBasicBeanInfo0);
      Class<BeanPointer> class1 = BeanPointer.class;
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, class1, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.equals(beanPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName(")F*a)rc!-aEui");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      Object object0 = beanPointer0.clone();
      boolean boolean0 = object0.equals(beanPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName(")F*a)rc!-aEui");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      Object object0 = new Object();
      boolean boolean0 = beanPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.equals(beanPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("LNLdFs-");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer1.equals(beanPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("LNLdFs-");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      beanPointer1.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("GS<qIe#*m?/");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, jXPathBasicBeanInfo0);
      Class<BeanPointer> class1 = BeanPointer.class;
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, class1, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer1.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("LNLdFs-");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer1.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("LNLdFs-");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      int int0 = beanPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName(")F*a)rc!-aEui");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName(")F*a)rc!-aEui");
      Class<BeanPointer> class0 = BeanPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, qName0, jXPathBasicBeanInfo0);
      Object object0 = beanPointer1.clone();
      boolean boolean0 = object0.equals(beanPointer1);
      assertTrue(boolean0);
      assertFalse(object0.equals((Object)beanPointer0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = beanPointer0.getName();
      assertSame(qName1, qName0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("", "D^");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, (JXPathBeanInfo) null, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      Object object0 = new Object();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, qName0, object0, (JXPathBeanInfo) null);
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
  public void test27()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = new Locale("", "D^");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, (JXPathBeanInfo) null, locale0);
      boolean boolean0 = beanPointer0.isCollection();
      assertFalse(boolean0);
  }
}
