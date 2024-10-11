
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
import java.io.PrintStream;
import java.net.URI;
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
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveOutputStream_ESTest extends ArArchiveOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("64!fA_!EH#@@%#", "User id too long");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.setLongFileMode((-396));
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 1458L, 1, (-396), 3385, 3385);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile("I", "I");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, " != ");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.write(561);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Length does not match entry (0 != 1
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("6{W4QBub", true);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.resolve(uRI0, "");
      MockFile mockFile0 = new MockFile(uRI1);
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOption0;
      linkOptionArray0[5] = linkOptionArray0[1];
      linkOptionArray0[6] = linkOptionArray0[1];
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry(path0, "6{W4QBub", linkOptionArray0);
      assertFalse(arArchiveEntry0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("P^_*M\"dp*d1");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PrintStream printStream0 = mockPrintStream0.append('h');
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(printStream0);
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "P^_*M\"dp*d1");
      assertEquals(1L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      System.setCurrentTimeMillis((-1186L));
      MockPrintStream mockPrintStream0 = new MockPrintStream("Group id too long");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      File file0 = MockFile.createTempFile("Group id too long", "", (File) null);
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry(file0, "org.apache.commons.compress.archivers.zip.ZipShort");
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte) (-19), (int) (byte)50);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(objectOutputStream0);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte) (-70), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2542);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 2542);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(bufferedOutputStream0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.write(byteArray0, 70, (int) (byte)120);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("*,:6", "*Jw_ipv");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      byte[] byteArray0 = new byte[2];
      try { 
        arArchiveOutputStream0.write(byteArray0, (int) (byte)96, (int) (byte) (-4));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile(",W&oej");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, ",W&oej");
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("`<lR+A6E45yse>&", "`<lR+A6E45yse>&");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[8];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOption0;
      linkOptionArray0[5] = linkOptionArray0[4];
      linkOptionArray0[6] = linkOptionArray0[3];
      linkOptionArray0[7] = linkOptionArray0[4];
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "`<lR+A6E45yse>&", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("b1[~Zi");
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      try { 
        arArchiveOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("cs/ZpM#Wpe<7c4Rp5~", false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 23);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(bufferedOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Corrupted TAR archive. Dev-Major is negative", 0, 0, 1700, 1700, 1033L);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // File name too long, > 16 chars: Corrupted TAR archive. Dev-Major is negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("%3HlDK,4MB");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[9];
      arArchiveOutputStream0.write(byteArray0, 0, 0);
      assertEquals(0L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile(" != ");
      arArchiveOutputStream0.setLongFileMode(1);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(68, byteArrayOutputStream0.size());
      assertEquals("!<arch>\n                0           0     0     100644  0         `\n", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile(" != ");
      arArchiveOutputStream0.setLongFileMode(1);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "USFsn @v3.?0Dz,g");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(76L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile(" != ");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, " != ");
      arArchiveOutputStream0.setLongFileMode(179);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(60, arArchiveOutputStream0.getCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile(" != ");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, " != ");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.closeArchiveEntry();
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(120L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(" != ", 1393L, 0, 1148, 0, (-3936L));
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      try { 
        arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Length does not match entry (1393 != 0
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(objectOutputStream0);
      MockFile mockFile0 = new MockFile("xH\u0007d-p", "Filemode too long");
      arArchiveOutputStream0.close();
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "xH\u0007d-p");
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
  public void test22()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
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
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(256);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile("l<\"rmeu%*V~q0");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "l<\"rmeu%*V~q0");
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
  public void test24()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile(" != ");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "USFsn @v3.?0Dz,g");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(60L, arArchiveOutputStream0.getBytesWritten());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream((OutputStream) null);
      MockFile mockFile0 = new MockFile("");
      arArchiveOutputStream0.finish();
      Path path0 = mockFile0.toPath();
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, "Z[YD~\"jLCn@", (LinkOption[]) null);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile(" != ");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      // Undeclared exception!
      try { 
        arArchiveOutputStream0.createArchiveEntry(path0, ";YN9%]l1P2R`R;]", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("R(z 5=(");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      MockFile mockFile0 = new MockFile("R(z 5=(");
      arArchiveOutputStream0.close();
      try { 
        arArchiveOutputStream0.createArchiveEntry((File) mockFile0, "`\n");
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("%3HlDK,4MB");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("}O%B-y!", (byte)53);
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
  public void test29()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("%3HlDK,4MB");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockPrintStream0);
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Group id too long");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.finish();
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Group id too long");
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(mockFileOutputStream0);
      arArchiveOutputStream0.finish();
      arArchiveOutputStream0.close();
      assertEquals(1, ArArchiveOutputStream.LONGFILE_BSD);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ArArchiveOutputStream arArchiveOutputStream0 = new ArArchiveOutputStream(byteArrayOutputStream0);
      MockFile mockFile0 = new MockFile(" != ");
      ArArchiveEntry arArchiveEntry0 = arArchiveOutputStream0.createArchiveEntry((File) mockFile0, " != ");
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      arArchiveOutputStream0.putArchiveEntry(arArchiveEntry0);
      assertEquals(128, byteArrayOutputStream0.size());
      assertEquals(120L, arArchiveOutputStream0.getBytesWritten());
  }
}
