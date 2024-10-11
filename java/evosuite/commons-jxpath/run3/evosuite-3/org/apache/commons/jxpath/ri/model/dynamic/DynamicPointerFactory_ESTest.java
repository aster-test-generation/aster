
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
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynamicPointerFactory_ESTest extends DynamicPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName("{3", "{3");
      NodePointer nodePointer0 = dynamicPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) null);
      NodePointer nodePointer1 = dynamicPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) nodePointer0);
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName("B", "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = dynamicPointerFactory0.createNodePointer((NodePointer) variablePointer0, qName0, (Object) null);
      assertEquals(Integer.MIN_VALUE, nodePointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName("{3", "{3");
      NodePointer nodePointer0 = dynamicPointerFactory0.createNodePointer(qName0, (Object) "{3", (Locale) null);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      QName qName0 = new QName("B", "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory");
      Locale locale0 = Locale.CHINESE;
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
  public void test4()  throws Throwable  {
      DynamicPointerFactory dynamicPointerFactory0 = new DynamicPointerFactory();
      int int0 = dynamicPointerFactory0.getOrder();
      assertEquals(800, int0);
  }
}
