
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.nio.channels.SeekableByteChannel;
import java.util.Enumeration;
import java.util.zip.Deflater;
import org.apache.commons.compress.archivers.zip.StreamCompressor;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StreamCompressor_ESTest extends StreamCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.StreamCompressor");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[3];
      streamCompressor0.writeCounted(byteArray0, 0, (int) (byte)0);
      assertEquals(0L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("hpOn`H\"E{4yG", false);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      byte[] byteArray0 = new byte[5];
      streamCompressor0.writeCounted(byteArray0);
      assertEquals(5L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("05.");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      streamCompressor0.flushDeflater();
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(8, deflater0.getTotalOut());
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("hpOn`H\"E{4yG", false);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      streamCompressor0.deflate(byteArrayInputStream0, 365);
      long long0 = streamCompressor0.getBytesRead();
      assertEquals(2982322595L, streamCompressor0.getCrc32());
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) null);
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted((byte[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$OutputStreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, 1, 0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, 4497, (byte)0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      streamCompressor0.close();
      // Undeclared exception!
      try { 
        streamCompressor0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Deflater has been closed
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.flushDeflater();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2540);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        streamCompressor0.deflate(pipedInputStream0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("hpOn`H\"E{4yG", false);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      streamCompressor0.close();
      // Undeclared exception!
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Deflater has been closed
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("hpOn`H\"E{4yG");
      mockFileOutputStream0.close();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamCompressor.create(2903, (ScatterGatherBackingStore) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(byteArrayInputStream0, (byte) (-106));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$DataOutputCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "Ts@Yq.Cl)");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Deflater deflater0 = new Deflater(1);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) objectOutputStream0, deflater0);
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      streamCompressor0.deflate(sequenceInputStream0, 1);
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      streamCompressor0.deflate();
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "Ts@Yq.Cl)");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Deflater deflater0 = new Deflater(1);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) objectOutputStream0, deflater0);
      streamCompressor0.deflate();
      assertEquals(2, deflater0.getTotalOut());
      assertEquals(2L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      streamCompressor0.reset();
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, deflater0);
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "Ts@Yq.Cl)");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Deflater deflater0 = new Deflater(1);
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) objectOutputStream0, deflater0);
      long long0 = streamCompressor0.getCrc32();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      long long0 = streamCompressor0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, deflater0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte)1, (-3683));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0);
      streamCompressor0.flushDeflater();
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(2, byteArrayOutputStream0.size());
      assertEquals(2L, long0);
  }
}
