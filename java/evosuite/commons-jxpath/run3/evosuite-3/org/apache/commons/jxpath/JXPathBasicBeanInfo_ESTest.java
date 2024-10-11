
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
import java.beans.PropertyDescriptor;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JXPathBasicBeanInfo_ESTest extends JXPathBasicBeanInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, (Class) null);
      assertFalse(jXPathBasicBeanInfo0.isDynamic());
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      boolean boolean0 = jXPathBasicBeanInfo0.isAtomic();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      jXPathBasicBeanInfo0.getDynamicPropertyHandlerClass();
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo((Class) null, (Class) null);
      // Undeclared exception!
      try { 
        jXPathBasicBeanInfo0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathBasicBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo((Class) null);
      // Undeclared exception!
      try { 
        jXPathBasicBeanInfo0.getPropertyDescriptors();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathBasicBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo((Class) null);
      // Undeclared exception!
      try { 
        jXPathBasicBeanInfo0.getPropertyDescriptor(", properties = ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.JXPathBasicBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      boolean boolean0 = jXPathBasicBeanInfo0.isDynamic();
      assertTrue(boolean0);
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      boolean boolean0 = jXPathBasicBeanInfo0.isAtomic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      jXPathBasicBeanInfo0.getPropertyDescriptor("BeanInfo [class = java.beans.PropertyDescriptor, atomic, properties = \n    boolean: bound\n    boolean: constrained\n    class java.lang.String: displayName\n    boolean: expert\n    boolean: hidden\n    class java.lang.String: name\n    boolean: preferred\n    class java.lang.Class: propertyEditorClass\n    class java.lang.Class: propertyType\n    class java.lang.reflect.Method: readMethod\n    class java.lang.String: shortDescription\n    class java.lang.reflect.Method: writeMethod]");
      jXPathBasicBeanInfo0.getPropertyDescriptor("BeanInfo [class = java.beans.PropertyDescriptor, atomic, properties = \n    boolean: bound\n    boolean: constrained\n    class java.lang.String: displayName\n    boolean: expert\n    boolean: hidden\n    class java.lang.String: name\n    boolean: preferred\n    class java.lang.Class: propertyEditorClass\n    class java.lang.Class: propertyType\n    class java.lang.reflect.Method: readMethod\n    class java.lang.String: shortDescription\n    class java.lang.reflect.Method: writeMethod]");
      assertTrue(jXPathBasicBeanInfo0.isAtomic());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      jXPathBasicBeanInfo0.getPropertyDescriptors();
      String string0 = jXPathBasicBeanInfo0.toString();
      assertEquals("BeanInfo [class = java.beans.PropertyDescriptor, dynamic, properties = \n    boolean: bound\n    boolean: constrained\n    class java.lang.String: displayName\n    boolean: expert\n    boolean: hidden\n    class java.lang.String: name\n    boolean: preferred\n    class java.lang.Class: propertyEditorClass\n    class java.lang.Class: propertyType\n    class java.lang.reflect.Method: readMethod\n    class java.lang.String: shortDescription\n    class java.lang.reflect.Method: writeMethod]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      String string0 = jXPathBasicBeanInfo0.toString();
      assertEquals("BeanInfo [class = java.beans.PropertyDescriptor, dynamic, properties = \n    boolean: bound\n    boolean: constrained\n    class java.lang.String: displayName\n    boolean: expert\n    boolean: hidden\n    class java.lang.String: name\n    boolean: preferred\n    class java.lang.Class: propertyEditorClass\n    class java.lang.Class: propertyType\n    class java.lang.reflect.Method: readMethod\n    class java.lang.String: shortDescription\n    class java.lang.reflect.Method: writeMethod]", string0);
      
      PropertyDescriptor[] propertyDescriptorArray0 = jXPathBasicBeanInfo0.getPropertyDescriptors();
      assertEquals(12, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      jXPathBasicBeanInfo0.getDynamicPropertyHandlerClass();
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      boolean boolean0 = jXPathBasicBeanInfo0.isDynamic();
      assertFalse(boolean0);
      assertFalse(jXPathBasicBeanInfo0.isAtomic());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      String string0 = jXPathBasicBeanInfo0.toString();
      assertEquals("BeanInfo [class = java.beans.PropertyDescriptor, atomic, properties = \n    boolean: bound\n    boolean: constrained\n    class java.lang.String: displayName\n    boolean: expert\n    boolean: hidden\n    class java.lang.String: name\n    boolean: preferred\n    class java.lang.Class: propertyEditorClass\n    class java.lang.Class: propertyType\n    class java.lang.reflect.Method: readMethod\n    class java.lang.String: shortDescription\n    class java.lang.reflect.Method: writeMethod]", string0);
  }
}
