
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
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GnuParser_ESTest extends GnuParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, true);
      assertEquals(0, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      // Undeclared exception!
      try { 
        gnuParser0.flatten((Options) null, (String[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.GnuParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "hoUJ";
      stringArray0[1] = "wCh`-QHt?n{LAO";
      stringArray0[2] = "-='R;5_\"G";
      CommandLine commandLine0 = gnuParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Options options0 = new Options();
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-.";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, true);
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "v|MZmmv4ou";
      stringArray0[1] = "v|MZmmv4ou";
      stringArray0[2] = "4XN";
      stringArray0[3] = "0k#9as,:WB";
      stringArray0[4] = "0k#9as,:WB";
      stringArray0[5] = "4XN";
      stringArray0[6] = "v|MZmmv4ou";
      stringArray0[7] = ".";
      stringArray0[8] = "-";
      String[] stringArray1 = gnuParser0.flatten((Options) null, stringArray0, false);
      assertEquals(9, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "hoUJ";
      stringArray0[1] = "wCh`-QHt?n{LAO";
      stringArray0[2] = "-='R;5_\"G";
      stringArray0[3] = "hoUJ";
      stringArray0[4] = "--";
      String[] stringArray1 = gnuParser0.flatten(options0, stringArray0, false);
      assertEquals(5, stringArray1.length);
  }
}
