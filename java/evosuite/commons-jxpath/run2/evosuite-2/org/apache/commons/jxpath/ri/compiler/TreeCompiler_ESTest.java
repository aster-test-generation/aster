
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TreeCompiler_ESTest extends TreeCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[9];
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      Object object0 = treeCompiler0.lessThan(coreFunction0, (Object) null);
      Object object1 = treeCompiler0.expressionPath(object0, expressionArray0, objectArray0);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.sum(objectArray0);
      CoreOperationLessThan coreOperationLessThan0 = (CoreOperationLessThan)treeCompiler0.lessThan(object0, (Object) null);
      assertEquals("<", coreOperationLessThan0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal("Namespace registration is not implemented by ");
      // Undeclared exception!
      try { 
        treeCompiler0.mod(object0, treeCompiler0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.variableReference((Object) null);
      CoreOperationMultiply coreOperationMultiply0 = (CoreOperationMultiply)treeCompiler0.multiply((Object) null, object0);
      assertEquals("*", coreOperationMultiply0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.qname("}$.3T6 Lmh~fF-", "|PJ_\";C@+WJzn-J");
      Object object1 = treeCompiler0.nodeNameTest(object0);
      assertEquals("}$.3T6 Lmh~fF-:|PJ_\";C@+WJzn-J", object1.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.or((Object[]) null);
      CoreOperationMod coreOperationMod0 = (CoreOperationMod)treeCompiler0.mod(object0, object0);
      assertEquals("mod", coreOperationMod0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[6];
      Object object0 = treeCompiler0.and((Object[]) null);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = (CoreOperationGreaterThanOrEqual)treeCompiler0.greaterThanOrEqual(object0, expressionArray0[2]);
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(false, objectArray0);
      CoreOperationAnd coreOperationAnd0 = (CoreOperationAnd)treeCompiler0.and(objectArray0);
      treeCompiler0.divide(locationPath0, coreOperationAnd0);
      assertFalse(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.union(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.processingInstructionTest("i6P?lMpCpZ?s");
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = object0;
      // Undeclared exception!
      try { 
        treeCompiler0.sum(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) treeCompiler0;
      Object object0 = treeCompiler0.processingInstructionTest("d19`");
      // Undeclared exception!
      try { 
        treeCompiler0.step(2401, object0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.or(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(14, processingInstructionTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.notEqual(treeCompiler0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(1945, (NodeTest) null, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.multiply(step0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(14);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2640, nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.minus((Object) null, (Object) step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1708));
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step((-395), nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.minus((Object) step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.locationPath(true, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Step
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("Cannot create a relative context for a non-existent node: ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Factory cannot define variable '");
      Expression[] expressionArray0 = new Expression[9];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.lessThan(step0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.qname("", "");
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThan(object0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      Object object0 = treeCompiler0.function((-4583), objectArray0);
      Object object1 = treeCompiler0.equal(object0, object0);
      // Undeclared exception!
      try { 
        treeCompiler0.function(object1, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.CoreOperationEqual cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[5];
      objectArray0[1] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.function(1, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1708));
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.expressionPath(step0, expressionArray0, expressionArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "JXPath: loaded from services: ";
      // Undeclared exception!
      try { 
        treeCompiler0.and(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Step[] stepArray0 = new Step[7];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.equal(locationPath0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step$MockitoMock$957837345 cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = (CoreOperationLessThanOrEqual)treeCompiler0.lessThanOrEqual((Object) null, (Object) null);
      assertEquals("<=", coreOperationLessThanOrEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(true, (Object[]) null);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.multiply((Object) null, (Object) null);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[2];
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.lessThanOrEqual(object0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Step step0 = (Step)treeCompiler0.step(586, (Object) null, objectArray0);
      assertEquals(586, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      try { 
        treeCompiler0.nodeNameTest(locale0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Locale cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      CoreFunction coreFunction0 = (CoreFunction)treeCompiler0.function((-306), objectArray0);
      treeCompiler0.minus((Object) coreFunction0, (Object) coreFunction0);
      assertEquals((-306), coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.function((-2526), objectArray0);
      Object object1 = treeCompiler0.lessThan(object0, object0);
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1, nodeNameTest0, (Expression[]) null);
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThanOrEqual(object1, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = (CoreOperationGreaterThan)treeCompiler0.greaterThan(expressionArray0[2], coreOperationUnion0);
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number("E#[>.LunK 5OgXRym+t");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.or(objectArray0);
      Object object1 = treeCompiler0.expressionPath(object0, objectArray0, objectArray0);
      CoreOperationNegate coreOperationNegate0 = (CoreOperationNegate)treeCompiler0.minus(object1);
      assertEquals("-", coreOperationNegate0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        treeCompiler0.variableReference(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[9];
      Object object0 = treeCompiler0.function((Object) null, objectArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = (CoreOperationNotEqual)treeCompiler0.notEqual(object0, (Object) null);
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = (NodeTypeTest)treeCompiler0.nodeTypeTest((-43));
      assertEquals((-43), nodeTypeTest0.getNodeType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.divide((Object) null, "D'Jo<");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[7];
      CoreOperationUnion coreOperationUnion0 = (CoreOperationUnion)treeCompiler0.union(objectArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
  }
}
