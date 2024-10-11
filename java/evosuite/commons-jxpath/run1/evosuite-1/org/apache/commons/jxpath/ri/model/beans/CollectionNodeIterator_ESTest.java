
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionAttributeNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionChildNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionNodeIterator_ESTest extends CollectionNodeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator((CollectionPointer) null, qName0);
      // Undeclared exception!
      try { 
        collectionAttributeNodeIterator0.setPosition(93);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      Locale locale0 = Locale.JAPAN;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, (NodeTest) null, true, variablePointer0);
      // Undeclared exception!
      try { 
        collectionChildNodeIterator0.setPosition(Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid starting pointer for iterator: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      QName qName0 = new QName("", "");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "");
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      NodePointer nodePointer0 = collectionAttributeNodeIterator0.getNodePointer();
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = new QName("\"//\"", "\"//\"");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "\"//\"");
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      boolean boolean0 = collectionAttributeNodeIterator0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
      
      boolean boolean1 = collectionAttributeNodeIterator0.setPosition(11);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QName qName0 = new QName("\"//\"", "\"//\"");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, "\"//\"");
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      int int0 = collectionAttributeNodeIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName((String) null, (String) null);
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) variablePointer0, locale0);
      CollectionChildNodeIterator collectionChildNodeIterator0 = new CollectionChildNodeIterator(collectionPointer0, (NodeTest) null, false, variablePointer0);
      // Undeclared exception!
      try { 
        collectionChildNodeIterator0.setPosition(Integer.MIN_VALUE);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid starting pointer for iterator: $null
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionNodeIterator", e);
      }
  }
}
