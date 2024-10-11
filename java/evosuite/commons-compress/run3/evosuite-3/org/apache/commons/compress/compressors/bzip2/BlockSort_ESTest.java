
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
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(8);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.blockSort(bZip2CompressorOutputStream_Data0, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.mainSort(bZip2CompressorOutputStream_Data0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(2);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.mainSort(bZip2CompressorOutputStream_Data0, (-1));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(9);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 9);
      int[] intArray0 = new int[3];
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      blockSort0.fallbackSort(intArray0, byteArray0, 9996);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(8);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort(intArray0, (byte[]) null, 542);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int[] intArray0 = new int[3];
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort(intArray0, byteArray0, (-1081));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // nbits < 0: -1017
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int[] intArray0 = new int[8];
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort(intArray0, byteArray0, 1926);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(252);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.fallbackSort((BZip2CompressorOutputStream.Data) null, 83);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
        blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.compressors.bzip2.BlockSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(8);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      try { 
        blockSort0.blockSort((BZip2CompressorOutputStream.Data) null, 32);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
        blockSort0.blockSort(bZip2CompressorOutputStream_Data0, 4872);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4873
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
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(5);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      blockSort0.mainSort(bZip2CompressorOutputStream_Data0, 0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(9);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 9);
      blockSort0.blockSort(bZip2CompressorOutputStream_Data0, 31);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(2);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      int[] intArray0 = new int[9];
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-27);
      blockSort0.fallbackSort(intArray0, byteArray0, 2);
      assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(0);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, (byte) (-1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(5);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      blockSort0.fallbackSort(bZip2CompressorOutputStream_Data0, 1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BZip2CompressorOutputStream.Data bZip2CompressorOutputStream_Data0 = new BZip2CompressorOutputStream.Data(64);
      BlockSort blockSort0 = new BlockSort(bZip2CompressorOutputStream_Data0);
      // Undeclared exception!
      blockSort0.blockSort(bZip2CompressorOutputStream_Data0, 18002);
  }
}
