
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
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = new byte[8];
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(689);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArray0);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer1);
      assertEquals(697L, seekableInMemoryByteChannel0.position());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1068);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1068);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(1068L, seekableInMemoryByteChannel0.position());
      assertEquals(1068, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.truncate(2147483647L);
      assertEquals(0L, seekableByteChannel0.position());
      assertEquals(4L, seekableByteChannel0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1068);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1068);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(1068, byteBuffer0.position());
      assertEquals(1068, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.position(2147483647L);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)21);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(2147483647L, seekableInMemoryByteChannel0.position());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2113);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0, int0);
      assertEquals(2113L, seekableInMemoryByteChannel0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.close();
      seekableInMemoryByteChannel0.truncate(0L);
      assertFalse(seekableInMemoryByteChannel0.isOpen());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(6L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2113);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(0L, seekableInMemoryByteChannel0.position());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(689);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(689L, seekableInMemoryByteChannel0.size());
      assertEquals(689L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.close();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1073741823);
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
  public void test11()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(286);
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
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)21);
      seekableInMemoryByteChannel0.close();
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
  public void test13()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = null;
      try {
        seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.close();
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2113);
      boolean boolean0 = seekableInMemoryByteChannel0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2287);
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      seekableInMemoryByteChannel0.truncate((byte)0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1013);
      seekableInMemoryByteChannel0.truncate(0L);
      seekableInMemoryByteChannel0.truncate(0L);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate(2147483653L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Size has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      // Undeclared exception!
      try { 
        seekableInMemoryByteChannel0.truncate((-502L));
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
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1013);
      seekableInMemoryByteChannel0.truncate(0L);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1013);
      int int0 = seekableInMemoryByteChannel0.write(byteBuffer0);
      assertEquals(1013, byteBuffer0.position());
      assertEquals(1013, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2678);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals("java.nio.HeapByteBuffer[pos=1 lim=2678 cap=2678]", byteBuffer0.toString());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2287);
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      seekableInMemoryByteChannel0.truncate((byte)0);
      int int0 = seekableInMemoryByteChannel0.read(byteBuffer0);
      assertEquals(0L, seekableInMemoryByteChannel0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(1013);
      try { 
        seekableInMemoryByteChannel0.position(2147483698L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      SeekableByteChannel seekableByteChannel0 = seekableInMemoryByteChannel0.position(0L);
      assertEquals(0L, seekableByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3271);
      seekableInMemoryByteChannel0.write(byteBuffer0);
      seekableInMemoryByteChannel0.array();
      assertEquals(3271L, seekableInMemoryByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      byte[] byteArray0 = seekableInMemoryByteChannel0.array();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(2287);
      try { 
        seekableInMemoryByteChannel0.position((-158L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position has to be in range 0.. 2147483647
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      long long0 = seekableInMemoryByteChannel0.size();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      seekableInMemoryByteChannel0.close();
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
  public void test32()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      long long0 = seekableInMemoryByteChannel0.position();
      assertEquals(0L, long0);
  }
}
