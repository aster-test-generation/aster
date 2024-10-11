
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import org.apache.commons.compress.utils.FixedLengthBlockOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FixedLengthBlockOutputStream_ESTest extends FixedLengthBlockOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1375);
      byte[] byteArray0 = new byte[4];
      MockFile mockFile0 = new MockFile("zp0^c*n-| Hv/4;s", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 62);
      fixedLengthBlockOutputStream0.write(byteArray0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(1364L, mockFile0.length());
      assertEquals(1375, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(198);
      byte[] byteArray0 = new byte[3];
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 1805);
      fixedLengthBlockOutputStream0.write(byteArray0, 0, (int) (byte)1);
      fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)1, 1);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1805);
      byteBuffer0.putShort((short) (byte)1);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(1805, byteArrayOutputStream0.size());
      assertEquals(1803, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 1);
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, 0, (int) (byte)81);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = MockFile.createTempFile("M\"}%8b", "M\"}%8b");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(fileChannel0, 0);
      byte[] byteArray0 = new byte[7];
      fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)46, (int) (byte) (-10));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("3A_6{+zxfJ");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(fileChannel0, 24);
      fixedLengthBlockOutputStream0.write((-2697));
      fixedLengthBlockOutputStream0.close();
      assertFalse(fileChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1375);
      byteBuffer0.putInt(1375);
      byteBuffer0.putLong((-553L));
      byteBuffer0.flip();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("<)VPo6Wc7z2iv2%", true);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, (byte)10);
      fixedLengthBlockOutputStream0.write(byteBuffer0);
      fixedLengthBlockOutputStream0.flushBlock();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 14);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(110);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=110 lim=110 cap=110]", byteBuffer0.toString());
      assertEquals(110, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 1);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = fixedLengthBlockOutputStream0.write(byteBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteArray0, 0, (int) (byte)50);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (int) (byte)0, (int) (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 0);
      byte[] byteArray0 = new byte[5];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, 2);
      // Undeclared exception!
      fixedLengthBlockOutputStream0.write(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 686);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("EycT?j", true);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockFileOutputStream0, 0);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write((-111));
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
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((WritableByteChannel) null, 1369);
      // Undeclared exception!
      try { 
        fixedLengthBlockOutputStream0.write(1369);
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
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 289);
      fixedLengthBlockOutputStream0.write(289);
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
  public void test15()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(socketChannel0, (-12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative capacity: -12
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = null;
      try {
        fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(bufferedOutputStream0, (-1930));
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
      MockPrintStream mockPrintStream0 = new MockPrintStream("pOo7il~^r[hY(BK");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 1550);
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("pOo7il~^r[hY(BK");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 1550);
      fixedLengthBlockOutputStream0.close();
      boolean boolean0 = fixedLengthBlockOutputStream0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("pOo7il~^r[hY(BK");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 1550);
      fixedLengthBlockOutputStream0.flushBlock();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(byteArrayOutputStream0, 0);
      fixedLengthBlockOutputStream0.close();
      try { 
        fixedLengthBlockOutputStream0.write((int) (byte)118);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.FixedLengthBlockOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("pOo7il~^r[hY(BK");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 1550);
      fixedLengthBlockOutputStream0.close();
      byte[] byteArray0 = new byte[7];
      try { 
        fixedLengthBlockOutputStream0.write(byteArray0, (-1136), 1550);
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
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 849);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(8);
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
  public void test23()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(pipedOutputStream0, 2);
      fixedLengthBlockOutputStream0.write(343);
      try { 
        fixedLengthBlockOutputStream0.flushBlock();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("pOo7il~^r[hY(BK");
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(mockPrintStream0, 1550);
      fixedLengthBlockOutputStream0.close();
      fixedLengthBlockOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream((OutputStream) null, 9);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(9);
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
  public void test26()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      FixedLengthBlockOutputStream fixedLengthBlockOutputStream0 = new FixedLengthBlockOutputStream(filterOutputStream0, 1);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
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
  public void test27()  throws Throwable  {
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
