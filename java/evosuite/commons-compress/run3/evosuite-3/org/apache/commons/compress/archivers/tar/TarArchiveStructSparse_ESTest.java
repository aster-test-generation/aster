
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
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(0L, 2848L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertEquals(0L, tarArchiveStructSparse1.getOffset());
      assertFalse(boolean0);
      assertEquals(2848L, tarArchiveStructSparse1.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 1L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(1L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(1L, tarArchiveStructSparse1.getOffset());
      assertEquals(1L, tarArchiveStructSparse0.getNumbytes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2266L, 2266L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(2266L, tarArchiveStructSparse0.getOffset());
      assertEquals(2266L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2800L, 2800L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(2800L, 416L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(boolean0);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertEquals(2800L, tarArchiveStructSparse1.getOffset());
      assertEquals(2800L, tarArchiveStructSparse0.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2216L, 2216L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(8L, 8L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(8L, tarArchiveStructSparse1.getOffset());
      assertEquals(8L, tarArchiveStructSparse1.getNumbytes());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2266L, 2266L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(2266L, 2266L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(2266L, tarArchiveStructSparse1.getNumbytes());
      assertEquals(2266L, tarArchiveStructSparse1.getOffset());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2642L, 2642L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse0);
      assertTrue(boolean0);
      assertEquals(2642L, tarArchiveStructSparse0.getNumbytes());
      assertEquals(2642L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2642L, 2642L);
      boolean boolean0 = tarArchiveStructSparse0.equals("TarArchiveStructSparse{offset=2642, numbytes=2642}");
      assertFalse(boolean0);
      assertEquals(2642L, tarArchiveStructSparse0.getOffset());
      assertEquals(2642L, tarArchiveStructSparse0.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = null;
      try {
        tarArchiveStructSparse0 = new TarArchiveStructSparse(610L, (-2988L));
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
        tarArchiveStructSparse0 = new TarArchiveStructSparse((-1896L), (-1896L));
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
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2642L, 2642L);
      String string0 = tarArchiveStructSparse0.toString();
      assertEquals("TarArchiveStructSparse{offset=2642, numbytes=2642}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2642L, 2642L);
      tarArchiveStructSparse0.hashCode();
      assertEquals(2642L, tarArchiveStructSparse0.getOffset());
      assertEquals(2642L, tarArchiveStructSparse0.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2266L, 2266L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(2266L, tarArchiveStructSparse0.getNumbytes());
      assertEquals(2266L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(0L, long0);
  }
}
