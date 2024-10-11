
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
import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.apache.commons.jxpath.util.ValueUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ValueUtils_ESTest extends ValueUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      ValueUtils.setValue(object0, 0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      // Undeclared exception!
      try { 
        ValueUtils.remove(indexOutOfBoundsException0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No such element at index 1
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(object0, 1041);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 1041
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("");
      Object object0 = ValueUtils.getValue((Object) indexOutOfBoundsException0);
      assertSame(indexOutOfBoundsException0, object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException((String) null);
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength(indexOutOfBoundsException0, (IndexedPropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getDynamicPropertyHandler((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getCollectionHint((Class) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Method method0 = ValueUtils.getAccessibleMethod((Method) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      int int0 = ValueUtils.getLength(class0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<IndexOutOfBoundsException> class0 = IndexOutOfBoundsException.class;
      // Undeclared exception!
      try { 
        ValueUtils.getDynamicPropertyHandler(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate dynamic property handler of class java.lang.IndexOutOfBoundsException; java.lang.IndexOutOfBoundsException cannot be cast to org.apache.commons.jxpath.DynamicPropertyHandler
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("}F", (Method) null, (Method) null, (Method) null, (Method) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) indexOutOfBoundsException0, (PropertyDescriptor) indexedPropertyDescriptor0, (-1), object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: java.lang.IndexOutOfBoundsException.}F; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) class0, (PropertyDescriptor) null, 0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("Nzts+/5`_o>A", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) "Nzts+/5`_o>A", (PropertyDescriptor) indexedPropertyDescriptor0, (-2736));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: java.lang.String.Nzts+/5`_o>A; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.getValue(object0, (PropertyDescriptor) null, 704);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<IndexOutOfBoundsException> class0 = IndexOutOfBoundsException.class;
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) null, (PropertyDescriptor) null, (Object) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("Nzts+/5`_o>A", (Method) null, (Method) null, (Method) null, (Method) null);
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) class0, (PropertyDescriptor) indexedPropertyDescriptor0, (Object) indexOutOfBoundsException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot modify property: java.lang.Class.Nzts+/5`_o>A; No write method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) null, (PropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyDescriptor propertyDescriptor0 = new PropertyDescriptor("}F", (Method) null, (Method) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.getValue(object0, propertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: java.lang.Object.}F; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("org.apache.commons.jxpath.util.TypeUtils");
      ValueUtils.setValue((Object) null, 3530, (Object) indexOutOfBoundsException0);
      assertEquals("org.apache.commons.jxpath.util.TypeUtils", indexOutOfBoundsException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = ValueUtils.getValue(object0, (-2987));
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException((String) null);
      // Undeclared exception!
      try { 
        ValueUtils.remove(indexOutOfBoundsException0, 1041);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No such element at index 1041
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = ValueUtils.remove((Object) null, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ValueUtils.remove(class0, (-3990));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot remove java.lang.Class[-3990]
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(indexOutOfBoundsException0, (-362));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // adjustment of java.lang.IndexOutOfBoundsException to size -362 is not an expansion
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = ValueUtils.expandCollection((Object) null, (-609));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Iterator iterator0 = ValueUtils.iterate((Object) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Iterator iterator0 = ValueUtils.iterate("org.apache.commons.jxpath.util.ValueUtils");
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = ValueUtils.getLength((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(object0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Object into a collection of size 1
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Object> class0 = Object.class;
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("org.apache.commons.jxpath.util.ValueUtils", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength(class0, indexedPropertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No indexed read method for property org.apache.commons.jxpath.util.ValueUtils
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Object> class0 = Object.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = ValueUtils.isCollection((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException();
      boolean boolean0 = ValueUtils.isCollection(indexOutOfBoundsException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
  }
}
