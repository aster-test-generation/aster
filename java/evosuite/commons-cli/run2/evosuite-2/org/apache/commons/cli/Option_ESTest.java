
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
      Option option0 = new Option((String) null, false, (String) null);
      option0.setArgs((-2837));
      boolean boolean0 = option0.requiresArg();
      assertEquals((-2837), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      Option.Builder option_Builder2 = option_Builder1.valueSeparator('n');
      Option.Builder option_Builder3 = option_Builder2.hasArgs();
      Option option0 = option_Builder3.build();
      option0.processValue(".cdO,nkAV7<tCpM");
      assertEquals(".cdO,", option0.getValue());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Option option0 = new Option("9F", "bv w)]^:0!6[`m");
      option0.setArgs((-13));
      option0.toString();
      assertEquals((-13), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      boolean boolean0 = option0.acceptsArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("ko");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option.Builder option_Builder2 = option_Builder1.optionalArg(true);
      assertSame(option_Builder2, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      DeprecatedAttributes deprecatedAttributes0 = DeprecatedAttributes.DEFAULT;
      Option.Builder option_Builder1 = option_Builder0.deprecated(deprecatedAttributes0);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("VF\"");
      option_Builder1.required();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED", true, ")z|*");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs(68);
      option0.processValue("");
      option0.getValuesList();
      assertEquals(68, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, "");
      option0.setValueSeparator('0');
      char char0 = option0.getValueSeparator();
      assertEquals('0', char0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.valueSeparator('x');
      Option option0 = option_Builder0.build();
      char char0 = option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertEquals('x', char0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Option option0 = new Option((String) null, "");
      option0.getValue((String) null);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Option option0 = new Option("1", (String) null, false, "");
      String string0 = option0.getValue("");
      assertNotNull(string0);
      assertEquals("", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      option_Builder1.hasArg(true);
      Option option0 = option_Builder0.build();
      option0.processValue(".cdO,nkAV7<tCpM");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Option option0 = new Option("ai", false, "ai");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Option option0 = new Option("s8", "s8");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("s8");
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Option option0 = new Option("0", "O_ARGS_ALL$WED");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("");
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Option option0 = new Option((String) null, "");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("");
      option0.getKey();
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Option option0 = new Option((String) null, "d#M:Lu!wcGb8+ bv4~", false, "d#M:Lu!wcGb8+ bv4~");
      String string0 = option0.getDescription();
      assertTrue(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "");
      String string0 = option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      option_Builder1.longOpt("");
      Option option0 = option_Builder0.build();
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Option option0 = new Option("Deprecated", false, "HR\"HH;H");
      option0.setArgs(39);
      int int0 = option0.getArgs();
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgName("");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "Deprecated");
      // Undeclared exception!
      try { 
        option0.setType((Object) option0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.cli.Option cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('&');
      option0.setArgs(39);
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
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED", true, ")z|*");
      option0.processValue("Cannot add value, list full.");
      try { 
        option0.getValue((-1354));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Option option0 = new Option((String) null, "org.apache.commons.cli.DeprecatedAttributes$1");
      option0.setLongOpt("");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Option option0 = new Option((String) null, "1");
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
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("+p[xmhLZskO?]6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '+'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("mnDK\"&!9URYj.", false, "mnDK\"&!9URYj.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'mnDK\"&!9URYj.' contains an illegal character : '\"'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("", "", true, "");
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
  public void test033()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      option_Builder1.longOpt("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.isDeprecated();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Option option0 = new Option("yJ", "yJ", false, "yJ");
      option0.isDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Option option0 = new Option("Deprecated", true, "Deprecated");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertTrue(option0.hasArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('&');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('&', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertFalse(option0.hasArg());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED", true, ")z|*");
      boolean boolean0 = option0.hasArgs();
      assertFalse(boolean0);
      assertEquals("NO_ARGS_ALLOWED", option0.getLongOpt());
      assertEquals(")z|*", option0.getDescription());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("S");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs(39);
      option0.hasArg();
      assertEquals(39, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      Option.Builder option_Builder2 = option_Builder1.hasArgs();
      Option option0 = option_Builder2.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Option option0 = new Option((String) null, "");
      String string0 = option0.getKey();
      assertNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Option option0 = new Option((String) null, "1SnNo@&c(rA=qxwuN1");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder((String) null);
      Option.Builder option_Builder1 = option_Builder0.option((String) null);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      Option.Builder option_Builder2 = option_Builder1.hasArg(true);
      Option option0 = option_Builder2.build();
      String string0 = option0.toString();
      assertEquals("[ Option null V,F\" [ARG] :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      String string0 = option0.toDeprecatedString();
      assertEquals((-1), option0.getArgs());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("S");
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      String string0 = option0.toDeprecatedString();
      assertEquals("Option 'S': Deprecated", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      Option.Builder option_Builder2 = option_Builder1.hasArgs();
      Option option0 = option_Builder2.build();
      option0.processValue(".cdO,nkAV7<tCpM");
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArg());
      assertFalse(boolean0);
      assertTrue(option0.hasArgs());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("V,F\"");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Option option0 = new Option((String) null, "org.apache.commons.cli.DeprecatedAttributes$1");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasOptionalArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      option_Builder0.valueSeparator('d');
      option_Builder1.hasArg(true);
      Option option0 = option_Builder1.build();
      option0.processValue(".cdO,nkAV7<tCpM");
      assertTrue(option0.hasValueSeparator());
      assertEquals('d', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setValueSeparator('&');
      option0.setArgs('&');
      option0.processValue("\".&~%q2w{'u=:");
      assertEquals(38, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, " since ");
      // Undeclared exception!
      try { 
        option0.processValue((String) null);
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
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      option_Builder0.deprecated();
      Option option0 = option_Builder1.build();
      String string0 = option0.toString();
      assertEquals("[ Option null V,F\" Deprecated :: null :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("s");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasLongOpt();
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      option0.setLongOpt((String) null);
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("V,F\"");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      assertFalse(option0.isDeprecated());
      
      String string0 = option0.toString();
      assertEquals("[ Option null V,F\"[ARG...] :: null :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs('&');
      boolean boolean0 = option0.hasArgs();
      assertEquals(38, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("s");
      option_Builder0.argName("X.^JquUCm&=pFW");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("@");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      Option option0 = option_Builder1.build();
      String[] stringArray0 = option0.getValues();
      assertEquals((-1), option0.getArgs());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs(39);
      option0.processValue("");
      option0.getValues();
      assertEquals(39, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Option option0 = new Option("ai", false, "ai");
      String string0 = option0.getValue("(bgk&G82T8g|{61E");
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Option option0 = new Option("9F", "bv w)]^:0!6[`m");
      option0.getValue((-1190));
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("bv w)]^:0!6[`m", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Option option0 = new Option("9F", "bv w)]^:0!6[`m");
      option0.getValue();
      assertEquals("bv w)]^:0!6[`m", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.processValue("");
      option0.getValue();
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Option option0 = new Option("9F", "bv w)]^:0!6[`m");
      String string0 = option0.getKey();
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
      assertEquals("bv w)]^:0!6[`m", option0.getDescription());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option0.equals(option1);
      assertTrue(boolean0);
      assertNotSame(option1, option0);
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Option option1 = new Option("Eo", false, (String) null);
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertEquals((-1), option1.getArgs());
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Option option0 = new Option("o", "o");
      boolean boolean0 = option0.equals(option0);
      assertTrue(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.equals((Object) null);
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      option_Builder1.hasArg(true);
      Option option0 = option_Builder1.build();
      option0.processValue(".cdO,nkAV7<tCpM");
      // Undeclared exception!
      try { 
        option0.processValue(".cdO,nkAV7<tCpM");
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
      Option option0 = new Option((String) null, "org.apache.commons.cli.DeprecatedAttributes$1");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Option option0 = new Option("0", "O_ARGS_ALL$WED");
      boolean boolean0 = option0.requiresArg();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
      assertEquals("O_ARGS_ALL$WED", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      option_Builder1.hasArg(true);
      Option option0 = option_Builder0.build();
      assertTrue(option0.hasArg());
      
      option0.processValue(".cdO,nkAV7<tCpM");
      String string0 = option0.getValue("");
      assertFalse(option0.hasValueSeparator());
      assertEquals(".cdO,nkAV7<tCpM", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.hasArg(true);
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(true);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("S");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Option option0 = new Option("o", "o");
      // Undeclared exception!
      try { 
        option0.addValue("Aaj&gSz>");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the processValue method instead.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Option option0 = new Option("0", "O_ARGS_ALL$WED");
      String string0 = option0.getLongOpt();
      assertEquals("O_ARGS_ALL$WED", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Option option0 = new Option((String) null, "org.apache.commons.cli.DeprecatedAttributes$1");
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("V,F\"");
      Option option0 = option_Builder0.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.clearValues();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      Option option0 = option_Builder1.build();
      option0.getDeprecated();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("S");
      Option option0 = option_Builder0.build();
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.hasOptionalArg();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("S");
      Option option0 = option_Builder0.build();
      option0.setDescription("S");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("S");
      Option option0 = option_Builder0.build();
      option0.setArgName("vhr_HFDn/fzn3It");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, " since ");
      Object object0 = option0.clone();
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("q_");
      boolean boolean0 = option0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("V,F\"");
      Option option0 = option_Builder1.build();
      int int0 = option0.getId();
      assertEquals((-1), option0.getArgs());
      assertEquals(86, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Converter<?, ?> converter0 = option0.getConverter();
      option0.setConverter(converter0);
      Converter<?, ?> converter1 = option0.getConverter();
      assertEquals((-1), option0.getArgs());
      assertNotNull(converter1);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValuesList();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs(39);
      option0.processValue("");
      try { 
        option0.getValue(2083);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2083, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, false, " since ");
      option0.setRequired(false);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.isRequired());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("S");
      Option option0 = option_Builder0.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      option0.setType((Object) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Option> class0 = Option.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.desc("");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs((-764));
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.deprecated();
      option_Builder1.longOpt("s");
      Option option0 = option_Builder0.build();
      String string0 = option0.toDeprecatedString();
      assertEquals("Option 'null''s': Deprecated", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("V,F\"");
      Option option0 = option_Builder0.build();
      Converter<?, ?> converter0 = option0.getConverter();
      assertNotNull(converter0);
      
      option_Builder0.converter(converter0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("s");
      Option option0 = option_Builder0.build();
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder0, option_Builder1);
  }
}
