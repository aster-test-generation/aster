
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


package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.NullElementPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NullElementPointer_ESTest extends NullElementPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-1431));
      NullElementPointer nullElementPointer1 = new NullElementPointer((NodePointer) null, (-292));
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(boolean0);
      assertEquals((-292), nullElementPointer1.getIndex());
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 1818);
      nullElementPointer0.hashCode();
      assertEquals(1818, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      nullElementPointer0.getValuePointer();
      assertEquals(0, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("@cJV9fHO^Bk'bGx", "@cJV9fHO^Bk'bGx");
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) "@cJV9fHO^Bk'bGx");
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      variablePointer0.createPath((JXPathContext) null, (Object) nullElementPointer0);
      NodePointer nodePointer0 = nullElementPointer0.createPath(jXPathContext0, (Object) nullElementPointer0);
      assertEquals(0, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("%");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-73));
      basicVariables0.declareVariable("%", nullElementPointer0);
      assertEquals((-73), nullElementPointer0.getIndex());
      
      NullElementPointer nullElementPointer1 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer1.createPath((JXPathContext) null, (Object) null);
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      String string0 = nullElementPointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("*X+f'f82=");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 1315);
      Object object0 = nullElementPointer0.getImmediateNode();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) nullElementPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $*X+f'f82=
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("}~4!yfo8f", "}~4!yfo8f");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      variablePointer0.createPath(jXPathContext0, (Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '}~4!yfo8f:}~4!yfo8f' for path: $}~4!yfo8f:}~4!yfo8f
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("bL!@pX");
      Locale locale0 = new Locale("bL!@pX");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) locale0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("@cJV9fHO^Bk'bGx", "Collection element does not exist: ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $@cJV9fHO^Bk'bGx:Collection element does not exist: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      variablePointer0.setValue((Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '' for path: $
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-2109));
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "Collection element does not exist: ");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      variablePointer0.setIndex(1103);
      // Undeclared exception!
      try { 
        nullElementPointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$null", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-2109));
      nullElementPointer0.printPointerChain();
      assertEquals((-2109), nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      nullElementPointer0.getName();
      assertEquals(0, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("?9wB_w|df&");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(18);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$?9wB_w|df&[19]/.[2]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("?9wB_w|df&");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 1);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$?9wB_w|df&[2]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 25);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, 25);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer1);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nullElementPointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: [26]/.[26]
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$[1]", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-2109));
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        nullElementPointer1.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Collection element does not exist: [-2108]
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("_ZC2%cVP$u[K", "_ZC2%cVP$u[K");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("_ZC2%cVP$u[G", "_ZC2%cVP$u[G");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 0);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
      assertEquals(Integer.MIN_VALUE, nullElementPointer1.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-2109));
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertEquals((-2109), nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName("_ZC2%cVP$u[G", "_ZC2%cVP$u[G");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer0);
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      Object object0 = new Object();
      boolean boolean0 = nullElementPointer0.equals(object0);
      assertEquals(0, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("_ZC2%cVP$u[G", "_ZC2%cVP$u[G");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 0);
      boolean boolean0 = nullElementPointer0.isCollection();
      assertEquals(0, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-2109));
      boolean boolean0 = nullElementPointer0.isLeaf();
      assertEquals((-2109), nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      nullElementPointer0.getBaseValue();
      assertEquals(0, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "Collection element does not exist: ");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      int int0 = nullElementPointer0.getLength();
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-2109));
      boolean boolean0 = nullElementPointer0.isActual();
      assertEquals((-2109), nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("Collection element does not exist: ", "Collection element does not exist: ");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 0);
      boolean boolean0 = nullElementPointer0.isContainer();
      assertEquals(0, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }
}
