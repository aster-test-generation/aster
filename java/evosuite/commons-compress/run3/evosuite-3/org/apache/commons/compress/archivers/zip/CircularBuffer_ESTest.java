
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
  public void test0()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(8);
      circularBuffer0.copy((-555), (-555));
      assertFalse(circularBuffer0.available());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(8);
      circularBuffer0.put(8);
      circularBuffer0.get();
      circularBuffer0.put((-677));
      circularBuffer0.put(1290);
      circularBuffer0.put(1966);
      circularBuffer0.put(1);
      circularBuffer0.copy(0, 1290);
      circularBuffer0.put(393);
      boolean boolean0 = circularBuffer0.available();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(5306);
      circularBuffer0.copy(1, 5306);
      // Undeclared exception!
      circularBuffer0.copy(0, 5306);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(679);
      // Undeclared exception!
      try { 
        circularBuffer0.copy(3681, 1276);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -286
         //
         verifyException("org.apache.commons.compress.archivers.zip.CircularBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      // Undeclared exception!
      try { 
        circularBuffer0.copy((-2618), 614);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.compress.archivers.zip.CircularBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
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
  public void test6()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      boolean boolean0 = circularBuffer0.available();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(255);
      circularBuffer0.copy(0, 830);
      int int0 = circularBuffer0.get();
      assertTrue(circularBuffer0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      assertFalse(circularBuffer0.available());
      
      int int0 = circularBuffer0.get();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CircularBuffer circularBuffer0 = new CircularBuffer(0);
      // Undeclared exception!
      try { 
        circularBuffer0.put(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.CircularBuffer", e);
      }
  }
}
