
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
import org.apache.commons.compress.archivers.zip.PKWareExtraHeader;
import org.apache.commons.compress.archivers.zip.X0014_X509Certificates;
import org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile;
import org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PKWareExtraHeader_ESTest extends PKWareExtraHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[9];
      x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, (byte)0, (byte)0);
      assertEquals(0, x0016_CertificateIdForCentralDirectory0.getRecordCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[4];
      x0015_CertificateIdForFile0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = x0015_CertificateIdForFile0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[0];
      x0019_EncryptionRecipientCertificateList0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = x0019_EncryptionRecipientCertificateList0.getLocalFileDataData();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[1];
      x0014_X509Certificates0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = x0014_X509Certificates0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      // Undeclared exception!
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData((byte[]) null, 23, 23);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromLocalFileData(byteArray0, 21, (-1552));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 21 > -1531
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, (-120), 679);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromCentralDirectoryData((byte[]) null, 32775, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromCentralDirectoryData(byteArray0, (byte) (-107), (byte) (-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -107 > -111
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData(byteArray0, (byte)40, (byte)25);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      try { 
        x0016_CertificateIdForCentralDirectory0.assertMinimalLength(26156, 11);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory is too short, only 11 bytes, expected at least 26156
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[1];
      x0014_X509Certificates0.setLocalFileDataData(byteArray0);
      ZipShort zipShort0 = x0014_X509Certificates0.getLocalFileDataLength();
      assertEquals(1, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[4];
      x0015_CertificateIdForFile0.setLocalFileDataData(byteArray0);
      // Undeclared exception!
      try { 
        x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, (byte)2, 32771);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[3];
      x0014_X509Certificates0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)0);
      ZipShort zipShort0 = x0014_X509Certificates0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      ZipShort zipShort0 = x0015_CertificateIdForFile0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[3];
      x0014_X509Certificates0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)0);
      byte[] byteArray1 = x0014_X509Certificates0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[5];
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromCentralDirectoryData(byteArray0, (byte)19, (byte) (-108));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory is too short, only -108 bytes, expected at least 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      x0015_CertificateIdForFile0.assertMinimalLength((byte)0, (byte)0);
      assertNull(x0015_CertificateIdForFile0.getHashAlgorithm());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm pKWareExtraHeader_EncryptionAlgorithm0 = PKWareExtraHeader.EncryptionAlgorithm.RC2pre52;
      int int0 = pKWareExtraHeader_EncryptionAlgorithm0.getCode();
      assertEquals(26114, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode((byte)27);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm pKWareExtraHeader_HashAlgorithm0 = PKWareExtraHeader.HashAlgorithm.NONE;
      int int0 = pKWareExtraHeader_HashAlgorithm0.getCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode((-2394));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = x0015_CertificateIdForFile0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[4];
      x0015_CertificateIdForFile0.setLocalFileDataData(byteArray0);
      ZipShort zipShort0 = x0015_CertificateIdForFile0.getCentralDirectoryLength();
      assertEquals(4, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[4];
      x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getHeaderId();
      assertEquals(22, zipShort0.getValue());
  }
}
