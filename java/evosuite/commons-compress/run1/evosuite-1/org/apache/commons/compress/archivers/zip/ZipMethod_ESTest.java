
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
import org.apache.commons.compress.archivers.zip.ZipMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipMethod_ESTest extends ZipMethod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipMethod[] zipMethodArray0 = ZipMethod.values();
      assertEquals(19, zipMethodArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.valueOf("STORED");
      assertEquals(0, zipMethod0.getCode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.valueOf("PPMD");
      assertEquals(98, zipMethod0.getCode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.valueOf("UNKNOWN");
      assertEquals(ZipMethod.UNKNOWN, zipMethod0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.getMethodByCode(0);
      assertEquals(ZipMethod.STORED, zipMethod0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.getMethodByCode(14);
      assertEquals(ZipMethod.LZMA, zipMethod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.getMethodByCode((-1));
      assertEquals(ZipMethod.UNKNOWN, zipMethod0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      int int0 = zipMethod0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNKNOWN;
      int int0 = zipMethod0.getCode();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.WAVPACK;
      int int0 = zipMethod0.getCode();
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipMethod.getMethodByCode((-1850));
  }
}
