
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
      byte[] byteArray0 = new byte[27];
      Sha2Crypt.sha256Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0, (String) null, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(2454L);
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null, (String) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Sha2Crypt.sha256Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0, "$5$........$IOCdjoFL/Bhg61ebqIIBUJ4Gv.ji.slaaCr4PQBm69/");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt((byte[]) null, "yb=h\"X");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha512Crypt(byteArray0, "org.apache.commons.codec.digest.B64");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: org.apache.commons.codec.digest.B64
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha512Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Sha2Crypt.sha512Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, (String) null, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-2420L));
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null, (String) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0, "$6$qqqqqqqq$C8JNWHCnZocZwfB6aGi5d5X5Xx8Odn4w8VgtU6sMjUOhnbunjR5D0Aqml9Z0mkY/ptuRQ8Wt4aJ9kyAo0REBN1");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt((byte[]) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = Sha2Crypt.sha512Crypt(byteArray0, (String) null);
      assertEquals("$6$........$RQw5pb5Ey.c4rfBffh.sgCHWsUbYK9kMrFMSVMSj88tm34Q2XaZx7MGbMx8JvGs5F/ztAeHfzjSyHurFb9BOH1", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Sha2Crypt.sha256Crypt(byteArray0, (String) null);
      assertEquals("$5$........$82XE8cBpYfxGiO4ZVseZppXdJ28s/a.Oj2J0emt.RK3", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Sha2Crypt.sha512Crypt(byteArray0, (String) null, (Random) mockRandom0);
      assertEquals("$6$........$pJdTIsTtW5yJC1Sew8vjdZtPc1hSCJygL4732kIXHyrtNYvMmZxRUWVqM9id9iOlDINUIr6/JWbeD2KWWyPzA.", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockRandom mockRandom0 = new MockRandom((byte)45);
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[33];
      String string0 = Sha2Crypt.sha256Crypt(byteArray0, "$6$qqqqqqqq$Z2yO6pdLLdrkgXyGfcl0NOS4we2rgSBJWlpgdzYRbI2CBrtNRQcuZ9hj6Nln09fLPQxBdqxU0yXEvg2PoJcOJ1");
      assertEquals("$5$qqqqqqqq$/3ZG2.ax6PN.yeRLDCFqU2x7e4IlOFQ694T1XNOusp6", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Sha2Crypt.sha256Crypt(byteArray0, (String) null, (Random) mockRandom0);
      assertEquals("$5$........$y6q/cFLgPuFCgVkcIWHesrc58JbnhY0Eml2INNlXZz8", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      MockRandom mockRandom0 = new MockRandom((byte)0);
      // Undeclared exception!
      try { 
        Sha2Crypt.sha256Crypt(byteArray0, "rvll1yX", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: rvll1yX
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Sha2Crypt.sha512Crypt(byteArray0);
      // Undeclared exception!
      Sha2Crypt.sha256Crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sha2Crypt sha2Crypt0 = new Sha2Crypt();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
}
