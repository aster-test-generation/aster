
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
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveEntry_ESTest extends ZipArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment((-369));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is -369
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = new byte[5];
      zipArchiveEntry0.setExtra(byteArray0);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime((long) 0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      byte[] byteArray0 = new byte[1];
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.onUnparseableExtraField(byteArray0, (-1), (-165), false, 157);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ResourceAlignmentExtraField resourceAlignmentExtraField1 = (ResourceAlignmentExtraField)zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(resourceAlignmentExtraField0.ID);
      assertFalse(resourceAlignmentExtraField1.allowMethodChange());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      File file0 = MockFile.createTempFile("[?Cd),s5J[I", "oo~3W>@5");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "q{=l~w6,sdYmOc[Y/");
      zipArchiveEntry0.isDirectory();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZIP compression method can not be negative: ");
      assertEquals(0, zipArchiveEntry0.getVersionMadeBy());
      
      zipArchiveEntry0.setVersionMadeBy(8);
      int int0 = zipArchiveEntry0.getVersionMadeBy();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("eU");
      zipArchiveEntry0.setUnixMode(160);
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals(160, zipArchiveEntry0.getUnixMode());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("0(NgLk_#jC80m");
      zipArchiveEntry0.getName();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getName();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      assertEquals((-1), zipArchiveEntry0.getMethod());
      
      zipArchiveEntry0.setMethod(0);
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = new byte[6];
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      byte[] byteArray1 = zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals(4, byteArray1.length);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("OGqRR:R.kZ<z");
      zipArchiveEntry0.setInternalAttributes((-996));
      int int0 = zipArchiveEntry0.getInternalAttributes();
      assertEquals((-996), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("h|8");
      GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(true);
      zipArchiveEntry0.getGeneralPurposeBit();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("q{=l~w6,sdYmOc[Y//");
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = x000A_NTFS0.getCreateTime();
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      zipArchiveEntry0.getExtraFields(false);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipArchiveEntry0.addExtraField(unparseableExtraFieldData0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("q{=l~w6,sdYmOc[Y//");
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = x000A_NTFS0.getCreateTime();
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, (ZipLong) null);
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("RiQYg]ZQiH;g).s`Q");
      zipArchiveEntry0.setExternalAttributes((-246L));
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals((-246L), long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = new byte[6];
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(4, byteArray1.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastModifiedTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastModifiedTime
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setCentralDirectoryExtra((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.addExtraField((ZipExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((ZipEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      File file0 = MockFile.createTempFile("Bad symbolic link name length ", "%M4P]Ds< !'oS");
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(file0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setTime(1392409281320L);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setMethod((-945));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -945
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      zipExtraFieldArray0[1] = (ZipExtraField) unparseableExtraFieldData0;
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("q{=l~w6,sdYmOc[Y//");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertNotNull(byteArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZIa\"gU");
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(493, true, 0);
      zipArchiveEntry0.getExtraField(resourceAlignmentExtraField0.ID);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), int0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0L, long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("J?{8!S~pJ M:uv");
      int int0 = zipArchiveEntry0.getInternalAttributes();
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.PKWareExtraHeader");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), long0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      File file0 = MockFile.createTempFile("*M^/+^P!SzE*a 8ZZd$", "*M^/+^P!SzE*a 8ZZd$");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "*M^/+^P!SzE*a 8ZZd$");
      zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertFalse(zipArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("eU");
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("5(f/");
      zipArchiveEntry0.setUnixMode(8);
      assertEquals(8, zipArchiveEntry0.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("q{=l~w6,sdYmOc[Y//");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setSize((-1778L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setUnixMode((-1));
      zipArchiveEntry0.setName("");
      assertEquals(65535, zipArchiveEntry0.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      zipArchiveEntry0.setMethod(212);
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals(212, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("RiQYg]ZQiH;g).s`Q");
      zipArchiveEntry0.setAlignment(0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals("RiQYg]ZQiH;g).s`Q", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment(23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is 23
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.removeUnparseableExtraFieldData();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Invalid value for alignment, must be power of two and no bigger than 65535 but is ");
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-1);
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      zipArchiveEntry0.removeUnparseableExtraFieldData();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZIP compression method can not be negative: ");
      ZipShort zipShort0 = X0019_EncryptionRecipientCertificateList.HEADER_ID;
      // Undeclared exception!
      try { 
        zipArchiveEntry0.removeExtraField(zipShort0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = new byte[5];
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      assertTrue(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)7;
      zipArchiveEntry1.setCentralDirectoryExtra(byteArray0);
      assertFalse(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      assertNotSame(zipArchiveEntry1, zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.isUnixSymlink();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getUnixMode());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setExtraFields((ZipExtraField[]) null);
      byte[] byteArray0 = new byte[5];
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      int int0 = zipArchiveEntry0.getUnixMode();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      File file0 = MockFile.createTempFile("*M^/+^P!SzE*a 8ZZd$", "*M^/+^P!SzE*a 8ZZd$");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "*M^/+^P!SzE*a 8ZZd$");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(1392409281320L, long0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals("*M^/+^P!SzE*a 8ZZd$", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getRawName();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      // Undeclared exception!
      try { 
        zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      zipArchiveEntry0.getExtraFields(false);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = new byte[5];
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setExtraFields((ZipExtraField[]) null);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields(true);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      Object object0 = zipArchiveEntry0.clone();
      assertTrue(object0.equals((Object)zipArchiveEntry0));
      
      byte[] byteArray0 = new byte[6];
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      boolean boolean0 = zipArchiveEntry0.equals(object0);
      assertFalse(object0.equals((Object)zipArchiveEntry0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setSize(1L);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertFalse(boolean0);
      assertEquals(1L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      zipArchiveEntry1.setExternalAttributes((-348L));
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals((-348L), zipArchiveEntry1.getExternalAttributes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      zipArchiveEntry1.setUnixMode((-1474));
      zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals(3, zipArchiveEntry1.getPlatform());
      assertEquals(0, zipArchiveEntry0.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("o\"kwT");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = zipArchiveEntry0.equals(x5455_ExtendedTimestamp0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("NAME_WITH_EFS_FLAG/");
      boolean boolean0 = zipArchiveEntry0.equals((Object) null);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertFalse(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertTrue(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("B");
      FileTime fileTime0 = FileTime.fromMillis((-1397L));
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setCreationTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      FileTime fileTime0 = FileTime.from(0L, timeUnit0);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastAccessTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      assertTrue(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipArchiveEntry1.addAsFirstExtraField(resourceAlignmentExtraField0);
      assertNotSame(zipArchiveEntry1, zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipArchiveEntry0.addAsFirstExtraField(unparseableExtraFieldData0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
      MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "7eY]K2K=SX8wrQ^``W");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.addAsFirstExtraField((ZipExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setExtra();
      ZipArchiveEntry zipArchiveEntry1 = null;
      try {
        zipArchiveEntry1 = new ZipArchiveEntry(zipArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%sV\"");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[2];
      linkOptionArray0[4] = linkOptionArray0[3];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOptionArray0[0];
      linkOptionArray0[7] = linkOptionArray0[0];
      linkOptionArray0[8] = linkOptionArray0[6];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, ".^_4!<)d! $KW", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "eb/");
      MockFile.createTempFile("]+ /:", (String) null, (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "eb/");
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[4];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOptionArray0[1];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(zip64ExtendedInformationExtraField0, byteArray0, (byte) (-1), (byte) (-1), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 > -2
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      JarMarker jarMarker0 = JarMarker.getInstance();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(jarMarker0, byteArray0, 4984, (-1258), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4984 > 3726
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(26625, true, 0);
      byte[] byteArray0 = new byte[6];
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(resourceAlignmentExtraField0, byteArray0, 26625, 0, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Too short content for ResourceAlignmentExtraField (0xa11e): 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getAlignment();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, int0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("RiQYg]ZQiH;g).s`Q");
      zipArchiveEntry0.getCommentSource();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("RiQYg]ZQiH;g).s`Q", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      zipArchiveEntry0.setLocalHeaderOffset((-1L));
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastAccessTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // lastAccessTime
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[4];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      long long0 = zipArchiveEntry0.getLocalHeaderOffset();
      assertEquals((-1L), long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      MockFile mockFile0 = new MockFile("{|*~hjH7iBL3XA.", "{|*~hjH7iBL3XA.");
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "U'zV:-9T)");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      FileTime fileTime0 = FileTime.from((-812L), timeUnit0);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      assertEquals(0, zipArchiveEntry0.getPlatform());
      
      zipArchiveEntry0.setPlatform((-1));
      zipArchiveEntry0.setName("");
      assertEquals((-1), zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setDataOffset((-969L));
      assertEquals((-969L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      int int0 = zipArchiveEntry0.getVersionMadeBy();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setRawFlag((-1474));
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals((-1474), int0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      zipArchiveEntry0.getUnparseableExtraFieldData();
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.getName());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.hashCode();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = null;
      try {
        zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("o\"kwT");
      zipArchiveEntry0.getNameSource();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), long0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getVersionRequired();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setDiskNumberStart((byte) (-121));
      assertEquals((-121L), zipArchiveEntry0.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      FileTime fileTime0 = FileTime.fromMillis(0L);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setLastModifiedTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setCreationTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // creationTime
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("}XuHL32PhO<O`~#GM#8");
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipArchiveEntry0.addExtraField(unparseableExtraFieldData0);
      UnparseableExtraFieldData unparseableExtraFieldData1 = zipArchiveEntry0.getUnparseableExtraFieldData();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertNotNull(unparseableExtraFieldData1);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.isStreamContiguous();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(":6c");
      zipArchiveEntry0.setVersionRequired(0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0, zipArchiveEntry0.getVersionRequired());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      byte[] byteArray0 = new byte[0];
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      boolean boolean0 = zipArchiveEntry0.isDirectory();
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.toString());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertFalse(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      zipArchiveEntry0.setStreamContiguous(false);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertFalse(zipArchiveEntry0.isStreamContiguous());
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      long long0 = zipArchiveEntry0.getDiskNumberStart();
      assertEquals(0L, long0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.toString());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[4];
      zipArchiveEntry0.setName((String) null, byteArray0);
      ZipArchiveEntry zipArchiveEntry1 = null;
      try {
        zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("o\"kwT");
      ZipArchiveEntry.NameSource zipArchiveEntry_NameSource0 = ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG;
      zipArchiveEntry0.setNameSource(zipArchiveEntry_NameSource0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      ZipArchiveEntry.CommentSource zipArchiveEntry_CommentSource0 = ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
      zipArchiveEntry0.setCommentSource(zipArchiveEntry_CommentSource0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.toString());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
      assertEquals(0, zipArchiveEntry1.getPlatform());
      assertEquals((-1L), zipArchiveEntry1.getSize());
      assertEquals((-1), zipArchiveEntry1.getMethod());
      assertTrue(boolean0);
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("{=l~w6,sdYmOc[Y");
      Date date0 = zipArchiveEntry0.getLastModifiedDate();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("{=l~w6,sdYmOc[Y", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("h|8");
      GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
      zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }
}
