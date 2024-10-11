
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


package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Date;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveEntry_ESTest extends ArArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 749L, 151, (-2484), 1, (-98L));
      Date date0 = arArchiveEntry0.getLastModifiedDate();
      assertEquals("Wed Dec 31 23:58:22 GMT 1969", date0.toString());
      assertEquals(1, arArchiveEntry0.getMode());
      assertEquals((-2484), arArchiveEntry0.getGroupId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(749L, arArchiveEntry0.getLength());
      assertEquals(151, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 749L, 151, (-2484), 1, (-98L));
      int int0 = arArchiveEntry0.getUserId();
      assertEquals("", arArchiveEntry0.getName());
      assertEquals((-2484), arArchiveEntry0.getGroupId());
      assertEquals(151, int0);
      assertEquals((-98L), arArchiveEntry0.getLastModified());
      assertEquals(1, arArchiveEntry0.getMode());
      assertEquals(749L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 0L, (-1054), (-1054), 2, 2);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals((-1054), arArchiveEntry0.getGroupId());
      assertEquals(2, arArchiveEntry0.getMode());
      assertEquals(2L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals((-1054), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 749L, 151, (-2484), 1, (-98L));
      long long0 = arArchiveEntry0.getSize();
      assertEquals(151, arArchiveEntry0.getUserId());
      assertEquals(1, arArchiveEntry0.getMode());
      assertEquals((-2484), arArchiveEntry0.getGroupId());
      assertEquals((-98L), arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(749L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("s7\"?a6vT>J6", "s7\"?a6vT>J6");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(file0, (String) null);
      String string0 = arArchiveEntry0.getName();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertNull(string0);
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("d-`NG@ue", 0L);
      String string0 = arArchiveEntry0.getName();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("d-`NG@ue", string0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 749L, 151, (-2484), 1, (-98L));
      String string0 = arArchiveEntry0.getName();
      assertEquals(1, arArchiveEntry0.getMode());
      assertEquals(151, arArchiveEntry0.getUserId());
      assertEquals((-2484), arArchiveEntry0.getGroupId());
      assertEquals((-98L), arArchiveEntry0.getLastModified());
      assertEquals("", string0);
      assertEquals(749L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 843L, 0, 1, 0, 843L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals(0, int0);
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(1, arArchiveEntry0.getGroupId());
      assertEquals(843L, arArchiveEntry0.getSize());
      assertEquals(843L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("R", 0L, 1353, (-1), (-1), 1297L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals((-1), int0);
      assertEquals(1353, arArchiveEntry0.getUserId());
      assertEquals(1297L, arArchiveEntry0.getLastModified());
      assertEquals((-1), arArchiveEntry0.getGroupId());
      assertEquals("R", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 749L, 151, (-2484), 1, (-98L));
      long long0 = arArchiveEntry0.getLength();
      assertEquals("", arArchiveEntry0.getName());
      assertEquals((-2484), arArchiveEntry0.getGroupId());
      assertEquals((-98L), arArchiveEntry0.getLastModified());
      assertEquals(749L, long0);
      assertEquals(151, arArchiveEntry0.getUserId());
      assertEquals(1, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("d-`NG@ue", 0L);
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(1392409281L, long0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals("d-`NG@ue", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 749L, 151, (-2484), 1, (-98L));
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(1, arArchiveEntry0.getMode());
      assertEquals(151, arArchiveEntry0.getUserId());
      assertEquals((-2484), arArchiveEntry0.getGroupId());
      assertEquals(749L, arArchiveEntry0.getSize());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals((-98L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("u/(@,{;-C", 0L, 1, 1, 3324, 0L);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(1, int0);
      assertEquals("u/(@,{;-C", arArchiveEntry0.getName());
      assertEquals(3324, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(1, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 749L, 151, (-2484), 1, (-98L));
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(151, arArchiveEntry0.getUserId());
      assertEquals((-2484), int0);
      assertEquals(749L, arArchiveEntry0.getLength());
      assertEquals(1, arArchiveEntry0.getMode());
      assertEquals((-98L), arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = MockFile.createTempFile("s7\"?a6vT>J6", "s7\"?a6vT>J6");
      Path path0 = file0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[9];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOptionArray0[0];
      linkOptionArray0[3] = linkOptionArray0[1];
      linkOptionArray0[4] = linkOptionArray0[2];
      linkOptionArray0[5] = linkOptionArray0[1];
      linkOptionArray0[6] = linkOptionArray0[1];
      linkOptionArray0[7] = linkOptionArray0[2];
      linkOptionArray0[8] = linkOptionArray0[4];
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(path0, "xwLY5DW&)3BQ1gK", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry((Path) null, "$zp(G$L%-bWfIpzc", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", (-1L), (-2185), 3035, 365, (-4866L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, long0);
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry((String) null, 0L, 1565, 1565, (-1336), 0L);
      boolean boolean0 = arArchiveEntry1.equals(arArchiveEntry0);
      assertEquals(1565, arArchiveEntry1.getUserId());
      assertEquals(1565, arArchiveEntry1.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertFalse(boolean0);
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals((-1336), arArchiveEntry1.getMode());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 955L, 2145237326, 2145237326, (-1858), 2145237326);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry((String) null, 749L);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(2145237326, arArchiveEntry0.getUserId());
      assertEquals(1392409281L, arArchiveEntry1.getLastModified());
      assertEquals(2145237326, arArchiveEntry0.getGroupId());
      assertTrue(boolean0);
      assertEquals(749L, arArchiveEntry1.getLength());
      assertEquals(33188, arArchiveEntry1.getMode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 419L, (-770), (-2145950824), (-3640), (-2145950824));
      MockFile mockFile0 = new MockFile("!<arch>\n");
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry(mockFile0, "");
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals((-2145950824L), arArchiveEntry0.getLastModified());
      assertEquals((-2145950824), arArchiveEntry0.getGroupId());
      assertEquals(33188, arArchiveEntry1.getMode());
      assertEquals((-770), arArchiveEntry0.getUserId());
      assertEquals("", arArchiveEntry1.getName());
      assertEquals(419L, arArchiveEntry0.getLength());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 419L, (-770), (-2145950824), (-3640), (-2145950824));
      boolean boolean0 = arArchiveEntry0.equals((Object) null);
      assertEquals((-2145950824L), arArchiveEntry0.getLastModified());
      assertEquals((-2145950824), arArchiveEntry0.getGroupId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(419L, arArchiveEntry0.getLength());
      assertEquals((-3640), arArchiveEntry0.getMode());
      assertEquals((-770), arArchiveEntry0.getUserId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertTrue(boolean0);
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("", (-35L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(path0, "", linkOptionArray0);
      boolean boolean0 = arArchiveEntry0.equals(path0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(1715793830L, arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      arArchiveEntry0.hashCode();
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      long long0 = arArchiveEntry0.getSize();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, long0);
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      int int0 = arArchiveEntry0.getMode();
      assertEquals(33188, int0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("x", 0L);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, int0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals("x", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      boolean boolean0 = arArchiveEntry0.isDirectory();
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertFalse(boolean0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      long long0 = arArchiveEntry0.getLength();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
      assertEquals(0L, long0);
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U_d3]S2#3Lg)~$ui");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "U_d3]S2#3Lg)~$ui");
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("U_d3]S2#3Lg)~$ui", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0L, arArchiveEntry0.getLastModified());
  }
}
