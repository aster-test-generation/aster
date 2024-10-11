
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
import org.apache.commons.compress.archivers.zip.JarMarker;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JarMarker_ESTest extends JarMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      byte[] byteArray0 = new byte[1];
      jarMarker0.parseFromCentralDirectoryData(byteArray0, 1185, (byte)0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      byte[] byteArray0 = new byte[2];
      try { 
        jarMarker0.parseFromLocalFileData(byteArray0, (-120), (-120));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // JarMarker doesn't expect any data
         //
         verifyException("org.apache.commons.compress.archivers.zip.JarMarker", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      byte[] byteArray0 = jarMarker0.getLocalFileDataData();
      jarMarker0.parseFromLocalFileData(byteArray0, (byte)0, (byte)0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      ZipShort zipShort0 = jarMarker0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JarMarker jarMarker0 = new JarMarker();
      try { 
        jarMarker0.parseFromCentralDirectoryData((byte[]) null, 1286, 1286);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // JarMarker doesn't expect any data
         //
         verifyException("org.apache.commons.compress.archivers.zip.JarMarker", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      ZipShort zipShort0 = jarMarker0.getHeaderId();
      assertEquals(51966, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      byte[] byteArray0 = jarMarker0.getCentralDirectoryData();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JarMarker jarMarker0 = JarMarker.getInstance();
      ZipShort zipShort0 = jarMarker0.getLocalFileDataLength();
      assertEquals(0, zipShort0.getValue());
  }
}
