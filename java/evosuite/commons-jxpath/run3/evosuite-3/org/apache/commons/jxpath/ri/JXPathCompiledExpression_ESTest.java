
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
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
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathCompiledExpression_ESTest extends JXPathCompiledExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("Factory is not set on the JXPathContext - cannot create path: ");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Factory is not set on the JXPathContext - cannot create path: ", variableReference0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      jXPathCompiledExpression0.removeAll(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Constant constant0 = new Constant(integer0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, constant0);
      String string0 = jXPathCompiledExpression0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double double0 = new Double(0.0);
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThan0);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Long long0 = new Long(246307784491008L);
      Constant constant0 = new Constant(long0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Cannot modify property: ", constant0);
      Iterator iterator0 = jXPathCompiledExpression0.iteratePointers(jXPathContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      Iterator iterator0 = jXPathCompiledExpression0.iterate(jXPathContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(locationPath0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("@Cgg/M_'hx);T\")RX=", nameAttributeTest0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("@Cgg/M_'hx);T\")RX=", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("l$", (String) null);
      Expression[] expressionArray0 = new Expression[1];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationNegate0, extensionFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationNotEqual0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(",;;M;S@oaeAso", constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "]\":4Bmc/H;*!");
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      Object object0 = jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0, (Class) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("preceding::", locationPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      assertSame(object0, jXPathCompiledExpression0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("|G ^V_<\"q%{~2:IF", coreFunction0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "|G ^V_<\"q%{~2:IF");
      Object object0 = jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant(")5=Bxn'");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("The specified collection element does not exist: ", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "The specified collection element does not exist: ");
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0);
      assertEquals(")5=Bxn'", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[1] = (Expression) variableReference0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, variableReference0);
      expressionArray0[2] = (Expression) coreOperationLessThan0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationUnion0, expressionArray0[0]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMultiply0);
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationMultiply0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.getPointer(jXPathContextReferenceImpl0, "");
      assertTrue(beanPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", (Expression) null);
      Expression expression0 = jXPathCompiledExpression0.getExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("preceding::", locationPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.createPath(jXPathContext0);
      assertTrue(beanPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationAdd0, expressionArray0[3]);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMultiply0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNegate0, coreOperationAnd0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationMod0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue((JXPathContext) null, expressionArray0[3]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationMultiply0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath org.apache.commons.jxpath.ri.JXPathCompiledExpression; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant constant0 = new Constant(")5=Bxn'");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("The specified collection element does not exist: ", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "The specified collection element does not exist: ");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath The specified collection element does not exist: ; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("2", "q*h4,wAN");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[0], expressionArray0[0]);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, coreOperationGreaterThan0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("2", coreOperationSubtract0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationSubtract0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 2:q*h4,wAN
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Long long0 = new Long(1L);
      Constant constant0 = new Constant(long0);
      expressionArray0[0] = (Expression) constant0;
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(step0).toString();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      expressionArray0[2] = (Expression) constant0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, coreFunction0);
      expressionArray0[3] = (Expression) coreOperationMultiply0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationUnion0, coreOperationUnion0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationDivide0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) long0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last(1, null/null/null/null/null, 1, org.apache.commons.jxpath.ri.compiler.Constant@0000000001 * org.apache.commons.jxpath.ri.compiler.CoreFunction@0000000003)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float(0.0);
      Constant constant0 = new Constant(float0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(variableReference0, coreOperationOr0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationNotEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[0]);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(17, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, expressionArray0, stepArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionPath0, coreFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThanOrEqual0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: translate(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAdd0, coreOperationAdd0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray0[1]);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationEqual0, coreOperationNegate0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("n", coreOperationMultiply0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(")eT}F/is", locationPath0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("';bi_+;@4XUl:");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("';bi_+;@4XUl:", coreOperationNegate0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ';bi_+;@4XUl:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", variableReference0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Constant constant0 = new Constant("");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", nameAttributeTest0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("BeanInfo [class = ");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNegate0, coreOperationNegate0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, constant0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, coreOperationNegate0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationSubtract0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("l$", (String) null);
      Expression[] expressionArray0 = new Expression[1];
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationNegate0, extensionFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationNotEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: l$:null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, coreFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("w7z:5w>(q1y3u:zr+x", coreOperationGreaterThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationUnion0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, nameAttributeTest0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationLessThanOrEqual0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationOr0, coreOperationUnion0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMod0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      QName qName0 = new QName("boolean");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("boolean", coreOperationMultiply0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "boolean");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContextReferenceImpl0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: boolean
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("Factory is not set on the JXPathContext - cannot create path: ");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Factory is not set on the JXPathContext - cannot create path: ", variableReference0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, ":--$3m0BcA8g");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: :--$3m0BcA8g
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationUnion0, coreOperationAdd0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, expressionPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationUnion0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, (String) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant("+9XA/6q?~BCz2");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, nameAttributeTest0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      QName qName0 = new QName("+9XA/6q?~BCz2", "org.apache.commons.jxpath.ri.JXPathCompiledExpression");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, expressionArray0[2]);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationAdd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationMultiply0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "!;.v6Srq,xh@");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Constant constant0 = new Constant("");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue(jXPathContext0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Constant constant0 = new Constant("");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant((String) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, coreOperationMod0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationOr0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, expressionArray0[3]);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNotEqual0, coreFunction0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("F^efG.oOi;4", coreOperationLessThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationDivide0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Float float0 = new Float((double) 0);
      Constant constant0 = new Constant(float0);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, expressionArray0[1]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationGreaterThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue(jXPathContext0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("BeanInfo [class = ");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, coreOperationNegate0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationSubtract0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationUnion0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", variableReference0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Double double0 = new Double((-1800.172441739455));
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("last", coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("OprecI", (Expression) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", variableReference0);
      Expression expression0 = jXPathCompiledExpression0.getExpression();
      assertSame(variableReference0, expression0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(";,!h DL5*P4Iu", nameAttributeTest0);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals(";,!h DL5*P4Iu", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Exception trying to remove all for xpath ", coreOperationSubtract0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationMultiply0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationNotEqual0, expressionArray0[8]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationDivide0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue((JXPathContext) null, jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, expressionPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationUnion0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }
}
