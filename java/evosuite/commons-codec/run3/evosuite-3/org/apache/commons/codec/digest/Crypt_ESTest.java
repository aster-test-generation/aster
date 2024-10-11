
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
import org.apache.commons.codec.digest.Crypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Crypt_ESTest extends Crypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Crypt.crypt("org.apache.commons.codec.digest.B64", "org.apache.commons.codec.digest.B64");
      assertEquals("ortb3ZbqR65bM", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt(byteArray0, "$6$........$sWKgbiiZSgXGWjaMn9tYypjfplSJ9NbJjZccM9ejKZiCAnoWoTFLmp1Xdo7r058CklQ.l5uTBfbMVvE7xsEPs0");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((byte[]) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt("$6$........$KkPxzgT1NyFwyLgn8R/POg628euoXMxQzuAbmGUaWzddCA1.RVQIz1Z1wlZ0lw5Hb.BG.rWntxt3Nv6eYDvXW0", "$6$........$KkPxzgT1NyFwyLgn8R/POg628euoXMxQzuAbmGUaWzddCA1.RVQIz1Z1wlZ0lw5Hb.BG.rWntxt3Nv6eYDvXW0");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((String) null, "e;#]^uI8T}k05Oew(cl");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Crypt.crypt("");
      // Undeclared exception!
      Crypt.crypt("$6$........$sWKgbiiZSgXGWjaMn9tYypjfplSJ9NbJjZccM9ejKZiCAnoWoTFLmp1Xdo7r058CklQ.l5uTBfbMVvE7xsEPs0");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      String string0 = Crypt.crypt(byteArray0, (String) null);
      assertEquals("$6$........$ySXDRzYM5JmIgdsxCS5XnnG7cR8/KDnni0CSpLtdvsE3BMmpOM5E7kYc8mSMQ6ESi6ZlUqIz8yDtTF5OUzVw.0", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt("$1\",$SHA3-384", "$1\",$SHA3-384");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $1\",$SHA3-384
         //
         verifyException("org.apache.commons.codec.digest.UnixCrypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Crypt.crypt(byteArray0, "ANWe*nQR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: ANWe*nQR
         //
         verifyException("org.apache.commons.codec.digest.UnixCrypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Crypt.crypt(byteArray0, "$1$BI*/$+N^|A$5h9t");
      assertEquals("$1$BI$Bfelx2hj1vqwqTlsZrDoQ0", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Crypt.crypt(byteArray0, "$5$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $5$
         //
         verifyException("org.apache.commons.codec.digest.Sha2Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt(byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Crypt crypt0 = new Crypt();
  }
}
