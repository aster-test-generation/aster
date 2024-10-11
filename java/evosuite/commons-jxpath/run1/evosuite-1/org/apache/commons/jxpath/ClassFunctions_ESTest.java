
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
import java.util.Set;
import org.apache.commons.jxpath.ClassFunctions;
import org.apache.commons.jxpath.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassFunctions_ESTest extends ClassFunctions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "java.util.concurrent.atomic.AomicInteger");
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("java.util.concurrent.atomic.AomicInteger", "new", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous constructor [null]
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "new");
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "new";
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("new", "(oRmL4 4=", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"new\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "%D|~>ktbQh;FZ");
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) classFunctions0;
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("%D|~>ktbQh;FZ", "%D|~>ktbQh;FZ", objectArray0);
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
      Object[] objectArray0 = new Object[0];
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "new");
      Function function0 = classFunctions0.getFunction("new", "new", objectArray0);
      assertNotNull(function0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      Function function0 = classFunctions0.getFunction("", "new", (Object[]) null);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "f");
      Object[] objectArray0 = new Object[12];
      Function function0 = classFunctions0.getFunction("e", "e", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, (String) null);
      Object[] objectArray0 = new Object[19];
      // Undeclared exception!
      try { 
        classFunctions0.getFunction((String) null, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "java.util.concurrent.atomic.AomicInteger");
      Object[] objectArray0 = new Object[1];
      Function function0 = classFunctions0.getFunction((String) null, "lew", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "java.util.concurrent.atomic.AomicInteger");
      Object[] objectArray0 = new Object[1];
      Function function0 = classFunctions0.getFunction("java.util.concurrent.atomic.AomicInteger", "java.util.concurrent.atomic.AomicInteger", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "java.util.concurrent.atomic.AomicInteger");
      Set set0 = classFunctions0.getUsedNamespaces();
      assertFalse(set0.isEmpty());
  }
}
