
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.pack200.CPLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPLong_ESTest extends CPLong_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPLong cPLong0 = new CPLong(0L);
      long long0 = cPLong0.getLong();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPLong cPLong0 = new CPLong(926L);
      long long0 = cPLong0.getLong();
      assertEquals(926L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPLong cPLong0 = new CPLong((-1L));
      CPLong cPLong1 = new CPLong(0);
      int int0 = cPLong1.compareTo(cPLong0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPLong cPLong0 = new CPLong((-1L));
      CPLong cPLong1 = new CPLong(0);
      int int0 = cPLong0.compareTo(cPLong1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPLong cPLong0 = new CPLong((-1L));
      // Undeclared exception!
      try { 
        cPLong0.compareTo((CPLong) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPLong", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPLong cPLong0 = new CPLong((-1614L));
      int int0 = cPLong0.compareTo(cPLong0);
      assertEquals(0, int0);
      assertEquals((-1614L), cPLong0.getLong());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CPLong cPLong0 = new CPLong((-1614L));
      String string0 = cPLong0.toString();
      assertEquals("-1614", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CPLong cPLong0 = new CPLong((-1614L));
      long long0 = cPLong0.getLong();
      assertEquals((-1614L), long0);
  }
}
