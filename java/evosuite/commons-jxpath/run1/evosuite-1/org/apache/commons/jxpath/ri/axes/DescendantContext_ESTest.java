
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


package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DescendantContext_ESTest extends DescendantContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("+", "+&6?<E>'40%Cp3_vM;/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "+");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      boolean boolean0 = descendantContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, processingInstructionTest0, false, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionChildNodeIterator0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, (NodeTest) null);
      descendantContext0.getCurrentNodePointer();
      assertEquals(1, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, processingInstructionTest0, false, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionChildNodeIterator0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      descendantContext0.getSingleNodePointer();
      BeanPointer beanPointer0 = (BeanPointer)descendantContext0.getCurrentNodePointer();
      assertEquals(1, initialContext0.getPosition());
      assertEquals(0, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-517));
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, nodeTypeTest0, false, (NodePointer) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionChildNodeIterator0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeTypeTest0);
      // Undeclared exception!
      descendantContext0.setPosition(48);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("+", "+&6?<E>'40%Cp3_vM;/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "+");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.setPosition(1163);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-517));
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, nodeTypeTest0, true, (NodePointer) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionChildNodeIterator0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeTypeTest0);
      // Undeclared exception!
      descendantContext0.nextNode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, jXPathContextReferenceImpl0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-517));
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, nodeTypeTest0, false, (NodePointer) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) collectionChildNodeIterator0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeTypeTest0);
      // Undeclared exception!
      descendantContext0.getCurrentNodePointer();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      CoreFunction coreFunction0 = new CoreFunction((-508), (Expression[]) null);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreFunction0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("f6HUc16CA[5g!MfQg");
      DescendantContext descendantContext0 = new DescendantContext(predicateContext0, false, processingInstructionTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("b&hEP| ?cGo0;N");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(selfContext0, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      nodeSetContext0.getCurrentNodePointer();
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, (NodeTest) null);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName(" tI8$;9/wnwIx");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Cannot compare pointers that do not belong to the same tree: '");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, false, nodeNameTest0);
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, processingInstructionTest0, false, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionChildNodeIterator0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      BeanPointer beanPointer0 = (BeanPointer)descendantContext0.getCurrentNodePointer();
      BeanPointer beanPointer1 = (BeanPointer)descendantContext0.getSingleNodePointer();
      assertEquals(1, initialContext0.getPosition());
      assertSame(beanPointer1, beanPointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("5@-d");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) nullPointer0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, true, nullPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, nodeNameTest0);
      // Undeclared exception!
      descendantContext0.next();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, (NodeTest) null, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, (NodeTest) null);
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "uR 51eJ!r>:Y|!vH");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, basicNodeSet0);
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeNameTest0);
      descendantContext0.getCurrentNodePointer();
      descendantContext0.reset();
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, (NodeTest) null);
      boolean boolean0 = descendantContext0.setPosition(1530);
      assertEquals(1, descendantContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, processingInstructionTest0, false, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionChildNodeIterator0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      descendantContext0.getCurrentNodePointer();
      boolean boolean0 = descendantContext0.nextNode();
      assertEquals(2, descendantContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, (NodeTest) null, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, (NodeTest) null);
      boolean boolean0 = descendantContext0.isChildOrderingRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, (NodeTest) null, true, collectionPointer0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, collectionChildNodeIterator0, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, (NodeTest) null);
      boolean boolean0 = descendantContext0.setPosition((-1));
      assertTrue(boolean0);
  }
}
