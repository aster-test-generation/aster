
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
      byte[] byteArray0 = new byte[2];
      unrecognizedExtraField0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = unrecognizedExtraField0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[5];
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 0);
      byte[] byteArray1 = unrecognizedExtraField0.getLocalFileDataData();
      assertNotNull(byteArray1);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = new ZipShort(0);
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertSame(zipShort1, zipShort0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-6);
      ZipShort zipShort0 = new ZipShort(byteArray0);
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertEquals(250, zipShort1.getValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = new ZipShort((byte) (-28));
      unrecognizedExtraField0.setHeaderId(zipShort0);
      ZipShort zipShort1 = unrecognizedExtraField0.getHeaderId();
      assertSame(zipShort1, zipShort0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[0];
      unrecognizedExtraField0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = unrecognizedExtraField0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData((byte[]) null, 2462, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData((byte[]) null, (byte) (-10), (byte) (-10));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -10 > -20
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromLocalFileData(byteArray0, (byte)78, 1991);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-102), (byte) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -102 > -103
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-28), (byte)11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[2];
      unrecognizedExtraField0.setLocalFileDataData(byteArray0);
      ZipShort zipShort0 = unrecognizedExtraField0.getLocalFileDataLength();
      assertEquals(2, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[13];
      unrecognizedExtraField0.parseFromLocalFileData(byteArray0, 0, 0);
      unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 0);
      assertEquals(13, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[13];
      unrecognizedExtraField0.setCentralDirectoryData(byteArray0);
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
      assertEquals(13, zipShort0.getValue());
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
      byte[] byteArray0 = new byte[13];
      unrecognizedExtraField0.setCentralDirectoryData(byteArray0);
      byte[] byteArray1 = unrecognizedExtraField0.getCentralDirectoryData();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getHeaderId();
      assertNull(zipShort0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[13];
      unrecognizedExtraField0.parseFromLocalFileData(byteArray0, 0, 0);
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = unrecognizedExtraField0.getLocalFileDataData();
      assertNull(byteArray0);
  }
}
