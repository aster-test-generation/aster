
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
      namespaceResolver0.seal();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "P _*o@]^A");
      String string0 = namespaceResolver0.getPrefix("P _*o@]^A");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("t3}m", "t3}m");
      String string0 = namespaceResolver0.getExternallyRegisteredPrefix("t3}m");
      assertEquals("t3}m", string0);
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
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("jr,a");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace((String) null, "{%<O9~bq [-*{>6^[k");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI((String) null);
      assertEquals("{%<O9~bq [-*{>6^[k", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      namespaceResolver0.registerNamespace("", "");
      String string0 = namespaceResolver0.getExternallyRegisteredNamespaceURI("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.namespaceMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("text", "text");
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
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, namespaceResolver0, (Locale) null);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, namespaceResolver0);
      // Undeclared exception!
      NamespaceResolver.getPrefix(nodePointer1, "descendant");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, (QName) null);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "<<unknown namespace>>");
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Sv-`q");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        NamespaceResolver.getPrefix((NodePointer) variablePointer0, "Sv-`q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Sv-`q'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      QName qName0 = new QName(",:!:OG*", ",:!:OG*");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, variablePointer0);
      namespaceResolver0.pointer = nodePointer1;
      // Undeclared exception!
      namespaceResolver0.getPrefix(",:!:OG*");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver1.getPrefix("w.");
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
      QName qName0 = new QName("", "^Jq{F8R|Aw-lyM3NR");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      // Undeclared exception!
      try { 
        namespaceResolver0.getPrefix("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':^Jq{F8R|Aw-lyM3NR'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      namespaceResolver0.namespaceMap = hashMap0;
      hashMap0.put("(lHh}vz)+z9i#mBTu%p", namespaceResolver0);
      // Undeclared exception!
      try { 
        namespaceResolver0.getNamespaceURI("(lHh}vz)+z9i#mBTu%p");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.NamespaceResolver cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      namespaceResolver1.reverseMap = null;
      // Undeclared exception!
      try { 
        namespaceResolver1.getExternallyRegisteredPrefix((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
        namespaceResolver0.getExternallyRegisteredNamespaceURI("");
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
      QName qName0 = new QName("", "jr,a");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      String string0 = NamespaceResolver.getPrefix((NodePointer) variablePointer0, "/@");
      assertNull(string0);
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
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      String string0 = namespaceResolver1.getPrefix(":~0ad");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("/", "P _*o@]^A");
      String string0 = namespaceResolver0.getPrefix("P _*o@]^A");
      assertNotNull(string0);
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      String string0 = namespaceResolver1.getNamespaceURI("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      String string0 = jXPathContext0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.registerNamespace("+r e", "+r e");
      String string0 = namespaceResolver0.getNamespaceURI("+r e");
      assertEquals("+r e", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
      Pointer pointer0 = namespaceResolver1.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      Pointer pointer0 = namespaceResolver0.getNamespaceContextPointer();
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      namespaceResolver0.setNamespaceContextPointer(variablePointer0);
      VariablePointer variablePointer1 = (VariablePointer)namespaceResolver0.getNamespaceContextPointer();
      assertTrue(variablePointer1.isContainer());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      namespaceResolver0.seal();
      // Undeclared exception!
      try { 
        namespaceResolver0.registerNamespace("Cannot register namespaces on a sealed NamespaceResolver", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot register namespaces on a sealed NamespaceResolver
         //
         verifyException("org.apache.commons.jxpath.ri.NamespaceResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      boolean boolean0 = namespaceResolver0.isSealed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      NamespaceResolver namespaceResolver1 = (NamespaceResolver)namespaceResolver0.clone();
      assertFalse(namespaceResolver1.isSealed());
      assertNotSame(namespaceResolver1, namespaceResolver0);
      assertNotNull(namespaceResolver1);
  }
}
