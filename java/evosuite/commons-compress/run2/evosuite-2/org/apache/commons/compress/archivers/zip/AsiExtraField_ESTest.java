
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
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AsiExtraField_ESTest extends AsiExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setMode(16384);
      assertEquals(32768, asiExtraField0.getMode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        asiExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 4064);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        asiExtraField0.parseFromLocalFileData(byteArray0, (-958), 14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -958
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setLinkedFile("7k$1_|Qr9.k9");
      asiExtraField0.getCentralDirectoryLength();
      assertEquals(40960, asiExtraField0.getMode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      assertEquals(0, asiExtraField0.getUserId());
      
      asiExtraField0.setUserId(4);
      int int0 = asiExtraField0.getUserId();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setUserId((-1126));
      int int0 = asiExtraField0.getUserId();
      assertEquals((-1126), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setLinkedFile("}AqkDnz6|t+/U+'p");
      int int0 = asiExtraField0.getMode();
      assertTrue(asiExtraField0.isLink());
      assertEquals(40960, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setLinkedFile("Bad CRC checksum, expected ");
      asiExtraField0.getLinkedFile();
      assertEquals(40960, asiExtraField0.getMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setGroupId(30062);
      int int0 = asiExtraField0.getGroupId();
      assertEquals(30062, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setGroupId((-2650));
      int int0 = asiExtraField0.getGroupId();
      assertEquals((-2650), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      // Undeclared exception!
      try { 
        asiExtraField0.setLinkedFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = asiExtraField0.getLocalFileDataData();
      // Undeclared exception!
      try { 
        asiExtraField0.parseFromLocalFileData(byteArray0, 32768, 32768);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32768
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      // Undeclared exception!
      try { 
        asiExtraField0.parseFromCentralDirectoryData((byte[]) null, 546, 546);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        asiExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-1), (byte)78);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setLinkedFile("By+kz^2+i L");
      boolean boolean0 = asiExtraField0.isLink();
      assertEquals(40960, asiExtraField0.getMode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      boolean boolean0 = asiExtraField0.isLink();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setDirectory(true);
      boolean boolean0 = asiExtraField0.isDirectory();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      boolean boolean0 = asiExtraField0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setDirectory(true);
      int int0 = asiExtraField0.getMode(1628);
      assertTrue(asiExtraField0.isDirectory());
      assertEquals(18012, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      int int0 = asiExtraField0.getMode(0);
      assertEquals(32768, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      ZipShort zipShort0 = asiExtraField0.getLocalFileDataLength();
      assertEquals(14, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      int int0 = asiExtraField0.getUserId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      int int0 = asiExtraField0.getMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = asiExtraField0.getLocalFileDataData();
      try { 
        asiExtraField0.parseFromLocalFileData(byteArray0, 0, (-328));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // The length is too short, only -328 bytes, expected at least 14
         //
         verifyException("org.apache.commons.compress.archivers.zip.AsiExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      String string0 = asiExtraField0.getLinkedFile();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      int int0 = asiExtraField0.getGroupId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      // Undeclared exception!
      try { 
        asiExtraField0.parseFromLocalFileData((byte[]) null, 220, 1442);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setMode(32768);
      assertEquals(32768, asiExtraField0.getMode());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      ZipShort zipShort0 = asiExtraField0.getHeaderId();
      assertEquals(30062, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setDirectory(true);
      asiExtraField0.setLinkedFile("By+kz^2+i L");
      boolean boolean0 = asiExtraField0.isDirectory();
      assertEquals(40960, asiExtraField0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      Object object0 = asiExtraField0.clone();
      assertNotSame(object0, asiExtraField0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      byte[] byteArray0 = asiExtraField0.getCentralDirectoryData();
      try { 
        asiExtraField0.parseFromCentralDirectoryData(byteArray0, 2531, 8);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // The length is too short, only 8 bytes, expected at least 14
         //
         verifyException("org.apache.commons.compress.archivers.zip.AsiExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      asiExtraField0.setLinkedFile("org.apache.commons.compress.archivers.zip.ZipShort");
      int int0 = asiExtraField0.getMode(4481);
      assertEquals(40960, asiExtraField0.getMode());
      assertEquals(41345, int0);
  }
}
