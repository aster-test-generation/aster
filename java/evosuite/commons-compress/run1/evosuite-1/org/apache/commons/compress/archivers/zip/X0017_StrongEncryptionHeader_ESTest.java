
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
      byte[] byteArray0 = new byte[7];
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, 4, 4);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 8
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-76);
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, 0, 26127);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 186
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[20];
      byteArray0[11] = (byte)14;
      x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, (byte)0, 2953);
      x0017_StrongEncryptionHeader0.getHashAlgorithm();
      assertEquals(234881024L, x0017_StrongEncryptionHeader0.getRecordCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, (-2334), (-2334));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2334 > -4668
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[9];
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 0, (byte)4);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 4 bytes, expected at least 12
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData((byte[]) null, (-1831), (byte)119);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 1554, (-1669));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1554 > -115
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 0, (byte)22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[20];
      try { 
        x0017_StrongEncryptionHeader0.parseFileFormat(byteArray0, (byte)14, (-2686));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only -2686 bytes, expected at least 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFileFormat((byte[]) null, (-656), 1298);
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
      byte[] byteArray0 = new byte[20];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFileFormat(byteArray0, 1087, 32780);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1087
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[4];
      try { 
        x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, (byte) (-16), (-2902));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only -2902 bytes, expected at least 12
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat((byte[]) null, 4037, 4037);
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
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, (byte) (-50), (byte)118);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -50
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[20];
      byteArray0[8] = (byte)79;
      x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, (byte)0, 4622);
      assertEquals(79L, x0017_StrongEncryptionHeader0.getRecordCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[20];
      x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray0, (byte)0, 4622);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[20];
      byteArray0[11] = (byte)14;
      x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, (byte)0, 2949);
      long long0 = x0017_StrongEncryptionHeader0.getRecordCount();
      assertEquals(234881024L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[10];
      byteArray0[1] = (byte)19;
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, 0, (byte)19);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Invalid X0017_StrongEncryptionHeader: ivSize 4864 doesn't fit into 19 bytes of data at position 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      x0017_StrongEncryptionHeader0.getHashAlgorithm();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      long long0 = x0017_StrongEncryptionHeader0.getRecordCount();
      assertEquals(0L, long0);
  }
}
