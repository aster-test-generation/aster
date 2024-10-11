
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


package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveOutputStream_ESTest extends ArArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr,bUu&3 ~s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.setLongFileMode(1);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "f6fr,bUu&3 ~s=Eo");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(76L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.setLongFileMode((-1328));
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "%mWCj;");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(60L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("~^wD8dqU,i;%7]sI", "User id too long");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      byte[] byteArray0 = new byte[3];
      arArchiveOutputStream0.write(byteArray0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Length does not match entry (0 != 3
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("~^wD8dqU,i;%7]sI", "sser3id.tooclong");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "sser3id.tooclong");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(68L, mockFile0.length());
      assertEquals(60L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("~^wD8dqU,i;%7]sI", "User id too long");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      byte[] byteArray0 = new byte[5];
      arArchiveOutputStream0.write(byteArray0, 63, (int) (byte) (-99));
      arArchiveOutputStream0.closeArchiveEntry();
      assertEquals((-39), arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(" doesn't fit into ");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(objectOutputStream0);
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOption0;
      linkOptionArray0[4] = linkOption0;
      linkOptionArray0[5] = linkOption0;
      linkOptionArray0[6] = linkOptionArray0[2];
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry(path0, (String) null, linkOptionArray0);
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream(" ");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("FIFO", "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "FIFO");
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      System.setCurrentTimeMillis((-4570L));
      File file0 = MockFile.createTempFile("f.kPaS.#", "f.kPaS.#");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry(file0, "resize");
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (-1), 8);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(6);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, 6, (int) (byte)79);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[8];
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte)0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.putArchiveEntry((ArArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("TAPE", "TAPE");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOption0;
      linkOptionArray0[4] = linkOption0;
      linkOptionArray0[5] = linkOptionArray0[1];
      linkOptionArray0[6] = linkOptionArray0[5];
      linkOptionArray0[7] = linkOptionArray0[0];
      linkOptionArray0[8] = linkOptionArray0[0];
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "mWXJpCMp:6d7M|j~", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(77);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry((File) null, "Error parsing extra fields for entry: ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "%mWCj;");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // This archive contains unclosed entries.
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.setLongFileMode(1);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "%mWCj;");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(60, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.setLongFileMode(1);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "/Users/mkim754/IdeaProjects/aster-benchmark/commons-compress-1.26.1/f6fr(,bc&X3 ~7s=Eo/f6fr(,bc&X3 ~7s=Eo0resize");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(172, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("nUs:s;kLAq4sub}Jq", (byte)0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // File name too long, > 16 chars: nUs:s;kLAq4sub}Jq
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "%mWCj;");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(120L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "%mWCj;");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      ArArchiveEntry arArchiveEntry1 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "`\n");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry1);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Length does not match entry (68 != 0
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("GROUP_EXEC", "GROUP_EXEC");
      MockPrintStream mockPrintStream0 = new MockPrintStream("Filemode too long");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.finish();
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, " ");
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.finish();
      try { 
        arArchiveOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // This archive has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "/Users/mkim754/IdeaProjects/aster-benchmark/commons-compress-1.26.1/f6fr(,bc&X3 ~7s=Eo/f6fr(,bc&X3 ~7s=Eo0f6fr(,bc&X3 ~7s=Eo");
      arArchiveOutputStream0.setLongFileMode(1982292598);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(168L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("o#>B-{^MvIu[C");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.finish();
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      MockFile mockFile0 = new MockFile("is*_?x<9%:Km]B", "No current entry to close");
      Path path0 = mockFile0.toPath();
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "This archive has already been finished", linkOptionArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("~^wD8dqU,i;%7]sI", "sser3id.tooclong");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "`\n", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("] for UniCode path extra data.");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      arArchiveOutputStream0.close();
      File file0 = MockFile.createTempFile("] for UniCode path extra data.", "] for UniCode path extra data.");
      try { 
        arArchiveOutputStream0.createArchiveEntry(file0, "&}NS;;Mi");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("~^wD8dqU,i;%7]sI", "User id too long");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      byte[] byteArray0 = new byte[5];
      arArchiveOutputStream0.write(byteArray0, 63, (int) (byte)125);
      arArchiveOutputStream0.closeArchiveEntry();
      assertEquals(185L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("~^wD8dqU,i;%7]sI", "User id too long");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
      try { 
        arArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // No current entry to close
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, " EWe|");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
      arArchiveOutputStream0.close();
      try { 
        arArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream has already been finished
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      try { 
        arArchiveOutputStream0.closeArchiveEntry();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // No current entry to close
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("o#>B-{^MvIu[C");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.finish();
      arArchiveOutputStream0.close();
      assertEquals(0, ArArchiveOutputStream.LONGFILE_ERROR);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f6fr(,bc&X3 ~7s=Eo");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "%mWCj;");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // This archive contains unclosed entries.
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }
}
