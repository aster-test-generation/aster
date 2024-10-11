
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
import org.apache.commons.codec.language.bm.BeiderMorseEncoder;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.RuleType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BeiderMorseEncoder_ESTest extends BeiderMorseEncoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.setConcat(false);
      boolean boolean0 = beiderMorseEncoder0.isConcat();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.setRuleType((RuleType) null);
      beiderMorseEncoder0.getRuleType();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.setNameType((NameType) null);
      beiderMorseEncoder0.getNameType();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      String string0 = beiderMorseEncoder0.encode("0:");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      RuleType ruleType0 = RuleType.RULES;
      // Undeclared exception!
      try { 
        beiderMorseEncoder0.setRuleType(ruleType0);
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
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      NameType nameType0 = NameType.ASHKENAZI;
      beiderMorseEncoder0.setNameType(nameType0);
      // Undeclared exception!
      beiderMorseEncoder0.encode("org.apache.commons.codec.language.bm.BeiderMorseEncoder");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.setRuleType((RuleType) null);
      // Undeclared exception!
      try { 
        beiderMorseEncoder0.encode("APPROX");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.Rule", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.setMaxPhonemes((-1));
      // Undeclared exception!
      try { 
        beiderMorseEncoder0.encode(".1GJ^v|,=d+.U:x");
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
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      // Undeclared exception!
      beiderMorseEncoder0.encode((Object) "isasasooso|isasasoosoS|isasasoosos|isasasoosus|isasasousos|isasasousus|isasosooso|isasosoosoS|isasosoosos|isasosoosus|isasosousos|isasosousus|isosasooso|isosasoosoS|isosasoosos|isosasoosus|isosasousos|isosasousus|isososooso|isososoosoS|isososoosos|isososoosus|isososousos|isososousus");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.setNameType((NameType) null);
      // Undeclared exception!
      try { 
        beiderMorseEncoder0.encode((Object) "gi|i|xi|zi");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.bm.PhoneticEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      beiderMorseEncoder0.setMaxPhonemes((-1518));
      // Undeclared exception!
      try { 
        beiderMorseEncoder0.encode((Object) "trYsks|trYtsgS|trYtsgs|trYtsks|trYzgS|trYzgs|troS|trodsks|trodzgS|trodzgs|trok|troks|tros|trosS|trosgS|trosgs|trosk|trosks|tross|trotsgS|trotsgs|trotsks|trozg|trozgS|trozgs|trusks|truzgS|truzgs");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1518
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      String string0 = beiderMorseEncoder0.encode(".Ge+@");
      assertEquals("gi|i|ii|xi|zi", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      String string0 = beiderMorseEncoder0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      Object object0 = beiderMorseEncoder0.encode((Object) "APPR)X");
      assertEquals("YprgS|Yprgs|Yprks|aprg|aprgS|aprgs|aprk|aprks|aprz|oprg|oprgS|oprgs|oprk|oprks|oprz", object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      NameType nameType0 = beiderMorseEncoder0.getNameType();
      assertEquals("gen", nameType0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      boolean boolean0 = beiderMorseEncoder0.isConcat();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BeiderMorseEncoder beiderMorseEncoder0 = new BeiderMorseEncoder();
      RuleType ruleType0 = beiderMorseEncoder0.getRuleType();
      try { 
        beiderMorseEncoder0.encode((Object) ruleType0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // BeiderMorseEncoder encode parameter is not of type String
         //
         verifyException("org.apache.commons.codec.language.bm.BeiderMorseEncoder", e);
      }
  }
}
