
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
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperation;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
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
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationAdd_ESTest extends CoreOperationAdd_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray1);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAnd0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationGreaterThan0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], expressionArray0[1]);
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      coreOperationAdd0.getPrecedence();
      EvalContext evalContext0 = null;
      coreOperationNotEqual0.iterate((EvalContext) null);
      coreOperationGreaterThan0.args = expressionArray1;
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue((EvalContext) null);
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
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("Ccc^=oVphN!#p9+wH");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[2] = (Expression) extensionFunction0;
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1));
      Step step0 = new Step((-4019), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step((-4019), nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      expressionArray0[3] = (Expression) expressionPath0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      coreOperationAdd0.getSymbol();
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) expressionArray0[3]);
      Integer integer0 = new Integer((-1));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, integer0, (Pointer) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Ccc^=oVphN!#p9+wH
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      int int0 = CoreOperation.COMPARE_PRECEDENCE;
      Constant constant0 = new Constant(2);
      expressionArray0[0] = (Expression) constant0;
      Constant constant1 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd");
      expressionArray0[1] = (Expression) constant1;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationAnd0;
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      Step step2 = new Step(1861, nodeTypeTest0, expressionArray0);
      stepArray0[2] = step2;
      Step step3 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step3;
      Step step4 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[4] = step4;
      Step step5 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[5] = step5;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[3] = (Expression) locationPath0;
      LocationPath locationPath1 = new LocationPath(true, stepArray0);
      expressionArray0[4] = (Expression) locationPath1;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(locationPath1, constant0);
      expressionArray0[5] = (Expression) coreOperationEqual0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      coreOperationAdd0.getSymbol();
      coreOperationAdd0.getSymbol();
      coreOperationAdd0.isSymmetric();
      coreOperationAdd0.isSymmetric();
      Integer integer0 = new Integer(1861);
      QName qName0 = new QName("", "+");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, step5, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, integer0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      coreOperationAdd0.computeValue(rootContext0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("9jSq1\"1ZJY");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      coreOperationMod0.isContextDependent();
      coreOperationMod0.isContextDependent();
      coreOperationMod0.toString();
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      constant0.toString();
      coreOperationAdd0.getSymbol();
      coreOperationAdd0.getSymbol();
      coreOperationAdd0.isSymmetric();
      constant0.toString();
      EvalContext evalContext0 = null;
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Integer integer0 = new Integer(97);
      Constant constant0 = new Constant(integer0);
      expressionArray0[0] = (Expression) constant0;
      Step[] stepArray0 = new Step[9];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step((-624), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(97, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      Expression[] expressionArray1 = new Expression[4];
      expressionArray1[0] = (Expression) constant0;
      expressionArray1[1] = (Expression) constant0;
      expressionArray1[2] = (Expression) constant0;
      expressionArray1[3] = (Expression) constant0;
      Step step2 = new Step(0, nodeNameTest0, expressionArray1);
      stepArray0[2] = step2;
      Step step3 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[3] = step3;
      Step step4 = new Step(0, nodeNameTest0, expressionArray1);
      stepArray0[4] = step4;
      NodeNameTest nodeNameTest1 = new NodeNameTest(qName0, "");
      Step step5 = new Step(2293, nodeNameTest1, expressionArray1);
      stepArray0[5] = step5;
      Step step6 = new Step((-624), nodeNameTest0, expressionArray0);
      stepArray0[6] = step6;
      Expression[] expressionArray2 = new Expression[5];
      expressionArray2[0] = (Expression) constant0;
      expressionArray2[1] = (Expression) constant0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], expressionArray2[1]);
      expressionArray2[2] = (Expression) coreOperationMod0;
      expressionArray2[3] = (Expression) constant0;
      expressionArray2[4] = (Expression) constant0;
      Step step7 = new Step(97, nodeNameTest0, expressionArray2);
      stepArray0[7] = step7;
      Expression[] expressionArray3 = new Expression[2];
      expressionArray3[0] = (Expression) constant0;
      expressionArray3[1] = (Expression) constant0;
      Step step8 = new Step(2293, nodeNameTest1, expressionArray3);
      stepArray0[8] = step8;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      expressionArray0[1] = (Expression) expressionPath0;
      Constant constant1 = new Constant(integer0);
      expressionArray0[2] = (Expression) constant1;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant1, expressionArray1[2]);
      expressionArray0[3] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray3[0]);
      CoreOperationMod coreOperationMod1 = new CoreOperationMod(coreOperationNegate0, expressionArray2[0]);
      expressionArray0[4] = (Expression) coreOperationMod1;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      expressionArray0[5] = expression0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray1);
      expressionArray0[6] = (Expression) coreOperationUnion0;
      Step[] stepArray1 = new Step[4];
      stepArray1[0] = step5;
      stepArray1[1] = step7;
      stepArray1[2] = step4;
      stepArray1[3] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray1);
      expressionArray0[7] = (Expression) locationPath0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray2[3], expressionArray0[3]);
      expressionArray0[8] = (Expression) coreOperationGreaterThan0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Object object1 = coreOperationAdd0.computeValue((EvalContext) null);
      JXPathContext.newContext(jXPathContext0, object1);
      Integer integer0 = new Integer((-1257));
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
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Byte byte0 = new Byte((byte) (-16));
      Constant constant0 = new Constant(byte0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, coreOperationLessThan0);
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(95, nodeTypeTest0, expressionArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(namespaceContext0, nodeTypeTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(parentContext0, nodeTypeTest0, false);
      DescendantContext descendantContext0 = new DescendantContext(precedingOrFollowingContext0, false, nodeTypeTest0);
      coreOperationLessThan0.computeValue(descendantContext0);
      stepArray0[1] = step1;
      Step step2 = new Step((-2098), nodeTypeTest0, expressionArray0);
      stepArray0[2] = step2;
      Step step3 = new Step(7, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step3;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      Constant constant1 = new Constant((String) null);
      expressionArray0[1] = (Expression) constant1;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      coreOperationAdd0.isSymmetric();
      boolean boolean0 = coreOperationAdd0.isSymmetric();
      assertTrue(boolean0);
      
      int int0 = coreOperationAdd0.getPrecedence();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1339, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      coreFunction0.getArg2();
      expressionArray0[1] = null;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step((-2756), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(1339, processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      Step step2 = new Step((-2756), processingInstructionTest0, expressionArray0);
      stepArray0[2] = step2;
      Step step3 = new Step(1339, processingInstructionTest0, expressionArray0);
      stepArray0[3] = step3;
      Step step4 = new Step(1339, processingInstructionTest0, expressionArray0);
      stepArray0[4] = step4;
      Step step5 = new Step((-2705), processingInstructionTest0, expressionArray0);
      stepArray0[5] = step5;
      Step step6 = new Step((-2756), processingInstructionTest0, expressionArray0);
      stepArray0[6] = step6;
      Step step7 = new Step((-2756), processingInstructionTest0, expressionArray0);
      stepArray0[7] = step7;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(40);
      Step step8 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[8] = step8;
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(precedingOrFollowingContext0, coreOperationAnd0);
      ChildContext childContext0 = new ChildContext(predicateContext0, nodeTypeTest0, true, true);
      EvalContext evalContext0 = expressionPath0.evalSteps(childContext0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("null()");
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step((-1048), processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      Step step2 = new Step((-1), processingInstructionTest0, expressionArray0);
      stepArray0[2] = step2;
      Step step3 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[3] = step3;
      Step step4 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[4] = step4;
      Step step5 = new Step((-1), processingInstructionTest0, expressionArray0);
      stepArray0[5] = step5;
      Step step6 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[6] = step6;
      Step step7 = new Step((-1048), processingInstructionTest0, expressionArray0);
      stepArray0[7] = step7;
      Step step8 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[8] = step8;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionPath0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNegate0, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], (Expression) null);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationNegate coreOperationNegate1 = new CoreOperationNegate(expressionPath0);
      expressionArray0[2] = (Expression) coreOperationNegate1;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThan0, coreOperationNegate0);
      expressionArray0[3] = (Expression) coreOperationLessThanOrEqual0;
      Expression[] expressionArray1 = new Expression[3];
      expressionArray1[0] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray1[1] = (Expression) coreOperationGreaterThan0;
      expressionArray1[2] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray1);
      Expression expression0 = coreFunction0.getArg1();
      expressionArray0[4] = expression0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], expressionPath0);
      expressionArray0[5] = (Expression) coreOperationNotEqual0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      String string0 = coreOperationAdd0.getSymbol();
      assertEquals("+", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Expression[] expressionArray1 = new Expression[9];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(nameAttributeTest0, nameAttributeTest0);
      expressionArray1[0] = (Expression) coreOperationDivide0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray1);
      Expression expression0 = coreFunction0.getArg2();
      expressionArray1[1] = null;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, expression0);
      expressionArray1[2] = (Expression) coreOperationNotEqual0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, coreFunction0);
      expressionArray1[3] = (Expression) coreOperationGreaterThanOrEqual0;
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-376));
      Step step0 = new Step((-376), nodeTypeTest0, expressionArray1);
      stepArray0[0] = step0;
      Step step1 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      Step step2 = new Step((-376), nodeTypeTest0, expressionArray1);
      stepArray0[2] = step2;
      Step step3 = new Step((-376), nodeTypeTest0, expressionArray1);
      stepArray0[3] = step3;
      Step step4 = new Step((-376), nodeTypeTest0, expressionArray1);
      stepArray0[4] = step4;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      expressionArray1[4] = (Expression) expressionPath0;
      Expression expression1 = coreFunction0.getArg3();
      expressionArray1[5] = expression1;
      Byte byte0 = new Byte((byte)0);
      Constant constant0 = new Constant(byte0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod((Expression) null, constant0);
      expressionArray1[6] = (Expression) coreOperationMod0;
      CoreOperationMod coreOperationMod1 = new CoreOperationMod(expressionArray1[6], expressionArray1[4]);
      expressionArray1[7] = (Expression) coreOperationMod1;
      Expression expression2 = coreFunction0.getArg3();
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, expression2);
      expressionArray1[8] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray1);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      int int0 = coreOperationAdd0.getPrecedence();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray1);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAnd0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationGreaterThan0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], expressionArray0[1]);
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      boolean boolean0 = coreOperationAdd0.isSymmetric();
      assertTrue(boolean0);
      
      Object object0 = coreOperationAdd0.computeValue((EvalContext) null);
      assertEquals(1.0, object0);
      
      coreOperationAdd0.toString();
      assertEquals("+", coreOperationAdd0.getSymbol());
  }
}
