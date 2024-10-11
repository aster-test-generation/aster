
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPropertyPointer_ESTest extends DynamicPropertyPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(491);
      dynamicPropertyPointer0.setPropertyIndex(93);
      assertFalse(dynamicPropertyPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      dynamicPropertyPointer0.setPropertyName("<<unknown namespace>>");
      String string0 = dynamicPropertyPointer0.getPropertyName();
      assertEquals("<<unknown namespace>>", string0);
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
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(dynamicPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("m(lo", "m(lo");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'm(lo:m(lo'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("Wb7f8GHS`");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Wb7f8GHS`
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "]h_z@iA");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ']h_z@iA'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
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
  public void test10()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("d3&[\"Blq>");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'd3&[\"Blq>'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("<Pf[[4h", "Y%`?1+i;oMUrWJy2y");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <Pf[[4h:Y%`?1+i;oMUrWJy2y
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("text");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.VariablePointer cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.util.BasicTypeConverter", "&quot;");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.util.BasicTypeConverter:&quot;
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      QName qName0 = new QName("<", "<");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "<", (Locale) null);
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
  public void test17()  throws Throwable  {
      QName qName0 = new QName("$.-");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: $.-
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("TN36mb<", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: TN36mb<:null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Sh I}x\"Vi6|#{");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Sh I}x\"Vi6|#{'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("Y{.(q");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Y{.(q
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, (QName) null, basicVariables0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
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
      QName qName0 = new QName("']");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: ']
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, (DynamicPropertyHandler) null);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) nodePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      BasicVariables basicVariables0 = new BasicVariables();
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, (Locale) null);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null, (Object) basicVariables0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("2", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '2:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("+4E>OQ", "']");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: +4E>OQ:']
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Index is less than 1: ", "bj]=^keA,%:i@U&");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("*Q~2S/Vu[InffD3R}Sg");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertNull(dynamicPropertyPointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("P<{ey", "P<{ey");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, "P<{ey");
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
  public void test38()  throws Throwable  {
      QName qName0 = new QName("C5+Al:8@Cbi6M#=8X;j");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, (DynamicPropertyHandler) null);
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
  public void test39()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      QName qName0 = new QName("']");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, mapDynamicPropertyHandler0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.MapDynamicPropertyHandler cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setIndex(0);
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
  public void test41()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createChild((JXPathContext) null, qName0, 1024, (Object) mapDynamicPropertyHandler0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, (Locale) null);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(mapDynamicPropertyHandler0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("b3rR-aBqgPsvX FG)ua", "/.");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setIndex(0);
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
  public void test46()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("#:+P*7!UvIaMZ&P5");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '#:+P*7!UvIaMZ&P5'
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
  public void test48()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, (DynamicPropertyHandler) null);
      dynamicPropertyPointer0.setPropertyName("<<unknown namespace>>");
      String string0 = dynamicPropertyPointer0.asPath();
      assertEquals("$:[@name='<<unknown namespace>>']", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, (DynamicPropertyHandler) null);
      boolean boolean0 = dynamicPropertyPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QName qName0 = new QName("C5+Al:8@Cbi6M#=8X;j");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, (DynamicPropertyHandler) null);
      boolean boolean0 = dynamicPropertyPointer0.isActualProperty();
      assertTrue(boolean0);
  }
}
