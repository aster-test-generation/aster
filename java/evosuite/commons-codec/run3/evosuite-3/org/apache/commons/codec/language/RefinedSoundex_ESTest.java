
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
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("YypZ4pKLr%1vDTB~");
      int int0 = refinedSoundex0.difference("osBz%6^M:wL=7[Jy?", "CcS<nc?Ht4>qOD4=");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      char char0 = refinedSoundex0.getMappingCode('n');
      assertEquals('8', char0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[2] = 'P';
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
      char char0 = refinedSoundex0.getMappingCode('c');
      assertEquals('P', char0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("");
      String string0 = refinedSoundex0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.encode("=:[");
      assertEquals("", string0);
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
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("YypZ4pKLr%1vDTB~");
      String string0 = refinedSoundex0.soundex("YypZ4pKLr%1vDTB~");
      assertEquals("Y~~1vZy", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.US_ENGLISH.soundex("=:[");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.soundex(";oI>aS#P)(3^");
      assertEquals("O031", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.soundex((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      char char0 = refinedSoundex0.getMappingCode('');
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = RefinedSoundex.US_ENGLISH;
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
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      Object object0 = refinedSoundex0.encode((Object) "01360240043788015936020505");
      assertEquals("", object0);
      assertNotNull(object0);
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
      int int0 = refinedSoundex0.difference("O031", ";oI>aS#P)(3^");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("nhC6oopD");
      String string0 = refinedSoundex0.encode("nhC6oopD");
      assertEquals("NDC6", string0);
      assertNotNull(string0);
  }
}
