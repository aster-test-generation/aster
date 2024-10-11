
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


package org.apache.commons.jxpath.ri.model.dynabeans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DynaBeanPointerFactory_ESTest extends DynaBeanPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      Object object0 = new Object();
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      // Undeclared exception!
      try { 
        dynaBeanPointerFactory0.createNodePointer(nodePointer0, (QName) null, (Object) nodePointer0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/DynaBean
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      QName qName0 = new QName("{!,s");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dynaBeanPointerFactory0.createNodePointer(qName0, object0, (Locale) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/DynaBean
         //
         verifyException("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      QName qName0 = new QName("?;beC:");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = dynaBeanPointerFactory0.createNodePointer((NodePointer) variablePointer0, qName0, (Object) null);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      QName qName0 = new QName("?;beC:");
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NodePointer nodePointer0 = dynaBeanPointerFactory0.createNodePointer(qName0, (Object) null, locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DynaBeanPointerFactory dynaBeanPointerFactory0 = new DynaBeanPointerFactory();
      int int0 = dynaBeanPointerFactory0.getOrder();
      assertEquals(700, int0);
  }
}
