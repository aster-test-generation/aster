
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
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationDivide_ESTest extends CoreOperationDivide_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant constant0 = new Constant(3);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      Iterator iterator0 = coreOperationDivide0.iterate((EvalContext) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant constant0 = new Constant(7);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(nameAttributeTest0, constant0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "]`g(hSLs!>:");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(attributeContext0, nodeNameTest0, false);
      Iterator iterator0 = coreOperationDivide0.iterate(precedingOrFollowingContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, coreOperationOr0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationOr0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Integer integer0 = new Integer(457);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(integer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(457);
      AncestorContext ancestorContext0 = new AncestorContext(initialContext0, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(ancestorContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("|YNIIJt^:gM4");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(extensionFunction0, extensionFunction0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationNotEqual0, extensionFunction0);
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "div", locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "div", nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: |YNIIJt^:gM4
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAnd0);
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationUnion0, coreOperationAnd0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, coreOperationMultiply0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(attributeContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(locationPath0, locationPath0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue((EvalContext) null);
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
      Constant constant0 = new Constant(3);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      Expression[] expressionArray0 = new Expression[0];
      coreOperationDivide0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThan0, coreOperationGreaterThan0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, constant0);
      expressionArray0[1] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationOr0, expressionArray0[1]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, coreOperationEqual0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      NamespaceContext namespaceContext0 = new NamespaceContext(precedingOrFollowingContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(namespaceContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(8, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreOperationLessThan0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationNotEqual0);
      QName qName0 = new QName("div", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "6/{.F`3&=!40v@Oz");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, false, nodeNameTest0);
      Object object0 = coreOperationDivide0.computeValue(ancestorContext0);
      assertEquals(1.0, object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(8, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreOperationLessThan0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationNotEqual0);
      int int0 = coreOperationDivide0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(8, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreOperationLessThan0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationNotEqual0);
      boolean boolean0 = coreOperationDivide0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(8, (Expression[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, coreOperationLessThan0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationNotEqual0);
      String string0 = coreOperationDivide0.getSymbol();
      assertEquals("div", string0);
  }
}
