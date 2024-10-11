
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import org.apache.commons.compress.utils.ChecksumCalculatingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ChecksumCalculatingInputStream_ESTest extends ChecksumCalculatingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(cRC32_0, pipedInputStream0);
      long long0 = checksumCalculatingInputStream0.getValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(adler32_0, pushbackInputStream0);
      long long0 = checksumCalculatingInputStream0.getValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = null;
      try {
        checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(adler32_0, (InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // inputStream
         //
         verifyException("java.util.Objects", e);
      }
  }
}
