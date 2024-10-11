
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
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
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreFunction_ESTest extends CoreFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
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
  public void test001()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(64, expressionArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "org.apache.commons.jxpath.ri.axes.AttributeContext");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(namespaceContext0, coreFunction0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(predicateContext0, nodeNameTest0, false);
      coreFunction0.functionPosition(precedingOrFollowingContext0);
      assertEquals(64, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-999), expressionArray0);
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, (NodeSet) null);
      coreFunction0.functionTrue(nodeSetContext0);
      assertEquals((-999), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-2558), expressionArray0);
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
  public void test004()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionName(parentContext0);
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
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-3878), expressionArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, (NodeTest) null);
      ChildContext childContext0 = new ChildContext(ancestorContext0, (NodeTest) null, true, true);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(647, expressionArray0);
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
  public void test007()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(1996, expressionArray0);
      coreFunction0.functionFalse((EvalContext) null);
      assertEquals(1996, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(30, (Expression[]) null);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1617), expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals((-1617), int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(532, expressionArray0);
      coreFunction0.getArg3();
      assertEquals(532, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Constant constant0 = new Constant("");
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(constant0, expressionArray0[0]);
      expressionArray0[2] = (Expression) coreOperationDivide0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Expression expression0 = coreFunction0.getArg3();
      assertEquals(0, coreFunction0.getFunctionCode());
      assertNotNull(expression0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(4056, expressionArray0);
      coreFunction0.getArg2();
      assertEquals(4056, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("Invalid argument type for 'sum': ", "4W_ZV$[{R#JqD 6&");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[1] = (Expression) variableReference0;
      CoreFunction coreFunction0 = new CoreFunction(142, expressionArray0);
      Expression expression0 = coreFunction0.getArg2();
      assertEquals(142, coreFunction0.getFunctionCode());
      assertNotNull(expression0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(532, expressionArray0);
      coreFunction0.getArg1();
      assertEquals(532, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(3032, expressionArray0);
      coreFunction0.getArg1();
      assertEquals(3032, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-1762), expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NodeSet nodeSet0 = unionContext0.getNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, nodeSet0);
      coreFunction0.functionString(nodeSetContext0);
      assertEquals((-1762), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-4869), (Expression[]) null);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) coreFunction0);
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      coreFunction0.functionNull(rootContext0);
      assertEquals((-4869), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationMod coreOperationMod0 = new CoreOperationMod((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreFunction coreFunction0 = new CoreFunction(3851, expressionArray0);
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
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(40, expressionArray0);
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
  public void test020()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(3071, expressionArray0);
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
      CoreFunction coreFunction0 = new CoreFunction(25, (Expression[]) null);
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
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("floor", "ceiling");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-538), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTrue((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(32, (Expression[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(6054);
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(extensionFunction0, coreFunction0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNotEqual0, coreFunction0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, coreOperationGreaterThanOrEqual0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate(predicateContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction32()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("vLBRSQ!}", "vLBRSQ!}");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreFunction coreFunction0 = new CoreFunction(37, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[5] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-537), expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-537));
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, true);
      // Undeclared exception!
      coreFunction0.functionSum(precedingOrFollowingContext0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2674));
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum(descendantContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd");
      VariableReference variableReference0 = new VariableReference(qName0);
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.CoreOperationAdd");
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[0];
      stepArray0[5] = stepArray0[3];
      stepArray0[6] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      expressionArray0[3] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(946, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) expressionArray0[2]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.evalSteps(initialContext0);
      // Undeclared exception!
      coreFunction0.functionSubstringBefore(predicateContext0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("ALIH|A8N';JJ", "ALIH|A8N';JJ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringBefore((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-14), (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.axes.InitialContext");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringAfter(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-14()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(30, nodeNameTest0, expressionArray0);
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(4056, expressionArray0);
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
  public void test033()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-2558), expressionArray0);
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
  public void test034()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("QtfwH'T!D");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], variableReference0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(41, expressionArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "]=#o.)#ah,si]^2Q~QS");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith(namespaceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(949, expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound(unionContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
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
  public void test037()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
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
  public void test038()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[10];
      QName qName0 = new QName("FLI|*8N;Jt");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(24, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("1fC2>iZ\">9R i:");
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      CoreFunction coreFunction0 = new CoreFunction((-332), expressionArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber(descendantContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, expressionArray0[1]);
      CoreFunction coreFunction0 = new CoreFunction(1994, expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationEqual0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(predicateContext0, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "ZU^r0c&\"GQE'7O_");
      ParentContext parentContext0 = new ParentContext(unionContext0, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull(ancestorContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, true, true);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot(childContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationUnion0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationUnion0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationOr0;
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, stepArray0);
      expressionArray0[2] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionNormalizeSpace((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace(precedingOrFollowingContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, expressionArray0, (Step[]) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionPath0, expressionPath0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction(68, expressionArray0);
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
  public void test045()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("ALIH|A8N';JJ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionName((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, coreOperationAnd0);
      expressionArray0[1] = (Expression) coreOperationEqual0;
      QName qName0 = new QName("", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, expressionArray0[0]);
      expressionArray0[2] = (Expression) coreOperationMultiply0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAnd0, expressionArray0[0]);
      expressionArray0[3] = (Expression) coreOperationNotEqual0;
      expressionArray0[4] = (Expression) coreOperationAnd0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[3], expressionArray0[0]);
      expressionArray0[5] = (Expression) coreOperationSubtract0;
      Integer integer0 = new Integer(20);
      Constant constant0 = new Constant(integer0);
      expressionArray0[6] = (Expression) constant0;
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      expressionArray0[7] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(20, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionLocalName((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("$o*ydeq=n)mxyH{");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(extensionFunction0, extensionFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationEqual0, coreOperationEqual0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThanOrEqual0, coreOperationEqual0);
      expressionArray0[0] = (Expression) coreOperationMultiply0;
      CoreFunction coreFunction0 = new CoreFunction((-1), expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName(rootContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      RootContext rootContext0 = new RootContext((JXPathContextReferenceImpl) null, (NodePointer) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast(rootContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.RootContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1140);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(3266, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction3266()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1127), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1127()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      expressionArray0[1] = (Expression) expressionPath0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[2] = (Expression) locationPath0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationOr0;
      expressionArray0[4] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(1365, expressionArray0);
      // Undeclared exception!
      coreFunction0.functionID((EvalContext) null);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(1365, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionID((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(1024, expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("\"<\"");
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext(unionContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction1024()(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("string");
      QName qName0 = new QName("2E~hf7&DzFMH&");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, constant0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("2E~hf7&DzFMH&");
      SelfContext selfContext0 = new SelfContext(rootContext0, processingInstructionTest0);
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction((-1949), expressionArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, false);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse(precedingOrFollowingContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[6];
      Step step0 = new Step(827, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(781, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Double double0 = Expression.ONE;
      Constant constant0 = new Constant(double0);
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      QName qName0 = new QName((String) null, "unknownFunction");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreFunction coreFunction0 = new CoreFunction((-1942), expressionArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, true, true);
      AttributeContext attributeContext0 = new AttributeContext(childContext0, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(attributeContext0, extensionFunction0);
      SelfContext selfContext0 = new SelfContext(predicateContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling(selfContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-120), (Expression[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(496);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext(attributeContext0, true, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean(descendantContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-120()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("", "");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-2558), expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = mock(JXPathContextReferenceImpl.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(jXPathContextReferenceImpl0).getLocale();
      doReturn((NamespaceResolver) null, (NamespaceResolver) null).when(jXPathContextReferenceImpl0).getNamespaceResolver();
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Invalid XPath: '", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      JXPathContext jXPathContext0 = rootContext0.getJXPathContext();
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContext0, unionContext0, nodePointer0);
      EvalContext evalContext0 = jXPathContextReferenceImpl1.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean(evalContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationAnd0, coreOperationAnd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationNotEqual0, coreOperationNotEqual0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMultiply0, coreOperationNotEqual0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(1432, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(1024, expressionArray0);
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
  public void test066()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, (Expression) null);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], nameAttributeTest0);
      CoreFunction coreFunction0 = new CoreFunction(16, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(32);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      PredicateContext predicateContext0 = new PredicateContext(precedingOrFollowingContext0, coreOperationNotEqual0);
      AncestorContext ancestorContext0 = new AncestorContext(predicateContext0, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.compute(ancestorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.computeValue((EvalContext) null);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationOr0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, coreOperationOr0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationMod0);
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(predicateContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(3198, expressionArray0);
      String string0 = coreFunction0.toString();
      assertEquals("unknownFunction3198()(null, null, null, null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(150, expressionArray0);
      coreFunction0.getArgumentCount();
      assertEquals(150, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(32, (Expression[]) null);
      coreFunction0.getArgumentCount();
      assertEquals(32, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(41, expressionArray0);
      QName qName0 = new QName("wKN|C~2Rj)a2x");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "lSHbv");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeNameTest0);
      coreFunction0.functionNumber(attributeContext0);
      assertEquals(41, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-120), (Expression[]) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(496);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      DescendantContext descendantContext0 = new DescendantContext(attributeContext0, true, nodeTypeTest0);
      coreFunction0.functionStringLength(descendantContext0);
      assertEquals((-120), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction((-825), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-825()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(697, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionString((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction697()(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("string");
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      QName qName0 = new QName("2E~hf7&DzFMH&");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, constant0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      Object object0 = coreFunction0.functionLocalName(rootContext0);
      assertEquals(1, coreFunction0.getFunctionCode());
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("string");
      expressionArray0[0] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(14, expressionArray0);
      QName qName0 = new QName("2E~hf7&DzFMH&");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, constant0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      coreFunction0.functionNamespaceURI(rootContext0);
      assertEquals(14, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
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
  public void test079()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-4294), (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("l)=3<eq}]");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      Object object0 = coreFunction0.functionLast(namespaceContext0);
      assertEquals(1, namespaceContext0.getPosition());
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(18, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName(".-s1Kla0\"Ofx#b!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(4384, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(evalContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: boolean()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(17, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName(".-s1Kla0\"Ofx#b!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(4384, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(evalContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: translate()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(8, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(7, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-4294), (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
      assertEquals((-4294), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(30, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertEquals(30, coreFunction0.getFunctionCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(25, (Expression[]) null);
      boolean boolean0 = coreFunction0.isContextDependent();
      assertEquals(25, coreFunction0.getFunctionCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1, (Expression[]) null);
      boolean boolean0 = coreFunction0.isContextDependent();
      assertTrue(boolean0);
      assertEquals(1, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("vLBRSQ!}", "vLBRSQ!}");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, variableReference0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreFunction coreFunction0 = new CoreFunction(37, expressionArray0);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertEquals(37, coreFunction0.getFunctionCode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(17, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) coreFunction0;
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName(".-s1Kla0\"Ofx#b!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(4384, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      // Undeclared exception!
      try { 
        stepArray0[0].isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Step", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(30, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(30);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith(parentContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(29, (Expression[]) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "~hNR/_m<");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling(selfContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: key()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(26, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionCount((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: ceiling()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(25, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName(".-s1Kla0\"Ofx#b!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(4384, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(evalContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: floor()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[10];
      CoreFunction coreFunction0 = new CoreFunction(24, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: sum(null, null, null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(23, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: number()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(20, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: true(null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(19, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringBefore((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: not(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(18, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) coreFunction0;
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName(".-s1Kla0\"Ofx#b!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(4384, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      String string0 = stepArray0[0].toString();
      assertEquals("UNKNOWN::.-s1Kla0\"Ofx#b![boolean()][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, (Expression) null);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], nameAttributeTest0);
      CoreFunction coreFunction0 = new CoreFunction(16, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(32);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeTypeTest0, false);
      PredicateContext predicateContext0 = new PredicateContext(precedingOrFollowingContext0, coreOperationNotEqual0);
      AncestorContext ancestorContext0 = new AncestorContext(predicateContext0, false, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.compute(ancestorContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: normalize-space(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(12, (Expression[]) null);
      String string0 = coreFunction0.toString();
      assertEquals("substring-before()", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: starts-with()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: concat(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(8, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: string(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(4, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: id()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("count", string0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Constant constant0 = new Constant("string");
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      QName qName0 = new QName("2E~hf7&DzFMH&");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, constant0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction((-538), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTrue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-538()(null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-14), (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.axes.InitialContext");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionID(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-14()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction((-1736), expressionArray0);
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
  public void test112()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
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
  public void test113()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(3, (Expression[]) null);
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
  public void test114()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      VariableReference variableReference0 = new VariableReference((QName) null);
      CoreFunction coreFunction0 = new CoreFunction(1024, expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, variableReference0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse(predicateContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction1024()(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1935), expressionArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      coreFunction0.compute(selfContext0);
      assertEquals((-1935), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(variableReference0, expressionArray0[1]);
      CoreFunction coreFunction0 = new CoreFunction(1994, expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationEqual0);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(predicateContext0, evalContextArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "ZU^r0c&\"GQE'7O_");
      ParentContext parentContext0 = new ParentContext(unionContext0, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull(ancestorContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction1994()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }
}
