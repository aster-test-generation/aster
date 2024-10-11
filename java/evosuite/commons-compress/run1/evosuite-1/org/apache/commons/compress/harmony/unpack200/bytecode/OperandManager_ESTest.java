
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


package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OperandManager_ESTest extends OperandManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextWideByteCode();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextWideByteCode();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 867;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextThisMethodRef();
      assertEquals(867, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextThisMethodRef();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextThisFieldRef();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-2873);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextThisFieldRef();
      assertEquals((-2873), int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 89;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextSuperMethodRef();
      assertEquals(89, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2347);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextSuperMethodRef();
      assertEquals((-2347), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextSuperFieldRef();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextSuperFieldRef();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextStringRef();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-3701);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextStringRef();
      assertEquals((-3701), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 657;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextShort();
      assertEquals(657, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextShort();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 89;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextMethodRef();
      assertEquals(89, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2347);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextMethodRef();
      assertEquals((-2347), int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 1060;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLongRef();
      assertEquals(1060, int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[7];
      int[] intArray2 = new int[9];
      intArray2[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray2, intArray2, intArray1, intArray0, intArray0, intArray0, intArray2, intArray1, intArray2, intArray0, (int[]) null, intArray0, intArray1, intArray2);
      int int0 = operandManager0.nextLongRef();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 1060;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLocal();
      assertEquals(1060, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLocal();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 1060;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLabel();
      assertEquals(1060, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2347);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLabel();
      assertEquals((-2347), int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 31;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextIntRef();
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2347);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextIntRef();
      assertEquals((-2347), int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 867;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextInitRef();
      assertEquals(867, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null);
      int int0 = operandManager0.nextInitRef();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextIMethodRef();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2347);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextIMethodRef();
      assertEquals((-2347), int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 1060;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextFloatRef();
      assertEquals(1060, int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-352);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextFloatRef();
      assertEquals((-352), int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 867;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextFieldRef();
      assertEquals(867, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-2347);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextFieldRef();
      assertEquals((-2347), int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 1060;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextDoubleRef();
      assertEquals(1060, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-3701);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextDoubleRef();
      assertEquals((-3701), int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextClassRef();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-1737);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextClassRef();
      assertEquals((-1737), int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 89;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextCaseValues();
      assertEquals(89, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-1737);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextCaseValues();
      assertEquals((-1737), int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextCaseCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[2] = (-622);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.bcCaseCountIndex = 2;
      int int0 = operandManager0.nextCaseCount();
      assertEquals((-622), int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextByte();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextByte();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.superClass = "";
      String string0 = operandManager0.getSuperClass();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.newClass = "X";
      String string0 = operandManager0.getNewClass();
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setCurrentClass("X");
      String string0 = operandManager0.getCurrentClass();
      assertEquals("X", string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextWideByteCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextWideByteCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextThisMethodRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextThisMethodRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextThisFieldRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.bcThisFieldIndex = 357;
      // Undeclared exception!
      try { 
        operandManager0.nextThisFieldRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 357
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextSuperMethodRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextSuperMethodRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextSuperFieldRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextSuperFieldRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      int[] intArray0 = new int[0];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextStringRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.nextStringRef();
      // Undeclared exception!
      try { 
        operandManager0.nextStringRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextShort();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.bcShortIndex = 9;
      // Undeclared exception!
      try { 
        operandManager0.nextShort();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.bcMethodRef = null;
      // Undeclared exception!
      try { 
        operandManager0.nextMethodRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.bcMethodRefIndex = 11;
      // Undeclared exception!
      try { 
        operandManager0.nextMethodRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextLongRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextLongRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray1, intArray1, intArray1, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextLocal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int[] intArray0 = new int[6];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextLocal();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextLabel();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextLabel();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextIntRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, (int[]) null, intArray0, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextIntRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextInitRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextInitRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextIMethodRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextIMethodRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextFloatRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int[] intArray0 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextFloatRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextFieldRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextFieldRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextDoubleRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextDoubleRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextClassRef();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray0);
      operandManager0.nextClassRef();
      // Undeclared exception!
      try { 
        operandManager0.nextClassRef();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, intArray1, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextCaseValues();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextCaseValues();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.nextCaseCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.bcCaseCountIndex = 7;
      // Undeclared exception!
      try { 
        operandManager0.nextCaseCount();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null);
      // Undeclared exception!
      try { 
        operandManager0.nextByte();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1);
      // Undeclared exception!
      try { 
        operandManager0.nextByte();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.getSuperClass();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // SuperClass not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.getNewClass();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // New class not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.newClass = "";
      String string0 = operandManager0.getNewClass();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.getCurrentClass();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Current class not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextFieldRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setCurrentClass("");
      String string0 = operandManager0.getCurrentClass();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        operandManager0.globalConstantPool();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextCaseValues();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLabel();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextSuperMethodRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0);
      int int0 = operandManager0.nextIntRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextFloatRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setSuperClass("Current class not set yet");
      String string0 = operandManager0.getSuperClass();
      assertEquals("Current class not set yet", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextDoubleRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setSegment((Segment) null);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextInitRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextSuperFieldRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLongRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setNewClass("Currnt class not set yet");
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextWideByteCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextThisMethodRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextCaseCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextLocal();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextMethodRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0);
      int int0 = operandManager0.nextThisFieldRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextIMethodRef();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextByte();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = operandManager0.nextShort();
      assertEquals(0, int0);
  }
}
