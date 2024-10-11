
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
import java.io.InputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.SegmentHeader;
import org.apache.commons.compress.harmony.unpack200.SegmentOptions;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SegmentHeader_ESTest extends SegmentHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      segmentHeader0.setSegmentsRemaining(499L);
      int int0 = segmentHeader0.getSegmentsRemaining();
      assertEquals(499, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      segmentHeader0.setSegmentsRemaining((-82L));
      int int0 = segmentHeader0.getSegmentsRemaining();
      assertEquals((-82), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      segmentHeader0.setArchiveSize(4327L);
      long long0 = segmentHeader0.getArchiveSize();
      assertEquals(4327L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      segmentHeader0.setArchiveSize((-1L));
      long long0 = segmentHeader0.getArchiveSize();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      segmentHeader0.setArchiveModtime((-1134L));
      long long0 = segmentHeader0.getArchiveModtime();
      assertEquals((-1134L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      InputStream inputStream0 = segmentHeader0.getBandHeadersInputStream();
      InputStream inputStream1 = segmentHeader0.getBandHeadersInputStream();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      InputStream inputStream0 = segmentHeader0.getBandHeadersInputStream();
      // Undeclared exception!
      try { 
        segmentHeader0.read(inputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getArchiveSizeOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      segmentHeader0.setArchiveModtime(2823L);
      long long0 = segmentHeader0.getArchiveModtime();
      assertEquals(2823L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getInnerClassCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpUTF8Count();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpIMethodCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getNumberOfFiles();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getAttributeDefinitionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpLongCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getSegmentsRemaining();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      segmentHeader0.unpack();
      assertEquals(0, segmentHeader0.getCpFloatCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      SegmentOptions segmentOptions0 = segmentHeader0.getOptions();
      assertNull(segmentOptions0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpDoubleCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpStringCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpIntCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getBandHeadersSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getDefaultClassMajorVersion();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpDescriptorCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      long long0 = segmentHeader0.getArchiveSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getClassCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpFieldCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpClassCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      long long0 = segmentHeader0.getArchiveModtime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getDefaultClassMinorVersion();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpMethodCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpFloatCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SegmentHeader segmentHeader0 = new SegmentHeader((Segment) null);
      int int0 = segmentHeader0.getCpSignatureCount();
      assertEquals(0, int0);
  }
}
