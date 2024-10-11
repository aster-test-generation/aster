
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


package org.apache.commons.codec.language.bm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Languages_ESTest extends Languages_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("Can't fetch any language from the any language set.");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = languages_LanguageSet0.getAny();
      assertTrue(linkedHashSet0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.contains("Rsw^C{+K9cU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        languages_LanguageSet0.isEmpty();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Languages languages0 = Languages.getInstance((NameType) null);
      assertNull(languages0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Languages.getInstance((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Languages.getInstance("any");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unable to resolve required resource: any
         //
         verifyException("org.apache.commons.codec.Resources", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("Can't fetch any language from the any language set.");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Languages.LanguageSet languages_LanguageSet1 = languages_LanguageSet0.restrictTo(languages_LanguageSet0);
      linkedHashSet0.add("org.[pache.commons.codec.lanUuage.bm.Languages$1");
      Languages.LanguageSet languages_LanguageSet2 = languages_LanguageSet0.restrictTo(languages_LanguageSet1);
      assertTrue(languages_LanguageSet2.isSingleton());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Languages.LanguageSet languages_LanguageSet1 = Languages.ANY_LANGUAGE;
      Languages.LanguageSet languages_LanguageSet2 = languages_LanguageSet0.restrictTo(languages_LanguageSet1);
      assertSame(languages_LanguageSet0, languages_LanguageSet2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      Languages languages0 = Languages.getInstance(nameType0);
      Set<String> set0 = languages0.getLanguages();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(set0);
      Languages.LanguageSet languages_LanguageSet1 = languages_LanguageSet0.restrictTo(languages0.NO_LANGUAGES);
      assertNotNull(languages_LanguageSet1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Languages.SomeLanguages languages_SomeLanguages0 = (Languages.SomeLanguages)languages_LanguageSet0.restrictTo(languages_LanguageSet0);
      languages_SomeLanguages0.merge(languages_LanguageSet0);
      assertNotSame(languages_SomeLanguages0, languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.SomeLanguages languages_SomeLanguages0 = (Languages.SomeLanguages)Languages.LanguageSet.from(linkedHashSet0);
      Languages.LanguageSet languages_LanguageSet0 = Languages.NO_LANGUAGES;
      Languages.SomeLanguages languages_SomeLanguages1 = (Languages.SomeLanguages)languages_SomeLanguages0.merge(languages_LanguageSet0);
      assertSame(languages_SomeLanguages1, languages_SomeLanguages0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.isSingleton();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      linkedHashSet0.add("K;");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.isSingleton();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("K;");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.contains("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Languages.LanguageSet languages_LanguageSet1 = languages_LanguageSet0.restrictTo(languages_LanguageSet0);
      assertSame(languages_LanguageSet1, languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = Languages.NO_LANGUAGES;
      boolean boolean0 = languages_LanguageSet0.contains("_W");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = Languages.NO_LANGUAGES;
      boolean boolean0 = languages_LanguageSet0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = Languages.NO_LANGUAGES;
      // Undeclared exception!
      try { 
        languages_LanguageSet0.getAny();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // Can't fetch any language from the empty language set.
         //
         verifyException("org.apache.commons.codec.language.bm.Languages$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.isSingleton();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = Languages.ANY_LANGUAGE;
      boolean boolean0 = languages_LanguageSet0.contains("* the License.  You may obtain a copy of the License at*/");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = Languages.ANY_LANGUAGE;
      // Undeclared exception!
      try { 
        languages_LanguageSet0.getAny();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // Can't fetch any language from the any language set.
         //
         verifyException("org.apache.commons.codec.language.bm.Languages$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Languages languages0 = Languages.getInstance("");
      Languages.LanguageSet languages_LanguageSet1 = languages0.ANY_LANGUAGE.restrictTo(languages_LanguageSet0);
      assertSame(languages_LanguageSet1, languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = Languages.ANY_LANGUAGE;
      boolean boolean0 = languages_LanguageSet0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = Languages.ANY_LANGUAGE;
      boolean boolean0 = languages_LanguageSet0.isSingleton();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("L(Nyx1H");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = ((Languages.SomeLanguages) languages_LanguageSet0).toString();
      assertFalse(linkedHashSet0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("Can't fetch any language from the any language set.");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = languages_LanguageSet0.getAny();
      assertTrue(linkedHashSet0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("K;");
      Languages.SomeLanguages languages_SomeLanguages0 = (Languages.SomeLanguages)Languages.LanguageSet.from(linkedHashSet0);
      Set<String> set0 = languages_SomeLanguages0.getLanguages();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      boolean boolean0 = languages_LanguageSet0.contains("");
      assertTrue(boolean0);
  }
}
