
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
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationCompare_ESTest extends CoreOperationCompare_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Short short0 = new Short((short)1);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Expression[] expressionArray0 = new Expression[24];
      boolean boolean0 = nameAttributeTest0.equal(expressionArray0[2], short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("-)EM3h.XXQ");
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nameAttributeTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.findMatch(rootContext0, rootContext0);
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
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch((Iterator) null, (Iterator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VariableReference variableReference0 = new VariableReference((QName) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, variableReference0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("m!E f]Y}!");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal(attributeContext0, variableReference0, variableReference0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal(rootContext0, "_4Qpr*");
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
      Short short0 = new Short((short)1);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((short)1);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, constant0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      evalContextArray0[7] = (EvalContext) descendantContext0;
      UnionContext unionContext0 = new UnionContext(predicateContext0, evalContextArray0);
      Object object0 = nameAttributeTest0.compute(unionContext0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, nameAttributeTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal(evalContextArray0[7], object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Constant constant0 = new Constant(6);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(6);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.contains(rootContext0, selfContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.contains((Iterator) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, expressionArray0[5]);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2044));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.computeValue(selfContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, coreOperationUnion0);
      QName qName0 = new QName("Factory did not assign a collection to variable '");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.computeValue(ancestorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationUnion0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      nameAttributeTest0.args = expressionArray0;
      // Undeclared exception!
      try { 
        nameAttributeTest0.computeValue(rootContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant constant0 = new Constant(6);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, constant0);
      boolean boolean0 = coreOperationNotEqual0.equal("6", constant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationUnion0);
      boolean boolean0 = nameAttributeTest0.equal((Object) null, coreOperationUnion0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant constant0 = new Constant("oC");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, coreOperationEqual0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, nameAttributeTest0);
      boolean boolean0 = coreOperationNotEqual0.equal((Object) null, "oC");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      Object object0 = coreOperationEqual0.computeValue((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Short short0 = new Short((short)1);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, (NodeTest) null);
      Iterator iterator0 = constant0.iterate(ancestorContext0);
      boolean boolean0 = nameAttributeTest0.contains(iterator0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Short short0 = new Short((short)1);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      boolean boolean0 = nameAttributeTest0.equal(nameAttributeTest0, short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Short short0 = new Short((short)1);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      expressionArray0[2] = (Expression) constant0;
      expressionArray0[3] = (Expression) nameAttributeTest0;
      expressionArray0[4] = (Expression) nameAttributeTest0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest1 = new NameAttributeTest(nameAttributeTest0, coreOperationAdd0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((short)1);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, expressionArray0[3]);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext(predicateContext0, evalContextArray0);
      Object object0 = nameAttributeTest1.compute(unionContext0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("-)EM3h.XXQ");
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nameAttributeTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      boolean boolean0 = nameAttributeTest0.findMatch(initialContext0, initialContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      QName qName0 = new QName("-)EM3h.XXQ");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nameAttributeTest0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      boolean boolean0 = nameAttributeTest0.contains(evalContext0, nodePointer0);
      assertEquals(1, evalContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationUnion0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Object object0 = nameAttributeTest0.computeValue(rootContext0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationUnion0);
      Constant constant0 = new Constant("_v4Qpr*");
      Locale locale0 = Locale.KOREAN;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn(locale0).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, rootContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      boolean boolean0 = nameAttributeTest0.equal(evalContext0, coreOperationUnion0, constant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Short short0 = new Short((short)1);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((short)1);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, nameAttributeTest0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext(predicateContext0, evalContextArray0);
      Object object0 = nameAttributeTest0.compute(unionContext0);
      assertEquals(true, object0);
      
      boolean boolean0 = nameAttributeTest0.equal(evalContextArray0[4], object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      int int0 = nameAttributeTest0.getPrecedence();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Constant constant0 = new Constant("oC");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, (Expression) null);
      boolean boolean0 = coreOperationEqual0.isSymmetric();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Constant constant0 = new Constant("");
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, coreOperationGreaterThan0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThan0, constant0);
      boolean boolean0 = nameAttributeTest0.equal((EvalContext) null, coreOperationNotEqual0, coreOperationNotEqual0);
      assertTrue(boolean0);
  }
}
