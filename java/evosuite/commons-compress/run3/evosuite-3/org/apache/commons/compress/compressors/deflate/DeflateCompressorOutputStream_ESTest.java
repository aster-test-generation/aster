
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
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DeflateCompressorOutputStream_ESTest extends DeflateCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(pipedOutputStream0);
      byte[] byteArray0 = new byte[9];
      deflateCompressorOutputStream0.write(byteArray0, 0, 0);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("#d8X?K/kn-!&M[", (String) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
      // Undeclared exception!
      try { 
        deflateCompressorOutputStream0.write((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.deflate.DeflateParameters");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0);
      deflateCompressorOutputStream0.close();
      byte[] byteArray0 = new byte[6];
      try { 
        deflateCompressorOutputStream0.write(byteArray0, 0, 281);
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("ExSE@'g&%=xpPXcL", false);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockFileOutputStream0);
      mockFileOutputStream0.close();
      try { 
        deflateCompressorOutputStream0.write(1283);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile(".?)eF`J^U_", ".?)eF`J^U_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      mockFileOutputStream0.close();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockFileOutputStream0);
      try { 
        deflateCompressorOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("ExSE@'g&%=xpPXcL", false);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockFileOutputStream0);
      mockFileOutputStream0.close();
      try { 
        deflateCompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      deflateParameters0.setWithZlibHeader(false);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = null;
      try {
        deflateCompressorOutputStream0 = new DeflateCompressorOutputStream((OutputStream) null, deflateParameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.deflate.DeflateParameters");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0);
      deflateCompressorOutputStream0.flush();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.deflate.DeflateParameters");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0);
      deflateCompressorOutputStream0.write(609);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.deflate.DeflateParameters");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        deflateCompressorOutputStream0.write(byteArray0, 0, 281);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.compressors.deflate.DeflateParameters");
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0);
      deflateCompressorOutputStream0.finish();
  }
}
