
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
import java.util.IdentityHashMap;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentConstantPoolArrayCache_ESTest extends SegmentConstantPoolArrayCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[2];
      segmentConstantPoolArrayCache0.lastArray = stringArray0;
      IdentityHashMap<String[], SegmentConstantPoolArrayCache.CachedArray> identityHashMap0 = new IdentityHashMap<String[], SegmentConstantPoolArrayCache.CachedArray>();
      segmentConstantPoolArrayCache0.knownArrays = identityHashMap0;
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      segmentConstantPoolArrayCache_CachedArray0.lastKnownSize = (-1728);
      identityHashMap0.put(segmentConstantPoolArrayCache0.lastArray, segmentConstantPoolArrayCache_CachedArray0);
      segmentConstantPoolArrayCache0.cacheArray(segmentConstantPoolArrayCache0.lastArray);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[2];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      segmentConstantPoolArrayCache_CachedArray0.cacheIndexes();
      assertEquals(2, segmentConstantPoolArrayCache_CachedArray0.lastKnownSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[2];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      segmentConstantPoolArrayCache0.cacheArray(stringArray0);
      boolean boolean0 = segmentConstantPoolArrayCache0.arrayIsCached(segmentConstantPoolArrayCache_CachedArray0.primaryArray);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[3];
      segmentConstantPoolArrayCache0.knownArrays = null;
      // Undeclared exception!
      try { 
        segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, "s6kD_ ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[5];
      segmentConstantPoolArrayCache0.knownArrays = null;
      // Undeclared exception!
      try { 
        segmentConstantPoolArrayCache0.cacheArray(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[3];
      segmentConstantPoolArrayCache0.knownArrays = null;
      // Undeclared exception!
      try { 
        segmentConstantPoolArrayCache0.arrayIsCached(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[0];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      List<Integer> list0 = segmentConstantPoolArrayCache_CachedArray0.indexesForKey("`9p'K]msF}`");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      List<Integer> list0 = segmentConstantPoolArrayCache_CachedArray0.indexesForKey("");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[5];
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(stringArray0);
      int int0 = segmentConstantPoolArrayCache_CachedArray0.lastKnownSize();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[4];
      List<Integer> list0 = segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, (String) null);
      assertNotNull(list0);
      assertEquals(4, list0.size());
      
      List<Integer> list1 = segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, "");
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[6];
      segmentConstantPoolArrayCache0.lastArray = stringArray0;
      IdentityHashMap<String[], SegmentConstantPoolArrayCache.CachedArray> identityHashMap0 = segmentConstantPoolArrayCache0.knownArrays;
      SegmentConstantPoolArrayCache.CachedArray segmentConstantPoolArrayCache_CachedArray0 = segmentConstantPoolArrayCache0.new CachedArray(segmentConstantPoolArrayCache0.lastArray);
      segmentConstantPoolArrayCache_CachedArray0.lastKnownSize = 2148;
      identityHashMap0.put(segmentConstantPoolArrayCache0.lastArray, segmentConstantPoolArrayCache_CachedArray0);
      assertEquals(2148, segmentConstantPoolArrayCache_CachedArray0.lastKnownSize());
      
      boolean boolean0 = segmentConstantPoolArrayCache0.arrayIsCached(stringArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentConstantPoolArrayCache segmentConstantPoolArrayCache0 = new SegmentConstantPoolArrayCache();
      String[] stringArray0 = new String[4];
      segmentConstantPoolArrayCache0.indexesForArrayKey(stringArray0, (String) null);
      // Undeclared exception!
      try { 
        segmentConstantPoolArrayCache0.cacheArray(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Trying to cache an array that already exists
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPoolArrayCache", e);
      }
  }
}
