
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
import java.util.NoSuchElementException;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PredicateContext_ESTest extends PredicateContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[5];
      Integer integer0 = new Integer(0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Constant constant0 = new Constant(integer0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationSubtract0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, coreOperationDivide0);
      boolean boolean0 = predicateContext0.nextSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, ".");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nullPointer0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("C+ *k6C6/wHcnL");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, false, nodeNameTest0);
      Expression[] expressionArray0 = new Expression[3];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(extensionFunction0, extensionFunction0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThan0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, coreOperationNegate0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(1497);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: C+ *k6C6/wHcnL
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(2921);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("-&fXIMbqW8'");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, extensionFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationSubtract0, expressionArray0[0]);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationLessThanOrEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(3284);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "new");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPropertyPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationUnion0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(13);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationOr0, expressionArray0[2]);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, coreOperationLessThanOrEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(23);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationUnion0);
      // Undeclared exception!
      try { 
        predicateContext0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName(".GfNBFCc&Dq%n+(B");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Constant constant0 = new Constant(".GfNBFCc&Dq%n+(B");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, nameAttributeTest0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(" - no such property");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, true, true);
      QName qName0 = new QName(" - no such property");
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(extensionFunction0, expressionArray0[1]);
      PredicateContext predicateContext0 = new PredicateContext(childContext0, coreOperationLessThanOrEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext(initialContext0, true, nodeNameTest0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(locationPath0, locationPath0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, coreOperationDivide0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      ParentContext parentContext0 = new ParentContext(rootContext0, nodeTypeTest0);
      EvalContext[] evalContextArray0 = new EvalContext[6];
      evalContextArray0[0] = (EvalContext) parentContext0;
      UnionContext unionContext0 = new UnionContext(parentContext0, evalContextArray0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, (Expression) null);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
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
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationAnd0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(locationPath0, locationPath0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, coreOperationGreaterThanOrEqual0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationMultiply0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      nodeSetContext0.hasNext();
      QName qName0 = new QName("", "q^Czhr|");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(selfContext0, (Expression) null);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("5;<^UDg5&~D");
      Integer integer0 = new Integer(3026);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.ITALY;
      BeanPointer beanPointer0 = new BeanPointer(qName0, integer0, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Expression[] expressionArray0 = new Expression[9];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(extensionFunction0, expressionArray0[6]);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, extensionFunction0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationNotEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationUnion0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-7));
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, (Expression) null);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperation");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      nodeSetContext0.toString();
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(selfContext0, (Expression) null);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
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
      EvalContext[] evalContextArray0 = new EvalContext[5];
      Integer integer0 = new Integer(0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Constant constant0 = new Constant(integer0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationSubtract0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, coreOperationDivide0);
      boolean boolean0 = predicateContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[5];
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) evalContextArray0[0]);
      Integer integer0 = new Integer(0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      evalContextArray0[3] = evalContext0;
      Constant constant0 = new Constant(integer0);
      PredicateContext predicateContext0 = new PredicateContext(evalContextArray0[3], constant0);
      // Undeclared exception!
      try { 
        predicateContext0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, locationPath0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, locationPath0);
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals(1, evalContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(2921);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("-&fXIMbqW8'");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, extensionFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationSubtract0, expressionArray0[0]);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationLessThanOrEqual0);
      predicateContext0.reset();
      assertEquals(0, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName(".GfNBFCc&Dq%n+(B");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Constant constant0 = new Constant(".GfNBFCc&Dq%n+(B");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, nameAttributeTest0);
      NullPointer nullPointer0 = (NullPointer)predicateContext0.getCurrentNodePointer();
      assertFalse(nullPointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Constant constant0 = new Constant("'>}C7go/Y)XB^EI");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, object0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      predicateContext0.getCurrentNodePointer();
      assertEquals(1, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName(".GfNBFCc&Dq%n+(B");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Constant constant0 = new Constant(".GfNBFCc&Dq%n+(B");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", ",r@Va3U29I1U$S");
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(",r@Va3U29I1U$S");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, ",r@Va3U29I1U$S");
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, false, nodeNameTest0);
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition((-604));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Constant constant0 = new Constant("'>}C7go/Y)XB^EI");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer((QName) null, object0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      BasicNodeSet basicNodeSet0 = (BasicNodeSet)predicateContext0.getNodeSet();
      assertNotNull(basicNodeSet0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.model.VariablePointer$1");
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThan0, coreOperationGreaterThan0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, coreOperationGreaterThan0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", ",r@Va3U29I1U$S");
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(",r@Va3U29I1U$S");
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, constant0);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) coreOperationNegate0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) nameAttributeTest0;
      expressionArray0[3] = (Expression) constant0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationUnion0);
      predicateContext0.getCurrentNodePointer();
      assertEquals(1, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant(890);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, constant0);
      predicateContext0.getCurrentNodePointer();
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals(1, predicateContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      QName qName0 = new QName(".GfNBFCc&Dq%n+(B");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Constant constant0 = new Constant(".GfNBFCc&Dq%n+(B");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition((-2773));
      assertFalse(boolean0);
      
      boolean boolean1 = predicateContext0.setPosition(2091);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "q^Czhr|");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(selfContext0, (Expression) null);
      boolean boolean0 = predicateContext0.nextSet();
      assertFalse(boolean0);
  }
}
