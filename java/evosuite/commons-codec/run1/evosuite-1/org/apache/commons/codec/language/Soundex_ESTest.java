
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
      Soundex soundex0 = new Soundex("$?j$=A9]Y/:{{Vb&e", true);
      // Undeclared exception!
      try { 
        soundex0.encode((Object) "$?j$=A9]Y/:{{Vb&e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: Y (index=24)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Soundex soundex0 = new Soundex("~k8c00+?z<", false);
      // Undeclared exception!
      try { 
        soundex0.encode((Object) "~k8c00+?z<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: K (index=10)
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
      String string0 = "}l4n`R^`,/I[";
      soundex0.encode("}l4n`R^`,/I[");
      soundex0.US_ENGLISH_GENEALOGY.difference("}l4n`R^`,/I[", "x.$I#@-P?");
      soundex0.encode((Object) "");
      soundex0.US_ENGLISH_SIMPLIFIED.encode((String) null);
      soundex0.difference("}l4n`R^`,/I[", ",.IW");
      soundex0.US_ENGLISH_GENEALOGY.encode((Object) "");
      soundex0.getMaxLength();
      soundex0.encode("`sjr>2y");
      String string1 = "y~:3}-dZ";
      soundex0.US_ENGLISH.setMaxLength((-1));
      soundex0.US_ENGLISH.soundex("O}] Xw BN:aq");
      soundex0.US_ENGLISH.setMaxLength((-1));
      soundex0.encode("}l4n`R^`,/I[");
      try { 
        soundex0.US_ENGLISH_GENEALOGY.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Soundex encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Soundex soundex0 = new Soundex("", true);
      // Undeclared exception!
      try { 
        soundex0.encode("org.apache.commons.codec.EncoderException");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: O (index=14)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Soundex soundex0 = new Soundex("", true);
      // Undeclared exception!
      try { 
        soundex0.difference("O621", "org.apache.commons.codec.EncoderException");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: O (index=14)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.US_ENGLISH_GENEALOGY.soundex(".'1Y9sV)Ap0nm]Fwk");
      assertEquals("Y215", string0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Soundex soundex0 = new Soundex("", true);
      String string0 = soundex0.US_ENGLISH_SIMPLIFIED.soundex("1De");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("D000", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      String string0 = soundex0.soundex(".PhQc/");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("P200", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Soundex soundex0 = new Soundex("");
      String string0 = soundex0.soundex("");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_SIMPLIFIED;
      String string0 = soundex0.soundex((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Soundex soundex0 = new Soundex("");
      String string0 = soundex0.US_ENGLISH_SIMPLIFIED.encode("");
      assertEquals(4, soundex0.getMaxLength());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Soundex soundex0 = new Soundex();
      int int0 = soundex0.difference(".PhQc/", (String) null);
      assertEquals(0, int0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Soundex soundex0 = new Soundex("");
      // Undeclared exception!
      try { 
        soundex0.soundex(".T?mHd2OML.*qjil;c");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: T (index=19)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Soundex soundex0 = new Soundex("@-i{bY");
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[10];
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '-';
      Soundex soundex0 = new Soundex(charArray0);
      assertEquals(4, soundex0.getMaxLength());
  }
}
