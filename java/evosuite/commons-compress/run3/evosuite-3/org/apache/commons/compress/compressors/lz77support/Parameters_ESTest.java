
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


package org.apache.commons.compress.compressors.lz77support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Parameters_ESTest extends Parameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      parameters_Builder0.withMaxBackReferenceLength(167);
      Parameters parameters0 = parameters_Builder0.build();
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(83, parameters0.getNiceBackReferenceLength());
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(83, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(167, parameters0.getMaxBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      parameters_Builder0.withMinBackReferenceLength(8);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMinBackReferenceLength();
      assertEquals(15, parameters0.getMaxOffset());
      assertEquals(15, parameters0.getMaxBackReferenceLength());
      assertEquals(8, parameters0.getLazyMatchingThreshold());
      assertEquals(16, parameters0.getWindowSize());
      assertEquals(8, int0);
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(8, parameters0.getNiceBackReferenceLength());
      assertEquals(16, parameters0.getMaxLiteralLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(8);
      parameters_Builder0.withMaxLiteralLength(2);
      Parameters parameters0 = parameters_Builder0.build();
      assertEquals(7, parameters0.getMaxOffset());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(2, parameters0.getMaxLiteralLength());
      assertEquals(8, parameters0.getWindowSize());
      assertEquals(3, parameters0.getNiceBackReferenceLength());
      assertEquals(7, parameters0.getMaxBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(3, parameters0.getLazyMatchingThreshold());
      assertEquals(3, parameters0.getMinBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(32);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxBackReferenceLength((-35));
      Parameters.Builder parameters_Builder2 = parameters_Builder1.withMinBackReferenceLength((-35));
      assertSame(parameters_Builder1, parameters_Builder2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxBackReferenceLength(3);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withNiceBackReferenceLength(0);
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(0, parameters0.getLazyMatchingThreshold());
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals(0, int0);
      assertEquals(15, parameters0.getMaxBackReferenceLength());
      assertEquals(15, parameters0.getMaxOffset());
      assertEquals(16, parameters0.getWindowSize());
      assertTrue(parameters0.getLazyMatching());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      parameters_Builder0.withNiceBackReferenceLength((-657));
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals((-657), parameters0.getLazyMatchingThreshold());
      assertTrue(parameters0.getLazyMatching());
      assertEquals((-657), int0);
      assertEquals(16, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals(15, parameters0.getMaxBackReferenceLength());
      assertEquals(15, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      parameters_Builder0.withMaxNumberOfCandidates(0);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxCandidates();
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(127, parameters0.getLazyMatchingThreshold());
      assertEquals(127, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(0, int0);
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      parameters_Builder0.withMaxNumberOfCandidates((-855));
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxCandidates();
      assertEquals((-855), int0);
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(127, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(127, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(8);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withLazyThreshold(0);
      Parameters parameters0 = parameters_Builder1.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertTrue(parameters0.getLazyMatching());
      assertEquals(7, parameters0.getMaxBackReferenceLength());
      assertEquals(8, parameters0.getMaxLiteralLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(0, int0);
      assertEquals(7, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(8, parameters0.getWindowSize());
      assertEquals(3, parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      parameters_Builder0.withNiceBackReferenceLength((-657));
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(15, parameters0.getMaxOffset());
      assertEquals((-657), int0);
      assertEquals(16, parameters0.getWindowSize());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(15, parameters0.getMaxBackReferenceLength());
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals((-657), parameters0.getNiceBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMinBackReferenceLength(16);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(2);
      // Undeclared exception!
      try { 
        parameters_Builder0.withMinBackReferenceLength(3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minBackReferenceLength can't be bigger than windowSize
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxOffset(0);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxOffset(256);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withMaxLiteralLength(0);
      assertSame(parameters_Builder1, parameters_Builder0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parameters.builder(15);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parameters.builder((-905));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // windowSize must be a power of two
         //
         verifyException("org.apache.commons.compress.compressors.lz77support.Parameters$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxLiteralLength();
      assertEquals(127, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, int0);
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(127, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxCandidates());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getNiceBackReferenceLength();
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(127, int0);
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(127, parameters0.getLazyMatchingThreshold());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getLazyMatchingThreshold();
      assertEquals(127, parameters0.getNiceBackReferenceLength());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(127, int0);
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(255, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxBackReferenceLength();
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals(15, int0);
      assertEquals(7, parameters0.getNiceBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(16, parameters0.getWindowSize());
      assertTrue(parameters0.getLazyMatching());
      assertEquals(7, parameters0.getLazyMatchingThreshold());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(15, parameters0.getMaxOffset());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxOffset();
      assertEquals(127, parameters0.getNiceBackReferenceLength());
      assertEquals(127, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(255, int0);
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(256, parameters0.getWindowSize());
      assertTrue(parameters0.getLazyMatching());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getMaxCandidates();
      assertTrue(parameters0.getLazyMatching());
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(127, parameters0.getNiceBackReferenceLength());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(256, int0);
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(127, parameters0.getLazyMatchingThreshold());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters parameters0 = parameters_Builder0.build();
      boolean boolean0 = parameters0.getLazyMatching();
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertTrue(boolean0);
      assertEquals(127, parameters0.getLazyMatchingThreshold());
      assertEquals(127, parameters0.getNiceBackReferenceLength());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(256, parameters0.getMaxCandidates());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters parameters0 = parameters_Builder0.build();
      int int0 = parameters0.getWindowSize();
      assertTrue(parameters0.getLazyMatching());
      assertEquals(15, parameters0.getMaxOffset());
      assertEquals(16, int0);
      assertEquals(256, parameters0.getMaxCandidates());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(7, parameters0.getNiceBackReferenceLength());
      assertEquals(7, parameters0.getLazyMatchingThreshold());
      assertEquals(16, parameters0.getMaxLiteralLength());
      assertEquals(15, parameters0.getMaxBackReferenceLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.tunedForCompressionRatio();
      Parameters parameters0 = parameters_Builder1.build();
      assertTrue(parameters0.getLazyMatching());
      assertEquals(255, parameters0.getNiceBackReferenceLength());
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertEquals(32, parameters0.getMaxCandidates());
      assertEquals(255, parameters0.getLazyMatchingThreshold());
      assertEquals(256, parameters0.getMaxLiteralLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(256);
      parameters_Builder0.tunedForSpeed();
      Parameters parameters0 = parameters_Builder0.build();
      boolean boolean0 = parameters0.getLazyMatching();
      assertEquals(31, parameters0.getNiceBackReferenceLength());
      assertEquals(255, parameters0.getMaxOffset());
      assertEquals(3, parameters0.getMinBackReferenceLength());
      assertFalse(boolean0);
      assertEquals(255, parameters0.getMaxBackReferenceLength());
      assertEquals(256, parameters0.getMaxLiteralLength());
      assertEquals(32, parameters0.getMaxCandidates());
      assertEquals(256, parameters0.getWindowSize());
      assertEquals(3, parameters0.getLazyMatchingThreshold());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parameters.Builder parameters_Builder0 = Parameters.builder(16);
      Parameters.Builder parameters_Builder1 = parameters_Builder0.withLazyMatching(false);
      assertSame(parameters_Builder0, parameters_Builder1);
  }
}
