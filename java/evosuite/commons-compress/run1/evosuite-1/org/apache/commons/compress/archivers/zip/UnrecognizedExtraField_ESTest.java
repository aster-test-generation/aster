
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
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnrecognizedExtraField_ESTest extends UnrecognizedExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[1];
      unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 4325);
      byte[] byteArray1 = unrecognizedExtraField0.getLocalFileDataData();
      assertEquals(4325, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[4];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 0);
      byte[] byteArray1 = unrecognizedExtraField0.getLocalFileDataData();
      assertNotNull(byteArray1);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)1;
      ZipShort zipShort0 = new ZipShort(byteArray0, (byte)1);
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertEquals(1, zipShort1.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = new ZipShort((-2845));
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertSame(zipShort1, zipShort0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[3];
      unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)1, 0);
      byte[] byteArray1 = unrecognizedExtraField0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData((byte[]) null, (-285), 5070);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (-3798));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -3798
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)118, (byte)12);
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
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-1), (-624));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 > -625
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (-1176), (byte)1);
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
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[1];
      unrecognizedExtraField0.setLocalFileDataData(byteArray0);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[1];
      unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 4325);
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, 1, 4325);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[17];
      unrecognizedExtraField0.setCentralDirectoryData(byteArray0);
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
      assertEquals(17, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[17];
      unrecognizedExtraField0.setCentralDirectoryData(byteArray0);
      byte[] byteArray1 = unrecognizedExtraField0.getCentralDirectoryData();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = unrecognizedExtraField0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getHeaderId();
      assertNull(zipShort0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[1];
      unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 4325);
      ZipShort zipShort0 = unrecognizedExtraField0.getLocalFileDataLength();
      assertEquals(4325, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertEquals(0, zipShort1.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = unrecognizedExtraField0.getLocalFileDataData();
      assertNull(byteArray0);
  }
}
