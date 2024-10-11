
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
import org.apache.commons.jxpath.JXPathContext;
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
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "", (String) null);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, "", "");
      jDOMNamespacePointer1.printPointerChain();
      assertFalse(jDOMNamespacePointer1.isContainer());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName(",fr)pJUX49I4=OTejx");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "+|(G&X#t]~U");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName(",fr)pJUX49I4=OTejx");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName(",fr)pJUX49I4=OTejx");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "");
      Object object0 = jDOMNamespacePointer0.getImmediateNode();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, ";$rPLAG\"/");
      String string0 = jDOMNamespacePointer0.asPath();
      assertEquals("namespace::;$rPLAG\"/", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, (String) null, (String) null);
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
  public void test06()  throws Throwable  {
      QName qName0 = new QName("y#EfX)yO|Uuj$Z.Uc{V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(variablePointer0, "", ",cw!");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "rM", "Xz3P1?/\"<b");
      String string0 = jDOMNamespacePointer0.getNamespaceURI();
      assertEquals("Xz3P1?/\"<b", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "x^6R)FYoxGdCI,");
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
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "", (String) null);
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, "", "");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
      assertTrue(jDOMNamespacePointer1.equals((Object)jDOMNamespacePointer0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("}3UN?/tt", "d#MP ?d?5;@#'");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(nodePointer0, "<<unknown namespace>>");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, "");
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer1);
      assertFalse(boolean0);
      assertFalse(jDOMNamespacePointer1.equals((Object)jDOMNamespacePointer0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "", (String) null);
      boolean boolean0 = jDOMNamespacePointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "", (String) null);
      boolean boolean0 = jDOMNamespacePointer0.equals(jDOMNamespacePointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, ";$rPAG\"/");
      JDOMNamespacePointer jDOMNamespacePointer1 = new JDOMNamespacePointer(jDOMNamespacePointer0, ";$rPAG\"/");
      jDOMNamespacePointer1.printPointerChain();
      assertNotSame(jDOMNamespacePointer1, jDOMNamespacePointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "a=y<W%D?~wu", "org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
      QName qName0 = jDOMNamespacePointer0.getName();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jDOMNamespacePointer0);
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.createChild(jXPathContext0, qName0, (-4903), (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path namespace::a=y<W%D?~wu/a=y<W%D?~wu[-4902], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "", (String) null);
      Object object0 = jDOMNamespacePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("d", "d");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        jDOMNamespacePointer0.setValue(jDOMNamespacePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a namespace
         //
         verifyException("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("d", "d");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName(":");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, ":", "<<unknown namespace>>");
      Object object0 = jDOMNamespacePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer((NodePointer) null, "namespace::");
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
  public void test20()  throws Throwable  {
      QName qName0 = new QName(":");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, ":", "<<unknown namespace>>");
      jDOMNamespacePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName(":");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, ":", "<<unknown namespace>>");
      boolean boolean0 = jDOMNamespacePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Cannot modify a namespace", "Cannot modify a namespace");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, (String) null, "<<unknown namespace>>");
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
      QName qName0 = new QName("d", "d");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, "<<unknown namespace>>", "<<unknown namespace>>");
      int int0 = jDOMNamespacePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName(":");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JDOMNamespacePointer jDOMNamespacePointer0 = new JDOMNamespacePointer(variablePointer0, ":", "<<unknown namespace>>");
      int int0 = jDOMNamespacePointer0.compareChildNodePointers(jDOMNamespacePointer0, variablePointer0);
      assertEquals(0, int0);
  }
}
