
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
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
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
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathCompiledExpression_ESTest extends JXPathCompiledExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      QName qName0 = new QName("CF9");
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", extensionFunction0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, extensionFunction0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: CF9
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      QName qName0 = new QName("DfF}CUV\u0006@QJ<P");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[0], coreOperationOr0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationMultiply0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(nameAttributeTest0, variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Object object0 = new Object();
      JXPathContext jXPathContext1 = JXPathContext.newContext((JXPathContext) jXPathContextReferenceImpl0, object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContext1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: DfF}CUV\u0006@QJ<P
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, coreOperationMod0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationMod0, coreOperationMod0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, coreOperationSubtract0);
      expressionArray0[2] = (Expression) coreOperationNotEqual0;
      QName qName0 = new QName("mu~.&AwXlcRnCy", "mu~.&AwXlcRnCy");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[3] = (Expression) extensionFunction0;
      NameAttributeTest nameAttributeTest1 = new NameAttributeTest(expressionArray0[0], coreOperationNotEqual0);
      expressionArray0[4] = (Expression) nameAttributeTest1;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("mu~.&AwXlcRnCy", coreOperationNegate0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[2]);
      Object object0 = new Object();
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("4P0(A]zPJCdz[lJ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreFunction coreFunction0 = new CoreFunction((-1049), expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      expressionArray0[2] = expression0;
      Expression expression1 = coreFunction0.getArg1();
      expressionArray0[3] = expression1;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(expression0, nameAttributeTest0);
      expressionArray0[4] = (Expression) coreOperationDivide0;
      Expression[] expressionArray1 = new Expression[5];
      expressionArray1[0] = expression0;
      expressionArray1[1] = (Expression) nameAttributeTest0;
      expressionArray1[2] = expression1;
      Expression[] expressionArray2 = new Expression[3];
      expressionArray2[0] = expression0;
      expressionArray2[1] = expression1;
      expressionArray2[2] = (Expression) extensionFunction0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray2);
      expressionArray1[3] = (Expression) coreOperationAdd0;
      expressionArray1[4] = expression0;
      ExtensionFunction extensionFunction1 = new ExtensionFunction(qName0, expressionArray1);
      expressionArray0[5] = (Expression) extensionFunction1;
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[6] = (Expression) locationPath0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("DJ40_W?Pr", expressionPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) step0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "+{//e;5a+ FMVrf)K");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction(3402, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(expressionArray0[0], expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationEqual0;
      QName qName0 = new QName("'c.5gB'8Wp--+!\"");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[2] = (Expression) variableReference0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[2], expressionArray0[2]);
      expressionArray0[3] = (Expression) coreOperationLessThan0;
      CoreOperationLessThan coreOperationLessThan1 = new CoreOperationLessThan(coreFunction0, coreOperationEqual0);
      expressionArray0[4] = (Expression) coreOperationLessThan1;
      CoreOperationEqual coreOperationEqual1 = new CoreOperationEqual(coreFunction0, expressionArray0[1]);
      expressionArray0[5] = (Expression) coreOperationEqual1;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationAdd0, coreOperationEqual1);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("()", coreOperationGreaterThanOrEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[5]);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "new");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 'c.5gB'8Wp--+!\"
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      Step[] stepArray0 = new Step[6];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, (Expression[]) null, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, expressionPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) step0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[6];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThan0, nameAttributeTest0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationNotEqual0, nameAttributeTest0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[1] = (Expression) extensionFunction0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      expressionArray0[2] = (Expression) coreOperationAdd0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(expressionArray0[2], nameAttributeTest0);
      expressionArray0[3] = (Expression) coreOperationGreaterThanOrEqual0;
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[4] = (Expression) variableReference0;
      ExtensionFunction extensionFunction1 = new ExtensionFunction(qName0, (Expression[]) null);
      expressionArray0[5] = (Expression) extensionFunction1;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationOr0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("LlL*]jk", coreOperationEqual0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      jXPathCompiledExpression0.iterate(jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "9`~6r?gtbth:t*");
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("\"7$3N\u0006");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAdd0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[1], expressionArray0[0]);
      expressionArray0[2] = (Expression) coreOperationMod0;
      CoreOperationAdd coreOperationAdd1 = new CoreOperationAdd(expressionArray0);
      expressionArray0[3] = (Expression) coreOperationAdd1;
      Constant constant0 = new Constant((Number) null);
      expressionArray0[4] = (Expression) constant0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("\"7$3N\u0006", coreOperationUnion0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationSubtract0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, variableReference0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      QName qName0 = new QName("at the beginning of the expression", "b");
      VariableReference variableReference0 = new VariableReference(qName0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("b", variableReference0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variableReference0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: b
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ksFn");
      Expression[] expressionArray0 = new Expression[4];
      Byte byte0 = new Byte((byte)0);
      Constant constant0 = new Constant(byte0);
      expressionArray0[0] = (Expression) constant0;
      QName qName0 = new QName("", "oaPz1vf");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[1] = (Expression) extensionFunction0;
      Constant constant1 = new Constant("");
      expressionArray0[2] = (Expression) constant1;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(expressionArray0[1], expressionArray0[0]);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant1, coreOperationMultiply0);
      expressionArray0[3] = (Expression) coreOperationGreaterThan0;
      CoreFunction coreFunction0 = new CoreFunction(1023, expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) coreOperationGreaterThan0);
      jXPathCompiledExpression0.removeAll(jXPathContext0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, jXPathContext0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue(jXPathContext0, jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath ; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Expression[] expressionArray1 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray1);
      expressionArray0[0] = (Expression) coreOperationUnion0;
      CoreFunction coreFunction0 = new CoreFunction((-2741), expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null);
      Object object0 = new Object();
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, object0, nodePointer0);
      Class<Object> class0 = Object.class;
      jXPathCompiledExpression0.getValue((JXPathContext) jXPathContextReferenceImpl0, (Class) class0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl2 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext((JXPathContext) jXPathContextReferenceImpl1, (Object) jXPathContextReferenceImpl2);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath(jXPathContext1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath ; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Constant constant0 = new Constant("");
      expressionArray0[0] = (Expression) constant0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[1] = (Expression) coreOperationLessThan0;
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[2] = (Expression) variableReference0;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionArray0[1], coreOperationLessThan0);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, expressionArray0[1]);
      expressionArray0[4] = (Expression) nameAttributeTest0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      expressionArray0[5] = (Expression) coreOperationNegate0;
      NameAttributeTest nameAttributeTest1 = new NameAttributeTest(coreOperationAdd0, expressionArray0[5]);
      expressionArray0[6] = (Expression) nameAttributeTest1;
      CoreOperationNegate coreOperationNegate1 = new CoreOperationNegate(coreOperationSubtract0);
      expressionArray0[7] = (Expression) coreOperationNegate1;
      CoreFunction coreFunction0 = new CoreFunction((-1881), expressionArray0);
      Expression expression0 = coreFunction0.getArg3();
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("7d>D5%^[PQrnUYnO#,", expression0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: null
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Constant constant0 = new Constant("lPiV{NcE^]!C~f");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Cannot turn ", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) "lPiV{NcE^]!C~f");
      jXPathCompiledExpression0.getValue(jXPathContext0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext1, "lPiV{NcE^]!C~f");
      Iterator iterator0 = jXPathCompiledExpression0.iteratePointers(jXPathContextReferenceImpl0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double double0 = new Double(0.0);
      Constant constant0 = new Constant(double0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      coreOperationMod0.toString();
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("&V\u0003p{K|iKBS:-_D", coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) double0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, constant0);
      String string0 = "";
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContextReferenceImpl0, "");
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
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, locationPath0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, locationPath0);
      expressionArray0[0] = (Expression) coreOperationMod0;
      CoreOperationMod coreOperationMod1 = new CoreOperationMod(coreOperationGreaterThan0, coreOperationMod0);
      expressionArray0[1] = (Expression) coreOperationMod1;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationOr0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, coreOperationMod0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate(jXPathContextReferenceImpl0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      String string0 = "W#}@Yd`D>=m?Yw";
      QName qName0 = new QName("W#}@Yd`D>=m?Yw", "W#}@Yd`D>=m?Yw");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(variableReference0, variableReference0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("W#}@Yd`D>=m?Yw", coreOperationMultiply0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "W#}@Yd`D>=m?Yw");
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: W#}@Yd`D>=m?Yw:W#}@Yd`D>=m?Yw
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(657);
      Constant constant0 = new Constant(integer0);
      Constant constant1 = new Constant(integer0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant1, constant1);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("p", coreOperationGreaterThanOrEqual0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, coreOperationGreaterThanOrEqual0);
      String string0 = "/imP8pqxWMK;dofkIeW";
      QName qName0 = new QName("/imP8pqxWMK;dofkIeW", "/imP8pqxWMK;dofkIeW");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[4];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(locationPath0, locationPath0);
      expressionArray0[0] = (Expression) coreOperationGreaterThanOrEqual0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      expressionArray0[1] = (Expression) expressionPath0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[2] = (Expression) coreOperationAnd0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationOr0, coreOperationAnd0);
      expressionArray0[3] = (Expression) coreOperationDivide0;
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionPath0, coreOperationDivide0);
      expressionArray0[4] = (Expression) coreOperationMod0;
      ExpressionPath expressionPath1 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      expressionArray0[5] = (Expression) expressionPath1;
      CoreFunction coreFunction0 = new CoreFunction(2143, expressionArray0);
      expressionArray0[6] = (Expression) coreFunction0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual1 = new CoreOperationGreaterThanOrEqual(locationPath0, expressionArray0[1]);
      expressionArray0[7] = (Expression) coreOperationGreaterThanOrEqual1;
      CoreOperationAnd coreOperationAnd1 = new CoreOperationAnd(expressionArray0);
      expressionArray0[8] = (Expression) coreOperationAnd1;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAdd0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "";
      Byte byte0 = new Byte((byte)0);
      Constant constant0 = new Constant(byte0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) constant0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constant constant0 = new Constant("9Y@HtVU5:W5E%m=@R");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(nameAttributeTest0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("9Y@HtVU5:W5E%m=@R", coreOperationMod0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", locationPath0);
      jXPathCompiledExpression0.getXPath();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      Class<Object> class0 = Object.class;
      jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = null;
      try {
        jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, "", variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression expression0 = null;
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
      jXPathCompiledExpression0.getXPath();
      JXPathContext jXPathContext0 = null;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue((JXPathContext) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", (Expression) null);
      String string0 = jXPathCompiledExpression0.getXPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("[");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(extensionFunction0, extensionFunction0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationSubtract0, extensionFunction0);
      Expression[] expressionArray1 = new Expression[4];
      expressionArray1[0] = (Expression) extensionFunction0;
      expressionArray1[1] = (Expression) coreOperationSubtract0;
      expressionArray1[2] = (Expression) coreOperationSubtract0;
      CoreFunction coreFunction0 = new CoreFunction((-2046), expressionArray1);
      Expression expression0 = coreFunction0.getArg1();
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expression0, expressionArray1[1]);
      expressionArray1[3] = (Expression) coreOperationLessThan0;
      Step[] stepArray0 = new Step[6];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray1, stepArray0);
      expressionArray0[0] = (Expression) expressionPath0;
      CoreFunction coreFunction1 = new CoreFunction((-2046), expressionArray1);
      expressionArray0[1] = (Expression) coreFunction1;
      ExtensionFunction extensionFunction1 = new ExtensionFunction(qName0, expressionArray1);
      expressionArray0[2] = (Expression) extensionFunction1;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationAdd0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionPath0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "fypQFy(Yiw4");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Constant constant0 = new Constant(integer0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationEqual0, constant0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationDivide0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<Object> class0 = Object.class;
      Object object1 = jXPathCompiledExpression0.getValue(jXPathContext0, class0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue(jXPathContext0, object1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath ; Cannot set value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "/H6!s";
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("/H6!s", coreOperationOr0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "/H6!s");
      Object object0 = jXPathCompiledExpression0.getValue(jXPathContext0);
      String string1 = "!K#J\\%UeIq;%tc";
      jXPathCompiledExpression0.getPointer(jXPathContext0, "!K#J%UeIq;%tc");
      // Undeclared exception!
      try { 
        jXPathContext0.getNodeSetByKey("!K#J%UeIq;%tc", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("C!ct;u9S!MvV2");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("K#vJ{LAv0)fVA", extensionFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined function: C!ct;u9S!MvV2
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(locationPath0, locationPath0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationGreaterThanOrEqual0, locationPath0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.compiler.CoreOperationUnion", coreOperationLessThanOrEqual0);
      JXPathContext jXPathContext0 = null;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iteratePointers((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "%UiMQs7r";
      QName qName0 = new QName("pA", "%UiMQs7r");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, variableReference0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationSubtract0, coreOperationSubtract0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("pA", nameAttributeTest0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "pA");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: pA:%UiMQs7r
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Constant constant0 = new Constant("5rMb!B -e1_;c%x^");
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(constant0, constant0);
      coreOperationLessThanOrEqual0.toString();
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationLessThanOrEqual0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("5rMb!B -e1_;c%x^", nameAttributeTest0);
      JXPathContext jXPathContext0 = null;
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationUnion0, coreOperationUnion0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationUnion0, coreOperationDivide0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[5];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      expressionArray0[1] = (Expression) locationPath0;
      NameAttributeTest nameAttributeTest1 = new NameAttributeTest(coreOperationDivide0, coreOperationDivide0);
      expressionArray0[2] = (Expression) nameAttributeTest1;
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(locationPath0, nameAttributeTest1);
      expressionArray0[3] = (Expression) coreOperationSubtract0;
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(nameAttributeTest1, coreOperationUnion0);
      expressionArray0[4] = (Expression) coreOperationGreaterThanOrEqual0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(nameAttributeTest0, coreOperationUnion0);
      expressionArray0[5] = (Expression) coreOperationLessThanOrEqual0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationAdd0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue((JXPathContext) null, expressionArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null).when(step0).getNodeTest();
      doReturn((Expression[]) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", locationPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, nameAttributeTest0);
      jXPathCompiledExpression0.toString();
      jXPathCompiledExpression0.toString();
      EvalContext evalContext0 = null;
      // Undeclared exception!
      try { 
        coreOperationAdd0.iteratePointers((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Expression", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = null;
      Expression[] expressionArray0 = new Expression[2];
      CoreFunction coreFunction0 = new CoreFunction(2539, expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationUnion0;
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationOr0);
      jXPathCompiledExpression0.getXPath();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3119);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeTypeTest0);
      // Undeclared exception!
      try { 
        namespaceContext0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "new";
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, coreOperationLessThanOrEqual0);
      JXPathContext jXPathContext0 = null;
      String string1 = "Expression context [";
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("Expression context [", coreOperationDivide0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = "";
      Step[] stepArray0 = new Step[1];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(step0).getAxis();
      doReturn((NodeTest) null).when(step0).getNodeTest();
      doReturn((Expression[]) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      locationPath0.computeContextDependent();
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", locationPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locationPath0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, (Object) null);
      String string1 = "R@, (.#@8";
      QName qName0 = new QName("(h", "R@, (.#@8");
      Object object0 = new Object();
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      rootContext0.getContextNodePointer();
      EvalContext evalContext0 = rootContext0.getConstantContext((Object) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1535));
      NamespaceContext namespaceContext0 = new NamespaceContext(evalContext0, nodeTypeTest0);
      JXPathContext jXPathContext1 = namespaceContext0.getJXPathContext();
      jXPathCompiledExpression0.iterate(jXPathContext1);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = "vVM>i%$U";
      CoreFunction coreFunction0 = new CoreFunction(1, (Expression[]) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("vVM>i%$U", coreFunction0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "vVM>i%$U");
      jXPathCompiledExpression0.iteratePointers(jXPathContext0);
      String string1 = "7u {k0i)%R";
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removeAll(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove all for xpath vVM>i%$U; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = null;
      Step[] stepArray0 = new Step[2];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(step0).getAxis();
      doReturn((NodeTest) null, (NodeTest) null).when(step0).getNodeTest();
      doReturn((Object) null, (Object) null).when(step0).getPredicates();
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, locationPath0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) step0);
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      String string1 = "org.apache.commons.jxpath.JXPathFunctionNotFoundException";
      JXPathContext.compile("org.apache.commons.jxpath.JXPathFunctionNotFoundException");
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName((String) null, "6sE");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, expressionArray0[0]);
      expressionArray0[1] = (Expression) coreOperationMultiply0;
      CoreOperationMultiply coreOperationMultiply1 = new CoreOperationMultiply(expressionArray0[1], expressionArray0[0]);
      expressionArray0[2] = (Expression) coreOperationMultiply1;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(expressionArray0[2], coreOperationMultiply0);
      expressionArray0[3] = (Expression) coreOperationLessThan0;
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      expressionArray0[4] = (Expression) expressionPath0;
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expression0, expressionArray0[1]);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationNotEqual0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, expressionArray0[0], (Pointer) null);
      Class<JXPathContextReferenceImpl> class0 = JXPathContextReferenceImpl.class;
      coreFunction0.iterate((EvalContext) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("'", coreOperationAnd0);
      JXPathContext jXPathContext0 = null;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Constant constant0 = new Constant("ipcQ|%bD%");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("ipcQ|%bD%", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathCompiledExpression0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl(jXPathContext0, constant0);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      constant0.iterate(evalContext0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.removePath(jXPathContext1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath ipcQ|%bD%; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("org.apache.commons.jxpath.ri.JXPathCompiledExpression", constant0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.JXPathCompiledExpression");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathCompiledExpression0);
      jXPathCompiledExpression0.getValue(jXPathContext0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPathAndSetValue(jXPathContext1, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.ri.JXPathCompiledExpression; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual((Expression) null, (Expression) null);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationNotEqual0, (Expression) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationSubtract0, (Expression) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", coreOperationLessThan0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getValue(jXPathContext0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant((String) null);
      expressionArray0[0] = (Expression) constant0;
      String string0 = "E$;r>7OEcBol^";
      QName qName0 = new QName("E$;r>7OEcBol^", (String) null);
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[1] = (Expression) variableReference0;
      Constant constant1 = new Constant("0be(GjnE>qD>le");
      expressionArray0[2] = (Expression) constant1;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationAnd0, expressionArray0[0]);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationGreaterThanOrEqual0, expressionArray0[2]);
      coreOperationGreaterThanOrEqual0.isContextDependent();
      coreOperationGreaterThanOrEqual0.isContextDependent();
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression((String) null, coreOperationNotEqual0);
      jXPathCompiledExpression0.getExpression();
      jXPathCompiledExpression0.getExpression();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath null; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = "-%.so&";
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("-%.so&", (Expression) null);
      jXPathCompiledExpression0.getExpression();
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.iterate((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathCompiledExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Constant constant0 = new Constant("");
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("", constant0);
      jXPathCompiledExpression0.toString();
      JXPathContext jXPathContext0 = null;
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, constant0);
      Object object0 = new Object();
      constant0.toString();
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      ancestorContext0.getCurrentNodePointer();
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = new JXPathContextReferenceImpl(jXPathContextReferenceImpl0, object0, (Pointer) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.setValue(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath ; Cannot set value for xpath: 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = "4kWIrvid:_%1=!](.9^";
      Long long0 = new Long(0L);
      Constant constant0 = new Constant(long0);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("4kWIrvid:_%1=!](.9^", constant0);
      jXPathCompiledExpression0.toString();
      jXPathCompiledExpression0.getXPath();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) long0);
      jXPathCompiledExpression0.getValue(jXPathContext0);
      QName qName0 = new QName("')");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByID(jXPathContext0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, coreOperationLessThan0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationGreaterThan coreOperationGreaterThan1 = new CoreOperationGreaterThan((Expression) null, coreOperationGreaterThan0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan1, coreOperationOr0);
      expressionArray0[1] = (Expression) coreOperationMod0;
      CoreFunction coreFunction0 = new CoreFunction(1, expressionArray0);
      Expression expression0 = coreFunction0.getArg1();
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expression0, (Expression) null);
      JXPathCompiledExpression jXPathCompiledExpression0 = new JXPathCompiledExpression("' for path: ", coreOperationSubtract0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathCompiledExpression0.getPointer(jXPathContext0, "' for path: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
  }
}
