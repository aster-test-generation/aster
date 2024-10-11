
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
import java.net.URI;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BZip2CompressorOutputStream_ESTest extends BZip2CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 2659, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(2659) + len(0) > buf.length(3).
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(0L);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream((OutputStream) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.compressors.bzip2.BlockSort");
      mockFileOutputStream0.close();
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 5);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("n_I0<\u0004", true);
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
  public void test06()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.write(516);
      bZip2CompressorOutputStream0.finish();
      assertEquals(37L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.finish();
      assertEquals(14L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.close();
      try { 
        bZip2CompressorOutputStream0.write(999999999);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.close();
      byte[] byteArray0 = new byte[5];
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, 1, 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte)9, (-1218));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // len(-1218) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        bZip2CompressorOutputStream0.write(byteArray0, (int) (byte) (-42), 9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // offs(-42) < 0.
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.flush();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.flush();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.finish();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("x{6hn-9m~Io9;p");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 246);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(246) > 9
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("blockSize(");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = null;
      try {
        bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize(0) < 1
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.write(30);
      bZip2CompressorOutputStream0.write(30);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("x{6hn-9m~Io9;p");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockFileOutputStream0, 3);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-93);
      byteArray0[1] = (byte) (-52);
      bZip2CompressorOutputStream0.write(byteArray0);
      bZip2CompressorOutputStream0.close();
      assertEquals(42L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.close();
      assertEquals(1, BZip2CompressorOutputStream.MIN_BLOCKSIZE);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.write(1);
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize(1420L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = BZip2CompressorOutputStream.chooseBlockSize((-2226L));
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      int int0 = bZip2CompressorOutputStream0.getBlockSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("eG,jba_B*");
      BZip2CompressorOutputStream bZip2CompressorOutputStream0 = new BZip2CompressorOutputStream(mockPrintStream0, 1);
      bZip2CompressorOutputStream0.close();
      bZip2CompressorOutputStream0.close();
      assertEquals(1, bZip2CompressorOutputStream0.getBlockSize());
  }
}
