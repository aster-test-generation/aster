
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


package org.apache.commons.jxpath.ri.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NodePointer_ESTest extends NodePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      QName qName0 = new QName("", "\"\n\"");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":\"\n\"", qName0.toString());
      assertEquals("\"\n\"", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":\"\n\"", qName0.toString());
      assertEquals("\"\n\"", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.escape("\"\n\"");
      assertNotNull(string0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":\"\n\"", qName0.toString());
      assertEquals("\"\n\"", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals("&quot;\n&quot;", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      
      Locale locale0 = Locale.ITALY;
      assertNotNull(locale0);
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it_IT", locale0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it_IT", locale0.toString());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        beanPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 51);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //[52], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.setIndex(0);
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(0, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      QName qName0 = new QName("A[GM", "A[GM");
      assertNotNull(qName0);
      assertEquals("A[GM:A[GM", qName0.toString());
      assertEquals("A[GM", qName0.getPrefix());
      assertEquals("A[GM", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("A[GM:A[GM", qName0.toString());
      assertEquals("A[GM", qName0.getPrefix());
      assertEquals("A[GM", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.remove();
      assertEquals("A[GM:A[GM", qName0.toString());
      assertEquals("A[GM", qName0.getPrefix());
      assertEquals("A[GM", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      QName qName0 = new QName("Factory is not set on the JXPathContext - cannot create path: ", "Factory is not set on the JXPathContext - cannot create path: ");
      assertNotNull(qName0);
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getName());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getPrefix());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: :Factory is not set on the JXPathContext - cannot create path: ", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getName());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getPrefix());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: :Factory is not set on the JXPathContext - cannot create path: ", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      assertNotNull(namespaceResolver0);
      assertFalse(namespaceResolver0.isSealed());
      
      variablePointer0.setNamespaceResolver(namespaceResolver0);
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getName());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getPrefix());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: :Factory is not set on the JXPathContext - cannot create path: ", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(namespaceResolver0.isSealed());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("HC:Mfo+<.b", "HC:Mfo+<.b");
      assertNotNull(qName0);
      assertEquals("HC:Mfo+<.b", qName0.getPrefix());
      assertEquals("HC:Mfo+<.b", qName0.getName());
      assertEquals("HC:Mfo+<.b:HC:Mfo+<.b", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("HC:Mfo+<.b", qName0.getPrefix());
      assertEquals("HC:Mfo+<.b", qName0.getName());
      assertEquals("HC:Mfo+<.b:HC:Mfo+<.b", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.setIndex(Integer.MIN_VALUE);
      assertEquals("HC:Mfo+<.b", qName0.getPrefix());
      assertEquals("HC:Mfo+<.b", qName0.getName());
      assertEquals("HC:Mfo+<.b:HC:Mfo+<.b", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.toString();
      assertNotNull(string0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals("$", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      QName qName0 = new QName("Nb4", "N=b4");
      assertNotNull(qName0);
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4:N=b4", qName0.toString());
      assertEquals("N=b4", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4:N=b4", qName0.toString());
      assertEquals("N=b4", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertNotNull(nodeNameTest0);
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4:N=b4", qName0.toString());
      assertEquals("N=b4", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("Nb4:N=b4", nodeNameTest0.toString());
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4:N=b4", qName0.toString());
      assertEquals("N=b4", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("Nb4:N=b4", nodeNameTest0.toString());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      assertNotNull(beanPointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = beanPointer0.namespacePointer("H_Gf1.jl4");
      assertNull(nodePointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      QName qName0 = new QName("Factory cannot define variable '", "Factory cannot define variable '");
      assertNotNull(qName0);
      assertEquals("Factory cannot define variable ':Factory cannot define variable '", qName0.toString());
      assertEquals("Factory cannot define variable '", qName0.getPrefix());
      assertEquals("Factory cannot define variable '", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Factory cannot define variable ':Factory cannot define variable '", qName0.toString());
      assertEquals("Factory cannot define variable '", qName0.getPrefix());
      assertEquals("Factory cannot define variable '", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = variablePointer0.namespaceIterator();
      assertNull(nodeIterator0);
      assertEquals("Factory cannot define variable ':Factory cannot define variable '", qName0.toString());
      assertEquals("Factory cannot define variable '", qName0.getPrefix());
      assertEquals("Factory cannot define variable '", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, (Locale) null);
      assertNotNull(nullPointer0);
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isLeaf());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = nullPointer0.isLeaf();
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isLeaf());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      
      variablePointer0.locale = locale0;
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CN", variablePointer0.locale.getCountry());
      assertEquals("zh", variablePointer0.locale.getLanguage());
      assertEquals("zh_CN", variablePointer0.locale.toString());
      assertEquals("CHN", variablePointer0.locale.getISO3Country());
      assertEquals("zho", variablePointer0.locale.getISO3Language());
      assertEquals("", variablePointer0.locale.getVariant());
      
      boolean boolean0 = variablePointer0.isLanguage("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      QName qName0 = new QName("/");
      assertNotNull(qName0);
      assertEquals("/", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("/", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isContainer();
      assertEquals("/", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isCollection();
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      QName qName0 = new QName("xYJd");
      assertNotNull(qName0);
      assertEquals("xYJd", qName0.toString());
      assertEquals("xYJd", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("xYJd", qName0.toString());
      assertEquals("xYJd", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isActual();
      assertEquals("xYJd", qName0.toString());
      assertEquals("xYJd", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = (String)beanPointer0.getValue();
      assertNotNull(string0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "+");
      assertNotNull(qName0);
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":+", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":+", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      assertNotNull(nodePointer0);
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":+", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = variablePointer0.getNodeValue();
      assertNull(object0);
      assertSame(variablePointer0, nodePointer0);
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":+", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest1 = (NodeNameTest)beanPointer0.getNodeValue();
      assertNotNull(nodeNameTest1);
      assertSame(nodeNameTest0, nodeNameTest1);
      assertSame(nodeNameTest1, nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals("", nodeNameTest1.toString());
      assertNull(nodeNameTest1.getNamespaceURI());
      assertFalse(nodeNameTest1.isWildcard());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      QName qName0 = new QName("0)2D3&Q", "0)2D3&Q");
      assertNotNull(qName0);
      assertEquals("0)2D3&Q", qName0.getPrefix());
      assertEquals("0)2D3&Q", qName0.getName());
      assertEquals("0)2D3&Q:0)2D3&Q", qName0.toString());
      
      Locale locale0 = Locale.ENGLISH;
      assertNotNull(locale0);
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, locale0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("0)2D3&Q", qName0.getPrefix());
      assertEquals("0)2D3&Q", qName0.getName());
      assertEquals("0)2D3&Q:0)2D3&Q", qName0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale1 = (Locale)beanPointer0.getNode();
      assertNotNull(locale1);
      assertSame(locale0, locale1);
      assertSame(locale1, locale0);
      assertEquals("0)2D3&Q", qName0.getPrefix());
      assertEquals("0)2D3&Q", qName0.getName());
      assertEquals("0)2D3&Q:0)2D3&Q", qName0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals("", locale1.getISO3Country());
      assertEquals("eng", locale1.getISO3Language());
      assertEquals("en", locale1.toString());
      assertEquals("", locale1.getVariant());
      assertEquals("en", locale1.getLanguage());
      assertEquals("", locale1.getCountry());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      QName qName0 = new QName("xYJd");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("xYJd", qName0.toString());
      assertEquals("xYJd", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("xYJd", qName0.toString());
      assertEquals("xYJd", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = variablePointer0.getName();
      assertNotNull(qName1);
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("xYJd", qName0.toString());
      assertEquals("xYJd", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertNull(qName1.getPrefix());
      assertEquals("xYJd", qName1.toString());
      assertEquals("xYJd", qName1.getName());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.getLength();
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "+");
      assertNotNull(qName0);
      assertEquals("+", qName0.getName());
      assertEquals(":+", qName0.toString());
      assertEquals("", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("+", qName0.getName());
      assertEquals(":+", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      assertNotNull(nodePointer0);
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals("+", qName0.getName());
      assertEquals(":+", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = nodePointer0.getLength();
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals("+", qName0.getName());
      assertEquals(":+", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isActual());
      assertEquals(1, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("' and '");
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPointer nullPointer1 = (NullPointer)nullPointer0.getImmediateValuePointer();
      assertNotNull(nullPointer1);
      assertSame(nullPointer0, nullPointer1);
      assertSame(nullPointer1, nullPointer0);
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer1.isNode());
      assertTrue(nullPointer1.isLeaf());
      assertNull(nullPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertFalse(nullPointer1.isCollection());
      assertTrue(nullPointer1.isRoot());
      assertFalse(nullPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      QName qName0 = new QName("Factory cannot define variable '", "Factory cannot define variable '");
      assertNotNull(qName0);
      assertEquals("Factory cannot define variable ':Factory cannot define variable '", qName0.toString());
      assertEquals("Factory cannot define variable '", qName0.getName());
      assertEquals("Factory cannot define variable '", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Factory cannot define variable ':Factory cannot define variable '", qName0.toString());
      assertEquals("Factory cannot define variable '", qName0.getName());
      assertEquals("Factory cannot define variable '", qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateParentPointer();
      assertNull(nodePointer0);
      assertEquals("Factory cannot define variable ':Factory cannot define variable '", qName0.toString());
      assertEquals("Factory cannot define variable '", qName0.getName());
      assertEquals("Factory cannot define variable '", qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "+");
      assertNotNull(qName0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      assertNotNull(beanPointer0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)beanPointer0.getImmediateParentPointer();
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      QName qName0 = new QName("rr3");
      assertNotNull(qName0);
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) qName0);
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = (QName)variablePointer0.getImmediateNode();
      assertNotNull(qName1);
      assertSame(qName0, qName1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(qName1, qName0);
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals("rr3", qName1.getName());
      assertNull(qName1.getPrefix());
      assertEquals("rr3", qName1.toString());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getValuePointer();
      assertNotNull(nodePointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = nodePointer0.getBaseValue();
      assertNull(object0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = (String)beanPointer0.getBaseValue();
      assertNotNull(string0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.escape("");
      assertNotNull(string0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals("", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory");
      assertNotNull(beanPointer1);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BeanPointer beanPointer2 = (BeanPointer)beanPointer1.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertNotNull(beanPointer2);
      assertNotSame(beanPointer0, beanPointer2);
      assertNotSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer2);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotSame(beanPointer2, beanPointer0);
      assertSame(beanPointer2, beanPointer1);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(1, beanPointer2.getLength());
      assertFalse(beanPointer2.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer2.getIndex());
      assertNull(beanPointer2.getNamespaceURI());
      assertFalse(beanPointer2.isAttribute());
      assertFalse(beanPointer2.isRoot());
      assertFalse(beanPointer2.isCollection());
      assertTrue(beanPointer2.isNode());
      assertFalse(beanPointer2.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertFalse(beanPointer2.equals((Object)beanPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("Nb4");
      assertNotNull(qName0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4", qName0.toString());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Nb4", nodeNameTest0.toString());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Nb4", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("Nb4", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      QName qName0 = new QName("count", "Nhm3b4");
      assertNotNull(qName0);
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count:Nhm3b4", qName0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      assertNotNull(beanPointer0);
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count:Nhm3b4", qName0.toString());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "count");
      assertNotNull(nodeNameTest0);
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count:Nhm3b4", qName0.toString());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      QName qName0 = new QName("$M;/Q<>L.*");
      assertNotNull(qName0);
      assertEquals("$M;/Q<>L.*", qName0.toString());
      assertEquals("$M;/Q<>L.*", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("$M;/Q<>L.*", qName0.toString());
      assertEquals("$M;/Q<>L.*", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.clone();
      assertNotNull(variablePointer1);
      assertNotSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer1, variablePointer0);
      assertEquals("$M;/Q<>L.*", qName0.toString());
      assertEquals("$M;/Q<>L.*", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(variablePointer1.isActual());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.equals((Object)variablePointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "+");
      assertNotNull(qName0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) null);
      assertNotNull(nodePointer0);
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isActual());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2008);
      assertNotNull(nodeTypeTest0);
      assertEquals(2008, nodeTypeTest0.getNodeType());
      
      NodeIterator nodeIterator0 = nodePointer0.childIterator(nodeTypeTest0, false, variablePointer0);
      assertNull(nodeIterator0);
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertEquals(":+", qName0.toString());
      assertEquals("+", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isActual());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertEquals(2008, nodeTypeTest0.getNodeType());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("<<unknown namespace>>", "\"<\"");
      assertNotNull(qName0);
      assertEquals("\"<\"", qName0.getName());
      assertEquals("<<unknown namespace>>:\"<\"", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      
      NodeIterator nodeIterator0 = variablePointer0.attributeIterator(qName0);
      assertNotNull(nodeIterator0);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals("\"<\"", qName0.getName());
      assertEquals("<<unknown namespace>>:\"<\"", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals(0, nodeIterator0.getPosition());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      QName qName0 = new QName("Nb4", "Nb4");
      assertNotNull(qName0);
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4:Nb4", qName0.toString());
      assertEquals("Nb4", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4:Nb4", qName0.toString());
      assertEquals("Nb4", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.setValue((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: Nb4:Nb4
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.setValue(variablePointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isRoot());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        nullPointer0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("?,zZGgl{efY.+Hyq,H", "");
      assertNotNull(qName0);
      assertEquals("?,zZGgl{efY.+Hyq,H", qName0.getPrefix());
      assertEquals("?,zZGgl{efY.+Hyq,H:", qName0.toString());
      assertEquals("", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("?,zZGgl{efY.+Hyq,H", qName0.getPrefix());
      assertEquals("?,zZGgl{efY.+Hyq,H:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '?,zZGgl{efY.+Hyq,H:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      QName qName0 = new QName("PlH{66");
      assertNotNull(qName0);
      assertEquals("PlH{66", qName0.getName());
      assertEquals("PlH{66", qName0.toString());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("PlH{66", qName0.getName());
      assertEquals("PlH{66", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: PlH{66
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertNotNull(locale0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("it_IT", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertNotNull(variablePointer0);
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      QName qName0 = new QName("count", "Nhm3b4");
      assertNotNull(qName0);
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "count");
      assertNotNull(nodeNameTest0);
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("count:Nhm3b4", qName0.toString());
      assertEquals("Nhm3b4", qName0.getName());
      assertEquals("count", qName0.getPrefix());
      assertEquals("count", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("count:Nhm3b4", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'count:Nhm3b4'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByKey((JXPathContext) null, "{}", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      QName qName0 = new QName("UwV7Xi^gT*", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertEquals("UwV7Xi^gT*:", qName0.toString());
      assertEquals("UwV7Xi^gT*", qName0.getPrefix());
      
      Locale locale0 = Locale.KOREAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("", qName0.getName());
      assertEquals("UwV7Xi^gT*:", qName0.toString());
      assertEquals("UwV7Xi^gT*", qName0.getPrefix());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        beanPointer0.getPointerByID(jXPathContextReferenceImpl0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      QName qName0 = new QName("rr3");
      assertNotNull(qName0);
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("rr3", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'rr3'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      QName qName0 = new QName("A[GM", "A[GM");
      assertNotNull(qName0);
      assertEquals("A[GM:A[GM", qName0.toString());
      assertEquals("A[GM", qName0.getPrefix());
      assertEquals("A[GM", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("A[GM:A[GM", qName0.toString());
      assertEquals("A[GM", qName0.getPrefix());
      assertEquals("A[GM", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "3aAW9xQe*7{4.z=60R");
      assertNotNull(nodeNameTest0);
      assertEquals("A[GM:A[GM", qName0.toString());
      assertEquals("A[GM", qName0.getPrefix());
      assertEquals("A[GM", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("3aAW9xQe*7{4.z=60R", nodeNameTest0.getNamespaceURI());
      assertEquals("A[GM:A[GM", nodeNameTest0.toString());
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey((JXPathContext) null, "A[GM", nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("V9.`1U!");
      assertNotNull(qName0);
      assertEquals("V9.`1U!", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("V9.`1U!", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("V9.`1U!", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("V9.`1U!", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'V9.`1U!'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      QName qName0 = new QName("/@", "/@");
      assertNotNull(qName0);
      assertEquals("/@", qName0.getName());
      assertEquals("/@", qName0.getPrefix());
      assertEquals("/@:/@", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertEquals("/@", qName0.getName());
      assertEquals("/@", qName0.getPrefix());
      assertEquals("/@:/@", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      QName qName0 = new QName("{h");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("{h", qName0.toString());
      assertEquals("{h", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("{h", qName0.toString());
      assertEquals("{h", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: {h
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("deF<TFx1$6E>Hj@=", "C");
      assertNotNull(qName0);
      assertEquals("deF<TFx1$6E>Hj@=:C", qName0.toString());
      assertEquals("C", qName0.getName());
      assertEquals("deF<TFx1$6E>Hj@=", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("deF<TFx1$6E>Hj@=:C", qName0.toString());
      assertEquals("C", qName0.getName());
      assertEquals("deF<TFx1$6E>Hj@=", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'deF<TFx1$6E>Hj@=:C'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      QName qName0 = new QName("M?hbo>~0", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertEquals("M?hbo>~0:", qName0.toString());
      assertEquals("M?hbo>~0", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getName());
      assertEquals("M?hbo>~0:", qName0.toString());
      assertEquals("M?hbo>~0", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: M?hbo>~0:
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName(".FMFf(Z\"");
      assertNotNull(qName0);
      assertEquals(".FMFf(Z\"", qName0.getName());
      assertEquals(".FMFf(Z\"", qName0.toString());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals(".FMFf(Z\"", qName0.getName());
      assertEquals(".FMFf(Z\"", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '.FMFf(Z\"'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      QName qName0 = new QName("rr3");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.getName());
      assertEquals("rr3", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.escape((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      QName qName0 = new QName("T8UeAwxA%Oxt|");
      assertNotNull(qName0);
      assertEquals("T8UeAwxA%Oxt|", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("T8UeAwxA%Oxt|", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("T8UeAwxA%Oxt|", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("T8UeAwxA%Oxt|", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("T8UeAwxA%Oxt|", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("T8UeAwxA%Oxt|", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) "T8UeAwxA%Oxt|");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $T8UeAwxA%Oxt|
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      QName qName0 = new QName("value", "value");
      assertNotNull(qName0);
      assertEquals("value:value", qName0.toString());
      assertEquals("value", qName0.getName());
      assertEquals("value", qName0.getPrefix());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "value", (Locale) null);
      assertNotNull(beanPointer0);
      assertEquals("value:value", qName0.toString());
      assertEquals("value", qName0.getName());
      assertEquals("value", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      // Undeclared exception!
      try { 
        beanPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      QName qName0 = new QName("eW^@TU`Eu6?%");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("eW^@TU`Eu6?%", qName0.toString());
      assertEquals("eW^@TU`Eu6?%", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("eW^@TU`Eu6?%", qName0.toString());
      assertEquals("eW^@TU`Eu6?%", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) qName0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertNull(qName0.getPrefix());
      assertEquals("eW^@TU`Eu6?%", qName0.toString());
      assertEquals("eW^@TU`Eu6?%", qName0.getName());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $eW^@TU`Eu6?%
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      QName qName0 = new QName("' and '");
      assertNotNull(qName0);
      assertEquals("' and '", qName0.getName());
      assertEquals("' and '", qName0.toString());
      assertNull(qName0.getPrefix());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      assertNotNull(nullPointer0);
      assertEquals("' and '", qName0.getName());
      assertEquals("' and '", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        nullPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "&apos;");
      assertNotNull(nodeNameTest0);
      assertEquals("&apos;", nodeNameTest0.getNamespaceURI());
      
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, (QName) null, 46, (Object) nodeNameTest0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      QName qName0 = new QName("Cannot compare pointers that do not belong to the same tree: '");
      assertNotNull(qName0);
      assertEquals(" '", qName0.getName());
      assertEquals("Cannot compare pointers that do not belong to the same tree", qName0.getPrefix());
      assertEquals("Cannot compare pointers that do not belong to the same tree: '", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(" '", qName0.getName());
      assertEquals("Cannot compare pointers that do not belong to the same tree", qName0.getPrefix());
      assertEquals("Cannot compare pointers that do not belong to the same tree: '", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, (-1651), (Object) "7^~*u[-z)L_!<vst");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("h^Ax*ip=l2");
      assertNotNull(qName0);
      assertEquals("h^Ax*ip=l2", qName0.toString());
      assertEquals("h^Ax*ip=l2", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("h^Ax*ip=l2", qName0.toString());
      assertEquals("h^Ax*ip=l2", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 385, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'h^Ax*ip=l2'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("|aqsQVmgfqm1");
      assertNotNull(qName0);
      assertEquals("|aqsQVmgfqm1", qName0.toString());
      assertEquals("|aqsQVmgfqm1", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("|aqsQVmgfqm1", qName0.toString());
      assertEquals("|aqsQVmgfqm1", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) null);
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("|aqsQVmgfqm1", qName0.toString());
      assertEquals("|aqsQVmgfqm1", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer1.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory did not assign a collection to variable '|aqsQVmgfqm1' for path: $|aqsQVmgfqm1
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("j-?mKQZyTG^");
      assertNotNull(qName0);
      assertEquals("j-?mKQZyTG^", qName0.toString());
      assertEquals("j-?mKQZyTG^", qName0.getName());
      assertNull(qName0.getPrefix());
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, 1150);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("{oX;?#yW5: VA`',u", (String) null);
      assertNotNull(qName0);
      assertNull(qName0.getName());
      assertEquals("{oX;?#yW5: VA`',u", qName0.getPrefix());
      assertEquals("{oX;?#yW5: VA`',u:null", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getName());
      assertEquals("{oX;?#yW5: VA`',u", qName0.getPrefix());
      assertEquals("{oX;?#yW5: VA`',u:null", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getName());
      assertEquals("{oX;?#yW5: VA`',u", qName0.getPrefix());
      assertEquals("{oX;?#yW5: VA`',u:null", qName0.toString());
      assertEquals("{oX;?#yW5: VA`',u:null", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertNull(qName0.getName());
      assertEquals("{oX;?#yW5: VA`',u", qName0.getPrefix());
      assertEquals("{oX;?#yW5: VA`',u:null", qName0.toString());
      assertEquals("{oX;?#yW5: VA`',u:null", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '{oX;?#yW5: VA`',u:null'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      QName qName0 = new QName("aj[WX{)_4");
      assertNotNull(qName0);
      assertEquals("aj[WX{)_4", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("aj[WX{)_4", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("aj[WX{)_4", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("aj[WX{)_4", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      QName qName0 = new QName((String) null, "h0=");
      assertNotNull(qName0);
      assertEquals("h0=", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("h0=", qName0.toString());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      assertNotNull(nullPointer0);
      assertEquals("h0=", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("h0=", qName0.toString());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        nullPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      QName qName0 = new QName("' ", "' ");
      assertNotNull(qName0);
      assertEquals("' ", qName0.getPrefix());
      assertEquals("' :' ", qName0.toString());
      assertEquals("' ", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("' ", qName0.getPrefix());
      assertEquals("' :' ", qName0.toString());
      assertEquals("' ", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.childIterator((NodeTest) null, true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertNotNull(variablePointer0);
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, (QName) null, variablePointer0);
      assertNotNull(beanPointer0);
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNotNull(nodeNameTest0);
      assertNull(nodeNameTest0.getNamespaceURI());
      
      // Undeclared exception!
      try { 
        beanPointer0.childIterator(nodeNameTest0, true, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        nullPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = new Locale("j.B");
      assertNotNull(locale0);
      assertEquals("j.b", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("j.b", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("j.b", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("j.b", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("j.b", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("j.b", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale1 = beanPointer0.getLocale();
      assertNotNull(locale1);
      assertSame(locale0, locale1);
      assertSame(locale1, locale0);
      assertEquals("j.b", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("j.b", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("j.b", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals("", locale1.getISO3Country());
      assertEquals("j.b", locale1.toString());
      assertEquals("", locale1.getCountry());
      assertEquals("", locale1.getVariant());
      assertEquals("j.b", locale1.getLanguage());
      assertEquals("j.b", locale1.getISO3Language());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = variablePointer0.getLocale();
      assertNull(locale0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      QName qName0 = new QName("%/-A~},)>4-[?oNSB$Y");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.getName());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.getName());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.toString());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getValuePointer();
      assertNotNull(beanPointer1);
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.getName());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.toString());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isContainer());
      assertTrue(beanPointer1.isRoot());
      assertFalse(beanPointer1.isAttribute());
      assertTrue(beanPointer1.isNode());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      QName qName0 = new QName("%/-A~},)>4-[?oNSB$Y");
      assertNotNull(qName0);
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.getName());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      assertNotNull(beanPointer0);
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.getName());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NamespaceResolver namespaceResolver0 = beanPointer0.getNamespaceResolver();
      assertNull(namespaceResolver0);
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("%/-A~},)>4-[?oNSB$Y", qName0.getName());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      assertNotNull(beanPointer0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isContainer();
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName((String) null, (String) null);
      assertNotNull(qName0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.getNamespaceURI((String) null);
      assertNull(string0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("  ", "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      assertNotNull(qName0);
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("  :], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("  :], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) null, (Object) "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("  :], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer0.getValuePointer();
      assertNotNull(beanPointer0);
      assertSame(variablePointer0, variablePointer1);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("  :], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getImmediateValuePointer();
      assertNotNull(beanPointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("  :], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals("  ", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer1.isRoot());
      assertEquals(1, beanPointer1.getLength());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      QName qName0 = new QName("Cannot compare pointers that do not belong to the same tree: '");
      assertNotNull(qName0);
      assertEquals(" '", qName0.getName());
      assertEquals("Cannot compare pointers that do not belong to the same tree", qName0.getPrefix());
      assertEquals("Cannot compare pointers that do not belong to the same tree: '", qName0.toString());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "Cannot compare pointers that do not belong to the same tree: '", locale0);
      assertNotNull(beanPointer0);
      assertEquals(" '", qName0.getName());
      assertEquals("Cannot compare pointers that do not belong to the same tree", qName0.getPrefix());
      assertEquals("Cannot compare pointers that do not belong to the same tree: '", qName0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = ((NodePointer)beanPointer0).escape("Cannot compare pointers that do not belong to the same tree: '");
      assertNotNull(string0);
      assertEquals(" '", qName0.getName());
      assertEquals("Cannot compare pointers that do not belong to the same tree", qName0.getPrefix());
      assertEquals("Cannot compare pointers that do not belong to the same tree: '", qName0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals("Cannot compare pointers that do not belong to the same tree: &apos;", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      QName qName0 = new QName("java.home");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("java.home", qName0.getName());
      assertEquals("java.home", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("java.home", qName0.getName());
      assertEquals("java.home", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("java.home", qName0.getName());
      assertEquals("java.home", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = nodePointer0.compareTo(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("java.home", qName0.getName());
      assertEquals("java.home", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(0, int0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      QName qName0 = new QName("Nb4", "Nb4");
      assertNotNull(qName0);
      assertEquals("Nb4:Nb4", qName0.toString());
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Nb4:Nb4", qName0.toString());
      assertEquals("Nb4", qName0.getPrefix());
      assertEquals("Nb4", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      // Undeclared exception!
      try { 
        variablePointer0.compareTo(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.ri.model.NodePointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      QName qName0 = new QName("(");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("(", qName0.getName());
      assertEquals("(", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("(", qName0.getName());
      assertEquals("(", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("(", qName0.getName());
      assertEquals("(", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = nodePointer0.asPath();
      assertNotNull(string0);
      assertNull(qName0.getPrefix());
      assertEquals("(", qName0.getName());
      assertEquals("(", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("$(", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      QName qName0 = new QName("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", qName0.getPrefix());
      
      Locale locale0 = Locale.GERMANY;
      assertNotNull(locale0);
      assertEquals("de_DE", locale0.toString());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", qName0.getPrefix());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, "org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory");
      assertNotNull(beanPointer1);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", qName0.getPrefix());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isContainer());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isAttribute());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = beanPointer1.asPath();
      assertNotNull(string0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", qName0.getPrefix());
      assertEquals("de_DE", locale0.toString());
      assertEquals("DE", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DEU", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isContainer());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isAttribute());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isCollection());
      assertEquals("'org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory'/org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", string0);
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      QName qName0 = new QName("rr3");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.toString());
      assertEquals("rr3", qName0.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.toString());
      assertEquals("rr3", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("rr3", nodeNameTest0.toString());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.toString());
      assertEquals("rr3", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.toString());
      assertEquals("rr3", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.toString());
      assertEquals("rr3", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) qName0);
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("rr3", qName0.toString());
      assertEquals("rr3", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("rr3", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, true, variablePointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("h^Ax*ip=l2");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("h^Ax*ip=l2", qName0.getName());
      assertEquals("h^Ax*ip=l2", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getPrefix());
      assertEquals("h^Ax*ip=l2", qName0.getName());
      assertEquals("h^Ax*ip=l2", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isDefaultNamespace("h^Ax*ip=l2");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(qName0.getPrefix());
      assertEquals("h^Ax*ip=l2", qName0.getName());
      assertEquals("h^Ax*ip=l2", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(boolean0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = nodePointer0.getLocale();
      assertNull(locale0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      QName qName0 = new QName("{h");
      assertNotNull(qName0);
      assertEquals("{h", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("{h", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("{h", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("{h", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      
      variablePointer0.locale = locale0;
      assertEquals("{h", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("{h", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CN", variablePointer0.locale.getCountry());
      assertEquals("zho", variablePointer0.locale.getISO3Language());
      assertEquals("CHN", variablePointer0.locale.getISO3Country());
      assertEquals("zh_CN", variablePointer0.locale.toString());
      assertEquals("zh", variablePointer0.locale.getLanguage());
      assertEquals("", variablePointer0.locale.getVariant());
      
      boolean boolean0 = variablePointer0.isLanguage("{h");
      assertEquals("{h", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("{h", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      QName qName0 = new QName("Nb4", "Nb4");
      assertNotNull(qName0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4:Nb4", qName0.toString());
      assertEquals("Nb4", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4:Nb4", qName0.toString());
      assertEquals("Nb4", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = new QName("<<unknown namespace>>");
      assertNotNull(qName1);
      assertEquals("<<unknown namespace>>", qName1.toString());
      assertEquals("<<unknown namespace>>", qName1.getName());
      assertNull(qName1.getPrefix());
      assertFalse(qName1.equals((Object)qName0));
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "");
      assertNotNull(nodeNameTest0);
      assertEquals("<<unknown namespace>>", qName1.toString());
      assertEquals("<<unknown namespace>>", qName1.getName());
      assertNull(qName1.getPrefix());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("<<unknown namespace>>", nodeNameTest0.toString());
      assertFalse(qName1.equals((Object)qName0));
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertNotSame(qName0, qName1);
      assertNotSame(qName1, qName0);
      assertEquals("Nb4", qName0.getName());
      assertEquals("Nb4:Nb4", qName0.toString());
      assertEquals("Nb4", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals("<<unknown namespace>>", qName1.toString());
      assertEquals("<<unknown namespace>>", qName1.getName());
      assertNull(qName1.getPrefix());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("<<unknown namespace>>", nodeNameTest0.toString());
      assertFalse(boolean0);
      assertFalse(qName0.equals((Object)qName1));
      assertFalse(qName1.equals((Object)qName0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      QName qName0 = new QName("Cannot create an attribute for path ");
      assertNotNull(qName0);
      assertEquals("Cannot create an attribute for path ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Cannot create an attribute for path ", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Cannot create an attribute for path ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Cannot create an attribute for path ", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
      assertNotNull(nodeTypeTest0);
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      
      boolean boolean0 = variablePointer0.testNode(nodeTypeTest0);
      assertEquals("Cannot create an attribute for path ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Cannot create an attribute for path ", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nodeTypeTest0.getNodeType());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("N=:", "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      assertNotNull(qName0);
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) null, (Object) "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", nodeNameTest0.toString());
      
      boolean boolean0 = variablePointer1.testNode(nodeNameTest0);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", nodeNameTest0.toString());
      assertFalse(boolean0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      QName qName0 = new QName("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", qName0.getPrefix());
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      
      Locale locale0 = Locale.GERMANY;
      assertNotNull(locale0);
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", qName0.getPrefix());
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("&quot;");
      assertNotNull(processingInstructionTest0);
      assertEquals("&quot;", processingInstructionTest0.getTarget());
      
      boolean boolean0 = beanPointer0.testNode(processingInstructionTest0);
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory", qName0.getPrefix());
      assertEquals("org.!pache.common.jxpath.ri.model.Aynamic.DynmicPoint.rFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals("&quot;", processingInstructionTest0.getTarget());
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.testNode((NodeTest) null);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("N=:", "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      assertNotNull(qName0);
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) null, (Object) "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      assertNotNull(variablePointer1);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer0.getValuePointer();
      assertNotNull(beanPointer0);
      assertSame(variablePointer0, variablePointer1);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = (String)beanPointer0.getRootNode();
      assertNotNull(string0);
      assertSame(variablePointer0, variablePointer1);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.getName());
      assertEquals("N=:", qName0.getPrefix());
      assertEquals("N=::], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals("], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>", string0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = (String)beanPointer0.getRootNode();
      assertNotNull(string0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "$Ijz&YJq");
      assertNotNull(nodeNameTest0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", nodeNameTest0.toString());
      assertEquals("$Ijz&YJq", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", nodeNameTest0.toString());
      assertEquals("$Ijz&YJq", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)jXPathContextReferenceImpl0.getRelativeContext(beanPointer0);
      assertNotNull(jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertNotSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
      assertEquals("GP NL", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", nodeNameTest0.toString());
      assertEquals("$Ijz&YJq", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertFalse(jXPathContextReferenceImpl1.equals((Object)jXPathContextReferenceImpl0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      assertNotNull(beanPointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isActual();
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory:GP NL", qName0.toString());
      assertEquals("GP NL", qName0.getName());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      QName qName0 = new QName(" of ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable:  of 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      QName qName0 = new QName("' and '");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      assertNotNull(nodePointer0);
      
      nodePointer0.getValue();
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      assertNotNull(nodePointer0);
      
      boolean boolean0 = nodePointer0.isNode();
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      QName qName0 = new QName("Factory cannot define variable '", "Factory cannot define variable '");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isNode();
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      QName qName0 = new QName("PlH{66");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isRoot();
      assertTrue(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      QName qName0 = new QName("A~=G", "A~=G");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      boolean boolean0 = nodePointer0.isRoot();
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NodePointer nodePointer1 = nodePointer0.getParent();
      assertFalse(variablePointer0.isAttribute());
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory");
      NodePointer nodePointer2 = nodePointer1.getParent();
      assertNotNull(nodePointer2);
      assertFalse(nodePointer2.isAttribute());
      assertTrue(nodePointer2.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer2.getIndex());
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("N=:", "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      NodePointer nodePointer0 = variablePointer0.getValuePointer();
      nodePointer0.getNamespaceResolver();
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByID((JXPathContext) null, "<<unknown namespace>>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, qName0, 51, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //[52], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      QName qName0 = new QName("Cannot create an attribute for path ", "N=b4");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByKey(jXPathContext0, "u>3VsI%@Fq", "u>3VsI%@Fq");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      QName qName0 = new QName("Nb4", "Nb4");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      QName qName1 = new QName("<<unknown namespace>>", "^Yd");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "");
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      QName qName0 = new QName("], OPERATION IS NOT ALOWED FOR THIS TYPE OF NODEZH-CN");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getNamespaceURI();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      QName qName0 = new QName("Cannot compare pointers that do not belong to the same tree: '");
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "Cannot compare pointers that do not belong to the same tree: '", locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      // Undeclared exception!
      try { 
        nodePointer0.createAttribute(jXPathContext0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path 'Cannot compare pointers that do not belong to the same tree: ''/@Cannot compare pointers that do not belong to the same tree: ', operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      QName qName0 = new QName("", "I8JLO");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :I8JLO
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      QName qName0 = new QName("{h");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getDefaultNamespaceURI();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      QName qName0 = new QName("{h");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.isLanguage("{h");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("N=:", "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      variablePointer0.createPath((JXPathContext) null, (Object) "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      NodePointer nodePointer0 = variablePointer0.getValuePointer();
      int int0 = nodePointer0.getIndex();
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", "GP NL");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodePointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*");
      // Undeclared exception!
      try { 
        nodePointer0.getNodeSetByKey(jXPathContext0, "GP NL", nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("N=:", "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      
      variablePointer0.createPath((JXPathContext) null, (Object) "], OPERATION IS NOT ALLOWED FOR THIS TYPE OF NODE<<UNKNOWN NAMESPACE>>-{H-<<UNKNOWN NAMESPACE>>");
      NodePointer nodePointer0 = variablePointer0.getValuePointer();
      assertFalse(nodePointer0.isRoot());
      assertTrue(variablePointer0.isRoot());
      
      Object object0 = new Object();
      NodePointer nodePointer1 = nodePointer0.createPath((JXPathContext) null, object0);
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertTrue(variablePointer0.isRoot());
      
      variablePointer0.printPointerChain();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.isAttribute();
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(boolean0);
      assertTrue(variablePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      variablePointer0.setAttribute(false);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}
