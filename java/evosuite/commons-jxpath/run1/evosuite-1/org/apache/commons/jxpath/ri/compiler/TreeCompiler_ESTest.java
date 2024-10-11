
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TreeCompiler_ESTest extends TreeCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.variableReference((Object) null);
      Object object1 = treeCompiler0.divide((Object) null, object0);
      Object[] objectArray0 = new Object[9];
      Object[] objectArray1 = new Object[7];
      Object object2 = treeCompiler0.expressionPath(object1, objectArray0, objectArray1);
      assertNotNull(object2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.mod((Object) null, (Object) null);
      CoreOperationEqual coreOperationEqual0 = (CoreOperationEqual)treeCompiler0.equal((Object) null, object0);
      assertEquals("=", coreOperationEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("c4c/\"B", "ceiling");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[6];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThanOrEqual((Object) null, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Constant constant0 = (Constant)treeCompiler0.number("6");
      assertFalse(constant0.computeContextDependent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeNameTest nodeNameTest0 = (NodeNameTest)treeCompiler0.nodeNameTest((Object) null);
      assertNull(nodeNameTest0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.lessThan((Object) null, (Object) null);
      Object object1 = treeCompiler0.divide((Object) null, object0);
      Object object2 = treeCompiler0.minus(object1, (Object) null);
      CoreOperationNegate coreOperationNegate0 = (CoreOperationNegate)treeCompiler0.minus(object2);
      assertEquals("-", coreOperationNegate0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.variableReference(";D%");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[9];
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
  public void test08()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.sum(objectArray0);
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
      Object[] objectArray0 = new Object[1];
      Object object0 = treeCompiler0.step(0, (Object) null, objectArray0);
      Expression[] expressionArray0 = new Expression[2];
      // Undeclared exception!
      try { 
        treeCompiler0.step(0, object0, expressionArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeTest
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("$9;FF]@j|g!} 0a7bG");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "$9;FF]@j|g!} 0a7bG");
      Step step0 = new Step(0, nodeNameTest0, (Expression[]) null);
      // Undeclared exception!
      try { 
        treeCompiler0.notEqual(step0, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step(1940, nodeNameTest0, expressionArray0);
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
  public void test14()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.mod((Object) null, (Object) null);
      Object object1 = treeCompiler0.qname("", "org.apache.commons.jxpath.ri.axes.InitialContext");
      // Undeclared exception!
      try { 
        treeCompiler0.minus(object0, object1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.locationPath(false, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Step
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      Object object0 = treeCompiler0.qname("S4}[pp6|0x_r", "");
      // Undeclared exception!
      try { 
        treeCompiler0.lessThanOrEqual(step0, object0);
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
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step(2345, processingInstructionTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThan((Object) null, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.function(objectArray0[2], objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.function(0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.processingInstructionTest("");
      // Undeclared exception!
      try { 
        treeCompiler0.equal(object0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Step[] stepArray0 = new Step[8];
      Step step0 = mock(Step.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        treeCompiler0.divide(stepArray0[0], step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step$MockitoMock$208317753 cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) treeCompiler0;
      // Undeclared exception!
      try { 
        treeCompiler0.and(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[4];
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(true, objectArray0);
      assertTrue(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      CoreOperationAdd coreOperationAdd0 = (CoreOperationAdd)treeCompiler0.sum(objectArray0);
      assertEquals("+", coreOperationAdd0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(false, (Object[]) null);
      assertFalse(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[5];
      ExtensionFunction extensionFunction0 = (ExtensionFunction)treeCompiler0.function(objectArray0[1], objectArray0);
      assertTrue(extensionFunction0.computeContextDependent());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.qname("", "");
      // Undeclared exception!
      try { 
        treeCompiler0.lessThan((Object) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationOr coreOperationOr0 = (CoreOperationOr)treeCompiler0.or((Object[]) null);
      assertEquals("or", coreOperationOr0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("");
      // Undeclared exception!
      try { 
        treeCompiler0.minus((Object) qName0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.processingInstructionTest("");
      // Undeclared exception!
      try { 
        treeCompiler0.mod((Object) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[11];
      CoreFunction coreFunction0 = (CoreFunction)treeCompiler0.function(0, (Object[]) expressionArray0);
      assertEquals(0, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[11];
      CoreOperationAnd coreOperationAnd0 = (CoreOperationAnd)treeCompiler0.and(expressionArray0);
      assertEquals("and", coreOperationAnd0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal("O");
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = (CoreOperationGreaterThanOrEqual)treeCompiler0.greaterThanOrEqual(object0, object0);
      assertEquals(">=", coreOperationGreaterThanOrEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number("U2e).HR'^.2e53Q9F&");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.expressionPath((Object) null, objectArray0, objectArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.nodeNameTest(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ExpressionPath cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.equal((Object) null, (Object) null);
      Object object1 = treeCompiler0.lessThanOrEqual((Object) null, object0);
      Object object2 = treeCompiler0.minus((Object) null, object1);
      Object object3 = treeCompiler0.greaterThan(object1, object2);
      Object object4 = treeCompiler0.multiply((Object) null, object3);
      CoreOperationNotEqual coreOperationNotEqual0 = (CoreOperationNotEqual)treeCompiler0.notEqual(object0, object4);
      assertEquals("!=", coreOperationNotEqual0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = (NodeTypeTest)treeCompiler0.nodeTypeTest((-13));
      assertEquals((-13), nodeTypeTest0.getNodeType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.variableReference((Object) null);
      Object object1 = treeCompiler0.divide((Object) null, object0);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = object1;
      // Undeclared exception!
      try { 
        treeCompiler0.expressionPath(object1, objectArray0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.CoreOperationDivide cannot be cast to org.apache.commons.jxpath.ri.compiler.Step
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      CoreOperationUnion coreOperationUnion0 = (CoreOperationUnion)treeCompiler0.union(objectArray0);
      assertEquals("|", coreOperationUnion0.getSymbol());
  }
}
