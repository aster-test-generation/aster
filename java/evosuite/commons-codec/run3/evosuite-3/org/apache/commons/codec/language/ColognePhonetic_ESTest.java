
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
import org.apache.commons.codec.language.ColognePhonetic;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ColognePhonetic_ESTest extends ColognePhonetic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      boolean boolean0 = colognePhonetic0.isEncodeEqual("Wzye1!dXTc", "Wzye1!dXTc");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.encode("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.colognePhonetic("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      // Undeclared exception!
      try { 
        colognePhonetic0.isEncodeEqual((String) null, "[ 5)iZqobr5$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      // Undeclared exception!
      try { 
        colognePhonetic0.encode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.language.ColognePhonetic", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.colognePhonetic("cL,Y>F(v+2JHDU3");
      assertEquals("4532", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.colognePhonetic("Wzye1!dXTc");
      assertEquals("38248", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.colognePhonetic("org.apache.commons.codec.language.ColognePhonetic");
      assertEquals("07414466828564445463628", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.colognePhonetic((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      Object object0 = new Object();
      try { 
        colognePhonetic0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // This method's parameter was expected to be of the type java.lang.String. But actually it was of the type java.lang.Object.
         //
         verifyException("org.apache.commons.codec.language.ColognePhonetic", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      Object object0 = colognePhonetic0.encode((Object) "1Cok~,@->9");
      assertEquals("44", object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.colognePhonetic("qXOK;x+t/|4a>cR<");
      assertEquals("4848287", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      boolean boolean0 = colognePhonetic0.isEncodeEqual("6tKTZ}Kt-Sln|8{&x@Q", "org.apache.commons.codec.language.ColognePhonetic$CologneBuffer");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.encode("org.apache.commons.codec.EncoderException");
      assertEquals("07414466828642748126", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ColognePhonetic colognePhonetic0 = new ColognePhonetic();
      String string0 = colognePhonetic0.colognePhonetic("`cbpbM");
      assertEquals("816", string0);
  }
}
