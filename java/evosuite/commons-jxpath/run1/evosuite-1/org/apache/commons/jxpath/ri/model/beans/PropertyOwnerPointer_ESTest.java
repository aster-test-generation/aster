
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PropertyOwnerPointer_ESTest extends PropertyOwnerPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("q\"al*DmdMJ;6,+dj(qQ");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, "q\"al*DmdMJ;6,+dj(qQ", jXPathBasicBeanInfo0);
      beanPointer0.setIndex(1);
      int int0 = nullPointer0.compareChildNodePointers(nodePointer0, beanPointer0);
      assertEquals(1, beanPointer0.getIndex());
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("q\"al*DmdMJ;6,+dj(qQ");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      nodePointer0.setIndex(1);
      int int0 = nullPointer0.compareChildNodePointers(nodePointer0, nodePointer0);
      assertEquals(1, nodePointer0.getIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "Cannot setValue of an object that is not some other object's property");
      nullPointer0.setIndex(2712);
      assertEquals(2712, nullPointer0.getIndex());
      
      nullPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.compiler.Expression");
      QName qName0 = new QName("Cannot set property: ");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Class<Object> class0 = Object.class;
      Class<NodeNameTest> class1 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPointer beanPointer0 = new BeanPointer(propertyPointer0, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      beanPointer0.remove();
      assertFalse(beanPointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      boolean boolean0 = nullPointer0.isValidProperty(qName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("\ffrxNKG9S ;5!kX", "\ffrxNKG9S ;5!kX");
      Object object0 = new Object();
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      boolean boolean0 = beanPointer0.isValidProperty(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, "No such variable: '");
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("$&!Zw{oO7Z,6\"3e", "YD");
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      QName qName1 = nullPointer0.getName();
      assertEquals("$&!Zw{oO7Z,6\"3e:YD", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("Cannot create an object for path ");
      Locale locale0 = Locale.GERMANY;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Object object0 = nullPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, "No such variable: '");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NodeIterator nodeIterator0 = nullPointer0.createNodeIterator("java.home", false, propertyPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("o0]%j<C~V`", "'^=^_(Pmz\"2(");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "o0]%j<C~V`", jXPathBasicBeanInfo0, (Locale) null);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NullPointer nullPointer0 = new NullPointer((Locale) null, "40R~2L~mtbOKf");
      int int0 = nullPointer0.compareChildNodePointers(propertyPointer0, beanPointer0);
      assertEquals((-69), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      BeanPointer beanPointer1 = new BeanPointer(propertyPointer0, qName0, propertyPointer0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer1.setValue(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("E<m[E.&&DyBa a8BOBb", "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.setIndex(2712);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'E<m[E.&&DyBa a8BOBb:org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathInvalidSyntaxException");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(propertyPointer0, qName0, beanPointer0);
      // Undeclared exception!
      try { 
        nodePointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set property: /* - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("", "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, qName0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      // Undeclared exception!
      try { 
        nullPointer0.createNodeIterator("id(", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("Cannot replace the root object", "Cannot replace the root object", "jxpath.debug");
      BeanPointer beanPointer0 = new BeanPointer((QName) null, (Object) null, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.NullPointer");
      // Undeclared exception!
      try { 
        beanPointer0.compareChildNodePointers(nullPointer0, nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeNameTest0, false, propertyPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("H<_");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, class0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.childIterator(nodeNameTest0, false, beanPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      // Undeclared exception!
      try { 
        nullPointer0.isValidProperty((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        nullPointer0.createNodeIterator(", atomic", true, beanPointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("xml");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "f,wbM9Yo$hb=n}GWQ");
      Class<NodeNameTest> class0 = NodeNameTest.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = new Locale("xml", "+S~H;mYIN ^ov^", "f,wbM9Yo$hb=n}GWQ");
      BeanPointer beanPointer0 = new BeanPointer(qName0, nodeNameTest0, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      int int0 = nullPointer0.compareChildNodePointers(beanPointer0, propertyPointer0);
      assertEquals(78, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      // Undeclared exception!
      try { 
        nullPointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Locale locale0 = Locale.GERMANY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      // Undeclared exception!
      try { 
        nodePointer0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, (Locale) null);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot setValue of an object that is not some other object's property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("E<m[E.&&DyBa a8BOBb", "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      nullPointer0.setValue(object0);
      assertEquals(0, nullPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("]#", "]#");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "]#", jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(beanPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createPath((JXPathContext) null, (Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "Cannot setValue of an object that is not some other object's property");
      nullPointer0.setIndex(2712);
      nullPointer0.getValue();
      assertEquals(2712, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("]#", "]#");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.GERMANY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "]#", jXPathBasicBeanInfo0, locale0);
      beanPointer0.getImmediateNode();
      Object object0 = beanPointer0.getRootNode();
      assertEquals("]#", object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "Cannot setValue of an object that is not some other object's property");
      nullPointer0.setIndex(2712);
      nullPointer0.setIndex(2712);
      assertEquals(2712, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("?");
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "Italian", jXPathBasicBeanInfo0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      NodeIterator nodeIterator0 = beanPointer0.childIterator(nodeTypeTest0, false, nullPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      NodeIterator nodeIterator0 = nullPointer0.childIterator(processingInstructionTest0, false, nodePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("E<m[E.&&DyBa a8BOBb", "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      QName qName1 = new QName("<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName1);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1);
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("[<Q^m>xayW");
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        nullPointer0.childIterator((NodeTest) null, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "Cannot setValue of an object that is not some other object's property");
      QName qName0 = new QName("");
      NodeIterator nodeIterator0 = nullPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "Cannot setValue of an object that is not some other object's property");
      boolean boolean0 = nullPointer0.isDynamicPropertyDeclarationSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("E<m[E.&&DyBa a8BOBb", "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeNameTest0, true, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeTypeTest0, true, propertyPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }
}
