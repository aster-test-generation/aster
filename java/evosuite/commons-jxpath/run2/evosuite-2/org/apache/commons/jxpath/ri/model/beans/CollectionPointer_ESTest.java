
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionPointer_ESTest extends CollectionPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      CollectionPointer collectionPointer0 = new CollectionPointer(locale0, locale0);
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, collectionPointer0, locale0);
      nodePointer0.setIndex(6144);
      collectionPointer0.compareChildNodePointers(nodePointer0, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer((Object) null, locale0);
      collectionPointer1.setIndex((-512));
      collectionPointer0.equals(collectionPointer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      collectionPointer0.setIndex(19);
      collectionPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      collectionPointer0.setAttribute(true);
      collectionPointer0.getValuePointer();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, object0);
      collectionPointer0.getLength();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale0 = Locale.forLanguageTag("QbHN3U~l");
      CollectionPointer collectionPointer0 = new CollectionPointer(fileSystemHandling0, locale0);
      collectionPointer0.getImmediateNode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, object0);
      collectionPointer1.getBaseValue();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator((QName) null);
      Object object0 = collectionPointer0.getBaseValue();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeIterator0);
      collectionPointer0.setIndex(0);
      collectionPointer0.createPath(jXPathContext0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      collectionPointer0.setIndex(93);
      collectionPointer0.createPath((JXPathContext) null, (Object) "[");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("kaK|NO0z?mn\"b{uu", "kaK|NO0z?mn\"b{uu");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      collectionPointer0.createPath(jXPathContext0, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      collectionPointer0.createPath(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.JAPANESE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setAttribute(true);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      collectionPointer0.createPath(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex(61);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      collectionPointer0.createPath(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName(" \">", "org.apache.commons.jxpath.ri.model.NodePointer");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, jXPathContext0);
      collectionPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator((QName) null);
      Object object0 = collectionPointer0.getBaseValue();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeIterator0);
      collectionPointer0.setAttribute(true);
      collectionPointer0.createChild(jXPathContext0, (QName) null, 0, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator((QName) null);
      Object object0 = collectionPointer0.getBaseValue();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeIterator0);
      collectionPointer0.createChild(jXPathContext0, (QName) null, 19, object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) collectionPointer0);
      collectionPointer0.createChild(jXPathContext0, (QName) null, 0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator((QName) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeIterator0);
      collectionPointer0.createChild(jXPathContext0, (QName) null, 55);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale0 = Locale.forLanguageTag("QbHN3U~l");
      CollectionPointer collectionPointer0 = new CollectionPointer(fileSystemHandling0, locale0);
      QName qName0 = new QName("QbHN3U~l");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) fileSystemHandling0);
      NodePointer nodePointer0 = collectionPointer0.createChild(jXPathContext0, qName0, (-659));
      collectionPointer0.compareChildNodePointers(nodePointer0, collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      collectionPointer0.setIndex(394);
      collectionPointer0.compareChildNodePointers(collectionPointer0, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      collectionPointer0.setIndex(93);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("/");
      collectionPointer0.childIterator(processingInstructionTest0, false, collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("Xkoq9dkIm}S9QIUR@7");
      Locale locale0 = Locale.CHINA;
      CollectionPointer collectionPointer0 = new CollectionPointer(qName0, locale0);
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, collectionPointer0, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer(nodePointer0, collectionPointer0);
      // Undeclared exception!
      try { 
        collectionPointer1.setValue("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(0);
      // Undeclared exception!
      try { 
        collectionPointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex(0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        collectionPointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      collectionPointer0.setIndex(0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        collectionPointer0.getValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("kaK|NO0z?mn\"b{uu", "kaK|NO0z?mn\"b{uu");
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      // Undeclared exception!
      try { 
        collectionPointer0.createPath(jXPathContext0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: kaK|NO0z?mn\"b{uu:kaK|NO0z?mn\"b{uu
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.createPath(jXPathContext0, (Object) collectionPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("+uAOu)].E{Z|%ES-8c");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, 900, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 901
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild(jXPathContext0, qName0, 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("node");
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      // Undeclared exception!
      try { 
        collectionPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex(0);
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator((NodeTest) null, true, collectionPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      collectionPointer0.setIndex(0);
      // Undeclared exception!
      try { 
        collectionPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, basicVariables0);
      variablePointer0.setIndex((-71));
      // Undeclared exception!
      try { 
        collectionPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator((QName) null);
      Object object0 = collectionPointer0.getBaseValue();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeIterator0);
      NodePointer nodePointer0 = collectionPointer0.createChild(jXPathContext0, (QName) null, 0, object0);
      nodePointer0.createPath(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.isLeaf();
      collectionPointer0.getValuePointer();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Locale locale0 = Locale.forLanguageTag("QbHN3U~l");
      CollectionPointer collectionPointer0 = new CollectionPointer(fileSystemHandling0, locale0);
      QName qName0 = new QName("QbHN3U~l");
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.CHINA;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex((-3198));
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      jXPathContext0.getRelativeContext(collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      collectionPointer0.setIndex(0);
      collectionPointer0.asPath();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("", "/.[");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      collectionPointer0.setIndex(0);
      collectionPointer0.asPath();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, object0);
      collectionPointer1.toString();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      collectionPointer0.asPath();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.JAPAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(qName0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      collectionPointer0.testNode(nodeTypeTest0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("node");
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      collectionPointer0.testNode(processingInstructionTest0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("/.[", "/.[");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      collectionPointer0.testNode((NodeTest) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      collectionPointer0.testNode(nodeNameTest0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      collectionPointer0.setIndex(0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("THR");
      collectionPointer0.testNode(processingInstructionTest0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.namespacePointer("[");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      
      collectionPointer0.setIndex(0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      
      NodePointer nodePointer0 = collectionPointer0.namespacePointer("Sv76\u0003^u5a=AML6J8");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(nodePointer0);
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      NodeIterator nodeIterator0 = collectionPointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("4f@");
      NodeIterator nodeIterator0 = collectionPointer0.childIterator(processingInstructionTest0, false, collectionPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex(0);
      NodePointer nodePointer0 = collectionPointer0.getValuePointer();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator(nodeNameTest0, true, nodePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex((-888));
      CollectionPointer collectionPointer1 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertEquals((-888), collectionPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      Object object0 = collectionPointer0.getImmediateNode();
      boolean boolean0 = collectionPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("[", "[", "");
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer1 = new CollectionPointer(collectionPointer0, object0);
      boolean boolean0 = collectionPointer1.equals(collectionPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      QName qName0 = new QName("", "/.[");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild(jXPathContext0, qName0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 2
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      Object object0 = collectionPointer0.getBaseValue();
      collectionPointer0.setIndex(0);
      collectionPointer0.setValue(object0);
      assertEquals(0, collectionPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.isContainer();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      QName qName0 = new QName("", "/.[");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "");
      boolean boolean0 = collectionPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "");
      NodePointer nodePointer0 = collectionPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      QName qName0 = collectionPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      collectionPointer0.setIndex(0);
      boolean boolean0 = collectionPointer0.isContainer();
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = new Locale("node");
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.isCollection();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      CollectionPointer collectionPointer0 = new CollectionPointer(jXPathContext0, (Locale) null);
      // Undeclared exception!
      try { 
        collectionPointer0.createPath(jXPathContext0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      int int0 = collectionPointer0.getLength();
      assertEquals(0, int0);
  }
}
