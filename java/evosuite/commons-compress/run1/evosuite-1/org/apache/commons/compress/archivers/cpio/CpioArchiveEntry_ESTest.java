
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      File file0 = MockFile.createTempFile("jAR", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "ik>B~sbRam7JD");
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("ik>B~sbRam7JD", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1L, long0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ge81");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("ge81", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      File file0 = MockFile.createTempFile("070702", "070702");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "");
      Date date0 = cpioArchiveEntry0.getLastModifiedDate();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ge81");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-2147483648L));
      assertEquals(0, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("ge81", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, " Masked: ", (short)8);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((long) (short)8);
      assertEquals(1, int0);
      assertEquals(" Masked: ", cpioArchiveEntry0.getName());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1943L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals(2, int0);
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ap]TS(\u0000#", ".IqZm{+z;UF U>");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, mockFile0, "~xsrN");
      assertEquals("~xsrN", cpioArchiveEntry0.getName());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      cpioArchiveEntry0.setRemoteDevice(4096L);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("Argument too large or result overflows", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "org.apache.commons.compress.utils.ExactMath");
      cpioArchiveEntry0.setUID(571L);
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals(571L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      cpioArchiveEntry0.setUID((-1434L));
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals((-1434L), long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("org.apache.commons.compress.utils.TimeUtils", 61440L);
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("org.apache.commons.compress.utils.TimeUtils", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(61440L, long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("hF>XZ!kmd,pW", 3740L);
      cpioArchiveEntry0.setRemoteDeviceMin(61440L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(61440L, long0);
      assertEquals("hF>XZ!kmd,pW", cpioArchiveEntry0.getName());
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("org.apache.commons.compress.utils.TimeUtils", 1526L);
      cpioArchiveEntry0.setRemoteDeviceMin((-3150L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("org.apache.commons.compress.utils.TimeUtils", cpioArchiveEntry0.getName());
      assertEquals(2, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals((-3150L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      cpioArchiveEntry0.setRemoteDeviceMaj(182L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals(182L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("hF>XZ!kmd,pW", 3740L);
      cpioArchiveEntry0.setRemoteDeviceMaj((-24L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("hF>XZ!kmd,pW", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((-24L), long0);
      assertEquals(3740L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      String string0 = cpioArchiveEntry0.getName();
      assertNull(string0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" E\"(?8PC0|C'W`");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(" E\"(?8PC0|C'W`", string0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.setInode((-2442L));
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals((-2442L), long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      cpioArchiveEntry0.setGID(61440L);
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(61440L, long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown mode. Full: ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "eW");
      cpioArchiveEntry0.setGID((-1954L));
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals((-1954L), long0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "org.apache.commons.compress.utils.ExactMath");
      cpioArchiveEntry0.setDeviceMin(571L);
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("org.apache.commons.compress.utils.ExactMath", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(571L, long0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.setDeviceMaj((-2486L));
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((-2486L), long0);
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      cpioArchiveEntry0.setDevice(4096L);
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals("Argument too large or result overflows", cpioArchiveEntry0.getName());
      assertEquals(4096L, long0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, " Masked: ", (short)8);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDeviceMin(1);
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDeviceMaj(1050L);
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDeviceMin(1L);
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
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDeviceMaj((-1950L));
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
      MockFile mockFile0 = new MockFile("aUH'");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "Unknown header type ");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDevice((-1651L));
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8, "ap]TS(\u0000#", (short)8);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setChksum((byte)0);
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
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
  public void test035()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ge81");
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
  public void test036()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 4294967295L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.getHeaderPadCount(4294967295L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument too large or result overflows
         //
         verifyException("org.apache.commons.compress.utils.ExactMath", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
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
  public void test038()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "e", (short)4);
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
  public void test039()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ap]TS(\u0000#", 1036L);
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
  public void test040()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, ":F!;iOkaM", (short)4);
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
  public void test041()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)16384, (Path) null, "6H\"|}]m_~n7NL}", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)1690, (File) null, "f-oF");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      File file0 = MockFile.createTempFile("&N1YOYx|A", "x]sQ+uTi2vHr1w*Zgz");
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short) (-1958), file0, "zA8H,i/`aun");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type -1958
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry("}YE8jU%:u-VmYO'8(y", (-958L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-958>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((File) null, "K");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      File file0 = MockFile.createTempFile("jAR", "");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "ik>B~sbRam7JD");
      cpioArchiveEntry0.setMode(16384L);
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[3];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOptionArray0[5];
      linkOptionArray0[7] = linkOptionArray0[4];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(path0, "org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", linkOptionArray0);
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertTrue(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Masked: ");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((long) (short)9);
      assertEquals(0, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(" Masked: ", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((Charset) null);
      assertEquals(1, int0);
      assertEquals(3740L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      cpioArchiveEntry0.setTime(2623L);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals(2623L, long0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      MockFile mockFile0 = new MockFile("T&bLUP8On{-13W");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "T&bLUP8On{-13W");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setSize((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <-1>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setMode(2623L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode. Full: a3f Masked: 0
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      boolean boolean0 = cpioArchiveEntry0.isSymbolicLink();
      assertEquals("", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isSocket();
      assertFalse(boolean0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals("z(zMfE5cqkz3", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertTrue(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertFalse(boolean0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("z7]]}<-G@SwrnEYV");
      cpioArchiveEntry0.setMode(4096L);
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals(4096L, cpioArchiveEntry0.getMode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      boolean boolean0 = cpioArchiveEntry0.isNetwork();
      assertEquals("", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals("z(zMfE5cqkz3", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(2L, long0);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("hF>XZ!kmd,pW", 3740L);
      cpioArchiveEntry0.setNumberOfLinks(61440L);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("hF>XZ!kmd,pW", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(61440L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals(32768L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals("z(zMfE5cqkz3", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(32768L, long0);
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5qcqkz3");
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals(0, int0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((long) (short)1);
      assertEquals(1, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      int int0 = cpioArchiveEntry0.getHeaderPadCount(4096L);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("Argument too large or result overflows", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      cpioArchiveEntry0.setSize(1L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(1L, cpioArchiveEntry0.getSize());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry((String) null);
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals(32768L, cpioArchiveEntry1.getMode());
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertTrue(boolean0);
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("org.apache.commons.compress.utils.TimeUtils");
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry("org.apache.commons.compress.utils.TimeUtils");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertTrue(boolean0);
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertEquals("org.apache.commons.compress.utils.TimeUtils", cpioArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1);
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
      assertFalse(cpioArchiveEntry1.equals((Object)cpioArchiveEntry0));
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertEquals("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", cpioArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("_/tc8.M>", 1000L);
      boolean boolean0 = cpioArchiveEntry0.equals((Object) null);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertFalse(boolean0);
      assertEquals("_/tc8.M>", cpioArchiveEntry0.getName());
      assertEquals(1000L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("org.apache.commons.compress.utils.TimeUtils");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry0);
      assertEquals("org.apache.commons.compress.utils.TimeUtils", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      Object object0 = new Object();
      boolean boolean0 = cpioArchiveEntry0.equals(object0);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("Argument too large or result overflows", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      File file0 = MockFile.createTempFile("UlX2;VjeHJ|", "UlX2;VjeHJ|");
      Path path0 = file0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[6];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[3];
      linkOptionArray0[5] = linkOption0;
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, (String) null, linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot determine type of file /var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/UlX2;VjeHJ|0UlX2;VjeHJ|
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short) (-73));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type -73
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)6, "6H\"|}]m_~n7NL}", (-1342L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 6
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)5, "070702");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 5
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      MockFile mockFile0 = new MockFile("7Bi'y.qo@Af_^.$jBQ/", "zb8[i7M/+-@>E");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[2];
      linkOptionArray0[4] = linkOptionArray0[0];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOptionArray0[2];
      linkOptionArray0[7] = linkOption0;
      linkOptionArray0[8] = linkOptionArray0[0];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)3, path0, "zb8[i7M/+-@>E", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 3
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2);
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)2, short0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      cpioArchiveEntry0.hashCode();
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals((short)1, short0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("z(zMfE5cqkz3", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      long long0 = cpioArchiveEntry0.getRemoteDevice();
      assertEquals(0L, long0);
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals("Argument too large or result overflows", cpioArchiveEntry0.getName());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ZoC&Wr!AWT#2uKtU4b");
      cpioArchiveEntry0.setChksum((-2073L));
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("ZoC&Wr!AWT#2uKtU4b", cpioArchiveEntry0.getName());
      assertEquals(4294965223L, long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("hF>XZ!kmd,pW");
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("hF>XZ!kmd,pW", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      File file0 = MockFile.createTempFile("UlX2;VjeHJ|", "UlX2;VjeHJ|");
      Path path0 = file0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[6];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, (String) null, linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      int int0 = cpioArchiveEntry0.getHeaderSize();
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals(110, int0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDevice(0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals("z(zMfE5cqkz3", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("hF>XZ!kmd,pW", 3740L);
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("hF>XZ!kmd,pW", cpioArchiveEntry0.getName());
      assertEquals(4, int0);
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("Argument too large or result overflows", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MockFile mockFile0 = new MockFile("c!vd?`VZNci=P");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "z(zMfE5cqkz3");
      cpioArchiveEntry0.setDeviceMin((-1762L));
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((-1762L), long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("z(zMfE5cqkz3", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      cpioArchiveEntry0.setDevice((-2360L));
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals((-2360L), long0);
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals(1, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(3740L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, "Argument too large or result overflows");
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals("Argument too large or result overflows", cpioArchiveEntry0.getName());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, path0, "", linkOptionArray0);
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
  public void test110()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      assertEquals(0L, cpioArchiveEntry0.getTime());
      
      FileTime fileTime0 = FileTime.fromMillis(2623L);
      cpioArchiveEntry0.setTime(fileTime0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("hF>XZ!kmd,pW", 3740L);
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("hF>XZ!kmd,pW", cpioArchiveEntry0.getName());
      assertEquals(3740L, cpioArchiveEntry0.getSize());
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 3740L);
      cpioArchiveEntry0.setName("");
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(3740L, cpioArchiveEntry0.getSize());
  }
}
