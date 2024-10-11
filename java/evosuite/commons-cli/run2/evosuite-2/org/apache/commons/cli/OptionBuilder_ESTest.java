
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
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OptionBuilder_ESTest extends OptionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionBuilder.isRequired(true);
      Option option0 = OptionBuilder.create("1SuMnE");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create((String) null);
      assertEquals('=', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionBuilder.withLongOpt("Xel");
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionBuilder.withArgName("gHA)etCM=]rX`w[-");
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create((String) null);
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionBuilder.hasOptionalArg();
      Option option0 = OptionBuilder.create("converterMap");
      assertTrue(option0.hasOptionalArg());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionBuilder.withValueSeparator('#');
      Option option0 = OptionBuilder.create('j');
      assertEquals((-1), option0.getArgs());
      assertEquals("j", option0.getKey());
      assertEquals('#', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionBuilder.withLongOpt("V>");
      Option option0 = OptionBuilder.create('j');
      assertEquals((-1), option0.getArgs());
      assertEquals(106, option0.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionBuilder.withArgName("V>");
      Option option0 = OptionBuilder.create('j');
      assertEquals((-1), option0.getArgs());
      assertEquals(106, option0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create('S');
      assertEquals(0, option0.getArgs());
      assertEquals("S", option0.getKey());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(32);
      Option option0 = OptionBuilder.create('Z');
      assertTrue(option0.hasOptionalArg());
      assertEquals(32, option0.getArgs());
      assertEquals(90, option0.getId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionBuilder.isRequired(true);
      OptionBuilder.withLongOpt("4;-f\u0004");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      OptionBuilder.withLongOpt("s-.>!3.r1");
      Option option0 = OptionBuilder.create();
      assertEquals('=', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionBuilder.withArgName("/so.7");
      OptionBuilder.withLongOpt("s-.>!3.r1");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptionBuilder.withLongOpt("4;-f\u0004");
      OptionBuilder.hasArgs(2042);
      Option option0 = OptionBuilder.create();
      assertEquals(2042, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        OptionBuilder.create("must specify longopt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'must specify longopt' contains an illegal character : ' '.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        OptionBuilder.create('\"');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '\"'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OptionBuilder optionBuilder0 = OptionBuilder.withType(class0);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        OptionBuilder.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must specify longopt
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withDescription("+.G`y>UY_<dt5c&{8`:|");
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create((String) null);
      assertTrue(option0.hasOptionalArg());
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArgs();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withValueSeparator();
      // Undeclared exception!
      try { 
        OptionBuilder.withType((Object) optionBuilder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.cli.OptionBuilder cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OptionBuilder.hasOptionalArg();
      OptionBuilder.withLongOpt("s-.>!3.r1");
      Option option0 = OptionBuilder.create();
      assertEquals(1, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create('Z');
      assertEquals((-1), option0.getArgs());
      assertEquals("Z", option0.getOpt());
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withType((Object) null);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      OptionBuilder.withLongOpt("V>");
      Option option0 = OptionBuilder.create();
      assertEquals(0, option0.getArgs());
  }
}
