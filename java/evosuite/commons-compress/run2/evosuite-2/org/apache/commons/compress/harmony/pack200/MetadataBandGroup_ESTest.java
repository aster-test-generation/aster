
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
import java.io.OutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.compress.harmony.pack200.CpBands;
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 80);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1626);
      metadataBandGroup0.addParameterAnnotation(8684, intArray0, metadataBandGroup0.anno_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(1, MetadataBandGroup.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 80);
      int[] intArray0 = new int[3];
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) metadataBandGroup0.T, locale_FilteringMode0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(1129, intArray0, metadataBandGroup0.casearray_N, list0, metadataBandGroup0.T, list0, linkedList1, linkedList2, metadataBandGroup0.T, list0, linkedList2);
      assertEquals(1, MetadataBandGroup.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 11, (CpBands) null, segmentHeader0, 11);
      int[] intArray0 = new int[3];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      linkedList0.add("@#Ppxeee4l~O");
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(11, intArray0, metadataBandGroup0.pair_N, linkedList0, linkedList0, linkedList0, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 11, (CpBands) null, segmentHeader0, 11);
      int[] intArray0 = new int[3];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      MetadataBandGroup metadataBandGroup1 = new MetadataBandGroup("goLM ", 5825, (CpBands) null, segmentHeader0, 6);
      metadataBandGroup0.addParameterAnnotation(5825, intArray0, metadataBandGroup0.nestpair_N, metadataBandGroup1.T, metadataBandGroup1.T, metadataBandGroup1.T, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
      assertEquals(0, metadataBandGroup0.numBackwardsCalls());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 80);
      int[] intArray0 = new int[3];
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) metadataBandGroup0.T, locale_FilteringMode0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(101, intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, list0, list0, linkedList1, linkedList2, list0, metadataBandGroup0.T, linkedList2);
      assertFalse(linkedList2.contains(0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, (-1498), (CpBands) null, segmentHeader0, (-1498));
      metadataBandGroup0.newEntryInAnnoN();
      metadataBandGroup0.incrementAnnoN();
      assertEquals(0, MetadataBandGroup.CONTEXT_CLASS);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 80);
      int[] intArray0 = new int[3];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList1.add((Integer) metadataBandGroup0.CONTEXT_METHOD);
      metadataBandGroup0.addParameterAnnotation(101, intArray0, metadataBandGroup0.nestpair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 80);
      int[] intArray0 = new int[3];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-774));
      linkedList1.add(integer0);
      metadataBandGroup0.addParameterAnnotation(101, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals((-1548), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 2180, (CpBands) null, segmentHeader0, 2180);
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
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 522, (CpBands) null, segmentHeader0, 522);
      int[] intArray0 = new int[6];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      metadataBandGroup0.pair_N.add(8);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.pair_N, (List<String>) null, (List<String>) null, (List<String>) null, linkedList0, linkedList1, (List<String>) null, (List<String>) null, linkedList1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", 11, (CpBands) null, segmentHeader0, 11);
      int[] intArray0 = new int[3];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      linkedList0.add("@#Ppxeee4l~O");
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(5825, intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1, linkedList2, linkedList0, linkedList0, linkedList2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 101, (CpBands) null, segmentHeader0, 8);
      // Undeclared exception!
      try { 
        metadataBandGroup0.addAnnotation("S", metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, (-1498), (CpBands) null, segmentHeader0, (-1498));
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
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 0);
      metadataBandGroup0.pack((OutputStream) null);
      assertEquals(0, MetadataBandGroup.CONTEXT_CLASS);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 0);
      boolean boolean0 = metadataBandGroup0.hasContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 0);
      int[] intArray0 = new int[3];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(1129, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(1, MetadataBandGroup.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, (-1498), (CpBands) null, segmentHeader0, (-1498));
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
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("S", 0, (CpBands) null, segmentHeader0, 0);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(0, int0);
  }
}
