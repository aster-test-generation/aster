
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
      AttributeLayout attributeLayout0 = new AttributeLayout("']$qq%P6AF8>", 1, "']$qq%P6AF8>", 1);
      attributeLayout0.hashCode();
      assertEquals("']$qq%P6AF8>", attributeLayout0.getLayout());
      assertEquals(1, attributeLayout0.getContext());
      assertEquals("']$qq%P6AF8>", attributeLayout0.getName());
      assertEquals(1, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout(" as ", 0, " as ", 2454, false);
      attributeLayout0.hashCode();
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(2454, attributeLayout0.getIndex());
      assertEquals(" as ", attributeLayout0.getName());
      assertEquals(" as ", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "S", 0, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("kqJC", attributeLayout0.getName());
      assertEquals(2147483646L, bHSDCodec0.largest());
      assertEquals("S", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("&v", (-2843), "x9PKMj", (-2843), true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: -2843
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("org.apache.commons.compress.harmony.unpack200.SegmentHeader", 2, "org.apache.commons.compress.harmony.unpack200.SegmentHeader", 0, true);
      attributeLayout0.setBackwardsCallCount(2);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "", 0, false);
      attributeLayout0.setBackwardsCallCount((-178));
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals((-178), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout(" as ", 0, " as ", 2454, false);
      attributeLayout0.isDefaultLayout();
      assertEquals(2454, attributeLayout0.getIndex());
      assertEquals(" as ", attributeLayout0.getLayout());
      assertEquals(" as ", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "", 0, false);
      String string0 = attributeLayout0.getLayout();
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("", string0);
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals("kqJC", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout(" as ", 0, " as ", 2454, false);
      int int0 = attributeLayout0.getIndex();
      assertEquals(0, attributeLayout0.getContext());
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(" as ", attributeLayout0.getLayout());
      assertEquals(" as ", attributeLayout0.getName());
      assertEquals(2454, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("DF7-[u", 2, "DF7-[u", (-510));
      int int0 = attributeLayout0.getIndex();
      assertEquals((-510), int0);
      assertEquals(2, attributeLayout0.getContext());
      assertEquals("DF7-[u", attributeLayout0.getName());
      assertEquals("DF7-[u", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("org.apache.commons.compress.harmony.unpack200.SegmentHeader", 2, "org.apache.commons.compress.harmony.unpack200.SegmentHeader", 0, true);
      int int0 = attributeLayout0.getContext();
      assertEquals("org.apache.commons.compress.harmony.unpack200.SegmentHeader", attributeLayout0.getName());
      assertEquals("org.apache.commons.compress.harmony.unpack200.SegmentHeader", attributeLayout0.getLayout());
      assertEquals(2, int0);
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Dd~P1m-qL:jD,A'", 1, "K", 5);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 5, segmentConstantPool0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQRU", 0, "KQRU", 0);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals("KQRU", attributeLayout0.getName());
      assertEquals("KQRU", attributeLayout0.getLayout());
      assertEquals(0, int0);
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQRU", 0, "KQRU", 0);
      boolean boolean0 = attributeLayout0.matches(2859);
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertTrue(boolean0);
      assertEquals("KQRU", attributeLayout0.getLayout());
      assertEquals("KQRU", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "TCB>L~,LhRdU", 0, false);
      boolean boolean0 = attributeLayout0.matches(0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("kqJC", attributeLayout0.getName());
      assertFalse(boolean0);
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("TCB>L~,LhRdU", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "TCB>L~,LhRdU", 0, false);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, bHSDCodec0.getL());
      assertEquals("kqJC", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KS", 1, "KS", 1);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(1, attributeLayout0.getContext());
      assertEquals(4294967293L, bHSDCodec0.largest());
      assertEquals("KS", attributeLayout0.getName());
      assertEquals(1, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("']$qq%P6AF8>", 1, "']$qq%P6AF8>", 1);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals("']$qq%P6AF8>", attributeLayout0.getName());
      assertEquals("']$qq%P6AF8>", attributeLayout0.getLayout());
      assertEquals(1, attributeLayout0.getIndex());
      assertEquals(1, attributeLayout0.getContext());
      assertEquals(0L, bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("#D", 0, "1%9_OJr-KVQ", 0);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("1%9_OJr-KVQ", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getIndex());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("#D", attributeLayout0.getName());
      assertEquals((-21739L), bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", 0, "kqJC", 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have an unnamed layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout((String) null, 0, "vv m!(@Kp.@", 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have an unnamed layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("K{FS9W/\"A", 0, (String) null, 31);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a null layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", 281, "", 2500, false);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: 281
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_STRICT", 3, "{FS9W/\"A", 41, true);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals("{FS9W/\"A", attributeLayout0.getLayout());
      assertEquals(2147483646L, bHSDCodec0.largest());
      assertEquals("ACC_STRICT", attributeLayout0.getName());
      assertEquals(41, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQRU", 0, "KQRU", 0);
      try { 
        attributeLayout0.getValue(1L, "[d{H#", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: K[d{H#RU
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KSeprecaMed", 0, "KSeprecaMed", (-1), false);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue(2065L, "", (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQRU", 0, "KQRU", 0);
      try { 
        attributeLayout0.getValue((long) 0, "RuntimeVisibleAnnotations", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KRuntimeVisibleAnnotationsRU
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KKDeprecated", 0, "KKDeprecated", (-21), false);
      try { 
        attributeLayout0.getValue(2102L, "<", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KKDeprecated
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KDeprecated", 0, "KDeprecated", 2, true);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 2, (SegmentConstantPool) null);
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
      AttributeLayout attributeLayout0 = new AttributeLayout("KQRU", 0, "KQRU", 0);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 0, "Class: KQRU", (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "TCB>L~,LhRdU", 0, false);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((long) 2, ":I[fp.&r;_zSNF0%1oX", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: TCB>L~,LhRdU
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Deprecated", 0, "RU", 2, false);
      // Undeclared exception!
      try { 
        attributeLayout0.getValue((long) 0, "", (SegmentConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("Dd~P1m-qL:jD,A'", 1, "RRU", 5);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((long) 431, segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: RRU
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "TCB>L~,LhRdU", 0, false);
      String string0 = attributeLayout0.getName();
      assertEquals("kqJC", string0);
      assertEquals("TCB>L~,LhRdU", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("kqJC", 0, "TCB>L~,LhRdU", 0, false);
      int int0 = attributeLayout0.getIndex();
      assertEquals("TCB>L~,LhRdU", attributeLayout0.getLayout());
      assertEquals(0, int0);
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("kqJC", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("dI7e|", 0, "ACC_STRICT", 0);
      int int0 = attributeLayout0.getContext();
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("dI7e|", attributeLayout0.getName());
      assertEquals(0, int0);
      assertEquals("ACC_STRICT", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("KQRU", 0, "KQRU", 0);
      try { 
        attributeLayout0.getValue((-403L), (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KQRU
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("dI7e|", 0, "ACC_STRICT", 0);
      String string0 = attributeLayout0.getLayout();
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("ACC_STRICT", string0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("dI7e|", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("dI7e|", 0, "ACC_STRICT", 0);
      String string0 = attributeLayout0.toString();
      assertEquals("ACC_STRICT", attributeLayout0.getLayout());
      assertEquals("Class: dI7e|", string0);
      assertEquals(0, attributeLayout0.getIndex());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("dI7e|", 0, "ACC_STRICT", 0);
      boolean boolean0 = attributeLayout0.isDefaultLayout();
      assertEquals("ACC_STRICT", attributeLayout0.getLayout());
      assertEquals("dI7e|", attributeLayout0.getName());
      assertTrue(boolean0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, attributeLayout0.getIndex());
  }
}
