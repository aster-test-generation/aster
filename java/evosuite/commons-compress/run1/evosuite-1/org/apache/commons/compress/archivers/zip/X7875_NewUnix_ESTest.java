
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
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class X7875_NewUnix_ESTest extends X7875_NewUnix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(0L);
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, 772);
      assertArrayEquals(new byte[] {(byte)1, (byte)1, (byte)0, (byte)2, (byte) (-24), (byte)3}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, 772);
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte) (-24), (byte)3, (byte)2, (byte) (-24), (byte)3}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-20);
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, (byte)92);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X7875_NewUnix invalid: uidSize 236 doesn't fit into 92 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[5];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, (byte)3);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[1];
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)117, (-3700));
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X7875_NewUnix length is too short, only -3700 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, 30837);
      x7875_NewUnix0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(255L);
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)1, (byte) (-1), (byte)2, (byte) (-24), (byte)3}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      Object object0 = x7875_NewUnix0.clone();
      assertTrue(object0.equals((Object)x7875_NewUnix0));
      
      byte[] byteArray0 = new byte[6];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, (byte)4);
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setGID(255L);
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      assertEquals(6, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[6];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, (byte)4);
      long long0 = x7875_NewUnix0.getUID();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, 30837);
      long long0 = x7875_NewUnix0.getGID();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      // Undeclared exception!
      try { 
        x7875_NewUnix0.parseFromLocalFileData((byte[]) null, 8, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, 16, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-95);
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, (byte)48);
        fail("Expecting exception: ZipException");
      
      } catch(ZipException e) {
         //
         // X7875_NewUnix invalid: gidSize 161 doesn't fit into 48 bytes
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      Object object0 = x7875_NewUnix0.clone();
      assertTrue(object0.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix0.setGID((-2469L));
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(0L);
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix1.equals(x7875_NewUnix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix0.equals("0x7875 Zip Extra Field: UID=1000 GID=1000");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[4];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, (byte)9);
      byte[] byteArray1 = x7875_NewUnix0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)0, (byte)1, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = X7875_NewUnix.trimLeadingZeroesForceMinLength((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.parseFromCentralDirectoryData((byte[]) null, (-1169), (-1169));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      long long0 = x7875_NewUnix0.getGID();
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getHeaderId();
      assertEquals(30837, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = x7875_NewUnix0.getCentralDirectoryData();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(0, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      Object object0 = x7875_NewUnix0.clone();
      byte[] byteArray0 = new byte[4];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, (byte)9);
      boolean boolean0 = object0.equals(x7875_NewUnix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      long long0 = x7875_NewUnix0.getUID();
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      String string0 = x7875_NewUnix0.toString();
      assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", string0);
  }
}
