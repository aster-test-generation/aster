
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
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMNodePointer_ESTest extends DOMNodePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("org.apache.commons.jxpath.util.TypeUtils$1");
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode1);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, (Locale) null);
      String string0 = dOMNodePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      QName qName0 = dOMNodePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "'>[Q;SKdgh");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
      assertTrue(boolean0);
      assertEquals("'>[Q;SKdgh", nodeNameTest0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      boolean boolean0 = dOMNodePointer0.isLanguage("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.util.TypeUtils$1");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals("org.apache.commons.jxpath.util.TypeUtils$1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "");
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertSame(iIOMetadataNode0, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      Object object0 = dOMNodePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      String string0 = DOMNodePointer.findEnclosingAttribute(iIOMetadataNode0, "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4437);
      NodeIterator nodeIterator0 = dOMNodePointer0.childIterator(nodeTypeTest0, true, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("id('", "xml");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        DOMNodePointer.testNode((Node) null, (NodeTest) nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "kqKGfax2R:ou'JFuK+");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        dOMNodePointer0.testNode((NodeTest) processingInstructionTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "org.apache.commons.jxpath.JXPathInvalidAccessException");
      // Undeclared exception!
      try { 
        dOMNodePointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "=$;% em");
      // Undeclared exception!
      try { 
        dOMNodePointer0.namespaceIterator();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "java.util.Locale@0000000014");
      // Undeclared exception!
      try { 
        dOMNodePointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("http://www.w3.org/XML/1998/namespace", (String) null);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, (Locale) null);
      // Undeclared exception!
      try { 
        nodePointer0.isLanguage("k&O*,:&=oGws,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try { 
        DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, (Locale) null);
      // Undeclared exception!
      dOMNodePointer0.getNamespaceURI("org.apache.commons.jxpath.ri.model.VariablePointer");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getNamespaceURI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      // Undeclared exception!
      try { 
        dOMNodePointer0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      QName qName0 = dOMNodePointer0.getName();
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild((JXPathContext) null, qName0, 0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = new QName("");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, 2866);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, (Locale) null);
      Locale locale0 = Locale.KOREAN;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      QName qName0 = new QName("3${Y;EWxmf\"UK%6N", "3${Y;EWxmf\"UK%6N");
      // Undeclared exception!
      dOMNodePointer0.createAttribute(jXPathContext0, qName0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "{LM)");
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("xmlns", "xmlns");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "sqEaD|\"P.QA");
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'xmlns:xmlns'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("http://www.w3.org/XML/1998/namespace");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, processingInstructionTest0, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.KOREAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((byte)91);
      QName qName0 = new QName("http://www.w3.org/2000/xmlns/", "http://www.w3.org/2000/xmlns/");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, dOMNodePointer0, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeTypeTest0, true, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.dom.DOMNodePointer cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, (String) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.asPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      Object object0 = dOMNodePointer0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try { 
        DOMNodePointer.getLocalName(iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try { 
        DOMNodePointer.getPrefix(iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer1.asPath();
      assertEquals("id('rRdLo^)|p4U!k')/rRdLo^)|p4U!k[1]", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      String string0 = dOMNodePointer0.asPath();
      assertEquals("id('')", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = new Locale("2YE{T", "2YE{T", "2YE{T");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
      QName qName0 = new QName("JXPath iterators cannot remove nodes", "44nN<|>F>ZS_^P<g.r");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "vy7Ilh3C53XTZ&?");
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      dOMNodePointer0.getNamespaceURI("org.apache.commons.jxpath.ri.model.VariablePointer");
      String string0 = dOMNodePointer0.getNamespaceURI("=X");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
      assertFalse(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("']");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1896));
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      Object object0 = dOMNodePointer0.getBaseValue();
      assertSame(iIOMetadataNode0, object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("']");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getPointerByID((JXPathContext) null, "UNKNOWN()");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      QName qName0 = dOMNodePointer0.getName();
      dOMNodePointer0.createAttribute(jXPathContext0, qName0);
      NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.util.TypeUtils$1");
      boolean boolean0 = dOMNodePointer0.equals(processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer1.printPointerChain();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      String string0 = dOMNodePointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.remove();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot remove root DOM node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, (Locale) null);
      dOMNodePointer0.remove();
      assertEquals(1, dOMNodePointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      QName qName0 = dOMNodePointer0.getName();
      dOMNodePointer0.createAttribute((JXPathContext) null, qName0);
      dOMNodePointer0.createAttribute(jXPathContext0, qName0);
      assertEquals("rRdLo^)|p4U!k", qName0.toString());
      assertEquals("rRdLo^)|p4U!k", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = new QName("](p'", "");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "vy7Ilh3C53XTZ&?");
      // Undeclared exception!
      try { 
        dOMNodePointer0.setValue(locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      dOMNodePointer0.setValue((Object) null);
      assertTrue(dOMNodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      dOMNodePointer0.setValue(dOMNodePointer0);
      assertTrue(dOMNodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      dOMNodePointer0.setValue(iIOMetadataNode0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      boolean boolean0 = dOMNodePointer0.isLanguage("http://www.w3.org/2000/xmlns/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      boolean boolean0 = dOMNodePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      dOMNodePointer0.getNamespaceURI("processing-instruction('org.apache.commons.jxpath.util.TypeUtils$1')");
      Locale locale0 = Locale.KOREAN;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      QName qName0 = new QName("3${Y;EWxmf\"UK%6N", "3${Y;EWxmf\"UK%6N");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown namespace prefix: 3${Y;EWxmf\"UK%6N
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      dOMNodePointer0.getNamespaceURI("");
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      String string0 = dOMNodePointer0.getNamespaceURI((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest", "http://www.w3.org/XML/1998/namespace");
      dOMNodePointer0.attributeIterator(qName0);
      NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
      assertFalse(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("D0(cAny(");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      QName qName0 = dOMNodePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertTrue(boolean0);
      assertEquals("'>[Q;SKdgh", nodeNameTest0.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      QName qName0 = dOMNodePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "'>[Q;SKdgh");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertTrue(boolean0);
      assertEquals("'>[Q;SKdgh", nodeNameTest0.toString());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("'>[Q;SKdgh");
      QName qName0 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "'>[Q;SKdgh");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = DOMNodePointer.testNode((Node) null, (NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '<<unknown namespace>>'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("']");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      dOMNodePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      int int0 = dOMNodePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      NodePointer nodePointer0 = dOMNodePointer0.namespacePointer((String) null);
      assertEquals(1, nodePointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("rRdLo^)|p4U!k");
      Locale locale0 = Locale.ROOT;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "rRdLo^)|p4U!k");
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("http://www.w3.org/XML/1998/namespace");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
      // Undeclared exception!
      try { 
        dOMNodePointer1.createChild(jXPathContext0, (QName) null, Integer.MIN_VALUE, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: id('rRdLo^)|p4U!k')/rRdLo^)|p4U!k[1]
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = new Locale("yDcy j,' wPj");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("']");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.getLanguage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("']");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      int int0 = dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, dOMNodePointer0);
      assertEquals(0, int0);
  }
}
