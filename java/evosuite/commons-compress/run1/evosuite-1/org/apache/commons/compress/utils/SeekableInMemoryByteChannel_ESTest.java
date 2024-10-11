
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
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.ReadOnlyBufferException;
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
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1073741823);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      long long0 = (-158L);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((-158L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = seekableInMemoryByteChannel0.array();
      long long0 = 2147483647L;
      seekableInMemoryByteChannel0.position(2147483647L);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.read(byteBuffer0);
      byteBuffer0.order((ByteOrder) null);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((-977L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-101);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byte byte1 = (byte) (-93);
      byteArray0[6] = (byte) (-93);
      byteArray0[7] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      byteBuffer0.asReadOnlyBuffer();
      byteBuffer0.slice();
      seekableInMemoryByteChannel0.write(byteBuffer0);
      seekableInMemoryByteChannel0.position((long) (byte)0);
      seekableInMemoryByteChannel0.isOpen();
      seekableInMemoryByteChannel0.size();
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.read(byteBuffer1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBufferR", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-6);
      byteArray0[3] = (byte)33;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1446);
      seekableInMemoryByteChannel0.read(byteBuffer0);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(1442, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(3490);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(3490L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-62);
      byteArray0[2] = (byte)31;
      byteArray0[3] = (byte)1;
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1789569706);
      assertEquals(1789569706, byteBuffer0.limit());
      assertEquals("java.nio.DirectByteBuffer[pos=0 lim=1789569706 cap=1789569706]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(1789569706, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(1789569706, byteBuffer0.remaining());
      assertFalse(byteBuffer0.hasArray());
      assertNotNull(byteBuffer0);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(1789569706, int0);
      assertEquals(1789569706L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(1789569706L, seekableInMemoryByteChannel0.position());
      assertEquals(1789569706, byteBuffer0.limit());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(1789569706, byteBuffer0.capacity());
      assertEquals(1789569706, byteBuffer0.position());
      assertTrue(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasArray());
      assertEquals("java.nio.DirectByteBuffer[pos=1789569706 lim=1789569706 cap=1789569706]", byteBuffer0.toString());
      
      byteArray0[3] = (byte) (-33);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-44);
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-62), (byte)31, (byte) (-33), (byte)0, (byte)0, (byte)0, (byte) (-44)}, byteArray0);
      assertFalse(byteBuffer1.equals((Object)byteBuffer0));
      assertFalse(byteBuffer1.isDirect());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer1.toString());
      assertEquals(0, byteBuffer1.position());
      assertTrue(byteBuffer1.hasArray());
      assertFalse(byteBuffer1.isReadOnly());
      assertEquals(8, byteBuffer1.capacity());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(8, byteBuffer1.remaining());
      assertEquals(0, byteBuffer1.arrayOffset());
      assertEquals(8, byteBuffer1.limit());
      assertNotNull(byteBuffer1);
      assertEquals(8, byteArray0.length);
      
      ByteBuffer byteBuffer2 = byteBuffer1.asReadOnlyBuffer();
      assertArrayEquals(new byte[] {(byte)0, (byte) (-62), (byte)31, (byte) (-33), (byte)0, (byte)0, (byte)0, (byte) (-44)}, byteArray0);
      assertFalse(byteBuffer1.equals((Object)byteBuffer0));
      assertFalse(byteBuffer2.equals((Object)byteBuffer0));
      assertTrue(byteBuffer2.equals((Object)byteBuffer1));
      assertFalse(byteBuffer1.isDirect());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer1.toString());
      assertEquals(0, byteBuffer1.position());
      assertTrue(byteBuffer1.hasArray());
      assertFalse(byteBuffer1.isReadOnly());
      assertEquals(8, byteBuffer1.capacity());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(8, byteBuffer1.remaining());
      assertEquals(0, byteBuffer1.arrayOffset());
      assertEquals(8, byteBuffer1.limit());
      assertEquals("java.nio.HeapByteBufferR[pos=0 lim=8 cap=8]", byteBuffer2.toString());
      assertEquals(8, byteBuffer2.limit());
      assertFalse(byteBuffer2.isDirect());
      assertTrue(byteBuffer2.hasRemaining());
      assertEquals(0, byteBuffer2.position());
      assertFalse(byteBuffer2.hasArray());
      assertEquals(8, byteBuffer2.remaining());
      assertTrue(byteBuffer2.isReadOnly());
      assertEquals(8, byteBuffer2.capacity());
      assertNotNull(byteBuffer2);
      assertEquals(8, byteArray0.length);
      
      int int1 = seekableInMemoryByteChannel0.read(byteBuffer1);
      assertEquals((-1), int1);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-62), (byte)31, (byte) (-33), (byte)0, (byte)0, (byte)0, (byte) (-44)}, byteArray0);
      assertFalse(byteBuffer1.equals((Object)byteBuffer0));
      assertTrue(byteBuffer1.equals((Object)byteBuffer2));
      assertFalse(int1 == int0);
      assertEquals(1789569706L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(1789569706L, seekableInMemoryByteChannel0.position());
      assertFalse(byteBuffer1.isDirect());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer1.toString());
      assertEquals(0, byteBuffer1.position());
      assertTrue(byteBuffer1.hasArray());
      assertFalse(byteBuffer1.isReadOnly());
      assertEquals(8, byteBuffer1.capacity());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(8, byteBuffer1.remaining());
      assertEquals(0, byteBuffer1.arrayOffset());
      assertEquals(8, byteBuffer1.limit());
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertNotNull(seekableInMemoryByteChannel0);
      
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(0L, long0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      byte[] byteArray0 = seekableInMemoryByteChannel0.array();
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertNotNull(byteArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertNotNull(seekableInMemoryByteChannel0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(0L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableByteChannel0.position());
      assertEquals(0L, seekableByteChannel0.size());
      assertTrue(seekableByteChannel0.isOpen());
      assertNotNull(seekableByteChannel0);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(286);
      assertEquals(0, byteBuffer0.position());
      assertEquals(286, byteBuffer0.limit());
      assertTrue(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasArray());
      assertEquals(286, byteBuffer0.remaining());
      assertEquals("java.nio.DirectByteBuffer[pos=0 lim=286 cap=286]", byteBuffer0.toString());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(286, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertNotNull(byteBuffer0);
      
      SeekableByteChannel seekableByteChannel1 = seekableInMemoryByteChannel0.position((long) 286);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel1, seekableByteChannel0);
      assertSame(seekableByteChannel1, seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(286L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableByteChannel1.size());
      assertEquals(286L, seekableByteChannel1.position());
      assertTrue(seekableByteChannel1.isOpen());
      assertNotNull(seekableByteChannel1);
      
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals((-1), int0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(286L, seekableInMemoryByteChannel0.position());
      assertEquals(0, byteBuffer0.position());
      assertEquals(286, byteBuffer0.limit());
      assertTrue(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasArray());
      assertEquals(286, byteBuffer0.remaining());
      assertEquals("java.nio.DirectByteBuffer[pos=0 lim=286 cap=286]", byteBuffer0.toString());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(286, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      
      // Undeclared exception!
      try { 
        byteBuffer0.putShort((-1156), (short)0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2377);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(2377L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(2208L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(2208L, seekableInMemoryByteChannel0.position());
      assertEquals(2377L, seekableInMemoryByteChannel0.size());
      assertEquals(2377L, seekableByteChannel0.size());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(2208L, seekableByteChannel0.position());
      assertNotNull(seekableByteChannel0);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2377);
      assertEquals(2377, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasRemaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(2377, byteBuffer0.capacity());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=2377 cap=2377]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(2377, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.isReadOnly());
      assertNotNull(byteBuffer0);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals(2377, int0);
      assertEquals(4585L, seekableInMemoryByteChannel0.position());
      assertEquals(4585L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(2377, byteBuffer0.limit());
      assertEquals(2377, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(2377, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=2377 lim=2377 cap=2377]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isReadOnly());
      
      SeekableByteChannel seekableByteChannel1 = seekableInMemoryByteChannel0.position(0L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableByteChannel1, seekableInMemoryByteChannel0);
      assertSame(seekableByteChannel1, seekableByteChannel0);
      assertEquals(4585L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(4585L, seekableByteChannel1.size());
      assertTrue(seekableByteChannel1.isOpen());
      assertEquals(0L, seekableByteChannel1.position());
      assertNotNull(seekableByteChannel1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-7);
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-7)}, byteArray0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(1L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(1, byteArray0.length);
      
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
  public void test09()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1353);
      assertEquals(1353L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertNotNull(seekableInMemoryByteChannel0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(1353);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertEquals(1353L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(1353L, seekableByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.position());
      assertTrue(seekableByteChannel0.isOpen());
      assertNotNull(seekableByteChannel0);
      
      SeekableByteChannel seekableByteChannel1 = seekableInMemoryByteChannel0.position((long) 1353);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableByteChannel1, seekableByteChannel0);
      assertSame(seekableByteChannel1, seekableInMemoryByteChannel0);
      assertEquals(1353L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(1353L, seekableInMemoryByteChannel0.position());
      assertEquals(1353L, seekableByteChannel1.size());
      assertEquals(1353L, seekableByteChannel1.position());
      assertTrue(seekableByteChannel1.isOpen());
      assertNotNull(seekableByteChannel1);
      
      SeekableByteChannel seekableByteChannel2 = seekableInMemoryByteChannel0.position((long) 1353);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableByteChannel2, seekableByteChannel1);
      assertSame(seekableByteChannel2, seekableByteChannel0);
      assertSame(seekableByteChannel2, seekableInMemoryByteChannel0);
      assertEquals(1353L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(1353L, seekableInMemoryByteChannel0.position());
      assertEquals(1353L, seekableByteChannel2.size());
      assertEquals(1353L, seekableByteChannel2.position());
      assertTrue(seekableByteChannel2.isOpen());
      assertNotNull(seekableByteChannel2);
      
      SeekableByteChannel seekableByteChannel3 = seekableInMemoryByteChannel0.truncate(1353);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel3);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableByteChannel3, seekableByteChannel0);
      assertSame(seekableByteChannel3, seekableByteChannel2);
      assertSame(seekableByteChannel3, seekableByteChannel1);
      assertSame(seekableByteChannel3, seekableInMemoryByteChannel0);
      assertEquals(1353L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(1353L, seekableInMemoryByteChannel0.position());
      assertEquals(1353L, seekableByteChannel3.size());
      assertTrue(seekableByteChannel3.isOpen());
      assertEquals(1353L, seekableByteChannel3.position());
      assertNotNull(seekableByteChannel3);
      
      SeekableByteChannel seekableByteChannel4 = seekableInMemoryByteChannel0.truncate(0L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel4);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel3);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableByteChannel4, seekableByteChannel3);
      assertSame(seekableByteChannel4, seekableByteChannel0);
      assertSame(seekableByteChannel4, seekableInMemoryByteChannel0);
      assertSame(seekableByteChannel4, seekableByteChannel2);
      assertSame(seekableByteChannel4, seekableByteChannel1);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableByteChannel4.size());
      assertEquals(0L, seekableByteChannel4.position());
      assertTrue(seekableByteChannel4.isOpen());
      assertNotNull(seekableByteChannel4);
      
      SeekableByteChannel seekableByteChannel5 = seekableInMemoryByteChannel0.position((long) 1353);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel4);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel3);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel5);
      assertSame(seekableByteChannel5, seekableByteChannel1);
      assertSame(seekableByteChannel5, seekableByteChannel3);
      assertSame(seekableByteChannel5, seekableByteChannel0);
      assertSame(seekableByteChannel5, seekableByteChannel2);
      assertSame(seekableByteChannel5, seekableByteChannel4);
      assertSame(seekableByteChannel5, seekableInMemoryByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(1353L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableByteChannel5.isOpen());
      assertEquals(1353L, seekableByteChannel5.position());
      assertEquals(0L, seekableByteChannel5.size());
      assertNotNull(seekableByteChannel5);
      
      long long0 = seekableInMemoryByteChannel0.size();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel4);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel3);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel5);
      assertEquals(0L, long0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(1353L, seekableInMemoryByteChannel0.position());
      
      byte[] byteArray0 = seekableInMemoryByteChannel0.array();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel4);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel3);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel5);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(1353L, seekableInMemoryByteChannel0.position());
      assertNotNull(byteArray0);
      assertEquals(1353, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2259);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(2259L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2259);
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.isReadOnly());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(2259, byteBuffer0.remaining());
      assertEquals(2259, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=2259 cap=2259]", byteBuffer0.toString());
      assertEquals(2259, byteBuffer0.limit());
      assertNotNull(byteBuffer0);
      
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(2259, int0);
      assertEquals(2259L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(2259L, seekableInMemoryByteChannel0.size());
      assertFalse(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(2259, byteBuffer0.position());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(2259, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=2259 lim=2259 cap=2259]", byteBuffer0.toString());
      assertEquals(2259, byteBuffer0.limit());
      
      // Undeclared exception!
      try { 
        byteBuffer0.get(2259);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 2259
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(3433);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(3433L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)36;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertArrayEquals(new byte[] {(byte)1, (byte)36, (byte)0, (byte)0}, byteArray0);
      assertEquals(4, byteBuffer0.limit());
      assertFalse(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(4, byteBuffer0.remaining());
      assertEquals(4, byteBuffer0.capacity());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=4 cap=4]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertNotNull(byteBuffer0);
      assertEquals(4, byteArray0.length);
      
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(4, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(4L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(3433L, seekableInMemoryByteChannel0.size());
      assertEquals(4, byteBuffer0.position());
      assertEquals(4, byteBuffer0.limit());
      assertEquals("java.nio.HeapByteBuffer[pos=4 lim=4 cap=4]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isDirect());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(4, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(4, byteArray0.length);
      
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(3433L, long0);
      assertEquals(4L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(3433L, seekableInMemoryByteChannel0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(4699);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(4699L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.limit());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertNotNull(byteBuffer0);
      
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(0, int0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(4699L, seekableInMemoryByteChannel0.size());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.limit());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-101);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-93);
      byteArray0[7] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-101), (byte)8, (byte) (-1), (byte)0, (byte) (-93), (byte)0}, byteArray0);
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(8, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(8, byteBuffer0.remaining());
      assertEquals(8, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer0.toString());
      assertNotNull(byteBuffer0);
      assertEquals(8, byteArray0.length);
      
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-101), (byte)8, (byte) (-1), (byte)0, (byte) (-93), (byte)0}, byteArray0);
      assertTrue(byteBuffer1.equals((Object)byteBuffer0));
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(8, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(8, byteBuffer0.remaining());
      assertEquals(8, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer0.toString());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(8, byteBuffer1.capacity());
      assertEquals(8, byteBuffer1.limit());
      assertEquals(8, byteBuffer1.remaining());
      assertEquals(0, byteBuffer1.position());
      assertFalse(byteBuffer1.isDirect());
      assertTrue(byteBuffer1.isReadOnly());
      assertEquals("java.nio.HeapByteBufferR[pos=0 lim=8 cap=8]", byteBuffer1.toString());
      assertFalse(byteBuffer1.hasArray());
      assertNotNull(byteBuffer1);
      assertEquals(8, byteArray0.length);
      
      ByteBuffer byteBuffer2 = byteBuffer0.asReadOnlyBuffer();
      assertNotSame(byteBuffer2, byteBuffer1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-101), (byte)8, (byte) (-1), (byte)0, (byte) (-93), (byte)0}, byteArray0);
      assertTrue(byteBuffer0.equals((Object)byteBuffer1));
      assertTrue(byteBuffer2.equals((Object)byteBuffer1));
      assertTrue(byteBuffer2.equals((Object)byteBuffer0));
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(8, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(8, byteBuffer0.remaining());
      assertEquals(8, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer0.toString());
      assertTrue(byteBuffer2.isReadOnly());
      assertEquals(0, byteBuffer2.position());
      assertFalse(byteBuffer2.hasArray());
      assertEquals(8, byteBuffer2.remaining());
      assertEquals("java.nio.HeapByteBufferR[pos=0 lim=8 cap=8]", byteBuffer2.toString());
      assertTrue(byteBuffer2.hasRemaining());
      assertFalse(byteBuffer2.isDirect());
      assertEquals(8, byteBuffer2.limit());
      assertEquals(8, byteBuffer2.capacity());
      assertNotNull(byteBuffer2);
      assertEquals(8, byteArray0.length);
      
      ByteBuffer byteBuffer3 = byteBuffer0.slice();
      assertNotSame(byteBuffer0, byteBuffer3);
      assertNotSame(byteBuffer3, byteBuffer0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-101), (byte)8, (byte) (-1), (byte)0, (byte) (-93), (byte)0}, byteArray0);
      assertTrue(byteBuffer0.equals((Object)byteBuffer2));
      assertTrue(byteBuffer0.equals((Object)byteBuffer1));
      assertTrue(byteBuffer3.equals((Object)byteBuffer0));
      assertTrue(byteBuffer3.equals((Object)byteBuffer1));
      assertTrue(byteBuffer3.equals((Object)byteBuffer2));
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(8, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(8, byteBuffer0.remaining());
      assertEquals(8, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer0.toString());
      assertTrue(byteBuffer3.hasRemaining());
      assertEquals(8, byteBuffer3.remaining());
      assertEquals(8, byteBuffer3.capacity());
      assertTrue(byteBuffer3.hasArray());
      assertEquals(8, byteBuffer3.limit());
      assertEquals(0, byteBuffer3.arrayOffset());
      assertEquals(0, byteBuffer3.position());
      assertFalse(byteBuffer3.isReadOnly());
      assertFalse(byteBuffer3.isDirect());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer3.toString());
      assertNotNull(byteBuffer3);
      assertEquals(8, byteArray0.length);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertNotSame(byteBuffer0, byteBuffer3);
      assertEquals(8, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte) (-101), (byte)8, (byte) (-1), (byte)0, (byte) (-93), (byte)0}, byteArray0);
      assertFalse(byteBuffer0.equals((Object)byteBuffer1));
      assertFalse(byteBuffer0.equals((Object)byteBuffer3));
      assertFalse(byteBuffer0.equals((Object)byteBuffer2));
      assertEquals(8L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(8, byteBuffer0.position());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(8, byteBuffer0.limit());
      assertEquals(8, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=8 cap=8]", byteBuffer0.toString());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(8, byteArray0.length);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position((long) (byte)0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals(0L, seekableByteChannel0.position());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(8L, seekableByteChannel0.size());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableByteChannel0);
      
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertTrue(boolean0);
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      long long0 = seekableInMemoryByteChannel0.size();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals(8L, long0);
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      
      try { 
        seekableInMemoryByteChannel0.position((long) (byte) (-93));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      
      seekableInMemoryByteChannel0.close();
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(0L, long0);
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      try { 
        seekableInMemoryByteChannel0.position(0L);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertNotNull(seekableInMemoryByteChannel0);
      
      seekableInMemoryByteChannel0.close();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      
      seekableInMemoryByteChannel0.close();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(0L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.position());
      assertFalse(seekableByteChannel0.isOpen());
      assertNotNull(seekableByteChannel0);
      
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertFalse(boolean0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      
      int int0 = 0;
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      assertEquals(0, byteBuffer0.limit());
      assertEquals("java.nio.DirectByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.hasArray());
      assertTrue(byteBuffer0.isDirect());
      assertNotNull(byteBuffer0);
      
      byte[] byteArray0 = new byte[4];
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-55);
      byteArray0[2] = (byte)67;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)16;
      byteArray0[5] = (byte)91;
      byteArray0[6] = (byte)33;
      byteArray0[7] = (byte)0;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-55), (byte)67, (byte)1, (byte)16, (byte)91, (byte)33, (byte)0}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(8, byteArray0.length);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(2147483647L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-55), (byte)67, (byte)1, (byte)16, (byte)91, (byte)33, (byte)0}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.position());
      assertEquals(8L, seekableByteChannel0.size());
      assertTrue(seekableByteChannel0.isOpen());
      assertNotNull(seekableByteChannel0);
      assertEquals(8, byteArray0.length);
      
      long long0 = seekableInMemoryByteChannel0.size();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals(8L, long0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-55), (byte)67, (byte)1, (byte)16, (byte)91, (byte)33, (byte)0}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(8, byteArray0.length);
      
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-55), (byte)67, (byte)1, (byte)16, (byte)91, (byte)33, (byte)0}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(8, byteArray0.length);
      
      boolean boolean1 = seekableInMemoryByteChannel0.isOpen();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertTrue(boolean1);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-55), (byte)67, (byte)1, (byte)16, (byte)91, (byte)33, (byte)0}, byteArray0);
      assertTrue(boolean1 == boolean0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(8, byteArray0.length);
      
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-55), (byte)67, (byte)1, (byte)16, (byte)91, (byte)33, (byte)0}, byteArray0);
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(8, byteBuffer0.limit());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(8, byteBuffer0.remaining());
      assertEquals(8, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=8 cap=8]", byteBuffer0.toString());
      assertNotNull(byteBuffer0);
      assertEquals(8, byteArray0.length);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals(8, int0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-55), (byte)67, (byte)1, (byte)16, (byte)91, (byte)33, (byte)0}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(8L, seekableInMemoryByteChannel0.position());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(8, byteBuffer0.position());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(8, byteBuffer0.limit());
      assertEquals(8, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=8 cap=8]", byteBuffer0.toString());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(684);
      assertTrue(byteBuffer0.hasArray());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=684 cap=684]", byteBuffer0.toString());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(684, byteBuffer0.limit());
      assertEquals(684, byteBuffer0.remaining());
      assertEquals(684, byteBuffer0.capacity());
      assertNotNull(byteBuffer0);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(684, int0);
      assertEquals(684L, seekableInMemoryByteChannel0.size());
      assertEquals(684L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=684 lim=684 cap=684]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(684, byteBuffer0.position());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(684, byteBuffer0.limit());
      assertEquals(684, byteBuffer0.capacity());
      assertFalse(byteBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2126);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(2126L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)88;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)73;
      byteArray0[4] = (byte)110;
      byteArray0[5] = (byte)22;
      byteArray0[6] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)88, (byte)0, (byte)73, (byte)110, (byte)22, (byte)0}, byteArray0);
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(7, byteBuffer0.remaining());
      assertEquals(7, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", byteBuffer0.toString());
      assertEquals(7, byteBuffer0.limit());
      assertNotNull(byteBuffer0);
      assertEquals(7, byteArray0.length);
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(7, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)88, (byte)0, (byte)73, (byte)110, (byte)22, (byte)0}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(7L, seekableInMemoryByteChannel0.position());
      assertEquals(2126L, seekableInMemoryByteChannel0.size());
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(7, byteBuffer0.position());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals("java.nio.HeapByteBuffer[pos=7 lim=7 cap=7]", byteBuffer0.toString());
      assertFalse(byteBuffer0.hasRemaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(7, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(7, byteBuffer0.limit());
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
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
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)88;
      byteArray0[1] = (byte)49;
      byteArray0[2] = (byte)96;
      byteArray0[3] = (byte)77;
      byteArray0[4] = (byte)8;
      byteArray0[5] = (byte)8;
      byteArray0[6] = (byte) (-70);
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(7L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(7, byteArray0.length);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)77);
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=77 cap=77]", byteBuffer0.toString());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(77, byteBuffer0.remaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(0, byteBuffer0.position());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasRemaining());
      assertNotNull(byteBuffer0);
      
      long long0 = byteBuffer0.getLong();
      assertEquals(0L, long0);
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(8, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=77 cap=77]", byteBuffer0.toString());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(69, byteBuffer0.remaining());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasRemaining());
      
      ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
      assertNotSame(byteBuffer0, byteBuffer1);
      assertNotSame(byteBuffer1, byteBuffer0);
      assertTrue(byteBuffer1.equals((Object)byteBuffer0));
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(8, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=77 cap=77]", byteBuffer0.toString());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(69, byteBuffer0.remaining());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(8, byteBuffer1.position());
      assertTrue(byteBuffer1.hasArray());
      assertFalse(byteBuffer1.isDirect());
      assertEquals(0, byteBuffer1.arrayOffset());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(77, byteBuffer1.limit());
      assertEquals(69, byteBuffer1.remaining());
      assertEquals(77, byteBuffer1.capacity());
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=77 cap=77]", byteBuffer1.toString());
      assertFalse(byteBuffer1.isReadOnly());
      assertNotNull(byteBuffer1);
      
      float float0 = byteBuffer1.getFloat();
      assertNotSame(byteBuffer0, byteBuffer1);
      assertNotSame(byteBuffer1, byteBuffer0);
      assertEquals(0.0F, float0, 0.01F);
      assertFalse(byteBuffer0.equals((Object)byteBuffer1));
      assertFalse(byteBuffer1.equals((Object)byteBuffer0));
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(8, byteBuffer0.position());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=77 cap=77]", byteBuffer0.toString());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(69, byteBuffer0.remaining());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasRemaining());
      assertTrue(byteBuffer1.hasArray());
      assertEquals(65, byteBuffer1.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=12 lim=77 cap=77]", byteBuffer1.toString());
      assertFalse(byteBuffer1.isDirect());
      assertEquals(0, byteBuffer1.arrayOffset());
      assertEquals(12, byteBuffer1.position());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(77, byteBuffer1.limit());
      assertEquals(77, byteBuffer1.capacity());
      assertFalse(byteBuffer1.isReadOnly());
      
      float float1 = byteBuffer0.getFloat();
      assertNotSame(byteBuffer0, byteBuffer1);
      assertEquals(0.0F, float1, 0.01F);
      assertTrue(byteBuffer0.equals((Object)byteBuffer1));
      assertEquals(float1, float0, 0.01F);
      assertEquals(65, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals("java.nio.HeapByteBuffer[pos=12 lim=77 cap=77]", byteBuffer0.toString());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(12, byteBuffer0.position());
      
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertNotSame(byteBuffer0, byteBuffer1);
      assertEquals(65, int0);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteBuffer0.equals((Object)byteBuffer1));
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.hasRemaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=77 lim=77 cap=77]", byteBuffer0.toString());
      assertEquals(77, byteBuffer0.position());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(7, byteArray0.length);
      
      byte[] byteArray1 = seekableInMemoryByteChannel0.array();
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertNotNull(byteArray1);
      assertEquals(7, byteArray0.length);
      assertEquals(112, byteArray1.length);
      
      byte[] byteArray2 = seekableInMemoryByteChannel0.array();
      assertSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertNotNull(byteArray2);
      assertEquals(112, byteArray2.length);
      assertEquals(7, byteArray0.length);
      
      int int1 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertNotSame(byteBuffer0, byteBuffer1);
      assertEquals(0, int1);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertFalse(int1 == int0);
      assertFalse(byteBuffer0.equals((Object)byteBuffer1));
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.hasRemaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=77 lim=77 cap=77]", byteBuffer0.toString());
      assertEquals(77, byteBuffer0.position());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(7, byteArray0.length);
      
      long long1 = seekableInMemoryByteChannel0.size();
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertEquals(65L, long1);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertFalse(long1 == long0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(7, byteArray0.length);
      
      long long2 = seekableInMemoryByteChannel0.position();
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertEquals(65L, long2);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertFalse(long2 == long0);
      assertTrue(long2 == long1);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(7, byteArray0.length);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate((byte)96);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertEquals(65L, seekableByteChannel0.size());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(65L, seekableByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertNotNull(seekableByteChannel0);
      assertEquals(7, byteArray0.length);
      
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertTrue(boolean0);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(7, byteArray0.length);
      
      int int2 = seekableInMemoryByteChannel0.read(byteBuffer1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertNotSame(byteBuffer0, byteBuffer1);
      assertNotSame(byteBuffer1, byteBuffer0);
      assertEquals((-1), int2);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertFalse(int2 == int0);
      assertFalse(int2 == int1);
      assertFalse(byteBuffer0.equals((Object)byteBuffer1));
      assertFalse(byteBuffer1.equals((Object)byteBuffer0));
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.hasRemaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=77 lim=77 cap=77]", byteBuffer0.toString());
      assertEquals(77, byteBuffer0.position());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer1.hasArray());
      assertEquals(65, byteBuffer1.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=12 lim=77 cap=77]", byteBuffer1.toString());
      assertFalse(byteBuffer1.isDirect());
      assertEquals(0, byteBuffer1.arrayOffset());
      assertEquals(12, byteBuffer1.position());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(77, byteBuffer1.limit());
      assertEquals(77, byteBuffer1.capacity());
      assertFalse(byteBuffer1.isReadOnly());
      assertEquals(7, byteArray0.length);
      
      long long3 = seekableInMemoryByteChannel0.size();
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals(65L, long3);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertFalse(long3 == long0);
      assertTrue(long3 == long2);
      assertTrue(long3 == long1);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(7, byteArray0.length);
      
      int int3 = seekableInMemoryByteChannel0.read(byteBuffer1);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray0, byteArray2);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertNotSame(byteBuffer0, byteBuffer1);
      assertNotSame(byteBuffer1, byteBuffer0);
      assertEquals((-1), int3);
      assertArrayEquals(new byte[] {(byte)88, (byte)49, (byte)96, (byte)77, (byte)8, (byte)8, (byte) (-70)}, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray0.equals((Object)byteArray2));
      assertTrue(int3 == int2);
      assertFalse(int3 == int0);
      assertFalse(int3 == int1);
      assertFalse(byteBuffer0.equals((Object)byteBuffer1));
      assertFalse(byteBuffer1.equals((Object)byteBuffer0));
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(65L, seekableInMemoryByteChannel0.size());
      assertEquals(65L, seekableInMemoryByteChannel0.position());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.hasRemaining());
      assertTrue(byteBuffer0.hasArray());
      assertEquals("java.nio.HeapByteBuffer[pos=77 lim=77 cap=77]", byteBuffer0.toString());
      assertEquals(77, byteBuffer0.position());
      assertEquals(77, byteBuffer0.limit());
      assertEquals(77, byteBuffer0.capacity());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer1.hasArray());
      assertEquals(65, byteBuffer1.remaining());
      assertEquals("java.nio.HeapByteBuffer[pos=12 lim=77 cap=77]", byteBuffer1.toString());
      assertFalse(byteBuffer1.isDirect());
      assertEquals(0, byteBuffer1.arrayOffset());
      assertEquals(12, byteBuffer1.position());
      assertTrue(byteBuffer1.hasRemaining());
      assertEquals(77, byteBuffer1.limit());
      assertEquals(77, byteBuffer1.capacity());
      assertFalse(byteBuffer1.isReadOnly());
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)0;
      byte byte0 = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertArrayEquals(new byte[] {(byte)35, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(5L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(5, byteArray0.length);
      
      seekableInMemoryByteChannel0.close();
      assertArrayEquals(new byte[] {(byte)35, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(5L, seekableInMemoryByteChannel0.size());
      assertEquals(5, byteArray0.length);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate((byte)0);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertTrue(byteBuffer0.hasArray());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.limit());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertNotNull(byteBuffer0);
      
      DoubleBuffer doubleBuffer0 = byteBuffer0.asDoubleBuffer();
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertTrue(byteBuffer0.hasArray());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.limit());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(doubleBuffer0.hasArray());
      assertEquals(0, doubleBuffer0.remaining());
      assertFalse(doubleBuffer0.isReadOnly());
      assertEquals("java.nio.ByteBufferAsDoubleBufferB[pos=0 lim=0 cap=0]", doubleBuffer0.toString());
      assertEquals(0, doubleBuffer0.capacity());
      assertFalse(doubleBuffer0.isDirect());
      assertEquals(0, doubleBuffer0.limit());
      assertFalse(doubleBuffer0.hasRemaining());
      assertEquals(0, doubleBuffer0.position());
      assertNotNull(doubleBuffer0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate((byte)0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertArrayEquals(new byte[] {(byte)35, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertFalse(seekableByteChannel0.isOpen());
      assertEquals(0L, seekableByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.position());
      assertNotNull(seekableByteChannel0);
      assertEquals(5, byteArray0.length);
      
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
  public void test22()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertTrue(boolean0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      
      int int0 = 315;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-33);
      byteArray0[1] = (byte) (-37);
      byteArray0[2] = (byte) (-92);
      byteArray0[3] = (byte)0;
      // Undeclared exception!
      try { 
        ByteBuffer.wrap(byteArray0, 93, 3192);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(518);
      assertEquals(518L, seekableInMemoryByteChannel0.size());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertNotNull(seekableInMemoryByteChannel0);
      
      seekableInMemoryByteChannel0.close();
      assertEquals(518L, seekableInMemoryByteChannel0.size());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      seekableInMemoryByteChannel0.close();
      assertEquals(518L, seekableInMemoryByteChannel0.size());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      seekableInMemoryByteChannel0.close();
      assertEquals(518L, seekableInMemoryByteChannel0.size());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(0L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableByteChannel0.size());
      assertFalse(seekableByteChannel0.isOpen());
      assertEquals(0L, seekableByteChannel0.position());
      assertNotNull(seekableByteChannel0);
      
      SeekableByteChannel seekableByteChannel1 = seekableInMemoryByteChannel0.truncate(529L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableByteChannel1, seekableByteChannel0);
      assertSame(seekableByteChannel1, seekableInMemoryByteChannel0);
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0L, seekableByteChannel1.size());
      assertEquals(0L, seekableByteChannel1.position());
      assertFalse(seekableByteChannel1.isOpen());
      assertNotNull(seekableByteChannel1);
      
      try { 
        seekableInMemoryByteChannel0.position(0L);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-126);
      byteArray0[2] = (byte)112;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)126;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-126), (byte)112, (byte) (-1), (byte) (-1), (byte)0, (byte)0, (byte)126}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(8, byteArray0.length);
      
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(0L, long0);
      assertArrayEquals(new byte[] {(byte)1, (byte) (-126), (byte)112, (byte) (-1), (byte) (-1), (byte)0, (byte)0, (byte)126}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(8L, seekableInMemoryByteChannel0.size());
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 0;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      
      seekableInMemoryByteChannel0.close();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertFalse(seekableInMemoryByteChannel0.isOpen());
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.position());
      assertFalse(byteBuffer0.isReadOnly());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isDirect());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(0, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.limit());
      assertNotNull(byteBuffer0);
      
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
  public void test26()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(471);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(471L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)43;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)1;
      byteArray0[7] = (byte) (-113);
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(0L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(471L, seekableInMemoryByteChannel0.size());
      assertEquals(471L, seekableByteChannel0.size());
      assertEquals(0L, seekableByteChannel0.position());
      assertTrue(seekableByteChannel0.isOpen());
      assertNotNull(seekableByteChannel0);
      
      // Undeclared exception!
      try { 
        ByteBuffer.wrap(byteArray0, (-1), 4278);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = null;
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
  public void test28()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)50;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-1), (byte)50, (byte)0, (byte)0, (byte) (-1), (byte)0}, byteArray0);
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(7, byteBuffer0.limit());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", byteBuffer0.toString());
      assertEquals(7, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.position());
      assertEquals(7, byteBuffer0.remaining());
      assertNotNull(byteBuffer0);
      assertEquals(7, byteArray0.length);
      
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals((-1), int0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-1), (byte)50, (byte)0, (byte)0, (byte) (-1), (byte)0}, byteArray0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertTrue(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.arrayOffset());
      assertEquals(7, byteBuffer0.limit());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", byteBuffer0.toString());
      assertEquals(7, byteBuffer0.capacity());
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.isDirect());
      assertTrue(byteBuffer0.hasArray());
      assertEquals(0, byteBuffer0.position());
      assertEquals(7, byteBuffer0.remaining());
      assertEquals(7, byteArray0.length);
      
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((-2215L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = null;
      try {
        seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel((-4478));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(226);
      assertEquals(226L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position((long) 226);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertEquals(226L, seekableInMemoryByteChannel0.size());
      assertEquals(226L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(226L, seekableByteChannel0.position());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(226L, seekableByteChannel0.size());
      assertNotNull(seekableByteChannel0);
      
      long long0 = seekableInMemoryByteChannel0.size();
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertEquals(226L, long0);
      assertEquals(226L, seekableInMemoryByteChannel0.size());
      assertEquals(226L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertNotNull(seekableInMemoryByteChannel0);
      
      byte[] byteArray0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        ByteBuffer.wrap((byte[]) null, (-2166), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-124);
      byteArray0[0] = (byte) (-124);
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-124)}, byteArray0);
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(1L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertNotNull(seekableInMemoryByteChannel0);
      assertEquals(1, byteArray0.length);
      
      try { 
        seekableInMemoryByteChannel0.position((long) (byte) (-124));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = 0;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      assertEquals(0, byteBuffer0.arrayOffset());
      assertFalse(byteBuffer0.isDirect());
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
      assertEquals(0, byteBuffer0.remaining());
      assertFalse(byteBuffer0.isReadOnly());
      assertFalse(byteBuffer0.hasRemaining());
      assertEquals(0, byteBuffer0.limit());
      assertEquals(0, byteBuffer0.position());
      assertEquals(0, byteBuffer0.capacity());
      assertTrue(byteBuffer0.hasArray());
      assertNotNull(byteBuffer0);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)37;
      byteArray0[8] = (byte) (-1);
      // Undeclared exception!
      try { 
        byteBuffer0.get(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertNotNull(seekableInMemoryByteChannel0);
      
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(2147483647L);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableByteChannel0, seekableInMemoryByteChannel0);
      assertEquals(2147483647L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(2147483647L, seekableByteChannel0.position());
      assertTrue(seekableByteChannel0.isOpen());
      assertEquals(0L, seekableByteChannel0.size());
      assertNotNull(seekableByteChannel0);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)69;
      byte byte0 = (byte)88;
      byteArray0[1] = (byte)88;
      SeekableByteChannel seekableByteChannel1 = seekableInMemoryByteChannel0.truncate((byte)88);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel0);
      assertSame(seekableInMemoryByteChannel0, seekableByteChannel1);
      assertSame(seekableByteChannel1, seekableByteChannel0);
      assertSame(seekableByteChannel1, seekableInMemoryByteChannel0);
      assertEquals(88L, seekableInMemoryByteChannel0.position());
      assertTrue(seekableInMemoryByteChannel0.isOpen());
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals(0L, seekableByteChannel1.size());
      assertTrue(seekableByteChannel1.isOpen());
      assertEquals(88L, seekableByteChannel1.position());
      assertNotNull(seekableByteChannel1);
      
      // Undeclared exception!
      try { 
        ByteBuffer.wrap(byteArray0, (int) (byte)88, 65536);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      long long0 = 2147483647L;
      long long1 = 4169L;
      seekableInMemoryByteChannel0.truncate(4169L);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      seekableInMemoryByteChannel0.truncate(2147483647L);
      int int0 = 1932735283;
      ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(1932735283);
      seekableInMemoryByteChannel0.write(byteBuffer1);
      seekableInMemoryByteChannel0.truncate(2L);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((-2060L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 2936;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2936);
      long long0 = (-49L);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2936);
      // Undeclared exception!
      try { 
        byteBuffer0.putDouble((-1), (double) (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      seekableInMemoryByteChannel0.position(0L);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(234L);
      assertEquals(3L, seekableInMemoryByteChannel0.size());
      
      seekableByteChannel0.truncate((byte)0);
      seekableInMemoryByteChannel0.isOpen();
      seekableInMemoryByteChannel0.close();
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)31;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-49);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-61);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.array();
      try { 
        seekableInMemoryByteChannel0.position((-1L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)31;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-49);
      byteArray0[3] = (byte)31;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-61);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-23);
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.array();
      try { 
        seekableInMemoryByteChannel0.position((-1L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      seekableInMemoryByteChannel0.close();
      seekableInMemoryByteChannel0.size();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-50);
      byteArray0[1] = (byte) (-30);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test41()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-1);
      byteArray0[1] = (byte)25;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-62);
      byteArray0[4] = (byte) (-113);
      byteArray0[5] = (byte) (-93);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 1, 1);
      seekableInMemoryByteChannel0.read(byteBuffer0);
      long long0 = (-925L);
      seekableInMemoryByteChannel0.close();
      seekableInMemoryByteChannel0.close();
      try { 
        seekableInMemoryByteChannel0.position((-925L));
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-1);
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte) (-49);
      byte byte1 = (byte) (-65);
      byteArray0[3] = (byte) (-65);
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte) (-21);
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((-2383L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-75);
      byteArray0[1] = (byte) (-75);
      byteArray0[2] = (byte) (-75);
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=8 lim=8 cap=8]", byteBuffer0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(3490);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-62);
      byteArray0[2] = (byte)31;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-45);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-44);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byteBuffer0.asReadOnlyBuffer();
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(8, int0);
  }
}
