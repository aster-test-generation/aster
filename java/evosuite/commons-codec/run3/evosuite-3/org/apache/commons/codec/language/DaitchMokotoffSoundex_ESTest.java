
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
import org.apache.commons.codec.language.DaitchMokotoffSoundex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DaitchMokotoffSoundex_ESTest extends DaitchMokotoffSoundex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.encode("W]psM##Nr%4$");
      assertEquals("746690", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      // Undeclared exception!
      try { 
        daitchMokotoffSoundex0.soundex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.DaitchMokotoffSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      String string0 = daitchMokotoffSoundex0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      Object object0 = new Object();
      try { 
        daitchMokotoffSoundex0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to DaitchMokotoffSoundex encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.DaitchMokotoffSoundex", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.encode("/*\u015B=s");
      assertEquals("400000", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex(false);
      String string0 = daitchMokotoffSoundex0.soundex("5v88atY./9UG9.f U");
      assertEquals("735700", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.soundex("9iM[@A#xJFnM<");
      assertEquals("065476", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      Object object0 = daitchMokotoffSoundex0.encode((Object) "NK3&n3]]+|`mppwW");
      assertEquals("656670", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.soundex("org.apache.commons.codec.CharEncoding");
      assertEquals("095744|095745|095754|095755", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DaitchMokotoffSoundex daitchMokotoffSoundex0 = new DaitchMokotoffSoundex();
      String string0 = daitchMokotoffSoundex0.encode("org.apache.commons.codec.CharEncoding");
      assertNotNull(string0);
      assertEquals("095744", string0);
  }
}
