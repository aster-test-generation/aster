
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RunCodec_ESTest extends RunCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-17);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 986);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      int int0 = runCodec0.decode((InputStream) dataInputStream0);
      assertEquals(0, runCodec0.getK());
      assertEquals((-60), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(0, bHSDCodec0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a RunCodec for a negative number of numbers
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1020, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)116;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      runCodec0.decode((InputStream) byteArrayInputStream0, (-1015L));
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0, 197L);
      assertEquals(1018, runCodec0.getK());
      assertEquals(58, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1020, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-95);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      runCodec0.decode((InputStream) byteArrayInputStream0, (-1015L));
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(1018, runCodec0.getK());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1020, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)116;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      runCodec0.decode((InputStream) byteArrayInputStream0, (-1015L));
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(1018, runCodec0.getK());
      assertEquals(58, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      RunCodec runCodec0 = new RunCodec(827, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(356, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) null, 676L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2817), 1);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) byteArrayInputStream0, (long) 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(1350, bHSDCodec0, bHSDCodec0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      try { 
        runCodec0.decode((InputStream) bufferedInputStream0, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(758, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1393), 0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      try { 
        runCodec0.decode((InputStream) bufferedInputStream0, (long) (byte)0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      RunCodec runCodec0 = new RunCodec(491, populationCodec0, populationCodec0.BYTE1);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, bufferedInputStream0);
      try { 
        runCodec0.decode((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      RunCodec runCodec0 = new RunCodec(900, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(385, bHSDCodec0, bHSDCodec0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(10);
      try { 
        runCodec0.decode((InputStream) pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(2944, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      runCodec0.decode((InputStream) byteArrayInputStream0, (long) 3);
      try { 
        runCodec0.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // End of stream reached whilst decoding
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(3331, bHSDCodec0, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Must supply both codecs for a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(1, (Codec) null, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Must supply both codecs for a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec((-1), bHSDCodec0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a RunCodec for a negative number of numbers
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(650, bHSDCodec0, bHSDCodec0);
      runCodec0.getBCodec();
      assertEquals(650, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1020, bHSDCodec0, bHSDCodec0);
      String string0 = runCodec0.toString();
      assertEquals("RunCodec[k=1020;aCodec=(5,64,1)bCodec=(5,64,1)]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(707, bHSDCodec0, bHSDCodec0);
      runCodec0.getACodec();
      assertEquals(707, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(707, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.getK();
      assertEquals(707, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(707, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(1462);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 986);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      runCodec0.decode((InputStream) dataInputStream0);
      int int0 = runCodec0.getK();
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(2416, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(0, (InputStream) pushbackInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(1204, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(0, 1204);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }
}
