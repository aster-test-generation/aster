
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


package org.apache.commons.compress.compressors.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.compressors.pack200.InMemoryCachingStreamBridge;
import org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractStreamBridge_ESTest extends AbstractStreamBridge_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InMemoryCachingStreamBridge inMemoryCachingStreamBridge0 = new InMemoryCachingStreamBridge();
      inMemoryCachingStreamBridge0.getInputStream();
      inMemoryCachingStreamBridge0.stop();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InMemoryCachingStreamBridge inMemoryCachingStreamBridge0 = new InMemoryCachingStreamBridge();
      inMemoryCachingStreamBridge0.stop();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          TempFileCachingStreamBridge tempFileCachingStreamBridge0 = null;
          try {
            tempFileCachingStreamBridge0 = new TempFileCachingStreamBridge();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file or directory
             //
             verifyException("java.nio.file.TempFileHelper", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InMemoryCachingStreamBridge inMemoryCachingStreamBridge0 = new InMemoryCachingStreamBridge();
      InputStream inputStream0 = inMemoryCachingStreamBridge0.getInputStream();
      InputStream inputStream1 = inMemoryCachingStreamBridge0.getInputStream();
      assertSame(inputStream1, inputStream0);
  }
}
