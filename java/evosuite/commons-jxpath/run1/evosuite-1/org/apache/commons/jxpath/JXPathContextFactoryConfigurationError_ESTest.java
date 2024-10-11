
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
import org.apache.commons.jxpath.JXPathContextFactoryConfigurationError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContextFactoryConfigurationError_ESTest extends JXPathContextFactoryConfigurationError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError0 = new JXPathContextFactoryConfigurationError("");
      String string0 = jXPathContextFactoryConfigurationError0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockException mockException0 = new MockException((String) null);
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError0 = new JXPathContextFactoryConfigurationError(mockException0, (String) null);
      Exception exception0 = jXPathContextFactoryConfigurationError0.getException();
      assertSame(exception0, mockException0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError0 = null;
      try {
        jXPathContextFactoryConfigurationError0 = new JXPathContextFactoryConfigurationError((Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathContextFactoryConfigurationError", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError0 = new JXPathContextFactoryConfigurationError();
      String string0 = jXPathContextFactoryConfigurationError0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError0 = new JXPathContextFactoryConfigurationError();
      Exception exception0 = jXPathContextFactoryConfigurationError0.getException();
      assertNull(exception0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockException mockException0 = new MockException((String) null);
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError0 = new JXPathContextFactoryConfigurationError(mockException0, (String) null);
      String string0 = jXPathContextFactoryConfigurationError0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError0 = new JXPathContextFactoryConfigurationError();
      MockException mockException0 = new MockException(jXPathContextFactoryConfigurationError0);
      JXPathContextFactoryConfigurationError jXPathContextFactoryConfigurationError1 = new JXPathContextFactoryConfigurationError(mockException0);
      String string0 = jXPathContextFactoryConfigurationError1.getMessage();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: org.evosuite.runtime.mock.java.lang.MockThrowable", string0);
  }
}
