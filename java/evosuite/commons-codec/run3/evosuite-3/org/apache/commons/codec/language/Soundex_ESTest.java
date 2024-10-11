
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


package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.language.Soundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Soundex_ESTest extends Soundex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Soundex soundex0 = new Soundex("The character is not mapped: ", false);
      String string0 = soundex0.soundex("_L@StdCc2gB");
      assertEquals("Lot ", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      assertEquals(4, soundex0.getMaxLength());
      
      soundex0.setMaxLength(0);
      int int0 = soundex0.getMaxLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH;
      String string0 = soundex0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.encode("The character is not mapped: ");
      assertEquals("T262", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.US_ENGLISH_GENEALOGY.encode("");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH;
      int int0 = soundex0.difference(";rD6L<", "-r6OpA=`Y~cJ4f-");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Soundex soundex0 = new Soundex("+!T");
      // Undeclared exception!
      try { 
        soundex0.soundex("+D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: D (index=3)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Soundex soundex0 = new Soundex("e.1", true);
      // Undeclared exception!
      try { 
        soundex0.encode((Object) "e.1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: E (index=4)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Soundex soundex0 = new Soundex(")", true);
      // Undeclared exception!
      try { 
        soundex0.difference((String) null, "?oO<1gGPP14,(o;W0x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: O (index=14)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_GENEALOGY;
      String string0 = soundex0.US_ENGLISH_GENEALOGY.soundex("Parameter supplied to Soundex encode is not of type java.lang.String");
      assertEquals("P653", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.soundex("The character is not mapped: ");
      assertEquals("T262", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Soundex soundex0 = new Soundex("e.1", true);
      soundex0.US_ENGLISH.soundex((String) null);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Soundex soundex0 = new Soundex("", true);
      String string0 = soundex0.US_ENGLISH.soundex("?oO<1gGPP14p,(o;W0x");
      assertNotNull(string0);
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("O212", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Soundex soundex0 = new Soundex("-1q-12Y-22455-12623-1-2_2");
      soundex0.difference("org.apache.commons.codec.EncoderException", "01230120022455012623010202");
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Soundex soundex0 = new Soundex("");
      // Undeclared exception!
      try { 
        soundex0.encode("VFM&Rf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: V (index=21)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Soundex soundex0 = new Soundex("");
      Object object0 = soundex0.encode((Object) "");
      assertNotNull(object0);
      assertEquals("", object0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Soundex soundex0 = new Soundex("-1q-12Y-22455-12623-1-2_2");
      try { 
        soundex0.encode((Object) soundex0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Soundex encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[14];
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[2] = '-';
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.soundex("");
      assertEquals(4, soundex0.getMaxLength());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Soundex soundex0 = new Soundex("org.apache.commons.codec.EncoderException", true);
      int int0 = soundex0.getMaxLength();
      assertEquals(4, int0);
  }
}
