
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


package org.apache.commons.compress.compressors.zstandard;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ZstdCompressorOutputStream_ESTest extends ZstdCompressorOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZstdCompressorOutputStream zstdCompressorOutputStream0 = null;
      try {
        zstdCompressorOutputStream0 = new ZstdCompressorOutputStream((OutputStream) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/github/luben/zstd/ZstdOutputStream
         //
         verifyException("org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZstdCompressorOutputStream zstdCompressorOutputStream0 = null;
      try {
        zstdCompressorOutputStream0 = new ZstdCompressorOutputStream((OutputStream) null, 4);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/github/luben/zstd/ZstdOutputStream
         //
         verifyException("org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZstdCompressorOutputStream zstdCompressorOutputStream0 = null;
      try {
        zstdCompressorOutputStream0 = new ZstdCompressorOutputStream((OutputStream) null, 0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/github/luben/zstd/ZstdOutputStream
         //
         verifyException("org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZstdCompressorOutputStream zstdCompressorOutputStream0 = null;
      try {
        zstdCompressorOutputStream0 = new ZstdCompressorOutputStream((OutputStream) null, 57, false, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/github/luben/zstd/ZstdOutputStream
         //
         verifyException("org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream", e);
      }
  }
}
