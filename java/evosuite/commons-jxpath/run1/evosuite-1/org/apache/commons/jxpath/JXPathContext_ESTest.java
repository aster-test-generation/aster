
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormatSymbols;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.CompiledExpression;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.IdentityManager;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.KeyManager;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContext_ESTest extends JXPathContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      jXPathContext0.setVariables(basicVariables0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.removeAll("B6xl");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      jXPathContext0.getValue("8.<d", class0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("h");
      Locale locale0 = new Locale("h");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      jXPathContext0.setNamespaceContextPointer(nodePointer0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.selectNodes("f");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      assertFalse(jXPathContext0.isLenient());
      
      jXPathContext0.setLenient(true);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, object0);
      assertTrue(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.iteratePointers("V5fh");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.iterate("org.apache.commons.jxpath.JXPathContext");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getValue("\"+\"");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getPrefix("u/EZZ[PhW,|nwM");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.registerNamespace("\"+\"", "");
      jXPathContext0.getPrefix("");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.registerNamespace("", "");
      jXPathContext0.getPrefix("");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getNamespaceURI((String) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getNamespaceContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Locale locale0 = jXPathContext0.getLocale();
      assertNotNull(locale0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      jXPathContext0.setDecimalFormatSymbols("", decimalFormatSymbols0);
      jXPathContext0.getDecimalFormatSymbols("");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getContextBean();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("N", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath N; Cannot set property null()/N, path does not match a changeable location
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("SFFP0ey{Lo{x", decimalFormatSymbols0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'SFFP0ey{Lo{x'. Invalid symbol '{' after: 'SFFP0ey'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) linkedList0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue((String) null, "org.apache.commons.jxpath.ri.model.beans.NullPointer");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectSingleNode("+~>GSt!*YBojX5-<");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '+~>GSt!*YBojX5-<'. Invalid symbol '~' after: '+'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectSingleNode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectNodes("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectNodes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("S8g/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'S8g/'. Syntax error - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers("@y,7;2 ]T.i");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '@y,7;2 ]T.i'. Syntax error after: '@y'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext1.getValue("", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) null);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext1.getValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("TiH=6/J", class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("<<unknown namespace>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '<<unknown namespace>>'. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "9a*");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: $9a*
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext((Pointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("org.apache.commons.jxpath.ri.model.beans.NullPointer");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No pointer for xpath: org.apache.commons.jxpath.ri.model.beans.NullPointer
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.US;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("Q", "Q");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath Q; Cannot set property: /Q - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("F$vX}2)", decimalFormatSymbols0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'F$vX}2)'. Syntax error after: 'F'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      Object object0 = new Object();
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, object0);
      // Undeclared exception!
      try { 
        jXPathContext1.createPathAndSetValue((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("uyw<h");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath uyw<h; JXPath can only create a path if it uses exclusively the child:: and attribute:: axes and has no context-dependent predicates
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathContext0.createPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = "(<dbFVJ\\u";
      // Undeclared exception!
      JXPathContext.compile(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContext.compile("<<unknown namespace>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '<<unknown namespace>>'. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContext.compile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) decimalFormatSymbols0);
      boolean boolean0 = jXPathContext1.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("Jxv.:G");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath Jxv.:G; Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = new Locale("Cannot create collection of type: ", "b]y{");
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        jXPathContext0.getNodeSetByKey("", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByKey("Yv&U+x=a'Z", "Yv&U+x=a'Z");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("T)q5)*a", "T)q5)*a");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(nodePointer0);
      jXPathContext1.getKeyManager();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.getKeyManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByID("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("Cannot find an element by ID - no IdentityManager has been specified", decimalFormatSymbols0);
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(variablePointer0);
      jXPathContext1.getIdentityManager();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.getIdentityManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      List list0 = jXPathContext0.selectNodes("4");
      assertFalse(jXPathContext0.isLenient());
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CompiledExpression compiledExpression0 = JXPathContext.compile("org.apache.commons.jxpath.JXPathContext");
      CompiledExpression compiledExpression1 = JXPathContext.compile("org.apache.commons.jxpath.JXPathContext");
      assertNotSame(compiledExpression1, compiledExpression0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      Object object0 = jXPathContext1.selectSingleNode(" z9H|25");
      assertFalse(jXPathContext1.isLenient());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", "e4Yv+\"#'lKM");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jXPathContext0, locale0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(nodePointer0);
      jXPathContext1.getDecimalFormatSymbols("");
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getDecimalFormatSymbols("Yv&U+x=a'Z");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("T)q5)*a", "T)q5)*a");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(nodePointer0);
      jXPathContext1.getFactory();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.getFactory();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable("Cannot find an element by ID - no IdentityManager has been specified", decimalFormatSymbols0);
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(variablePointer0);
      Functions functions0 = jXPathContext1.getFunctions();
      assertNull(functions0);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Functions functions0 = jXPathContext0.getFunctions();
      jXPathContext0.setFunctions(functions0);
      Functions functions1 = jXPathContext0.getFunctions();
      assertNotNull(functions1);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.getVariables();
      Variables variables0 = jXPathContext0.getVariables();
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(variables0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Object object0 = jXPathContext0.getContextBean();
      assertNotNull(object0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.setFactory((AbstractFactory) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.setIdentityManager((IdentityManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.setLenient(true);
      NullPropertyPointer nullPropertyPointer0 = (NullPropertyPointer)jXPathContext0.getPointer("preserve");
      assertEquals(0, nullPropertyPointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Locale locale0 = Locale.KOREAN;
      jXPathContext0.setLocale(locale0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) decimalFormatSymbols0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      assertNotNull(jXPathContext2);
      assertFalse(jXPathContext2.isLenient());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.setKeyManager((KeyManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getParentContext();
      assertFalse(jXPathContext0.isLenient());
  }
}
