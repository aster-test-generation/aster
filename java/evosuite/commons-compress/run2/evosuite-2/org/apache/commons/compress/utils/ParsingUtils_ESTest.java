
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.utils.ParsingUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParsingUtils_ESTest extends ParsingUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = ParsingUtils.parseLongValue("8", 10);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = ParsingUtils.parseLongValue("0");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      long long0 = ParsingUtils.parseLongValue("8");
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      long long0 = ParsingUtils.parseLongValue("-1");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = ParsingUtils.parseIntValue("0", 10);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = ParsingUtils.parseIntValue("0");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = ParsingUtils.parseIntValue("7");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        ParsingUtils.parseIntValue((String) null, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse int from string value: null
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = ParsingUtils.parseIntValue("8", 10);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        ParsingUtils.parseLongValue("", 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse long from string value: 
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        ParsingUtils.parseIntValue("k+C1q");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse int from string value: k+C1q
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        ParsingUtils.parseLongValue("m(_7");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse long from string value: m(_7
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }
}
