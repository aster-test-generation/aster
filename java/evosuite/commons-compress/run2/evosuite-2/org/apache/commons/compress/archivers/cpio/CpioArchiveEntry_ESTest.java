
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


package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CpioArchiveEntry_ESTest extends CpioArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("=H[JveIphW3H)^mD", 1595L);
      cpioArchiveEntry0.setMode(24576L);
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals(24576L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">", ">");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, ">");
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(1L, long0);
      assertEquals(">", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 49152L);
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertFalse(boolean0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(49152L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      MockFile mockFile0 = new MockFile("!(^3vwRL+S0r");
      MockFile.createTempFile("org.apache.commons.compress.utils.ExactMath", "NHLy", (File) mockFile0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "!(^3vwRL+S0r");
      Date date0 = cpioArchiveEntry0.getLastModifiedDate();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("!(^3vwRL+S0r", cpioArchiveEntry0.getName());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 49152L);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-1541L));
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0, int0);
      assertEquals(49152L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown header type ", "Unknown header type ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, mockFile0, "<hu_&/igRr^X,{");
      int int0 = cpioArchiveEntry0.getHeaderPadCount(456L);
      assertEquals(1, int0);
      assertEquals("<hu_&/igRr^X,{", cpioArchiveEntry0.getName());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "TRAILER!!!");
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals((short)2, short0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(3, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("B", 1451L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("B", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, "", 2638L);
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals(2638L, cpioArchiveEntry0.getSize());
      assertEquals(2, int0);
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[0];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOptionArray0[2];
      linkOptionArray0[7] = linkOptionArray0[4];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, path0, "Unknown mode. Full: ", linkOptionArray0);
      assertEquals("Unknown mode. Full: ", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      cpioArchiveEntry0.setUID((short)1);
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      cpioArchiveEntry0.setUID((-34L));
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals((-34L), long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals(1392409281L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      cpioArchiveEntry0.setTime((-2626L));
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((-2626L), long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("\"(p\"44VB&?nqxMP49O", 1L);
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals(1L, long0);
      assertEquals("\"(p\"44VB&?nqxMP49O", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("..*o.^6:XGAJk", 4294967295L);
      cpioArchiveEntry0.setRemoteDeviceMin(4294967295L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("..*o.^6:XGAJk", cpioArchiveEntry0.getName());
      assertEquals(4294967295L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q", 1595L);
      cpioArchiveEntry0.setRemoteDeviceMaj(1595L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("Q", cpioArchiveEntry0.getName());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals(1595L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Invalid entry size <");
      long long0 = cpioArchiveEntry0.getRemoteDevice();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("Invalid entry size <", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "o", (short)1);
      cpioArchiveEntry0.setNumberOfLinks((-3545L));
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals((-3545L), long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("o", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      String string0 = cpioArchiveEntry0.getName();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertNull(string0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      String string0 = cpioArchiveEntry0.getName();
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Argument too large or result overflows");
      cpioArchiveEntry0.setGID(24576L);
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(24576L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      cpioArchiveEntry0.setGID((-1088L));
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals((-1088L), long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      cpioArchiveEntry0.setDeviceMin(166L);
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(166L, long0);
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("=H[JveIphW3H)^mD", 1595L);
      cpioArchiveEntry0.setDeviceMaj(706L);
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals(1595L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(706L, long0);
      assertEquals("=H[JveIphW3H)^mD", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1000L);
      cpioArchiveEntry0.setDeviceMaj((-1678L));
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1000L, cpioArchiveEntry0.getSize());
      assertEquals((-1678L), long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 363L);
      cpioArchiveEntry0.setChksum((-75L));
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4294967221L, long0);
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "mR");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDeviceMin(150L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, ".[Y%`QhPb3%['kU_vix", 0L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDeviceMaj(0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, (String) null);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setChksum((short)4);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getRemoteDeviceMaj();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getDeviceMin();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, (String) null);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getDeviceMaj();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "c,{");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getChksum();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[6];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)512, (Path) null, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)1685, "p/_F84axIls!TR~Ls");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 1685
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short) (-1173), (File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      MockFile mockFile0 = new MockFile("TRAILER!!!");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[6];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOption0;
      linkOptionArray0[4] = linkOptionArray0[0];
      linkOptionArray0[5] = linkOptionArray0[1];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot determine type of file TRAILER!!!
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry("Cannot determine type of file ", (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-1>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((File) null, "TRAILER!!!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      MockFile mockFile0 = new MockFile("070702");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "rq}:#xI`*ngRz");
      cpioArchiveEntry0.setMode((-116444736000000000L));
      assertEquals((-116444736000000000L), cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 16384L);
      cpioArchiveEntry0.setMode(16384L);
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((Charset) null);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals(0L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("'>IoK}aZJ2:\u0007?pL?");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setSize((-2316L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-2316>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      MockFile mockFile0 = new MockFile("X#~r}@+X#t)\"%v`$", "X#~r}@+X#t)\"%v`$");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, mockFile0, "WjkO_=XMU*");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setMode(565L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode. Full: 235 Masked: 0
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("bsF-eu-S[ApRYf");
      cpioArchiveEntry0.setMode(49152L);
      assertEquals(49152L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("=H[JveIphW3H)^mD", 1595L);
      cpioArchiveEntry0.setMode(24576L);
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals(24576L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
      cpioArchiveEntry0.setMode(4622L);
      assertEquals(4622L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isSymbolicLink();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      boolean boolean0 = cpioArchiveEntry0.isSocket();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown header type ", "Unknown header type ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, mockFile0, "<hu_&/igRr^X,{");
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals("<hu_&/igRr^X,{", cpioArchiveEntry0.getName());
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertFalse(boolean0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      boolean boolean0 = cpioArchiveEntry0.isNetwork();
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Cannot determine type of file ", "Cannot determine type of file ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "?(");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertFalse(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("?(", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("im{~S!vqFJ)eAnX4)", 1451L);
      cpioArchiveEntry0.setNumberOfLinks(1451L);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals("im{~S!vqFJ)eAnX4)", cpioArchiveEntry0.getName());
      assertEquals(1451L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals(32768L, long0);
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((long) (short)1);
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      int int0 = cpioArchiveEntry0.getHeaderPadCount(1587L);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      MockFile mockFile0 = new MockFile("X#~r}@+X#t)\"%v`$", "X#~r}@+X#t)\"%v`$");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, mockFile0, "WjkO_=XMU*");
      int int0 = cpioArchiveEntry0.getHeaderPadCount(1L);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals("WjkO_=XMU*", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(2, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      cpioArchiveEntry0.setSize(2L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(2L, cpioArchiveEntry0.getSize());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      MockFile mockFile0 = new MockFile("X#~r}@+X#t)\"%v`$", "X#~r}@+X#t)\"%v`$");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, mockFile0, "WjkO_=XMU*");
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("WjkO_=XMU*", cpioArchiveEntry0.getName());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(0, int0);
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry((String) null);
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals(32768L, cpioArchiveEntry1.getMode());
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry("Dn+>d1!?>-p<E");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertFalse(boolean0);
      assertFalse(cpioArchiveEntry1.equals((Object)cpioArchiveEntry0));
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      boolean boolean0 = cpioArchiveEntry0.equals("070707");
      assertFalse(boolean0);
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Invalid entry size <");
      boolean boolean0 = cpioArchiveEntry0.equals((Object) null);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
      assertEquals("Invalid entry size <", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertTrue(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.utils.ExactMath", "N6r:p'$");
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry(mockFile0, "070707");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals(0L, cpioArchiveEntry1.getTime());
      assertEquals(32768L, cpioArchiveEntry1.getMode());
      assertEquals(0L, cpioArchiveEntry1.getSize());
      assertFalse(boolean0);
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
      assertFalse(cpioArchiveEntry1.equals((Object)cpioArchiveEntry0));
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c,{");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[3];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOption0;
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "c,{", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot determine type of file c,{
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)0, "'7r=j:c>6", 747L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 0
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown header type ", "Unknown header type ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, mockFile0, "<hu_&/igRr^X,{");
      cpioArchiveEntry0.setDevice((-116444736000000000L));
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals("<hu_&/igRr^X,{", cpioArchiveEntry0.getName());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 7
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 6
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      File file0 = MockFile.createTempFile("Zip slip '%s' + '%s' -> '%s'", "4%6", (File) null);
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)5, file0, "4%6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 5
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, mockFile0, "Argument too large or result overflows");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getRemoteDeviceMin();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 3
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.hashCode();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      cpioArchiveEntry0.setRemoteDeviceMaj((-16L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals((-16L), long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q", 1595L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("Q", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals("N6r:p'$", string0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("im{~S!vqFJ)eAnX4)", 1451L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getRemoteDevice();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getDevice();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.setInode(4);
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2);
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      int int0 = cpioArchiveEntry0.getHeaderSize();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals(110, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q", 1595L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDevice(1L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, int0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Cannot determine type of file ");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDevice((-1L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(2, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Cannot determine type of file ");
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals("Cannot determine type of file ", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(0L, long0);
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.utils.ExactMath", "N6r:p'$");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "070707");
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("070707", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      FileTime fileTime0 = FileTime.fromMillis(436L);
      cpioArchiveEntry0.setTime(fileTime0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("N6r:p'$");
      cpioArchiveEntry0.setRemoteDeviceMin((-1L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals((-1L), long0);
      assertEquals("N6r:p'$", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, "", (short)1);
      cpioArchiveEntry0.setName("");
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
  }
}
