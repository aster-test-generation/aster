
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
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter.builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      String string0 = "O1";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("O1");
      int int0 = 0;
      // Undeclared exception!
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 0, "O1");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      boolean boolean0 = false;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      String string0 = "org.apache.commons.cli.HelpFormatter$OptionComparator";
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) helpFormatter_Builder0;
      objectArray0[1] = (Object) helpFormatter0;
      objectArray0[2] = (Object) helpFormatter_Builder0;
      objectArray0[3] = (Object) "org.apache.commons.cli.HelpFormatter$OptionComparator";
      mockPrintWriter0.println(3);
      objectArray0[4] = (Object) helpFormatter_Builder0;
      objectArray0[5] = (Object) byteArrayOutputStream0;
      objectArray0[6] = (Object) byteArrayOutputStream0;
      objectArray0[7] = (Object) "org.apache.commons.cli.HelpFormatter$OptionComparator";
      objectArray0[8] = (Object) "org.apache.commons.cli.HelpFormatter$OptionComparator";
      PrintWriter printWriter0 = mockPrintWriter0.printf("org.apache.commons.cli.HelpFormatter$OptionComparator", objectArray0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      int int0 = 2804;
      int int1 = 13;
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, 1009, (String) null, "[ ", options0, (-1896), (-1), "org.apache.commons.cli.HelpFormatter$OptionComparator", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      options0.getOptionGroups();
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((PrintWriter) null, 253, options0, 253, 253);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter0.getSyntaxPrefix();
      int int0 = helpFormatter0.defaultLeftPad;
      File file0 = MockFile.createTempFile("R6)El", "arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      String string0 = ">M9Z\"tZI";
      Options options0 = new Options();
      int int1 = (-1207);
      // Undeclared exception!
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 1, "usage: ", ">M9Z\"tZI", options0, 1, (-1207), "-[xR]iRg@mIA)%L", false);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.getArgName();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "";
      Options options0 = new Options();
      String string1 = "org.apache.commons.cli.HelpFormatter$Builder";
      options0.getMatchingOptions("org.apache.commons.cli.HelpFormatter$Builder");
      StringWriter stringWriter0 = new StringWriter(74);
      StringWriter stringWriter1 = stringWriter0.append('9');
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter1, true);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) stringWriter1;
      objectArray0[1] = (Object) mockPrintWriter0;
      PrintWriter printWriter0 = mockPrintWriter0.format("-", objectArray0);
      Options options1 = new Options();
      helpFormatter0.printUsage(printWriter0, 74, (String) null, options1);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "B,t(NZW\"dhQ-", options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      stringWriter0.write("");
      int int0 = 10;
      helpFormatter0.renderWrappedText(stringBuffer0, 10, 10, "z?!#*41k<l$#d4J");
      PrintWriter printWriter0 = null;
      String string0 = "VTX_p^N,1j\";";
      Options options0 = new Options();
      options0.getMatchingOptions("arg");
      String string1 = " since ";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) null, 39, "VTX_p^N,1j\";", "VTX_p^N,1j\";", options0, (-2011), 10, " since ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "T>&=QUt=:hpm;";
      helpFormatter0.setLongOptPrefix("T>&=QUt=:hpm;");
      String string1 = "Duplicate key: ";
      MockFile mockFile0 = new MockFile("%9oU,mo)7K;{L0=5pe1", "Duplicate key: ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      PrintWriter printWriter0 = mockPrintWriter0.append('7');
      String string2 = ",q";
      mockPrintWriter0.println(",q");
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage(printWriter0, (-434), "Duplicate key: ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter1, false);
      int int0 = 9;
      helpFormatter0.setLongOptPrefix((String) null);
      Options options0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 9, "", "", (Options) null, 1162, 1162, "I?o2#V):o-4");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      String string0 = "::W1'('j,z7 E";
      String string1 = "--";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("--");
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      helpFormatter0.setLongOptSeparator("::W1'('j,z7 E");
      helpFormatter0.getNewLine();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "\n");
      Options options0 = new Options();
      helpFormatter0.printHelp("!>us7h;?3NB9>Nqg", "--", options0, "--");
      int int0 = 0;
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, 0, (-1189), "\n");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      stringWriter0.write(3);
      stringWriter0.write("--");
      helpFormatter0.createPadding(1272);
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 0, (Options) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultOptPrefix = null;
      Options options0 = new Options();
      options0.hasShortOption("");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-450), "Sdwcf&q,J<$255r3C", "Sdwcf&q,J<$255r3C", options0, "The addValue method is not intended for client use. Subclasses should use the processValue method instead.", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setLeftPadding((-1));
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("Option '", options0);
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
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.getWidth();
      File file0 = MockFile.createTempFile("R6)El", "arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      String string0 = ">M9Z\"tZI";
      Options options0 = new Options();
      int int0 = (-1207);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 74, "usage: ", ">M9Z\"tZI", options0, 74, (-1207), "-[xR]iRg@mIA)%L", false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      helpFormatter1.defaultOptPrefix = "fbp}";
      helpFormatter_Builder0.get();
      mockPrintWriter0.println(1);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 2755, "NO_ARGS_ALLOWED");
      mockPrintWriter0.print(2755);
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter2 = helpFormatter_Builder0.get();
      String string0 = "";
      helpFormatter0.setNewLine("");
      Options options0 = new Options();
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuffer stringBuffer1 = helpFormatter0.renderOptions(stringBuffer0, 3, options0, 213, 1);
      helpFormatter1.renderWrappedText(stringBuffer1, 74, 1, "");
      options0.addOption((String) null, "b(P|iw6lW{8M)", false, "");
      // Undeclared exception!
      try { 
        helpFormatter2.printHelp("", options0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      MockPrintStream mockPrintStream0 = new MockPrintStream("usage: ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      Object[] objectArray0 = new Object[0];
      PrintWriter printWriter0 = mockPrintWriter0.format("--", objectArray0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      char[] charArray0 = new char[0];
      mockPrintWriter1.print(charArray0);
      PrintWriter printWriter1 = mockPrintWriter1.append('X');
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter1);
      helpFormatter0.optionComparator = comparator0;
      helpFormatter0.setNewLine((String) null);
      helpFormatter0.getOptPrefix();
      helpFormatter0.findWrapPos("]_Di$[gRtGAX_)Q", 0, 0);
      helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder1.setShowDeprecated(false);
      helpFormatter0.rtrim("");
      Object[] objectArray1 = new Object[7];
      objectArray1[0] = (Object) helpFormatter_Builder1;
      objectArray1[1] = (Object) "";
      objectArray1[2] = (Object) null;
      objectArray1[3] = (Object) printWriter1;
      objectArray1[4] = (Object) helpFormatter0.optionComparator;
      objectArray1[5] = (Object) mockPrintStream0;
      objectArray1[6] = (Object) mockPrintStream0;
      PrintWriter printWriter2 = mockPrintWriter1.printf("arg", objectArray1);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped(printWriter2, 0, 0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.get();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringWriter stringWriter0 = new StringWriter();
      stringWriter0.flush();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      char[] charArray0 = new char[2];
      charArray0[0] = '_';
      char char0 = 'q';
      charArray0[1] = 'q';
      stringBuffer0.append(charArray0);
      stringBuffer0.reverse();
      stringBuffer0.append("Cannot add value, list full.");
      stringBuffer0.appendCodePoint(32);
      String string0 = "org.apache.commons.cli.DeprecatedAttributes";
      // Undeclared exception!
      helpFormatter0.renderWrappedText(stringBuffer0, 0, 0, "org.apache.commons.cli.DeprecatedAttributes");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("--");
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 1267, 0, "--");
      helpFormatter0.setDescPadding(32);
      helpFormatter0.getLeftPadding();
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos((String) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText((StringBuffer) null, 1587, 39, "J9A");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setDescPadding(0);
      helpFormatter0.getNewLine();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("3WZ\"BP=PT:7q^M9I");
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) helpFormatter_Builder0;
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter_Builder0.get();
      objectArray0[1] = (Object) helpFormatter0;
      objectArray0[2] = (Object) helpFormatter0;
      objectArray0[3] = (Object) helpFormatter0;
      PrintWriter printWriter0 = mockPrintWriter0.printf("", objectArray0);
      int int0 = 0;
      helpFormatter0.printWrapped(printWriter0, 0, 0, "");
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        helpFormatter1.renderWrappedText(stringBuffer0, 1, (-6708), "org.apache.commons.cli.HelpFormatter$1");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLongOptSeparator();
      Options options0 = new Options();
      boolean boolean0 = true;
      // Undeclared exception!
      helpFormatter0.printHelp(0, " ", " ", options0, " ", true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("\n");
      helpFormatter1.printUsage((PrintWriter) mockPrintWriter0, 74, "J!xwPK8CZgt ]$7:qv");
      helpFormatter_Builder1.get();
      helpFormatter_Builder1.setShowDeprecated(true);
      helpFormatter0.setSyntaxPrefix("]");
      helpFormatter0.getNewLine();
      int int0 = 0;
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("usage: ", "-", false, "   ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'usage: ' contains an illegal character : ':'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setDescPadding(9);
      Options options0 = new Options();
      options0.getMatchingOptions(":;+jvw8E3Kyjq3(dK");
      helpFormatter0.defaultOptPrefix = "vOK5Z";
      helpFormatter0.printHelp("-", "-", options0, "-");
      helpFormatter0.setLeftPadding((-1069));
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.setNewLine("-");
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) null, 9, "<");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("l:\"c&,u.tn7J+hk", (Options) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      MockFile mockFile0 = new MockFile("Xj%hX$`?", "Xj%hX$`?");
      File file0 = MockFile.createTempFile("Xj%hX$`?", "", (File) mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "Xj%hX$`?");
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter_Builder1.setShowDeprecated(false);
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.setOptionComparator(comparator0);
      helpFormatter0.getOptionComparator();
      int int0 = (-1);
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertNotNull(helpFormatter0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printHelp("The addValue method is not intended for client use. Subclasses should use the processValue method instead.", "x_3kj: [v~5", options0, "x_3kj: [v~5", false);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      
      // Undeclared exception!
      helpFormatter0.printHelp(0, "x_3kj: [v~5", "B/3rl", options0, "x_3kj: [v~5");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      boolean boolean0 = true;
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertNotNull(helpFormatter0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter1);
      
      String string0 = "";
      Options options0 = new Options();
      assertNotNull(options0);
      
      List<?> list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
      
      List<String> list1 = options0.getMatchingOptions("arg");
      assertFalse(list1.contains(string0));
      assertTrue(list1.isEmpty());
      assertEquals(0, list1.size());
      assertNotNull(list1);
      
      boolean boolean1 = false;
      helpFormatter1.setLongOptPrefix("");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("", helpFormatter1.getLongOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      HelpFormatter helpFormatter2 = helpFormatter_Builder0.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter2, helpFormatter0);
      assertNotSame(helpFormatter2, helpFormatter1);
      assertFalse(helpFormatter2.equals((Object)helpFormatter0));
      assertFalse(helpFormatter2.equals((Object)helpFormatter1));
      assertEquals(3, helpFormatter2.getDescPadding());
      assertEquals("arg", helpFormatter2.getArgName());
      assertEquals(74, helpFormatter2.getWidth());
      assertEquals("\n", helpFormatter2.getNewLine());
      assertEquals("usage: ", helpFormatter2.getSyntaxPrefix());
      assertEquals("--", helpFormatter2.getLongOptPrefix());
      assertEquals(1, helpFormatter2.getLeftPadding());
      assertEquals("-", helpFormatter2.getOptPrefix());
      assertEquals(" ", helpFormatter2.getLongOptSeparator());
      assertEquals(3, helpFormatter2.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter2.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, helpFormatter2.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter2);
      
      String string1 = null;
      String string2 = "";
      Options options1 = new Options();
      assertFalse(options1.equals((Object)options0));
      assertNotNull(options1);
      
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter((OutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertNotNull(helpFormatter0);
      
      String string0 = helpFormatter0.getOptPrefix();
      assertEquals("-", string0);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      boolean boolean0 = false;
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      helpFormatter0.optionComparator = null;
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      
      String string0 = "^%)^uZyB{>";
      helpFormatter0.setArgName("^%)^uZyB{>");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("^%)^uZyB{>", helpFormatter0.getArgName());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      String string1 = helpFormatter0.getLongOptSeparator();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals(" ", string1);
      assertFalse(string1.equals((Object)string0));
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("^%)^uZyB{>", helpFormatter0.getArgName());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(string1);
      
      PrintWriter printWriter0 = null;
      // Undeclared exception!
      try { 
        helpFormatter_Builder1.setPrintWriter((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // printWriter
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertNotNull(helpFormatter0);
      
      int int0 = (-621);
      helpFormatter0.setLeftPadding((-621));
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals((-621), helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals((-621), helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter1);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("9-D.aL^jeia;ze", options0, true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter0);
      
      int int0 = helpFormatter0.findWrapPos("Y<:a*aPC,H$", 0, 0);
      assertEquals(0, int0);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(comparator0);
      
      String string0 = helpFormatter0.getSyntaxPrefix();
      assertEquals("usage: ", string0);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      String string0 = "org.apache.commons.cli.Option";
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printHelp("A3x", "org.apache.commons.cli.Option", options0, "<9:$C9o", false);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      helpFormatter0.setNewLine("A3x");
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("A3x", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      String string1 = "";
      Options options1 = new Options();
      assertFalse(options1.equals((Object)options0));
      assertNotNull(options1);
      
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      assertNotNull(comparator0);
      
      Collection<OptionGroup> collection0 = options1.getOptionGroups();
      assertNotSame(options1, options0);
      assertFalse(options1.equals((Object)options0));
      assertNotNull(collection0);
      
      helpFormatter0.setOptionComparator(comparator0);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("A3x", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      boolean boolean0 = options1.hasLongOption(" (@&'0hlH3iG9");
      assertNotSame(options1, options0);
      assertFalse(boolean0);
      assertFalse(options1.equals((Object)options0));
      
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", options1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter0);
      
      helpFormatter0.setDescPadding((-2356));
      assertEquals((-2356), helpFormatter0.getDescPadding());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals((-2356), helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      String string0 = null;
      String string1 = ">";
      StringBuffer stringBuffer0 = new StringBuffer("\"v6<f3lID7-$.@C^$vo");
      assertEquals("\"v6<f3lID7-$.@C^$vo", stringBuffer0.toString());
      assertEquals(19, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, (-2356), 44, "/.gq:#n9@7#yWvG+\"");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      MockFile mockFile0 = new MockFile("|CEVN4 GVYV0Ck", "|CEVN4 GVYV0Ck");
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      assertNotNull(mockPrintWriter0);
      
      boolean boolean0 = mockFile0.delete();
      assertTrue(boolean0);
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck", mockFile0.getParent());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck/|CEVN4 GVYV0Ck", mockFile0.toString());
      assertTrue(mockFile0.isAbsolute());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("|CEVN4 GVYV0Ck", mockFile0.getName());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      
      mockPrintWriter0.println(2163.0F);
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck", mockFile0.getParent());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck/|CEVN4 GVYV0Ck", mockFile0.toString());
      assertTrue(mockFile0.isAbsolute());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("|CEVN4 GVYV0Ck", mockFile0.getName());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck", mockFile0.getParent());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck/|CEVN4 GVYV0Ck", mockFile0.toString());
      assertTrue(mockFile0.isAbsolute());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("|CEVN4 GVYV0Ck", mockFile0.getName());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      helpFormatter0.setNewLine("org.apache.commons.cli.Option");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("org.apache.commons.cli.Option", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printHelp(3629, "|CEVN4 GVYV0Ck", "", options0, "", false);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("org.apache.commons.cli.Option", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 74, "MfPLMCn6$", options0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck", mockFile0.getParent());
      assertFalse(mockFile0.exists());
      assertFalse(mockFile0.isHidden());
      assertEquals(0L, mockFile0.lastModified());
      assertEquals(0L, mockFile0.length());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isDirectory());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/|CEVN4 GVYV0Ck/|CEVN4 GVYV0Ck", mockFile0.toString());
      assertTrue(mockFile0.isAbsolute());
      assertFalse(mockFile0.canWrite());
      assertFalse(mockFile0.canRead());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals("|CEVN4 GVYV0Ck", mockFile0.getName());
      assertFalse(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("org.apache.commons.cli.Option", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(helpFormatter0);
      
      String string0 = helpFormatter0.getNewLine();
      assertEquals("\n", string0);
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(string0);
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, false);
      assertNotNull(mockPrintWriter0);
      
      mockPrintWriter0.close();
      assertEquals("", stringWriter0.toString());
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printOptions(mockPrintWriter0, 2195, options0, 2195, 2195);
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("", stringWriter0.toString());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      
      int int0 = helpFormatter0.getDescPadding();
      assertEquals(3, int0);
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      
      String string1 = helpFormatter0.createPadding(3);
      assertEquals("   ", string1);
      assertFalse(string1.equals((Object)string0));
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(string1);
      
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 3443, 0, (String) null);
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
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream("--");
      assertNotNull(mockPrintStream0);
      
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertNotNull(mockPrintStream1);
      
      Locale locale0 = Locale.TAIWAN;
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) mockPrintStream0;
      objectArray0[1] = (Object) locale0;
      Object object0 = new Object();
      assertNotNull(object0);
      
      objectArray0[2] = object0;
      objectArray0[3] = (Object) mockPrintStream0;
      objectArray0[4] = (Object) mockPrintStream0;
      Object object1 = new Object();
      assertFalse(object1.equals((Object)object0));
      assertNotNull(object1);
      
      objectArray0[5] = object1;
      objectArray0[6] = (Object) locale0;
      PrintStream printStream0 = mockPrintStream1.printf(locale0, "rV8m|=aTp:", objectArray0);
      assertNotSame(mockPrintStream0, printStream0);
      assertNotSame(mockPrintStream0, mockPrintStream1);
      assertSame(mockPrintStream1, printStream0);
      assertNotSame(mockPrintStream1, mockPrintStream0);
      assertNotSame(printStream0, mockPrintStream0);
      assertSame(printStream0, mockPrintStream1);
      assertEquals(7, objectArray0.length);
      assertFalse(mockPrintStream0.equals((Object)mockPrintStream1));
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertFalse(printStream0.equals((Object)mockPrintStream0));
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(printStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0);
      assertEquals(7, objectArray0.length);
      assertFalse(mockPrintStream0.equals((Object)printStream0));
      assertFalse(mockPrintStream0.equals((Object)mockPrintStream1));
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertFalse(printStream0.equals((Object)mockPrintStream0));
      assertNotNull(mockPrintWriter0);
      
      PrintWriter printWriter0 = mockPrintWriter0.format(locale0, "K~<__&< `Yb'J", objectArray0);
      assertSame(printWriter0, mockPrintWriter0);
      assertNotSame(mockPrintStream0, printStream0);
      assertNotSame(mockPrintStream0, mockPrintStream1);
      assertSame(mockPrintStream1, printStream0);
      assertNotSame(mockPrintStream1, mockPrintStream0);
      assertNotSame(printStream0, mockPrintStream0);
      assertSame(printStream0, mockPrintStream1);
      assertSame(mockPrintWriter0, printWriter0);
      assertEquals(7, objectArray0.length);
      assertFalse(mockPrintStream0.equals((Object)printStream0));
      assertFalse(mockPrintStream0.equals((Object)mockPrintStream1));
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertFalse(printStream0.equals((Object)mockPrintStream0));
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(printWriter0);
      
      mockPrintWriter0.println(3);
      assertNotSame(mockPrintStream0, printStream0);
      assertNotSame(mockPrintStream0, mockPrintStream1);
      assertSame(mockPrintStream1, printStream0);
      assertNotSame(mockPrintStream1, mockPrintStream0);
      assertNotSame(printStream0, mockPrintStream0);
      assertSame(printStream0, mockPrintStream1);
      assertSame(mockPrintWriter0, printWriter0);
      assertEquals(7, objectArray0.length);
      assertFalse(mockPrintStream0.equals((Object)printStream0));
      assertFalse(mockPrintStream0.equals((Object)mockPrintStream1));
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertFalse(printStream0.equals((Object)mockPrintStream0));
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      
      helpFormatter0.printWrapped(printWriter0, 32, 2, "");
      assertSame(printWriter0, mockPrintWriter0);
      assertNotSame(mockPrintStream0, printStream0);
      assertNotSame(mockPrintStream0, mockPrintStream1);
      assertSame(mockPrintStream1, printStream0);
      assertNotSame(mockPrintStream1, mockPrintStream0);
      assertNotSame(printStream0, mockPrintStream0);
      assertSame(printStream0, mockPrintStream1);
      assertSame(mockPrintWriter0, printWriter0);
      assertEquals(7, objectArray0.length);
      assertFalse(mockPrintStream0.equals((Object)printStream0));
      assertFalse(mockPrintStream0.equals((Object)mockPrintStream1));
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertFalse(printStream0.equals((Object)mockPrintStream0));
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 32, "<");
      assertNotSame(mockPrintStream0, printStream0);
      assertNotSame(mockPrintStream0, mockPrintStream1);
      assertSame(mockPrintStream1, printStream0);
      assertNotSame(mockPrintStream1, mockPrintStream0);
      assertNotSame(printStream0, mockPrintStream0);
      assertSame(printStream0, mockPrintStream1);
      assertSame(mockPrintWriter0, printWriter0);
      assertEquals(7, objectArray0.length);
      assertFalse(mockPrintStream0.equals((Object)printStream0));
      assertFalse(mockPrintStream0.equals((Object)mockPrintStream1));
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertFalse(printStream0.equals((Object)mockPrintStream0));
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(comparator0);
      
      String string0 = helpFormatter0.getNewLine();
      assertEquals("\n", string0);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(string0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 2, "rV8m|=aTp:", options0);
      assertNotSame(mockPrintStream0, printStream0);
      assertNotSame(mockPrintStream0, mockPrintStream1);
      assertSame(mockPrintStream1, printStream0);
      assertNotSame(mockPrintStream1, mockPrintStream0);
      assertNotSame(printStream0, mockPrintStream0);
      assertSame(printStream0, mockPrintStream1);
      assertSame(mockPrintWriter0, printWriter0);
      assertEquals(7, objectArray0.length);
      assertFalse(mockPrintStream0.equals((Object)printStream0));
      assertFalse(mockPrintStream0.equals((Object)mockPrintStream1));
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
      assertFalse(printStream0.equals((Object)mockPrintStream0));
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      StringBuffer stringBuffer0 = new StringBuffer("");
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 32, options0, 32, (-2));
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
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printHelp("!M2`J*Xh|kAn\"fct|Ms", options0, false);
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      helpFormatter0.printHelp("!M2`J*Xh|kAn\"fct|Ms", "arg", options0, "!M2`J*Xh|kAn\"fct|Ms");
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(comparator0);
      
      helpFormatter0.printHelp("!M2`J*Xh|kAn\"fct|Ms", "!M2`J*Xh|kAn\"fct|Ms", options0, "EEE MMM dd HH:mm:ss zzz yyyy");
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
      assertNotNull(mockPrintWriter0);
      
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "--");
      assertSame(stringWriter0, stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      assertEquals("--", stringWriter0.toString());
      assertEquals("--", stringWriter1.toString());
      assertNotNull(stringWriter1);
      
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "arg");
      assertSame(stringWriter0, stringWriter1);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertEquals("--arg", stringWriter0.toString());
      assertNotNull(printWriter0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(stringWriter0, stringWriter1);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals("--arg", stringWriter0.toString());
      assertNotNull(helpFormatter_Builder1);
      
      helpFormatter0.defaultArgName = "EEE MMM dd HH:mm:ss zzz yyyy";
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getArgName());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      
      helpFormatter0.setWidth(1);
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      helpFormatter0.setLongOptSeparator("EEE MMM dd HH:mm:ss zzz yyyy");
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getWidth());
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      String string0 = helpFormatter0.getNewLine();
      assertEquals("\n", string0);
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getWidth());
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(string0);
      
      int int0 = helpFormatter0.getWidth();
      assertEquals(1, int0);
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getWidth());
      assertEquals("EEE MMM dd HH:mm:ss zzz yyyy", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      HelpFormatter.Builder helpFormatter_Builder2 = HelpFormatter.builder();
      assertNotSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertNotSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertFalse(helpFormatter_Builder2.equals((Object)helpFormatter_Builder0));
      assertFalse(helpFormatter_Builder2.equals((Object)helpFormatter_Builder1));
      assertNotNull(helpFormatter_Builder2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream("[ ");
      assertNotNull(mockPrintStream0);
      
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      assertNotNull(bufferedOutputStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedOutputStream0, false);
      assertNotNull(mockPrintWriter0);
      
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      assertNotNull(object0);
      
      objectArray0[0] = object0;
      objectArray0[1] = (Object) mockPrintStream0;
      PrintWriter printWriter0 = mockPrintWriter0.format("[ ", objectArray0);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertEquals(2, objectArray0.length);
      assertNotNull(printWriter0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals(2, objectArray0.length);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setShowDeprecated(false);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals(2, objectArray0.length);
      assertNotNull(helpFormatter_Builder2);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals(2, objectArray0.length);
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(helpFormatter0);
      
      helpFormatter0.setLongOptSeparator("");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals(2, objectArray0.length);
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      
      String string0 = helpFormatter0.rtrim("[ ");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals("[", string0);
      assertEquals(2, objectArray0.length);
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(string0);
      
      int int0 = helpFormatter0.getDescPadding();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals(3, int0);
      assertEquals(2, objectArray0.length);
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-2537), "", "", options0, "", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      int int0 = 0;
      String string0 = "org.apache.commons.cli.OptionGroup";
      String string1 = "";
      Options options0 = new Options();
      assertNotNull(options0);
      
      String string2 = "";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(74, "", "d0j8c\"p\u0000(", options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter0);
      
      int int0 = helpFormatter0.getLeftPadding();
      assertEquals(1, int0);
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos("", 1, (-632));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("TyPU<.;$Z?x5");
      assertNotNull(mockFileOutputStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      assertNotNull(mockPrintWriter0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertNotNull(helpFormatter_Builder2);
      
      HelpFormatter helpFormatter1 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter1);
      
      HelpFormatter helpFormatter2 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter2, helpFormatter0);
      assertNotSame(helpFormatter2, helpFormatter1);
      assertFalse(helpFormatter2.equals((Object)helpFormatter0));
      assertFalse(helpFormatter2.equals((Object)helpFormatter1));
      assertEquals(1, helpFormatter2.getLeftPadding());
      assertEquals("-", helpFormatter2.getOptPrefix());
      assertEquals(" ", helpFormatter2.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter2.getSyntaxPrefix());
      assertEquals(3, helpFormatter2.getDescPadding());
      assertEquals("arg", helpFormatter2.getArgName());
      assertEquals("\n", helpFormatter2.getNewLine());
      assertEquals(74, helpFormatter2.getWidth());
      assertEquals("--", helpFormatter2.getLongOptPrefix());
      assertEquals(74, helpFormatter2.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter2.defaultLeftPad);
      assertEquals(3, helpFormatter2.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter2);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter1.printHelp((PrintWriter) mockPrintWriter0, 61, "TyPU<.;$Z?x5", "", options0, 46, 61, "TyPU<.;$Z?x5");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      String string0 = helpFormatter1.getSyntaxPrefix();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertEquals("usage: ", string0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(string0);
      
      HelpFormatter.Builder helpFormatter_Builder3 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder3, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder3, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder3, helpFormatter_Builder2);
      assertNotNull(helpFormatter_Builder3);
      
      Comparator<Option> comparator0 = helpFormatter1.getOptionComparator();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(comparator0);
      
      helpFormatter1.setOptionComparator(comparator0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      String string1 = helpFormatter1.getLongOptPrefix();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertEquals("--", string1);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertFalse(string1.equals((Object)string0));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(string1);
      
      helpFormatter1.printHelp((PrintWriter) mockPrintWriter0, 46, "NO_ARGS_ALLOWED", "TyPU<.;$Z?x5", options0, 46, 0, " w<5+JzO Sh^<K[tB", true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      helpFormatter1.setNewLine("usage: ");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("usage: ", helpFormatter1.getNewLine());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      StringBuffer stringBuffer0 = new StringBuffer(74);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      StringBuffer stringBuffer1 = helpFormatter1.renderOptions(stringBuffer0, 74, options0, 74, 0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(stringBuffer0, stringBuffer1);
      assertSame(stringBuffer1, stringBuffer0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertEquals("", stringBuffer1.toString());
      assertEquals(0, stringBuffer1.length());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("usage: ", helpFormatter1.getNewLine());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(stringBuffer1);
      
      StringBuffer stringBuffer2 = helpFormatter0.renderOptions(stringBuffer1, 74, options0, 0, 0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(stringBuffer0, stringBuffer1);
      assertSame(stringBuffer0, stringBuffer2);
      assertSame(stringBuffer1, stringBuffer2);
      assertSame(stringBuffer1, stringBuffer0);
      assertSame(stringBuffer2, stringBuffer1);
      assertSame(stringBuffer2, stringBuffer0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter0, helpFormatter2);
      assertNotSame(helpFormatter0, helpFormatter1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter0.equals((Object)helpFormatter2));
      assertFalse(helpFormatter0.equals((Object)helpFormatter1));
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertEquals("", stringBuffer1.toString());
      assertEquals(0, stringBuffer1.length());
      assertEquals(0, stringBuffer2.length());
      assertEquals("", stringBuffer2.toString());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("usage: ", helpFormatter1.getNewLine());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(stringBuffer2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printHelp("51JrN*#T", "51JrN*#T", options0, "D9F65l");
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      MockFile mockFile0 = new MockFile("--", "--");
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      assertNotNull(mockPrintWriter0);
      
      // Undeclared exception!
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 0, "--", options0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(helpFormatter0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter1);
      
      helpFormatter1.setNewLine("Ph77_E%'kDv-");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("Ph77_E%'kDv-", helpFormatter1.getNewLine());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      helpFormatter1.defaultArgName = null;
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertNull(helpFormatter1.getArgName());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("Ph77_E%'kDv-", helpFormatter1.getNewLine());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals("-", helpFormatter1.getOptPrefix());
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder0.setShowDeprecated(true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertNotNull(helpFormatter_Builder2);
      
      helpFormatter1.printHelp("Ph77_E%'kDv-", options0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertNull(helpFormatter1.getArgName());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("Ph77_E%'kDv-", helpFormatter1.getNewLine());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      OptionGroup optionGroup0 = new OptionGroup();
      assertFalse(optionGroup0.isRequired());
      assertNull(optionGroup0.getSelected());
      assertNotNull(optionGroup0);
      
      Option option0 = options0.getOption((String) null);
      assertNull(option0);
      
      Options options1 = options0.addOptionGroup(optionGroup0);
      assertSame(options0, options1);
      assertSame(options1, options0);
      assertFalse(optionGroup0.isRequired());
      assertNull(optionGroup0.getSelected());
      assertNotNull(options1);
      
      helpFormatter1.printHelp("snGJo65:4wu%X:z|X", options0, true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertSame(options0, options1);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertNull(helpFormatter1.getArgName());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("Ph77_E%'kDv-", helpFormatter1.getNewLine());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      helpFormatter0.setLongOptSeparator("");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter0, helpFormatter1);
      assertFalse(helpFormatter0.equals((Object)helpFormatter1));
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("", helpFormatter0.getLongOptSeparator());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      
      helpFormatter0.setSyntaxPrefix("MT7@\"Kf'P_<");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter0, helpFormatter1);
      assertFalse(helpFormatter0.equals((Object)helpFormatter1));
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("MT7@\"Kf'P_<", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("", helpFormatter0.getLongOptSeparator());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      
      helpFormatter1.setLeftPadding(44);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertNull(helpFormatter1.getArgName());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals(44, helpFormatter1.getLeftPadding());
      assertEquals("Ph77_E%'kDv-", helpFormatter1.getNewLine());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(44, helpFormatter1.defaultLeftPad);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      int int0 = helpFormatter0.findWrapPos("usage: ", 2335, 965);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertNotSame(helpFormatter0, helpFormatter1);
      assertEquals((-1), int0);
      assertFalse(helpFormatter0.equals((Object)helpFormatter1));
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("MT7@\"Kf'P_<", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("", helpFormatter0.getLongOptSeparator());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter0.defaultLeftPad);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter0);
      
      MockFile mockFile0 = new MockFile("-");
      assertNotNull(mockFile0);
      
      MockFile mockFile1 = new MockFile(mockFile0, " | ");
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertNotNull(mockFile1);
      
      File file0 = MockFile.createTempFile("usage: ", "arg", (File) mockFile1);
      assertNotSame(mockFile0, file0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, file0);
      assertNotSame(mockFile1, mockFile0);
      assertNotSame(file0, mockFile0);
      assertNotSame(file0, mockFile1);
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertFalse(file0.equals((Object)mockFile0));
      assertFalse(file0.equals((Object)mockFile1));
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.isDirectory());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isFile());
      assertEquals("-", mockFile0.toString());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canRead());
      assertEquals("-", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertTrue(mockFile0.canExecute());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-/ | ", mockFile1.toString());
      assertEquals(0L, mockFile1.getUsableSpace());
      assertTrue(mockFile1.canWrite());
      assertFalse(mockFile1.isHidden());
      assertEquals(0L, mockFile1.length());
      assertTrue(mockFile1.isAbsolute());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-", mockFile1.getParent());
      assertEquals(0L, mockFile1.getFreeSpace());
      assertFalse(mockFile1.isFile());
      assertEquals(0L, mockFile1.getTotalSpace());
      assertTrue(mockFile1.canExecute());
      assertTrue(mockFile1.isDirectory());
      assertEquals(" | ", mockFile1.getName());
      assertTrue(mockFile1.exists());
      assertEquals(1392409281320L, mockFile1.lastModified());
      assertTrue(mockFile1.canRead());
      assertFalse(file0.isDirectory());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isHidden());
      assertTrue(file0.canWrite());
      assertEquals(0L, file0.getFreeSpace());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-/ | ", file0.getParent());
      assertTrue(file0.isAbsolute());
      assertTrue(file0.canExecute());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-/ | /usage: 0arg", file0.toString());
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals(0L, file0.getTotalSpace());
      assertEquals("usage: 0arg", file0.getName());
      assertTrue(file0.isFile());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertNotNull(file0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      assertFalse(mockFile0.equals((Object)file0));
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)file0));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertFalse(file0.equals((Object)mockFile0));
      assertFalse(file0.equals((Object)mockFile1));
      assertNotNull(mockPrintWriter0);
      
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 0, 0, "");
      assertNotSame(mockFile0, file0);
      assertNotSame(mockFile0, mockFile1);
      assertNotSame(mockFile1, file0);
      assertNotSame(mockFile1, mockFile0);
      assertNotSame(file0, mockFile0);
      assertNotSame(file0, mockFile1);
      assertFalse(mockFile0.equals((Object)file0));
      assertFalse(mockFile0.equals((Object)mockFile1));
      assertFalse(mockFile1.equals((Object)file0));
      assertFalse(mockFile1.equals((Object)mockFile0));
      assertFalse(file0.equals((Object)mockFile0));
      assertFalse(file0.equals((Object)mockFile1));
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertTrue(mockFile0.exists());
      assertEquals(0L, mockFile0.length());
      assertNull(mockFile0.getParent());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertTrue(mockFile0.isDirectory());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertFalse(mockFile0.isFile());
      assertEquals("-", mockFile0.toString());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertTrue(mockFile0.canRead());
      assertEquals("-", mockFile0.getName());
      assertFalse(mockFile0.isAbsolute());
      assertTrue(mockFile0.canExecute());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-/ | ", mockFile1.toString());
      assertEquals(0L, mockFile1.getUsableSpace());
      assertTrue(mockFile1.canWrite());
      assertFalse(mockFile1.isHidden());
      assertEquals(0L, mockFile1.length());
      assertTrue(mockFile1.isAbsolute());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-", mockFile1.getParent());
      assertEquals(0L, mockFile1.getFreeSpace());
      assertFalse(mockFile1.isFile());
      assertEquals(0L, mockFile1.getTotalSpace());
      assertTrue(mockFile1.canExecute());
      assertTrue(mockFile1.isDirectory());
      assertEquals(" | ", mockFile1.getName());
      assertTrue(mockFile1.exists());
      assertEquals(1392409281320L, mockFile1.lastModified());
      assertTrue(mockFile1.canRead());
      assertFalse(file0.isDirectory());
      assertEquals(0L, file0.length());
      assertEquals(0L, file0.getUsableSpace());
      assertFalse(file0.isHidden());
      assertTrue(file0.canWrite());
      assertEquals(0L, file0.getFreeSpace());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-/ | ", file0.getParent());
      assertTrue(file0.isAbsolute());
      assertTrue(file0.canExecute());
      assertEquals("/Users/mkim754/IdeaProjects/aster-benchmark/commons-cli-1.7.0/-/ | /usage: 0arg", file0.toString());
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals(0L, file0.getTotalSpace());
      assertEquals("usage: 0arg", file0.getName());
      assertTrue(file0.isFile());
      assertTrue(file0.canRead());
      assertTrue(file0.exists());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      helpFormatter0.setLongOptSeparator("oRdW=Pmduo9n");
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("oRdW=Pmduo9n", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(helpFormatter0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "org.apache.commons.cli.Options", options0, "org.apache.commons.cli.Options", false);
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
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(helpFormatter0);
      
      String string0 = helpFormatter0.createPadding(708);
      assertEquals("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", string0);
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertNotNull(string0);
      
      helpFormatter0.setLeftPadding((-606));
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals((-606), helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals((-606), helpFormatter0.defaultLeftPad);
      
      helpFormatter0.setWidth(708);
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals((-606), helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(708, helpFormatter0.getWidth());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(708, helpFormatter0.defaultWidth);
      assertEquals((-606), helpFormatter0.defaultLeftPad);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("usage: ");
      assertNotNull(mockFileOutputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      assertNotNull(mockPrintStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, false);
      assertNotNull(mockPrintWriter0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setShowDeprecated(false);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertNotNull(helpFormatter_Builder2);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      StringBuffer stringBuffer0 = helpFormatter0.renderOptions((StringBuffer) null, 0, options0, 0, 0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "arg");
      assertEquals("arg", stringBuffer0.toString());
      assertEquals(3, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      stringBuffer0.trimToSize();
      assertEquals("arg", stringBuffer0.toString());
      assertEquals(3, stringBuffer0.length());
      
      int int0 = 9;
      Options options0 = new Options();
      assertNotNull(options0);
      
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      StringBuffer stringBuffer1 = stringBuffer0.appendCodePoint(0);
      assertSame(stringBuffer0, stringBuffer1);
      assertSame(stringBuffer1, stringBuffer0);
      assertEquals("arg\u0000", stringBuffer0.toString());
      assertEquals(4, stringBuffer0.length());
      assertEquals("arg\u0000", stringBuffer1.toString());
      assertEquals(4, stringBuffer1.length());
      assertNotNull(stringBuffer1);
      
      int int1 = 61;
      StringBuffer stringBuffer2 = helpFormatter0.renderOptions(stringBuffer0, 9, options0, 1594, 61);
      assertSame(stringBuffer0, stringBuffer1);
      assertSame(stringBuffer0, stringBuffer2);
      assertSame(stringBuffer2, stringBuffer0);
      assertSame(stringBuffer2, stringBuffer1);
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("arg\u0000", stringBuffer0.toString());
      assertEquals(4, stringBuffer0.length());
      assertEquals("arg\u0000", stringBuffer2.toString());
      assertEquals(4, stringBuffer2.length());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(stringBuffer2);
      
      helpFormatter0.setSyntaxPrefix("E1e\u0003,{Uh$K jZoB");
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("E1e\u0003,{Uh$K jZoB", helpFormatter0.getSyntaxPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter((File) null, "7}v7k_Tz'Y_\"_,+/{&9");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // 7}v7k_Tz'Y_\"_,+/{&9
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("!b");
      assertNotNull(mockPrintWriter0);
      
      Locale locale0 = new Locale("!b", "!b");
      assertEquals("!b_!B", locale0.toString());
      assertEquals("!B", locale0.getCountry());
      assertEquals("!b", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      String string0 = "--";
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      assertNotNull(object0);
      
      objectArray0[0] = object0;
      mockPrintWriter0.println((-594.2856));
      Object object1 = new Object();
      assertFalse(object1.equals((Object)object0));
      assertNotNull(object1);
      
      objectArray0[1] = object1;
      Object object2 = new Object();
      assertFalse(object2.equals((Object)object0));
      assertFalse(object2.equals((Object)object1));
      assertNotNull(object2);
      
      objectArray0[2] = object2;
      objectArray0[3] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "--", objectArray0);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertEquals(4, objectArray0.length);
      assertEquals("!b_!B", locale0.toString());
      assertEquals("!B", locale0.getCountry());
      assertEquals("!b", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(printWriter0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(printWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals(4, objectArray0.length);
      assertEquals("!b_!B", locale0.toString());
      assertEquals("!B", locale0.getCountry());
      assertEquals("!b", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(mockPrintWriter0, printWriter0);
      assertSame(printWriter0, mockPrintWriter0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals(4, objectArray0.length);
      assertEquals("!b_!B", locale0.toString());
      assertEquals("!B", locale0.getCountry());
      assertEquals("!b", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertNotNull(helpFormatter0);
      
      int int0 = (-3471);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-3471), 1079, "--");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertNotNull(helpFormatter0);
      
      String string0 = helpFormatter0.createPadding(3);
      assertEquals("   ", string0);
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertNotNull(string0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      Options options1 = options0.addOption("arg", false, "   ");
      assertSame(options0, options1);
      assertSame(options1, options0);
      assertNotNull(options1);
      
      helpFormatter0.printHelp("QWh[V}<VicQ2P", options0, false);
      assertSame(options0, options1);
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      
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
  public void test51()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      File file0 = null;
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter0);
      
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(comparator0);
      
      String string0 = helpFormatter0.createPadding(0);
      assertEquals("", string0);
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(string0);
      
      helpFormatter0.setOptionComparator(comparator0);
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      helpFormatter0.setNewLine("");
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("", helpFormatter0.getNewLine());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions((PrintWriter) null, (-3813), options0, (-1), (-751));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertNotNull(helpFormatter0);
      
      MockFile mockFile0 = new MockFile("", ";b3'[2utuN&j");
      assertNotNull(mockFile0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      assertNotNull(mockPrintStream0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      assertNotNull(mockPrintWriter0);
      
      Options options0 = new Options();
      assertNotNull(options0);
      
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 2880, ";b3'[2utuN&j", ";b3'[2utuN&j", options0, 2880, 2880, "");
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals(3, helpFormatter0.getDescPadding());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      assertEquals(3, helpFormatter0.defaultDescPad);
      
      helpFormatter0.setDescPadding(69);
      assertEquals(69, helpFormatter0.getDescPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(69, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      assertNotNull(helpFormatter_Builder0);
      
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertNotNull(helpFormatter_Builder1);
      
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setShowDeprecated(true);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertNotNull(helpFormatter_Builder2);
      
      HelpFormatter helpFormatter1 = helpFormatter_Builder2.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertNotNull(helpFormatter1);
      
      helpFormatter0.setOptPrefix("usage: ");
      assertNotSame(helpFormatter0, helpFormatter1);
      assertFalse(helpFormatter0.equals((Object)helpFormatter1));
      assertEquals(69, helpFormatter0.getDescPadding());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(74, helpFormatter0.getWidth());
      assertEquals("usage: ", helpFormatter0.getOptPrefix());
      assertEquals("usage: ", helpFormatter0.getSyntaxPrefix());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(1, helpFormatter0.getLeftPadding());
      assertEquals("arg", helpFormatter0.getArgName());
      assertEquals("\n", helpFormatter0.getNewLine());
      assertEquals(69, helpFormatter0.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(74, helpFormatter0.defaultWidth);
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, helpFormatter0.defaultLeftPad);
      
      HelpFormatter helpFormatter2 = helpFormatter_Builder1.get();
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertNotSame(helpFormatter2, helpFormatter0);
      assertNotSame(helpFormatter2, helpFormatter1);
      assertFalse(helpFormatter2.equals((Object)helpFormatter0));
      assertFalse(helpFormatter2.equals((Object)helpFormatter1));
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertEquals("--", helpFormatter2.getLongOptPrefix());
      assertEquals("arg", helpFormatter2.getArgName());
      assertEquals(74, helpFormatter2.getWidth());
      assertEquals(1, helpFormatter2.getLeftPadding());
      assertEquals("-", helpFormatter2.getOptPrefix());
      assertEquals("\n", helpFormatter2.getNewLine());
      assertEquals(" ", helpFormatter2.getLongOptSeparator());
      assertEquals("usage: ", helpFormatter2.getSyntaxPrefix());
      assertEquals(3, helpFormatter2.getDescPadding());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      assertEquals(3, helpFormatter2.defaultDescPad);
      assertEquals(1, helpFormatter2.defaultLeftPad);
      assertEquals(74, helpFormatter2.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertNotNull(helpFormatter2);
      
      HelpFormatter.Builder helpFormatter_Builder3 = helpFormatter_Builder2.setShowDeprecated(false);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder3, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder3, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder3, helpFormatter_Builder2);
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertNotNull(helpFormatter_Builder3);
      
      int int0 = helpFormatter1.findWrapPos("*q^)dv(OtwK)_A=", (-2594), 1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertEquals((-2593), int0);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      helpFormatter1.setArgName("arg");
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(3, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(3, helpFormatter1.defaultDescPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
      
      helpFormatter1.setDescPadding(74);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder0, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder0);
      assertSame(helpFormatter_Builder1, helpFormatter_Builder2);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder1);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder3);
      assertSame(helpFormatter_Builder2, helpFormatter_Builder0);
      assertNotSame(helpFormatter1, helpFormatter0);
      assertNotSame(helpFormatter1, helpFormatter2);
      assertFalse(helpFormatter1.equals((Object)helpFormatter0));
      assertFalse(helpFormatter1.equals((Object)helpFormatter2));
      assertEquals(0L, mockFile0.getFreeSpace());
      assertFalse(mockFile0.isDirectory());
      assertTrue(mockFile0.exists());
      assertEquals("/;b3'[2utuN&j", mockFile0.toString());
      assertEquals(0L, mockFile0.length());
      assertTrue(mockFile0.isAbsolute());
      assertEquals(0L, mockFile0.getUsableSpace());
      assertFalse(mockFile0.isHidden());
      assertTrue(mockFile0.canWrite());
      assertTrue(mockFile0.canRead());
      assertTrue(mockFile0.canExecute());
      assertTrue(mockFile0.isFile());
      assertEquals(";b3'[2utuN&j", mockFile0.getName());
      assertEquals(0L, mockFile0.getTotalSpace());
      assertEquals(1392409281320L, mockFile0.lastModified());
      assertEquals("/", mockFile0.getParent());
      assertEquals("-", helpFormatter1.getOptPrefix());
      assertEquals(74, helpFormatter1.getDescPadding());
      assertEquals(" ", helpFormatter1.getLongOptSeparator());
      assertEquals("\n", helpFormatter1.getNewLine());
      assertEquals("usage: ", helpFormatter1.getSyntaxPrefix());
      assertEquals(74, helpFormatter1.getWidth());
      assertEquals(1, helpFormatter1.getLeftPadding());
      assertEquals("arg", helpFormatter1.getArgName());
      assertEquals("--", helpFormatter1.getLongOptPrefix());
      assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
      assertEquals(74, helpFormatter1.defaultWidth);
      assertEquals(74, helpFormatter1.defaultDescPad);
      assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
      assertEquals(1, helpFormatter1.defaultLeftPad);
      assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "usage: ");
      StringBuffer stringBuffer1 = helpFormatter0.renderWrappedText(stringBuffer0, 0, 2466, "");
      assertEquals("-", helpFormatter0.getOptPrefix());
      assertEquals("--", helpFormatter0.getLongOptPrefix());
      assertEquals(7, stringBuffer1.length());
      assertEquals(" ", helpFormatter0.getLongOptSeparator());
      assertEquals(3, helpFormatter0.defaultDescPad);
      assertEquals(74, helpFormatter0.defaultWidth);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setSyntaxPrefix("!Cc");
      Options options0 = new Options();
      options0.getOptionGroups();
      helpFormatter0.printHelp(61, "!Cc", "!Cc", options0, "!Cc");
      Options options1 = new Options();
      options1.getMatchingOptions("arg");
      options1.hasOption("-");
      helpFormatter0.printHelp("J,(LMRDEE#|b;", options1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(" ");
      Object[] objectArray0 = new Object[1];
      mockPrintWriter0.checkError();
      mockPrintWriter0.print("");
      mockPrintWriter0.println(false);
      objectArray0[0] = (Object) "!Cc";
      mockPrintWriter0.print((double) 74);
      PrintWriter printWriter0 = mockPrintWriter0.format("-", objectArray0);
      Options options2 = new Options();
      options2.getOption("!Cc");
      options2.hasLongOption(", ");
      helpFormatter0.printHelp(printWriter0, 3, "!Cc", "!Cc", options2, 0, 0, "J,(LMRDEE#|b;");
      helpFormatter0.getLeftPadding();
      helpFormatter0.getWidth();
      helpFormatter0.getOptionComparator();
      helpFormatter0.setDescPadding(2256);
      helpFormatter0.getLongOptPrefix();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((String) null, (String) null, options2, "!Cc", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "";
      String string1 = "]";
      Options options0 = new Options();
      options0.getOption(" ");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(1425, "", "]", options0, "Bf'`R728EJcaL,i84", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
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
  public void test58()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Comparator<Option> comparator0 = helpFormatter0.optionComparator;
      helpFormatter0.optionComparator = comparator0;
      helpFormatter0.setLeftPadding(4727);
      Options options0 = new Options();
      options0.getMatchingOptions("usage: ");
      helpFormatter0.printHelp(4727, "=v-..Zl:", "cx=0{]EH+'", options0, "=v-..Zl:", false);
      helpFormatter0.setLongOptSeparator("");
      helpFormatter0.setLongOptSeparator("=v-..Zl:");
      helpFormatter0.setSyntaxPrefix("cx=0{]EH+'");
      helpFormatter0.printHelp("--", options0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream("cx=0{]EH+'");
      Locale locale0 = Locale.JAPAN;
      PrintStream printStream0 = mockPrintStream0.format(locale0, "--", (Object[]) null);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0);
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 4727, "cx=0{]EH+'", options0);
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.printHelp("p=!o", options0);
      assertEquals("cx=0{]EH+'", helpFormatter0.getSyntaxPrefix());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "org.apache.commons.cli.Option";
      Options options0 = new Options();
      helpFormatter0.printHelp("org.apache.commons.cli.Option", options0);
      options0.toString();
      options0.toString();
      helpFormatter0.setArgName("org.apache.commons.cli.Option");
      helpFormatter0.setLeftPadding((-1));
      helpFormatter0.getWidth();
      String string1 = "%J+iv7,8PX\"";
      String string2 = null;
      boolean boolean0 = true;
      String string3 = "";
      String string4 = "";
      helpFormatter0.defaultLeftPad = (-2);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "org.apache.commons.cli.Option", options0, "", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }
}
