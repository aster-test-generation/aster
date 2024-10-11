
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


package org.apache.commons.compress.compressors.deflate64;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream;
import org.apache.commons.compress.compressors.deflate64.HuffmanDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Deflate64CompressorInputStream_ESTest extends Deflate64CompressorInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Deflate64CompressorInputStream deflate64CompressorInputStream0 = new Deflate64CompressorInputStream((HuffmanDecoder) null);
      byte[] byteArray0 = new byte[6];
      int int0 = deflate64CompressorInputStream0.read(byteArray0, 2, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Deflate64CompressorInputStream deflate64CompressorInputStream0 = new Deflate64CompressorInputStream((HuffmanDecoder) null);
      byte[] byteArray0 = new byte[4];
      int int0 = deflate64CompressorInputStream0.read(byteArray0, (int) (byte) (-11), (int) (byte) (-11));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Deflate64CompressorInputStream deflate64CompressorInputStream0 = new Deflate64CompressorInputStream((HuffmanDecoder) null);
      int int0 = deflate64CompressorInputStream0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Deflate64CompressorInputStream deflate64CompressorInputStream0 = new Deflate64CompressorInputStream((HuffmanDecoder) null);
      int int0 = deflate64CompressorInputStream0.available();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Deflate64CompressorInputStream deflate64CompressorInputStream0 = null;
      try {
        deflate64CompressorInputStream0 = new Deflate64CompressorInputStream(pipedInputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/input/CountingInputStream
         //
         verifyException("org.apache.commons.compress.utils.BitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Deflate64CompressorInputStream deflate64CompressorInputStream0 = new Deflate64CompressorInputStream((HuffmanDecoder) null);
      long long0 = deflate64CompressorInputStream0.getCompressedCount();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Deflate64CompressorInputStream deflate64CompressorInputStream0 = new Deflate64CompressorInputStream((HuffmanDecoder) null);
      // Undeclared exception!
      try { 
        deflate64CompressorInputStream0.close();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream", e);
      }
  }
}
