
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationLessThan_ESTest extends CoreOperationLessThan_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName("<", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionPath0, variableReference0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(nameAttributeTest0, variableReference0);
      boolean boolean0 = coreOperationLessThan0.evaluateCompare(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName("<", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionPath0, variableReference0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(nameAttributeTest0, variableReference0);
      String string0 = coreOperationLessThan0.getSymbol();
      assertEquals("<", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationDivide0, (Expression) null);
      boolean boolean0 = coreOperationLessThan0.evaluateCompare((-164));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationDivide0, (Expression) null);
      boolean boolean0 = coreOperationLessThan0.evaluateCompare(143);
      assertFalse(boolean0);
  }
}
