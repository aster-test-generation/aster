
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


package org.apache.commons.jxpath.ri.model.container;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ContainerPointer_ESTest extends ContainerPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>", (String) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(containerPointer0, qName0, containerPointer0);
      int int0 = containerPointer0.compareChildNodePointers(nodePointer0, containerPointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName("Source is null", (String) null);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        containerPointer0.compareChildNodePointers((NodePointer) null, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Cannot find an element by key - no KeyManager has been specified");
      StreamSource streamSource0 = new StreamSource(stringReader0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = new Locale("Cannot find an element by key - no KeyManager has been specified", "46H&=zVS!", "xmlns:");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      containerPointer0.setIndex((-10));
      containerPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      containerPointer0.setIndex(1);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource((Node) null, "VqO%SuD=pj d#D");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ROOT;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      boolean boolean0 = containerPointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      boolean boolean0 = containerPointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.KOREAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodePointer nodePointer0 = containerPointer0.namespacePointer((String) null);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource((Node) null, "VqO%SuD=pj d#D");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ROOT;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertSame(xMLDocumentContainer0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName("Source is null", (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Source is null");
      NodeIterator nodeIterator0 = containerPointer0.childIterator(nodeNameTest0, true, (NodePointer) null);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.setValue(streamSource0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.GERMAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
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
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0, "F=f[I>3i1]bQK)B ");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: F=f[I>3i1]bQK)B ; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      QName qName0 = new QName("2");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      StreamSource streamSource0 = new StreamSource("");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ; org.xml.sax.SAXParseException; systemId: file:///Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL(")=w(?$19", "", 1962, "=EhC7?h#KV01lLOk", uRLStreamHandler0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("=EhC7?h#KV01lLOk");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Undefined function: ", "Undefined function: ");
      URL uRL0 = mockFile0.toURL();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getLength();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file:/Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/Undefined function: /Undefined function:; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      MockFile mockFile0 = new MockFile("org.apache.commons.jxpath.ri.model.container.ContainerPointer");
      URL uRL0 = mockFile0.toURL();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateValuePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file:/Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/org.apache.commons.jxpath.ri.model.container.ContainerPointer; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.JAPAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, containerPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("\"self::\"", "@#-<Mpq]bj{6FCtc+=");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("6[AZWtsKofs");
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(processingInstructionTest0, false, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '\"self::\":@#-<Mpq]bj{6FCtc+='
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "i?");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) "i?");
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(nodePointer0, xMLDocumentContainer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, true, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.PRC;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator(qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      QName qName0 = new QName("<<unknown namespace>>", ",yS");
      containerPointer0.attributeIterator(qName0);
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = new Locale("Cannot find an element by key - no KeyManager has been specified", "46H&=zVS!", "xmlns:");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      containerPointer0.setIndex(0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = containerPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      String string0 = containerPointer0.asPath();
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("3!#=V", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      String string0 = containerPointer0.asPath();
      assertEquals("$3!#=V:", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      XMLDocumentContainer xMLDocumentContainer1 = new XMLDocumentContainer(sAXSource0);
      Locale locale0 = Locale.PRC;
      ContainerPointer containerPointer1 = new ContainerPointer(xMLDocumentContainer1, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Object object0 = xMLDocumentContainer0.getValue();
      Locale locale0 = new Locale("}8=l");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      boolean boolean0 = containerPointer0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = new Locale("Cannot find an element by key - no KeyManager has been specified", "46H&=zVS!", "xmlns:");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      ContainerPointer containerPointer1 = new ContainerPointer(nodePointer0, xMLDocumentContainer0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = new Locale("Cannot find an element by key - no KeyManager has been specified", "46H&=zVS!", "xmlns:");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      containerPointer0.setIndex(0);
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      ContainerPointer containerPointer1 = new ContainerPointer(nodePointer0, xMLDocumentContainer0);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(boolean0);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      containerPointer0.setIndex(14);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      containerPointer0.setIndex((-2708));
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("3!#=V", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      int int0 = containerPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.ENGLISH;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      String string0 = containerPointer0.getNamespaceURI("?M,q{Xq)Gx\u0000");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = new Locale("Cannot find an element by key - no KeyManager has been specified", "46H&=zVS!", "xmlns:");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("&!(V");
      NodeIterator nodeIterator0 = containerPointer0.childIterator(processingInstructionTest0, false, nodePointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, (Locale) null);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        containerPointer0.setValue(locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("3!#=V", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      boolean boolean0 = containerPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("3!#=V", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("$3!#=V:");
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = new Locale(" \"n@jztw3I(]q[L>As");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeIterator nodeIterator0 = containerPointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      InputSource inputSource0 = new InputSource("@-");
      SAXSource sAXSource0 = new SAXSource((XMLReader) null, inputSource0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      Locale locale0 = Locale.FRANCE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        containerPointer0.testNode(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: @-; java.io.FileNotFoundException: /Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/@- (No such file or directory)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(".T}:i#LU?+@@o!_", ".T}:i#LU?+@@o!_");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)27, (byte)27);
      StreamSource streamSource0 = new StreamSource(byteArrayInputStream0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; Premature end of file.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }
}
