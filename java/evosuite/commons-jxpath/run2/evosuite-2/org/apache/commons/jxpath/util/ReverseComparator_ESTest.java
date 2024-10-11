
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


package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.jxpath.util.ReverseComparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ReverseComparator_ESTest extends ReverseComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator comparator0 = ReverseComparator.INSTANCE;
      Integer integer0 = new Integer((-190));
      int int0 = comparator0.compare(integer0, integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comparator comparator0 = ReverseComparator.INSTANCE;
      Integer integer0 = new Integer((-190));
      Integer integer1 = Integer.valueOf((-894));
      int int0 = comparator0.compare(integer1, integer0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comparator comparator0 = ReverseComparator.INSTANCE;
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1818));
      int int0 = comparator0.compare(integer0, integer1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Comparator comparator0 = ReverseComparator.INSTANCE;
      Integer integer0 = new Integer((-190));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        comparator0.compare(integer0, object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("org.apache.commons.jxpath.util.ReverseComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Comparator comparator0 = ReverseComparator.INSTANCE;
      Integer integer0 = new Integer((-746));
      // Undeclared exception!
      try { 
        comparator0.compare((Object) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }
}
