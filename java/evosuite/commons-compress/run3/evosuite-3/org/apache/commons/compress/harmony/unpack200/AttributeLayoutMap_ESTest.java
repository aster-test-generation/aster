
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
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("RuntimeInvisibleAnnotations", 0);
      assertNotNull(attributeLayout0);
      assertEquals(22, attributeLayout0.getIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("ACC_PUBLIC", 1);
      assertEquals(1, attributeLayout0.getContext());
      assertNotNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout((-5225), 0);
      assertNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(25, 2);
      assertEquals(1, AttributeLayout.CONTEXT_FIELD);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_INTERFACE", 0, "ACC_FINAL", 2);
      attributeLayout0.setBackwardsCallCount((-823));
      attributeLayoutMap0.add(attributeLayout0);
      AttributeLayout attributeLayout1 = attributeLayoutMap0.getAttributeLayout(2, 0);
      assertEquals("ACC_INTERFACE", attributeLayout1.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("KG&U?M(+K~Ehh2", 0, "qdHMBt~", 0, false);
      attributeLayoutMap0.add(attributeLayout0, (NewAttributeBands) null);
      AttributeLayout attributeLayout1 = attributeLayoutMap0.getAttributeLayout(0, 0);
      assertEquals("KG&U?M(+K~Ehh2", attributeLayout1.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.getAttributeLayout("LineNumberTable", 67);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 67
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      // Undeclared exception!
      try { 
        attributeLayoutMap0.getAttributeLayout((-496), (-496));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -496
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout("InnerClasses", 3);
      assertNull(attributeLayout0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = new AttributeLayout("ACC_INTERFACE", 0, "ACC_FINAL", 2);
      attributeLayoutMap0.add(attributeLayout0);
      attributeLayoutMap0.checkMap();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AttributeLayoutMap attributeLayoutMap0 = new AttributeLayoutMap();
      AttributeLayout attributeLayout0 = attributeLayoutMap0.getAttributeLayout(0, 0);
      assertNotNull(attributeLayout0);
      
      attributeLayoutMap0.getAttributeBands(attributeLayout0);
      assertEquals("ACC_PUBLIC", attributeLayout0.getName());
      assertEquals(0, attributeLayout0.getContext());
  }
}
