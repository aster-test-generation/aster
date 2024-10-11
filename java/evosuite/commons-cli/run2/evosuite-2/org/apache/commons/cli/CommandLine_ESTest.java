
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
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, true, "printWriter");
      commandLine0.addOption(option0);
      Option option1 = new Option((String) null, "printWriter");
      String string0 = commandLine0.getOptionValue(option1, "%};.Q{mC6flDP`4v");
      assertEquals("%};.Q{mC6flDP`4v", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option((String) null, "hh1kH_");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      Option option1 = new Option((String) null, (String) null, true, "RO$H/uat.yU$W`");
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      commandLine_Builder0.setDeprecatedHandler((Consumer<Option>) null);
      CommandLine commandLine0 = commandLine_Builder0.build();
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("true", "c");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option option0 = new Option((String) null, "", false, "org.apache.commons.cli.Option$Builder");
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption('-');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue((Option) null, (Object) commandLine_Builder0);
      assertSame(object0, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = commandLine0.getParsedOptionValue(" :: ", (Option) null);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Option option0 = commandLine0.getParsedOptionValue('[', supplier0);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, "z&,Z^-&)#");
      Option option1 = commandLine0.getParsedOptionValue('B', option0);
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("args", "org.apache.commons.cli.Option$1", true, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = commandLine0.getParsedOptionValue('o');
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue("", supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("4").when(supplier0).get();
      String string0 = commandLine0.getOptionValue((String) null, supplier0);
      assertEquals("4", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("FeAykR/B", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue(":MS,u9'>", "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("-").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('p', supplier0);
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('b', supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('\'', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('b', "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("4", "A#y.`'}6u~5<.n2", true, (String) null);
      commandLine_Builder0.addOption(option0);
      option0.processValue("A#y.`'}6u~5<.n2");
      Object object0 = commandLine0.getOptionObject("A#y.`'}6u~5<.n2");
      assertEquals("A#y.`'}6u~5<.n2", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("y?At4'?=3['");
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("y?At4'?=3['"));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "YBgA=J%G,sKs3APUJe");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, false, ",");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<LinkedList<Option>> supplier0 = (Supplier<LinkedList<Option>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      LinkedList<Option> linkedList0 = commandLine0.getParsedOptionValue((Option) null, supplier0);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option((String) null, "", false, "org.apache.commons.cli.Option$Builder");
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("W", "v;U:<LJr$j");
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = new Option((String) null, "", false, "org.apache.commons.cli.Option$Builder");
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues((Option) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue((Option) null, supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, true, (String) null);
      String string0 = commandLine0.getOptionValue(option0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues((String) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("Frf", "usage: ", true, "usage: ");
      Option option1 = commandLine0.getParsedOptionValue(option0);
      assertNull(option1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("", supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption("qAl. w47]-t");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue((Option) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = new Option((String) null, "", false, "org.apache.commons.cli.Option$Builder");
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED", false, "NO_ARGS_ALLOWED");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      assertEquals("NO_ARGS_ALLOWED", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, "", false, (String) null);
      commandLine_Builder0.addOption(option0);
      Object object0 = commandLine0.getParsedOptionValue("Option ", (Supplier<Object>) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, true, "YBgA=J%G,sKs3APUJe");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("NO_ARGS_ALLOWD", "NO_ARGS_ALLOWD", false, "NO_ARGS_ALLOWD");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("NO_ARGS_ALLOWD", false, "T");
      Supplier<LinkedList<Object>> supplier0 = (Supplier<LinkedList<Object>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((LinkedList<Object>) null).when(supplier0).get();
      LinkedList<Object> linkedList0 = commandLine0.getParsedOptionValue(option1, supplier0);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("$", "$", true, "?S:%M");
      option0.processValue("$");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("$", "$", true, "?S:%M");
      option0.processValue("$");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Object object0 = commandLine0.getParsedOptionValue(option0, supplier0);
      assertEquals("$", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, "", false, (String) null);
      commandLine_Builder0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("");
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("dq", "dq");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("dq");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("NO_ARGS_ALLOWD", "NO_ARGS_ALLOWD", false, "NO_ARGS_ALLOWD");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("NO_ARGS_ALLOWD", "NO_ARGS_ALLOWD", false, "NO_ARGS_ALLOWD");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("NO_ARGS_ALLOWD", false, "T");
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addArg("The addValue method is not intended for client use. Subclasses should use the processValue method instead.");
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption((Option) null);
      assertSame(commandLine_Builder0, commandLine_Builder1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      commandLine_Builder0.addArg("?S:%M");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg((String) null);
      assertSame(commandLine_Builder1, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      List<String> list0 = commandLine0.getArgList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      String string0 = commandLine0.getOptionValue(option0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('/');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getOptionObject('M');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('&');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getOptionObject("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('$');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue('b', supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('4', "A#y.`'}6u~5<.n2");
      assertEquals("A#y.`'}6u~5<.n2", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Supplier<LinkedList<Object>> supplier0 = (Supplier<LinkedList<Object>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(supplier0).get();
      LinkedList<Object> linkedList1 = commandLine0.getParsedOptionValue("", supplier0);
      assertSame(linkedList0, linkedList1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      LinkedList<Option> linkedList0 = new LinkedList<Option>();
      LinkedList<Option> linkedList1 = commandLine0.getParsedOptionValue("", linkedList0);
      assertSame(linkedList1, linkedList0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('H', (Object) null);
      assertNull(object0);
  }
}
