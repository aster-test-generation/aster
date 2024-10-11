
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
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.language.ColognePhonetic;
import org.apache.commons.codec.language.DoubleMetaphone;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.codec.language.SoundexUtils;
import org.apache.commons.codec.net.URLCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SoundexUtils_ESTest extends SoundexUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = SoundexUtils.isEmpty("PXBSCM");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      int int0 = SoundexUtils.difference(colognePhonetic0, "NO5piXi-QB", "NO5piXi-QB");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = SoundexUtils.clean((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = SoundexUtils.clean(";F-tVYe5/kM(5d");
      assertEquals("FTVYEKMD", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = SoundexUtils.clean("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("");
      try { 
        SoundexUtils.difference(uRLCodec0, "", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SoundexUtils.difference((StringEncoder) null, "@V.\"l`j)IL`o/|@B7", "xB;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.SoundexUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen((-1));
      // Undeclared exception!
      try { 
        SoundexUtils.difference(doubleMetaphone0, "EP", "@h`w-i2\u00019");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Soundex soundex0 = new Soundex("@)xnh{L$W-1S#-h+", false);
      // Undeclared exception!
      try { 
        SoundexUtils.difference(soundex0, "HG>?v]7", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The character is not mapped: V (index=21)
         //
         verifyException("org.apache.commons.codec.language.Soundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = SoundexUtils.isEmpty((CharSequence) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("AaEeIivoUuAaEeIiOoUuSyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu", "GNED");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded("C", (String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = SoundexUtils.differenceEncoded((String) null, (String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_GENEALOGY;
      int int0 = SoundexUtils.difference(soundex0, "", "01230120022455012623010202");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Soundex soundex0 = Soundex.US_ENGLISH_GENEALOGY;
      int int0 = SoundexUtils.difference(soundex0, "01230120022455012623010202", "AaEeIivoUuAaEeIiOoUuSyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SoundexUtils soundexUtils0 = new SoundexUtils();
  }
}
