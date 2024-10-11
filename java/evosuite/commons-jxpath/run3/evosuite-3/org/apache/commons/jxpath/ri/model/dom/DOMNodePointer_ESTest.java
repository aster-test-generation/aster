
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
import java.util.LinkedList;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
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
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("gCd{4Yc");
      iIOMetadataNode0.removeChild(iIOMetadataNode0);
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("<XU<&");
      Node node0 = iIOMetadataNode0.insertBefore(iIOMetadataNode1, iIOMetadataNode1);
      String string0 = DOMNodePointer.getNamespaceURI(node0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isLanguage("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("(1T5+bR^FvG)J");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals("(1T5+bR^FvG)J", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      String string0 = dOMNodePointer0.getLanguage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "+a#a9GuIIC");
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "gD%");
      Object object0 = dOMNodePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = DOMNodePointer.findEnclosingAttribute(iIOMetadataNode0, "http://www.w3.org/XML/1998/namespace");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest", "org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
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
  public void test09()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("?P'(]GF67Y(58b");
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
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
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
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
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
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "B8RL");
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
  public void test13()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.isLanguage("Ay");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
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
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DOMNodePointer.getPrefix((Node) null);
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
      // Undeclared exception!
      try { 
        DOMNodePointer.getNamespaceURI((Node) null);
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
      Locale locale0 = new Locale("http://www.w3.org/XML/1998/namespace", "j{O;#*sGX3f");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
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
  public void test18()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.removeChild(iIOMetadataNode1);
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0, "");
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
  public void test19()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = new Locale("?&<d=9'8", "mC,>){]");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "?&<d=9'8");
      Object object0 = new Object();
      QName qName0 = new QName("w0)>AfRcXUPyf");
      // Undeclared exception!
      try { 
        dOMNodePointer1.createChild(jXPathContext0, qName0, (-1638855482), object0);
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
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("t+ir] ");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
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
  public void test21()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = dOMNodePointer0.getName();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(nodePointer0, dOMNodePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      QName qName0 = new QName("self", "qeR5unx");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, dOMNodePointer0, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.dom.DOMNodePointer cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.AbstractFactory", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.AbstractFactory:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("dQ{");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      QName qName0 = new QName("}hq\"iAmbuf_QGD", (String) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.attributeIterator(qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
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
  public void test26()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Bqt0T)<+v??rJo%a");
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.removeChild(iIOMetadataNode1);
      // Undeclared exception!
      try { 
        DOMNodePointer.getLocalName(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("dQ{");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Cannot set undefined variable: ");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertEquals("Cannot set undefined variable", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer1.toString();
      assertEquals("/m>Hd$GZPF:M\"aBSCdO,[1]", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
      String string0 = dOMNodePointer0.asPath();
      assertEquals("id('')", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      QName qName0 = new QName("ZZ");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild((JXPathContext) null, qName0, (-2323));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("m>Hd$GZPF:M\"aBSCdO,");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getBaseValue();
      assertSame(object0, iIOMetadataNode0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("vJ$ ?$ir+->v|J2");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = dOMNodePointer0.getName();
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode1, locale0);
      int int0 = dOMNodePointer0.compareChildNodePointers(nodePointer0, dOMNodePointer0);
      assertEquals(0, int0);
      assertEquals("vJ$ ?$ir+->v|J2", qName0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("dQ{");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getPointerByID((JXPathContext) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("vJ$ ?$ir+->v|J2");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      iIOMetadataNode0.setAttribute("http://www.w3.org/XML/1998/namespace", "Unknown namespace prefix: ");
      NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      iIOMetadataNode0.setAttribute("WPA.3L@", "Y5sS9b<r&-Y");
      NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ITALY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, (String) null);
      Object object0 = dOMNodePointer0.clone();
      boolean boolean0 = dOMNodePointer0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("WPA.3L@", "m>Hd$GZPF:M\"aBSCdO,");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer1.createChild(jXPathContext0, qName0, (-2021466313), (Object) iIOMetadataNode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: /m>Hd$GZPF:M\"aBSCdO,[1]
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
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
  public void test46()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("dQ{");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      QName qName0 = new QName("JYpj+=K=.#Z");
      NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
      assertFalse(nodePointer0.isCollection());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      QName qName0 = new QName("JqZQdOyd");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "JqZQdOyd", locale0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, (Node) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("http://www.w3.org/XML/1998/namespace");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
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
  public void test48()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Cannot set undefined variable: ");
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "|>:z>");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      QName qName0 = new QName("<<unknown namespace>>", "/text()");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown namespace prefix: <<unknown namespace>>
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      QName qName0 = dOMNodePointer0.getName();
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.ITALY;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, (String) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.setValue(processingInstructionTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("(1T5+bR^FvG)J");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xml");
      dOMNodePointer0.setValue((Object) null);
      assertTrue(dOMNodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      QName qName0 = new QName("WPA.3L@", "m>Hd$GZPF:M\"aBSCdO,");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      Locale locale0 = Locale.PRC;
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("qTp-WYj7");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, processingInstructionTest0, locale0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, iIOMetadataNode0);
      dOMNodePointer0.setValue(linkedList0);
      assertFalse(dOMNodePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("vJ$ ?$ir+->v|J2");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("MhrPV 'U5");
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      Locale locale0 = Locale.KOREAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0);
      boolean boolean0 = dOMNodePointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      dOMNodePointer0.getNamespaceURI("");
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = new QName("http://www.w3.org/XML/1998/namespace", "d");
      dOMNodePointer0.getNamespaceURI("d");
      NodeIterator nodeIterator0 = dOMNodePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.KOREAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xml");
      QName qName0 = new QName("xml", "R]\"E$`&6$T");
      NodeIterator nodeIterator0 = dOMNodePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Cannot set undefined variable: ");
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "|>:z>");
      String string0 = dOMNodePointer0.getNamespaceURI((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("dQ{");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      dOMNodePointer0.getNamespaceResolver();
      NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
      assertFalse(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("vJ$ ?$ir+->v|J2");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      QName qName0 = new QName("WPA.3L@", "m>Hd$GZPF:M\"aBSCdO,");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/XML/1998/namespace");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      QName qName0 = new QName("WPA.3L@", "m>Hd$GZPF:M\"aBSCdO,");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*4\"J9]o\"|");
      Locale locale0 = Locale.forLanguageTag(",h");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ",h");
      QName qName0 = new QName("", "<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "PcP");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      QName qName0 = new QName("WPA.3L@", "m>Hd$GZPF:M\"aBSCdO,");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodeIterator nodeIterator0 = dOMNodePointer0.childIterator(nodeNameTest0, true, dOMNodePointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*4\"J9]o\"|");
      Locale locale0 = Locale.forLanguageTag(",h");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ",h");
      QName qName0 = dOMNodePointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "PcP");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
      assertEquals("*4\"J9]o\"|", nodeNameTest0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertSame(object0, iIOMetadataNode0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("vJ$ ?$ir+->v|J2");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      dOMNodePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("dQ{");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      int int0 = dOMNodePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("(1T5+bR^FvG)J");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xml");
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer1.toString();
      assertEquals("id('xml')/(1T5+bR^FvG)J[1]", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("m>Hd$GZPF:M\"aBSCdO,");
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isLanguage("qTp-WYj7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("vJ$ ?$ir+->v|J2");
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      int int0 = dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, dOMNodePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("(1T5+bR^FvG)J");
      Locale locale0 = Locale.CANADA_FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xml");
      boolean boolean0 = dOMNodePointer0.isCollection();
      assertFalse(boolean0);
  }
}
