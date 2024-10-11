
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
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentConstantPool_ESTest extends SegmentConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[8];
      stringArray0[4] = "[^z\"_mB*ney}ur";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "[^z\"_mB*ney}ur", (-1793));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[7];
      stringArray0[3] = "I don't know what to do with signatures yet";
      stringArray0[5] = "I don't know what to do with signatures yet";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "I don't know what to do with signatures yet", 5);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue((-613), 2046L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Tried to get a value I don't know about: -613
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(7, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(6, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(5, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(4, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(1, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getInitMethodPoolEntry(58, 58, "L'^e$*>b 0.Cm");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Nothing but CP_METHOD can be an <init>
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(7, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(6, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(5, 421L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(3, 404L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(2, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(0, 0L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Get value incomplete
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry((-2797), 4294967296L, "");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Don't know how to handle -2797
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches("^<init>.*", "Don't know how to handle ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches(".*", ".*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[2];
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray0, "Uem", "?", 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex((String[]) null, stringArray0, "X", "*XwL!q", 11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray0, "", "Rqe76lp~0#yi|Idx:", (-2774));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // regex trying to match a pattern I don't know: Rqe76lp~0#yi|Idx:
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[3];
      stringArray0[2] = "6>4~0^f:>Qf^n2iS";
      String[] stringArray1 = new String[0];
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray1, "6>4~0^f:>Qf^n2iS", "SED<Zcd4W3wVZeUv/A", 2194);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex((String[]) null, "Cannot have a negative range", 1019);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassPoolEntry("bDki2lg2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(9, 1340L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(8, 15L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(7, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(5, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(4, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(3, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(2, 6L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(1, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        segmentConstantPool0.getValue(0, (-1592L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      ClassFileEntry classFileEntry0 = segmentConstantPool0.getValue(1664, (-1L));
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(6, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getInitMethodPoolEntry(5, 58, "");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Nothing but CP_METHOD can be an <init>
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getInitMethodPoolEntry(11, 0L, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(12, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(11, 404L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(10, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(9, 9);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // I don't know what to do with descriptors yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(7, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(6, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(4, 404L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(1, 414L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        segmentConstantPool0.getConstantPoolEntry((-2777), (-2608L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      ConstantPoolEntry constantPoolEntry0 = segmentConstantPool0.getConstantPoolEntry(4, (-1));
      assertNull(constantPoolEntry0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(8, (byte)7);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // I don't know what to do with signatures yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(12, 1640L, "+|2@MQlp5Y^q.D59um");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(11, 2722L, "e[,ceV?r`_)_&,N>^");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(10, 1640L, "+|2@MQlp5Y^q.D59um");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches("^<init>.*", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[3];
      stringArray0[1] = "";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "", 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentConstantPool.regexMatches("Ibv\"<XVp$Ye {b", "^dl#sw!B_]A66Epp(Xe");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // regex trying to match a pattern I don't know: Ibv\"<XVp$Ye {b
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }
}
