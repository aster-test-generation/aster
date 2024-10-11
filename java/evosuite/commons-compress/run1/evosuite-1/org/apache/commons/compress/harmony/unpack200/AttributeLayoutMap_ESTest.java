
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
import org.apache.commons.compress.harmony.unpack200.AttributeLayout;
import org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap;
import org.apache.commons.compress.harmony.unpack200.NewAttributeBands;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AttributeLayoutMap_ESTest extends AttributeLayoutMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(0, 0);
      attributeLayoutMap0.add(attributeLayout0, (NewAttributeBands) null);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("ACC_PUBLIC", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("RuntimeVisibleAnnotations", 0);
      assertNotNull(attributeLayout0);
      assertEquals(0, attributeLayout0.getContext());
      assertEquals("RuntimeVisibleAnnotations", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("ec|<x6o2", 0, "ec|<x6o2", (-25), false);
      attributeLayout0.setBackwardsCallCount((-731));
      attributeLayoutMap0.add(attributeLayout0);
      AttributeLayout attributeLayout1 = attributeLayoutMap0.getAttributeLayout("ec|<x6o2", 0);
      assertEquals(3, AttributeLayout.CONTEXT_CODE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("ec|<x6o2", 0, "ec|<x6o2", 0);
      attributeLayoutMap0.add(attributeLayout0);
      AttributeLayout attributeLayout1 = attributeLayoutMap0.getAttributeLayout("ec|<x6o2", 0);
      assertEquals("ec|<x6o2", attributeLayout1.getLayout());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(374, 1);
      assertNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(0, 0);
      assertNotNull(attributeLayout0);
      
      attributeLayout0.setBackwardsCallCount(1);
      AttributeLayout attributeLayout1 = attributeLayoutMap0.getAttributeLayout(0, 0);
      assertEquals("ACC_PUBLIC", attributeLayout1.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_INTERFACE", 0, "ACC_NATIVE", 2);
      attributeLayoutMap0.add(attributeLayout0);
      attributeLayout0.setBackwardsCallCount((-3140));
      AttributeLayout attributeLayout1 = attributeLayoutMap0.getAttributeLayout(2, 0);
      assertEquals("ACC_INTERFACE", attributeLayout1.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(3, 1);
      assertEquals(1, attributeLayout0.getContext());
      assertEquals(3, attributeLayout0.getIndex());
      assertNotNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.getAttributeLayout("p8J~'+^})hcmt", 1043);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.getAttributeLayout(5, 1567);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.add((AttributeLayout) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("ACC_STATIC", 2);
      assertEquals(2, attributeLayout0.getContext());
      assertNotNull(attributeLayout0);
      assertEquals("ACC_STATIC", attributeLayout0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout((String) null, 0);
      assertNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_INTERFACE", 0, "ACC_NATIVE", 2);
      attributeLayoutMap0.add(attributeLayout0);
      attributeLayoutMap0.checkMap();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.add((AttributeLayout) null, (NewAttributeBands) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(0, 0);
      assertNotNull(attributeLayout0);
      
      attributeLayoutMap0.getAttributeBands(attributeLayout0);
      assertEquals("ACC_PUBLIC", attributeLayout0.getName());
  }
}
