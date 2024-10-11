
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
      QName qName0 = new QName("A9");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "A9", locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "A9", "<<unknown namespace>>");
      String string0 = namespacePointer0.asPath();
      assertEquals("'A9'/namespace::A9", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "(^<'ofG", "(^<'ofG");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("(^<'ofG", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
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
      QName qName0 = new QName("O-3TQ-", "r");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, (String) null, "O-3TQ-");
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
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::", (String) null);
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
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "(^<'ofG", "O@c#J[sIGg:nD8WtL&");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, (String) null);
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
      QName qName0 = new QName("/5Hxd8]");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "Cannot modify DOM trees");
      String string0 = namespacePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      String string0 = namespacePointer0.getNamespaceURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "(^<'ofG", "(^<'ofG");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "<<unknown namespace>>");
      boolean boolean0 = namespacePointer1.equals(namespacePointer0);
      assertFalse(boolean0);
      assertFalse(namespacePointer0.equals((Object)namespacePointer1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      boolean boolean0 = namespacePointer0.equals(namespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      Object object0 = new Object();
      boolean boolean0 = namespacePointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NamespacePointer namespacePointer0 = new NamespacePointer(nodePointer0, "<<unknown namespace>>");
      String string0 = namespacePointer0.asPath();
      assertEquals("/namespace::<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "(^<'ofG", "(^<'ofG");
      NamespacePointer namespacePointer1 = new NamespacePointer(namespacePointer0, "<<unknown namespace>>");
      String string0 = namespacePointer1.asPath();
      assertEquals("namespace::(^<'ofG/namespace::<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      String string0 = namespacePointer0.asPath();
      assertEquals("namespace::", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "~#,", "~#,");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("fE4Vvk$G@],<t1;C", "fE4Vvk$G@],<t1;C");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "fE4Vvk$G@],<t1;C");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = namespacePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(45);
      boolean boolean0 = namespacePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("child", "child");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "child");
      boolean boolean0 = namespacePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      Object object0 = namespacePointer0.getImmediateNode();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "", "");
      Object object0 = namespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::", (String) null);
      int int0 = namespacePointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("fE4Vvk$G@],<t1;C", "fE4Vvk$G@],<t1;C");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "fE4Vvk$G@],<t1;C");
      Object object0 = namespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("fE4Vvk$G@],<t1;C", "fE4Vvk$G@],<t1;C");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "fE4Vvk$G@],<t1;C");
      boolean boolean0 = namespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "~#,", "~#,");
      boolean boolean0 = namespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "~#,", "~#,");
      int int0 = namespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NamespacePointer namespacePointer0 = new NamespacePointer((NodePointer) null, "namespace::", (String) null);
      QName qName0 = namespacePointer0.getName();
      assertEquals("namespace::", qName0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("fE4Vvk$G@],<t1;C", "fE4Vvk$G@],<t1;C");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "fE4Vvk$G@],<t1;C");
      namespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("fE4Vvk$G@],<t1;C", "fE4Vvk$G@],<t1;C");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NamespacePointer namespacePointer0 = new NamespacePointer(variablePointer0, "fE4Vvk$G@],<t1;C");
      // Undeclared exception!
      try { 
        namespacePointer0.setValue(namespacePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify DOM trees
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.NamespacePointer", e);
      }
  }
}
