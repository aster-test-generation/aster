
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
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp;
import org.apache.commons.compress.archivers.zip.ZipLong;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class X5455_ExtendedTimestamp_ESTest extends X5455_ExtendedTimestamp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(22, (byte)2, (byte)4);
      x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis((byte)2);
      MockDate mockDate0 = new MockDate((byte)4, (byte)2, (byte)4, (byte)1, 4184, (-2));
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis((byte)2);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)2;
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)4, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp1.setFlags((byte)2);
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp1);
      assertEquals((byte)2, x5455_ExtendedTimestamp1.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(1000L);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      FileTime fileTime0 = FileTime.from((long) (byte)2, timeUnit0);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getModifyTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)4);
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getModifyTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.CFH_SIG;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.getModifyTime();
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(22, (byte)2, (byte)4);
      x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getModifyJavaTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(22, (byte)2, (byte)4);
      x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getModifyFileTime();
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(22, (byte)2, (byte)4);
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      byte byte0 = x5455_ExtendedTimestamp0.getFlags();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
      assertEquals((byte)4, byte0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-104));
      byte byte0 = x5455_ExtendedTimestamp0.getFlags();
      assertEquals((byte) (-104), byte0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getCreateTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate();
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getCreateTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)4);
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      x5455_ExtendedTimestamp0.setAccessJavaTime(date0);
      x5455_ExtendedTimestamp0.getAccessTime();
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessTime();
      assertEquals((byte)6, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      FileTime fileTime0 = FileTime.from((long) (byte)2, timeUnit0);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessJavaTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis((byte)2);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getAccessFileTime();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-22));
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only convert non-negative integers between [0,255] to byte: [-22]
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)4, (byte)4, (-899));
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setModifyJavaTime(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: -2150150400
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)2, 1839, (-3), (byte)4, 1839, 1839);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: 2689931379
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(1695, 0, 1352, 1695, 1017);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setAccessJavaTime(mockDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: 51402931020
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromLocalFileData((byte[]) null, 0, 1155);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = x5455_ExtendedTimestamp0.getLocalFileDataData();
      try { 
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, (-2271), (-2271));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X5455_ExtendedTimestamp too short, only -2271 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, 2220, (byte)4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2220
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)1);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.getLocalFileDataData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)85);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.getCentralDirectoryData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setModifyTime((ZipLong) null);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setAccessTime((ZipLong) null);
      assertFalse(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)22;
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)2, 22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)2;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)2, (byte)1);
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      FileTime fileTime0 = FileTime.from(1000L, timeUnit0);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      Date date0 = x5455_ExtendedTimestamp0.getCreateJavaTime();
      x5455_ExtendedTimestamp0.setModifyJavaTime(date0);
      x5455_ExtendedTimestamp0.getLocalFileDataLength();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = FileTime.fromMillis((byte)2);
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getLocalFileDataLength();
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)22);
      x5455_ExtendedTimestamp0.getLocalFileDataLength();
      assertEquals((byte)22, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipShort zipShort0 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
      assertEquals(1, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte) (-89));
      x5455_ExtendedTimestamp0.getCentralDirectoryLength();
      assertEquals((byte) (-89), x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Date date0 = x5455_ExtendedTimestamp0.getModifyJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Date date0 = x5455_ExtendedTimestamp0.getCreateJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)22);
      x5455_ExtendedTimestamp0.toString();
      assertEquals((byte)22, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      x5455_ExtendedTimestamp0.toString();
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)93);
      x5455_ExtendedTimestamp0.toString();
      assertEquals((byte)93, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setCreateTime((ZipLong) null);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)4;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)4, (byte)2);
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)4;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)2, 100);
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)2;
      x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray0, 0, (byte)2);
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[20];
      byteArray0[1] = (byte)1;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)1, (byte)84);
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)1;
      x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)1, (byte)4);
      assertEquals((byte)1, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.hashCode();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.hashCode();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      FileTime fileTime0 = FileTime.from(0L, timeUnit0);
      x5455_ExtendedTimestamp0.setCreateFileTime(fileTime0);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setFlags((byte)22);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertEquals((byte)22, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      x5455_ExtendedTimestamp0.getLocalFileDataData();
      assertEquals((byte)2, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.getCentralDirectoryData();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)2;
      x5455_ExtendedTimestamp1.parseFromCentralDirectoryData(byteArray0, 2, 14);
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp1);
      assertEquals((byte)2, x5455_ExtendedTimestamp1.getFlags());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.DD_SIG;
      x5455_ExtendedTimestamp0.setAccessTime(zipLong0);
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp1);
      assertTrue(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(x5455_ExtendedTimestamp0.HEADER_ID);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate(0, 0, 1);
      Instant instant0 = mockDate0.toInstant();
      FileTime fileTime0 = FileTime.from(instant0);
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // X5455 timestamps must fit in a signed 32 bit integer: -2208988800
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      x5455_ExtendedTimestamp0.setAccessFileTime(fileTime0);
      x5455_ExtendedTimestamp0.hashCode();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Object object0 = x5455_ExtendedTimestamp0.clone();
      boolean boolean0 = x5455_ExtendedTimestamp0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = x5455_ExtendedTimestamp0.getAccessTime();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getModifyFileTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setCreateTime(zipLong0);
      x5455_ExtendedTimestamp0.toString();
      assertTrue(x5455_ExtendedTimestamp0.isBit2_createTimePresent());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte[] byteArray0 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
      try { 
        x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray0, (byte)1, (-286));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X5455_ExtendedTimestamp too short, only -286 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      x5455_ExtendedTimestamp0.setAccessJavaTime((Date) null);
      assertFalse(x5455_ExtendedTimestamp0.isBit1_accessTimePresent());
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getCreateFileTime();
      x5455_ExtendedTimestamp0.setModifyFileTime(fileTime0);
      assertEquals((byte)0, x5455_ExtendedTimestamp0.getFlags());
      assertFalse(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit0_modifyTimePresent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = x5455_ExtendedTimestamp0.getCreateTime();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      Date date0 = x5455_ExtendedTimestamp0.getAccessJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipShort zipShort0 = x5455_ExtendedTimestamp0.getHeaderId();
      assertEquals(21589, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = ZipLong.ZIP64_MAGIC;
      x5455_ExtendedTimestamp0.setModifyTime(zipLong0);
      x5455_ExtendedTimestamp0.toString();
      assertTrue(x5455_ExtendedTimestamp0.isBit0_modifyTimePresent());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      boolean boolean0 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      // Undeclared exception!
      try { 
        x5455_ExtendedTimestamp0.parseFromCentralDirectoryData((byte[]) null, 6395, 6395);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      MockDate mockDate0 = new MockDate((byte)4, (byte)2, (byte)4, (byte)1, 4184, (-2));
      x5455_ExtendedTimestamp0.setCreateJavaTime(mockDate0);
      x5455_ExtendedTimestamp0.getCreateTime();
      assertEquals((byte)4, x5455_ExtendedTimestamp0.getFlags());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      byte byte0 = x5455_ExtendedTimestamp0.getFlags();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      ZipLong zipLong0 = x5455_ExtendedTimestamp0.getModifyTime();
      assertNull(zipLong0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new X5455_ExtendedTimestamp();
      FileTime fileTime0 = x5455_ExtendedTimestamp0.getAccessFileTime();
      assertNull(fileTime0);
  }
}
