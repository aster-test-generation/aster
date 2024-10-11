
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SimplePathInterpreter;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SimplePathInterpreter_ESTest extends SimplePathInterpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, true, true);
      DescendantContext descendantContext0 = new DescendantContext(childContext0, true, processingInstructionTest0);
      QName qName0 = new QName("H*uNV{", "");
      NullPointer nullPointer0 = new NullPointer(qName0, (Locale) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("H*uNV{");
      expressionArray0[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], expressionArray0[0]);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[2];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(descendantContext0, propertyPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("Cannot set property ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      Object object0 = new Object();
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[8];
      Expression[] expressionArray1 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray1).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, nodePointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Step[] stepArray0 = new Step[2];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, (NodePointer) null, stepArray0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) parentContext0);
      Object object0 = new Object();
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, object0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(29, 29, (-2), Integer.MIN_VALUE, 29).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      NodePointer nodePointer1 = SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, nodePointer0, stepArray0);
      assertEquals(0, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2341));
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(attributeContext0, nodeTypeTest0);
      parentContext0.getCurrentNodePointer();
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[3];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-373), 3448, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(attributeContext0, nullPointer0, expressionArray0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "Fy!'9Pvy,Xo<AnC~");
      NamespaceContext namespaceContext0 = new NamespaceContext(evalContext0, nodeNameTest0);
      RootContext rootContext1 = namespaceContext0.getRootContext();
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(1000, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      rootContext1.toString();
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext1, (NodePointer) null, stepArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "Fy!'9Pvy,Xo<AnC~");
      NamespaceContext namespaceContext0 = new NamespaceContext(evalContext0, nodeNameTest0);
      RootContext rootContext1 = namespaceContext0.getRootContext();
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("Fy!'9Pvy,Xo<AnC~");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationMultiply0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(3163, 0).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext1, (NodePointer) null, stepArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) parentContext0);
      Object object0 = new Object();
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, object0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[5];
      Constant constant0 = new Constant("xml");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationGreaterThan0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], coreOperationEqual0);
      expressionArray0[2] = (Expression) coreOperationLessThan0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      expressionArray0[3] = (Expression) extensionFunction0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(3045).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, nodePointer0, stepArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = Locale.UK;
      locale0.getExtensionKeys();
      NullPointer nullPointer0 = new NullPointer(locale0, "u@z1j'>pY");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, object0, nullPointer0);
      jXPathContextReferenceImpl0.setLenient(true);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      Step[] stepArray0 = new Step[9];
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Constant constant0 = new Constant("");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationUnion0, constant0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(988, 988).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(rootContext0, nullPointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationMod0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      Step[] stepArray0 = new Step[4];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath((EvalContext) null, (NodePointer) null, expressionArray0, stepArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant((Number) null);
      expressionArray0[0] = (Expression) constant0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn((-4002)).when(step0).getAxis();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext0, (NodePointer) null, stepArray0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Predicate value is null: 'null'
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(34).when(step0).getAxis();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext0, (NodePointer) null, stepArray0, 0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("+{=", "org.apache.commons.jxpath.ri.compiler.Step");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Step[] stepArray0 = new Step[7];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer((EvalContext) null, variablePointer0, stepArray0, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '+{=:org.apache.commons.jxpath.ri.compiler.Step'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3585);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(1000, expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expressionArray0[0], expressionArray0[1]);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAnd0, coreOperationDivide0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationLessThan0, coreFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      PredicateContext predicateContext0 = new PredicateContext(attributeContext0, nameAttributeTest0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      QName qName0 = new QName("<<unknown namespace>>", "");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(beanPropertyPointer0, qName0, coreOperationLessThan0);
      Step[] stepArray0 = new Step[2];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(predicateContext0, nodePointer0, stepArray0, 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[2];
      Float float0 = new Float((float) 6);
      Constant constant0 = new Constant(float0);
      Constant constant1 = new Constant("Fy!'9Pvy,Xo<AnC~");
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant1);
      expressionArray0[0] = (Expression) coreOperationMod0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(step0).getAxis();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext0, (NodePointer) null, stepArray0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(step0).getAxis();
      doReturn((NodeTest) null).when(step0).getNodeTest();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(rootContext0, (NodePointer) null, stepArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) parentContext0);
      Object object0 = new Object();
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, object0);
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      NodePointer nodePointer1 = SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, nodePointer0, stepArray0);
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) parentContext0);
      Object object0 = new Object();
      variablePointer0.createPath(jXPathContext0, object0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn(expressionArray0).when(step0).getPredicates();
      stepArray0[4] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.createNullPointer(parentContext0, variablePointer0, stepArray0, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("=kcJ/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "=kcJ/");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(namespaceContext0, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext(attributeContext0, evalContextArray0);
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      Step[] stepArray0 = new Step[5];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(unionContext0, (NodePointer) null, expressionArray0, stepArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("", "avxr(c)H=~F!<3(");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NamespaceContext namespaceContext0 = new NamespaceContext(evalContext0, (NodeTest) null);
      RootContext rootContext0 = namespaceContext0.getRootContext();
      Expression[] expressionArray0 = new Expression[1];
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[3];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleExpressionPath(rootContext0, nodePointer0, expressionArray0, stepArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :avxr(c)H=~F!<3(
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) parentContext0);
      Object object0 = new Object();
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, object0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(step0).getAxis();
      doReturn(nodeNameTest0).when(step0).getNodeTest();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, nodePointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      EvalContext evalContext0 = rootContext0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(2209, 2209, 2209, 2209, 2209).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      BeanPointer beanPointer0 = (BeanPointer)evalContext0.getContextNodePointer();
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      BeanPointer beanPointer1 = (BeanPointer)SimplePathInterpreter.interpretSimpleLocationPath(evalContext0, beanPointer0, stepArray0);
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("name");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath name; No pointer for xpath: name
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, false, (NodeTest) null);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "Exception trying to create xpath ");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, (JXPathBeanInfo) null);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath(ancestorContext0, beanPointer0, expressionArray0, stepArray0);
      assertFalse(nodePointer0.isCollection());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) parentContext0);
      Object object0 = new Object();
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, object0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray0 = new Expression[6];
      Constant constant0 = new Constant("qSf$PD A4'n3Fl3S");
      expressionArray0[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(Integer.MIN_VALUE).when(step0).getAxis();
      doReturn((Object) expressionArray0, (Object) expressionArray0).when(step0).getPredicates();
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, nodePointer0, stepArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SimplePathInterpreter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ParentContext parentContext0 = new ParentContext(nodeSetContext0, nodeNameTest0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Step[] stepArray0 = new Step[7];
      // Undeclared exception!
      try { 
        SimplePathInterpreter.interpretSimpleLocationPath(parentContext0, variablePointer0, stepArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimplePathInterpreter simplePathInterpreter0 = new SimplePathInterpreter();
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, simplePathInterpreter0, (Pointer) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      Step[] stepArray0 = new Step[5];
      Expression[] expressionArray0 = new Expression[0];
      NodePointer nodePointer0 = SimplePathInterpreter.interpretSimpleExpressionPath(rootContext0, (NodePointer) null, expressionArray0, stepArray0);
      assertNull(nodePointer0);
  }
}
