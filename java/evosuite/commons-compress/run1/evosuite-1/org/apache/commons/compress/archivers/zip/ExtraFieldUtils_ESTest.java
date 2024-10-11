
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
import java.math.BigInteger;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.AsiExtraField;
import org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior;
import org.apache.commons.compress.archivers.zip.ExtraFieldUtils;
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipExtraField;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExtraFieldUtils_ESTest extends ExtraFieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipShort zipShort0 = unparseableExtraFieldData0.getHeaderId();
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      assertNotSame(unparseableExtraFieldData0, zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      // Undeclared exception!
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (-1297), (byte) (-59), false, 1247);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1297 > -1356
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte) (-34), 4095, true, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-1);
      try { 
        ExtraFieldUtils.parse(byteArray0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 4.  Block length of 65280 bytes exceeds remaining data of 0 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(unicodePathExtraField0, byteArray0, 643, 1868, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Failed to parse corrupt ZIP extra field of type 7075
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.register(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)23;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      try { 
        ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 23 bytes exceeds remaining data of 5 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-29);
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldUtils.UnparseableExtraField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-112);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      try { 
        ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 144 bytes exceeds remaining data of 2 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[8];
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipExtraFieldArray0[0] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      zipExtraFieldArray0[1] = (ZipExtraField) x5455_ExtendedTimestamp0;
      JarMarker jarMarker0 = new JarMarker();
      zipExtraFieldArray0[2] = (ZipExtraField) jarMarker0;
      zipExtraFieldArray0[3] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      zipExtraFieldArray0[4] = (ZipExtraField) x7875_NewUnix0;
      zipExtraFieldArray0[5] = (ZipExtraField) x5455_ExtendedTimestamp0;
      byte[] byteArray0 = new byte[9];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("ZIP compression method can not be negative: ", byteArray0);
      zipExtraFieldArray0[6] = (ZipExtraField) unicodeCommentExtraField0;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, (byte)1);
      zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger0);
      zipExtraFieldArray0[7] = (ZipExtraField) jarMarker0;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zip64 extended information must contain both size values in the local file header.
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeCentralDirectoryData((ZipExtraField[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      try { 
        ExtraFieldUtils.fillExtraField(x7875_NewUnix0, byteArray0, 2083, (byte)0, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X7875_NewUnix length is too short, only 0 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(unrecognizedExtraField0, byteArray0, (-2358), 1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(x0014_X509Certificates0, byteArray0, 26477, (-1200), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 26477 > 25277
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte)30;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      ZipLong zipLong0 = ZipLong.DD_SIG;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(zip64ExtendedInformationExtraField0, byteArray0, (byte)32, (-168), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[8];
      ZipExtraField zipExtraField0 = ExtraFieldUtils.fillExtraField(resourceAlignmentExtraField0, byteArray0, 0, 2, true);
      assertSame(resourceAlignmentExtraField0, zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      ZipShort zipShort0 = asiExtraField0.getHeaderId();
      AsiExtraField asiExtraField1 = (AsiExtraField)ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertEquals("", asiExtraField1.getLinkedFile());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraField(zipShort0);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      zipExtraFieldArray0[0] = (ZipExtraField) x0019_EncryptionRecipientCertificateList0;
      byte[] byteArray0 = new byte[5];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("?Sj", byteArray0);
      zipExtraFieldArray0[1] = (ZipExtraField) unicodePathExtraField0;
      zipExtraFieldArray0[2] = (ZipExtraField) unicodePathExtraField0;
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      zipExtraFieldArray0[3] = (ZipExtraField) x0015_CertificateIdForFile0;
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      zipExtraFieldArray0[4] = (ZipExtraField) x0016_CertificateIdForCentralDirectory0;
      zipExtraFieldArray0[5] = (ZipExtraField) x0019_EncryptionRecipientCertificateList0;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[6] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(40, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      zipExtraFieldArray0[0] = (ZipExtraField) resourceAlignmentExtraField0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertArrayEquals(new byte[] {(byte)30, (byte) (-95), (byte)2, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[6] = (ZipExtraField) unparseableExtraFieldData0;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)59;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      zipExtraFieldArray0[0] = (ZipExtraField) x0019_EncryptionRecipientCertificateList0;
      byte[] byteArray0 = new byte[5];
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField("?Sj", byteArray0);
      zipExtraFieldArray0[1] = (ZipExtraField) unicodePathExtraField0;
      zipExtraFieldArray0[2] = (ZipExtraField) unicodePathExtraField0;
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      zipExtraFieldArray0[3] = (ZipExtraField) x0015_CertificateIdForFile0;
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      zipExtraFieldArray0[4] = (ZipExtraField) x0016_CertificateIdForCentralDirectory0;
      zipExtraFieldArray0[5] = (ZipExtraField) x0019_EncryptionRecipientCertificateList0;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[6] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(40, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)59;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(0, zipExtraFieldArray0.length);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(2, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)45;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)45}, byteArray1);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)118;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(4, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)118}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte)59, (byte)0, false, (byte)59);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)40;
      try { 
        ExtraFieldUtils.parse(byteArray0, true);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 40 bytes exceeds remaining data of 2 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(2, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ExtraFieldUtils extraFieldUtils0 = new ExtraFieldUtils();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<UnparseableExtraFieldData> class0 = UnparseableExtraFieldData.class;
      ExtraFieldUtils.register(class0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true);
      assertEquals(1, zipExtraFieldArray0.length);
  }
}
