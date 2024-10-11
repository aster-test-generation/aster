
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
import org.apache.commons.jxpath.servlet.ServletContextHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ServletContextHandler_ESTest extends ServletContextHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        servletContextHandler0.setProperty(object0, "", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      // Undeclared exception!
      try { 
        servletContextHandler0.getPropertyNames((Object) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        servletContextHandler0.getProperty(object0, "org.apache.commons.jxpath.servlet.ServletContextHandler");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      // Undeclared exception!
      try { 
        servletContextHandler0.collectPropertyNames((HashSet) null, (Object) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      HashSet<Object> hashSet0 = new HashSet<Object>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        servletContextHandler0.collectPropertyNames(hashSet0, object0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      // Undeclared exception!
      try { 
        servletContextHandler0.setProperty((Object) null, "", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      // Undeclared exception!
      try { 
        servletContextHandler0.getPropertyNames(servletContextHandler0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      // Undeclared exception!
      try { 
        servletContextHandler0.getProperty((Object) null, "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // javax/servlet/ServletContext
         //
         verifyException("org.apache.commons.jxpath.servlet.ServletContextHandler", e);
      }
  }
}
