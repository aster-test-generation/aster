
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
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionAttributeNodeIterator;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CollectionAttributeNodeIterator_ESTest extends CollectionAttributeNodeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName("", "");
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator((CollectionPointer) null, qName0);
      // Undeclared exception!
      try { 
        collectionAttributeNodeIterator0.getElementNodeIterator((NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.CollectionAttributeNodeIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",73?g");
      Object object0 = new Object();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      // Undeclared exception!
      try { 
        collectionAttributeNodeIterator0.getElementNodeIterator(variablePointer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such variable: ',73?g'
         //
         verifyException("org.apache.commons.jxpath.BasicVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName(",73?g");
      Object object0 = new Object();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      CollectionPointer collectionPointer0 = new CollectionPointer(variablePointer0, object0);
      CollectionAttributeNodeIterator collectionAttributeNodeIterator0 = new CollectionAttributeNodeIterator(collectionPointer0, qName0);
      NodeIterator nodeIterator0 = collectionAttributeNodeIterator0.getElementNodeIterator(collectionPointer0);
      assertFalse(nodeIterator0.equals((Object)collectionAttributeNodeIterator0));
  }
}
