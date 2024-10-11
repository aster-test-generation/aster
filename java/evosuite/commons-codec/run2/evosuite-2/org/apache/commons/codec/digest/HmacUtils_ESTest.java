
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
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import javax.crypto.Mac;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HmacUtils_ESTest extends HmacUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = new byte[3];
      String string0 = HmacUtils.hmacSha512Hex(byteArray1, byteArray0);
      assertEquals("2121570bd4cf13b39ec4c090c4df4cb2eab511638c17457f0a5fac39b08852ce5e2385fc1ca51c4afd786c1732cd655d78bee6ab5f7abda3cb6b8bd677b6009f", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("r(c8v.!#3KqsP@", "=<jgk:");
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      byte[] byteArray2 = HmacUtils.hmacSha512(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray2);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      String string0 = HmacUtils.hmacSha384Hex(byteArray0, byteArray1);
      assertEquals("83267e9681613ca0b052cb2bf5668bab55d36c091deaf6fa90128491f8e897b99021c0a117b055c96d3629847833c5c3", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = HmacUtils.hmacSha256Hex("TVS/I*wie>clj',O ", "$4sEq,N9&z");
      assertEquals("3f9957ef955ec7d8656718bc76fbd77f7de4eadaac27ce1b56c30d6abe1aaef4", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("SF/l AFG>", "HMAC_SHA_512");
      byte[] byteArray1 = new byte[7];
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, byteArray1);
      assertEquals("2b74d1f1651ef06c42bde27e01415e5e9eaac97fe9bf5452d69511c8ef33660c", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha256(byteArray0, byteArray1);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, byteArray0);
      String string0 = HmacUtils.hmacMd5Hex(byteArray1, byteArray0);
      assertEquals("ffcb452bf60f61f2a96d2faa4f64e7e0", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[4];
      byte[] byteArray2 = HmacUtils.hmacMd5(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable("HmacSHA256");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable(" 8o:5ykhm=p");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, (InputStream) sequenceInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)42, (-1005));
      String string0 = HmacUtils.hmacSha384Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("6c1f2ee938fad2e24bd91298474382ca218c75db3d83e114b3d4367776d14d3551289e75e8209cd4b792302840234adc", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("TU6F 5J@451", "TU6F 5J@451");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, (InputStream) sequenceInputStream0);
      String string0 = HmacUtils.hmacSha1Hex(byteArray1, byteArray0);
      assertEquals("c958ac3c9514b3796a04b05353d7b65312fd490e", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("A", "");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("5f9009a98730947a6a42666bafc18f6c2cecf392", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("TU6F 5J@451", "TU6F 5J@451");
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, (InputStream) sequenceInputStream0);
      assertEquals("9a55db4d77be1142dc3cbba82dcc8326", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("/sVT6b", "");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacMd5(byteArray0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha1("fhx", "fhx");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      String string0 = hmacUtils0.hmacHex(byteBuffer0);
      assertEquals("12e8d485dd808a686be4378bd2d03230d53d2812", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "h^");
      String string0 = hmacUtils0.hmacHex((InputStream) byteArrayInputStream0);
      assertEquals("4b3e15bd8ca0e9be3c9787883c8b6e19", string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("A", "A");
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "A");
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byte[] byteArray1 = hmacUtils0.hmac(byteBuffer0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)5);
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, (InputStream) pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Mac mac0 = HmacUtils.getHmacSha512(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 1024);
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac(mac0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)117, (byte) (-118));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 5);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, bufferedInputStream0);
      try { 
        HmacUtils.updateHmac(mac0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex("", "[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 2558, 2558);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((byte[]) null, (InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) bufferedInputStream0);
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
        HmacUtils.hmacSha512((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex((String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((byte[]) null, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      bufferedInputStream0.close();
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((String) null, "4%XtT1:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Lsjo]!i:");
      File file0 = MockFile.createTempFile("Null key", "Null key", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((byte[]) null, (InputStream) pushbackInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)67);
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, (InputStream) pipedInputStream0);
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
        HmacUtils.hmacSha256Hex("", "HMAC_SHA_224");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((String) null, "$A<vosr");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256((byte[]) null, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256("", "g4,T~ckG>B");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex("", "1{l\"?3CdC;*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[9];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, byteArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((String) null, "imA%kYw4,p-2|/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1424), 10);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex("IFm=WPZ,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[2];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "pDR~0v)}a>4`B3pR>c");
      MockFile mockFile0 = new MockFile("[[.H_", "qR@vB1/\"IS(M:$Td");
      try { 
        hmacUtils0.hmacHex((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmac("org.apache.commons.codec.digest.HmacUtils");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "Nz'Ie4y4hIJMi~sI");
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "HmacSHA384");
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      try { 
        hmacUtils0.hmac((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("DP~s", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("[charsetName=", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm [charsetName= not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha384(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha256(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha1(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha1((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacMd5((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      byte[] byteArray0 = new byte[0];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm  not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils((String) null, "L]-Fn[9\"ltu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = hmacUtils0.hmac((InputStream) byteArrayInputStream0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((InputStream) byteArrayInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "qMp0C#u");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, (byte)3);
      try { 
        hmacUtils0.hmacHex((InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, ";p");
      byte[] byteArray0 = hmacUtils0.hmac("");
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      byte[] byteArray0 = new byte[3];
      Mac mac0 = HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, "org.apache.commons.codec.CharEncoding");
      assertSame(mac0, mac1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "HmacSHA384");
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = hmacUtils0.hmac(byteArray0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "Output array is not large enough to accommodate decoded data.");
      byte[] byteArray0 = new byte[9];
      String string0 = hmacUtils0.hmacHex(byteArray0);
      assertEquals("c46bbeb53ece836e060911b385f90afabfa663a7968598457ccc3ca0af83c6a1774c01789161337ad438fd87c448af4e", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils("HmacSHA256", "179123215f028231be4c27756e62de9b26581725e5777ab5d0347a2815f01cbeaf60e5e867ee5ffcd78e239b97f80966fe89f1657aed08136941fff27a30d0fd");
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "p/");
      String string0 = hmacUtils0.hmacHex("p/");
      assertEquals("bc7a2cd7774b192bdd656f55613d19dcbc1f123702b5eb12f3c456c0dd03b07b4b6baf84900c538a18b1c792659f3945", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("(cwxaQ6x:@", "(cwxaQ6x:@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm (cwxaQ6x:@ not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      String string0 = HmacUtils.hmacSha512Hex("bc7a2cd7774b192bdd656f55613d19dcbc1f123702b5eb12f3c456c0dd03b07b4b6baf84900c538a18b1c792659f3945", "7da1f1ca42ab00086093d1a6219fb725");
      assertEquals("6a63aa7f03bc916f7bd4696a08e01f8006a94ae0f75628e23c0ce9695c1a2a7f4e3b5676bb7463237f429cf70edca8bc174fa39584643221de809731114a6465", string0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = HmacUtils.hmacMd5Hex("65K]`L>RAF+Bptj8^J", "2f656101456a6fd1276a816921b532607740bfb4");
      assertEquals("ebc63caf665a54d8254b42e10f771755", string0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.isAvailable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        HmacUtils.hmacSha256(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("nMk7s`-,!VtC8;[(f", "6V6`N(4z@@(");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Mac mac0 = HmacUtils.getHmacSha1(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha512((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha1("`", (String) null);
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Mac mac0 = HmacUtils.getHmacSha256(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, byteArray0);
      assertSame(mac0, mac1);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals(20, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("A", "");
      HmacUtils hmacUtils0 = new HmacUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmac(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MockFile mockFile0 = new MockFile("Lsjo]!i:");
      File file0 = MockFile.createTempFile("Null key", "Null key", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, (InputStream) pushbackInputStream0);
      assertEquals("b613679a0814d9ec772f95d778c35fc5ff1697c493715653c6c712144292c5ad", string0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      String string0 = HmacUtils.hmacSha384Hex("HMAC_SHA_512", "");
      assertEquals("0195627902dcdc54a0a51387c11ef081ff47c6d166c106444db10e1387b2135fec64355885469ed931659aad84cbe367", string0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Mac mac0 = HmacUtils.getHmacSha384(byteArray0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Mac mac1 = HmacUtils.updateHmac(mac0, (InputStream) sequenceInputStream0);
      assertSame(mac0, mac1);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      boolean boolean0 = HmacUtils.isAvailable(hmacAlgorithms0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2180);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha512Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("869b81e40c5d97086fcaed2e14edb49ec5db2e4eb5d015b4639cc51098eaa4a4f2155695f831773ad03c716f6f859482cfbf7d0074d4ec7801921fedd07d253d", string0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      byte[] byteArray0 = new byte[5];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("Null key", "8^b\u0001A)m(7`s]");
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha1(byteArray0, byteArray1);
      assertNotSame(byteArray2, byteArray1);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.getHmacMd5(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      String string0 = HmacUtils.hmacSha1Hex("e^.'$f", "ptap%ezDl/&dnx_");
      assertEquals("b628e6d2301aef1e9060e3d4bbe175b5302e34f8", string0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, byteArray0);
      assertEquals(48, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) pushbackInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }
}
