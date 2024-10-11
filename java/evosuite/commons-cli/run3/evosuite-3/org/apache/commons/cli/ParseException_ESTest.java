
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


package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.ParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParseException_ESTest extends ParseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseException parseException0 = new ParseException("'0{~2}j6Ku-p8Z0).");
      ParseException parseException1 = new ParseException(parseException0);
      assertFalse(parseException1.equals((Object)parseException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnsupportedOperationException unsupportedOperationException0 = new UnsupportedOperationException();
      try { 
        ParseException.wrap(unsupportedOperationException0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      ParseException parseException1 = ParseException.wrap(parseException0);
      assertSame(parseException1, parseException0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseException parseException0 = ParseException.wrap((Throwable) null);
      assertNotNull(parseException0);
  }
}
