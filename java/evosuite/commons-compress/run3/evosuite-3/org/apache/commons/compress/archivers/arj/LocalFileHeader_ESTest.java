
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


package org.apache.commons.compress.archivers.arj;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.arj.LocalFileHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocalFileHeader_ESTest extends LocalFileHeader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileType = 0;
      localFileHeader0.fileType = 1570;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=1570, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeCreated = (-1996);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=-1996, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeModified = 0;
      localFileHeader0.dateTimeModified = 645;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=645, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.extendedFilePosition = (-1577);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=-1577, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.lastChapter = 645;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=645, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeAccessed = 5115;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=5115, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.firstChapter = (-932);
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=-932, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileAccessMode = 449;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=449, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = 3;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=3, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.minVersionToExtract = 1570;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=1570, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.archiverVersionNumber = 2098;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=2098, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileSpecPosition = 1;
      String string0 = localFileHeader0.toString();
      assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=1, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.dateTimeAccessed = 713;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.extendedFilePosition = 5;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.lastChapter = (-783);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.fileAccessMode = 615;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.originalCrc32 = 1L;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.originalSize = (-1903L);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.originalSize = (-1635L);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.compressedSize = (long) (-288);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.dateTimeModified = 30;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.reserved = 5;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.fileType = (-1);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.method = (-2089);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.arjFlags = 448;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.minVersionToExtract = (-1);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.firstChapter = 441;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.arjFlags = (-2314);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.hostOS = 8;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.method = (-2089);
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.archiverVersionNumber = 1;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.fileSpecPosition = 4;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hashCode();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.name = "LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]";
      localFileHeader0.hashCode();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      byte[][] byteArray0 = new byte[3][2];
      localFileHeader1.extendedHeaders = byteArray0;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      localFileHeader1.comment = "LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]";
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.name = "z=Y\"e8!]i";
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      localFileHeader1.originalSizeEvenForVolumes = 645;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeCreated = (-709);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeAccessed = 5115;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.extendedFilePosition = 714;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.lastChapter = 9;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.firstChapter = 2202;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileAccessMode = 449;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(boolean0);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.fileSpecPosition = 4;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.originalCrc32 = (long) 932;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.compressedSize = (long) (-594);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.dateTimeModified = 0;
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader0.dateTimeModified = 645;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.reserved = 1;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.fileType = 1830;
      boolean boolean0 = localFileHeader1.equals(localFileHeader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.hostOS = 448;
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      assertTrue(localFileHeader1.equals((Object)localFileHeader0));
      
      localFileHeader1.minVersionToExtract = (-3395);
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.archiverVersionNumber = (-1805);
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertFalse(localFileHeader1.equals((Object)localFileHeader0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      LocalFileHeader localFileHeader1 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalFileHeader.Flags localFileHeader_Flags0 = new LocalFileHeader.Flags();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalFileHeader.FileTypes localFileHeader_FileTypes0 = new LocalFileHeader.FileTypes();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalFileHeader.Methods localFileHeader_Methods0 = new LocalFileHeader.Methods();
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      boolean boolean0 = localFileHeader0.equals(localFileHeader_Methods0);
      assertFalse(boolean0);
  }
}
