
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


package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.dump.Dirent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Dirent_ESTest extends Dirent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Dirent dirent0 = new Dirent(0, 0, 0, "NSC<?~E{@2XC065;");
      int int0 = dirent0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dirent dirent0 = new Dirent(433, 433, 433, "");
      int int0 = dirent0.getType();
      assertEquals(433, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dirent dirent0 = new Dirent(0, 0, 0, "NSC<?~E{@2XC065;");
      int int0 = dirent0.getParentIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dirent dirent0 = new Dirent(433, 433, 433, "");
      int int0 = dirent0.getParentIno();
      assertEquals(433, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dirent dirent0 = new Dirent((-1893), (-633), (-419), (String) null);
      String string0 = dirent0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dirent dirent0 = new Dirent((-1034), (-1034), (-1034), "{6<jt");
      String string0 = dirent0.getName();
      assertEquals("{6<jt", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dirent dirent0 = new Dirent(0, 0, 0, "NSC<?~E{@2XC065;");
      int int0 = dirent0.getIno();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dirent dirent0 = new Dirent((-8), (-8), (-8), "AN3nyUe");
      int int0 = dirent0.getIno();
      assertEquals((-8), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dirent dirent0 = new Dirent(433, 433, 433, "");
      String string0 = dirent0.toString();
      assertEquals("[433]: ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dirent dirent0 = new Dirent(433, 433, 433, "");
      int int0 = dirent0.getIno();
      assertEquals(433, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dirent dirent0 = new Dirent(433, 433, 433, "");
      String string0 = dirent0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Dirent dirent0 = new Dirent((-8), (-8), (-8), "AN3nyUe");
      int int0 = dirent0.getType();
      assertEquals((-8), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dirent dirent0 = new Dirent((-8), (-8), (-8), "AN3nyUe");
      int int0 = dirent0.getParentIno();
      assertEquals((-8), int0);
  }
}
