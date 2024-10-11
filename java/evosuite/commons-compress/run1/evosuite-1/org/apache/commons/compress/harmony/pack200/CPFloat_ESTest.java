
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.pack200.CPFloat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPFloat_ESTest extends CPFloat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPFloat cPFloat0 = new CPFloat(0.0F);
      float float0 = cPFloat0.getFloat();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPFloat cPFloat0 = new CPFloat(623.86F);
      float float0 = cPFloat0.getFloat();
      assertEquals(623.86F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPFloat cPFloat0 = new CPFloat(0.0F);
      int int0 = cPFloat0.compareTo(cPFloat0);
      assertEquals(0, int0);
      assertEquals(0.0F, cPFloat0.getFloat(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPFloat cPFloat0 = new CPFloat(623.86F);
      CPFloat cPFloat1 = new CPFloat((-1363.62F));
      int int0 = cPFloat0.compareTo(cPFloat1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPFloat cPFloat0 = new CPFloat(623.86F);
      CPFloat cPFloat1 = new CPFloat((-1363.62F));
      int int0 = cPFloat1.compareTo(cPFloat0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPFloat cPFloat0 = new CPFloat((-2577.4004F));
      // Undeclared exception!
      try { 
        cPFloat0.compareTo((CPFloat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CPFloat cPFloat0 = new CPFloat((-2577.4004F));
      float float0 = cPFloat0.getFloat();
      assertEquals((-2577.4004F), float0, 0.01F);
  }
}
