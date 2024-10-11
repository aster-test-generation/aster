
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
      Soundex soundex0 = new Soundex("The character is not mapped: ");
      String string0 = soundex0.encode("OWC*<uO^E");
      assertEquals("Oe i", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Soundex soundex0 = new Soundex("SLTgEmgs^7wD,");
      // Undeclared exception!
      try { 
        soundex0.encode((Object) "org.apache.commons.codec.language.Soundex");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: O (index=14)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      assertEquals(4, soundex0.getMaxLength());
      
      soundex0.setMaxLength(0);
      int int0 = soundex0.getMaxLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_SIMPLIFIED;
      soundex0.setMaxLength((-611));
      int int0 = soundex0.getMaxLength();
      assertEquals((-611), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[0];
      Soundex soundex0 = new Soundex(charArray0);
      String string0 = soundex0.US_ENGLISH_GENEALOGY.encode((String) null);
      assertNull(string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_SIMPLIFIED;
      String string0 = soundex0.US_ENGLISH.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      int int0 = soundex0.difference("g7BE", "GIfeJFQZ0p>nu$");
      assertEquals(2, int0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Soundex soundex0 = new Soundex("@|FWr", true);
      // Undeclared exception!
      try { 
        soundex0.soundex("Jt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: J (index=9)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      Soundex soundex0 = new Soundex(charArray0);
      // Undeclared exception!
      try { 
        soundex0.encode("D3'5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: D (index=3)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Soundex soundex0 = new Soundex("Hxw{.zMZ%", true);
      // Undeclared exception!
      try { 
        soundex0.difference("Hxw{.zMZ%", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: X (index=23)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Soundex soundex0 = null;
      try {
        soundex0 = new Soundex((String) null, true);
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
  public void test13()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_SIMPLIFIED;
      String string0 = soundex0.US_ENGLISH_GENEALOGY.soundex("7EcMu+uL|s");
      assertEquals("E254", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Soundex soundex0 = new Soundex("Hxw{.zMZ%", true);
      String string0 = soundex0.US_ENGLISH.soundex("Hxw{.zMZ%");
      assertEquals("H252", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[7];
      Soundex soundex0 = new Soundex(charArray0);
      String string0 = soundex0.soundex("");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[7];
      Soundex soundex0 = new Soundex(charArray0);
      String string0 = soundex0.US_ENGLISH_SIMPLIFIED.soundex(",gvmMYXd.?+>ThmX4");
      assertEquals("G152", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[7];
      Soundex soundex0 = new Soundex(charArray0);
      soundex0.US_ENGLISH_GENEALOGY.soundex((String) null);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[7];
      Soundex soundex0 = new Soundex(charArray0);
      Object object0 = soundex0.US_ENGLISH_GENEALOGY.encode((Object) "");
      assertEquals(4, soundex0.getMaxLength());
      assertNotNull(object0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Soundex soundex0 = new Soundex("org.apache.commons.codec.language.SoundexUtils");
      Object object0 = new Object();
      try { 
        soundex0.encode(object0);
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
      Soundex soundex0 = new Soundex("-123-12--22455-12623-1-2-2");
      soundex0.difference("", "X,lUx");
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[0];
      Soundex soundex0 = new Soundex(charArray0);
      String string0 = soundex0.US_ENGLISH.soundex("The character is not mapped: ");
      assertEquals("T262", string0);
      assertNotNull(string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[6] = '-';
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      int int0 = soundex0.getMaxLength();
      assertEquals(4, int0);
  }
}
