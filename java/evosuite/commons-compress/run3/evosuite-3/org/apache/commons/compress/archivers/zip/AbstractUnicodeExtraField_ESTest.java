
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
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractUnicodeExtraField_ESTest extends AbstractUnicodeExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromLocalFileData(byteArray1, (byte)0, (byte)72);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("1", byteArray0);
      unicodePathExtraField0.getUnicodeName();
      assertEquals(1104745215L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("", byteArray0);
      long long0 = unicodeCommentExtraField0.getNameCRC32();
      assertEquals(3324180253L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.setNameCRC32((-1L));
      long long0 = unicodeCommentExtraField0.getNameCRC32();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = new byte[3];
      unicodeCommentExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromLocalFileData((byte[]) null, 4, 340);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("gJ=ch\"l", byteArray0);
      try { 
        unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, (-1), (byte)0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromCentralDirectoryData(byteArray0, 870, 28789);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 870
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      ZipShort zipShort0 = unicodePathExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("Ch", byteArray0);
      unicodePathExtraField0.getLocalFileDataLength();
      ZipShort zipShort0 = unicodePathExtraField0.getCentralDirectoryLength();
      assertEquals(7, zipShort0.getValue());
      assertEquals(2982322595L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      unicodePathExtraField0.setUnicodeName((byte[]) null);
      assertEquals(0L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("", byteArray0);
      try { 
        unicodePathExtraField0.parseFromLocalFileData(byteArray0, 4, 325);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Unsupported version [0] for UniCode path extra data.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("", byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      assertNotNull(byteArray1);
      
      unicodeCommentExtraField0.parseFromLocalFileData(byteArray1, (byte)0, (byte)5);
      assertEquals(3324180253L, unicodeCommentExtraField0.getNameCRC32());
      assertArrayEquals(new byte[] {(byte)1, (byte)29, (byte) (-9), (byte)34, (byte) (-58)}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("", byteArray0, (byte)0, 0);
      try { 
        unicodeCommentExtraField0.parseFromLocalFileData(byteArray0, (byte) (-112), (-1162));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("", byteArray0, (byte)0, 0);
      unicodeCommentExtraField0.getUnicodeName();
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getUnicodeName();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("", byteArray0);
      unicodeCommentExtraField0.getCentralDirectoryData();
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte)1, (byte)29, (byte) (-9), (byte)34, (byte) (-58)}, byteArray1);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromCentralDirectoryData((byte[]) null, 0, 374);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      ZipShort zipShort0 = unicodePathExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      long long0 = unicodePathExtraField0.getNameCRC32();
      assertEquals(0L, long0);
  }
}
