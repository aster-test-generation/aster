
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SelfContext_ESTest extends SelfContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      boolean boolean0 = selfContext0.nextNode();
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, (Expression) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("`0!FE");
      NamespaceContext namespaceContext0 = new NamespaceContext(predicateContext0, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(namespaceContext0, processingInstructionTest0, false, false);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-198));
      SelfContext selfContext0 = new SelfContext(childContext0, nodeTypeTest0);
      selfContext0.getCurrentNodePointer();
      selfContext0.getSingleNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(evalContext0, nodeNameTest0);
      NullPointer nullPointer0 = (NullPointer)selfContext0.getSingleNodePointer();
      assertTrue(nullPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("@", "@");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "@", locale0);
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer1);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("%I;!3~fA7GY", "%I;!3~fA7GY");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "%I;!3~fA7GY", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext", "");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.axes.SelfContext", locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      SelfContext selfContext0 = new SelfContext(evalContext0, nodeNameTest0);
      evalContext0.getNodeSet();
      selfContext0.getCurrentNodePointer();
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SelfContext selfContext0 = new SelfContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        selfContext0.setPosition(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1319));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "ih(]F_F#n=~@6z");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getSingleNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("attribute::");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: attribute::
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3821));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "(@|d>$eRK");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("%I;!3~fA7GY", "%I;!3~fA7GY");
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "%I;!3~fA7GY", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext", "");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      SelfContext selfContext0 = new SelfContext(evalContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, (NodeTest) null);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, (NodeTest) null);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "ih(]F_F#n=~@6z");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(721);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "ih(]F_F#n=~@6z");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      Locale locale0 = Locale.FRANCE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "ih(]F_F#n=~@6z");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      selfContext0.reset();
      assertEquals(0, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(6);
      AttributeContext attributeContext0 = new AttributeContext(unionContext0, nodeTypeTest0);
      SelfContext selfContext0 = new SelfContext(attributeContext0, nodeTypeTest0);
      boolean boolean0 = selfContext0.nextNode();
      assertEquals(1, selfContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-4321));
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getSingleNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }
}
