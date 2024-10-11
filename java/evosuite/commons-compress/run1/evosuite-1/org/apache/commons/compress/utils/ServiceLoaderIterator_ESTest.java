
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.apache.commons.compress.utils.ServiceLoaderIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ServiceLoaderIterator_ESTest extends ServiceLoaderIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoaderIterator<Object> serviceLoaderIterator0 = new ServiceLoaderIterator<Object>(class0, classLoader0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ServiceLoaderIterator<SecurityException> serviceLoaderIterator0 = null;
      try {
        serviceLoaderIterator0 = new ServiceLoaderIterator<SecurityException>((Class<SecurityException>) null, classLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Service interface cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServiceLoaderIterator<SecurityException> serviceLoaderIterator0 = null;
      try {
        serviceLoaderIterator0 = new ServiceLoaderIterator<SecurityException>((Class<SecurityException>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Service interface cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<SecurityException> class0 = SecurityException.class;
      ServiceLoaderIterator<SecurityException> serviceLoaderIterator0 = new ServiceLoaderIterator<SecurityException>(class0);
      // Undeclared exception!
      try { 
        serviceLoaderIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No more elements for service java.lang.SecurityException
         //
         verifyException("org.apache.commons.compress.utils.ServiceLoaderIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<SecurityException> class0 = SecurityException.class;
      ServiceLoaderIterator<SecurityException> serviceLoaderIterator0 = new ServiceLoaderIterator<SecurityException>(class0);
      boolean boolean0 = serviceLoaderIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<SecurityException> class0 = SecurityException.class;
      ServiceLoaderIterator<SecurityException> serviceLoaderIterator0 = new ServiceLoaderIterator<SecurityException>(class0);
      // Undeclared exception!
      try { 
        serviceLoaderIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // service=java.lang.SecurityException
         //
         verifyException("org.apache.commons.compress.utils.ServiceLoaderIterator", e);
      }
  }
}
