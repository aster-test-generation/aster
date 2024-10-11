
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
      String[] stringArray0 = new String[7];
      stringArray0[2] = "Shz]:^e1Xd$.8|+2ys";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "Shz]:^e1Xd$.8|+2ys", (-200));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "", 5);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(3362, 0L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Tried to get a value I don't know about: 3362
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(9, 0L);
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
        segmentConstantPool0.getValue(8, 3);
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(2, 1L);
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
        segmentConstantPool0.getInitMethodPoolEntry(2405, 2405, "");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Nothing but CP_METHOD can be an <init>
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(7, 6L);
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
        segmentConstantPool0.getConstantPoolEntry(6, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(5, 0L);
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
        segmentConstantPool0.getConstantPoolEntry(4, 3);
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
        segmentConstantPool0.getConstantPoolEntry(3, 7L);
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
        segmentConstantPool0.getConstantPoolEntry(1, 20L);
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
        segmentConstantPool0.getClassSpecificPoolEntry((-200), 0L, "");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Don't know how to handle -200
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches(".*", ".*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Get value incomplete";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "Get value incomplete", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentConstantPool.regexMatches("^<init>.*", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex((String[]) null, (String[]) null, "Z%>:_W>!", "Z%>:_W>!", 150);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache$CachedArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[5];
      stringArray0[2] = "FYlVZfo?}%WG";
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray0, "FYlVZfo?}%WG", "FYlVZfo?}%WG", (-3433));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // regex trying to match a pattern I don't know: FYlVZfo?}%WG
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[5];
      stringArray0[4] = "cp_Utf8_chars";
      String[] stringArray1 = new String[2];
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray1, "cp_Utf8_chars", "cp_Utf8_chars", (byte)70);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.matchSpecificPoolEntryIndex((String[]) null, (String) null, 135);
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
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassPoolEntry(".class");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "^<init>.*";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, stringArray0, "^<init>.*", "^<init>.*", (-2186));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(9, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(8, 8);
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
        segmentConstantPool0.getValue(6, 6);
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(3, 1L);
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
  public void test32()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      ClassFileEntry classFileEntry0 = segmentConstantPool0.getValue((-1), (-1));
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        segmentConstantPool0.getValue((-743), (-743));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getInitMethodPoolEntry((-1884), 0L, "[eqX<zDg");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Nothing but CP_METHOD can be an <init>
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getInitMethodPoolEntry(11, 11, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(1529, 2659L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Get value incomplete
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(12, 12);
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
        segmentConstantPool0.getConstantPoolEntry(11, 11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(10, 0L);
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
        segmentConstantPool0.getConstantPoolEntry(9, 297L);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // I don't know what to do with descriptors yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(8, 4);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // I don't know what to do with signatures yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(7, 0L);
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
  public void test44()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(5, 9);
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
        segmentConstantPool0.getConstantPoolEntry(3, 0L);
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
      try { 
        segmentConstantPool0.getConstantPoolEntry((-1882135627), (-1882135627));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      ConstantPoolEntry constantPoolEntry0 = segmentConstantPool0.getConstantPoolEntry(1529, (-1L));
      assertNull(constantPoolEntry0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getConstantPoolEntry(4, 0L);
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
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(12, (-302L), "Don't know how to handle ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(11, 0, "\"C^]J=DkG");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getClassSpecificPoolEntry(10, (-1), "\"C^]J=DkG");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = SegmentConstantPool.regexMatches("^<init>.*", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        SegmentConstantPool.regexMatches((String) null, "");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // regex trying to match a pattern I don't know: null
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[8];
      stringArray0[6] = "1n!3+Oe!au A`";
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "1n!3+Oe!au A`", 0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      String[] stringArray0 = new String[8];
      int int0 = segmentConstantPool0.matchSpecificPoolEntryIndex(stringArray0, "1n!3+Oe!au A`", 0);
      assertEquals((-1), int0);
  }
}
