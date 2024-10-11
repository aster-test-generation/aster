
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
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class X0017_StrongEncryptionHeader_ESTest extends X0017_StrongEncryptionHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)3;
      try { 
        x0017_StrongEncryptionHeader0.parseFileFormat(byteArray0, 2, 664);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Invalid X0017_StrongEncryptionHeader: ivSize 768 doesn't fit into 664 bytes of data at position 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[9];
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, 0, (byte)4);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[25];
      byteArray0[8] = (byte) (-10);
      x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 0, (byte)95);
      long long0 = x0017_StrongEncryptionHeader0.getRecordCount();
      assertEquals(246L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData((byte[]) null, 2403, 2403);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, 0, (byte) (-113));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 > -113
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[10];
      byteArray0[6] = (byte)5;
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, (byte)5, 2185);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1291
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 564, (-3291));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 564 > -2727
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 4, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFileFormat((byte[]) null, 12, 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[22];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFileFormat(byteArray0, (-1316), 32780);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1316
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[2];
      try { 
        x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, 26113, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 12
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat((byte[]) null, 24, 26114);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, 10, (byte)96);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[25];
      byteArray0[14] = (byte)14;
      x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, 6, (byte)95);
      assertEquals(14L, x0017_StrongEncryptionHeader0.getRecordCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[25];
      x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, (byte)0, (byte)14);
      assertNull(x0017_StrongEncryptionHeader0.getEncryptionAlgorithm());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[25];
      byteArray0[8] = (byte) (-10);
      x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 0, (byte)95);
      x0017_StrongEncryptionHeader0.getHashAlgorithm();
      assertEquals(246L, x0017_StrongEncryptionHeader0.getRecordCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      x0017_StrongEncryptionHeader0.getHashAlgorithm();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[0];
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 0, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 12
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      long long0 = x0017_StrongEncryptionHeader0.getRecordCount();
      assertEquals(0L, long0);
  }
}
