
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NamespaceResolver_ESTest extends NamespaceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      namespaceResolver0.pointer = (NodePointer) variablePointer0;
      String string0 = namespaceResolver0.getPrefix("o10Erq\"");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      String string0 = namespaceResolver1.getExternallyRegisteredNamespaceURI("P@MMuyh'K 8");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      String string0 = namespaceResolver0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getPrefix("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("XHH-K4YdW#?:yOW*n[x", "XHH-K4YdW#?:yOW*n[x");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("XHH-K4YdW#?:yOW*n[x");
      assertEquals("XHH-K4YdW#?:yOW*n[x", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace((String) null, "xF");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI((String) null);
      assertEquals("xF", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("ti5A`", "ti5A`");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("java.util.concurrent.atomic.AtomicLong");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      Object object0 = new Object();
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, object0);
      // Undeclared exception!
      NamespaceResolver.getPrefix(nodePointer1, "AMNz!3'~*_ZWRh}SU");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) namespaceResolver0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("A],>@lzqcWusOt", "A],>@lzqcWusOt");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "Cannot register namespaces on a sealed NamespaceResolver");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'A],>@lzqcWusOt:A],>@lzqcWusOt'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("org.apache.commons.jxpath.ri.NamespaceResolver");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      namespaceResolver0.reverseMap = hashMap0;
      hashMap0.put((Object) null, namespaceResolver0.reverseMap);
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver1.getNamespaceURI("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      namespaceResolver0.reverseMap = hashMap0;
      namespaceResolver0.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredPrefix("1+%8>sPVM!:");
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
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.getExternallyRegisteredNamespaceURI("YXW1");
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
      boolean boolean0 = namespaceResolver0.isSealed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.seal();
      assertTrue(namespaceResolver1.isSealed());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      String string0 = namespaceResolver1.getExternallyRegisteredPrefix(" to ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getPrefix(" to ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("C_MfIK(5NS[79", (String) null);
      String string0 = namespaceResolver0.getPrefix((String) null);
      assertEquals("C_MfIK(5NS[79", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getNamespaceURI("|56/6_8i6h");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "@");
      String string0 = namespaceResolver0.getNamespaceURI("");
      assertEquals("@", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      Pointer pointer0 = namespaceResolver1.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      Pointer pointer0 = namespaceResolver0.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName("l");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      namespaceResolver0.pointer = (NodePointer) variablePointer0;
      VariablePointer variablePointer1 = (VariablePointer)namespaceResolver0.getNamespaceContextPointer();
      assertFalse(variablePointer1.isActual());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("gZj9sb(6'", "gZj9sb(6'");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot register namespaces on a sealed NamespaceResolver
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      String string0 = NamespaceResolver.getPrefix(nodePointer0, "<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter$ValuePointer");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = (NamespaceResolver)namespaceResolver0.clone();
      assertNotSame(namespaceResolver1, namespaceResolver0);
      assertNotNull(namespaceResolver1);
      assertFalse(namespaceResolver1.isSealed());
  }
}
