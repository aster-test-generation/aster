
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.sevenz.StreamMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StreamMap_ESTest extends StreamMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[1];
      long[] longArray0 = new long[6];
      int[] intArray1 = new int[6];
      StreamMap streamMap0 = new StreamMap(intArray0, longArray0, intArray1, intArray1);
      String string0 = streamMap0.toString();
      assertEquals("StreamMap with indices of 1 folders, offsets of 6 packed streams, first files of 6 folders and folder indices for 6 files", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long[] longArray0 = new long[4];
      StreamMap streamMap0 = new StreamMap((int[]) null, longArray0, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        streamMap0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.StreamMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[0];
      long[] longArray0 = new long[9];
      int[] intArray1 = new int[2];
      StreamMap streamMap0 = new StreamMap(intArray0, longArray0, intArray0, intArray1);
      String string0 = streamMap0.toString();
      assertEquals("StreamMap with indices of 0 folders, offsets of 9 packed streams, first files of 0 folders and folder indices for 2 files", string0);
  }
}
