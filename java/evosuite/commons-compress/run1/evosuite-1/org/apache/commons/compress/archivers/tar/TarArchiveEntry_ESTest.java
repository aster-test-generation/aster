
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


package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveStructSparse;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveEntry_ESTest extends TarArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("exustar");
      tarArchiveEntry0.setSize(1L);
      assertEquals(1L, tarArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.setDevMinor(0);
      assertEquals(0, tarArchiveEntry0.getDevMinor());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("QdBWxU", (byte)0, true);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      
      tarArchiveEntry0.setDataOffset((byte)0);
      assertEquals(0L, tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("E", (byte)70, false);
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertEquals("E", tarArchiveEntry0.getName());
      assertEquals((byte)70, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("H", (byte)102);
      tarArchiveEntry0.isGNULongNameEntry();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("H", tarArchiveEntry0.getName());
      assertEquals((byte)102, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      boolean boolean0 = tarArchiveEntry0.isGNULongLinkEntry();
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertFalse(tarArchiveEntry0.isPaxHeader());
      assertFalse(boolean0);
      assertFalse(tarArchiveEntry0.isGlobalPaxHeader());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("on", (byte) (-65), false);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals("on", tarArchiveEntry0.getName());
      assertEquals((byte) (-65), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      boolean boolean0 = tarArchiveEntry0.isFIFO();
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      boolean boolean0 = tarArchiveEntry0.isBlockDevice();
      assertFalse(boolean0);
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("E", (byte)70, false);
      tarArchiveEntry0.setNames("E", " y*x\"+uz");
      tarArchiveEntry0.getUserName();
      assertEquals(" y*x\"+uz", tarArchiveEntry0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      tarArchiveEntry0.setIds(55, 55);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals(55, tarArchiveEntry0.getGroupId());
      assertEquals(55, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", false);
      String string0 = tarArchiveEntry0.getName();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      tarArchiveEntry0.setUserId(512);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals(512L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      tarArchiveEntry0.setUserId((-12L));
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals((-12), tarArchiveEntry0.getUserId());
      assertEquals((-12L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      tarArchiveEntry0.setIds(2973, 2973);
      long long0 = tarArchiveEntry0.getLongGroupId();
      assertEquals(2973L, tarArchiveEntry0.getLongUserId());
      assertEquals(2973L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, byte0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      FileTime fileTime0 = tarArchiveEntry0.getLastModifiedTime();
      tarArchiveEntry0.setLastAccessTime(fileTime0);
      tarArchiveEntry0.getLastAccessTime();
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" /", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      tarArchiveEntry0.setGroupName(" /");
      tarArchiveEntry0.getGroupName();
      assertEquals(" /", tarArchiveEntry0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      tarArchiveEntry0.setGroupId(9);
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals(9L, tarArchiveEntry0.getLongGroupId());
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";V45)>-");
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tarArchiveEntry0.writeEntryHeader((byte[]) null, zipEncoding0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("exustar/", (byte)0);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.updateEntryFromPaxHeaders((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";V45)>-");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("unix:ctime", (byte)100);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setModTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Time must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("l9U}", true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setLastModifiedTime((FileTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Time must not be null
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("V@[ 37;J", true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillStarSparseData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillGNUSparse1xData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
      try { 
        tarArchiveEntry0.fillGNUSparse0xData(map0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unable to parse int from string value: null
         //
         verifyException("org.apache.commons.compress.utils.ParsingUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      byte[] byteArray0 = new byte[1];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(map0, byteArray0, (ZipEncoding) null, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      MockFile mockFile0 = new MockFile(")p@7.P:eM2`");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[4];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[1];
      linkOptionArray0[3] = linkOption0;
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "vp:R>QP0cd&~cQVP36I", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte) (-35), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte)78);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((File) null, "l<rI*5.I1cT");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("y$", (byte) (-72), false);
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("y$", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals((byte) (-72), tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      boolean boolean0 = tarArchiveEntry0.isPaxHeader();
      assertFalse(boolean0);
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" /", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte) (-80));
      boolean boolean0 = tarArchiveEntry0.isOldGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-80), tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      boolean boolean0 = tarArchiveEntry0.isGlobalPaxHeader();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals("bVYG7f$*j~g]", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<(YdX");
      tarArchiveEntry0.isPaxGNUSparse();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("<(YdX", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" yiKiBy6kuP", (byte)0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        tarArchiveEntry0.parseTarHeader(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      FileTime fileTime0 = tarArchiveEntry0.getLastModifiedTime();
      tarArchiveEntry0.setLastModifiedTime(fileTime0);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("_c'LZ5Gz{n", (byte)16, true);
      String string0 = tarArchiveEntry0.getName();
      assertEquals("_c'LZ5Gz{n", string0);
      assertEquals((byte)16, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /");
      tarArchiveEntry0.setGroupId(0L);
      assertEquals(0L, tarArchiveEntry0.getLongGroupId());
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)0, true);
      tarArchiveEntry0.isStarSparse();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("_h}Hf:OZ+?`lYoUMOh`");
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.updateEntryFromPaxHeaders(map0);
      assertEquals("", tarArchiveEntry0.getLinkName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("_h}Hf:OZ+?`lYoUMOh`", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("^F01w_De#4H{", true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setSize((-2784L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size is out of range: -2784
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      tarArchiveEntry0.setSize(0L);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0L, tarArchiveEntry0.getRealSize());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("y$", (byte) (-72), false);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMinor((byte) (-72));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minor device number is out of range: -72
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      tarArchiveEntry0.setDevMinor(9);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("zzDOd^-ev!0434");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMajor((-2305));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Major device number is out of range: -2305
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      tarArchiveEntry0.setDevMajor((byte)107);
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals(107, int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";V45)>-");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDataOffset((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The offset can not be smaller than 0
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /");
      tarArchiveEntry0.setDataOffset(2009L);
      long long0 = tarArchiveEntry0.getDataOffset();
      assertEquals(2009L, long0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("");
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:506)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:474)
             // sun.reflect.GeneratedConstructorAccessor68.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("");
          Path path0 = mockFile0.toPath();
          LinkOption[] linkOptionArray0 = new LinkOption[6];
          LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
          linkOptionArray0[0] = linkOption0;
          linkOptionArray0[1] = linkOption0;
          linkOptionArray0[2] = linkOptionArray0[0];
          linkOptionArray0[3] = linkOptionArray0[1];
          linkOptionArray0[4] = linkOptionArray0[0];
          linkOptionArray0[5] = linkOptionArray0[2];
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(path0, "#J!ecMOaFNv^Y,R(y", linkOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:587)
             // sun.reflect.GeneratedConstructorAccessor74.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("C8fz");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.addPaxHeader("gid", "Y/~K50MpqScI[3N<! 5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid input
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000", (byte)0, true);
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(" \u0000", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)7);
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)7, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte) (-123), true);
      boolean boolean0 = tarArchiveEntry0.isGNULongNameEntry();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-123), tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      boolean boolean0 = tarArchiveEntry0.isGNULongLinkEntry();
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" overlap each other.", false);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertTrue(boolean0);
      assertEquals(" overlap each other.", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000", (byte)0, true);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" \u0000", tarArchiveEntry0.getName());
      assertTrue(boolean0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("V@[ 37;J", true);
      boolean boolean0 = tarArchiveEntry0.isFIFO();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals("V@[ 37;J", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("exustar/", (byte)0);
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertTrue(boolean0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("4`d1Z,pvESZm6P", (byte)103);
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertEquals("4`d1Z,pvESZm6P", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(tarArchiveEntry0.isPaxHeader());
      assertFalse(boolean0);
      assertTrue(tarArchiveEntry0.isGlobalPaxHeader());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" yiKiBy6kuP", (byte)0);
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" yiKiBy6kuP", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isBlockDevice();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("V@[ 37;J", true);
      tarArchiveEntry0.getOrderedSparseHeaders();
      assertEquals("V@[ 37;J", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("<(YdX");
      tarArchiveEntry0.getFile();
      assertEquals("<(YdX", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      tarArchiveEntry0.getDirectoryEntries();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";V45)>-");
      HashMap<String, String> hashMap0 = new HashMap<String, String>(31);
      tarArchiveEntry0.fillStarSparseData(hashMap0);
      boolean boolean0 = tarArchiveEntry0.isStarSparse();
      assertTrue(tarArchiveEntry0.isSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("zzDOd^-ev!0434");
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      assertTrue(tarArchiveEntry0.isGNUSparse());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Minor device number is out of range: ", (byte)0, false);
      TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("z", (byte)103);
      boolean boolean0 = tarArchiveEntry0.equals(tarArchiveEntry1);
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry1.getMode());
      assertEquals((-1L), tarArchiveEntry1.getDataOffset());
      assertTrue(tarArchiveEntry1.isGlobalPaxHeader());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Minor device number is out of range: ", (byte)0, false);
      tarArchiveEntry0.equals(tarArchiveEntry0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("Minor device number is out of range: ", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      Object object0 = new Object();
      boolean boolean0 = tarArchiveEntry0.equals(object0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      tarArchiveEntry0.equals((Object) null);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("bVYG7f$*j~g]", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      MockFile mockFile0 = new MockFile("/ yiKiBy6kuP", "org.apache.commons.compress.archivers.zip.ZipEncodingHelper");
      Path path0 = mockFile0.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "/ yiKiBy6kuP", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("/9");
          mockFile0.mkdirs();
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:506)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:474)
             // sun.reflect.GeneratedConstructorAccessor68.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.getLastModifiedDate();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("T.{Hy&Mo");
      FileTime fileTime0 = tarArchiveEntry0.getLastModifiedTime();
      tarArchiveEntry0.setCreationTime(fileTime0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("T.{Hy&Mo", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      tarArchiveEntry0.getExtraPaxHeader("");
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0L, long0);
      assertEquals(" /", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" yiKiBy6kuP", (byte)0);
      LinkedList<TarArchiveStructSparse> linkedList0 = new LinkedList<TarArchiveStructSparse>();
      tarArchiveEntry0.setSparseHeaders(linkedList0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" yiKiBy6kuP", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      tarArchiveEntry0.setMode(4116);
      assertEquals(4116, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      tarArchiveEntry0.getCreationTime();
      assertEquals("vAyOob~VB", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(0, int0);
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0, true, (byte) (-68));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      byte[] byteArray0 = new byte[6];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(map0, byteArray0, zipEncoding0, false, (-1246L));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".?v4l( Gp VJ>K+");
      Path path0 = mockFile0.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      long long0 = tarArchiveEntry0.getDataOffset();
      assertEquals((-1L), long0);
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      tarArchiveEntry0.isExtended();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      long long0 = tarArchiveEntry0.getLongGroupId();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("vAyOob~VB", tarArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("4`d1Z,pvESZm6P", (byte)103);
      boolean boolean0 = tarArchiveEntry0.isDescendent(tarArchiveEntry0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("4`d1Z,pvESZm6P", tarArchiveEntry0.getName());
      assertEquals((byte)103, tarArchiveEntry0.getLinkFlag());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      tarArchiveEntry0.hashCode();
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        tarArchiveEntry0.writeEntryHeader(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /");
      tarArchiveEntry0.setUserName("bufferSize must be bigger than 0");
      assertEquals("bufferSize must be bigger than 0", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("4`d1Z,pvESZm6P", (byte)103);
      tarArchiveEntry0.getSparseHeaders();
      assertEquals("4`d1Z,pvESZm6P", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)103, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /", true);
      tarArchiveEntry0.getLastAccessTime();
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals(" /", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /");
      tarArchiveEntry0.getStatusChangeTime();
      assertEquals(" /", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte) (-124));
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      FileTime fileTime0 = FileTime.from((-1L), timeUnit0);
      tarArchiveEntry0.setModTime(fileTime0);
      assertEquals((byte) (-124), tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      FileTime fileTime0 = tarArchiveEntry0.getLastModifiedTime();
      tarArchiveEntry0.setStatusChangeTime(fileTime0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("_c'LZ5Gz{n", (byte)16, true);
      String string0 = tarArchiveEntry0.getGroupName();
      assertEquals((byte)16, tarArchiveEntry0.getLinkFlag());
      assertEquals("", string0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("_c'LZ5Gz{n", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(0, int0);
      assertEquals("vAyOob~VB", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("vAyOob~VB", false);
      tarArchiveEntry0.isPaxGNU1XSparse();
      assertEquals("vAyOob~VB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bufferSize must be bigger than 0", (byte)0);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setModTime((Date) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.addPaxHeader(".{d?_7oXil+V,cP#p1", "");
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      String string0 = tarArchiveEntry0.getLinkName();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", string0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("bVYG7f$*j~g]", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("bVYG7f$*j~g]", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.clearExtraPaxHeaders();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("V@[ 37;J", true);
      tarArchiveEntry0.getPath();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("V@[ 37;J", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("4`d1Z,pvESZm6P", (byte)103);
      tarArchiveEntry0.isCheckSumOK();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)103, tarArchiveEntry0.getLinkFlag());
      assertEquals("4`d1Z,pvESZm6P", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" /");
      tarArchiveEntry0.setModTime(0L);
      assertEquals((byte)53, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" /", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals("bVYG7f$*j~g]", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0, int0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte) (-124));
      // Undeclared exception!
      try { 
        tarArchiveEntry0.getModTime();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("S7fQ4;RIXYXgHC", "+@!iFD<?kE#8mUq#");
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"accessUserInformation\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // sun.nio.fs.UnixFileAttributeViews$Posix.checkReadExtended(UnixFileAttributeViews.java:148)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:214)
             // sun.nio.fs.UnixFileAttributeViews$Posix.readAttributes(UnixFileAttributeViews.java:131)
             // sun.nio.fs.UnixFileSystemProvider.readAttributes(UnixFileSystemProvider.java:144)
             // java.nio.file.Files.readAttributes(Files.java:1737)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.readOsSpecificProperties(TarArchiveEntry.java:1675)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:506)
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:474)
             // sun.reflect.GeneratedConstructorAccessor68.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:423)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:218)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:173)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)107);
      tarArchiveEntry0.setName("");
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)107, tarArchiveEntry0.getLinkFlag());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      tarArchiveEntry0.setLinkName("@WSvT)HlX%IaQ|");
      tarArchiveEntry0.getLinkName();
      assertEquals("@WSvT)HlX%IaQ|", tarArchiveEntry0.getLinkName());
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("bVYG7f$*j~g]", (byte)0, true);
      long long0 = tarArchiveEntry0.getRealSize();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("bVYG7f$*j~g]", tarArchiveEntry0.getName());
      assertFalse(tarArchiveEntry0.isSparse());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0L, long0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";V45)>-");
      int int0 = tarArchiveEntry0.getMode();
      assertEquals(";V45)>-", tarArchiveEntry0.getName());
      assertEquals(33188, int0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("4`d1Z,pvESZm6P", (byte)103);
      byte[] byteArray0 = new byte[9];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tarArchiveEntry0.parseTarHeader(byteArray0, zipEncoding0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      long long0 = tarArchiveEntry0.getSize();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(0L, long0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("8mh<z>M@ZY", true);
      String string0 = tarArchiveEntry0.getUserName();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("8mh<z>M@ZY", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isStreamContiguous();
      assertTrue(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }
}
