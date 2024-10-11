
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("i.H0!02rZU.X@*)", (-200), (CpBands) null, segmentHeader0, (-200));
      int[] intArray0 = new int[9];
      intArray0[8] = (-200);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(2618, intArray0, metadataBandGroup0.casearray_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(1, MetadataBandGroup.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      int[] intArray0 = new int[9];
      MetadataBandGroup metadataBandGroup1 = new MetadataBandGroup(" Long entries...", (-874), (CpBands) null, segmentHeader0, 0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(2618, intArray0, metadataBandGroup0.anno_N, metadataBandGroup1.T, metadataBandGroup1.T, metadataBandGroup1.T, linkedList0, linkedList1, metadataBandGroup1.T, metadataBandGroup1.T, linkedList1);
      assertEquals(2, MetadataBandGroup.CONTEXT_METHOD);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("Wrote ", (-872), (CpBands) null, segmentHeader0, 4);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) metadataBandGroup0.T);
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
      int[] intArray0 = new int[7];
      metadataBandGroup0.addParameterAnnotation((-872), intArray0, metadataBandGroup0.casearray_N, list0, list0, metadataBandGroup0.T, linkedList1, linkedList2, list0, list0, linkedList2);
      assertEquals(1, MetadataBandGroup.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup((String) null, (-2524), (CpBands) null, segmentHeader0, (-2524));
      int[] intArray0 = new int[5];
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(0, intArray0, metadataBandGroup0.pair_N, linkedList0, (List<String>) null, (List<String>) null, (List<Object>) null, linkedList1, linkedList0, linkedList0, linkedList1);
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      int[] intArray0 = new int[9];
      MetadataBandGroup metadataBandGroup1 = new MetadataBandGroup(" Long entries...", (-874), (CpBands) null, segmentHeader0, 0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation((-205), intArray0, metadataBandGroup1.casearray_N, metadataBandGroup1.T, metadataBandGroup1.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup1.T, linkedList1);
      assertFalse(linkedList1.contains((-874)));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      int[] intArray0 = new int[9];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList1.add((Integer) 2);
      metadataBandGroup0.addParameterAnnotation(1, intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      int[] intArray0 = new int[9];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      linkedList1.add((Integer) (-205));
      metadataBandGroup0.addParameterAnnotation(2618, intArray0, metadataBandGroup0.casearray_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals((-410), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("&vjefk1-uI", 1419, (CpBands) null, segmentHeader0, 1419);
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
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      int[] intArray0 = new int[9];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      LinkedList<String> linkedList2 = new LinkedList<String>();
      linkedList2.add(" caseD_KD");
      // Undeclared exception!
      try { 
        metadataBandGroup0.addParameterAnnotation(254, intArray0, metadataBandGroup0.anno_N, linkedList2, linkedList2, metadataBandGroup0.T, linkedList0, linkedList1, linkedList2, metadataBandGroup0.T, linkedList1);
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        metadataBandGroup0.addAnnotation(" T", metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("Od[%*m>", (-698), (CpBands) null, segmentHeader0, (-698));
      boolean boolean0 = metadataBandGroup0.hasContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("i.H0!02rZU.X@*)", (-205), (CpBands) null, segmentHeader0, (-205));
      int[] intArray0 = new int[9];
      intArray0[8] = 2;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(2618, intArray0, metadataBandGroup0.pair_N, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
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
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      metadataBandGroup0.pack((OutputStream) null);
      assertFalse(metadataBandGroup0.hasContent());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      int[] intArray0 = new int[9];
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      metadataBandGroup0.addParameterAnnotation(2618, intArray0, metadataBandGroup0.param_NB, metadataBandGroup0.T, metadataBandGroup0.T, metadataBandGroup0.T, linkedList0, linkedList1, metadataBandGroup0.T, metadataBandGroup0.T, linkedList1);
      metadataBandGroup0.removeLatest();
      assertEquals(0, metadataBandGroup0.numBackwardsCalls());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("SD", 80, (CpBands) null, segmentHeader0, 80);
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
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("SD", 80, (CpBands) null, segmentHeader0, 80);
      metadataBandGroup0.newEntryInAnnoN();
      metadataBandGroup0.incrementAnnoN();
      assertEquals(0, MetadataBandGroup.CONTEXT_CLASS);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader();
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(" Long entries...", (-205), (CpBands) null, segmentHeader0, (-205));
      int int0 = metadataBandGroup0.numBackwardsCalls();
      assertEquals(0, int0);
  }
}
