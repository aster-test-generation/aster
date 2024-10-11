
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
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setStreamContiguous(true);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1), ZipArchiveEntry.CRC_UNKNOWN);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setVersionRequired(20);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setVersionRequired((-3554));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionMadeBy(2843);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getCompressedSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setVersionMadeBy((-2024));
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("", zipArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setUnixMode((-1502));
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0L, zipArchiveEntry1.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setSize(1698L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertSame(zipArchiveEntry0, zipArchiveEntry1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setRawFlag(1);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertFalse(zipArchiveEntry1.isUnixSymlink());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setRawFlag((-1));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setPlatform((-4782));
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", zipArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("<ma.7/");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setMethod(0);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(26113);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getVersionMadeBy());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setLocalHeaderOffset(0L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "l8n1R&VHDLXB_&)j");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setLocalHeaderOffset(170L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals((-1L), zipArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setInternalAttributes(2368);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getPlatform());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setInternalAttributes((-624));
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals("", zipArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("[#e 9/RRW5I^5");
      zipArchiveEntry0.setUnixMode(0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(file0, "l8n1R&VHDLXB_&)j");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setDiskNumberStart(2117L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("Zip64 extended information must contain both size values in the local file header.");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setDiskNumberStart((-3186L));
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(ZipArchiveEntry.NameSource.NAME, zipArchiveEntry1.getNameSource());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      zipArchiveEntry0.setDataOffset(0L);
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertFalse(zipArchiveEntry1.isDirectory());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setDataOffset(791L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertSame(zipArchiveEntry1, zipArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setCrc(0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(ZipArchiveEntry.CommentSource.COMMENT, zipArchiveEntry1.getCommentSource());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setCrc(3213L);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(3213L, zipArchiveEntry1.getCrc());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("");
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setCompressedSize(0L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertEquals(0, zipArchiveEntry1.getUnixMode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      zipArchiveEntry0.setCompressedSize(1181L);
      ZipArchiveEntry zipArchiveEntry1 = zipArchiveEntryRequest0.getZipArchiveEntry();
      assertFalse(zipArchiveEntry1.isDirectory());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(inputStreamSupplier0).get();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      InputStream inputStream0 = zipArchiveEntryRequest0.getPayloadStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(0);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      zipArchiveEntry0.setMethod(26113);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals(26113, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        ZipArchiveEntryRequest.createZipArchiveEntryRequest((ZipArchiveEntry) null, (InputStreamSupplier) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      doReturn(pipedInputStream0).when(inputStreamSupplier0).get();
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      InputStream inputStream0 = zipArchiveEntryRequest0.getPayloadStream();
      assertSame(pipedInputStream0, inputStream0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry();
      InputStreamSupplier inputStreamSupplier0 = mock(InputStreamSupplier.class, new ViolatedAssumptionAnswer());
      ZipArchiveEntryRequest zipArchiveEntryRequest0 = ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier0);
      int int0 = zipArchiveEntryRequest0.getMethod();
      assertEquals((-1), int0);
  }
}
