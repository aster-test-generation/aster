
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
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory;
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExtraFieldUtils_ESTest extends ExtraFieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getHeaderId();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraField(zipShort0);
      assertFalse(zipExtraField0.equals((Object)unparseableExtraFieldData0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte)79;
      try { 
        ExtraFieldUtils.parse(byteArray0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 4.  Block length of 79 bytes exceeds remaining data of 0 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[9];
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, 4, (byte)107, true, (byte)66);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      byte[] byteArray0 = new byte[3];
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte) (-82), (byte) (-82), false, (byte) (-82));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at -82.  Block length of -82 bytes exceeds remaining data of -86 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[0];
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, 0, 32, false, 0);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      ZipShort zipShort0 = x0015_CertificateIdForFile0.getLocalFileDataLength();
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      byte[] byteArray0 = new byte[7];
      try { 
        ExtraFieldUtils.fillExtraField(zipExtraField0, byteArray0, (byte)9, 2268, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Failed to parse corrupt ZIP extra field of type 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true);
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipShort zipShort0 = UnicodeCommentExtraField.UCOM_ID;
      byte[] byteArray0 = zipShort0.getBytes();
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[9];
      ZipExtraField zipExtraField0 = ExtraFieldUtils.fillExtraField(x7875_NewUnix0, byteArray0, (byte) (-3), (-1016), false);
      assertSame(zipExtraField0, x7875_NewUnix0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.register((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.register(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, true, (ExtraFieldUtils.UnparseableExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-4);
      try { 
        ExtraFieldUtils.parse(byteArray0, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 252 bytes exceeds remaining data of 4 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeLocalFileDataData((ZipExtraField[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0);
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(zip64ExtendedInformationExtraField0, byteArray0, (-128), (-128), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(x0014_X509Certificates0, byteArray0, 2, (byte) (-1), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 > 1
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.createExtraFieldNoDefault((ZipShort) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.createExtraField((ZipShort) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)58;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-128);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[4];
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipExtraFieldArray0[2] = (ZipExtraField) resourceAlignmentExtraField0;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipExtraField[] zipExtraFieldArray1 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(3, zipExtraFieldArray1.length);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(unrecognizedExtraField0, byteArray0, (byte) (-23), 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipShort zipShort0 = UnicodeCommentExtraField.UCOM_ID;
      UnicodeCommentExtraField unicodeCommentExtraField0 = (UnicodeCommentExtraField)ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertEquals(0L, unicodeCommentExtraField0.getNameCRC32());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getCentralDirectoryLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)16;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(0, zipExtraFieldArray0.length);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[4];
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipExtraFieldArray0[2] = (ZipExtraField) resourceAlignmentExtraField0;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      unparseableExtraFieldData0.parseFromLocalFileData(byteArray0, 0, (byte)2);
      assertEquals(16, byteArray0.length);
      
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(18, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[5];
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      zipExtraFieldArray0[0] = (ZipExtraField) x0017_StrongEncryptionHeader0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0);
      zipExtraFieldArray0[1] = (ZipExtraField) resourceAlignmentExtraField0;
      zipExtraFieldArray0[2] = (ZipExtraField) resourceAlignmentExtraField0;
      byte[] byteArray0 = new byte[9];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("fill must not return null", byteArray0, 0, 1);
      zipExtraFieldArray0[3] = (ZipExtraField) unicodePathExtraField0;
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      zipExtraFieldArray0[4] = (ZipExtraField) x0016_CertificateIdForCentralDirectory0;
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(54, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[4];
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipExtraFieldArray0[0] = (ZipExtraField) x5455_ExtendedTimestamp0;
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipExtraFieldArray0[2] = (ZipExtraField) resourceAlignmentExtraField0;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[4];
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[3];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      zipExtraFieldArray0[0] = (ZipExtraField) unicodePathExtraField0;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipExtraFieldArray0[1] = (ZipExtraField) resourceAlignmentExtraField0;
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      zipExtraFieldArray0[2] = (ZipExtraField) x0017_StrongEncryptionHeader0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      try { 
        ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // UniCode path extra data must have at least 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      // Undeclared exception!
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte) (-19), 2, false, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)16;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)61;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      try { 
        ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 15616 bytes exceeds remaining data of 2 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(5, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-38);
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(6, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte) (-38), (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ExtraFieldUtils extraFieldUtils0 = new ExtraFieldUtils();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<UnparseableExtraFieldData> class0 = UnparseableExtraFieldData.class;
      ExtraFieldUtils.register(class0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }
}
