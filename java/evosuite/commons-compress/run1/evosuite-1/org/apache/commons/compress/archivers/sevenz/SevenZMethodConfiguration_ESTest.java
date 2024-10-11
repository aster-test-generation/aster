
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
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.sevenz.SevenZMethod;
import org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SevenZMethodConfiguration_ESTest extends SevenZMethodConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.BCJ_ARM_THUMB_FILTER;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      SevenZMethod sevenZMethod1 = sevenZMethodConfiguration0.getMethod();
      SevenZMethodConfiguration sevenZMethodConfiguration1 = new SevenZMethodConfiguration(sevenZMethod1, (Object) null);
      assertEquals(SevenZMethod.BCJ_ARM_THUMB_FILTER, sevenZMethodConfiguration1.getMethod());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration((SevenZMethod) null);
      sevenZMethodConfiguration0.getMethod();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration((SevenZMethod) null);
      sevenZMethodConfiguration0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.BZIP2;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      sevenZMethodConfiguration0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.BZIP2;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      SevenZMethod sevenZMethod1 = SevenZMethod.DEFLATE64;
      SevenZMethodConfiguration sevenZMethodConfiguration1 = new SevenZMethodConfiguration(sevenZMethod1);
      boolean boolean0 = sevenZMethodConfiguration0.equals(sevenZMethodConfiguration1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.BZIP2;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      SevenZMethodConfiguration sevenZMethodConfiguration1 = new SevenZMethodConfiguration(sevenZMethod0);
      boolean boolean0 = sevenZMethodConfiguration0.equals(sevenZMethodConfiguration1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.BZIP2;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      boolean boolean0 = sevenZMethodConfiguration0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.BCJ_ARM_THUMB_FILTER;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      boolean boolean0 = sevenZMethodConfiguration0.equals(sevenZMethodConfiguration0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.COPY;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      boolean boolean0 = sevenZMethodConfiguration0.equals(sevenZMethod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.COPY;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      SevenZMethod sevenZMethod1 = sevenZMethodConfiguration0.getMethod();
      Object object0 = new Object();
      SevenZMethodConfiguration sevenZMethodConfiguration1 = null;
      try {
        sevenZMethodConfiguration1 = new SevenZMethodConfiguration(sevenZMethod1, object0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.sevenz.Coders
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.BZIP2;
      SevenZMethodConfiguration sevenZMethodConfiguration0 = new SevenZMethodConfiguration(sevenZMethod0);
      Object object0 = sevenZMethodConfiguration0.getOptions();
      assertNull(object0);
  }
}
