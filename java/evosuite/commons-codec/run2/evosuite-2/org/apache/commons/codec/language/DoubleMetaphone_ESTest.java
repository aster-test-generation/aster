
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
import org.apache.commons.codec.language.DoubleMetaphone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DoubleMetaphone_ESTest extends DoubleMetaphone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("wZ_\"lF_", "", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("TH", false);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      Object object0 = doubleMetaphone0.encode((Object) "B&<(s5ij");
      assertNotNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("PSJ", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      char char0 = doubleMetaphone0.charAt("ID7#FbyCM}HOecm", 304);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(0);
      assertEquals(0, doubleMetaphone0.getMaxCodeLen());
      
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals(0, doubleMetaphone0.getMaxCodeLen());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen((-3856));
      assertEquals((-3856), doubleMetaphone0.getMaxCodeLen());
      
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals((-3856), doubleMetaphone0.getMaxCodeLen());
      assertEquals((-3856), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.encode("");
      assertNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(0);
      assertEquals(0, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.encode("SN");
      assertNotNull(string0);
      assertEquals(0, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      Object object0 = doubleMetaphone0.encode((Object) "");
      assertNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(0);
      assertEquals(0, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("0@w?aX", false);
      assertNotNull(string0);
      assertEquals(0, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("");
      assertNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("10|e<2?");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      boolean boolean0 = DoubleMetaphone.contains("", 0, 0, stringArray0);
      assertEquals(2, stringArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      boolean boolean0 = DoubleMetaphone.contains(">W-", 1, 0, stringArray0);
      assertEquals(1, stringArray0.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      char char0 = doubleMetaphone0.charAt("Z|t+nkz", 0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals('Z', char0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen((-1145));
      assertEquals((-1145), doubleMetaphone0.getMaxCodeLen());
      
      // Undeclared exception!
      try { 
        doubleMetaphone0.isDoubleMetaphoneEqual("EM", "EM", false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen((-555));
      assertEquals((-555), doubleMetaphone0.getMaxCodeLen());
      
      // Undeclared exception!
      try { 
        doubleMetaphone0.isDoubleMetaphoneEqual("K%w<OJM_>P", "R");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen((-2423));
      assertEquals((-2423), doubleMetaphone0.getMaxCodeLen());
      
      // Undeclared exception!
      try { 
        doubleMetaphone0.encode("EM");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen((-1074));
      assertEquals((-1074), doubleMetaphone0.getMaxCodeLen());
      
      // Undeclared exception!
      try { 
        doubleMetaphone0.encode((Object) "_bAnu1<$-");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen((-2295));
      assertEquals((-2295), doubleMetaphone0.getMaxCodeLen());
      
      // Undeclared exception!
      try { 
        doubleMetaphone0.doubleMetaphone("HOLM", false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen((-1426));
      assertEquals((-1426), doubleMetaphone0.getMaxCodeLen());
      
      // Undeclared exception!
      try { 
        doubleMetaphone0.doubleMetaphone("kVyX");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        DoubleMetaphone.contains("LMPJ", 450, (-618), stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        DoubleMetaphone.contains((String) null, 5517, 3, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.DoubleMetaphone", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      // Undeclared exception!
      try { 
        doubleMetaphone0.charAt((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.DoubleMetaphone", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("GV9<r'~", true);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("KFR", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("PNHUAIOQE&~2.TCZJY", true);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("NKTX", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("", true);
      assertNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(1);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(68);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary("3LuI}%B$");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("3LuI}%B$", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary('&');
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate("fu>}<*x");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(68);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate("org.apache.commons.codec.EncoderException");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("org.apache.commons.codec.EncoderException", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(68);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate('&');
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("&", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      
      doubleMetaphone_DoubleMetaphoneResult0.appendAlternate('k');
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      int int0 = doubleMetaphone0.getMaxCodeLen();
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(68);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      
      String string0 = doubleMetaphone_DoubleMetaphoneResult0.getPrimary();
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      
      doubleMetaphone_DoubleMetaphoneResult0.append('f');
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(2503);
      assertNotNull(doubleMetaphone_DoubleMetaphoneResult0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      
      String string0 = doubleMetaphone_DoubleMetaphoneResult0.getAlternate();
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      doubleMetaphone0.setMaxCodeLen(660);
      assertEquals(660, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("c[_R<r89jm_lX");
      assertNotNull(string0);
      assertEquals(660, doubleMetaphone0.getMaxCodeLen());
      assertEquals("KRRMLKS", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.encode("XFd)t7u|");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SFTT", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("b*u*LM", "OWSKI");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("(pp!ZE$4'iW", "huAiOqe&~2.tCZjy");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("wh+72m*+*-lyNxYu");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AMLN", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("w&nxW");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("NKS", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("WITZ", (String) null, false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.encode("i4TT?NznzWc[IJ8pU");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("ATNS", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("A$'KJ0W", "tWThL");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("TIA", "TIA");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      Object object0 = doubleMetaphone0.encode((Object) "SSPK");
      assertNotNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SPK", object0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("SC", "SC", true);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("SN");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SN", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("SIAN", false);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("SN", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("SH");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("PgBZ*/F>pL K:.?$ 8", "YSL");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.encode("RRKP");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("RKP", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.encode("WR");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("R", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual(";Ph)[;'", ";Ph)[;'");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("&E@^D%#'?J", true);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("T ", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("%Lu}mByJrip7w", true);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("LMPJ", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("=FOg|TgX(PlzE", "{}iJbD*");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.encode("jk");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("JK", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("yh", "yh", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("R2Ggm5-WC", "-4N");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("OGY");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AJ", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("A$'KJ0W", "ltWGhw");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      assertNotNull(doubleMetaphone0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      
      String string0 = doubleMetaphone0.doubleMetaphone("f|ZhytEwW/i&dGz");
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("FJTT", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("2?Ec GG08K", false);
      assertEquals("KKK", string0);
      assertNotNull(string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("CIO");
      assertEquals("S", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen(3615);
      doubleMetaphone0.doubleMetaphone("eRA:ZSl2a&CYc?rz.|", false);
      assertEquals(3615, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("8,t^ck", ".A");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      boolean boolean0 = doubleMetaphone0.isDoubleMetaphoneEqual("", "UCCES", false);
      assertFalse(boolean0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      try { 
        doubleMetaphone0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // DoubleMetaphone encode parameter is not of type String
         //
         verifyException("org.apache.commons.codec.language.DoubleMetaphone", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("/udEVK~Vv");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("TFKF", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("SFKK", false);
      assertNotNull(string0);
      assertEquals("SFK", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("zET\"'a,K}:");
      assertEquals("STK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("PSW2MDX=!", false);
      assertNotNull(string0);
      assertEquals("SMTK", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("UMB", "UMB");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("ILLA");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("AL", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      Object object0 = doubleMetaphone0.encode((Object) "RNLL");
      assertEquals("RNL", object0);
      assertNotNull(object0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("[CH'k");
      assertEquals("XK", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("ORCHES");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("ARKS", string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.isDoubleMetaphoneEqual("CHORE", "");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("CH");
      assertEquals("K", string0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.doubleMetaphone("MACHER", false);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
      assertEquals("MKR", string0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      doubleMetaphone0.setMaxCodeLen(77);
      String string0 = doubleMetaphone0.doubleMetaphone("org.apache.commons.codec.EncoderException", false);
      assertEquals("ARKPXKMNSKTKNKTRKSPXN", string0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      char char0 = doubleMetaphone0.charAt("org.apache.commons.codec.EncoderException", (-1));
      assertEquals('\u0000', char0);
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(1);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary('e');
      boolean boolean0 = doubleMetaphone_DoubleMetaphoneResult0.isComplete();
      assertEquals("e", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(1);
      doubleMetaphone_DoubleMetaphoneResult0.appendPrimary(")`>*Q,~[");
      assertEquals(")", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(1);
      doubleMetaphone_DoubleMetaphoneResult0.append("", ")`>*Q,~[");
      assertEquals(")", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      String string0 = doubleMetaphone0.encode("n#lNn[.gq L");
      assertNotNull(string0);
      assertEquals("NLNK", string0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult((-1067));
      doubleMetaphone_DoubleMetaphoneResult0.append('*', '*');
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getPrimary());
      assertEquals("", doubleMetaphone_DoubleMetaphoneResult0.getAlternate());
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      DoubleMetaphone doubleMetaphone0 = new DoubleMetaphone();
      DoubleMetaphone.DoubleMetaphoneResult doubleMetaphone_DoubleMetaphoneResult0 = doubleMetaphone0.new DoubleMetaphoneResult(0);
      doubleMetaphone_DoubleMetaphoneResult0.append("");
      assertEquals(4, doubleMetaphone0.getMaxCodeLen());
  }
}
