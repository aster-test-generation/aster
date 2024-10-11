
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
import org.apache.commons.jxpath.FunctionLibrary;
import org.apache.commons.jxpath.Functions;
import org.apache.commons.jxpath.PackageFunctions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FunctionLibrary_ESTest extends FunctionLibrary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      functionLibrary0.addFunctions((Functions) null);
      // Undeclared exception!
      try { 
        functionLibrary0.getUsedNamespaces();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.FunctionLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("VLc\"d-EsH", "VLc\"d-EsH");
      functionLibrary0.addFunctions(packageFunctions0);
      Object[] objectArray0 = new Object[8];
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("VLc\"d-EsH", ".geaegqez}N", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function VLc\"d-EsH:.geaegqez}N; Class 'VLc\"d-EsH.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      Object[] objectArray0 = new Object[5];
      functionLibrary0.addFunctions(classFunctions0);
      objectArray0[0] = (Object) "";
      functionLibrary0.addFunctions(functionLibrary0);
      // Undeclared exception!
      functionLibrary0.getFunction("", "$", objectArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[9];
      functionLibrary0.addFunctions((Functions) null);
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction(";C'9scfH-N5[{NPn", (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.FunctionLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<ClassFunctions> class0 = ClassFunctions.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      functionLibrary0.addFunctions(classFunctions0);
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) "";
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("", "", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/beanutils/ConvertUtils
         //
         verifyException("org.apache.commons.jxpath.util.BasicTypeConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[5];
      functionLibrary0.getFunction("", "<}`y+y", objectArray0);
      Function function0 = functionLibrary0.getFunction("", "s*=b?eFE]2z/VLAc[", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[5];
      functionLibrary0.getFunction("", "<}`y+y", objectArray0);
      Set set0 = functionLibrary0.getUsedNamespaces();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.addFunctions(classFunctions0);
      functionLibrary0.addFunctions(functionLibrary0);
      Set set0 = functionLibrary0.getUsedNamespaces();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      functionLibrary0.addFunctions(classFunctions0);
      Object[] objectArray0 = new Object[7];
      functionLibrary0.addFunctions(classFunctions0);
      Function function0 = functionLibrary0.getFunction("", "<tU}`y+y", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<Object> class0 = Object.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "");
      functionLibrary0.removeFunctions(classFunctions0);
  }
}
