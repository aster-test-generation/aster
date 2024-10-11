
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
import java.nio.CharBuffer;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.PhoneticEngine;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PhoneticEngine_ESTest extends PhoneticEngine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RuleType ruleType0 = RuleType.EXACT;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add((String) null);
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      char[] charArray0 = new char[6];
      charArray0[0] = ')';
      charArray0[1] = ':';
      charArray0[2] = 'h';
      charArray0[3] = '(';
      charArray0[4] = '';
      charArray0[5] = '<';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      languages_LanguageSet0.isEmpty();
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme1, 0);
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      phoneticEngine_PhonemeBuilder0.apply(rule_PhonemeList0, 0);
      NameType nameType0 = NameType.GENERIC;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-6408));
      phoneticEngine0.getLang();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      String string0 = "org.apache.commons.codec.Resources";
      String string1 = phoneticEngine0.encode("org.apache.commons.codec.Resources");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      phoneticEngine0.encode("");
      linkedHashSet0.add("org.apache.commons.codec.Resources");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("");
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 63);
      String string2 = "sep";
      String string3 = null;
      linkedHashSet0.add(string1);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Lang", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("Problem prcessin ");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.makeString();
      phoneticEngine_PhonemeBuilder0.getPhonemes();
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      phoneticEngine0.encode(".e~{0,)hV`g$");
      phoneticEngine0.encode("aKH;;]KF8J`h<}/V&");
      phoneticEngine0.isConcat();
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(".e~{0,)hV`g$", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme1, rule_Phoneme1, languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme2, 1);
      assertNotSame(rule_Phoneme1, rule_Phoneme2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 612);
      phoneticEngine0.encode("von akh;;]kf8j`h<}/v&");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      languages_LanguageSet0.isSingleton();
      phoneticEngine0.encode("von akh;;]kf8j`h<}/v&", languages_LanguageSet0);
      phoneticEngine0.getNameType();
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet0);
      languages_LanguageSet1.isSingleton();
      languages_LanguageSet0.restrictTo(languages_LanguageSet1);
      String string0 = "dos org.apache.commons.codec.resources";
      // Undeclared exception!
      phoneticEngine0.encode("dos org.apache.commons.codec.resources", languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("m~p1 }f[VX", languages_LanguageSet0);
      NameType nameType1 = NameType.SEPHARDIC;
      RuleType ruleType1 = RuleType.RULES;
      PhoneticEngine phoneticEngine1 = null;
      try {
        phoneticEngine1 = new PhoneticEngine(nameType1, ruleType1, false, 6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      String string0 = "org.apache.commons.codec.language.bm.Lang$LangRule";
      // Undeclared exception!
      phoneticEngine0.encode("org.apache.commons.codec.language.bm.Lang$LangRule");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      phoneticEngine_PhonemeBuilder0.apply(rule_PhonemeList0, 0);
      String string0 = phoneticEngine0.encode("van s+");
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("()-()", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-1));
      phoneticEngine0.getMaxPhonemes();
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("e:u#MKYT,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      int int0 = 878;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 878);
      String string0 = "dela";
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(878);
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("dela", languages_LanguageSet0);
      Set<String> set0 = null;
      // Undeclared exception!
      try { 
        Languages.LanguageSet.from((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Languages$LanguageSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      int int0 = (-1799);
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-1799));
      String string0 = "d'";
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("56Xk>2|v*+%E +'XP");
      linkedHashSet0.add(" ");
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("d'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1799
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 2);
      String string0 = phoneticEngine0.encode("e^oy");
      assertEquals("iD|iiD|iio|io", string0);
      
      phoneticEngine0.isConcat();
      assertEquals(2, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-1378));
      // Undeclared exception!
      try { 
        phoneticEngine0.encode(";]g T ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1378
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.encode("Lh.");
      LinkedHashSet<String> linkedHashSet0 = null;
      try {
        linkedHashSet0 = new LinkedHashSet<String>((-2696));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -2696
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 7);
      String string0 = "U%Zi5Bku";
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("U%Zi5Bku", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, rules, .
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
      phoneticEngine0.encode("{E(_FIh(e>>0U~?");
      phoneticEngine0.encode("{E(_FIh(e>>0U~?");
      phoneticEngine0.getRuleType();
      phoneticEngine0.isConcat();
      phoneticEngine0.getMaxPhonemes();
      phoneticEngine0.getNameType();
      LinkedHashSet<String> linkedHashSet0 = null;
      try {
        linkedHashSet0 = new LinkedHashSet<String>(1638, 0.0F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal load factor: 0.0
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      phoneticEngine0.encode("");
      Object object0 = new Object();
      linkedHashSet0.remove(object0);
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      languages_LanguageSet0.isEmpty();
      String string0 = phoneticEngine0.encode("k", languages_LanguageSet0);
      assertEquals("", string0);
      
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(20, int0);
      
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("k", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 20);
      phoneticEngine_PhonemeBuilder0.append("");
      languages_LanguageSet0.isSingleton();
      phoneticEngine_PhonemeBuilder0.makeString();
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      boolean boolean0 = phoneticEngine0.isConcat();
      assertFalse(boolean0);
      
      phoneticEngine0.getNameType();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      phoneticEngine0.encode("Unreachable case: ");
      phoneticEngine0.encode("-");
      Languages.LanguageSet languages_LanguageSet0 = null;
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      phoneticEngine_PhonemeBuilder0.append("-");
      PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      phoneticEngine_PhonemeBuilder0.makeString();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("Unreachable case: ", languages_LanguageSet1);
      // Undeclared exception!
      try { 
        phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.isConcat();
      phoneticEngine0.getLang();
      Languages.LanguageSet languages_LanguageSet0 = null;
      PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      char[] charArray0 = new char[6];
      char char0 = 'm';
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("", (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.getPhonemes();
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-941));
      phoneticEngine0.encode("]");
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("wM^b", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -941
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 12);
      phoneticEngine0.getNameType();
      String string0 = null;
      // Undeclared exception!
      try { 
        phoneticEngine0.encode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Lang", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = null;
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      phoneticEngine_PhonemeBuilder0.makeString();
      phoneticEngine_PhonemeBuilder0.makeString();
      phoneticEngine_PhonemeBuilder0.append("");
      phoneticEngine_PhonemeBuilder0.append("");
      phoneticEngine_PhonemeBuilder0.makeString();
      CharSequence charSequence0 = null;
      phoneticEngine_PhonemeBuilder0.append((CharSequence) null);
      NameType nameType0 = NameType.GENERIC;
      phoneticEngine_PhonemeBuilder0.makeString();
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      phoneticEngine0.encode("");
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("", (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("urFgfTo(&g!", (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = null;
      PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.RULES;
      int int0 = 0;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("");
      phoneticEngine0.encode("", languages_LanguageSet0);
      String string0 = null;
      linkedHashSet0.add((String) null);
      String string1 = "";
      linkedHashSet0.add((String) null);
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
  public void test25()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 39);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("", languages_LanguageSet0);
      LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
      phoneticEngine0.encode("QP; ");
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet1);
      phoneticEngine0.encode("", languages_LanguageSet1);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet1);
      phoneticEngine_PhonemeBuilder0.getPhonemes();
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(39, int0);
      
      String string0 = phoneticEngine0.encode("kp");
      assertEquals("kp", string0);
      
      phoneticEngine0.getLang();
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(linkedList0);
      linkedList0.add("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      linkedHashSet0.add("^");
      Object object0 = new Object();
      linkedList0.removeLastOccurrence(object0);
      linkedHashSet0.retainAll(linkedList0);
      phoneticEngine0.encode("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder", languages_LanguageSet0);
      languages_LanguageSet0.isSingleton();
      languages_LanguageSet0.contains("EXACT");
      linkedHashSet0.add("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
      phoneticEngine0.isConcat();
      linkedList0.add("org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder");
      phoneticEngine0.encode("_lB_uSE7", languages_LanguageSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine0.getNameType();
      linkedHashSet0.add("di");
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(20, int0);
      
      phoneticEngine0.getLang();
      phoneticEngine0.getNameType();
      boolean boolean0 = phoneticEngine0.isConcat();
      assertTrue(boolean0);
      
      Languages.LanguageSet languages_LanguageSet1 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = phoneticEngine0.encode("#C1|uFfvc>:R@Yf_lT", languages_LanguageSet1);
      assertEquals("kufkriflt", string0);
      
      phoneticEngine_PhonemeBuilder0.append("#C1|uFfvc>:R@Yf_lT");
      String string1 = phoneticEngine0.encode("", languages_LanguageSet1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      phoneticEngine0.getRuleType();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-779));
      assertEquals((-779), phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Languages.LanguageSet languages_LanguageSet0 = null;
      PhoneticEngine.PhonemeBuilder.empty((Languages.LanguageSet) null);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      Rule.Phoneme rule_Phoneme0 = null;
      // Undeclared exception!
      try { 
        CharBuffer.wrap((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      String string0 = phoneticEngine0.encode("van s+");
      assertEquals("()-()", string0);
      assertTrue(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.encode("da ");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      languages_LanguageSet0.isEmpty();
      languages_LanguageSet0.isEmpty();
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
  public void test32()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      phoneticEngine0.encode("(");
      phoneticEngine0.getLang();
      phoneticEngine0.getMaxPhonemes();
      phoneticEngine0.getLang();
      phoneticEngine0.isConcat();
      phoneticEngine0.getRuleType();
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(20, int0);
      
      String string0 = phoneticEngine0.encode("yg<sZtdZ");
      assertEquals("ikSds", string0);
      
      boolean boolean0 = phoneticEngine0.isConcat();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      String string0 = "org.apache.commons.codec.Resources";
      phoneticEngine0.encode("org.apache.commons.codec.Resources");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      phoneticEngine0.encode("");
      linkedHashSet0.add("org.apache.commons.codec.Resources");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("org.apache.commons.codec.Resources", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, rules, org.apache.commons.codec.Resources.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.makeString();
      linkedHashSet0.add("E%r5D|f|B]B%yXD");
      PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine0.encode("_uUN[\"Nb`rsV5tmc=", languages_LanguageSet0);
      languages_LanguageSet0.contains("");
      String string0 = phoneticEngine0.encode("dela org.apache.commons.codec.resources");
      assertEquals("orgapaSekomonskodekrezurses", string0);
      
      phoneticEngine_PhonemeBuilder0.makeString();
      phoneticEngine0.getNameType();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.encode("K+t,p-z/},$");
      phoneticEngine0.isConcat();
      phoneticEngine0.encode("XO+x16");
      phoneticEngine0.getNameType();
      String string0 = phoneticEngine0.encode("ktp-ds|s|ts");
      assertEquals("ktp-tStS|tSts|tsts|ttS", string0);
      
      phoneticEngine0.getLang();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.contains("IwB{A<8jVkA6");
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      assertTrue(languages_LanguageSet0.isSingleton());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("", languages_LanguageSet0);
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      
      String string0 = phoneticEngine0.encode("Rule");
      assertEquals("", string0);
      assertFalse(phoneticEngine0.isConcat());
  }
}
