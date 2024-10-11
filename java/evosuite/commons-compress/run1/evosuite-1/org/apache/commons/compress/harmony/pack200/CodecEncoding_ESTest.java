
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.CodecEncoding;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.pack200.RunCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodecEncoding_ESTest extends CodecEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = CodecEncoding.getSpecifierForDefaultCodec((BHSDCodec) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)67, (-1344));
      Codec codec0 = CodecEncoding.getCodec(0, byteArrayInputStream0, (Codec) null);
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(0);
      assertNull(bHSDCodec0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(41);
      assertEquals(0, bHSDCodec0.getS());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCanonicalCodec(188);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 188
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, bHSDCodec0);
      assertArrayEquals(new int[] {116, 16, 127}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, bHSDCodec0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(128, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(runCodec0, (Codec) null);
      assertArrayEquals(new int[] {121, 127, 26, 26}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      RunCodec runCodec0 = new RunCodec(2143, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(runCodec0, bHSDCodec0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {130, 132, 17}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      RunCodec runCodec0 = new RunCodec(Integer.MAX_VALUE, populationCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(runCodec0, populationCodec0);
      assertArrayEquals(new int[] {132, 524286, 41}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, populationCodec0);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, bHSDCodec0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      Codec codec0 = CodecEncoding.getCodec(176, pipedInputStream0, bHSDCodec0);
      assertEquals(0, codec0.lastBandLength);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BHSDCodec bHSDCodec0 = Codec.BCI5;
      try { 
        CodecEncoding.getCodec(146, pipedInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      try { 
        CodecEncoding.getCodec(1117, (InputStream) null, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid codec encoding byte (1117) found
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("&(1s", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(mockFileInputStream0, mockFileInputStream0);
      try { 
        CodecEncoding.getCodec(128, sequenceInputStream0, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      BHSDCodec bHSDCodec1 = (BHSDCodec)CodecEncoding.getCodec(1, (InputStream) null, bHSDCodec0);
      assertNotNull(bHSDCodec1);
      assertEquals(0L, bHSDCodec1.smallest());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(99);
      PipedInputStream pipedInputStream0 = new PipedInputStream(99);
      BHSDCodec bHSDCodec1 = (BHSDCodec)CodecEncoding.getCodec(0, pipedInputStream0, bHSDCodec0);
      assertNotNull(bHSDCodec1);
      assertTrue(bHSDCodec1.isSigned());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec((-1611), sequenceInputStream0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(167);
      BHSDCodec bHSDCodec0 = Codec.SIGNED5;
      try { 
        CodecEncoding.getCodec(167, pipedInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      RunCodec runCodec0 = new RunCodec(128, bHSDCodec0, bHSDCodec0);
      int int0 = CodecEncoding.getSpecifierForDefaultCodec(runCodec0.CHAR3);
      assertEquals(116, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodecEncoding codecEncoding0 = new CodecEncoding();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(1);
      assertEquals(255L, bHSDCodec0.largest());
      assertNotNull(bHSDCodec0);
  }
}
