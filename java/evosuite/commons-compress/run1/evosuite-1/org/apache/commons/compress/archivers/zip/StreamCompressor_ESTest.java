
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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.zip.Deflater;
import org.apache.commons.compress.archivers.zip.StreamCompressor;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StreamCompressor_ESTest extends StreamCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0);
      byte[] byteArray0 = new byte[7];
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)121);
      pipedOutputStream0.connect(pipedInputStream0);
      streamCompressor0.flushDeflater();
      long long0 = streamCompressor0.write(byteArray0, (byte)0, 0, 1436);
      assertEquals(2L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-1));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      streamCompressor0.deflate(dataInputStream0, (byte)0);
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("5Q(lk='\"8IC3;8B");
      Deflater deflater0 = new Deflater();
      byte[] byteArray0 = new byte[6];
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      streamCompressor0.writeCounted(byteArray0, 3323, 8);
      assertEquals(8L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) filterOutputStream0);
      streamCompressor0.reset();
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("A`I(", true);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      streamCompressor0.deflate();
      assertEquals(2L, deflater0.getBytesWritten());
      assertEquals(2L, fileChannel0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0);
      byte[] byteArray0 = new byte[7];
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)121);
      pipedOutputStream0.connect(pipedInputStream0);
      long long0 = streamCompressor0.write(byteArray0, (byte)0, 0, 1436);
      assertEquals(0L, streamCompressor0.getTotalBytesWritten());
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0);
      byte[] byteArray0 = new byte[8];
      PipedInputStream pipedInputStream0 = new PipedInputStream((byte)121);
      pipedOutputStream0.connect(pipedInputStream0);
      long long0 = streamCompressor0.write(byteArray0, (byte)0, 8, 1436);
      assertEquals(1696784233L, streamCompressor0.getCrc32());
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("S", "gUu_N)vn8u");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      byte[] byteArray0 = new byte[1];
      streamCompressor0.writeCounted(byteArray0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(1L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("y&Cut$ES/87+E");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) dataOutputStream0, deflater0);
      streamCompressor0.deflate();
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(2L, deflater0.getBytesWritten());
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte)0, 138);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte)5, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[3];
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
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("{bTjA4");
      Deflater deflater0 = new Deflater(0, false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.write((byte[]) null, 1911, 0, 1911);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_3;J K'Y#J6}[j");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, (byte)67, (-1), (byte) (-5));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("S", "gUu_N)vn8u");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      byte[] byteArray0 = new byte[1];
      try { 
        streamCompressor0.write(byteArray0, (byte)0, (byte)0, (byte)0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) null, (Deflater) null);
      // Undeclared exception!
      try { 
        streamCompressor0.reset();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      // Undeclared exception!
      try { 
        streamCompressor0.flushDeflater();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0);
      try { 
        streamCompressor0.flushDeflater();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Deflater deflater0 = new Deflater((-1));
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0, deflater0);
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamCompressor.create(8192, (ScatterGatherBackingStore) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("5Q(lk='\"8IC3;8B");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) objectOutputStream0, deflater0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte)111, (-696));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-1));
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(dataInputStream0, 8);
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
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 292, (byte)53);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      streamCompressor0.deflate(dataInputStream0, (byte)9);
      assertEquals(0L, streamCompressor0.getBytesRead());
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_3;J K'Y#J6}[j");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) dataOutputStream0);
      streamCompressor0.deflate();
      assertEquals(0L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte)91);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(dataInputStream0, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      streamCompressor0.close();
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.StreamCompressor");
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 1855);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, (InputStream) null);
      try { 
        streamCompressor0.deflate(sequenceInputStream0, 1115);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, deflater0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      long long0 = streamCompressor0.getCrc32();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      long long0 = streamCompressor0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", e);
      }
  }
}
