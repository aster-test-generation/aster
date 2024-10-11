
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer1, processingInstructionTest0, true, variablePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      dOMNodeIterator0.getNodePointer();
      assertEquals((-1), dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QName qName0 = new QName("", "");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, nodePointer0);
      dOMNodeIterator0.setPosition(1024);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer1, processingInstructionTest0, true, variablePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(variablePointer0, nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("3znLVuS}=QgZ");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(variablePointer0, (NodeTest) null, false, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("vUIs,K}jh");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "]");
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(variablePointer0, nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'vUIs,K}jh'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      Object object0 = new Object();
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, (QName) null, object0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("x&ZM3zu4!0p:hXh88]s");
      DOMNodeIterator dOMNodeIterator0 = null;
      try {
        dOMNodeIterator0 = new DOMNodeIterator(nodePointer1, processingInstructionTest0, false, nodePointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("I\" )");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, true, (NodePointer) null);
      // Undeclared exception!
      try { 
        dOMNodeIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("bRAQ6*Z^;~f|7NsDp");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = new Locale("bRAQ6*Z^;~f|7NsDp", "bRAQ6*Z^;~f|7NsDp");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/2000/xmlns/");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, true, nodePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        dOMNodeIterator0.setPosition(40);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("", "");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, nodePointer0);
      dOMNodeIterator0.setPosition((-1120));
      // Undeclared exception!
      try { 
        dOMNodeIterator0.setPosition(987);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("bRAQ6*Z^;~f|7NsDp");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = new Locale("bRAQ6*Z^;~f|7NsDp", "bRAQ6*Z^;~f|7NsDp");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/2000/xmlns/");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, true, nodePointer0);
      boolean boolean0 = dOMNodeIterator0.setPosition(40);
      assertEquals(1, dOMNodeIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("", "");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, nodePointer0);
      dOMNodeIterator0.setPosition((-1120));
      boolean boolean0 = dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals((-2), dOMNodeIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer1, processingInstructionTest0, true, variablePointer0);
      dOMNodeIterator0.setPosition(Integer.MIN_VALUE);
      boolean boolean0 = dOMNodeIterator0.setPosition((-1));
      assertEquals((-1), dOMNodeIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("n");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, (NodePointer) null);
      dOMNodeIterator0.setPosition(987);
      dOMNodeIterator0.setPosition((-1120));
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("n");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer0, nodeNameTest0, false, (NodePointer) null);
      assertEquals(0, dOMNodeIterator0.getPosition());
      
      dOMNodeIterator0.setPosition(987);
      dOMNodeIterator0.getNodePointer();
      assertEquals(1, dOMNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) iIOMetadataNode0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      DOMNodeIterator dOMNodeIterator0 = new DOMNodeIterator(nodePointer1, processingInstructionTest0, true, variablePointer0);
      int int0 = dOMNodeIterator0.getPosition();
      assertEquals(0, int0);
  }
}
