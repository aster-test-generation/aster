
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
      Object object0 = new Object();
      KeywordVariables keywordVariables0 = new KeywordVariables("keyword cannot be null", object0);
      boolean boolean0 = keywordVariables0.isDeclaredVariable("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KeywordVariables keywordVariables0 = new KeywordVariables("", "");
      // Undeclared exception!
      try { 
        keywordVariables0.getVariable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KeywordVariables keywordVariables0 = new KeywordVariables("Cannot undeclare keyword variables.", "Cannot undeclare keyword variables.");
      // Undeclared exception!
      try { 
        keywordVariables0.isDeclaredVariable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      KeywordVariables keywordVariables0 = new KeywordVariables("@eZ3~,DGtNr", "@eZ3~,DGtNr");
      Object object0 = keywordVariables0.getVariable("");
      assertNull(object0);
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
      KeywordVariables keywordVariables0 = new KeywordVariables("@eZ3~,DGtNr", "@eZ3~,DGtNr");
      Object object0 = keywordVariables0.getVariable("@eZ3~,DGtNr");
      assertEquals("@eZ3~,DGtNr", object0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      KeywordVariables keywordVariables0 = new KeywordVariables("@eZ3~,DGtNr", "@eZ3~,DGtNr");
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
      KeywordVariables keywordVariables0 = new KeywordVariables("", "");
      // Undeclared exception!
      try { 
        keywordVariables0.declareVariable("", "");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot declare new keyword variables.
         //
         verifyException("org.apache.commons.jxpath.servlet.KeywordVariables", e);
      }
  }
}
