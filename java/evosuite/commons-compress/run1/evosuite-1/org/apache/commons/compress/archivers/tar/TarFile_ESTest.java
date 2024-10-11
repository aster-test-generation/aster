
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


package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.tar.TarFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarFile_ESTest extends TarFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(byteArray0, "y>06Ylr3");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(byteArray0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((byte[]) null, "gzW%5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((Path) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(path0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("]>H|2J+(-y4lRb1`5", "VSxH`4Y\"");
      Path path0 = mockFile0.toPath();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(path0, "VSxH`4Y\"");
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((Path) null, "GNU.sparse.map");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("DnC9blZ+$v/DP_9", "DnC9blZ+$v/DP_9");
      Path path0 = mockFile0.toPath();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("W~2m6Y;Ej1  ");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(fileChannel0, 13, 13, "gF[", true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\u0000", "PW.ZZ(N ar");
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(mockFile0, false);
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((File) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(mockFile0, false);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((File) null, "GNU.sparse.realsize");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(mockFile0, (String) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("#-B", "#-B");
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(mockFile0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("J9y");
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(mockFile0, false);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Error detected parsing the pax header", "Error detected parsing the pax header");
      Path path0 = mockFile0.toPath();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(path0, true);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(path0, "Time must not be null");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("mx,2XvaA");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(fileChannel0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(mockFile0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(path0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.apache.commons.compress.archivers.zip.ZipEncodingHelper
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      File file0 = MockFile.createTempFile("7H*C^{nJuUS7>XLA{f", "EYkMCiO)(6tx");
      TarFile tarFile0 = null;
      try {
        tarFile0 = new TarFile(file0, "}2H");
        fail("Expecting exception: NoSuchFileException");
      
      } catch(Throwable e) {
      }
  }
}
