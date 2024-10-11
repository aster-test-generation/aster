
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArArchiveEntry_ESTest extends ArArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 312L);
      Date date0 = arArchiveEntry0.getLastModifiedDate();
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(312L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(path0, "[%]C-j4XGI3SYb:?4I", linkOptionArray0);
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(1715864910L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("[%]C-j4XGI3SYb:?4I", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("`5n-]", 0L, 2, 3, 0, 0);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(0, arArchiveEntry0.getMode());
      assertEquals("`5n-]", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(3, arArchiveEntry0.getGroupId());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("T+sg&32rf@D\"T--nIt ", 2691L, (-1270), (-1270), (-3401), 4481L);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals((-1270), int0);
      assertEquals((-1270), arArchiveEntry0.getGroupId());
      assertEquals("T+sg&32rf@D\"T--nIt ", arArchiveEntry0.getName());
      assertEquals(2691L, arArchiveEntry0.getSize());
      assertEquals(4481L, arArchiveEntry0.getLastModified());
      assertEquals((-3401), arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("C/!vu$`]l3i", 1L);
      long long0 = arArchiveEntry0.getSize();
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(1L, long0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("C/!vu$`]l3i", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 0L);
      String string0 = arArchiveEntry0.getName();
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertNull(string0);
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 312L);
      String string0 = arArchiveEntry0.getName();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("", string0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(312L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("lTQW{", 1L, 0, (-1), 0, 1L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals("lTQW{", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals((-1), arArchiveEntry0.getGroupId());
      assertEquals(0, int0);
      assertEquals(1L, arArchiveEntry0.getLastModified());
      assertEquals(1L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 3197L, (-1724), (-1724), (-1724), (-1724));
      int int0 = arArchiveEntry0.getMode();
      assertEquals((-1724), arArchiveEntry0.getGroupId());
      assertEquals(3197L, arArchiveEntry0.getSize());
      assertEquals((-1724), int0);
      assertEquals((-1724L), arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals((-1724), arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 312L);
      long long0 = arArchiveEntry0.getLength();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(312L, long0);
      assertEquals("", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("E.N5oz5LtK'&R?NgfNq", 1136L, 0, 0, (-396), 0L);
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0L, long0);
      assertEquals((-396), arArchiveEntry0.getMode());
      assertEquals(1136L, arArchiveEntry0.getLength());
      assertEquals("E.N5oz5LtK'&R?NgfNq", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 3197L, (-1724), (-1724), (-1724), (-1724));
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals((-1724), arArchiveEntry0.getMode());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals((-1724L), long0);
      assertEquals(3197L, arArchiveEntry0.getLength());
      assertEquals((-1724), arArchiveEntry0.getUserId());
      assertEquals((-1724), arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 1L, 0, 1, 2, 0);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(1, int0);
      assertEquals(2, arArchiveEntry0.getMode());
      assertEquals(1L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("x$'Nxz :bj;5>Rk", 564L, (-92), (-92), (-92), (-671L));
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals((-92), arArchiveEntry0.getUserId());
      assertEquals((-671L), arArchiveEntry0.getLastModified());
      assertEquals("x$'Nxz :bj;5>Rk", arArchiveEntry0.getName());
      assertEquals((-92), int0);
      assertEquals(564L, arArchiveEntry0.getSize());
      assertEquals((-92), arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = MockFile.createTempFile("o[pn1d f9=", "#{BJ'Bvm5");
      Path path0 = file0.toPath();
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(path0, "o[pn1d f9=", (LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("^?/z{Rkc", (-1L), 0, 2241, 0, (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      long long0 = arArchiveEntry0.getLength();
      assertEquals(0L, long0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, long0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 2833L);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry("`\n", 2833L, (-2459), (-2459), (-2459), 2833L);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals((-2459), arArchiveEntry1.getUserId());
      assertEquals((-2459), arArchiveEntry1.getGroupId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals(2833L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 2842L);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry((String) null, 2842L);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(0, arArchiveEntry1.getGroupId());
      assertEquals(1392409281L, arArchiveEntry1.getLastModified());
      assertEquals(0, arArchiveEntry1.getUserId());
      assertTrue(boolean0);
      assertEquals(33188, arArchiveEntry1.getMode());
      assertEquals(2842L, arArchiveEntry1.getSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      boolean boolean0 = arArchiveEntry0.equals(mockFile0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertFalse(boolean0);
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "R- <I");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "R- <I");
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry(mockFile0, "!<arch>\n");
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertFalse(boolean0);
      assertEquals(33188, arArchiveEntry1.getMode());
      assertEquals(0L, arArchiveEntry1.getLastModified());
      assertFalse(arArchiveEntry1.equals((Object)arArchiveEntry0));
      assertEquals(0L, arArchiveEntry1.getSize());
      assertEquals(0, arArchiveEntry1.getGroupId());
      assertEquals(0, arArchiveEntry1.getUserId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "R- <I");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "R- <I");
      boolean boolean0 = arArchiveEntry0.equals((Object) null);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals("R- <I", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("MoK^/6F|x8-310,mm?*-", (-58));
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
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      MockFile mockFile0 = new MockFile("org.apache.commonsAcompress.arckivers.ar.ArArchiveEntPy", "org.apache.commonsAcompress.arckivers.ar.ArArchiveEntPy");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[1];
      linkOptionArray0[0] = linkOption0;
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(path0, "org.apache.commonsAcompress.arckivers.ar.ArArchiveEntPy", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "R- <I");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "R- <I");
      arArchiveEntry0.hashCode();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("R- <I", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "R- <I");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "R- <I");
      String string0 = arArchiveEntry0.getName();
      assertEquals("R- <I", string0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      int int0 = arArchiveEntry0.getMode();
      assertEquals(33188, int0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      int int0 = arArchiveEntry0.getUserId();
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, int0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(":r_*_se$@nYePH", 2006L);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(":r_*_se$@nYePH", arArchiveEntry0.getName());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(2006L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "R- <I");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "R- <I");
      boolean boolean0 = arArchiveEntry0.isDirectory();
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertFalse(boolean0);
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("R- <I", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "R- <I");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "R- <I");
      long long0 = arArchiveEntry0.getSize();
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, long0);
      assertEquals("R- <I", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "R- <I");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "R- <I");
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("R- <I", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, int0);
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(0, arArchiveEntry0.getUserId());
  }
}
