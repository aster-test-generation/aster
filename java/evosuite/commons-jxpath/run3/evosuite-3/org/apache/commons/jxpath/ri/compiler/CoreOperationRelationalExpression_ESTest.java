
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


package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperation;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationRelationalExpression_ESTest extends CoreOperationRelationalExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = CoreOperation.COMPARE_PRECEDENCE;
      Constant constant0 = new Constant(2);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThan0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, constant0);
      Expression[] expressionArray0 = new Expression[0];
      coreOperationGreaterThan0.args = expressionArray0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      EvalContext evalContext0 = null;
      // Undeclared exception!
      try { 
        coreOperationLessThanOrEqual0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationDivide0, constant0);
      coreOperationGreaterThan0.evaluateCompare((-404));
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) coreOperationGreaterThan0;
      expressionArray0[2] = (Expression) coreOperationGreaterThan0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) coreOperationGreaterThan0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, coreOperationUnion0);
      coreOperationLessThanOrEqual0.getSymbol();
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, coreOperationDivide0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, constant0);
      coreOperationGreaterThanOrEqual0.evaluateCompare((-404));
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, expressionArray0[0]);
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.computeValue(predicateContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = CoreOperation.MULTIPLY_PRECEDENCE;
      Constant constant0 = new Constant(5);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThan0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      coreOperationLessThanOrEqual0.computeValue((EvalContext) null);
      coreOperationGreaterThanOrEqual0.evaluateCompare(34);
      coreOperationLessThanOrEqual0.getSymbol();
      coreOperationGreaterThanOrEqual0.getSymbol();
      coreOperationGreaterThanOrEqual0.getPrecedence();
      coreOperationGreaterThanOrEqual0.evaluateCompare(0);
      coreOperationGreaterThan0.getSymbol();
      coreOperationGreaterThan0.evaluateCompare(5);
      coreOperationGreaterThanOrEqual0.iterate((EvalContext) null);
      boolean boolean0 = coreOperationGreaterThanOrEqual0.evaluateCompare((-1));
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      coreOperationNegate0.toString();
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNegate0, constant0);
      coreOperationLessThan0.evaluateCompare(3);
      coreOperationGreaterThan0.getSymbol();
      boolean boolean1 = coreOperationLessThan0.evaluateCompare(0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(extensionFunction0, extensionFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      Step step0 = new Step((-1), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(551, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      Step step2 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[2] = step2;
      Step step3 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[3] = step3;
      Step step4 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[4] = step4;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, expressionArray0[0]);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMultiply0, locationPath0);
      coreOperationGreaterThanOrEqual0.evaluateCompare(0);
      coreOperationGreaterThanOrEqual0.evaluateCompare(0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(locationPath0, expressionArray0[0]);
      coreOperationLessThanOrEqual0.getSymbol();
      coreOperationLessThanOrEqual0.evaluateCompare(551);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationMultiply0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      AncestorContext ancestorContext0 = new AncestorContext(rootContext0, true, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) rootContext0;
      evalContextArray0[1] = (EvalContext) rootContext0;
      evalContextArray0[2] = (EvalContext) ancestorContext0;
      evalContextArray0[3] = (EvalContext) ancestorContext0;
      evalContextArray0[4] = (EvalContext) ancestorContext0;
      evalContextArray0[5] = (EvalContext) ancestorContext0;
      evalContextArray0[6] = (EvalContext) ancestorContext0;
      evalContextArray0[7] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThan0.computeValue(unionContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant constant0 = new Constant("");
      EvalContext evalContext0 = null;
      constant0.iterate((EvalContext) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      coreOperationLessThan0.isSymmetric();
      coreOperationLessThan0.isContextDependent();
      coreOperationLessThan0.computeValue((EvalContext) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, coreOperationLessThan0);
      int int0 = 0;
      coreOperationLessThanOrEqual0.evaluateCompare(0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, coreOperationLessThanOrEqual0);
      Expression[] expressionArray0 = null;
      coreOperationLessThanOrEqual0.args = null;
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.compute((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      constant0.toString();
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, constant0);
      Expression[] expressionArray0 = new Expression[9];
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[2] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[5] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[6] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[7] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[8] = (Expression) coreOperationLessThanOrEqual0;
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("IQ'c|9K\"7");
      Expression[] expressionArray1 = new Expression[6];
      expressionArray1[0] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray1[1] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray1[2] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray1[3] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray1[4] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray1[5] = (Expression) coreOperationLessThanOrEqual0;
      Step step0 = new Step(3, processingInstructionTest0, expressionArray1);
      stepArray0[0] = step0;
      Step step1 = new Step(3, processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      Step step2 = new Step(3, processingInstructionTest0, expressionArray1);
      stepArray0[2] = step2;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      coreOperationGreaterThanOrEqual0.compute(evalContext0);
      boolean boolean0 = coreOperationGreaterThanOrEqual0.evaluateCompare(1857);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 1;
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("#v!a9A\"=Hq<3;");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      expressionArray0[1] = (Expression) coreOperationUnion0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[1], coreOperationAdd0);
      expressionArray0[2] = (Expression) coreOperationEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      expressionArray0[3] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expression0, expressionArray0[1]);
      coreOperationGreaterThan0.getSymbol();
      coreOperationGreaterThan0.getPrecedence();
      coreOperationGreaterThan0.isSymmetric();
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(1, processingInstructionTest0, expressionArray0);
      processingInstructionTest0.toString();
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[1], expressionArray0, stepArray0);
      EvalContext evalContext0 = null;
      expressionPath0.createContextForStep((EvalContext) null, 423, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      QName qName0 = new QName("upWD?BT:LQaf6Qht", "");
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationLessThan0, locale0);
      Locale locale1 = Locale.ENGLISH;
      locale0.getDisplayScript(locale1);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, jXPathContext0, nodePointer0);
      locale0.getDisplayLanguage(locale1);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        coreOperationLessThan0.computeValue(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNotEqual0, constant0);
      coreOperationLessThanOrEqual0.toString();
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      coreOperationGreaterThanOrEqual0.toString();
      EvalContext evalContext0 = null;
      Iterator iterator0 = coreOperationLessThanOrEqual0.iterate((EvalContext) null);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch(iterator0, (Iterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNotEqual0, constant0);
      EvalContext evalContext0 = null;
      Iterator iterator0 = coreOperationLessThanOrEqual0.iterate((EvalContext) null);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch(iterator0, (Iterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("(");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, variableReference0);
      CoreOperationGreaterThan coreOperationGreaterThan1 = new CoreOperationGreaterThan(coreOperationGreaterThan0, variableReference0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationGreaterThan1, coreOperationGreaterThan1);
      coreOperationGreaterThanOrEqual0.isContextDependent();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeTypeTest0);
      attributeContext0.getCurrentNodePointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, selfContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Iterator iterator0 = coreOperationGreaterThanOrEqual0.iteratePointers(evalContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = CoreOperation.COMPARE_PRECEDENCE;
      Constant constant0 = new Constant(2);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThan0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, constant0);
      coreOperationLessThanOrEqual0.computeValue((EvalContext) null);
      coreOperationGreaterThan0.getSymbol();
      coreOperationGreaterThan0.getSymbol();
      coreOperationGreaterThan0.evaluateCompare(2);
      coreOperationGreaterThan0.evaluateCompare(0);
      InitialContext initialContext0 = null;
      try {
        initialContext0 = new InitialContext((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      constant0.toString();
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, constant0);
      Expression[] expressionArray0 = new Expression[9];
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[2] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[6] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[7] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[8] = (Expression) coreOperationLessThanOrEqual0;
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("IQ'c|9K\"7");
      Step step0 = new Step(3, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(3, processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      processingInstructionTest0.toString();
      step0.toString();
      Step step2 = new Step(3, processingInstructionTest0, expressionArray0);
      stepArray0[2] = step2;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      coreOperationGreaterThanOrEqual0.compute(evalContext0);
      boolean boolean0 = coreOperationGreaterThanOrEqual0.evaluateCompare(1857);
      assertTrue(boolean0);
  }
}
