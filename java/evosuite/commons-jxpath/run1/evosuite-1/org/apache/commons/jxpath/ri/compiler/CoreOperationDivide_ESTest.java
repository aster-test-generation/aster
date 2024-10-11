
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
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationDivide_ESTest extends CoreOperationDivide_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant constant0 = new Constant("]Ec>P#Jk4G");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, coreOperationNegate0);
      Object object0 = coreOperationDivide0.computeValue((EvalContext) null);
      assertEquals(Double.NaN, object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[1], expressionArray0[1]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, coreOperationSubtract0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("div");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(namespaceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Constant constant0 = new Constant("]Ec>P#Jk4G");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, coreOperationNegate0);
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
  public void test4()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant((String) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationMod0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationMultiply0, coreOperationMultiply0);
      QName qName0 = new QName((String) null, (String) null);
      CoreFunction coreFunction0 = new CoreFunction(1979, expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, coreOperationEqual0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Object object0 = new Object();
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreOperationDivide0.computeValue(rootContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant constant0 = new Constant("]Ec>P#Jk4G");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, coreOperationNegate0);
      int int0 = coreOperationDivide0.getPrecedence();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Constant constant0 = new Constant("]Ec>P#Jk4G");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, coreOperationNegate0);
      boolean boolean0 = coreOperationDivide0.isSymmetric();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Constant constant0 = new Constant("]Ec>P#Jk4G");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, coreOperationNegate0);
      String string0 = coreOperationDivide0.getSymbol();
      assertEquals("div", string0);
  }
}
