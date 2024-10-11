
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
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationNegate_ESTest extends CoreOperationNegate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("9G4XZ.,Y5~");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, coreOperationDivide0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[0], coreOperationGreaterThanOrEqual0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationSubtract0);
      String string0 = coreOperationNegate0.getSymbol();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(locationPath0);
      int int0 = coreOperationNegate0.getPrecedence();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.parser.XPathParser$JJCalls", "org.apache.commons.jxpath.ri.parser.XPathParser$JJCalls");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "-");
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Object object0 = new Object();
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(object0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.parser.XPathParser$JJCalls:org.apache.commons.jxpath.ri.parser.XPathParser$JJCalls
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("9G4XZ.,Y5~");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[0], coreOperationGreaterThanOrEqual0);
      expressionArray0[1] = (Expression) coreOperationSubtract0;
      coreOperationSubtract0.args = expressionArray0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationSubtract0);
      QName qName0 = new QName("-", "PXm_$Qf0UE");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, true);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("mZAifT)&U\"o~Vrq");
      DescendantContext descendantContext0 = new DescendantContext(childContext0, false, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[6];
      UnionContext unionContext0 = new UnionContext(descendantContext0, evalContextArray0);
      // Undeclared exception!
      coreOperationNegate0.computeValue(unionContext0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(locationPath0);
      QName qName0 = new QName("T");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Constant constant0 = new Constant(integer0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      Expression[] expressionArray0 = new Expression[0];
      coreOperationNegate0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationNegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant(1);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionArray0[0], constant0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationDivide0, coreOperationDivide0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationOr0, coreOperationGreaterThanOrEqual0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMod0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, true);
      // Undeclared exception!
      try { 
        coreOperationNegate0.computeValue(childContext0);
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
      Constant constant0 = new Constant("rJ!+Zp,kkv=n*rr3r");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(nameAttributeTest0);
      Object object0 = coreOperationNegate0.computeValue((EvalContext) null);
      assertEquals(-0.0, object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Constant constant0 = new Constant("rJ!+Zp,kkv=n*rr3r");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(nameAttributeTest0);
      boolean boolean0 = coreOperationNegate0.isSymmetric();
      assertFalse(boolean0);
  }
}
