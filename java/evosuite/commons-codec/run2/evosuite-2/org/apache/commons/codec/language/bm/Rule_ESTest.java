
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
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("*", (Languages.LanguageSet) null);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0, (Languages.LanguageSet) null);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme1, rule_Phoneme0);
      assertFalse(rule_Phoneme2.equals((Object)rule_Phoneme0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      int int0 = rule_PhonemeList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      int int0 = rule_Phoneme0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rule rule0 = new Rule("org.apache.commons.codec.Resources", "{<Z=Wsn(W", "ash", (Rule.PhonemeExpr) null);
      rule0.getPhoneme();
      assertEquals("org.apache.commons.codec.Resources", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      Rule rule0 = new Rule((String) null, ".XEc", ".XEc", rule_PhonemeList0);
      String string0 = rule0.getPattern();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      Rule rule0 = new Rule("", "", ")2iV9M1Q9gN-C/p", rule_PhonemeList0);
      String string0 = rule0.getPattern();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.RULES;
      List<Rule> list0 = Rule.getInstance(nameType0, ruleType0, "any");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("(u", languages_LanguageSet0);
      Rule rule0 = new Rule((String) null, "V~p\"/-T#DSX", "(u", rule_Phoneme0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches("V~p\"/-T#DSX", 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
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
  public void test09()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, (RuleType) null, "EXACT");
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
  public void test11()  throws Throwable  {
      NameType nameType0 = NameType.SEPHARDIC;
      RuleType ruleType0 = RuleType.EXACT;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("u\"\"");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for sep, exact, u\"\".
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, "+R,4;AMRQZd[:Nz {^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for ash, approx, +R,4;AMRQZd[:Nz {^.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      Map<String, List<Rule>> map0 = Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NameType nameType0 = NameType.ASHKENAZI;
      RuleType ruleType0 = RuleType.APPROX;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("Wa{~iq");
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      // Undeclared exception!
      try { 
        Rule.getInstanceMap(nameType0, ruleType0, languages_LanguageSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for ash, approx, Wa{~iq.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rule rule0 = new Rule("`iFOaZL(8iG!}f)", "", "", (Rule.PhonemeExpr) null);
      boolean boolean0 = rule0.patternAndContextMatches("`iFOaZL(8iG!}f)", 0);
      assertEquals("`iFOaZL(8iG!}f)", rule0.getPattern());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      Rule rule0 = new Rule("bQh].& ", "bQh].& ", "K NlZiW%sKLg", rule_PhonemeList0);
      boolean boolean0 = rule0.patternAndContextMatches("K NlZiW%sKLg", 1775);
      assertEquals("bQh].& ", rule0.getPattern());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = new Rule("\")1\"?H$$", (String) null, "^\"v$", rule_Phoneme0);
      // Undeclared exception!
      try { 
        rule0.patternAndContextMatches("\")1\"?H$$", (-1633));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Can not match pattern at negative indexes
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Rule rule0 = new Rule("`iFOaZL(8iG!}f)", "IX", (String) null, (Rule.PhonemeExpr) null);
      boolean boolean0 = rule0.patternAndContextMatches("`iFOaZL(8iG!}f)", 0);
      assertFalse(boolean0);
      assertEquals("`iFOaZL(8iG!}f)", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Rule rule0 = new Rule("[+]", "[+]", "[+]", (Rule.PhonemeExpr) null);
      assertEquals("[+]", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("[", languages_LanguageSet0);
      Rule rule0 = null;
      try {
        rule0 = new Rule("[", "[", "[", rule_Phoneme0);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 1
         // [$
         //  ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("^", languages_LanguageSet0);
      Rule rule0 = new Rule("org.apache.commons.codec.language.bm.Languages", "^", "org.apache.commons.codec.language.bm.Languages", rule_Phoneme0);
      assertEquals("org.apache.commons.codec.language.bm.Languages", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule rule0 = new Rule("\"v\" \"\" \"", "^QsEOo6v\"<R@)Qs$", "^QsEOo6v\"<R@)Qs$", rule_Phoneme0);
      boolean boolean0 = rule0.patternAndContextMatches("^QsEOo6v\"<R@)Qs$", 1);
      assertFalse(boolean0);
      assertEquals("\"v\" \"\" \"", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Rule.Phoneme> linkedList0 = new LinkedList<Rule.Phoneme>();
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList(linkedList0);
      List<Rule.Phoneme> list0 = rule_PhonemeList0.getPhonemes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Rule.PhonemeList rule_PhonemeList0 = new Rule.PhonemeList((List<Rule.Phoneme>) null);
      // Undeclared exception!
      try { 
        rule_PhonemeList0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule$PhonemeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ALL");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.append("ALL");
      assertSame(rule_Phoneme1, rule_Phoneme0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", (Languages.LanguageSet) null);
      CharSequence charSequence0 = rule_Phoneme0.getPhonemeText();
      assertEquals("ALL", charSequence0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ALL");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme2 = new Rule.Phoneme(rule_Phoneme0, rule_Phoneme1, (Languages.LanguageSet) null);
      assertFalse(rule_Phoneme2.equals((Object)rule_Phoneme0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ALL");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      int int0 = rule_Phoneme0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(">&", languages_LanguageSet0);
      String string0 = rule_Phoneme0.toString();
      assertEquals(">&[NO_LANGUAGES]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ALL");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Languages.LanguageSet languages_LanguageSet1 = rule_Phoneme0.getLanguages();
      assertSame(languages_LanguageSet1, languages_LanguageSet0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ALL");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(charBuffer0, languages_LanguageSet0);
      Rule.Phoneme rule_Phoneme1 = rule_Phoneme0.mergeWithLanguage(languages_LanguageSet0);
      assertNotSame(rule_Phoneme0, rule_Phoneme1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      // Undeclared exception!
      try { 
        Rule.getInstance(nameType0, ruleType0, "/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rules found for gen, approx, /.
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme("ALL", (Languages.LanguageSet) null);
      Rule rule0 = new Rule("/*\"t\" \"\" \"\" \"t\"", "/*\"t\" \"\" \"\" \"t\"", "ALLALL[null]", rule_Phoneme0);
      rule0.getPhoneme();
      assertEquals("/*\"t\" \"\" \"\" \"t\"", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Rule rule0 = new Rule("`iFOaZL(8iG!}f)", "IX", (String) null, (Rule.PhonemeExpr) null);
      String string0 = rule0.getPattern();
      assertNotNull(string0);
      assertEquals("`iFOaZL(8iG!}f)", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(">&", languages_LanguageSet0);
      Rule rule0 = new Rule(">&", ">&", ">&", rule_Phoneme0);
      rule0.getLContext();
      assertEquals(">&", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      Rule.Phoneme rule_Phoneme0 = new Rule.Phoneme(">&", languages_LanguageSet0);
      Rule rule0 = new Rule(">&", ">&", ">&", rule_Phoneme0);
      rule0.getRContext();
      assertEquals(">&", rule0.getPattern());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Languages.LanguageSet languages_LanguageSet0 = Languages.LanguageSet.from(linkedHashSet0);
      NameType nameType0 = NameType.GENERIC;
      RuleType ruleType0 = RuleType.APPROX;
      List<Rule> list0 = Rule.getInstance(nameType0, ruleType0, languages_LanguageSet0);
      assertEquals(85, list0.size());
  }
}
