
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
      IcTuple icTuple0 = new IcTuple(" ?``TpLy9Hr", (-2683), "fX2<", " ?``TpLy9Hr", (-2683), 0, (-827), 0);
      icTuple0.C = "";
      String string0 = icTuple0.thisClassString();
      assertEquals((-827), icTuple0.simpleClassNameIndex());
      assertEquals("fX2<$ ?``TpLy9Hr", string0);
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals((-2683), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 0, "M.:cBu{Q", (String) null, (-960), 1939, (-960), 4721);
      String string0 = icTuple0.simpleClassName();
      assertNotNull(string0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-960), icTuple0.thisClassIndex());
      assertEquals(4721, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isMember());
      assertEquals("", string0);
      assertEquals(1939, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" ?``TpLy9Hr", (-2683), "fX2<", " ?``TpLy9Hr", (-2683), 0, (-827), 0);
      assertEquals("fX2<", icTuple0.getC2());
      
      icTuple0.C2 = "G&9R+}9RS/";
      String string0 = icTuple0.outerClassString();
      assertEquals("fX2<", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, 0, 993, (-554), (-480));
      boolean boolean0 = icTuple0.equals(icTuple0);
      assertTrue(boolean0);
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-480), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(",F=<|8|dI'2m;:x;EG", 17, ",F=<|8|dI'2m;:x;EG", (String) null, 1, 1, 0, 0);
      icTuple0.C = null;
      String string0 = icTuple0.thisClassString();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(1, icTuple0.thisClassIndex());
      assertNull(string0);
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(17, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, 0, 993, (-554), (-480));
      String string0 = icTuple0.thisClassString();
      assertEquals(0, icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals((-480), icTuple0.getTupleIndex());
      assertEquals("", string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(".#92[Ll:N)wL", 0, (String) null, (String) null, 0, 0, 65536, 65536);
      int int0 = icTuple0.thisClassIndex();
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, int0);
      assertEquals("92[Ll:N)wL", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(".", icTuple0.outerClassString());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(":\"zCe-;G", 0, "Should have an outer before checking if it's anonymous", "s+&7|nMdTDpzl)6}8v", (-5551), (-5551), 0, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals((-5551), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("Should have an outer before checking if it's anonymous", icTuple0.getC2());
      assertEquals("s+&7|nMdTDpzl)6}8v", icTuple0.getN());
      assertFalse(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("9_;wN*,\" F|e/K>K", 0, "9_;wN*,\" F|e/K>K", "6(#FVk!B", 40, 40, 40, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals(40, icTuple0.outerClassIndex());
      assertEquals(40, int0);
      assertTrue(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, 0, 993, (-554), (-480));
      String string0 = icTuple0.simpleClassName();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
      assertEquals(0, icTuple0.thisClassIndex());
      assertEquals((-480), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" ?``TpLy9Hr", (-2683), "fX2<", " ?``TpLy9Hr", (-2683), 0, (-827), 0);
      String string0 = icTuple0.simpleClassName();
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-827), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertNotNull(string0);
      assertEquals(" ?``TpLy9Hr", string0);
      assertTrue(icTuple0.nestedExplicitFlagSet());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("1$", 36, "1$", "1$", (-678), 0, (-677), 0);
      boolean boolean0 = icTuple0.outerIsAnonymous();
      assertTrue(boolean0);
      assertEquals((-677), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(36, icTuple0.getF());
      assertFalse(icTuple0.isAnonymous());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 582, (String) null, "z", 582, 582, 582, 582);
      String string0 = icTuple0.outerClassString();
      assertEquals(582, icTuple0.getF());
      assertEquals("z", icTuple0.simpleClassName());
      assertTrue(icTuple0.isMember());
      assertEquals(582, icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(582, icTuple0.getTupleIndex());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("h[ Dkm", 3972, ":b~kFpsnc5ht!4", "h[ Dkm", 0, 0, 0, (-836));
      int int0 = icTuple0.outerClassIndex();
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(0, int0);
      assertEquals((-836), icTuple0.getTupleIndex());
      assertEquals(3972, icTuple0.getF());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals("h[ Dkm", icTuple0.getN());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("~!5&", 1727, "~!5&", "~!5&", 1727, 1727, 1727, 4577);
      int int0 = icTuple0.outerClassIndex();
      assertEquals(1727, icTuple0.getF());
      assertEquals(1727, int0);
      assertEquals(1727, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(4577, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" ?``TpLy9Hr", (-2683), "fX2<", " ?``TpLy9Hr", (-2683), 0, (-827), 0);
      boolean boolean0 = icTuple0.isMember();
      assertEquals(" ?``TpLy9Hr", icTuple0.getN());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-827), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.outerClassIndex());
      assertFalse(boolean0);
      assertEquals((-2683), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 0, "M.:cBu{Q", (String) null, (-960), 1939, (-960), 4721);
      boolean boolean0 = icTuple0.isAnonymous();
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals((-960), icTuple0.thisClassIndex());
      assertEquals(4721, icTuple0.getTupleIndex());
      assertEquals(1939, icTuple0.outerClassIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 0, 0, 0, 0);
      int int0 = icTuple0.getTupleIndex();
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 534, "R?GNi(8", "", (-2918), 0, (-1567), 41);
      int int0 = icTuple0.getTupleIndex();
      assertTrue(icTuple0.isMember());
      assertEquals("", icTuple0.getN());
      assertEquals(534, icTuple0.getF());
      assertEquals("R?GNi(8", icTuple0.outerClassString());
      assertEquals(41, int0);
      assertFalse(icTuple0.predicted());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("4.~", (-754), "4.~", "IJ*p-kI(R9MNz6Y", (-754), 0, 0, 0);
      icTuple0.N = "IJ*p-kI(R9MNz6Y";
      icTuple0.N = null;
      String string0 = icTuple0.getN();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("4.~", icTuple0.outerClassString());
      assertEquals((-754), icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("IJ*p-kI(R9MNz6Y", icTuple0.simpleClassName());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("3g}", 0, "3g}", "3g}", 0, 0, 0, (-630));
      String string0 = icTuple0.getN();
      assertEquals((-630), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertNotNull(string0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 1, 334, 3527, 0);
      int int0 = icTuple0.getF();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(0, int0);
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 17, "$", "uUZ'ir", (-1), (-1), (-422), (-1));
      int int0 = icTuple0.getF();
      assertEquals((-1), icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertEquals(17, int0);
      assertEquals("$", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
      assertEquals("uUZ'ir", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("3}eYD", (-1791), (String) null, (String) null, (-1791), (-1791), (-1791), (-1791));
      String string0 = icTuple0.getC2();
      assertEquals((-1791), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isMember());
      assertNull(string0);
      assertEquals((-1791), icTuple0.getTupleIndex());
      assertEquals((-1791), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" ?``TpLy9Hr", (-2683), "fX2<", " ?``TpLy9Hr", (-2683), 0, (-827), 0);
      icTuple0.getC2();
      assertEquals(0, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-2683), icTuple0.getF());
      assertEquals((-827), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", 1, 334, 3527, 0);
      icTuple0.C = null;
      String string0 = icTuple0.getC();
      assertNull(string0);
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", (-1), (-1), (-1), 3442);
      icTuple0.getC();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals(3442, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(",F=<|8|dI'2m;:x;EG", 17, ",F=<|8|dI'2m;:x;EG", (String) null, 1, 1, 0, 0);
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
  public void test28()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple((String) null, 1, (String) null, "$", 0, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" ?``TpLy9Hr", (-2683), "fX2<", " ?``TpLy9Hr", (-2683), 0, (-827), 0);
      boolean boolean0 = icTuple0.predicted();
      assertEquals((-2683), icTuple0.getF());
      assertEquals(0, icTuple0.outerClassIndex());
      assertFalse(boolean0);
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-827), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals(" ?``TpLy9Hr", icTuple0.getN());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", (String) null, 0, 993, (-554), (-480));
      boolean boolean0 = icTuple0.predicted();
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-480), icTuple0.getTupleIndex());
      assertEquals(0, icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("4.~", (-754), "4.~", "IJ*p-kI(R9MNz6Y", (-754), 0, 0, 0);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, "");
      assertEquals("IJ*p-kI(R9MNz6Y", icTuple0.simpleClassName());
      assertEquals("4.~", icTuple0.outerClassString());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-754), icTuple0.getF());
      assertFalse(boolean0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(":\"zCe-;G", 0, "Should have an outer before checking if it's anonymous", "s+&7|nMdTDpzl)6}8v", (-5551), (-5551), 0, 0);
      boolean boolean0 = icTuple0.nullSafeEquals("Should have an outer before checking if it's anonymous", "Should have an outer before checking if it's anonymous");
      assertEquals((-5551), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals("Should have an outer before checking if it's anonymous", icTuple0.outerClassString());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals("s+&7|nMdTDpzl)6}8v", icTuple0.getN());
      assertTrue(boolean0);
      assertFalse(icTuple0.nestedExplicitFlagSet());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 2829, "", "", 2829, (-4), 2829, 13);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, (String) null);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(boolean0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(13, icTuple0.getTupleIndex());
      assertEquals(2829, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" ?``TpLy9Hr", (-2683), "fX2<", " ?``TpLy9Hr", (-2683), 0, (-827), 0);
      assertEquals((-2683), icTuple0.getF());
      
      icTuple0.F = 1726;
      icTuple0.nestedExplicitFlagSet();
      assertFalse(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(">{z6{r^AKWSM(=4K", (-368), "!N?)NKiRHRZVp680", "!N?)NKiRHRZVp680", (-368), (-368), 2448, (-368));
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-368), icTuple0.getTupleIndex());
      assertEquals("!N?)NKiRHRZVp680", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals("!N?)NKiRHRZVp680", icTuple0.simpleClassName());
      assertTrue(boolean0);
      assertEquals((-368), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 0, "M.:cBu{Q", (String) null, (-960), 1939, (-960), 4721);
      String[] stringArray0 = icTuple0.innerBreakAtDollar(" in ");
      assertEquals(0, icTuple0.getF());
      assertFalse(icTuple0.isMember());
      assertEquals(3, stringArray0.length);
      assertEquals((-960), icTuple0.thisClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(4721, icTuple0.getTupleIndex());
      assertEquals(1939, icTuple0.outerClassIndex());
      assertEquals("", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("h[ Dkm", 3972, ":b~kFpsnc5ht!4", "h[ Dkm", 0, 0, 0, (-836));
      icTuple0.innerBreakAtDollar("");
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(3972, icTuple0.getF());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals((-836), icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("h[ Dkm", 3972, ":b~kFpsnc5ht!4", "h[ Dkm", 0, 0, 0, (-836));
      int int0 = icTuple0.thisClassIndex();
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(3972, icTuple0.getF());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals((-1), int0);
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals((-836), icTuple0.getTupleIndex());
      assertEquals("h[ Dkm", icTuple0.getN());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(",F=J<|8|dI'2m;:x;EG", 69, ",F=J<|8|dI'2m;:x;EG", (String) null, 1, 1, 1, 0);
      int int0 = icTuple0.thisClassIndex();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(1, int0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(69, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("Should have an outer before checking if it's anonymous", 232, (String) null, "s;w53@F?\"CxiPc]", 36, (-2995), 0, 0);
      boolean boolean0 = icTuple0.predicted();
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("Should$have$an$outer$before$checking$if$it's", icTuple0.outerClassString());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(232, icTuple0.getF());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(36, icTuple0.thisClassIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 106, "", "", 106, 106, 106, 106);
      icTuple0.C = null;
      IcTuple icTuple1 = new IcTuple("`@9gcdGj0N$D}s{", 106, "0uXz8", "", 65536, 106, 106, 106);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals(106, icTuple1.simpleClassNameIndex());
      assertFalse(icTuple1.outerIsAnonymous());
      assertEquals(106, icTuple1.getF());
      assertEquals(106, icTuple1.outerClassIndex());
      assertFalse(icTuple1.isMember());
      assertEquals(106, icTuple1.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 106, "", "", 106, 106, 106, 106);
      icTuple0.C = null;
      boolean boolean0 = icTuple0.equals(icTuple0);
      assertEquals(106, icTuple0.getTupleIndex());
      assertEquals(106, icTuple0.getF());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertTrue(boolean0);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("]a", 0, "]a", "]a", 0, 0, 1315, 0);
      icTuple0.hashCode();
      icTuple0.hashCode();
      assertEquals(0, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3470), "", (String) null, (-4), 36, (-3470), 36);
      icTuple0.hashCode();
      assertTrue(icTuple0.isMember());
      assertEquals((-4), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-3470), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(36, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("Should have an outer before checking if it's anonymous", 232, (String) null, "s;w53@F?\"CxiPc]", 36, (-2995), 0, 0);
      icTuple0.hashCode();
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(232, icTuple0.getF());
      assertEquals(36, icTuple0.thisClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals("Should$have$an$outer$before$checking$if$it's", icTuple0.outerClassString());
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("h,6_+x:iTkri2#|Q", (-458), "h,6_+x:iTkri2#|Q", "", (-458), 0, (-724), (-724));
      icTuple0.hashCode();
      assertEquals((-724), icTuple0.simpleClassNameIndex());
      assertEquals((-458), icTuple0.getF());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals((-724), icTuple0.getTupleIndex());
      assertTrue(icTuple0.nestedExplicitFlagSet());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 106, "", "", 106, 106, 106, 106);
      icTuple0.C = null;
      icTuple0.hashCode();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(106, icTuple0.getF());
      assertEquals(106, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 2829, "", "", 2829, (-4), 2829, 13);
      IcTuple icTuple1 = new IcTuple("", (-3470), "", (String) null, (-4), 36, (-3470), 36);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertFalse(icTuple0.predicted());
      assertEquals(13, icTuple0.getTupleIndex());
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertEquals((-4), icTuple1.thisClassIndex());
      assertFalse(boolean0);
      assertEquals((-3470), icTuple1.getF());
      assertEquals((-1), icTuple1.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", (-1), (-1), (-1), 3442);
      IcTuple icTuple1 = new IcTuple("", 17, "$", "uUZ'ir", (-1), (-1), (-422), (-1));
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals(17, icTuple1.getF());
      assertFalse(icTuple1.predicted());
      assertFalse(boolean0);
      assertEquals("$", icTuple1.outerClassString());
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertEquals("uUZ'ir", icTuple1.simpleClassName());
      assertEquals(3442, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals((-1), icTuple1.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 106, "", "", 106, 106, 106, 106);
      boolean boolean0 = icTuple0.equals("");
      assertEquals((-1), icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(boolean0);
      assertEquals(106, icTuple0.getF());
      assertEquals(106, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("h,6_+x:iTkri2#|Q", (-458), "h,6_+x:iTkri2#|Q", "", (-458), 0, (-724), (-724));
      icTuple0.equals((Object) null);
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals((-724), icTuple0.getTupleIndex());
      assertEquals((-458), icTuple0.getF());
      assertTrue(icTuple0.isAnonymous());
      assertFalse(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals((-724), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple(" in ", 1, "", "", 1, (-724), (-724), 1);
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
      IcTuple icTuple0 = new IcTuple("", (-335), "", "", (-335), (-335), 0, (-335));
      boolean boolean0 = icTuple0.isMember();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-335), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(boolean0);
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-335), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 141, "F", "", 141, 2089, 0, 0);
      int int0 = icTuple0.outerClassIndex();
      assertEquals((-1), int0);
      assertEquals(141, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.predicted());
      assertEquals("F", icTuple0.outerClassString());
      assertEquals("", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-335), "", "", (-335), (-335), 0, (-335));
      String string0 = icTuple0.toString();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-335), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-335), icTuple0.getF());
      assertEquals("IcTuple ( in )", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-335), "", "", (-335), (-335), 0, (-335));
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals((-335), icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertEquals((-1), int0);
      assertEquals((-335), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", (-1), (-1), (-1), 3442);
      String string0 = icTuple0.getC2();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(icTuple0.predicted());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertNotNull(string0);
      assertEquals((-1), icTuple0.getF());
      assertEquals(3442, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", (-1), (-1), (-1), 3442);
      int int0 = icTuple0.getF();
      assertTrue(icTuple0.isMember());
      assertEquals(3442, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("]a", 0, "]a", "]a", 0, 0, 1315, 0);
      icTuple0.outerIsAnonymous();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 141, "F", "", 141, 2089, 0, 0);
      String string0 = icTuple0.getN();
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("F", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("", icTuple0.simpleClassName());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(141, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("]a", 0, "]a", "]a", 0, 0, 1315, 0);
      icTuple0.isAnonymous();
      assertEquals(0, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.predicted());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1), "", "", (-1), (-1), (-1), 3442);
      String string0 = icTuple0.outerClassString();
      assertEquals((-1), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertFalse(icTuple0.predicted());
      assertNotNull(string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(3442, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-335), "", "", (-335), (-335), 0, (-335));
      int int0 = icTuple0.getTupleIndex();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-335), icTuple0.getF());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-335), int0);
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 0, "M.:cBu{Q", (String) null, (-960), 1939, (-960), 4721);
      String string0 = icTuple0.getC();
      assertTrue(icTuple0.isAnonymous());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(" in ", string0);
      assertEquals((-960), icTuple0.thisClassIndex());
      assertEquals(4721, icTuple0.getTupleIndex());
      assertEquals(1939, icTuple0.outerClassIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertEquals(0, icTuple0.getF());
  }
}
