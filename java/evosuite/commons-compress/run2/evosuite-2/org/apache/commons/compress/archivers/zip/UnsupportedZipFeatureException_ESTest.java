
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
import java.io.File;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipMethod;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UnsupportedZipFeatureException_ESTest extends UnsupportedZipFeatureException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      String string0 = unsupportedZipFeatureException_Feature0.toString();
      assertEquals("splitting", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_4;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(") used in entry ");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      assertEquals("Unsupported compression method -1 (EXPANDING_LEVEL_4) used in entry ) used in entry ", unsupportedZipFeatureException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(") used in entry ");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      assertEquals("Unsupported feature splitting used in entry ) used in entry ", unsupportedZipFeatureException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.METHOD;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0);
      assertEquals("Unsupported feature compression method used in archive.", unsupportedZipFeatureException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("PoF");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException((UnsupportedZipFeatureException.Feature) null, zipArchiveEntry0);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = unsupportedZipFeatureException0.getFeature();
      assertNull(unsupportedZipFeatureException_Feature0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("U");
      zipArchiveEntry0.setStreamContiguous(true);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException((UnsupportedZipFeatureException.Feature) null, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNSHRINKING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("XjiSpNfJ8FLN}.'u4>");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionRequired(97);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("XjiSpNfJ8FLN}.'u4>", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.PKWARE_IMPLODING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionRequired((-1697));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.METHOD;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionMadeBy(621);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionMadeBy((-853));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isDirectory());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_2;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setSize(1257L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(1257L, zipArchiveEntry1.getSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_3;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setRawFlag(815);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.WAVPACK;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setRawFlag((-2970));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Unsupported feature ");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setPlatform((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      MockFile mockFile0 = new MockFile("+0oq`O");
      mockFile0.mkdirs();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "1:U&A4&x");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setMethod(3);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry1.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.WAVPACK;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setLocalHeaderOffset(2613L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setInternalAttributes(16711680);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("HK$=2(");
      zipArchiveEntry0.setInternalAttributes((-347));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("HK$=2(", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.AES_ENCRYPTED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setUnixMode(47);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(3080193L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.PKWARE_IMPLODING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("JPEG");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setUnixMode((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setDiskNumberStart(1841L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Unsupported feature ");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setDiskNumberStart((-103L));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertSame(zipArchiveEntry1, zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.XZ;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("LGpf'LC|I*F+Wby");
      zipArchiveEntry0.setDataOffset(358L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      File file0 = MockFile.createTempFile("RnF", "compression method");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "RnF");
      zipArchiveEntry0.setCrc(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("RnF", zipArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setCrc(3);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry1.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_2;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCompressedSize(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.METHOD;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCompressedSize(26128);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_2;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setDataOffset(0L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.AES_ENCRYPTED;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = null;
      try {
        unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, (ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("fill must not return null");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature1 = unsupportedZipFeatureException0.getFeature();
      assertSame(unsupportedZipFeatureException_Feature1, unsupportedZipFeatureException_Feature0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0);
      ZipArchiveEntry zipArchiveEntry0 = unsupportedZipFeatureException0.getEntry();
      assertNull(zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.METHOD;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = null;
      try {
        unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, (ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException", e);
      }
  }
}
