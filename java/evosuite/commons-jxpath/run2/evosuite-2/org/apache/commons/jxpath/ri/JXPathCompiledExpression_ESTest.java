
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
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
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
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", locationPath0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathCompiledExpression0.removeAll(jXPathContext0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationAdd0);
      String string0 = jXPathCompiledExpression0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Float float0 = new Float(0.0F);
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("#/x/L-]KW$}ke{[", nameAttributeTest0);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals("#/x/L-]KW$}ke{[", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      expressionArray0[2] = (Expression) constant0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[2], coreOperationNegate0);
      expressionArray0[3] = (Expression) coreOperationGreaterThan0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Iterator iterator0 = jXPathCompiledExpression0.iteratePointers(jXPathContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      expressionArray0[2] = (Expression) constant0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[2], coreOperationNegate0);
      expressionArray0[3] = (Expression) coreOperationGreaterThan0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Iterator iterator0 = jXPathCompiledExpression0.iterate(jXPathContext0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, (Expression) null);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationNegate0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(">", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Constant constant0 = new Constant(")vfT");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(")vfT", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      Class<Object> class0 = Object.class;
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      assertEquals(")vfT", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1813), expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("0,qt", coreFunction0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Object object1 = jXPathCompiledExpression0.getValue(jXPathContext0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Constant constant0 = new Constant("name");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "name");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("name", constant0);
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0);
      assertEquals("name", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) step0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.getPointer(jXPathContext0, "");
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationLessThanOrEqual0);
      Expression expression0 = jXPathCompiledExpression0.getExpression();
      assertSame(expression0, coreOperationLessThanOrEqual0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      expressionArray0[2] = (Expression) constant0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[2], coreOperationNegate0);
      expressionArray0[3] = (Expression) coreOperationGreaterThan0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BeanPointer beanPointer0 = (BeanPointer)jXPathCompiledExpression0.createPath(jXPathContext0);
      assertFalse(beanPointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, (Expression) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationSubtract0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue((JXPathContext) null, (Object) null);
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
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationOr0);
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
  public void test16()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
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
  public void test17()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("<Number>");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreFunction coreFunction0 = new CoreFunction((-2692), expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAdd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <Number>
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("JXPath: loaded from services: ", "(A@__OPcV");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", extensionFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) extensionFunction0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: JXPath: loaded from services: :(A@__OPcV
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Byte byte0 = new Byte((byte)85);
      Constant constant0 = new Constant(byte0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationMultiply0, coreOperationMultiply0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationEqual0, constant0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationOr0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[2]);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationMod0);
      QName qName0 = new QName("A#HxH7ZxP)!$>!5");
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, coreOperationGreaterThanOrEqual0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, jXPathCompiledExpression0, nodePointer0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContextReferenceImpl0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("\"", "JWKiG3");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAnd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "\"");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \":JWKiG3
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("H");
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(2879, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      expressionArray0[1] = (Expression) coreFunction0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreFunction0, expressionArray0[0]);
      expressionArray0[2] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[3] = (Expression) coreFunction0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[4] = (Expression) coreOperationAnd0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, expressionArray0[2]);
      Object object0 = coreFunction0.computeValue((EvalContext) null);
      expressionArray0[5] = (Expression) coreOperationGreaterThan0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[4], coreOperationGreaterThan0);
      expressionArray0[6] = (Expression) coreOperationNotEqual0;
      expressionArray0[7] = (Expression) coreOperationGreaterThan0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("H", extensionFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: H
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      QName qName0 = new QName(",Oh[Y:g@jHD47>4dr7");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAdd0, variableReference0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationDivide0, coreOperationAdd0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationEqual0, coreOperationDivide0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(">@", coreOperationUnion0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[7]);
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
  public void test24()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreOperationMod0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("E~vRtRvv=[kU", coreOperationLessThanOrEqual0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
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
  public void test25()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("] ", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[7];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAdd0, locationPath0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationEqual0, expressionArray0[4]);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationGreaterThan0, variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationDivide0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ] :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("Pz)npM<'3PDd!KKa?q");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Pz)npM<'3PDd!KKa?q", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variableReference0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: Pz)npM<'3PDd!KKa?q
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[3];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(locationPath0, locationPath0);
      expressionArray0[1] = (Expression) coreOperationLessThan0;
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", expressionArray0[1]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0, (Class) class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("\"text\"");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, expressionArray0[3]);
      expressionArray0[4] = (Expression) nameAttributeTest0;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ":");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("y]}cX?U~Bn@.66[", expressionArray0[4]);
      Class<Object> class0 = Object.class;
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
  public void test29()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Expression[] expressionArray1 = new Expression[9];
      Constant constant0 = new Constant("X*R?0f4Y/D");
      expressionArray1[0] = (Expression) constant0;
      QName qName0 = new QName("X*R?0f4Y/D", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray1[1] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray1);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationAdd0, expressionPath0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationOr0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationAdd0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: X*R?0f4Y/D:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName((String) null, "1i");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", variableReference0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Float float0 = new Float((-1575.1393F));
      Constant constant0 = new Constant(float0);
      Step[] stepArray0 = new Step[8];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(step0).getAxis();
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAnd0);
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
  public void test32()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationOr0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, coreFunction0, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.JXPathCompiledExpression", "");
      Expression[] expressionArray0 = new Expression[8];
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray1);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAnd0, coreOperationAnd0);
      expressionArray0[1] = (Expression) coreOperationDivide0;
      Expression[] expressionArray2 = new Expression[6];
      expressionArray2[0] = (Expression) coreOperationDivide0;
      expressionArray2[1] = (Expression) coreOperationDivide0;
      expressionArray2[2] = (Expression) coreOperationAnd0;
      expressionArray2[3] = (Expression) coreOperationAnd0;
      expressionArray2[4] = (Expression) coreOperationAnd0;
      expressionArray2[5] = (Expression) coreOperationDivide0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray2);
      expressionArray0[2] = (Expression) coreOperationUnion0;
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[3] = (Expression) variableReference0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, expressionArray0[1]);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationSubtract0, coreOperationUnion0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMultiply0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "org.apache.commons.jxpath.ri.JXPathCompiledExpression");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.JXPathCompiledExpression:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName(" of ", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression(" of ", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, " of ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath:  of 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("in)");
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, coreOperationOr0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[3], coreOperationOr0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("in)", extensionFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nameAttributeTest0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "<<unknown namespace>>");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, locationPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationLessThanOrEqual0, nameAttributeTest0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("aK,k^RmMObZh+z", coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationMod0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "<<unknown namespace>>");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      VariableReference variableReference0 = new VariableReference((QName) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("JXPath: found java.home property ", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variableReference0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue(jXPathContext0, jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath JXPath: found java.home property ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationDivide0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("~0z|C", coreOperationNegate0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ~0z|C; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("3S7v]O+(59Ig", coreOperationOr0);
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
  public void test40()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) step0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue(jXPathContext0, step0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) step0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("3S7v]O+(59Ig", coreOperationOr0);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("3S7v]O+(59Ig", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationOr0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[2]);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationGreaterThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) step0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Constant constant0 = new Constant("");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath ; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
      Expression expression0 = jXPathCompiledExpression0.getExpression();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", locationPath0);
      String string0 = jXPathCompiledExpression0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("FeS1G", (Expression) null);
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
  public void test49()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("OU~RB?3m", coreOperationAdd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "$");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath OU~RB?3m; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      QName qName0 = new QName("H,ci@2");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNegate0, coreFunction0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThanOrEqual0, variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("\"R>", coreOperationEqual0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue((JXPathContext) null, coreOperationLessThanOrEqual0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.JXPathCompiledExpression", "");
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, expressionArray0[1]);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationSubtract0, coreOperationUnion0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMultiply0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "org.apache.commons.jxpath.ri.JXPathCompiledExpression");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExtensionFunction", e);
      }
  }
}
