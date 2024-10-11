
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


package org.apache.commons.compress.harmony.unpack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.SegmentOptions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentOptions_ESTest extends SegmentOptions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentOptions segmentOptions0 = null;
      try {
        segmentOptions0 = new SegmentOptions(783);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Some unused flags are non-zero
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1527);
      boolean boolean0 = segmentOptions0.shouldDeflate();
      assertTrue(segmentOptions0.hasSpecialFormats());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.shouldDeflate();
      assertFalse(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasSpecialFormats();
      assertTrue(boolean0);
      assertFalse(segmentOptions0.hasFileModtime());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(2534);
      boolean boolean0 = segmentOptions0.hasMethodFlagsHi();
      assertFalse(segmentOptions0.hasSpecialFormats());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasMethodFlagsHi();
      assertTrue(segmentOptions0.hasSpecialFormats());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1527);
      boolean boolean0 = segmentOptions0.hasFileSizeHi();
      assertTrue(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasFileSizeHi();
      assertFalse(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1527);
      boolean boolean0 = segmentOptions0.hasFileOptions();
      assertTrue(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasFileOptions();
      assertFalse(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1527);
      boolean boolean0 = segmentOptions0.hasFileModtime();
      assertTrue(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasFileModtime();
      assertFalse(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1527);
      boolean boolean0 = segmentOptions0.hasFieldFlagsHi();
      assertTrue(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasFieldFlagsHi();
      assertTrue(segmentOptions0.hasSpecialFormats());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(2534);
      boolean boolean0 = segmentOptions0.hasCPNumberCounts();
      assertFalse(segmentOptions0.hasSpecialFormats());
      assertTrue(boolean0);
      assertFalse(segmentOptions0.hasCodeFlagsHi());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasCPNumberCounts();
      assertTrue(segmentOptions0.hasSpecialFormats());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1527);
      boolean boolean0 = segmentOptions0.hasCodeFlagsHi();
      assertTrue(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasCodeFlagsHi();
      assertTrue(segmentOptions0.hasSpecialFormats());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1799);
      boolean boolean0 = segmentOptions0.hasClassFlagsHi();
      assertTrue(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasClassFlagsHi();
      assertTrue(segmentOptions0.hasSpecialFormats());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1527);
      boolean boolean0 = segmentOptions0.hasArchiveFileCounts();
      assertTrue(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasArchiveFileCounts();
      assertTrue(segmentOptions0.hasSpecialFormats());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(2534);
      boolean boolean0 = segmentOptions0.hasAllCodeFlags();
      assertTrue(boolean0);
      assertFalse(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(1);
      boolean boolean0 = segmentOptions0.hasAllCodeFlags();
      assertFalse(boolean0);
      assertTrue(segmentOptions0.hasSpecialFormats());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentOptions segmentOptions0 = null;
      try {
        segmentOptions0 = new SegmentOptions((-426));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Some unused flags are non-zero
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentOptions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentOptions segmentOptions0 = new SegmentOptions(0);
      boolean boolean0 = segmentOptions0.hasSpecialFormats();
      assertFalse(boolean0);
  }
}
