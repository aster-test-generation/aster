
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
      byte[] byteArray0 = new byte[0];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("P4Pl-uX", byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getLocalFileDataData();
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromLocalFileData(byteArray1, 0, 257);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("I", byteArray0);
      try { 
        unicodePathExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 28789);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Unsupported version [-1] for UniCode path extra data.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("&<S-\"?` 2oA", byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray1, (byte)0, 5);
      assertEquals(3523407757L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("", byteArray0);
      unicodeCommentExtraField0.getUnicodeName();
      assertEquals(2641158014L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("BO)wkZ@iWCj4'M", byteArray0);
      long long0 = unicodePathExtraField0.getNameCRC32();
      assertEquals(3859354798L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.setNameCRC32((-3380L));
      long long0 = unicodeCommentExtraField0.getNameCRC32();
      assertEquals((-3380L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromLocalFileData((byte[]) null, 0, 1184);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("XxWa%arR0;l{dV7_N((", byteArray0);
      try { 
        unicodePathExtraField0.parseFromCentralDirectoryData(byteArray0, (byte) (-1), (byte) (-1));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromCentralDirectoryData((byte[]) null, (-1269), 67);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      ZipShort zipShort0 = unicodeCommentExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[3];
      unicodePathExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodePathExtraField0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertNotNull(byteArray1);
      
      ZipShort zipShort0 = unicodePathExtraField0.getCentralDirectoryLength();
      assertEquals(8, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("XxWa%arR0;l{dV7_N((", byteArray0);
      ZipShort zipShort0 = unicodePathExtraField0.getCentralDirectoryLength();
      assertEquals(24, zipShort0.getValue());
      
      unicodePathExtraField0.getCentralDirectoryData();
      assertEquals(3523407757L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      unicodePathExtraField0.setUnicodeName((byte[]) null);
      assertEquals(0L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[8];
      try { 
        unicodePathExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 1955);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Unsupported version [0] for UniCode path extra data.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("&<S-\"?` 2oA", byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      unicodeCommentExtraField0.parseFromLocalFileData(byteArray1, (byte)0, 8);
      assertEquals(16, byteArray1.length);
      assertEquals(1104745215L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[1];
      unicodePathExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodePathExtraField0.getUnicodeName();
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getUnicodeName();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[3];
      unicodePathExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodePathExtraField0.getLocalFileDataData();
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      
      ZipShort zipShort0 = unicodePathExtraField0.getLocalFileDataLength();
      assertEquals(8, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromCentralDirectoryData(byteArray0, 2124, (byte)8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2124
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      ZipShort zipShort0 = unicodePathExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("XxWa%arR0;l{dV7_N((", byteArray0);
      try { 
        unicodePathExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (-2348));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      long long0 = unicodePathExtraField0.getNameCRC32();
      assertEquals(0L, long0);
  }
}
