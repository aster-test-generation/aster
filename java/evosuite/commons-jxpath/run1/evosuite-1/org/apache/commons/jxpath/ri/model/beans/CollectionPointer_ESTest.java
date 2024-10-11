
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


package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
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
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionPointer_ESTest extends CollectionPointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 29, (Object) "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertEquals(29, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, locale0, locale0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
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
      assertNotNull(beanPointer0);
      
      int int0 = nodePointer0.compareChildNodePointers(beanPointer0, nodePointer0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertEquals(29, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals(2147483619, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.CHINA;
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, (-2), object0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertTrue(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isNode());
      assertEquals((-2), collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
      
      boolean boolean0 = collectionPointer1.equals(collectionPointer0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertTrue(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isRoot());
      assertFalse(collectionPointer1.isNode());
      assertEquals((-2), collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer0.equals((Object)collectionPointer1));
      assertFalse(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(12);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(12, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.hashCode();
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertEquals("it", locale0.getLanguage());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(12, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodePointer nodePointer0 = collectionPointer0.getValuePointer();
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale0, locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      int int0 = collectionPointer0.getLength();
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      Object object0 = collectionPointer0.getBaseValue();
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      Object object0 = collectionPointer0.getImmediateNode();
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(object0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 29, (Object) "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isCollection());
      assertEquals(29, nodePointer0.getIndex());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      
      NodePointer nodePointer1 = nodePointer0.createPath((JXPathContext) null, object0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isCollection());
      assertEquals(29, nodePointer0.getIndex());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(29, nodePointer1.getIndex());
      assertFalse(nodePointer1.isNode());
      assertTrue(nodePointer1.isRoot());
      assertFalse(nodePointer1.isAttribute());
      assertTrue(nodePointer1.isContainer());
      assertTrue(nodePointer1.isCollection());
      assertNull(nodePointer1.getNamespaceURI());
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertFalse(nodePointer1.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer1);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertSame(nodePointer0, nodePointer1);
      assertSame(nodePointer1, nodePointer0);
      assertNotSame(nodePointer1, collectionPointer0);
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isNode());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isNode());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isRoot());
      assertEquals(0, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isAttribute());
      assertFalse(collectionPointer1.isNode());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(collectionPointer0, collectionPointer1);
      assertSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "A!j,Z~uIC");
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, object0);
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isRoot());
      assertFalse(nodePointer0.isContainer());
      assertTrue(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("processing-instruction('");
      assertEquals("processing-instruction('", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("processing-instruction('", qName0.getName());
      assertNotNull(qName0);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE);
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("processing-instruction('", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("processing-instruction('", qName0.getName());
      assertFalse(collectionPointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isRoot());
      assertNull(collectionPointer1.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isAttribute());
      assertTrue(collectionPointer1.isNode());
      assertTrue(collectionPointer1.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, collectionPointer1);
      assertNotSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setAttribute(true);
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("<<unknown namespace>>", "");
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:", qName0.toString());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, (-1619));
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertEquals((-1619), nodePointer0.getIndex());
      assertTrue(nodePointer0.isAttribute());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 0);
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(0, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
      assertEquals(0, linkedList0.size());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertNotNull(list0);
      assertFalse(list0.contains(locale0));
      
      NodePointer nodePointer1 = nodePointer0.createPath((JXPathContext) null, (Object) list0);
      assertEquals("it_IT", locale0.toString());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(0, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(0, linkedList0.size());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertFalse(nodePointer1.isAttribute());
      assertTrue(nodePointer1.isContainer());
      assertTrue(nodePointer1.isCollection());
      assertEquals(0, nodePointer1.getIndex());
      assertFalse(nodePointer1.isNode());
      assertNull(nodePointer1.getNamespaceURI());
      assertTrue(nodePointer1.isRoot());
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertFalse(nodePointer1.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(collectionPointer0, nodePointer1);
      assertNotSame(nodePointer0, collectionPointer0);
      assertSame(nodePointer0, nodePointer1);
      assertSame(nodePointer1, nodePointer0);
      assertNotSame(nodePointer1, collectionPointer0);
      assertNotNull(nodePointer1);
      assertFalse(list0.contains(locale0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale0, locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", qName0.toString());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 0, (Object) collectionPointer0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", qName0.toString());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isRoot());
      assertEquals(0, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      
      int int0 = collectionPointer0.compareChildNodePointers(collectionPointer0, nodePointer0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", qName0.toString());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isRoot());
      assertEquals(0, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName("", "");
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: :
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ROOT;
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
      assertEquals(0, linkedList0.size());
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(list0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer("", locale0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("FR", locale0.getCountry());
      assertEquals("FRA", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_FR", locale0.toString());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.setValue(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      QName qName0 = new QName("Y^", "Y^");
      assertEquals("Y^", qName0.getName());
      assertEquals("Y^:Y^", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CHINESE;
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("Y^", qName0.getName());
      assertEquals("Y^:Y^", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("Y^", qName0.getName());
      assertEquals("Y^:Y^", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(0);
      assertEquals("Y^", qName0.getName());
      assertEquals("Y^:Y^", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.toString());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl.addNodePointerFactory((NodePointerFactory) null);
      // Undeclared exception!
      try { 
        collectionPointer0.isLeaf();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      QName qName0 = new QName("-a{4(Fk0nX", "A!j,Z~uIC");
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) null, (Object) "A!j,Z~uIC");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: -a{4(Fk0nX:A!j,Z~uIC
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      QName qName0 = new QName("|<[t.sFlZEM", (String) null);
      assertEquals("|<[t.sFlZEM", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals("|<[t.sFlZEM:null", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.FRENCH;
      assertEquals("", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.toString());
      assertNotNull(locale0);
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertEquals("|<[t.sFlZEM", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals("|<[t.sFlZEM:null", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.toString());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(nullPointer0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(nullPointer0, qName0, nullPointer0);
      assertEquals("|<[t.sFlZEM", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals("|<[t.sFlZEM:null", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.toString());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, (Object) null);
      assertEquals("|<[t.sFlZEM", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals("|<[t.sFlZEM:null", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.toString());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertEquals("", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.toString());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      Object object0 = nullPointer0.getNodeValue();
      assertEquals("|<[t.sFlZEM", qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals("|<[t.sFlZEM:null", qName0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr", locale0.toString());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertTrue(nullPointer0.isRoot());
      assertTrue(nullPointer0.isLeaf());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(object0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot setValue of an object that is not some other object's property
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createPath((JXPathContext) null, (Object) collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "A!j,Z~uIC");
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX:A!j,Z~uIC", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("A!j,Z~uIC", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 934, (Object) variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.ri.model.VariablePointer into a collection of size 935
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("Y^:", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("Y^:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("Y^:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, Integer.MIN_VALUE, (Object) beanPointer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale0, locale0);
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      assertEquals("<<unknown namespace>>:<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertNotNull(qName0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 1549);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.util.Locale into a collection of size 1550
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(0);
      assertEquals("IT", locale0.getCountry());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("it_IT", locale0.toString());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName0 = new QName("<<unknown namespace>>");
      assertNull(qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.toString());
      assertNotNull(qName0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "%W1crz9M)U<&hk>wyL");
      assertNull(qName0.getPrefix());
      assertEquals("<<unknown namespace>>", qName0.getName());
      assertEquals("<<unknown namespace>>", qName0.toString());
      assertEquals("<<unknown namespace>>", nodeNameTest0.toString());
      assertEquals("%W1crz9M)U<&hk>wyL", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator(nodeNameTest0, false, collectionPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(locale0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(3057);
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertTrue(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(3057, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      // Undeclared exception!
      try { 
        collectionPointer0.childIterator(nodeNameTest0, true, collectionPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "-a{4(Fk0nX");
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertNotNull(jXPathContextReferenceImpl0);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertTrue(collectionPointer1.isNode());
      assertFalse(collectionPointer1.isRoot());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(collectionPointer0, collectionPointer1);
      assertSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 1132);
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(1132, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      
      NodePointer nodePointer1 = nodePointer0.createPath((JXPathContext) null);
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals(1132, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isContainer());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer1.isContainer());
      assertFalse(nodePointer1.isNode());
      assertNull(nodePointer1.getNamespaceURI());
      assertTrue(nodePointer1.isCollection());
      assertTrue(nodePointer1.isRoot());
      assertEquals(1132, nodePointer1.getIndex());
      assertFalse(nodePointer1.isAttribute());
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertFalse(nodePointer1.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer1);
      assertNotSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, nodePointer1);
      assertNotSame(nodePointer0, collectionPointer0);
      assertSame(nodePointer1, nodePointer0);
      assertNotSame(nodePointer1, collectionPointer0);
      assertNotNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "-a{4(Fk0nX");
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex((-506));
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertEquals((-506), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)collectionPointer0.getValuePointer();
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isRoot());
      assertEquals((-506), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "-a{4(Fk0nX");
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      collectionPointer0.setValue(object0);
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      collectionPointer0.setValue("%W1crz9M)U<&hk>wyL");
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "-a{4(Fk0nX");
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex((-506));
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(collectionPointer0.isNode());
      assertEquals((-506), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)collectionPointer0.getImmediateNode();
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(collectionPointer0.isNode());
      assertEquals((-506), collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertNull(variablePointer1.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertNotNull(variablePointer1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "-a{4(Fk0nX");
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      VariablePointer variablePointer1 = (VariablePointer)collectionPointer0.getNode();
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isContainer());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertNotNull(variablePointer1);
      
      CollectionPointer collectionPointer1 = (CollectionPointer)collectionPointer0.getValuePointer();
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer1.isCollection());
      assertFalse(collectionPointer1.isRoot());
      assertNull(collectionPointer1.getNamespaceURI());
      assertFalse(collectionPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer1.getIndex());
      assertFalse(collectionPointer1.isContainer());
      assertTrue(collectionPointer1.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(variablePointer0, variablePointer1);
      assertSame(collectionPointer0, collectionPointer1);
      assertSame(collectionPointer1, collectionPointer0);
      assertNotNull(collectionPointer1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("-a{4(Fk0nX", "-a{4(Fk0nX");
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertNotNull(qName0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(variablePointer0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, variablePointer0);
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodePointer nodePointer0 = collectionPointer0.createPath((JXPathContext) null, (Object) "-a{4(Fk0nX");
      assertEquals("-a{4(Fk0nX:-a{4(Fk0nX", qName0.toString());
      assertEquals("-a{4(Fk0nX", qName0.getPrefix());
      assertEquals("-a{4(Fk0nX", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertTrue(nodePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(collectionPointer0, nodePointer0);
      assertSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      assertEquals("Y^:", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      Object object1 = collectionPointer0.getBaseValue();
      assertEquals("Y^:", qName0.toString());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertSame(object0, object1);
      assertSame(object1, object0);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALY;
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.asPath();
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it_IT", locale0.toString());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(string0);
      assertEquals("/.[1]", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("Y^:", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("Y^:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("Y^:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isRoot());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(0);
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("Y^:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = collectionPointer0.asPath();
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("Y^:", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(string0);
      assertEquals("/[1]", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("Y^:", qName0.toString());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("Y^:", qName0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("Y^:", qName0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      String string0 = collectionPointer0.asPath();
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("Y^:", qName0.toString());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(1, beanPointer0.getLength());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(string0);
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      String string0 = collectionPointer0.asPath();
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.toString());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(string0);
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      assertEquals(0, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      boolean boolean0 = collectionPointer0.testNode(nodeTypeTest0);
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(0, nodeTypeTest0.getNodeType());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, object0);
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(". It cannot be converted to ");
      assertEquals(". It cannot be converted to ", processingInstructionTest0.getTarget());
      assertNotNull(processingInstructionTest0);
      
      boolean boolean0 = collectionPointer0.testNode(processingInstructionTest0);
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(". It cannot be converted to ", processingInstructionTest0.getTarget());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.CHINA;
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = collectionPointer0.testNode(nodeNameTest0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      assertEquals(1, nodeTypeTest0.getNodeType());
      assertNotNull(nodeTypeTest0);
      
      boolean boolean0 = collectionPointer0.testNode(nodeTypeTest0);
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(1, nodeTypeTest0.getNodeType());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      boolean boolean0 = collectionPointer0.testNode((NodeTest) null);
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertFalse(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertNotNull(qName0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertNotNull(locale0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(beanPointer0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(beanPointer0, object0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      collectionPointer0.setIndex(0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Y^:", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertNotNull(nodeNameTest0);
      
      boolean boolean0 = collectionPointer0.testNode(nodeNameTest0);
      assertEquals("Y^:", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("Y^", qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(collectionPointer0.isContainer());
      assertFalse(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(0, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Y^:", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodePointer nodePointer0 = collectionPointer0.namespacePointer("9OSQEJc8`,%6A[C");
      assertEquals("", locale0.getVariant());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("it_IT", locale0.toString());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, (-34));
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertEquals((-34), nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      
      NodePointer nodePointer1 = nodePointer0.namespacePointer("Bh0B8");
      assertEquals("it", locale0.getLanguage());
      assertEquals("IT", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("ITA", locale0.getISO3Country());
      assertEquals("it_IT", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertNull(collectionPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isRoot());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.toString());
      assertEquals("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(nodePointer0.getNamespaceURI());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.isNode());
      assertTrue(nodePointer0.isRoot());
      assertEquals((-34), nodePointer0.getIndex());
      assertTrue(nodePointer0.isCollection());
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.CANADA;
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodeIterator nodeIterator0 = collectionPointer0.namespaceIterator();
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("en_CA", locale0.toString());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isNode());
      assertTrue(collectionPointer0.isCollection());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      QName qName0 = new QName("processing-instruction('");
      assertNull(qName0.getPrefix());
      assertEquals("processing-instruction('", qName0.toString());
      assertEquals("processing-instruction('", qName0.getName());
      assertNotNull(qName0);
      
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, (-2213));
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertNull(qName0.getPrefix());
      assertEquals("processing-instruction('", qName0.toString());
      assertEquals("processing-instruction('", qName0.getName());
      assertFalse(nodePointer0.isNode());
      assertEquals((-2213), nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNotNull(nodePointer0);
      
      NodeIterator nodeIterator0 = nodePointer0.namespaceIterator();
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertTrue(collectionPointer0.isRoot());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isCollection());
      assertTrue(collectionPointer0.isNode());
      assertFalse(collectionPointer0.isContainer());
      assertNull(qName0.getPrefix());
      assertEquals("processing-instruction('", qName0.toString());
      assertEquals("processing-instruction('", qName0.getName());
      assertFalse(nodePointer0.isNode());
      assertEquals((-2213), nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isCollection());
      assertTrue(nodePointer0.isContainer());
      assertNull(nodePointer0.getNamespaceURI());
      assertFalse(nodePointer0.isAttribute());
      assertFalse(collectionPointer0.equals((Object)nodePointer0));
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotSame(collectionPointer0, nodePointer0);
      assertNotSame(nodePointer0, collectionPointer0);
      assertNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertEquals("ko", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertNotNull(locale0);
      
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      assertEquals("ko", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(collectionPointer0);
      
      NodeIterator nodeIterator0 = collectionPointer0.attributeIterator((QName) null);
      assertEquals("ko", locale0.toString());
      assertEquals("kor", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ko", locale0.getLanguage());
      assertTrue(collectionPointer0.isNode());
      assertNull(collectionPointer0.getNamespaceURI());
      assertTrue(collectionPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, collectionPointer0.getIndex());
      assertFalse(collectionPointer0.isAttribute());
      assertFalse(collectionPointer0.isContainer());
      assertTrue(collectionPointer0.isCollection());
      assertEquals(0, nodeIterator0.getPosition());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertNotNull(nodeIterator0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ITALY;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "%W1crz9M)U<&hk>wyL");
      NodeIterator nodeIterator0 = collectionPointer0.childIterator(nodeNameTest0, true, collectionPointer0);
      assertEquals(0, nodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      QName qName0 = new QName("Y^", "Y^");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      collectionPointer0.setIndex(0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      collectionPointer0.childIterator(nodeNameTest0, false, variablePointer0);
      assertFalse(collectionPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("processing-instruction('");
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, (-2213));
      boolean boolean0 = collectionPointer0.equals(nodePointer0);
      assertFalse(boolean0);
      assertFalse(nodePointer0.equals((Object)collectionPointer0));
      assertEquals((-2213), nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      Object object1 = collectionPointer0.clone();
      boolean boolean0 = collectionPointer0.equals(object1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      boolean boolean0 = collectionPointer0.equals("Y^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ITALY;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.equals(collectionPointer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      QName qName0 = new QName("Y^", "Y^");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      CollectionPointer collectionPointer1 = new CollectionPointer(nodePointer0, (Object) null);
      boolean boolean0 = collectionPointer0.equals(collectionPointer1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      NodePointer nodePointer0 = collectionPointer0.createChild((JXPathContext) null, qName0, 29, (Object) "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory");
      // Undeclared exception!
      try { 
        nodePointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      QName qName0 = new QName("Y^", "Y^");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      collectionPointer0.setIndex(0);
      collectionPointer0.attributeIterator(qName0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertFalse(collectionPointer0.isNode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      QName qName0 = new QName("Y^", "Y^");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      collectionPointer0.setIndex(0);
      boolean boolean0 = collectionPointer0.isContainer();
      assertEquals(0, collectionPointer0.getIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      boolean boolean0 = collectionPointer0.isContainer();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      CollectionPointer collectionPointer0 = new CollectionPointer("", locale0);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      boolean boolean0 = collectionPointer0.isLeaf();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "");
      NodePointer nodePointer1 = collectionPointer0.createChild(jXPathContext0, qName0, (-1));
      assertEquals((-1), nodePointer1.getIndex());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      QName qName0 = new QName("Y^", "");
      Locale locale0 = Locale.CANADA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Object object0 = new Object();
      CollectionPointer collectionPointer0 = new CollectionPointer(nodePointer0, object0);
      int int0 = collectionPointer0.compareChildNodePointers(nodePointer0, nodePointer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = collectionPointer0.getName();
      assertNull(qName0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.KOREAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      boolean boolean0 = collectionPointer0.isCollection();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ITALIAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      // Undeclared exception!
      try { 
        collectionPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((NodePointer) null, (Object) null);
      int int0 = collectionPointer0.getLength();
      assertEquals(0, int0);
  }
}
