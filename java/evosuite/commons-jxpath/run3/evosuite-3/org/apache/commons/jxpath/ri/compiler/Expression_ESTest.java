
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
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Expression_ESTest extends Expression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant constant0 = new Constant("!&LP");
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationOr0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) constant0;
      expressionArray0[5] = (Expression) constant0;
      expressionArray0[6] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionArray0[3], expressionArray0[4]);
      coreOperationDivide0.getPrecedence();
      expressionArray0[1].compute((EvalContext) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) expressionArray0[3]);
      QName qName0 = new QName("!&LP");
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "!&LP", locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, expressionArray0[2], nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      rootContext0.getAbsoluteRootContext();
      coreOperationDivide0.computeValue(rootContext0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[3], expressionArray0[2]);
      coreOperationGreaterThan0.evaluateCompare(5);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreFunction0, expressionArray0[4]);
      coreOperationMultiply0.getPrecedence();
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[2], coreOperationDivide0);
      Object object0 = coreOperationSubtract0.computeValue(rootContext0);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant constant0 = new Constant("FN,V");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "FN,V");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNotEqual0, coreOperationNotEqual0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      coreOperationDivide0.getSymbol();
      int int0 = 0;
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) coreOperationDivide0;
      expressionArray0[0].computeValue((EvalContext) null);
      expressionArray0[1] = (Expression) constant0;
      // Undeclared exception!
      try { 
        constant0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      expressionArray0[1] = (Expression) extensionFunction0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(expressionArray0[0], coreOperationAnd0);
      expressionArray0[2] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationGreaterThan0, coreOperationAnd0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, extensionFunction0);
      expressionArray0[3] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual1 = new CoreOperationLessThanOrEqual(coreOperationGreaterThanOrEqual0, (Expression) null);
      expressionArray0[4] = (Expression) coreOperationLessThanOrEqual1;
      CoreFunction coreFunction0 = new CoreFunction((-1442), expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new CoreOperationLessThanOrEqual(expressionArray0[2], expressionArray0[3]);
      Step[] stepArray0 = new Step[6];
      Step step0 = new Step((-1442), (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(646, (NodeTest) null, expressionArray0);
      stepArray0[1] = step1;
      Expression[] expressionArray1 = new Expression[3];
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationLessThanOrEqual0, expressionArray0[0]);
      expressionArray1[0] = (Expression) coreOperationMultiply0;
      expressionArray1[1] = (Expression) extensionFunction0;
      expressionArray1[2] = (Expression) coreOperationGreaterThanOrEqual0;
      Step step2 = new Step(646, (NodeTest) null, expressionArray1);
      stepArray0[2] = step2;
      Step step3 = new Step(646, (NodeTest) null, expressionArray0);
      stepArray0[3] = step3;
      Step step4 = new Step((-1442), (NodeTest) null, expressionArray1);
      stepArray0[4] = step4;
      Step step5 = new Step(2551, (NodeTest) null, expressionArray0);
      stepArray0[5] = step5;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual2, expressionArray0, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, (NodeTest) null, true);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      ChildContext childContext0 = new ChildContext(precedingOrFollowingContext0, nodeNameTest0, false, false);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[0] = (EvalContext) precedingOrFollowingContext0;
      evalContextArray0[1] = (EvalContext) precedingOrFollowingContext0;
      evalContextArray0[2] = null;
      evalContextArray0[3] = (EvalContext) precedingOrFollowingContext0;
      evalContextArray0[4] = (EvalContext) childContext0;
      evalContextArray0[5] = (EvalContext) precedingOrFollowingContext0;
      evalContextArray0[6] = (EvalContext) childContext0;
      evalContextArray0[7] = (EvalContext) precedingOrFollowingContext0;
      UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps(unionContext0);
      // Undeclared exception!
      try { 
        coreOperationLessThanOrEqual1.iterate(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator((Iterator) null);
      // Undeclared exception!
      try { 
        expression_ValueIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression$ValueIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = true;
      Step[] stepArray0 = new Step[2];
      int int0 = 0;
      QName qName0 = new QName(".?]", ".?]");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, ".?]");
      Expression[] expressionArray0 = new Expression[19];
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreFunction coreFunction0 = new CoreFunction(1338, expressionArray0);
      coreFunction0.getArg2();
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, coreFunction0);
      expressionArray0[1] = (Expression) coreOperationSubtract0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      // Undeclared exception!
      try { 
        expressionArray0[1].computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("n#kGlI4/[sk2)");
      VariableReference variableReference0 = new VariableReference(qName0);
      variableReference0.getVariableName();
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) variableReference0;
      expressionArray0[1] = (Expression) variableReference0;
      expressionArray0[2] = (Expression) variableReference0;
      expressionArray0[3] = (Expression) variableReference0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[0].isContextDependent();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.GERMANY;
      JXPathContext.newContext(jXPathContext0, (Object) expressionArray0[3]);
      jXPathContext0.selectNodes("org.apache.commons.jxpath.ri.axes.NodeSetContext");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, expressionArray0[2], locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, expressionArray0[2], nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      locale0.getUnicodeLocaleKeys();
      RootContext rootContext1 = rootContext0.getRootContext();
      // Undeclared exception!
      try { 
        rootContext1.nextNode();
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
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant((String) null);
      EvalContext[] evalContextArray0 = new EvalContext[4];
      evalContextArray0[0] = null;
      evalContextArray0[1] = null;
      evalContextArray0[2] = null;
      evalContextArray0[3] = null;
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3330);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeTypeTest0, true, true);
      AncestorContext ancestorContext0 = new AncestorContext(childContext0, true, nodeTypeTest0);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, nodeNameTest0);
      constant0.iteratePointers(selfContext0);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      expressionArray0[2] = (Expression) coreOperationNegate0;
      CoreOperationNegate coreOperationNegate1 = new CoreOperationNegate(coreOperationNegate0);
      expressionArray0[3] = (Expression) coreOperationNegate1;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[4] = (Expression) coreOperationAnd0;
      CoreFunction coreFunction0 = new CoreFunction((-5062), expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expression0, coreOperationNegate1);
      boolean boolean0 = coreOperationSubtract0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator");
      VariableReference variableReference0 = new VariableReference(qName0);
      Constant constant0 = new Constant("10g");
      constant0.toString();
      constant0.computeValue((EvalContext) null);
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator((Iterator) null);
      // Undeclared exception!
      try { 
        expression_ValueIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression$ValueIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      constant0.toString();
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, coreOperationEqual0);
      EvalContext evalContext0 = null;
      coreOperationGreaterThan0.compute((EvalContext) null);
      coreOperationGreaterThan0.computeContextDependent();
      coreOperationEqual0.toString();
      coreOperationGreaterThan0.isContextDependent();
      coreOperationGreaterThan0.isContextDependent();
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Step[] stepArray0 = new Step[0];
      // Undeclared exception!
      try { 
        coreFunction0.functionName((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = (-664);
      Expression[] expressionArray0 = null;
      CoreFunction coreFunction0 = new CoreFunction((-664), (Expression[]) null);
      EvalContext evalContext0 = null;
      NodeTest nodeTest0 = null;
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, (NodeTest) null);
      QName qName0 = new QName("", "Simultaneous operations: should not request pointer list while iterating over an EvalContext");
      Locale locale0 = Locale.PRC;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(descendantContext0, qName0, locale0);
      // Undeclared exception!
      try { 
        expression_PointerIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Constant constant0 = new Constant(integer0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThanOrEqual0, constant0);
      nameAttributeTest0.getNameTestExpression();
      Constant constant1 = new Constant("value");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant1, coreOperationGreaterThanOrEqual0);
      coreOperationNotEqual0.getSymbol();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator(0);
      QName qName0 = new QName("!=");
      Locale locale0 = Locale.ENGLISH;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(listIterator0, qName0, locale0);
      // Undeclared exception!
      try { 
        expression_PointerIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, basicNodeSet0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Object object0 = coreOperationGreaterThan0.compute(evalContext0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName((String) null, (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      Constant constant0 = new Constant((String) null);
      expressionArray0[2] = (Expression) constant0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationMultiply0, expressionArray0[1]);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[4] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expression0, expressionArray0[1]);
      CoreOperationGreaterThan coreOperationGreaterThan1 = new CoreOperationGreaterThan(coreOperationGreaterThan0, coreOperationMultiply0);
      coreFunction0.getArg1();
      coreOperationNegate0.isSymmetric();
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[2], coreOperationMultiply0);
      coreOperationEqual0.args = expressionArray0;
      expressionArray0[0].computeContextDependent();
      coreOperationEqual0.getSymbol();
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      coreOperationAnd0.getSymbol();
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(extensionFunction0, coreOperationAnd0);
      coreOperationGreaterThanOrEqual0.getSymbol();
      coreOperationNegate0.getSymbol();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "=", (Pointer) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      precedingOrFollowingContext0.getCurrentNodePointer();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      // Undeclared exception!
      try { 
        rootContext0.getVariableContext((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant constant0 = new Constant("vK.");
      EvalContext evalContext0 = null;
      constant0.toString();
      constant0.toString();
      constant0.iterate((EvalContext) null);
      constant0.iterate((EvalContext) null);
      // Undeclared exception!
      try { 
        constant0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression expression0 = null;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
      int int0 = (-2806);
      coreOperationGreaterThanOrEqual0.evaluateCompare((-2806));
      int int1 = 425;
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = null;
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expression expression0 = null;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, (Expression) null);
      nameAttributeTest0.isContextDependent();
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, (Expression[]) null, stepArray0);
      expressionPath0.getExpression();
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      coreOperationAnd0.getPrecedence();
      CoreFunction coreFunction0 = new CoreFunction(1, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.getArg1();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationUnion0, coreOperationUnion0);
      coreOperationDivide0.args = null;
      coreOperationDivide0.isSymmetric();
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      coreOperationNegate0.getPrecedence();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationUnion0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, basicNodeSet0, (Pointer) null);
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, coreOperationDivide0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, nodeNameTest0);
      RootContext rootContext1 = namespaceContext0.getRootContext();
      RootContext rootContext2 = rootContext1.getRootContext();
      coreFunction0.iteratePointers(rootContext2);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNegate0, coreOperationDivide0);
      coreOperationLessThan0.computeContextDependent();
      coreOperationUnion0.args = null;
      coreOperationLessThan0.getSymbol();
      Locale locale0 = Locale.GERMANY;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(rootContext2, qName0, locale0);
      // Undeclared exception!
      try { 
        expression_PointerIterator0.hasNext();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = (-664);
      Expression[] expressionArray0 = null;
      NodeTest nodeTest0 = null;
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, (NodeTest) null);
      QName qName0 = new QName("", "Simultaneous operations: should not request pointer list while iterating over an EvalContext");
      Locale locale0 = Locale.PRC;
      Expression.PointerIterator expression_PointerIterator0 = new Expression.PointerIterator(descendantContext0, qName0, locale0);
      // Undeclared exception!
      try { 
        expression_PointerIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression$PointerIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Constant constant0 = new Constant("!:<c{`h");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      coreOperationDivide0.getPrecedence();
      Constant constant1 = new Constant(5);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        constant1.iteratePointers(descendantContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constant constant0 = new Constant(",k:QyDo%vvx~`jKvZu]");
      constant0.toString();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      evalContextArray0[0] = null;
      UnionContext unionContext0 = new UnionContext(nodeSetContext0, evalContextArray0);
      QName qName0 = new QName("N!s2SRSKDnNi3:ky");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext(unionContext0, nodeNameTest0, false, false);
      int int0 = childContext0.getCurrentPosition();
      AncestorContext ancestorContext0 = new AncestorContext(childContext0, false, nodeNameTest0);
      constant0.iterate(ancestorContext0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      coreOperationSubtract0.isSymmetric();
      coreOperationSubtract0.computeContextDependent();
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationSubtract0, coreOperationSubtract0);
      coreOperationDivide0.isContextDependent();
      coreOperationDivide0.isSymmetric();
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      coreOperationNegate0.isSymmetric();
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationSubtract0, coreOperationSubtract0);
      coreOperationMultiply0.computeValue(evalContextArray0[0]);
      Expression[] expressionArray0 = new Expression[8];
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) constant0;
      expressionArray0[3] = (Expression) coreOperationMultiply0;
      expressionArray0[4] = (Expression) coreOperationSubtract0;
      expressionArray0[5] = (Expression) coreOperationNegate0;
      expressionArray0[6] = (Expression) coreOperationSubtract0;
      Constant constant1 = new Constant("");
      expressionArray0[7] = (Expression) constant1;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      int int1 = coreOperationAdd0.getPrecedence();
      assertEquals(4, int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant constant0 = new Constant("");
      // Undeclared exception!
      try { 
        constant0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      String string0 = nameAttributeTest0.getSymbol();
      assertEquals("=", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression.ValueIterator expression_ValueIterator0 = new Expression.ValueIterator((Iterator) null);
      // Undeclared exception!
      try { 
        expression_ValueIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression$ValueIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant constant0 = new Constant("gq");
      boolean boolean0 = constant0.isContextDependent();
      assertFalse(boolean0);
  }
}
