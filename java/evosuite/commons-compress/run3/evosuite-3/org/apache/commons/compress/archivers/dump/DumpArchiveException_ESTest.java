
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
import org.apache.commons.compress.archivers.dump.DumpArchiveException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpArchiveException_ESTest extends DumpArchiveException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DumpArchiveException dumpArchiveException0 = new DumpArchiveException("", (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DumpArchiveException dumpArchiveException0 = new DumpArchiveException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DumpArchiveException dumpArchiveException0 = new DumpArchiveException("Z;0O(%|EC");
      MockThrowable mockThrowable0 = new MockThrowable(dumpArchiveException0);
      DumpArchiveException dumpArchiveException1 = new DumpArchiveException(mockThrowable0);
      assertFalse(dumpArchiveException1.equals((Object)dumpArchiveException0));
  }
}
