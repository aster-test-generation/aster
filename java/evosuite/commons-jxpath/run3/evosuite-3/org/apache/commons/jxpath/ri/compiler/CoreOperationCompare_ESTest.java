
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
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationCompare_ESTest extends CoreOperationCompare_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, coreOperationEqual0);
      boolean boolean0 = coreOperationNotEqual0.equal(double0, constant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant constant0 = new Constant("R2{cw6f=(s|v2");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, false, (NodeTest) null);
      Object object0 = nameAttributeTest0.computeValue(ancestorContext0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion((Expression[]) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationUnion0, coreOperationUnion0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationMod0, coreOperationUnion0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationMultiply0, coreOperationUnion0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        coreOperationEqual0.findMatch(rootContext0, rootContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Constant constant0 = new Constant("R2{cw6f=(s|v2");
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationGreaterThanOrEqual0, nameAttributeTest0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationSubtract0, nameAttributeTest0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      AncestorContext ancestorContext0 = new AncestorContext(nodeSetContext0, false, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch((Iterator) null, ancestorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Float float0 = new Float((-820.0));
      Constant constant0 = new Constant(float0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationEqual0, coreOperationEqual0);
      Expression[] expressionArray0 = new Expression[8];
      expressionArray0[0] = (Expression) coreOperationEqual0;
      expressionArray0[1] = (Expression) coreOperationNotEqual0;
      expressionArray0[2] = (Expression) coreOperationEqual0;
      expressionArray0[3] = (Expression) coreOperationEqual0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[4] = (Expression) coreOperationAdd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      // Undeclared exception!
      coreOperationNotEqual0.equal((EvalContext) null, coreOperationOr0, expressionArray0[4]);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(39, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreFunction0, coreFunction0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, (Expression) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      EvalContext[] evalContextArray0 = new EvalContext[1];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(unionContext0, coreOperationLessThan0, expressionArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Constant constant0 = new Constant("i4cHrLr?evn:");
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThanOrEqual0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, coreOperationMod0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, coreOperationMod0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(".=d'Z~AdQfT^");
      AncestorContext ancestorContext0 = new AncestorContext(unionContext0, true, processingInstructionTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(ancestorContext0, coreOperationNotEqual0, coreOperationGreaterThanOrEqual0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAdd0, coreOperationAdd0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.iterator();
      linkedList0.add((Object) coreOperationUnion0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.contains(iterator0, expressionArray0[0]);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.contains(rootContext0, qName0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationNotEqual0, coreOperationNotEqual0);
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
  public void test10()  throws Throwable  {
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare");
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeNameTest0);
      Expression[] expressionArray0 = new Expression[1];
      nameAttributeTest0.args = expressionArray0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(nameAttributeTest0, expressionArray0[0]);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.computeValue(namespaceContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreFunction coreFunction0 = new CoreFunction((-2626), expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[0], coreFunction0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.computeValue((EvalContext) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationUnion0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      boolean boolean0 = coreOperationNotEqual0.equal((Object) null, ((JXPathContextReferenceImpl) jXPathContext0).USE_SOFT_CACHE);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      Object object0 = new Object();
      boolean boolean0 = coreOperationNotEqual0.equal((Object) null, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant constant0 = new Constant("R2{cw6f=(s|v2");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      boolean boolean0 = nameAttributeTest0.equal((Object) null, "R2{cw6f=(s|v2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, coreOperationEqual0);
      boolean boolean0 = coreOperationNotEqual0.equal(double0, constant0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, coreOperationEqual0);
      LinkedList<SelfContext> linkedList0 = new LinkedList<SelfContext>();
      QName qName0 = new QName("xw#.1");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      linkedList0.add(selfContext0);
      ListIterator<SelfContext> listIterator0 = linkedList0.listIterator();
      boolean boolean0 = nameAttributeTest0.findMatch(listIterator0, listIterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      LinkedList<SelfContext> linkedList0 = new LinkedList<SelfContext>();
      QName qName0 = new QName("\"following-sibling::\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      linkedList0.add(selfContext0);
      ListIterator<SelfContext> listIterator0 = linkedList0.listIterator();
      boolean boolean0 = coreOperationEqual0.contains(listIterator0, (Object) null);
      assertTrue(listIterator0.hasPrevious());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Float float0 = new Float(0.0);
      Constant constant0 = new Constant(float0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Iterator iterator0 = nameAttributeTest0.iterate((EvalContext) null);
      boolean boolean0 = nameAttributeTest0.contains(iterator0, constant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreOperationUnion0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      Boolean boolean0 = (Boolean)coreOperationNotEqual0.compute(initialContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, coreOperationGreaterThan0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "=");
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, true);
      boolean boolean0 = coreOperationNotEqual0.equal(childContext0, nameAttributeTest0, coreOperationGreaterThan0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, coreOperationEqual0);
      int int0 = nameAttributeTest0.getPrecedence();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constant constant0 = new Constant("_t6 +");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      boolean boolean0 = coreOperationNotEqual0.isSymmetric();
      assertTrue(boolean0);
  }
}
