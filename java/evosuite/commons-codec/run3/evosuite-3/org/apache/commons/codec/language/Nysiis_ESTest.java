
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
import org.apache.commons.codec.language.Nysiis;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Nysiis_ESTest extends Nysiis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "SDSCGS");
      assertEquals("SDSCG", object0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.encode("a[K;$e{]");
      assertEquals("AC", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("UAH");
      assertEquals("U", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      boolean boolean0 = nysiis0.isStrict();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      nysiis0.encode("");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      String string0 = nysiis0.nysiis("&`Fi $A\\");
      assertTrue(nysiis0.isStrict());
      assertEquals("F", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("JN88a:z^8S");
      assertEquals("JN", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.nysiis("{k");
      assertEquals("C", string0);
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.nysiis("");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.nysiis((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      boolean boolean0 = nysiis0.isStrict();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("wrV,:A<y");
      assertEquals("WRVY", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      nysiis0.encode((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = new Object();
      try { 
        nysiis0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Nysiis encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Nysiis", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      String string0 = nysiis0.encode("CIH}}o&h@j,njC");
      assertNotNull(string0);
      assertEquals("CAHAJN", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("abPh@,");
      assertNotNull(string0);
      assertEquals("ABF", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("p^SCH");
      assertEquals("P", string0);
      assertTrue(nysiis0.isStrict());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.nysiis("}2>2zjWZKn@ 5dpDmP");
      assertNotNull(string0);
      assertEquals("ZJWSNDPDNP", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("org.apache.commons.codec.EncoderException");
      assertEquals("ORGAPA", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("sds`,=5Kq}0zn");
      assertEquals("SDSCGS", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "-[7wB`j|pE*VU");
      assertEquals("WBJPAF", object0);
      assertNotNull(object0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis(",Wewz,d&Joiu}=7T!");
      assertEquals("WASDJA", string0);
  }
}
