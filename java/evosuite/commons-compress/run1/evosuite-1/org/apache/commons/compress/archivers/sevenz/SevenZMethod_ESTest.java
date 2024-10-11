
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
import org.apache.commons.compress.archivers.sevenz.SevenZMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SevenZMethod_ESTest extends SevenZMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      SevenZMethod sevenZMethod0 = SevenZMethod.byId(byteArray0);
      assertEquals(SevenZMethod.COPY, sevenZMethod0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SevenZMethod[] sevenZMethodArray0 = SevenZMethod.values();
      assertEquals(14, sevenZMethodArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.valueOf("DEFLATE64");
      assertEquals(SevenZMethod.DEFLATE64, sevenZMethod0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SevenZMethod.byId((byte[]) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SevenZMethod sevenZMethod0 = SevenZMethod.DELTA_FILTER;
      byte[] byteArray0 = sevenZMethod0.getId();
      SevenZMethod sevenZMethod1 = SevenZMethod.byId(byteArray0);
      assertEquals(SevenZMethod.DELTA_FILTER, sevenZMethod1);
  }
}
