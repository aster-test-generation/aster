
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


package org.apache.commons.jxpath.functions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Constructor;
import org.apache.commons.jxpath.ExpressionContext;
import org.apache.commons.jxpath.functions.ConstructorFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstructorFunction_ESTest extends ConstructorFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      ConstructorFunction constructorFunction0 = new ConstructorFunction((Constructor) null);
      // Undeclared exception!
      try { 
        constructorFunction0.invoke((ExpressionContext) null, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke constructor null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.functions.ConstructorFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstructorFunction constructorFunction0 = new ConstructorFunction((Constructor) null);
      // Undeclared exception!
      try { 
        constructorFunction0.invoke((ExpressionContext) null, (Object[]) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot invoke constructor null; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.functions.ConstructorFunction", e);
      }
  }
}
