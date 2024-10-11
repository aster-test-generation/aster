
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
import org.apache.commons.cli.Converter;
import org.apache.commons.cli.DeprecatedAttributes;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs((-4));
      boolean boolean0 = option0.requiresArg();
      assertEquals((-4), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.valueSeparator();
      option_Builder0.numberOfArgs(45);
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      option0.processValue("lg=wv*&K");
      assertEquals(45, option0.getArgs());
      assertEquals("lg", option0.getValue());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, ":AR");
      option0.setOptionalArg(true);
      option0.setArgs(0);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs(0);
      Option.Builder option_Builder2 = option_Builder0.optionalArg(true);
      assertSame(option_Builder2, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('z');
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Bf4");
      Option.Builder option_Builder1 = option_Builder0.required(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated((DeprecatedAttributes) null);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.optionalArg(true);
      Option.Builder option_Builder1 = option_Builder0.longOpt("\"");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasOptionalArg();
      assertEquals(1, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      option0.processValue("");
      option0.getValuesList();
      assertFalse(option0.hasValueSeparator());
      assertTrue(option0.hasArg());
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "VB{pGD");
      option0.setValueSeparator('a');
      char char0 = option0.getValueSeparator();
      assertEquals('a', char0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      String string0 = option0.getValue("ai");
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Option option0 = new Option("4PlpINzY", "", true, (String) null);
      option0.processValue("");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertEquals("", option0.getLongOpt());
      assertNotNull(string0);
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Option option0 = new Option((String) null, false, "fYi0x'Kb=");
      String string0 = option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("");
      option0.getLongOpt();
      assertFalse(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      String string0 = option0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated");
      option0.setDescription("");
      option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder1.build();
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("j3_x");
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs(0);
      Option option0 = option_Builder1.build();
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated");
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, ":AR");
      option0.setArgName("!1");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
      assertEquals(":AR", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Option option0 = new Option("Deprecated", false, "Deprecated");
      option0.setArgName("");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option option0 = new Option("converterMap", (String) null);
      // Undeclared exception!
      try { 
        option0.setType((Object) option_Builder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.cli.Option$Builder cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      option_Builder1.hasArgs();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder1.build();
      // Undeclared exception!
      try { 
        option0.processValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Option option0 = new Option("4PlpINzY", "", true, (String) null);
      option0.processValue("`^B,%aids");
      try { 
        option0.getValue(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("", false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("Fhk5>N`_4{H|$", "The addValue method is not intended for client use. Subclasses should use the processValue method instead.", false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Fhk5>N`_4{H|$' contains an illegal character : '>'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.deprecated();
      Option.Builder option_Builder1 = option_Builder0.longOpt("\"");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.isDeprecated();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, ":AR");
      option0.isDeprecated();
      assertEquals(":AR", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Bf4");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Option option0 = new Option("Deprecated", false, "Deprecated");
      option0.setValueSeparator('m');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('m', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Option option0 = new Option("4PlpINzY", "", true, (String) null);
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArgs();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("converterMap");
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs(39);
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArgs();
      assertEquals(39, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.hasArgs();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Option option0 = new Option("Deprecated", false, "Deprecated");
      boolean boolean0 = option0.hasArg();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option.Builder option_Builder1 = option_Builder0.hasArg(true);
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Option option0 = new Option("4PlpINzY", "", true, (String) null);
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArg();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Option option0 = new Option("qaGp", "qaGp", true, "9Q0zLBwmpP<3g");
      option0.getValue();
      assertEquals("qaGp", option0.getLongOpt());
      assertEquals("9Q0zLBwmpP<3g", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Option option0 = new Option("4PlpINzY", "", true, (String) null);
      option0.processValue("`^B,%aids");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
      assertEquals("", option0.getLongOpt());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Option option0 = new Option("6", "6");
      option0.getKey();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Option option0 = new Option((String) null, "RlV0I[0w", true, "RlV0I[0w");
      option0.getValueSeparator();
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Option option0 = new Option((String) null, "RlV0I[0w", true, "RlV0I[0w");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      Option.Builder option_Builder1 = option_Builder0.option((String) null);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option.Builder option_Builder1 = option_Builder0.hasArg(true);
      Option option0 = option_Builder1.build();
      String string0 = option0.toString();
      assertEquals("[ Option null \" [ARG] :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      option0.setLongOpt((String) null);
      String string0 = option0.toString();
      assertEquals((-1), option0.getArgs());
      assertEquals("[ Option null :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("cverterMap");
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      String string0 = option0.toDeprecatedString();
      assertEquals("Option 'cverterMap': Deprecated", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Option option0 = new Option("4PlpINzY", "", true, (String) null);
      String string0 = option0.toDeprecatedString();
      assertEquals("", option0.getLongOpt());
      assertTrue(option0.hasLongOpt());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.deprecated();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      String string0 = option0.toDeprecatedString();
      assertEquals("Option 'null''\"': Deprecated", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Option option0 = new Option("4PlpINzY", "", true, (String) null);
      option0.setArgs((-2));
      option0.processValue("`^B,%aids");
      boolean boolean0 = option0.requiresArg();
      assertEquals((-2), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.optionalArg(true);
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.valueSeparator();
      option_Builder0.longOpt("\"");
      Option.Builder option_Builder1 = option_Builder0.hasArg(true);
      Option option0 = option_Builder1.build();
      assertEquals(1, option0.getArgs());
      
      option0.processValue("lg=wv*&K");
      assertEquals('=', option0.getValueSeparator());
      assertTrue(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      // Undeclared exception!
      try { 
        option0.processValue("lg=wv*&K");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.deprecated();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      String string0 = option0.toString();
      assertEquals((-1), option0.getArgs());
      assertEquals("[ Option null \" Deprecated :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      assertFalse(option0.isDeprecated());
      
      String string0 = option0.toString();
      assertEquals("[ Option null \"[ARG...] :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, ":AR");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
      assertEquals(":AR", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, ":AR");
      option0.setArgName("!1");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Option option0 = new Option("L", "L");
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      String[] stringArray0 = option0.getValues();
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.processValue("");
      String[] stringArray0 = option0.getValues();
      assertNotNull(stringArray0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      String string0 = option0.getValue((-2));
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.processValue("");
      try { 
        option0.getValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Option option0 = new Option("L", "L");
      String string0 = option0.getValue("");
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.processValue("");
      option0.getValue("");
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Option option0 = new Option("Deprecated", false, "Deprecated");
      int int0 = option0.getId();
      assertEquals(68, int0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("D");
      Option option0 = new Option("L", "L");
      Option option1 = option_Builder0.build();
      boolean boolean0 = option1.equals(option0);
      assertEquals((-1), option1.getArgs());
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      Option option1 = new Option((String) null, "[ Option null \" Deprecated[ARG...] :: null :: class java.lang.Object ]", false, (String) null);
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option0.getArgs());
      assertEquals((-1), option1.getArgs());
      assertFalse(boolean0);
      assertTrue(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      Object object0 = option0.clone();
      boolean boolean0 = option0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, option0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Option option0 = new Option("N4Q", "N4Q");
      boolean boolean0 = option0.equals(option0);
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      Object object0 = option0.getType();
      boolean boolean0 = option0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Option option0 = new Option("Deprecated", "Deprecated");
      option0.setArgs((-3233));
      // Undeclared exception!
      try { 
        option0.processValue((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      assertTrue(option0.hasArg());
      
      option0.processValue("");
      boolean boolean0 = option0.acceptsArg();
      assertFalse(boolean0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      option_Builder0.longOpt("\"");
      Option.Builder option_Builder2 = option_Builder1.hasArg(false);
      Option option0 = option_Builder2.build();
      boolean boolean0 = option0.acceptsArg();
      assertFalse(option0.hasArgs());
      assertFalse(option0.hasArg());
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      // Undeclared exception!
      try { 
        option_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Either opt or longOpt must be specified
         //
         verifyException("org.apache.commons.cli.Option$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setLongOpt("Empty option name.");
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, ":AR");
      String string0 = option0.getOpt();
      assertEquals(":AR", option0.getDescription());
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, "[ARG...]");
      // Undeclared exception!
      try { 
        option0.addValue((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the processValue method instead.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Option option0 = new Option("qaGp", "qaGp", true, "9Q0zLBwmpP<3g");
      String string0 = option0.getLongOpt();
      assertTrue(option0.hasArg());
      assertEquals("9Q0zLBwmpP<3g", option0.getDescription());
      assertEquals("qaGp", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.hashCode();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Option option0 = new Option("L", "L");
      option0.isRequired();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Option option0 = new Option("L", "L");
      String string0 = option0.getDescription();
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Option option0 = new Option("e22UE", "e22UE", true, "S3d=HG");
      int int0 = option0.getArgs();
      assertEquals(1, int0);
      assertEquals("e22UE", option0.getLongOpt());
      assertEquals("S3d=HG", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      option0.clearValues();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      option_Builder1.hasArgs();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      option0.processValue("lg=wv*&K");
      assertTrue(option0.hasArg());
      assertEquals("lg", option0.getValue());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      option0.setConverter(converter0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("\"");
      Option option0 = option_Builder0.build();
      option0.getValuesList();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Option option0 = new Option("L", "L");
      option0.setRequired(true);
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, ":AR");
      option0.getArgName();
      assertEquals(":AR", option0.getDescription());
      assertTrue(option0.hasArg());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Option option0 = new Option("e22UE", "e22UE", true, "S3d=HG");
      option0.setType((Object) null);
      assertTrue(option0.hasArg());
      assertEquals("S3d=HG", option0.getDescription());
      assertEquals("e22UE", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Object> class0 = Object.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option.Builder option_Builder2 = option_Builder0.optionalArg(true);
      assertSame(option_Builder2, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("D");
      Option.Builder option_Builder1 = option_Builder0.desc("D");
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("D");
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Bf4");
      Option option0 = option_Builder0.build();
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      option_Builder0.converter(converter0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("D");
      Option.Builder option_Builder1 = option_Builder0.required();
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.argName((String) null);
      assertSame(option_Builder1, option_Builder0);
  }
}
