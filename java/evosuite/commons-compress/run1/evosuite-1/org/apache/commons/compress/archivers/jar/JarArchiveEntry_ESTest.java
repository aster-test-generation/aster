
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


package org.apache.commons.compress.archivers.jar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.cert.Certificate;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JarArchiveEntry_ESTest extends JarArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((ZipArchiveEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry("org.apache.commons.compress.archivers.jar.JarArchiveEntry");
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) zipArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JarEntry jarEntry0 = new JarEntry("2\"!@lJ]fIg");
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry(jarEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JarEntry jarEntry0 = new JarEntry("");
      jarEntry0.setMethod(0);
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry(jarEntry0);
      assertEquals("", jarArchiveEntry0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("m)1");
      jarArchiveEntry0.setMethod(0);
      JarArchiveEntry jarArchiveEntry1 = new JarArchiveEntry((ZipArchiveEntry) jarArchiveEntry0);
      assertEquals("m)1", jarArchiveEntry1.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("gt+-`jU\"I3]FuZn");
      jarArchiveEntry0.setMethod(5);
      JarArchiveEntry jarArchiveEntry1 = new JarArchiveEntry((ZipEntry) jarArchiveEntry0);
      assertEquals(0L, jarArchiveEntry1.getDiskNumberStart());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("createExtraField must not return null");
      Attributes attributes0 = jarArchiveEntry0.getManifestAttributes();
      assertNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((JarEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = null;
      try {
        jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("createExtraField must not return null");
      Certificate[] certificateArray0 = jarArchiveEntry0.getCertificates();
      assertNull(certificateArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
      JarArchiveEntry jarArchiveEntry1 = null;
      try {
        jarArchiveEntry1 = new JarArchiveEntry((ZipArchiveEntry) jarArchiveEntry0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ZIP compression method can not be negative: -1
         //
         verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
      }
  }
}
