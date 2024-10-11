
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
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      String string0 = unsupportedZipFeatureException_Feature0.toString();
      assertEquals("data descriptor", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0);
      ZipArchiveEntry zipArchiveEntry0 = unsupportedZipFeatureException0.getEntry();
      ZipMethod zipMethod0 = ZipMethod.JPEG;
      UnsupportedZipFeatureException unsupportedZipFeatureException1 = null;
      try {
        unsupportedZipFeatureException1 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.METHOD;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("9fc-Uz3?z9@tSqUD");
      zipArchiveEntry0.setStreamContiguous(true);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_4;
      MockFile mockFile0 = new MockFile("", "compression method");
      MockFile.createTempFile("compression method", "", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, " g`k~Q");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(" g`k~Q/", zipArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.JPEG;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("MrD1MGC%KM,+F`)|[>v");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionRequired((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.EXPANDING_LEVEL_3;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionMadeBy(1399);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.LZMA;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionMadeBy((-319));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setUnixMode((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.BZIP2;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("\"vTjUTe,9");
      zipArchiveEntry0.setSize(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setSize(3);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length ");
      zipArchiveEntry0.setRawFlag(1322);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCrc());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.ENHANCED_DEFLATED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("compression method");
      zipArchiveEntry0.setRawFlag((-2059));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.JPEG;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setPlatform((-1));
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(0);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(1357);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException((UnsupportedZipFeatureException.Feature) null, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.TOKENIZATION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setLocalHeaderOffset(67324752L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(3, ZipArchiveEntry.PLATFORM_UNIX);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.DEFLATED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setInternalAttributes(4096);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.UNSHRINKING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("SzO");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setInternalAttributes((-1));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setUnixMode(0);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getRawFlag());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("encryption");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setDiskNumberStart(3);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("encryption");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setDiskNumberStart((-2759L));
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertNull(zipArchiveEntry1.getComment());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(".jrGh@U.\" Fb");
      zipArchiveEntry0.setDataOffset(0L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setDataOffset(2009L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertSame(zipArchiveEntry0, zipArchiveEntry1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("(3;bB]^YfC");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setCrc(0L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCrc(16711680L);
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(0L, zipArchiveEntry1.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length ");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      zipArchiveEntry0.setCompressedSize(0L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.JPEG;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("MrD1MGC%KM,+F`)|[>v");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setCompressedSize(71776119061217280L);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals(3, ZipArchiveEntry.PLATFORM_UNIX);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipMethod zipMethod0 = ZipMethod.STORED;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry0);
      zipArchiveEntry0.setVersionRequired(63);
      ZipArchiveEntry zipArchiveEntry1 = unsupportedZipFeatureException0.getEntry();
      assertEquals((-1L), zipArchiveEntry1.getCrc());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.ENCRYPTION;
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("encryption");
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException(unsupportedZipFeatureException_Feature0, zipArchiveEntry0);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature1 = unsupportedZipFeatureException0.getFeature();
      assertSame(unsupportedZipFeatureException_Feature1, unsupportedZipFeatureException_Feature0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UnsupportedZipFeatureException unsupportedZipFeatureException0 = new UnsupportedZipFeatureException((UnsupportedZipFeatureException.Feature) null);
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = unsupportedZipFeatureException0.getFeature();
      assertNull(unsupportedZipFeatureException_Feature0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UnsupportedZipFeatureException.Feature unsupportedZipFeatureException_Feature0 = UnsupportedZipFeatureException.Feature.SPLITTING;
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
