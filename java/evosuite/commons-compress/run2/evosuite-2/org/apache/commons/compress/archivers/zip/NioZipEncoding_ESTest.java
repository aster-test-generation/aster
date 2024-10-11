
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import org.apache.commons.compress.archivers.zip.NioZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NioZipEncoding_ESTest extends NioZipEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding((Charset) null, true);
      Charset charset0 = nioZipEncoding0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding(charset0, true);
      byte[] byteArray0 = new byte[0];
      String string0 = nioZipEncoding0.decode(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding((Charset) null, false);
      // Undeclared exception!
      try { 
        nioZipEncoding0.encode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.NioZipEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding(charset0, false);
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-48);
      try { 
        nioZipEncoding0.decode(byteArray0);
        fail("Expecting exception: MalformedInputException");
      
      } catch(MalformedInputException e) {
         //
         // Input length = 1
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding((Charset) null, false);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        nioZipEncoding0.decode(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.NioZipEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding(charset0, false);
      // Undeclared exception!
      try { 
        nioZipEncoding0.canEncode((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CharsetEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding(charset0, true);
      byte[] byteArray0 = new byte[6];
      String string0 = nioZipEncoding0.decode(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding(charset0, true);
      ByteBuffer byteBuffer0 = nioZipEncoding0.encode("]#vJSM{ \" 3>hDz)");
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=16 cap=20]", byteBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding(charset0, false);
      boolean boolean0 = nioZipEncoding0.canEncode("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      NioZipEncoding nioZipEncoding0 = new NioZipEncoding(charset0, false);
      ByteBuffer byteBuffer0 = nioZipEncoding0.encode("");
      assertEquals(2, byteBuffer0.capacity());
  }
}
