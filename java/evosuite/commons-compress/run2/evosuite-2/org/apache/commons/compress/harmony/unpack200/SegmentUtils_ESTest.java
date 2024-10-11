
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
      int int0 = SegmentUtils.countInvokeInterfaceArgs("Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)");
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long[][] longArray0 = new long[9][5];
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
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs((String) null, 2777);
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
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[0] = 763L;
      AttributeLayout attributeLayout0 = new AttributeLayout("archive_size_lo", 1, "", 1, true);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long[] longArray0 = new long[4];
      AttributeLayout attributeLayout0 = new AttributeLayout("^CRPBWP/MB~~.F_+^!", 2, "^CRPBWP/MB~~.F_+^!", (-1148));
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long[] longArray0 = new long[3];
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
  public void test10()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("v(duw\"J*C>KmO)!k 4", 11);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("~)WAj@<EV(", 9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("z.@Q^/xm=E2rN^.]`mi", 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long[][] longArray0 = new long[9][1];
      long[] longArray1 = new long[7];
      longArray1[3] = (-1L);
      longArray0[4] = longArray1;
      AttributeLayout attributeLayout0 = new AttributeLayout("Nothing but CP_METHOD can be an <init>", 0, "Nothing but CP_METHOD can be an <init>", 0);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long[][] longArray0 = new long[9][1];
      AttributeLayout attributeLayout0 = new AttributeLayout("Nothing but CP_METHOD can be an <init>", 0, "Nothing but CP_METHOD can be an <init>", 0);
      int int0 = SegmentUtils.countMatches(longArray0, (IMatcher) attributeLayout0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long[][] longArray0 = new long[9][1];
      long[] longArray1 = new long[7];
      longArray1[3] = (-1L);
      longArray0[4] = longArray1;
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long[][] longArray0 = new long[9][1];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[4];
      longArray0[2] = (-548L);
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long[] longArray0 = new long[9];
      int int0 = SegmentUtils.countBit16(longArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1427);
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = SegmentUtils.countBit16(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("v(duw\"J*C>KmO)!k 4");
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = SegmentUtils.countArgs("Can't read beyond end of stream (n = %,d, count = %,d, maxLength = %,d, remaining = %,d)", 395);
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs(")( n(G+46:E0X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countArgs("ro3Gn(9@%v[yu20dg", 169);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentUtils.countInvokeInterfaceArgs(";j<xlN}uVz<Fs)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      SegmentUtils segmentUtils0 = new SegmentUtils();
  }
}
