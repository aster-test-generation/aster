
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
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "new");
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("new", "new", objectArray0);
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
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "java.util.concurrent.atomic.AtomicInteger");
      Set set0 = classFunctions0.getUsedNamespaces();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) set0;
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("java.util.concurrent.atomic.AtomicInteger", "", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.util.concurrent.atomic.AtomicInteger\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "4hf$\"^");
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        classFunctions0.getFunction("4hf$\"^", "o", objectArray0);
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
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "new");
      Object[] objectArray0 = new Object[3];
      Function function0 = classFunctions0.getFunction("new", "new", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "5(^A>;AI");
      Function function0 = classFunctions0.getFunction("5(^A>;AI", "new", (Object[]) null);
      assertNotNull(function0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "q(M.TKM[PF@`}p~cq");
      Object[] objectArray0 = new Object[2];
      Function function0 = classFunctions0.getFunction("q(M.TKM[PF@`}p~cq", "q(M.TKM[PF@`}p~cq", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, (String) null);
      // Undeclared exception!
      try { 
        classFunctions0.getFunction((String) null, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "q(M.TKM[PF@`}p~cq");
      Object[] objectArray0 = new Object[2];
      Function function0 = classFunctions0.getFunction((String) null, "q(M.TKM[PF@`}p~cq", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "4hf$\"^");
      Object[] objectArray0 = new Object[4];
      Function function0 = classFunctions0.getFunction("17;M>?x", "4hf$\"^", objectArray0);
      assertNull(function0);
  }
}
