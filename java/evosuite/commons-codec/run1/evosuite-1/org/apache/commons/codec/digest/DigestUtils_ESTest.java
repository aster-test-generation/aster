
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.util.Enumeration;
import org.apache.commons.codec.digest.DigestUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DigestUtils_ESTest extends DigestUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      File file0 = MockFile.createTempFile("09277ffe3416bcca1ba909ae6e442bd8", "MD5");
      MessageDigest messageDigest0 = DigestUtils.updateDigest((MessageDigest) null, file0);
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      MockFile mockFile0 = new MockFile("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade", "org.apache.commons.codec.DecoderException");
      File file0 = MockFile.createTempFile("b59f64140e4ed9be3dbae1e628d5e8a1c6011adc08ffae945b7a4c12e4bf28ccd4d9292b63f88de59bcb8fc7488e881aeb02cbae10fad76881bc17e43ef1ef24", "6ade47c72d8f0e0042a9df2357de5fa0", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      String string0 = DigestUtils.sha512_256Hex((InputStream) mockFileInputStream0);
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha512_256((InputStream) byteArrayInputStream0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.sha512Hex((InputStream) sequenceInputStream0);
      assertEquals("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      MockFile mockFile0 = new MockFile("+:");
      File file0 = MockFile.createTempFile("Q8aItwh", "+:", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = DigestUtils.sha512((InputStream) mockFileInputStream0);
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.sha384Hex(byteArray0);
      assertEquals("cd6bd1dcfebeffe9bb9ee705724f0312b5972417bc69473b520598d6d3ab910cebbdff8bdcc9cfbbe6ae543d2657b2ab", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_256("0=c;o,d*<{");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      String string0 = DigestUtils.sha384Hex((InputStream) sequenceInputStream0);
      assertEquals("38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      sequenceInputStream0.close();
      String string0 = DigestUtils.sha256Hex((InputStream) sequenceInputStream0);
      assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = DigestUtils.sha1((InputStream) sequenceInputStream0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      String string0 = DigestUtils.md5Hex("Rd");
      assertEquals("190ce4680f78263d5d7af1897e28dd22", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1803, 213);
      byte[] byteArray1 = DigestUtils.md5((InputStream) byteArrayInputStream0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.md2Hex((InputStream) byteArrayInputStream0);
      assertEquals("070e302f491955b59d83829950299cef", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = DigestUtils.md2(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = DigestUtils.md2((InputStream) sequenceInputStream0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MessageDigest messageDigest0 = digestUtils0.getMessageDigest();
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("D2eV-yuPlNs5'$q6(T", (MessageDigest) null);
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("SHA-1");
      assertEquals("SHA-1 Message Digest from SUN, <initialized>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      String string0 = digestUtils0.digestAsHex("]");
      assertEquals("0fbd1776e1ad22c59a7080d35c7fd4db", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      MockFile mockFile0 = new MockFile("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade", "org.apache.commons.codec.DecoderException");
      File file0 = MockFile.createTempFile("b59f64140e4ed9be3dbae1e628d5e8a1c6011adc08ffae945b7a4c12e4bf28ccd4d9292b63f88de59bcb8fc7488e881aeb02cbae10fad76881bc17e43ef1ef24", "6ade47c72d8f0e0042a9df2357de5fa0", (File) mockFile0);
      byte[] byteArray0 = DigestUtils.digest(messageDigest0, file0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-512/224");
      byte[] byteArray0 = digestUtils0.digest("SHA-512/224");
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      MockFile mockFile0 = new MockFile(" tr`S");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'APPEND' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, (Path) null, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.updateDigest(messageDigest0, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.shaHex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_224Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_224((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      try { 
        DigestUtils.sha512Hex((InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DigestUtils.sha384Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      File file0 = MockFile.createTempFile("lj}~Orh}tbH+=", "Illegal hexadecimal character ");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      pushbackInputStream0.close();
      try { 
        DigestUtils.md5Hex((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getDigest((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getDigest(")Dsqqdzqi");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: )Dsqqdzqi MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade", "org.apache.commons.codec.DecoderException");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      try { 
        digestUtils0.digestAsHex(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("i/Jt}S![#", "i/Jt}S![#");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'APPEND' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(enumeration0).hasMoreElements();
      doReturn(pipedInputStream0).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        digestUtils0.digestAsHex((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512("rG9|1b");
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digest(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, (ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(884);
      // Undeclared exception!
      try { 
        digestUtils0.digest(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DigestUtils digestUtils0 = null;
      try {
        digestUtils0 = new DigestUtils("SHA3-384");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      File file0 = MockFile.createTempFile("!Pzkd:kT& tT7UlN", "!Pzkd:kT& tT7UlN");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = DigestUtils.sha384((InputStream) mockFileInputStream0);
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(250);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 3);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224((InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      byte[] byteArray0 = new byte[5];
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteArray0);
      assertEquals("SHA-1 Message Digest from SUN, <in progress>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      assertEquals("SHA-384", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      MessageDigest messageDigest1 = DigestUtils.getDigest("]", messageDigest0);
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1024);
      try { 
        DigestUtils.sha512((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_256Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("");
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 13);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384((InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_256("0=c;o,d*<{");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, (InputStream) bufferedInputStream0);
      assertEquals("MD5 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      assertEquals("SHA-512 Message Digest from SUN, <initialized>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha512_224((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.sha1((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_384Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = DigestUtils.sha512_224(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256("[charsetName=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = DigestUtils.sha512(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha1("org.apache.commons.codec.CharEncoding");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha256Digest();
      assertEquals("SHA-256 Message Digest from SUN, <initialized>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 3374);
      byte[] byteArray0 = DigestUtils.sha256((InputStream) bufferedInputStream0);
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha256(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = DigestUtils.sha1(byteArray0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      MockFile mockFile0 = new MockFile("e/^qI<L", "8");
      File file0 = MockFile.createTempFile("Xg#", "Xg#", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      String string0 = DigestUtils.sha1Hex((InputStream) mockFileInputStream0);
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3);
      try { 
        DigestUtils.sha512_256((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha256("!Pzkd:kT& tT7UlN");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_512Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a");
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256((InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512("rG9|1b");
      String string0 = DigestUtils.sha1Hex(byteArray0);
      assertEquals("237d2b2f370417753d6562c99517cc3305fc65ab", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1075);
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteBuffer0);
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        digestUtils0.digest((InputStream) bufferedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, "");
      assertSame(messageDigest1, messageDigest0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = DigestUtils.sha512_256(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade", "org.apache.commons.codec.DecoderException");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        digestUtils0.digest(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getSha3_224Digest();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.md5((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("0/9'Mw@sqI[NY'c");
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("MD2");
      File file0 = MockFile.createTempFile("H'^m!X@'YHeP9|}F", (String) null);
      byte[] byteArray0 = digestUtils0.digest(file0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      assertEquals("SHA-512/224", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      File file0 = MockFile.createTempFile("[charsetName=", "[charsetName=");
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, file0);
      assertEquals("MD2 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade", "org.apache.commons.codec.DecoderException");
      File file0 = MockFile.createTempFile("b59f64140e4ed9be3dbae1e628d5e8a1c6011adc08ffae945b7a4c12e4bf28ccd4d9292b63f88de59bcb8fc7488e881aeb02cbae10fad76881bc17e43ef1ef24", "6ade47c72d8f0e0042a9df2357de5fa0", (File) mockFile0);
      String string0 = digestUtils0.digestAsHex(file0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, byteArray0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      String string0 = DigestUtils.sha256Hex(byteArray0);
      assertEquals("96a296d224f285c67bee93c30f8a309157f0daa35dc5b87e410b78630a09cfc7", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      MockFile mockFile0 = new MockFile("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade", "org.apache.commons.codec.DecoderException");
      try { 
        DigestUtils.digest(messageDigest0, (File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      byte[] byteArray0 = new byte[5];
      String string0 = digestUtils0.digestAsHex(byteArray0);
      assertEquals("fc94cb6cd9283825761d40bde79160fc8a359e8cf670dcb3d544cb0713095ce8", string0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, (RandomAccessFile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = DigestUtils.shaHex(byteArray0);
      assertEquals("5ba93c9db0cff93f52b521d7420e43f6eda2784f", string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex("hj$S9s*y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      String string0 = DigestUtils.shaHex("*.e\"e{-TO");
      assertEquals("b0b1cffbf6c6e077e1910945f175042ac641f41a", string0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex("$x");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.md2Hex(byteArray0);
      assertEquals("d0f0946bb28387b056a70ec7e8b67edb", string0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      byte[] byteArray0 = new byte[5];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, byteBuffer0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = DigestUtils.sha512Hex(byteArray0);
      assertEquals("b8244d028981d693af7b456af8efa4cad63d282e19ff14942c246e50d9351d22704a802a71c3580b6370de4ceb293c324a8423342557d4e5c38438f0e36910ee", string0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = DigestUtils.sha384Hex("07^{s2 ");
      assertEquals("2cee24032c504bfc3073ff4b8b491a6b05e13aca7d2ff93201ea9632066ee8d14304c08b1653ffd602f46fc934a60286", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.md2((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha((InputStream) byteArrayInputStream0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MessageDigest messageDigest1 = digestUtils0.getMessageDigest();
      assertEquals("MD5 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade", "org.apache.commons.codec.DecoderException");
      try { 
        digestUtils0.digestAsHex((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("36be33f6a540249bdc72edec2fb1fcf489a5c27e86a63e8e35d44ade");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      DigestUtils digestUtils0 = null;
      try {
        digestUtils0 = new DigestUtils((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.sha512_224Hex((InputStream) sequenceInputStream0);
      assertEquals("6ed0dd02806fa89e25de060c19d3ac86cabb87d6a0ddd05c333b84f4", string0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("jG~T?X_.? _");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512("![(!TE`}7%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.md5Hex((InputStream) sequenceInputStream0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex("j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      Enumeration<PipedInputStream> enumeration0 = (Enumeration<PipedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = digestUtils0.digestAsHex((InputStream) sequenceInputStream0);
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.sha512_256Hex((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.sha512_224Hex(byteArray0);
      assertEquals("54869716521a205573513a5581f12ddb1b6660ae2e9f53b081ac8b49", string0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = DigestUtils.md5Hex(byteArray0);
      assertEquals("f1d3ff8443297732862df21dc4e57262", string0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex(".5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      String string0 = DigestUtils.sha256Hex("6ade47c72d8f0e0042a9df2357de5fa0");
      assertEquals("024048c5f85ff55e9f2bc78fbc76552d9413a18494966ac38dd26034b6fc1afa", string0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384("SHA3-224");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha("");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex("6}EQkQvk$&n{#a2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.shaHex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      String string0 = DigestUtils.sha512_256Hex("Output array is not large enough to accommodate decoded data.");
      assertEquals("bd6587e95f841ea7ae3b8344b82ee0d34520fdd5ef87dbc6efac565fbfe95a64", string0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      String string0 = DigestUtils.sha512_224Hex("G(X}=A6T,-yRKz");
      assertEquals("97fceec66d7bd10fc701287f83d7cb39df63daf8a3a6a773b5dd9088", string0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = DigestUtils.sha512_256Hex(byteArray0);
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1966);
      try { 
        DigestUtils.sha256Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      String string0 = DigestUtils.md2Hex("]");
      assertEquals("6ade47c72d8f0e0042a9df2357de5fa0", string0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      byte[] byteArray1 = digestUtils0.digest(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      String string0 = DigestUtils.sha1Hex("83]~wtsMN");
      assertEquals("3361ca7a8fb715522e93bc3011c8c1540243751f", string0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      String string0 = DigestUtils.sha512Hex("MD5");
      assertEquals("ebaea1e76eb3985e30eb19454ba2c3d4639bfc9f1ea74a06e2806b6c40d24ee94299da9703c09d835749833f19898ea89bf7efa2faab1958313208e272cb9bc6", string0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha(byteArray0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)66);
      byte[] byteArray0 = digestUtils0.digest(byteBuffer0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = DigestUtils.sha384(byteArray0);
      assertEquals(48, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = DigestUtils.md5(byteArray0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digest("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }
}
