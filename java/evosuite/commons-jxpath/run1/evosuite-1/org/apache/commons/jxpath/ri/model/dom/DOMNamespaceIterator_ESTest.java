
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


package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMNamespaceIterator_ESTest extends DOMNamespaceIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.setPosition(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        dOMNamespaceIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("F+");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("F+");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      dOMNamespaceIterator0.getNodePointer();
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("&G>k(=b;_.*HDmvKQ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: &G>k(=b;_.*HDmvKQ
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator((NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(">q`@dfYOEVFe");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '>q`@dfYOEVFe'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("l&", "l&");
      Locale locale0 = Locale.GERMANY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.QName cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      nodePointer0.createAttribute(jXPathContext0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      boolean boolean0 = dOMNamespaceIterator0.setPosition(1);
      assertEquals(1, dOMNamespaceIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("[bgWW=1JT");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("[bgWW=1JT");
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      boolean boolean0 = dOMNamespaceIterator0.setPosition(1);
      assertEquals(1, dOMNamespaceIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("xmlls");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlls");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.getNodePointer();
      // Undeclared exception!
      try { 
        dOMNamespaceIterator0.getNodePointer();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      nodePointer0.createAttribute(jXPathContext0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      NodePointer nodePointer1 = dOMNamespaceIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("xmlls");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlls");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      iIOMetadataNode0.setAttributeNS("http://www.w3.org/XML/1998/namespace", "http://www.w3.org/XML/1998/namespace", "http://www.w3.org/2000/xmlns/");
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("xmlls");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlls");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) qName0);
      nodePointer0.createAttribute(jXPathContext0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodePointer nodePointer1 = nodePointer0.createAttribute((JXPathContext) null, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer1);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("4;[Q<N1{-<G%");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(0, int0);
  }
}
