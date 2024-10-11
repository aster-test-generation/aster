
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


package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.NamespacePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NamespacePointer_ESTest extends NamespacePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("bzOrbdTnT Qg',YYz");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "bzOrbdTnT Qg',YYz", "@wOxt(y#$_s@}(yW'D");
      String string0 = namespacePointer0.asPath();
      assertEquals("$bzOrbdTnT Qg',YYz/namespace::bzOrbdTnT Qg',YYz", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("bzOrbdTnT Qg',YYz");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "bzOrbdTnT Qg',YYz", "@wOxt(y#$_s@}(yW'D");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("@wOxt(y#$_s@}(yW'D", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, (String) null, "");
      // Undeclared exception!
      try { 
        namespacePointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "");
      // Undeclared exception!
      try { 
        namespacePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, (String) null);
      // Undeclared exception!
      try { 
        namespacePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "l?JBNHaXo8w10o");
      // Undeclared exception!
      try { 
        namespacePointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("7eA;j@}C'KQ-m:$G");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, ".vYuRV/u$t9]{p3()0", "7eA;j@}C'KQ-m:$G");
      NamespacePointer namespacePointer1 = new NamespacePointer(variablePointer0, (String) null);
      // Undeclared exception!
      try { 
        namespacePointer1.equals(namespacePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("v", "Could not allocate a NodePointer for object of ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>");
      String string0 = namespacePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("namespace::");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, (Object) null);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer1, "namespace::", "");
      String string0 = namespacePointer0.getNamespaceURI();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "", "<<unknown namespace>>");
      boolean boolean0 = namespacePointer0.equals(namespacePointer1);
      assertFalse(namespacePointer1.equals((Object)namespacePointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      boolean boolean0 = namespacePointer0.equals(namespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      boolean boolean0 = namespacePointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      String string0 = namespacePointer0.asPath();
      assertEquals("$/namespace::7eA;j@}C'KQ-m:$G", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("soz7(nS6*<</?!&~6n", "soz7(nS6*<</?!&~6n");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "", "");
      String string0 = namespacePointer0.toString();
      assertEquals("/namespace::", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "following-sibling::");
      String string0 = namespacePointer0.asPath();
      assertEquals("namespace::following-sibling::", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "following-sibling::");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = namespacePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("soz7(nS6*<</?!&~6n", "soz7(nS6*<</?!&~6n");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "", "");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("VzAS39}!Z}yU?a");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "VzAS39}!Z}yU?a", "VzAS39}!Z}yU?a");
      boolean boolean0 = namespacePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("soz7(nS6*<</?!&~6n", "soz7(nS6*<</?!&~6n");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "", "");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "soz7(nS6*<</?!&~6n");
      Object object0 = namespacePointer1.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("soz7(nS6*<</?!&~6n", "soz7(nS6*<</?!&~6n");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "", "");
      Object object0 = namespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("soz7(nS6*<</?!&~6n", "soz7(nS6*<</?!&~6n");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "", "");
      int int0 = namespacePointer0.compareChildNodePointers(namespacePointer0, nodePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("soz7(nS6*<</?!&~6n", "soz7(nS6*<</?!&~6n");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "", "");
      Object object0 = namespacePointer0.getImmediateNode();
      assertNotNull(object0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      boolean boolean0 = namespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "following-sibling::");
      boolean boolean0 = namespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("soz7(nS6*<</?!&~6n", "soz7(nS6*<</?!&~6n");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "", "");
      int int0 = namespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      QName qName1 = namespacePointer0.getName();
      assertEquals("7eA;j@}C'KQ-m:$G", qName1.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      namespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "7eA;j@}C'KQ-m:$G", "");
      // Undeclared exception!
      try { 
        namespacePointer0.setValue("<<unknown namespace>>");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify DOM trees
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }
}
