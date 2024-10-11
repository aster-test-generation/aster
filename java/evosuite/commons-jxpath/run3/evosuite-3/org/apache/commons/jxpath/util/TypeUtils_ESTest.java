
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
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.jxpath.util.BasicTypeConverter;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TypeUtils_ESTest extends TypeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TypeUtils.setTypeConverter((TypeConverter) null);
      TypeConverter typeConverter0 = TypeUtils.getTypeConverter();
      assertNull(typeConverter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      Object object1 = TypeUtils.convert(object0, class0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.wrapPrimitive((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Collection collection0 = basicTypeConverter0.unmodifiableCollection(linkedList0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        TypeUtils.convert(collection0, class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeUtils.setTypeConverter((TypeConverter) null);
      // Undeclared exception!
      try { 
        TypeUtils.convert((Object) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      // Undeclared exception!
      try { 
        TypeUtils.convert(class0, class1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeUtils.setTypeConverter((TypeConverter) null);
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        TypeUtils.canConvert(integer0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      // Undeclared exception!
      try { 
        TypeUtils.canConvert(class0, class1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class class1 = TypeUtils.wrapPrimitive(class0);
      assertEquals(1, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Integer integer0 = new Integer(2366);
      boolean boolean0 = TypeUtils.canConvert(integer0, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BasicTypeConverter basicTypeConverter0 = new BasicTypeConverter();
      Class<Integer> class1 = Integer.class;
      Object object0 = basicTypeConverter0.convertNullToPrimitive(class1);
      Object object1 = TypeUtils.convert(object0, class0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TypeConverter typeConverter0 = TypeUtils.getTypeConverter();
      assertNotNull(typeConverter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TypeUtils typeUtils0 = new TypeUtils();
  }
}
