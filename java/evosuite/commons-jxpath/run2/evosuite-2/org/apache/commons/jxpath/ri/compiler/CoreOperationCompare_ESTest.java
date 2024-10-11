
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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreOperationCompare_ESTest extends CoreOperationCompare_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant constant0 = new Constant(6);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, coreOperationDivide0);
      Object object0 = nameAttributeTest0.compute((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      QName qName0 = new QName("PjG-m", "PjG-m");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "PjG-m");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      ChildContext childContext0 = new ChildContext(precedingOrFollowingContext0, nodeNameTest0, false, false);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext(childContext0, evalContextArray0);
      boolean boolean0 = coreOperationEqual0.equal(unionContext0, constant0, constant0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, expressionArray0[6]);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("\"P.o{i");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, expressionArray0[4]);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2617));
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.findMatch(iterator0, selfContext0);
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
      Constant constant0 = new Constant(">YY1OVru5MGo");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      Iterator iterator0 = constant0.iterate((EvalContext) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationLessThanOrEqual0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThanOrEqual0, coreOperationSubtract0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.findMatch(iterator0, (Iterator) null);
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
      QName qName0 = new QName("%UaeU|%Zn,67^POHv;", "5EC");
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationAdd0, coreOperationAdd0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMultiply0, coreOperationMultiply0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(extensionFunction0, coreOperationMultiply0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal(selfContext0, coreOperationAdd0, coreOperationDivide0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[9];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal((EvalContext) null, coreOperationEqual0, coreFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("')");
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("')");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNotEqual0, coreOperationNotEqual0);
      coreOperationNotEqual0.args = expressionArray0;
      Boolean boolean0 = new Boolean(false);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, (boolean) boolean0, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, (boolean) boolean0, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(descendantContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.equal(attributeContext0, constant0, coreOperationMod0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, expressionArray0[6]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("\"P.o{i");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, expressionArray0[4]);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2617));
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.contains(selfContext0, (Object) null);
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
      Short short0 = new Short((short)10);
      Constant constant0 = new Constant(short0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Object object0 = nameAttributeTest0.computeValue((EvalContext) null);
      // Undeclared exception!
      try { 
        nameAttributeTest0.contains((Iterator) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(extensionFunction0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationDivide0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.computeValue((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double(0.0);
      Constant constant0 = new Constant(double0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      coreOperationNotEqual0.args = expressionArray0;
      // Undeclared exception!
      try { 
        coreOperationNotEqual0.computeValue((EvalContext) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Long long0 = new Long(2273L);
      Constant constant0 = new Constant(long0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, constant0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(selfContext0, long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAdd0, coreOperationAdd0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationEqual0, coreOperationOr0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, coreOperationOr0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("g.aQcU8l#s2,,#~WQ=R");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.iteratePointers(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("')");
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("')");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNotEqual0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], extensionFunction0);
      boolean boolean0 = nameAttributeTest0.equal("(org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual@0000000003) mod (org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual@0000000003)", expressionArray0[0]);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      boolean boolean0 = nameAttributeTest0.equal((Object) null, coreOperationGreaterThanOrEqual0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, locationPath0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2617));
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        nameAttributeTest0.equal(selfContext0, "");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Long long0 = new Long(2273L);
      Constant constant0 = new Constant(long0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, constant0);
      Object object0 = nameAttributeTest0.compute((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Object object0 = new Object();
      boolean boolean0 = nameAttributeTest0.equal(double0, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAnd0, coreOperationAnd0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNotEqual0, coreOperationAnd0);
      Object object0 = nameAttributeTest0.computeValue((EvalContext) null);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, coreOperationEqual0);
      Object object0 = nameAttributeTest0.computeValue((EvalContext) null);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, expressionArray0[6]);
      QName qName0 = new QName("\"P.o{i");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, expressionArray0[4]);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = coreOperationNotEqual0.equal(nodeTypeTest0, nodePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      LinkedList<SelfContext> linkedList0 = new LinkedList<SelfContext>();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeTypeTest0);
      linkedList0.add(selfContext0);
      Iterator<SelfContext> iterator0 = linkedList0.iterator();
      boolean boolean0 = nameAttributeTest0.findMatch(iterator0, iterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[4] = (Expression) nameAttributeTest0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationOr0, expressionArray0[6]);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, expressionArray0[4]);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, nameAttributeTest0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      boolean boolean0 = coreOperationNotEqual0.contains(evalContext0, jXPathContextReferenceImpl0);
      assertEquals(1, evalContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      QName qName0 = new QName("PjG-m", "PjG-m");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "PjG-m");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      ChildContext childContext0 = new ChildContext(precedingOrFollowingContext0, nodeNameTest0, true, false);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, childContext0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      boolean boolean0 = coreOperationEqual0.contains(evalContext0, constant0);
      assertEquals(2, evalContext0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("id");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(variableReference0, variableReference0);
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      Locale locale0 = Locale.CANADA_FRENCH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "id", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Boolean boolean0 = (Boolean)coreOperationNotEqual0.computeValue(rootContext0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Constant constant0 = new Constant((String) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      Object object0 = coreOperationEqual0.compute((EvalContext) null);
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreOperationEqual0.equal(object0, selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("')");
      Constant constant0 = new Constant("')");
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationNotEqual0, coreOperationNotEqual0);
      Boolean boolean0 = new Boolean(false);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, (boolean) boolean0, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(ancestorContext0, (boolean) boolean0, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(descendantContext0, nodeNameTest0);
      boolean boolean1 = coreOperationNotEqual0.equal(attributeContext0, constant0, coreOperationMod0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Long long0 = new Long(3L);
      Constant constant0 = new Constant(long0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      int int0 = coreOperationNotEqual0.getPrecedence();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
      boolean boolean0 = coreOperationEqual0.isSymmetric();
      assertTrue(boolean0);
  }
}
