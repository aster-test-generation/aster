
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
import java.io.File;
import java.io.InputStream;
import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CRC32VerifyingInputStream_ESTest extends CRC32VerifyingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("N>4${EEJ0!\"9xlLj", "Q\"");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      CRC32VerifyingInputStream cRC32VerifyingInputStream0 = new CRC32VerifyingInputStream((InputStream) mockFileInputStream0, 511L, (long) 1943);
      assertEquals(511L, cRC32VerifyingInputStream0.getBytesRemaining());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = MockFile.createTempFile("N>4${EEJ0!\"9xlLj", "Q\"");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      CRC32VerifyingInputStream cRC32VerifyingInputStream0 = new CRC32VerifyingInputStream((InputStream) mockFileInputStream0, (-836L), 1943);
      assertEquals((-836L), cRC32VerifyingInputStream0.getBytesRemaining());
  }
}
