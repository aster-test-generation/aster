
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RunCodec_ESTest extends RunCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[9];
      runCodec0.lastBandLength = (int) (byte)66;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      runCodec0.decode((InputStream) byteArrayInputStream0, (-303L));
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0, 0L);
      //  // Unstable assertion: assertEquals(92, bHSDCodec0.lastBandLength);
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = new RunCodec(428, bHSDCodec0, bHSDCodec0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      runCodec0.lastBandLength = 13;
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
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
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
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      runCodec0.decode((InputStream) byteArrayInputStream0, (-303L));
      int int0 = runCodec0.getK();
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-76);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      RunCodec runCodec0 = new RunCodec(795, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0, 4294967293L);
      assertEquals(794, runCodec0.getK());
      assertEquals(135, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(163, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 2046);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 1);
      int int0 = runCodec0.decode((InputStream) pushbackInputStream0, (-5927L));
      assertEquals(162, runCodec0.getK());
      assertEquals((-128), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(3, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-76);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0);
      //  // Unstable assertion: assertEquals(94, bHSDCodec0.lastBandLength);
      //  // Unstable assertion: assertEquals(135, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(3, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)51;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read();
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(2, runCodec0.getK());
      assertEquals((-13), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, 4, bHSDCodec0);
      PopulationCodec populationCodec1 = new PopulationCodec(populationCodec0, populationCodec0.CHAR3, populationCodec0);
      RunCodec runCodec0 = new RunCodec(4, populationCodec1, populationCodec0.MDELTA5);
      try { 
        runCodec0.decodeInts(0, (InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(256, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(256, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.BHSDCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      RunCodec runCodec0 = new RunCodec(1500, populationCodec0, bHSDCodec0);
      try { 
        runCodec0.decode((InputStream) null, (long) 0);
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
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1668, bHSDCodec0, bHSDCodec0);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) null, (long) 10);
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
      BHSDCodec bHSDCodec0 = Codec.BYTE1;
      RunCodec runCodec0 = new RunCodec(2063, bHSDCodec0, bHSDCodec0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        runCodec0.decode((InputStream) mockFileInputStream0, 435L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        runCodec0.decode((InputStream) sequenceInputStream0, (-1L));
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
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, 1, bHSDCodec0);
      RunCodec runCodec0 = new RunCodec(1, populationCodec0, populationCodec0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        runCodec0.decode((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Population encoding does not work unless the number of elements are known
         //
         verifyException("org.apache.commons.compress.harmony.pack200.PopulationCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(37, bHSDCodec0, bHSDCodec0);
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
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(3489, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 40);
      // Undeclared exception!
      try { 
        runCodec0.decode((InputStream) byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(37, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-70), (byte) (-70));
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
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(3489, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0, (long) (byte) (-64));
      assertEquals(3488, runCodec0.getK());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(23, populationCodec0, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Must supply both codecs for a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec(2, (Codec) null, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Must supply both codecs for a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      RunCodec runCodec0 = null;
      try {
        runCodec0 = new RunCodec((-993), bHSDCodec0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Cannot have a RunCodec for a negative number of numbers
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(3489, bHSDCodec0, bHSDCodec0);
      runCodec0.getBCodec();
      assertEquals(3489, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(37, bHSDCodec0, bHSDCodec0);
      String string0 = runCodec0.toString();
      assertEquals("RunCodec[k=37;aCodec=(5,64,1)bCodec=(5,64,1)]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(3, bHSDCodec0, bHSDCodec0);
      runCodec0.getACodec();
      assertEquals(3, runCodec0.getK());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      int int0 = runCodec0.getK();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(3, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode((int) (byte)1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.MDELTA5;
      RunCodec runCodec0 = new RunCodec(3, bHSDCodec0, bHSDCodec0);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = runCodec0.decode((InputStream) byteArrayInputStream0);
      assertEquals(1, bHSDCodec0.lastBandLength);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.DELTA5;
      RunCodec runCodec0 = new RunCodec(1, bHSDCodec0, bHSDCodec0);
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        runCodec0.decodeInts(3822, (InputStream) sequenceInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/BoundedInputStream
         //
         verifyException("org.apache.commons.compress.harmony.pack200.Codec", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      RunCodec runCodec0 = new RunCodec(40, bHSDCodec0, bHSDCodec0);
      try { 
        runCodec0.encode(7, 7);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Must encode entire band at once with a RunCodec
         //
         verifyException("org.apache.commons.compress.harmony.pack200.RunCodec", e);
      }
  }
}
