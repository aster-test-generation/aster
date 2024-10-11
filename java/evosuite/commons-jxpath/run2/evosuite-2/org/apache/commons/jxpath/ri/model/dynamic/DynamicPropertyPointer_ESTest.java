
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


package org.apache.commons.jxpath.ri.model.dynamic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.MapDynamicPropertyHandler;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPropertyPointer_ESTest extends DynamicPropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex((byte)20);
      dynamicPropertyPointer0.setPropertyName("");
      assertNull(dynamicPropertyPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("xG05(,lHz:E");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("`Q");
      String string0 = dynamicPropertyPointer0.getPropertyName();
      assertEquals("`Q", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("");
      String string0 = dynamicPropertyPointer0.getPropertyName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(3);
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex((-6));
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals((-6), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("7Hnl.JS", "7Hnl.JS");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 7Hnl.JS:7Hnl.JS
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(mapDynamicPropertyHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable(" could not create an object for path: ", " could not create an object for path: ");
      QName qName0 = new QName(" could not create an object for path: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(mapDynamicPropertyHandler0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeTest");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.compiler.NodeTest
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <<unknown namespace>>
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("[@name='");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '[@name=''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("", "GH)0,'GKqW");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :GH)0,'GKqW
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.US;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("\"rJ>>[?8~", "\"rJ>>[8~");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: \"rJ>>[?8~:\"rJ>>[8~
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      variablePointer0.createPath(jXPathContext0, (Object) "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter", "5Ox7A(6!K}Px<?V?|");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.util.BasicTypeConverter:5Ox7A(6!K}Px<?V?|
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")", ")");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '):)'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("-5I@zR", "^q!|Gs ICn@D~SR7:?w");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.BasicVariables cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      QName qName0 = new QName("B*I");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: B*I
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("eHKfDkcDi!jS]");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, variablePointer0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.VariablePointer cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null, (Object) "org.apache.commons.jxpath.ri.compiler.NodeTypeTest");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.ri.compiler.NodeTypeTest
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("$'#E(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("v6Y@o7PW'UvJ9-9kO=X");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "v6Y@o7PW'UvJ9-9kO=X");
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) "v6Y@o7PW'UvJ9-9kO=X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'v6Y@o7PW'UvJ9-9kO=X'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("4eLGu&$I(_G", "4eLGu&$I(_G");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 4eLGu&$I(_G:4eLGu&$I(_G
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("true()");
      Locale locale0 = Locale.forLanguageTag("");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      QName qName0 = new QName("", "GH)0,'GKqW");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertTrue(dynamicPropertyPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, (QName) null, basicVariables0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.BasicVariables cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, mapDynamicPropertyHandler0, locale0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) jXPathContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.MapDynamicPropertyHandler cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("xG05(,lHz:E");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createChild((JXPathContext) null, qName0, 1246, (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(" could not create an object for path: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(mapDynamicPropertyHandler0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ' could not create an object for path: '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(0);
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      basicVariables0.declareVariable(" could not create an object for path: ", " could not create an object for path: ");
      QName qName0 = new QName(" could not create an object for path: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      QName qName0 = new QName("xG05(,lHz:E");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("`Q");
      String string0 = dynamicPropertyPointer0.asPath();
      assertEquals("/.[@name='`Q']", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("&tR`-?cA");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '&tR`-?cA'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("&tR`-?cA");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      boolean boolean0 = dynamicPropertyPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("7C.tK8", "7C.tK8");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '7C.tK8:7C.tK8'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPropertyPointer0.isActualProperty();
      assertTrue(boolean0);
  }
}
