
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
      RefinedSoundex refinedSoundex0 = RefinedSoundex.US_ENGLISH;
      char char0 = refinedSoundex0.getMappingCode('X');
      assertEquals('5', char0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("org.apache.commons.codec.EncoderException");
      char char0 = refinedSoundex0.getMappingCode('l');
      assertEquals('c', char0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("org.apache.commons.codec.EncoderException");
      String string0 = refinedSoundex0.encode("ZmAx.zW!vn2");
      assertEquals("ZEocEedm", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.soundex("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("^>r$LITIlKB[EJCzg");
      String string0 = refinedSoundex0.soundex("org.apache.commons.codec.EncoderException");
      assertEquals("OCT^z^rILrCECJrC$LrLJrC$LLrLzlCJ", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("org.apache.commons.codec.EncoderException");
      int int0 = refinedSoundex0.US_ENGLISH.difference((String) null, (String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("^>r$LITIlKB[EJCzg");
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
  public void test10()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("^>r$LITIlKB[EJCzg");
      Object object0 = refinedSoundex0.encode((Object) "^>r$LITIlKB[EJCzg");
      assertEquals("R[ll[B>LKrT", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("^>r$LITIlKB[EJCzg");
      int int0 = refinedSoundex0.difference("JRs\"K-U[I8%eW@.<E", "Jdt");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("^>r$LITIlKB[EJCzg");
      String string0 = refinedSoundex0.US_ENGLISH.encode("01360240043788015936020505");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[7];
      RefinedSoundex refinedSoundex0 = new RefinedSoundex(charArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex();
      String string0 = refinedSoundex0.soundex((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RefinedSoundex refinedSoundex0 = new RefinedSoundex("@");
      char char0 = refinedSoundex0.getMappingCode('_');
      assertEquals('\u0000', char0);
  }
}
