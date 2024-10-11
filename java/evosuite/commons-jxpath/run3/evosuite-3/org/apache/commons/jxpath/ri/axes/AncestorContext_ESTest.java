
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AncestorContext_ESTest extends AncestorContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant constant0 = new Constant("");
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, constant0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(predicateContext0, nodeNameTest0);
      ChildContext childContext0 = new ChildContext(selfContext0, nodeNameTest0, false, false);
      AncestorContext ancestorContext0 = new AncestorContext(childContext0, false, nodeNameTest0);
      boolean boolean0 = ancestorContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, true, (NodeTest) null);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("|8,Zj\"/67cc*vR{UV", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      basicNodeSet0.add((Pointer) nodePointer0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(selfContext0, false, (NodeTest) null);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("|8,Zj\"/67cc*vR{UV", "|8,Zj\"/67cc*vR{UV");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(56);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      basicNodeSet0.add((Pointer) nodePointer0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(selfContext0, false, (NodeTest) null);
      ancestorContext0.nextNode();
      ancestorContext0.getCurrentNodePointer();
      assertEquals(1, ancestorContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "h5$;S 8u;+U");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeNameTest0);
      unionContext0.toString();
      // Undeclared exception!
      try { 
        ancestorContext0.setPosition(1779);
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
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "?yfcPaJ\"->^I(3$+~p}");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeNameTest0);
      unionContext0.setPosition((-234));
      // Undeclared exception!
      try { 
        ancestorContext0.setPosition(2068);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, nodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1024);
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, false, nodeTypeTest0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      ancestorContext0.forEachRemaining(consumer0);
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName("[");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1147);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '['
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "?yfcPaJ\"->^I(3$+~p}");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeNameTest0);
      unionContext0.setPosition((-234));
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("|8,Zj\"/67cc*vR{UV", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      basicNodeSet0.add((Pointer) variablePointer0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(selfContext0, false, (NodeTest) null);
      ancestorContext0.nextNode();
      // Undeclared exception!
      try { 
        ancestorContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "?yfcPaJ\"->^I(3$+~p}");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeNameTest0);
      ancestorContext0.reset();
      assertEquals((-1), ancestorContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("|8,Zj\"/67cc*vR{UV", "|8,Zj\"/67cc*vR{UV");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      basicNodeSet0.add((Pointer) nodePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, true, processingInstructionTest0);
      boolean boolean0 = ancestorContext0.nextNode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(2522);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("2c");
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, integer0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      boolean boolean0 = ancestorContext0.setPosition(2522);
      assertEquals(1, ancestorContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "?yfcPaJ\"->^I(3$+~p}");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        ancestorContext0.setPosition(2068);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "?yfcPaJ\"->^I(3$+~p}");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeNameTest0);
      int int0 = ancestorContext0.getDocumentOrder();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "?yfcPaJ\"->^I(3$+~p}");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, nodeNameTest0);
      boolean boolean0 = ancestorContext0.setPosition((-3455));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(selfContext0, false, (NodeTest) null);
      NodePointer nodePointer0 = ancestorContext0.getCurrentNodePointer();
      assertNull(nodePointer0);
  }
}
