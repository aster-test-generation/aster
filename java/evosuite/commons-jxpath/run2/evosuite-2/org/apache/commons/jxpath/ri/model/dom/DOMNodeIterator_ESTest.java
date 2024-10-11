
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
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMNodeIterator_ESTest extends DOMNodeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QName qName0 = new QName("");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, nodePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      dOMNodeIterator0.getNodePointer();
      assertEquals((-1), dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("/h_VHXA'Xi%x", (String) null);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, true, (NodePointer) null);
      dOMNodeIterator0.setPosition(6);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("IJ^Wl1{}0QVQ");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("L^");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Cannot invoke extension function ");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, processingInstructionTest0, true, nodePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("\\]`j&voznQu>p(?", "\\]`j&voznQu>p(?");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("\\]`j&voznQu>p(?");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, (NodePointer) null);
      // Undeclared exception!
      dOMNodeIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("K2uBuqjSY:.:A");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: K2uBuqjSY:.:A
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator((NodePointer) null, (NodeTest) null, true, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("a{:#O2z*StW");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("3vo");
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(variablePointer0, processingInstructionTest0, false, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'a{:#O2z*StW'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator");
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.JXPathContextReferenceImpl cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("\\]`&voznQu>p(?", (String) null);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, (NodePointer) null);
      boolean boolean0 = dOMNodeIterator0.setPosition(0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("IJ^Wl1{}0QVQ");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("L^");
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Cannot invoke extension function ");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, processingInstructionTest0, true, nodePointer0);
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("\\]`j&voznQu>p(?", "\\]`j&voznQu>p(?");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("\\]`j&voznQu>p(?");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, (NodePointer) null);
      boolean boolean0 = dOMNodeIterator0.setPosition(2394);
      assertEquals(2, dOMNodeIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("IJ^Wl1{}0QVXQ");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("IJ^Wl1{}0QVXQ");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("IJ^Wl1{}0QVXQ");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, processingInstructionTest0, false, nodePointer0);
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("\\]`j&voznQu>p(?", "\\]`j&voznQu>p(?");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, false, (NodePointer) null);
      dOMNodeIterator0.setPosition(2);
      assertEquals(2, dOMNodeIterator0.getPosition());
      
      boolean boolean0 = dOMNodeIterator0.setPosition((-463));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("\\]`j&voznQu>p(?", "\\]`j&voznQu>p(?");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("\\]`j&voznQu>p(?");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, (NodePointer) null);
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
      
      boolean boolean0 = dOMNodeIterator0.setPosition(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("\\]`j&voznQu>p(?", "\\]`j&voznQu>p(?");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("\\]`j&voznQu>p(?");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, (NodeTest) null, true, (NodePointer) null);
      dOMNodeIterator0.getNodePointer();
      // Undeclared exception!
      try { 
        dOMNodeIterator0.setPosition(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      QName qName0 = new QName("/h_VHXA'Xi%x", (String) null);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, true, (NodePointer) null);
      assertEquals(0, dOMNodeIterator0.getPosition());
      
      dOMNodeIterator0.setPosition(6);
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("\\]`j&voznQu>p(?");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, (NodePointer) null);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("\\]`j&voznQu>p(?");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, iIOMetadataNode0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, (NodePointer) null);
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodeIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }
}
