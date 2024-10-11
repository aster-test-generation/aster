
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.dump.DumpArchiveConstants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveConstants_ESTest extends DumpArchiveConstants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DumpArchiveConstants.SEGMENT_TYPE dumpArchiveConstants_SEGMENT_TYPE0 = DumpArchiveConstants.SEGMENT_TYPE.find(2);
      assertEquals(DumpArchiveConstants.SEGMENT_TYPE.INODE, dumpArchiveConstants_SEGMENT_TYPE0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DumpArchiveConstants.COMPRESSION_TYPE dumpArchiveConstants_COMPRESSION_TYPE0 = DumpArchiveConstants.COMPRESSION_TYPE.find((-1));
      assertEquals(DumpArchiveConstants.COMPRESSION_TYPE.UNKNOWN, dumpArchiveConstants_COMPRESSION_TYPE0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DumpArchiveConstants.COMPRESSION_TYPE dumpArchiveConstants_COMPRESSION_TYPE0 = DumpArchiveConstants.COMPRESSION_TYPE.find((-3402));
      assertEquals(DumpArchiveConstants.COMPRESSION_TYPE.UNKNOWN, dumpArchiveConstants_COMPRESSION_TYPE0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DumpArchiveConstants.SEGMENT_TYPE dumpArchiveConstants_SEGMENT_TYPE0 = DumpArchiveConstants.SEGMENT_TYPE.find(3);
      assertEquals(DumpArchiveConstants.SEGMENT_TYPE.BITS, dumpArchiveConstants_SEGMENT_TYPE0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DumpArchiveConstants.SEGMENT_TYPE.find(0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DumpArchiveConstants.COMPRESSION_TYPE dumpArchiveConstants_COMPRESSION_TYPE0 = DumpArchiveConstants.COMPRESSION_TYPE.find(0);
      assertEquals(DumpArchiveConstants.COMPRESSION_TYPE.ZLIB, dumpArchiveConstants_COMPRESSION_TYPE0);
  }
}
