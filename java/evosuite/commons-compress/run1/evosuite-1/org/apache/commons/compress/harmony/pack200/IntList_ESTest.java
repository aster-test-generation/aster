
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.pack200.IntList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IntList_ESTest extends IntList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      assertEquals(1, intList0.size());
      
      intList0.remove(0);
      assertEquals(0, intList0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.remove(412);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.increment(630);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 630
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0);
      intList0.add((-183));
      intList0.add(0, 15);
      assertEquals(3, intList0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      // Undeclared exception!
      intList0.addAll(intList0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(522);
      IntList intList1 = new IntList();
      intList0.addAll(intList1);
      assertFalse(intList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.addAll(intList0);
      assertEquals(0, intList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.get(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntList intList0 = new IntList();
      IntList intList1 = new IntList();
      intList1.add(0, 1317);
      intList0.addAll(intList1);
      assertEquals(1, intList1.size());
      assertEquals(1, intList0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.add((-1), (-918));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0);
      intList0.toArray();
      assertEquals(1, intList0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntList intList0 = new IntList(2689);
      intList0.add(2689);
      int int0 = intList0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntList intList0 = new IntList(887);
      intList0.add(887);
      int int0 = intList0.remove(0);
      assertTrue(intList0.isEmpty());
      assertEquals(887, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add((-38));
      int int0 = intList0.remove(0);
      assertEquals(0, intList0.size());
      assertEquals((-38), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntList intList0 = new IntList(0);
      boolean boolean0 = intList0.add(0);
      assertTrue(boolean0);
      
      int int0 = intList0.get(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntList intList0 = new IntList(418);
      intList0.add(418);
      int int0 = intList0.get(0);
      assertEquals(1, intList0.size());
      assertEquals(418, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntList intList0 = new IntList(1);
      // Undeclared exception!
      try { 
        intList0.addAll((IntList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add((-398));
      int int0 = intList0.get(0);
      assertEquals(1, intList0.size());
      assertEquals((-398), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntList intList0 = new IntList(418);
      int int0 = intList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.remove((-1439));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntList intList0 = new IntList();
      boolean boolean0 = intList0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add((-398));
      boolean boolean0 = intList0.isEmpty();
      assertEquals(1, intList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      intList0.increment(0);
      assertEquals(1, intList0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.increment(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.increment((-2804));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -2804
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0);
      intList0.add(0, 0);
      intList0.remove(0);
      assertFalse(intList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.get(4035);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 4035
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IntList intList0 = new IntList(0);
      // Undeclared exception!
      try { 
        intList0.get((-2844));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -2844
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.clear();
      assertEquals(0, intList0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IntList intList0 = new IntList(0);
      intList0.add(0, 0);
      intList0.add(0, 0);
      assertEquals(2, intList0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IntList intList0 = new IntList();
      // Undeclared exception!
      try { 
        intList0.add(2, (-581));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IntList intList0 = new IntList();
      intList0.add(0);
      assertFalse(intList0.isEmpty());
      
      intList0.clear();
      assertEquals(0, intList0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IntList intList0 = null;
      try {
        intList0 = new IntList((-1565));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IntList intList0 = new IntList();
      int[] intArray0 = intList0.toArray();
      assertEquals(0, intArray0.length);
  }
}
