
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.zip.BinaryTree;
import org.apache.commons.compress.archivers.zip.BitStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BinaryTree_ESTest extends BinaryTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(16);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(2179, (-3), 16, 831);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 139566
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(1);
      binaryTree0.addLeaf(1, 1, 0, (-4738));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      binaryTree0.addLeaf(0, 0, 0, 0);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(0, (-175), 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tree value at index 0 has already been assigned (0)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      binaryTree0.addLeaf(0, 0, 0, (-35));
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf(0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tree value at index 0 has already been assigned (-35)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      binaryTree0.addLeaf(0, 57, 0, (-1882));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BinaryTree binaryTree0 = new BinaryTree(0);
      // Undeclared exception!
      try { 
        binaryTree0.addLeaf((-295), 0, (-295), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -295
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        BinaryTree.decode((InputStream) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-331), (byte)30);
      // Undeclared exception!
      try { 
        BinaryTree.decode(byteArrayInputStream0, (byte)30);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -331
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinaryTree binaryTree0 = null;
      try {
        binaryTree0 = new BinaryTree(37);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // depth must be bigger than 0 and not bigger than 30 but is 37
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        BinaryTree.decode(byteArrayInputStream0, (byte)8);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/IOUtils
         //
         verifyException("org.apache.commons.compress.utils.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        BinaryTree.decode((InputStream) null, (-20));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // totalNumberOfValues must be bigger than 0, is -20
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        BinaryTree.decode(sequenceInputStream0, 8192);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot read the size of the encoded tree, unexpected end of stream
         //
         verifyException("org.apache.commons.compress.archivers.zip.BinaryTree", e);
      }
  }
}
