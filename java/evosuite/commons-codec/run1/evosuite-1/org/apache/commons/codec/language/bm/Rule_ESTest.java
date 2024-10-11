
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
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Rule_ESTest extends Rule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1005);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = new Rule("P>*$e2JO]+Ltuf5", "P>*$e2JO]+Ltuf5", (String) null, rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches(charBuffer0, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList((List<Rule.Phoneme>) null);
      Rule rule0 = new Rule("", "t", "common$$", rule_PhonemeList0);
      rule0.patternAndContextMatches("t", 0);
      assertEquals("", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("[elfZW>]", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme1, languages_LanguageSet0);
      assertEquals(1, rule_Phoneme2.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("//", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme1);
      assertFalse(rule_Phoneme2.equals((Object)rule_Phoneme1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1005);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      int int0 = rule_Phoneme0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rule rule0 = new Rule("org.apache.commons.codec.language.bm.Rule$2", "6{X25D(Ah=@4Bz|HCy", "org.apache.commons.codec.language.bm.Rule$PhonemeList", (Rule.PhonemeExpr) null);
      rule0.getPhoneme();
      assertEquals("org.apache.commons.codec.language.bm.Rule$2", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("gl,iLUpPa2zn^", languages_LanguageSet0);
      Rule rule0 = new Rule((String) null, "^^*/", "fo,LLP\"~QD(3C &e=`", rule_Phoneme0);
      String string0 = rule0.getPattern();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList((List<Rule.Phoneme>) null);
      Rule rule0 = new Rule("", "xb]", "xb]", rule_PhonemeList0);
      String string0 = rule0.getPattern();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      List<Rule> list0 = Rule.getInstance(nameType0, ruleType0, "common");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      Rule rule0 = new Rule((String) null, "org.apache.commons.codec.language.bm.RuleType", (String) null, rule_PhonemeList0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches("org.apache.commons.codec.language.bm.RuleType", 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.EXACT;
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, (Languages.LanguageSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      linkedHashSet0.add("ALL");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for ash, rules, ALL.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, "^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, approx, ^.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      linkedHashSet0.add("^t$");
      linkedHashSet0.add("ALL");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Map<String, List<Rule>> map0 = Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
      assertEquals(56, map0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.RULES;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("+LP}W4=U%J?B9s@{+\"");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for sep, rules, +LP}W4=U%J?B9s@{+\".
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      Rule rule0 = new Rule("^$$", "^$$", "^$$", rule_PhonemeList0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches("^$$", (-209));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Can not match pattern at negative indexes
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = new Rule("t", "t", "t", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("t", 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("[elfZW>]", languages_LanguageSet0);
      Rule rule0 = new Rule("[elfZW>]", "[elfZW>]", "[elfZW>]", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("[elfZW>]", 1805);
      assertEquals("[elfZW>]", rule0.getPattern());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList((List<Rule.Phoneme>) null);
      Rule rule0 = null;
      try {
        rule0 = new Rule((String) null, "v", "[elfZW>", rule_PhonemeList0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 7
         // ^[elfZW>
         //        ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule rule0 = new Rule("(", "", "ALL", rule_Phoneme0);
      assertEquals("(", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("EHR~@Ac/{u3'Ez6FCm", languages_LanguageSet0);
      Rule rule0 = new Rule("EHR~@Ac/{u3'Ez6FCm", "^", "$VALUES", rule_Phoneme0);
      assertEquals("EHR~@Ac/{u3'Ez6FCm", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.RULES;
      List<Rule> list0 = Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      List<Rule.Phoneme> list0 = rule_PhonemeList0.getPhonemes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      int int0 = rule_PhonemeList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ex[az>Jb ", languages_LanguageSet0);
      Rule rule0 = null;
      try {
        rule0 = new Rule("~L\"iI3j`", "ex[az>Jb ", "~L\"iI3j`", rule_Phoneme0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 9
         // ex[az>Jb $
         //          ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.append("RULES$$");
      assertEquals(1, rule_Phoneme1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("org.apache.commons.codec.Resources", languages_LanguageSet0);
      CharSequence charSequence0 = rule_Phoneme0.getPhonemeText();
      assertEquals("org.apache.commons.codec.Resources", charSequence0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("\"^\"\"", languages_LanguageSet0);
      int int0 = rule_Phoneme0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("\"^\"\"", languages_LanguageSet0);
      String string0 = rule_Phoneme0.toString();
      assertEquals("\"^\"\"[NO_LANGUAGES]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("\"^\"\"", languages_LanguageSet0);
      Languages.LanguageSet languages_LanguageSet1 = rule_Phoneme0.getLanguages();
      assertSame(languages_LanguageSet0, languages_LanguageSet1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.mergeWithLanguage(languages_LanguageSet0);
      assertFalse(rule_Phoneme1.equals((Object)rule_Phoneme0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("04ndam;N", languages_LanguageSet0);
      Rule rule0 = new Rule("04ndam;N", "04ndam;N", "04ndam;N", rule_Phoneme0);
      rule0.getPhoneme();
      assertEquals("04ndam;N", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = new Rule("t", "t", "ZI;)eV4xwe&@o<dL", rule_Phoneme0);
      String string0 = rule0.getPattern();
      assertEquals("t", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = new Rule("t", "t", "ZI;)eV4xwe&@o<dL", rule_Phoneme0);
      rule0.getLContext();
      assertEquals("t", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("\"^\"\"", languages_LanguageSet0);
      Rule rule0 = new Rule("\"^\"\"", "\"^\"\"", "rules", rule_Phoneme0);
      rule0.getRContext();
      assertEquals("\"^\"\"", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, "ALL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for sep, exact, ALL.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }
}
