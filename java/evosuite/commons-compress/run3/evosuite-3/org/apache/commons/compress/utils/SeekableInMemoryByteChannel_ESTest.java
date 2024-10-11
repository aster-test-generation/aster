
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
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SeekableByteChannel;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeekableInMemoryByteChannel_ESTest extends SeekableInMemoryByteChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(5L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)0);
      assertNotNull(byteBuffer0);
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.remaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.limit());
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(5L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.remaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.limit());
      assertEquals(0, int0);
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(2147483647L);
      assertNotNull(seekableByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.size());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(0L, seekableByteChannel0.position());
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertNotNull(seekableInMemoryByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(0L);
      assertNotNull(seekableByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.position());
      assertTrue(seekableByteChannel0.isOpen());
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertNotNull(byteBuffer0);
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=4 cap=4]", byteBuffer0.toString());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(4, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(4, byteBuffer0.limit());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(4, byteBuffer0.remaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.position());
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(491L);
      assertNotNull(seekableByteChannel0);
      assertEquals(491L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableByteChannel0.size());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(491L, seekableByteChannel0.position());
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      
      int int0 = seekableByteChannel0.read(byteBuffer0);
      assertEquals(491L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=4 cap=4]", byteBuffer0.toString());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(4, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(4, byteBuffer0.limit());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(4, byteBuffer0.remaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0L, seekableByteChannel0.size());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(491L, seekableByteChannel0.position());
      assertEquals((-1), int0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertNotNull(byteBuffer0);
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(4, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(4, byteBuffer0.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=4 cap=4]", byteBuffer0.toString());
      assertEquals(4, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(4L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(4L, seekableInMemoryByteChannel0.size());
      assertFalse(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasRemaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(4, byteBuffer0.limit());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=4 lim=4 cap=4]", byteBuffer0.toString());
      assertEquals(4, byteBuffer0.capacity());
      assertEquals(4, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(4, int0);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      int int1 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(4L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(4L, seekableInMemoryByteChannel0.size());
      assertFalse(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasRemaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(4, byteBuffer0.limit());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=4 lim=4 cap=4]", byteBuffer0.toString());
      assertEquals(4, byteBuffer0.capacity());
      assertEquals(4, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertFalse(int1 == int0);
      assertEquals((-1), int1);
      assertEquals(4, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1);
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(1L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(2147483647L);
      assertNotNull(seekableByteChannel0);
      assertEquals(2147483647L, seekableInMemoryByteChannel0.position());
      assertEquals(1L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(2147483647L, seekableByteChannel0.position());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(1L, seekableByteChannel0.size());
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(0);
      assertNotNull(seekableInMemoryByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      
      seekableInMemoryByteChannel0.close();
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(312L);
      assertNotNull(seekableByteChannel0);
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.position());
      assertFalse(seekableByteChannel0.isOpen());
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2037);
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(2037L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      assertNotNull(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.capacity());
      assertEquals("java.nio.DirectByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.limit());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasArray());
      
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(2037L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.capacity());
      assertEquals("java.nio.DirectByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.limit());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasArray());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(0);
      assertNotNull(seekableInMemoryByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertNotNull(byteBuffer0);
      assertEquals(0, byteBuffer0.position());
      assertEquals(8, byteBuffer0.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer0.toString());
      assertEquals(8, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasArray());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(8, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertTrue(byteBuffer0.hasRemaining());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(8, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(8L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(8, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=8 cap=8]", byteBuffer0.toString());
      assertEquals(8, byteBuffer0.position());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(8, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(8, int0);
      assertEquals(8, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      long long0 = seekableInMemoryByteChannel0.position();
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(8L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byte[] byteArray1 = seekableInMemoryByteChannel0.array();
      assertNotNull(byteArray1);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertSame(byteArray0, byteArray1);
      assertSame(byteArray1, byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      seekableInMemoryByteChannel0.close();
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      assertNotNull(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.capacity());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.limit());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.isReadOnly());
      
      try { 
        seekableInMemoryByteChannel0.write(byteBuffer0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.write((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      
      seekableInMemoryByteChannel0.close();
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(378);
      assertNotNull(byteBuffer0);
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=378 cap=378]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(378, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(378, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(378, byteBuffer0.limit());
      assertFalse(byteBuffer0.isReadOnly());
      
      try { 
        seekableInMemoryByteChannel0.read(byteBuffer0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(8);
      assertNotNull(seekableInMemoryByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.read((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = null;
      try {
        seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = null;
      try {
        seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel((-323));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1);
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(1L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      seekableInMemoryByteChannel0.close();
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(1L, seekableInMemoryByteChannel0.size());
      
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(1L, seekableInMemoryByteChannel0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(0, int0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      seekableInMemoryByteChannel0.position(3108L);
      seekableInMemoryByteChannel0.truncate(122L);
      assertEquals(122L, seekableInMemoryByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((byte) (-29));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(3387);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3387);
      seekableInMemoryByteChannel0.truncate(255L);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(255L, seekableInMemoryByteChannel0.size());
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(3387);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3387);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(3387, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(0L);
      assertTrue(seekableByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      seekableInMemoryByteChannel0.position(491L);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(491L, seekableInMemoryByteChannel0.position());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      byte[] byteArray1 = seekableInMemoryByteChannel0.array();
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(3387);
      try { 
        seekableInMemoryByteChannel0.position((long) (-1));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      seekableInMemoryByteChannel0.close();
      try { 
        seekableInMemoryByteChannel0.position((-2426L));
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(0L, long0);
  }
}
