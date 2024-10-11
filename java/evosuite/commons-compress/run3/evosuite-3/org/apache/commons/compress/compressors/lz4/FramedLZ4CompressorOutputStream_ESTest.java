
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


package org.apache.commons.compress.compressors.lz4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FramedLZ4CompressorOutputStream_ESTest extends FramedLZ4CompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FramedLZ4CompressorOutputStream.BlockSize framedLZ4CompressorOutputStream_BlockSize0 = FramedLZ4CompressorOutputStream.BlockSize.M1;
      FramedLZ4CompressorOutputStream.Parameters framedLZ4CompressorOutputStream_Parameters0 = new FramedLZ4CompressorOutputStream.Parameters(framedLZ4CompressorOutputStream_BlockSize0, true, true, true, (Parameters) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FramedLZ4CompressorOutputStream.BlockSize framedLZ4CompressorOutputStream_BlockSize0 = FramedLZ4CompressorOutputStream.BlockSize.M4;
      FramedLZ4CompressorOutputStream.Parameters framedLZ4CompressorOutputStream_Parameters0 = new FramedLZ4CompressorOutputStream.Parameters(framedLZ4CompressorOutputStream_BlockSize0, false, false, true);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FramedLZ4CompressorOutputStream.BlockSize framedLZ4CompressorOutputStream_BlockSize0 = FramedLZ4CompressorOutputStream.BlockSize.K64;
      FramedLZ4CompressorOutputStream.Parameters framedLZ4CompressorOutputStream_Parameters0 = new FramedLZ4CompressorOutputStream.Parameters(framedLZ4CompressorOutputStream_BlockSize0);
      FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream0 = null;
      try {
        framedLZ4CompressorOutputStream0 = new FramedLZ4CompressorOutputStream((OutputStream) null, framedLZ4CompressorOutputStream_Parameters0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/digest/XXHash32
         //
         verifyException("org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FramedLZ4CompressorOutputStream.BlockSize framedLZ4CompressorOutputStream_BlockSize0 = FramedLZ4CompressorOutputStream.BlockSize.K64;
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      FramedLZ4CompressorOutputStream.Parameters framedLZ4CompressorOutputStream_Parameters0 = new FramedLZ4CompressorOutputStream.Parameters(framedLZ4CompressorOutputStream_BlockSize0, parameters0);
      String string0 = framedLZ4CompressorOutputStream_Parameters0.toString();
      assertEquals("LZ4 Parameters with BlockSize K64, withContentChecksum true, withBlockChecksum false, withBlockDependency false", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FramedLZ4CompressorOutputStream.BlockSize framedLZ4CompressorOutputStream_BlockSize0 = FramedLZ4CompressorOutputStream.BlockSize.K64;
      int int0 = framedLZ4CompressorOutputStream_BlockSize0.getSize();
      assertEquals(65536, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FramedLZ4CompressorOutputStream.BlockSize framedLZ4CompressorOutputStream_BlockSize0 = FramedLZ4CompressorOutputStream.BlockSize.M4;
      int int0 = framedLZ4CompressorOutputStream_BlockSize0.getIndex();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2189);
      FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream0 = null;
      try {
        framedLZ4CompressorOutputStream0 = new FramedLZ4CompressorOutputStream(byteArrayOutputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/digest/XXHash32
         //
         verifyException("org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream", e);
      }
  }
}
