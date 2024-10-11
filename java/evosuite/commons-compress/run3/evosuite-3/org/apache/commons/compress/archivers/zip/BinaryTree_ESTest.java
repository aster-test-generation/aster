
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import org.apache.commons.compress.archivers.zip.BinaryTree;
import org.apache.commons.compress.archivers.zip.BitStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BinaryTree_ESTest extends BinaryTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(4);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(4, (-1700), 4, (-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 40
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(8);
      binaryTree0.addLeaf(2, 64, 2, 8);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(2, 8, 2, (-71));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tree value at index 11 has already been assigned (8)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(3492, 3492, (-755), (-755));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3492
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      // Undeclared exception!
      try { 
        binaryTree0.read((BitStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        BinaryTree.decode((InputStream) null, 1581);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 3848);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        BinaryTree.decode(dataInputStream0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(15);
      binaryTree0.addLeaf(0, 1552, 0, (-87));
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(0, 15, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tree value at index 0 has already been assigned (-87)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinaryTree binaryTree0 = null;
      try {
        binaryTree0 = new BinaryTree(57);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // depth must be bigger than 0 and not bigger than 30 but is 57
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinaryTree binaryTree0 = null;
      try {
        binaryTree0 = new BinaryTree((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // depth must be bigger than 0 and not bigger than 30 but is -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 30, (byte)124);
      try { 
        BinaryTree.decode(byteArrayInputStream0, 15);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot read the size of the encoded tree, unexpected end of stream
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        BinaryTree.decode(byteArrayInputStream0, 0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        BinaryTree.decode(pipedInputStream0, (-690));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // totalNumberOfValues must be bigger than 0, is -690
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }
}
