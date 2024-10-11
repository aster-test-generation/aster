
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NamespaceResolver_ESTest extends NamespaceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", (String) null);
      String string0 = namespaceResolver0.getPrefix((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("gK& W", "*[,u1W<<,;jZf{fabnE");
      String string0 = namespaceResolver0.getNamespaceURI("gK& W");
      assertNotNull(string0);
      assertEquals("*[,u1W<<,;jZf{fabnE", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("gK& W");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", "4_?p");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("4_?p");
      assertNotNull(string0);
      assertEquals("JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("9,mB4@<O+x?J");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("org.apache.commons.jxpath.ri.NamespaceResolver", "org.apache.commons.jxpath.ri.NamespaceResolver");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("org.apache.commons.jxpath.ri.NamespaceResolver");
      assertEquals("org.apache.commons.jxpath.ri.NamespaceResolver", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("POINTER: ", "org.apache.commons.jxpath.ri.NamespaceResolver");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, (QName) null, (Object) null);
      // Undeclared exception!
      NamespaceResolver.getPrefix(nodePointer1, "{F#[`H^x?@3s9|a&");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) namespaceResolver0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName((String) null, "");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "\"Jfn,9Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, (QName) null, namespaceResolver0);
      namespaceResolver0.setNamespaceContextPointer(nodePointer1);
      // Undeclared exception!
      namespaceResolver0.getPrefix("<<unknown namespace>>");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("Cannot register namespaces on a sealed NamespaceResolver");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("#C!UGh}{");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getNamespaceURI("pbH_s");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredPrefix("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, NamespaceResolver> hashMap0 = new HashMap<Object, NamespaceResolver>();
      namespaceResolver0.reverseMap = hashMap0;
      hashMap0.put("?x", namespaceResolver0);
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredPrefix("?x");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.NamespaceResolver cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredNamespaceURI("|BP7\"p&U`=~kAHT1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.seal();
      assertTrue(namespaceResolver1.isSealed());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.pointer = nodePointer0;
      String string0 = namespaceResolver1.getPrefix("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getPrefix("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("()", "<<unknown namespace>>");
      String string0 = namespaceResolver0.getPrefix("<<unknown namespace>>");
      assertNotNull(string0);
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.pointer = nodePointer0;
      String string0 = namespaceResolver1.getNamespaceURI("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getNamespaceURI("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      Pointer pointer0 = namespaceResolver1.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      Pointer pointer0 = namespaceResolver0.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.pointer = nodePointer0;
      NullPointer nullPointer0 = (NullPointer)namespaceResolver1.getNamespaceContextPointer();
      assertFalse(nullPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace((String) null, "J#M(\",x<P:f%u3#A4");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot register namespaces on a sealed NamespaceResolver
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) namespaceResolver0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("()", "()");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.createPath(jXPathContext0, (Object) basicVariables0);
      String string0 = NamespaceResolver.getPrefix((NodePointer) variablePointer0, "()");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = (NamespaceResolver)namespaceResolver0.clone();
      assertNotSame(namespaceResolver1, namespaceResolver0);
      assertNotNull(namespaceResolver1);
      assertFalse(namespaceResolver1.isSealed());
  }
}
