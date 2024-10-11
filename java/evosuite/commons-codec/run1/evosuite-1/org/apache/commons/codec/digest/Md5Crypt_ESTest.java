
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
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, (Random) mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      MockRandom mockRandom0 = new MockRandom(1L);
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$1$........$FfFpeChhT3p3Yh8WeWn/20", "K[7[;m", (Random) mockRandom0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 30
         // ^K[7[;m([\\.\\/a-zA-Z0-9]{1,8}).*
         //                               ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "", "cu*/*~U*d4I", (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, " rhWPl)%*W^", " rhWPl)%*W^");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 7
         // ^ rhWPl)%*W^([\\.\\/a-zA-Z0-9]{1,8}).*
         //        ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "8*}H?8b*'${Zfx", "}zh_I!T~!ZC9Uz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 8*}H?8b*'${Zfx
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "(P[y>}O;u1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null, (Random) mockRandom0);
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
        Md5Crypt.apr1Crypt((byte[]) null, "7!_Ly51+{s2");
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
        Md5Crypt.apr1Crypt((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((String) null, "");
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockRandom mockRandom0 = new MockRandom();
      String string0 = Md5Crypt.md5Crypt(byteArray0, "B!]i4", "", (Random) mockRandom0);
      assertEquals("B$EPXAWbcdarec2BsEbdsJH/", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      MockRandom mockRandom0 = new MockRandom((byte) (-13));
      String string0 = Md5Crypt.md5Crypt(byteArray0, (String) null, "n'Q37K", (Random) mockRandom0);
      assertEquals("n'Q37K........$XtOX/PB1x21lp/sHtFr2Q1", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "", "", (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, "$apr1$........$9CBLNv4Sbe9./NC4sYUux1");
      assertEquals("$apr1$........$7DPFf0mVu8RHaTUUmUaFT.", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt(byteArray0, "$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$$
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = Md5Crypt.apr1Crypt(byteArray0);
      assertEquals("$apr1$........$qPSnH67sU5.ONzPrASfCP1", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "68O1qO@<F r", "");
      assertEquals("68O1qO$bCsPjcPPpoJWCpwfDx33l.", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: ./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (String) null);
      assertEquals("$apr1$........$nuDztZ0kUaJLRq4o5A0EQ/", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Md5Crypt.apr1Crypt("j|8,b/EvaP~WG\"$.P", "j|8,b/EvaP~WG\"$.P");
      Md5Crypt.apr1Crypt("/C)Hd$.si^b\u0002!");
      byte[] byteArray0 = new byte[7];
      Md5Crypt.apr1Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom(1L);
      Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.apr1Crypt(byteArray0);
      Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.md5Crypt(byteArray0, "$1$////////$9X8QMwLTXiIbv9F4xzIS/.");
      Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.md5Crypt(byteArray0, "$1$////////$9X8QMwLTXiIbv9F4xzIS/.");
      // Undeclared exception!
      Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Md5Crypt md5Crypt0 = new Md5Crypt();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = Md5Crypt.md5Crypt(byteArray0);
      assertEquals("$1$........$Oz0s/Vp/APGSobQIjB72m.", string0);
  }
}
