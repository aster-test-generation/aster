
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
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField;
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
      byte[] byteArray0 = ZipUtil.toDosTime(71776119061217280L);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray1 = new byte[6];
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-120), (byte) (-110), (byte)31, (byte)105}, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(0L);
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((-2147483648L));
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(4036608000000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[7];
      // Undeclared exception!
      try { 
        ZipUtil.copy(byteArray1, byteArray0, (-1506));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)67;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(4827858800541171712L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.toDosTime(1L);
      ZipUtil.toDosTime((long) 57, byteArray0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)33, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(14);
      assertEquals((byte)14, byte0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate(900, 900, (-2764));
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      assertEquals((-288948224), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((byte) (-13));
      assertEquals((short) (-13), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis((byte)0);
      long long0 = ZipUtil.dosToJavaTime((byte) (-91));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      System.setCurrentTimeMillis((-809L));
      long long0 = ZipUtil.dosToJavaTime(0L);
      assertEquals((-809L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.copy((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(314L);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(314L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime((-1645L), (byte[]) null, 32782);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong((-205));
      assertEquals(4294967091L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime(1339L, byteArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [-1]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte(1100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [1100]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zx@p6");
      zipArchiveEntry0.setMethod(1);
      ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
      assertFalse(zipArchiveEntry0.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)70);
      assertEquals(70, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte) (-73));
      assertEquals(183, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = ZipUtil.reverse(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.reverse(byteArray0);
      assertSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.longToBig((-2147483653L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative longs < -2^31 not permitted: [-2147483653]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(408L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      File file0 = MockFile.createTempFile(":YwvT<mpJa1", "rD7wq]')jC");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, ":YwvT<mpJa1");
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, (byte[]) null, (byte[]) null);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(9151314442816847870L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[2];
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField("2", byteArray0, (byte)0, (byte)0);
      zipArchiveEntry0.addExtraField(unicodeCommentExtraField0);
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("u");
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ZipUtil.copy((byte[]) null, byteArray0, (byte)21);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zx@p6");
      zipArchiveEntry0.setMethod(27);
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported feature compression method used in entry zx@p6
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zx@p6");
      zipArchiveEntry0.setMethod(0);
      ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
      assertEquals(0, zipArchiveEntry0.getVersionRequired());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(true);
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported feature encryption used in entry 
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zx@p6");
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported compression method -1 (UNKNOWN) used in entry zx@p6
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("zx@p6");
      zipArchiveEntry0.setMethod(0);
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      GeneralPurposeBit generalPurposeBit0 = zipArchiveEntry0.getGeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(true);
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.toDosTime(71776119061217272L);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals((-2003689623L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      // Undeclared exception!
      try { 
        ZipUtil.bigToLong(bigInteger0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The BigInteger cannot fit inside a 64 bit java long: [18446744073709551616]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong(128);
      assertEquals(128L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockDate mockDate0 = new MockDate(348, (byte)0, (byte)30, (-1), 3);
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      assertEquals(406698080, zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long long0 = ZipUtil.dosToJavaTime((-1));
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      Date date0 = ZipUtil.fromDosTime(zipLong0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }
}
