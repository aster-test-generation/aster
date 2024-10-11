
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
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ResourceAlignmentExtraField_ESTest extends ResourceAlignmentExtraField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0, false);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, 0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[3];
      resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (byte)3);
      ZipShort zipShort0 = resourceAlignmentExtraField0.getLocalFileDataLength();
      assertFalse(resourceAlignmentExtraField0.allowMethodChange());
      assertEquals(3, zipShort0.getValue());
      assertEquals((short)0, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[3];
      resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, (byte)0, (byte)3);
      byte[] byteArray1 = resourceAlignmentExtraField0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(32767);
      assertFalse(resourceAlignmentExtraField0.allowMethodChange());
      assertEquals((short)32767, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(1, true);
      short short0 = resourceAlignmentExtraField0.getAlignment();
      assertTrue(resourceAlignmentExtraField0.allowMethodChange());
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(2, true, 0);
      boolean boolean0 = resourceAlignmentExtraField0.allowMethodChange();
      assertTrue(boolean0);
      assertEquals((short)2, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[4];
      try { 
        resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, (byte)0, 0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Too short content for ResourceAlignmentExtraField (0xa11e): 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(2069, false, 2069);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, 2069, 2069);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2069
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromCentralDirectoryData((byte[]) null, 41246, 41246);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(1, true);
      byte[] byteArray0 = new byte[9];
      resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)4, 1013);
      assertFalse(resourceAlignmentExtraField0.allowMethodChange());
      assertEquals((short)0, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-46);
      resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)0, (byte)3);
      assertTrue(resourceAlignmentExtraField0.allowMethodChange());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(647);
      assertEquals((short)647, resourceAlignmentExtraField0.getAlignment());
      
      byte[] byteArray0 = new byte[3];
      resourceAlignmentExtraField0.parseFromLocalFileData(byteArray0, 0, (byte)111);
      assertEquals((short)0, resourceAlignmentExtraField0.getAlignment());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(2);
      byte[] byteArray0 = new byte[5];
      try { 
        resourceAlignmentExtraField0.parseFromCentralDirectoryData(byteArray0, (byte)4, (byte)0);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // Too short content for ResourceAlignmentExtraField (0xa11e): 0
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(906, true);
      byte[] byteArray0 = resourceAlignmentExtraField0.getLocalFileDataData();
      assertEquals(2, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-118), (byte) (-125)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(906, true);
      byte[] byteArray0 = resourceAlignmentExtraField0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte) (-118), (byte) (-125)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0);
      byte[] byteArray0 = resourceAlignmentExtraField0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = null;
      try {
        resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(2, false, (-4292));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Padding must not be negative, was: -4292
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = null;
      try {
        resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(41246, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Alignment must be between 0 and 0x7fff, was: 41246
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = null;
      try {
        resourceAlignmentExtraField0 = new ResourceAlignmentExtraField((-24));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Alignment must be between 0 and 0x7fff, was: -24
         //
         verifyException("org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      ZipShort zipShort0 = resourceAlignmentExtraField0.getCentralDirectoryLength();
      assertEquals(2, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      boolean boolean0 = resourceAlignmentExtraField0.allowMethodChange();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField();
      short short0 = resourceAlignmentExtraField0.getAlignment();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(0);
      // Undeclared exception!
      try { 
        resourceAlignmentExtraField0.parseFromLocalFileData((byte[]) null, 1684, 2350);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResourceAlignmentExtraField resourceAlignmentExtraField0 = new ResourceAlignmentExtraField(906, true);
      resourceAlignmentExtraField0.getHeaderId();
      assertEquals((short)906, resourceAlignmentExtraField0.getAlignment());
      assertTrue(resourceAlignmentExtraField0.allowMethodChange());
  }
}
