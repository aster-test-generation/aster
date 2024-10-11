
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
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
      QName qName0 = new QName("ck$bff9p.Z`(K");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("=xW?/ATLyr");
      Locale locale0 = Locale.ROOT;
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
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("xmlns");
      iIOMetadataNode1.appendChild(iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory", "/E1t6q5");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("JXPath: loaded from services: ");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.setPosition(263);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(263, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathContextFactory", "/E1t6q5");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("JXPath: loaded from services: ");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      dOMNamespaceIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("4Hx=qeSc6}v", "4Hx=qeSc6}v");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 4Hx=qeSc6}v:4Hx=qeSc6}v
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = null;
      try {
        dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("\"id\"");
      Locale locale0 = Locale.PRC;
      iIOMetadataNode0.setAttribute("xmlns", "xmlns");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      
      boolean boolean0 = dOMNamespaceIterator0.setPosition(1);
      assertEquals(1, dOMNamespaceIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("p");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
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
      QName qName0 = new QName("xlnms");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xlnms");
      Locale locale0 = Locale.PRC;
      iIOMetadataNode0.setAttribute("xlnms", "xlnms");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      iIOMetadataNode0.setAttributeNS("xmlns", "http://www.w3.org/2000/xmlns/", "xmlns");
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      assertEquals(0, dOMNamespaceIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      nodePointer0.createAttribute(jXPathContext0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      NodePointer nodePointer1 = dOMNamespaceIterator0.getNodePointer();
      assertEquals(0, dOMNamespaceIterator0.getPosition());
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.createAttribute(jXPathContext0, qName0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer1);
      boolean boolean0 = dOMNamespaceIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, dOMNamespaceIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("xmlns");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
      Locale locale0 = Locale.PRC;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("p");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      DOMNamespaceIterator dOMNamespaceIterator0 = new DOMNamespaceIterator(nodePointer0);
      int int0 = dOMNamespaceIterator0.getPosition();
      assertEquals(0, int0);
  }
}
