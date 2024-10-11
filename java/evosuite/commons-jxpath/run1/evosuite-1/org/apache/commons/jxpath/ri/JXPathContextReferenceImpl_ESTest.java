
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
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
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
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.VariablePointerFactory;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContextReferenceImpl_ESTest extends JXPathContextReferenceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContextReferenceImpl.allocateConditionally(",M[P4", "org.apache.commons.jxpath.ri.compiler.CoreOperationUnion");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate ,M[P4; ,M[P4
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Object object0 = new Object();
      QName qName0 = new QName((String) null, "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jXPathContext0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0, nodePointer0);
      assertFalse(jXPathContextReferenceImpl0.equals((Object)jXPathContext0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Step[] stepArray0 = new Step[1];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(step0).getAxis();
      doReturn((NodeTest) null).when(step0).getNodeTest();
      doReturn((Expression[]) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iterate((String) null, (Expression) locationPath0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Object object0 = jXPathContext0.getValue("\"child::\"");
      assertEquals("child::", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      NodePointerFactory[] nodePointerFactoryArray0 = JXPathContextReferenceImpl.getNodePointerFactories();
      assertNull(nodePointerFactoryArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NodePointerFactory[] nodePointerFactoryArray0 = JXPathContextReferenceImpl.getNodePointerFactories();
      assertEquals(6, nodePointerFactoryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      TreeCompiler treeCompiler0 = (TreeCompiler)jXPathContextReferenceImpl0.getCompiler();
      assertNotNull(treeCompiler0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = JXPathContextReferenceImpl.allocateConditionally("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("|4<'=0QRDW)J0", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '|4<\\'=0QRDW)J0'. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      QName qName0 = new QName("m_T_'1z }6H:kL:^F");
      SoftReference<Object> softReference0 = new SoftReference<Object>(qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue((String) null, (Object) softReference0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>(object0, referenceQueue0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("Lq");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath Lq; No pointer for xpath: Lq
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      jXPathContextReferenceImpl0.removePath("Er(L_,*r[Fs.SLqTT");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      jXPathContext0.removeAll("(<8#<`%BA{O>=f~,D");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VariablePointerFactory variablePointerFactory0 = new VariablePointerFactory();
      Locale locale0 = Locale.ROOT;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, "W8gpo1:gCR^T", (Pointer) null);
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<Object> softReference0 = new SoftReference<Object>(variablePointerFactory0, referenceQueue0);
      JXPathContext jXPathContext1 = JXPathContext.newContext((JXPathContext) jXPathContextReferenceImpl0, (Object) softReference0);
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(890, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationUnion0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAnd0, coreFunction0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, (Step[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext1, expressionPath0);
      // Undeclared exception!
      jXPathContextReferenceImpl1.iteratePointers("<<unknown namespace>>", (Expression) coreOperationUnion0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationOr0, coreOperationOr0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("tSQde%^/kp'", (Expression) extensionFunction0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, coreOperationAnd0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThan0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iteratePointers("", (Expression) coreOperationEqual0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
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
  public void test17()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
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
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(locationPath0, locationPath0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationMod0, locationPath0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationLessThan0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      Constant constant0 = new Constant("R:u|@Fi T8@9");
      expressionArray0[1] = (Expression) constant0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMultiply0, expressionArray0[1]);
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      expressionArray0[3] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[4] = (Expression) coreOperationAdd0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[5] = (Expression) coreOperationAnd0;
      CoreFunction coreFunction0 = new CoreFunction((-365), expressionArray0);
      expressionArray0[6] = (Expression) coreFunction0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionArray0[0], locationPath0);
      expressionArray0[7] = (Expression) coreOperationDivide0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationOr0, constant0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      jXPathContextReferenceImpl0.getValue("R:u|@Fi T8@9", (Expression) coreOperationMultiply0, (Class) class0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, (Step[]) null);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, expressionArray0[0]);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationDivide0, coreOperationDivide0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThan0, coreFunction0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationNotEqual0, coreOperationLessThan0);
      Class<ExpressionPath> class0 = ExpressionPath.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("}9[]R_KjEZDQ", (Expression) coreOperationMultiply0, (Class) class0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = JXPathContextReferenceImpl.allocateConditionally("N|", "N|");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, object0);
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Class<ExpressionPath> class0 = ExpressionPath.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("United States", (Expression) coreOperationOr0, (Class) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
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
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(locationPath0, locationPath0);
      Constant constant0 = new Constant((String) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationNotEqual0, constant0);
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("D", (Expression) coreOperationDivide0, (Class) class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, (Step[]) null);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, expressionArray0[0]);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationDivide0, coreOperationDivide0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThan0, coreFunction0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationNotEqual0, coreOperationLessThan0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("}RA", (Expression) coreOperationMultiply0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, (Step[]) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionPath0, coreOperationSubtract0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, expressionArray0[4]);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("", (Expression) coreOperationNotEqual0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ReferenceQueue<Object> referenceQueue0 = new ReferenceQueue<Object>();
      SoftReference<ExpressionPath> softReference0 = new SoftReference<ExpressionPath>((ExpressionPath) null, referenceQueue0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
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
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", "z:S<~5`pA_p<Uzc");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getRelativeContext(variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationOr0;
      Step[] stepArray0 = new Step[9];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, coreOperationOr0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(extensionFunction0, coreOperationGreaterThan0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer((String) null, (Expression) expressionPath0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Long long0 = new Long(0L);
      Constant constant0 = new Constant(long0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, (Expression) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("jBfeVJ!8wzF=I<2?*k", (Expression) coreOperationDivide0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory; Class 'org/apache/commons/jxpath/ri/model/dynabeans.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction((QName) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
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
  public void test34()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
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

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContextReferenceImpl.allocateConditionally("0M8EM`x:%ZYWgX", "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      QName qName0 = new QName("\"[\"");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"[\"
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      Object object0 = new Object();
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
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
      Expression[] expressionArray0 = new Expression[7];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      jXPathContextReferenceImpl0.removeAll("}V gS8#H/b,gDN", (Expression) expressionPath0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Long long0 = new Long((-336L));
      Constant constant0 = new Constant(long0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, constant0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removeAll("LIif", (Expression) constant0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath LIif; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("Cannot set value for xpath: ");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[0], constant0);
      expressionArray0[1] = (Expression) coreOperationGreaterThan0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationEqual0);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContextReferenceImpl0.getPointer((String) null, (Expression) coreOperationNegate0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Object object1 = jXPathContextReferenceImpl0.getValue("", (Expression) coreOperationOr0);
      assertEquals(false, object1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      NullPointer nullPointer0 = (NullPointer)jXPathContextReferenceImpl0.getContextPointer();
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      NamespaceResolver namespaceResolver0 = jXPathContextReferenceImpl0.getNamespaceResolver();
      assertTrue(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      jXPathContextReferenceImpl0.setNamespaceContextPointer(variablePointer0);
      assertTrue(variablePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "Cannot create path:");
      jXPathContext0.setNamespaceContextPointer((Pointer) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      jXPathContextReferenceImpl0.getAbsoluteRootContext();
      jXPathContextReferenceImpl0.registerNamespace("t", "t");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      jXPathContext0.registerNamespace("vP~,-SM", "zyDb?3t");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      SoftReference<Object> softReference0 = new SoftReference<Object>(jXPathContext0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, softReference0);
      QName qName0 = new QName("");
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getFunction(qName0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      QName qName0 = new QName("zTL+>");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) softReference0);
      jXPathContextReferenceImpl0.removeAll("/f");
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SoftReference<Object> softReference0 = new SoftReference<Object>((Object) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) softReference0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("\"self::\"");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath \"self::\"; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant((Number) null);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      expressionArray0[7] = (Expression) coreOperationNegate0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, (Step[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removePath("Invalid expression type. '", expressionArray0[7]);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath Invalid expression type. '; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      SoftReference<Object> softReference0 = new SoftReference<Object>(jXPathContext0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", (Object) softReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory; Cannot set property: /org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      Constant constant0 = new Constant("");
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("", (Expression) constant0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath ; Cannot set value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory", "~6");
      VariableReference variableReference0 = new VariableReference(qName0);
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory", (Expression) variableReference0, (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory; Cannot set undefined variable: org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory:~6
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationEqual0, coreOperationUnion0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPath("]Q{rFo`ZKqP}ZL&", (Expression) coreOperationLessThan0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ]Q{rFo`ZKqP}ZL&; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName((String) null, "\"child::\"");
      VariableReference variableReference0 = new VariableReference(qName0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getPointer("qwQ`", (Expression) variableReference0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: qwQ`
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BeanPointer beanPointer0 = (BeanPointer)jXPathContext0.getPointer("\"local-name\"");
      assertTrue(beanPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant((Number) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, (Step[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionPath0);
      Class<Object> class0 = Object.class;
      Boolean boolean0 = (Boolean)jXPathContextReferenceImpl0.getValue(".+=5E$ynO5>=n#*:O2Y", (Expression) coreOperationLessThan0, (Class) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object object0 = new Object();
      QName qName0 = new QName("", "child::");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      Class<ExpressionPath> class0 = ExpressionPath.class;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("", (Expression) variableReference0, (Class) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(890, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      Object object0 = jXPathContextReferenceImpl0.getValue("$PUdz^/P!:#|cSk", expressionArray0[0]);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Iterator iterator0 = jXPathContext0.iteratePointers("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      Iterator iterator1 = jXPathContext0.iterate("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertFalse(iterator1.equals((Object)iterator0));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "k>AAHfr1aG}ej");
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("k>AAHfr1aG}ej");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'k>AAHfr1aG}ej'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      String string0 = jXPathContext0.getPrefix("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("D");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath D; Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      String string0 = jXPathContextReferenceImpl0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.getValue("org.w3c.dom.Node");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.removeAll("\"");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '\\\"'. Invalid symbol '\\\"' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, (Step[]) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath(".+=5E$ynO5>=n#*:O2Y");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '.+=5E$ynO5>=n#*:O2Y'. Syntax error after: '.+'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      QName qName0 = new QName("org.w3c.dom.Node");
      NodePointer nodePointer0 = jXPathContextReferenceImpl0.getVariablePointer(qName0);
      assertFalse(nodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0, (Pointer) null);
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.createPathAndSetValue("<<unknown namespace>>", (Expression) coreOperationOr0, (Object) coreOperationOr0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath <<unknown namespace>>; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0);
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("org.w3c.dom.Node", (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath org.w3c.dom.Node; Cannot set property /org.w3c.dom.Node, path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null);
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.iterate((String) null, (Expression) locationPath0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
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
  public void test76()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[3];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("", (Object) expressionPath0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.compilePath("qU$9,(BQ&Gp.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'qU$9,(BQ&Gp.'. Syntax error after: 'q'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      NullPointer nullPointer0 = (NullPointer)jXPathContext0.getNamespaceContextPointer();
      assertTrue(nullPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate("<<unknown namespace>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '<<unknown namespace>>'. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Constant constant0 = new Constant("#INWCy1~Loy9_j@");
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) expressionPath0);
      Iterator iterator0 = jXPathContextReferenceImpl0.iteratePointers("S[q7v7!Zky2+-", (Expression) expressionPath0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Constant constant0 = new Constant("#INWCy1~Loy9_j@");
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers("yy<?Ob}ig$;|\"t3n");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'yy<?Ob}ig$;|\\\"t3n'. Invalid symbol '?' after: 'yy<'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }
}
