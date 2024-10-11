
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.sevenz.SevenZFileOptions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SevenZFileOptions_ESTest extends SevenZFileOptions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SevenZFileOptions.Builder sevenZFileOptions_Builder0 = new SevenZFileOptions.Builder();
      sevenZFileOptions_Builder0.withUseDefaultNameForUnnamedEntries(true);
      SevenZFileOptions sevenZFileOptions0 = sevenZFileOptions_Builder0.build();
      boolean boolean0 = sevenZFileOptions0.getUseDefaultNameForUnnamedEntries();
      assertFalse(sevenZFileOptions0.getTryToRecoverBrokenArchives());
      assertTrue(boolean0);
      assertEquals(Integer.MAX_VALUE, sevenZFileOptions0.getMaxMemoryLimitInKb());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SevenZFileOptions.Builder sevenZFileOptions_Builder0 = new SevenZFileOptions.Builder();
      SevenZFileOptions.Builder sevenZFileOptions_Builder1 = sevenZFileOptions_Builder0.withTryToRecoverBrokenArchives(true);
      SevenZFileOptions sevenZFileOptions0 = sevenZFileOptions_Builder1.build();
      boolean boolean0 = sevenZFileOptions0.getTryToRecoverBrokenArchives();
      assertEquals(Integer.MAX_VALUE, sevenZFileOptions0.getMaxMemoryLimitInKb());
      assertTrue(boolean0);
      assertFalse(sevenZFileOptions0.getUseDefaultNameForUnnamedEntries());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SevenZFileOptions.Builder sevenZFileOptions_Builder0 = SevenZFileOptions.builder();
      sevenZFileOptions_Builder0.withMaxMemoryLimitInKb(0);
      SevenZFileOptions sevenZFileOptions0 = sevenZFileOptions_Builder0.build();
      int int0 = sevenZFileOptions0.getMaxMemoryLimitInKb();
      assertFalse(sevenZFileOptions0.getUseDefaultNameForUnnamedEntries());
      assertEquals(0, int0);
      assertFalse(sevenZFileOptions0.getTryToRecoverBrokenArchives());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SevenZFileOptions.Builder sevenZFileOptions_Builder0 = new SevenZFileOptions.Builder();
      sevenZFileOptions_Builder0.withMaxMemoryLimitInKb((-655));
      SevenZFileOptions sevenZFileOptions0 = sevenZFileOptions_Builder0.build();
      int int0 = sevenZFileOptions0.getMaxMemoryLimitInKb();
      assertFalse(sevenZFileOptions0.getTryToRecoverBrokenArchives());
      assertEquals((-655), int0);
      assertFalse(sevenZFileOptions0.getUseDefaultNameForUnnamedEntries());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SevenZFileOptions.Builder sevenZFileOptions_Builder0 = SevenZFileOptions.builder();
      SevenZFileOptions sevenZFileOptions0 = sevenZFileOptions_Builder0.build();
      boolean boolean0 = sevenZFileOptions0.getUseDefaultNameForUnnamedEntries();
      assertFalse(sevenZFileOptions0.getTryToRecoverBrokenArchives());
      assertEquals(Integer.MAX_VALUE, sevenZFileOptions0.getMaxMemoryLimitInKb());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SevenZFileOptions.Builder sevenZFileOptions_Builder0 = SevenZFileOptions.builder();
      SevenZFileOptions sevenZFileOptions0 = sevenZFileOptions_Builder0.build();
      boolean boolean0 = sevenZFileOptions0.getTryToRecoverBrokenArchives();
      assertEquals(Integer.MAX_VALUE, sevenZFileOptions0.getMaxMemoryLimitInKb());
      assertFalse(sevenZFileOptions0.getUseDefaultNameForUnnamedEntries());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SevenZFileOptions.Builder sevenZFileOptions_Builder0 = SevenZFileOptions.builder();
      SevenZFileOptions sevenZFileOptions0 = sevenZFileOptions_Builder0.build();
      int int0 = sevenZFileOptions0.getMaxMemoryLimitInKb();
      assertFalse(sevenZFileOptions0.getUseDefaultNameForUnnamedEntries());
      assertFalse(sevenZFileOptions0.getTryToRecoverBrokenArchives());
      assertEquals(Integer.MAX_VALUE, int0);
  }
}
