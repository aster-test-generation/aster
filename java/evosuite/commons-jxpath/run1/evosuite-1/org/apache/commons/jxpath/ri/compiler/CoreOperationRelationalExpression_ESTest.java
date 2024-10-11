
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
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationRelationalExpression_ESTest extends CoreOperationRelationalExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("WGw8;4E063A5");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNotEqual0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationEqual0;
      QName qName0 = new QName("C]^e.'44}{~Ge~dr");
      coreOperationEqual0.args = expressionArray0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[1], expressionArray0[3]);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.computeValue(namespaceContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMultiply0, coreOperationMultiply0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, coreOperationMultiply0);
      QName qName0 = new QName("?zo9B6j", "?zo9B6j");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[0];
      coreOperationLessThan0.args = expressionArray0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, extensionFunction0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThanOrEqual0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, coreOperationAnd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, nameAttributeTest0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMultiply0, coreOperationMultiply0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "XIuxew");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(attributeContext0, nodeNameTest0, false);
      DescendantContext descendantContext0 = new DescendantContext(precedingOrFollowingContext0, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationGreaterThan0.computeValue(descendantContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(locationPath0, locationPath0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, coreOperationLessThan0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(nameAttributeTest0, locationPath0);
      QName qName0 = new QName("vT+Kj'Y9Q1VY]", "[");
      Object object0 = new Object();
      Locale locale0 = Locale.forLanguageTag("<=");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, ">", nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      Iterator iterator0 = coreOperationGreaterThan0.iterate(evalContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[17];
      QName qName0 = new QName("");
      Expression[] expressionArray1 = new Expression[3];
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationGreaterThanOrEqual0, constant0);
      expressionArray1[0] = (Expression) coreOperationGreaterThan0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray1);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationOr0, coreOperationOr0);
      // Undeclared exception!
      try { 
        coreOperationLessThanOrEqual0.computeValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(locationPath0, locationPath0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(locationPath0, locationPath0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, coreOperationLessThan0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(nameAttributeTest0, locationPath0);
      QName qName0 = new QName("vT+Kj'Y9Q1VY]", "[");
      Object object0 = new Object();
      Locale locale0 = Locale.forLanguageTag(">=");
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, nameAttributeTest0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual1 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, coreOperationMod0);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual1;
      coreOperationGreaterThan0.args = expressionArray0;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, ">", nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      Iterator iterator0 = coreOperationGreaterThan0.iterate(evalContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("DY4d", "DY4d");
      Expression[] expressionArray1 = new Expression[3];
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationGreaterThanOrEqual0, constant0);
      expressionArray1[0] = (Expression) coreOperationGreaterThan0;
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, coreOperationGreaterThanOrEqual0);
      coreOperationDivide0.args = expressionArray0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray1);
      expressionArray0[0] = (Expression) extensionFunction0;
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      // Undeclared exception!
      try { 
        coreOperationDivide0.iterate(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant(2);
      expressionArray0[2] = (Expression) constant0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, expressionArray0[2]);
      Object object0 = coreOperationGreaterThanOrEqual0.computeValue((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, coreOperationAnd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, nameAttributeTest0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMultiply0, coreOperationMultiply0);
      boolean boolean0 = coreOperationGreaterThan0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMultiply0, coreOperationMultiply0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, coreOperationMultiply0);
      QName qName0 = new QName("?zo9B6j", "?zo9B6j");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThan0, extensionFunction0);
      int int0 = coreOperationGreaterThanOrEqual0.getPrecedence();
      assertEquals(3, int0);
  }
}
