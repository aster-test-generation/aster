
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
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.MetadataBandGroup;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MetadataBandGroup_ESTest extends MetadataBandGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVPA", (CpBands) null);
      int[] intArray0 = new int[8];
      intArray0[1] = 1647;
      metadataBandGroup0.param_NB = intArray0;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      int[][] intArray1 = new int[9][8];
      metadataBandGroup0.pair_N = intArray1;
      metadataBandGroup0.nestpair_N = metadataBandGroup0.param_NB;
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      metadataBandGroup0.anno_N = metadataBandGroup0.nestpair_N;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVPA", (CpBands) null);
      int[] intArray0 = new int[8];
      intArray0[1] = 1647;
      metadataBandGroup0.param_NB = intArray0;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      metadataBandGroup0.nestpair_N = metadataBandGroup0.param_NB;
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVPA", (CpBands) null);
      int[] intArray0 = new int[8];
      intArray0[0] = (-120);
      metadataBandGroup0.param_NB = intArray0;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVPA", (CpBands) null);
      int[] intArray0 = new int[8];
      intArray0[1] = 1647;
      metadataBandGroup0.param_NB = intArray0;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      int[][] intArray1 = new int[9][8];
      metadataBandGroup0.pair_N = intArray1;
      int[] intArray2 = new int[1];
      metadataBandGroup0.nestpair_N = intArray2;
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      metadataBandGroup0.anno_N = metadataBandGroup0.nestpair_N;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVPA", (CpBands) null);
      metadataBandGroup0.param_NB = null;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      int[] intArray0 = new int[1];
      metadataBandGroup0.param_NB = intArray0;
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("B9", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVA", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = metadataBandGroup0.name_RU;
      int[] intArray0 = new int[4];
      metadataBandGroup0.anno_N = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup(">4", (CpBands) null);
      metadataBandGroup0.getAttributes();
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MetadataBandGroup.setRiaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MetadataBandGroup.setRvaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVA", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      metadataBandGroup0.name_RU = cPUTF8Array0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MetadataBandGroup.setRipaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MetadataBandGroup.setRvpaAttributeName((CPUTF8) null);
  }
}
