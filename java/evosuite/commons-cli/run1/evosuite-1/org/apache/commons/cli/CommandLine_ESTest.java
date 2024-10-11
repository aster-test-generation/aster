
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
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("18k", "L");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues("-euo:cua");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues('-');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("18k", "L");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = (Option)option0.clone();
      Option option2 = commandLine0.getParsedOptionValue(option1);
      assertNull(option2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("options", "options", false, "xception found converting ");
      Option option1 = new Option("options", "options", false, "xception found converting ");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option1);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.setDeprecatedHandler((Consumer<Option>) null);
      CommandLine commandLine0 = commandLine_Builder1.build();
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption("fo5");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, "iuRd", false, "{bcm]g@X");
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(supplier0).get();
      LinkedList linkedList1 = (LinkedList)commandLine0.getParsedOptionValue(option0, supplier0);
      assertEquals(0, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("V7ZG-", "org.apache.commons.cli.CommandLine$1", false, "[ARG...]");
      Object object0 = commandLine0.getParsedOptionValue(option0, (Object) commandLine_Builder0);
      assertSame(object0, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Option option0 = commandLine0.getParsedOptionValue("_;q-=W", supplier0);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue(")d~7D<^25", (Object) ")d~7D<^25");
      assertEquals(")d~7D<^25", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("usage: ").when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue('L', supplier0);
      assertEquals("usage: ", object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('0', (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, "iuRd", false, "{bcm]g@X");
      commandLine0.addOption(option0);
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("options", "W");
      String string0 = commandLine0.getOptionValue(option0, (Supplier<String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, (String) null);
      String string0 = commandLine0.getOptionValue(option0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, (String) null, false, "");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("printWriter").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("Q8T", supplier0);
      assertEquals("printWriter", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue("", supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("uS1b", "");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("--").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('0', supplier0);
      assertEquals("--", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("").when(supplier0).get();
      String string0 = commandLine0.getOptionValue('3', supplier0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('0', "/>%7J+0j_(");
      assertEquals("/>%7J+0j_(", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('O', "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("options");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("dI/a6[HEd1f5_>1THU");
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("dI/a6[HEd1f5_>1THU"));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("true", true, "true");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, false, "4&\" m.oiI!j)2c*");
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue(option0, supplier0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<Option> supplier0 = (Supplier<Option>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Option option0 = commandLine0.getParsedOptionValue((Option) null, supplier0);
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("18k", "L");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option1 = new Option("L", "-euo:cua");
      commandLine_Builder0.addOption(option1);
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("e3js", "");
      commandLine_Builder0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues((Option) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      String string0 = commandLine0.getOptionValue("rlE)Z!w*2gM3tz", supplier0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getOptionObject("I");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      Supplier<LinkedList<LinkedList<Object>>> supplier0 = (Supplier<LinkedList<LinkedList<Object>>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(supplier0).get();
      LinkedList<LinkedList<Object>> linkedList1 = commandLine0.getParsedOptionValue("ei", supplier0);
      assertSame(linkedList1, linkedList0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("18k", "g&m", true, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("g&m", "g&m");
      assertEquals("g&m", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Object object0 = commandLine0.getParsedOptionValue("fo5", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue("usage: ");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Supplier<String> supplier0 = (Supplier<String>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn("fo5").when(supplier0).get();
      String string0 = commandLine0.getOptionValue(option0, supplier0);
      assertEquals("fo5", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("18k", "g&m", true, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("g&m");
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("fo5");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("18k", "g&mB", true, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("org.apache.commons.cli.CommandLine");
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("18k", "g&mB", true, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties((Option) null);
      assertEquals(0, properties0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, "iuRd", false, "{bcm]g@X");
      commandLine0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addArg("options");
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption((Option) null);
      assertSame(commandLine_Builder1, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg((String) null);
      assertSame(commandLine_Builder1, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
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
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      Option option0 = new Option("fo5", true, "fo5");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "fo5");
      assertEquals("fo5", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('F');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('g');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject('a');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('~', (Supplier<String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('m', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('~', (Object) commandLine_Builder0);
      assertSame(commandLine_Builder0, object0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Supplier<Object> supplier0 = (Supplier<Object>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Object object0 = commandLine0.getParsedOptionValue('L', supplier0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue((Option) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = commandLine0.getParsedOptionValue('j');
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = CommandLine.builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("org.apache.commons.cli.CommandLine");
      assertNull(string0);
  }
}
