
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
import org.apache.commons.jxpath.Variables;
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
      QName qName0 = new QName(" ");
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      int int0 = nullPointer0.compareChildNodePointers(nullPointer0, beanPointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      nullPointer0.setIndex('j');
      assertEquals(106, nullPointer0.getIndex());
      
      nullPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, ":FDpy3AP)lsN?)");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = new Locale("<<unknown namespace>>", ":FDpy3AP)lsN?)", "");
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, locale0, jXPathBasicBeanInfo0);
      beanPointer0.setValue((Object) null);
      assertNull(beanPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("", "id(");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
      boolean boolean0 = beanPointer0.isValidProperty(qName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, ":");
      QName qName0 = nullPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("", "null()");
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      QName qName1 = beanPointer0.getName();
      assertSame(qName0, qName1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("d9?3)2nAI", "DZcO*HLUw\"z:+9DUoQ");
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      int int0 = nullPointer0.compareChildNodePointers(beanPointer0, propertyPointer0);
      assertEquals(58, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("OP(*B_1W2");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Ja-oHNlPuwCF");
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeNameTest0, false, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      NodeIterator nodeIterator0 = beanPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("T%J$", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, "T%J$", jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.setValue(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: T%J$:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      // Undeclared exception!
      try { 
        nullPointer0.setValue(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
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
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("", ".?5+kj{*GRu_t");
      Object object0 = new Object();
      Class<NodeNameTest> class0 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.createNodeIterator("V'!d", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      QName qName0 = new QName("q#[]HKX@ZuX, \"tp", ";N S[");
      NullPointer nullPointer1 = new NullPointer(nullPointer0, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.createNodeIterator(";N S[", false, nullPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      // Undeclared exception!
      try { 
        nullPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("D[@fGJ\"V^Rfy'@lm5~");
      Class<Object> class0 = Object.class;
      Class<NodeNameTest> class1 = NodeNameTest.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "D[@fGJ\"V^Rfy'@lm5~", jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(locale0, "JXPath: found system property");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        beanPointer0.childIterator(nodeNameTest0, true, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, ":");
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "evI`U:'ukg9");
      // Undeclared exception!
      try { 
        nullPointer0.childIterator(nodeNameTest0, true, nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      QName qName0 = new QName((String) null, "Cannot remove an object that is not some other object's property or a collection element");
      boolean boolean0 = nullPointer0.isValidProperty(qName0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("OP(*B_1W2");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      NodeIterator nodeIterator0 = nullPointer0.createNodeIterator("Ja-oHNlPuwCF", false, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("");
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName1 = new QName("-5H0g+#S");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName1);
      VariablePointer variablePointer1 = new VariablePointer(qName0);
      int int0 = nullPointer0.compareChildNodePointers(variablePointer1, variablePointer0);
      assertEquals((-8), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("Cannot remove an object that is not some other object's property or a collection element");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Cannot remove an object that is not some other object's property or a collection element");
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      beanPointer0.remove();
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      // Undeclared exception!
      try { 
        nullPointer0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      beanPointer0.setIndex(1003);
      // Undeclared exception!
      try { 
        beanPointer0.setValue("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The specified collection element does not exist: $:/:
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, nodeNameTest0, jXPathBasicBeanInfo0);
      // Undeclared exception!
      try { 
        beanPointer0.setValue("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot setValue of an object that is not some other object's property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      Class<Object> class0 = Object.class;
      Class<Locale.LanguageRange> class1 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, nullPointer0, jXPathBasicBeanInfo0, locale0);
      // Undeclared exception!
      try { 
        beanPointer0.setValue(class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      QName qName0 = new QName("");
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPointer0, (JXPathBeanInfo) null, locale0);
      beanPointer0.setIndex((-8));
      beanPointer0.getImmediateNode();
      assertEquals((-8), beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      nullPointer0.getImmediateNode();
      Object object0 = nullPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      NullPointer nullPointer0 = new NullPointer(variablePointer0, (QName) null);
      nullPointer0.setIndex(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, qName0, jXPathBasicBeanInfo0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      NodeIterator nodeIterator0 = beanPointer0.childIterator(processingInstructionTest0, true, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("", "");
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeNameTest0, true, beanPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      NullPointer nullPointer0 = new NullPointer(locale0, "r|s?~|2`");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      NodeIterator nodeIterator0 = nullPointer0.childIterator(nodeTypeTest0, true, propertyPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      NullPointer nullPointer0 = new NullPointer(locale0, "r|s?~|2`");
      // Undeclared exception!
      try { 
        nullPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, ",&kA9O9}>$iW\".'?J>");
      boolean boolean0 = nullPointer0.isDynamicPropertyDeclarationSupported();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, ",&kA9O9}>$iW\".'?J>");
      QName qName0 = new QName("skEag<", ",&kA9O9}>$iW\".'?J>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, nodeNameTest0);
      // Undeclared exception!
      try { 
        nullPointer0.childIterator((NodeTest) null, true, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }
}
