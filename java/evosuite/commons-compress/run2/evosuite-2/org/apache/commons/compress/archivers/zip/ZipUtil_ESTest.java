
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
      byte byte0 = ZipUtil.unsignedIntToSignedByte(128);
      assertEquals((byte) (-128), byte0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte(255);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[3];
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray1);
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = MockFile.createTempFile("AC*:<{Yd", "AC*:<{Yd");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "");
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[0];
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray1);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((-2147483648L));
      assertEquals((byte)0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.toDosTime(71776119061217280L);
      assertArrayEquals(new byte[] {(byte) (-120), (byte) (-110), (byte)31, (byte)105}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipUtil");
      zipArchiveEntry0.setTime(4036608000000L);
      assertEquals((-1L), zipArchiveEntry0.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipUtil");
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      unicodeCommentExtraField0.setNameCRC32(1392409281320L);
      zipArchiveEntry0.addExtraField(unicodeCommentExtraField0);
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = ZipUtil.dosToJavaTime((-1388L));
      assertEquals(1392409281320L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong(164);
      assertEquals(164L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte byte0 = ZipUtil.unsignedIntToSignedByte((byte)51);
      assertEquals((byte)51, byte0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipLong zipLong0 = new ZipLong(33639248L);
      Date date0 = ZipUtil.fromDosTime(zipLong0);
      ZipLong zipLong1 = ZipUtil.toDosTime(date0);
      assertEquals(1146004138, zipLong1.getIntValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockDate mockDate0 = new MockDate(489, 489, 489, 163, 489);
      ZipLong zipLong0 = ZipUtil.toDosTime((Date) mockDate0);
      assertEquals((-2042095328), zipLong0.getIntValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.reverse(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig(1329L);
      assertEquals((byte)49, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((-3778L));
      assertEquals((byte)62, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      System.setCurrentTimeMillis((byte)0);
      long long0 = ZipUtil.dosToJavaTime(3398L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      System.setCurrentTimeMillis((-1426L));
      long long0 = ZipUtil.dosToJavaTime(1392409281320L);
      assertEquals((-1426L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.valueOf((-2147483648L));
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals((-2147483648L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime((-4914L), (byte[]) null, 62);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        ZipUtil.copy(byteArray0, (byte[]) null, (byte)77);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong((byte) (-128));
      assertEquals(4294967168L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ZipUtil.toDosTime(0L, byteArray0, (-1113));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1113
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte((-128));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [-128]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.unsignedIntToSignedByte(645);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [645]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte)12);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = ZipUtil.signedByteToUnsignedInt((byte) (-73));
      assertEquals(183, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, (byte[]) null, (byte[]) null);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((byte)0);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipUtil.longToBig((-116444736000000000L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative longs < -2^31 not permitted: [-116444736000000000]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(1095216660480L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime((-1316L));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = ZipUtil.isDosTime(9151314442816847890L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipUtil");
      UnicodeCommentExtraField unicodeCommentExtraField0 = new UnicodeCommentExtraField();
      zipArchiveEntry0.addExtraField(unicodeCommentExtraField0);
      ZipUtil.setNameAndCommentFromExtraFields(zipArchiveEntry0, byteArray0, byteArray0);
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry0.getNameSource());
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry0.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        ZipUtil.copy(byteArray0, byteArray0, 2518);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ZipUtil.copy((byte[]) null, (byte[]) null, 1891);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = ZipUtil.copy(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.copy((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setMethod(256);
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
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-99);
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, 0);
      zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit0);
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
  public void test50()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipUtil");
      try { 
        ZipUtil.checkRequestedFeatures(zipArchiveEntry0);
        fail("Expecting exception: UnsupportedZipFeatureException");
      
      } catch(UnsupportedZipFeatureException e) {
         //
         // Unsupported compression method -1 (UNKNOWN) used in entry org.apache.commons.compress.archivers.zip.ZipUtil
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      File file0 = MockFile.createTempFile("r6?{\"Z3Ne?Q:b|9t", "_X");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "_X");
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-99);
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, 0);
      zipArchiveEntry0.setGeneralPurposeBit(generalPurposeBit0);
      boolean boolean0 = ZipUtil.canHandleEntryData(zipArchiveEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ONE;
      long long0 = ZipUtil.bigToLong(bigInteger0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)7;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      // Undeclared exception!
      try { 
        ZipUtil.bigToLong(bigInteger0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The BigInteger cannot fit inside a 64 bit java long: [129127208515966861312]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigInteger bigInteger0 = ZipUtil.longToBig((-1884L));
      assertEquals((short) (-1884), bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long long0 = ZipUtil.adjustToLong(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      byte[] byteArray0 = ZipUtil.toDosTime((long) 3);
      ZipUtil.reverse(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)33, (byte)0, (byte)0}, byteArray0);
  }
}
