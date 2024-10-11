
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


package org.apache.commons.compress.compressors.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.apache.commons.compress.compressors.pack200.Pack200Strategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Pack200CompressorOutputStream_ESTest extends Pack200CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      Pack200Strategy pack200Strategy0 = Pack200Strategy.IN_MEMORY;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(bufferedOutputStream0, pack200Strategy0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("5M~hG7w&4eF", "5M~hG7w&4eF");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(mockFileOutputStream0, (Map<String, String>) null);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.write((byte[]) null, 0, (-861));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      Pack200Strategy pack200Strategy0 = Pack200Strategy.IN_MEMORY;
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(byteArrayOutputStream0, pack200Strategy0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.write(byteArray0, (-1), 1066);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.write((byte[]) null);
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
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("uxEq5?Sa-y");
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(mockFileOutputStream0);
      try { 
        pack200CompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      pack200CompressorOutputStream0.write(byteArray0, 0, 0);
      assertEquals(6, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null);
      pack200CompressorOutputStream0.write(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream((OutputStream) null);
      byte[] byteArray0 = new byte[6];
      pack200CompressorOutputStream0.write(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(byteArrayOutputStream0, (Map<String, String>) null);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.finish();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // archive.3E
         //
         verifyException("org.apache.commons.compress.java.util.jar.Pack200", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("uxEq5?Sa-y");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      Pack200CompressorOutputStream pack200CompressorOutputStream0 = new Pack200CompressorOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        pack200CompressorOutputStream0.close();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // archive.3E
         //
         verifyException("org.apache.commons.compress.java.util.jar.Pack200", e);
      }
  }
}
