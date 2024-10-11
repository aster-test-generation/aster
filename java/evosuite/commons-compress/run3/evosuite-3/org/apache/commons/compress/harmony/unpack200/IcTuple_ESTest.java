
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
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      icTuple0.thisClassString();
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2082, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(2082, icTuple0.getF());
      assertEquals(2082, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      icTuple0.N = "";
      String string0 = icTuple0.toString();
      assertEquals(2082, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isMember());
      assertEquals("IcTuple ( in  in org.apache.commons.compress.harmony.unpack200.IcTuple)", string0);
      assertEquals(2082, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      icTuple0.C2 = "org.apache.commons.compress.harmony.unpack200.IcTuple";
      String string0 = icTuple0.toString();
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2082, icTuple0.getTupleIndex());
      assertEquals(2082, icTuple0.getF());
      assertEquals("IcTuple ( in  in org.apache.commons.compress.harmony.unpack200.IcTuple)", string0);
      assertEquals(2082, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(2082, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      icTuple0.hashCode();
      assertFalse(icTuple0.isMember());
      assertEquals(2082, icTuple0.outerClassIndex());
      assertEquals(2082, icTuple0.getTupleIndex());
      assertFalse(icTuple0.isAnonymous());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2082, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" 3n ", (-16), (String) null, " 3n ", (-16), (-16), (-16), (-16));
      icTuple0.C = null;
      String string0 = icTuple0.thisClassString();
      assertFalse(icTuple0.isAnonymous());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("$3n", icTuple0.outerClassString());
      assertEquals((-16), icTuple0.thisClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals((-16), icTuple0.getTupleIndex());
      assertTrue(icTuple0.nestedExplicitFlagSet());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2285), (String) null, "5<{Whx2$NP{qHQ", 1, (-2285), 0, 1);
      String string0 = icTuple0.thisClassString();
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals(1, icTuple0.thisClassIndex());
      assertEquals((-2285), icTuple0.getF());
      assertEquals("", string0);
      assertEquals("5<{Whx2$NP{qHQ", icTuple0.simpleClassName());
      assertNotNull(string0);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "6^uqilZe./", (String) null, 0, 0, 1215, (-695));
      int int0 = icTuple0.thisClassIndex();
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-695), icTuple0.getTupleIndex());
      assertEquals("6^uqilZe./", icTuple0.outerClassString());
      assertEquals(0, int0);
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3595), "X2$GQN;L:'.J'c", (String) null, 1332, 1332, (-355), (-1779));
      int int0 = icTuple0.thisClassIndex();
      assertEquals((-3595), icTuple0.getF());
      assertEquals((-1779), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(1332, int0);
      assertEquals("X2$GQN;L:'.J'c", icTuple0.getC2());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(":\"Pp72xRNF*K!6,>", 0, ":\"Pp72xRNF*K!6,>", "", 0, 0, 0, 0);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals(0, int0);
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertEquals(0, icTuple0.outerClassIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      int int0 = icTuple0.simpleClassNameIndex();
      assertFalse(icTuple0.isMember());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(2082, int0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2082, icTuple0.getF());
      assertEquals(2082, icTuple0.getTupleIndex());
      assertEquals(2082, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      String string0 = icTuple0.simpleClassName();
      assertEquals(2082, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(2082, icTuple0.getF());
      assertEquals(2082, icTuple0.simpleClassNameIndex());
      assertNotNull(string0);
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2082, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", (-414), 2410, (-2837), (-2837));
      String string0 = icTuple0.simpleClassName();
      assertNotNull(string0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-2837), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("xn{EKS!", (-6001), "xn{EKS!", "", (-6001), 17, (-714), 17);
      boolean boolean0 = icTuple0.outerIsAnonymous();
      assertTrue(icTuple0.isAnonymous());
      assertTrue(boolean0);
      assertEquals((-714), icTuple0.simpleClassNameIndex());
      assertEquals(17, icTuple0.outerClassIndex());
      assertEquals(17, icTuple0.getTupleIndex());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1, (String) null, "7up ", (-3026), 1, 0, 0);
      String string0 = icTuple0.outerClassString();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("7up ", icTuple0.simpleClassName());
      assertEquals(1, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNull(string0);
      assertEquals((-3026), icTuple0.thisClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "", "", (-414), 2410, (-2837), (-2837));
      String string0 = icTuple0.outerClassString();
      assertEquals(0, icTuple0.getF());
      assertEquals((-2837), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("a!8mCB|rewW =;uPz", 0, "N", (String) null, (-1), 0, 0, 0);
      int int0 = icTuple0.outerClassIndex();
      assertEquals(0, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("N", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
      assertEquals("=;uPz", icTuple0.simpleClassName());
      assertEquals(0, int0);
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("Should have an outer before checking if it's anonymous", 2, "Udsn", "", 2, 2, 2, 2);
      int int0 = icTuple0.outerClassIndex();
      assertEquals(2, icTuple0.getF());
      assertFalse(icTuple0.isMember());
      assertEquals(2, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2, icTuple0.getTupleIndex());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-1789), "Should have an outer before checking if it's anonymous", "", (-1789), (-1789), 0, (-1789));
      boolean boolean0 = icTuple0.isMember();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("Should have an outer before checking if it's anonymous", icTuple0.outerClassString());
      assertTrue(boolean0);
      assertEquals((-1789), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1789), icTuple0.getF());
      assertFalse(icTuple0.predicted());
      assertEquals("", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("4R?sD| ^Ah", (-680), "4R?sD| ^Ah", "", (-680), (-1), (-704), (-1762));
      boolean boolean0 = icTuple0.isAnonymous();
      assertTrue(icTuple0.isMember());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-704), icTuple0.simpleClassNameIndex());
      assertEquals((-1762), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(boolean0);
      assertEquals((-680), icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 0, "d\"5vVx", "", 4209, (-930), (-742), 0);
      int int0 = icTuple0.getTupleIndex();
      assertEquals(0, int0);
      assertEquals("d\"5vVx", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("", icTuple0.simpleClassName());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals(0, icTuple0.getF());
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1009, "", "", 803, 0, 0, (-1585));
      int int0 = icTuple0.getTupleIndex();
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(1009, icTuple0.getF());
      assertEquals((-1585), int0);
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("$", (-5939), "$", "\":Kk>", (-5939), (-5939), 0, 0);
      String string0 = icTuple0.getN();
      assertEquals((-5939), icTuple0.outerClassIndex());
      assertEquals((-5939), icTuple0.getF());
      assertNotNull(string0);
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals("\":Kk>", string0);
      assertFalse(icTuple0.isMember());
      assertEquals(0, icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      assertEquals(" in ", icTuple0.getN());
      
      icTuple0.N = "";
      icTuple0.getN();
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3595), "X2$GQN;L:'.J'c", (String) null, 1332, 1332, (-355), (-1779));
      assertTrue(icTuple0.nestedExplicitFlagSet());
      
      icTuple0.F = 0;
      int int0 = icTuple0.getF();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("4R?sD| ^Ah", (-680), "4R?sD| ^Ah", "", (-680), (-1), (-704), (-1762));
      int int0 = icTuple0.getF();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1762), icTuple0.getTupleIndex());
      assertEquals((-704), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.isAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals((-680), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("X^$K^iyH}dLzx\"VY", 0, "~I~;$(]Sjb_h?bnd{vj", "X^$K^iyH}dLzx\"VY", 0, 1471, 0, 0);
      assertEquals("~I~;$(]Sjb_h?bnd{vj", icTuple0.getC2());
      
      icTuple0.C2 = null;
      icTuple0.getC2();
      assertEquals(0, icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(0, icTuple0.getF());
      assertEquals(1471, icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      icTuple0.C2 = "org.apache.commons.compress.harmony.unpack200.IcTuple";
      icTuple0.C2 = "";
      icTuple0.getC2();
      assertFalse(icTuple0.isMember());
      assertEquals(2082, icTuple0.simpleClassNameIndex());
      assertEquals(2082, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals(2082, icTuple0.getF());
      assertEquals(2082, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isAnonymous());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2285), (String) null, "5<{Whx2$NP{qHQ", 1, (-2285), 0, 1);
      icTuple0.C = null;
      String string0 = icTuple0.getC();
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals("5<{Whx2$NP{qHQ", icTuple0.simpleClassName());
      assertNull(string0);
      assertEquals(1, icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-2285), icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("$", (-5939), "$", "\":Kk>", (-5939), (-5939), 0, 0);
      icTuple0.C = "";
      icTuple0.getC();
      assertEquals("", icTuple0.getC());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("IcTuple ", 992, "IcTuple ", (String) null, 992, 992, 992, 1734);
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
  public void test30()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple((String) null, (-2706), "^|  }&eB\"`,X3[J#?/c", "IcTuple ", (-2706), 3535, (-1229), (-1229));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("y;8O?9x:uye?", 936, (String) null, "3X[YJ", 936, 936, 66, 2073);
      boolean boolean0 = icTuple0.predicted();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(2073, icTuple0.getTupleIndex());
      assertEquals(936, icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("3X[YJ", icTuple0.getN());
      assertEquals(936, icTuple0.thisClassIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      boolean boolean0 = icTuple0.predicted();
      assertFalse(boolean0);
      assertFalse(icTuple0.isAnonymous());
      assertEquals(2082, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isMember());
      assertEquals(2082, icTuple0.simpleClassNameIndex());
      assertEquals(" in ", icTuple0.getN());
      assertEquals("org.apache.commons.compress.harmony.unpack200.IcTuple", icTuple0.getC2());
      assertEquals(2082, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("a!8mCB|rewW =;uPz", 0, "N", (String) null, (-1), 0, 0, 0);
      boolean boolean0 = icTuple0.predicted();
      assertEquals("=;uPz", icTuple0.simpleClassName());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertFalse(icTuple0.nestedExplicitFlagSet());
      assertEquals(0, icTuple0.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("W0>?'`3Rfq", 1, "W0>?'`3Rfq", "dKvu#1", 1, 2316, 2316, 1);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, (String) null);
      assertTrue(boolean0);
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals("W0>?'`3Rfq", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals(1, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-2285), (String) null, "5<{Whx2$NP{qHQ", 1, (-2285), 0, 1);
      boolean boolean0 = icTuple0.nullSafeEquals("", "");
      assertEquals((-2285), icTuple0.getF());
      assertEquals(1, icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals("5<{Whx2$NP{qHQ", icTuple0.simpleClassName());
      assertTrue(boolean0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      boolean boolean0 = icTuple0.nullSafeEquals((String) null, "org.apache.commons.compress.harmony.unpack200.IcTuple$ in ");
      assertFalse(icTuple0.outerIsAnonymous());
      assertFalse(icTuple0.isMember());
      assertEquals(2082, icTuple0.simpleClassNameIndex());
      assertFalse(boolean0);
      assertEquals(2082, icTuple0.outerClassIndex());
      assertFalse(icTuple0.isAnonymous());
      assertEquals(2082, icTuple0.getTupleIndex());
      assertEquals(" in ", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3595), "X2$GQN;L:'.J'c", (String) null, 1332, 1332, (-355), (-1779));
      assertEquals((-3595), icTuple0.getF());
      
      icTuple0.F = 0;
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" in ", 2082, "org.apache.commons.compress.harmony.unpack200.IcTuple", " in ", 2082, 2082, 2082, 2082);
      icTuple0.F = (-558);
      boolean boolean0 = icTuple0.nestedExplicitFlagSet();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1, (String) null, "7up ", (-3026), 1, 0, 0);
      String[] stringArray0 = icTuple0.innerBreakAtDollar("IcTuple (7up  in null)");
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("7up ", icTuple0.simpleClassName());
      assertEquals(5, stringArray0.length);
      assertEquals((-3026), icTuple0.thisClassIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(1, icTuple0.getF());
      assertEquals(0, icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3595), "X2$GQN;L:'.J'c", (String) null, 1332, 1332, (-355), (-1779));
      icTuple0.innerBreakAtDollar("");
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("X2$GQN;L:'.J'c", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
      assertEquals(1332, icTuple0.thisClassIndex());
      assertEquals((-3595), icTuple0.getF());
      assertEquals((-1779), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", (-3595), "X2$GQN;L:'.J'c", (String) null, 1332, 1332, (-355), (-1779));
      String string0 = icTuple0.simpleClassName();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("X2$GQN;L:'.J'c", icTuple0.outerClassString());
      assertEquals((-3595), icTuple0.getF());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(1332, icTuple0.thisClassIndex());
      assertTrue(icTuple0.isMember());
      assertNull(string0);
      assertEquals((-1779), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("xn{EKS!", (-6001), "xn{EKS!", "", (-6001), 17, (-714), 17);
      String string0 = icTuple0.outerClassString();
      assertTrue(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.isMember());
      assertEquals(17, icTuple0.getTupleIndex());
      assertEquals("xn{EKS!", string0);
      assertEquals((-6001), icTuple0.getF());
      assertEquals(17, icTuple0.outerClassIndex());
      assertEquals((-714), icTuple0.simpleClassNameIndex());
      assertEquals("", icTuple0.simpleClassName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("xn{EKS!", (-6001), "xn{EKS!", "", (-6001), 17, (-714), 17);
      int int0 = icTuple0.thisClassIndex();
      assertEquals(17, icTuple0.getTupleIndex());
      assertEquals((-1), int0);
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals((-714), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.nestedExplicitFlagSet());
      assertTrue(icTuple0.isAnonymous());
      assertEquals((-6001), icTuple0.getF());
      assertEquals(17, icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("xn{EKS!", (-6001), "xn{EKS!", "", (-6001), 17, (-714), 17);
      String string0 = icTuple0.thisClassString();
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals(17, icTuple0.getTupleIndex());
      assertEquals(17, icTuple0.outerClassIndex());
      assertEquals("xn{EKS!$", string0);
      assertEquals((-6001), icTuple0.getF());
      assertTrue(icTuple0.nestedExplicitFlagSet());
      assertEquals((-714), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("xn{EKS!", (-6001), "xn{EKS!", "", (-6001), 17, (-714), 17);
      icTuple0.hashCode();
      icTuple0.hashCode();
      assertTrue(icTuple0.isMember());
      assertEquals("", icTuple0.simpleClassName());
      assertEquals((-6001), icTuple0.getF());
      assertEquals((-714), icTuple0.simpleClassNameIndex());
      assertEquals(17, icTuple0.getTupleIndex());
      assertEquals(17, icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" 3n ", (-16), (String) null, " 3n ", (-16), (-16), (-16), (-16));
      icTuple0.N = " 3n ";
      icTuple0.N = null;
      icTuple0.hashCode();
      assertEquals((-16), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals("$3n", icTuple0.outerClassString());
      assertEquals((-16), icTuple0.thisClassIndex());
      assertTrue(icTuple0.nestedExplicitFlagSet());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("UKsjn", 1, (String) null, "UKsjn", 1, 1, 1, 1);
      icTuple0.C = null;
      icTuple0.hashCode();
      assertTrue(icTuple0.isMember());
      assertEquals(1, icTuple0.thisClassIndex());
      assertEquals(1, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(1, icTuple0.getF());
      assertEquals((-1), icTuple0.outerClassIndex());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 65536, "", "7up ", 65536, 65536, 65536, 65536);
      IcTuple icTuple1 = new IcTuple("", 65536, "", "", 65536, 65536, 65536, 65536);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertFalse(icTuple1.equals((Object)icTuple0));
      assertEquals("7up ", icTuple0.simpleClassName());
      assertEquals((-1), icTuple1.outerClassIndex());
      assertEquals("", icTuple0.outerClassString());
      assertFalse(boolean0);
      assertEquals(65536, icTuple1.getF());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals(65536, icTuple1.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1017, "", "", 1017, 1017, 1017, 1017);
      IcTuple icTuple1 = new IcTuple("", 65536, "*- b", "", (-1), 65536, 65536, 65536);
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals("", icTuple1.simpleClassName());
      assertTrue(icTuple1.isMember());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertEquals((-1), icTuple1.outerClassIndex());
      assertEquals(1017, icTuple0.getTupleIndex());
      assertEquals(65536, icTuple1.getF());
      assertEquals("*- b", icTuple1.outerClassString());
      assertEquals(1017, icTuple0.getF());
      assertFalse(icTuple1.predicted());
      assertFalse(boolean0);
      assertFalse(icTuple1.equals((Object)icTuple0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("xn{EKS!", (-6001), "xn{EKS!", "", (-6001), 17, (-714), 17);
      icTuple0.equals("");
      assertEquals((-6001), icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertTrue(icTuple0.isAnonymous());
      assertEquals(17, icTuple0.getTupleIndex());
      assertEquals(17, icTuple0.outerClassIndex());
      assertEquals((-714), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(" 3n ", (-16), (String) null, " 3n ", (-16), (-16), (-16), (-16));
      boolean boolean0 = icTuple0.equals(icTuple0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-16), icTuple0.getTupleIndex());
      assertTrue(boolean0);
      assertEquals((-16), icTuple0.getF());
      assertEquals((-16), icTuple0.simpleClassNameIndex());
      assertFalse(icTuple0.isMember());
      assertTrue(icTuple0.outerIsAnonymous());
      assertEquals("$3n", icTuple0.outerClassString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 65536, "", "7up ", 65536, 65536, 65536, 65536);
      boolean boolean0 = icTuple0.equals((Object) null);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals("7up ", icTuple0.simpleClassName());
      assertFalse(icTuple0.predicted());
      assertFalse(boolean0);
      assertTrue(icTuple0.isMember());
      assertEquals("", icTuple0.outerClassString());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(65536, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IcTuple icTuple0 = null;
      try {
        icTuple0 = new IcTuple(" in ", 714, "", "Ef", (-300), 1, 0, 41);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Should have an outer before checking if it's anonymous
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.IcTuple", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1, (String) null, "7up ", (-3026), 1, 0, 0);
      IcTuple icTuple1 = new IcTuple("", 0, "", (String) null, (-3026), 1, (-1544), 65536);
      icTuple0.C = null;
      boolean boolean0 = icTuple0.equals(icTuple1);
      assertEquals(65536, icTuple1.getTupleIndex());
      assertEquals("7up ", icTuple0.simpleClassName());
      assertEquals((-1), icTuple1.outerClassIndex());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals(1, icTuple0.getF());
      assertTrue(icTuple1.predicted());
      assertEquals((-1), icTuple1.simpleClassNameIndex());
      assertFalse(boolean0);
      assertTrue(icTuple1.isMember());
      assertEquals((-3026), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("#S", (-1854), "~fo", "#S", (-1854), (-1854), (-1854), (-1854));
      boolean boolean0 = icTuple0.isMember();
      assertEquals((-1854), icTuple0.simpleClassNameIndex());
      assertFalse(boolean0);
      assertEquals((-1854), icTuple0.getF());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-1854), icTuple0.getTupleIndex());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 65536, "", "7up ", 65536, 65536, 65536, 65536);
      int int0 = icTuple0.outerClassIndex();
      assertEquals((-1), int0);
      assertEquals("7up ", icTuple0.simpleClassName());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertFalse(icTuple0.predicted());
      assertEquals("", icTuple0.outerClassString());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(65536, icTuple0.getF());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1017, "", "", 1017, 1017, 1017, 1017);
      int int0 = icTuple0.simpleClassNameIndex();
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals(1017, icTuple0.getF());
      assertEquals(1017, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
      assertEquals((-1), int0);
      assertTrue(icTuple0.isMember());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("#S", (-1854), "~fo", "#S", (-1854), (-1854), (-1854), (-1854));
      String string0 = icTuple0.getC2();
      assertEquals((-1854), icTuple0.outerClassIndex());
      assertEquals("~fo", string0);
      assertEquals("#S", icTuple0.simpleClassName());
      assertFalse(icTuple0.isMember());
      assertEquals((-1854), icTuple0.getF());
      assertFalse(icTuple0.outerIsAnonymous());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 65536, "", "7up ", 65536, 65536, 65536, 65536);
      int int0 = icTuple0.getF();
      assertEquals("7up ", icTuple0.simpleClassName());
      assertTrue(icTuple0.isMember());
      assertEquals(65536, int0);
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple(",", (-293), "IcTuple ", (String) null, (-293), (-293), 3096, 0);
      boolean boolean0 = icTuple0.outerIsAnonymous();
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals("IcTuple ", icTuple0.outerClassString());
      assertEquals((-293), icTuple0.getF());
      assertTrue(icTuple0.isMember());
      assertEquals(0, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-293), icTuple0.thisClassIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("a!8mCB|rewW =;uPz", (-13), "a!8mCB|rewW =;uPz", (String) null, (-13), (-13), (-13), (-13));
      String string0 = icTuple0.getN();
      assertEquals((-13), icTuple0.outerClassIndex());
      assertNull(string0);
      assertTrue(icTuple0.isMember());
      assertEquals("=;uPz", icTuple0.simpleClassName());
      assertFalse(icTuple0.outerIsAnonymous());
      assertEquals((-13), icTuple0.getF());
      assertEquals((-13), icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 65536, "", "7up ", 65536, 65536, 65536, 65536);
      icTuple0.isAnonymous();
      assertEquals(65536, icTuple0.getF());
      assertEquals(65536, icTuple0.getTupleIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals("7up ", icTuple0.simpleClassName());
      assertTrue(icTuple0.isMember());
      assertEquals((-1), icTuple0.thisClassIndex());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("", 1017, "", "", 1017, 1017, 1017, 1017);
      int int0 = icTuple0.getTupleIndex();
      assertEquals(1017, int0);
      assertEquals((-1), icTuple0.outerClassIndex());
      assertEquals((-1), icTuple0.simpleClassNameIndex());
      assertTrue(icTuple0.isMember());
      assertEquals(1017, icTuple0.getF());
      assertFalse(icTuple0.predicted());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IcTuple icTuple0 = new IcTuple("#S", (-1854), "~fo", "#S", (-1854), (-1854), (-1854), (-1854));
      icTuple0.getC();
      assertEquals((-1854), icTuple0.getTupleIndex());
      assertFalse(icTuple0.isMember());
      assertEquals((-1854), icTuple0.outerClassIndex());
      assertEquals("#S", icTuple0.simpleClassName());
      assertFalse(icTuple0.outerIsAnonymous());
      assertTrue(icTuple0.nestedExplicitFlagSet());
  }
}
