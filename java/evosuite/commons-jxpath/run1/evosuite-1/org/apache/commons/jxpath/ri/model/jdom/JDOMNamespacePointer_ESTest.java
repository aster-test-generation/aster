
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


package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JDOMNamespacePointer_ESTest extends JDOMNamespacePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "HPOhYZ#H");
      QName qName0 = jDOMNamespacePointer0.getName();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "HPOhYZ#H");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer1.asPath();
      assertEquals("'HPOhYZ#H'/namespace::<<unknown namespace>>", string0);
      assertEquals("HPOhYZ#H", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, variablePointer0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      jDOMNamespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "}zEUjOZs#*}>AocIR", "");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, (String) null);
      Object object0 = jDOMNamespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "HPOhYZ#H");
      QName qName0 = jDOMNamespacePointer0.getName();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "HPOhYZ#H");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer1.getImmediateNode();
      assertEquals("HPOhYZ#H", qName0.toString());
      assertNotNull(object0);
      assertEquals("HPOhYZ#H", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("<e``:FC.(wr_|*)xt]I");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.QName", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null);
      Object object0 = jDOMNamespacePointer0.clone();
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("m5", "8y");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "m5", (String) null);
      variablePointer0.setIndex(200);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'm5:8y'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "HPOhYZ#H");
      QName qName0 = jDOMNamespacePointer0.getName();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, "HPOhYZ#H");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer1.getNamespaceURI();
      assertNotNull(string0);
      assertEquals("HPOhYZ#H", qName0.toString());
      assertFalse(jDOMNamespacePointer0.equals((Object)jDOMNamespacePointer1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("+@pk2u.p roperti0Des");
      Locale locale0 = new Locale("+@pk2u.p roperti0Des", "+@pk2u.p roperti0Des", "+@pk2u.p roperti0Des");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "<<unknown namespace>>", locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "+@pk2u.p roperti0Des");
      JDOMNamespacePointer jDOMNamespacePointer1 = (JDOMNamespacePointer)jDOMNamespacePointer0.clone();
      JDOMNamespacePointer jDOMNamespacePointer2 = new JDOMNamespacePointer(nodePointer0, "+@pa*u.p SopeIti0Des");
      int int0 = jDOMNamespacePointer1.compareTo(jDOMNamespacePointer2);
      assertEquals(10, int0);
      assertTrue(jDOMNamespacePointer1.equals((Object)jDOMNamespacePointer0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("+@pk2u.p roperti0Des");
      Locale locale0 = new Locale("+@pk2u.p roperti0Des", "+@pk2u.p roperti0Des", "+@pk2u.p roperti0Des");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "<<unknown namespace>>", locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "+@pk2u.p roperti0Des");
      Object object0 = jDOMNamespacePointer0.clone();
      boolean boolean0 = jDOMNamespacePointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "");
      boolean boolean0 = jDOMNamespacePointer0.equals(variablePointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("jxpath.properties");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "true()", "true()");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer0.asPath();
      assertEquals("/namespace::<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("jxpath.properties");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "true()", "true()");
      String string0 = jDOMNamespacePointer0.asPath();
      assertEquals("$jxpath.properties/namespace::true()", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer");
      jDOMNamespacePointer0.printPointerChain();
      assertTrue(jDOMNamespacePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "HPOhYZ#H");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("<e``:FC.(wr_|*)xt]I");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<e``:FC.(wr_|*)xt]I", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.setValue("<<unknown namespace>>");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a namespace
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("jxpath.properties");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "true()", "true()");
      boolean boolean0 = jDOMNamespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("+@pk2u.p roperti0Des");
      Locale locale0 = new Locale("+@pk2u.p roperti0Des", "+@pk2u.p roperti0Des", "+@pk2u.p roperti0Des");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "<<unknown namespace>>", locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "+@pk2u.p roperti0Des");
      Object object0 = jDOMNamespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("jxpath.properties");
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "true()", "true()");
      boolean boolean0 = jDOMNamespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "");
      int int0 = jDOMNamespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      int int0 = jDOMNamespacePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
      assertEquals(0, int0);
  }
}
