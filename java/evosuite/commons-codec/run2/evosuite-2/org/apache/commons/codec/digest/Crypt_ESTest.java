
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
      Crypt.crypt("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789./");
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      Crypt.crypt(byteArray0, "$6$........$MFMagp/iL7o5kbdGVhJw42P0WybCgzsNrmIgXfOvs9hjYROTMpRg/rKaqUHDC2iNSb7MnhbTxLrG7.rd1X.OS.");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt(byteArray0);
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
      Crypt.crypt("$$v_^Pi");
      // Undeclared exception!
      Crypt.crypt("$6$........$laIyrbmdcCsI7iLvBaH7JSCYKdjoE6GyXeC2O..Sm/FD8F6pFNEGZiUDie8AxK9saFbvTZOsvt/IIdWoqj7P8/", "$6$........$laIyrbmdcCsI7iLvBaH7JSCYKdjoE6GyXeC2O..Sm/FD8F6pFNEGZiUDie8AxK9saFbvTZOsvt/IIdWoqj7P8/");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt((String) null, (String) null);
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
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Crypt.crypt(byteArray0, "[#3FHes*lY'oDC!Yl;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: [#3FHes*lY'oDC!Yl;
         //
         verifyException("org.apache.commons.codec.digest.UnixCrypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Crypt.crypt(byteArray0, "$6$........$MFMagp/iL7o5kbdGVhJw42P0WybCgzsNrmIgXfOvs9hjYROTMpRg/rKaqUHDC2iNSb7MnhbTxLrG7.rd1X.OS.");
      assertEquals("$6$........$Zm5TjGQUY5yprXsIee0vIrtuXxQxF8N.i8gMJdouTs9zpu07fm0kdc9N5IezDjqQ9z6Z8hwZXwTDaapsHT9Fg/", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Crypt.crypt(byteArray0, "$1$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $1$
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Crypt.crypt("$1$", "$1$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $1$
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Crypt.crypt("$6$........$laIyrbmdcCsI7iLvBaH7JSCYKdjoE6GyXeC2O..Sm/FD8F6pFNEGZiUDie8AxK9saFbvTZOsvt/IIdWoqj7P8/", "$6$........$laIyrbmdcCsI7iLvBaH7JSCYKdjoE6GyXeC2O..Sm/FD8F6pFNEGZiUDie8AxK9saFbvTZOsvt/IIdWoqj7P8/");
      assertEquals("$6$........$gRZzTzJZXoG2XOFCCycP111DVOZIC3nitkzDK4Y71RojGHGKuHpzIpRiCdQfQpQjhz.2rcRU6UM/ey/xB4PfL.", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Crypt.crypt(byteArray0);
      // Undeclared exception!
      Crypt.crypt("$1$");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Crypt crypt0 = new Crypt();
  }
}
