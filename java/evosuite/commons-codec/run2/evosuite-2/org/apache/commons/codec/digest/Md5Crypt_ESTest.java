
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
import java.util.regex.PatternSyntaxException;
import org.apache.commons.codec.digest.Md5Crypt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Md5Crypt_ESTest extends Md5Crypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "s:)n?1\"}6&%X$+aq", "");
      assertEquals("s$xmciTOhAXYnXA7weNHCPJ.", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = Md5Crypt.md5Crypt(byteArray0);
      assertEquals("$1$........$Oz0s/Vp/APGSobQIjB72m.", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.B64", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, (String) null, (String) null);
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
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$apr1$........$qQ8bUHV515oqzUbYmzABN/", "$apr1$........$Dx84WbPshYwGywhfygLIB/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$........$qQ8bUHV515oqzUbYmzABN/
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt(byteArray0, (Random) null);
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
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((String) null, "org.apache.commons.codec.digest.B64");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Md5Crypt.md5Crypt(byteArray0, "org.apache.commons.codec.digest.B64", "", (Random) mockRandom0);
      assertEquals("org.apac$EOQR2Ex/V5NQa.GfF/Z9d0", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "ft~?2`<)Y%", "J\"/t0>,k", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: ft~?2`<)Y%
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, (String) null, (String) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "A%-tq37@+_|[vbt", "{#PH,l3", (Random) mockRandom0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 0
         // ^{#PH,l3([\\.\\/a-zA-Z0-9]{1,8}).*
         // ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, "$apr1$3$bIXm0xImbym4JKpM9Dew1.");
      assertEquals("$apr1$3$CA9MXyOZGJ3kh3uiUW9RO.", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt(byteArray0, ">!<J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$>!<J
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Md5Crypt.apr1Crypt(byteArray0);
      assertEquals("$apr1$........$Dx84WbPshYwGywhfygLIB/", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "$1$........$wanY4NAWx9Pl5TISvhpbS.");
      assertEquals("$1$........$UCnJnQnC/w43LYCf.UHh60", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "U-Pi /w;qq[:J*}$", "U-Pi /w;qq[:J*}$");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 41
         // ^U-Pi /w;qq[:J*}\\$([\\.\\/a-zA-Z0-9]{1,8}).*
         //                                          ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (String) null);
      assertEquals("$apr1$........$aYMlbA2tmIiwlPC9gyEco.", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Md5Crypt.apr1Crypt("/$bAU2|;7El_I", "/'|");
      assertEquals("$apr1$/$biu.3K1nLCeLKVYDTxCUM1", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      MockRandom mockRandom0 = new MockRandom((byte)0);
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      assertEquals("$apr1$........$aYMlbA2tmIiwlPC9gyEco.", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Md5Crypt md5Crypt0 = new Md5Crypt();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MockRandom mockRandom0 = new MockRandom((byte)0);
      String string0 = Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
      assertEquals("$1$........$4yQWmUHgh5kt2TMJtG7kH1", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = Md5Crypt.apr1Crypt("FCc");
      assertEquals("$apr1$........$oA.KOhAaqf5/rEZynzKtL0", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
