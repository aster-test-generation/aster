
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


package org.apache.commons.jxpath.servlet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class KeywordVariables_ESTest extends KeywordVariables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      KeywordVariables keywordVariables0 = new KeywordVariables("", object0);
      boolean boolean0 = keywordVariables0.isDeclaredVariable("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KeywordVariables keywordVariables0 = new KeywordVariables("Hxj)X'vhu3", "Hxj)X'vhu3");
      boolean boolean0 = keywordVariables0.isDeclaredVariable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeywordVariables keywordVariables0 = new KeywordVariables("?^wZ t8-X~", "?^wZ t8-X~");
      // Undeclared exception!
      try { 
        keywordVariables0.getVariable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = new Object();
      KeywordVariables keywordVariables0 = new KeywordVariables("<_0H8zQ^", object0);
      // Undeclared exception!
      try { 
        keywordVariables0.isDeclaredVariable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      KeywordVariables keywordVariables0 = new KeywordVariables("", object0);
      Object object1 = keywordVariables0.getVariable("q&2r!h{ki");
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      KeywordVariables keywordVariables0 = null;
      try {
        keywordVariables0 = new KeywordVariables((String) null, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keyword cannot be null
         //
         verifyException("org.apache.commons.jxpath.servlet.KeywordVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      KeywordVariables keywordVariables0 = new KeywordVariables("", object0);
      Object object1 = keywordVariables0.getVariable("");
      assertSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Object object0 = new Object();
      KeywordVariables keywordVariables0 = new KeywordVariables("", object0);
      // Undeclared exception!
      try { 
        keywordVariables0.undeclareVariable("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot undeclare keyword variables.
         //
         verifyException("org.apache.commons.jxpath.servlet.KeywordVariables", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      KeywordVariables keywordVariables0 = new KeywordVariables("Cannot declare new keyword variables.", "Cannot declare new keyword variables.");
      // Undeclared exception!
      try { 
        keywordVariables0.declareVariable("Cannot declare new keyword variables.", "Cannot declare new keyword variables.");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot declare new keyword variables.
         //
         verifyException("org.apache.commons.jxpath.servlet.KeywordVariables", e);
      }
  }
}
