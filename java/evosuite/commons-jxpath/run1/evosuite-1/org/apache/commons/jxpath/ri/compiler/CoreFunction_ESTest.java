
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
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
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
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
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
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreFunction_ESTest extends CoreFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(849, (Expression[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(849);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeTypeTest0);
      ChildContext childContext0 = new ChildContext(ancestorContext0, nodeTypeTest0, true, true);
      DescendantContext descendantContext0 = new DescendantContext(childContext0, true, nodeTypeTest0);
      coreFunction0.functionPosition(descendantContext0);
      assertEquals(849, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(1524, expressionArray0);
      coreFunction0.functionNumber((EvalContext) null);
      assertEquals(1524, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(93, expressionArray0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      coreFunction0.functionTrue(unionContext0);
      assertEquals(93, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("zN2D-");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      AttributeContext attributeContext0 = new AttributeContext(parentContext0, processingInstructionTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(attributeContext0, processingInstructionTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(namespaceContext0, processingInstructionTest0, false);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName(precedingOrFollowingContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(30, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2089), (Expression[]) null);
      coreFunction0.functionFalse((EvalContext) null);
      assertEquals((-2089), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2, (Expression[]) null);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction((-2000), expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals((-2000), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.getArg3();
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      expressionArray0[2] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(3425, expressionArray0);
      Expression expression0 = coreFunction0.getArg3();
      assertEquals(3425, coreFunction0.getFunctionCode());
      assertNotNull(expression0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(118, expressionArray0);
      coreFunction0.getArg2();
      assertEquals(118, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("q ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], extensionFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual((Expression) null, coreOperationMod0);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Expression expression0 = coreFunction0.getArg2();
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(expression0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationAdd0, coreOperationAdd0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationGreaterThan0, coreOperationGreaterThan0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.getArg1();
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("8EtZ1),,ndF");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.functionString((EvalContext) null);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(41, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.model.VariablePointerFactory");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      coreFunction0.functionNull(namespaceContext0);
      assertEquals(41, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      coreFunction0.compute((EvalContext) null);
      assertEquals((-1), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationUnion0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      expressionArray0[6] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(890, expressionArray0);
      // Undeclared exception!
      coreFunction0.toString();
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[7];
      Step step0 = new Step(0, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[5] = (Expression) coreOperationOr0;
      CoreFunction coreFunction0 = new CoreFunction(890, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.getArg3();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.getArg2();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-849), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.getArg1();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(32, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.getArg1();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[5] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(1443, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionTranslate((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-1576), expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("org.apache.commons.jxpath.PackageFunctions", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1576()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      QName qName0 = new QName("h$?1>wHKn{y+5O;(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      CoreFunction coreFunction0 = new CoreFunction((-4086), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(9, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[6] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      coreFunction0.functionSum(initialContext0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(25, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("sc7^bep}>y|JHvt", "sc7^bep}>y|JHvt");
      Expression[] expressionArray1 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray1);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray1, stepArray0);
      expressionArray1[0] = (Expression) expressionPath0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray1);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-1051), expressionArray0);
      // Undeclared exception!
      coreFunction0.functionSubstringBefore((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(93, expressionArray0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringAfter(unionContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction93()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationOr0;
      CoreFunction coreFunction0 = new CoreFunction((-2241), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringAfter((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("No value for xpath: ", "No value for xpath: ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-929), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      ChildContext childContext0 = new ChildContext(nodeSetContext0, nodeTypeTest0, true, true);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("]`brU;V1FBd+r/</j");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(15, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("string-length", "string-length");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreFunction coreFunction0 = new CoreFunction((-1089), expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variableReference0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        coreFunction0.functionString(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1089()(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      coreOperationNotEqual0.args = expressionArray0;
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-670), expressionArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionString(parentContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("No value for xpath: ", "No value for xpath: ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-929), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[15];
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("HY&");
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[2] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction((-2260), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      coreOperationNotEqual0.args = expressionArray0;
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      CoreFunction coreFunction0 = new CoreFunction((-670), expressionArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound(parentContext0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationOr0;
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      expressionArray0[1] = (Expression) expressionPath0;
      Constant constant0 = new Constant("");
      expressionArray0[2] = (Expression) constant0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationAnd0;
      CoreFunction coreFunction0 = new CoreFunction(1723, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionPosition((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Integer integer0 = new Integer(4096);
      Constant constant0 = new Constant(integer0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationLessThanOrEqual0, coreOperationAdd0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThanOrEqual0, coreOperationLessThanOrEqual0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationGreaterThanOrEqual0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreFunction coreFunction0 = new CoreFunction(4096, expressionArray0);
      QName qName0 = new QName("string", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "\"");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber(attributeContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-3291), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1116);
      Step step0 = new Step((-2869), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(1116, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("sYtiajM}=0r");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(24, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(24, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction((-1138), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, (NodeTest) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(namespaceContext0, (NodeTest) null, false);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      ParentContext parentContext0 = new ParentContext(unionContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace(parentContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1057));
      Step step0 = new Step((-582), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction((-1057), expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, expressionArray0[1]);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI(predicateContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Double double0 = new Double((-5242.9652));
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, coreOperationGreaterThan0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      Step step0 = new Step(10, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[2] = (Expression) locationPath0;
      expressionArray0[3] = (Expression) coreOperationGreaterThan0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, expressionArray0[0]);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      expressionArray0[4] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionLocalName((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1524, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction1524()(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("q ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast(attributeContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-852), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("+$#$>km:m9EOuvu");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[2] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(40, expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("substring-after");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(namespaceContext0, expressionArray0[1]);
      // Undeclared exception!
      coreFunction0.functionLang(predicateContext0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("substring-after");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang(namespaceContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      QName qName0 = new QName("}", "}");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-1488), expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, expressionArray0[5]);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang(rootContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-6176), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationAnd0, coreOperationAnd0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      expressionArray0[2] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(3425, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionFloor((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-1730), expressionArray0);
      QName qName0 = new QName("descendant-or-self");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1730()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1814, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(9, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[6] = (Expression) locationPath0;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[1]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      CoreFunction coreFunction0 = new CoreFunction(1601, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionCount(initialContext0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(2557, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCount((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("\u0007j'YzI`\"Z[ o:i|c");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: starts-with()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4025);
      Step step0 = new Step(5109, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(1219, expressionArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains(ancestorContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1258), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1258()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationUnion0, coreOperationUnion0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMod0, coreOperationMod0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      QName qName0 = new QName("normalize-space");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "number");
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(namespaceContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeTypeTest0);
      PredicateContext predicateContext0 = new PredicateContext(namespaceContext0, coreFunction0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling(predicateContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationAnd0;
      CoreFunction coreFunction0 = new CoreFunction((-187), expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-187));
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      ExtensionFunction extensionFunction0 = new ExtensionFunction((QName) null, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationLessThan0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction((-2418), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-65536), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(866, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, (NodeTest) null);
      coreFunction0.computeValue(ancestorContext0);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(30, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      String string0 = coreFunction0.toString();
      assertEquals("concat(null, null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(26, expressionArray0);
      String string0 = coreFunction0.toString();
      assertEquals("ceiling(null)", string0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2, (Expression[]) null);
      String string0 = coreFunction0.toString();
      assertEquals("position()", string0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction((-1057), expressionArray0);
      coreFunction0.getArgumentCount();
      assertEquals((-1057), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2899), (Expression[]) null);
      int int0 = coreFunction0.getArgumentCount();
      assertEquals((-2899), coreFunction0.getFunctionCode());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant((Number) null);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(26, expressionArray0);
      Object object0 = coreFunction0.functionCeiling((EvalContext) null);
      assertEquals(0.0, object0);
      assertEquals(26, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("dDxEx");
      CoreFunction coreFunction0 = new CoreFunction((-6187), expressionArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      Object object0 = coreFunction0.functionFloor(descendantContext0);
      assertEquals(0.0, object0);
      assertEquals((-6187), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant((Number) null);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(26, expressionArray0);
      Object object0 = coreFunction0.functionSum((EvalContext) null);
      assertEquals(0.0, object0);
      assertEquals(26, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("8EtZ1),,ndF");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      QName qName0 = new QName((String) null, "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum(parentContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid argument type for 'sum': java.lang.Boolean
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(866, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("LRbm", "LRbm");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber(rootContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'LRbm:LRbm'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreFunction coreFunction0 = new CoreFunction((-830), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-830()(null, null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction((-6187), expressionArray0);
      Object object0 = coreFunction0.functionBoolean((EvalContext) null);
      assertEquals(false, object0);
      assertEquals((-6187), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("substring-after");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, (NodeTest) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(namespaceContext0, (NodeTest) null, false);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      ParentContext parentContext0 = new ParentContext(unionContext0, (NodeTest) null);
      Object object0 = coreFunction0.functionNormalizeSpace(parentContext0);
      assertEquals(12, coreFunction0.getFunctionCode());
      assertEquals("NaN", object0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(3, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("normalize-space");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(expressionArray0[0], constant0);
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray0[2] = (Expression) constant0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      QName qName0 = new QName((String) null, "%)<v");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(selfContext0, true, nodeNameTest0);
      expressionArray0[3] = (Expression) coreOperationAnd0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Object object0 = coreFunction0.functionConcat(ancestorContext0);
      assertEquals("normalize-spacefalsenormalize-spacefalse", object0);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-576), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionString((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("8EtZ1),,ndF");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      QName qName0 = new QName((String) null, "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      coreFunction0.functionName(parentContext0);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-739), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionName((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(Integer.MIN_VALUE, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("substring-after");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, (NodeTest) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(namespaceContext0, (NodeTest) null, false);
      coreFunction0.functionNamespaceURI(precedingOrFollowingContext0);
      assertEquals(12, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("-vYPo=h#S4");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, constant0);
      expressionArray0[1] = (Expression) coreOperationLessThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Double double0 = Expression.ZERO;
      Constant constant0 = new Constant(double0);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(2557, expressionArray0);
      assertEquals(1, coreFunction0.getArgumentCount());
      
      Object object0 = coreFunction0.functionCount((EvalContext) null);
      assertEquals(2557, coreFunction0.getFunctionCode());
      assertEquals(1.0, object0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(29, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: key()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-before(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, (Step[]) null);
      // Undeclared exception!
      try { 
        expressionPath0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: concat()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      boolean boolean0 = coreFunction0.isContextDependent();
      assertEquals(0, coreFunction0.getFunctionCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[15];
      Long long0 = new Long((-2260));
      Constant constant0 = new Constant(long0);
      expressionArray0[0] = (Expression) constant0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      Step[] stepArray0 = new Step[4];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[2] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction((-2260), expressionArray0);
      boolean boolean0 = coreFunction0.isContextDependent();
      assertEquals((-2260), coreFunction0.getFunctionCode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((byte)29, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
      assertEquals(29, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((byte)29, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: key()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(27);
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring(parentContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: round(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(26, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: ceiling()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(25, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: floor(null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(24, expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("|?$#(9!L<r[`Wf");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: sum()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(22, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: lang()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(21, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: false(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(18, expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      QName qName0 = new QName("+w~oJ[/4+hU~2", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: boolean(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<4()P9Bs");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      CoreFunction coreFunction0 = new CoreFunction(17, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringBefore(selfContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: translate()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(15, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: string-length(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(13, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCount((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-after()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(12, expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, (NodeTest) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(namespaceContext0, (NodeTest) null, false);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith(unionContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring-before(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: starts-with(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(3, (Expression[]) null);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("count", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1, (Expression[]) null);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("last", string0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      EvalContext evalContext0 = null;
      CoreFunction coreFunction0 = new CoreFunction((-1015), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTrue(evalContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1015()(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionID(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.getArg1();
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(32, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.getArg2();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.getArg3();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(30, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction((-4137), expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreFunction0);
      QName qName0 = new QName("GKq qqqh0!?%)~#L");
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[0], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull(initialContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-4137()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }
}
