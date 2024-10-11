
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
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionAttributeNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionNodeIterator_ESTest extends CollectionNodeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.ITALY;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, nodeNameTest0, false, collectionPointer0);
      // Undeclared exception!
      try { 
        collectionChildNodeIterator0.setPosition(Integer.MIN_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      collectionPointer0.setIndex(1469);
      QName qName0 = new QName("<<unknown namespace>>");
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      NodeIterator nodeIterator0 = collectionAttributeNodeIterator0.getElementNodeIterator(collectionPointer0);
      // Undeclared exception!
      try { 
        nodeIterator0.setPosition(920);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      CollectionPointer collectionPointer0 = new CollectionPointer(qName0, (Locale) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, (NodeTest) null, true, nodePointer0);
      // Undeclared exception!
      try { 
        collectionChildNodeIterator0.setPosition(Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid starting pointer for iterator: /
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = new QName("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, (Locale) null);
      CollectionPointer collectionPointer0 = new CollectionPointer(qName0, (Locale) null);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, (NodeTest) null, false, nodePointer0);
      // Undeclared exception!
      try { 
        collectionChildNodeIterator0.setPosition(Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid starting pointer for iterator: /
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QName qName0 = new QName("_i0vo[uB;g_*g4E");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      NodePointer nodePointer0 = collectionAttributeNodeIterator0.getNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      Locale locale0 = Locale.JAPAN;
      CollectionPointer collectionPointer0 = new CollectionPointer(object0, locale0);
      QName qName0 = new QName("");
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      collectionAttributeNodeIterator0.setPosition((-1289));
      boolean boolean0 = collectionAttributeNodeIterator0.setPosition(39);
      assertFalse(boolean0);
      assertEquals(0, collectionAttributeNodeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, locale0);
      QName qName0 = new QName("<<unknown namespace>>");
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      int int0 = collectionAttributeNodeIterator0.getPosition();
      assertEquals(0, int0);
  }
}
