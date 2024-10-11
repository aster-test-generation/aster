
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
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MetadataBandGroup_ESTest extends MetadataBandGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 113;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 112;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 111;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 110;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 109;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 108;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 95;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[1] = 91;
      metadataBandGroup0.T = intArray0;
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
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 85;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[5] = 75;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(9, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 73;
      metadataBandGroup0.T = intArray0;
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
  public void test11()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[25];
      intArray0[2] = 69;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(25, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 68;
      metadataBandGroup0.T = intArray0;
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
  public void test13()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[9];
      intArray0[2] = 64;
      metadataBandGroup0.T = intArray0;
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
  public void test14()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      metadataBandGroup0.name_RU = cPUTF8Array0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
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
  public void test16()  throws Throwable  {
      MetadataBandGroup.setRiaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      MetadataBandGroup.setRvaAttributeName(cPUTF8_0);
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("", (CpBands) null);
      metadataBandGroup0.getAttributes();
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MetadataBandGroup.setRipaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MetadataBandGroup.setRvpaAttributeName((CPUTF8) null);
  }
}
