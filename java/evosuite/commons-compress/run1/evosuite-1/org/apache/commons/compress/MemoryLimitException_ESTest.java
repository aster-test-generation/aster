
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


package org.apache.commons.compress;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.MemoryLimitException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MemoryLimitException_ESTest extends MemoryLimitException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockException mockException0 = new MockException();
      MemoryLimitException memoryLimitException0 = new MemoryLimitException(0L, 1, mockException0);
      long long0 = memoryLimitException0.getMemoryNeededInKb();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemoryLimitException memoryLimitException0 = new MemoryLimitException((-1655L), 1003);
      long long0 = memoryLimitException0.getMemoryNeededInKb();
      assertEquals((-1655L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MemoryLimitException memoryLimitException0 = new MemoryLimitException((-1655L), 1003);
      int int0 = memoryLimitException0.getMemoryLimitInKb();
      assertEquals(1003, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MemoryLimitException memoryLimitException0 = new MemoryLimitException(2872L, (-526));
      int int0 = memoryLimitException0.getMemoryLimitInKb();
      assertEquals((-526), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MemoryLimitException memoryLimitException0 = new MemoryLimitException(2872L, (-526));
      long long0 = memoryLimitException0.getMemoryNeededInKb();
      assertEquals(2872L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockException mockException0 = new MockException("", (Throwable) null);
      MemoryLimitException memoryLimitException0 = new MemoryLimitException(0L, 0, mockException0);
      int int0 = memoryLimitException0.getMemoryLimitInKb();
      assertEquals(0, int0);
  }
}
