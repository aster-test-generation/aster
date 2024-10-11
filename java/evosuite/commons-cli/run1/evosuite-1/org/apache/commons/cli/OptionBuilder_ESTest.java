
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
      OptionBuilder optionBuilder0 = OptionBuilder.withType((Object) null);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create("b");
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionBuilder.withValueSeparator('V');
      Option option0 = OptionBuilder.create((String) null);
      assertEquals('V', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionBuilder.withLongOpt("");
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create("b");
      assertTrue(option0.hasOptionalArg());
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionBuilder.withArgName("must specify longopt");
      Option option0 = OptionBuilder.create("5");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create((String) null);
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create((String) null);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create('O');
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
      assertEquals("O", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionBuilder.withValueSeparator('X');
      Option option0 = OptionBuilder.create('X');
      assertEquals('X', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
      assertEquals("X", option0.getKey());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionBuilder.withLongOpt("w8a8");
      Option option0 = OptionBuilder.create('6');
      assertEquals(54, option0.getId());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionBuilder.withArgName("&1OS>");
      Option option0 = OptionBuilder.create('$');
      assertEquals((-1), option0.getArgs());
      assertEquals(36, option0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create('k');
      assertEquals(0, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
      assertEquals("k", option0.getKey());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionBuilder.withLongOpt("X^xXgu9@i4x I");
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptionBuilder.withLongOpt("X^xXgu9@i4x I");
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create();
      assertEquals((-2), option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OptionBuilder.withLongOpt("X^xXgu9@i4x I");
      OptionBuilder.withArgName("X^xXgu9@i4x I");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OptionBuilder.withLongOpt("");
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create();
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptionBuilder.withLongOpt("t!q%gKVwubs~");
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        OptionBuilder.create("X^xXgu9@i4x I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'X^xXgu9@i4x I' contains an illegal character : '^'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        OptionBuilder.create('[');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '['.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withDescription("(");
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create('6');
      assertEquals((-2), option0.getArgs());
      assertEquals("6", option0.getOpt());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArgs();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<String> class0 = String.class;
      OptionBuilder optionBuilder0 = OptionBuilder.withType(class0);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasOptionalArg();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.isRequired(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create('r');
      assertEquals(1, option0.getArgs());
      assertEquals("r", option0.getKey());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OptionBuilder.isRequired();
      OptionBuilder.withLongOpt("t!q%gKVwubs~");
      Option option0 = OptionBuilder.create();
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withValueSeparator('X');
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
}
