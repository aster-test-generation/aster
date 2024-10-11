
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.dump.TapeInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TapeInputStream_ESTest extends TapeInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.skip((byte) (-94));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        tapeInputStream0.read(byteArray0, 982, (int) (byte) (-29));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)3, (byte)66);
      TapeInputStream tapeInputStream0 = new TapeInputStream(byteArrayInputStream0);
      int int0 = tapeInputStream0.available();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (-918));
      TapeInputStream tapeInputStream0 = new TapeInputStream(byteArrayInputStream0);
      int int0 = tapeInputStream0.available();
      assertEquals((-918), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(3469);
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.readRecord();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      try { 
        tapeInputStream0.readRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Input buffer is closed
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      try { 
        tapeInputStream0.peek();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Input buffer is closed
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(enumeration0).hasMoreElements();
      doReturn((Object) null).when(enumeration0).nextElement();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.SequenceInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        tapeInputStream0.available();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(mockFileInputStream0);
      try { 
        tapeInputStream0.available();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.skip(6L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1286);
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      long long0 = tapeInputStream0.skip(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      try { 
        tapeInputStream0.resetBlockSize(268435455, false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Block size cannot be less than or equal to 0: -1024
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(dataInputStream0);
      try { 
        tapeInputStream0.resetBlockSize(0, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Block with 0 records found, must be at least 1
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        tapeInputStream0.resetBlockSize(5, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      byte[] byteArray0 = new byte[0];
      try { 
        tapeInputStream0.read(byteArray0, (-253), 138240);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Input buffer is closed
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(138240);
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        tapeInputStream0.read(byteArray0, (-253), 138240);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1286);
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      byte[] byteArray0 = new byte[0];
      int int0 = tapeInputStream0.read(byteArray0, 1286, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      TapeInputStream tapeInputStream0 = new TapeInputStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        tapeInputStream0.read(byteArray0, (-755), 1151);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.peek();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      TapeInputStream tapeInputStream0 = new TapeInputStream(bufferedInputStream0);
      tapeInputStream0.close();
      assertEquals(0L, tapeInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TapeInputStream tapeInputStream0 = new TapeInputStream((InputStream) null);
      tapeInputStream0.close();
      assertEquals(0L, tapeInputStream0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(1286);
      TapeInputStream tapeInputStream0 = new TapeInputStream(pipedInputStream0);
      int int0 = tapeInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      TapeInputStream tapeInputStream0 = new TapeInputStream(bufferedInputStream0);
      long long0 = tapeInputStream0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      TapeInputStream tapeInputStream0 = new TapeInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        tapeInputStream0.read();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All reads must be multiple of record size (1024 bytes.
         //
         verifyException("org.apache.commons.compress.archivers.dump.TapeInputStream", e);
      }
  }
}
