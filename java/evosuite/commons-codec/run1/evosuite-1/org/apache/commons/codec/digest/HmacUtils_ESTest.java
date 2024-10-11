
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
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HmacUtils_ESTest extends HmacUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      String string0 = HmacUtils.hmacSha512Hex("a5e8af16162fde31f73e4fe05a141252750c541d981bd2f203b2f2ef29072b5e24e351f2ca44ddb2430a0a16fad64c77", "$");
      assertEquals("7c20bf0574b763b42ebd490529dec47b43a625446cb6bd6f48471f9fc14425db08900e3d377ad731d21f75501ac99dff474c4fc7dee3a79c24aeba54d6d4388e", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[3];
      String string0 = HmacUtils.hmacSha512Hex(byteArray1, byteArray0);
      assertEquals("faabfc75158bb797242a3ce2953e531de707b0c500aee845921484778863c764aaf5197cb55942edf17f50247f925aa77aa6e70bcd4c205d39cd4019722522c1", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, (byte[]) null);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, (InputStream) byteArrayInputStream0);
      String string0 = HmacUtils.hmacSha384Hex(byteArray1, byteArray0);
      assertEquals("0f9f0bcd36bf4bb4ad273434fcdcaf8ac38c2c7a718fdf168e9b7a1ff83ae7d7edce66ae519c37810c7b78effc88771e", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = HmacUtils.hmacSha384(byteArray0, (byte[]) null);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "org.apache.commons.codec.digest.HmacUtils");
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = hmacUtils0.hmac((byte[]) null);
      String string0 = HmacUtils.hmacSha256Hex(byteArray1, byteArray0);
      assertEquals("98aec4246e026a790d7c13a25d5b0bb9b958072ffccd3c60d760896fe981da7c", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, byteArray0);
      byte[] byteArray2 = HmacUtils.hmacSha256(byteArray1, byteArray0);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha1("org.apache.commons.codec.digest.HmacAlgorithms", "");
      assertEquals(20, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      byte[] byteArray1 = mac0.doFinal();
      byte[] byteArray2 = HmacUtils.hmacSha1(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray1);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = HmacUtils.hmacSha1("|W\"fn[((Nin", "|W\"fn[((Nin");
      String string0 = HmacUtils.hmacMd5Hex(byteArray1, byteArray0);
      assertEquals("aa0e8f83a77709a304d7868be08117d4", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("HmacSHA512", "");
      byte[] byteArray1 = HmacUtils.hmacSha256("org.apache.commons.codec.digest.HmacUtils", "H");
      byte[] byteArray2 = HmacUtils.hmacMd5(byteArray1, byteArray0);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      String string0 = HmacUtils.hmacSha384Hex(byteArray0, (InputStream) sequenceInputStream0);
      assertEquals("6c1f2ee938fad2e24bd91298474382ca218c75db3d83e114b3d4367776d14d3551289e75e8209cd4b792302840234adc", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      String string0 = HmacUtils.hmacSha384Hex(" N_UJI4&J){f", "4?bJB");
      assertEquals("5efa607fc74dade5249a337bf400b826a52ff9967f46b81bfc39d72d316520bf63e2faf9d2f88876ee4729e2e21f9ca6", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha256Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("f375180aba92888401f1919be4a8715a62763b65c1c10e1d0858e81d4d6f9fd2", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha1(byteArray0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "a5e8af16162fde31f73e4fe05a141252750c541d981bd2f203b2f2ef29072b5e24e351f2ca44ddb2430a0a16fad64c77");
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)50);
      String string0 = hmacUtils0.hmacHex(byteBuffer0);
      assertEquals("45d37c9fe9321272209c1ca62ae74fe0e7f1f3c3a162813e103e4113a60d8612dbda023eb8b8fe215e2b92df0183a1f7188a9d7136b73a66b9a13f900fc2817a", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_1;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "57b67a33782950c14182aca94fab7ecbba07afedd7d3888f54fca902f7a11b083bceb28374bce59f9ff51b7bced278d2beb828205881fe36272c042f46b8105e");
      String string0 = hmacUtils0.hmacHex((String) null);
      assertEquals("03f329307634f7c05df2c1705be7b3b02b7da557", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("org.apache.commons.codec.digest.HmacUtils", "H");
      Mac mac0 = HmacUtils.getHmacSha384(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
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
  public void test020()  throws Throwable  {
      Mac mac0 = Mac.getInstance("HmacSHA1");
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac(mac0, (byte[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // MAC not initialized
         //
         verifyException("javax.crypto.Mac", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac((Mac) null, "n|>Tl\",;RqU?|");
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
      byte[] byteArray0 = new byte[4];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      // Undeclared exception!
      try { 
        HmacUtils.updateHmac(mac0, (InputStream) null);
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
  public void test024()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex((byte[]) null, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
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
  public void test026()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      try { 
        HmacUtils.hmacSha512Hex(byteArray0, (InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512Hex("", "[mo/,U");
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
        HmacUtils.hmacSha512Hex((String) null, "sI|Juy^c)NO<44)B!{");
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
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
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
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        HmacUtils.hmacSha512(byteArray0, (InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512("", "HMAC_MD5");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha512((String) null, "4x8Mw\"zks6)+");
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
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex((byte[]) null, byteArray0);
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
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384Hex((String) null, "Ds0N");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
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
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((byte[]) null, (byte[]) null);
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
      byte[] byteArray0 = new byte[2];
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      try { 
        HmacUtils.hmacSha384(byteArray0, (InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha384((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      PipedInputStream pipedInputStream0 = new PipedInputStream();
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
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256Hex((String) null, "6]BEW0-!u");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
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
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
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
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
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
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex((byte[]) null, (byte[]) null);
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
      byte[] byteArray0 = new byte[2];
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
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex("", (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1Hex((String) null, "$VALUES");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1("", ")bXPCwOSec:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1((String) null, "d!_OWPh{lJ");
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
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((byte[]) null, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
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
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, 1446);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex(byteArray0, (InputStream) bufferedInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((byte[]) null, (InputStream) mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
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
  public void test064()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5Hex((String) null, "3>In/X[4Pu8)sa=oC");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
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
  public void test066()  throws Throwable  {
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
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.hmacMd5((String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[2];
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
  public void test069()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
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
  public void test070()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      HmacUtils hmacUtils0 = new HmacUtils("HmacSHA384", byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((InputStream) dataInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      byte[] byteArray0 = new byte[3];
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
  public void test072()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "a5e8af16162fde31f73e4fe05a141252750c541d981bd2f203b2f2ef29072b5e24e351f2ca44ddb2430a0a16fad64c77");
      // Undeclared exception!
      try { 
        hmacUtils0.hmac((ByteBuffer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer must not be null
         //
         verifyException("javax.crypto.Mac", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmac("]r\"4SKKF=F'fWKR9a`");
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
      byte[] byteArray0 = new byte[3];
      HmacUtils hmacUtils0 = new HmacUtils();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
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
  public void test075()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, ">zf'h[JD,");
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
  public void test076()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      File file0 = MockFile.createTempFile("7b4d5e9fa63c13aad1cdb2645110dbd51967bdd7227b30467e017a8898dc36c72c91d20ef1296b5ea5636745424de7016b194cd1f7ff2d728674f588119fd67f", "");
      MockFile mockFile0 = new MockFile(file0, "zh-ej1*6i.Ya3WvR&5n");
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
  public void test077()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac(hmacAlgorithms0, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac((String) null, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Missing argument
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getInitializedMac("HMAC_SHA_512", (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
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
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
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
  public void test086()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(" at index ", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha512("]", "1h2f]8\"4N");
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("org.apache.commons.codec.digest.HmacUtils", byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm org.apache.commons.codec.digest.HmacUtils not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(";&:?]YvBKr>Xg", ";&:?]YvBKr>Xg");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.security.NoSuchAlgorithmException: Algorithm ;&:?]YvBKr>Xg not available
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "a5e8af16162fde31f73e4fe05a141252750c541d981bd2f203b2f2ef29072b5e24e351f2ca44ddb2430a0a16fad64c77");
      byte[] byteArray1 = hmacUtils0.hmac((InputStream) byteArrayInputStream0);
      assertEquals(64, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils(hmacAlgorithms0, (byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      byte[] byteArray0 = new byte[8];
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      String string0 = hmacUtils0.hmacHex((InputStream) sequenceInputStream0);
      assertEquals("47e798c38d944d1a7531bc50696c4fbaa8f5b369e1cb19c6fd5ef65e6fc0bbc970acd5d16356078bf06200979fe06dbc", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "0acc84b2ff0f821934908006a8a01b9825b36dbb24f2fc5da3417c9f8e15fe0381b0a373d64928c6de5c9f86f6d410cce35f434670f26143b86c6aef2431b8a4");
      byte[] byteArray0 = hmacUtils0.hmac("'3S{9di1{EccEHh$Z");
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_512;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "HmacSHA256");
      byte[] byteArray0 = new byte[1];
      String string0 = hmacUtils0.hmacHex(byteArray0);
      assertEquals("140547b96862baf366b932f1d52f5389daf22f2369399b682eb34d0ff89f35e4b59a00be0e8847d16bf76d9f73165fdc5d025c005007381ccf2a0346c935be9f", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_MD5;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "a5e8af16162fde31f73e4fe05a141252750c541d981bd2f203b2f2ef29072b5e24e351f2ca44ddb2430a0a16fad64c77");
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)0);
      byte[] byteArray0 = hmacUtils0.hmac(byteBuffer0);
      assertEquals(16, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex("}YKn@;)Z1:#6?SsYxEY");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "c<2");
      File file0 = MockFile.createTempFile("c<2", "c<2");
      byte[] byteArray0 = hmacUtils0.hmac(file0);
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      byte[] byteArray0 = new byte[8];
      Mac mac0 = HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Mac mac1 = HmacUtils.updateHmac(mac0, (InputStream) bufferedInputStream0);
      assertSame(mac1, mac0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      HmacUtils hmacUtils0 = null;
      try {
        hmacUtils0 = new HmacUtils("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = HmacUtils.hmacMd5Hex("HmacSHA512", "Illegal hexadecimal character ");
      assertEquals("a424c24ad69a452501affe8ec5ec7f57", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_384;
      byte[] byteArray0 = new byte[8];
      Mac mac0 = HmacUtils.getInitializedMac(hmacAlgorithms0, byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, (String) null);
      assertSame(mac0, mac1);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = HmacUtils.isAvailable("QI8jT A~`#/SWxhE3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byte[] byteArray1 = HmacUtils.hmacSha256(byteArray0, (InputStream) byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha384("r@Z-HKML#,pD", "");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("org.apache.commons.codec.digest.HmacUtils", "H");
      Mac mac0 = HmacUtils.getHmacSha1(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Mac mac0 = HmacUtils.getHmacSha512(byteArray0);
      assertNotNull(mac0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      String string0 = HmacUtils.hmacSha256Hex("Illegal hexadecimal character ", "H");
      assertEquals("8deafc19606530e3de104e8d7e03d0bde012dab599f2bf3019bbb5a116e04fba", string0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Mac mac0 = HmacUtils.getHmacMd5(byteArray0);
      Mac mac1 = HmacUtils.updateHmac(mac0, byteArray0);
      assertSame(mac0, mac1);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("HmacSHA512", "");
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha1(byteArray0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("org.apache.commons.codec.digest.HmacUtils", "H");
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
  public void test110()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, byteArray0);
      assertEquals("dab69ad98e28764f977ee2487e4f3f6873b2a297", string0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      byte[] byteArray1 = HmacUtils.hmacMd5(byteArray0, (InputStream) bufferedInputStream0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
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
  public void test113()  throws Throwable  {
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
  public void test114()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("ceda96a7ab5e5703e171081f491ad92f193eb1bf", string0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      // Undeclared exception!
      try { 
        HmacUtils.getHmacSha384((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null key
         //
         verifyException("org.apache.commons.codec.digest.HmacUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_256;
      boolean boolean0 = HmacUtils.isAvailable(hmacAlgorithms0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = HmacUtils.hmacSha1Hex("3Pml4oG", "40c8e191577be7b0d7a473cb76ffa51e0a780184f438623cb0fe35c768911304");
      assertEquals("dd51cb1934d8324a238bf2668f6cffcd13e84c30", string0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      HmacAlgorithms hmacAlgorithms0 = HmacAlgorithms.HMAC_SHA_224;
      HmacUtils hmacUtils0 = new HmacUtils(hmacAlgorithms0, "Null key");
      // Undeclared exception!
      try { 
        hmacUtils0.hmacHex((ByteBuffer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer must not be null
         //
         verifyException("javax.crypto.Mac", e);
      }
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      String string0 = HmacUtils.hmacSha512Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("5dd90116480ba7f5835734a90feb850c752a6b79295000173b5f4b887fcb611b7c7c4238151b1a8aa5a2d598f5bbceb81d597e44cd418922f1efa1933cac6f95", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (-3301));
      String string0 = HmacUtils.hmacMd5Hex(byteArray0, (InputStream) byteArrayInputStream0);
      assertEquals("74e6f7298a9c2d168935f58c001bad88", string0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        HmacUtils.hmacSha256(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      HmacUtils hmacUtils0 = new HmacUtils();
      MockFile mockFile0 = new MockFile("y)??<oI,B,` b ", "org.apache.commons.codec.digest.HmacUtils");
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
  public void test123()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacMd5("HmacSHA512", "");
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      try { 
        HmacUtils.hmacSha384Hex(byteArray0, (InputStream) dataInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = HmacUtils.hmacSha512(byteArray0, byteArray0);
      String string0 = HmacUtils.hmacSha1Hex(byteArray0, byteArray1);
      assertEquals("c22e84b8d6a1ba3e27afc824f43356306e720266", string0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      byte[] byteArray0 = HmacUtils.hmacSha256("org.apache.commons.codec.digest.HmacUtils", "H");
      Mac mac0 = HmacUtils.getHmacSha256(byteArray0);
      assertNotNull(mac0);
  }
}
