
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.CircularBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CircularBuffer_ESTest extends CircularBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(10);
      circularBuffer0.copy((-1), (-1));
      assertFalse(circularBuffer0.available());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(10);
      circularBuffer0.put((-1339));
      assertTrue(circularBuffer0.available());
      
      int int0 = circularBuffer0.get();
      assertFalse(circularBuffer0.available());
      assertEquals(197, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(1264);
      // Undeclared exception!
      try { 
        circularBuffer0.copy(2279, 2279);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      // Undeclared exception!
      try { 
        circularBuffer0.copy((-3266), 1004);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CircularBuffer circularBuffer0 = null;
      try {
        circularBuffer0 = new CircularBuffer((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.CircularBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      boolean boolean0 = circularBuffer0.available();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(10);
      assertFalse(circularBuffer0.available());
      
      circularBuffer0.put(0);
      boolean boolean0 = circularBuffer0.available();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(10);
      circularBuffer0.copy(1, 10);
      assertFalse(circularBuffer0.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(10);
      circularBuffer0.put(0);
      circularBuffer0.get();
      assertFalse(circularBuffer0.available());
      
      circularBuffer0.put((-1339));
      circularBuffer0.copy(10, 2135);
      circularBuffer0.put(2135);
      circularBuffer0.put(970);
      circularBuffer0.put(2135);
      boolean boolean0 = circularBuffer0.available();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(10);
      int int0 = circularBuffer0.get();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      // Undeclared exception!
      try { 
        circularBuffer0.put((-1716));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.CircularBuffer", e);
      }
  }
}
