
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
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DescendantContext_ESTest extends DescendantContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Float float0 = new Float((-2136.694728));
      Constant constant0 = new Constant(float0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, constant0);
      NodeSetContext nodeSetContext0 = new NodeSetContext(predicateContext0, (NodeSet) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeTypeTest0);
      descendantContext0.reset();
      assertEquals(0, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("-pF[y3Unj ZW");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, processingInstructionTest0);
      // Undeclared exception!
      try { 
        descendantContext0.setPosition(20);
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("[;3&[?#6'E)Dih");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, processingInstructionTest0);
      // Undeclared exception!
      try { 
        descendantContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: [;3&[?#6'E)Dih
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("", "7?oH.EY!}Z");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
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
  public void test04()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, basicNodeSet0);
      nodeSetContext0.getContextNodePointer();
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, processingInstructionTest0);
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
  public void test05()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        descendantContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.DescendantContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      unionContext0.getContextNodePointer();
      DescendantContext descendantContext0 = new DescendantContext(unionContext0, false, (NodeTest) null);
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
  public void test07()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeNameTest0);
      // Undeclared exception!
      descendantContext0.nextNode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, (NodeTest) null);
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      boolean boolean0 = descendantContext0.nextNode();
      assertEquals(1, descendantContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, basicNodeSet0);
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, false, processingInstructionTest0);
      boolean boolean0 = descendantContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      boolean boolean0 = descendantContext0.setPosition(1395);
      assertEquals(1, descendantContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      boolean boolean0 = descendantContext0.setPosition(0);
      assertEquals(0, descendantContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0, (Pointer) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeNameTest0);
      // Undeclared exception!
      descendantContext0.getCurrentNodePointer();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, nodeNameTest0);
      NullPointer nullPointer0 = (NullPointer)descendantContext0.getCurrentNodePointer();
      assertNull(nullPointer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("string-lGngth");
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, processingInstructionTest0, true, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionChildNodeIterator0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, processingInstructionTest0);
      descendantContext0.getCurrentNodePointer();
      BasicNodeSet basicNodeSet0 = (BasicNodeSet)descendantContext0.getNodeSet();
      assertNotNull(basicNodeSet0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("string-lGngth");
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, processingInstructionTest0, true, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionChildNodeIterator0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, processingInstructionTest0);
      BeanPointer beanPointer0 = (BeanPointer)descendantContext0.getCurrentNodePointer();
      assertNull(beanPointer0);
      
      descendantContext0.nextNode();
      assertEquals(0, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      descendantContext0.getCurrentNodePointer();
      descendantContext0.getCurrentNodePointer();
      assertEquals(1, descendantContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("string-lGngth");
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator((CollectionPointer) null, processingInstructionTest0, true, (NodePointer) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) collectionChildNodeIterator0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, processingInstructionTest0);
      boolean boolean0 = descendantContext0.isChildOrderingRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, (NodeTest) null);
      boolean boolean0 = descendantContext0.setPosition((-1485));
      assertTrue(boolean0);
  }
}
