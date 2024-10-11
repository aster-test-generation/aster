
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
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InfoSetUtil_ESTest extends InfoSetUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Boolean boolean0 = new Boolean("D@=AD8u$m");
      double double0 = InfoSetUtil.doubleValue(boolean0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("true", "D@=AD8u$m");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      EvalContext[] evalContextArray0 = new EvalContext[6];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[6];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, false);
      InfoSetUtil.number(precedingOrFollowingContext0);
      // Undeclared exception!
      try { 
        InfoSetUtil.stringValue(precedingOrFollowingContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("java.lang.Object@2f9ce21");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      DescendantContext descendantContext0 = new DescendantContext(rootContext0, true, nodeTypeTest0);
      evalContextArray0[0] = (EvalContext) descendantContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(childContext0, basicNodeSet0);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext(nodeSetContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, false);
      InfoSetUtil.stringValue(precedingOrFollowingContext0);
      // Undeclared exception!
      try { 
        InfoSetUtil.number(precedingOrFollowingContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      SelfContext selfContext0 = new SelfContext(rootContext0, (NodeTest) null);
      EvalContext[] evalContextArray0 = new EvalContext[4];
      evalContextArray0[0] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(selfContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-990));
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, true, false);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(childContext0, nodeTypeTest0, false);
      AncestorContext ancestorContext0 = new AncestorContext(precedingOrFollowingContext0, false, nodeTypeTest0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, object0);
      QName qName0 = new QName("", "w2[?#:3*");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      EvalContext evalContext0 = rootContext0.getConstantContext((Object) null);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, (NodeTest) null);
      evalContextArray0[0] = (EvalContext) descendantContext0;
      evalContextArray0[1] = (EvalContext) rootContext0;
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, false);
      InfoSetUtil.number(precedingOrFollowingContext0);
      EvalContext[] evalContextArray1 = new EvalContext[8];
      evalContextArray1[0] = (EvalContext) precedingOrFollowingContext0;
      UnionContext unionContext1 = new UnionContext((EvalContext) null, evalContextArray1);
      // Undeclared exception!
      try { 
        InfoSetUtil.booleanValue(unionContext1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      NodePointer nodePointer0 = unionContext0.getCurrentNodePointer();
      boolean boolean0 = InfoSetUtil.booleanValue(nodePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      NodePointer nodePointer0 = unionContext0.getCurrentNodePointer();
      double double0 = InfoSetUtil.doubleValue(nodePointer0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = InfoSetUtil.doubleValue("");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = InfoSetUtil.doubleValue("java.lang.Object@2f9ce21");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      NodePointer nodePointer0 = unionContext0.getCurrentNodePointer();
      Number number0 = InfoSetUtil.number(nodePointer0);
      assertEquals(Double.NaN, number0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Number number0 = InfoSetUtil.number("java.lang.Object@7b6b4f2a");
      assertEquals(Double.NaN, number0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      String string0 = InfoSetUtil.stringValue(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      NodePointer nodePointer0 = unionContext0.getCurrentNodePointer();
      String string0 = InfoSetUtil.stringValue(nodePointer0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = InfoSetUtil.stringValue((Object) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = InfoSetUtil.booleanValue(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = InfoSetUtil.booleanValue("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      EvalContext[] evalContextArray0 = new EvalContext[5];
      evalContextArray0[0] = evalContext0;
      evalContextArray0[1] = evalContext0;
      evalContextArray0[2] = evalContext0;
      evalContextArray0[3] = evalContext0;
      evalContextArray0[4] = evalContext0;
      UnionContext unionContext0 = new UnionContext(evalContext0, evalContextArray0);
      InfoSetUtil.booleanValue(unionContext0);
      boolean boolean0 = InfoSetUtil.booleanValue(unionContext0);
      assertEquals(2, evalContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Boolean boolean0 = new Boolean("D@=AD8u$m");
      boolean boolean1 = InfoSetUtil.booleanValue(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Number number0 = InfoSetUtil.number(boolean0);
      boolean boolean1 = InfoSetUtil.booleanValue(number0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = InfoSetUtil.number(object0);
      boolean boolean0 = InfoSetUtil.booleanValue(number0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      double double0 = InfoSetUtil.doubleValue(unionContext0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      double double0 = InfoSetUtil.doubleValue(evalContext0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      double double0 = InfoSetUtil.doubleValue(object0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      double double0 = InfoSetUtil.doubleValue(boolean0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      QName qName0 = new QName("java.lang.Object@53dda8ed", "java.lang.Object@53dda8ed");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(nameAttributeTest0, nameAttributeTest0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationMultiply0, nameAttributeTest0);
      UnionContext unionContext0 = new UnionContext(evalContextArray0[0], evalContextArray0);
      // Undeclared exception!
      try { 
        jXPathContextReferenceImpl0.setValue("java.lang.Object@53dda8ed", (Expression) coreOperationSubtract0, (Object) unionContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath java.lang.Object@53dda8ed; Cannot set value for xpath: java.lang.Object@53dda8ed
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(selfContext0, nodeNameTest0, false);
      InfoSetUtil.number(precedingOrFollowingContext0);
      // Undeclared exception!
      try { 
        InfoSetUtil.doubleValue(precedingOrFollowingContext0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Number number0 = InfoSetUtil.number(evalContext0);
      assertEquals(Double.NaN, number0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("D@=AD8u$m");
      Number number0 = InfoSetUtil.number(boolean0);
      boolean boolean1 = InfoSetUtil.booleanValue(number0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = InfoSetUtil.number(object0);
      Number number1 = InfoSetUtil.number(number0);
      assertEquals(Double.NaN, number1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("D@=AD8u$m");
      String string0 = InfoSetUtil.stringValue(boolean0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      String string0 = InfoSetUtil.stringValue(boolean0);
      assertEquals("true", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Number number0 = InfoSetUtil.number(boolean0);
      String string0 = InfoSetUtil.stringValue(number0);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = InfoSetUtil.stringValue("NaN");
      assertEquals("NaN", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      Number number0 = InfoSetUtil.number(object0);
      String string0 = InfoSetUtil.stringValue(number0);
      assertEquals("NaN", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InfoSetUtil infoSetUtil0 = new InfoSetUtil();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, infoSetUtil0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      String string0 = InfoSetUtil.stringValue(evalContext0);
      assertNotNull(string0);
  }
}
