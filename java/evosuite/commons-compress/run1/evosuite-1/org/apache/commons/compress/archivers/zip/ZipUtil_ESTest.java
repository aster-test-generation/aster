
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
import java.util.Date;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipUtil_ESTest extends ZipUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(255);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1741), (-1741), 0, 0, 0);
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      byte[] byteArray0 = zipLong0.getBytes();
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, (byte[]) null, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)33, (byte)0}, byteArray0);
      assertEquals(2162688, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((-2147483648L));
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      mockDate0.setTime(9151314442816847872L);
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      assertEquals(11549335, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)66;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(4755801206503243776L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockDate mockDate0 = new MockDate(810, 1612, (-95), 810, 0, (byte)0);
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      assertEquals((-1067675648), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.reverse(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(0L);
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(808471376L);
      assertEquals((short)19280, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      long long0 = ZipUtil.dosToJavaTime(128);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis((byte) (-95));
      long long0 = ZipUtil.dosToJavaTime((byte) (-95));
      assertEquals((-95L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.copy((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(10L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-68);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals((-74766790688768L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime((Date) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime((long) 161, (byte[]) null, 1879);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime(1392409281320L, byteArray0, 459);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 459
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipUtil.setNameAndCommentFromExtraFields((ZipArchiveEntry) null, byteArray0, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.reverse((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.fromDosTime((ZipLong) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        ZipUtil.copy(byteArray0, (byte[]) null, 21589);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.checkRequestedFeatures((ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.canHandleEntryData((ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.bigToLong((BigInteger) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong((-191));
      assertEquals(4294967105L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.toDosTime((long) 63);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)33, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ZipUtil.toDosTime(16711680L, byteArray0, (int) (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)33, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte((-1080));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [-1080]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(118);
      assertEquals((byte)118, byte0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte(30062);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [30062]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)63);
      assertEquals(63, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte) (-41));
      assertEquals(215, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[0];
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Negative longs < -2^31 not permitted: [", "Negative longs < -2^31 not permitted: [");
      File file0 = MockFile.createTempFile("Negative longs < -2^31 not permitted: [", "Negative longs < -2^31 not permitted: [", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, " HrZ69- ?pW^of");
      byte[] byteArray0 = new byte[1];
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = ZipUtil.reverse(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(3929408767L);
      assertEquals((short)1279, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.longToBig((-2147483682L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative longs < -2^31 not permitted: [-2147483682]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(4036608000000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(10L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(9151314442816847856L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("k `*vxtWuY");
      byte[] byteArray0 = new byte[4];
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, (byte[]) null);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ZipUtil.copy(byteArray0, byteArray0, (byte)104);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ZipUtil.copy((byte[]) null, (byte[]) null, 11);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(2844);
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported feature compression method used in entry 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(0);
      ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
      assertEquals((-1L), zipArchiveEntry0.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("k `*vxtWuY");
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported compression method -1 (UNKNOWN) used in entry k `*vxtWuY
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(8);
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Negative longs < -2^31 not permitted: [", "Negative longs < -2^31 not permitted: [");
      File file0 = MockFile.createTempFile("Negative longs < -2^31 not permitted: [", "Negative longs < -2^31 not permitted: [", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, " HrZ69- ?pW^of");
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[22];
      byteArray0[0] = (byte)21;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      // Undeclared exception!
      try { 
        ZipUtil.bigToLong(bigInteger0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The BigInteger cannot fit inside a 64 bit java long: [7857032802290934088263009660682737513670293351038976]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((byte) (-126));
      assertEquals((byte) (-126), bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong((byte)4);
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long long0 = ZipUtil.dosToJavaTime(2162688L);
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Date date0 = ZipUtil.fromDosTime(zipLong0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }
}
