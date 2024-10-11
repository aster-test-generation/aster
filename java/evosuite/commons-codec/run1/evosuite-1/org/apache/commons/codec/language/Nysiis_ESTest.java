
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
      Object object0 = nysiis0.encode((Object) "QRPSCG");
      assertTrue(nysiis0.isStrict());
      assertEquals("QRPSCG", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("5X*_K~JaH(_'");
      assertEquals("XCJ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      boolean boolean0 = nysiis0.isStrict();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.encode((String) null);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.encode("4");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("EY");
      assertEquals("EY", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.nysiis("t}%GcTi[w5s2[");
      assertEquals("TGCT", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("Y,J|2JZJ");
      assertEquals("YJSJ", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      boolean boolean0 = nysiis0.isStrict();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("(EE|IE)$");
      assertEquals("EY", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      nysiis0.nysiis("i1");
      assertFalse(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      nysiis0.nysiis("");
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      nysiis0.nysiis((String) null);
      assertFalse(nysiis0.isStrict());
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
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("j13KYj8fi+^w1jfVN&");
      assertEquals("JCYJFA", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("89Fa4PxLJn#Fw<i<-Hz");
      assertEquals("FAPXLJ", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("ijlyMaHe)J");
      assertEquals("IJLYNA", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("wIRNpH[W{");
      assertEquals("WARNFW", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("SzI|SC_h");
      assertTrue(nysiis0.isStrict());
      assertEquals("S", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.encode("Dr]S\u0006kNzD#w_3.G()");
      assertEquals("DRSNSD", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("Q/r:%PS[0?cq");
      assertEquals("QRPSCG", string0);
      assertTrue(nysiis0.isStrict());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("8SyAkF;o-(RKX&6");
      assertEquals("SYACFA", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis(false);
      String string0 = nysiis0.nysiis("Z|z-R(Le8v=TbiJFl]");
      assertEquals("ZSRLAFTBAJFL", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      String string0 = nysiis0.nysiis("UuLBMam#=");
      assertEquals("UALBNA", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Nysiis nysiis0 = new Nysiis();
      Object object0 = nysiis0.encode((Object) "org.apache.commons.codec.EncoderException");
      assertEquals("ORGAPA", object0);
  }
}
