
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathIntrospector_ESTest extends JXPathIntrospector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Date> class0 = Date.class;
      Class<Object> class1 = Object.class;
      JXPathIntrospector.registerDynamicClass(class1, class0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        JXPathIntrospector.registerDynamicClass((Class) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathIntrospector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBeanInfo jXPathBeanInfo0 = JXPathIntrospector.getBeanInfo(class0);
      assertFalse(jXPathBeanInfo0.isAtomic());
      
      JXPathIntrospector.registerAtomicClass(class0);
      JXPathIntrospector jXPathIntrospector0 = new JXPathIntrospector();
      JXPathIntrospector.getBeanInfo(class0);
      JXPathIntrospector.getBeanInfo(class0);
      JXPathIntrospector.getBeanInfo(class0);
      Class<Object> class1 = Object.class;
      JXPathIntrospector.registerDynamicClass(class0, class1);
      Class<Object> class2 = Object.class;
      JXPathIntrospector.registerAtomicClass(class2);
      JXPathIntrospector.registerAtomicClass(class0);
      JXPathIntrospector.getBeanInfo(class0);
      JXPathIntrospector.registerAtomicClass(class0);
      Class<Date> class3 = Date.class;
      JXPathBeanInfo jXPathBeanInfo1 = JXPathIntrospector.getBeanInfo(class3);
      assertTrue(jXPathBeanInfo1.isAtomic());
      
      Class<Date> class4 = Date.class;
      JXPathIntrospector.registerAtomicClass(class4);
      Class<Date> class5 = Date.class;
      JXPathIntrospector.registerAtomicClass(class5);
      JXPathIntrospector.registerAtomicClass(class5);
      JXPathIntrospector.registerAtomicClass(class2);
      Class<Object> class6 = Object.class;
      JXPathBeanInfo jXPathBeanInfo2 = JXPathIntrospector.getBeanInfo(class6);
      assertTrue(jXPathBeanInfo2.isAtomic());
  }
}
