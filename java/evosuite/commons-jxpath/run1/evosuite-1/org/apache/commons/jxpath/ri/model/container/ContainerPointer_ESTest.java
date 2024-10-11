
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
import java.io.ObjectInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Enumeration;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.NodePointerFactory;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ContainerPointer_ESTest extends ContainerPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = new Locale(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      ContainerPointer containerPointer1 = new ContainerPointer((Container) null, locale0);
      assertTrue(containerPointer1.equals((Object)containerPointer0));
      
      containerPointer1.setIndex((-1));
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      containerPointer0.setIndex(4330);
      containerPointer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.parser.ParseException");
      containerPointer0.setIndex(4330);
      NodeIterator nodeIterator0 = containerPointer0.childIterator(processingInstructionTest0, false, variablePointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      boolean boolean0 = containerPointer0.testNode(nodeTypeTest0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("");
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xml:space");
      DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0, "");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.TAIWAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      boolean boolean0 = containerPointer0.isLeaf();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.US;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodePointer nodePointer0 = containerPointer0.getImmediateValuePointer();
      assertEquals(1, nodePointer0.getLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = new Locale("");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      Object object0 = containerPointer0.getImmediateNode();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      containerPointer0.setIndex(4330);
      int int0 = containerPointer0.compareChildNodePointers(variablePointer0, containerPointer0);
      assertEquals(2147479318, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = new Locale("");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      NodeIterator nodeIterator0 = containerPointer0.childIterator(nodeTypeTest0, true, (NodePointer) null);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.CANADA;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      QName qName0 = new QName("<<unknown namespace>>", "9mtp");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        containerPointer0.testNode(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file://some/fake/but/wellformed/url; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      // Undeclared exception!
      try { 
        containerPointer0.testNode(nodeTypeTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DOMSource dOMSource0 = new DOMSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(dOMSource0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      Object object0 = containerPointer0.getRootNode();
      // Undeclared exception!
      try { 
        containerPointer0.setValue(object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      StreamSource streamSource0 = new StreamSource(sequenceInputStream0, "org.apache.commons.jxpath.XMLDocumentContainer");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.CHINA;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("Hg#3~HFbP0_.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: org.apache.commons.jxpath.XMLDocumentContainer; org.xml.sax.SAXParseException; systemId: file:///Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/org.apache.commons.jxpath.XMLDocumentContainer; lineNumber: 1; columnNumber: 1; Premature end of file.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, (Container) null);
      // Undeclared exception!
      try { 
        containerPointer0.namespacePointer("org.apache.commons.jxpath.ri.model.container.ContainerPointer");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.PRC;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.namespaceIterator();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = new Locale("", "", "usL$");
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
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.forLanguageTag("");
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        containerPointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      // Undeclared exception!
      try { 
        containerPointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file://some/fake/but/wellformed/url; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URL uRL0 = MockURI.toURL(uRI0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.CANADA;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ftp://foo.bar; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      // Undeclared exception!
      try { 
        containerPointer0.getNamespaceURI("<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.ITALIAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateValuePointer();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file://some/fake/but/wellformed/url; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      NodePointerFactory nodePointerFactory0 = mock(NodePointerFactory.class, new ViolatedAssumptionAnswer());
      JXPathContextReferenceImpl.addNodePointerFactory(nodePointerFactory0);
      QName qName0 = new QName("dP;'v#KM8TI.ea#}");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      StreamSource streamSource0 = new StreamSource((Reader) null, "<<unknown namespace>>");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: <<unknown namespace>>; java.net.MalformedURLException: no protocol: <<unknown namespace>>
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("<NCName>", "]odj}MjHY$M&9R");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator((NodeTest) null, true, variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '<NCName>:]odj}MjHY$M&9R'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, nodeNameTest0, (Locale) null);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, true, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeNameTest cannot be cast to org.w3c.dom.Node
         //
         verifyException("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("", "PC", 15, "", uRLStreamHandler0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, xMLDocumentContainer0);
      // Undeclared exception!
      try { 
        containerPointer0.attributeIterator((QName) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
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
  public void test31()  throws Throwable  {
      Locale locale0 = new Locale(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.setIndex((-1));
      Object object0 = containerPointer0.getRootNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource(" +[CBjvUP/H");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.JAPANESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      QName qName0 = containerPointer0.getName();
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from:  +[CBjvUP/H; java.net.MalformedURLException: no protocol:  +[CBjvUP/H
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource(" +[CBjvUP/H");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.JAPANESE;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      Object object0 = containerPointer0.getBaseValue();
      assertSame(xMLDocumentContainer0, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = new Locale(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.printPointerChain();
      assertTrue(containerPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      String string0 = containerPointer0.asPath();
      assertEquals("$null", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      containerPointer0.setIndex(1);
      ContainerPointer containerPointer1 = new ContainerPointer(containerPointer0, (Container) null);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertFalse(containerPointer1.equals((Object)containerPointer0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(WQ(2q<Wp)uErO8");
      StreamSource streamSource0 = new StreamSource(stringReader0, "(WQ(2q<Wp)uErO8");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      boolean boolean0 = containerPointer0.equals(stringReader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Locale locale0 = new Locale(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.equals(containerPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      ContainerPointer containerPointer1 = new ContainerPointer(containerPointer0, (Container) null);
      boolean boolean0 = containerPointer0.equals(containerPointer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      ContainerPointer containerPointer0 = new ContainerPointer(variablePointer0, (Container) null);
      containerPointer0.setIndex(1);
      Object object0 = containerPointer0.getImmediateNode();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      int int0 = containerPointer0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      Locale locale0 = Locale.TAIWAN;
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.getLength();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: file://some/fake/but/wellformed/url; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      ContainerPointer containerPointer0 = new ContainerPointer(xMLDocumentContainer0, (Locale) null);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isCollection();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = new Locale(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      String string0 = containerPointer0.getNamespaceURI(", operation is not allowed for this type of node");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = new Locale(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      int int0 = containerPointer0.compareChildNodePointers(containerPointer0, containerPointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      // Undeclared exception!
      try { 
        containerPointer0.childIterator(nodeNameTest0, true, containerPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = new Locale(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      QName qName0 = new QName("3");
      NodeIterator nodeIterator0 = containerPointer0.attributeIterator(qName0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      boolean boolean0 = containerPointer0.isContainer();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      // Undeclared exception!
      try { 
        containerPointer0.setValue("/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.container.ContainerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      containerPointer0.isLeaf();
      Object object0 = containerPointer0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, (Container) null);
      NodePointer nodePointer0 = containerPointer0.namespacePointer("org.apache.commons.jxpath.ri.model.container.ContainerPointer");
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      ContainerPointer containerPointer0 = new ContainerPointer((Container) null, locale0);
      NodeIterator nodeIterator0 = containerPointer0.namespaceIterator();
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ContainerPointer containerPointer0 = new ContainerPointer((NodePointer) null, (Container) null);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      boolean boolean0 = containerPointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
  }
}
