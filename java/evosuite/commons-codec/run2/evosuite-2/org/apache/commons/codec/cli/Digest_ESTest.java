
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


package org.apache.commons.codec.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.codec.cli.Digest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Digest_ESTest extends Digest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "SHA-224";
      stringArray0[1] = "D`f]q-A[iUB }xJ";
      stringArray0[2] = "D`f]q-A[iUB }xJ";
      stringArray0[3] = "D`f]q-A[iUB }xJ";
      stringArray0[4] = "";
      stringArray0[5] = "D`f]q-A[iUB }xJ";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("D`f]q-A[iUB }xJ");
      FileSystemHandling.createFolder(evoSuiteFile0);
      stringArray0[6] = "";
      Digest.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "*";
      stringArray0[1] = "D`f]q-A[iUB }xJ";
      try { 
        Digest.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "SHA-224";
      stringArray0[1] = "D`f]q-A[iUB }xJ";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("@zV.ORWqj%S");
      FileSystemHandling.createFolder(evoSuiteFile0);
      stringArray0[2] = "D`f]q-A[iUB }xJ";
      stringArray0[3] = "D`f]q-A[iUB }xJ";
      stringArray0[4] = "";
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("D`f]q-A[iUB }xJ");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "D`f]q-A[iUB }xJ");
      // Undeclared exception!
      try { 
        Digest.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "*";
      stringArray0[1] = "";
      Digest.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[21];
      stringArray0[0] = "(";
      // Undeclared exception!
      try { 
        Digest.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: ( MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "ALL";
      try { 
        Digest.main(stringArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated exception in System.in
         //
         verifyException("org.evosuite.runtime.util.SystemInUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Digest.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Usage: java org.apache.commons.codec.cli.Digest [algorithm] [FILE|DIRECTORY|string] ...
         //
         verifyException("org.apache.commons.codec.cli.Digest", e);
      }
  }
}
