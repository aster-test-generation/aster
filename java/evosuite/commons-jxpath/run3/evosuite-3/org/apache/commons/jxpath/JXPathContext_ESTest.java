
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
import java.util.Iterator;
import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.ClassFunctions;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContext_ESTest extends JXPathContext_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.removeAll("F");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("", "'&j,@G0ML0LX6:m<Ja");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      jXPathContext0.setNamespaceContextPointer(variablePointer0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.registerNamespace("DR9jl5mT?|TgNmG", "Namespace registration is not implemented by ");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.selectSingleNode("\"self::\"");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.iteratePointers("rm");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iterate(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Iterator iterator0 = jXPathContext2.iterate("PrOEH[%BZ|Wo,Um}");
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jxpath.properties");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) evoSuiteFile0);
      jXPathContext0.iterate("org.apache.commons.jxpath.JXPathContext");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      boolean boolean0 = jXPathContext0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "= ");
      jXPathContext0.getValue("\"position\"");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, decimalFormatSymbols0, locale0);
      JXPathContext jXPathContext1 = jXPathContext0.getRelativeContext(nodePointer0);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      String string0 = jXPathContext1.getPrefix("hhjP+i{#-D.Ghwm");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) decimalFormatSymbols0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      assertFalse(jXPathContext2.isLenient());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getNamespaceURI("^~6");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      jXPathContext0.getContextPointer();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Object object0 = jXPathContext0.getContextBean();
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JXPathCompiledExpression jXPathCompiledExpression0 = (JXPathCompiledExpression)JXPathContext.compile("org.apache.commons.jxpath.JXPathContext");
      assertEquals("org.apache.commons.jxpath.JXPathContext", jXPathCompiledExpression0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("true()", "true()");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to set value with xpath true(); Cannot set value for xpath: true()
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Locale locale0 = Locale.forLanguageTag("");
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      // Undeclared exception!
      try { 
        jXPathContext0.setValue("", decimalFormatSymbols0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Pointer pointer0 = jXPathContext0.getNamespaceContextPointer();
      // Undeclared exception!
      try { 
        jXPathContext0.setValue((String) null, pointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectSingleNode("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
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
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.selectNodes("bS0l*|!^-9");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'bS0l*|!^-9'. Invalid symbol '^' after: 'bS0l*|!'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Iterator) null).when(jXPathContext0).iteratePointers(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.selectNodes("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
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
  public void test24()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("L1");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath L1; No pointer for xpath: L1
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("Factory is not set on the JXPathContext - cannot create path: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'Factory is not set on the JXPathContext - cannot create path: '. Syntax error after: 'F'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.removeAll("POINTER: ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'POINTER: '. Syntax error after: 'POINTER:'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
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
  public void test29()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.iteratePointers("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
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
  public void test31()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.iterate("processing-instruction('");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'processing-instruction(\\''. Invalid symbol '\\'' - expression incomplete
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<Object> class0 = Object.class;
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
  public void test34()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("\"@\"", class0);
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
        jXPathContext0.getValue("yv18Zxt:LX>%c~");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'yv18Zxt:LX>%c~'. Invalid symbol '%' after: 'yv18Zxt:LX>'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
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
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        jXPathContext1.getRelativeContext(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContext", "");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("TX8z`vtf+zvzu");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'TX8z`vtf+zvzu'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointer("JXPath: found system property");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: 'JXPath: found system property'. Syntax error after: 'JXPath: f'
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ")+L2EO^`");
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
      Locale locale0 = new Locale("", "&WFY$['RfhP+E(z1L", "");
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
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
  public void test43()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPathAndSetValue((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
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
  public void test45()  throws Throwable  {
      // Undeclared exception!
      JXPathContext.compile("Q(z9>_V");
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
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
  public void test47()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) decimalFormatSymbols0);
      jXPathContext1.parentContext.getKeyManager();
      assertFalse(jXPathContext1.isLenient());
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getDecimalFormatSymbols("I L8g qO)jSc");
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "= ");
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) "= ");
      Locale locale0 = jXPathContext1.getLocale();
      assertNotNull(locale0);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.getNodeSetByKey("V5S%AOZ31/&q", "V5S%AOZ31/&q");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByKey("Ah{eUv`Jc'F!ZJ5", "I L8g qO)jSc");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      KeyManager keyManager0 = jXPathContext1.getKeyManager();
      assertNull(keyManager0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jxpath.properties");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) evoSuiteFile0);
      // Undeclared exception!
      try { 
        jXPathContext0.getPointerByID("<(iUnX^C+WmlY");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      jXPathContext1.getIdentityManager();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getIdentityManager();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      doReturn((Pointer) null).when(jXPathContext0).getPointer(anyString());
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      Object object0 = jXPathContext2.selectSingleNode("<<unknown namespace>>");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      Class<DecimalFormatSymbols> class0 = DecimalFormatSymbols.class;
      // Undeclared exception!
      try { 
        jXPathContext1.getValue("SVjU", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: SVjU
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      DecimalFormatSymbols decimalFormatSymbols0 = jXPathContext1.getDecimalFormatSymbols("BUlD7]Pq>");
      assertNull(decimalFormatSymbols0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      jXPathContext1.setDecimalFormatSymbols("(MDfquI}<aR/", (DecimalFormatSymbols) null);
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      jXPathContext1.getFactory();
      assertFalse(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      // Undeclared exception!
      try { 
        jXPathContext0.createPath("org.apache.commons.jxpath.JXPathContext");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to create xpath org.apache.commons.jxpath.JXPathContext; Factory is not set on the JXPathContext - cannot create path: /org.apache.commons.jxpath.JXPathContext
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Functions functions0 = jXPathContext0.getFunctions();
      assertNotNull(functions0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "Factory is not set on the JXPathContext - cannot create path: ");
      jXPathContext0.setFunctions(classFunctions0);
      jXPathContext0.getFunctions();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      Functions functions0 = jXPathContext1.getFunctions();
      assertNull(functions0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      jXPathContext0.getVariables();
      Variables variables0 = jXPathContext0.getVariables();
      assertFalse(jXPathContext0.isLenient());
      assertNotNull(variables0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        JXPathContext.compile("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid XPath: ''. Syntax error at the beginning of the expression
         //
         verifyException("org.apache.commons.jxpath.ri.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.getContextBean();
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.setFactory((AbstractFactory) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      jXPathContext0.setIdentityManager((IdentityManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      assertFalse(jXPathContext0.isLenient());
      
      jXPathContext0.setLenient(true);
      assertTrue(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = jXPathContext0.getLocale();
      assertNotNull(locale0);
      
      jXPathContext0.setLocale(locale0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      BasicVariables basicVariables0 = new BasicVariables();
      jXPathContext0.setVariables(basicVariables0);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "lb^J )&!w%K!");
      jXPathContext0.setKeyManager((KeyManager) null);
      assertFalse(jXPathContext0.isLenient());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JXPathContext jXPathContext0 = mock(JXPathContext.class, CALLS_REAL_METHODS);
      JXPathContext jXPathContext1 = JXPathContext.newContext(jXPathContext0, (Object) jXPathContext0);
      JXPathContext jXPathContext2 = jXPathContext1.getParentContext();
      // Undeclared exception!
      try { 
        jXPathContext2.getNamespaceContextPointer();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Namespace registration is not implemented by class org.apache.commons.jxpath.JXPathContext$MockitoMock$478087712
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) decimalFormatSymbols0);
      jXPathContext0.getParentContext();
      assertFalse(jXPathContext0.isLenient());
  }
}
