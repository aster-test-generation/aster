
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
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Stack;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.changes.Change;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Change_ESTest extends Change_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-119), 2094);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>(cpioArchiveEntry0, pushbackInputStream0, false);
      boolean boolean0 = change0.isReplaceMode();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Change<SevenZArchiveEntry> change0 = new Change<SevenZArchiveEntry>("(2aq<", (Change.ChangeType) null);
      change0.getType();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      Stack<MockFileInputStream> stack0 = new Stack<MockFileInputStream>();
      Enumeration<MockFileInputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1);
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>(cpioArchiveEntry0, pushbackInputStream0, true);
      String string0 = change0.getTargetFileName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("broken archive, entry with negative size", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("broken archive, entry with negative size", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-119), 2094);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>(cpioArchiveEntry0, pushbackInputStream0, false);
      InputStream inputStream0 = change0.getInputStream();
      assertSame(pushbackInputStream0, inputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>("", change_ChangeType0);
      JarArchiveEntry jarArchiveEntry0 = change0.getEntry();
      assertNull(jarArchiveEntry0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("(2aq<", 652L);
      Stack<MockFileInputStream> stack0 = new Stack<MockFileInputStream>();
      Enumeration<MockFileInputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>(cpioArchiveEntry0, pushbackInputStream0, true);
      CpioArchiveEntry cpioArchiveEntry1 = change0.getEntry();
      assertEquals((short)1, cpioArchiveEntry1.getFormat());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack<MockFileInputStream> stack0 = new Stack<MockFileInputStream>();
      Enumeration<MockFileInputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      Change<JarArchiveEntry> change0 = new Change<JarArchiveEntry>(jarArchiveEntry0, pushbackInputStream0, true);
      JarArchiveEntry jarArchiveEntry1 = change0.getEntry();
      assertEquals((-1L), jarArchiveEntry1.getCrc());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE_DIR;
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
  public void test10()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE;
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>("", change_ChangeType0);
      boolean boolean0 = change0.isReplaceMode();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE;
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>("", change_ChangeType0);
      String string0 = change0.getTargetFileName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Change.ChangeType change_ChangeType0 = Change.ChangeType.DELETE;
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>("", change_ChangeType0);
      InputStream inputStream0 = change0.getInputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("(2aq<");
      Stack<MockFileInputStream> stack0 = new Stack<MockFileInputStream>();
      Enumeration<MockFileInputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>(cpioArchiveEntry0, pushbackInputStream0, false);
      CpioArchiveEntry cpioArchiveEntry1 = change0.getEntry();
      assertEquals(4, cpioArchiveEntry1.getAlignmentBoundary());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("(2aq<");
      Stack<MockFileInputStream> stack0 = new Stack<MockFileInputStream>();
      Enumeration<MockFileInputStream> enumeration0 = stack0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      Change<CpioArchiveEntry> change0 = new Change<CpioArchiveEntry>(cpioArchiveEntry0, pushbackInputStream0, false);
      change0.getType();
  }
}
