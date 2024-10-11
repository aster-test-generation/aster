
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.SimplePathInterpreter;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimplePathInterpreter_ESTest extends SimplePathInterpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) simplePathInterpreter0);
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(")h");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, constant0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(rootContext0, nullPropertyPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("@ccfUw^Vk]]^]Z");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("@ccfUw^Vk]]^]Z", "M1gJO", "Cannot create the root object: ");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[3];
      Expression[] expressionArray1 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-2029)).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) null);
      QName qName0 = new QName("@ccfUw^Vk]]^]Z");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = new Locale("@ccfUw^Vk]]^]Z", "M1gJO", "Cannot create the root object: ");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, jXPathContext1, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      RootContext rootContext1 = rootContext0.getRootContext();
      EvalContext evalContext0 = rootContext1.getConstantContext(object0);
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[0];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "{${VT+g");
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(396, 5242, (-894), 396, 5).when(step0).getAxis();
      doReturn(nodeNameTest0, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(evalContext0, beanPointer0, stepArray0);
      SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, nodePointer0, stepArray0);
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(evalContext0, nodePointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) null);
      QName qName0 = new QName("@ccfUw^Vk]]^]Z");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = new Locale("@ccfUw^Vk]]^]Z", "M1gJO", "Cannot create the root object: ");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, jXPathContext1, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      RootContext rootContext1 = rootContext0.getRootContext();
      Object object1 = new Object();
      EvalContext evalContext0 = rootContext1.getConstantContext(object1);
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(105, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationSubtract0, coreOperationSubtract0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-1237), 3677).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(evalContext0, beanPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, (NodeTest) null, true);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath(precedingOrFollowingContext0, (NodePointer) null, expressionArray0, stepArray0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, true);
      AncestorContext ancestorContext0 = new AncestorContext(childContext0, false, nodeNameTest0);
      Object object0 = new Object();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, object0, jXPathBasicBeanInfo0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[6];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath(ancestorContext0, beanPointer0, expressionArray0, stepArray0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, (NodeTest) null, true);
      Step[] stepArray0 = new Step[0];
      NodePointer nodePointer0 = SimplePathInterpreter.createNullPointer(precedingOrFollowingContext0, (NodePointer) null, stepArray0, 0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) simplePathInterpreter0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      Locale locale0 = Locale.forLanguageTag("wv7g");
      NullPointer nullPointer0 = new NullPointer(locale0, "wv7g");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      jXPathContextReferenceImpl0.registerNamespace("", "wv7g");
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(initialContext0, nullPointer0, stepArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Not supported node test for attributes: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath((EvalContext) null, variablePointer0, stepArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Not supported node test for attributes: '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeTypeTest0);
      QName qName0 = new QName("No such function: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(9, 9, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      Step[] stepArray0 = new Step[8];
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(ancestorContext0, variablePointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply", "lang");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("]Bqp");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[0], constant0);
      expressionArray0[1] = (Expression) coreOperationEqual0;
      Constant constant1 = new Constant((String) null);
      expressionArray0[2] = (Expression) constant1;
      Step[] stepArray0 = new Step[7];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(initialContext0, variablePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Predicate value is null: 'null'
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Not supported node test for attributes: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, constant0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      expressionArray0[1] = expressionArray0[0];
      expressionArray0[2] = (Expression) coreFunction0;
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, variablePointer0, expressionArray0, stepArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("No supported node test for attributes: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("No supported node test for attributes: ");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, constant0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, variablePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'No supported node test for attributes: '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeTypeTest0);
      QName qName0 = new QName("No such function: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[8];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(ancestorContext0, variablePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, (Locale) null);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      Step[] stepArray0 = new Step[0];
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant(Integer.MIN_VALUE);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationSubtract0;
      expressionArray0[2] = (Expression) constant0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, expressionArray0[2]);
      expressionArray0[3] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[1], expressionArray0[1]);
      expressionArray0[4] = (Expression) coreOperationMod0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, beanPropertyPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[8];
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(evalContextArray0[1], variablePointer0, stepArray0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      QName qName0 = new QName("No such function: ", "No such function: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[8];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(9, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer((EvalContext) null, variablePointer0, stepArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(2367).when(step0).getAxis();
      doReturn((Expression[]) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer((EvalContext) null, (NodePointer) null, stepArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1590);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(parentContext0, nodeTypeTest0, true);
      AttributeContext attributeContext0 = new AttributeContext(precedingOrFollowingContext0, nodeTypeTest0);
      QName qName0 = new QName((String) null, "-b(!Vo_2P3 rzR$?4HO");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Step[] stepArray0 = new Step[2];
      NodePointer nodePointer0 = SimplePathInterpreter.createNullPointer(attributeContext0, variablePointer0, stepArray0, 2);
      assertNull(nodePointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("'. Syntax error ");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      Expression[] expressionArray0 = new Expression[1];
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      Step[] stepArray0 = new Step[7];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(initialContext0, nullPropertyPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) null);
      QName qName0 = new QName("@ccfUw^Vk]]^]Z");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      Locale locale0 = new Locale("@ccfUw^Vk]]^]Z", "M1gJO", "Cannot create the root object: ");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, jXPathContext1, beanPointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      EvalContext evalContext0 = rootContext0.getConstantContext(object0);
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[0];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "{${VT+g");
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(396, 5242, Integer.MIN_VALUE, 396, 5).when(step0).getAxis();
      doReturn((NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      SimplePathInterpreter.interpretSimpleLocationPath(evalContext0, beanPointer0, stepArray0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer0, stepArray0);
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(selfContext0, beanPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(1705, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      Step[] stepArray0 = new Step[2];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(descendantContext0, (NodePointer) null, expressionArray0, stepArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("@ccfUw^Vk]]^]Z");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("@ccfUw^Vk]]^]Z", "M1gJO", "Cannot create the root object: ");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[4];
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: @ccfUw^Vk]]^]Z
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, object0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPropertyPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction((-501), expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[7];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(selfContext0, (NodePointer) null, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("@ccfUw^Vk]]^]Z");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      Locale locale0 = new Locale("@ccfUw^Vk]]^]Z", "M1gJO", "Cannot create the root object: ");
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[0];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(396, 5242, 1610612736, 2, 0).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      BeanPointer beanPointer1 = (BeanPointer)SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, beanPointer1, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) simplePathInterpreter0);
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "8SvB>l%94@$m~}Z@");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(rootContext0);
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[2];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1, Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[4];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, (Locale) null);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      Step[] stepArray0 = new Step[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(unionContext0, beanPropertyPointer0, stepArray0);
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      Step[] stepArray0 = new Step[2];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(descendantContext0, (NodePointer) null, stepArray0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) simplePathInterpreter0);
      Object object0 = new Object();
      QName qName0 = new QName(".+r,Y~Tm~s_+Dj/", ".+r,Y~Tm~s_+Dj/");
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, simplePathInterpreter0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      Step[] stepArray0 = new Step[1];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(step0).getAxis();
      doReturn((Expression[]) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      BeanPointer beanPointer1 = (BeanPointer)SimplePathInterpreter.interpretSimpleLocationPath(initialContext0, beanPointer0, stepArray0);
      assertTrue(beanPointer1.isNode());
  }
}
