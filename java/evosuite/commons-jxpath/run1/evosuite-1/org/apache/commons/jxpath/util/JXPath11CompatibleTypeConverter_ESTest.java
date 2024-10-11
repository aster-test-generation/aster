
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


package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPath11CompatibleTypeConverter_ESTest extends JXPath11CompatibleTypeConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.convert(basicNodeSet0, (Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<BasicNodeSet> class0 = BasicNodeSet.class;
      Class<Object> class1 = Object.class;
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.convert(class1, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Object object0 = new Object();
      Class<BasicNodeSet> class0 = BasicNodeSet.class;
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.canConvert(object0, class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<BasicNodeSet> class0 = BasicNodeSet.class;
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      Object object0 = jXPath11CompatibleTypeConverter0.convert(basicNodeSet0, class0);
      assertSame(basicNodeSet0, object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<BasicNodeSet> class0 = BasicNodeSet.class;
      Object object0 = jXPath11CompatibleTypeConverter0.convert((Object) null, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      // Undeclared exception!
      try { 
        jXPath11CompatibleTypeConverter0.canConvert(basicNodeSet0, (Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.JXPath11CompatibleTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter0 = new JXPath11CompatibleTypeConverter();
      Class<BasicNodeSet> class0 = BasicNodeSet.class;
      boolean boolean0 = jXPath11CompatibleTypeConverter0.canConvert((Object) null, class0);
      assertTrue(boolean0);
  }
}
