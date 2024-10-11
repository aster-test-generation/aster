
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.net.URI;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder;
import org.apache.commons.compress.archivers.sevenz.AbstractCoder;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.apache.commons.compress.archivers.sevenz.Coders;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractCoder_ESTest extends AbstractCoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      int int0 = AbstractCoder.toInt(object0, 2145);
      assertEquals(2145, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      Integer integer0 = Integer.getInteger("v\"li)W", 2229);
      boolean boolean0 = coders_Deflate64Decoder0.isOptionInstance(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      byte[] byteArray0 = new byte[4];
      Coder coder0 = new Coder(byteArray0, 11L, (byte)74, byteArray0);
      OutputStream outputStream0 = coders_CopyDecoder0.encode((OutputStream) null, coder0);
      assertNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.archivers.sevenz.DeltaDecoder", "org.apache.commons.compress.archivers.sevenz.DeltaDecoder");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      OutputStream outputStream0 = coders_CopyDecoder0.encode(mockPrintStream0, aES256SHA256Decoder0);
      assertSame(mockPrintStream0, outputStream0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.getOptionsAsProperties(sequenceInputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.SequenceInputStream cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AES256SHA256Decoder aES256SHA256Decoder0 = new AES256SHA256Decoder();
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        aES256SHA256Decoder0.encode(mockPrintStream0, dataInputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.DataInputStream cannot be cast to org.apache.commons.compress.archivers.sevenz.AES256Options
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer((-3978));
      int int0 = AbstractCoder.toInt(integer0, (-3978));
      assertEquals((-3978), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = AbstractCoder.toInt((Object) null, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      byte[] byteArray0 = new byte[6];
      Coder coder0 = new Coder(byteArray0, (-241L), (byte)0, byteArray0);
      File file0 = MockFile.createTempFile("org.apache.commons.compress.utils.ByteUtils", "org.apache.commons.compress.utils.ByteUtils");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      Object object0 = coders_CopyDecoder0.getOptionsFromCoder(coder0, mockFileInputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      Object object0 = new Object();
      boolean boolean0 = coders_CopyDecoder0.isOptionInstance(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Coders.CopyDecoder coders_CopyDecoder0 = new Coders.CopyDecoder();
      Object object0 = new Object();
      byte[] byteArray0 = coders_CopyDecoder0.getOptionsAsProperties(object0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Coders.Deflate64Decoder coders_Deflate64Decoder0 = new Coders.Deflate64Decoder();
      // Undeclared exception!
      try { 
        coders_Deflate64Decoder0.encode((OutputStream) null, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Method doesn't support writing
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.AbstractCoder", e);
      }
  }
}
