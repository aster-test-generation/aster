
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


package org.apache.commons.compress.changes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.changes.Change;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Change_ESTest extends Change_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("FAITK]_q0<8T@Ct");
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 452, (byte) (-49));
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, byteArrayInputStream0, false);
      boolean boolean0 = change0.isReplaceMode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("DELETE", (Change.ChangeType) null);
      change0.getType();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("LocalFileHeader [archiverVersionNumber=");
      PipedInputStream pipedInputStream0 = new PipedInputStream(1093);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, false);
      String string0 = change0.getTargetFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("n%j!)_#h~-o:<OI=&&");
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (-699));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 263);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, bufferedInputStream0, false);
      InputStream inputStream0 = change0.getInputStream();
      assertSame(inputStream0, bufferedInputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("DELETE", (Change.ChangeType) null);
      JarArchiveEntry jarArchiveEntry0 = change0.getEntry();
      assertNull(jarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry(":FAITK]_q0<8T@Ct");
      byte[] byteArray0 = new byte[5];
      jarArchiveEntry0.setSize(0L);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-14), (byte)0);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, byteArrayInputStream0, false);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry(":FAITK]_q0<8T@Ct");
      byte[] byteArray0 = new byte[5];
      jarArchiveEntry0.setSize(4143L);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-14), (byte)0);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, byteArrayInputStream0, false);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertEquals((-1L), jarArchiveEntry1.getDataOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.ADD;
      Change<JarArchiveEntry> change0 = null;
      try {
        change0 = new Change<JarArchiveEntry>((String) null, change_ChangeType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fileName
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.MOVE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("DELETE", change_ChangeType0);
      boolean boolean0 = change0.isReplaceMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.MOVE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("DELETE", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("DELETE", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("MOVE", change_ChangeType0);
      InputStream inputStream0 = change0.getInputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry(":FAITK]_q0<8T@Ct");
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-14), (byte)0);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, byteArrayInputStream0, false);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertSame(jarArchiveEntry0, jarArchiveEntry1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Change<JarArchiveEntry> change0 = null;
      try {
        change0 = new Change<JarArchiveEntry>((JarArchiveEntry) null, (InputStream) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // archiveEntry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.MOVE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("DELETE", change_ChangeType0);
      Change.ChangeType change_ChangeType1 = change0.getType();
      assertSame(change_ChangeType1, change_ChangeType0);
  }
}
