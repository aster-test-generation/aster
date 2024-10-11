
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest;
import org.apache.commons.compress.parallel.InputStreamSupplier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZipArchiveEntryRequest_ESTest extends ZipArchiveEntryRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("#}JY}ERFc!eQ+(;o");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setStreamContiguous(true);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertNull(zipArchiveEntry1.getComment());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("q7(j,>[*<r)+\\");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setVersionRequired(4299);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Invalid entry size");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setVersionRequired((-811));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry1.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Invalid entry size");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setVersionMadeBy(12);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setVersionMadeBy((-1));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionRequired());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setSize(16711680L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setRawFlag(32781);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setRawFlag((-328));
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setPlatform((-3760));
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertSame(zipArchiveEntry1, zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(538);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setLocalHeaderOffset(1214L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(1214L, zipArchiveEntry1.getLocalHeaderOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setInternalAttributes(11);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("k_iXT&?;@(v$-");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setInternalAttributes((-691));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("X7o,}j%Dt4[<f\"");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setExternalAttributes(2920L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(2920L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setUnixMode(41246);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertTrue(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      zipArchiveEntry0.setDiskNumberStart(1391L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("", zipArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField");
      File file0 = MockFile.createTempFile("T$Fv+", "", (File) mockFile0);
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "T$Fv+");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setDiskNumberStart((-369L));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setDataOffset(0L);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setDataOffset(787L);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCrc(0L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCrc(1350L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setCompressedSize(0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setCompressedSize(1L);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getExternalAttributes());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(inputStreamSupplier0).get();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      InputStream inputStream0 = zipArchiveEntryRequest0.getPayloadStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(pipedInputStream0).when(inputStreamSupplier0).get();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      InputStream inputStream0 = zipArchiveEntryRequest0.getPayloadStream();
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(538);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals(538, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ZipArchiveEntryRequest.createZipArchiveEntryRequest((ZipArchiveEntry) null, inputStreamSupplier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      // Undeclared exception!
      try { 
        zipArchiveEntryRequest0.getPayloadStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, (InputStreamSupplier) null);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals((-1), int0);
  }
}
