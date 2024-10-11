
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
import org.apache.commons.jxpath.servlet.PageScopeContextHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PageScopeContextHandler_ESTest extends PageScopeContextHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PageScopeContextHandler pageScopeContextHandler0 = new PageScopeContextHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        pageScopeContextHandler0.setProperty(object0, "t;A?D ^gSiV\"{8+y", (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.servlet.PageScopeContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageScopeContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PageScopeContextHandler pageScopeContextHandler0 = new PageScopeContextHandler();
      // Undeclared exception!
      try { 
        pageScopeContextHandler0.getPropertyNames((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.servlet.PageScopeContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PageScopeContextHandler pageScopeContextHandler0 = new PageScopeContextHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        pageScopeContextHandler0.getPropertyNames(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.servlet.PageScopeContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageScopeContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PageScopeContextHandler pageScopeContextHandler0 = new PageScopeContextHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        pageScopeContextHandler0.getProperty(object0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.servlet.PageScopeContext
         //
         verifyException("org.apache.commons.jxpath.servlet.PageScopeContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PageScopeContextHandler pageScopeContextHandler0 = new PageScopeContextHandler();
      // Undeclared exception!
      try { 
        pageScopeContextHandler0.getProperty((Object) null, ".B'");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.servlet.PageScopeContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PageScopeContextHandler pageScopeContextHandler0 = new PageScopeContextHandler();
      // Undeclared exception!
      try { 
        pageScopeContextHandler0.setProperty((Object) null, "M:1(7z+H", "M:1(7z+H");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.servlet.PageScopeContextHandler", e);
      }
  }
}
