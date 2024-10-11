
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
import org.apache.commons.compress.harmony.pack200.CPInt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPInt_ESTest extends CPInt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPInt cPInt0 = new CPInt(0);
      int int0 = cPInt0.getInt();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPInt cPInt0 = new CPInt(3363);
      int int0 = cPInt0.getInt();
      assertEquals(3363, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPInt cPInt0 = new CPInt((-1));
      CPInt cPInt1 = new CPInt(1493);
      int int0 = cPInt1.compareTo(cPInt0);
      assertEquals(1493, cPInt1.getInt());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPInt cPInt0 = new CPInt((-1));
      CPInt cPInt1 = new CPInt(1493);
      int int0 = cPInt0.compareTo(cPInt1);
      assertEquals(1493, cPInt1.getInt());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPInt cPInt0 = new CPInt((-979));
      // Undeclared exception!
      try { 
        cPInt0.compareTo((CPInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPInt cPInt0 = new CPInt((-1));
      int int0 = cPInt0.compareTo(cPInt0);
      assertEquals(0, int0);
      assertEquals((-1), cPInt0.getInt());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CPInt cPInt0 = new CPInt((-1));
      int int0 = cPInt0.getInt();
      assertEquals((-1), int0);
  }
}
