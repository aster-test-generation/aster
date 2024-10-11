
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


package org.apache.commons.jxpath.ri.model.dynamic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPointer_ESTest extends DynamicPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName((String) null, "Cannot invoke extension function ");
      Locale locale0 = Locale.ROOT;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, (DynamicPropertyHandler) null, locale0);
      dynamicPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("JZ0h/*AyL[[o#Ey<U");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.GERMANY;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      QName qName1 = dynamicPointer0.getName();
      assertSame(qName1, qName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.JAPANESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, (Object) null, mapDynamicPropertyHandler0, locale0);
      Object object0 = dynamicPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("JZ0h/*AyL[[o#Ey<U");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.GERMANY;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      Object object1 = dynamicPointer0.getBaseValue();
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer");
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, mapDynamicPropertyHandler0, locale0);
      NodeIterator nodeIterator0 = dynamicPointer0.createNodeIterator("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", false, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("/");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer(variablePointer0, (QName) null, (Object) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREA;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, qName0, mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, propertyPointer0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(nodePointer0, qName0, qName0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer0.equals(dynamicPointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("?vgdId=b");
      Locale locale0 = Locale.JAPAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, (DynamicPropertyHandler) null, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("<<unknown namespace>>", false, propertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("50u%Tep,GaCY");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.FRENCH;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, qName0, qName0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator("", false, dynamicPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPointer dynamicPointer0 = new DynamicPointer((NodePointer) null, (QName) null, object0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      QName qName0 = new QName((String) null, "/");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "/", (DynamicPropertyHandler) null, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, object0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPointer1.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("}@vdTP", "zU7=m&m=2LOR+");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      variablePointer0.setIndex(990);
      DynamicPointer dynamicPointer0 = new DynamicPointer(variablePointer0, qName0, "zU7=m&m=2LOR+", mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '}@vdTP:zU7=m&m=2LOR+'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("z");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.ITALY;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "z", mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      Object object0 = new Object();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, object0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPointer1.asPath();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.JAPANESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, (Object) null, mapDynamicPropertyHandler0, locale0);
      String string0 = dynamicPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.JAPANESE;
      DynamicPointer dynamicPointer0 = new DynamicPointer((QName) null, (Object) null, mapDynamicPropertyHandler0, locale0);
      QName qName0 = dynamicPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, propertyPointer0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(nodePointer0, (QName) null, qName0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("$", "$");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREA;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, propertyPointer0, locale0);
      DynamicPointer dynamicPointer1 = new DynamicPointer(nodePointer0, qName0, qName0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.KOREA;
      Object object0 = new Object();
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("4`.CI");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.JAPAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "4`.CI", mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("4`.CI", "4`.CI");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "4`.CI", mapDynamicPropertyHandler0, locale0);
      PropertyPointer propertyPointer0 = dynamicPointer0.getPropertyPointer();
      Object object0 = new Object();
      DynamicPointer dynamicPointer1 = new DynamicPointer(propertyPointer0, qName0, object0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPointer0.equals(dynamicPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.KOREA;
      Object object0 = new Object();
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, object0, (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("RT`7vSo/7C80Z~$>Y", "RT`7vSo/7C80Z~$>Y");
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, qName0, (DynamicPropertyHandler) null, (Locale) null);
      DynamicPointer dynamicPointer1 = new DynamicPointer(dynamicPointer0, qName0, (Object) null, (DynamicPropertyHandler) null);
      boolean boolean0 = dynamicPointer1.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("?vgdId=b");
      Locale locale0 = Locale.JAPAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, (DynamicPropertyHandler) null, locale0);
      int int0 = dynamicPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("?vgdId=b");
      Locale locale0 = Locale.JAPAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, (DynamicPropertyHandler) null, locale0);
      NodeIterator nodeIterator0 = dynamicPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("4`.CI", "4`.CI");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.KOREAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "4`.CI", mapDynamicPropertyHandler0, locale0);
      boolean boolean0 = dynamicPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("?vgdId=b");
      Locale locale0 = Locale.JAPAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.isDynamicPropertyDeclarationSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("?vgdId=b");
      Locale locale0 = Locale.JAPAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, (Object) null, (DynamicPropertyHandler) null, locale0);
      boolean boolean0 = dynamicPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("4`.CI");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Locale locale0 = Locale.JAPAN;
      DynamicPointer dynamicPointer0 = new DynamicPointer(qName0, "4`.CI", mapDynamicPropertyHandler0, locale0);
      // Undeclared exception!
      try { 
        dynamicPointer0.createNodeIterator((String) null, true, dynamicPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }
}
