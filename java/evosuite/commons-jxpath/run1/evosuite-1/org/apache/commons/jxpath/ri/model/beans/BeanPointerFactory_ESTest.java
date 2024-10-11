
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
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BeanPointerFactory_ESTest extends BeanPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BeanPointerFactory beanPointerFactory0 = new BeanPointerFactory();
      QName qName0 = new QName("eITb.q7;`U1B", "eITb.q7;`U1B");
      Object object0 = new Object();
      NodePointer nodePointer0 = beanPointerFactory0.createNodePointer((NodePointer) null, qName0, object0);
      assertFalse(nodePointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BeanPointerFactory beanPointerFactory0 = new BeanPointerFactory();
      QName qName0 = new QName("Qtm3{h/Y$+6+;1 ", "Qtm3{h/Y$+6+;1 ");
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      NodePointer nodePointer0 = beanPointerFactory0.createNodePointer(qName0, object0, locale0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BeanPointerFactory beanPointerFactory0 = new BeanPointerFactory();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        beanPointerFactory0.createNodePointer((QName) null, (Object) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BeanPointerFactory beanPointerFactory0 = new BeanPointerFactory();
      QName qName0 = new QName("Qtm3{h/Y$+6+;1 ", "Qtm3{h/Y$+6+;1 ");
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      beanPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) null);
      assertEquals(900, beanPointerFactory0.getOrder());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BeanPointerFactory beanPointerFactory0 = new BeanPointerFactory();
      int int0 = beanPointerFactory0.getOrder();
      assertEquals(900, int0);
  }
}
