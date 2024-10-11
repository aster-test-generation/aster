
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
import org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader;
import org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PKWareExtraHeader_ESTest extends PKWareExtraHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      x0015_CertificateIdForFile0.assertMinimalLength((-2454), (-735));
      assertNull(x0015_CertificateIdForFile0.getHashAlgorithm());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode((-2087));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[1];
      x0016_CertificateIdForCentralDirectory0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataData();
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[0];
      x0017_StrongEncryptionHeader0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = x0017_StrongEncryptionHeader0.getLocalFileDataData();
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[0];
      x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray0);
      byte[] byteArray1 = x0015_CertificateIdForFile0.getCentralDirectoryData();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromLocalFileData((byte[]) null, (-1), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, (byte)22, (-162));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 22 > -140
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromCentralDirectoryData((byte[]) null, 25, 25);
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
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromCentralDirectoryData(byteArray0, (-1033), (-1033));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1033 > -2066
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData(byteArray0, 102, (byte)25);
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
        x0016_CertificateIdForCentralDirectory0.assertMinimalLength((byte)0, (byte) (-19));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory is too short, only -19 bytes, expected at least 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      ZipShort zipShort0 = x0017_StrongEncryptionHeader0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[6];
      x0014_X509Certificates0.setLocalFileDataData(byteArray0);
      x0014_X509Certificates0.parseFromCentralDirectoryData(byteArray0, 4, (byte)0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[1];
      x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray0);
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryLength();
      assertEquals(1, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[1];
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
  public void test17()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm pKWareExtraHeader_EncryptionAlgorithm0 = PKWareExtraHeader.EncryptionAlgorithm.DES;
      int int0 = pKWareExtraHeader_EncryptionAlgorithm0.getCode();
      assertEquals(26113, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(4);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm pKWareExtraHeader_HashAlgorithm0 = PKWareExtraHeader.HashAlgorithm.SHA384;
      int int0 = pKWareExtraHeader_HashAlgorithm0.getCode();
      assertEquals(32781, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, 4, 4);
      assertEquals(PKWareExtraHeader.HashAlgorithm.NONE, x0015_CertificateIdForFile0.getHashAlgorithm());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = x0015_CertificateIdForFile0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[1];
      x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, 0, (byte)8);
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataLength();
      assertEquals(8, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[1];
      x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray0);
      byte[] byteArray1 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryData();
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromLocalFileData(byteArray0, 3702, 673);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      ZipShort zipShort0 = x0019_EncryptionRecipientCertificateList0.getHeaderId();
      assertEquals(25, zipShort0.getValue());
  }
}
