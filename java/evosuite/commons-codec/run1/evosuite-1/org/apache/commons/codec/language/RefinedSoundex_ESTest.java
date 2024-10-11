
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
import org.apache.commons.codec.language.RefinedSoundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RefinedSoundex_ESTest extends RefinedSoundex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      char char0 = refinedSoundex0.getMappingCode('W');
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[7] = 'J';
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      char char0 = refinedSoundex0.getMappingCode('h');
      assertEquals('J', char0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("\"u+2#.XPKS9");
      String string0 = refinedSoundex0.US_ENGLISH.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[2];
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      String string0 = refinedSoundex0.encode("org.apache.commons.codec.EncoderException");
      assertEquals("O", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '\"';
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      int int0 = refinedSoundex0.difference("t|kg?A", "lAKK2zPKnSj]E");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = null;
      try {
        refinedSoundex0 = new RefinedSoundex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.RefinedSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[2];
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      String string0 = refinedSoundex0.soundex("lAKK2zPKnSj]E");
      assertEquals("L", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("\"u+2#.XPKS9");
      String string0 = refinedSoundex0.US_ENGLISH.soundex("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("\"u+2#.XPKS9");
      String string0 = refinedSoundex0.US_ENGLISH.encode("01360240043788015936020505");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("\"iV#h|(k/axPyE+&SyM");
      String string0 = refinedSoundex0.soundex((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("\"iV#h|(k/axPyE+&SyM");
      char char0 = refinedSoundex0.getMappingCode('(');
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("\"iV#h|(k/axPyE+&SyM");
      try { 
        refinedSoundex0.encode((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to RefinedSoundex encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.RefinedSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      int int0 = refinedSoundex0.difference("01360240043788015936020505", "E");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = null;
      try {
        refinedSoundex0 = new RefinedSoundex((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.RefinedSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.soundex("2<A/1!Ic*YV");
      assertNotNull(string0);
      assertEquals("A0302", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("\"iV#h|(k/axPyE+&SyM");
      Object object0 = refinedSoundex0.US_ENGLISH.encode((Object) "\"iV#h|(k/axPyE+&SyM");
      assertNotNull(object0);
      assertEquals("I02030510308", object0);
  }
}
