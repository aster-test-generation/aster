
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
      MockFile mockFile0 = new MockFile(">T~", ">T~");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
      byte[] byteArray0 = new byte[1];
      deflateCompressorOutputStream0.write(byteArray0, 0, (int) (byte)0);
      assertEquals(0L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2118);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(byteArrayOutputStream0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        deflateCompressorOutputStream0.write(byteArray0, 0, (int) (byte) (-4));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.DeflaterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Xv%tbcc", "]C5>[$|:wT*");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(dataOutputStream0);
      byte[] byteArray0 = new byte[2];
      deflateCompressorOutputStream0.finish();
      try { 
        deflateCompressorOutputStream0.write(byteArray0, 0, (-1));
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
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        deflateCompressorOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("|1T9%p/_=1 ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      bufferedOutputStream0.close();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(bufferedOutputStream0);
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
  public void test05()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9GQ|hG?B8M&Y^*c.m`@", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      deflateParameters0.setWithZlibHeader(false);
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9GQ|hG?B8M&Y^*c.m`@", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
      deflateCompressorOutputStream0.flush();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9GQ|hG?B8M&Y^*c.m`@", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
      deflateCompressorOutputStream0.write(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9GQ|hG?B8M&Y^*c.m`@", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(mockPrintStream0, deflateParameters0);
      deflateCompressorOutputStream0.finish();
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
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DeflateParameters deflateParameters0 = new DeflateParameters();
      DeflateCompressorOutputStream deflateCompressorOutputStream0 = new DeflateCompressorOutputStream(byteArrayOutputStream0, deflateParameters0);
      deflateCompressorOutputStream0.close();
      assertEquals("x\uFFFD\u0003\u0000\u0000\u0000\u0000\u0001", byteArrayOutputStream0.toString());
      assertEquals(8, byteArrayOutputStream0.size());
  }
}
