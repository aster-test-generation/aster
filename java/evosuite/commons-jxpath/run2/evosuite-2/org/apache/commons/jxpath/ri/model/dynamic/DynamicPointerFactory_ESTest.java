
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


package org.apache.commons.jxpath.ri.model.dynamic;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPointerFactory_ESTest extends DynamicPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName((String) null, (String) null);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      NodePointer nodePointer0 = dynamicPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) hashMap0);
      assertNull(nodePointer0.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      NodePointer nodePointer0 = dynamicPointerFactory0.createNodePointer(qName0, object0, (Locale) null);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName("=O$1g}qe=h'X6Q%2$8", "=O$1g}qe=h'X6Q%2$8");
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        dynamicPointerFactory0.createNodePointer(qName0, (Object) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      NodePointer nodePointer1 = dynamicPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) qName0);
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName((String) null, (String) null);
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      dynamicPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) null);
      assertEquals(800, dynamicPointerFactory0.getOrder());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName((String) null, (String) null);
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Locale locale0 = Locale.ENGLISH;
      NodePointer nodePointer0 = dynamicPointerFactory0.createNodePointer(qName0, (Object) hashMap0, locale0);
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      int int0 = dynamicPointerFactory0.getOrder();
      assertEquals(800, int0);
  }
}
