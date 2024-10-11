
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
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NodePointer_ESTest extends NodePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      QName qName0 = new QName("&]^,C0rI\" Oj=>=WEk", "' and '");
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.escape("&]^,C0rI\" Oj=>=WEk");
      assertEquals("&]^,C0rI&quot; Oj=>=WEk", string0);
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      QName qName0 = new QName("Rq_0");
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, (Locale) null);
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(nullPointer0, qName0, "Rq_0");
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Rq_0", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Rq_0", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        beanPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 47);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path null()/Rq_0/Rq_0[48], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isContainer());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      VariablePointer variablePointer2 = (VariablePointer)variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 0, (Object) nodeNameTest0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", nodeNameTest0.toString());
      assertFalse(variablePointer2.isNode());
      assertTrue(variablePointer2.isRoot());
      assertNull(variablePointer2.getNamespaceURI());
      assertEquals(0, variablePointer2.getIndex());
      assertTrue(variablePointer2.isContainer());
      assertTrue(variablePointer2.isActual());
      assertFalse(variablePointer2.isAttribute());
      assertFalse(variablePointer2.equals((Object)variablePointer0));
      assertFalse(variablePointer2.equals((Object)variablePointer1));
      assertNotNull(variablePointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(variablePointer0, variablePointer2);
      assertSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer2, variablePointer0);
      assertNotSame(variablePointer2, variablePointer1);
      
      int int0 = variablePointer0.compareChildNodePointers(variablePointer1, variablePointer2);
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertTrue(variablePointer1.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isContainer());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", nodeNameTest0.toString());
      assertFalse(variablePointer2.isNode());
      assertTrue(variablePointer2.isRoot());
      assertNull(variablePointer2.getNamespaceURI());
      assertEquals(0, variablePointer2.getIndex());
      assertTrue(variablePointer2.isContainer());
      assertTrue(variablePointer2.isActual());
      assertFalse(variablePointer2.isAttribute());
      assertFalse(variablePointer0.equals((Object)variablePointer2));
      assertFalse(variablePointer1.equals((Object)variablePointer2));
      assertFalse(variablePointer2.equals((Object)variablePointer0));
      assertFalse(variablePointer2.equals((Object)variablePointer1));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(variablePointer0, variablePointer2);
      assertSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer1, variablePointer2);
      assertSame(variablePointer1, variablePointer0);
      assertNotSame(variablePointer2, variablePointer0);
      assertNotSame(variablePointer2, variablePointer1);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.setValue("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      QName qName0 = new QName("&]^,C0rI\" Oj=>=WEk", "' and '");
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.remove();
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      beanPointer0.setIndex((-1702));
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals((-1702), beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      QName qName0 = new QName("Rq_0");
      assertEquals("Rq_0", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Rq_0", qName0.toString());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, (Locale) null);
      assertEquals("Rq_0", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Rq_0", qName0.toString());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("Rq_0", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Rq_0", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Rq_0", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = beanPointer0.testNode(nodeNameTest0);
      assertTrue(boolean0);
      assertEquals("Rq_0", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Rq_0", qName0.toString());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Rq_0", nodeNameTest0.toString());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getImmediateValuePointer();
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      NodeIterator nodeIterator0 = beanPointer0.namespaceIterator();
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      QName qName0 = new QName("&]^,C0rI\" Oj=>=WEk", "' and '");
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = nodePointer0.isLeaf();
      assertTrue(boolean0);
      assertEquals("' and '", qName0.getName());
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, variablePointer0, locale0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isLeaf();
      assertFalse(boolean0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      QName qName0 = new QName("(B xcw|R");
      assertEquals("(B xcw|R", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("(B xcw|R", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "(B xcw|R");
      assertEquals("(B xcw|R", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("(B xcw|R", qName0.toString());
      assertEquals("(B xcw|R", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("(B xcw|R", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertEquals("(B xcw|R", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("(B xcw|R", qName0.toString());
      assertEquals("(B xcw|R", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("(B xcw|R", nodeNameTest0.getNamespaceURI());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isLanguage("");
      assertTrue(boolean0);
      assertEquals("(B xcw|R", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("(B xcw|R", qName0.toString());
      assertEquals("(B xcw|R", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("(B xcw|R", nodeNameTest0.getNamespaceURI());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      QName qName0 = new QName("> ]|h4{H", "");
      assertEquals("> ]|h4{H:", qName0.toString());
      assertEquals("> ]|h4{H", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("> ]|h4{H:", qName0.toString());
      assertEquals("> ]|h4{H", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isContainer();
      assertTrue(boolean0);
      assertEquals("> ]|h4{H:", qName0.toString());
      assertEquals("> ]|h4{H", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isCollection();
      assertFalse(boolean0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      QName qName0 = new QName("}");
      assertNull(qName0.getPrefix());
      assertEquals("}", qName0.toString());
      assertEquals("}", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("}", qName0.toString());
      assertEquals("}", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isActual();
      assertFalse(boolean0);
      assertNull(qName0.getPrefix());
      assertEquals("}", qName0.toString());
      assertEquals("}", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      QName qName0 = new QName("&_*IV.Mm$_", "Was expecting:");
      assertEquals("Was expecting:", qName0.getName());
      assertEquals("&_*IV.Mm$_:Was expecting:", qName0.toString());
      assertEquals("&_*IV.Mm$_", qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, object0);
      assertEquals("Was expecting:", qName0.getName());
      assertEquals("&_*IV.Mm$_:Was expecting:", qName0.toString());
      assertEquals("&_*IV.Mm$_", qName0.getPrefix());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getValuePointer();
      assertEquals("Was expecting:", qName0.getName());
      assertEquals("&_*IV.Mm$_:Was expecting:", qName0.toString());
      assertEquals("&_*IV.Mm$_", qName0.getPrefix());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isCollection());
      assertTrue(beanPointer1.isRoot());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNotNull(beanPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.GERMAN;
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isActual());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = nullPointer0.getRootNode();
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertNull(qName0.toString());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("de", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isActual());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertNull(object0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object1 = beanPointer0.getRootNode();
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(object1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(object0, object1);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object1 = beanPointer0.getNode();
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNotNull(object1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(object0, object1);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, (Locale) null);
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = nullPointer0.getName();
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(0, nullPointer0.getLength());
      assertNull(qName0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = beanPointer0.getName();
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals("", qName1.getName());
      assertEquals(":", qName1.toString());
      assertEquals("", qName1.getPrefix());
      assertNotNull(qName1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.getLength();
      assertEquals(0, int0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.getLength();
      assertEquals(1, int0);
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KOR", locale0.getISO3Country());
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
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.getIndex();
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateParentPointer();
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer1 = nodePointer0.getImmediateParentPointer();
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(nodePointer1.isActual());
      assertTrue(nodePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertTrue(nodePointer1.isRoot());
      assertFalse(nodePointer1.isNode());
      assertNull(nodePointer1.getNamespaceURI());
      assertFalse(nodePointer1.isAttribute());
      assertNotNull(nodePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, nodePointer1);
      assertSame(nodePointer1, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getImmediateValuePointer();
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)beanPointer0.getImmediateNode();
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertSame(variablePointer0, variablePointer1);
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertSame(variablePointer1, variablePointer0);
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      QName qName0 = new QName("xB", "xB");
      assertEquals("xB:xB", qName0.toString());
      assertEquals("xB", qName0.getPrefix());
      assertEquals("xB", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("xB:xB", qName0.toString());
      assertEquals("xB", qName0.getPrefix());
      assertEquals("xB", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals("xB:xB", qName0.toString());
      assertEquals("xB", qName0.getPrefix());
      assertEquals("xB", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = nodePointer0.getBaseValue();
      assertEquals("xB:xB", qName0.toString());
      assertEquals("xB", qName0.getPrefix());
      assertEquals("xB", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(object0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)variablePointer1.getBaseValue();
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertSame(variablePointer0, variablePointer1);
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertSame(variablePointer1, variablePointer0);
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = ((NodePointer)beanPointer0).escape("");
      assertEquals("", string0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      VariablePointer variablePointer2 = (VariablePointer)variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 0, (Object) nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", nodeNameTest0.toString());
      assertFalse(variablePointer2.isAttribute());
      assertTrue(variablePointer2.isRoot());
      assertEquals(0, variablePointer2.getIndex());
      assertTrue(variablePointer2.isActual());
      assertFalse(variablePointer2.isNode());
      assertNull(variablePointer2.getNamespaceURI());
      assertTrue(variablePointer2.isContainer());
      assertFalse(variablePointer2.equals((Object)variablePointer0));
      assertFalse(variablePointer2.equals((Object)variablePointer1));
      assertNotNull(variablePointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer0, variablePointer2);
      assertNotSame(variablePointer2, variablePointer0);
      assertNotSame(variablePointer2, variablePointer1);
      
      VariablePointer variablePointer3 = (VariablePointer)variablePointer2.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) variablePointer1);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", nodeNameTest0.toString());
      assertFalse(variablePointer2.isAttribute());
      assertTrue(variablePointer2.isRoot());
      assertEquals(0, variablePointer2.getIndex());
      assertTrue(variablePointer2.isActual());
      assertFalse(variablePointer2.isNode());
      assertNull(variablePointer2.getNamespaceURI());
      assertTrue(variablePointer2.isContainer());
      assertNull(variablePointer3.getNamespaceURI());
      assertEquals(0, variablePointer3.getIndex());
      assertFalse(variablePointer3.isAttribute());
      assertTrue(variablePointer3.isActual());
      assertFalse(variablePointer3.isNode());
      assertTrue(variablePointer3.isRoot());
      assertTrue(variablePointer3.isContainer());
      assertFalse(variablePointer0.equals((Object)variablePointer2));
      assertFalse(variablePointer1.equals((Object)variablePointer2));
      assertFalse(variablePointer2.equals((Object)variablePointer0));
      assertFalse(variablePointer2.equals((Object)variablePointer1));
      assertFalse(variablePointer3.equals((Object)variablePointer0));
      assertFalse(variablePointer3.equals((Object)variablePointer1));
      assertNotNull(variablePointer3);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(variablePointer0, variablePointer3);
      assertSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer0, variablePointer2);
      assertNotSame(variablePointer1, variablePointer2);
      assertNotSame(variablePointer1, variablePointer3);
      assertSame(variablePointer1, variablePointer0);
      assertSame(variablePointer2, variablePointer3);
      assertNotSame(variablePointer2, variablePointer0);
      assertNotSame(variablePointer2, variablePointer1);
      assertNotSame(variablePointer3, variablePointer0);
      assertNotSame(variablePointer3, variablePointer1);
      assertSame(variablePointer3, variablePointer2);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      VariablePointer variablePointer2 = (VariablePointer)variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 0, (Object) null);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer2.isNode());
      assertTrue(variablePointer2.isRoot());
      assertTrue(variablePointer2.isContainer());
      assertNull(variablePointer2.getNamespaceURI());
      assertEquals(0, variablePointer2.getIndex());
      assertFalse(variablePointer2.isAttribute());
      assertTrue(variablePointer2.isActual());
      assertFalse(variablePointer2.equals((Object)variablePointer0));
      assertFalse(variablePointer2.equals((Object)variablePointer1));
      assertNotNull(variablePointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer0, variablePointer2);
      assertNotSame(variablePointer2, variablePointer0);
      assertNotSame(variablePointer2, variablePointer1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "}0_gEYS-Aq_");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("}0_gEYS-Aq_", nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      basicVariables0.declareVariable("org.apache.commons.jxpath.ri.model.beans.NullPointer", nodeNameTest0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("}0_gEYS-Aq_", nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      
      QName qName1 = new QName("org.apache.commons.jxpath.ri.model.beans.NullPointer");
      assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", qName1.toString());
      assertNull(qName1.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", qName1.getName());
      assertFalse(qName1.equals((Object)qName0));
      assertNotNull(qName1);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName1);
      assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", qName1.toString());
      assertNull(qName1.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", qName1.getName());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(qName1.equals((Object)qName0));
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.createChild((JXPathContext) null, qName1, Integer.MIN_VALUE, (Object) qName1);
      assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", qName1.toString());
      assertNull(qName1.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.beans.NullPointer", qName1.getName());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isActual());
      assertFalse(qName1.equals((Object)qName0));
      assertTrue(nodePointer0.equals((Object)variablePointer0));
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(qName1, qName0);
      assertNotSame(variablePointer0, nodePointer0);
      assertNotSame(nodePointer0, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      VariablePointer variablePointer2 = (VariablePointer)variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer2.getNamespaceURI());
      assertTrue(variablePointer2.isRoot());
      assertTrue(variablePointer2.isContainer());
      assertFalse(variablePointer2.isNode());
      assertFalse(variablePointer2.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer2.getIndex());
      assertTrue(variablePointer2.isActual());
      assertNotNull(variablePointer2);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer0, variablePointer2);
      assertSame(variablePointer2, variablePointer0);
      assertSame(variablePointer2, variablePointer1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathNotFoundException", "");
      assertEquals("", qName0.getName());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException:", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = new Locale("org.apache.commons.jxpath.JXPathNotFoundException");
      assertEquals("", locale0.getVariant());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.getLanguage());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.clone();
      assertEquals("", qName0.getName());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.getLanguage());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isCollection());
      assertTrue(beanPointer1.isRoot());
      assertFalse(beanPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer1.getLength());
      assertTrue(beanPointer1.isNode());
      assertNull(beanPointer1.getNamespaceURI());
      assertTrue(beanPointer1.equals((Object)beanPointer0));
      assertNotNull(beanPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1702));
      assertEquals((-1702), nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      NodeIterator nodeIterator0 = beanPointer0.childIterator(nodeTypeTest0, false, variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("ko", locale0.getLanguage());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertEquals((-1702), nodeTypeTest0.getNodeType());
      assertNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      QName qName0 = new QName("/@");
      assertEquals("/@", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/@", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("/@", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/@", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = variablePointer0.childIterator((NodeTest) null, false, (NodePointer) null);
      assertEquals("/@", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("/@", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(0, nodeIterator0.getPosition());
      assertNotNull(nodeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getImmediateValuePointer();
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanAttributeIterator beanAttributeIterator0 = (BeanAttributeIterator)beanPointer0.attributeIterator(qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, beanAttributeIterator0.getPosition());
      assertNotNull(beanAttributeIterator0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        variablePointer0.setValue(nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      QName qName0 = new QName("(B xcw|R");
      assertNull(qName0.getPrefix());
      assertEquals("(B xcw|R", qName0.getName());
      assertEquals("(B xcw|R", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "(B xcw|R");
      assertNull(qName0.getPrefix());
      assertEquals("(B xcw|R", qName0.getName());
      assertEquals("(B xcw|R", qName0.toString());
      assertEquals("(B xcw|R", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("(B xcw|R", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertNull(qName0.getPrefix());
      assertEquals("(B xcw|R", qName0.getName());
      assertEquals("(B xcw|R", qName0.toString());
      assertEquals("(B xcw|R", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("(B xcw|R", nodeNameTest0.getNamespaceURI());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.setValue(nodeNameTest0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      Locale locale0 = Locale.GERMANY;
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertEquals("DEU", locale0.getISO3Country());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("DE", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de_DE", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot remove an object that is not some other object's property or a collection element
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      QName qName0 = new QName(";/S!", ";/S!");
      assertEquals(";/S!", qName0.getName());
      assertEquals(";/S!", qName0.getPrefix());
      assertEquals(";/S!:;/S!", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals(";/S!", qName0.getName());
      assertEquals(";/S!", qName0.getPrefix());
      assertEquals(";/S!:;/S!", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("<<unknown namespace>>");
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
      
      QName qName0 = new QName("GXQ");
      assertEquals("GXQ", qName0.getName());
      assertEquals("GXQ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("GXQ", qName0.getName());
      assertEquals("GXQ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("<<unknown namespace>>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'GXQ'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      QName qName0 = new QName("\"string-length\"", "'0");
      assertEquals("'0", qName0.getName());
      assertEquals("\"string-length\":'0", qName0.toString());
      assertEquals("\"string-length\"", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("'0", qName0.getName());
      assertEquals("\"string-length\":'0", qName0.toString());
      assertEquals("\"string-length\"", qName0.getPrefix());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLanguage("\r");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      QName qName0 = new QName("6LWQ8dZ_l~jV<PpJ", "y!8De^HR-,2,(Exg");
      assertEquals("y!8De^HR-,2,(Exg", qName0.getName());
      assertEquals("6LWQ8dZ_l~jV<PpJ:y!8De^HR-,2,(Exg", qName0.toString());
      assertEquals("6LWQ8dZ_l~jV<PpJ", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("y!8De^HR-,2,(Exg", qName0.getName());
      assertEquals("6LWQ8dZ_l~jV<PpJ:y!8De^HR-,2,(Exg", qName0.toString());
      assertEquals("6LWQ8dZ_l~jV<PpJ", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 6LWQ8dZ_l~jV<PpJ:y!8De^HR-,2,(Exg
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName((String) null, "");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      QName qName0 = new QName(" i:t:7 k [&Z[z");
      assertEquals(" i", qName0.getPrefix());
      assertEquals("t:7 k [&Z[z", qName0.getName());
      assertEquals(" i:t:7 k [&Z[z", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals(" i", qName0.getPrefix());
      assertEquals("t:7 k [&Z[z", qName0.getName());
      assertEquals(" i:t:7 k [&Z[z", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
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
  public void test049()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("ravL%H))oc>L", "Exception trying to set value with xpath ");
      assertEquals("Exception trying to set value with xpath ", qName0.getName());
      assertEquals("ravL%H))oc>L", qName0.getPrefix());
      assertEquals("ravL%H))oc>L:Exception trying to set value with xpath ", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("Exception trying to set value with xpath ", qName0.getName());
      assertEquals("ravL%H))oc>L", qName0.getPrefix());
      assertEquals("ravL%H))oc>L:Exception trying to set value with xpath ", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'ravL%H))oc>L:Exception trying to set value with xpath '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      QName qName0 = new QName((String) null, "");
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
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
  public void test053()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName((String) null, "Factory is not set on the JXPathContext - cannot create path: ");
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("Factory is not set on the JXPathContext - cannot create path: ", qName0.getName());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Factory is not set on the JXPathContext - cannot create path: '
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      QName qName0 = new QName("\"string-length\"", "'0");
      assertEquals("\"string-length\"", qName0.getPrefix());
      assertEquals("\"string-length\":'0", qName0.toString());
      assertEquals("'0", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("\"string-length\"", qName0.getPrefix());
      assertEquals("\"string-length\":'0", qName0.toString());
      assertEquals("'0", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("\"string-length\"", qName0.getPrefix());
      assertEquals("\"string-length\":'0", qName0.toString());
      assertEquals("'0", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("\"string-length\":'0", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertEquals("\"string-length\"", qName0.getPrefix());
      assertEquals("\"string-length\":'0", qName0.toString());
      assertEquals("'0", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("\"string-length\":'0", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByKey(jXPathContextReferenceImpl0, (String) null, "<<unknown namespace>>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, variablePointer0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        beanPointer0.getPointerByID(jXPathContextReferenceImpl0, "@C'5=xls>MxzD 07.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by ID - no IdentityManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      QName qName0 = new QName("&]^,C0rI\" Oj=>=WEk", "' and '");
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("' and '", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("&]^,C0rI\" Oj=>=WEk", qName0.getPrefix());
      assertEquals("&]^,C0rI\" Oj=>=WEk:' and '", qName0.toString());
      assertEquals("' and '", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: &]^,C0rI\" Oj=>=WEk:' and '
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("QJ)0gB");
      assertEquals("QJ)0gB", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("QJ)0gB", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("QJ)0gB", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("QJ)0gB", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'QJ)0gB'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey(jXPathContextReferenceImpl0, "org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      QName qName0 = new QName("rK}", "rK}");
      assertEquals("rK}", qName0.getName());
      assertEquals("rK}", qName0.getPrefix());
      assertEquals("rK}:rK}", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("rK}", qName0.getName());
      assertEquals("rK}", qName0.getPrefix());
      assertEquals("rK}:rK}", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: rK}:rK}
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("No write method");
      assertNull(qName0.getPrefix());
      assertEquals("No write method", qName0.getName());
      assertEquals("No write method", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("No write method", qName0.getName());
      assertEquals("No write method", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getLength();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'No write method'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      QName qName0 = new QName("Q 5");
      assertEquals("Q 5", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Q 5", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertEquals("Q 5", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("Q 5", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
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
  public void test063()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("jY&(3&cpT/'9|go");
      assertEquals("jY&(3&cpT/'9|go", qName0.toString());
      assertEquals("jY&(3&cpT/'9|go", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("jY&(3&cpT/'9|go", qName0.toString());
      assertEquals("jY&(3&cpT/'9|go", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'jY&(3&cpT/'9|go'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      QName qName0 = new QName(":");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("2n:$1b.YzF!8RY`");
      assertEquals("2n", qName0.getPrefix());
      assertEquals("2n:$1b.YzF!8RY`", qName0.toString());
      assertEquals("$1b.YzF!8RY`", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("2n", qName0.getPrefix());
      assertEquals("2n:$1b.YzF!8RY`", qName0.toString());
      assertEquals("$1b.YzF!8RY`", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $2n:$1b.YzF!8RY`
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
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
  public void test068()  throws Throwable  {
      QName qName0 = new QName("0<!>k+(>7V", "");
      assertEquals("0<!>k+(>7V", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("0<!>k+(>7V:", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.JAPANESE;
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      assertEquals("0<!>k+(>7V", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("0<!>k+(>7V:", qName0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ja", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("0<!>k+(>7V", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("0<!>k+(>7V:", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("0<!>k+(>7V:", nodeNameTest0.toString());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      assertEquals("0<!>k+(>7V", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("0<!>k+(>7V:", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("0<!>k+(>7V:", nodeNameTest0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        beanPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) "");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      QName qName0 = new QName((String) null, "$");
      assertNull(qName0.getPrefix());
      assertEquals("$", qName0.toString());
      assertEquals("$", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("$", qName0.toString());
      assertEquals("$", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      QName qName0 = new QName("9~N[q", "");
      assertEquals("9~N[q:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("9~N[q", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("9~N[q:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("9~N[q", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $9~N[q:
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      QName qName0 = new QName("wkJ%&)KHRLml", "jY&(3&cpT/'9|go");
      assertEquals("jY&(3&cpT/'9|go", qName0.getName());
      assertEquals("wkJ%&)KHRLml", qName0.getPrefix());
      assertEquals("wkJ%&)KHRLml:jY&(3&cpT/'9|go", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("jY&(3&cpT/'9|go", qName0.getName());
      assertEquals("wkJ%&)KHRLml", qName0.getPrefix());
      assertEquals("wkJ%&)KHRLml:jY&(3&cpT/'9|go", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
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
  public void test072()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isNode());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      // Undeclared exception!
      try { 
        variablePointer1.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, (-3115), (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index is less than 1: $org.apache.commons.jxpath.ri.compiler.CoreOperationEqual
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      QName qName0 = new QName("");
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) qName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      QName qName0 = new QName("P3l%U;]fW", "P3l%U;]fW");
      assertEquals("P3l%U;]fW", qName0.getPrefix());
      assertEquals("P3l%U;]fW", qName0.getName());
      assertEquals("P3l%U;]fW:P3l%U;]fW", qName0.toString());
      assertNotNull(qName0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "P3l%U;]fW");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("P3l%U;]fW", qName0.getPrefix());
      assertEquals("P3l%U;]fW", qName0.getName());
      assertEquals("P3l%U;]fW:P3l%U;]fW", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'P3l%U;]fW:P3l%U;]fW'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      QName qName0 = new QName(",RYK1Ye]Xe_");
      assertEquals(",RYK1Ye]Xe_", qName0.toString());
      assertEquals(",RYK1Ye]Xe_", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(",RYK1Ye]Xe_", qName0.toString());
      assertEquals(",RYK1Ye]Xe_", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("JXPath: found system property", "Empty expression context");
      assertEquals("JXPath: found system property", qName0.getPrefix());
      assertEquals("Empty expression context", qName0.getName());
      assertEquals("JXPath: found system property:Empty expression context", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("JXPath: found system property", qName0.getPrefix());
      assertEquals("Empty expression context", qName0.getName());
      assertEquals("JXPath: found system property:Empty expression context", qName0.toString());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 28);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'JXPath: found system property:Empty expression context'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      QName qName0 = new QName(":");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
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
  public void test078()  throws Throwable  {
      QName qName0 = new QName("Y]QF/S", "' and '");
      assertEquals("Y]QF/S", qName0.getPrefix());
      assertEquals("' and '", qName0.getName());
      assertEquals("Y]QF/S:' and '", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("Y]QF/S", qName0.getPrefix());
      assertEquals("' and '", qName0.getName());
      assertEquals("Y]QF/S:' and '", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.compareTo("&apos; and &apos;");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.jxpath.ri.model.NodePointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("KR", locale0.getCountry());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.compareChildNodePointers(variablePointer0, variablePointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      Locale locale0 = Locale.UK;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, nodeNameTest0, locale0);
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("GBR", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_GB", locale0.toString());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.childIterator(nodeNameTest0, true, beanPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(basicVariables0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("Cannot compare pointers that do not belong to the same tree: '");
      assertEquals(" '", qName0.getName());
      assertEquals("Cannot compare pointers that do not belong to the same tree", qName0.getPrefix());
      assertEquals("Cannot compare pointers that do not belong to the same tree: '", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(" '", qName0.getName());
      assertEquals("Cannot compare pointers that do not belong to the same tree", qName0.getPrefix());
      assertEquals("Cannot compare pointers that do not belong to the same tree: '", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertNotNull(variablePointer0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.attributeIterator(qName0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'Cannot compare pointers that do not belong to the same tree: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      QName qName0 = new QName("Rq_0");
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, (Locale) null);
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, (Object) null);
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = nullPointer0.asPath();
      assertEquals("/Rq_0", string0);
      assertEquals("Rq_0", qName0.getName());
      assertEquals("Rq_0", qName0.toString());
      assertNull(qName0.getPrefix());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = nodePointer0.asPath();
      assertEquals("$:", string0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale1 = beanPointer0.getLocale();
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("KR", locale0.getCountry());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals("ko", locale1.getLanguage());
      assertEquals("", locale1.getVariant());
      assertEquals("kor", locale1.getISO3Language());
      assertEquals("KR", locale1.getCountry());
      assertEquals("ko_KR", locale1.toString());
      assertEquals("KOR", locale1.getISO3Country());
      assertNotNull(locale1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(locale0, locale1);
      assertSame(locale1, locale0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      QName qName0 = new QName(")");
      assertEquals(")", qName0.toString());
      assertEquals(")", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(")", qName0.toString());
      assertEquals(")", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = variablePointer0.getLocale();
      assertEquals(")", qName0.toString());
      assertEquals(")", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      QName qName0 = new QName("?h$vo ZODSeD;dQM^", "?h$vo ZODSeD;dQM^");
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getPrefix());
      assertEquals("?h$vo ZODSeD;dQM^:?h$vo ZODSeD;dQM^", qName0.toString());
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getPrefix());
      assertEquals("?h$vo ZODSeD;dQM^:?h$vo ZODSeD;dQM^", qName0.toString());
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, "?h$vo ZODSeD;dQM^");
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getPrefix());
      assertEquals("?h$vo ZODSeD;dQM^:?h$vo ZODSeD;dQM^", qName0.toString());
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getValuePointer();
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getPrefix());
      assertEquals("?h$vo ZODSeD;dQM^:?h$vo ZODSeD;dQM^", qName0.toString());
      assertEquals("?h$vo ZODSeD;dQM^", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isRoot());
      assertEquals(1, beanPointer1.getLength());
      assertFalse(beanPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNotNull(beanPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getImmediateValuePointer();
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl1 = (JXPathContextReferenceImpl)beanPointer0.getValue();
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl1.isLenient());
      assertNotNull(jXPathContextReferenceImpl1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertSame(variablePointer0, variablePointer1);
      assertSame(jXPathContextReferenceImpl0, jXPathContextReferenceImpl1);
      assertSame(variablePointer1, variablePointer0);
      assertSame(jXPathContextReferenceImpl1, jXPathContextReferenceImpl0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.JXPathNotFoundException", "");
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException:", qName0.toString());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      Locale locale0 = new Locale("org.apache.commons.jxpath.JXPathNotFoundException");
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isContainer();
      assertFalse(boolean0);
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.JXPathNotFoundException:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("org.apache.commons.jxpath.jxpathnotfoundexception", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.toString();
      assertEquals("$org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", string0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, (Locale) null);
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertNotNull(nullPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPointer nullPointer1 = (NullPointer)nullPointer0.getImmediateValuePointer();
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer1.isActual());
      assertFalse(nullPointer1.isAttribute());
      assertTrue(nullPointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertFalse(nullPointer1.isContainer());
      assertFalse(nullPointer1.isCollection());
      assertNull(nullPointer1.getNamespaceURI());
      assertTrue(nullPointer1.isNode());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer1.isLeaf());
      assertNotNull(nullPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(nullPointer0, nullPointer1);
      assertSame(nullPointer1, nullPointer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      QName qName0 = new QName("jY&(3&cpT/'9|go:'0", "");
      assertEquals("jY&(3&cpT/'9|go:'0:", qName0.toString());
      assertEquals("jY&(3&cpT/'9|go:'0", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("jY&(3&cpT/'9|go:'0:", qName0.toString());
      assertEquals("jY&(3&cpT/'9|go:'0", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "jY&(3&cpT/'9|go:'0");
      assertEquals("jY&(3&cpT/'9|go:'0:", qName0.toString());
      assertEquals("jY&(3&cpT/'9|go:'0", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("jY&(3&cpT/'9|go:'0:", nodeNameTest0.toString());
      assertEquals("jY&(3&cpT/'9|go:'0", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) qName0);
      assertEquals("jY&(3&cpT/'9|go:'0:", qName0.toString());
      assertEquals("jY&(3&cpT/'9|go:'0", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $jY&(3&cpT/'9|go:'0:
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      QName qName0 = new QName("Y]QF/S", "' and '");
      assertEquals("Y]QF/S:' and '", qName0.toString());
      assertEquals("' and '", qName0.getName());
      assertEquals("Y]QF/S", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("Y]QF/S:' and '", qName0.toString());
      assertEquals("' and '", qName0.getName());
      assertEquals("Y]QF/S", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.escape("' and '");
      assertEquals("&apos; and &apos;", string0);
      assertEquals("Y]QF/S:' and '", qName0.toString());
      assertEquals("' and '", qName0.getName());
      assertEquals("Y]QF/S", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(string0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREA;
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.compareTo(variablePointer0);
      assertEquals(0, int0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals("KOR", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko_KR", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("KR", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getImmediateValuePointer();
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, beanPointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer1.isRoot());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(1, beanPointer1.getLength());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertNotNull(beanPointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      
      // Undeclared exception!
      try { 
        beanPointer1.createAttribute(jXPathContextReferenceImpl0, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path $org.apache.commons.jxpath.ri.compiler.CoreOperationEqual/org.apache.commons.jxpath.ri.compiler.CoreOperationEqual/@org.apache.commons.jxpath.ri.compiler.CoreOperationEqual, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "5k9u");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", nodeNameTest0.toString());
      assertEquals("5k9u", nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer");
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, false, beanPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isDefaultNamespace("KOGL<bY1Sbnt|j");
      assertFalse(boolean0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNotNull(variablePointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) jXPathContextReferenceImpl0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertNotNull(variablePointer1);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)variablePointer1.getImmediateValuePointer();
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertNotNull(beanPointer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      
      Locale locale0 = beanPointer0.getLocale();
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertFalse(variablePointer1.isNode());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertNull(locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      QName qName0 = new QName("jY&(3&cpT/'9|go:'0", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      QName qName1 = new QName("jY&(3&cpT/'9|go:'0");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "jY&(3&cpT/'9|go:'0");
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1702));
      boolean boolean0 = nodePointer0.testNode(nodeTypeTest0);
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(boolean0);
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      QName qName0 = new QName(":");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.testNode((NodeTest) null);
      assertFalse(variablePointer0.isAttribute());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      boolean boolean0 = nodePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      QName qName0 = new QName("}");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, ".u8Kx]Y@b]`Xw.n8");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      // Undeclared exception!
      try { 
        jXPathContext0.getRelativeContext(nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: }
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      QName qName0 = new QName("H~j");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      assertTrue(nodePointer0.isRoot());
      
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      jXPathContext0.getRelativeContext(nodePointer0);
      jXPathContext0.getRelativeContext(nodePointer0);
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      boolean boolean0 = nodePointer1.isActual();
      assertFalse(nodePointer1.isAttribute());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      QName qName0 = new QName("Y]QF/S", "' and '");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isNode();
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      boolean boolean0 = variablePointer0.isRoot();
      assertFalse(variablePointer0.isAttribute());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      boolean boolean0 = nodePointer1.isRoot();
      assertFalse(nodePointer1.isAttribute());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      NodePointer nodePointer2 = NodePointer.newChildNodePointer(nodePointer1, qName0, nodePointer1);
      NodePointer nodePointer3 = nodePointer2.getParent();
      assertNotNull(nodePointer3);
      assertFalse(nodePointer3.isAttribute());
      assertSame(nodePointer3, nodePointer1);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      QName qName0 = new QName("}");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, ".u8Kx]Y@b]`Xw.n8");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      NodePointer nodePointer1 = nodePointer0.getParent();
      assertFalse(nodePointer0.isAttribute());
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      variablePointer0.getNamespaceResolver();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, variablePointer0, locale0);
      // Undeclared exception!
      try { 
        nodePointer0.getPointerByID((JXPathContext) null, "@C'5=xls>MxzD 07.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      QName qName0 = new QName("");
      Object object0 = new Object();
      Locale locale0 = Locale.ROOT;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, (QName) null, 100, (Object) nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //null[101], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      // Undeclared exception!
      try { 
        nodePointer0.getPointerByKey((JXPathContext) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      QName qName0 = new QName(":");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getNamespaceURI("jY&(3&cpT/'9|go:'0");
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NodePointer nodePointer0 = variablePointer0.createChild(jXPathContext0, qName0, 0, (Object) nodeNameTest0);
      NodePointer nodePointer1 = nodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
      assertEquals(0, nodePointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      QName qName0 = new QName(">X51}", "");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, ">X51}", locale0);
      nodePointer0.namespacePointer("");
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      QName qName0 = new QName("(B xcw|R");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "(B xcw|R");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      nodePointer0.getNamespaceURI();
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "");
      Locale locale0 = Locale.UK;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, nodeNameTest0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      NodePointer nodePointer1 = nodePointer0.createPath(jXPathContext0);
      assertTrue(nodePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Variables variables0 = jXPathContext0.getVariables();
      QName qName0 = new QName("ravL%H))oc>L", "Exception trying to set value with xpath ");
      VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
      variablePointer0.setNamespaceResolver(namespaceResolver0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      Object object1 = nodePointer0.getNodeValue();
      assertNotNull(object1);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getDefaultNamespaceURI();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      boolean boolean0 = nodePointer0.isLanguage("GXq");
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(boolean0);
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey((JXPathContext) null, "<<unknown namespace>>", "$org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
      NodePointer nodePointer0 = variablePointer0.createPath(jXPathContext0, (Object) jXPathContext0);
      NodePointer nodePointer1 = nodePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer1);
      assertFalse(nodePointer1.isRoot());
      assertTrue(nodePointer0.isRoot());
      
      NodePointer nodePointer2 = nodePointer1.createPath(jXPathContext0, (Object) "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      assertFalse(nodePointer2.isAttribute());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      
      variablePointer0.printPointerChain();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      boolean boolean0 = nodePointer0.isAttribute();
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(boolean0);
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      boolean boolean0 = nodePointer0.isNode();
      assertFalse(nodePointer0.isAttribute());
      assertTrue(boolean0);
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      QName qName0 = new QName("", "");
      Object object0 = new Object();
      Locale locale0 = Locale.KOREA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, object0, locale0);
      assertNotNull(nodePointer0);
      
      nodePointer0.setAttribute(false);
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}
