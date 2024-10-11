
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
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MissingArgumentException_ESTest extends MissingArgumentException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(" [ARG]");
      Option option0 = missingArgumentException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Option option0 = new Option("y", "", true, "");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setRequired(true);
      Option option1 = missingArgumentException0.getOption();
      assertEquals(1, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('e');
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Option option0 = new Option((String) null, "vm0-QS`kH", true, "vm0-QS`kH");
      option0.setOptionalArg(true);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertEquals("vm0-QS`kH", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Option option0 = new Option((String) null, "O^C;V{|3U`YSKYOnV");
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgs((-2));
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      option0.setArgName("Q[d0s2C'UZ9,<P");
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Option option0 = new Option("19IggU", "Illegal option name '%s'.", true, "19IggU");
      option0.setArgs(0);
      MissingArgumentException missingArgumentException0 = new MissingArgumentException(option0);
      Option option1 = missingArgumentException0.getOption();
      assertFalse(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MissingArgumentException missingArgumentException0 = null;
      try {
        missingArgumentException0 = new MissingArgumentException((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.MissingArgumentException", e);
      }
  }
}
