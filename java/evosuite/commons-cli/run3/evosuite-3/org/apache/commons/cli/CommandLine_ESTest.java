
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CommandLine_ESTest extends CommandLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("Vj7", (String) null, false, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = commandLine0.getParsedOptionValue("-dA`K#d%6nw4`");
      assertNull(option1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues("-*fQLmGWk-899h");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("9", "9");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("9", "usage: ");
      Option option2 = commandLine0.getParsedOptionValue(option1);
      assertNull(option2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null);
      commandLine_Builder0.addOption(option0);
      Option option1 = new Option((String) null, "v-ie5/{8xuQ]*H8q5VK");
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      commandLine_Builder0.setDeprecatedHandler((Consumer<Option>) null);
      CommandLine commandLine0 = commandLine_Builder0.build();
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption("W{y[;=@qT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = commandLine0.getParsedOptionValue((Option) null, (Option) null);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue("org.apache.commons.cli.Converter", supplier0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("@wc9:sS").when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue('s', supplier0);
      assertEquals("@wc9:sS", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue('2', (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("Vj7", (String) null, false, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("printWriter", false, "");
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      String string0 = commandLine0.getOptionValue(option0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((Option) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue("=", supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("", supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("LW`<3", "");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("LzLgkO,#i").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('3', supplier0);
      assertEquals("LzLgkO,#i", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('.', supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(':', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('_', "NG}X1>W6uxl04R");
      assertEquals("NG}X1>W6uxl04R", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg("true");
      CommandLine commandLine0 = commandLine_Builder1.build();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("true"));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "org.apache.commons.cli.CommandLine");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      option0.processValue((String) null);
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties(option0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null);
      commandLine_Builder0.addOption(option0);
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option((String) null, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption((Option) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Option) null).when(supplier0).get();
      Option option0 = commandLine0.getParsedOptionValue((Option) null, supplier0);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "org.apache.commons.cli.CommandLine");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      option0.processValue("Ji");
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("options", "Exception found converting ", false, "options");
      commandLine_Builder0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues((Option) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("pH", "mSh2|y>etcy'Hfvm$W", true, "PU");
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "org.apache.commons.cli.CommandLine");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      option0.processValue("Ji");
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("Ji", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      String string0 = commandLine0.getOptionValue(option0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, true, (String) null);
      Object object0 = commandLine0.getParsedOptionValue(option0, (Object) commandLine_Builder0);
      assertSame(commandLine_Builder0, object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(commandLine0).when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue((String) null, supplier0);
      assertSame(object0, commandLine0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("Vj7", (String) null, false, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("Vj7").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("^9X+B", supplier0);
      assertEquals("Vj7", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("0", "0");
      commandLine_Builder0.addOption(option0);
      Object object0 = commandLine0.getOptionObject("0");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((String) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "org.apache.commons.cli.CommandLine");
      CommandLine commandLine0 = commandLine_Builder0.build();
      option0.processValue("Ji");
      commandLine_Builder0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertFalse(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("options", "Exception found converting ", false, "options");
      commandLine_Builder0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption("Exception found converting ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "org.apache.commons.cli.CommandLine");
      CommandLine commandLine0 = commandLine_Builder0.build();
      option0.processValue("Ji");
      commandLine_Builder0.addOption(option0);
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Object object0 = commandLine0.getParsedOptionValue(option0, supplier0);
      assertEquals("Ji", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("Vj7", (String) null, false, "");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue(option0, supplier0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("options", "Exception found converting ", false, "options");
      commandLine_Builder0.addOption(option0);
      Option option1 = new Option((String) null, false, "");
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "org.apache.commons.cli.CommandLine");
      CommandLine commandLine0 = commandLine_Builder0.build();
      option0.processValue("Ji");
      commandLine_Builder0.addOption(option0);
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertEquals("Ji", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("Vj7", (String) null, false, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("true");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("Vj7", (String) null, false, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("Vj7");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("options", "Exception found converting ", false, "options");
      commandLine_Builder0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("Exception found converting ");
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("options", "Exception found converting ", false, "options");
      commandLine_Builder0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties((Option) null);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = commandLine0.getParsedOptionValue(')', (Supplier<Option>) null);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("options", "Exception found converting ", false, "options");
      commandLine0.addOption(option0);
      assertFalse(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption((Option) null);
      assertSame(commandLine_Builder0, commandLine_Builder1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg((String) null);
      assertSame(commandLine_Builder1, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues(':');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("uz-l;.|", "d1kO '/]~],");
      assertEquals("d1kO '/]~],", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      List<String> list0 = commandLine0.getArgList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null, "Kt}e~Bx;w+Io2x");
      assertEquals("Kt}e~Bx;w+Io2x", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('T');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject('@');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('O');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue(')', supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue('R', (Object) "org.apache.commons.cli.Converter");
      assertEquals("org.apache.commons.cli.Converter", object0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('0', "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("Vj7", (String) null, false, "");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = commandLine0.getParsedOptionValue("true", option0);
      assertEquals("Vj7", option1.getKey());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      LinkedList<Object> linkedList0 = commandLine0.getParsedOptionValue('0');
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(" to desired type: ");
      assertNull(string0);
  }
}
