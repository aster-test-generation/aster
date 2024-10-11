
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
import java.net.URI;
import java.nio.file.InvalidPathException;
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
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveEntry_ESTest extends TarArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Wmwce(9~Fuz", (byte) (-31));
      tarArchiveEntry0.setSize(0L);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("Wmwce(9~Fuz", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0L, tarArchiveEntry0.getRealSize());
      assertEquals((byte) (-31), tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("|+UF^");
      tarArchiveEntry0.setDevMajor(0);
      assertEquals(0, tarArchiveEntry0.getDevMajor());
      assertEquals("|+UF^", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("'", true);
      tarArchiveEntry0.setDataOffset(0L);
      assertEquals(0L, tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/RUSBo>;E/u", (byte)88, true);
      boolean boolean0 = tarArchiveEntry0.isSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)88, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals("/RUSBo>;E/u", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)70, true);
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals((byte)70, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/RUSBo>;E/u", (byte)88, true);
      tarArchiveEntry0.isGNULongNameEntry();
      assertEquals("/RUSBo>;E/u", tarArchiveEntry0.getName());
      assertEquals((byte)88, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("5F+mvX(aHjwWQgbI", (byte)122, true);
      boolean boolean0 = tarArchiveEntry0.isGNULongLinkEntry();
      assertEquals("5F+mvX(aHjwWQgbI", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)122, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/RUSBo>;E/u", (byte)88, true);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals("/RUSBo>;E/u", tarArchiveEntry0.getName());
      assertTrue(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertTrue(tarArchiveEntry0.isPaxHeader());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/Qijb=s{cSck)", (byte)55);
      boolean boolean0 = tarArchiveEntry0.isFIFO();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)55, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals("Qijb=s{cSck)", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)70, true);
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)70, tarArchiveEntry0.getLinkFlag());
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      FileTime fileTime0 = FileTime.from((long) 1000, timeUnit0);
      tarArchiveEntry0.setModTime(fileTime0);
      assertEquals(" qPKHr`_e3", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("");
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
             // sun.reflect.GeneratedConstructorAccessor73.newInstance(Unknown Source)
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
  public void test012()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("uname", false);
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      tarArchiveEntry0.isPaxGNUSparse();
      assertFalse(tarArchiveEntry0.isLink());
      assertEquals("uname", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("|D4EE:6kh9!050Jyp[");
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      tarArchiveEntry0.isPaxGNU1XSparse();
      assertTrue(tarArchiveEntry0.isPaxGNUSparse());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      TarArchiveEntry tarArchiveEntry1 = new TarArchiveEntry("$AS", (byte) (-84), false);
      boolean boolean0 = tarArchiveEntry0.isDescendent(tarArchiveEntry1);
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry1.getMode());
      assertEquals((byte) (-84), tarArchiveEntry1.getLinkFlag());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)70, true);
      tarArchiveEntry0.setUserId((int) (byte)70);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals(70, int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("VHhE')ZMnn|\"Wv?yh");
      String string0 = tarArchiveEntry0.getName();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("VHhE')ZMnn|\"Wv?yh", string0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.setUserId((-1547));
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals((-1547L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      tarArchiveEntry0.setNames("", "ustar\u0000");
      tarArchiveEntry0.getGroupName();
      assertEquals("ustar\u0000", tarArchiveEntry0.getGroupName());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      tarArchiveEntry0.setGroupId(331L);
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals(331L, tarArchiveEntry0.getLongGroupId());
      assertEquals(331, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      assertEquals(0, tarArchiveEntry0.getDevMinor());
      
      tarArchiveEntry0.setDevMinor(3);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r/D[m  I\"tU+s$A-");
      tarArchiveEntry0.setDevMajor(2737);
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals(2737, int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("linkpath", false);
      byte[] byteArray0 = new byte[9];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        tarArchiveEntry0.writeEntryHeader(byteArray0, zipEncoding0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Zip slip '%s' + '%s' -> '%s'");
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
  public void test024()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)122);
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
  public void test025()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
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
  public void test026()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Zip slip '%s' + '%s' -> '%s'");
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillStarSparseData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.fillGNUSparse1xData((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
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
  public void test029()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" will not fit in octal number buffer of length ", (byte) (-12));
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
  public void test030()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      byte[] byteArray0 = new byte[4];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(hashMap0, byteArray0, (ZipEncoding) null, true);
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
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[1];
      linkOptionArray0[4] = linkOptionArray0[2];
      linkOptionArray0[5] = linkOptionArray0[0];
      linkOptionArray0[6] = linkOption0;
      linkOptionArray0[7] = linkOption0;
      linkOptionArray0[8] = linkOption0;
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte)77, true);
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
        tarArchiveEntry0 = new TarArchiveEntry((String) null, (byte)13);
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
  public void test036()  throws Throwable  {
      File file0 = MockFile.createTempFile("tar\u0000", "tar\u0000", (File) null);
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(file0, "broken archive, entry with negative size");
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((File) null, "");
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      boolean boolean0 = tarArchiveEntry0.isPaxHeader();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000");
      boolean boolean0 = tarArchiveEntry0.isOldGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(" \u0000", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertFalse(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Qijb=s{cSck)");
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals("Qijb=s{cSck)", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("|D4EE:6kh9!050Jyp[");
      Map<String, String> map0 = tarArchiveEntry0.getExtraPaxHeaders();
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      boolean boolean0 = tarArchiveEntry0.isGNUSparse();
      assertTrue(tarArchiveEntry0.isPaxGNUSparse());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/", (byte)118);
      boolean boolean0 = tarArchiveEntry0.isGlobalPaxHeader();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)118, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("PZ%[ma%,JtljNX$8[T3", (byte) (-37), false);
      tarArchiveEntry0.isPaxGNUSparse();
      assertEquals((byte) (-37), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("PZ%[ma%,JtljNX$8[T3", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("uname", false);
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
  public void test046()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3/", (byte)55);
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" \u0000", (byte)37);
      FileTime fileTime0 = FileTime.fromMillis((-1064L));
      tarArchiveEntry0.setLastModifiedTime(fileTime0);
      assertEquals(" \u0000", tarArchiveEntry0.getName());
      assertEquals((byte)37, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      tarArchiveEntry0.setUserName(" qPKHr`_e3");
      tarArchiveEntry0.getUserName();
      assertEquals(" qPKHr`_e3", tarArchiveEntry0.getUserName());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)19);
      tarArchiveEntry0.setGroupName("");
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getGroupName());
      assertEquals((byte)19, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/RUSBo>;E/u", (byte)88, true);
      tarArchiveEntry0.setUserId(8L);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals(8, tarArchiveEntry0.getUserId());
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      String string0 = tarArchiveEntry0.getName();
      assertEquals("", string0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Qijb=s{cSck)");
      tarArchiveEntry0.setGroupId(1251);
      assertEquals(1251L, tarArchiveEntry0.getLongGroupId());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("X$Vuz5r+gx_Z1_L:gZe", false);
      tarArchiveEntry0.isStarSparse();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("X$Vuz5r+gx_Z1_L:gZe", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.updateEntryFromPaxHeaders(map0);
      assertEquals("", tarArchiveEntry0.getLinkName());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("GNU.sparse.offset", (byte)0);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setSize((-579L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size is out of range: -579
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/RUSBo>;E/u", (byte)88, true);
      tarArchiveEntry0.setSize((byte)88);
      assertEquals(88L, tarArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("IY1;ty+Xb1pf7", (byte) (-56));
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMinor((byte) (-56));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minor device number is out of range: -56
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("PZ%[ma%,JtljNX$8[T3", (byte) (-37), false);
      tarArchiveEntry0.setDevMinor(0);
      assertEquals(0, tarArchiveEntry0.getDevMinor());
      assertEquals((byte) (-37), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("PZ%[ma%,JtljNX$8[T3", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("MQQ0]f,=vT>gB0", (byte) (-37), false);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDevMajor((byte) (-37));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Major device number is out of range: -37
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("w^k;vJtii[ZMog+8Y", false);
      // Undeclared exception!
      try { 
        tarArchiveEntry0.setDataOffset((-3345L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The offset can not be smaller than 0
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.setDataOffset((byte)8);
      assertEquals(8L, tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
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
             // sun.reflect.GeneratedConstructorAccessor67.newInstance(Unknown Source)
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
  public void test063()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("", "");
          TarArchiveEntry tarArchiveEntry0 = null;
          try {
            tarArchiveEntry0 = new TarArchiveEntry(mockFile0, "unix");
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
             // sun.reflect.GeneratedConstructorAccessor75.newInstance(Unknown Source)
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
  public void test064()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Unreadable TAR archive. Offset and numbytes for sparse block in ");
      boolean boolean0 = tarArchiveEntry0.isSymbolicLink();
      assertFalse(boolean0);
      assertEquals("Unreadable TAR archive. Offset and numbytes for sparse block in ", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      boolean boolean0 = tarArchiveEntry0.isLink();
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      boolean boolean0 = tarArchiveEntry0.isGNULongNameEntry();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      boolean boolean0 = tarArchiveEntry0.isGNULongLinkEntry();
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertTrue(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("=sXx 7b(kdShY7", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      boolean boolean0 = tarArchiveEntry0.isFIFO();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("/RUSBo>;E/u", (byte)88, true);
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertTrue(tarArchiveEntry0.isPaxHeader());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("/RUSBo>;E/u", tarArchiveEntry0.getName());
      assertEquals((byte)88, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("");
      boolean boolean0 = tarArchiveEntry0.isDirectory();
      assertFalse(tarArchiveEntry0.isLink());
      assertEquals("", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertFalse(tarArchiveEntry0.isPaxHeader());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      boolean boolean0 = tarArchiveEntry0.isCharacterDevice();
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Qijb=s{cSck)");
      boolean boolean0 = tarArchiveEntry0.isBlockDevice();
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("Qijb=s{cSck)", tarArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Qijb=s{cSck)");
      long long0 = tarArchiveEntry0.getRealSize();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("Qijb=s{cSck)", tarArchiveEntry0.getName());
      assertFalse(tarArchiveEntry0.isSparse());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.archivers.zip.NioZipEncoding", (byte)0, false);
      assertFalse(tarArchiveEntry0.isGNUSparse());
      
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      tarArchiveEntry0.fillGNUSparse1xData(map0);
      long long0 = tarArchiveEntry0.getRealSize();
      assertTrue(tarArchiveEntry0.isGNUSparse());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.getOrderedSparseHeaders();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u//", (byte) (-106), false);
      tarArchiveEntry0.getFile();
      assertEquals("RUSBo>;E/u//", tarArchiveEntry0.getName());
      assertEquals((byte) (-106), tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.getDirectoryEntries();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Qijb=s{cSck)");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      tarArchiveEntry0.fillStarSparseData(hashMap0);
      long long0 = tarArchiveEntry0.getRealSize();
      assertTrue(tarArchiveEntry0.isStarSparse());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("h6@AO;dlF67", (byte) (-36));
      Object object0 = new Object();
      tarArchiveEntry0.equals(object0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte) (-36), tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("h6@AO;dlF67", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u//", (byte) (-106), false);
      tarArchiveEntry0.equals((Object) null);
      assertEquals("RUSBo>;E/u//", tarArchiveEntry0.getName());
      assertEquals((byte) (-106), tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MockFile mockFile0 = new MockFile("$c&pUPQC=z'Ac", "ustar ");
      Path path0 = mockFile0.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0, "ustar ", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("w");
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
             // sun.reflect.GeneratedConstructorAccessor67.newInstance(Unknown Source)
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
  public void test084()  throws Throwable  {
      MockFile mockFile0 = new MockFile("windowsmac os x");
      MockFile mockFile1 = new MockFile(mockFile0, "windowsmac os x");
      Path path0 = mockFile1.toPath();
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("org.apache.commons.compress.archivers.zip.NioZipEncoding", (byte)0, false);
      FileTime fileTime0 = FileTime.fromMillis(31);
      tarArchiveEntry0.setCreationTime(fileTime0);
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("org.apache.commons.compress.archivers.zip.NioZipEncoding", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("|D4EE:6kh9!050Jyp[");
      tarArchiveEntry0.getExtraPaxHeader("|D4EE:6kh9!050Jyp[");
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("|D4EE:6kh9!050Jyp[", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      long long0 = tarArchiveEntry0.getLongUserId();
      assertEquals(0L, long0);
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.setSparseHeaders((List<TarArchiveStructSparse>) null);
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      tarArchiveEntry0.setMode(512);
      assertEquals(512, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u//", (byte) (-106), false);
      tarArchiveEntry0.getCreationTime();
      assertEquals((byte) (-106), tarArchiveEntry0.getLinkFlag());
      assertEquals("RUSBo>;E/u//", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(0, int0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, zipEncoding0, false, 323L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ZipEncoding zipEncoding0 = mock(ZipEncoding.class, new ViolatedAssumptionAnswer());
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry((Map<String, String>) null, byteArray0, zipEncoding0, false, (byte)13);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
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
  public void test095()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u//", (byte) (-106), false);
      long long0 = tarArchiveEntry0.getDataOffset();
      assertEquals((byte) (-106), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), long0);
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals("RUSBo>;E/u//", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" bytes, read ", true);
      tarArchiveEntry0.isExtended();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" bytes, read ", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("|D4EE:6kh9!050Jyp[");
      long long0 = tarArchiveEntry0.getLongGroupId();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("|D4EE:6kh9!050Jyp[", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(0L, long0);
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      int int0 = tarArchiveEntry0.getGroupId();
      assertEquals(0, int0);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals(" qPKHr`_e3", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
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
  public void test100()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      boolean boolean0 = tarArchiveEntry0.isDescendent(tarArchiveEntry0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("=sXx 7b(kdShY7", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)0);
      tarArchiveEntry0.hashCode();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("", tarArchiveEntry0.getName());
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("VHhE')ZMnn|\"Wv?yh");
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
  public void test103()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Qijb=s{cSck)");
      tarArchiveEntry0.setIds((-145), 1251);
      int int0 = tarArchiveEntry0.getUserId();
      assertEquals((-145L), tarArchiveEntry0.getLongUserId());
      assertEquals((-145), int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.getSparseHeaders();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      tarArchiveEntry0.getLastAccessTime();
      assertEquals("=sXx 7b(kdShY7", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u", (byte)0);
      tarArchiveEntry0.getStatusChangeTime();
      assertEquals((byte)0, tarArchiveEntry0.getLinkFlag());
      assertEquals("RUSBo>;E/u", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      tarArchiveEntry0.setLastAccessTime((FileTime) null);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("=sXx 7b(kdShY7", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u", (byte)0);
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
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Qijb=s{cSck)");
      FileTime fileTime0 = tarArchiveEntry0.getLastModifiedTime();
      tarArchiveEntry0.setStatusChangeTime(fileTime0);
      assertEquals("Qijb=s{cSck)", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      String string0 = tarArchiveEntry0.getGroupName();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals("", string0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      int int0 = tarArchiveEntry0.getDevMinor();
      assertEquals(0, int0);
      assertEquals("=sXx 7b(kdShY7", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("|D4EE:6kh9!050Jyp[");
      tarArchiveEntry0.isPaxGNU1XSparse();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals("|D4EE:6kh9!050Jyp[", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0, (ZipEncoding) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.tar.TarUtils
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("qU-ht");
      MockDate mockDate0 = new MockDate();
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
  public void test115()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      tarArchiveEntry0.addPaxHeader("Z:U[A/QOB", (String) null);
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals(" qPKHr`_e3", tarArchiveEntry0.getName());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      String string0 = tarArchiveEntry0.getLinkName();
      assertEquals("", string0);
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)19);
      byte byte0 = tarArchiveEntry0.getLinkFlag();
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((byte)19, byte0);
      assertEquals("", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      tarArchiveEntry0.clearExtraPaxHeaders();
      assertEquals(" qPKHr`_e3", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u//", (byte) (-106), false);
      tarArchiveEntry0.getPath();
      assertEquals("RUSBo>;E/u//", tarArchiveEntry0.getName());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((byte) (-106), tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("VHhE')ZMnn|\"Wv?yh");
      tarArchiveEntry0.isCheckSumOK();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("VHhE')ZMnn|\"Wv?yh", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.setModTime((long) 8);
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("Z4{&WF/", (byte) (-12));
      int int0 = tarArchiveEntry0.getDevMajor();
      assertEquals((byte) (-12), tarArchiveEntry0.getLinkFlag());
      assertEquals("Z4{&WF/", tarArchiveEntry0.getName());
      assertEquals(0, int0);
      assertEquals(16877, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("", (byte)8, false);
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
  public void test124()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          MockFile mockFile0 = new MockFile("w");
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
             // sun.reflect.GeneratedConstructorAccessor67.newInstance(Unknown Source)
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
  public void test125()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.setName("3B8a0w#qF");
      assertEquals("3B8a0w#qF", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      tarArchiveEntry0.setLinkName("IfHlxmvXRzE-Zrk)x@'");
      tarArchiveEntry0.getLinkName();
      assertEquals("IfHlxmvXRzE-Zrk)x@'", tarArchiveEntry0.getLinkName());
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("r`\"sPB", (byte)8, true);
      boolean boolean0 = tarArchiveEntry0.isFile();
      assertEquals("r`\"sPB", tarArchiveEntry0.getName());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertTrue(boolean0);
      assertEquals((byte)8, tarArchiveEntry0.getLinkFlag());
      assertEquals(33188, tarArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("=sXx 7b(kdShY7", false);
      int int0 = tarArchiveEntry0.getMode();
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("=sXx 7b(kdShY7", tarArchiveEntry0.getName());
      assertEquals(33188, int0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("tar\u0000", false);
      byte[] byteArray0 = new byte[2];
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
  public void test130()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u//", (byte) (-106), false);
      long long0 = tarArchiveEntry0.getSize();
      assertEquals(0L, long0);
      assertEquals((byte) (-106), tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
      assertEquals("RUSBo>;E/u//", tarArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
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
  public void test132()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry(" qPKHr`_e3");
      String string0 = tarArchiveEntry0.getUserName();
      assertEquals(" qPKHr`_e3", tarArchiveEntry0.getName());
      assertEquals(33188, tarArchiveEntry0.getMode());
      assertEquals("", string0);
      assertEquals((byte)48, tarArchiveEntry0.getLinkFlag());
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("RUSBo>;E/u//", (byte) (-106), false);
      boolean boolean0 = tarArchiveEntry0.isStreamContiguous();
      assertEquals("RUSBo>;E/u//", tarArchiveEntry0.getName());
      assertEquals((byte) (-106), tarArchiveEntry0.getLinkFlag());
      assertEquals(16877, tarArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals((-1L), tarArchiveEntry0.getDataOffset());
  }
}
