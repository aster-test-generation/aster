
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
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.IMatcher;
import org.apache.commons.compress.harmony.unpack200.SegmentUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentUtils_ESTest extends SegmentUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long[][] longArray0 = new long[5][6];
      long[] longArray1 = new long[9];
      longArray1[1] = (long) 1191;
      longArray0[2] = longArray1;
      AttributeLayout attributeLayout0 = new AttributeLayout("MethoddRef", 0, "MethoddRef", 0, false);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = SegmentUtils.countInvokeInterfaceArgs("_ra-'L()!N1O1P");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("_ra-'L()!N1O1P", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("es(j#|$JQQ6PW@I)~S", (-3629));
      assertEquals((-3618), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("_ra-'L()!N1O1P");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[][] longArray0 = new long[3][0];
      long[] longArray1 = new long[4];
      longArray0[0] = longArray1;
      // Undeclared exception!
      try { 
        SegmentUtils.countMatches(longArray0, (IMatcher) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[1];
      // Undeclared exception!
      try { 
        SegmentUtils.countMatches(longArray0, (IMatcher) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countInvokeInterfaceArgs((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countBit16((long[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countBit16((long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countBit16((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs((String) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("es(jD|$JQQ6PW@4I)~S", 1730);
      assertEquals(3471, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("/(-{[l5Z)Q~TH+K}qeZ", 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("Hf.(-2^/ijcH8|UY<8$", 68);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("]\"$>Tw)6V/ja\"(W", 256);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("k4L{RJpc{ot^)3Ha", 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[0];
      long[][] longArray1 = new long[4][4];
      longArray1[0] = longArray0;
      longArray1[1] = longArray0;
      longArray1[2] = longArray0;
      longArray1[3] = longArray0;
      int int0 = SegmentUtils.countMatches(longArray1, (IMatcher) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long[] longArray0 = new long[18];
      longArray0[4] = (-117L);
      AttributeLayout attributeLayout0 = new AttributeLayout("No arguments", 0, "org.apache.commons.compress.harmony.unpack200.AttributeLayout", 0, true);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long[] longArray0 = new long[18];
      AttributeLayout attributeLayout0 = new AttributeLayout("No arguments", 0, "org.apache.commons.compress.harmony.unpack200.AttributeLayout", 0, true);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      long[][] longArray0 = new long[1][1];
      long[] longArray1 = new long[18];
      longArray1[4] = (-117L);
      longArray0[0] = longArray1;
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long[][] longArray0 = new long[1][1];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[2] = 2147483647L;
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      long[] longArray0 = new long[3];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[10];
      intArray0[5] = (-616);
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[10];
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = SegmentUtils.countInvokeInterfaceArgs("es(jD|$JQQ6PW@4I)~S");
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)", 81);
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countInvokeInterfaceArgs("7)(H*[iA,u5Ychz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("org.apache.commons.compress.harmony.unpack200.Attributeayout");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentUtils segmentUtils0 = new SegmentUtils();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("*(F-{[l5Z)Q~TH+KqeZ");
      assertEquals(6, int0);
  }
}
