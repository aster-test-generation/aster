
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
import java.util.List;
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
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveEntry_ESTest extends TarArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Value ", (byte) (-66), true);
      tarArchiveEntry0.setSize(0L);
      assertEquals(0L, tarArchiveEntry0.getRealSize());
      assertEquals((byte) (-66), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("Value ", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", false);
      tarArchiveEntry0.setDevMinor(2487);
      assertEquals(2487, tarArchiveEntry0.getDevMinor());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("W", (byte)114, true);
      tarArchiveEntry0.setDevMajor((byte)114);
      assertEquals(114, tarArchiveEntry0.getDevMajor());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      
      tarArchiveEntry0.setDataOffset((byte)0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("\u0000\u0000", (byte)52);
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("\u0000\u0000", tarArchiveEntry0.getName());
      assertTrue(tarArchiveEntry0.isBlockDevice());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("rk?{!:T/F1_2+N8/BL", (byte)108, true);
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertEquals((byte)108, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("rk?{!:T/F1_2+N8/BL", tarArchiveEntry0.getName());
      assertFalse(tarArchiveEntry0.isGlobalPaxHeader());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Value ", (byte) (-66), true);
      FileTime fileTime0 = tarArchiveEntry0.getLastModifiedTime();
      tarArchiveEntry0.setLastModifiedTime(fileTime0);
      assertEquals((byte) (-66), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("Value ", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.setName("");
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      FileTime fileTime0 = FileTime.from((long) 31, timeUnit0);
      tarArchiveEntry0.setModTime(fileTime0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      boolean boolean0 = tarArchiveEntry0.isPaxGNUSparse();
      assertTrue(tarArchiveEntry0.isGNUSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" x)", true);
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      boolean boolean0 = tarArchiveEntry0.isPaxGNU1XSparse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.isDescendent(tarArchiveEntry0);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.setUserName("`");
      tarArchiveEntry0.getUserName();
      assertEquals("`", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.setIds(2, 2);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals(2L, tarArchiveEntry0.getLongGroupId());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@+j9}A4b5:1BjcD");
      FileTime fileTime0 = FileTime.fromMillis((-3412L));
      tarArchiveEntry0.setStatusChangeTime(fileTime0);
      tarArchiveEntry0.getStatusChangeTime();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("@+j9}A4b5:1BjcD", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)2, false);
      String string0 = tarArchiveEntry0.getName();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", string0);
      assertEquals((byte)2, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("\u0000\u0000", (byte)52);
      tarArchiveEntry0.setIds((byte)52, (byte)52);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals(52L, tarArchiveEntry0.getLongGroupId());
      assertEquals(52L, long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("k6$U'=E");
      tarArchiveEntry0.setGroupId((-3L));
      long long0 = tarArchiveEntry0.getLongGroupId();
      assertEquals((-3), tarArchiveEntry0.getGroupId());
      assertEquals((-3L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.setLinkName("FaXuv/L_");
      tarArchiveEntry0.getLinkName();
      assertEquals("FaXuv/L_", tarArchiveEntry0.getLinkName());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)0, byte0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("MTm-\"|fB;G>Z!(mh", (byte)0, false);
      tarArchiveEntry0.setIds((-2113), 33188);
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals(33188L, tarArchiveEntry0.getLongGroupId());
      assertEquals(33188, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("MTm-\"|fB;G>Z!(mh", (byte)0, false);
      tarArchiveEntry0.setIds((-2113), (-808));
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals((-2113), tarArchiveEntry0.getUserId());
      assertEquals((-808), int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      tarArchiveEntry0.addPaxHeader("IFP@C}}4zz,g!Bd9", "IFP@C}}4zz,g!Bd9");
      String string0 = tarArchiveEntry0.getExtraPaxHeader("IFP@C}}4zz,g!Bd9");
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("IFP@C}}4zz,g!Bd9", string0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      byte[] byteArray0 = new byte[6];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tarArchiveEntry0.writeEntryHeader(byteArray0, zipEncoding0, true);
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)0);
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillStarSparseData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillGNUSparse1xData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("S.iC*3rVuMjs6|kbG", (byte) (-80), true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillGNUSparse0xData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("SCHILY.archtype", (byte) (-100), true);
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
  public void test029()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("heG?f>zX$>O7o ", (byte) (-121), false);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.addPaxHeader((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[9];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(hashMap0, byteArray0, zipEncoding0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@0y/h$`*\"%:Y+CpsX2m");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "bufferSize must be bigger than 0", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
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
  public void test034()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte)0, true);
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
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte)11);
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
  public void test037()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((File) null, "z");
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
  public void test039()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("k6$U'=E");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      tarArchiveEntry0.fillStarSparseData(hashMap0);
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertTrue(tarArchiveEntry0.isStarSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      boolean boolean0 = tarArchiveEntry0.isPaxHeader();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      boolean boolean0 = tarArchiveEntry0.isOldGNUSparse();
      assertFalse(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)13, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals("@0y/h$`*\"%:Y+CpsX2m/", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("k6$U'=E");
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals("k6$U'=E", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!rIgA{{,L]", (byte) (-3));
      boolean boolean0 = tarArchiveEntry0.isGlobalPaxHeader();
      assertFalse(boolean0);
      assertEquals("!rIgA{{,L]", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-3), tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      tarArchiveEntry0.isPaxGNUSparse();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("\u0000\u0000", (byte)52);
      byte[] byteArray0 = new byte[6];
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
  public void test047()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" 7q$XEIjSI{'I6");
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
  public void test048()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("\u0000\u0000", (byte)52);
      tarArchiveEntry0.setGroupName("\u0000\u0000");
      assertEquals("\u0000\u0000", tarArchiveEntry0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("{M]\"e3FJ-6$J?h#7uM", false);
      long long0 = tarArchiveEntry0.getSize();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0L, long0);
      assertEquals("{M]\"e3FJ-6$J?h#7uM", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      tarArchiveEntry0.setUserId(1189L);
      assertEquals(1189, tarArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("TarArchiveStructSparse{offset=", true);
      String string0 = tarArchiveEntry0.getName();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("TarArchiveStructSparse{offset=", string0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      tarArchiveEntry0.setGroupId((int) (byte)13);
      assertEquals(13L, tarArchiveEntry0.getLongGroupId());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.isStarSparse();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      tarArchiveEntry0.addPaxHeader("IFP@C}}4zz,g!Bd9", "IFP@C}}4zz,g!Bd9");
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
      tarArchiveEntry0.updateEntryFromPaxHeaders(map0);
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(map0.isEmpty());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setSize((-4152L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size is out of range: -4152
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("b+");
      tarArchiveEntry0.setSize(2097151L);
      assertEquals(2097151L, tarArchiveEntry0.getRealSize());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Zip slip '%s' + '%s' -> '%s'", (byte) (-80));
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMinor((byte) (-80));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minor device number is out of range: -80
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", true);
      tarArchiveEntry0.setDevMinor(0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(0, tarArchiveEntry0.getDevMinor());
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("wdS", (byte)32, true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMajor((-3987));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Major device number is out of range: -3987
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.setDevMajor(0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("N", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0, tarArchiveEntry0.getDevMajor());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("pDAzv:'=0qj");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDataOffset((-1013L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The offset can not be smaller than 0
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      tarArchiveEntry0.setDataOffset(807L);
      long long0 = tarArchiveEntry0.getDataOffset();
      assertEquals(807L, long0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile((File) null, "");
          Path path0 = mockFile0.toPath();
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(path0);
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
             // org.apache.commons.compress.archivers.tar.TarArchiveEntry.<init>(TarArchiveEntry.java:565)
             // sun.reflect.GeneratedConstructorAccessor77.newInstance(Unknown Source)
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
  public void test064()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("");
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0, "Corrupted TAR archive, sparse entry with negative numbytes");
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
             // sun.reflect.GeneratedConstructorAccessor78.newInstance(Unknown Source)
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
  public void test065()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("MTm-\"|fB;G>Z!(mh", (byte)0, false);
      tarArchiveEntry0.addPaxHeader("uname", "uname");
      assertEquals("uname", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertTrue(tarArchiveEntry0.isPaxGNU1XSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("BH:\u0004;uS8z> ");
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals("BH:\u0004;uS8z> ", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("MTm-\"|fB;G>Z!(mh", (byte)2, false);
      boolean boolean0 = tarArchiveEntry0.isGNULongNameEntry();
      assertEquals("MTm-\"|fB;G>Z!(mh", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals((byte)2, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      boolean boolean0 = tarArchiveEntry0.isGNULongLinkEntry();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("N", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("BM", (byte) (-53));
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertTrue(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-53), tarArchiveEntry0.getLinkFlag());
      assertEquals("BM", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("wg1Pl@E1A_wc80", (byte)0);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertTrue(boolean0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("wg1Pl@E1A_wc80", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("N", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      boolean boolean0 = tarArchiveEntry0.isFIFO();
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("N", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("BH:\u0004;uS8z> ");
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals("BH:\u0004;uS8z> ", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isBlockDevice();
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("k6$U'=E");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      tarArchiveEntry0.fillStarSparseData(hashMap0);
      long long0 = tarArchiveEntry0.getRealSize();
      assertTrue(tarArchiveEntry0.isSparse());
      assertFalse(tarArchiveEntry0.isGNUSparse());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.getFile();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("N", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      tarArchiveEntry0.getDirectoryEntries();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertTrue(tarArchiveEntry0.isPaxGNUSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("qnz", false);
      Object object0 = new Object();
      tarArchiveEntry0.equals(object0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("qnz", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      tarArchiveEntry0.equals((Object) null);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("@", "@");
          MockFile.createTempFile("9-H", "$hX", (File) mockFile0);
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0, "@");
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
             // sun.reflect.GeneratedConstructorAccessor78.newInstance(Unknown Source)
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
  public void test085()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Corrupted TAR archive, sparse entry is invalid");
      MockFile mockFile1 = new MockFile(mockFile0, "Corrupted TAR archive, sparse entry is invalid");
      Path path0 = mockFile1.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" x)", true);
      FileTime fileTime0 = FileTime.fromMillis(1000);
      tarArchiveEntry0.setCreationTime(fileTime0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(" x)", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      tarArchiveEntry0.getExtraPaxHeader("");
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals("@0y/h$`*\"%:Y+CpsX2m/", tarArchiveEntry0.getName());
      assertEquals((byte)13, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(0L, long0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("5u@#{", (byte)66);
      List<TarArchiveStructSparse> list0 = tarArchiveEntry0.getOrderedSparseHeaders();
      tarArchiveEntry0.setSparseHeaders(list0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)66, tarArchiveEntry0.getLinkFlag());
      assertEquals("5u@#{", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      assertEquals(33188, tarArchiveEntry0.getMode());
      
      tarArchiveEntry0.setMode(0);
      assertEquals(0, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.getCreationTime();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("N", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0, int0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, (ZipEncoding) null, true, 0L);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[7];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(hashMap0, byteArray0, (ZipEncoding) null, true, 0L);
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      long long0 = tarArchiveEntry0.getDataOffset();
      assertEquals((-1L), long0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("!rIgA{{,L]", (byte) (-3));
      tarArchiveEntry0.isExtended();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-3), tarArchiveEntry0.getLinkFlag());
      assertEquals("!rIgA{{,L]", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("k6$U'=E");
      long long0 = tarArchiveEntry0.getLongGroupId();
      assertEquals("k6$U'=E", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(0L, long0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("k6$U'=E");
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals("k6$U'=E", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.isDescendent((TarArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      tarArchiveEntry0.hashCode();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("qnz");
      byte[] byteArray0 = new byte[2];
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
  public void test104()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      tarArchiveEntry0.getSparseHeaders();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";", (byte)101, true);
      tarArchiveEntry0.getLastAccessTime();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(";", tarArchiveEntry0.getName());
      assertEquals((byte)101, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      tarArchiveEntry0.getStatusChangeTime();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("N", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      tarArchiveEntry0.setLastAccessTime((FileTime) null);
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(";", (byte)101, true);
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
  public void test109()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      String string0 = tarArchiveEntry0.getGroupName();
      assertEquals((byte)13, tarArchiveEntry0.getLinkFlag());
      assertEquals("", string0);
      assertEquals("@0y/h$`*\"%:Y+CpsX2m/", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("TarArchiveStructSparse{offset=", true);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals(0, int0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("TarArchiveStructSparse{offset=", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      tarArchiveEntry0.isPaxGNU1XSparse();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals("@0y/h$`*\"%:Y+CpsX2m/", tarArchiveEntry0.getName());
      assertEquals((byte)13, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
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
  public void test113()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("_f>LqZJ8Y2gP,,kC(8", false);
      MockDate mockDate0 = new MockDate(57, 16877, 57, 1000, (-3166), 57);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setModTime((Date) mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      String string0 = tarArchiveEntry0.getLinkName();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", string0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("N", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("TarArchiveStructSparse{offset=", true);
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals((byte)48, byte0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("TarArchiveStructSparse{offset=", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("TarArchiveStructSparse{offset=", true);
      tarArchiveEntry0.clearExtraPaxHeaders();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("TarArchiveStructSparse{offset=", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      tarArchiveEntry0.getPath();
      assertEquals("@0y/h$`*\"%:Y+CpsX2m/", tarArchiveEntry0.getName());
      assertEquals((byte)13, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      tarArchiveEntry0.isCheckSumOK();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)13, tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals("@0y/h$`*\"%:Y+CpsX2m/", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("MTm-\"|fB;G>Z!(mh", (byte)2, false);
      tarArchiveEntry0.setModTime((long) (byte)2);
      assertEquals("MTm-\"|fB;G>Z!(mh", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)2, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals("IFP@C}}4zz,g!Bd9", tarArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IFP@C}}4zz,g!Bd9", (byte)0);
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
  public void test122()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("&");
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
             // sun.reflect.GeneratedConstructorAccessor71.newInstance(Unknown Source)
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
  public void test123()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("pDAzv:'=0qj");
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
  public void test124()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("TarArchiveStructSparse{offset=", true);
      tarArchiveEntry0.setNames("2Us=Hh~xpj 'Kuj+V", "2Us=Hh~xpj 'Kuj+V");
      assertEquals("2Us=Hh~xpj 'Kuj+V", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("pDAzv:'=0qj");
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertFalse(tarArchiveEntry0.isPaxHeader());
      assertEquals("pDAzv:'=0qj", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertFalse(tarArchiveEntry0.isGlobalPaxHeader());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("pDAzv:'=0qj");
      tarArchiveEntry0.setUserId(0);
      assertEquals("pDAzv:'=0qj", tarArchiveEntry0.getName());
      assertEquals(0L, tarArchiveEntry0.getLongUserId());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("{M]\"e3FJ-6$J?h#7uM", false);
      int int0 = tarArchiveEntry0.getMode();
      assertEquals(33188, int0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("{M]\"e3FJ-6$J?h#7uM", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("{M]\"e3FJ-6$J?h#7uM", false);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        tarArchiveEntry0.parseTarHeader(byteArray0, (ZipEncoding) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("pDAzv:'=0qj");
      long long0 = tarArchiveEntry0.getRealSize();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("pDAzv:'=0qj", tarArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(tarArchiveEntry0.isGNUSparse());
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
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
  public void test131()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("N");
      String string0 = tarArchiveEntry0.getUserName();
      assertEquals("N", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", string0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("@0y/h$`*\"%:Y+CpsX2m/", (byte)13);
      boolean boolean0 = tarArchiveEntry0.isStreamContiguous();
      assertEquals("@0y/h$`*\"%:Y+CpsX2m/", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals((byte)13, tarArchiveEntry0.getLinkFlag());
  }
}
