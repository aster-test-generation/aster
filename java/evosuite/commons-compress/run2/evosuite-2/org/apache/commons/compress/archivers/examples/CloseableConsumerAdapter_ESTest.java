
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


package org.apache.commons.compress.archivers.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.commons.compress.archivers.examples.CloseableConsumer;
import org.apache.commons.compress.archivers.examples.CloseableConsumerAdapter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CloseableConsumerAdapter_ESTest extends CloseableConsumerAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CloseableConsumer closeableConsumer0 = mock(CloseableConsumer.class, new ViolatedAssumptionAnswer());
      CloseableConsumerAdapter closeableConsumerAdapter0 = new CloseableConsumerAdapter(closeableConsumer0);
      MockFileReader mockFileReader0 = closeableConsumerAdapter0.track((MockFileReader) null);
      assertNull(mockFileReader0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CloseableConsumerAdapter closeableConsumerAdapter0 = null;
      try {
        closeableConsumerAdapter0 = new CloseableConsumerAdapter((CloseableConsumer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // consumer
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CloseableConsumer closeableConsumer0 = mock(CloseableConsumer.class, new ViolatedAssumptionAnswer());
      CloseableConsumerAdapter closeableConsumerAdapter0 = new CloseableConsumerAdapter(closeableConsumer0);
      MockFile mockFile0 = new MockFile("yv^plix8]:'|>");
      File file0 = MockFile.createTempFile("yv^plix8]:'|>", "", (File) mockFile0);
      MockFileReader mockFileReader0 = new MockFileReader(file0);
      closeableConsumerAdapter0.track(mockFileReader0);
      closeableConsumerAdapter0.close();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CloseableConsumer closeableConsumer0 = mock(CloseableConsumer.class, new ViolatedAssumptionAnswer());
      CloseableConsumerAdapter closeableConsumerAdapter0 = new CloseableConsumerAdapter(closeableConsumer0);
      closeableConsumerAdapter0.close();
  }
}
