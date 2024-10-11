
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
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NodePointer_ESTest extends NodePointer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      assertNotNull(nodeNameTest0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      
      variablePointer0.setValue(nodeNameTest0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      QName qName0 = new QName("@UybXWg|18$KM)XB)B", "@UybXWg|18$KM)XB)B");
      assertNotNull(qName0);
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getName());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getPrefix());
      assertEquals("@UybXWg|18$KM)XB)B:@UybXWg|18$KM)XB)B", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getName());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getPrefix());
      assertEquals("@UybXWg|18$KM)XB)B:@UybXWg|18$KM)XB)B", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.remove();
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getName());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getPrefix());
      assertEquals("@UybXWg|18$KM)XB)B:@UybXWg|18$KM)XB)B", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      QName qName0 = new QName("' and '");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("' and '", qName0.getName());
      assertEquals("' and '", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("' and '", qName0.getName());
      assertEquals("' and '", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      variablePointer0.setIndex(122880);
      assertNull(qName0.getPrefix());
      assertEquals("' and '", qName0.getName());
      assertEquals("' and '", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(122880, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "n^r");
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertEquals("n^r", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertEquals("n^r", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = beanPointer0.namespacePointer("s!GUk]>{5bMfuy");
      assertNull(nodePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("", nodeNameTest0.toString());
      assertEquals("n^r", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("CA", locale0.getCountry());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      QName qName0 = new QName("T>dJ");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("T>dJ", qName0.getName());
      assertEquals("T>dJ", qName0.toString());
      
      Locale locale0 = new Locale("", "T>dJ");
      assertNotNull(locale0);
      assertEquals("", locale0.getLanguage());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertEquals("T>DJ", locale0.getCountry());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("T>dJ", qName0.getName());
      assertEquals("T>dJ", qName0.toString());
      assertEquals("", locale0.getLanguage());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertEquals("T>DJ", locale0.getCountry());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeIterator nodeIterator0 = nullPointer0.namespaceIterator();
      assertNull(nodeIterator0);
      assertNull(qName0.getPrefix());
      assertEquals("T>dJ", qName0.getName());
      assertEquals("T>dJ", qName0.toString());
      assertEquals("", locale0.getLanguage());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Language());
      assertEquals("T>DJ", locale0.getCountry());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isActual());
      assertFalse(nullPointer0.isContainer());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(nullPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isLeaf();
      assertFalse(boolean0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("it", locale0.toString());
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      QName qName0 = new QName("SdH&#d_//uq", "SdH&#d_//uq");
      assertNotNull(qName0);
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isDefaultNamespace((String) null);
      assertTrue(boolean0);
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      QName qName0 = new QName("?(", "?(");
      assertNotNull(qName0);
      assertEquals("?(", qName0.getName());
      assertEquals("?(", qName0.getPrefix());
      assertEquals("?(:?(", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("?(", qName0.getName());
      assertEquals("?(", qName0.getPrefix());
      assertEquals("?(:?(", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isContainer();
      assertTrue(boolean0);
      assertEquals("?(", qName0.getName());
      assertEquals("?(", qName0.getPrefix());
      assertEquals("?(:?(", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified");
      assertNotNull(qName0);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getPrefix());
      
      Locale locale0 = new Locale("Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified");
      assertNotNull(locale0);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", locale0.getVariant());
      assertEquals("CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED", locale0.getCountry());
      assertEquals("cannot find an element by id - no identitymanager has been specified_CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED_Cannot find an element by ID - no IdentityManager has been specified", locale0.toString());
      assertEquals("cannot find an element by id - no identitymanager has been specified", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", locale0.getVariant());
      assertEquals("CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED", locale0.getCountry());
      assertEquals("cannot find an element by id - no identitymanager has been specified_CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED_Cannot find an element by ID - no IdentityManager has been specified", locale0.toString());
      assertEquals("cannot find an element by id - no identitymanager has been specified", locale0.getLanguage());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer0.isCollection();
      assertFalse(boolean0);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", locale0.getVariant());
      assertEquals("CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED", locale0.getCountry());
      assertEquals("cannot find an element by id - no identitymanager has been specified_CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED_Cannot find an element by ID - no IdentityManager has been specified", locale0.toString());
      assertEquals("cannot find an element by id - no identitymanager has been specified", locale0.getLanguage());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      QName qName0 = new QName(":c.8\"TE\"MxvW");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("c.8\"TE\"MxvW", qName0.getName());
      assertEquals(":c.8\"TE\"MxvW", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("c.8\"TE\"MxvW", qName0.getName());
      assertEquals(":c.8\"TE\"MxvW", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isActual();
      assertFalse(boolean0);
      assertEquals("", qName0.getPrefix());
      assertEquals("c.8\"TE\"MxvW", qName0.getName());
      assertEquals(":c.8\"TE\"MxvW", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      QName qName0 = new QName("T>dJ");
      assertNotNull(qName0);
      assertEquals("T>dJ", qName0.toString());
      assertEquals("T>dJ", qName0.getName());
      assertNull(qName0.getPrefix());
      
      Locale locale0 = new Locale("", "T>dJ");
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("T>DJ", locale0.getCountry());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("T>dJ", qName0.toString());
      assertEquals("T>dJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("T>DJ", locale0.getCountry());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NullPointer nullPointer1 = (NullPointer)nullPointer0.getValuePointer();
      assertSame(nullPointer0, nullPointer1);
      assertSame(nullPointer1, nullPointer0);
      assertNotNull(nullPointer1);
      assertEquals("T>dJ", qName0.toString());
      assertEquals("T>dJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("T>DJ", locale0.getCountry());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getLanguage());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isLeaf());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isCollection());
      assertEquals(0, nullPointer1.getLength());
      assertFalse(nullPointer1.isContainer());
      assertTrue(nullPointer1.isRoot());
      assertNull(nullPointer1.getNamespaceURI());
      assertFalse(nullPointer1.isCollection());
      assertFalse(nullPointer1.isActual());
      assertEquals(Integer.MIN_VALUE, nullPointer1.getIndex());
      assertFalse(nullPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer1.isLeaf());
      assertTrue(nullPointer1.isNode());
      assertFalse(nullPointer1.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      QName qName0 = new QName("POINTER: ", "POINTER: ");
      assertNotNull(qName0);
      assertEquals("POINTER: ", qName0.getName());
      assertEquals("POINTER: ", qName0.getPrefix());
      assertEquals("POINTER: :POINTER: ", qName0.toString());
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.GERMAN;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("POINTER: ", qName0.getName());
      assertEquals("POINTER: ", qName0.getPrefix());
      assertEquals("POINTER: :POINTER: ", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object1 = beanPointer0.getValue();
      assertSame(object0, object1);
      assertSame(object1, object0);
      assertNotNull(object1);
      assertEquals("POINTER: ", qName0.getName());
      assertEquals("POINTER: ", qName0.getPrefix());
      assertEquals("POINTER: :POINTER: ", qName0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.getLanguage());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified");
      assertNotNull(qName0);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      
      Locale locale0 = new Locale("Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified");
      assertNotNull(locale0);
      assertEquals("cannot find an element by id - no identitymanager has been specified", locale0.getLanguage());
      assertEquals("cannot find an element by id - no identitymanager has been specified_CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED_Cannot find an element by ID - no IdentityManager has been specified", locale0.toString());
      assertEquals("CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED", locale0.getCountry());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", locale0.getVariant());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertEquals("cannot find an element by id - no identitymanager has been specified", locale0.getLanguage());
      assertEquals("cannot find an element by id - no identitymanager has been specified_CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED_Cannot find an element by ID - no IdentityManager has been specified", locale0.toString());
      assertEquals("CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED", locale0.getCountry());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", locale0.getVariant());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = (QName)beanPointer0.getRootNode();
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
      assertNotNull(qName1);
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified", qName0.toString());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName0.getName());
      assertEquals("cannot find an element by id - no identitymanager has been specified", locale0.getLanguage());
      assertEquals("cannot find an element by id - no identitymanager has been specified_CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED_Cannot find an element by ID - no IdentityManager has been specified", locale0.toString());
      assertEquals("CANNOT FIND AN ELEMENT BY ID - NO IDENTITYMANAGER HAS BEEN SPECIFIED", locale0.getCountry());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", locale0.getVariant());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName1.getPrefix());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified", qName1.getName());
      assertEquals("Cannot find an element by ID - no IdentityManager has been specified:Cannot find an element by ID - no IdentityManager has been specified", qName1.toString());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      QName qName0 = new QName("(S. ovc;R~Sbu-bm", "(S. ovc;R~Sbu-bm");
      assertNotNull(qName0);
      assertEquals("(S. ovc;R~Sbu-bm", qName0.getPrefix());
      assertEquals("(S. ovc;R~Sbu-bm", qName0.getName());
      assertEquals("(S. ovc;R~Sbu-bm:(S. ovc;R~Sbu-bm", qName0.toString());
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("(S. ovc;R~Sbu-bm", qName0.getPrefix());
      assertEquals("(S. ovc;R~Sbu-bm", qName0.getName());
      assertEquals("(S. ovc;R~Sbu-bm:(S. ovc;R~Sbu-bm", qName0.toString());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = (QName)beanPointer0.getNodeValue();
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
      assertNotNull(qName1);
      assertEquals("(S. ovc;R~Sbu-bm", qName0.getPrefix());
      assertEquals("(S. ovc;R~Sbu-bm", qName0.getName());
      assertEquals("(S. ovc;R~Sbu-bm:(S. ovc;R~Sbu-bm", qName0.toString());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals("(S. ovc;R~Sbu-bm", qName1.getName());
      assertEquals("(S. ovc;R~Sbu-bm:(S. ovc;R~Sbu-bm", qName1.toString());
      assertEquals("(S. ovc;R~Sbu-bm", qName1.getPrefix());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      QName qName0 = new QName("K*SaafiM}s9p]@Vy1b.");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.toString());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.getName());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      assertNotNull(nullPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.toString());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.getName());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = nullPointer0.getNode();
      assertNull(object0);
      assertNull(qName0.getPrefix());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.toString());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.getName());
      assertFalse(nullPointer0.isContainer());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isRoot());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      QName qName0 = new QName("  ", "AM,!]rMyLM_o:UG");
      assertNotNull(qName0);
      assertEquals("  ", qName0.getPrefix());
      assertEquals("AM,!]rMyLM_o:UG", qName0.getName());
      assertEquals("  :AM,!]rMyLM_o:UG", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("  ", qName0.getPrefix());
      assertEquals("AM,!]rMyLM_o:UG", qName0.getName());
      assertEquals("  :AM,!]rMyLM_o:UG", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = variablePointer0.getName();
      assertSame(qName0, qName1);
      assertSame(qName1, qName0);
      assertNotNull(qName1);
      assertEquals("  ", qName0.getPrefix());
      assertEquals("AM,!]rMyLM_o:UG", qName0.getName());
      assertEquals("  :AM,!]rMyLM_o:UG", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isActual());
      assertEquals("AM,!]rMyLM_o:UG", qName1.getName());
      assertEquals("  ", qName1.getPrefix());
      assertEquals("  :AM,!]rMyLM_o:UG", qName1.toString());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.getLength();
      assertEquals(0, int0);
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
  public void test017()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      assertNotNull(qName0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertNotNull(nodeNameTest0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      
      Locale locale0 = Locale.TAIWAN;
      assertNotNull(locale0);
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.getLength();
      assertEquals(1, int0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TW", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("L4Pds:Lh", "L4Pds:Lh");
      assertNotNull(qName0);
      assertEquals("L4Pds:Lh:L4Pds:Lh", qName0.toString());
      assertEquals("L4Pds:Lh", qName0.getName());
      assertEquals("L4Pds:Lh", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("L4Pds:Lh:L4Pds:Lh", qName0.toString());
      assertEquals("L4Pds:Lh", qName0.getName());
      assertEquals("L4Pds:Lh", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, "L4Pds:Lh");
      assertNotNull(beanPointer0);
      assertEquals("L4Pds:Lh:L4Pds:Lh", qName0.toString());
      assertEquals("L4Pds:Lh", qName0.getName());
      assertEquals("L4Pds:Lh", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.getIndex();
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals("L4Pds:Lh:L4Pds:Lh", qName0.toString());
      assertEquals("L4Pds:Lh", qName0.getName());
      assertEquals("L4Pds:Lh", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "n^r");
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("n^r", nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("n^r", nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getImmediateValuePointer();
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertNotNull(beanPointer1);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("n^r", nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("CA", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("fr_CA", locale0.toString());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isCollection());
      assertTrue(beanPointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isAttribute());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
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
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateParentPointer();
      assertNull(nodePointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      QName qName0 = new QName("", ". U\"HSW)Z]");
      assertNotNull(qName0);
      assertEquals(":. U\"HSW)Z]", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(". U\"HSW)Z]", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(":. U\"HSW)Z]", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(". U\"HSW)Z]", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer0);
      assertEquals(":. U\"HSW)Z]", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(". U\"HSW)Z]", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer1 = nodePointer0.getImmediateParentPointer();
      assertSame(variablePointer0, nodePointer1);
      assertSame(nodePointer1, variablePointer0);
      assertNotNull(nodePointer1);
      assertEquals(":. U\"HSW)Z]", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(". U\"HSW)Z]", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(nodePointer1.isRoot());
      assertFalse(nodePointer1.isNode());
      assertFalse(nodePointer1.isAttribute());
      assertTrue(nodePointer1.isContainer());
      assertFalse(nodePointer1.isActual());
      assertNull(nodePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      QName qName0 = new QName("ke", "ke");
      assertNotNull(qName0);
      assertEquals("ke:ke", qName0.toString());
      assertEquals("ke", qName0.getPrefix());
      assertEquals("ke", qName0.getName());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, "ke");
      assertNotNull(beanPointer0);
      assertEquals("ke:ke", qName0.toString());
      assertEquals("ke", qName0.getPrefix());
      assertEquals("ke", qName0.getName());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = (String)beanPointer0.getBaseValue();
      assertEquals("ke", string0);
      assertNotNull(string0);
      assertEquals("ke:ke", qName0.toString());
      assertEquals("ke", qName0.getPrefix());
      assertEquals("ke", qName0.getName());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.VariablePointerFactory", "org.apache.commons.jxpath.ri.model.VariablePointerFactory");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory:org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory:org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) qName0);
      assertSame(variablePointer0, variablePointer1);
      assertSame(variablePointer1, variablePointer0);
      assertNotNull(variablePointer1);
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.getName());
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.getPrefix());
      assertEquals("org.apache.commons.jxpath.ri.model.VariablePointerFactory:org.apache.commons.jxpath.ri.model.VariablePointerFactory", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertNull(variablePointer1.getNamespaceURI());
      assertTrue(variablePointer1.isActual());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertFalse(variablePointer1.isNode());
      assertTrue(variablePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null);
      assertSame(variablePointer0, nodePointer0);
      assertSame(nodePointer0, variablePointer0);
      assertNotNull(nodePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(nodePointer0.isContainer());
      assertFalse(nodePointer0.isNode());
      assertNull(nodePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertTrue(nodePointer0.isActual());
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      QName qName0 = new QName(", operation is not allowed for this type of node", ", operation is not allowed for this type of node");
      assertNotNull(qName0);
      assertEquals(", operation is not allowed for this type of node", qName0.getName());
      assertEquals(", operation is not allowed for this type of node:, operation is not allowed for this type of node", qName0.toString());
      assertEquals(", operation is not allowed for this type of node", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(", operation is not allowed for this type of node", qName0.getName());
      assertEquals(", operation is not allowed for this type of node:, operation is not allowed for this type of node", qName0.toString());
      assertEquals(", operation is not allowed for this type of node", qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = variablePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, int0);
      assertEquals(", operation is not allowed for this type of node", qName0.getName());
      assertEquals(", operation is not allowed for this type of node:, operation is not allowed for this type of node", qName0.toString());
      assertEquals(", operation is not allowed for this type of node", qName0.getPrefix());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      assertNotNull(qName0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      
      QName qName1 = new QName("", "m6'\"00,%#(={%!");
      assertNotNull(qName1);
      assertFalse(qName1.equals((Object)qName0));
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "");
      assertNotNull(nodeNameTest0);
      assertFalse(qName1.equals((Object)qName0));
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals(":m6'\"00,%#(={%!", nodeNameTest0.toString());
      
      Locale locale0 = Locale.TAIWAN;
      assertNotNull(locale0);
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertNotSame(qName0, qName1);
      assertNotSame(qName1, qName0);
      assertNotNull(beanPointer0);
      assertFalse(qName0.equals((Object)qName1));
      assertFalse(qName1.equals((Object)qName0));
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals(":m6'\"00,%#(={%!", nodeNameTest0.toString());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newNodePointer(qName1, beanPointer0, locale0);
      assertNotSame(qName0, qName1);
      assertNotSame(qName1, qName0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotNull(beanPointer1);
      assertFalse(qName0.equals((Object)qName1));
      assertFalse(qName1.equals((Object)qName0));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals(":m6'\"00,%#(={%!", nodeNameTest0.toString());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer1.getLength());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertTrue(beanPointer1.isRoot());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      int int0 = beanPointer0.compareChildNodePointers(beanPointer0, beanPointer1);
      assertNotSame(qName0, qName1);
      assertNotSame(qName1, qName0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertEquals(42, int0);
      assertFalse(qName0.equals((Object)qName1));
      assertFalse(qName1.equals((Object)qName0));
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals(":m6'\"00,%#(={%!", nodeNameTest0.toString());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer1.getLength());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertTrue(beanPointer1.isRoot());
      assertFalse(beanPointer1.isContainer());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      QName qName0 = new QName("", "/.[");
      assertNotNull(qName0);
      assertEquals(":/.[", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("/.[", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(":/.[", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("/.[", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "wfKP[Z i-]j");
      assertNotNull(nodeNameTest0);
      assertEquals(":/.[", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("/.[", qName0.getName());
      assertEquals("wfKP[Z i-]j", nodeNameTest0.getNamespaceURI());
      assertEquals(":/.[", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      
      NodeIterator nodeIterator0 = variablePointer0.childIterator(nodeNameTest0, false, variablePointer0);
      assertNull(nodeIterator0);
      assertEquals(":/.[", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("/.[", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals("wfKP[Z i-]j", nodeNameTest0.getNamespaceURI());
      assertEquals(":/.[", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
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
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      
      NodeIterator nodeIterator0 = variablePointer0.childIterator(nodeNameTest0, true, (NodePointer) null);
      assertNotNull(nodeIterator0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals(0, nodeIterator0.getPosition());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      QName qName0 = new QName("o+?rh", " but object was null.  Terminating to avoid stack recursion.");
      assertNotNull(qName0);
      assertEquals("o+?rh: but object was null.  Terminating to avoid stack recursion.", qName0.toString());
      assertEquals(" but object was null.  Terminating to avoid stack recursion.", qName0.getName());
      assertEquals("o+?rh", qName0.getPrefix());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, "o+?rh");
      assertNotNull(beanPointer0);
      assertEquals("o+?rh: but object was null.  Terminating to avoid stack recursion.", qName0.toString());
      assertEquals(" but object was null.  Terminating to avoid stack recursion.", qName0.getName());
      assertEquals("o+?rh", qName0.getPrefix());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanAttributeIterator beanAttributeIterator0 = (BeanAttributeIterator)beanPointer0.attributeIterator(qName0);
      assertNotNull(beanAttributeIterator0);
      assertEquals("o+?rh: but object was null.  Terminating to avoid stack recursion.", qName0.toString());
      assertEquals(" but object was null.  Terminating to avoid stack recursion.", qName0.getName());
      assertEquals("o+?rh", qName0.getPrefix());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(0, beanAttributeIterator0.getPosition());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("r");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("r", qName0.toString());
      assertEquals("r", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("r", qName0.toString());
      assertEquals("r", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      assertNotNull(nodeTypeTest0);
      assertEquals(0, nodeTypeTest0.getNodeType());
      
      // Undeclared exception!
      try { 
        variablePointer0.testNode(nodeTypeTest0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'r'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      QName qName0 = new QName("SdH&#d_//uq", "SdH&#d_//uq");
      assertNotNull(qName0);
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.setValue((Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot set undefined variable: SdH&#d_//uq:SdH&#d_//uq
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      QName qName0 = new QName(")", ")");
      assertNotNull(qName0);
      assertEquals("):)", qName0.toString());
      assertEquals(")", qName0.getPrefix());
      assertEquals(")", qName0.getName());
      
      Locale locale0 = Locale.CANADA;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("):)", qName0.toString());
      assertEquals(")", qName0.getPrefix());
      assertEquals(")", qName0.getName());
      assertEquals("", locale0.getVariant());
      assertEquals("CA", locale0.getCountry());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en_CA", locale0.toString());
      assertEquals("en", locale0.getLanguage());
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
  public void test033()  throws Throwable  {
      QName qName0 = new QName("gACZ .W7jm~Uoq", "gACZ .W7jm~Uoq");
      assertNotNull(qName0);
      assertEquals("gACZ .W7jm~Uoq", qName0.getPrefix());
      assertEquals("gACZ .W7jm~Uoq:gACZ .W7jm~Uoq", qName0.toString());
      assertEquals("gACZ .W7jm~Uoq", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertEquals("gACZ .W7jm~Uoq", qName0.getPrefix());
      assertEquals("gACZ .W7jm~Uoq:gACZ .W7jm~Uoq", qName0.toString());
      assertEquals("gACZ .W7jm~Uoq", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, qName0);
      assertNotNull(beanPointer0);
      assertEquals("gACZ .W7jm~Uoq", qName0.getPrefix());
      assertEquals("gACZ .W7jm~Uoq:gACZ .W7jm~Uoq", qName0.toString());
      assertEquals("gACZ .W7jm~Uoq", qName0.getName());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      QName qName0 = new QName("avU<6_qcs<cV-", "@`T8%M/g+sl.`u|KANQ");
      assertNotNull(qName0);
      assertEquals("avU<6_qcs<cV-:@`T8%M/g+sl.`u|KANQ", qName0.toString());
      assertEquals("@`T8%M/g+sl.`u|KANQ", qName0.getName());
      assertEquals("avU<6_qcs<cV-", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertEquals("avU<6_qcs<cV-:@`T8%M/g+sl.`u|KANQ", qName0.toString());
      assertEquals("@`T8%M/g+sl.`u|KANQ", qName0.getName());
      assertEquals("avU<6_qcs<cV-", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("Cannot create an object for path ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("->@<d*Ue&6.Z!P4", "->@<d*Ue&6.Z!P4");
      assertNotNull(qName0);
      assertEquals("->@<d*Ue&6.Z!P4:->@<d*Ue&6.Z!P4", qName0.toString());
      assertEquals("->@<d*Ue&6.Z!P4", qName0.getPrefix());
      assertEquals("->@<d*Ue&6.Z!P4", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("->@<d*Ue&6.Z!P4:->@<d*Ue&6.Z!P4", qName0.toString());
      assertEquals("->@<d*Ue&6.Z!P4", qName0.getPrefix());
      assertEquals("->@<d*Ue&6.Z!P4", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespacePointer("->@<d*Ue&6.Z!P4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: '->@<d*Ue&6.Z!P4:->@<d*Ue&6.Z!P4'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "m6'\"00,%#(={%!");
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("m6'\"00,%#(={%!", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertEquals("m6'\"00,%#(={%!", qName0.getPrefix());
      assertEquals("m6'\"00,%#(={%!:", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", qName0.getName());
      assertEquals("m6'\"00,%#(={%!", qName0.getPrefix());
      assertEquals("m6'\"00,%#(={%!:", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.namespaceIterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'm6'\"00,%#(={%!:'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      QName qName0 = new QName("Cannot register namespaces on a sealed NamespaceResolver", "org.apache.commons.jxpath.ri.compiler.NodeTest");
      assertNotNull(qName0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeTest", qName0.getName());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver:org.apache.commons.jxpath.ri.compiler.NodeTest", qName0.toString());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("org.apache.commons.jxpath.ri.compiler.NodeTest", qName0.getName());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver:org.apache.commons.jxpath.ri.compiler.NodeTest", qName0.toString());
      assertEquals("Cannot register namespaces on a sealed NamespaceResolver", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLeaf();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: Cannot register namespaces on a sealed NamespaceResolver:org.apache.commons.jxpath.ri.compiler.NodeTest
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      QName qName0 = new QName("r=l9");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("r=l9", qName0.getName());
      assertEquals("r=l9", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("r=l9", qName0.getName());
      assertEquals("r=l9", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isLanguage("wL)&iv");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      QName qName0 = new QName(".0");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals(".0", qName0.getName());
      assertEquals(".0", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals(".0", qName0.getName());
      assertEquals(".0", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: .0
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
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
      
      QName qName0 = new QName("", "XZK3Ez; ^$@");
      assertNotNull(qName0);
      assertEquals("XZK3Ez; ^$@", qName0.getName());
      assertEquals(":XZK3Ez; ^$@", qName0.toString());
      assertEquals("", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("XZK3Ez; ^$@", qName0.getName());
      assertEquals(":XZK3Ez; ^$@", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.isCollection();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':XZK3Ez; ^$@'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNotNull(qName0);
      assertNull(qName0.toString());
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.toString());
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
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
  public void test042()  throws Throwable  {
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      QName qName0 = new QName("gp6Wr/Ir[:UQj9GKY");
      assertNotNull(qName0);
      assertEquals("gp6Wr/Ir[:UQj9GKY", qName0.toString());
      assertEquals("gp6Wr/Ir[", qName0.getPrefix());
      assertEquals("UQj9GKY", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("gp6Wr/Ir[:UQj9GKY", qName0.toString());
      assertEquals("gp6Wr/Ir[", qName0.getPrefix());
      assertEquals("UQj9GKY", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: 'gp6Wr/Ir[:UQj9GKY'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertNotNull(variablePointer0);
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      QName qName0 = new QName("", ". U\"HSW)Z]");
      assertNotNull(qName0);
      assertEquals(":. U\"HSW)Z]", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(". U\"HSW)Z]", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(":. U\"HSW)Z]", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals(". U\"HSW)Z]", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: :. U\"HSW)Z]
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      QName qName0 = new QName("Ml5F>`{%`9#WV<:");
      assertNotNull(qName0);
      assertEquals("Ml5F>`{%`9#WV<:", qName0.toString());
      assertEquals("Ml5F>`{%`9#WV<", qName0.getPrefix());
      assertEquals("", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertEquals("Ml5F>`{%`9#WV<:", qName0.toString());
      assertEquals("Ml5F>`{%`9#WV<", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
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
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getRootNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNotNull(nodeNameTest0);
      assertNull(nodeNameTest0.getNamespaceURI());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, (QName) null, nodeNameTest0);
      assertNotNull(beanPointer0);
      assertNull(nodeNameTest0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.getPointerByKey(jXPathContextReferenceImpl0, "", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      QName qName0 = new QName("K*SaafiM}s9p]@Vy1b.");
      assertNotNull(qName0);
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.getName());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.toString());
      assertNull(qName0.getPrefix());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      assertNotNull(nullPointer0);
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.getName());
      assertEquals("K*SaafiM}s9p]@Vy1b.", qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isCollection());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isRoot());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        nullPointer0.getPointerByID(jXPathContextReferenceImpl0, "K*SaafiM}s9p]@Vy1b.");
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
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      QName qName0 = new QName("7pmZF@R\"0");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("7pmZF@R\"0", qName0.getName());
      assertEquals("7pmZF@R\"0", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("7pmZF@R\"0", qName0.getName());
      assertEquals("7pmZF@R\"0", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "7pmZF@R\"0");
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey(jXPathContextReferenceImpl0, "7pmZF@R\"0", jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot find an element by key - no KeyManager has been specified
         //
         verifyException("org.apache.commons.jxpath.JXPathContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      QName qName0 = new QName(", operation is not allowed for this type of node");
      assertNotNull(qName0);
      assertEquals(", operation is not allowed for this type of node", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals(", operation is not allowed for this type of node", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(", operation is not allowed for this type of node", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals(", operation is not allowed for this type of node", qName0.toString());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: , operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
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
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getNode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locale0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      BasicVariables basicVariables0 = (BasicVariables)jXPathContextReferenceImpl0.getVariables();
      assertNotNull(basicVariables0);
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
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

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      QName qName0 = new QName("No read method", "No read method");
      assertNotNull(qName0);
      assertEquals("No read method:No read method", qName0.toString());
      assertEquals("No read method", qName0.getPrefix());
      assertEquals("No read method", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      assertNotNull(variablePointer0);
      assertEquals("No read method:No read method", qName0.toString());
      assertEquals("No read method", qName0.getPrefix());
      assertEquals("No read method", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
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
  public void test055()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "fO='fRi,Aac[3");
      assertNotNull(qName0);
      assertEquals(":fO='fRi,Aac[3", qName0.toString());
      assertEquals("fO='fRi,Aac[3", qName0.getName());
      assertEquals("", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals(":fO='fRi,Aac[3", qName0.toString());
      assertEquals("fO='fRi,Aac[3", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateValuePointer();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':fO='fRi,Aac[3'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      assertNotNull(qName0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: drg,i$I8#7QFVtJ
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getImmediateNode();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ''
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      QName qName0 = new QName("SdH&#d_//uq", "SdH&#d_//uq");
      assertNotNull(qName0);
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getBaseValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: SdH&#d_//uq:SdH&#d_//uq
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      QName qName0 = new QName("et", "et");
      assertNotNull(qName0);
      assertEquals("et:et", qName0.toString());
      assertEquals("et", qName0.getPrefix());
      assertEquals("et", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("et:et", qName0.toString());
      assertEquals("et", qName0.getPrefix());
      assertEquals("et", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("et:et", qName0.toString());
      assertEquals("et", qName0.getPrefix());
      assertEquals("et", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory(jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $et:et
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("", "");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals(":", qName0.toString());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.getAbstractFactory((JXPathContext) null);
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
      QName qName0 = new QName(")", ")");
      assertNotNull(qName0);
      assertEquals(")", qName0.getName());
      assertEquals(")", qName0.getPrefix());
      assertEquals("):)", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals(")", qName0.getName());
      assertEquals(")", qName0.getPrefix());
      assertEquals("):)", qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
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
  public void test062()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNotNull(qName0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) variablePointer0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
      assertNotNull(nodeNameTest0);
      assertNull(qName0.toString());
      assertNull(qName0.getPrefix());
      assertNull(qName0.getName());
      assertEquals("<<unknown namespace>>", nodeNameTest0.getNamespaceURI());
      assertNull(nodeNameTest0.toString());
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      QName qName0 = new QName("o+?rh", " but object was null.  Terminating to avoid stack recursion.");
      assertNotNull(qName0);
      assertEquals(" but object was null.  Terminating to avoid stack recursion.", qName0.getName());
      assertEquals("o+?rh: but object was null.  Terminating to avoid stack recursion.", qName0.toString());
      assertEquals("o+?rh", qName0.getPrefix());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, "o+?rh");
      assertNotNull(beanPointer0);
      assertEquals(" but object was null.  Terminating to avoid stack recursion.", qName0.getName());
      assertEquals("o+?rh: but object was null.  Terminating to avoid stack recursion.", qName0.toString());
      assertEquals("o+?rh", qName0.getPrefix());
      assertFalse(beanPointer0.isContainer());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        beanPointer0.createPath((JXPathContext) jXPathContextReferenceImpl0, (Object) qName0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot replace the root object
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      QName qName0 = new QName("T>dJ");
      assertNotNull(qName0);
      assertEquals("T>dJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("T>dJ", qName0.toString());
      
      Locale locale0 = new Locale("", "T>dJ");
      assertNotNull(locale0);
      assertEquals("", locale0.getISO3Language());
      assertEquals("T>DJ", locale0.getCountry());
      assertEquals("", locale0.getLanguage());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getVariant());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("T>dJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("T>dJ", qName0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("T>DJ", locale0.getCountry());
      assertEquals("", locale0.getLanguage());
      assertEquals("_T>DJ", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertFalse(nullPointer0.isCollection());
      assertNull(nullPointer0.getNamespaceURI());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isRoot());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertEquals(0, nullPointer0.getLength());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(nullPointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("T>dJ", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("T>dJ", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) null, (Object) nullPointer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      QName qName0 = new QName("2Pp5yDpA)xE?PHC(!");
      assertNotNull(qName0);
      assertEquals("2Pp5yDpA)xE?PHC(!", qName0.toString());
      assertEquals("2Pp5yDpA)xE?PHC(!", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("2Pp5yDpA)xE?PHC(!", qName0.toString());
      assertEquals("2Pp5yDpA)xE?PHC(!", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) qName0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertEquals("2Pp5yDpA)xE?PHC(!", qName0.toString());
      assertEquals("2Pp5yDpA)xE?PHC(!", qName0.getName());
      assertNull(qName0.getPrefix());
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      // Undeclared exception!
      try { 
        variablePointer0.createPath((JXPathContext) jXPathContextReferenceImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Factory is not set on the JXPathContext - cannot create path: $2Pp5yDpA)xE?PHC(!
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertNull(qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
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
  public void test067()  throws Throwable  {
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.ITALIAN;
      assertNotNull(locale0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertEquals("ita", locale0.getISO3Language());
      assertEquals("it", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("it", locale0.getLanguage());
      assertTrue(nullPointer0.isNode());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isCollection());
      assertFalse(nullPointer0.isActual());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isAttribute());
      assertTrue(nullPointer0.isRoot());
      assertEquals(0, nullPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext(object0);
      assertNotNull(jXPathContextReferenceImpl0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      assertNotNull(nodeNameTest0);
      assertNull(nodeNameTest0.getNamespaceURI());
      
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, (QName) null, 561, (Object) nodeNameTest0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
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
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertNotNull(nodeNameTest0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, 615, (Object) nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      QName qName0 = new QName("Rvr2u^$^R/L5<Sw(V");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("Rvr2u^$^R/L5<Sw(V", qName0.getName());
      assertEquals("Rvr2u^$^R/L5<Sw(V", qName0.toString());
      
      Locale locale0 = Locale.US;
      assertNotNull(locale0);
      assertEquals("en_US", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("US", locale0.getCountry());
      
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      assertNotNull(nullPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("Rvr2u^$^R/L5<Sw(V", qName0.getName());
      assertEquals("Rvr2u^$^R/L5<Sw(V", qName0.toString());
      assertEquals("en_US", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("en", locale0.getLanguage());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("US", locale0.getCountry());
      assertFalse(nullPointer0.isAttribute());
      assertFalse(nullPointer0.isActual());
      assertTrue(nullPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nullPointer0.getIndex());
      assertTrue(nullPointer0.isLeaf());
      assertFalse(nullPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(0, nullPointer0.getLength());
      assertTrue(nullPointer0.isNode());
      assertNull(nullPointer0.getNamespaceURI());
      assertFalse(nullPointer0.isContainer());
      assertFalse(nullPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        nullPointer0.createChild((JXPathContext) null, qName0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot create the root object: null()
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.NullPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      QName qName0 = new QName(":&p ,8T1-Xp-#O'Qe)S", "Factory did not assign a collection to variable '");
      assertNotNull(qName0);
      assertEquals("Factory did not assign a collection to variable '", qName0.getName());
      assertEquals(":&p ,8T1-Xp-#O'Qe)S", qName0.getPrefix());
      assertEquals(":&p ,8T1-Xp-#O'Qe)S:Factory did not assign a collection to variable '", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Factory did not assign a collection to variable '", qName0.getName());
      assertEquals(":&p ,8T1-Xp-#O'Qe)S", qName0.getPrefix());
      assertEquals(":&p ,8T1-Xp-#O'Qe)S:Factory did not assign a collection to variable '", qName0.toString());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, 0);
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
      
      QName qName0 = new QName("", ",g!f");
      assertNotNull(qName0);
      assertEquals("", qName0.getPrefix());
      assertEquals(":,g!f", qName0.toString());
      assertEquals(",g!f", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertFalse(jXPathContextReferenceImpl0.isLenient());
      assertEquals("", qName0.getPrefix());
      assertEquals(":,g!f", qName0.toString());
      assertEquals(",g!f", qName0.getName());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) jXPathContextReferenceImpl0, qName0, 2897);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':,g!f'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("'X");
      assertNotNull(qName0);
      assertEquals("'X", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("'X", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("'X", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("'X", qName0.getName());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      assertNotNull(nodeNameTest0);
      assertEquals("'X", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("'X", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("'X", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      
      // Undeclared exception!
      try { 
        variablePointer0.compareTo(nodeNameTest0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.compiler.NodeNameTest cannot be cast to org.apache.commons.jxpath.ri.model.NodePointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      QName qName0 = new QName("ke", "ke");
      assertNotNull(qName0);
      assertEquals("ke", qName0.getPrefix());
      assertEquals("ke", qName0.getName());
      assertEquals("ke:ke", qName0.toString());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, "ke");
      assertNotNull(beanPointer0);
      assertEquals("ke", qName0.getPrefix());
      assertEquals("ke", qName0.getName());
      assertEquals("ke:ke", qName0.toString());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
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
      Object object0 = new Object();
      assertNotNull(object0);
      
      Locale locale0 = Locale.KOREAN;
      assertNotNull(locale0);
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("ko", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("ko", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("kor", locale0.getISO3Language());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer0.attributeIterator((QName) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, (QName) null);
      assertNotNull(variablePointer0);
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      VariablePointer variablePointer1 = (VariablePointer)variablePointer0.clone();
      assertNotSame(variablePointer0, variablePointer1);
      assertNotSame(variablePointer1, variablePointer0);
      assertNotNull(variablePointer1);
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer1.isRoot());
      assertFalse(variablePointer1.isNode());
      assertFalse(variablePointer1.isAttribute());
      assertTrue(variablePointer1.isContainer());
      assertTrue(variablePointer1.isActual());
      assertNull(variablePointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer1.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      assertNotNull(qName0);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer0);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = nodePointer0.asPath();
      assertEquals("$null", string0);
      assertNotNull(string0);
      assertNull(qName0.getName());
      assertNull(qName0.getPrefix());
      assertNull(qName0.toString());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertNotNull(nodeNameTest0);
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      
      Locale locale0 = Locale.TAIWAN;
      assertNotNull(locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale1 = beanPointer0.getLocale();
      assertSame(locale0, locale1);
      assertSame(locale1, locale0);
      assertNotNull(locale1);
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("TW", locale0.getCountry());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isCollection());
      assertEquals("", locale1.getVariant());
      assertEquals("TWN", locale1.getISO3Country());
      assertEquals("zh", locale1.getLanguage());
      assertEquals("TW", locale1.getCountry());
      assertEquals("zh_TW", locale1.toString());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("><Ph5/B9.G!ToSm", "T&NJn-");
      assertNotNull(qName0);
      assertEquals("><Ph5/B9.G!ToSm:T&NJn-", qName0.toString());
      assertEquals("><Ph5/B9.G!ToSm", qName0.getPrefix());
      assertEquals("T&NJn-", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("><Ph5/B9.G!ToSm:T&NJn-", qName0.toString());
      assertEquals("><Ph5/B9.G!ToSm", qName0.getPrefix());
      assertEquals("T&NJn-", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, object0);
      assertNotNull(beanPointer0);
      assertEquals("><Ph5/B9.G!ToSm:T&NJn-", qName0.toString());
      assertEquals("><Ph5/B9.G!ToSm", qName0.getPrefix());
      assertEquals("T&NJn-", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer1 = (BeanPointer)beanPointer0.getValuePointer();
      assertSame(beanPointer0, beanPointer1);
      assertSame(beanPointer1, beanPointer0);
      assertNotNull(beanPointer1);
      assertEquals("><Ph5/B9.G!ToSm:T&NJn-", qName0.toString());
      assertEquals("><Ph5/B9.G!ToSm", qName0.getPrefix());
      assertEquals("T&NJn-", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isContainer());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isRoot());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer1.isContainer());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer0);
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        nodePointer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: null
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
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
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      assertNotNull(nodePointer0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = nodePointer0.isContainer();
      assertFalse(boolean0);
      assertEquals(":", qName0.toString());
      assertEquals("", qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.getNamespaceURI((String) null);
      assertNull(string0);
      assertEquals("", qName0.getName());
      assertEquals("", qName0.getPrefix());
      assertEquals(":", qName0.toString());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = ((NodePointer)beanPointer0).escape("");
      assertEquals("", string0);
      assertNotNull(string0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertEquals("", qName0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertFalse(beanPointer0.isContainer());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertNull(beanPointer0.getNamespaceURI());
      assertTrue(beanPointer0.isNode());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      assertNotNull(basicVariables0);
      
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      assertNotNull(variablePointer0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = variablePointer0.escape("'");
      assertEquals("&apos;", string0);
      assertNotNull(string0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertTrue(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
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
  public void test085()  throws Throwable  {
      QName qName0 = new QName("6FP4.enrq0cj!moO.,", "RH(");
      assertNotNull(qName0);
      assertEquals("6FP4.enrq0cj!moO.,", qName0.getPrefix());
      assertEquals("6FP4.enrq0cj!moO.,:RH(", qName0.toString());
      assertEquals("RH(", qName0.getName());
      
      Locale locale0 = Locale.GERMAN;
      assertNotNull(locale0);
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, qName0, locale0);
      assertNotNull(beanPointer0);
      assertEquals("6FP4.enrq0cj!moO.,", qName0.getPrefix());
      assertEquals("6FP4.enrq0cj!moO.,:RH(", qName0.toString());
      assertEquals("RH(", qName0.getName());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
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
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, qName0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotNull(beanPointer1);
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals("6FP4.enrq0cj!moO.,", qName0.getPrefix());
      assertEquals("6FP4.enrq0cj!moO.,:RH(", qName0.toString());
      assertEquals("RH(", qName0.getName());
      assertEquals("de", locale0.getLanguage());
      assertEquals("deu", locale0.getISO3Language());
      assertEquals("", locale0.getCountry());
      assertEquals("de", locale0.toString());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertTrue(beanPointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertFalse(beanPointer0.isContainer());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer0.getLength());
      assertFalse(beanPointer0.isCollection());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isContainer());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isRoot());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      // Undeclared exception!
      try { 
        beanPointer1.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path /6FP4.enrq0cj!moO.,:RH(/6FP4.enrq0cj!moO.,:RH([-2147483647], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      assertNotNull(beanPointer0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, object0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotNull(beanPointer1);
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isContainer());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      String string0 = beanPointer1.toString();
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertEquals("''/", string0);
      assertNotNull(string0);
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("CN", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertNull(beanPointer0.getNamespaceURI());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isContainer());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer1.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
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
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "wfKP[Z i-]j");
      assertNotNull(nodeNameTest0);
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertNull(qName0.getPrefix());
      assertEquals("wfKP[Z i-]j", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.toString());
      
      // Undeclared exception!
      try { 
        variablePointer0.childIterator(nodeNameTest0, false, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      QName qName0 = new QName("SdH&#d_//uq", "SdH&#d_//uq");
      assertNotNull(qName0);
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.isDefaultNamespace("<<unknown namespace>>");
      assertFalse(boolean0);
      assertEquals("SdH&#d_//uq", qName0.getName());
      assertEquals("SdH&#d_//uq", qName0.getPrefix());
      assertEquals("SdH&#d_//uq:SdH&#d_//uq", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      QName qName0 = new QName("");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      
      Locale locale0 = Locale.CHINA;
      assertNotNull(locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "", locale0);
      assertNotNull(beanPointer0);
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      BeanPointer beanPointer1 = (BeanPointer)NodePointer.newChildNodePointer(beanPointer0, qName0, object0);
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotNull(beanPointer1);
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isContainer());
      assertNull(beanPointer1.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      BeanPointer beanPointer2 = (BeanPointer)beanPointer1.getImmediateValuePointer();
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer0, beanPointer2);
      assertSame(beanPointer1, beanPointer2);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotSame(beanPointer2, beanPointer0);
      assertSame(beanPointer2, beanPointer1);
      assertNotNull(beanPointer2);
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertFalse(beanPointer2.equals((Object)beanPointer0));
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isContainer());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer2.isCollection());
      assertNull(beanPointer2.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer2.getIndex());
      assertFalse(beanPointer2.isContainer());
      assertEquals(1, beanPointer2.getLength());
      assertTrue(beanPointer2.isNode());
      assertFalse(beanPointer2.isRoot());
      assertFalse(beanPointer2.isAttribute());
      assertFalse(beanPointer2.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = beanPointer2.isLanguage("m6'\"00,%#(={%!");
      assertNotSame(beanPointer0, beanPointer1);
      assertNotSame(beanPointer0, beanPointer2);
      assertSame(beanPointer1, beanPointer2);
      assertNotSame(beanPointer1, beanPointer0);
      assertNotSame(beanPointer2, beanPointer0);
      assertSame(beanPointer2, beanPointer1);
      assertFalse(boolean0);
      assertFalse(beanPointer0.equals((Object)beanPointer1));
      assertFalse(beanPointer0.equals((Object)beanPointer2));
      assertFalse(beanPointer1.equals((Object)beanPointer0));
      assertFalse(beanPointer2.equals((Object)beanPointer0));
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.toString());
      assertEquals("", qName0.getName());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
      assertTrue(beanPointer0.isRoot());
      assertFalse(beanPointer0.isAttribute());
      assertFalse(beanPointer0.isCollection());
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
      assertTrue(beanPointer0.isNode());
      assertFalse(beanPointer0.isContainer());
      assertEquals(1, beanPointer0.getLength());
      assertNull(beanPointer0.getNamespaceURI());
      assertEquals(1, beanPointer1.getLength());
      assertEquals(Integer.MIN_VALUE, beanPointer1.getIndex());
      assertTrue(beanPointer1.isNode());
      assertFalse(beanPointer1.isDynamicPropertyDeclarationSupported());
      assertFalse(beanPointer1.isAttribute());
      assertFalse(beanPointer1.isCollection());
      assertFalse(beanPointer1.isRoot());
      assertFalse(beanPointer1.isContainer());
      assertNull(beanPointer1.getNamespaceURI());
      assertFalse(beanPointer2.isCollection());
      assertNull(beanPointer2.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, beanPointer2.getIndex());
      assertFalse(beanPointer2.isContainer());
      assertEquals(1, beanPointer2.getLength());
      assertTrue(beanPointer2.isNode());
      assertFalse(beanPointer2.isRoot());
      assertFalse(beanPointer2.isAttribute());
      assertFalse(beanPointer2.isDynamicPropertyDeclarationSupported());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      QName qName0 = new QName("@UybXWg|18$KM)XB)B", "@UybXWg|18$KM)XB)B");
      assertNotNull(qName0);
      assertEquals("@UybXWg|18$KM)XB)B:@UybXWg|18$KM)XB)B", qName0.toString());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getPrefix());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("@UybXWg|18$KM)XB)B:@UybXWg|18$KM)XB)B", qName0.toString());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getPrefix());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      Locale locale0 = variablePointer0.getLocale();
      assertNull(locale0);
      assertEquals("@UybXWg|18$KM)XB)B:@UybXWg|18$KM)XB)B", qName0.toString());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getPrefix());
      assertEquals("@UybXWg|18$KM)XB)B", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      QName qName0 = new QName("Q{&icP:FD][q]2");
      assertNotNull(qName0);
      assertEquals("Q{&icP:FD][q]2", qName0.toString());
      assertEquals("Q{&icP", qName0.getPrefix());
      assertEquals("FD][q]2", qName0.getName());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertEquals("Q{&icP:FD][q]2", qName0.toString());
      assertEquals("Q{&icP", qName0.getPrefix());
      assertEquals("FD][q]2", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      QName qName1 = new QName("Q{&icP:FD][q]2");
      assertNotNull(qName1);
      assertTrue(qName1.equals((Object)qName0));
      assertEquals("FD][q]2", qName1.getName());
      assertEquals("Q{&icP", qName1.getPrefix());
      assertEquals("Q{&icP:FD][q]2", qName1.toString());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1);
      assertNotNull(nodeNameTest0);
      assertTrue(qName1.equals((Object)qName0));
      assertEquals("FD][q]2", qName1.getName());
      assertEquals("Q{&icP", qName1.getPrefix());
      assertEquals("Q{&icP:FD][q]2", qName1.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Q{&icP:FD][q]2", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertNotSame(qName0, qName1);
      assertNotSame(qName1, qName0);
      assertTrue(boolean0);
      assertTrue(qName0.equals((Object)qName1));
      assertTrue(qName1.equals((Object)qName0));
      assertEquals("Q{&icP:FD][q]2", qName0.toString());
      assertEquals("Q{&icP", qName0.getPrefix());
      assertEquals("FD][q]2", qName0.getName());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertEquals("FD][q]2", qName1.getName());
      assertEquals("Q{&icP", qName1.getPrefix());
      assertEquals("Q{&icP:FD][q]2", qName1.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("Q{&icP:FD][q]2", nodeNameTest0.toString());
      assertNull(nodeNameTest0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      assertNotNull(qName0);
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      
      QName qName1 = new QName("", "m6'\"00,%#(={%!");
      assertNotNull(qName1);
      assertFalse(qName1.equals((Object)qName0));
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "");
      assertNotNull(nodeNameTest0);
      assertFalse(qName1.equals((Object)qName0));
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      assertEquals(":m6'\"00,%#(={%!", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertNotNull(variablePointer0);
      assertFalse(qName0.equals((Object)qName1));
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertNotSame(qName0, qName1);
      assertNotSame(qName1, qName0);
      assertFalse(boolean0);
      assertFalse(qName0.equals((Object)qName1));
      assertFalse(qName1.equals((Object)qName0));
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertEquals("", qName1.getPrefix());
      assertEquals(":m6'\"00,%#(={%!", qName1.toString());
      assertEquals("m6'\"00,%#(={%!", qName1.getName());
      assertEquals(":m6'\"00,%#(={%!", nodeNameTest0.toString());
      assertFalse(nodeNameTest0.isWildcard());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isActual());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(28);
      assertNotNull(nodeTypeTest0);
      assertEquals(28, nodeTypeTest0.getNodeType());
      
      boolean boolean0 = variablePointer0.testNode(nodeTypeTest0);
      assertFalse(boolean0);
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertNull(variablePointer0.getNamespaceURI());
      assertFalse(variablePointer0.isNode());
      assertFalse(variablePointer0.isActual());
      assertEquals(28, nodeTypeTest0.getNodeType());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      assertNotNull(qName0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      assertNotNull(nodeNameTest0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      assertNotNull(variablePointer0);
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
      assertEquals("drg,i$I8#7QFVtJ", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("drg,i$I8#7QFVtJ", qName0.getName());
      assertEquals("drg,i$I8#7QFVtJ", nodeNameTest0.toString());
      assertEquals("", nodeNameTest0.getNamespaceURI());
      assertFalse(nodeNameTest0.isWildcard());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isRoot());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isNode());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
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
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("q#r/|k%q^C");
      assertNotNull(processingInstructionTest0);
      assertEquals("q#r/|k%q^C", processingInstructionTest0.getTarget());
      
      boolean boolean0 = variablePointer0.testNode(processingInstructionTest0);
      assertFalse(boolean0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isNode());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertFalse(variablePointer0.isActual());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertEquals("q#r/|k%q^C", processingInstructionTest0.getTarget());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
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
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
      
      boolean boolean0 = variablePointer0.testNode((NodeTest) null);
      assertTrue(boolean0);
      assertEquals("", qName0.toString());
      assertNull(qName0.getPrefix());
      assertEquals("", qName0.getName());
      assertFalse(variablePointer0.isActual());
      assertFalse(variablePointer0.isAttribute());
      assertTrue(variablePointer0.isContainer());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      assertFalse(variablePointer0.isNode());
      assertNull(variablePointer0.getNamespaceURI());
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      Object object0 = new Object();
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, object0);
      assertTrue(nodePointer0.isRoot());
      
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
      jXPathContext0.getRelativeContext(nodePointer1);
      assertFalse(nodePointer0.isAttribute());
      assertFalse(nodePointer1.isAttribute());
      assertFalse(nodePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      QName qName0 = new QName("Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified");
      Locale locale0 = new Locale("Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified", "Cannot find an element by ID - no IdentityManager has been specified");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      boolean boolean0 = nodePointer0.isActual();
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(boolean0);
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
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
  public void test100()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      QName qName0 = new QName("QjiTC*Ixt");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "QjiTC*Ixt", locale0);
      boolean boolean0 = nodePointer0.isNode();
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      QName qName0 = new QName("JXPath: found  ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.isNode();
      assertFalse(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Locale locale0 = new Locale("CsY?V<rk", "", "Gl4me,vEC`<Wve");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      boolean boolean0 = nodePointer0.isRoot();
      assertFalse(nodePointer0.isAttribute());
      assertTrue(boolean0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      boolean boolean0 = nodePointer0.isRoot();
      assertFalse(variablePointer0.isAttribute());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = variablePointer0.getImmediateValuePointer();
      NodePointer nodePointer1 = nodePointer0.getParent();
      assertFalse(variablePointer0.isAttribute());
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      Object object0 = new Object();
      NodePointer nodePointer1 = NodePointer.newChildNodePointer(nodePointer0, qName0, object0);
      NodePointer nodePointer2 = nodePointer1.getParent();
      assertEquals(Integer.MIN_VALUE, nodePointer2.getIndex());
      assertFalse(nodePointer2.isAttribute());
      assertTrue(nodePointer2.isRoot());
      assertFalse(nodePointer1.isAttribute());
      assertNotNull(nodePointer2);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      assertTrue(nodePointer0.isRoot());
      
      nodePointer0.getNamespaceResolver();
      assertFalse(nodePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      QName qName0 = new QName("' and '");
      VariablePointer variablePointer0 = new VariablePointer((Variables) null, qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getPointerByID((JXPathContext) null, "' and '");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      // Undeclared exception!
      try { 
        nodePointer0.createChild(jXPathContext0, (QName) null, 561, (Object) nodeNameTest0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path //null[562], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      // Undeclared exception!
      try { 
        nodePointer0.getPointerByKey((JXPathContext) null, "Ml5F>`{%`9#WV<:", "and");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ", "drg,i$I8#7QFVtJ");
      QName qName1 = new QName("m6'\"00,%#(={%!");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName1, "yH");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      boolean boolean0 = variablePointer0.testNode(nodeNameTest0);
      assertFalse(boolean0);
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      QName qName0 = new QName("SdH&#d_//uq", "SdH&#d_//uq");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setIndex(0);
      variablePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
      assertEquals(0, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      QName qName0 = new QName("");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "", locale0);
      nodePointer0.getNamespaceURI();
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(nodePointer0.isRoot());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Locale locale0 = Locale.TAIWAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      assertNotNull(nodePointer0);
      
      NodePointer nodePointer1 = nodePointer0.createPath((JXPathContext) null);
      assertTrue(nodePointer1.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      QName qName0 = new QName("T>dJ");
      Locale locale0 = new Locale("", "T>dJ");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, (Object) null, locale0);
      NamespaceResolver namespaceResolver0 = new NamespaceResolver();
      nodePointer0.setNamespaceResolver(namespaceResolver0);
      assertTrue(nodePointer0.isRoot());
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertFalse(nodePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createAttribute((JXPathContext) null, qName0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an attribute for path $null/@null, operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      QName qName0 = new QName("");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getNodeValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Undefined variable: 
         //
         verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8#7QFVtJ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.getDefaultNamespaceURI();
      assertFalse(variablePointer0.isAttribute());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      QName qName0 = new QName("drg,i$I8G7QFVtJ");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.getNodeSetByKey((JXPathContext) null, "Z@", "drg,i$I8G7QFVtJ");
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
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("L4Pds:Lh", "L4Pds:Lh");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, "L4Pds:Lh");
      assertFalse(nodePointer0.isRoot());
      assertNotNull(nodePointer0);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
      
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeNameTest0);
      NodePointer nodePointer1 = nodePointer0.createPath(jXPathContext0, (Object) null);
      assertFalse(nodePointer1.isAttribute());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      QName qName0 = new QName("SdH&#d_//uq", "SdH&#d_//uq");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      assertTrue(variablePointer0.isRoot());
      
      variablePointer0.printPointerChain();
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      boolean boolean0 = variablePointer0.isAttribute();
      assertFalse(boolean0);
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, nodeNameTest0);
      // Undeclared exception!
      try { 
        nodePointer0.createChild((JXPathContext) null, qName0, (-4055));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot create an object for path $:/:[-4054], operation is not allowed for this type of node
         //
         verifyException("org.apache.commons.jxpath.ri.model.NodePointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      QName qName0 = new QName("GFncb:GNav..vE");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      variablePointer0.setAttribute(false);
      assertFalse(variablePointer0.isAttribute());
      assertEquals(Integer.MIN_VALUE, variablePointer0.getIndex());
      assertTrue(variablePointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      // Undeclared exception!
      try { 
        variablePointer0.createChild((JXPathContext) null, qName0, (-868), (Object) nodeNameTest0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ':'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }
}
