
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
import java.io.ByteArrayOutputStream;
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
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2);
      byte[] byteArray0 = new byte[5];
      fixedLengthBlockOutputStream0.write(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(4, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2905);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2905);
      byte[] byteArray0 = new byte[8];
      fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)0, (-1));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 2576);
      byte[] byteArray0 = new byte[5];
      fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)4, 1);
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
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 2);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[6];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.DSYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      openOptionArray0[3] = (OpenOption) standardOpenOption0;
      openOptionArray0[4] = (OpenOption) standardOpenOption0;
      openOptionArray0[5] = (OpenOption) standardOpenOption0;
      FileChannel fileChannel0 = FileChannel.open(path0, openOptionArray0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(fileChannel0, 24);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)0;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      byteArray0[4] = (byte)0;
      byteArray0[6] = (byte)92;
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET;
      standardProtocolFamily0.name();
      StandardProtocolFamily.values();
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel0, (byte)0);
      String string0 = "W@rSl ;#&u. *r";
      String string1 = "";
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray1, (int) (byte)0, 152);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 806);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write((byte[]) null, 806, 806);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, 1);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (-1979), 3143);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = MockFile.createTempFile("vigUcV", "LwG~");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, (byte)0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, 0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 0);
      byte[] byteArray0 = new byte[5];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel0, 1);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(1);
        fail("Expecting exception: NotYetConnectedException");
      
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(datagramChannel0, 0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 7);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 0);
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
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 1638);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream1 = null;
      try {
        fixedLengthBlockOutputStream1 = new FixedLengthBlockOutputStream((WritableByteChannel) fixedLengthBlockOutputStream0, (-2804));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative capacity: -2804
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("78v?6,6 dhjK}>p]a6");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative capacity: -1
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 2576);
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2);
      fixedLengthBlockOutputStream0.close();
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 1);
      fixedLengthBlockOutputStream0.flushBlock();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1135);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 1135);
      byte[] byteArray0 = new byte[8];
      fixedLengthBlockOutputStream0.write(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1135);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(1135, byteArrayOutputStream0.size());
      assertEquals(1135, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2905);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2905);
      byte[] byteArray0 = new byte[8];
      fixedLengthBlockOutputStream0.close();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test22()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("|");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 603);
      fixedLengthBlockOutputStream0.close();
      byte[] byteArray0 = new byte[1];
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (-477), (int) (byte) (-5));
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2905);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2905);
      byte[] byteArray0 = new byte[8];
      fixedLengthBlockOutputStream0.write(byteArray0);
      fixedLengthBlockOutputStream0.close();
      assertEquals(2905, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      MockFile mockFile0 = new MockFile("wuRq/VYc8F/");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, (byte)0);
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteArray0, 0, 2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2905);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2905);
      fixedLengthBlockOutputStream0.close();
      fixedLengthBlockOutputStream0.close();
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 0);
      try { 
        fixedLengthBlockOutputStream0.write(byteBuffer0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Direct buffer somehow written to BufferAtATimeOutputChannel
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream$BufferAtATimeOutputChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2);
      fixedLengthBlockOutputStream0.write((int) (byte)0);
      fixedLengthBlockOutputStream0.close();
      assertEquals("\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(2, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 2);
      fixedLengthBlockOutputStream0.close();
      try { 
        fixedLengthBlockOutputStream0.write(0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
}
