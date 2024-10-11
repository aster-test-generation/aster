
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
import java.util.LinkedList;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionPointer_ESTest extends CollectionPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex((-8));
      collectionPointer0.compareChildNodePointers(collectionPointer0, collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer((Object) null, locale0);
      collectionPointer1.setIndex(1320);
      collectionPointer0.equals(collectionPointer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("SG&x@^$`'5_ukys`7X");
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      collectionPointer0.setIndex((-1399));
      collectionPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setAttribute(true);
      collectionPointer0.getValuePointer();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      collectionPointer0.getLength();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, qName0);
      collectionPointer0.getImmediateNode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.getBaseValue();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, qName0);
      collectionPointer0.createPath((JXPathContext) null, (Object) qName0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, (Object) null);
      collectionPointer0.createPath((JXPathContext) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setAttribute(true);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      collectionPointer0.createPath(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 0);
      nodePointer0.createPath((JXPathContext) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setAttribute(true);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      collectionPointer0.createChild(jXPathContext0, (QName) null, (-931), (Object) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, (Locale) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      QName qName0 = new QName("<<unknown namespace>>");
      collectionPointer0.createChild(jXPathContext0, qName0, 0, object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      collectionPointer0.createChild((JXPathContext) null, qName0, 1151, (Object) collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, qName0);
      collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setAttribute(true);
      collectionPointer0.createChild((JXPathContext) null, (QName) null, 2793);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 8);
      nodePointer0.createPath((JXPathContext) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodePointer nodePointer0 = collectionPointer0.createChild(jXPathContext0, qName0, (-1169));
      collectionPointer0.compareChildNodePointers(nodePointer0, collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      CollectionPointer collectionPointer1 = new CollectionPointer(linkedList0, locale0);
      collectionPointer0.setIndex(0);
      collectionPointer0.compareChildNodePointers(collectionPointer1, collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      collectionPointer0.setIndex((-2425));
      collectionPointer0.childIterator(nodeTypeTest0, false, collectionPointer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(collectionPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "");
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("5vwbP2a!,Xn", "!,N_]iyz98 ]4t");
      Locale locale0 = Locale.forLanguageTag("!,N_]iyz98 ]4t");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "5vwbP2a!,Xn");
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      collectionPointer0.setIndex(19);
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        collectionPointer0.namespacePointer("<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex((-2425));
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
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex((-2425));
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
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      collectionPointer0.setIndex(1320);
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
      QName qName0 = new QName("TsZmvGoEJM>&/3!>Lt", "TsZmvGoEJM>&/3!>Lt");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        collectionPointer0.createPath(jXPathContext0, (Object) qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: TsZmvGoEJM>&/3!>Lt:TsZmvGoEJM>&/3!>Lt
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag(")");
      QName qName0 = new QName("&v.;9s]Q~M 'm*g", "");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
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
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = Locale.ROOT;
      CollectionPointer collectionPointer0 = new CollectionPointer(jXPathContext0, locale0);
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
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRENCH;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        collectionPointer0.createChild(jXPathContext0, qName0, 1, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 2
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, 486);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.ri.model.beans.BeanPointer into a collection of size 487
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.UK;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      // Undeclared exception!
      try { 
        collectionPointer0.compareChildNodePointers(collectionPointer0, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ITALY;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
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
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex(1320);
      collectionPointer0.getValuePointer();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      nodePointer0.setValue(processingInstructionTest0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 0);
      nodePointer0.getImmediateNode();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ITALY;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.getBaseValue();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.getName();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex((-2425));
      collectionPointer0.asPath();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q", "TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      collectionPointer0.setIndex(0);
      collectionPointer0.asPath();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      collectionPointer0.asPath();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.asPath();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.JAPANESE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      collectionPointer0.testNode(nodeTypeTest0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      collectionPointer0.testNode(processingInstructionTest0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      collectionPointer0.testNode(nodeTypeTest0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.testNode((NodeTest) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag(")");
      QName qName0 = new QName("&v.;9s]Q~M 'm*g", "");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      collectionPointer0.testNode(nodeNameTest0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.namespacePointer("<<unknown namespace>>");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QName qName0 = new QName("5vwbP2a!,Xn", "!,N_]iyz98 ]4t");
      Locale locale0 = Locale.forLanguageTag("!,N_]iyz98 ]4t");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "5vwbP2a!,Xn");
      collectionPointer0.setIndex(19);
      collectionPointer0.namespacePointer("<<unknown namespace>>");
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q", "TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      collectionPointer0.namespaceIterator();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      NodeIterator nodeIterator0 = collectionPointer0.childIterator(processingInstructionTest0, false, collectionPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      collectionPointer0.setIndex((-3587));
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex((-3587));
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertEquals((-3587), collectionPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionPointer collectionPointer1 = new CollectionPointer((NodePointer) collectionPointer0, (Object) locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      QName qName0 = new QName("5vwbP2a!,Xn", "!,N_]iyz98 ]4t");
      Locale locale0 = Locale.forLanguageTag("!,N_]iyz98 ]4t");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "5vwbP2a!,Xn");
      collectionPointer0.setIndex(1);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "5vwbP2a!,Xn");
      // Undeclared exception!
      try { 
        collectionPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.String into a collection of size 2
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex(0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionPointer0);
      NodePointer nodePointer0 = collectionPointer0.createPath(jXPathContext0, object0);
      assertTrue(nodePointer0.isCollection());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      collectionPointer0.setIndex((-2425));
      boolean boolean0 = collectionPointer0.isContainer();
      assertEquals((-2425), collectionPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QName qName0 = new QName("5vwbP2a!,Xn", "!,N_]iyz98 ]4t");
      Locale locale0 = Locale.forLanguageTag("!,N_]iyz98 ]4t");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "5vwbP2a!,Xn");
      boolean boolean0 = collectionPointer0.isContainer();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QName qName0 = new QName("5vwbP2a!,Xn", "!,N_]iyz98 ]4t");
      Locale locale0 = Locale.forLanguageTag("!,N_]iyz98 ]4t");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, "5vwbP2a!,Xn");
      collectionPointer0.isLeaf();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "5vwbP2a!,Xn");
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(collectionPointer0);
      assertFalse(jXPathContext1.equals((Object)jXPathContext0));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag(")");
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q", "TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      NodePointer nodePointer1 = collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q", "TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      collectionPointer0.setIndex(0);
      collectionPointer0.testNode(processingInstructionTest0);
      assertFalse(collectionPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      boolean boolean0 = collectionPointer0.isCollection();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) collectionPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      QName qName0 = new QName("TOb<-%q");
      Object object0 = new Object();
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, nodePointer0);
      int int0 = collectionPointer0.getLength();
      assertEquals(1, int0);
  }
}
