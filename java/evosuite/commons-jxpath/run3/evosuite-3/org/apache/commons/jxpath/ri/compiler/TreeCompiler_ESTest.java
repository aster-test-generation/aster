
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
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.TreeCompiler;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TreeCompiler_ESTest extends TreeCompiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[7];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, locationPath0);
      Expression[] expressionArray1 = new Expression[2];
      Object object0 = treeCompiler0.expressionPath(coreOperationEqual0, expressionArray1, expressionArray0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.nodeTypeTest(15);
      // Undeclared exception!
      try { 
        treeCompiler0.equal((Object) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeTypeTest cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = new QName("D};hh\"*\"6wA7Z64`", "D};hh\"*\"6wA7Z64`");
      // Undeclared exception!
      try { 
        treeCompiler0.divide((Object) null, qName0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        treeCompiler0.minus((Object) null, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      VariableReference variableReference0 = (VariableReference)treeCompiler0.variableReference((Object) null);
      assertFalse(variableReference0.isContextDependent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeNameTest nodeNameTest0 = (NodeNameTest)treeCompiler0.nodeNameTest((Object) null);
      assertNull(nodeNameTest0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[5];
      ExtensionFunction extensionFunction0 = (ExtensionFunction)treeCompiler0.function(objectArray0[2], objectArray0);
      assertTrue(extensionFunction0.computeContextDependent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[4];
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
      Object[] objectArray0 = new Object[5];
      objectArray0[1] = (Object) treeCompiler0;
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
  public void test10()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.number("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
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
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2596);
      Expression[] expressionArray0 = new Expression[6];
      Step step0 = new Step(2596, nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.notEqual((Object) null, step0);
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
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(" ^");
      Expression[] expressionArray0 = new Expression[6];
      Step step0 = new Step(2207, processingInstructionTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.multiply((Object) null, step0);
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
      Object object0 = treeCompiler0.greaterThanOrEqual((Object) null, (Object) null);
      // Undeclared exception!
      try { 
        treeCompiler0.mod(object0, "9Ts#%~t]>gpGh`8");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        treeCompiler0.minus(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[6];
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
  public void test17()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[0];
      Object object0 = treeCompiler0.and(objectArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
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
  public void test18()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThan(treeCompiler0, treeCompiler0);
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
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "";
      // Undeclared exception!
      try { 
        treeCompiler0.function((-2607), objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[7];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, locationPath0);
      expressionArray0[0] = (Expression) coreOperationEqual0;
      // Undeclared exception!
      try { 
        treeCompiler0.expressionPath(coreOperationEqual0, expressionArray0, expressionArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.CoreOperationEqual cannot be cast to org.apache.commons.jxpath.ri.compiler.Step
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal("fyt");
      Object[] objectArray0 = new Object[5];
      Object object1 = treeCompiler0.expressionPath(object0, objectArray0, objectArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.divide("fyt", object1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[8];
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
      Object[] objectArray0 = new Object[1];
      Object object0 = treeCompiler0.locationPath(true, objectArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.equal(object0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      LocationPath locationPath0 = (LocationPath)treeCompiler0.locationPath(false, objectArray0);
      treeCompiler0.equal(locationPath0, locationPath0);
      assertFalse(locationPath0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[1];
      Object object0 = treeCompiler0.locationPath(false, objectArray0);
      CoreFunction coreFunction0 = (CoreFunction)treeCompiler0.function(45, objectArray0);
      treeCompiler0.lessThanOrEqual(object0, coreFunction0);
      assertEquals(45, coreFunction0.getFunctionCode());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[3];
      CoreOperationAdd coreOperationAdd0 = (CoreOperationAdd)treeCompiler0.sum(objectArray0);
      assertEquals("+", coreOperationAdd0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      Object object0 = treeCompiler0.greaterThanOrEqual((Object) null, objectArray0[0]);
      CoreOperationMod coreOperationMod0 = (CoreOperationMod)treeCompiler0.mod(object0, objectArray0[1]);
      assertEquals("mod", coreOperationMod0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationMultiply coreOperationMultiply0 = (CoreOperationMultiply)treeCompiler0.multiply((Object) null, (Object) null);
      assertEquals("*", coreOperationMultiply0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      QName qName0 = (QName)treeCompiler0.qname("", "");
      assertEquals("", qName0.getPrefix());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      Object object0 = treeCompiler0.minus(objectArray0[0], objectArray0[0]);
      CoreOperationLessThan coreOperationLessThan0 = (CoreOperationLessThan)treeCompiler0.lessThan(object0, object0);
      assertEquals("<", coreOperationLessThan0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[2];
      Step step0 = (Step)treeCompiler0.step(648, (Object) null, objectArray0);
      assertEquals(648, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      CoreOperationOr coreOperationOr0 = (CoreOperationOr)treeCompiler0.or((Object[]) null);
      assertEquals("or", coreOperationOr0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal("-\"O-F?wgN+|");
      // Undeclared exception!
      try { 
        treeCompiler0.nodeNameTest(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Constant cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      ProcessingInstructionTest processingInstructionTest0 = (ProcessingInstructionTest)treeCompiler0.processingInstructionTest((String) null);
      assertNull(processingInstructionTest0.getTarget());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      // Undeclared exception!
      try { 
        treeCompiler0.greaterThanOrEqual((Object) null, treeCompiler0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.TreeCompiler cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object[] objectArray0 = new Object[1];
      Object object0 = treeCompiler0.locationPath(false, objectArray0);
      Object object1 = treeCompiler0.minus(object0);
      Object object2 = treeCompiler0.equal(object1, object1);
      Object object3 = treeCompiler0.union(objectArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = (CoreOperationGreaterThan)treeCompiler0.greaterThan(object3, object2);
      assertEquals(">", coreOperationGreaterThan0.getSymbol());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.literal("*");
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        treeCompiler0.step((-20), object0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Constant cannot be cast to org.apache.commons.jxpath.ri.compiler.NodeTest
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.number("46");
      Object[] objectArray0 = new Object[10];
      // Undeclared exception!
      try { 
        treeCompiler0.function(object0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Constant cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.notEqual((Object) null, (Object) null);
      // Undeclared exception!
      try { 
        treeCompiler0.variableReference(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual cannot be cast to org.apache.commons.jxpath.ri.QName
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      NodeTypeTest nodeTypeTest0 = (NodeTypeTest)treeCompiler0.nodeTypeTest((-20));
      assertEquals((-20), nodeTypeTest0.getNodeType());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TreeCompiler treeCompiler0 = new TreeCompiler();
      Object object0 = treeCompiler0.locationPath(true, (Object[]) null);
      Object object1 = treeCompiler0.divide(object0, object0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3051));
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(2049, nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        treeCompiler0.lessThan(object1, step0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.Step cannot be cast to org.apache.commons.jxpath.ri.compiler.Expression
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.TreeCompiler", e);
      }
  }
}
