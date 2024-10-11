
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
      QName qName0 = new QName("org.apache.commons.jxpath.BasicVariables", "org.apache.commons.jxpath.BasicVariables");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex((-297));
      dynamicPropertyPointer0.setPropertyName("K;H~Tf[\u0006");
      assertFalse(dynamicPropertyPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("Y!,t~EOJ3V>|^P");
      String string0 = dynamicPropertyPointer0.getPropertyName();
      assertEquals("Y!,t~EOJ3V>|^P", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.BasicVariables", "org.apache.commons.jxpath.BasicVariables");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex((-297));
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals((-297), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue("<<unknown namespace>>");
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
        dynamicPropertyPointer0.setValue("Y!,t~EOJ3V>|^P");
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("=<P6@gSE:#Kle+C&[z", "=<P6@gSE:#Kle+C&[z");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.setValue(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '=<P6@gSE:#Kle+C&[z:=<P6@gSE:#Kle+C&[z'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("s{2");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 's{2'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("a0g8d");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "a0g8d", (Locale) null);
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
  public void test08()  throws Throwable  {
      QName qName0 = new QName("-k*");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyNames();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: -k*
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
      QName qName0 = new QName("", "");
      Locale locale0 = Locale.PRC;
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
  public void test11()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) null);
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
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
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
      QName qName0 = new QName("text", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: text:
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("java.home", "L8#}c-WnvVi");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) basicVariables0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.BasicVariables cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("lgmYi=1S& P%tKm");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: lgmYi=1S& P%tKm
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
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
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, (DynamicPropertyHandler) null);
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
  public void test20()  throws Throwable  {
      QName qName0 = new QName("Factory cannot define variable '", "Factory cannot define variable '");
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, object0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("", (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("I^17Bu2Eq*R_N!N", "[@name='");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'I^17Bu2Eq*R_N!N:[@name=''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.BasicVariables", "org.apache.commons.jxpath.BasicVariables");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.BasicVariables:org.apache.commons.jxpath.BasicVariables
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null, (Object) mapDynamicPropertyHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("G:ONx", "K--=It0>=d B#XsWdT");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0, (Object) "K--=It0>=d B#XsWdT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'G:ONx:K--=It0>=d B#XsWdT'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer");
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
         // Undefined variable: org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("HdFE7mG21Fr");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'HdFE7mG21Fr'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
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
      QName qName0 = new QName("n-4j 'n");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.asPath();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'n-4j 'n'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
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
  public void test33()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("s{2", "s{2");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 's{2:s{2'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, basicVariables0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
      assertTrue(dynamicPropertyPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("' and '");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyName();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '' and ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
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
        dynamicPropertyPointer0.getPropertyNames();
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
      QName qName0 = new QName("biUA'W~^t'JbUTv");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getBaseValue();
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
      QName qName0 = new QName("/HZc");
      Object object0 = new Object();
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      DynamicPropertyPointer dynamicPropertyPointer1 = new DynamicPropertyPointer(dynamicPropertyPointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("/HZc");
      // Undeclared exception!
      try { 
        dynamicPropertyPointer1.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QName qName0 = new QName("i(@%;ea1@j");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.BasicVariables", "org.apache.commons.jxpath.BasicVariables");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setIndex((-1263));
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.BasicVariables:org.apache.commons.jxpath.BasicVariables
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      QName qName0 = new QName("", "0(");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, "");
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath((JXPathContext) null, (Object) nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      QName qName0 = new QName("", "Cannot create the root object: ");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
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
  public void test43()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.BasicVariables", "org.apache.commons.jxpath.BasicVariables");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setIndex((-1263));
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: org.apache.commons.jxpath.BasicVariables:org.apache.commons.jxpath.BasicVariables
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("&T6.~^", "&T6.~^");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyIndex();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '&T6.~^:&T6.~^'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      QName qName0 = new QName("/HZc");
      Object object0 = new Object();
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyIndex(377);
      int int0 = dynamicPropertyPointer0.getPropertyIndex();
      assertEquals(377, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Index is less than 1: ");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.createPath(jXPathContext0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QName qName0 = new QName("/HZc");
      Object object0 = new Object();
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(nodePointer0, mapDynamicPropertyHandler0);
      DynamicPropertyPointer dynamicPropertyPointer1 = new DynamicPropertyPointer(dynamicPropertyPointer0, mapDynamicPropertyHandler0);
      dynamicPropertyPointer0.setPropertyName("/HZc");
      // Undeclared exception!
      try { 
        dynamicPropertyPointer1.getPropertyCount();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.util.Map
         //
         verifyException("org.apache.commons.jxpath.MapDynamicPropertyHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
  public void test49()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPropertyPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(")pPQP&Pb");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer(variablePointer0, mapDynamicPropertyHandler0);
      // Undeclared exception!
      try { 
        dynamicPropertyPointer0.getPropertyCount();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ')pPQP&Pb'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MapDynamicPropertyHandler mapDynamicPropertyHandler0 = new MapDynamicPropertyHandler();
      DynamicPropertyPointer dynamicPropertyPointer0 = new DynamicPropertyPointer((NodePointer) null, mapDynamicPropertyHandler0);
      boolean boolean0 = dynamicPropertyPointer0.isActualProperty();
      assertTrue(boolean0);
  }
}
