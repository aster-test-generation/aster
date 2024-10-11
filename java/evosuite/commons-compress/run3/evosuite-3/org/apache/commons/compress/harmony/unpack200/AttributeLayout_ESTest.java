
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
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AttributeLayout_ESTest extends AttributeLayout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("2(5`_*/S+", 1, "2(5`_*/S+", 4064, false);
      attributeLayout0.hashCode();
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals("2(5`_*/S+", attributeLayout0.getName());
      assertEquals("2(5`_*/S+", attributeLayout0.getLayout());
      assertEquals(1, attributeLayout0.getContext());
      assertEquals(4064, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RURS", 0, "RURS", 0, true);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(4294967293L, bHSDCodec0.largest());
      assertEquals("RURS", attributeLayout0.getName());
      assertEquals("RURS", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("S", 0, "S", 0, true);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals("S", attributeLayout0.getName());
      assertEquals("S", attributeLayout0.getLayout());
      assertEquals(2147483646L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("6#fgMF5", (-804), "6#fgMF5", (-937));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: -804
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("2(5`_*/S+", 1, "2(5`_*/S+", 4064, false);
      attributeLayout0.setBackwardsCallCount(983);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals(983, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout(":G$GBjF29a7:[2A\"}", 0, ":G$GBjF29a7:[2A\"}", 0, true);
      attributeLayout0.setBackwardsCallCount((-2696));
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals((-2696), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("$", 0, "$", (-674));
      boolean boolean0 = attributeLayout0.isDefaultLayout();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("$", attributeLayout0.getName());
      assertEquals("$", attributeLayout0.getLayout());
      assertTrue(boolean0);
      assertEquals((-674), attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Ck3HWXXQ@GeE&", 0, "", 1163, false);
      String string0 = attributeLayout0.getLayout();
      assertEquals(1163, attributeLayout0.getIndex());
      assertEquals("Ck3HWXXQ@GeE&", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("", string0);
      assertFalse(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_VOLATILE", 0, "ACC_VOLATILE", 0, false);
      int int0 = attributeLayout0.getIndex();
      assertEquals(0, int0);
      assertEquals("ACC_VOLATILE", attributeLayout0.getLayout());
      assertEquals("ACC_VOLATILE", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
      assertFalse(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("$", 0, "$", (-674));
      int int0 = attributeLayout0.getIndex();
      assertEquals("$", attributeLayout0.getLayout());
      assertEquals((-674), int0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("$", attributeLayout0.getName());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout(":G$GBjF29a7:[2A\"}", 0, ":G$GBjF29a7:[2A\"}", 0, true);
      int int0 = attributeLayout0.getContext();
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(":G$GBjF29a7:[2A\"}", attributeLayout0.getName());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(0, int0);
      assertEquals(":G$GBjF29a7:[2A\"}", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQ", 0, "KQ", 6);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals("KQ", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("KQ", attributeLayout0.getName());
      assertEquals(6, attributeLayout0.getIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Ck3HWXXQ@GeE&", 0, "", 1163, false);
      boolean boolean0 = attributeLayout0.matches(2618L);
      assertTrue(boolean0);
      assertEquals(1163, attributeLayout0.getIndex());
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals("Ck3HWXXQ@GeE&", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQ", 0, "KQ", 6);
      boolean boolean0 = attributeLayout0.matches(0);
      assertFalse(boolean0);
      assertEquals(6, attributeLayout0.getIndex());
      assertEquals("KQ", attributeLayout0.getName());
      assertEquals("KQ", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout(":G$GBjF29a7:[2A\"}", 0, ":G$GBjF29a7:[2A\"}", 0, true);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(1, bHSDCodec0.getB());
      assertEquals(":G$GBjF29a7:[2A\"}", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RS", 0, "RS", 0, true);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(4294967293L, bHSDCodec0.largest());
      assertEquals("RS", attributeLayout0.getName());
      assertEquals("RS", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_VOLATILE", 0, "ACC_VOLATILE", 0, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals("ACC_VOLATILE", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
      assertTrue(bHSDCodec0.isSigned());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", 0, "", 0, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have an unnamed layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout((String) null, 0, "S3Io:K-", 3158);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have an unnamed layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("End of stream reached whilst decoding", 3, (String) null, 5);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a null layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("?", 2, "7", 2, false);
      assertEquals("?", attributeLayout0.getName());
      assertEquals("7", attributeLayout0.getLayout());
      assertEquals(2, attributeLayout0.getContext());
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(2, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("~tR<eth", 5017, "ACC_SYNTHETIC", (-2209));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: 5017
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQ", 0, "KQ", 6);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue(2735L, "ACC_ABSTRACT", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KACC_ABSTRACT
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQ", 0, "KQ", 6);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue(2735L, "RuntimeInvisibleAnnotations", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KRuntimeInvisibleAnnotations
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQ", 0, "KQ", 6);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue(2735L, "KQ", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KKQ
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("'WQUwV1S_RN;6(", 1, "ACC_STATIC", 1192);
      try { 
        attributeLayout0.getValue(4317L, (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: ACC_STATIC
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RURS", 0, "RURS", 0, true);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) (-2696), "VP", (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K9", 0, "R'WQUwV1S_RN;6(", 0, false);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((-1L), segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: R'WQUwV1S_RN;6(
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RS", 0, "RS", 0);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((-2613L), (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Ck3HWXXQ@GeE&", 0, "", 1163, false);
      String string0 = attributeLayout0.getName();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(1163, attributeLayout0.getIndex());
      assertEquals("Ck3HWXXQ@GeE&", string0);
      assertEquals("", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Ck3HWXXQ@GeE&", 0, "", 1163, false);
      int int0 = attributeLayout0.getIndex();
      assertEquals("", attributeLayout0.getLayout());
      assertEquals(1163, int0);
      assertEquals("Ck3HWXXQ@GeE&", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("2(5`_*/S+", 1, "2(5`_*/S+", 4064, false);
      int int0 = attributeLayout0.getContext();
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals("2(5`_*/S+", attributeLayout0.getLayout());
      assertEquals("2(5`_*/S+", attributeLayout0.getName());
      assertEquals(4064, attributeLayout0.getIndex());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQ", 0, "KQ", 6);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((long) 10, segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KQ
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("2(5`_*/S+", 1, "2(5`_*/S+", 4064, false);
      String string0 = attributeLayout0.getLayout();
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals("2(5`_*/S+", string0);
      assertEquals("2(5`_*/S+", attributeLayout0.getName());
      assertEquals(1, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger", 0, "org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger", 3691);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger", attributeLayout0.getName());
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger", attributeLayout0.getLayout());
      assertEquals(3691, attributeLayout0.getIndex());
      assertEquals(0L, bHSDCodec0.smallest());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("2(5`_*/S+", 1, "2(5`_*/S+", 4064, false);
      String string0 = attributeLayout0.toString();
      assertEquals(4064, attributeLayout0.getIndex());
      assertEquals("2(5`_*/S+", attributeLayout0.getLayout());
      assertEquals("Field: 2(5`_*/S+", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("2(5`_*/S+", 1, "2(5`_*/S+", 4064, false);
      boolean boolean0 = attributeLayout0.isDefaultLayout();
      assertFalse(boolean0);
      assertEquals(1, attributeLayout0.getContext());
      assertEquals(4064, attributeLayout0.getIndex());
      assertEquals("2(5`_*/S+", attributeLayout0.getLayout());
      assertEquals("2(5`_*/S+", attributeLayout0.getName());
  }
}
