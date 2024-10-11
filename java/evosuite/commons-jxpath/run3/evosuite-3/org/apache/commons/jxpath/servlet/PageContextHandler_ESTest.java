
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


package org.apache.commons.jxpath.servlet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PageContextHandler_ESTest extends PageContextHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PageContextHandler pageContextHandler0 = new PageContextHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        pageContextHandler0.setProperty(object0, "", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/jsp/PageContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PageContextHandler pageContextHandler0 = new PageContextHandler();
      // Undeclared exception!
      try { 
        pageContextHandler0.getPropertyNames((Object) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/jsp/PageContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PageContextHandler pageContextHandler0 = new PageContextHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        pageContextHandler0.getPropertyNames(object0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/jsp/PageContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PageContextHandler pageContextHandler0 = new PageContextHandler();
      // Undeclared exception!
      try { 
        pageContextHandler0.getProperty((Object) null, "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/jsp/PageContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PageContextHandler pageContextHandler0 = new PageContextHandler();
      // Undeclared exception!
      try { 
        pageContextHandler0.getProperty("1v&m,FwFal8rD", "1v&m,FwFal8rD");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/jsp/PageContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PageContextHandler pageContextHandler0 = new PageContextHandler();
      // Undeclared exception!
      try { 
        pageContextHandler0.setProperty((Object) null, "", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/jsp/PageContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageContextHandler", e);
      }
  }
}
