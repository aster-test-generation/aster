
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
      long[] longArray0 = new long[4];
      folder0.unpackSizes = longArray0;
      folder0.hasCrc = true;
      folder0.crc = (-1275L);
      folder0.packedStreams = longArray0;
      Coder[] coderArray0 = new Coder[0];
      BindPair[] bindPairArray0 = new BindPair[3];
      folder0.bindPairs = bindPairArray0;
      folder0.coders = coderArray0;
      String string0 = folder0.toString();
      assertEquals("Folder with 0 coders, 0 input streams, 0 output streams, 3 bind pairs, 4 packed streams, 4 unpack sizes, with CRC -1275 and 0 unpack streams", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[7];
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      BindPair[] bindPairArray0 = new BindPair[3];
      folder0.bindPairs = bindPairArray0;
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
      folder0.totalInputStreams = (-2126L);
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
      folder0.totalOutputStreams = (long) 1;
      BindPair[] bindPairArray0 = new BindPair[4];
      BindPair bindPair0 = new BindPair((-1232L), (-1437L));
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPair0;
      bindPairArray0[2] = bindPairArray0[1];
      BindPair bindPair1 = new BindPair(1L, 0L);
      bindPairArray0[3] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[7];
      BindPair[] bindPairArray0 = new BindPair[5];
      BindPair bindPair0 = new BindPair(0L, 0L);
      BindPair bindPair1 = new BindPair(0L, (-1062L));
      folder0.bindPairs = bindPairArray0;
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      BindPair[] bindPairArray1 = new BindPair[3];
      bindPairArray1[0] = bindPair1;
      bindPairArray1[1] = bindPair0;
      folder0.bindPairs = bindPairArray1;
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
  public void test05()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[7];
      Coder[] coderArray0 = new Coder[2];
      folder0.numUnpackSubStreams = 1;
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      BindPair bindPair0 = new BindPair(3575L, 3575L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPair0;
      BindPair bindPair1 = new BindPair(3575L, 2684L);
      bindPairArray0[2] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      folder0.totalOutputStreams = 3575L;
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
  public void test07()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[7];
      Coder coder0 = new Coder((byte[]) null, 0L, (-978L), (byte[]) null);
      coderArray0[2] = coder0;
      long[] longArray0 = new long[8];
      longArray0[2] = 248L;
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals(248L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[7];
      long[] longArray0 = new long[9];
      longArray0[0] = (-978L);
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder(coderArray0[2]);
      assertEquals((-978L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[3];
      longArray0[0] = 2650L;
      folder0.unpackSizes = longArray0;
      folder0.totalOutputStreams = 1L;
      long long0 = folder0.getUnpackSize();
      assertEquals(2650L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[3];
      folder0.unpackSizes = longArray0;
      folder0.totalOutputStreams = 1L;
      long[] longArray1 = new long[7];
      longArray1[0] = (long) (-1197);
      folder0.unpackSizes = longArray1;
      long long0 = folder0.getUnpackSize();
      assertEquals((-1197L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      BindPair bindPair0 = new BindPair(0L, 5484L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPair0;
      bindPairArray0[2] = bindPairArray0[0];
      bindPairArray0[3] = bindPairArray0[0];
      BindPair bindPair1 = new BindPair((-1L), 1L);
      bindPairArray0[4] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream(1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[5];
      BindPair bindPair0 = new BindPair(0L, 0L);
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Folder folder0 = new Folder();
      byte[] byteArray0 = new byte[1];
      long[] longArray0 = new long[0];
      folder0.unpackSizes = longArray0;
      Coder coder0 = new Coder(byteArray0, 0L, 0L, byteArray0);
      Coder[] coderArray0 = new Coder[4];
      coderArray0[0] = coder0;
      folder0.coders = coderArray0;
      // Undeclared exception!
      try { 
        folder0.getUnpackSizeForCoder(coder0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[4];
      folder0.unpackSizes = longArray0;
      folder0.totalOutputStreams = 3575L;
      // Undeclared exception!
      try { 
        folder0.getUnpackSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3574
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[7];
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      BindPair[] bindPairArray0 = new BindPair[3];
      folder0.bindPairs = bindPairArray0;
      folder0.packedStreams = longArray0;
      // Undeclared exception!
      try { 
        folder0.getOrderedCoders();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[4];
      folder0.unpackSizes = longArray0;
      folder0.packedStreams = longArray0;
      Coder[] coderArray0 = new Coder[0];
      BindPair[] bindPairArray0 = new BindPair[3];
      folder0.bindPairs = bindPairArray0;
      folder0.coders = coderArray0;
      String string0 = folder0.toString();
      assertEquals("Folder with 0 coders, 0 input streams, 0 output streams, 3 bind pairs, 4 packed streams, 4 unpack sizes, without CRC and 0 unpack streams", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[7];
      Coder coder0 = new Coder((byte[]) null, 0L, (-978L), (byte[]) null);
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[7];
      folder0.coders = coderArray0;
      // Undeclared exception!
      try { 
        folder0.getUnpackSizeForCoder(coderArray0[1]);
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
      byte[] byteArray0 = new byte[1];
      Coder coder0 = new Coder(byteArray0, (-1), (-1), byteArray0);
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[5];
      BindPair bindPair0 = new BindPair(0L, 0L);
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      folder0.totalOutputStreams = 1L;
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = (long) (byte) (-69);
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Folder folder0 = new Folder();
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[11];
      longArray0[0] = 2602L;
      Coder[] coderArray0 = new Coder[6];
      folder0.coders = coderArray0;
      folder0.unpackSizes = longArray0;
      folder0.packedStreams = folder0.unpackSizes;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[4];
      folder0.coders = coderArray0;
      long[] longArray0 = new long[0];
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[4];
      folder0.packedStreams = longArray0;
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[3];
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Folder folder0 = new Folder();
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      BindPair bindPair0 = new BindPair((byte)0, (-1));
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      BindPair bindPair0 = new BindPair(3575L, 3575L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      bindPairArray0[2] = bindPair0;
      bindPairArray0[3] = bindPair0;
      bindPairArray0[4] = bindPairArray0[2];
      bindPairArray0[5] = bindPairArray0[3];
      bindPairArray0[6] = bindPairArray0[0];
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream((-1099));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.findBindPairForOutStream((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      BindPair bindPair0 = new BindPair((byte)0, (-1));
      bindPairArray0[0] = bindPair0;
      BindPair bindPair1 = new BindPair((-1), (-607));
      bindPairArray0[1] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream((-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[3];
      BindPair bindPair0 = new BindPair(0L, (-2126L));
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      bindPairArray0[2] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream(1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.findBindPairForInStream((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Folder folder0 = new Folder();
      int int0 = folder0.findBindPairForInStream((-607));
      assertEquals((-1), int0);
  }
}
