
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
      Option option0 = new Option("r7T", false, ":[");
      option0.setArgs((-4));
      boolean boolean0 = option0.requiresArg();
      assertEquals((-4), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      Option.Builder option_Builder1 = option_Builder0.option((String) null);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("R");
      Option.Builder option_Builder1 = option_Builder0.required(true);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      DeprecatedAttributes deprecatedAttributes0 = DeprecatedAttributes.DEFAULT;
      Option.Builder option_Builder1 = option_Builder0.deprecated(deprecatedAttributes0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("}Z;71z],eq0");
      Option.Builder option_Builder1 = option_Builder0.required();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Option option0 = new Option("r7T", false, "");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Option option0 = new Option("r7T", false, ":[");
      option0.setArgs(2);
      option0.processValue("&/.l`|&}eBr");
      option0.getValuesList();
      assertEquals(2, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Option option0 = new Option("r7T", false, "");
      option0.setValueSeparator('o');
      char char0 = option0.getValueSeparator();
      assertEquals('o', char0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Option option0 = new Option("u", "u");
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Option option0 = new Option("u", "u");
      String string0 = "\\u";
      String string1 = option0.getValue(string0);
      assertNotNull(string1);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "}", true, "}");
      option0.processValue("}");
      String string0 = option0.getValue(0);
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
      assertEquals("}", option0.getLongOpt());
      assertEquals("}", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "", true, "");
      option0.processValue("");
      String string0 = option0.getValue(0);
      assertEquals("", option0.getLongOpt());
      assertEquals("", option0.getDescription());
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Option option0 = new Option("r7T", false, "");
      option0.setArgs(2);
      option0.processValue("&/.l`|&}eBr");
      option0.getValue();
      assertEquals(2, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      option0.getOpt();
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Option option0 = new Option("3", true, "3");
      option0.setLongOpt("$");
      String string0 = option0.getLongOpt();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Option option0 = new Option((String) null, "", true, "");
      String string0 = option0.getLongOpt();
      assertNotNull(string0);
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("B| 2v{^m\"tO");
      option_Builder0.desc("Illegal option name '%s'.");
      Option option0 = option_Builder0.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      option_Builder1.desc("");
      Option option0 = option_Builder1.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      Option.Builder option_Builder2 = option_Builder1.deprecated();
      Option option0 = option_Builder2.build();
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Option option0 = new Option("3", true, "3");
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      option0.setArgName("[ Option 5sxfR2l$- :: 5sxfR2l$- :: class java.lang.String ]");
      option0.getArgName();
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      option0.setArgName("");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      boolean boolean0 = option0.acceptsArg();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("*B#]P8Xx(x%{0DvlO)f");
      Option option0 = option_Builder1.build();
      // Undeclared exception!
      try { 
        option0.setType((Object) option_Builder1);
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
      Option.Builder option_Builder0 = Option.builder("e");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('m');
      Option.Builder option_Builder2 = option_Builder1.optionalArg(true);
      Option option0 = option_Builder2.build();
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
      Option option0 = new Option("3", true, "3");
      option0.processValue("{vAyvLv.");
      try { 
        option0.getValue((-454));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, (String) null);
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("org.apache.commons.cli.Option$Builder");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'org.apache.commons.cli.Option$Builder' contains an illegal character : '.'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("3%OC`)ZIXoPkc)?>EQ", true, "3%OC`)ZIXoPkc)?>EQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '3%OC`)ZIXoPkc)?>EQ' contains an illegal character : '%'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("", "KM5MIIC4hI", true, "oBy\"@l (2A$V5*V>G-p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("M'|Ai%J!&]0}u)<oKGg", "M'|Ai%J!&]0}u)<oKGg");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'M'|Ai%J!&]0}u)<oKGg' contains an illegal character : '''.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("B| 2v{^m\"tO");
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.isDeprecated();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Option option0 = new Option("R", true, "R");
      option0.isDeprecated();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Option option0 = new Option("3", true, "3");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      option_Builder0.valueSeparator();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('=', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Option option0 = new Option("Xji", "Xji", true, "Xji");
      option0.setArgs(63);
      boolean boolean0 = option0.hasArgs();
      assertEquals(63, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Option option0 = new Option("u", "u");
      boolean boolean0 = option0.hasArgs();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      boolean boolean0 = option0.hasArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Option option0 = new Option("Xji", "Xji", true, "Xji");
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("KM5MIIC4hI");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Option option0 = new Option("u", "u");
      option0.getValue();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Option option0 = new Option("r7T", false, "");
      option0.getKey();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Option option0 = new Option("r7T", false, "");
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Option option0 = new Option((String) null, false, "[ARG...]");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Option option0 = new Option("n", ":~*k[zssg", true, "86 0,C0~");
      String string0 = option0.toString();
      assertEquals("[ Option n :~*k[zssg [ARG] :: 86 0,C0~ :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Option option0 = new Option("r7T", false, ":[");
      String string0 = option0.toDeprecatedString();
      assertEquals(":[", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertEquals("", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      Option.Builder option_Builder2 = option_Builder1.deprecated();
      Option option0 = option_Builder2.build();
      String string0 = option0.toDeprecatedString();
      assertEquals("Option 'null''B| 2v{^m\"tO': Deprecated", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      option_Builder1.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      option_Builder1.hasArgs();
      Option option0 = option_Builder1.build();
      option0.setValueSeparator('*');
      option0.processValue("*{[yQ+.T._ahe{");
      assertEquals('*', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "", false, "");
      // Undeclared exception!
      try { 
        option0.processValue("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      Option.Builder option_Builder2 = option_Builder1.deprecated();
      Option option0 = option_Builder2.build();
      String string0 = option0.toString();
      assertEquals("[ Option null B| 2v{^m\"tO Deprecated :: null :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Option option0 = new Option((String) null, false, "");
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("}Z;71z],eq0");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      String string0 = option0.toString();
      assertEquals("[ Option null }Z;71z],eq0[ARG...] :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Option option0 = new Option("r7T", false, ":[");
      option0.setArgs(2);
      option0.toString();
      assertEquals(2, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      Option.Builder option_Builder2 = option_Builder1.argName("w0hG)gFJ\"O");
      Option option0 = option_Builder2.build();
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Option option0 = new Option("xyX", true, "FK<S-");
      boolean boolean0 = option0.hasArgName();
      assertEquals("FK<S-", option0.getDescription());
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Option option0 = new Option("3", true, "3");
      option0.processValue("");
      String[] stringArray0 = option0.getValues();
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      option0.getValue(3030);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Option option0 = new Option("3", true, "3");
      option0.processValue("{vAyvLv.");
      try { 
        option0.getValue(42);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 42, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("356wR/PLh\"7R ");
      Option option0 = option_Builder0.build();
      String string0 = option0.getValue("");
      assertNotNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Option option0 = new Option((String) null, "Q+f(M])7B?", true, "\"");
      assertTrue(option0.hasArg());
      
      option0.processValue("");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertTrue(option0.hasLongOpt());
      assertEquals("\"", option0.getDescription());
      assertEquals(81, option0.getId());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      Option option1 = new Option((String) null, false, "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option1.getArgs());
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      Option option1 = (Option)option0.clone();
      assertFalse(option1.hasLongOpt());
      
      option1.setLongOpt("org.apache.commons.cli.Option$1");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option option0 = new Option("5sxfR2l$-", false, "");
      boolean boolean0 = option0.equals(option_Builder0);
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      boolean boolean0 = option0.equals(option0);
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Deprecated");
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertFalse(option0.hasArgs());
      assertTrue(boolean0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("e");
      option_Builder0.optionalArg(true);
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs((-2679));
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.acceptsArg();
      assertFalse(option0.hasArg());
      assertFalse(option0.hasArgs());
      assertTrue(boolean0);
      assertEquals((-2679), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Option option0 = new Option("3", true, "3");
      option0.processValue("{vAyvLv.");
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
  public void test074()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
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
  public void test077()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("e");
      Option option0 = option_Builder0.build();
      String[] stringArray0 = option0.getValues();
      assertEquals((-1), option0.getArgs());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("356wR/PLh\"7R ");
      Option option0 = option_Builder0.build();
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("356wR/PLh\"7R ");
      Option option0 = option_Builder0.build();
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Option option0 = new Option("r7T", false, ":[");
      String string0 = option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
      assertEquals(":[", option0.getDescription());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("356wR/PLh\"7R ");
      Option option0 = option_Builder0.build();
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Option option0 = new Option("r7T", false, ":[");
      option0.isRequired();
      assertEquals(":[", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("B| 2v{^m\"tO");
      Option option0 = option_Builder1.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
      assertEquals("", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("356wR/PLh\"7R ");
      Option option0 = option_Builder0.build();
      option0.clearValues();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Option option0 = new Option("r7T", false, ":[");
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals(":[", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Option option0 = new Option((String) null, false, "");
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      assertEquals("", option0.getDescription());
      
      option0.setDescription("5sxfR2l$-");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Option option0 = new Option("u", "u");
      // Undeclared exception!
      try { 
        option0.addValue("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the processValue method instead.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option0.equals(option1);
      assertEquals("", option1.getDescription());
      assertTrue(boolean0);
      assertFalse(option1.hasLongOpt());
      assertEquals((-1), option1.getArgs());
      assertNotSame(option1, option0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      int int0 = option0.getId();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals(53, int0);
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      Converter<?, ?> converter0 = option0.getConverter();
      option0.setConverter(converter0);
      Converter<?, ?> converter1 = option0.getConverter();
      assertNotNull(converter1);
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("356wR/PLh\"7R ");
      Option option0 = option_Builder0.build();
      option0.getValuesList();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Option option0 = new Option("r7T", false, ":[");
      option0.setRequired(false);
      assertEquals(":[", option0.getDescription());
      assertFalse(option0.isRequired());
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Option option0 = new Option("5sxfR2l$-", false, "");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Option option0 = new Option((String) null, false, "");
      option0.setType((Object) null);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Object> class0 = Object.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArgs();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      Option.Builder option_Builder2 = option_Builder1.optionalArg(true);
      assertSame(option_Builder2, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option option0 = new Option("5sxfR2l$-", false, "");
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      option_Builder0.converter(converter0);
      assertFalse(option0.hasLongOpt());
      assertEquals("", option0.getDescription());
      assertEquals((-1), option0.getArgs());
  }
}
