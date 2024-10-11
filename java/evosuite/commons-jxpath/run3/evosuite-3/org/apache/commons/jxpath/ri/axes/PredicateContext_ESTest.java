
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
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PredicateContext_ESTest extends PredicateContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = new Locale("", "", "F3]4A3IT@");
      NullPointer nullPointer0 = new NullPointer(locale0, "text");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, variableReference0);
      boolean boolean0 = predicateContext0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 394);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(394);
      SelfContext selfContext0 = new SelfContext(evalContext0, nodeTypeTest0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      PredicateContext predicateContext0 = new PredicateContext(selfContext0, coreOperationMultiply0);
      predicateContext0.reset();
      assertEquals(0, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("qx~!G7x^\"9,uX1@V O");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(selfContext0, evalContextArray0);
      PredicateContext predicateContext0 = new PredicateContext(unionContext0, (Expression) null);
      boolean boolean0 = predicateContext0.nextSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("x{kj!0a7;sG|");
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, constant0);
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals(1, predicateContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      predicateContext0.setPosition(1024);
      predicateContext0.getCurrentNodePointer();
      assertEquals(1, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("|i=Q");
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = Locale.GERMAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, jXPathContextReferenceImpl0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationEqual0, coreOperationEqual0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationNotEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(134217728);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      NullPointer nullPointer0 = new NullPointer((Locale) null, "#u2:!AxO_k");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      Constant constant0 = new Constant("<<unknown namespace>>");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationMod0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(419);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, (Expression) null);
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
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, (Expression) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationLessThanOrEqual0, (Expression) null);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationMod0);
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
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("/CYi4HJ HFPB", (String) null);
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationAnd0);
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
      QName qName0 = new QName("\"sum\"");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, locationPath0);
      // Undeclared exception!
      try { 
        predicateContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-1");
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, true, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, nameAttributeTest0);
      predicateContext0.nextSet();
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
  public void test12()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("jx/-8$", "jx/-8$");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, jXPathContext0, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, beanPointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[5];
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationAdd0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: jx/-8$:jx/-8$
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("not");
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      Expression[] expressionArray0 = new Expression[23];
      CoreFunction coreFunction0 = new CoreFunction((-335), expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationSubtract0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[2] = (Expression) extensionFunction0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationUnion0, expressionArray0[1]);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      predicateContext0.getCurrentNodePointer();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("not");
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Expression[] expressionArray0 = new Expression[23];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, coreOperationUnion0);
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
  public void test15()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionPath0, expressionArray0[0]);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationNotEqual0);
      // Undeclared exception!
      try { 
        predicateContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-1");
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, false, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, nameAttributeTest0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      predicateContext0.forEachRemaining(consumer0);
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
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition(1);
      assertEquals(0, predicateContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer((-134217536));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, variableReference0);
      BasicNodeSet basicNodeSet0 = (BasicNodeSet)predicateContext0.getNodeSet();
      assertNotNull(basicNodeSet0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-1");
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, false, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, nameAttributeTest0);
      predicateContext0.getSingleNodePointer();
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(1735);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("x{kj!0a7;sG|");
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, constant0);
      boolean boolean0 = predicateContext0.setPosition(1610612736);
      assertEquals(1, predicateContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer((-134217573));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("omz=CR42A");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, variableReference0);
      boolean boolean0 = predicateContext0.setPosition(Integer.MIN_VALUE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Float float0 = new Float(0.29295427F);
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.setPosition(2303);
      assertFalse(boolean0);
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Float float0 = new Float(0.29295427F);
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, nameAttributeTest0);
      NullPointer nullPointer0 = (NullPointer)predicateContext0.getCurrentNodePointer();
      assertNotNull(nullPointer0);
      
      boolean boolean0 = predicateContext0.setPosition(Integer.MIN_VALUE);
      assertEquals(0, predicateContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Constant constant0 = new Constant("6dttwh,");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      PredicateContext predicateContext0 = new PredicateContext(evalContext0, coreOperationLessThanOrEqual0);
      predicateContext0.nextNode();
      assertEquals(2, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, nameAttributeTest0);
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals(2, initialContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = new Integer((-134217573));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("omz=CR42A");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      VariableReference variableReference0 = new VariableReference(qName0);
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, variableReference0);
      predicateContext0.getCurrentNodePointer();
      predicateContext0.getCurrentNodePointer();
      assertEquals(2, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = new PredicateContext(initialContext0, constant0);
      predicateContext0.nextNode();
      boolean boolean0 = predicateContext0.nextNode();
      assertEquals((-1), initialContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-1");
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, false, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(ancestorContext0, nameAttributeTest0);
      // Undeclared exception!
      try { 
        predicateContext0.setPosition(1735);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.AncestorContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction((-771), expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, (Expression) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationSubtract0, (Expression) null);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationDivide0);
      // Undeclared exception!
      try { 
        predicateContext0.nextSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }
}
