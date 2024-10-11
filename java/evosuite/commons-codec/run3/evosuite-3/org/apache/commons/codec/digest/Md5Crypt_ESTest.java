
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
      byte[] byteArray0 = new byte[7];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "$1$........$jCMvcj.jjFp0gAcMWbytS.");
      assertEquals("$1$........$A9oqYCIgrf0otqjEtnsgd1", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
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
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "", "30UFt)+1k:ShH[", (Random) mockRandom0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 5
         // ^30UFt)+1k:ShH[([\\.\\/a-zA-Z0-9]{1,8}).*
         //      ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "cT+Fiu(xyGd(9)E!", "cT+Fiu(xyGd(9)E!");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 42
         // ^cT+Fiu(xyGd(9)E!([\\.\\/a-zA-Z0-9]{1,8}).*
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "org.apache.commons.codec.digest.B64", "OI");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "org.apache.commons.codec.digest.B64", "org.apache.commons.codec.digest.B64");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: org.apache.commons.codec.digest.B64
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt((byte[]) null, "$apr1$Hxz4S} sJBX}{");
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
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.B64", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((byte[]) null, "([./a-zA-Z0-9]{1,8}).*");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt(byteArray0, "+ke/-HOyLxPO");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$+ke/-HOyLxPO
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Md5Crypt.apr1Crypt("A^T7D<oQv", "$1$........$A9oqYCIgrf0otqjEtnsgd1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$$1$........$A9oqYCIgrf0otqjEtnsgd1
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "$apr1$........$7DPFf0mVu8RHaTUUmUaFT.", "", (Random) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: $apr1$........$7DPFf0mVu8RHaTUUmUaFT.
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockRandom mockRandom0 = new MockRandom((byte) (-99));
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
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "GeUhb9XOX|cz\".Z", "", (Random) null);
      assertEquals("GeUhb9XO$mvcldAXP2gV8Uuh4Ni0.1/", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (String) null);
      assertEquals("$apr1$........$aYMlbA2tmIiwlPC9gyEco.", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = Md5Crypt.apr1Crypt(byteArray0, "$apr1$........$P2ln.LmtJNbvGm8lQbdGx0");
      assertEquals("$apr1$........$Ay34HyTjwraC4wp1XfYNy.", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = Md5Crypt.apr1Crypt(byteArray0);
      assertEquals("$apr1$........$qPSnH67sU5.ONzPrASfCP1", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Md5Crypt.md5Crypt(byteArray0, "$1$........$UCnJnQnC/w43LYCf.UHh60", "\"x@ECy2\"Q|");
      assertEquals("\"x@ECy2\"Q|1$/9FgCaJ1gSkWX61sPlwzg/", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Md5Crypt.md5Crypt(byteArray0, "1cu5/Cub<)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid salt value: 1cu5/Cub<)
         //
         verifyException("org.apache.commons.codec.digest.Md5Crypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Md5Crypt.apr1Crypt("$1$........$pERj43rl55vwh34BR1O660", (String) null);
      assertEquals("$apr1$........$pja8BgiB15NiWBUJ2nrln0", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MockRandom mockRandom0 = new MockRandom((byte)0);
      String string0 = Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      assertEquals("$apr1$........$Dx84WbPshYwGywhfygLIB/", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Md5Crypt md5Crypt0 = new Md5Crypt();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = Md5Crypt.apr1Crypt("P");
      assertEquals("$apr1$........$K/JNvCeZ1h5AXb49iFHVd/", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Md5Crypt.md5Crypt(byteArray0);
      MockRandom mockRandom0 = new MockRandom((byte)0);
      Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.md5Crypt(byteArray0);
      Md5Crypt.md5Crypt(byteArray0, "$1$........$UCnJnQnC/w43LYCf.UHh60", "\"x@ECy2\"Q|");
      Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.apr1Crypt("", "kga.F]a%?OTw\"'_");
      Md5Crypt.apr1Crypt(byteArray0, (Random) mockRandom0);
      Md5Crypt.apr1Crypt("P");
      // Undeclared exception!
      Md5Crypt.md5Crypt(byteArray0, (Random) mockRandom0);
  }
}
