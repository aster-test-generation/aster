
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


package org.apache.commons.compress.compressors.snappy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import org.apache.commons.compress.compressors.lz77support.Parameters;
import org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FramedSnappyCompressorOutputStream_ESTest extends FramedSnappyCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("0v5D/p4HRjU5B|5", "*\"dP9*#PE!7G3");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Parameters parameters0 = mock(Parameters.class, new ViolatedAssumptionAnswer());
      FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream0 = null;
      try {
        framedSnappyCompressorOutputStream0 = new FramedSnappyCompressorOutputStream(mockPrintStream0, parameters0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/digest/PureJavaCrc32C
         //
         verifyException("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream0 = null;
      try {
        framedSnappyCompressorOutputStream0 = new FramedSnappyCompressorOutputStream(byteArrayOutputStream0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/digest/PureJavaCrc32C
         //
         verifyException("org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long long0 = FramedSnappyCompressorOutputStream.mask((-352L));
      assertEquals(2726488791L, long0);
  }
}
