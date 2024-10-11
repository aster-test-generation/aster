
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
import org.apache.commons.compress.archivers.zip.ScatterStatistics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ScatterStatistics_ESTest extends ScatterStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScatterStatistics scatterStatistics0 = new ScatterStatistics(0L, 0L);
      long long0 = scatterStatistics0.getMergingElapsed();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScatterStatistics scatterStatistics0 = new ScatterStatistics((-1992L), 3141L);
      long long0 = scatterStatistics0.getMergingElapsed();
      assertEquals(3141L, long0);
      assertEquals((-1992L), scatterStatistics0.getCompressionElapsed());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ScatterStatistics scatterStatistics0 = new ScatterStatistics(0L, 0L);
      long long0 = scatterStatistics0.getCompressionElapsed();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScatterStatistics scatterStatistics0 = new ScatterStatistics(2850L, 0L);
      long long0 = scatterStatistics0.getCompressionElapsed();
      assertEquals(2850L, long0);
      assertEquals(0L, scatterStatistics0.getMergingElapsed());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ScatterStatistics scatterStatistics0 = new ScatterStatistics((-3074L), (-3074L));
      long long0 = scatterStatistics0.getMergingElapsed();
      assertEquals((-3074L), long0);
      assertEquals((-3074L), scatterStatistics0.getCompressionElapsed());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ScatterStatistics scatterStatistics0 = new ScatterStatistics((-3074L), (-3074L));
      String string0 = scatterStatistics0.toString();
      assertEquals("compressionElapsed=-3074ms, mergingElapsed=-3074ms", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ScatterStatistics scatterStatistics0 = new ScatterStatistics((-3074L), (-3074L));
      long long0 = scatterStatistics0.getCompressionElapsed();
      assertEquals((-3074L), scatterStatistics0.getMergingElapsed());
      assertEquals((-3074L), long0);
  }
}
