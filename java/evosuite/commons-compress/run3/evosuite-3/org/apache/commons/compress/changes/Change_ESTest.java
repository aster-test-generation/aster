
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
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.changes.Change;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Change_ESTest extends Change_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("GROUP_EXEC");
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      boolean boolean0 = change0.isReplaceMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("archiveEntry", (Change.ChangeType) null);
      change0.getType();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      PipedInputStream pipedInputStream0 = new PipedInputStream(608);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      String string0 = change0.getTargetFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.MOVE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("fileName", change_ChangeType0);
      InputStream inputStream0 = change0.getInputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("GROUP_EXEC");
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
      jarArchiveEntry0.setSize(33639248L);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, true);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertEquals(0, ZipArchiveEntry.PLATFORM_FAT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("DELETE");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, false);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertEquals(0L, jarArchiveEntry1.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      Change<JarArchiveEntry> change0 = null;
      try {
        change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, (InputStream) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // inputStream
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.MOVE;
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
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("-7&%?");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, false);
      boolean boolean0 = change0.isReplaceMode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("KCg[E^5'TX/EDli%]X9", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("KCg[E^5'TX/EDli%]X9", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("-7&%?");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pipedInputStream0, false);
      InputStream inputStream0 = change0.getInputStream();
      assertEquals(0, inputStream0.available());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("KCg[E^5'TX/EDli%]X9", change_ChangeType0);
      JarArchiveEntry jarArchiveEntry0 = change0.getEntry();
      assertNull(jarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("KCg[E^5'TX/EDli%]X9", true);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 33188);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      Change<TarArchiveEntry> change0 = new Change<TarArchiveEntry>(tarArchiveEntry0, dataInputStream0, true);
      TarArchiveEntry tarArchiveEntry1 = change0.getEntry();
      assertEquals(0, tarArchiveEntry1.getDevMajor());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("KCg[E^5'TX/EDli%]X9", change_ChangeType0);
      Change.ChangeType change_ChangeType1 = change0.getType();
      assertSame(change_ChangeType1, change_ChangeType0);
  }
}
