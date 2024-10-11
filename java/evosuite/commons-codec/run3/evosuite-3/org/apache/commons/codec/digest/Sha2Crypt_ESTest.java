
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.codec.digest.Sha2Crypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Sha2Crypt_ESTest extends Sha2Crypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Sha2Crypt.sha512Crypt(byteArray0, (String) null);
      MockRandom mockRandom0 = new MockRandom((-1L));
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0, (String) null, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-3667L));
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null, "_ D'ugbVou&+", (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt(byteArray0, "", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null, "V~b3meP/P#E{;{^z");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Sha2Crypt.sha256Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, "$6$........$OwUhjxlYpf0uDi3Daq6X1h2YmBY0abvPF2e/pDQFVf6jSCKEhm5natTxE.pcMnnOziwHHMgYbmBAZvNlK1HMY.", (Random) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, (String) null, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.B64", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Sha2Crypt.sha256Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, (String) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null, "9/S/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Sha2Crypt.sha256Crypt(byteArray0, (String) null);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Sha2Crypt.sha512Crypt(byteArray0, (String) null, (Random) mockRandom0);
      assertEquals("$6$........$Zm5TjGQUY5yprXsIee0vIrtuXxQxF8N.i8gMJdouTs9zpu07fm0kdc9N5IezDjqQ9z6Z8hwZXwTDaapsHT9Fg/", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt(byteArray0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Sha2Crypt.sha256Crypt(byteArray0, (String) null, (Random) mockRandom0);
      assertEquals("$5$........$z4lXxFOTxGntLu8OOWKLPX8yevYNOxNkBzcAo4OQSQ5", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, "", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, "Invalid salt value: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sha2Crypt sha2Crypt0 = new Sha2Crypt();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Sha2Crypt.sha256Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0, "$5$........$VNRl8gCQUw2Um1ci/iIEN6koV851iOlvC9xpnOdFhl7");
  }
}
