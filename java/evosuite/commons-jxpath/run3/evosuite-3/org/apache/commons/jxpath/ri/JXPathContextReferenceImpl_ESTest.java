
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
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
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
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContextReferenceImpl_ESTest extends JXPathContextReferenceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Object object0 = jXPathContextReferenceImpl0.getValue("3");
      assertEquals(3.0, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[4];
      Long long0 = new Long((-439L));
      Constant constant0 = new Constant(long0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationNegate0, nameAttributeTest0);
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationOr0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAdd0, coreOperationOr0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iteratePointers("", (Expression) coreOperationLessThan0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("m0Mjq6c0P", "m0Mjq6c0P");
      Expression[] expressionArray0 = new Expression[5];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      Iterator iterator0 = jXPathContext0.iterate("\"text\"");
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "R");
      Constant constant0 = new Constant("fM^");
      Class<Object> class0 = Object.class;
      String string0 = (String)jXPathContextReferenceImpl0.getValue("=", (Expression) constant0, (Class) class0);
      assertEquals("fM^", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Class<Object> class0 = Object.class;
      Object object0 = jXPathContextReferenceImpl0.getValue("\"last\"", class0);
      assertEquals("last", object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContext0.getPointer("\"/\"");
      assertFalse(beanPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      JXPathContextReferenceImpl.addNodePointerFactory(variablePointerFactory0);
      NodePointerFactory[] nodePointerFactoryArray0 = JXPathContextReferenceImpl.getNodePointerFactories();
      assertNull(nodePointerFactoryArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodePointerFactory[] nodePointerFactoryArray0 = JXPathContextReferenceImpl.getNodePointerFactories();
      assertEquals(6, nodePointerFactoryArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate((Expression) null);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      NamespaceResolver namespaceResolver0 = jXPathContextReferenceImpl0.getNamespaceResolver();
      assertTrue(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      TreeCompiler treeCompiler0 = (TreeCompiler)jXPathContextReferenceImpl0.getCompiler();
      assertNotNull(treeCompiler0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = (JXPathCompiledExpression)jXPathContextReferenceImpl0.compilePath("root");
      assertEquals("root", jXPathCompiledExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = (DOMPointerFactory)JXPathContextReferenceImpl.allocateConditionally("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory", "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory");
      assertEquals(100, dOMPointerFactory0.getOrder());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>(expressionPath0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("7v+uhnfTH");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '7v+uhnfTH'. Syntax error after: '7'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory", "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationAnd0, expressionArray0[4]);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("c{izCUwcS@x1(&sJT", (Expression) coreOperationAdd0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory:org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("", "");
      Expression[] expressionArray0 = new Expression[4];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, extensionFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMultiply0, coreOperationMultiply0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("", (Expression) coreOperationMultiply0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("<<unknown namespace>>", (Expression) expressionPath0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers(":");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ':'. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", (Expression) expressionPath0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate("FZi`=nL&j$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'FZi`=nL&j$'. Invalid symbol '`' after: 'FZi'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getVariablePointer((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      QName qName0 = new QName("-HvzaH#q ~Z'=");
      Expression[] expressionArray0 = new Expression[3];
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      Expression[] expressionArray1 = new Expression[2];
      expressionArray1[0] = (Expression) variableReference0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray1);
      expressionArray0[1] = (Expression) coreOperationOr0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationNegate0, coreOperationGreaterThan0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("-HvzaH#q ~Z'=", (Expression) coreOperationLessThanOrEqual0, (Class) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: -HvzaH#q ~Z'=
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod((Expression) null, expressionArray0[1]);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, expressionArray0[3]);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("@`a0Yb", (Expression) coreOperationGreaterThanOrEqual0, (Class) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationOr0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationNegate0, coreOperationNegate0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationUnion0, coreOperationDivide0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("", (Expression) expressionPath0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, (Expression) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationLessThanOrEqual0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("Cannot create path:", (Expression) coreOperationNegate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "q[0");
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("org.apache.commons.jxpath.ri.parser.ParseException");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.ri.parser.ParseException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NameAttributeTest", "uVy{po,451D:om");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getRelativeContext(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.compiler.NameAttributeTest:uVy{po,451D:om
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getRelativeContext((Pointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>(expressionPath0, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("rQP", (Expression) expressionPath0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, (Step[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("7PuXtEo");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '7PuXtEo'. Syntax error after: '7'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      SoftReference<Object> softReference0 = new SoftReference<Object>(object0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) softReference0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory");
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory; Class 'org/apache/commons/jxpath/ri/model/dom.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      TypeUtils.setTypeConverter((TypeConverter) null);
      QName qName0 = new QName("dG@3obow;ZwA{t");
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "R");
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[4];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.compilePath("K2\"EU=^VLE<sc=+");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'K2\\\"EU=^VLE<sc=+'. Invalid symbol '+' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContextReferenceImpl.allocateConditionally("'3\"/vE'?%fp^H.%qocP", "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate '3\"/vE'?%fp^H.%qocP; '3\"/vE'?%fp^H.%qocP
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContextReferenceImpl.allocateConditionally("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory", "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("I^");
      VariablePointer variablePointer0 = (VariablePointer)jXPathContextReferenceImpl0.getVariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = null;
      try {
        jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, object0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: I^
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(". It cannot be converted to ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '. It cannot be converted to '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0);
      QName qName0 = new QName("dG@3obow;ZwA{t");
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: dG@3obow;ZwA{t
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer((String) null, (Expression) variableReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: null
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(500, expressionArray0);
      Class<Object> class0 = Object.class;
      Object object1 = jXPathContextReferenceImpl0.getValue("org.apache.commons.jxpath.ri.parser.XPathParser$JJCalls", (Expression) coreFunction0, (Class) class0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Class<ExpressionPath> class0 = ExpressionPath.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("org.apache.commons.beanutils.DynaBean", (Expression) coreOperationAdd0, (Class) class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("zZcv;_/_~1Z8T$M");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAnd0, coreOperationLessThan0);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Boolean boolean0 = (Boolean)jXPathContextReferenceImpl0.getValue(">Ap=v\"+._R6P3#@)/", expressionArray0[0]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = JXPathContextReferenceImpl.allocateConditionally("root", "root");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>(object0, referenceQueue0);
      QName qName0 = new QName("root", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jXPathContext0, (Locale) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, softReference0, nodePointer0);
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContext0));
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContext0.getContextPointer();
      assertFalse(beanPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      InitialContext initialContext1 = (InitialContext)variableReference0.computeValue(initialContext0);
      assertNotSame(initialContext1, initialContext0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate((Expression) null);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>(expressionPath0, referenceQueue0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, softReference0);
      QName qName0 = new QName("\"comment\"");
      NodePointer nodePointer0 = jXPathContextReferenceImpl0.getVariablePointer(qName0);
      jXPathContext0.setNamespaceContextPointer(nodePointer0);
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      jXPathContext0.setNamespaceContextPointer((Pointer) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      jXPathContextReferenceImpl0.getAbsoluteRootContext();
      jXPathContextReferenceImpl0.registerNamespace("P:;}opp=#2Ei}TTeyQ", "P:;}opp=#2Ei}TTeyQ");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      jXPathContextReferenceImpl0.registerNamespace("ZemzIvBEy#oZAe", "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null);
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(500, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationSubtract0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], coreOperationSubtract0);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray0[2] = (Expression) coreOperationGreaterThanOrEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("", (Expression) coreOperationLessThan0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Long long0 = new Long(430L);
      Constant constant0 = new Constant(long0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removeAll("id(", (Expression) constant0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath id(; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, (Step[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      jXPathContextReferenceImpl0.removeAll("org.apache.commons.jxpath.JXPathAbstractFactoryException", (Expression) coreFunction0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("");
      expressionArray0[1] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, expressionArray0[1]);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("}Utm", (Expression) nameAttributeTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath }Utm; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("Qbu", (Object) jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath Qbu; Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreFunction0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPath("", (Expression) coreOperationNegate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-528), expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContextReferenceImpl0.createPath("\"", (Expression) coreOperationUnion0);
      assertEquals(0, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Short short0 = new Short((short)577);
      Constant constant0 = new Constant(short0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContextReferenceImpl0.getPointer("org.apache.commons.beanutils.DynaBean", (Expression) constant0);
      assertEquals(1, beanPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("\"\n\"", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid expression type. '\"
         // \"' returns java.lang.String. It cannot be converted to java.lang.Object
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, basicVariables0);
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Object object0 = jXPathContextReferenceImpl0.getValue("org.apache.commons.jxpath.JXPathInvalidSyntaxException", (Expression) locationPath0);
      assertSame(object0, basicVariables0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "R");
      Class<Object> class0 = Object.class;
      jXPathContext0.setLenient(true);
      Object object0 = jXPathContext0.getValue("R", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QName qName0 = new QName("2k-PE");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[3] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("2k-PE", expressionArray0[3], class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: 2k-PE
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(1995, expressionArray0);
      Object object0 = jXPathContextReferenceImpl0.getValue("de/aH]:=|ypfG]", (Expression) coreFunction0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      String string0 = jXPathContextReferenceImpl0.getPrefix("-e");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object object0 = JXPathContextReferenceImpl.allocateConditionally("-e", "3");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Short short0 = new Short((short) (-859));
      Constant constant0 = new Constant(short0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("\"last\"", (Expression) constant0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath \"last\"; Cannot set value for xpath: \"last\"
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("org.apache.commons.jxpath.JXPathNotFoundException");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.JXPathNotFoundException; Factory is not set on the JXPathContext - cannot create path: /org.apache.commons.jxpath.JXPathNotFoundException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      String string0 = jXPathContext0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Short short0 = new Short((short) (-859));
      Constant constant0 = new Constant(short0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iterate((String) null, (Expression) constant0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("$gDM");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath $gDM; No pointer for xpath: $gDM
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("", "P:;}opp=#2Ei}TTeyQ");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("org.apache.commons.jxpath.ri.compiler.VariableReference@0000000014 * org.apache.commons.jxpath.ri.compiler.VariableReference@0000000014", (Expression) variableReference0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath org.apache.commons.jxpath.ri.compiler.VariableReference@0000000014 * org.apache.commons.jxpath.ri.compiler.VariableReference@0000000014; Cannot set undefined variable: :P:;}opp=#2Ei}TTeyQ
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Short short0 = new Short((short) (-859));
      Constant constant0 = new Constant(short0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue("3", (Expression) constant0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath 3; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("org.apache.commons.jxpath.ri.Parser", (Object) "org.apache.commons.jxpath.ri.Parser");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath org.apache.commons.jxpath.ri.Parser; Cannot set property /org.apache.commons.jxpath.ri.Parser, path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)initialContext0.getSingleNodePointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)jXPathContextReferenceImpl0.getRelativeContext(beanPointer0);
      assertNotSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      Class<Object> class0 = Object.class;
      jXPathContextReferenceImpl0.getValue("-e", class0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iteratePointers("-e");
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>(object0, referenceQueue0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("", (Object) softReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      NullPointer nullPointer0 = (NullPointer)jXPathContextReferenceImpl0.getNamespaceContextPointer();
      assertFalse(nullPointer0.isCollection());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.compilePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }
}
