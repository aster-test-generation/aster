
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
import java.io.IOException;
import org.apache.commons.compress.archivers.sevenz.BindPair;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.apache.commons.compress.archivers.sevenz.Folder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Folder_ESTest extends Folder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      folder0.packedStreams = longArray0;
      BindPair[] bindPairArray0 = new BindPair[3];
      folder0.bindPairs = bindPairArray0;
      Coder[] coderArray0 = new Coder[1];
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      folder0.crc = (-1L);
      folder0.hasCrc = true;
      String string0 = folder0.toString();
      assertEquals("Folder with 1 coders, 0 input streams, 0 output streams, 3 bind pairs, 2 packed streams, 2 unpack sizes, with CRC -1 and 0 unpack streams", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[3];
      folder0.bindPairs = bindPairArray0;
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      long[] longArray0 = new long[0];
      folder0.packedStreams = longArray0;
      // Undeclared exception!
      try { 
        folder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = (-1L);
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      // Undeclared exception!
      try { 
        folder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = 1938L;
      BindPair[] bindPairArray0 = new BindPair[2];
      BindPair bindPair0 = new BindPair(1938L, 1937L);
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.getUnpackSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[3];
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair((-1303L), 29L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      bindPairArray0[2] = bindPairArray0[1];
      bindPairArray0[3] = bindPair0;
      bindPairArray0[4] = bindPairArray0[1];
      bindPairArray0[5] = bindPairArray0[0];
      bindPairArray0[6] = bindPair0;
      BindPair bindPair1 = new BindPair((-100L), 0L);
      bindPairArray0[7] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      folder0.packedStreams = longArray0;
      Coder[] coderArray0 = new Coder[4];
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[1];
      folder0.numUnpackSubStreams = 1431655765;
      Coder[] coderArray0 = new Coder[2];
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair(0L, 0L);
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      try { 
        folder0.getOrderedCoders();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // folder uses the same coder more than once in coder chain
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[1];
      folder0.numUnpackSubStreams = 1431655765;
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[3];
      longArray0[0] = 526L;
      folder0.packedStreams = longArray0;
      Coder[] coderArray0 = new Coder[4];
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[2];
      BindPair bindPair0 = new BindPair((-1885L), 2608L);
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.findBindPairForInStream((-1354));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      longArray0[0] = 1L;
      Coder[] coderArray0 = new Coder[1];
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder((Coder) null);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      Coder[] coderArray0 = new Coder[1];
      Coder coder0 = new Coder((byte[]) null, 6185, (-1L), (byte[]) null);
      coderArray0[0] = coder0;
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      longArray0[0] = (-1L);
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = 1L;
      long[] longArray0 = new long[8];
      longArray0[0] = 1L;
      folder0.unpackSizes = longArray0;
      long long0 = folder0.getUnpackSize();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = 1L;
      long[] longArray0 = new long[7];
      longArray0[0] = (long) (-1878);
      folder0.unpackSizes = longArray0;
      long long0 = folder0.getUnpackSize();
      assertEquals((-1878L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[4];
      BindPair bindPair0 = new BindPair(0L, 0L);
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream((byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair((-409L), (-409L));
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      bindPairArray0[2] = bindPairArray0[0];
      bindPairArray0[3] = bindPair0;
      bindPairArray0[4] = bindPairArray0[3];
      bindPairArray0[5] = bindPairArray0[0];
      BindPair bindPair1 = new BindPair((-1614L), 0L);
      bindPairArray0[6] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream(0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      BindPair bindPair0 = new BindPair((-2386), (-2386));
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream((-2386));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[1];
      folder0.unpackSizes = longArray0;
      Coder[] coderArray0 = new Coder[2];
      byte[] byteArray0 = new byte[2];
      Coder coder0 = new Coder(byteArray0, (-5229L), 0L, byteArray0);
      coderArray0[1] = coder0;
      folder0.coders = coderArray0;
      // Undeclared exception!
      try { 
        folder0.getUnpackSizeForCoder(coder0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[6];
      folder0.unpackSizes = longArray0;
      folder0.totalOutputStreams = 5056L;
      // Undeclared exception!
      try { 
        folder0.getUnpackSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[8];
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.findBindPairForOutStream(1234);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      folder0.packedStreams = longArray0;
      BindPair[] bindPairArray0 = new BindPair[3];
      folder0.bindPairs = bindPairArray0;
      Coder[] coderArray0 = new Coder[1];
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      String string0 = folder0.toString();
      assertEquals("Folder with 1 coders, 0 input streams, 0 output streams, 3 bind pairs, 2 packed streams, 2 unpack sizes, without CRC and 0 unpack streams", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[2];
      byte[] byteArray0 = new byte[2];
      Coder coder0 = new Coder(byteArray0, (-5229L), 0L, byteArray0);
      coderArray0[0] = coder0;
      folder0.coders = coderArray0;
      // Undeclared exception!
      try { 
        folder0.getUnpackSizeForCoder(coder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[2];
      byte[] byteArray0 = new byte[2];
      Coder coder0 = new Coder(byteArray0, (-5229L), 0L, byteArray0);
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Folder folder0 = new Folder();
      byte[] byteArray0 = new byte[1];
      Coder coder0 = new Coder(byteArray0, (-50L), (-1L), byteArray0);
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = 1938L;
      BindPair[] bindPairArray0 = new BindPair[2];
      BindPair bindPair0 = new BindPair(0L, 1938L);
      bindPairArray0[0] = bindPair0;
      BindPair bindPair1 = new BindPair(1938L, 1937L);
      bindPairArray0[1] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.getUnpackSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Folder folder0 = new Folder();
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = (long) (-1);
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      longArray0[0] = 1L;
      folder0.packedStreams = longArray0;
      Coder[] coderArray0 = new Coder[1];
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[3];
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      long[] longArray0 = new long[0];
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Folder folder0 = new Folder();
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair(0L, 0L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPair0;
      bindPairArray0[2] = bindPairArray0[0];
      bindPairArray0[3] = bindPair0;
      bindPairArray0[4] = bindPairArray0[0];
      bindPairArray0[5] = bindPair0;
      bindPairArray0[6] = bindPairArray0[2];
      bindPairArray0[7] = bindPair0;
      bindPairArray0[8] = bindPairArray0[7];
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream(3);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[1];
      Coder[] coderArray0 = new Coder[2];
      BindPair[] bindPairArray0 = new BindPair[9];
      folder0.bindPairs = bindPairArray0;
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      // Undeclared exception!
      try { 
        folder0.getOrderedCoders();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair(0L, 0L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      bindPairArray0[2] = bindPair0;
      BindPair bindPair1 = new BindPair((-1L), 850L);
      bindPairArray0[3] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream((-1));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[3];
      BindPair bindPair0 = new BindPair((-627L), 1470L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPair0;
      bindPairArray0[2] = bindPairArray0[1];
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream((-2516));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Folder folder0 = new Folder();
      int int0 = folder0.findBindPairForInStream((-1968526676));
      assertEquals((-1), int0);
  }
}
