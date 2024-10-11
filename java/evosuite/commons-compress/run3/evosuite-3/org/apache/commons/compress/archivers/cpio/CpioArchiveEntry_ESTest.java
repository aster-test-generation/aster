
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
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CpioArchiveEntry_ESTest extends CpioArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setMode(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mode. Full: 1 Masked: 0
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setMode(49152L);
      boolean boolean0 = cpioArchiveEntry0.isSymbolicLink();
      assertEquals(49152L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setMode(49152L);
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals(49152L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setMode(49152L);
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertEquals(49152L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Q2", 904L);
      cpioArchiveEntry0.setMode(49152L);
      boolean boolean0 = cpioArchiveEntry0.isNetwork();
      assertEquals(49152L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      MockFile mockFile0 = new MockFile("TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "N_y=2ue' Y#se5");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals("N_y=2ue' Y#se5", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      MockFile mockFile0 = new MockFile("-8", "-8");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, (String) null);
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setMode(49152L);
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals(49152L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ulb");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-2292L));
      assertEquals(0, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)8, short0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("zHOA6", 1L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(3, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("zHOA6", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(26, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)8, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
      assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, (String) null, 1801L);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "kVp`\u0001I8t$[dz6~");
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("kVp`\u0001I8t$[dz6~", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("IniZ$X", 4294967295L);
      cpioArchiveEntry0.setUID(4294967295L);
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals(4294967295L, long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      cpioArchiveEntry0.setUID((-519L));
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals((-519L), long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      Instant instant0 = MockInstant.ofEpochSecond(61440L, 2279L);
      Instant instant1 = MockInstant.plusNanos(instant0, (-116444736000000000L));
      FileTime fileTime0 = FileTime.from(instant1);
      cpioArchiveEntry0.setTime(fileTime0);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals((-116383296L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Masked: ");
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(" Masked: ", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Masked: ");
      cpioArchiveEntry0.setRemoteDeviceMin(1543L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(" Masked: ", cpioArchiveEntry0.getName());
      assertEquals(1543L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      cpioArchiveEntry0.setRemoteDeviceMin((-2174L));
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals((-2174L), long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      File file0 = MockFile.createTempFile("TRAILER!!!", "TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "TRAILER!!!");
      cpioArchiveEntry0.setRemoteDeviceMaj(925L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(925L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      long long0 = cpioArchiveEntry0.getRemoteDevice();
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      cpioArchiveEntry0.setRemoteDevice((-957L));
      long long0 = cpioArchiveEntry0.getRemoteDevice();
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals((-957L), long0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "\"At]'Jvd'6");
      cpioArchiveEntry0.setNumberOfLinks((-1L));
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("\"At]'Jvd'6", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((-1L), long0);
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("&JO0J$d-=SZ@Hi$' M>", 40960L);
      assertEquals("&JO0J$d-=SZ@Hi$' M>", cpioArchiveEntry0.getName());
      
      cpioArchiveEntry0.setName((String) null);
      cpioArchiveEntry0.getName();
      assertEquals(40960L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("6");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals("6", string0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      String string0 = cpioArchiveEntry0.getName();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", string0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      cpioArchiveEntry0.setInode(1L);
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      assertEquals(0L, cpioArchiveEntry0.getInode());
      
      cpioArchiveEntry0.setInode((-1L));
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(")&5!V#X46R_4@tp", 684L);
      cpioArchiveEntry0.setGID(61440L);
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(61440L, long0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Masked: ");
      cpioArchiveEntry0.setGID((-805L));
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals((-805L), long0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 38L);
      cpioArchiveEntry0.setDeviceMin(38L);
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(38L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(2, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      cpioArchiveEntry0.setDeviceMin((-1L));
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Pb1S8rvu5y>'", 1L);
      cpioArchiveEntry0.setDeviceMaj(4294967287L);
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
      assertEquals(4294967287L, long0);
      assertEquals("Pb1S8rvu5y>'", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setDeviceMaj((-711L));
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals((-711L), long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(904L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      cpioArchiveEntry0.setDevice(1322L);
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals(1322L, long0);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      cpioArchiveEntry0.setChksum((-278L));
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals(4294967018L, long0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals(0, int0);
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDeviceMin(2147483647L);
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDeviceMin((byte) (-128));
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDeviceMaj(4294967295L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setChksum(2147L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
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
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Cannot determine type of file ");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4, mockFile0, "Cannot determine type of file ");
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
  public void test046()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(")&5!V#X46R_4@tp", 684L);
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
  public void test047()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
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
  public void test048()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)32, (Path) null, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      MockFile mockFile0 = new MockFile("7FgipU\"uF^=\"eX;i*", "7FgipU\"uF^=\"eX;i*");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)16384, path0, "7FgipU\"uF^=\"eX;i*", linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 16384
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)524, (File) null, "070701");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((File) null, ".h?b=Q]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Masked: ");
      cpioArchiveEntry0.setSize(1543L);
      assertEquals(1543L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Masked: ", 1543L);
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
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setMode(32768);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(904L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("7FgipU\"uF^=\"eX;i*");
      cpioArchiveEntry0.setMode((short)16384);
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "NCJ,&;_}Uf/,(Uw&[K");
      boolean boolean0 = cpioArchiveEntry0.isDirectory();
      assertEquals("NCJ,&;_}Uf/,(Uw&[K", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((Charset) null);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((Charset) null);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, int0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[5];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOptionArray0[1];
      linkOptionArray0[4] = linkOptionArray0[3];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
      long long0 = cpioArchiveEntry0.getTime();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1715864910L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry("IniZ$X", 4294967333L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid entry size <4294967333>
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setMode(40960);
      assertEquals(40960L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      cpioArchiveEntry0.setMode(36864);
      assertEquals(36864L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1L);
      cpioArchiveEntry0.setMode(8192L);
      assertEquals(8192L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1L);
      cpioArchiveEntry0.setMode(5451L);
      assertEquals(5451L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      boolean boolean0 = cpioArchiveEntry0.isSymbolicLink();
      assertFalse(boolean0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      cpioArchiveEntry0.setMode(49152L);
      boolean boolean0 = cpioArchiveEntry0.isSocket();
      assertEquals(49152L, cpioArchiveEntry0.getMode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!", 1559L);
      boolean boolean0 = cpioArchiveEntry0.isSocket();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1559L, cpioArchiveEntry0.getSize());
      assertFalse(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      File file0 = MockFile.createTempFile("TRAILER!!!", "TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "TRAILER!!!");
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      boolean boolean0 = cpioArchiveEntry0.isRegularFile();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1L);
      boolean boolean0 = cpioArchiveEntry0.isPipe();
      assertFalse(boolean0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(3, cpioArchiveEntry0.getDataPadCount());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!", 1559L);
      boolean boolean0 = cpioArchiveEntry0.isNetwork();
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertFalse(boolean0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertFalse(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("6");
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("6", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, long0);
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MockFile mockFile0 = new MockFile("TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "N_y=2ue' Y#se5");
      long long0 = cpioArchiveEntry0.getMode();
      assertEquals("N_y=2ue' Y#se5", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, cpioArchiveEntry0.getTime());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(32768L, long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-1191L));
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      int int0 = cpioArchiveEntry0.getHeaderPadCount(3328L);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      int int0 = cpioArchiveEntry0.getHeaderPadCount((-1197L));
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, int0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      File file0 = MockFile.createTempFile("TRAILER!!!", "TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "TRAILER!!!");
      Charset charset0 = Charset.defaultCharset();
      int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(3, int0);
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(0, int0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!", 1559L);
      int int0 = cpioArchiveEntry0.getDataPadCount();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("a0 .zXg#v");
      CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry("a0 .zXg#v");
      boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
      assertEquals(110, cpioArchiveEntry1.getHeaderSize());
      assertEquals("a0 .zXg#v", cpioArchiveEntry1.getName());
      assertTrue(boolean0);
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
      boolean boolean0 = cpioArchiveEntry0.equals((Object) null);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      FileTime fileTime0 = FileTime.from(0L, timeUnit0);
      boolean boolean0 = cpioArchiveEntry0.equals(fileTime0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDeviceMaj(901L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOption0;
      linkOptionArray0[4] = linkOptionArray0[2];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOptionArray0[0];
      linkOptionArray0[7] = linkOptionArray0[1];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, (String) null, linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot determine type of file /tmp/foo.bar
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "\"At]'Jvd'6");
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals(2L, long0);
      assertEquals("\"At]'Jvd'6", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(16384L, cpioArchiveEntry0.getMode());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)24576, "", (short)24576);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 24576
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
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
  public void test094()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)7, "Pb1S8rvu5y>'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 7
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)6, mockFile0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 6
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry((short)5, ">", (-1668L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown header type 5
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
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
  public void test098()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      cpioArchiveEntry0.hashCode();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
      assertEquals(0L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      File file0 = MockFile.createTempFile("TRAILER!!!", "TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "TRAILER!!!");
      short short0 = cpioArchiveEntry0.getFormat();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals((short)1, short0);
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MockFile mockFile0 = new MockFile("BBL^YW\"hWK'H?rJ\"9!K", "BBL^YW\"hWK'H?rJ\"9!K");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, mockFile0, "BBL^YW\"hWK'H?rJ\"9!K");
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
  public void test102()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
      long long0 = cpioArchiveEntry0.getDevice();
      assertEquals(0L, long0);
      assertEquals((short)4, cpioArchiveEntry0.getFormat());
      assertEquals(76, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      File file0 = MockFile.createTempFile("TRAILER!!!", "TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "TRAILER!!!");
      long long0 = cpioArchiveEntry0.getGID();
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[5];
      CpioArchiveEntry cpioArchiveEntry0 = null;
      try {
        cpioArchiveEntry0 = new CpioArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MockFile mockFile0 = new MockFile("BBL^YW\"hWK'H?rJ\"9!K", "BBL^YW\"hWK'H?rJ\"9!K");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, mockFile0, "BBL^YW\"hWK'H?rJ\"9!K");
      int int0 = cpioArchiveEntry0.getHeaderSize();
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals((short)2, cpioArchiveEntry0.getFormat());
      assertEquals("BBL^YW\"hWK'H?rJ\"9!K", cpioArchiveEntry0.getName());
      assertEquals(110, int0);
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(0L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      long long0 = cpioArchiveEntry0.getDeviceMin();
      assertEquals(0L, long0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals("", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setRemoteDevice((-1752L));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      long long0 = cpioArchiveEntry0.getDeviceMaj();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(0L, long0);
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(904L, cpioArchiveEntry0.getSize());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRwAILER!!!");
      int int0 = cpioArchiveEntry0.getAlignmentBoundary();
      assertEquals("TRwAILER!!!", cpioArchiveEntry0.getName());
      assertEquals(4, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 0L);
      long long0 = cpioArchiveEntry0.getUID();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      Date date0 = cpioArchiveEntry0.getLastModifiedDate();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 1L);
      // Undeclared exception!
      try { 
        cpioArchiveEntry0.setDevice(1L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      int int0 = cpioArchiveEntry0.getHeaderPadCount();
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(1, int0);
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 904L);
      long long0 = cpioArchiveEntry0.getSize();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(904L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("6");
      long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("6", cpioArchiveEntry0.getName());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      File file0 = MockFile.createTempFile("TRAILER!!!", "TRAILER!!!");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(file0, "TRAILER!!!");
      long long0 = cpioArchiveEntry0.getChksum();
      assertEquals(1392409281L, cpioArchiveEntry0.getTime());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(32768L, cpioArchiveEntry0.getMode());
      assertEquals(0L, cpioArchiveEntry0.getSize());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertEquals(0L, long0);
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      cpioArchiveEntry0.setTime(49152L);
      cpioArchiveEntry0.getLastModifiedDate();
      assertEquals(49152L, cpioArchiveEntry0.getTime());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("", 895L);
      cpioArchiveEntry0.setNumberOfLinks(895L);
      long long0 = cpioArchiveEntry0.getNumberOfLinks();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals(895L, long0);
      assertEquals(1, cpioArchiveEntry0.getDataPadCount());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("6");
      long long0 = cpioArchiveEntry0.getInode();
      assertEquals(0L, long0);
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals("6", cpioArchiveEntry0.getName());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
  }
}
