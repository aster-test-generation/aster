
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
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
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExpressionPath_ESTest extends ExpressionPath_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      Expression[] expressionArray0 = new Expression[8];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, (Step[]) null);
      Expression[] expressionArray1 = expressionPath0.getPredicates();
      assertSame(expressionArray1, expressionArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = expressionPath0.getPredicates();
      assertSame(expressionArray1, expressionArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, (Step[]) null);
      Expression expression0 = expressionPath0.getExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[2], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      VariablePointer variablePointer0 = (VariablePointer)expressionPath0.expressionPath(rootContext0, true);
      assertNull(variablePointer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) qName0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.expressionPath(initialContext0, false);
      assertEquals(0, predicateContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Long long0 = new Long(1401L);
      Constant constant0 = new Constant(long0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, constant0);
      Step[] stepArray0 = new Step[9];
      QName qName0 = new QName("|'-sG+@g\"M1;L");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "ub");
      Step step0 = new Step((-2036), nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      stepArray0[7] = stepArray0[3];
      stepArray0[8] = stepArray0[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      Object object0 = expressionPath0.compute(rootContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Byte byte0 = Byte.valueOf((byte)61);
      Constant constant0 = new Constant(byte0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMultiply0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, expressionArray0[0], (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      expressionArray0[3] = (Expression) constant0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, expressionArray0[3]);
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("*l9x3c$E<%%Rp-N8Dj");
      Step step0 = new Step((byte)61, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.compute(evalContext0);
      assertFalse(predicateContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(117, expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreFunction0, coreFunction0);
      QName qName0 = new QName("c");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[3] = (Expression) extensionFunction0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreFunction0, coreOperationEqual0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationEqual0, coreOperationGreaterThanOrEqual0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreFunction0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, coreOperationMod0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      // Undeclared exception!
      expressionPath0.toString();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("~ES}d<Sf*H l'^%<");
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-550));
      Step step0 = new Step(593, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Expression[] expressionArray1 = new Expression[7];
      expressionArray1[5] = (Expression) coreOperationLessThanOrEqual0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[2] = (Expression) locationPath0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(extensionFunction0, expressionArray1[5]);
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray1, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction((-1412), expressionArray0);
      Expression expression0 = coreFunction0.getArg2();
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationOr0, expression0);
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationUnion0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-2273), expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleExpressionPath();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("org.apache.commons.jxpath.AbstractFactory");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, variableReference0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, (Step[]) null);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleExpressionPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.ExpressionPath");
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.expressionPath((EvalContext) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("0FV~b", "0FV~b");
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant("3B\">");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNotEqual0, coreOperationNotEqual0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationGreaterThanOrEqual0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNegate0, coreOperationGreaterThanOrEqual0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      Step[] stepArray0 = new Step[7];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      // Undeclared exception!
      expressionPath0.computeValue(selfContext0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("+nr");
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationOr0, coreOperationOr0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMod0, coreOperationOr0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationDivide0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("]p8]|/ySbZ");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], expressionArray0[0]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMod0, expressionArray0[2]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationUnion0, coreOperationUnion0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAnd0, expressionArray0[0]);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationDivide0, coreOperationMod0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("root", "root");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "root");
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(expressionPath0);
      // Undeclared exception!
      try { 
        expressionPath0.compute(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: root:root
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationUnion0;
      CoreFunction coreFunction0 = new CoreFunction(28, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction28()(org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000001 and (org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000002) and org.apache.commons.jxpath.ri.compiler.CoreOperationUnion@0000000003, org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000001 or org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000002 or org.apache.commons.jxpath.ri.compiler.CoreOperationUnion@0000000003, (org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000001) | (org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000002) | org.apache.commons.jxpath.ri.compiler.CoreOperationUnion@0000000003)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Long long0 = new Long(1401L);
      Constant constant0 = new Constant(long0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, constant0);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, (Expression[]) null, stepArray0);
      Expression[] expressionArray0 = expressionPath0.getPredicates();
      assertNull(expressionArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, object0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, jXPathContextReferenceImpl0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.computeValue(initialContext0);
      assertNull(predicateContext0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.compiler.ExpressionPath");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, (Expression[]) null, stepArray0);
      String string0 = expressionPath0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[9];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      String string0 = expressionPath0.toString();
      assertEquals("()[null][null][null][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      Expression[] expressionArray0 = new Expression[8];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, (Step[]) null);
      String string0 = expressionPath0.toString();
      assertEquals("1[null][null][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.compiler.ExpressionPath");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      Step[] stepArray0 = new Step[1];
      Step step0 = new Step((-505), (NodeTest) null, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, (Expression[]) null, stepArray0);
      expressionPath0.isSimpleExpressionPath();
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("{ixEeIrLO(Ck-I\"", "{ixEeIrLO(Ck-I\"");
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, (Expression[]) null);
      expressionArray0[0] = (Expression) extensionFunction0;
      VariableReference variableReference0 = new VariableReference(qName0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("root", "root");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.compiler.ExpressionPath");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, stepArray0);
      Expression expression0 = expressionPath0.getExpression();
      assertSame(expression0, coreOperationAnd0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Long long0 = new Long(1401L);
      Constant constant0 = new Constant(long0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, constant0);
      Step[] stepArray0 = new Step[9];
      QName qName0 = new QName("|'-sG+@g\"M1;L", "|'-sG+@g\"M1;L");
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        expressionPath0.compute(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[2], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertTrue(boolean0);
  }
}
