
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
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ValueUtils_ESTest extends ValueUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.remove(object0, 1024);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No such element at index 1024
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(valueUtils0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn org.apache.commons.jxpath.util.ValueUtils into a collection of size 1
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("9+mcR}x5~.}MI4");
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) indexOutOfBoundsException0, (PropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength((Object) null, (IndexedPropertyDescriptor) null);
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
      Method method0 = ValueUtils.getAccessibleMethod((Method) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<IndexOutOfBoundsException> class0 = IndexOutOfBoundsException.class;
      Object object0 = ValueUtils.getValue((Object) class0, 0);
      Class class1 = (Class)ValueUtils.getValue(object0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyDescriptor propertyDescriptor0 = new PropertyDescriptor("Cannot set value of an element of a ", (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) null, propertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: null.Cannot set value of an element of a ; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ValueUtils.getDynamicPropertyHandler(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot allocate dynamic property handler of class java.lang.Object; java.lang.Object cannot be cast to org.apache.commons.jxpath.DynamicPropertyHandler
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("({");
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("({", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) indexOutOfBoundsException0, (PropertyDescriptor) indexedPropertyDescriptor0, (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: java.lang.IndexOutOfBoundsException.({; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) null, (PropertyDescriptor) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("Of`$rWcy;;dPa");
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("Of`$rWcy;;dPa", (Method) null, (Method) null, (Method) null, (Method) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) indexOutOfBoundsException0, (PropertyDescriptor) indexedPropertyDescriptor0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot modify property: java.lang.IndexOutOfBoundsException.Of`$rWcy;;dPa; No write method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("M).3_=IeV_3aU");
      // Undeclared exception!
      try { 
        ValueUtils.getValue((Object) mockFile0, (PropertyDescriptor) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("null", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) null, (PropertyDescriptor) indexedPropertyDescriptor0, (-1161), (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot access property: null.null; No read method
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      ValueUtils.setValue((Object) class0, 27, (Object) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ValueUtils.setValue((Object) null, 1024, (Object) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = ValueUtils.getValue((Object) null, (int) (byte)15);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        ValueUtils.remove(object0, (-1832));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot remove java.lang.Object[-1832]
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = ValueUtils.remove((Object) null, (-617));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("kM)iEmmX7/75/3W:");
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(indexOutOfBoundsException0, (-1458));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // adjustment of java.lang.IndexOutOfBoundsException: kM)iEmmX7/75/3W: to size -1458 is not an expansion
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = ValueUtils.expandCollection((Object) null, (-2));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<IndexOutOfBoundsException> class0 = IndexOutOfBoundsException.class;
      // Undeclared exception!
      try { 
        ValueUtils.expandCollection(class0, 3427);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot turn java.lang.Class into a collection of size 3427
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Iterator iterator0 = ValueUtils.iterate((Object) null);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object object0 = new Object();
      Iterator iterator0 = ValueUtils.iterate(object0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = ValueUtils.getLength((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      int int0 = ValueUtils.getLength(object0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("Of`$rWcy;;dPa");
      IndexedPropertyDescriptor indexedPropertyDescriptor0 = new IndexedPropertyDescriptor("Of`$rWcy;;dPa", (Method) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        ValueUtils.getIndexedPropertyLength(indexOutOfBoundsException0, indexedPropertyDescriptor0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No indexed read method for property Of`$rWcy;;dPa
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<IndexOutOfBoundsException> class0 = IndexOutOfBoundsException.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      int int0 = ValueUtils.getCollectionHint(class0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = ValueUtils.isCollection((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      boolean boolean0 = ValueUtils.isCollection(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ValueUtils valueUtils0 = new ValueUtils();
      // Undeclared exception!
      try { 
        ValueUtils.setValue((Object) valueUtils0, (PropertyDescriptor) null, (-1), (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.ValueUtils", e);
      }
  }
}
