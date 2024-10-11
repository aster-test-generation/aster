
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationAdd_ESTest extends CoreOperationAdd_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      String string0 = coreOperationAdd0.getSymbol();
      assertEquals("+", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName((String) null, "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[1], variableReference0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) coreOperationMod0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, processingInstructionTest0);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant((Number) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[0], constant0);
      expressionArray0[1] = (Expression) coreOperationMultiply0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      coreOperationMultiply0.args = expressionArray0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1647));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      coreOperationAdd0.computeValue(selfContext0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Expression[] expressionArray1 = new Expression[9];
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray1[0] = (Expression) variableReference0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray1);
      expressionArray1[1] = (Expression) coreOperationAnd0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray1[1], variableReference0);
      expressionArray1[2] = (Expression) coreOperationSubtract0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray1[1], expressionArray1[1]);
      expressionArray1[3] = (Expression) coreOperationGreaterThan0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray1[0], coreOperationGreaterThan0);
      expressionArray1[4] = (Expression) coreOperationEqual0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray1[2], coreOperationEqual0);
      expressionArray1[5] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray1[6] = (Expression) variableReference0;
      expressionArray1[7] = (Expression) coreOperationAnd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray1[8] = (Expression) coreOperationOr0;
      CoreFunction coreFunction0 = new CoreFunction(16, expressionArray1);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreFunction0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      expressionArray0[1] = (Expression) coreOperationAnd0;
      expressionArray0[2] = (Expression) coreOperationGreaterThan0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: normalize-space($, org.apache.commons.jxpath.ri.compiler.VariableReference@0000000002 and org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003 and org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract@0000000004 and org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000005 and org.apache.commons.jxpath.ri.compiler.CoreOperationEqual@0000000006 and org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000007 and org.apache.commons.jxpath.ri.compiler.VariableReference@0000000002 and org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003 and (org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000008), (org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003) - org.apache.commons.jxpath.ri.compiler.VariableReference@0000000002, (org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003) > (org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003), org.apache.commons.jxpath.ri.compiler.VariableReference@0000000002 = org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000005, org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract@0000000004 >= (org.apache.commons.jxpath.ri.compiler.CoreOperationEqual@0000000006), $, org.apache.commons.jxpath.ri.compiler.VariableReference@0000000002 and org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003 and org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract@0000000004 and org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000005 and org.apache.commons.jxpath.ri.compiler.CoreOperationEqual@0000000006 and org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual@0000000007 and org.apache.commons.jxpath.ri.compiler.VariableReference@0000000002 and org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003 and (org.apache.commons.jxpath.ri.compiler.CoreOperationOr@0000000008), org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual@0000000010 or org.apache.commons.jxpath.ri.compiler.CoreOperationAnd@0000000003 or org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan@0000000005)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("+");
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, true);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      coreOperationEqual0.args = expressionArray1;
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(ancestorContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant(0);
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) constant0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], expressionArray0[1]);
      expressionArray0[3] = (Expression) coreOperationMod0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationAdd0.computeValue(attributeContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("l7y,");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Object object0 = coreOperationAdd0.computeValue((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      boolean boolean0 = coreOperationAdd0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      int int0 = coreOperationAdd0.getPrecedence();
      assertEquals(4, int0);
  }
}
