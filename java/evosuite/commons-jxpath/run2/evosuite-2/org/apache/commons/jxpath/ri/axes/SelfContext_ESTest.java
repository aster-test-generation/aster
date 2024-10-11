
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


package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SelfContext_ESTest extends SelfContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      selfContext0.reset();
      assertEquals(0, selfContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer((-982));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, integer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext("0YpH[|{17iD");
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      boolean boolean0 = selfContext0.nextNode();
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName(":I");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(initialContext0, nodeNameTest0, true);
      SelfContext selfContext0 = new SelfContext(precedingOrFollowingContext0, (NodeTest) null);
      Pointer pointer0 = selfContext0.getSingleNodePointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      BeanPointer beanPointer0 = (BeanPointer)selfContext0.getSingleNodePointer();
      assertEquals(1, beanPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = Integer.valueOf((-994));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("ancestor::", "ancestor::");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, integer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      SelfContext selfContext0 = new SelfContext(rootContext0, (NodeTest) null);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer((-1743));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("mc+=#KDToU69G|8nZKZ", "mc+=#KDToU69G|8nZKZ");
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "mc+=#KDToU69G|8nZKZ", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer((-982));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.axes.SelfContext");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, integer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext("0YpH[|{17iD");
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      selfContext0.next();
      selfContext0.getCurrentNodePointer();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SelfContext selfContext0 = new SelfContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        selfContext0.nextNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-23));
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(attributeContext0, nodeTypeTest0, false);
      ParentContext parentContext0 = new ParentContext(precedingOrFollowingContext0, nodeTypeTest0);
      SelfContext selfContext0 = new SelfContext(parentContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getSingleNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer((-1004));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("org.apache./ommons.jxpath.ri.axes.SelfContext", "0YpH[|{17iD");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext((Object) null);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      evalContextArray0[0] = (EvalContext) rootContext0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
      SelfContext selfContext0 = new SelfContext(unionContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
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
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2815));
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer((-1743));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("mc+=#KDToU69G|8nZKZ", "mc+=#KDToU69G|8nZKZ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "mc+=#KDToU69G|8nZKZ");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = new InitialContext(rootContext0);
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'mc+=#KDToU69G|8nZKZ:mc+=#KDToU69G|8nZKZ'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      UnionContext unionContext0 = new UnionContext(evalContext0, (EvalContext[]) null);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(evalContext0, nodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-646));
      nodeSetContext0.setPosition((-646));
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer((-1004));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("orgapahe.commns.jxpath.ri.axsPSelfContext");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, integer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext("0YpH[|{17iD");
      SelfContext selfContext0 = new SelfContext(initialContext0, (NodeTest) null);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer((-1743));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("mc+=#KDToU69G|8nZKZ", "mc+=#KDToU69G|8nZKZ");
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "mc+=#KDToU69G|8nZKZ", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(1);
      assertEquals(1, selfContext0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("a6L}@(bqPppnsEp<Q");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(attributeContext0, nodeNameTest0);
      selfContext0.nextNode();
      selfContext0.getContextNodeList();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(505);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        selfContext0.setPosition(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, (EvalContext[]) null);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, nodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(68);
      SelfContext selfContext0 = new SelfContext(nodeSetContext0, nodeTypeTest0);
      selfContext0.getContextNodeList();
      // Undeclared exception!
      try { 
        selfContext0.getCurrentNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      boolean boolean0 = selfContext0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
      assertEquals(0, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      QName qName0 = new QName("");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext(initialContext0, nodeNameTest0);
      selfContext0.getCurrentNodePointer();
      selfContext0.getContextNodeList();
      assertEquals(1, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer((-1743));
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("mc+=#KDToU69G|8nZKZ", "mc+=#KDToU69G|8nZKZ");
      Locale locale0 = Locale.JAPAN;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "mc+=#KDToU69G|8nZKZ", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "mc+=#KDToU69G|8nZKZ");
      SelfContext selfContext0 = new SelfContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        selfContext0.getSingleNodePointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }
}
