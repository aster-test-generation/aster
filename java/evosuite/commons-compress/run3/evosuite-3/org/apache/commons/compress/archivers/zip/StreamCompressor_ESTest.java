
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.util.zip.Deflater;
import org.apache.commons.compress.archivers.zip.StreamCompressor;
import org.apache.commons.compress.parallel.ScatterGatherBackingStore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StreamCompressor_ESTest extends StreamCompressor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Deflater deflater0 = new Deflater((-1));
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0, deflater0);
      streamCompressor0.deflate();
      byte[] byteArray0 = new byte[6];
      long long0 = streamCompressor0.write(byteArray0, 0, (byte)0, (byte)1);
      assertEquals(2L, streamCompressor0.getTotalBytesWritten());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      streamCompressor0.deflate(byteArrayInputStream0, 541);
      assertEquals(3523407757L, streamCompressor0.getCrc32());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor");
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
      byte[] byteArray0 = new byte[1];
      streamCompressor0.writeCounted(byteArray0, (-1), (int) (byte)0);
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore", ")gG");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      streamCompressor0.reset();
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
      assertEquals(0L, streamCompressor0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("qgWkzw0#e j", "org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      Deflater deflater0 = new Deflater((-1));
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0, deflater0);
      streamCompressor0.flushDeflater();
      assertEquals(8L, deflater0.getBytesWritten());
      assertEquals(8L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) objectOutputStream0, deflater0);
      long long0 = streamCompressor0.write(byteArray0, 2, 1, 601);
      assertEquals(3523407757L, streamCompressor0.getCrc32());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      streamCompressor0.deflate(byteArrayInputStream0, (byte)1);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(3523407757L, streamCompressor0.getCrc32());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.StreamCompressor");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      streamCompressor0.deflate(byteArrayInputStream0, (byte)1);
      long long0 = streamCompressor0.getCrc32();
      assertEquals(3523407757L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      streamCompressor0.deflate(byteArrayInputStream0, (byte)1);
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(3523407757L, streamCompressor0.getCrc32());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore", ")gG");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted((byte[]) null, 928, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("W");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, (-3864), 3222);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "org.apache.commons.compress.archivers.zip.StreamCompressor");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0);
      byte[] byteArray0 = new byte[2];
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte)0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("V~15cTCde^T]q-A}v|");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((DataOutput) dataOutputStream0, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0);
      byte[] byteArray0 = new byte[0];
      try { 
        streamCompressor0.writeCounted(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore", false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockFileOutputStream0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, 4068, (-466), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.CRC32", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, (Deflater) null);
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = mockFileInputStream0.getChannel();
      Deflater deflater0 = new Deflater(0);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.flushDeflater();
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
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
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      FileChannel fileChannel0 = mockFileInputStream0.getChannel();
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, (Deflater) null);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(mockFileInputStream0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-52), 1);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate(byteArrayInputStream0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        streamCompressor0.deflate(bufferedInputStream0, (byte)1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = MockFile.createTempFile(",rG/@#,|%\"=sqK1", ",rG/@#,|%\"=sqK1");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      FileChannel fileChannel0 = mockFileInputStream0.getChannel();
      Deflater deflater0 = new Deflater(1, false);
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) fileChannel0, deflater0);
      // Undeclared exception!
      try { 
        streamCompressor0.deflate();
        fail("Expecting exception: NonWritableChannelException");
      
      } catch(NonWritableChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.EvoFileChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.compress.archivers.zip.StreamCompressor$ScatterGatherBackingStoreCompressor");
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0, deflater0);
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
  public void test23()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create(0, (ScatterGatherBackingStore) null);
      streamCompressor0.deflate();
      assertEquals(0L, streamCompressor0.getBytesWrittenForLastEntry());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamCompressor.create(1647, (ScatterGatherBackingStore) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, (Deflater) null);
      byte[] byteArray0 = new byte[2];
      streamCompressor0.write(byteArray0, (byte)0, (byte)0, 8);
      assertEquals(0L, streamCompressor0.getBytesRead());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, (Deflater) null);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        streamCompressor0.write(byteArray0, (byte)1, (byte)1, (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor$SeekableByteChannelCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.&c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      streamCompressor0.deflate(byteArrayInputStream0, (byte)8);
      long long0 = streamCompressor0.getBytesRead();
      assertEquals(3523407757L, streamCompressor0.getCrc32());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.&c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      long long0 = streamCompressor0.getTotalBytesWritten();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((ScatterGatherBackingStore) null);
      long long0 = streamCompressor0.getBytesWrittenForLastEntry();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.&c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      byte[] byteArray0 = new byte[6];
      streamCompressor0.writeCounted(byteArray0);
      assertEquals(6L, streamCompressor0.getTotalBytesWritten());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) pipedOutputStream0);
      long long0 = streamCompressor0.getCrc32();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("O$.&c$De}5");
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) mockPrintStream0);
      long long0 = streamCompressor0.getBytesRead();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StreamCompressor streamCompressor0 = StreamCompressor.create((SeekableByteChannel) null, (Deflater) null);
      // Undeclared exception!
      try { 
        streamCompressor0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.StreamCompressor", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Deflater deflater0 = new Deflater();
      StreamCompressor streamCompressor0 = StreamCompressor.create((OutputStream) byteArrayOutputStream0, deflater0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        streamCompressor0.writeCounted(byteArray0, (int) (byte) (-119), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }
}
