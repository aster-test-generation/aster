
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
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DigestUtils_ESTest extends DigestUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = DigestUtils.sha512_256Hex("(xo6x");
      assertEquals("e5ac2245eb0ea5d147ce24eca2b1b45b59cbb8a777e4a73abc96edc56542cccc", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha512_256Hex((InputStream) byteArrayInputStream0);
      assertEquals("4e9279fdcaea71d8663b53de0ffb214a407f5aab8c5f8e6db820b7b6d8639c1c", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = DigestUtils.sha512_224Hex("=1Jkn9e");
      assertEquals("81053229e9375a944ceaaf4678d8e773147d590978c569d49da1ce38", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.sha512_224Hex((InputStream) sequenceInputStream0);
      assertEquals("6ed0dd02806fa89e25de060c19d3ac86cabb87d6a0ddd05c333b84f4", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = DigestUtils.sha512Hex("");
      assertEquals("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)37, (byte)0);
      byte[] byteArray1 = DigestUtils.sha512((InputStream) byteArrayInputStream0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.sha384Hex((InputStream) sequenceInputStream0);
      assertEquals("38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)102, (byte)0);
      String string0 = DigestUtils.sha256Hex((InputStream) byteArrayInputStream0);
      assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      File file0 = MockFile.createTempFile("3794d58aae6a8c60234e6264554ba6ca", "3794d58aae6a8c60234e6264554ba6ca");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      byte[] byteArray0 = DigestUtils.sha256((InputStream) pushbackInputStream0);
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2681, (byte)1);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0, 2681);
      byte[] byteArray1 = DigestUtils.sha1((InputStream) bufferedInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.md5Hex((InputStream) byteArrayInputStream0);
      assertEquals("7319468847d7b1aee40dbf5dd963c999", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = DigestUtils.md2((InputStream) sequenceInputStream0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("Output array is not large enough to accommodate decoded data.", (MessageDigest) null);
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("MD5");
      assertEquals("MD5", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      String string0 = digestUtils0.digestAsHex("");
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      MockFile mockFile0 = new MockFile("$%4EyD15,Pm.eQF", "$%4EyD15,Pm.eQF");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[7];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[5] = (OpenOption) standardOpenOption0;
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
  public void test017()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      MockFile mockFile0 = new MockFile("Fu0OY*=Pv?!e2o", "Fu0OY*=Pv?!e2o");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest((MessageDigest) null, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DigestUtils.updateDigest(messageDigest0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      MockFile mockFile0 = new MockFile((File) null, "dd79c8cfb8beeacd0460429944b4ecbe95a31561");
      try { 
        DigestUtils.updateDigest(messageDigest0, (File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      File file0 = MockFile.createTempFile(">*aD^]z87;", ">*aD^]z87;");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      try { 
        DigestUtils.shaHex((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DigestUtils.sha512_256Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
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
  public void test025()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      try { 
        DigestUtils.sha512_256((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
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
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
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
  public void test029()  throws Throwable  {
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 1354);
      try { 
        DigestUtils.sha512Hex((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      File file0 = MockFile.createTempFile("3794d58aae6a8c60234e6264554ba6ca", "3794d58aae6a8c60234e6264554ba6ca");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/9s/n46_h6v14tz3gvv43tjl9mth0000gq/T/3794d58aae6a8c60234e6264554ba6ca03794d58aae6a8c60234e6264554ba6ca");
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      try { 
        DigestUtils.sha256((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
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
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0, 2);
      try { 
        DigestUtils.md5((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getDigest("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException:  MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (-544));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex((InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[5];
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
  public void test049()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-512/256");
      // Undeclared exception!
      try { 
        digestUtils0.digest((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile("d41d8cd98f00b204e9800998ecf8427e", "");
      try { 
        digestUtils0.digest((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 280);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DigestUtils.updateDigest(messageDigest0, (InputStream) bufferedInputStream0);
      assertEquals("SHA-1 Message Digest from SUN, <in progress>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      File file0 = MockFile.createTempFile("3794d58aae6a8c60234e6264554ba6ca", "3794d58aae6a8c60234e6264554ba6ca");
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, file0);
      assertEquals("SHA-384 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      byte[] byteArray0 = DigestUtils.sha384((InputStream) bufferedInputStream0);
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteArray0);
      assertEquals("SHA-1 Message Digest from SUN, <in progress>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      try { 
        DigestUtils.sha512((InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = DigestUtils.md2(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
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
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-101), (-1669));
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      assertEquals("SHA-512/256", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2967);
      try { 
        DigestUtils.sha1((InputStream) pipedInputStream0);
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
  public void test064()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha512_224(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
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
  public void test066()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("lg<K+-2TSx=^(>b<A");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = DigestUtils.sha384(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha512(byteArray0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha1("SHA-1");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = DigestUtils.sha1(byteArray0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 337);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, byteArrayInputStream0);
      String string0 = DigestUtils.sha1Hex((InputStream) sequenceInputStream0);
      assertEquals("5ba93c9db0cff93f52b521d7420e43f6eda2784f", string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(8);
      try { 
        DigestUtils.digest((MessageDigest) null, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
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
  public void test075()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test076()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = DigestUtils.sha1Hex(byteArray0);
      assertEquals("77ce0377defbd11b77b1f4ad54ca40ea5ef28490", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224("Odd number of characters.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digest("MD5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = DigestUtils.sha512_256(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.md5((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils("SHA-384");
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byte[] byteArray1 = digestUtils0.digest(byteBuffer0);
      assertEquals(48, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteBuffer0);
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      File file0 = MockFile.createTempFile("d41d8cd98f00b204e9800998ecf8427e", "d41d8cd98f00b204e9800998ecf8427e");
      byte[] byteArray0 = digestUtils0.digest(file0);
      assertEquals(28, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("MD5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("c571b86549e49bf223cf648388c46288c2241b5a");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-512/224");
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      String string0 = DigestUtils.sha256Hex(byteArray0);
      assertEquals("8855508aade16ec573d21e6a485dfd0a7624085c1a14b5ecdd6485de0c6839a4", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      MockFile mockFile0 = new MockFile("");
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
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
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
  public void test093()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha512Hex((InputStream) byteArrayInputStream0);
      assertEquals("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
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
  public void test095()  throws Throwable  {
      String string0 = DigestUtils.md2Hex("");
      assertEquals("8350e5a3e24c153df2275c9f80692773", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = DigestUtils.shaHex(byteArray0);
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      String string0 = DigestUtils.shaHex("");
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 337);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, byteArrayInputStream0);
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
  public void test104()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256((InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MockFile mockFile0 = new MockFile(")604/62Ar");
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
  public void test106()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = DigestUtils.md2Hex(byteArray0);
      assertEquals("a51716bb183463097d2a19c217948eea", string0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha("SHA-Nv512");
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, byteBuffer0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("SHA-384");
      String string0 = DigestUtils.sha512Hex(byteArray0);
      assertEquals("38aa0707d7a8558f10068319494e209e73224e1184d8f02a7173761bf622553207238f428b5fd75d63aeb413194e2f1d4ee5be98d6a8ede5a7f77239c2136074", string0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
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
  public void test111()  throws Throwable  {
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
  public void test112()  throws Throwable  {
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
  public void test113()  throws Throwable  {
      String string0 = DigestUtils.sha256Hex(":Eri0A");
      assertEquals("deb36832fe899324794c6a4b85eae09355349160256264b5d2ee96d57d7cce5f", string0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md2((InputStream) null);
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        DigestUtils.sha((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("");
      String string0 = DigestUtils.sha384Hex(byteArray0);
      assertEquals("46754e3f1c17b07b2543207b4a18aa6731f92b27eaa8bc1f2567df1a6be149f6d123f44650e1a8da4364baacd17b1927", string0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
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
  public void test118()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha256Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MessageDigest messageDigest1 = digestUtils0.getMessageDigest();
      assertEquals("SHA-256 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("+MGZ9;w4JKa2^=z", "+MGZ9;w4JKa2^=z");
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
  public void test120()  throws Throwable  {
      String string0 = DigestUtils.sha384Hex("c6d9ce21b39dca88f676b9ab17e473f2");
      assertEquals("8be5d33f7947642b1711e133a7d170ec7f65ea10155776f9a2fee7c866def62b4d4341d70a8d4728b10698ed7ef6813e", string0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      DigestUtils digestUtils0 = null;
      try {
        digestUtils0 = new DigestUtils("X>q;8d#P|e5\"SAFvHu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: X>q;8d#P|e5\"SAFvHu MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha512_224((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      MessageDigest messageDigest1 = DigestUtils.getDigest("SHA-512", messageDigest0);
      assertEquals("SHA-512 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
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
  public void test126()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha256("8be5d33f7947642b1711e133a7d170ec7f65ea10155776f9a2fee7c866def62b4d4341d70a8d4728b10698ed7ef6813e");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
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
  public void test128()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex("$c1FO15`$4)&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      PipedInputStream pipedInputStream0 = new PipedInputStream(8);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
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
  public void test130()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.sha512_256((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("");
      String string0 = DigestUtils.sha512_224Hex(byteArray0);
      assertEquals("bbcddcba9adb4d05dc5ab78e00a1781357e952ef29e8f00c5204064c", string0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512("fRVb#2 0");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = DigestUtils.md5Hex(byteArray0);
      assertEquals("f1d3ff8443297732862df21dc4e57262", string0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = DigestUtils.sha256(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex("Odd number of characters.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 6, (byte) (-96));
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      String string0 = DigestUtils.shaHex((InputStream) bufferedInputStream0);
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_256Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_224Hex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384("1[;$<c^4noq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        DigestUtils.sha256Hex((InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("");
      String string0 = DigestUtils.sha512_256Hex(byteArray0);
      assertEquals("0fc7f0900186f4210403b7396957d994d97b43319cc11bb0eb43c82998e236a4", string0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      byte[] byteArray1 = digestUtils0.digest(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      String string0 = DigestUtils.sha1Hex("SHA-1");
      assertEquals("c571b86549e49bf223cf648388c46288c2241b5a", string0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, "sT1RFh;XzJi");
      assertSame(messageDigest0, messageDigest1);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_256("org.apache.commons.codec.binary.Hex");
      byte[] byteArray1 = DigestUtils.sha(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256("&Hu8>x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      String string0 = DigestUtils.md5Hex("5?Ch S_6'");
      assertEquals("53a740d66da6eec5eb214969d77afe12", string0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test150()  throws Throwable  {
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
  public void test151()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = DigestUtils.md5(byteArray0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(")J xF!xV!90RI0.&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }
}
