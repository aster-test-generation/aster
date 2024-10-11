
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
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      String string0 = phoneticEngine0.encode("YO6).'~8/N");
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals("n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      boolean boolean0 = phoneticEngine0.isConcat();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(0, int0);
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-1484));
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertFalse(phoneticEngine0.isConcat());
      assertEquals((-1484), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("gvlftzmis|gvlvdzmis|gvlvzmiS|gvlvzmis|gwlvzmis");
      // Undeclared exception!
      phoneticEngine0.encode("gvlfdzmisgvlvdzmisgvlvdzmisgvlvzmisgvlvzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlftzmisgvlftzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlftzmisgvlvdzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlftzmisgvlvzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlvdzmisgvlftzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlvdzmisgvlvdzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlvdzmisgvlvzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlvzmisgvlftzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlvzmisgvlvdzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlvzmisgvlvzmiS|gvlfdzmisgvlvdzmisgvlvzmisgvlvzmisgvlvzmis|gvlfdzmisgvlvdzmisgvlvzmisgvlvzmisgwlvzmis|gvlftzmisgvlvdzmisgvlvzmisgvlvzmisgvlvzmis|gvlftzmisgvlvdzmisgvlvzmisgvlvzmisgwlvzmis", languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("", (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-1452));
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("cdn", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1452
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("()-(dl)");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("8*;{2;'&u1+pA.", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, rules, ()-(dl).
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 1752);
      // Undeclared exception!
      phoneticEngine0.encode("org.apache.commons.codec.language.bm.RuleType");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
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
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-3082));
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("nr]Q5]Gy990zK)~Y]@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -3082
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 1752);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("org.apache.commons.codec.language.bm.RuleType", languages_LanguageSet0);
      assertEquals(1752, phoneticEngine0.getMaxPhonemes());
      assertTrue(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 1422);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = phoneticEngine0.encode("des tf", languages_LanguageSet0);
      assertEquals("(tf)-(deStf|destf)", string0);
      assertEquals(1422, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("()-(dl)");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("()-(dl)", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 14);
      assertEquals(1, rule_Phoneme0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("de", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 14);
      assertEquals(1, rule_Phoneme0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.append("");
      assertFalse(linkedHashSet0.contains(""));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = phoneticEngine0.encode("' in ", languages_LanguageSet0);
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 4);
      String string0 = phoneticEngine0.encode("du ", languages_LanguageSet0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(4, phoneticEngine0.getMaxPhonemes());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 1305);
      String string0 = phoneticEngine0.encode("d'");
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("()-(|t)", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      
      String string0 = phoneticEngine0.encode("dela to");
      assertEquals("(to)-(delato)", string0);
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 2278);
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
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      String string0 = phoneticEngine0.encode("lp");
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 4);
      boolean boolean0 = phoneticEngine0.isConcat();
      assertFalse(boolean0);
      assertEquals(4, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 593);
      phoneticEngine0.getRuleType();
      assertEquals(593, phoneticEngine0.getMaxPhonemes());
      assertTrue(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 593);
      phoneticEngine0.getLang();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(593, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 593);
      phoneticEngine0.getNameType();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(593, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertEquals(20, int0);
      assertTrue(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      String string0 = phoneticEngine_PhonemeBuilder0.makeString();
      assertFalse(linkedHashSet0.contains(string0));
  }
}
