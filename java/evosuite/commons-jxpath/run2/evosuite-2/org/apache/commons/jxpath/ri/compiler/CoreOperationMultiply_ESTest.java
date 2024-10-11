
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
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationMultiply_ESTest extends CoreOperationMultiply_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant(7);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(1040, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreFunction0, expressionArray0[0]);
      Object object0 = coreOperationMultiply0.computeValue((EvalContext) null);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant(5);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      QName qName0 = new QName("*");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      Object object0 = coreOperationMultiply0.computeValue(namespaceContext0);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Float float0 = new Float((-263.69727F));
      Constant constant0 = new Constant(float0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) constant0;
      coreOperationMod0.args = expressionArray0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Constant constant0 = new Constant(5);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      int int0 = coreOperationMultiply0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant constant0 = new Constant(5);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      boolean boolean0 = coreOperationMultiply0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Constant constant0 = new Constant(5);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      String string0 = coreOperationMultiply0.getSymbol();
      assertEquals("*", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, (Step[]) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionPath0, expressionPath0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationLessThan0, coreOperationGreaterThan0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationDivide0, (Expression) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("(org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan@0000000003) div (org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000001)", "(org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan@0000000003) div (org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000001)");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        coreOperationMultiply0.computeValue(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }
}
