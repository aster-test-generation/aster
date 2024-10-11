
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
      QName qName0 = new QName("", "c(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "true()", "org.apache.commons.jxpath.ri.model.dom.NamespacePointer");
      String string0 = namespacePointer0.asPath();
      assertEquals("$:c(/namespace::true()", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "");
      String string0 = namespacePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("y2[GMPKs%OZ.", "y2[GMPKs%OZ.");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, variablePointer0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "namespace::", "<<unknown namespace>>");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("y2[GMPKs%OZ.", "y2[GMPKs%OZ.");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>");
      Object object0 = namespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "_vj'lTp/#7d;@Cp0zd", "5>KeXv:`m5MadW-6O");
      Object object0 = namespacePointer0.getImmediateNode();
      assertEquals("5>KeXv:`m5MadW-6O", object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, (String) null);
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
  public void test06()  throws Throwable  {
      QName qName0 = new QName("JXPath: found java.home property ", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, (String) null, (String) null);
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
  public void test07()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "A`L~9<2-63k");
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
  public void test08()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, (String) null);
      Object object0 = namespacePointer0.clone();
      // Undeclared exception!
      try { 
        namespacePointer0.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "org.apache.commons.jxpath.ri.model.dom.NamespacePointer");
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
  public void test10()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>");
      Object object0 = namespacePointer0.clone();
      boolean boolean0 = namespacePointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      boolean boolean0 = namespacePointer0.equals(namespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      boolean boolean0 = namespacePointer0.equals("namespace::");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("\"string-le/gth\"", "\"string-le/gth\"");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "<<unknown namespace>>");
      String string0 = namespacePointer0.asPath();
      assertEquals("/namespace::<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "<<unknown namespace>>", "namespace::");
      String string0 = namespacePointer1.asPath();
      assertEquals("namespace::namespace::/namespace::<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      String string0 = namespacePointer0.asPath();
      assertEquals("namespace::namespace::", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("3L{ *c)");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      QName qName0 = namespacePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "6#r*|+l");
      boolean boolean0 = namespacePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
      assertEquals("namespace::", nodeNameTest0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "\"N9'nM", "\"N9'nM");
      boolean boolean0 = namespacePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      Object object0 = namespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      int int0 = namespacePointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("3L{ *c)");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      boolean boolean0 = namespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::");
      boolean boolean0 = namespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>");
      int int0 = namespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      namespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("\"string-le/gth\"", "\"string-le/gth\"");
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        namespacePointer0.setValue(nodePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify DOM trees
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }
}
