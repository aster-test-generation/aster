
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
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2267L, 2243L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(2267L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(2243L, tarArchiveStructSparse0.getNumbytes());
      assertFalse(boolean0);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertEquals(2267L, tarArchiveStructSparse1.getOffset());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(1L, 0L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(0L, tarArchiveStructSparse1.getNumbytes());
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertFalse(boolean0);
      assertEquals(1L, tarArchiveStructSparse1.getOffset());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(0L, 0L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(17L, 1L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(17L, 17L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertEquals(17L, tarArchiveStructSparse0.getOffset());
      assertFalse(boolean0);
      assertEquals(17L, tarArchiveStructSparse1.getNumbytes());
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2857L, 2857L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(1L, 2857L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse1);
      assertFalse(tarArchiveStructSparse1.equals((Object)tarArchiveStructSparse0));
      assertEquals(2857L, tarArchiveStructSparse1.getNumbytes());
      assertFalse(boolean0);
      assertEquals(2857L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(17L, 1L);
      Object object0 = new Object();
      boolean boolean0 = tarArchiveStructSparse0.equals(object0);
      assertEquals(17L, tarArchiveStructSparse0.getOffset());
      assertFalse(boolean0);
      assertEquals(1L, tarArchiveStructSparse0.getNumbytes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(1L, 1L);
      boolean boolean0 = tarArchiveStructSparse0.equals((Object) null);
      assertEquals(1L, tarArchiveStructSparse0.getNumbytes());
      assertFalse(boolean0);
      assertEquals(1L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2857L, 2857L);
      boolean boolean0 = tarArchiveStructSparse0.equals(tarArchiveStructSparse0);
      assertEquals(2857L, tarArchiveStructSparse0.getNumbytes());
      assertTrue(boolean0);
      assertEquals(2857L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2857L, 2857L);
      TarArchiveStructSparse tarArchiveStructSparse1 = new TarArchiveStructSparse(2857L, 2857L);
      boolean boolean0 = tarArchiveStructSparse1.equals(tarArchiveStructSparse0);
      assertEquals(2857L, tarArchiveStructSparse1.getOffset());
      assertEquals(2857L, tarArchiveStructSparse1.getNumbytes());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = null;
      try {
        tarArchiveStructSparse0 = new TarArchiveStructSparse(2L, (-1888L));
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
        tarArchiveStructSparse0 = new TarArchiveStructSparse((-4819L), (-4819L));
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
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2857L, 2857L);
      String string0 = tarArchiveStructSparse0.toString();
      assertEquals("TarArchiveStructSparse{offset=2857, numbytes=2857}", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2857L, 2857L);
      tarArchiveStructSparse0.hashCode();
      assertEquals(2857L, tarArchiveStructSparse0.getNumbytes());
      assertEquals(2857L, tarArchiveStructSparse0.getOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(17L, 1L);
      long long0 = tarArchiveStructSparse0.getOffset();
      assertEquals(1L, tarArchiveStructSparse0.getNumbytes());
      assertEquals(17L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TarArchiveStructSparse tarArchiveStructSparse0 = new TarArchiveStructSparse(2857L, 2857L);
      long long0 = tarArchiveStructSparse0.getNumbytes();
      assertEquals(2857L, long0);
      assertEquals(2857L, tarArchiveStructSparse0.getOffset());
  }
}
