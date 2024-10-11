
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
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, 1484, 1484, (-694), 1484);
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(1484, arArchiveEntry0.getGroupId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(1484, int0);
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(1484L, arArchiveEntry0.getLastModified());
      assertEquals((-694), arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, (-60), (-1), (-60), (-60));
      int int0 = arArchiveEntry0.getUserId();
      assertEquals((-1), arArchiveEntry0.getGroupId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals((-60), arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals((-60), int0);
      assertEquals((-60L), arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "org.apache.commons.compress.archivers.ar.ArArchiveEntry");
      long long0 = arArchiveEntry0.getSize();
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0L, long0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals("org.apache.commons.compress.archivers.ar.ArArchiveEntry", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 1049L, 1728, 1728, (-2154), (-1L));
      String string0 = arArchiveEntry0.getName();
      assertNull(string0);
      assertEquals((-1L), arArchiveEntry0.getLastModified());
      assertEquals(1728, arArchiveEntry0.getUserId());
      assertEquals(1728, arArchiveEntry0.getGroupId());
      assertEquals((-2154), arArchiveEntry0.getMode());
      assertEquals(1049L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("L>}wA=@pU", 2504L);
      String string0 = arArchiveEntry0.getName();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(2504L, arArchiveEntry0.getSize());
      assertEquals("L>}wA=@pU", string0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, 1484, 1484, (-694), 1484);
      String string0 = arArchiveEntry0.getName();
      assertEquals(1484, arArchiveEntry0.getUserId());
      assertEquals(1484, arArchiveEntry0.getGroupId());
      assertEquals((-694), arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals("", string0);
      assertEquals(1484L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("O0B0M}", 0L, 2, 6161, 0, 0);
      int int0 = arArchiveEntry0.getMode();
      assertEquals(6161, arArchiveEntry0.getGroupId());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(2, arArchiveEntry0.getUserId());
      assertEquals("O0B0M}", arArchiveEntry0.getName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("org.apache.commons.compress.archivers.ar.ArArchiveEntry", 0L, (-738), (-1081), (-328), 779L);
      int int0 = arArchiveEntry0.getMode();
      assertEquals((-1081), arArchiveEntry0.getGroupId());
      assertEquals(779L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals((-738), arArchiveEntry0.getUserId());
      assertEquals("org.apache.commons.compress.archivers.ar.ArArchiveEntry", arArchiveEntry0.getName());
      assertEquals((-328), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 799L);
      long long0 = arArchiveEntry0.getLength();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(799L, long0);
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("vDEU]JW~/");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "*SA");
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(0L, long0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("*SA", arArchiveEntry0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 1000L, 1, 3408, 1, (-1670L));
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals((-1670L), long0);
      assertEquals(1, arArchiveEntry0.getMode());
      assertEquals(1, arArchiveEntry0.getUserId());
      assertEquals(1000L, arArchiveEntry0.getSize());
      assertEquals(3408, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, 1484, 1484, (-694), 1484);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals((-694), arArchiveEntry0.getMode());
      assertEquals(1484, arArchiveEntry0.getUserId());
      assertEquals(1484L, arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(1484, int0);
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 117L, (-1), (-1), (-1), 117L);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(117L, arArchiveEntry0.getLastModified());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals((-1), arArchiveEntry0.getUserId());
      assertEquals(117L, arArchiveEntry0.getSize());
      assertEquals((-1), int0);
      assertEquals((-1), arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("vDEU]JW~/");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[2];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOptionArray0[0];
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry(path0, "*SA", linkOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry((Path) null, "", linkOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("length must not be negative", (-674L), 1, 1037, 0, 1);
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
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "org.apache.commons.compress.archivers.ar.ArArchiveEntry");
      long long0 = arArchiveEntry0.getLength();
      assertEquals("org.apache.commons.compress.archivers.ar.ArArchiveEntry", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "org.apache.commons.compress.archivers.ar.ArArchiveEntry");
      long long0 = arArchiveEntry0.getLastModified();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(1392409281L, long0);
      assertEquals("org.apache.commons.compress.archivers.ar.ArArchiveEntry", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 1L);
      MockFile mockFile0 = new MockFile("", "aMsQ-Q");
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry(mockFile0, (String) null);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry1.getMode());
      assertTrue(boolean0);
      assertEquals(1L, arArchiveEntry0.getLength());
      assertEquals(0, arArchiveEntry1.getGroupId());
      assertEquals(0, arArchiveEntry1.getUserId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "org.apache.commons.compress.archivers.ar.ArArchiveEntry");
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry("org.apache.commons.compress.archivers.ar.ArArchiveEntry", 0L, 0, 33188, 0, (-165L));
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertEquals((-165L), arArchiveEntry1.getLastModified());
      assertEquals(0, arArchiveEntry1.getUserId());
      assertEquals(33188, arArchiveEntry1.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertTrue(boolean0);
      assertEquals(0L, arArchiveEntry1.getLength());
      assertEquals("org.apache.commons.compress.archivers.ar.ArArchiveEntry", arArchiveEntry1.getName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "org.apache.commons.compress.archivers.ar.ArArchiveEntry");
      boolean boolean0 = arArchiveEntry0.equals("org.apache.commons.compress.archivers.ar.ArArchiveEntry");
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals("org.apache.commons.compress.archivers.ar.ArArchiveEntry", arArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 0L);
      ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry("nQF.~*", 0L, (-795), (-3169), 2146848297, 0L);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
      assertFalse(boolean0);
      assertEquals((-795), arArchiveEntry1.getUserId());
      assertFalse(arArchiveEntry1.equals((Object)arArchiveEntry0));
      assertEquals(0L, arArchiveEntry0.getSize());
      assertEquals(2146848297, arArchiveEntry1.getMode());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals((-3169), arArchiveEntry1.getGroupId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("Zip slip '%s' + '%s' -> '%s'", 0L);
      boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry0);
      assertEquals("Zip slip '%s' + '%s' -> '%s'", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 0L);
      boolean boolean0 = arArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = null;
      try {
        arArchiveEntry0 = new ArArchiveEntry("", (-178L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      LinkOption[] linkOptionArray0 = new LinkOption[5];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      linkOptionArray0[0] = linkOption0;
      linkOptionArray0[1] = linkOption0;
      linkOptionArray0[2] = linkOption0;
      linkOptionArray0[3] = linkOption0;
      linkOptionArray0[4] = linkOption0;
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(path0, "", linkOptionArray0);
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(1715652655L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 0L);
      arArchiveEntry0.hashCode();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      int int0 = arArchiveEntry0.getMode();
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(33188, int0);
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0L, arArchiveEntry0.getLength());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Zip slip '%s' + '%s' -> '%s'");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      int int0 = arArchiveEntry0.getUserId();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals("", arArchiveEntry0.getName());
      assertEquals(0L, arArchiveEntry0.getLastModified());
      assertEquals(0, int0);
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry((String) null, 1L);
      Date date0 = arArchiveEntry0.getLastModifiedDate();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
      assertEquals(1L, arArchiveEntry0.getSize());
      assertEquals(33188, arArchiveEntry0.getMode());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
      boolean boolean0 = arArchiveEntry0.isDirectory();
      assertEquals(0, arArchiveEntry0.getGroupId());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("", arArchiveEntry0.getName());
      assertFalse(boolean0);
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(0L, arArchiveEntry0.getLength());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("fg", 3379L);
      long long0 = arArchiveEntry0.getSize();
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(3379L, long0);
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("fg", arArchiveEntry0.getName());
      assertEquals(0, arArchiveEntry0.getGroupId());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("fg", 3379L);
      int int0 = arArchiveEntry0.getGroupId();
      assertEquals(33188, arArchiveEntry0.getMode());
      assertEquals(3379L, arArchiveEntry0.getSize());
      assertEquals(1392409281L, arArchiveEntry0.getLastModified());
      assertEquals(0, arArchiveEntry0.getUserId());
      assertEquals("fg", arArchiveEntry0.getName());
      assertEquals(0, int0);
  }
}
