
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
import java.util.function.Consumer;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DescendantContext_ESTest extends DescendantContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("NJbSxK");
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, true, true);
      DescendantContext descendantContext0 = new DescendantContext(childContext0, false, processingInstructionTest0);
      boolean boolean0 = descendantContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "B_XJG`Qu5");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.setPosition(3280);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1365));
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
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
  public void test03()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Consumer<CollectionChildNodeIterator> consumer0 = (Consumer<CollectionChildNodeIterator>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      unionContext0.forEachRemaining(consumer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      DescendantContext descendantContext0 = new DescendantContext(unionContext0, true, nodeNameTest0);
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
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationAnd0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3912);
      DescendantContext descendantContext0 = new DescendantContext(predicateContext0, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("NJbSxK");
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, true, true);
      DescendantContext descendantContext0 = new DescendantContext(childContext0, false, processingInstructionTest0);
      childContext0.getValue();
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
  public void test06()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.CANADA;
      CollectionPointer collectionPointer0 = new CollectionPointer(jXPathContext0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, processingInstructionTest0);
      // Undeclared exception!
      descendantContext0.nextNode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-514));
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, true, true);
      ParentContext parentContext0 = new ParentContext(childContext0, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext(parentContext0, true, nodeTypeTest0);
      descendantContext0.getContextNodeList();
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("^\"'x2eP-vRdQ^zY@A4");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("^\"'x2eP-vRdQ^zY@A4");
      DescendantContext descendantContext0 = new DescendantContext(attributeContext0, true, processingInstructionTest0);
      boolean boolean0 = descendantContext0.nextNode();
      boolean boolean1 = descendantContext0.nextNode();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3022));
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, false, nodeTypeTest0);
      descendantContext0.reset();
      assertEquals(0, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("$q)Q#gBMU0N9b");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, "$q)Q#gBMU0N9b", jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, false, nodeNameTest0);
      ancestorContext0.nextNode();
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.CANADA;
      CollectionPointer collectionPointer0 = new CollectionPointer(jXPathContext0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, collectionPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, processingInstructionTest0);
      // Undeclared exception!
      descendantContext0.getCurrentNodePointer();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-4354));
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeTypeTest0);
      NullPointer nullPointer1 = (NullPointer)descendantContext0.getCurrentNodePointer();
      assertNull(nullPointer1);
      assertEquals(0, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("^\"'x2eP-vRdQ^zY@A4");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("^\"'x2eP-vRdQ^zY@A4");
      DescendantContext descendantContext0 = new DescendantContext(attributeContext0, true, processingInstructionTest0);
      descendantContext0.nextNode();
      descendantContext0.setPosition((-2720));
      NodePointer nodePointer0 = descendantContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("^\"'x2eP-vRdQ^zY@A4");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("^\"'x2eP-vRdQ^zY@A4");
      DescendantContext descendantContext0 = new DescendantContext(attributeContext0, true, processingInstructionTest0);
      descendantContext0.nextNode();
      boolean boolean0 = descendantContext0.setPosition(691);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "B_XJG`Qu5");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      boolean boolean0 = descendantContext0.isChildOrderingRequired();
      assertTrue(boolean0);
  }
}
