
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
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.CodecEncoding;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodecEncoding_ESTest extends CodecEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int int0 = CodecEncoding.getSpecifierForDefaultCodec(bHSDCodec0);
      assertEquals(116, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, 68);
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      BHSDCodec bHSDCodec1 = (BHSDCodec)CodecEncoding.getCodec(115, byteArrayInputStream0, bHSDCodec0);
      assertTrue(bHSDCodec1.isSigned());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = CodecEncoding.getSpecifierForDefaultCodec((BHSDCodec) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(42);
      assertEquals(1, bHSDCodec0.getS());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(5);
      assertEquals(0, bHSDCodec0.getS());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PopulationCodec populationCodec0 = new PopulationCodec((Codec) null, (Codec) null, (Codec) null);
      // Undeclared exception!
      try { 
        CodecEncoding.getSpecifier(populationCodec0, (Codec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCanonicalCodec((-396));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -396
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, bHSDCodec0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      BHSDCodec bHSDCodec1 = (BHSDCodec)CodecEncoding.getCodec(101, (InputStream) null, bHSDCodec0);
      assertEquals(1, bHSDCodec1.getS());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-992), 0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 9);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      Codec codec0 = CodecEncoding.getCodec(0, pushbackInputStream0, (Codec) null);
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, bHSDCodec0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      PopulationCodec populationCodec0 = new PopulationCodec(bHSDCodec0, bHSDCodec0, bHSDCodec0);
      int[] intArray0 = CodecEncoding.getSpecifier(populationCodec0, populationCodec0);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, bHSDCodec0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {116, 16, 127}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(161, (InputStream) null, (Codec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Codec codec0 = CodecEncoding.getCodec(148, (InputStream) null, (Codec) null);
      assertEquals(0, codec0.lastBandLength);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      CodecEncoding.getCodec(140, byteArrayInputStream0, bHSDCodec0);
      assertEquals(1, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(128, (InputStream) null, (Codec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-113);
      byteArray0[2] = (byte)20;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(140, byteArrayInputStream0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        CodecEncoding.getCodec(1217, mockFileInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid codec encoding byte (1217) found
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec((-2059), byteArrayInputStream0, (Codec) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodecEncoding codecEncoding0 = new CodecEncoding();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(0);
      assertNull(bHSDCodec0);
  }
}
