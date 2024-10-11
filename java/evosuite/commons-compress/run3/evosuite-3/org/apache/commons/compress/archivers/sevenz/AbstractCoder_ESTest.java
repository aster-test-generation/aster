
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder;
import org.apache.commons.compress.archivers.sevenz.AbstractCoder;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.apache.commons.compress.archivers.sevenz.Coders;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractCoder_ESTest extends AbstractCoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = AbstractCoder.toInt((Object) null, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(9);
      int int0 = AbstractCoder.toInt(integer0, 0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      Integer integer0 = new Integer(0);
      boolean boolean0 = coders_DeflateDecoder0.isOptionInstance(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      OutputStream outputStream0 = coders_CopyDecoder0.encode((OutputStream) null, (Object) null);
      assertNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("x", false);
      OutputStream outputStream0 = coders_CopyDecoder0.encode(mockFileOutputStream0, "x");
      assertSame(outputStream0, mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode((OutputStream) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$AES256SHA256DecoderOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      Integer integer0 = new Integer(4299);
      // Undeclared exception!
      try { 
        coders_DeflateDecoder0.encode((OutputStream) null, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      int int0 = AbstractCoder.toInt(class0, (-1903));
      assertEquals((-1903), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      byte[] byteArray0 = new byte[7];
      Coder coder0 = new Coder(byteArray0, (byte)0, (byte)0, byteArray0);
      Object object0 = coders_Deflate64Decoder0.getOptionsFromCoder(coder0, (InputStream) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      Object object0 = new Object();
      boolean boolean0 = coders_DeflateDecoder0.isOptionInstance(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Coders.DeflateDecoder coders_DeflateDecoder0 = new Coders.DeflateDecoder();
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      byte[] byteArray0 = coders_CopyDecoder0.getOptionsAsProperties(coders_DeflateDecoder0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.sevenz.AbstractCoder");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      // Undeclared exception!
      try { 
        coders_Deflate64Decoder0.encode(mockPrintStream0, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Method doesn't support writing
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AbstractCoder", e);
      }
  }
}
