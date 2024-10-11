
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
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Step_ESTest extends Step_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Rw<U3]V");
      Step step0 = new Step(13, processingInstructionTest0, (Expression[]) null);
      step0.getPredicates();
      assertEquals(13, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      step0.getPredicates();
      assertEquals(2, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step step0 = new Step((-2014), (NodeTest) null, expressionArray0);
      step0.getNodeTest();
      assertEquals((-2014), step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-1070), (NodeTest) null, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals((-1070), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("@XHE");
      Expression[] expressionArray0 = new Expression[1];
      CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
      expressionArray0[0] = (Expression) coreFunction0;
      Step step0 = new Step(2189, processingInstructionTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("namespace");
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[1] = (Expression) coreOperationAnd0;
      Step step0 = new Step(58, processingInstructionTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Step.axisToString((-1070));
      assertEquals("UNKNOWN", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Step.axisToString(3);
      assertEquals("parent", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Step.axisToString(1);
      assertEquals("self", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Step.axisToString(13);
      assertEquals("descendant-or-self", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Step.axisToString(12);
      assertEquals("preceding-sibling", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("bRqw4T2v/;lz]f", "bRqw4T2v/;lz]f");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      int int0 = step0.getAxis();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("bRqw4T2v/;lz]f", "bRqw4T2v/;lz]f");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      step0.getPredicates();
      assertEquals(0, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[6];
      Step step0 = new Step(14, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("UNKNOWN::UNKNOWN()[null][null][null][null][null][null]", string0);
      assertEquals(14, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(12, processingInstructionTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("preceding-sibling::processing-instruction('null')", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Step.axisToString(11);
      assertEquals("following-sibling", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = Step.axisToString(10);
      assertEquals("ancestor-or-self", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = Step.axisToString(9);
      assertEquals("descendant", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = Step.axisToString(8);
      assertEquals("following", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Step.axisToString(7);
      assertEquals("preceding", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Step.axisToString(6);
      assertEquals("namespace", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Step.axisToString(5);
      assertEquals("attribute", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Step.axisToString(4);
      assertEquals("ancestor", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Step.axisToString(2);
      assertEquals("child", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<8CX/@hYZK|9HilKB");
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step(13, processingInstructionTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("descendant-or-self::processing-instruction('<8CX/@hYZK|9HilKB')[null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(3, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("parent::comment()", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.QName");
      Step step0 = new Step(3, processingInstructionTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("parent::processing-instruction('org.apache.commons.jxpath.ri.QName')", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1750);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals("self::UNKNOWN()", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual");
      Expression[] expressionArray0 = new Expression[7];
      Step step0 = new Step(1, processingInstructionTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("self::processing-instruction('org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual')[null][null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      String string0 = step0.toString();
      assertEquals(".", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[6];
      Step step0 = new Step(5, processingInstructionTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("@processing-instruction('')[null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2858);
      Expression[] expressionArray0 = new Expression[6];
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("UNKNOWN()[null][null][null][null][null][null]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[1] = (Expression) extensionFunction0;
      Step step0 = new Step(14, nodeTypeTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertTrue(boolean0);
      assertEquals(14, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[6];
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      Step step0 = new Step(14, nodeTypeTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Step", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("false");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertEquals(0, step0.getAxis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      boolean boolean0 = step0.isContextDependent();
      assertEquals(1, step0.getAxis());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("false");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, processingInstructionTest0, expressionArray0);
      step0.getNodeTest();
      assertEquals(0, step0.getAxis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(67);
      Step step0 = new Step(13, nodeTypeTest0, expressionArray0);
      String string0 = step0.toString();
      assertEquals("descendant-or-self::UNKNOWN()[null][null][null][null][null]", string0);
  }
}
