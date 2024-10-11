
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


package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BZip2CompressorOutputStream_ESTest extends BZip2CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[0];
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(0, byteArray0.length);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte)122;
      byteArray0[1] = (byte) (-84);
      byteArray0[4] = (byte) (-88);
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(14, byteArray0.length);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(14, byteArray0.length);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-80);
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)9;
      byteArray0[3] = (byte)19;
      byteArray0[4] = (byte)68;
      byteArray0[5] = (byte)76;
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-80), (byte)8, (byte)9, (byte)19, (byte)68, (byte)76}, byteArray0);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      byte[] byteArray1 = new byte[14];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[1] = (byte)122;
      byteArray1[4] = (byte) (-88);
      byteArray1[5] = (byte)43;
      bZip2CompressorOutputStream0.write(byteArray1);
      assertEquals(14, byteArray1.length);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertNotSame(byteArray1, byteArray0);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      bZip2CompressorOutputStream0.write(byteArray0, 1, 1);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      assertNotNull(bZip2CompressorOutputStream_Data0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      pipedOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.finish();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.finish();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("UQaA<P!;'_0kTd");
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      assertNotNull(mockPrintStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.canRead());
      assertEquals("UQaA<P!;'_0kTd", mockFile0.getName());
      assertEquals("UQaA<P!;'_0kTd", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.isDirectory());
      assertEquals(3L, mockFile0.length());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.finish();
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.canRead());
      assertEquals(14L, mockFile0.length());
      assertEquals("UQaA<P!;'_0kTd", mockFile0.getName());
      assertEquals("UQaA<P!;'_0kTd", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertNull(mockFile0.getParent());
      assertFalse(mockFile0.isHidden());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isAbsolute());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte)122;
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)122, (byte)0, (byte)0}, byteArray0);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte)0, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte)122, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(122) + len(1) > buf.length(6).
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 1, (int) (byte) (-88));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // len(-88) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("UQaA<P!;'_0kTd");
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      assertNotNull(mockPrintStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      assertEquals("UQaA<P!;'_0kTd", mockFile0.toString());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.canRead());
      assertEquals(3L, mockFile0.length());
      assertTrue(mockFile0.isFile());
      assertTrue(mockFile0.exists());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals("UQaA<P!;'_0kTd", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.canWrite());
      assertFalse(mockFile0.isHidden());
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (-3757), (-3757));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(-3757) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)122;
      byteArray0[2] = (byte)25;
      byteArray0[3] = (byte)1;
      byteArray0[5] = (byte)74;
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals(6, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)122, (byte)0, (byte)25, (byte)1, (byte)0, (byte)74}, byteArray0);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.write(1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.flush();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.flush();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      bZip2CompressorOutputStream0.finish();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      assertNotNull(pipedOutputStream0);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
      assertNotNull(bZip2CompressorOutputStream0);
      assertEquals(9, BZip2CompressorOutputStream.MAX_BLOCKSIZE);
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
      
      pipedOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.close();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 246);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(246) > 9
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(0) < 1
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte)122;
      byteArray0[3] = (byte)1;
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.close();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(1L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize((-138L));
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("fl->emJ?1K6%(b");
      mockFileOutputStream0.close();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 1);
      int int0 = bZip2CompressorOutputStream0.getBlockSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("UQaA<P!;'_0kTd");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.write(1640);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }
}
