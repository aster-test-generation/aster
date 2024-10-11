
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


package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArchiveUtils_ESTest extends ArchiveUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 67324752L);
      String string0 = ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      assertEquals("- 67324752 null", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)95;
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-47), (byte) (-32), byteArray0, (byte)37, 334);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-47), (byte) (-32), byteArray0, (byte)37, 334);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("k2yHtgO{-M^h1Z{a'c^");
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, (-493), 32, byteArray0, (-2943), (-493), true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -986
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-53);
      byte[] byteArray1 = new byte[6];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = ArchiveUtils.toAsciiBytes("");
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, 0, (int) (byte)0, byteArray0, (int) (byte)0, 100);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("org.apache.commons.compress.archivers.dump.DumpArchiveSummary");
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (byte)24);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = ArchiveUtils.toAsciiString(byteArray0, (int) (byte)0, (int) (byte)2);
      assertEquals("\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = ArchiveUtils.toAsciiString(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("", byteArray0, (-1709), 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("}AJ78w");
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("}AJ78w", byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)118;
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte)0, 684, (byte[]) null, 0, (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("k2yHtgO{-M^h1Z{a'c^");
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (-493), (-493), byteArray0, 0, (-493));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toString((ArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString(byteArray0, (int) (byte) (-126), (-651));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiBytes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.sanitize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer((String) null, byteArray0, 32780, (int) (byte)64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer("CU", byteArray0, (int) (byte)32, 685);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ArchiveUtils.matchAsciiBuffer((String) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull((byte[]) null, 1191, 1882, (byte[]) null, 2080, 2080);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("aCoPJ ZBsj)>30/H");
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray0, 2687, 2687, byteArray0, 2687, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2687
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, 0, 26115, (byte[]) null, 0, (int) (byte)20, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, 0, 416, (byte[]) null, 0, 255);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, (int) (byte)24, (int) (byte)94, byteArray0, (int) (byte) (-81), 677);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 24
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[5];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (-2117), 125, byteArray1, (-2117), (int) (byte)0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 0, 0, byteArray0, 4606, 0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-95);
      byte[] byteArray1 = new byte[20];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, 17, 2786, byteArray0, (int) (byte)0, (int) (byte)44, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOptionArray0[0];
      linkOptionArray0[4] = linkOptionArray0[1];
      linkOptionArray0[5] = linkOption0;
      linkOptionArray0[6] = linkOptionArray0[0];
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(path0, "org.apache.commons.compress.utils.ArchiveUtils", linkOptionArray0);
      String string0 = ArchiveUtils.toString((ArchiveEntry) cpioArchiveEntry0);
      assertEquals("d       0 org.apache.commons.compress.utils.ArchiveUtils", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("\u0000\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
      assertEquals("??????", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("9~)R2>9+k;Z<1z");
      assertEquals("9~)R2>9+k;Z<1z", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-101);
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 0, (int) (byte)0, byteArray0, 0, 12, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = ArchiveUtils.toAsciiBytes("");
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byteArray0[15] = (byte) (-27);
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 0, 1110, byteArray0, 0, 12, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, (int) (byte)7, (int) (byte)7, byteArray0, (int) (byte)7, (int) (byte)0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("\u0000\uFFFD\uFFFD", byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("9~)R2>9+k;Z<1z", byteArray0, 0, 3120);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-101);
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, 1625);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ArchiveUtils.isArrayZero(byteArray0, 1625);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (byte) (-27));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("");
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, (byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = ArchiveUtils.isEqualWithNull((byte[]) null, (-235), 0, (byte[]) null, (-235), 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      boolean boolean0 = ArchiveUtils.isEqual((byte[]) null, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString((byte[]) null, 549, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
