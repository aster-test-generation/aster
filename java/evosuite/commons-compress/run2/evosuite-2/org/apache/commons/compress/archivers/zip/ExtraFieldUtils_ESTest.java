
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
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
import org.apache.commons.compress.archivers.zip.UnicodePathExtraField;
import org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData;
import org.apache.commons.compress.archivers.zip.UnrecognizedExtraField;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
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
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte) (-80);
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(9, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte) (-80), (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[4];
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte)0, 2, false, 4);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, 951, 951, false, 951);
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
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      byte[] byteArray0 = new byte[4];
      try { 
        extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte)1, (-1124), false, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 1.  Block length of 0 bytes exceeds remaining data of -1128 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        zipArchiveEntry_ExtraFieldParsingMode0.fill(unparseableExtraFieldData0, byteArray0, (byte)125, (byte)25, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true);
      assertEquals(2, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(16);
      byte[] byteArray0 = resourceAlignmentExtraField0.getLocalFileDataData();
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = new byte[1];
      ZipExtraField zipExtraField0 = ExtraFieldUtils.fillExtraField(x000A_NTFS0, byteArray0, (-1599), (-621), false);
      assertSame(x000A_NTFS0, zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      ZipShort zipShort0 = asiExtraField0.getHeaderId();
      AsiExtraField asiExtraField1 = (AsiExtraField)ExtraFieldUtils.createExtraField(zipShort0);
      assertFalse(asiExtraField1.isDirectory());
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
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, true, extraFieldUtils_UnparseableExtraField0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)95;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
      try { 
        ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 24320 bytes exceeds remaining data of 4 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
      // Undeclared exception!
      try { 
        ExtraFieldUtils.parse((byte[]) null, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)3;
      try { 
        ExtraFieldUtils.parse(byteArray0, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 3 bytes exceeds remaining data of 2 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)42;
      try { 
        ExtraFieldUtils.parse(byteArray0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 42 bytes exceeds remaining data of 2 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[4];
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
  public void test20()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[2];
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
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      ZipLong zipLong0 = new ZipLong(3);
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger0, zipEightByteInteger0, zipLong0);
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(zip64ExtendedInformationExtraField0, byteArray0, (byte)14, (-4837), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UnrecognizedExtraField unrecognizedExtraField0 = new UnrecognizedExtraField();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField(unrecognizedExtraField0, byteArray0, (byte)0, (-1), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -1
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
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-79);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte)49;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(1, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[2];
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(16);
      zipExtraFieldArray0[0] = (ZipExtraField) resourceAlignmentExtraField0;
      zipExtraFieldArray0[1] = (ZipExtraField) resourceAlignmentExtraField0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      try { 
        ExtraFieldUtils.fillExtraField(resourceAlignmentExtraField0, byteArray0, (byte) (-39), 1, false);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Too short content for ResourceAlignmentExtraField (0xa11e): 1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ExtraFieldUtils.fillExtraField((ZipExtraField) null, byteArray0, 0, 92, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipShort zipShort0 = ResourceAlignmentExtraField.ID;
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = (ResourceAlignmentExtraField)ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertEquals((short)0, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AsiExtraField asiExtraField0 = new AsiExtraField();
      ZipShort zipShort0 = asiExtraField0.getLocalFileDataLength();
      ZipExtraField zipExtraField0 = ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
      assertNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipShort zipShort0 = x000A_NTFS0.getLocalFileDataLength();
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      assertNotNull(zipExtraField0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[1];
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      zipExtraFieldArray0[0] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipShort zipShort0 = AsiExtraField.HEADER_ID;
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      zipExtraFieldArray0[0] = zipExtraField0;
      UnicodePathExtraField unicodePathExtraField0 = new UnicodePathExtraField();
      zipExtraFieldArray0[1] = (ZipExtraField) unicodePathExtraField0;
      byte[] byteArray0 = new byte[20];
      zipExtraFieldArray0[2] = (ZipExtraField) unicodePathExtraField0;
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("org.apache.commons.compress.archivers.zip.ExtraFieldUtils", byteArray0);
      zipExtraFieldArray0[3] = (ZipExtraField) unicodeCommentExtraField0;
      Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new Zip64ExtendedInformationExtraField();
      zipExtraFieldArray0[4] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      zipExtraFieldArray0[5] = (ZipExtraField) zip64ExtendedInformationExtraField0;
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      zipExtraFieldArray0[6] = (ZipExtraField) x0017_StrongEncryptionHeader0;
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(104, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false);
      byte[] byteArray1 = ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      UnparseableExtraFieldData unparseableExtraFieldData0 = new UnparseableExtraFieldData();
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      zipExtraFieldArray0[0] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[1] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[2] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[3] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[4] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[5] = (ZipExtraField) unparseableExtraFieldData0;
      zipExtraFieldArray0[6] = (ZipExtraField) unparseableExtraFieldData0;
      byte[] byteArray0 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(24, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[3];
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      zipExtraFieldArray0[0] = (ZipExtraField) x0017_StrongEncryptionHeader0;
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
      ZipShort zipShort0 = ResourceAlignmentExtraField.ID;
      ZipExtraField zipExtraField0 = zipArchiveEntry_ExtraFieldParsingMode0.createExtraField(zipShort0);
      zipExtraFieldArray0[1] = zipExtraField0;
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      zipExtraFieldArray0[2] = (ZipExtraField) x0019_EncryptionRecipientCertificateList0;
      byte[] byteArray0 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      ZipExtraField[] zipExtraFieldArray1 = ExtraFieldUtils.parse(byteArray0, false, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(3, zipExtraFieldArray1.length);
      assertEquals(14, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.READ;
      ZipExtraField zipExtraField0 = extraFieldUtils_UnparseableExtraField0.onUnparseableExtraField(byteArray0, (byte)0, 2, false, 2);
      ZipExtraField[] zipExtraFieldArray0 = new ZipExtraField[7];
      zipExtraFieldArray0[0] = zipExtraField0;
      zipExtraFieldArray0[1] = zipExtraField0;
      zipExtraFieldArray0[2] = zipExtraField0;
      zipExtraFieldArray0[3] = zipExtraField0;
      zipExtraFieldArray0[4] = zipExtraField0;
      zipExtraFieldArray0[5] = zipExtraField0;
      zipExtraFieldArray0[6] = zipExtraField0;
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      ZipArchiveEntry.ExtraFieldParsingMode zipArchiveEntry_ExtraFieldParsingMode0 = ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
      ZipExtraField[] zipExtraFieldArray1 = ExtraFieldUtils.parse(byteArray1, true, (ExtraFieldParsingBehavior) zipArchiveEntry_ExtraFieldParsingMode0);
      assertEquals(6, zipExtraFieldArray1.length);
      assertEquals(38, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)44;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.THROW;
      try { 
        ExtraFieldUtils.parse(byteArray0, false, extraFieldUtils_UnparseableExtraField0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Bad extra field starting at 0.  Block length of 11264 bytes exceeds remaining data of 4 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.zip.ExtraFieldUtils$UnparseableExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byteArray0[3] = (byte)6;
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, true, extraFieldUtils_UnparseableExtraField0);
      assertEquals(0, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ExtraFieldUtils.UnparseableExtraField extraFieldUtils_UnparseableExtraField0 = ExtraFieldUtils.UnparseableExtraField.SKIP;
      int int0 = extraFieldUtils_UnparseableExtraField0.getKey();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0);
      assertEquals(4, zipExtraFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipExtraField[] zipExtraFieldArray0 = ExtraFieldUtils.parse(byteArray0, false);
      byte[] byteArray1 = ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ExtraFieldUtils extraFieldUtils0 = new ExtraFieldUtils();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<UnparseableExtraFieldData> class0 = UnparseableExtraFieldData.class;
      ExtraFieldUtils.register(class0);
  }
}
