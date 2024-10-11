
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


package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.DeprecatedAttributes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DeprecatedAttributes_ESTest extends DeprecatedAttributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      DeprecatedAttributes.Builder deprecatedAttributes_Builder1 = deprecatedAttributes_Builder0.setForRemoval(true);
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder1.get();
      boolean boolean0 = deprecatedAttributes0.isForRemoval();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      deprecatedAttributes_Builder0.setSince("&");
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder0.get();
      String string0 = deprecatedAttributes0.getSince();
      assertEquals("", deprecatedAttributes0.getDescription());
      assertFalse(deprecatedAttributes0.isForRemoval());
      assertEquals("&", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      DeprecatedAttributes.Builder deprecatedAttributes_Builder1 = deprecatedAttributes_Builder0.setDescription("&");
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder1.get();
      String string0 = deprecatedAttributes0.getDescription();
      assertEquals("", deprecatedAttributes0.getSince());
      assertEquals("&", string0);
      assertFalse(deprecatedAttributes0.isForRemoval());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder0.get();
      String string0 = deprecatedAttributes0.toString();
      assertEquals("Deprecated", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      deprecatedAttributes_Builder0.setSince("&");
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder0.get();
      String string0 = deprecatedAttributes0.toString();
      assertEquals("Deprecated since &", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      DeprecatedAttributes.Builder deprecatedAttributes_Builder1 = deprecatedAttributes_Builder0.setForRemoval(true);
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder1.get();
      String string0 = deprecatedAttributes0.toString();
      assertEquals("Deprecated for removal", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      DeprecatedAttributes.Builder deprecatedAttributes_Builder1 = deprecatedAttributes_Builder0.setDescription("&");
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder1.get();
      String string0 = deprecatedAttributes0.toString();
      assertEquals("Deprecated: &", string0);
      assertEquals("&", deprecatedAttributes0.getDescription());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder0.get();
      String string0 = deprecatedAttributes0.getDescription();
      assertFalse(deprecatedAttributes0.isForRemoval());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = new DeprecatedAttributes.Builder();
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder0.get();
      boolean boolean0 = deprecatedAttributes0.isForRemoval();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DeprecatedAttributes.Builder deprecatedAttributes_Builder0 = DeprecatedAttributes.builder();
      DeprecatedAttributes deprecatedAttributes0 = deprecatedAttributes_Builder0.get();
      String string0 = deprecatedAttributes0.getSince();
      assertFalse(deprecatedAttributes0.isForRemoval());
      assertNotNull(string0);
  }
}
