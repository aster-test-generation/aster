
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


package org.apache.commons.compress.harmony.unpack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.unpack200.IcTuple;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IcTuple_ESTest extends IcTuple_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 4535, "IcTuple ", "IcTuple ", 4535, 4535, 4535, 427);
      String string0 = icTuple0.thisClassString();
      assertEquals(4535, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isMember());
      assertEquals("IcTuple $IcTuple ", string0);
      assertEquals(427, icTuple0.getTupleIndex());
      assertEquals(4535, icTuple0.getF());
      assertEquals(4535, icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isAnonymous());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      icTuple0.N = "";
      String string0 = icTuple0.simpleClassName();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1044), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      icTuple0.C2 = "Dsc@&?%i|L&Xm*\"b{p";
      String string0 = icTuple0.outerClassString();
      assertEquals((-1044), icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, (-1), (-144), 0, (-1));
      icTuple0.C = null;
      String string0 = icTuple0.thisClassString();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      String string0 = icTuple0.thisClassString();
      assertTrue(icTuple0.isMember());
      assertNotNull(string0);
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertEquals("", string0);
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1044), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-91), "Should have an outer before checking if it's anonymous", (String) null, 0, 0, 0, 0);
      int int0 = icTuple0.thisClassIndex();
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("Should have an outer before checking if it's anonymous", icTuple0.outerClassString());
      assertEquals((-91), icTuple0.getF());
      assertEquals(0, int0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("5CBl|4 ;U/", 0, "5CBl|4 ;U/", "5CBl|4 ;U/", 0, 0, 0, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals(0, int0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 4535, "IcTuple ", "IcTuple ", 4535, 4535, 4535, 427);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals("IcTuple ", icTuple0.getN());
      assertEquals("IcTuple ", icTuple0.getC2());
      assertFalse(icTuple0.isMember());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(4535, int0);
      assertEquals(4535, icTuple0.getF());
      assertEquals(4535, icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(427, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "M MHnEW", 0, (-250), 3410, (-1490));
      String string0 = icTuple0.simpleClassName();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNotNull(string0);
      assertEquals((-1490), icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals("M MHnEW", string0);
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals("", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 4535, "IcTuple ", "IcTuple ", 4535, 4535, 4535, 427);
      boolean boolean0 = icTuple0.outerIsAnonymous();
      assertTrue(boolean0);
      assertFalse(icTuple0.isAnonymous());
      assertEquals("IcTuple ", icTuple0.getC2());
      assertEquals(4535, icTuple0.outerClassIndex());
      assertEquals(427, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(4535, icTuple0.simpleClassNameIndex());
      assertEquals(4535, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("2^^r6=*", 0, ",%5Oe/6S", ",%5Oe/6S", 2, 2, (-1), (-1));
      String string0 = icTuple0.outerClassString();
      assertEquals((-1), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(",%5Oe/6S", icTuple0.simpleClassName());
      assertEquals(",%5Oe/6S", string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("}1 ;Qj", 0, "jE:?f#qSg@Gb", "jE:?f#qSg@Gb", 0, 0, (-2625), 0);
      int int0 = icTuple0.outerClassIndex();
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("jE:?f#qSg@Gb", icTuple0.outerClassString());
      assertEquals(0, icTuple0.getF());
      assertEquals((-2625), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals("jE:?f#qSg@Gb", icTuple0.getN());
      assertTrue(icTuple0.isMember());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      int int0 = icTuple0.outerClassIndex();
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertEquals((-1), int0);
      assertEquals((-1044), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1044), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("u5F'!\"L!<?=1+N7(;", (-682), "*", "*r3", (-682), 173, 173, 17);
      boolean boolean0 = icTuple0.isMember();
      assertFalse(boolean0);
      assertEquals(17, icTuple0.getTupleIndex());
      assertEquals((-682), icTuple0.getF());
      assertEquals(173, icTuple0.simpleClassNameIndex());
      assertEquals(173, icTuple0.outerClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("Should have an outer before checking if it's anonymous", 0, "Should have an outer before checking if it's anonymous", "", 0, 0, 17, 0);
      boolean boolean0 = icTuple0.isAnonymous();
      assertEquals(17, icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertEquals(0, icTuple0.outerClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      icTuple0.innerBreakAtDollar("");
      assertEquals(40, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals("5vEV=rZ7G@tbGtJQ", icTuple0.simpleClassName());
      assertEquals("", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-2591), icTuple0.getF());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("4.QJpgL*t1w8WE&Qcg", 1198, "", "", 1198, (-217), 0, 0);
      int int0 = icTuple0.getTupleIndex();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(1198, icTuple0.getF());
      assertEquals("", icTuple0.getC2());
      assertFalse(icTuple0.predicted());
      assertEquals(0, int0);
      assertEquals("", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      int int0 = icTuple0.getTupleIndex();
      assertEquals((-1044), icTuple0.getF());
      assertEquals((-1044), int0);
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      String string0 = icTuple0.getN();
      assertNull(string0);
      assertEquals((-1044), icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "M MHnEW", 0, (-250), 3410, (-1490));
      assertEquals("M MHnEW", icTuple0.getN());
      
      icTuple0.N = "";
      icTuple0.getN();
      assertEquals("", icTuple0.outerClassString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3610), "", (String) null, 0, (-3610), 483, 1601);
      assertEquals((-3610), icTuple0.getF());
      
      icTuple0.F = 0;
      int int0 = icTuple0.getF();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3610), "", (String) null, 1, (-3610), 1, 1);
      int int0 = icTuple0.getF();
      assertEquals((-3610), int0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(1, icTuple0.thisClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 40, (String) null, "", 40, 0, 0, 0);
      String string0 = icTuple0.getC2();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(40, icTuple0.thisClassIndex());
      assertNull(string0);
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(40, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "M MHnEW", 0, (-250), 3410, (-1490));
      String string0 = icTuple0.getC2();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals("", string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1490), icTuple0.getTupleIndex());
      assertEquals("M MHnEW", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-807), "", "", 65536, 65536, (-807), 65536);
      icTuple0.C = "IcTuple ( in )";
      assertEquals("IcTuple ( in )", icTuple0.getC());
      
      icTuple0.C = null;
      icTuple0.getC();
      assertEquals(65536, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      String string0 = icTuple0.getC();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1044), icTuple0.getF());
      assertNotNull(string0);
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1044), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-91), "Should have an outer before checking if it's anonymous", (String) null, 0, 0, 0, 0);
      // Undeclared exception!
      try { 
        icTuple0.innerBreakAtDollar((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple((String) null, 0, "v0UfG\u0005mn-`=", "z-[NRl<T", 40, 0, (-3911), 2253);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      icTuple0.predicted();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1044), icTuple0.getF());
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 0, (-112), 0, 0);
      boolean boolean0 = icTuple0.predicted();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3610), "", (String) null, 1, (-3610), 1, 1);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, "=z|{_V=$YoY");
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals(1, icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(boolean0);
      assertEquals((-3610), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3610), "", (String) null, 1, (-3610), 1, 1);
      boolean boolean0 = icTuple0.nullSafeEquals("", "=z|{_V=$YoY");
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-3610), icTuple0.getF());
      assertEquals(1, icTuple0.thisClassIndex());
      assertFalse(boolean0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(1, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, (String) null);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(boolean0);
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals("5vEV=rZ7G@tbGtJQ", icTuple0.simpleClassName());
      assertEquals(40, icTuple0.getTupleIndex());
      assertEquals("", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-2591), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("4.QJpgL*t1w8WE&Qcg", 1198, "", "", 1198, (-217), 0, 0);
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertEquals(1198, icTuple0.getF());
      assertFalse(boolean0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("", icTuple0.outerClassString());
      assertFalse(icTuple0.predicted());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertEquals((-1044), icTuple0.thisClassIndex());
      assertTrue(boolean0);
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertEquals((-1044), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1044), (String) null, (String) null, (-1044), (-1044), (-1044), (-1044));
      String[] stringArray0 = icTuple0.innerBreakAtDollar("`sNC/yS(4II=U!6'|A'");
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1044), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1044), icTuple0.getTupleIndex());
      assertEquals(2, stringArray0.length);
      assertEquals((-1044), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("4.QJpgL*t1w8WE&Qcg", 1198, "", "", 1198, (-217), 0, 0);
      String string0 = icTuple0.simpleClassName();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals("", string0);
      assertEquals(1198, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertNotNull(string0);
      assertFalse(icTuple0.predicted());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      String string0 = icTuple0.outerClassString();
      assertEquals("5vEV=rZ7G@tbGtJQ", icTuple0.simpleClassName());
      assertEquals(40, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertEquals((-2591), icTuple0.getF());
      assertNotNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3610), "", (String) null, 1, (-3610), 1, 1);
      int int0 = icTuple0.thisClassIndex();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-3610), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(1, int0);
      assertTrue(icTuple0.isMember());
      assertEquals(1, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("O-#>6iX>", (-1130), "x)DHHA}Eg<tZ3RDlxg", "O-#>6iX>", 1, (-459), 0, (-459));
      int int0 = icTuple0.thisClassIndex();
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals((-1), int0);
      assertEquals((-459), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-459), icTuple0.outerClassIndex());
      assertEquals((-1130), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3610), "", (String) null, 1, (-3610), 1, 1);
      boolean boolean0 = icTuple0.predicted();
      assertTrue(icTuple0.isMember());
      assertEquals(1, icTuple0.thisClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-3610), icTuple0.getF());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("O-#>6iX>", (-1130), "x)DHHA}Eg<tZ3RDlxg", "O-#>6iX>", 1, (-459), 0, (-459));
      String string0 = icTuple0.thisClassString();
      assertEquals("x)DHHA}Eg<tZ3RDlxg$O-#>6iX>", string0);
      assertEquals((-1130), icTuple0.getF());
      assertEquals((-459), icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals((-459), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 3569, "", (String) null, 3569, 3569, 3569, 3569);
      icTuple0.hashCode();
      icTuple0.hashCode();
      assertEquals(3569, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(3569, icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(3569, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 40, (String) null, "", 40, 0, 0, 0);
      icTuple0.hashCode();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(40, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(40, icTuple0.thisClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("|UAw6Vtx", 2, "W\"w~Ty49o^v46/y5", "W\"w~Ty49o^v46/y5", 2, 2, 4864, 63);
      icTuple0.hashCode();
      assertEquals(63, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(2, icTuple0.getF());
      assertEquals("W\"w~Ty49o^v46/y5", icTuple0.outerClassString());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("O-#>6iX>", (-1130), "x)DHHA}Eg<tZ3RDlxg", "O-#>6iX>", 1, (-459), 0, (-459));
      icTuple0.C = null;
      icTuple0.hashCode();
      assertTrue(icTuple0.isMember());
      assertEquals((-459), icTuple0.outerClassIndex());
      assertEquals((-459), icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1130), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3610), "", (String) null, (-3610), (-3610), (-3610), (-3610));
      IcTuple icTuple1 = new IcTuple("", (-3610), "", "", 65536, (-3610), 65536, 65536);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals((-3610), icTuple0.getTupleIndex());
      assertEquals((-3610), icTuple0.thisClassIndex());
      assertEquals(65536, icTuple1.getTupleIndex());
      assertFalse(boolean0);
      assertEquals((-3610), icTuple1.getF());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertEquals((-1), icTuple1.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("2ZJH#<f?pV,a^=2YI|S", (-3609), "2ZJH#<f?pV,a^=2YI|S", (String) null, 1, (-3609), 1, 1);
      icTuple0.C = "2ZJH#<f?pV,a^=2YI|S";
      IcTuple icTuple1 = new IcTuple("", (-3609), "", "2ZJH#<f?pV,a^=2YI|S", (-3609), (-3609), 65536, 65536);
      icTuple0.C = "";
      icTuple0.equals(icTuple1);
      assertEquals((-3609), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(1, icTuple0.thisClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals("2ZJH#<f?pV,a^=2YI|S", icTuple1.simpleClassName());
      assertEquals("", icTuple1.outerClassString());
      assertEquals((-3609), icTuple1.getF());
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertEquals("<f?pV,a^=2YI|S", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("k", (-3610), "k", (String) null, (-3610), (-3610), (-3610), (-3610));
      IcTuple icTuple1 = new IcTuple("", (-3610), "", "k", 0, (-3610), (-3610), 1601);
      icTuple0.equals(icTuple1);
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals((-3610), icTuple0.thisClassIndex());
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertEquals((-3610), icTuple1.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple1.thisClassIndex());
      assertEquals("k", icTuple1.getN());
      assertEquals(1601, icTuple1.getTupleIndex());
      assertTrue(icTuple1.isMember());
      assertEquals("", icTuple1.outerClassString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("2ZJH#<f?pV,a^=2YI|S", (-3609), "2ZJH#<f?pV,a^=2YI|S", (String) null, 1, (-3609), 1, 1);
      boolean boolean0 = icTuple0.equals(icTuple0);
      assertEquals(1, icTuple0.thisClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-3609), icTuple0.outerClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertTrue(boolean0);
      assertTrue(icTuple0.nestedExplicitFlagSet());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("<f?pV,a^=2YI|S", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("O-#>6iX>", (-1130), "x)DHHA}Eg<tZ3RDlxg", "O-#>6iX>", 1, (-459), 0, (-459));
      Object object0 = new Object();
      icTuple0.equals(object0);
      assertEquals((-459), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals((-459), icTuple0.outerClassIndex());
      assertEquals((-1130), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      boolean boolean0 = icTuple0.equals((Object) null);
      assertEquals((-2591), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(40, icTuple0.getTupleIndex());
      assertEquals("5vEV=rZ7G@tbGtJQ", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals("", icTuple0.outerClassString());
      assertFalse(boolean0);
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple(" in ", 0, "", (String) null, 0, 0, 0, (-734));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Should have an outer before checking if it's anonymous
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.IcTuple", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("D]h>$ZZ)RMo^", (-476), (String) null, "", (-476), (-476), (-476), (-476));
      String string0 = icTuple0.thisClassString();
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-476), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertTrue(icTuple0.isAnonymous());
      assertEquals((-476), icTuple0.getF());
      assertNotNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-476), icTuple0.getTupleIndex());
      assertEquals((-476), icTuple0.simpleClassNameIndex());
      assertEquals("D]h>", icTuple0.outerClassString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("0MjeDB^ @*a5h@*HjHj", 0, "0MjeDB^ @*a5h@*HjHj", ";))q", 2, 881, (-1), 65536);
      boolean boolean0 = icTuple0.isMember();
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals(";))q", icTuple0.simpleClassName());
      assertEquals(0, icTuple0.getF());
      assertTrue(boolean0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(881, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("0MjeDB^ @*a5h@*HjHj", 0, "0MjeDB^ @*a5h@*HjHj", ";))q", 2, 881, (-1), 65536);
      int int0 = icTuple0.outerClassIndex();
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals(";))q", icTuple0.getN());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals(881, int0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("0MjeDB^ @*a5h@*HjHj", 0, "0MjeDB^ @*a5h@*HjHj", ";))q", 2, 881, (-1), 65536);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals(881, icTuple0.outerClassIndex());
      assertEquals((-1), int0);
      assertTrue(icTuple0.isMember());
      assertEquals(";))q", icTuple0.getN());
      assertEquals(0, icTuple0.getF());
      assertEquals(65536, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("0MjeDB^ @*a5h@*HjHj", 0, "0MjeDB^ @*a5h@*HjHj", ";))q", 2, 881, (-1), 65536);
      icTuple0.getC2();
      assertEquals(881, icTuple0.outerClassIndex());
      assertEquals(";))q", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 3569, "", (String) null, 3569, 3569, 3569, 3569);
      int int0 = icTuple0.getF();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(3569, int0);
      assertEquals(3569, icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(3569, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      icTuple0.outerIsAnonymous();
      assertEquals("", icTuple0.outerClassString());
      assertFalse(icTuple0.predicted());
      assertEquals(40, icTuple0.getTupleIndex());
      assertEquals("5vEV=rZ7G@tbGtJQ", icTuple0.simpleClassName());
      assertTrue(icTuple0.isMember());
      assertEquals((-2591), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("0MjeDB^ @*a5h@*HjHj", 0, "0MjeDB^ @*a5h@*HjHj", ";))q", 2, 881, (-1), 65536);
      String string0 = icTuple0.getN();
      assertEquals(65536, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(";))q", string0);
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(881, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      icTuple0.isAnonymous();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-2591), icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals("", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("5vEV=rZ7G@tbGtJQ", icTuple0.simpleClassName());
      assertEquals(40, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      String string0 = icTuple0.toString();
      assertEquals("IcTuple (5vEV=rZ7G@tbGtJQ in )", string0);
      assertTrue(icTuple0.isMember());
      assertEquals(40, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-2591), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2591), "", "5vEV=rZ7G@tbGtJQ", (-2591), 40, (-2472), 40);
      int int0 = icTuple0.getTupleIndex();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals("5vEV=rZ7G@tbGtJQ", icTuple0.simpleClassName());
      assertEquals((-2591), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("", icTuple0.outerClassString());
      assertEquals(40, int0);
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("0MjeDB^ @*a5h@*HjHj", 0, "0MjeDB^ @*a5h@*HjHj", ";))q", 2, 881, (-1), 65536);
      icTuple0.getC();
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(";))q", icTuple0.simpleClassName());
      assertEquals(881, icTuple0.outerClassIndex());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }
}
