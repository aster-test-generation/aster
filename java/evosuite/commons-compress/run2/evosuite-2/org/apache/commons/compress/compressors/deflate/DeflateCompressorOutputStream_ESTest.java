
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


package org.apache.commons.compress.compressors.deflate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DeflateCompressorOutputStream_ESTest extends DeflateCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[3];
      deflateCompressorOutputStream0.write(byteArray0, 0, (int) (byte)0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
      deflateCompressorOutputStream0.close();
      byte[] byteArray0 = new byte[4];
      try { 
        deflateCompressorOutputStream0.write(byteArray0, (int) (byte)64, 256);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // write beyond end of stream
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockFileOutputStream0);
      deflateCompressorOutputStream0.close();
      try { 
        deflateCompressorOutputStream0.write(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // write beyond end of stream
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        deflateCompressorOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = null;
      try {
        deflateCompressorOutputStream0 = new DeflateCompressorOutputStream((OutputStream) null, (DeflateParameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = null;
      try {
        deflateCompressorOutputStream0 = new DeflateCompressorOutputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      deflateParameters0.setWithZlibHeader(false);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockFileOutputStream0);
      deflateCompressorOutputStream0.flush();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockFileOutputStream0);
      deflateCompressorOutputStream0.write(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        deflateCompressorOutputStream0.write(byteArray0, (int) (byte)64, 256);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockFileOutputStream0);
      deflateCompressorOutputStream0.finish();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(bufferedOutputStream0, deflateParameters0);
      // Undeclared exception!
      try { 
        deflateCompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }
}
