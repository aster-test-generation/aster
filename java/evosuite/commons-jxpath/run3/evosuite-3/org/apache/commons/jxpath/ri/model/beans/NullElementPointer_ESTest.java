
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
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NullElementPointer_ESTest extends NullElementPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 7);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer1.equals(nullElementPointer0);
      assertEquals(7, nullElementPointer0.getIndex());
      assertFalse(boolean0);
      assertFalse(nullElementPointer0.equals((Object)nullElementPointer1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 987);
      nullElementPointer0.getImmediateNode();
      assertEquals(987, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("b,yj(/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) qName0);
      variablePointer0.setAttribute(true);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0, (Object) nullElementPointer0);
      assertNotSame(nodePointer1, nodePointer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("b,yj(/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0, (Object) nullElementPointer0);
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("b,yj(/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) qName0);
      variablePointer0.setAttribute(true);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("b,yj(/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) basicVariables0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      nodePointer0.setIndex(59);
      NodePointer nodePointer1 = nullElementPointer0.createPath(jXPathContext0);
      assertTrue(nodePointer1.isRoot());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, (-2971));
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "?A1vyOo9~N");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) locale0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '?A1vyOo9~N' for path: $?A1vyOo9~N
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-15));
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) nullElementPointer0);
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
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 93);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null, (Object) jXPathContext0);
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("&78C,6R(wv");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) "&78C,6R(wv");
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-28));
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $&78C,6R(wv
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullElementPointer0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("QuNpz:", "QuNpz:");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'QuNpz::QuNpz:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("K{u04|4)XcDn-t.X/J");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "K{u04|4)XcDn-t.X/J");
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nullElementPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create a relative context for a non-existent node: null()[1]
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 93);
      nullElementPointer0.printPointerChain();
      assertEquals(93, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, Integer.MIN_VALUE);
      String string0 = nullElementPointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("b,yj(/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getName();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-344));
      boolean boolean0 = nullElementPointer0.isContainer();
      assertTrue(boolean0);
      assertEquals((-344), nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 95);
      String string0 = nullElementPointer0.asPath();
      assertEquals("$:[96]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QName qName0 = new QName("2[Ph1H,yS3tk");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, 0);
      // Undeclared exception!
      try { 
        nullElementPointer0.setValue(nullElementPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Collection element does not exist: /[1]
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 93);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nullElementPointer0, 0);
      String string0 = nullElementPointer1.toString();
      assertEquals("[94]/.[1]", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 93);
      NullElementPointer nullElementPointer1 = new NullElementPointer((NodePointer) null, 93);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertEquals(93, nullElementPointer1.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, (QName) null, (Object) null);
      NullElementPointer nullElementPointer0 = new NullElementPointer(nodePointer0, (-15));
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertFalse(boolean0);
      assertEquals((-15), nullElementPointer0.getIndex());
      assertFalse(nullElementPointer1.equals((Object)nullElementPointer0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 95);
      boolean boolean0 = nullElementPointer0.equals((Object) null);
      assertEquals(95, nullElementPointer0.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("b,yj(/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-344));
      NodePointer nodePointer0 = nullElementPointer0.getValuePointer();
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, (-344));
      boolean boolean0 = nullElementPointer0.equals(nullElementPointer1);
      assertEquals((-344), nullElementPointer1.getIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      boolean boolean0 = nullElementPointer0.isCollection();
      assertFalse(boolean0);
      assertEquals(0, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, 95);
      nullElementPointer0.hashCode();
      assertEquals(95, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      boolean boolean0 = nullElementPointer0.isLeaf();
      assertTrue(boolean0);
      assertEquals(0, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullElementPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      QName qName0 = new QName("JE2V");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      nullElementPointer0.getBaseValue();
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, "?A1vyOo9~N");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        nullElementPointer0.createPath(jXPathContext0, (Object) locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '?A1vyOo9~N'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-344));
      int int0 = nullElementPointer0.getLength();
      assertEquals((-344), nullElementPointer0.getIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("b,yj(/");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NullElementPointer nullElementPointer0 = new NullElementPointer(variablePointer0, Integer.MIN_VALUE);
      boolean boolean0 = nullElementPointer0.isActual();
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, nullElementPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, 0);
      PropertyPointer propertyPointer0 = nullElementPointer0.getPropertyPointer();
      QName qName0 = new QName("");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(propertyPointer0, qName0, nullElementPointer0);
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, (-1403));
      // Undeclared exception!
      try { 
        nullElementPointer1.createPath((JXPathContext) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path [1]/null[-1402], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NullElementPointer nullElementPointer0 = new NullElementPointer((NodePointer) null, (-344));
      NodePointer nodePointer0 = nullElementPointer0.getValuePointer();
      NullElementPointer nullElementPointer1 = new NullElementPointer(nodePointer0, (-344));
      String string0 = nullElementPointer1.asPath();
      assertEquals("[-343]/.[-343]", string0);
  }
}
