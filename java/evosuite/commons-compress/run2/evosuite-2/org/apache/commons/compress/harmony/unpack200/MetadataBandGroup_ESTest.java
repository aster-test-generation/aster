
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
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
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      metadataBandGroup0.casec_RS = cPUTF8Array0;
      intArray0[0] = 115;
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
  public void test01()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 115;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
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
  public void test02()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      String[] stringArray0 = new String[8];
      metadataBandGroup0.caseet_RS = stringArray0;
      intArray0[0] = 101;
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
  public void test03()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 68;
      CPDouble[] cPDoubleArray0 = new CPDouble[0];
      metadataBandGroup0.caseD_KD = cPDoubleArray0;
      metadataBandGroup0.T = intArray0;
      // Undeclared exception!
      try { 
        metadataBandGroup0.getAttributes();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.MetadataBandGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 114;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 111;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 109;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 104;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 97;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 96;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[4] = 95;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[4] = 94;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 88;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 87;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 84;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 83;
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
  public void test16()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 82;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 77;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 76;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 72;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[1] = 70;
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
  public void test21()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 69;
      metadataBandGroup0.T = intArray0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 67;
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
  public void test23()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RVA", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      int[] intArray0 = new int[4];
      metadataBandGroup0.anno_N = intArray0;
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      metadataBandGroup0.name_RU = cPUTF8Array0;
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
  public void test24()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("RIA", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[21];
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      metadataBandGroup0.name_RU = cPUTF8Array0;
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
  public void test25()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b9", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      metadataBandGroup0.nestname_RU = cPUTF8Array0;
      metadataBandGroup0.name_RU = cPUTF8Array0;
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("AD", (CpBands) null);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
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
  public void test27()  throws Throwable  {
      MetadataBandGroup metadataBandGroup0 = new MetadataBandGroup("b9", (CpBands) null);
      List<Attribute> list0 = metadataBandGroup0.getAttributes();
      List<Attribute> list1 = metadataBandGroup0.getAttributes();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MetadataBandGroup.setRiaAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Mma)4jzkA(4:J", (-5755));
      MetadataBandGroup.setRvaAttributeName(cPUTF8_0);
      assertEquals((byte)6, ConstantPoolEntry.CP_Double);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Mma)4jzkA(4:J", (-5755));
      MetadataBandGroup.setRipaAttributeName(cPUTF8_0);
      assertEquals((byte)1, cPUTF8_0.getTag());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Mma)4jzkA(4:J", (-5755));
      MetadataBandGroup.setRvpaAttributeName(cPUTF8_0);
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }
}
