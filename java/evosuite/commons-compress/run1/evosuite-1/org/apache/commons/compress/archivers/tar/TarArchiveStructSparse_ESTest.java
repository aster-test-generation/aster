
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
import org.apache.commons.compress.archivers.tar.TarArchiveStructSparse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TarArchiveStructSparse_ESTest extends TarArchiveStructSparse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(0L, 1L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(boolean0);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertEquals(0L, tarArchiveStructSparse1.getOffset());
      assertEquals(1L, tarArchiveStructSparse1.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2217L, 2217L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(0L, 2217L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertFalse(boolean0);
      assertEquals(2217L, tarArchiveStructSparse1.getNumbytes());
      assertEquals(2217L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(210L, 210L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(210L, tarArchiveStructSparse0.getNumbytes());
      assertEquals(210L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(210L, 210L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(210L, long0);
      assertEquals(210L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(425L, 425L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(425L, 11L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(boolean0);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertEquals(425L, tarArchiveStructSparse1.getOffset());
      assertEquals(11L, tarArchiveStructSparse1.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(16L, 16L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(693L, 16L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertFalse(boolean0);
      assertEquals(16L, tarArchiveStructSparse1.getNumbytes());
      assertEquals(16L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(210L, 210L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(210L, 210L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(210L, tarArchiveStructSparse1.getNumbytes());
      assertEquals(210L, tarArchiveStructSparse1.getOffset());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(210L, 210L);
      boolean boolean0 = tarArchiveStructSparse0.equals((Object) null);
      assertEquals(210L, tarArchiveStructSparse0.getOffset());
      assertFalse(boolean0);
      assertEquals(210L, tarArchiveStructSparse0.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      Object object0 = new Object();
      boolean boolean0 = tarArchiveStructSparse0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = null;
      try {
        tarArchiveStructSparse0 = new TarArchiveStructSparse(40L, (-1804L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // numbytes must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveStructSparse", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = null;
      try {
        tarArchiveStructSparse0 = new TarArchiveStructSparse((-1L), 425L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // offset must not be negative
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarArchiveStructSparse", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      String string0 = tarArchiveStructSparse0.toString();
      assertEquals("TarArchiveStructSparse{offset=0, numbytes=0}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      tarArchiveStructSparse0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(0L, long0);
  }
}
