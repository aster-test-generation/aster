
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
import java.util.LinkedList;
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
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 1220);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      phoneticEngine0.encode("M};+ch'", languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.isConcat();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 0);
      phoneticEngine0.getMaxPhonemes();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-1802));
      phoneticEngine0.getMaxPhonemes();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode(".f8a5", (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-1039));
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("Gv2XKu7", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1039
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("von");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 2);
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("d'", languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, rules, von.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      // Undeclared exception!
      phoneticEngine0.encode("org.apache.commons.codec.language.bm.Languages$1");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
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
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, (-1802));
      // Undeclared exception!
      try { 
        phoneticEngine0.encode("Cd*`HkM,/6_>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1802
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, (-2544));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      phoneticEngine0.encode("kYnt|kant|kont|tsant|tsont-fYtx|fitS|fits|fitx-ani|oni-lYngQYgi|lYngQagi|lYngQogi|lYnguYgi|lYnguagi|lYnguogi|langQYgi|langQagi|langQogi|languDzi|languYgi|languagi|languaxi|languazi|languingi|languogi|languongi|languoxi|languozi|lanuagi|lanuogi|longQYgi|longQagi|longQogi|longuDzi|longuYgi|longuagi|longuaxi|longuazi|longuingi|longuogi|longuongi|longuoxi|longuozi|lonuagi|lonuogi-from|frum-ti-ani|oni-lYngQYgi|lYngQagi|lYngQogi|lYnguYgi|lYnguagi|lYnguogi|langQYgi|langQagi|langQogi|languDzi|languYgi|languagi|languaxi|languazi|languingi|languogi|languongi|languoxi|languozi|lanuagi|lanuogi|longQYgi|longQagi|longQogi|longuDzi|longuYgi|longuagi|longuaxi|longuazi|longuingi|longuogi|longuongi|longuoxi|longuozi|lonuagi|lonuogi-sint|sit|sont|zit", languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("ash");
      linkedHashSet0.add("von");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 2);
      String string0 = phoneticEngine0.encode("ash", languages_LanguageSet0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals("aS|as|oS|os", string0);
      assertEquals(2, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("ash");
      linkedHashSet0.add("von");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 2);
      String string0 = phoneticEngine0.encode("d'", languages_LanguageSet0);
      assertEquals("()-(|t)", string0);
      assertEquals(2, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("von");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("d'", languages_LanguageSet0);
      linkedList0.add(rule_Phoneme0);
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      linkedList0.add(rule_Phoneme0);
      phoneticEngine_PhonemeBuilder0.apply(rule_PhonemeList0, 2);
      assertEquals(2, rule_PhonemeList0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 2095);
      assertEquals(1, rule_Phoneme0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("", languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.apply(rule_Phoneme0, 2095);
      assertEquals(1, rule_Phoneme0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      String string0 = phoneticEngine_PhonemeBuilder0.makeString();
      assertFalse(linkedHashSet0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      phoneticEngine_PhonemeBuilder0.append("");
      assertFalse(linkedHashSet0.contains(""));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      PhoneticEngine.PhonemeBuilder phoneticEngine_PhonemeBuilder0 = PhoneticEngine.PhonemeBuilder.empty(languages_LanguageSet0);
      Set<Rule.Phoneme> set0 = phoneticEngine_PhonemeBuilder0.getPhonemes();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = phoneticEngine0.encode("del ", languages_LanguageSet0);
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      String string0 = phoneticEngine0.encode("dos 2wkx>4<zz\"nrf9m}rx=", languages_LanguageSet0);
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("(fgststznrfmrgS|fgststznrfmrgs|fgststznrfmrks|fgstznrfmrgS|fgstznrfmrgs|fgstznrfmrks|fgznrfmrgS|fgznrfmrgs|fgznrfmrks|fkststznrfmrgS|fkststznrfmrgs|fkststznrfmrks|fkstznrfmrgS|fkstznrfmrgs|fkstznrfmrks|fkznrfmrgS|fkznrfmrgs|fkznrfmrks|wgznrfmrgS|wgznrfmrgs|wgznrfmrks|wkznrfmrgS|wkznrfmrgs|wkznrfmrks)-(dYsfgststznrfmrgS|dYsfgststznrfmrgs|dYsfgststznrfmrks|dYsfgstznrfmrgS|dYsfgstznrfmrgs|dYsfgstznrfmrks|dYsfgznrfmrgS|dYsfgznrfmrgs|dYsfgznrfmrks|dYsfkststznrfmrgS|dYsfkststznrfmrgs|dYsfkststznrfmrks|dYsfkstznrfmrgS|dYsfkstznrfmrgs|dYsfkstznrfmrks|dYsfkznrfmrgS|dYsfkznrfmrgs|dYsfkznrfmrks|dosfgststznrfmrgS|dosfgststznrfmrgs|dosfgststznrfmrks|dosfgstznrfmrgS|dosfgstznrfmrgs|dosfgstznrfmrks|dosfgznrfmrgS|dosfgznrfmrgs|dosfgznrfmrks|dosfkststznrfmrgS|dosfkststznrfmrgs|dosfkststznrfmrks|dosfkstznrfmrgS|dosfkstznrfmrgs|dosfkstznrfmrks|dosfkznrfmrgS|dosfkznrfmrgs|dosfkznrfmrks|doswgznrfmrgS|doswgznrfmrgs|doswgznrfmrks|doswkznrfmrgS|doswkznrfmrgs|doswkznrfmrks)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false, 2);
      String string0 = phoneticEngine0.encode("d'");
      assertFalse(phoneticEngine0.isConcat());
      assertEquals("()-(|t)", string0);
      assertEquals(2, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      String string0 = phoneticEngine0.encode("Z(R|xTJz:>)>ymF");
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("zrZdzimf|zrZdzinf|zrZdzjmf|zrZdzjnf|zrgzdsimf|zrgzdsinf|zrgzdsjmf|zrgzdsjnf|zrgzdzimf|zrgzdzinf|zrgzdzjmf|zrgzdzjnf|zrkdsimf|zrkdsinf|zrkdsjmf|zrkdsjnf|zrkdzimf|zrkdzinf|zrkdzjmf|zrkdzjnf", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      PhoneticEngine phoneticEngine0 = null;
      try {
        phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ruleType must not be RULES
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true, 0);
      String string0 = phoneticEngine0.encode("/u");
      assertTrue(phoneticEngine0.isConcat());
      assertEquals("", string0);
      assertEquals(0, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      boolean boolean0 = phoneticEngine0.isConcat();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      phoneticEngine0.getRuleType();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      phoneticEngine0.getLang();
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
      assertFalse(phoneticEngine0.isConcat());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, true);
      phoneticEngine0.getNameType();
      assertTrue(phoneticEngine0.isConcat());
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      int int0 = phoneticEngine0.getMaxPhonemes();
      assertFalse(phoneticEngine0.isConcat());
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      PhoneticEngine phoneticEngine0 = new PhoneticEngine(nameType0, ruleType0, false);
      String string0 = phoneticEngine0.encode("Can't fetch any language from the any language set.");
      assertEquals("kYnt|kant|kont|tsant|tsont-fYtx|fitS|fits|fitx-ani|oni-lYngQYgi|lYngQagi|lYngQogi|lYnguYgi|lYnguagi|lYnguogi|langQYgi|langQagi|langQogi|languDzi|languYgi|languagi|languaxi|languazi|languingi|languogi|languongi|languoxi|languozi|lanuagi|lanuogi|longQYgi|longQagi|longQogi|longuDzi|longuYgi|longuagi|longuaxi|longuazi|longuingi|longuogi|longuongi|longuoxi|longuozi|lonuagi|lonuogi-from|frum-ti-ani|oni-lYngQYgi|lYngQagi|lYngQogi|lYnguYgi|lYnguagi|lYnguogi|langQYgi|langQagi|langQogi|languDzi|languYgi|languagi|languaxi|languazi|languingi|languogi|languongi|languoxi|languozi|lanuagi|lanuogi|longQYgi|longQagi|longQogi|longuDzi|longuYgi|longuagi|longuaxi|longuazi|longuingi|longuogi|longuongi|longuoxi|longuozi|lonuagi|lonuogi-sint|sit|sont|zit", string0);
      assertEquals(20, phoneticEngine0.getMaxPhonemes());
  }
}
