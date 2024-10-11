
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
      AttributeLayout attributeLayout0 = new AttributeLayout("-V{|}4", 1, "-V{|}4", (-2663), true);
      attributeLayout0.hashCode();
      assertEquals("-V{|}4", attributeLayout0.getLayout());
      assertEquals("-V{|}4", attributeLayout0.getName());
      assertEquals(1, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("UMJW8", (-337), "]bi/aV>.gZ%D:wjkvY", 31, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: -337
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("1e6)|{?isHVv|Uk`", 0, "InnerClasses", 0);
      attributeLayout0.setBackwardsCallCount(2875);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals(2875, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("InnerClasses", 0, "s6>;", (-1268));
      attributeLayout0.setBackwardsCallCount((-1268));
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals((-1268), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("J?Ckwxkzokvcjr$L^z ", 2, "J?Ckwxkzokvcjr$L^z ", (-30), false);
      boolean boolean0 = attributeLayout0.isDefaultLayout();
      assertFalse(boolean0);
      assertEquals("J?Ckwxkzokvcjr$L^z ", attributeLayout0.getLayout());
      assertEquals("J?Ckwxkzokvcjr$L^z ", attributeLayout0.getName());
      assertEquals((-30), attributeLayout0.getIndex());
      assertEquals(2, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RACC_STATIC", 0, "", 0, false);
      String string0 = attributeLayout0.getLayout();
      assertEquals("RACC_STATIC", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("", string0);
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("c&OxC{U", 0, "k%k+.CI1fS(q", 0);
      int int0 = attributeLayout0.getIndex();
      assertEquals(0, attributeLayout0.getContext());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("c&OxC{U", attributeLayout0.getName());
      assertEquals(0, int0);
      assertEquals("k%k+.CI1fS(q", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("<x,`fbL1D' *", 3, "<x,`fbL1D' *", 4, false);
      int int0 = attributeLayout0.getIndex();
      assertEquals(4, int0);
      assertFalse(attributeLayout0.isDefaultLayout());
      assertEquals(3, attributeLayout0.getContext());
      assertEquals("<x,`fbL1D' *", attributeLayout0.getName());
      assertEquals("<x,`fbL1D' *", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("<x,`fbL1D' *", 3, "<x,`fbL1D' *", 4, false);
      int int0 = attributeLayout0.getContext();
      assertEquals("<x,`fbL1D' *", attributeLayout0.getLayout());
      assertEquals(3, int0);
      assertEquals(4, attributeLayout0.getIndex());
      assertEquals("<x,`fbL1D' *", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K<U16z^j&", 1, "K<U16z^j&", 1);
      int int0 = attributeLayout0.numBackwardsCallables();
      assertEquals("K<U16z^j&", attributeLayout0.getLayout());
      assertEquals(1, attributeLayout0.getContext());
      assertEquals("K<U16z^j&", attributeLayout0.getName());
      assertEquals(0, int0);
      assertEquals(1, attributeLayout0.getIndex());
      assertTrue(attributeLayout0.isDefaultLayout());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("b}", 0, "KK4", 0);
      boolean boolean0 = attributeLayout0.matches(2203L);
      assertTrue(boolean0);
      assertEquals("KK4", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("b}", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K<U16z^j&", 1, "K<U16z^j&", 1);
      boolean boolean0 = attributeLayout0.matches(1L);
      assertFalse(boolean0);
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("K<U16z^j&", attributeLayout0.getLayout());
      assertEquals(1, attributeLayout0.getContext());
      assertEquals("K<U16z^j&", attributeLayout0.getName());
      assertEquals(1, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("c&OxC{U", 0, "k%k+.CI1fS(q", 0);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(1, bHSDCodec0.getS());
      assertEquals("k%k+.CI1fS(q", attributeLayout0.getLayout());
      assertEquals("c&OxC{U", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("H2hTiuW!lkBw8OF", 1, "H2hTiuW!lkBw8OF", 1);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(1, attributeLayout0.getContext());
      assertEquals("H2hTiuW!lkBw8OF", attributeLayout0.getLayout());
      assertEquals("H2hTiuW!lkBw8OF", attributeLayout0.getName());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals((-21739L), bHSDCodec0.smallest());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K<U16z^j&", 1, "K<U16z^j&", 1);
      BHSDCodec bHSDCodec0 = (BHSDCodec)attributeLayout0.getCodec();
      assertEquals(1, attributeLayout0.getIndex());
      assertEquals(4294967293L, bHSDCodec0.largest());
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals(1, attributeLayout0.getContext());
      assertEquals("K<U16z^j&", attributeLayout0.getName());
      assertEquals("K<U16z^j&", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("", 0, "<U16z^j&", 0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have an unnamed layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("/", 0, (String) null, (-1910125541));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a null layout
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout("ha0z7@_tZZ\nT~g8", 2297, "Z}vw!*Z8lA^mh6", 256, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Attribute context out of range: 2297
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AttributeLayout attributeLayout0 = null;
      try {
        attributeLayout0 = new AttributeLayout((String) null, 2, "Ft2", 36, true);
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
      AttributeLayout attributeLayout0 = new AttributeLayout("b}", 0, "KK4", 0);
      try { 
        attributeLayout0.getValue((-1334L), "Class: b}", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: KK4
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("K<U16z^j&", 1, "K<U16z^j&", 1);
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        attributeLayout0.getValue((long) (byte)31, "Field: K<U16z^j&", segmentConstantPool0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: K<U16z^j&
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("LocalVariableTypeTable", 0, "R", (-1322));
      try { 
        attributeLayout0.getValue((-1L), "<init>", (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: R
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("]CZ+z5_iN", 0, "]CZ+z5_iN", 0);
      String string0 = attributeLayout0.getName();
      assertEquals("]CZ+z5_iN", string0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals("]CZ+z5_iN", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_STATIC", 0, "ACC_STATIC", (-1));
      int int0 = attributeLayout0.getIndex();
      assertEquals((-1), int0);
      assertTrue(attributeLayout0.isDefaultLayout());
      assertEquals("ACC_STATIC", attributeLayout0.getLayout());
      assertEquals("ACC_STATIC", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("]CZ+z5_iN", 0, "]CZ+z5_iN", 0);
      int int0 = attributeLayout0.getContext();
      assertEquals("]CZ+z5_iN", attributeLayout0.getLayout());
      assertEquals(0, attributeLayout0.getIndex());
      assertEquals(0, int0);
      assertEquals("]CZ+z5_iN", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("RACC_STATIC", 0, "G&2\"=~uN", 0, false);
      try { 
        attributeLayout0.getValue(1832L, (SegmentConstantPool) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unknown layout encoding: G&2\"=~uN
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_STATIC", 0, "ACC_STATIC", (-1));
      String string0 = attributeLayout0.getLayout();
      assertEquals((-1), attributeLayout0.getIndex());
      assertEquals("ACC_STATIC", string0);
      assertEquals("ACC_STATIC", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_STATIC", 0, "ACC_STATIC", (-1));
      String string0 = attributeLayout0.toString();
      assertEquals((-1), attributeLayout0.getIndex());
      assertEquals("Class: ACC_STATIC", string0);
      assertEquals("ACC_STATIC", attributeLayout0.getLayout());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_STATIC", 0, "ACC_STATIC", (-1));
      boolean boolean0 = attributeLayout0.isDefaultLayout();
      assertEquals("ACC_STATIC", attributeLayout0.getName());
      assertEquals("ACC_STATIC", attributeLayout0.getLayout());
      assertTrue(boolean0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals((-1), attributeLayout0.getIndex());
  }
}
