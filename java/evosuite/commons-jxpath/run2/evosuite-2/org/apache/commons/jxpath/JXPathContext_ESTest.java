
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.FunctionLibrary;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.IdentityManager;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.KeyManager;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.JXPathCompiledExpression;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContext_ESTest extends JXPathContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.setNamespaceContextPointer((Pointer) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      jXPathContext2.removePath("Jjn yqg37d_tBl");
      assertFalse(jXPathContext2.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "YO1");
      jXPathContext0.removeAll("YO1");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.selectSingleNode("\"false\"");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iteratePointers(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      Iterator iterator0 = jXPathContext2.iteratePointers("F");
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.iteratePointers("xml");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iterate(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      Iterator iterator0 = jXPathContext2.iterate("org.apache.commons.jxpath.JXPathContextFactory");
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.iterate("n");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Object) null).when(jXPathContext0).getValue(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      Object object0 = jXPathContext2.getValue("<<unknown namespace>>");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn("<<unknown namespace>>").when(jXPathContext0).getValue(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      Object object0 = jXPathContext2.getValue("<<unknown namespace>>");
      assertEquals("<<unknown namespace>>", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Locale locale0 = Locale.CHINA;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) class0);
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathAbstractFactoryException");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, jXPathContext0, locale0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(nodePointer0);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getPrefix("uj*");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.registerNamespace("", "");
      jXPathContext0.getPrefix("");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      Pointer pointer0 = jXPathContext2.getPointer("*qp|L)yl");
      assertNull(pointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      assertFalse(jXPathContext2.isLenient());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getNamespaceURI("");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getNamespaceContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getContextBean();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = (JXPathCompiledExpression)JXPathContext.compile("P");
      assertEquals("P", jXPathCompiledExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("true()", (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath true(); Cannot set value for xpath: true()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("Namespace registration is not implemented by ", decimalFormatSymbols0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'Namespace registration is not implemented by '. Syntax error after: 'N'
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
        jXPathContext0.setValue((String) null, decimalFormatSymbols0);
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
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      jXPathContext0.selectSingleNode("(");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      jXPathContext0.selectSingleNode("id(");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iteratePointers(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      // Undeclared exception!
      try { 
        jXPathContext2.selectNodes("<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
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
  public void test29()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath(" of ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath  of ; No pointer for xpath:  of 
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("5Q|mngmq&uS=");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '5Q|mngmq&uS='. Syntax error after: '5'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test32()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
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
  public void test33()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll((String) null);
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
      Locale locale0 = new Locale(".~g:Y'l2c{p");
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers(".~g:Y'l2c{p");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '.~g:Y\\'l2c{p'. Invalid symbol '~' after: '.'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test36()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "4ka5Hf/bi_'<&e");
      // Undeclared exception!
      try { 
        jXPathContext0.iterate("J0&xC%!,N89pMi77");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'J0&xC%!,N89pMi77'. Invalid symbol '&' after: 'J0'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("I", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: I
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("\"namespace::\"", class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
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
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.QName", ";_<90q");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.QName:;_<90q
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = Locale.US;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
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
  public void test43()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("<mVwfD");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '<mVwfD'. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test46()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("lib", jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath lib; Cannot set property: ''/lib - no such property
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.EvalContext");
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("org.apache.commons.jxpath.ri.compiler.NameAttributeTest");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.ri.compiler.NameAttributeTest; Factory is not set on the JXPathContext - cannot create path: /org.apache.commons.jxpath.ri.compiler.NameAttributeTest
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("Mh$^98_{:um^A`Rtt#");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'Mh$^98_{:um^A`Rtt#'. Invalid symbol '^' after: 'Mh$'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      JXPathContext.compile("(");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      boolean boolean0 = jXPathContext0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) "Namespace registration is not implemented by ");
      Locale locale0 = jXPathContext1.getLocale();
      assertNotNull(locale0);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Locale locale0 = jXPathContext0.getLocale();
      assertNotNull(locale0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getNodeSetByKey("uI]-uBh,Biw,", "uI]-uBh,Biw,");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByKey("Og+Dk", "<<unknown namespace>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) decimalFormatSymbols0);
      jXPathContext1.getKeyManager();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getKeyManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByID((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getIdentityManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "4ka5Hf/bi_'<&e");
      jXPathContext0.selectNodes("2");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "4ka5Hf/bi_'<&e");
      jXPathContext0.selectNodes("J");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      Object object0 = jXPathContext2.selectSingleNode("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        JXPathContext.compile("; ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: '; '. Invalid symbol ';' at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.setLenient(false);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("org.apache.commons.jxpath.JXPathContextFactory");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.JXPathContextFactory
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      DecimalFormatSymbols decimalFormatSymbols0 = jXPathContext1.getDecimalFormatSymbols("lib");
      assertNull(decimalFormatSymbols0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "40V.k.*@'3FZf");
      jXPathContext0.getDecimalFormatSymbols("}k");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      HashMap<DecimalFormatSymbols, DecimalFormatSymbols> hashMap0 = new HashMap<DecimalFormatSymbols, DecimalFormatSymbols>();
      jXPathContext0.decimalFormats = hashMap0;
      jXPathContext0.getDecimalFormatSymbols("Cannot invoke extension function ");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      jXPathContext0.setDecimalFormatSymbols("im/TT%", decimalFormatSymbols0);
      jXPathContext0.setDecimalFormatSymbols("UNKNOWN", decimalFormatSymbols0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) "Namespace registration is not implemented by ");
      jXPathContext1.getFactory();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "4ka5Hf/bi_'<&e");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) "4ka5Hf/bi_'<&e");
      Functions functions0 = jXPathContext1.getFunctions();
      assertFalse(jXPathContext1.isLenient());
      assertNull(functions0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "#s,c:j`M!B?spehwH-");
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      jXPathContext0.setFunctions(functionLibrary0);
      jXPathContext0.getFunctions();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "4ka5Hf/bi_'<&e");
      Functions functions0 = jXPathContext0.getFunctions();
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(functions0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getVariables();
      Variables variables0 = jXPathContext0.getVariables();
      assertNotNull(variables0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      jXPathContext1.getIdentityManager();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Object object0 = jXPathContext0.getContextBean();
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.setFactory((AbstractFactory) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      // Undeclared exception!
      try { 
        jXPathContext2.registerNamespace("(4NM~ g[bz=wR-Xt", "j'j3=NDfbi{lA\"d");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$1543887988
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      // Undeclared exception!
      try { 
        jXPathContext2.getNamespaceURI("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$1543887988
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.setIdentityManager((IdentityManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      Locale locale0 = Locale.US;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.setLocale(locale0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      BasicVariables basicVariables0 = new BasicVariables();
      jXPathContext0.setVariables(basicVariables0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      // Undeclared exception!
      try { 
        jXPathContext2.getPrefix("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$1543887988
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.parentContext;
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      // Undeclared exception!
      try { 
        jXPathContext2.setNamespaceContextPointer(variablePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$1543887988
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.setKeyManager((KeyManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "40V.k.*@'3FZf");
      jXPathContext0.getParentContext();
      assertFalse(jXPathContext0.isLenient());
  }
}
