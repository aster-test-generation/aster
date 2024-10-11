
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
      String string0 = nysiis0.encode("WSCGTX");
      assertEquals("WSCGTX", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      String string0 = nysiis0.nysiis("8cTkZDRfwzS:N+]@U");
      assertEquals("CTCSDR", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      Object object0 = nysiis0.encode((Object) "tb]}]!\"Wqo2H[");
      assertEquals("TBWG", object0);
      assertFalse(nysiis0.isStrict());
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
      Nysiis nysiis0 = new Nysiis();
      nysiis0.nysiis("C");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.nysiis((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      boolean boolean0 = nysiis0.isStrict();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(true);
      String string0 = nysiis0.nysiis("(EE|IE)$");
      assertTrue(nysiis0.isStrict());
      assertEquals("EY", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("`w/u)7i/Z");
      assertEquals("W", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.nysiis("");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.encode((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      try { 
        nysiis0.encode((Object) nysiis0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parameter supplied to Nysiis encode is not of type java.lang.String
         //
         verifyException("org.apache.commons.codec.language.Nysiis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.encode("c{EwLTP*s]'2$b!F");
      assertEquals("CALTPSBF", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "IHyfP4R}MgUm}/\"8b");
      assertEquals("IYFPRN", object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("r]9E!?dE3?hEFR");
      assertNotNull(string0);
      assertEquals("RADAHA", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.nysiis("s3 8r~ph*.m");
      assertEquals("SRFN", string0);
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("WSCJGT");
      assertEquals("WSCJGT", string0);
      assertTrue(nysiis0.isStrict());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "GO4k|;d~-IX9U|$YQ");
      assertEquals("GACDAX", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.encode("VEV7");
      assertNotNull(string0);
      assertEquals("VAF", string0);
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("Parameter supplied to Nysiis encode is not of type java.lang.String");
      assertEquals("PARANA", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "8KmqhJ&J'I?oA{");
      assertEquals("CNGJ", object0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("P3!ep");
      assertNotNull(string0);
      assertEquals("PAP", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode(" izLKN?'B[/BbVJ");
      assertEquals("ISLNBV", string0);
  }
}
