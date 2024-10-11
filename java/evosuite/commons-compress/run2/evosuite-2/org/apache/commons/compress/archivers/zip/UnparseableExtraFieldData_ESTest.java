
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnparseableExtraFieldData_ESTest extends UnparseableExtraFieldData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[3];
      unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, (byte)1, (byte)0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[9];
      unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, 0, (byte)125);
      ZipShort zipShort0 = unparseableExtraFieldData0.getLocalFileDataLength();
      assertEquals(125, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[9];
      unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, 0, (byte)125);
      byte[] byteArray1 = unparseableExtraFieldData0.getLocalFileDataData();
      assertEquals(125, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[4];
      unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, 0, 0);
      byte[] byteArray1 = unparseableExtraFieldData0.getLocalFileDataData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[9];
      unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, 0, (byte)125);
      ZipShort zipShort0 = unparseableExtraFieldData0.getCentralDirectoryLength();
      assertEquals(125, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[9];
      unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, 0, (byte)125);
      byte[] byteArray1 = unparseableExtraFieldData0.getCentralDirectoryData();
      assertNotNull(byteArray1);
      assertEquals(125, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      // Undeclared exception!
      try { 
        unparseableExtraFieldData0.parseFromLocalFileData((byte[]) null, (byte) (-63), 4268);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, (-28), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      // Undeclared exception!
      try { 
        unparseableExtraFieldData0.parseFromCentralDirectoryData((byte[]) null, 3095, 1116);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, (byte) (-95), (-620));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -95 > -715
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, (-3878), (byte)78);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = unparseableExtraFieldData0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, (byte)0, (-3730));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -3730
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[6];
      unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)0);
      unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[6];
      unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)0);
      ZipShort zipShort0 = unparseableExtraFieldData0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[6];
      unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)0);
      byte[] byteArray1 = unparseableExtraFieldData0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = unparseableExtraFieldData0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getHeaderId();
      assertEquals(44225, zipShort0.getValue());
  }
}
