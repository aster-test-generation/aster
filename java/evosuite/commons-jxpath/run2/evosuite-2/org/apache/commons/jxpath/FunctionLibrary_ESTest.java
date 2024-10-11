
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
  public void test00()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("Cannot invoke extension functon ", "Cannot invoke extension functon ");
      functionLibrary0.addFunctions(packageFunctions0);
      Object[] objectArray0 = new Object[9];
      functionLibrary0.addFunctions(packageFunctions0);
      Function function0 = functionLibrary0.getFunction("Cannot invoke extension functon ", "XGN$+zqp1Q6{e6v#@E", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("Cannot invoke extension functon ", "Cannot invoke extension functon ");
      functionLibrary0.addFunctions(packageFunctions0);
      Object[] objectArray0 = new Object[9];
      Function function0 = functionLibrary0.getFunction("Cannot invoke extension functon ", "XGN$+zqp1Q6{e6v#@E", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[2];
      PackageFunctions packageFunctions0 = new PackageFunctions("org.apache.commons.jxpath.FunctionLibrary", "org.apache.commons.jxpath.FunctionLibrary");
      functionLibrary0.addFunctions(packageFunctions0);
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("org.apache.commons.jxpath.FunctionLibrary", "org.apache.commons.jxpath.FunctionLibrary", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke extension function org.apache.commons.jxpath.FunctionLibrary:org.apache.commons.jxpath.FunctionLibrary; Class 'org/apache/commons/jxpath/FunctionLibraryorg/apache/commons/jxpath.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.jxpath.PackageFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[1];
      functionLibrary0.addFunctions((Functions) null);
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction(">2L3Y9L/_NqYfS7u[xj", ">2L3Y9L/_NqYfS7u[xj", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.FunctionLibrary", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Class<ClassFunctions> class0 = ClassFunctions.class;
      ClassFunctions classFunctions0 = new ClassFunctions(class0, "{,A^-s=D=bp@");
      functionLibrary0.addFunctions(classFunctions0);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) functionLibrary0;
      // Undeclared exception!
      try { 
        functionLibrary0.getFunction("{,A^-s=D=bp@", "{,A^-s=D=bp@", objectArray0);
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
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      PackageFunctions packageFunctions0 = new PackageFunctions("Cannot invoke extension function ", "Cannot invoke extension function ");
      functionLibrary0.addFunctions(packageFunctions0);
      Object[] objectArray0 = new Object[9];
      functionLibrary0.addFunctions(packageFunctions0);
      functionLibrary0.addFunctions(packageFunctions0);
      Function function0 = functionLibrary0.getFunction("Cannot invoke extension function ", "Cannot invoke extension function ", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[1];
      functionLibrary0.getUsedNamespaces();
      Function function0 = functionLibrary0.getFunction(">2L3Y9L/_NqYfS7u[xj", "~", objectArray0);
      assertNull(function0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Set set0 = functionLibrary0.getUsedNamespaces();
      PackageFunctions packageFunctions0 = new PackageFunctions("Cannot invoke extension function ", "Cannot invoke extension function ");
      functionLibrary0.addFunctions(packageFunctions0);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) set0;
      functionLibrary0.addFunctions(functionLibrary0);
      // Undeclared exception!
      functionLibrary0.getFunction("Cannot invoke extension function ", "Cannot invoke extension function ", objectArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      Object[] objectArray0 = new Object[1];
      functionLibrary0.getFunction("", "", objectArray0);
      Set set0 = functionLibrary0.getUsedNamespaces();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FunctionLibrary functionLibrary0 = new FunctionLibrary();
      functionLibrary0.removeFunctions(functionLibrary0);
  }
}
