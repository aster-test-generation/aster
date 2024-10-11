
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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BZip2CompressorOutputStream_ESTest extends BZip2CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[0];
      bZip2CompressorOutputStream0.write(byteArray0);
      assertEquals("BZh", byteArrayOutputStream0.toString());
      assertEquals(3, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[17];
      byteArray0[0] = (byte) (-21);
      byteArray0[2] = (byte)107;
      byteArray0[3] = (byte) (-115);
      byteArray0[4] = (byte) (-17);
      byteArray0[5] = (byte) (-30);
      byteArray0[6] = (byte) (-3);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.write(4);
      bZip2CompressorOutputStream0.close();
      assertEquals(54, byteArrayOutputStream0.size());
      assertEquals("BZh41AY&SY\uFFFDr\uFFFD\uFFFD\u0000\u0000\u0005AA\uFFFD\u0000\u0000\b\u0000\u0002\u0010\b\uFFFD\u0002 \u0000\"\u0001\uFFFD\uFFFD \u0248*^\uFFFD#\uFFFD\uFFFD\uFFFDH\uFFFD\n\u0012\u001E\uFFFDT\uFFFD\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte) (-21);
      bZip2CompressorOutputStream0.write(byteArray0);
      byteArray0[4] = (byte) (-17);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.close();
      assertEquals(45, byteArrayOutputStream0.size());
      assertEquals("BZh41AY&SY\t\uFFFD \uFFFD\u0000\u0000\u0006\uFFFD\u0001b\u0000\u0000\b\uFFFD\u0000!)\uFFFD\uFFFDf\uFFFDi \u001E\uFFFD.\uFFFDp\uFFFD \u0013\uFFFDAN", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte) (-17);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.close();
      assertEquals(40, byteArrayOutputStream0.size());
      assertEquals("BZh41AY&SY\uFFFD]\uFFFD\u0000\u0000\u0001@\u0001@\u0000\u0000\u0000\uFFFD\u00000\uFFFDAK\uFFFD\uFFFD\"\uFFFD(Hj.\uFFFD\uFFFD\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize((-3887L));
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write((byte[]) null, 4, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, 5);
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
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0, 9);
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
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.write(4);
      bZip2CompressorOutputStream0.finish();
      assertEquals(37, byteArrayOutputStream0.size());
      assertEquals("BZh41AY&SY\uFFFD\uFFFD6\uFFFD\u0000\u0000\u0000@\u0000\u0004\u0000 \u00000\uFFFD#Aw$S\uFFFD\t\n/3ip", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.write((-435));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.close();
      byte[] byteArray0 = new byte[22];
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte)4, (int) (byte)4);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte)4, (int) (byte)4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(4) + len(4) > buf.length(3).
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 237, (-3258));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // len(-3258) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte) (-115), (int) (byte) (-115));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(-115) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[15];
      byteArray0[0] = (byte) (-21);
      byteArray0[1] = (byte) (-21);
      byteArray0[3] = (byte) (-115);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.close();
      assertEquals("BZh41AY&SY\u0002\uFFFDLE\u0000\u0000\u0004@A@\uFFFD\u0000\u0002\u0000\b \u00000\uFFFD4\u0019\uFFFD\uFFFD\uFFFD\u0007\uFFFD\uFFFD\"\uFFFD(H\u0001`\uFFFD\"\uFFFD", byteArrayOutputStream0.toString());
      assertEquals(46, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      byte[] byteArray0 = new byte[7];
      bZip2CompressorOutputStream0.write(byteArray0);
      byteArray0[3] = (byte) (-115);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.close();
      assertEquals(41, byteArrayOutputStream0.size());
      assertEquals("BZh41AY&SY\u001C\n\uFFFD.\u0000\u0000\u0001\uFFFD@A\u0000\u0000\u0002 \u00000\uFFFD\r\uFFFD!qw$S\uFFFD\t\u0001\uFFFD\uFFFD\uFFFD\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.flush();
      assertEquals("BZh", byteArrayOutputStream0.toString());
      assertEquals(3, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.flush();
      assertEquals(14, byteArrayOutputStream0.size());
      assertEquals("BZh4\u0017rE8P\uFFFD\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.finish();
      assertEquals(14, byteArrayOutputStream0.size());
      assertEquals("BZh4\u0017rE8P\uFFFD\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.close();
      assertEquals(14, byteArrayOutputStream0.size());
      assertEquals("BZh4\u0017rE8P\uFFFD\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(54);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 54);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(54) > 9
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, (-1514));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(-1514) < 1
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(3435L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(0L);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      int int0 = bZip2CompressorOutputStream0.getBlockSize();
      assertEquals(3, byteArrayOutputStream0.size());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(byteArrayOutputStream0, 4);
      bZip2CompressorOutputStream0.finish();
      assertEquals(14, byteArrayOutputStream0.size());
      assertEquals("BZh4\u0017rE8P\uFFFD\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }
}
