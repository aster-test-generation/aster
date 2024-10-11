
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
import java.time.Instant;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveEntry_ESTest extends ZipArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("y',L8AO(_");
      zipArchiveEntry0.setPlatform((-1353));
      zipArchiveEntry0.setName("J");
      assertEquals((-1353), zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(2);
      assertEquals(2, zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment((-6055));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is -6055
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      byte[] byteArray0 = new byte[5];
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.onUnparseableExtraField(byteArray0, 0, 3, false, (byte)0);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("|C9O");
      assertFalse(zipArchiveEntry0.isDirectory());
      
      zipArchiveEntry0.setName("y',L8AO(_/");
      zipArchiveEntry0.isDirectory();
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionMadeBy((-2291));
      int int0 = zipArchiveEntry0.getVersionMadeBy();
      assertEquals((-2291), int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      File file0 = MockFile.createTempFile("{;~I}", "{;~I}");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "[Qys");
      long long0 = zipArchiveEntry0.getTime();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(1392409281320L, long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setUnixMode(0);
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("[Qys");
      String string0 = zipArchiveEntry0.getName();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals("[Qys", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getName();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Mm`");
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      zipArchiveEntry0.addAsFirstExtraField(x0014_X509Certificates0);
      zipArchiveEntry0.getExtraFields(false);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      File file0 = MockFile.createTempFile("NAME_WITH_EFS_FLAG", "NAME_WITH_EFS_FLAG");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "NAME_WITH_EFS_FLAG");
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      zipArchiveEntry0.addAsFirstExtraField(x000A_NTFS0);
      zipArchiveEntry0.getExtraFields();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("NAME");
      zipArchiveEntry0.setUnixMode(3158);
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals(206962689L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("BEST_EFFORT");
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
  public void test014()  throws Throwable  {
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
  public void test015()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
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
  public void test016()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
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
  public void test017()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("NJPF6");
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
  public void test018()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      // Undeclared exception!
      try { 
        zipArchiveEntry0.addExtraField(unrecognizedExtraField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      File file0 = MockFile.createTempFile("NAME_WITH_EFS_FLAG", "NAME_WITH_EFS_FLAG");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "NAME_WITH_EFS_FLAG");
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
  public void test020()  throws Throwable  {
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
  public void test021()  throws Throwable  {
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
  public void test022()  throws Throwable  {
      File file0 = MockFile.createTempFile("px[MU", "px[MU");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "`^hujAaK");
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
  public void test023()  throws Throwable  {
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
  public void test024()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry((File) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "|)5");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      File file0 = MockFile.createTempFile("NAME_WITH_EFS_FLAG", "NAME_WITH_EFS_FLAG");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "NAME_WITH_EFS_FLAG");
      zipArchiveEntry0.setSize(689L);
      assertEquals(689L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("STRICT_FOR_KNOW_EXTRA_FIELDS");
      byte[] byteArray0 = zipArchiveEntry0.getLocalFileDataExtra();
      zipArchiveEntry0.setPlatform(1742);
      zipArchiveEntry0.setName("STRICT_FOR_KNOW_EXTRA_FIELDS", byteArray0);
      assertEquals(1742, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Mm`/");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setMethod((-992));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -992
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      File file0 = MockFile.createTempFile("ZIP compression method can not be negative: ", "ZCy5daJ2xi]u1 ");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "ZCy5daJ2xi]u1 ");
      int int0 = zipArchiveEntry0.getUnixMode();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      File file0 = MockFile.createTempFile("wDHqHCB&h5NL/", "|(q19,f(OzJq{p");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "wDHqHCB&h5NL/");
      FileTime fileTime0 = zipArchiveEntry0.getLastModifiedTime();
      zipArchiveEntry0.setTime(fileTime0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      MockFile mockFile0 = new MockFile("O|Pg8/JaD$R=P");
      mockFile0.mkdirs();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "P");
      zipArchiveEntry0.getLocalFileDataExtra();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("P/", zipArchiveEntry0.toString());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Mm`");
      zipArchiveEntry0.getExtraFields(false);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      JarMarker jarMarker0 = new JarMarker();
      ZipShort zipShort0 = jarMarker0.getLocalFileDataLength();
      zipArchiveEntry0.getExtraField(zipShort0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      MockFile mockFile0 = new MockFile("O|Pg8/JaD$R=P");
      mockFile0.mkdirs();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "P");
      int int0 = zipArchiveEntry0.getMethod();
      assertEquals((-1), int0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals("P/", zipArchiveEntry0.getName());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("NAME");
      long long0 = zipArchiveEntry0.getExternalAttributes();
      assertEquals(0L, long0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      File file0 = MockFile.createTempFile("{;~I}", "{;~I}");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "[Qys");
      int int0 = zipArchiveEntry0.getInternalAttributes();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals(0, int0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals("[Qys", zipArchiveEntry0.toString());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("=[Gy]}l");
      zipArchiveEntry0.setExtra();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals("=[Gy]}l", zipArchiveEntry0.getName());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("BEST_EFFORT");
      long long0 = zipArchiveEntry0.getSize();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("=MjOu;+?xsq5m)i");
      zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      MockFile mockFile0 = new MockFile("O|Pg8/JaD$R=P");
      mockFile0.mkdirs();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "P");
      GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
      zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals("P/", zipArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("X7875_NewUnix length is too short, only ");
      Instant instant0 = MockInstant.now();
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
  public void test042()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commjns.comress.aUchivers.[ip.JarMarker/");
      zipArchiveEntry0.setExternalAttributes(67324752L);
      assertEquals(67324752L, zipArchiveEntry0.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setInternalAttributes(2048);
      assertEquals(2048, zipArchiveEntry0.getInternalAttributes());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      int int0 = zipArchiveEntry0.getPlatform();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      File file0 = MockFile.createTempFile("NAME_WITH_EFS_FLAG", "NAME_WITH_EFS_FLAG");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "NAME_WITH_EFS_FLAG");
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      zipArchiveEntry0.addAsFirstExtraField(x000A_NTFS0);
      zipArchiveEntry0.getExtraField(x000A_NTFS0.HEADER_ID);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals("NAME_WITH_EFS_FLAG", zipArchiveEntry0.getName());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-74));
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[6];
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[2] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[3] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[4] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[5] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[6];
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[2] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[3] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[4] = (ZipExtraField) x5455_ExtendedTimestamp0;
      ZipLong zipLong0 = ZipLong.AED_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      zipExtraFieldArray0[5] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[6];
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)1;
      x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, (byte)1, 532);
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[2] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[3] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[4] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[5] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[6];
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[2] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[3] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[4] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[5] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      byte[] byteArray0 = zipArchiveEntry0.getCentralDirectoryExtra();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(30, byteArray0.length);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("UNICOV1_EXTRA_FIELD");
      zipArchiveEntry0.setUnixMode((-2930));
      assertEquals((-192020480L), zipArchiveEntry0.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      MockFile mockFile0 = new MockFile("d/");
      MockFile.createTempFile("org.apache.commons.compress.archivers.zip.AsiExtraField", "", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "d/");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setSize((-1099L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commjns.comress.aUchivers.[ip.JarMarker/");
      zipArchiveEntry0.setExtraFields((ZipExtraField[]) null);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.JarMarker/");
      zipArchiveEntry0.setAlignment(0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("UNICOV1_EXTRA_FIELD");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setAlignment(11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for alignment, must be power of two and no bigger than 65535 but is 11
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      File file0 = MockFile.createTempFile("ZIP compression method can not be negative: ", "ZCy5daJ2xi]u1 ");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "ZCy5daJ2xi]u1 ");
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
  public void test056()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      JarMarker jarMarker0 = new JarMarker();
      ZipShort zipShort0 = jarMarker0.getLocalFileDataLength();
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
  public void test057()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      zipArchiveEntry0.addExtraField(unicodeCommentExtraField0);
      zipArchiveEntry0.removeExtraField(unicodeCommentExtraField0.UCOM_ID);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[5];
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("y',L8AO(_");
      byte[] byteArray0 = new byte[8];
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[0];
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      byteArray0[3] = (byte)123;
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("y',L8AO(_");
      byte[] byteArray0 = new byte[8];
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[0];
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      zipArchiveEntry0.setExtra(byteArray0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[9];
      zipArchiveEntry0.setExtra(byteArray0);
      FileTime fileTime0 = FileTime.fromMillis(0);
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
  public void test062()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("y',L8AO(_");
      boolean boolean0 = zipArchiveEntry0.isUnixSymlink();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setUnixMode(0);
      int int0 = zipArchiveEntry0.getUnixMode();
      assertEquals(1L, zipArchiveEntry0.getExternalAttributes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getTime();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), long0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[7];
      zipArchiveEntry0.setName("", byteArray0);
      zipArchiveEntry0.getRawName();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.getRawName();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      zipArchiveEntry0.addAsFirstExtraField(x0014_X509Certificates0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("NAME");
      zipArchiveEntry0.setName((String) null);
      boolean boolean0 = zipArchiveEntry0.isDirectory();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[0];
      zipArchiveEntry0.setExtraFields(zipExtraFieldArray0);
      ZipExtraField[] zipExtraFieldArray1 = zipArchiveEntry0.getExtraFields(true);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipExtraFieldArray1.length);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry zipArchiveEntry1 = (ZipArchiveEntry)zipArchiveEntry0.clone();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry1);
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
      assertTrue(boolean0);
      assertEquals(0, zipArchiveEntry1.getPlatform());
      assertEquals((-1L), zipArchiveEntry1.getSize());
      assertEquals(0, zipArchiveEntry1.getInternalAttributes());
      assertEquals((-1L), zipArchiveEntry1.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry1.getMethod());
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("y',L8AO(_");
      boolean boolean0 = zipArchiveEntry0.equals("y',L8AO(_");
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertFalse(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = zipArchiveEntry0.equals(zipArchiveEntry0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertTrue(boolean0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("y',L8AO(_");
      boolean boolean0 = zipArchiveEntry0.equals((Object) null);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("NAME");
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      FileTime fileTime0 = FileTime.from((long) 3, timeUnit0);
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
  public void test076()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      zipArchiveEntry0.addAsFirstExtraField(x0014_X509Certificates0);
      zipArchiveEntry0.addAsFirstExtraField(x0014_X509Certificates0);
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipArchiveEntry0.addAsFirstExtraField(unparseableExtraFieldData0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MockFile mockFile0 = new MockFile("=e$r@nJdM79-5$", "hTz.+Qci\\i j'Id");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[4];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOptionArray0[1];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "hTz.+Qci\\i j'Id", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      MockFile mockFile0 = new MockFile("y',AO(_/", "y',AO(_/");
      MockFile.createTempFile("YQ'9", ":J?P", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "ZCy5daJ2xi]u1 /");
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
  public void test080()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[3];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOptionArray0[0];
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
  public void test081()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      byte[] byteArray0 = new byte[6];
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField((byte)0, true);
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(resourceAlignmentExtraField0, byteArray0, 1219, (-2452), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1219 > -1233
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      byte[] byteArray0 = new byte[6];
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField((byte)0, false);
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(resourceAlignmentExtraField0, byteArray0, 1219, (-2452), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1219 > -1233
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      byte[] byteArray0 = new byte[5];
      ZipExtraField zipExtraField1 = zipArchiveEntry_ExtraFieldParsingMode0.fill(zipExtraField0, byteArray0, (byte)2, 3, false);
      assertSame(zipExtraField1, zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      File file0 = MockFile.createTempFile("{;~I}", "{;~I}");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "[Qys");
      int int0 = zipArchiveEntry0.getAlignment();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals("[Qys", zipArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.getCommentSource();
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      
      zipArchiveEntry0.setLocalHeaderOffset(0);
      assertEquals(0L, zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
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
  public void test088()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[3];
      ZipArchiveEntry zipArchiveEntry0 = null;
      try {
        zipArchiveEntry0 = new ZipArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      long long0 = zipArchiveEntry0.getLocalHeaderOffset();
      assertEquals((-1L), long0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("|JvZj3r2i9BA`#BK");
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      FileTime fileTime0 = FileTime.from(1L, timeUnit0);
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
  public void test091()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setDataOffset(396L);
      assertEquals(396L, zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.JarMarker/");
      int int0 = zipArchiveEntry0.getVersionMadeBy();
      assertEquals(0, int0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setRawFlag(3);
      assertEquals(3, zipArchiveEntry0.getRawFlag());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("UNICOV1_EXTRA_FIELD");
      zipArchiveEntry0.getUnparseableExtraFieldData();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.hashCode();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.getNameSource();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.getExtraFields();
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      long long0 = zipArchiveEntry0.getDataOffset();
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      zipArchiveEntry0.addAsFirstExtraField(x0014_X509Certificates0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      ZipExtraField[] zipExtraFieldArray0 = zipArchiveEntry0.getExtraFields((ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(1, zipExtraFieldArray0.length);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      int int0 = zipArchiveEntry0.getVersionRequired();
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, int0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("|C9O");
      zipArchiveEntry0.setDiskNumberStart(65535L);
      assertEquals(65535L, zipArchiveEntry0.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      // Undeclared exception!
      try { 
        zipArchiveEntry0.setTime(1558L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
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
  public void test104()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.JarMarker/");
      int int0 = zipArchiveEntry0.getRawFlag();
      assertEquals(0, int0);
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("|C9O");
      zipArchiveEntry0.isStreamContiguous();
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionRequired((byte)103);
      assertEquals(103, zipArchiveEntry0.getVersionRequired());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)36;
      zipArchiveEntry0.setCentralDirectoryExtra(byteArray0);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setStreamContiguous(true);
      boolean boolean0 = zipArchiveEntry0.isStreamContiguous();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      long long0 = zipArchiveEntry0.getDiskNumberStart();
      assertEquals(0L, long0);
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals((-1L), zipArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntry.NameSource zipArchiveEntry_NameSource0 = ZipArchiveEntry.NameSource.NAME;
      zipArchiveEntry0.setNameSource(zipArchiveEntry_NameSource0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals((-1L), zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
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
  public void test112()  throws Throwable  {
      File file0 = MockFile.createTempFile("{;~I}", "{;~I}");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "[Qys");
      ZipArchiveEntry.CommentSource zipArchiveEntry_CommentSource0 = ZipArchiveEntry.CommentSource.COMMENT;
      zipArchiveEntry0.setCommentSource(zipArchiveEntry_CommentSource0);
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals("[Qys", zipArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      File file0 = MockFile.createTempFile("ZIP compression method can not be negative: ", "ZCy5daJ2xi]u1 ");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "ZCy5daJ2xi]u1 ");
      Date date0 = zipArchiveEntry0.getLastModifiedDate();
      assertEquals(0L, zipArchiveEntry0.getSize());
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
      assertEquals((-1L), zipArchiveEntry0.getDataOffset());
      assertEquals("ZCy5daJ2xi]u1 ", zipArchiveEntry0.toString());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals((-1), zipArchiveEntry0.getMethod());
      assertEquals(0, zipArchiveEntry0.getPlatform());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("|C9O");
      assertEquals((-1), zipArchiveEntry0.getMethod());
      
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry(zipArchiveEntry0);
      assertEquals(0, zipArchiveEntry0.getMethod());
      assertTrue(zipArchiveEntry1.equals((Object)zipArchiveEntry0));
  }
}
