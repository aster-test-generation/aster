
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
import org.apache.commons.jxpath.JXPathException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathException_ESTest extends JXPathException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      JXPathException jXPathException0 = new JXPathException(mockThrowable0);
      Throwable throwable0 = jXPathException0.getException();
      assertSame(mockThrowable0, throwable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("; ");
      JXPathException jXPathException0 = new JXPathException("YM8v;", mockThrowable0);
      JXPathException jXPathException1 = new JXPathException((String) null, jXPathException0);
      String string0 = jXPathException1.getMessage();
      assertEquals("YM8v;; ; ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JXPathException jXPathException0 = new JXPathException("");
      String string0 = jXPathException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      JXPathException jXPathException0 = new JXPathException(mockThrowable0);
      String string0 = jXPathException0.getMessage();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable; org.evosuite.runtime.mock.java.lang.MockThrowable", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JXPathException jXPathException0 = new JXPathException("");
      Throwable throwable0 = jXPathException0.getException();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JXPathException jXPathException0 = new JXPathException();
      String string0 = jXPathException0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JXPathException jXPathException0 = new JXPathException("");
      Throwable throwable0 = jXPathException0.getCause();
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JXPathException jXPathException0 = null;
      try {
        jXPathException0 = new JXPathException((Throwable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathException", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      JXPathException jXPathException0 = new JXPathException("");
      JXPathException jXPathException1 = new JXPathException("", jXPathException0);
      Throwable throwable0 = jXPathException1.getCause();
      assertSame(jXPathException0, throwable0);
  }
}
