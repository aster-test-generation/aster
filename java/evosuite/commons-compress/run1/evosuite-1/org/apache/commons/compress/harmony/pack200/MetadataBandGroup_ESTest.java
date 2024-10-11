
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
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.compress.harmony.pack200.CpBands;
import org.apache.commons.compress.harmony.pack200.IntList;
import org.apache.commons.compress.harmony.pack200.MetadataBandGroup;
import org.apache.commons.compress.harmony.pack200.SegmentHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MetadataBandGroup_ESTest extends MetadataBandGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      intArray0[2] = (-4630);
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("\"K", (-4630), (CpBands) null, segmentHeader0, 1661);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation((-4630), intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(2, MetadataBandGroup.CONTEXT_METHOD);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      linkedList0.offerFirst("");
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 90, (CpBands) null, segmentHeader0, 0);
      LinkedList<String> linkedList3 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(99, intArray0, metadataBandGroup0.pair_N, linkedList3, linkedList0, (List<String>) null, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" ", 80, (CpBands) null, segmentHeader0, 0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      int[] intArray0 = new int[3];
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) metadataBandGroup0.T);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(80, intArray0, metadataBandGroup0.pair_N, list0, metadataBandGroup0.T, list0, linkedList1, linkedList2, list0, list0, linkedList2);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 1733, (CpBands) null, segmentHeader0, 1733);
      int[] intArray0 = new int[9];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      linkedList0.offerFirst("");
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(1733, intArray0, metadataBandGroup0.pair_N, linkedList0, linkedList0, linkedList0, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[9];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 90, (CpBands) null, segmentHeader0, 0);
      LinkedList<String> linkedList3 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(99, intArray0, metadataBandGroup0.nestpair_N, linkedList3, linkedList0, (List<String>) null, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" ", 80, (CpBands) null, segmentHeader0, 0);
      metadataBandGroup0.newEntryInAnnoN();
      metadataBandGroup0.incrementAnnoN();
      assertEquals(1, MetadataBandGroup.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("\"K", (-4630), (CpBands) null, segmentHeader0, (-4630));
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList1.addLast((Integer) metadataBandGroup0.CONTEXT_FIELD);
      assertEquals(0, metadataBandGroup0.numBackwardsCalls());
      
      metadataBandGroup0.addParameterAnnotation((-4630), intArray0, metadataBandGroup0.nestpair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 1733, (CpBands) null, segmentHeader0, 1733);
      int[] intArray0 = new int[9];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      linkedList2.offerFirst((Integer) (-1));
      metadataBandGroup0.addParameterAnnotation((-644), intArray0, metadataBandGroup0.anno_N, linkedList0, linkedList0, linkedList0, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" ", 80, (CpBands) null, segmentHeader0, 0);
      metadataBandGroup0.newEntryInAnnoN();
      metadataBandGroup0.type_RS = null;
      // Undeclared exception!
      try { 
        metadataBandGroup0.removeLatest();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RH7SA#nzVRsJLv#*", 66, (CpBands) null, segmentHeader0, 73);
      // Undeclared exception!
      try { 
        metadataBandGroup0.removeLatest();
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
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      int[] intArray0 = segmentHeader0.integerListToArray(linkedList0);
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Method and Field entries...", 3184, (CpBands) null, segmentHeader0, 0);
      IntList intList0 = metadataBandGroup0.pair_N;
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      metadataBandGroup0.anno_N = intList0;
      LinkedList<String> linkedList2 = new LinkedList<String>();
      // Undeclared exception!
      metadataBandGroup0.addParameterAnnotation(445, intArray0, intList0, metadataBandGroup0.T, linkedList2, metadataBandGroup0.T, linkedList1, linkedList0, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" ", 80, (CpBands) null, segmentHeader0, 0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        metadataBandGroup0.addAnnotation("hJ!}M*2!2I?", metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" ", 80, (CpBands) null, segmentHeader0, 0);
      boolean boolean0 = metadataBandGroup0.hasContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      int[] intArray0 = new int[3];
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("\"K", (-4630), (CpBands) null, segmentHeader0, 1661);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation((-4630), intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(1, MetadataBandGroup.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Method and Field entries...", 3184, (CpBands) null, segmentHeader0, 0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      metadataBandGroup0.pack(byteArrayOutputStream0);
      assertFalse(metadataBandGroup0.hasContent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("<a`@S6", 67, (CpBands) null, segmentHeader0, 67);
      // Undeclared exception!
      try { 
        metadataBandGroup0.incrementAnnoN();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" ", 80, (CpBands) null, segmentHeader0, 0);
      metadataBandGroup0.newEntryInAnnoN();
      // Undeclared exception!
      try { 
        metadataBandGroup0.removeLatest();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" ", 80, (CpBands) null, segmentHeader0, 0);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(0, int0);
  }
}
