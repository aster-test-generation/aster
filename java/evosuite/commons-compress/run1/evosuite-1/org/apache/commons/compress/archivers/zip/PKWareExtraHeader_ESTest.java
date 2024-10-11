
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
      x0015_CertificateIdForFile0.assertMinimalLength(0, 0);
      assertEquals(0, x0015_CertificateIdForFile0.getRecordCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[7];
      x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, (byte)0, (byte)77);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      x0016_CertificateIdForCentralDirectory0.assertMinimalLength(0, 24);
      assertNull(x0016_CertificateIdForCentralDirectory0.getHashAlgorithm());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(3692);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[8];
      x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData(byteArray0, (byte)7, (byte)7);
      byte[] byteArray1 = x0019_EncryptionRecipientCertificateList0.getLocalFileDataData();
      assertEquals(7, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[0];
      x0019_EncryptionRecipientCertificateList0.setLocalFileDataData(byteArray0);
      byte[] byteArray1 = x0019_EncryptionRecipientCertificateList0.getLocalFileDataData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[0];
      x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray0);
      byte[] byteArray1 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      // Undeclared exception!
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData((byte[]) null, (-1112), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, (-893), (-1314));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -893 > -2207
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray0, (-1795), (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      byte[] byteArray0 = new byte[3];
      try { 
        x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray0, (byte) (-5), (byte) (-5));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile is too short, only -5 bytes, expected at least 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      // Undeclared exception!
      try { 
        x0014_X509Certificates0.parseFromCentralDirectoryData((byte[]) null, (byte)9, (byte)9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, (-806), (byte) (-113));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -806 > -919
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new X0019_EncryptionRecipientCertificateList();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData(byteArray0, 1147, 1518);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      try { 
        x0015_CertificateIdForFile0.assertMinimalLength(555, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile is too short, only 0 bytes, expected at least 555
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new X0015_CertificateIdForFile();
      ZipShort zipShort0 = x0015_CertificateIdForFile0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      x0017_StrongEncryptionHeader0.setLocalFileDataData(byteArray0);
      // Undeclared exception!
      try { 
        x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray0, 0, 1736);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[6];
      x0016_CertificateIdForCentralDirectory0.setLocalFileDataData(byteArray0);
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getLocalFileDataLength();
      assertEquals(6, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[6];
      x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray0);
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryLength();
      assertEquals(6, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      ZipShort zipShort0 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new X0016_CertificateIdForCentralDirectory();
      byte[] byteArray0 = new byte[6];
      x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray0);
      byte[] byteArray1 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryData();
      assertEquals(6, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = x0017_StrongEncryptionHeader0.getCentralDirectoryData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PKWareExtraHeader.EncryptionAlgorithm pKWareExtraHeader_EncryptionAlgorithm0 = PKWareExtraHeader.EncryptionAlgorithm.RC2pre52;
      int int0 = pKWareExtraHeader_EncryptionAlgorithm0.getCode();
      assertEquals(26114, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PKWareExtraHeader.HashAlgorithm pKWareExtraHeader_HashAlgorithm0 = PKWareExtraHeader.HashAlgorithm.SHA1;
      int int0 = pKWareExtraHeader_HashAlgorithm0.getCode();
      assertEquals(32772, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      byte[] byteArray0 = x0014_X509Certificates0.getLocalFileDataData();
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new X0017_StrongEncryptionHeader();
      byte[] byteArray0 = new byte[6];
      try { 
        x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray0, (byte)0, (byte)2);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 2 bytes, expected at least 4
         //
         verifyException("org.apache.commons.compress.archivers.zip.PKWareExtraHeader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      X0014_X509Certificates x0014_X509Certificates0 = new X0014_X509Certificates();
      ZipShort zipShort0 = x0014_X509Certificates0.getHeaderId();
      assertEquals(20, zipShort0.getValue());
  }
}
