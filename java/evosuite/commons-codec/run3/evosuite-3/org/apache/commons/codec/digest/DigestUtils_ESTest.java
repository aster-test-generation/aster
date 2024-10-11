
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
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      byte[] byteArray0 = new byte[8];
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteArray0);
      assertEquals("SHA-512/224 Message Digest from SUN, <in progress>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.shaHex((InputStream) byteArrayInputStream0);
      assertEquals("a10909c2cdcaf5adb7e6b092a4faba558b62bd96", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      String string0 = DigestUtils.sha512_256Hex("zmrOQlC]#j'>L");
      assertEquals("27d824b92a39daf8bb9634c8447844564f4ebf6990f40ae1aed5034166c5a638", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = DigestUtils.sha512_224Hex("V=AV<e,m");
      assertEquals("7e7e1c8c43925e2190e7e3dfe928918d7703ce1dc2c57fbd7b7e7703", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = DigestUtils.sha512Hex("OMC}4Fo/ODwY?9Z)Xs");
      assertEquals("c021b729a2a793b67128505d24f02d6f47e709d0a9e34be1a6c358c12679a5417e9de768cc1a86263ac1eaa66dfbde82617bfae9bb113aa6f839227c17142306", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      byte[] byteArray1 = DigestUtils.sha512((InputStream) sequenceInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha384Hex((InputStream) byteArrayInputStream0);
      assertEquals("7c2db09d310ece0b36d50c86e4c3e6641684948cd6fc03262b0d0ed91a6cfbc3cd5affd396c1f85fd0a109b103364b19", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha384("");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = DigestUtils.sha384((InputStream) sequenceInputStream0);
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, (byte)105);
      byte[] byteArray1 = DigestUtils.sha256((InputStream) byteArrayInputStream0);
      assertEquals(32, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha("6e340b9cffb37a989ca544e6bb780a2c78901d3fb33738768511a30617afa01d");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      File file0 = MockFile.createTempFile("%WJe7CODgS;n<Z", "%WJe7CODgS;n<Z");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = DigestUtils.sha((InputStream) mockFileInputStream0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      String string0 = DigestUtils.md5Hex("org.apache.commons.codec.EncoderException");
      assertEquals("00b086b1f84ac4c3b28003f5e00e9a42", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.md5Hex((InputStream) sequenceInputStream0);
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.md2Hex((InputStream) sequenceInputStream0);
      assertEquals("8350e5a3e24c153df2275c9f80692773", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MessageDigest messageDigest0 = digestUtils0.getMessageDigest();
      assertNull(messageDigest0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      String string0 = digestUtils0.digestAsHex(byteBuffer0);
      assertEquals("7dea362b3fac8e00956a4952a3d4f474", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      MockFile mockFile0 = new MockFile("]");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      MockFile mockFile0 = new MockFile("57371e7d587c9fec951b61f1dfd38fcd89f857b10ad7678384b1dc5c");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[6];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.WRITE;
      openOptionArray0[3] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'WRITE' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      File file0 = MockFile.createTempFile("`^qqW2", "]D(w_j7U!ef4/");
      Path path0 = file0.toPath();
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
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest((MessageDigest) null, byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getDigest("MD2");
      MockFile mockFile0 = new MockFile("Du");
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
  public void test022()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.shaHex((byte[]) null);
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
      // Undeclared exception!
      try { 
        DigestUtils.shaHex((String) null);
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
        DigestUtils.sha512_256Hex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
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
  public void test026()  throws Throwable  {
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
  public void test027()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
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
  public void test028()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.close();
      try { 
        DigestUtils.sha512_224Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512_224((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
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
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256Hex((byte[]) null);
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
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha256((byte[]) null);
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
  public void test037()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2006);
      try { 
        DigestUtils.sha1Hex((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha1((String) null);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
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
  public void test040()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 1333);
      try { 
        DigestUtils.sha((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
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
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.md5((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-75), (byte)49);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, pushbackInputStream0);
      // Undeclared exception!
      try { 
        DigestUtils.md5((InputStream) sequenceInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      try { 
        DigestUtils.md5((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      try { 
        DigestUtils.md2Hex((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
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
  public void test047()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        DigestUtils.md2((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.getDigest("7jH4'.=hHnL52T");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: 7jH4'.=hHnL52T MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("SHA-384", "grXTe^b&");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SPARSE;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      try { 
        digestUtils0.digestAsHex(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        DigestUtils.digest((MessageDigest) null, byteArray0);
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
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      File file0 = MockFile.createTempFile("26f0e5d5ce46a0d91d7ed8a4f11cea51ef4eb357", (String) null);
      Path path0 = file0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        DigestUtils.digest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        DigestUtils.digest((MessageDigest) null, (InputStream) byteArrayInputStream0);
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
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("k)xi0Wd\"", "c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      try { 
        digestUtils0.digest(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("org.apache.commons.codec.EncoderException");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[7];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.WRITE;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        digestUtils0.digest(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'WRITE' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        digestUtils0.digest((InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
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
  public void test058()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DigestUtils.updateDigest(messageDigest0, (InputStream) byteArrayInputStream0);
      assertEquals("SHA-512 Message Digest from SUN, <in progress>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("c021b729a2a793b67128505d24f02d6f47e709d0a9e34be1a6c358c12679a5417e9de768cc1a86263ac1eaa66dfbde82617bfae9bb113aa6f839227c17142306");
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
  public void test060()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("-vtj");
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
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 12, (-725));
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
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
  public void test063()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(4782);
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
  public void test064()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        DigestUtils.updateDigest((MessageDigest) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha384Digest();
      assertEquals("SHA-384 Message Digest from SUN, <initialized>\n", messageDigest0.toString());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      MessageDigest messageDigest1 = DigestUtils.getDigest("", messageDigest0);
      assertEquals("SHA-512", messageDigest1.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha512((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = DigestUtils.md2(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
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
  public void test070()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_256(":yZU.[");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd5Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      byte[] byteArray0 = digestUtils0.digest("<3XBJTVtw.q.vS");
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("");
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
  public void test073()  throws Throwable  {
      File file0 = MockFile.createTempFile("lsp.s+G[:mkPcEtIj#o", "omev V}yI:`98cZ`JS(");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      byte[] byteArray0 = DigestUtils.sha1((InputStream) mockFileInputStream0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
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
  public void test075()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = DigestUtils.sha512_224(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
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
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha384((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = DigestUtils.sha512(byteArray0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.md5(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha1("F*)\r[y+8;`VU6kYX");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha256Digest();
      assertEquals("SHA-256", messageDigest0.getAlgorithm());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
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
  public void test084()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = DigestUtils.sha1(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 52);
      String string0 = DigestUtils.sha1Hex((InputStream) pushbackInputStream0);
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("-vtj");
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 56, (-1230));
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2424, (byte)127);
      byte[] byteArray1 = DigestUtils.sha512_256((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
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
  public void test089()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md2("00b086b1f84ac4c3b28003f5e00e9a42");
      byte[] byteArray1 = DigestUtils.sha384(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
  public void test091()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = DigestUtils.sha1Hex(byteArray0);
      assertEquals("7722745105e9e02e8f1aaf17f7b3aac5c56cd805", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512(" I@X.e:2cuy");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = DigestUtils.md2((InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224("8Eix~B:tCA<8Kk");
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
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, byteBuffer0);
      assertEquals("MD2 Message Digest from SUN, <in progress>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        digestUtils0.digest((InputStream) byteArrayInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, "org.apache.commons.codec.CharEncoding");
      assertEquals("SHA-512/224 Message Digest from SUN, <in progress>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = DigestUtils.sha512_256(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
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
  public void test101()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 1);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 402);
      byte[] byteArray1 = DigestUtils.md5((InputStream) pushbackInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = DigestUtils.sha1Hex("");
      assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      File file0 = MockFile.createTempFile("5cadc655de21524cb9f43fdca8f0f121", "5cadc655de21524cb9f43fdca8f0f121");
      MessageDigest messageDigest1 = DigestUtils.updateDigest(messageDigest0, file0);
      assertEquals("SHA-512 Message Digest from SUN, <initialized>\n", messageDigest1.toString());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("SHA-512");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getMd2Digest();
      File file0 = MockFile.createTempFile("26f0e5d5ce46a0d91d7ed8a4f11cea51ef4eb357", (String) null);
      Path path0 = file0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      // Undeclared exception!
      try { 
        DigestUtils.digest(messageDigest0, path0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("'4bp~j})}S_[_");
      MessageDigest messageDigest0 = DigestUtils.getSha512Digest();
      byte[] byteArray1 = DigestUtils.digest(messageDigest0, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex((InputStream) mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.sha256Hex(byteArray0);
      assertEquals("709e80c88487a2411e1ee4dfb9f22a861492d20c4765150c0c794abd70f8147c", string0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Gv-O0H#1P'zE.#M", "T7!");
      try { 
        DigestUtils.digest((MessageDigest) null, (File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
  public void test111()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("bU|D<y,m^V5@&RH=:T");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha512Hex((InputStream) byteArrayInputStream0);
      assertEquals("afb64d13901676514890d076452a26dfc87f08d6caa4a888dfcda08dbe929b25d34eb22734fdf4072b602b21ba443bef49108513883b7659b5275bf3276fca74", string0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("bU|D<y,m^V5@&RH=:T");
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
  public void test113()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_224Digest();
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
  public void test114()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = DigestUtils.shaHex(byteArray0);
      assertEquals("5ba93c9db0cff93f52b521d7420e43f6eda2784f", string0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)15, (byte)0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
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
  public void test117()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 6, (byte)0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex((InputStream) byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256((InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("k)xi0Wd\"", "c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      // Undeclared exception!
      try { 
        digestUtils0.digest(path0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("'4bp~j})}S_[_");
      String string0 = DigestUtils.md2Hex(byteArray0);
      assertEquals("5cadc655de21524cb9f43fdca8f0f121", string0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha1Digest();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      byte[] byteArray0 = DigestUtils.digest(messageDigest0, byteBuffer0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.sha512Hex(byteArray0);
      assertEquals("6d518f8b31d1882feace10a9215f5d8cf5afe037652a1d11d9c1408d988c2a4f71a5edfc85d0712fa3f4e21b2c0a244c8c0d333bab454311e24067d2a83e5e59", string0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      MockFile mockFile0 = new MockFile("[AJxx~pq!,j.]", "[AJxx~pq!,j.]");
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
  public void test124()  throws Throwable  {
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
  public void test125()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex((byte[]) null);
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
      String string0 = DigestUtils.sha256Hex("");
      assertEquals("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", string0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
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
  public void test128()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test130()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getSha512_256Digest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      MessageDigest messageDigest1 = digestUtils0.getMessageDigest();
      assertSame(messageDigest1, messageDigest0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      String string0 = DigestUtils.sha384Hex("cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
      assertEquals("1fa9bcbe3cd8521db7a3e80d383b3c6ca7b5dd4a143380d711f4160d8a1f4c3f948c5e7bbb91c8d39e83ade2a7f71194", string0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      DigestUtils digestUtils0 = null;
      try {
        digestUtils0 = new DigestUtils("%e\"x,~@FE#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: %e\"x,~@FE# MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 1);
      String string0 = DigestUtils.sha512_224Hex((InputStream) byteArrayInputStream0);
      assertEquals("283bb59af7081ed08197227d8f65b9591ffe1155be43e9550e57f941", string0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex((InputStream) dataInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      boolean boolean0 = DigestUtils.isAvailable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224((InputStream) bufferedInputStream0);
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
      // Undeclared exception!
      try { 
        DigestUtils.sha3_512Hex("2601396c8b21fe8bc64388c59b7c6a2f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-512 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha256("s");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-692), 270);
      // Undeclared exception!
      try { 
        DigestUtils.sha384((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
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
  public void test140()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384Hex("");
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
      DigestUtils digestUtils0 = new DigestUtils();
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex((InputStream) sequenceInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = DigestUtils.sha512_256Hex((InputStream) sequenceInputStream0);
      assertEquals("c672b8d1ef56ed28ab87c3622c5114069bdd3ad7b8f9737498d0c01ecef0967a", string0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384((InputStream) pipedInputStream0);
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
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.md5Hex(byteArray0);
      assertEquals("693e9af84d3dfcc71e640e005bdc5e2e", string0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("bU|D<y,m^V5@&RH=:T");
      byte[] byteArray1 = DigestUtils.sha256(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_224Hex("SHA-512/256");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-224 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
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
  public void test149()  throws Throwable  {
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
  public void test150()  throws Throwable  {
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
  public void test151()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_384("D_W,vil7Gq]4/t");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-384 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = DigestUtils.sha512_256Hex(byteArray0);
      assertEquals("57635d1312569b5a4c4c26fd7b5df0ed403045e9608e9b14eae870588848e4d9", string0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512_224("bU|D<y,m^V5@&RH=:T");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = DigestUtils.sha256Hex((InputStream) byteArrayInputStream0);
      assertEquals("baa01fe1301bd759ad02c859082183e08e1934d85a013ae035a6ccc6baa396f3", string0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      String string0 = DigestUtils.md2Hex("F*)\r[y+8;`VU6kYX");
      assertEquals("d79c2bad680f90858b75fb8e2cbed9c0", string0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DigestUtils digestUtils0 = new DigestUtils();
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
  public void test156()  throws Throwable  {
      String string0 = DigestUtils.shaHex("r)rya^");
      assertEquals("5ff0ee5ab4a59d754927fde6d318d6448f616563", string0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.sha512("F*)\r[y+8;`VU6kYX");
      String string0 = DigestUtils.sha512_224Hex(byteArray0);
      assertEquals("222ecb52d9b79392f7a2189d960da28355d089adaf27ee231bc8a99b", string0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      MessageDigest messageDigest0 = DigestUtils.getShaDigest();
      DigestUtils digestUtils0 = new DigestUtils(messageDigest0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)117);
      byte[] byteArray0 = digestUtils0.digest(byteBuffer0);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = DigestUtils.sha(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      // Undeclared exception!
      try { 
        DigestUtils.sha3_256Hex(")/oT;^4]_DqY;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: SHA3-256 MessageDigest not available
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
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
  public void test162()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      byte[] byteArray0 = DigestUtils.md5("'4bp~j})}S_[_");
      String string0 = DigestUtils.sha384Hex(byteArray0);
      assertEquals("ce9ca6955c82b365941775e383eb13e2c78f09fcce03309b211b28c3fc5d899b2c11d01ea8c4d37573f61da62a60f005", string0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      DigestUtils digestUtils0 = new DigestUtils();
      // Undeclared exception!
      try { 
        digestUtils0.digestAsHex("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.DigestUtils", e);
      }
  }
}
