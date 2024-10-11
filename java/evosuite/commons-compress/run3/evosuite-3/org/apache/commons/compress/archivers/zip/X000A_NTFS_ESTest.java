
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
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Date;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class X000A_NTFS_ESTest extends X000A_NTFS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      BigInteger bigInteger0 = BigInteger.valueOf((-1));
      byte[] byteArray0 = ZipEightByteInteger.getBytes(bigInteger0);
      x000A_NTFS0.parseFromLocalFileData(byteArray0, (-1), 2849);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        x000A_NTFS0.parseFromCentralDirectoryData(byteArray0, (-239), 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      x000A_NTFS0.setCreateTime(zipEightByteInteger0);
      x000A_NTFS0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      BigInteger bigInteger0 = BigInteger.TEN;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      x000A_NTFS0.setAccessTime(zipEightByteInteger0);
      x000A_NTFS0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)60;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0, 1);
      x000A_NTFS0.setModifyTime(zipEightByteInteger0);
      x000A_NTFS0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      X000A_NTFS x000A_NTFS1 = new X000A_NTFS();
      boolean boolean0 = x000A_NTFS0.equals(x000A_NTFS1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setAccessJavaTime((Date) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      x000A_NTFS0.setModifyTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(8);
      x000A_NTFS0.setAccessTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.toString();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      MockDate mockDate0 = new MockDate(1777, (-1752), (-1339), (-2005), 48);
      // Undeclared exception!
      try { 
        x000A_NTFS0.setModifyJavaTime(mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      // Undeclared exception!
      try { 
        x000A_NTFS0.setModifyFileTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      MockDate mockDate0 = new MockDate(16711680, 16711680, 56, 0, 56);
      // Undeclared exception!
      try { 
        x000A_NTFS0.setCreateJavaTime(mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      Instant instant0 = MockInstant.now();
      FileTime fileTime0 = FileTime.from(instant0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.setAccessFileTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      // Undeclared exception!
      try { 
        x000A_NTFS0.parseFromLocalFileData((byte[]) null, 855, 568);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        x000A_NTFS0.parseFromLocalFileData(byteArray0, 0, (byte)113);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      // Undeclared exception!
      try { 
        x000A_NTFS0.parseFromCentralDirectoryData((byte[]) null, 850, 850);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)50;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      x000A_NTFS0.setModifyTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getModifyJavaTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      x000A_NTFS0.setModifyTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getLocalFileDataData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((-6L));
      x000A_NTFS0.setCreateTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getCreateJavaTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      x000A_NTFS0.setCreateTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getCreateFileTime();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      BigInteger bigInteger0 = BigInteger.ONE;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      x000A_NTFS0.setCreateTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getCreateFileTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      x000A_NTFS0.setAccessTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getCentralDirectoryData();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipEightByteInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      BigInteger bigInteger0 = BigInteger.TEN;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      x000A_NTFS0.setAccessTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getAccessFileTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setModifyTime((ZipEightByteInteger) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setCreateTime((ZipEightByteInteger) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setAccessTime((ZipEightByteInteger) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipShort zipShort0 = x000A_NTFS0.getLocalFileDataLength();
      assertEquals(32, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      FileTime fileTime0 = x000A_NTFS0.getCreateFileTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      FileTime fileTime0 = x000A_NTFS0.getAccessFileTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = x000A_NTFS0.getLocalFileDataData();
      x000A_NTFS0.parseFromCentralDirectoryData(byteArray0, (-4), 286);
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = x000A_NTFS0.getLocalFileDataData();
      x000A_NTFS0.parseFromLocalFileData(byteArray0, (-4), 34);
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      X000A_NTFS x000A_NTFS1 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger((BigInteger) null);
      x000A_NTFS1.setModifyTime(zipEightByteInteger0);
      boolean boolean0 = x000A_NTFS0.equals(x000A_NTFS1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      boolean boolean0 = x000A_NTFS0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = x000A_NTFS0.getLocalFileDataData();
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(byteArray0);
      x000A_NTFS0.setModifyTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getModifyFileTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      BigInteger bigInteger0 = BigInteger.TEN;
      ZipEightByteInteger zipEightByteInteger0 = new ZipEightByteInteger(bigInteger0);
      x000A_NTFS0.setAccessTime(zipEightByteInteger0);
      // Undeclared exception!
      try { 
        x000A_NTFS0.getAccessJavaTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      // Undeclared exception!
      try { 
        x000A_NTFS0.setCreateFileTime(fileTime0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setCreateFileTime((FileTime) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = x000A_NTFS0.getModifyTime();
      assertNotNull(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      Date date0 = x000A_NTFS0.getModifyJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      Date date0 = x000A_NTFS0.getAccessJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      String string0 = x000A_NTFS0.toString();
      assertEquals("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setCreateJavaTime((Date) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      Date date0 = x000A_NTFS0.getCreateJavaTime();
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setModifyJavaTime((Date) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      MockDate mockDate0 = new MockDate(4096, 4096, 4096, 4096, 4096);
      // Undeclared exception!
      try { 
        x000A_NTFS0.setAccessJavaTime(mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X000A_NTFS", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = x000A_NTFS0.getCreateTime();
      assertNotNull(zipEightByteInteger0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipShort zipShort0 = x000A_NTFS0.getHeaderId();
      assertEquals(10, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setAccessFileTime((FileTime) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      byte[] byteArray0 = x000A_NTFS0.getCentralDirectoryData();
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipShort zipShort0 = x000A_NTFS0.getCentralDirectoryLength();
      assertEquals(32, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      FileTime fileTime0 = x000A_NTFS0.getModifyFileTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      x000A_NTFS0.setModifyFileTime((FileTime) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      X000A_NTFS x000A_NTFS0 = new X000A_NTFS();
      ZipEightByteInteger zipEightByteInteger0 = x000A_NTFS0.getAccessTime();
      assertNotNull(zipEightByteInteger0);
  }
}
