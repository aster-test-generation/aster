
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


package org.apache.commons.compress.compressors.bzip2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.bzip2.BlockSort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BlockSort_ESTest extends BlockSort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(4);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 4);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(3);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 3);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 217;
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(217);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.blockSort(bZip2CompressorOutputStream_Data0, int0);
      blockSort0.mainSort(bZip2CompressorOutputStream_Data0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int[] intArray0 = new int[6];
      byte[] byteArray0 = new byte[6];
      blockSort0.fallbackSort(intArray0, byteArray0, 0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.mainSort(bZip2CompressorOutputStream_Data0, 104);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 106
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = (-2097153);
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data((-2097153));
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int int1 = (-1);
      // Undeclared exception!
      try { 
        blockSort0.mainSort(bZip2CompressorOutputStream_Data0, int1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int[] intArray0 = new int[6];
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort(intArray0, byteArray0, (-1387));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -1323
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int[] intArray0 = new int[1];
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort(intArray0, byteArray0, 2302);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort((BZip2CompressorOutputStream.Data) null, (-1256));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, (-1256));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1255
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.blockSort(bZip2CompressorOutputStream_Data0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BlockSort blockSort0 = null;
      try {
        blockSort0 = new BlockSort((BZip2CompressorOutputStream.Data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(2);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      blockSort0.mainSort(bZip2CompressorOutputStream_Data0, 2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(5);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 5);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(2);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 2);
      blockSort0.blockSort(bZip2CompressorOutputStream_Data0, 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(7);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.blockSort(bZip2CompressorOutputStream_Data0, 200);
  }
}
