
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import org.apache.commons.compress.utils.FixedLengthBlockOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FixedLengthBlockOutputStream_ESTest extends FixedLengthBlockOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      byte[] byteArray0 = new byte[7];
      fixedLengthBlockOutputStream0.write(byteArray0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream1 = new FixedLengthBlockOutputStream((WritableByteChannel) fixedLengthBlockOutputStream0, 2610);
      fixedLengthBlockOutputStream1.write(2);
      try { 
        fixedLengthBlockOutputStream1.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Direct buffer somehow written to BufferAtATimeOutputChannel
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      byte[] byteArray0 = new byte[16];
      fixedLengthBlockOutputStream0.write(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(714);
      byteBuffer0.putInt((-1));
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(714, byteBuffer0.position());
      assertEquals(710, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 259);
      fixedLengthBlockOutputStream0.write(byteBuffer0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, 0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)2, (int) (byte)33);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, 0, (int) (byte)91);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 1);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, 0, 2320);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(")0!T3I;C", false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(250);
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OutputStream outputStream0 = null;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel0, 7);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(7);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 1663);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(639);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(874);
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(")0!T3I;C", false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write((-364));
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "jo3wmOLzxCY2:");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFile0.delete();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 1);
      try { 
        fixedLengthBlockOutputStream0.write(3959);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.isOpen();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel0, 2248);
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.compress.utils.FixedLengthBlockOutputStream");
      byteArray0[0] = (byte) (-125);
      byteArray0[1] = (byte)51;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)9;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      fixedLengthBlockOutputStream0.write(byteArray0);
      byteArray0[5] = (byte) (-33);
      byteArray0[7] = (byte)7;
      fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte) (-125));
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream1 = new FixedLengthBlockOutputStream((OutputStream) fixedLengthBlockOutputStream0, 2248);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.flushBlock();
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream1 = new FixedLengthBlockOutputStream((WritableByteChannel) fixedLengthBlockOutputStream0, 2610);
      fixedLengthBlockOutputStream1.write(2);
      try { 
        fixedLengthBlockOutputStream1.flushBlock();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Direct buffer somehow written to BufferAtATimeOutputChannel
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel0, (-988));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative capacity: -988
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 1);
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=3 lim=3 cap=3]", byteBuffer0.toString());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("S:#W> Lr5", false);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(fileChannel0, 0);
      fixedLengthBlockOutputStream0.close();
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertFalse(fileChannel0.isOpen());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      fixedLengthBlockOutputStream0.flushBlock();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 1051);
      fixedLengthBlockOutputStream0.write(1497);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.flushBlock();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      byte[] byteArray0 = new byte[7];
      dataOutputStream0.close();
      fixedLengthBlockOutputStream0.write(byteArray0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream1 = new FixedLengthBlockOutputStream((WritableByteChannel) fixedLengthBlockOutputStream0, 2610);
      try { 
        fixedLengthBlockOutputStream1.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(714);
      fixedLengthBlockOutputStream0.close();
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      fixedLengthBlockOutputStream0.close();
      byte[] byteArray0 = new byte[9];
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (-13), (int) (byte)75);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 8);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)1);
      fixedLengthBlockOutputStream0.write(byteBuffer0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("YCJs94Y)qRwJ@0-&H");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      fixedLengthBlockOutputStream0.close();
      fixedLengthBlockOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      File file0 = MockFile.createTempFile("YCJs94Y)qRwJ@0-&H", "YCJs94Y)qRwJ@0-&H");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(dataOutputStream0, 714);
      fixedLengthBlockOutputStream0.close();
      try { 
        fixedLengthBlockOutputStream0.write(714);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 1);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }
}
