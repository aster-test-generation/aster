
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.util.Comparator;
import java.util.IllegalFormatConversionException;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setWidth((-12));
      helpFormatter0.defaultLeftPad = 2137;
      helpFormatter0.defaultLongOptPrefix = "LjPni*F|[2e";
      helpFormatter0.setDescPadding(0);
      helpFormatter0.rtrim("usage: ");
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.setLongOptSeparator("usage:");
      helpFormatter0.getWidth();
      String string0 = "[";
      try { 
        MockURI.URI("k>OqM^1&N-K'Qbp", "[", "LjPni*F|[2e");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 1: k>OqM^1&N-K'Qbp:[#LjPni*F%7C[2e
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos("Tp`K,UELxUu{jYK'*H", 1675, (-2421));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("\n");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-22), "   ", options0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 23;
      Options options0 = new Options();
      helpFormatter0.setWidth(23);
      helpFormatter0.printHelp(23, "cmdLineSyntax not provided", "cmdLineSyntax not provided", options0, ">H");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.getOptPrefix();
      int int1 = 1672;
      StringBuffer stringBuffer0 = new StringBuffer(1672);
      int int2 = (-452);
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 23, options0, (-452), 1672);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      StringBuffer stringBuffer0 = new StringBuffer("kBNg]UO~WY!s");
      Options options0 = new Options();
      helpFormatter0.renderOptions(stringBuffer0, 0, options0, 0, 0);
      helpFormatter0.rtrim("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim("arg");
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.commons.cli.HelpFormatter$1");
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) helpFormatter_Builder0;
      objectArray0[1] = (Object) "org.apache.commons.cli.HelpFormatter$1";
      char[] charArray0 = new char[2];
      charArray0[0] = '?';
      charArray0[1] = ' ';
      mockPrintWriter0.write(charArray0);
      objectArray0[2] = (Object) "arg";
      Object object0 = new Object();
      objectArray0[3] = object0;
      // Undeclared exception!
      try { 
        mockPrintWriter0.printf(">I%+6al4`.:", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // a != org.apache.commons.cli.HelpFormatter$Builder
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      PrintWriter printWriter0 = null;
      String string0 = "]";
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) null, (-2421), "]");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.setLeftPadding(1);
      MockPrintStream mockPrintStream0 = new MockPrintStream("-");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, false);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter1, (-211), "y}xq}dAmMA", " for removal", options0, (-211), (-376), "r:9-GF;~b_}QYzgv");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.get();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      String string0 = "|i";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("|i");
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      helpFormatter_Builder2.setPrintWriter(mockPrintWriter0);
      boolean boolean0 = false;
      helpFormatter_Builder2.setShowDeprecated(false);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-2), 6384, "|i");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      Options options0 = new Options();
      helpFormatter0.setOptPrefix("");
      helpFormatter0.printHelp("pmDShg/Y.", options0);
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.setSyntaxPrefix("pmDShg/Y.");
      helpFormatter0.defaultNewLine = "V:N8{j1SG_L0On;6~}Q";
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.setOptPrefix("");
      helpFormatter0.getLongOptSeparator();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("usage: ");
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.format("arg", objectArray0);
      helpFormatter0.setLeftPadding(46);
      helpFormatter0.printUsage(printWriter0, 9, "pmDShg/Y.");
      helpFormatter0.setOptPrefix(":CD{TxxSM{M");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "P_.s/D|-&ta;0.xqZ";
      helpFormatter0.setSyntaxPrefix("P_.s/D|-&ta;0.xqZ");
      String string1 = "";
      helpFormatter0.setSyntaxPrefix("");
      helpFormatter0.getSyntaxPrefix();
      String string2 = "";
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      Options options1 = new Options();
      options0.addOptions(options1);
      helpFormatter0.printHelp("org.apache.commons.cli.HelpFormatter$Builder", options0, true);
      helpFormatter0.setDescPadding(2);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      Locale locale0 = Locale.JAPAN;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) locale0;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "--", objectArray0);
      helpFormatter_Builder0.setPrintWriter(printWriter0);
      helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter("org.apache.commons.cli.HelpFormatter$Builder");
      PrintWriter printWriter1 = mockPrintWriter1.append('N');
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped(printWriter1, 2, (-2274), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-");
      helpFormatter0.setNewLine("xsSHu tVH]s");
      Options options0 = new Options();
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-1), "xsSHu tVH]s", options0);
      helpFormatter0.setWidth((-3698));
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, (-1), options0, (-1434), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder1.get();
      String string0 = "The addValue method is not intended for client use. Subclasses should use the processValue method instead.";
      Options options0 = new Options();
      options0.hasShortOption("The option '%s' was specified but an option from this group has already been selected: '%s'");
      helpFormatter0.setSyntaxPrefix("\"#GQ:xK{v|D&:7*GxWr");
      // Undeclared exception!
      try { 
        helpFormatter1.printHelp("", (String) null, options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringBuffer stringBuffer0 = new StringBuffer(1);
      int int0 = (-522);
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, 0, (-522), "arg");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("[Deprecated]");
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      PrintWriter printWriter0 = mockPrintWriter1.format("[Deprecated]", objectArray0);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      stringBuffer0.appendCodePoint(3);
      mockPrintWriter1.print('-');
      helpFormatter0.renderWrappedText(stringBuffer0, 819, 10, "r&h%ki");
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.getLongOptPrefix();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, 819, (String) null, "[Deprecated]", options0, 819, 2902, "r&h%ki");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.setOptPrefix("org.apache.commons.cli.HelpFormatter$1");
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.getOptionComparator();
      int int0 = 3681;
      helpFormatter0.findWrapPos("", 3681, 2);
      helpFormatter0.getOptPrefix();
      helpFormatter0.setNewLine("");
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText((StringBuffer) null, 3681, 0, "org.apache.commons.cli.HelpFormatter$1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", ">", options0, "]n[)7x%Wkq6W", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "UNWQ?r3=z^g";
      Options options0 = new Options();
      options0.hasShortOption(" ");
      helpFormatter0.printHelp(238, "ez", "UNWQ?r3=z^g", options0, "UNWQ?r3=z^g", true);
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.printHelp("ez", options0, true);
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderWrappedText(stringBuffer0, 238, 2609, "ez");
      helpFormatter0.setSyntaxPrefix("'-g{@2");
      helpFormatter0.findWrapPos("UNWQ?r3=z^g", 0, 0);
      helpFormatter0.setWidth(0);
      helpFormatter0.getDescPadding();
      helpFormatter0.setLongOptPrefix("V=y%p^z~!");
      helpFormatter0.getLongOptPrefix();
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-2077));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("=yj^:P+C)Fz", true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, true);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      mockPrintWriter0.flush();
      mockFileOutputStream0.flush();
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      Options options0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(":", (Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getArgName();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "\n");
      StringBuffer stringBuffer1 = new StringBuffer((CharSequence) "arg");
      stringBuffer1.append((CharSequence) "\n");
      stringBuffer0.append(stringBuffer1);
      // Undeclared exception!
      helpFormatter0.renderWrappedText(stringBuffer0, 0, 0, "8zPn{3+p[");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      int int0 = 450;
      int int1 = 0;
      helpFormatter0.defaultLeftPad = 0;
      helpFormatter0.setArgName("org.apache.commons.cli.HelpFormatter$1");
      helpFormatter0.renderWrappedText(stringBuffer0, 450, 0, "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("--", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      mockFileOutputStream0.close();
      Locale locale0 = Locale.CHINESE;
      locale0.getScript();
      locale0.hasExtensions();
      mockFileOutputStream0.release();
      // Undeclared exception!
      try { 
        mockPrintWriter0.format(locale0, (String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "#ZNUMCLbJw#3cNY\"(";
      helpFormatter0.setLongOptSeparator("");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-3116), "#ZNUMCLbJw#3cNY\"(", "#ZNUMCLbJw#3cNY\"(", (Options) null, "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      options0.getMatchingOptions("QfZEhx%hn{w)6");
      options0.getMatchingOptions("arg");
      helpFormatter0.setOptionComparator((Comparator<Option>) null);
      helpFormatter0.printHelp("org.apache.commons.cli.HelpFormatter$OptionComparator", options0);
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      // Undeclared exception!
      try { 
        helpFormatter1.printHelp("-", (Options) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      HelpFormatter helpFormatter1 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuffer stringBuffer1 = helpFormatter1.renderWrappedText(stringBuffer0, 93, 3, "usage: ");
      Options options0 = new Options();
      helpFormatter0.renderOptions(stringBuffer1, 0, options0, 700, 0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setWidth((-1613));
      helpFormatter0.getArgName();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "arg");
      int int0 = (-850);
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, (-850), 74, "arg");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer(3);
      Options options0 = new Options();
      StringBuffer stringBuffer1 = helpFormatter0.renderOptions(stringBuffer0, 0, options0, 0, 4357);
      stringBuffer1.ensureCapacity((-625));
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer1, 0, options0, (-1506), 61);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringWriter stringWriter0 = new StringWriter(74);
      StringWriter stringWriter1 = stringWriter0.append('\\');
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter1, false);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 0, (String) null, (String) null, options0, 0, (-1245), "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      helpFormatter1.setLongOptSeparator("l72M[sm|)m;q");
      byteArrayOutputStream0.reset();
      int int0 = (-2303);
      helpFormatter0.setWidth((-2303));
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      Locale locale0 = Locale.GERMAN;
      Object[] objectArray0 = new Object[0];
      mockPrintWriter1.format(locale0, "\n", objectArray0);
      mockPrintWriter0.println('~');
      helpFormatter1.printWrapped((PrintWriter) mockPrintWriter1, 3, 46, "\n");
      helpFormatter0.findWrapPos("", 0, 0);
      helpFormatter1.setSyntaxPrefix((String) null);
      helpFormatter1.getLongOptSeparator();
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "usage: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.renderOptions((StringBuffer) null, 2042, options0, 2042, 2042);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter1 = helpFormatter_Builder1.get();
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("usage: ");
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) helpFormatter_Builder0;
      objectArray0[1] = (Object) mockPrintWriter0;
      objectArray0[2] = (Object) helpFormatter_Builder2;
      objectArray0[3] = (Object) mockPrintWriter0;
      objectArray0[4] = (Object) helpFormatter_Builder2;
      PrintWriter printWriter0 = mockPrintWriter0.printf("\n", objectArray0);
      helpFormatter_Builder1.setPrintWriter(printWriter0);
      Options options0 = new Options();
      Options options1 = new Options();
      Options options2 = options0.addOptions(options1);
      options0.hasShortOption(" ");
      helpFormatter_Builder1.get();
      helpFormatter1.printHelp(61, " [ARG]", " [ARG]", options0, "");
      helpFormatter1.getArgName();
      HelpFormatter.builder();
      // Undeclared exception!
      helpFormatter0.printHelp(printWriter0, 1, "\n", "--", options2, (-2342), 832, "arg", false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringBuffer stringBuffer0 = new StringBuffer("~j+:b0");
      Options options0 = new Options();
      helpFormatter0.renderOptions(stringBuffer0, 0, options0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("o!kp`S");
      helpFormatter0.setWidth((-565));
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("o!kp`S", "o!kp`S", options0, "o!kp`S");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      int int0 = 384;
      String string0 = "-g;h#%].;{6X";
      Options options0 = null;
      String string1 = "";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(384, "-g;h#%].;{6X", "-g;h#%].;{6X", (Options) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      HelpFormatter.builder();
      Options options1 = options0.addOption((String) null, false, "");
      helpFormatter0.printHelp("g{)f)z'C3,", options0, false);
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 2790, "org.apache.commons.cli.Option$Builder", "g{)f)z'C3,", options1, 2790, (-1760), "", false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.get();
      helpFormatter0.createPadding(0);
      helpFormatter0.setArgName("lklg;hK~)=bf~9n2ef");
      helpFormatter0.getNewLine();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("S3~T^l-<5{p4", options0, false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("[Deprecated]");
      mockPrintWriter0.println('?');
      mockPrintWriter0.println("");
      options0.hasShortOption("usage: ");
      String string0 = "--";
      int int0 = (-833);
      // Undeclared exception!
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 0, "--", "[Deprecated]", options0, 0, (-833), "S3~T^l-<5{p4");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("n?f6p[Oh!;", "n?f6p[Oh!;", options0, "Lkk~d@OcHID{uu", false);
      helpFormatter0.setArgName("The addValue method is not intended for client use. Subclasses should use the processValue method instead.");
      helpFormatter0.getLeftPadding();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("n?f6p[Oh!;");
      Object[] objectArray0 = new Object[0];
      PrintWriter printWriter0 = mockPrintWriter0.format("\n", objectArray0);
      // Undeclared exception!
      helpFormatter0.printUsage(printWriter0, 1, "#@d=~");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setWidth(3);
      helpFormatter0.defaultLeftPad = 2137;
      helpFormatter0.defaultLongOptPrefix = "LjPni*F|[2e";
      helpFormatter0.setDescPadding(0);
      helpFormatter0.getLongOptSeparator();
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.setLongOptSeparator(" ");
      helpFormatter0.getWidth();
      String string0 = "[";
      try { 
        MockURI.URI("k>OqM^1&N-K'Qbp", "[", "LjPni*F|[2e");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 1: k>OqM^1&N-K'Qbp:[#LjPni*F%7C[2e
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      Options options0 = null;
      stringBuffer0.append((CharSequence) "--");
      int int0 = 0;
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 2, (Options) null, 0, 14);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = null;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("--");
      mockPrintWriter0.print((float) 3);
      mockPrintWriter0.print(3);
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-3164), "n%RIxdf\"|DT]TTv+");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "~$nO=";
      Options options0 = new Options();
      options0.getOptions();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      // Undeclared exception!
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 0, 0, "~$nO=");
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 74;
      helpFormatter0.setSyntaxPrefix((String) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, true);
      int int1 = (-1393);
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-1393), "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      StringWriter stringWriter0 = new StringWriter(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, false);
      Locale locale0 = Locale.ROOT;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) mockPrintWriter0;
      objectArray0[1] = (Object) stringWriter0;
      objectArray0[2] = (Object) locale0;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "\n", objectArray0);
      String string0 = "]";
      // Undeclared exception!
      helpFormatter0.printWrapped(printWriter0, 0, "]");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) null, 1097, "", "Cannot add value, list full.", options0, (-503), (-503), "A3GCZT}qq+\"^", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-2086));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = (-731);
      String string0 = "+";
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-731), "+", "!", options0, "!", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "GZ5<X", "org.apache.commons.cli.HelpFormatter", options0, "printWriter", false);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getDescPadding();
      MockFile mockFile0 = new MockFile((File) null, "--");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      helpFormatter0.getOptionComparator();
      // Undeclared exception!
      try { 
        helpFormatter_Builder0.setPrintWriter((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // printWriter
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("arg");
      helpFormatter_Builder0.get();
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "arg", 0, 0);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      helpFormatter_Builder1.get();
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter0.getSyntaxPrefix();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, (-484), " ", "arg", options0, 1, 0, "\n", true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      Options options0 = new Options();
      helpFormatter0.printHelp(">", "yLl`x|j)pg IR4gM@L", options0, "");
      helpFormatter0.findWrapPos("yLl`x|j)pg IR4gM@L", (-662), 0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.append((CharSequence) " ");
      stringWriter0.close();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultDescPad = 0;
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.setOptPrefix((String) null);
      helpFormatter0.setDescPadding((-2185));
      String string0 = "KWy1)FU";
      String string1 = "]d*,=`va)AE!_";
      Options options0 = new Options();
      options0.hasOption("--");
      options0.helpOptions();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("", "^'?c*;eoj#$p,1gwRg", false, "4@yL/~n=})upgr.9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getOptionComparator();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, 10);
      BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(bufferedOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedOutputStream1, false);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) helpFormatter_Builder0;
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) helpFormatter0;
      objectArray0[3] = (Object) byteArrayOutputStream0;
      objectArray0[4] = (Object) "x(";
      objectArray0[5] = (Object) "x(";
      objectArray0[6] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "x(", objectArray0);
      Options options0 = new Options();
      helpFormatter0.printOptions(printWriter0, 5, options0, 2052, 5);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      boolean boolean0 = true;
      byteArrayOutputStream0.write(74);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      mockPrintWriter0.println((Object) byteArrayOutputStream0);
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 0, "", options0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "";
      helpFormatter0.setOptPrefix("");
      String string1 = "d/[C_6$2XXZ40\\J";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("d/[C_6$2XXZ40J");
      int int0 = 0;
      Options options0 = new Options();
      options0.helpOptions();
      Option option0 = null;
      try {
        option0 = new Option(" ", "d/[C_6$2XXZ40J", true, "d/[C_6$2XXZ40J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name ' '.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultWidth = (-748);
      String string0 = "dzJY3(";
      Options options0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("dzJY3(", "(%&_%)AE&W90o,a", (Options) null, "(%&_%)AE&W90o,a", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.get();
      String string0 = "";
      MockFile mockFile0 = new MockFile("", "-");
      boolean boolean0 = true;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      mockPrintWriter0.close();
      mockPrintWriter1.checkError();
      int int0 = (-1224);
      Options options0 = new Options();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "org.apache.commons.cli.HelpFormatter$Builder";
      mockPrintWriter1.format("--", objectArray0);
      options0.getOption("org.apache.commons.cli.HelpFormatter$Builder");
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(mockPrintWriter1, (-1224), options0, (-1224), (-1224));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      helpFormatter0.printHelp(2885, "org.apache.commons.cli.HelpFormatter", "org.apache.commons.cli.HelpFormatter", options0, "org.apache.commons.cli.HelpFormatter", true);
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      HelpFormatter.builder();
      Comparator<Option> comparator0 = helpFormatter1.getOptionComparator();
      helpFormatter0.setSyntaxPrefix("\n");
      helpFormatter0.optionComparator = comparator0;
      helpFormatter0.optionComparator = comparator0;
      helpFormatter0.defaultNewLine = "";
      helpFormatter1.setLeftPadding(74);
      helpFormatter0.getLongOptSeparator();
      helpFormatter0.setLeftPadding((-2443));
      helpFormatter1.setLongOptSeparator("arg");
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "org.apache.commons.cli.HelpFormatter$Builder", "org.apache.commons.cli.HelpFormatter$Builder", options0, "");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      PrintWriter printWriter0 = null;
      String string0 = "S;EI8ostl\"kS6";
      helpFormatter0.defaultNewLine = "S;EI8ostl\"kS6";
      int int0 = 2236;
      Options options0 = new Options();
      options0.helpOptions();
      options0.toString();
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((PrintWriter) null, 2236, options0, 2236, 2236);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getOptPrefix();
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) null, (-1585), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter0.getWidth();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) null, 32, (String) null, options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter0.setNewLine(" ");
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter0.defaultWidth = 0;
      helpFormatter0.defaultArgName = "--";
      helpFormatter1.defaultOptPrefix = "";
      helpFormatter1.getNewLine();
      helpFormatter1.setLongOptSeparator("arg");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(3, (String) null, "usage: ", options0, "[");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-");
      int int0 = 2487;
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      Options options0 = new Options();
      mockPrintWriter0.println();
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 2487, "--", "usage: ", options0, 0, 0, "org.apache.commons.cli.Option$Builder");
      helpFormatter_Builder0.get();
      Object object0 = new Object();
      mockPrintWriter0.println(object0);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 1, "");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(3, (String) null, "\n", options0, (String) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      helpFormatter0.printHelp("sfQK#0JZ];[f,E", options0, true);
      options0.getMatchingOptions(" ");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((String) null, options0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getOptionComparator();
      int int0 = 264;
      String string0 = null;
      String string1 = ")_OB'";
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("", "[", true, "--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty option name.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      HelpFormatter.builder();
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getLeftPadding();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, true);
      Locale locale0 = Locale.FRENCH;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) byteArrayOutputStream0;
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      helpFormatter1.printHelp("F*k0Q..g", "", options0, "WI_c:2G:Ix1Uw");
      objectArray0[1] = (Object) mockPrintWriter0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) locale0;
      PrintWriter printWriter0 = mockPrintWriter0.format(locale0, "", objectArray0);
      helpFormatter0.printWrapped(printWriter0, 1672, 1, "arg");
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.setWidth((-312));
      helpFormatter0.getLeftPadding();
      String string0 = " ";
      MockFile mockFile0 = new MockFile("OEV;W}>XDgg");
      // Undeclared exception!
      try { 
        MockFile.createTempFile(" ", " ", (File) mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptPrefix(")yU{qC");
      helpFormatter0.setSyntaxPrefix("]F]");
      helpFormatter0.getOptPrefix();
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      String string0 = "z1r|2OLw#";
      MockFile mockFile0 = new MockFile("z1r|2OLw#");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.createPadding(32);
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter0.getLongOptSeparator();
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "                                ", " ", options0, (String) null);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "-";
      Options options0 = new Options();
      helpFormatter0.printHelp("-", options0);
      MockFile mockFile0 = new MockFile("cmdLineSyntax not provided");
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter(mockFile0, "TK,_Hx>2c");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // TK,_Hx>2c
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("lYQ7WW5r<f60-F@l", " | ", options0, "lYQ7WW5r<f60-F@l", true);
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      int int0 = 0;
      String string0 = "-";
      String string1 = "--";
      Options options0 = new Options();
      helpFormatter0.printHelp("--", options0, false);
      String string2 = "--";
      Options options1 = new Options();
      helpFormatter0.setLeftPadding(0);
      Option option0 = null;
      try {
        option0 = new Option("-", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '-'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter((Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }
}
