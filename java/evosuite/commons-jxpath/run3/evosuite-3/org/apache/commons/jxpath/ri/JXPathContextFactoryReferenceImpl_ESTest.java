
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


package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContextFactoryReferenceImpl_ESTest extends JXPathContextFactoryReferenceImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JXPathContextFactoryReferenceImpl jXPathContextFactoryReferenceImpl0 = new JXPathContextFactoryReferenceImpl();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathContextFactoryReferenceImpl0);
      jXPathContext0.setLenient(true);
      JXPathContext jXPathContext1 = jXPathContextFactoryReferenceImpl0.newContext(jXPathContext0, jXPathContext0);
      assertNotSame(jXPathContext0, jXPathContext1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JXPathContextFactoryReferenceImpl jXPathContextFactoryReferenceImpl0 = new JXPathContextFactoryReferenceImpl();
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)jXPathContextFactoryReferenceImpl0.newContext(jXPathContext0, object0);
      assertTrue(JXPathContextReferenceImpl.USE_SOFT_CACHE);
  }
}
