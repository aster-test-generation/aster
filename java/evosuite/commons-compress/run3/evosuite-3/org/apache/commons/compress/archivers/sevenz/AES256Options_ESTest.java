
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.archivers.sevenz.AES256Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AES256Options_ESTest extends AES256Options_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[2];
      byte[] byteArray1 = new byte[1];
      AES256Options aES256Options0 = null;
      try {
        aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray1, (byte) (-54));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Encryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      SecretKeySpec secretKeySpec0 = AES256Options.newSecretKeySpec(byteArray0);
      assertNotNull(secretKeySpec0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = new byte[16];
      AES256Options aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray0, (byte)64);
      int int0 = aES256Options0.getNumCyclesPower();
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[10];
      byte[] byteArray0 = new byte[16];
      AES256Options aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray0, (byte) (-128));
      int int0 = aES256Options0.getNumCyclesPower();
      assertEquals((-128), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        AES256Options.newSecretKeySpec(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = new byte[3];
      AES256Options aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray0, (-3474));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      AES256Options aES256Options0 = null;
      try {
        aES256Options0 = new AES256Options((char[]) null, byteArray0, byteArray0, (-2420));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[9];
      AES256Options aES256Options0 = new AES256Options(charArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[16];
      AES256Options aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray0, (byte)0);
      byte[] byteArray1 = aES256Options0.getIv();
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[16];
      AES256Options aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray0, (byte)0);
      int int0 = aES256Options0.getNumCyclesPower();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[16];
      AES256Options aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray0, (byte)0);
      Cipher cipher0 = aES256Options0.getCipher();
      assertNotNull(cipher0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[16];
      AES256Options aES256Options0 = new AES256Options(charArray0, byteArray0, byteArray0, (byte)0);
      byte[] byteArray1 = aES256Options0.getSalt();
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AES256Options aES256Options0 = null;
      try {
        aES256Options0 = new AES256Options((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
