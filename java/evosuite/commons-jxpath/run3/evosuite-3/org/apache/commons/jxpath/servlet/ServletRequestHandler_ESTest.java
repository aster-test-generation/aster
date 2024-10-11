
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
import java.util.HashSet;
import org.apache.commons.jxpath.servlet.ServletRequestAndContext;
import org.apache.commons.jxpath.servlet.ServletRequestHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ServletRequestHandler_ESTest extends ServletRequestHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServletRequestHandler servletRequestHandler0 = new ServletRequestHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        servletRequestHandler0.setProperty(object0, "", object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.servlet.ServletRequestAndContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletRequestHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServletRequestHandler servletRequestHandler0 = new ServletRequestHandler();
      // Undeclared exception!
      try { 
        servletRequestHandler0.getProperty((Object) null, "org.apache.commons.jxpath.servlet.ServletRequestAndContext");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletRequestHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServletRequestHandler servletRequestHandler0 = new ServletRequestHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        servletRequestHandler0.getProperty(object0, "y?u345?}WmfXn(,");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.servlet.ServletRequestAndContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletRequestHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServletRequestHandler servletRequestHandler0 = new ServletRequestHandler();
      HashSet<ServletRequestAndContext> hashSet0 = new HashSet<ServletRequestAndContext>();
      // Undeclared exception!
      try { 
        servletRequestHandler0.collectPropertyNames(hashSet0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.servlet.HttpSessionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServletRequestHandler servletRequestHandler0 = new ServletRequestHandler();
      HashSet<Object> hashSet0 = new HashSet<Object>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        servletRequestHandler0.collectPropertyNames(hashSet0, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.jxpath.servlet.HttpSessionAndServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.HttpSessionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ServletRequestHandler servletRequestHandler0 = new ServletRequestHandler();
      // Undeclared exception!
      try { 
        servletRequestHandler0.setProperty((Object) null, "IMW;", "IMW;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletRequestHandler", e);
      }
  }
}
