
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
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.CodecEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodecEncoding_ESTest extends CodecEncoding_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.BRANCH5;
      int int0 = CodecEncoding.getSpecifierForDefaultCodec(bHSDCodec0);
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      BHSDCodec bHSDCodec1 = (BHSDCodec)CodecEncoding.getCodec(115, dataInputStream0, bHSDCodec0);
      assertEquals(1, bHSDCodec1.getS());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = CodecEncoding.getSpecifierForDefaultCodec((BHSDCodec) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Codec codec0 = CodecEncoding.getCodec(0, mockFileInputStream0, (Codec) null);
      assertNull(codec0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(0);
      assertNull(bHSDCodec0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(18);
      assertEquals(43477L, bHSDCodec0.largest());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(84);
      assertEquals(1, bHSDCodec0.getS());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(70);
      assertEquals(9449536L, bHSDCodec0.cardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int[] intArray0 = CodecEncoding.getSpecifier(bHSDCodec0, bHSDCodec0);
      assertArrayEquals(new int[] {116, 16, 127}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = CodecEncoding.getSpecifier((Codec) null, (Codec) null);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(144, (InputStream) null, (Codec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BHSDCodec bHSDCodec0 = Codec.UDELTA5;
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(151, sequenceInputStream0, bHSDCodec0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Encoding cannot be less than zero
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Codec codec0 = CodecEncoding.getCodec(180, (InputStream) null, (Codec) null);
      assertEquals(0, codec0.lastBandLength);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(141, (InputStream) null, (Codec) null);
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
      try { 
        CodecEncoding.getCodec(1588, (InputStream) null, (Codec) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Invalid codec encoding byte (1588) found
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(129, (InputStream) null, (Codec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BHSDCodec bHSDCodec0 = Codec.UNSIGNED5;
      try { 
        CodecEncoding.getCodec((byte)118, mockFileInputStream0, bHSDCodec0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(1);
      assertNotNull(bHSDCodec0);
      
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Codec codec0 = CodecEncoding.getCodec(1, sequenceInputStream0, bHSDCodec0);
      assertSame(codec0, bHSDCodec0);
      assertNotNull(codec0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BHSDCodec bHSDCodec0 = CodecEncoding.getCanonicalCodec(1);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec((-1), sequenceInputStream0, bHSDCodec0);
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
      // Undeclared exception!
      try { 
        CodecEncoding.getCodec(146, (InputStream) null, (Codec) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BHSDCodec bHSDCodec0 = Codec.CHAR3;
      int int0 = CodecEncoding.getSpecifierForDefaultCodec(bHSDCodec0);
      assertEquals(116, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodecEncoding codecEncoding0 = new CodecEncoding();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodecEncoding.getCanonicalCodec((-1222));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1222
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CodecEncoding", e);
      }
  }
}
