
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
import java.math.BigInteger;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
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
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveEntry_ESTest extends ZipArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment(30);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is 30
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("]OKbDYHoD>^lk");
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      zipArchiveEntry0.addAsFirstExtraField(x0019_EncryptionRecipientCertificateList0);
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(zip64ExtendedInformationExtraField0, byteArray0, (byte) (-35), (-1), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -35 > -36
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setMethod(2635);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry((ZipEntry) zipArchiveEntry0);
      assertEquals(2635, zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      byte[] byteArray0 = new byte[1];
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.onUnparseableExtraField(byteArray0, 0, 0, false, (-1363));
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(x000A_NTFS0.HEADER_ID);
      assertNotSame(zipExtraField0, x000A_NTFS0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)3;
      zipArchiveEntry0.setExtra(byteArray0);
      UnparseableExtraFieldData unparseableExtraFieldData0 = zipArchiveEntry0.getUnparseableExtraFieldData();
      assertNotNull(unparseableExtraFieldData0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      File file0 = MockFile.createTempFile("0x000A Zip Extra Field:", "0x000A Zip Extra Field:");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "4jZdkUkv:UDff6g+J<");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(1392409281320L, long0);
      assertEquals("4jZdkUkv:UDff6g+J<", zipArchiveEntry0.getName());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      MockFile mockFile0 = new MockFile("qfL=N*me]dS5(8D", "qfL=N*me]dS5(8D");
      MockFile.createTempFile("qfL=N*me]dS5(8D", "qfL=N*me]dS5(8D", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "qfL=N*me]dS5(8D");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), long0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("qfL=N*me]dS5(8D/", zipArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setRawFlag(1169);
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals(1169, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.setUnixMode((byte) (-92));
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals(65444, zipArchiveEntry0.getUnixMode());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      
      zipArchiveEntry0.setPlatform((-1));
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.getName();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getName();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      
      zipArchiveEntry0.setMethod(0);
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      File file0 = MockFile.createTempFile("72DUnoLO", "|0J=<_+");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "|0J=<_+");
      zipArchiveEntry0.setMethod(61440);
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals(61440, int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.setUnixMode((byte) (-92));
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals(3, zipArchiveEntry0.getPlatform());
      assertEquals((-6029312L), long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("k:");
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      
      zipArchiveEntry0.setDataOffset(0);
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("S^~K)!=wu)}.8/1}Zqg");
      byte[] byteArray0 = new byte[6];
      zipArchiveEntry0.setExtra(byteArray0);
      byte[] byteArray1 = zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      FileTime fileTime0 = FileTime.fromMillis(0);
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
  public void test020()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("iw2mbr|]O");
      Instant instant0 = MockInstant.ofEpochMilli(4348L);
      FileTime fileTime0 = FileTime.from(instant0);
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
  public void test021()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("jHh NWeK-P=G5e`6J/");
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
  public void test022()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
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
  public void test023()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      zipArchiveEntry0.addExtraField(unicodeCommentExtraField0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      try { 
        zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
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
  public void test025()  throws Throwable  {
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
  public void test026()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
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
  public void test027()  throws Throwable  {
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
  public void test028()  throws Throwable  {
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
  public void test029()  throws Throwable  {
      File file0 = MockFile.createTempFile("_?5!rRkk^Z}wUn-k zL", "_?5!rRkk^Z}wUn-k zL");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, ")Jt.|0qQ");
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
  public void test030()  throws Throwable  {
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
  public void test031()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((File) null, "$VALUES");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource");
      zipArchiveEntry0.setTime(1392409281320L);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource", zipArchiveEntry0.toString());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setMethod((-2405));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -2405
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[0] = (ZipExtraField) unparseableExtraFieldData0;
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
  public void test035()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.setUnixMode((byte) (-92));
      int int0 = zipArchiveEntry0.getUnixMode();
      assertEquals(65444, int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("m&(uX*lu=[^/");
      zipArchiveEntry0.getUnixMode();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("K|IO*_Y4/3wFXOs1n?\"");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("k:");
      byte[] byteArray0 = zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      zipArchiveEntry0.setExtra(byteArray0);
      byte[] byteArray1 = zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(8, byteArray1.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("DRACONIC");
      zipArchiveEntry0.getExtraFields(false);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      zipArchiveEntry0.getExtraField(x5455_ExtendedTimestamp0.HEADER_ID);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("+hl}lNTlnz,-u");
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
      zipArchiveEntry0.getExtraField(zipShort0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      zipArchiveEntry0.setExtra(byteArray0);
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.getExtraField(x5455_ExtendedTimestamp0.HEADER_ID);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      MockFile mockFile0 = new MockFile("qfL=N*me]dS5(8D", "qfL=N*me]dS5(8D");
      MockFile.createTempFile("qfL=N*me]dS5(8D", "qfL=N*me]dS5(8D", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "qfL=N*me]dS5(8D");
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals("qfL=N*me]dS5(8D/", zipArchiveEntry0.toString());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("DRACONIC");
      boolean boolean0 = zipArchiveEntry0.isDirectory();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("K|IO*_Y4/3wFXOs1n?\"");
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, long0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      int int0 = zipArchiveEntry0.getInternalAttributes();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setExtra();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      File file0 = MockFile.createTempFile("72DUnoLO", "|0J=<_+");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "|0J=<_+");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0L, long0);
      assertEquals("|0J=<_+", zipArchiveEntry0.toString());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      MockFile mockFile0 = new MockFile("dni");
      File file0 = MockFile.createTempFile("dni", "(_IXson1tG Pjuki", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
      GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
      zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals("", zipArchiveEntry0.toString());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.setExternalAttributes((byte)3);
      assertEquals(3L, zipArchiveEntry0.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("k:");
      zipArchiveEntry0.setInternalAttributes((-1095));
      assertEquals((-1095), zipArchiveEntry0.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, int0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[6];
      JarMarker jarMarker0 = JarMarker.getInstance();
      zipExtraFieldArray0[0] = (ZipExtraField) jarMarker0;
      AsiExtraField asiExtraField0 = new AsiExtraField();
      zipExtraFieldArray0[1] = (ZipExtraField) asiExtraField0;
      byte[] byteArray0 = new byte[7];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("", byteArray0, 0, (byte)4);
      zipExtraFieldArray0[2] = (ZipExtraField) unicodePathExtraField0;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipExtraFieldArray0[3] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      zipExtraFieldArray0[4] = (ZipExtraField) x000A_NTFS0;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      zipExtraFieldArray0[5] = (ZipExtraField) unicodeCommentExtraField0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.LFH_SIG;
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)106);
      zipArchiveEntry0.addAsFirstExtraField(x5455_ExtendedTimestamp0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(100L);
      x5455_ExtendedTimestamp0.setAccessJavaTime(mockDate0);
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("NAME");
      zipArchiveEntry0.setUnixMode(1);
      assertEquals(1, zipArchiveEntry0.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setSize((byte) (-69));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.setUnixMode((byte) (-92));
      zipArchiveEntry0.setName("ZipShort value: ");
      assertEquals(3, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setName((String) null, (byte[]) null);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime((long) (byte) (-108));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setAlignment(0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("K|IO*_Y4/3wFXOs1n?\"");
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
  public void test066()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-29);
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.removeUnparseableExtraFieldData();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("DRACONIC");
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      ZipShort zipShort0 = unrecognizedExtraField0.getCentralDirectoryLength();
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
  public void test068()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[5];
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      AsiExtraField asiExtraField0 = new AsiExtraField();
      zipExtraFieldArray0[0] = (ZipExtraField) asiExtraField0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[2] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[3] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[4] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("K|IO*_Y4/3wFXOs1n?\"");
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipArchiveEntry0.addExtraField(unparseableExtraFieldData0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      boolean boolean0 = zipArchiveEntry0.isUnixSymlink();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertFalse(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getRawName();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields(true);
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      zipArchiveEntry1.setLocalHeaderOffset(0L);
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals(0L, zipArchiveEntry1.getLocalHeaderOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      assertTrue(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
      
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipArchiveEntry1.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      zipArchiveEntry1.setSize(3);
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals(3L, zipArchiveEntry1.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setComment("]%UG{nZBI3o/");
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals((-1), zipArchiveEntry1.getMethod());
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
      assertTrue(boolean0);
      assertEquals(0, zipArchiveEntry1.getPlatform());
      assertEquals((-1L), zipArchiveEntry1.getSize());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry1.getSize());
      assertEquals(0, zipArchiveEntry1.getPlatform());
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry1.getMethod());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      Object object0 = new Object();
      boolean boolean0 = zipArchiveEntry0.equals(object0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertTrue(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals((Object) null);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertFalse(boolean0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      Instant instant0 = MockInstant.now();
      FileTime fileTime0 = FileTime.from(instant0);
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
  public void test088()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      zipArchiveEntry0.addAsFirstExtraField(zip64ExtendedInformationExtraField0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      MockFile mockFile0 = new MockFile("qfL=N*me]dS5(8D", "qfL=N*me]dS5(8D");
      MockFile.createTempFile("qfL=N*me]dS5(8D", "qfL=N*me]dS5(8D", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "qfL=N*me]dS5(8D");
      zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals("qfL=N*me]dS5(8D/", zipArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      MockFile mockFile0 = new MockFile("b#pbU\"*EC");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "b#pbU\"*EC", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[3];
      linkOptionArray0[5] = linkOptionArray0[1];
      linkOptionArray0[6] = linkOptionArray0[5];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, " \\Tj$=~(:.C+HX32C/", linkOptionArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      zipArchiveEntry0.addExtraField(unicodeCommentExtraField0);
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
  public void test094()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[9];
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = (X5455_ExtendedTimestamp)zipArchiveEntry_ExtraFieldParsingMode0.fill(x5455_ExtendedTimestamp0, byteArray0, (byte)2, (byte)1, true);
      assertEquals((byte)0, x5455_ExtendedTimestamp1.getFlags());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getAlignment();
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getCommentSource();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      FileTime fileTime0 = FileTime.from((long) (-1), timeUnit0);
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
  public void test098()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)3;
      zipArchiveEntry0.setExtra(byteArray0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "bvA^b%!U<8LVQG", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getLocalHeaderOffset();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource", "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "org.apache.commons.compress.archivers.zip.ZipArchiveEntry$NameSource");
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
  public void test102()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      int int0 = zipArchiveEntry0.getVersionMadeBy();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      File file0 = MockFile.createTempFile("72DUnoLO", "|0J=<_+");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "|0J=<_+");
      zipArchiveEntry0.setVersionMadeBy(0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertFalse(zipArchiveEntry0.isDirectory());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
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
  public void test105()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.getUnparseableExtraFieldData();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.hashCode();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getNameSource();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      zipArchiveEntry0.setExtra(byteArray0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(2, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getVersionRequired();
      assertEquals(0, int0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      File file0 = MockFile.createTempFile("72DUnoLO", "|0J=<_+");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "|0J=<_+");
      zipArchiveEntry0.setDiskNumberStart(255L);
      long long0 = zipArchiveEntry0.getDiskNumberStart();
      assertEquals(255L, long0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Bad symbolic link name length ");
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
  public void test114()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipArchiveEntry0.addExtraField(x5455_ExtendedTimestamp0);
      zipArchiveEntry0.removeExtraField(x5455_ExtendedTimestamp0.HEADER_ID);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.isStreamContiguous();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionRequired(38);
      assertEquals(38, zipArchiveEntry0.getVersionRequired());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-71);
      zipArchiveEntry0.setExtra(byteArray0);
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      zipArchiveEntry0.setUnixMode((byte) (-92));
      boolean boolean0 = zipArchiveEntry0.isUnixSymlink();
      assertEquals(3, zipArchiveEntry0.getPlatform());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setStreamContiguous(false);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertFalse(zipArchiveEntry0.isStreamContiguous());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("ZipShort value: ");
      long long0 = zipArchiveEntry0.getDiskNumberStart();
      assertEquals(0L, long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("k:");
      ZipArchiveEntry.NameSource zipArchiveEntry_NameSource0 = ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
      zipArchiveEntry0.setNameSource(zipArchiveEntry_NameSource0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      try { 
        zipArchiveEntry0.setExtra((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.CommentSource zipArchiveEntry_CommentSource0 = ZipArchiveEntry.CommentSource.COMMENT;
      zipArchiveEntry0.setCommentSource(zipArchiveEntry_CommentSource0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("BEST_EFFORT");
      Date date0 = zipArchiveEntry0.getLastModifiedDate();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry(zipArchiveEntry0);
      assertEquals(0, zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }
}
