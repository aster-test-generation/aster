
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
import org.apache.commons.jxpath.Variables;
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
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "n68%JH}UE@kGR");
      String string0 = jDOMNamespacePointer0.asPath();
      assertEquals("$/namespace::n68%JH}UE@kGR", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, ")(;G<RVgRPahr@X", "");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeTest");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer");
      Object object0 = jDOMNamespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>", "SQf)]p4;:r;+L),lb\"");
      Object object1 = jDOMNamespacePointer0.getImmediateNode();
      assertEquals("SQf)]p4;:r;+L),lb\"", object1);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, (String) null, (String) null);
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
  public void test05()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "N&+IyiW.");
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
  public void test06()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "");
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
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("`4hY%GT>+kl", ",namespz\"ace::");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "|9r_ kOv.-`e|TqnKAZ");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, (String) null, "\"local-name\"");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer1.equals(jDOMNamespacePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("`4hY%GT>+kl", ",namespz\"ace::");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "|9r_ kOv.-`e|TqnKAZ");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, (String) null, "\"local-name\"");
      String string0 = jDOMNamespacePointer1.getNamespaceURI();
      assertNotNull(string0);
      assertEquals("\"local-name\"", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "namespace::", "namespace::");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, ",nmespace::", "namespace::");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "namespace::", "LUN0n>8%_oJgF]q");
      QName qName0 = jDOMNamespacePointer0.getName();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(variablePointer0, "namespace::");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
      assertTrue(boolean0);
      assertEquals(":", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("0h P");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "0h P");
      boolean boolean0 = jDOMNamespacePointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "namespace::", "LUN0n>8%_oJgF]q");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "*gvAclJ 05A7j 8a~", "*gvAclJ 05A7j 8a~");
      QName qName0 = new QName("*gvAclJ 05A7j 8a~");
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jDOMNamespacePointer0, locale0);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer1.asPath();
      assertEquals("/namespace::<<unknown namespace>>", string0);
      assertFalse(jDOMNamespacePointer1.equals((Object)jDOMNamespacePointer0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "*gvAclJ 05A7j 8a~", "*gvAclJ 05A7j 8a~");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      String string0 = jDOMNamespacePointer1.asPath();
      assertEquals("namespace::*gvAclJ 05A7j 8a~/namespace::<<unknown namespace>>", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "*gvAclJ 05A7j 8a~", "*gvAclJ 05A7j 8a~");
      String string0 = jDOMNamespacePointer0.asPath();
      assertEquals("namespace::*gvAclJ 05A7j 8a~", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "namespace::", "LUN0n>8%_oJgF]q");
      QName qName0 = jDOMNamespacePointer0.getName();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(variablePointer0, "namespace::");
      String string0 = jDOMNamespacePointer1.getNamespaceURI();
      assertEquals("namespace::", qName0.toString());
      assertTrue(jDOMNamespacePointer1.equals((Object)jDOMNamespacePointer0));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "*gvAclJ 05A7j 8a~", "*gvAclJ 05A7j 8a~");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.setValue("*gvAclJ 05A7j 8a~");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a namespace
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "namespace::", "LUN0n>8%_oJgF]q");
      boolean boolean0 = jDOMNamespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "namespace::", "LUN0n>8%_oJgF]q");
      Object object0 = jDOMNamespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "<<unknown namespace>>", "<<unknown namespace>>");
      jDOMNamespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "<<unknown namespace>>", "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("JXPath: found system property", "JXPath: found system property");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null, "id(");
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
  public void test23()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "*gvAclJ 05A7j 8a~", "*gvAclJ 05A7j 8a~");
      int int0 = jDOMNamespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "*gvAclJ 05A7j 8a~", "*gvAclJ 05A7j 8a~");
      int int0 = jDOMNamespacePointer0.compareChildNodePointers(jDOMNamespacePointer0, (NodePointer) null);
      assertEquals(0, int0);
  }
}
