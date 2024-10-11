
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
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
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
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
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
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CoreFunction_ESTest extends CoreFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(330, (Expression[]) null);
      coreFunction0.functionTrue((EvalContext) null);
      assertEquals(330, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2629), (Expression[]) null);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      coreFunction0.functionPosition(parentContext0);
      assertEquals((-2629), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreFunction coreFunction0 = new CoreFunction((-1945), expressionArray0);
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step((-1945), processingInstructionTest0, coreOperationAdd0.args);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[1];
      stepArray0[4] = stepArray0[0];
      stepArray0[5] = stepArray0[0];
      stepArray0[6] = stepArray0[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(precedingOrFollowingContext0, basicNodeSet0);
      EvalContext[] evalContextArray0 = new EvalContext[9];
      UnionContext unionContext0 = new UnionContext(nodeSetContext0, evalContextArray0);
      ChildContext childContext0 = new ChildContext(unionContext0, processingInstructionTest0, true, true);
      EvalContext evalContext0 = expressionPath0.evalSteps(childContext0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1653, expressionArray0);
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
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, (Expression) null);
      CoreFunction coreFunction0 = new CoreFunction(308, expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationSubtract0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(predicateContext0, evalContextArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("sum");
      ChildContext childContext0 = new ChildContext(unionContext0, processingInstructionTest0, false, false);
      // Undeclared exception!
      try { 
        coreFunction0.functionName(childContext0);
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
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1653, expressionArray0);
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
  public void test006()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2699), (Expression[]) null);
      coreFunction0.functionFalse((EvalContext) null);
      assertEquals((-2699), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(440, expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals(440, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1162), expressionArray0);
      coreFunction0.getArgumentCount();
      assertEquals((-1162), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreFunction coreFunction0 = new CoreFunction(3217, expressionArray0);
      coreFunction0.getArg3();
      assertEquals(3217, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      expressionArray0[2] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(2261, expressionArray0);
      Expression expression0 = coreFunction0.getArg3();
      assertNotNull(expression0);
      assertEquals(2261, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(25, expressionArray0);
      coreFunction0.getArg2();
      assertEquals(25, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("`M%xHD&c{48+L$F");
      expressionArray0[1] = (Expression) constant0;
      CoreFunction coreFunction0 = new CoreFunction(2291, expressionArray0);
      Expression expression0 = coreFunction0.getArg2();
      assertNotNull(expression0);
      assertEquals(2291, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      assertNull(expression0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("`M%xHD&c{48+L$F", "`M%xHD&c{48+L$F");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreFunction coreFunction0 = new CoreFunction(2291, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      assertNotNull(expression0);
      assertEquals(2291, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(13, (Expression[]) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, (NodeTest) null, false);
      AttributeContext attributeContext0 = new AttributeContext(precedingOrFollowingContext0, (NodeTest) null);
      coreFunction0.functionString(attributeContext0);
      assertEquals(13, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("-5~zAtdf,`v@]", "k&H]:lyDmT");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[5] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-377), expressionArray0);
      // Undeclared exception!
      coreFunction0.toString();
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName((String) null, (String) null);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-1197), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Byte byte0 = new Byte((byte)118);
      Constant constant0 = new Constant(byte0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, constant0);
      expressionArray0[1] = (Expression) coreOperationEqual0;
      CoreFunction coreFunction0 = new CoreFunction(400, expressionArray0);
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
  public void test020()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(1135, expressionArray0);
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
  public void test021()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1968, (Expression[]) null);
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
  public void test022()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
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
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      expressionArray0[4] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-5), expressionArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      coreFunction0.functionTrue(parentContext0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(15, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTrue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: string-length(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("unknownFunction0()()");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionTranslate((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2699), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2699()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Expression[] expressionArray1 = new Expression[0];
      Step[] stepArray0 = new Step[3];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "7y]8wd1(G9VDpi");
      Step step0 = new Step(2943, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray1, stepArray0);
      expressionArray0[3] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(17, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSum((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2677), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringBefore((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2677()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
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
  public void test031()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(47, expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(327);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreFunction0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(predicateContext0, nodeTypeTest0, false);
      EvalContext[] evalContextArray0 = new EvalContext[3];
      UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring(unionContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction47()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationUnion0, coreOperationUnion0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      QName qName0 = new QName("rKxtln!hYv2U");
      CoreFunction coreFunction0 = new CoreFunction(1902, expressionArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeSetContext0);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstring(rootContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(41, expressionArray0);
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
  public void test034()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(330, (Expression[]) null);
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
  public void test035()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("J7?'N");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-950), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-3899), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionStartsWith((EvalContext) null);
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
      CoreFunction coreFunction0 = new CoreFunction(3, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionRound((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: count()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("count");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(extensionFunction0, extensionFunction0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationMod0, extensionFunction0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationGreaterThanOrEqual0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction(276, expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[6];
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
  public void test040()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("7VL-]AU88ZRN=E");
      Step step0 = new Step(1645, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      QName qName0 = new QName("LS!+?U/h");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction(1379, expressionArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(ancestorContext0, nodeNameTest0, true);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition(precedingOrFollowingContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(14, (Expression[]) null);
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
  public void test042()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(17, (Expression[]) null);
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
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("Q");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CoreFunction coreFunction0 = new CoreFunction((-2211), expressionArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, expressionArray0[0]);
      NamespaceContext namespaceContext0 = new NamespaceContext(predicateContext0, nodeNameTest0);
      AncestorContext ancestorContext0 = new AncestorContext(namespaceContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull(ancestorContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2211()(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(2767, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, (Expression) null);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNull(parentContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: round(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNot((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("", "node");
      CoreFunction coreFunction0 = new CoreFunction(41, expressionArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[0]);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      Locale locale0 = Locale.JAPANESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, unionContext0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNormalizeSpace(rootContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction41()(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("J7?'N");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction((-950), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(478);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(1733, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction1733()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(13, (Expression[]) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, true);
      // Undeclared exception!
      try { 
        coreFunction0.functionLast(precedingOrFollowingContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-84), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-84()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName(", ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(1516, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLang((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      QName qName0 = new QName("$6^jhxtD-%hr1bC");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[7] = (Expression) extensionFunction0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      EvalContext[] evalContextArray0 = new EvalContext[8];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      // Undeclared exception!
      coreFunction0.functionKey(unionContext0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionKey((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: concat(null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(1481, (Expression[]) null);
      Step[] stepArray0 = new Step[9];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, (Expression[]) null, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(nodeSetContext0, 5, (NodeTest) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(evalContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionFloor(namespaceContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction1481()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1653, expressionArray0);
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
  public void test057()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction((-1586), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse((EvalContext) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(462, expressionArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, (NodeTest) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(descendantContext0, basicNodeSet0);
      NamespaceContext namespaceContext0 = new NamespaceContext(nodeSetContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse(namespaceContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(37, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCount((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2629), (Expression[]) null);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains(parentContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2629()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction((-5507), expressionArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(65);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(ancestorContext0, nodeTypeTest0);
      SelfContext selfContext0 = new SelfContext(namespaceContext0, nodeTypeTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionContains(attributeContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1325), (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-1325()()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAnd0, coreOperationAnd0);
      expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
      Step[] stepArray0 = new Step[7];
      Step step0 = new Step(1751, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[4] = stepArray0[1];
      CoreFunction coreFunction0 = new CoreFunction(1450, expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[2], expressionArray0[5]);
      Step[] stepArray1 = new Step[8];
      stepArray1[0] = stepArray0[4];
      stepArray1[1] = stepArray0[0];
      stepArray1[2] = step0;
      stepArray1[3] = stepArray0[1];
      stepArray1[4] = step0;
      stepArray1[5] = step0;
      stepArray1[6] = stepArray0[4];
      stepArray1[7] = stepArray0[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray1);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(evalContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName((String) null, "C");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, false);
      // Undeclared exception!
      try { 
        coreFunction0.functionConcat(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(1653, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate((Expression) null);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, (NodeTest) null);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, coreOperationNegate0);
      ChildContext childContext0 = new ChildContext(predicateContext0, (NodeTest) null, true, false);
      NamespaceContext namespaceContext0 = new NamespaceContext(childContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue(namespaceContext0);
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
      Expression[] expressionArray0 = new Expression[9];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationOr0;
      CoreFunction coreFunction0 = new CoreFunction((-260), expressionArray0);
      // Undeclared exception!
      coreFunction0.computeContextDependent();
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction((-1162), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
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
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Object object0 = coreFunction0.computeValue((EvalContext) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2, (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("z'(");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(childContext0, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, processingInstructionTest0);
      Object object0 = coreFunction0.computeValue(attributeContext0);
      assertNotNull(object0);
      assertEquals(2, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2699), (Expression[]) null);
      String string0 = coreFunction0.toString();
      assertEquals("unknownFunction-2699()()", string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      coreFunction0.getArgumentCount();
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2, (Expression[]) null);
      coreFunction0.getArgumentCount();
      assertEquals(2, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(20, (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("z'(");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(childContext0, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, processingInstructionTest0);
      coreFunction0.functionNumber(attributeContext0);
      assertEquals(20, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction((-2395), expressionArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Co.TLoUwy5Zxr-zD");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      SelfContext selfContext0 = new SelfContext(attributeContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNumber(selfContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-2395()(null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-1), (Expression[]) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "number");
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      coreFunction0.functionStringLength(namespaceContext0);
      assertEquals((-1), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((-5507), expressionArray0);
      UnionContext unionContext0 = new UnionContext((EvalContext) null, (EvalContext[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("NaNtrue");
      AttributeContext attributeContext0 = new AttributeContext(unionContext0, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(attributeContext0, processingInstructionTest0, false, false);
      // Undeclared exception!
      try { 
        coreFunction0.functionStringLength(childContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-5507()(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant(byteArray0[3]);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationEqual0, coreOperationEqual0);
      expressionArray0[1] = (Expression) coreOperationLessThan0;
      CoreFunction coreFunction0 = new CoreFunction(1516, expressionArray0);
      coreFunction0.functionSubstringBefore((EvalContext) null);
      assertEquals(1516, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("#(Lu)V7giGip[5`");
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[0], constant0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationSubtract0);
      expressionArray0[1] = (Expression) coreOperationNegate0;
      CoreFunction coreFunction0 = new CoreFunction((-3899), expressionArray0);
      Object object0 = coreFunction0.functionStartsWith((EvalContext) null);
      assertEquals(false, object0);
      assertEquals((-3899), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.iterate((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(4015, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionString((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction4015()(null, null, null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(15, (Expression[]) null);
      QName qName0 = new QName("key", "key");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "tru");
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(ancestorContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionName(selfContext0);
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
      CoreFunction coreFunction0 = new CoreFunction(709, (Expression[]) null);
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
  public void test085()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction((-950), expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionLocalName((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction-950()(null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(500, (Expression[]) null);
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
  public void test087()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreFunction coreFunction0 = new CoreFunction(32, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionNamespaceURI((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction32()(null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Byte byte0 = new Byte((byte)110);
      Constant constant0 = new Constant(byte0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[0], coreOperationEqual0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[0], coreOperationLessThan0);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
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
  public void test089()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2629), (Expression[]) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, (NodeTest) null, false);
      AttributeContext attributeContext0 = new AttributeContext(precedingOrFollowingContext0, (NodeTest) null);
      attributeContext0.nextNode();
      Object object0 = coreFunction0.functionLast(attributeContext0);
      assertEquals(1, attributeContext0.getPosition());
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2629), (Expression[]) null);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, (NodeTest) null, false);
      AttributeContext attributeContext0 = new AttributeContext(precedingOrFollowingContext0, (NodeTest) null);
      Object object0 = coreFunction0.functionLast(attributeContext0);
      assertEquals(1, attributeContext0.getPosition());
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: round(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(9, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.computeValue((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: concat()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(41, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertEquals(41, coreFunction0.getFunctionCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(25, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertFalse(boolean0);
      assertEquals(25, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(22, expressionArray0);
      boolean boolean0 = coreFunction0.isContextDependent();
      assertTrue(boolean0);
      assertEquals(22, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(18, expressionArray0);
      boolean boolean0 = coreFunction0.isContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(20, (Expression[]) null);
      boolean boolean0 = coreFunction0.computeContextDependent();
      assertEquals(20, coreFunction0.getFunctionCode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(30, (Expression[]) null);
      // Undeclared exception!
      try { 
        coreFunction0.functionBoolean((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: format-number()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(27, expressionArray0);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("round", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction(23, expressionArray0);
      String string0 = coreFunction0.toString();
      assertEquals("number(null, null, null, null, null, null, null)", string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(22, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.iterate((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: lang()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(20, (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("z'(");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(childContext0, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCount(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: true()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(19, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: not()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(18, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionCeiling((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: boolean()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(17, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: translate()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(16, expressionArray0);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("normalize-space", string0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction((byte)14, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionPosition((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: substring(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(10, expressionArray0);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("starts-with", string0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreFunction coreFunction0 = new CoreFunction(6, expressionArray0);
      String string0 = coreFunction0.getFunctionName();
      assertEquals("namespace-uri", string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.compute((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: count()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(2, (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("z'(");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(childContext0, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        coreFunction0.functionSubstringAfter(attributeContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: position()
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionName((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: last(null, null, null, null, null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(20, (Expression[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("z'(");
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, true);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(childContext0, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, processingInstructionTest0);
      Object object0 = coreFunction0.compute(attributeContext0);
      assertEquals(true, object0);
      assertEquals(20, coreFunction0.getFunctionCode());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
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
  public void test116()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-112), (Expression[]) null);
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
  public void test117()  throws Throwable  {
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
  public void test118()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-2085), (Expression[]) null);
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
  public void test119()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      // Undeclared exception!
      try { 
        coreFunction0.functionFalse((EvalContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Incorrect number of arguments: unknownFunction0()(null, null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(2767, expressionArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, (NodeTest) null, true, true);
      coreFunction0.compute(childContext0);
      assertEquals(2767, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      CoreFunction coreFunction0 = new CoreFunction((-5), expressionArray0);
      int int0 = coreFunction0.getFunctionCode();
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(25, (Expression[]) null);
      assertEquals(0, coreFunction0.getArgumentCount());
      
      coreFunction0.functionNull((EvalContext) null);
      assertEquals(25, coreFunction0.getFunctionCode());
  }
}
