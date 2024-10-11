
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
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-5);
      try { 
        unicodePathExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (byte)7);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Unsupported version [-5] for UniCode path extra data.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromLocalFileData(byteArray0, 368, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 368
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("~zIx0\"H!g<C", byteArray0);
      byte[] byteArray1 = unicodePathExtraField0.getLocalFileDataData();
      assertNotNull(byteArray1);
      
      unicodePathExtraField0.parseFromLocalFileData(byteArray1, 0, 8);
      assertEquals(16, byteArray1.length);
      assertEquals(558161692L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = new byte[6];
      unicodePathExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodePathExtraField0.getUnicodeName();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("~hzIxz0\"H2gbzC", byteArray0);
      long long0 = unicodePathExtraField0.getNameCRC32();
      assertEquals(3817498742L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      unicodePathExtraField0.setNameCRC32((-1176L));
      long long0 = unicodePathExtraField0.getNameCRC32();
      assertEquals((-1176L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = new byte[0];
      unicodeCommentExtraField0.setUnicodeName(byteArray0);
      ZipShort zipShort0 = unicodeCommentExtraField0.getLocalFileDataLength();
      assertEquals(5, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromLocalFileData((byte[]) null, 28789, 28789);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, 4179, 4179);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4179
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("", byteArray0);
      byte[] byteArray1 = unicodePathExtraField0.getCentralDirectoryData();
      // Undeclared exception!
      try { 
        unicodePathExtraField0.parseFromLocalFileData(byteArray1, (byte)0, 2872);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      ZipShort zipShort0 = unicodeCommentExtraField0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      byte[] byteArray0 = unicodePathExtraField0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = new byte[0];
      unicodeCommentExtraField0.setUnicodeName(byteArray0);
      unicodeCommentExtraField0.getLocalFileDataData();
      byte[] byteArray1 = unicodeCommentExtraField0.getCentralDirectoryData();
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("~hzIxz0\"H2gbzC", byteArray0);
      unicodePathExtraField0.setUnicodeName((byte[]) null);
      assertEquals(3817498742L, unicodePathExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      try { 
        unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, 3121);
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
      byte[] byteArray0 = new byte[10];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("~hzIxz0\"H2gbzC", byteArray0);
      byte[] byteArray1 = unicodePathExtraField0.getCentralDirectoryData();
      assertNotNull(byteArray1);
      
      unicodePathExtraField0.parseFromCentralDirectoryData(byteArray1, 0, 6);
      assertEquals(3817498742L, unicodePathExtraField0.getNameCRC32());
      assertEquals(19, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = new byte[0];
      unicodeCommentExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getUnicodeName();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = unicodeCommentExtraField0.getUnicodeName();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = new byte[0];
      unicodeCommentExtraField0.setUnicodeName(byteArray0);
      byte[] byteArray1 = unicodeCommentExtraField0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
      assertNotNull(byteArray1);
      
      ZipShort zipShort0 = unicodeCommentExtraField0.getCentralDirectoryLength();
      assertEquals(5, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      // Undeclared exception!
      try { 
        unicodeCommentExtraField0.parseFromCentralDirectoryData((byte[]) null, 25461, 1016);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      ZipShort zipShort0 = unicodeCommentExtraField0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      byte[] byteArray0 = unicodeCommentExtraField0.getLocalFileDataData();
      try { 
        unicodeCommentExtraField0.parseFromLocalFileData(byteArray0, 1169, (-69));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      long long0 = unicodeCommentExtraField0.getNameCRC32();
      assertEquals(0L, long0);
  }
}
