
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
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathContextFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathContextFactory_ESTest extends JXPathContextFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JXPathContextFactory jXPathContextFactory0 = JXPathContextFactory.newInstance();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jXPathContextFactory0);
      jXPathContext0.setLenient(true);
      JXPathContext jXPathContext1 = jXPathContextFactory0.newContext(jXPathContext0, jXPathContextFactory0);
      assertTrue(jXPathContext1.isLenient());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JXPathContextFactory jXPathContextFactory0 = JXPathContextFactory.newInstance();
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      JXPathContext jXPathContext1 = jXPathContextFactory0.newContext(jXPathContext0, object0);
      assertNotSame(jXPathContext1, jXPathContext0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jxpath.properties");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "org.apache.commons.jxpath.JXPathContextFactory");
      // Undeclared exception!
      try { 
        JXPathContextFactory.newInstance();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("org.apache.commons.jxpath.JXPathContextFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jxpath.properties");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "qz7mqx|");
      FileSystemHandling.shouldAllThrowIOExceptions();
      JXPathContextFactory jXPathContextFactory0 = JXPathContextFactory.newInstance();
      assertNotNull(jXPathContextFactory0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/jre/lib/jxpath.properties");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "qz7mqx|");
      JXPathContextFactory jXPathContextFactory0 = JXPathContextFactory.newInstance();
      assertNotNull(jXPathContextFactory0);
  }
}
