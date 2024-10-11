
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
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      iIOMetadataNode0.removeChild(iIOMetadataNode0);
      Object object0 = dOMNodePointer0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      QName qName0 = new QName("=LD5", "=LD5");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, iIOMetadataNode0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, (-2028441207));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.US;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "UNKNOWN");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
      boolean boolean0 = dOMNodePointer0.isLanguage("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("?UUM8Hu6U!#");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      boolean boolean0 = dOMNodePointer0.isLanguage("UNKNOWN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saRH");
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "*saRH");
      String string0 = dOMNodePointer0.getLanguage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.KOREAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertSame(iIOMetadataNode0, object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = new Locale("<$}NyPI| ");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "S+=h)PmR");
      Object object0 = dOMNodePointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
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
  public void test11()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("?UUM8Hu6U!#");
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      // Undeclared exception!
      dOMNodePointer0.getValue();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.PRC;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
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
  public void test15()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
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
  public void test16()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, 34, (Object) "rPkqN+h miR65");
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
      Locale locale0 = new Locale("<5QlswBu", "<5QlswBu", "processing-instruction");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <<unknown namespace>>
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", "org.apache.commons.jxpath.util.KeyManagerUtils$SingleNodeExtendedKeyManager");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'org.apache.commons.jxpath.ri.model.dom.DOMNodePointer:org.apache.commons.jxpath.util.KeyManagerUtils$SingleNodeExtendedKeyManager'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      QName qName0 = new QName("3J;!jcWgt_hxk1)OPB", "Em~GD");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Em~GD");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(dOMNodePointer0, qName0, processingInstructionTest0);
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
  public void test20()  throws Throwable  {
      QName qName0 = new QName("<[M*'e;=D`3@if=~eXn");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "|Vh_,8YPt*E^%TA\"");
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: <[M*'e;=D`3@if=~eXn
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("U7z2(SG`k0z");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(processingInstructionTest0, false, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "[P;goCqjOG<xkuvq/8#");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(processingInstructionTest0, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':[P;goCqjOG<xkuvq/8#'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("DU'5Mq2Ph+`A[_dsh");
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("http://www.w3.org/2000/xmlns/");
      QName qName0 = new QName("WxTu;,F[Nn7Vsj&", "+");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(dOMNodePointer0, qName0, "VLlQGzK_i7.kp()\"G");
      // Undeclared exception!
      try { 
        dOMNodePointer0.childIterator(processingInstructionTest0, true, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("Cannot set undefined variable: ");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, (Node) null);
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("xmlns:", "xmlns:");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
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
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("!_j$.YW&r|Cieq-1");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saRH");
      String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
      assertEquals("*saRH", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertEquals("http", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("7");
      String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("!_j$.YW&r|Cieq-1");
      Locale locale0 = Locale.JAPAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      String string0 = dOMNodePointer0.asPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saRH");
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "*saRH");
      String string0 = dOMNodePointer0.getNamespaceURI("*saRH");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      String string0 = dOMNodePointer0.getNamespaceURI("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("[");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
      Locale locale0 = jXPathContext0.getLocale();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      dOMNodePointer0.getNamespaceResolver();
      NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
      assertFalse(namespaceResolver0.isSealed());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("bf%zfx)7Si2~K");
      // Undeclared exception!
      try { 
        DOMNodePointer.testNode((Node) null, (NodeTest) processingInstructionTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
      Object object0 = dOMNodePointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      Object object0 = dOMNodePointer0.getBaseValue();
      assertSame(object0, iIOMetadataNode0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saRH");
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "*saRH");
      NodePointer nodePointer0 = dOMNodePointer0.namespacePointer((String) null);
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
  public void test40()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("  ");
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "  ");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) dOMNodePointer0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.getPointerByID(jXPathContext0, "  ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
      IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode();
      Node node0 = iIOMetadataNode0.insertBefore(iIOMetadataNode1, iIOMetadataNode1);
      Locale locale0 = Locale.KOREAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0, (String) null);
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      // Undeclared exception!
      try { 
        dOMNodePointer1.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("?UUM8Hu6U!#");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      Object object0 = dOMNodePointer0.getValue();
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      boolean boolean0 = dOMNodePointer0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("0deKI]{CwQ*");
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"false\"");
      QName qName0 = dOMNodePointer0.getName();
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, iIOMetadataNode0, locale0);
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(nodePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer1.toString();
      assertEquals("0deKI]{CwQ*", qName0.getName());
      assertEquals("/0deKI]{CwQ*[1]", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("0deKI]{CwQ*");
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"false\"");
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
      String string0 = dOMNodePointer1.toString();
      assertEquals("id('&quot;false&quot;')/0deKI]{CwQ*[1]", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      String string0 = dOMNodePointer0.asPath();
      assertEquals("id('n#e#`u;> jXX2')", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode(":");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
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
  public void test49()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("?UUM8Hu6U!#");
      iIOMetadataNode0.appendChild(iIOMetadataNode0);
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      dOMNodePointer0.remove();
      assertTrue(dOMNodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      QName qName0 = new QName("http://www.w3.org/XML/1998/namespace", "http://www.w3.org/2000/xmlns/");
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
  public void test51()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      QName qName0 = new QName("=LD5", "=LD5");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $=LD5:=LD5
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
      dOMNodePointer0.setValue("");
      assertTrue(dOMNodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      Locale locale0 = Locale.CANADA;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "w?[25q>");
      dOMNodePointer0.setValue((Object) null);
      assertTrue(dOMNodePointer0.isActual());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      dOMNodePointer0.setValue(iIOMetadataNode0);
      assertFalse(dOMNodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("?UUM8Hu6U!#");
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      // Undeclared exception!
      try { 
        dOMNodePointer0.setValue("?UUM8Hu6U!#");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saRH");
      String string0 = DOMNodePointer.findEnclosingAttribute(iIOMetadataNode0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      boolean boolean0 = dOMNodePointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saiH");
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "*saiH");
      dOMNodePointer0.getDefaultNamespaceURI();
      String string0 = dOMNodePointer0.getDefaultNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("xmlns:", "xmlns:");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, (Node) null);
      dOMNodePointer0.getNamespaceURI("<<unknown namespace>>");
      String string0 = dOMNodePointer0.getNamespaceURI("<<unknown namespace>>");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode(":");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
      QName qName0 = new QName(":");
      NodeIterator nodeIterator0 = dOMNodePointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      String string0 = dOMNodePointer0.getNamespaceURI((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
      dOMNodePointer0.getNamespaceResolver();
      QName qName0 = new QName("http://www.w3.org/XML/1998/namespace", "http://www.w3.org/2000/xmlns/");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unknown namespace prefix: http://www.w3.org/XML/1998/namespace
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(644);
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeTypeTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saRH");
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "*saRH");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("*saRH");
      boolean boolean0 = dOMNodePointer0.testNode((NodeTest) processingInstructionTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      QName qName0 = new QName("http://www.w3.org/XML/1998/namespace", "http://www.w3.org/2000/xmlns/");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "e+m66&N");
      // Undeclared exception!
      try { 
        DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = DOMNodePointer.testNode((Node) null, (NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("0deKI]{CwQ*");
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"false\"");
      QName qName0 = dOMNodePointer0.getName();
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) "8^O5~=R");
      dOMNodePointer0.createAttribute(jXPathContext0, qName0);
      assertEquals("0deKI]{CwQ*", qName0.toString());
      assertEquals("0deKI]{CwQ*", qName0.getName());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
      NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, ".l");
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-108));
      // Undeclared exception!
      try { 
        dOMNodePointer0.testNode((NodeTest) nodeTypeTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, (Node) null);
      boolean boolean0 = dOMNodePointer0.equals(dOMNodePointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
      boolean boolean0 = dOMNodePointer0.isActual();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Em~GD");
      NodeIterator nodeIterator0 = dOMNodePointer0.childIterator(processingInstructionTest0, false, dOMNodePointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("*saRH");
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "*saRH");
      dOMNodePointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      int int0 = dOMNodePointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/2000/xmlns/");
      Locale locale0 = Locale.TAIWAN;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, (String) null);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      QName qName0 = dOMNodePointer0.getName();
      // Undeclared exception!
      try { 
        dOMNodePointer0.createChild(jXPathContext0, qName0, 2147483645, (Object) iIOMetadataNode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      String string0 = dOMNodePointer0.getNamespaceURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("N/y5/~hP*#A>qR AYY<");
      Locale locale0 = Locale.UK;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "n#e#`u;> jXX2");
      boolean boolean0 = dOMNodePointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
      // Undeclared exception!
      try { 
        dOMNodePointer0.isLanguage((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("0deKI]{CwQ*");
      Locale locale0 = Locale.FRANCE;
      DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"false\"");
      int int0 = dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, dOMNodePointer0);
      assertEquals(0, int0);
  }
}
