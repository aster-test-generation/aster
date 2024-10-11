
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HelpFormatter_ESTest extends HelpFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      Options options1 = new Options();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      options0.addOptions(options1);
      options0.getOptions();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "AC2%wM", "AC2%wM", options0, "AC2%wM");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.defaultLeftPad = 0;
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "arg");
      Options options0 = new Options();
      helpFormatter0.renderOptions(stringBuffer0, 194, options0, 194, 0);
      helpFormatter0.setLeftPadding(0);
      helpFormatter0.getWidth();
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) "arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter1);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.lookup(linkedList0, linkedList1);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) stringBuffer0;
      PrintWriter printWriter0 = mockPrintWriter0.format((Locale) null, "usage: ", objectArray0);
      linkedList1.add((Locale) null);
      // Undeclared exception!
      helpFormatter0.printWrapped(printWriter0, 0, 0, "Either opt or longOpt must be specified");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(13, "O&uJ#u@MEGwX_", "O&uJ#u@MEGwX_", (Options) null, "T:Ie)Rw)p(=\"E'$");
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
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.getArgName();
      int int0 = (-3199);
      helpFormatter0.setLeftPadding((-3199));
      Options options0 = new Options();
      options0.hasShortOption("-");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("arg", options0, true);
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
      boolean boolean0 = true;
      helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Options options0 = new Options();
      helpFormatter0.printHelp("T,Gkc[a^(F", options0);
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter0.getLongOptSeparator();
      helpFormatter0.getSyntaxPrefix();
      Options options1 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(" :: ", " :: ", (Options) null, " ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.rtrim("A$\"!UWq6{cou.&d");
      PrintWriter printWriter0 = null;
      int int0 = 0;
      String string0 = "";
      Options options0 = new Options();
      options0.getMatchingOptions("4E%");
      helpFormatter0.setDescPadding(0);
      options0.addOption("Q", (String) null);
      helpFormatter0.printHelp("~=Pcr D|x*Hv.U/6k", "", options0, "A$\"!UWq6{cou.&d", true);
      options0.helpOptions();
      helpFormatter0.setNewLine("A$\"!UWq6{cou.&d");
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) null, 0, "", "A$\"!UWq6{cou.&d", options0, 0, 0, "", true);
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
      int int0 = (-2506);
      String string0 = "sKc<AHh{";
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-2), "YUmY", "K?E\"\"m", options0, ".E^\"t.Zs#82?jw", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter_Builder1.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      int int0 = (-2295);
      helpFormatter_Builder0.get();
      helpFormatter0.setLeftPadding((-2295));
      helpFormatter0.getOptionComparator();
      helpFormatter0.getLeftPadding();
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("cmdLineSyntax not provided", "arg");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // arg
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter1 = helpFormatter_Builder2.get();
      Comparator<Option> comparator0 = helpFormatter1.optionComparator;
      HelpFormatter helpFormatter2 = helpFormatter_Builder0.get();
      mockPrintWriter0.print('N');
      helpFormatter0.optionComparator = comparator0;
      HelpFormatter helpFormatter3 = new HelpFormatter();
      Comparator<Option> comparator1 = helpFormatter3.optionComparator;
      helpFormatter0.setOptionComparator(comparator1);
      StringBuffer stringBuffer0 = new StringBuffer();
      helpFormatter0.renderWrappedText(stringBuffer0, 1, 3, "-");
      helpFormatter0.setNewLine("");
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter2.printHelp((PrintWriter) mockPrintWriter0, 74, (String) null, "--", options0, 9, (-2444), "XUv<=>JRV|x", true);
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
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.commons.cli.OptionGroup");
      Object[] objectArray0 = new Object[0];
      PrintWriter printWriter0 = mockPrintWriter0.printf("--", objectArray0);
      int int0 = (-4419);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped(printWriter0, (-4419), "org.apache.commons.cli.OptionGroup");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile("--");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0);
      MockPrintWriter mockPrintWriter2 = new MockPrintWriter(mockPrintWriter1, false);
      PrintWriter printWriter0 = mockPrintWriter2.format(" ", (Object[]) null);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped(printWriter0, 0, (-3639), ", ");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "wdQU%FD:H5L)_FC";
      String string1 = "";
      Options options0 = new Options();
      int int0 = 572;
      // Undeclared exception!
      helpFormatter0.printHelp((PrintWriter) null, 0, "wdQU%FD:H5L)_FC", "", options0, 74, 572, "wdQU%FD:H5L)_FC");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter_Builder1.setShowDeprecated(true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("0Ua");
      PrintStream printStream0 = mockPrintStream0.format("arg", (Object[]) null);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 2704, "");
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.getWidth();
      helpFormatter0.rtrim("0Ua");
      helpFormatter0.getLeftPadding();
      Options options0 = new Options();
      helpFormatter0.printHelp("0Ua", "", options0, "", false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setSyntaxPrefix("");
      MockFile mockFile0 = new MockFile("\n", "MtAMmy(");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0);
      helpFormatter_Builder0.setPrintWriter(mockPrintWriter1);
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0);
      List<Locale> list2 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list1);
      Locale.lookup(linkedList0, list2);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) list0;
      objectArray0[1] = (Object) mockPrintWriter1;
      mockPrintWriter1.printf((Locale) null, "arg", objectArray0);
      helpFormatter0.setOptPrefix("-");
      helpFormatter_Builder0.get();
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.setArgName("-b`[>\"c6_ I<Gi");
      helpFormatter0.setOptPrefix("");
      helpFormatter1.getLongOptPrefix();
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter1, 0, "8eQE>R5^l6.!_I8h", options0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("3pLc;5`U");
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) helpFormatter_Builder1;
      objectArray0[1] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.printf("3pLc;5`U", objectArray0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(printWriter0);
      helpFormatter_Builder2.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      helpFormatter_Builder2.setShowDeprecated(true);
      // Undeclared exception!
      try { 
        helpFormatter0.createPadding((-143));
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
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = helpFormatter0.createPadding(4435);
      helpFormatter0.getArgName();
      helpFormatter0.setSyntaxPrefix(string0);
      Options options0 = new Options();
      options0.helpOptions();
      options0.getRequiredOptions();
      helpFormatter0.printHelp(4435, "arg", "arg", options0, "c+0", true);
      options0.toString();
      helpFormatter0.printHelp("c+0", options0, true);
      helpFormatter0.rtrim((String) null);
      helpFormatter0.setOptionComparator((Comparator<Option>) null);
      helpFormatter0.setSyntaxPrefix("arg");
      helpFormatter0.getLeftPadding();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getNewLine();
      Options options0 = new Options();
      helpFormatter0.printHelp(5614, "\n", "\n", options0, "wfw)0ss.iG/1vu1|ah", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Z1:}T%'E)s8'SBOz'~|");
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "wfw)0ss.iG/1vu1|ah";
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) options0;
      objectArray0[3] = (Object) helpFormatter0;
      objectArray0[4] = (Object) "wfw)0ss.iG/1vu1|ah";
      objectArray0[5] = (Object) helpFormatter0;
      objectArray0[6] = (Object) null;
      objectArray0[7] = (Object) mockPrintWriter0;
      objectArray0[8] = (Object) "wfw)0ss.iG/1vu1|ah";
      PrintWriter printWriter0 = mockPrintWriter0.format((Locale) null, "wfw)0ss.iG/1vu1|ah", objectArray0);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(printWriter0, 5614, (String) null, "KH]kMKB7$#}l_{2nt/", options0, 5614, 5614, "--", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setNewLine("");
      helpFormatter0.getNewLine();
      String string0 = "]G1@";
      File file0 = MockFile.createTempFile("]G1@", "usage: ");
      int int0 = 0;
      helpFormatter0.setWidth(0);
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter(file0, "]G1@");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // ]G1@
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter0.getArgName();
      String string0 = "4av";
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("4av");
      int int0 = 0;
      helpFormatter0.setLeftPadding(0);
      helpFormatter0.setArgName("OII}'o+yG}");
      int int1 = (-952);
      String string1 = "nPw%zF\"`(";
      mockPrintWriter0.print(1L);
      Options options0 = null;
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-952), "4av", "nPw%zF\"`(", (Options) null, (-952), 1268, "4av");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      Comparator<Option> comparator0 = helpFormatter0.getOptionComparator();
      helpFormatter0.optionComparator = comparator0;
      helpFormatter0.getNewLine();
      helpFormatter0.setSyntaxPrefix("\n");
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.getSyntaxPrefix();
      helpFormatter0.rtrim(": ");
      MockFile mockFile0 = new MockFile((String) null, "\n");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      Options options0 = new Options();
      options0.addOption("arg", false, "-");
      options0.helpOptions();
      options0.getOptionGroups();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 1, "", ":", options0, (-904), 0, "-9W~:DKWQL:^l]xo");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter_Builder0.get();
      helpFormatter0.setLongOptPrefix("org.apache.commons.cli.Option");
      helpFormatter0.optionComparator = null;
      Options options0 = new Options();
      Options options1 = new Options();
      options0.addOptions(options1);
      helpFormatter0.printHelp("org.apache.commons.cli.Option", "org.apache.commons.cli.Option", options0, "org.apache.commons.cli.Option");
      helpFormatter0.getLeftPadding();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "";
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("", "", options0, "Z/kIbi`", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(4065);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append('+');
      helpFormatter_Builder0.setPrintWriter(printWriter0);
      helpFormatter_Builder0.get();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = null;
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((String) null, options0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultDescPad = (-101);
      helpFormatter0.defaultWidth = (-101);
      MockFile mockFile0 = new MockFile("arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      mockFile0.deleteOnExit();
      Options options0 = new Options();
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 1075, "Pj9rbxy?;ypwV[H", options0);
      helpFormatter0.getLeftPadding();
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.defaultWidth = 1536;
      helpFormatter0.getDescPadding();
      helpFormatter0.findWrapPos("<", (-3434), (-1));
      helpFormatter0.setWidth(736);
      helpFormatter0.setLeftPadding((-829));
      helpFormatter0.rtrim("");
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter_Builder1.get();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-3767), "5<D^OGU^,", " | ", options0, (String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      helpFormatter0.rtrim("1");
      helpFormatter0.getOptPrefix();
      helpFormatter0.getOptionComparator();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("--");
      Locale locale0 = Locale.US;
      Object[] objectArray0 = new Object[9];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) locale0;
      Object object1 = new Object();
      objectArray0[3] = object1;
      objectArray0[4] = (Object) "1";
      objectArray0[5] = (Object) helpFormatter_Builder1;
      objectArray0[6] = (Object) ";['[S?<";
      objectArray0[7] = (Object) helpFormatter_Builder0;
      objectArray0[8] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, ";['[S?<", objectArray0);
      Options options0 = new Options();
      helpFormatter0.printUsage(printWriter0, 898, "iSC`/9Gw5[MI)tqH@H", options0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, true);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "";
      objectArray0[1] = (Object) mockPrintWriter0;
      objectArray0[2] = (Object) pipedOutputStream0;
      objectArray0[3] = (Object) helpFormatter_Builder2;
      Object object0 = new Object();
      objectArray0[4] = object0;
      objectArray0[5] = (Object) helpFormatter_Builder0;
      objectArray0[6] = (Object) mockPrintWriter0;
      objectArray0[7] = (Object) helpFormatter_Builder0;
      objectArray0[8] = (Object) helpFormatter_Builder0;
      PrintWriter printWriter0 = mockPrintWriter0.printf("", objectArray0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printOptions(printWriter0, (-1175), options0, (-1175), 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      helpFormatter_Builder0.setShowDeprecated(true);
      helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultWidth = (-1068);
      helpFormatter0.getLongOptPrefix();
      helpFormatter0.setSyntaxPrefix("--");
      HelpFormatter.builder();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      MockPrintStream mockPrintStream0 = new MockPrintStream("P");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-1749), "P", "P", options0, (-2807), (-1749), "P", false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.findWrapPos("org.apache.commons.cli.HelpFormatter$OptionComparator", (-3630), (-3630));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      options0.getRequiredOptions();
      options0.getRequiredOptions();
      options0.helpOptions();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((String) null, "EEE MMM dd HH:mm:ss zzz yyyy", options0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultWidth = 2;
      helpFormatter0.setSyntaxPrefix("3P");
      helpFormatter0.setWidth((-1419));
      helpFormatter0.setLongOptPrefix("   ");
      helpFormatter0.setLongOptPrefix("3P");
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
  public void test32()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("zn)*rx9", options0, false);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp("`>1]}q!kYNgCDj", (Options) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setNewLine("SfwBVc\"L");
      helpFormatter0.setLeftPadding(0);
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) null, (-1804), "", ">", options0, 947, (-1804), "", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cmdLineSyntax not provided
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.setDescPadding(0);
      int int0 = (-1);
      // Undeclared exception!
      try { 
        helpFormatter0.findWrapPos((String) null, (-1), (-1144));
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
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-");
      Options options0 = new Options();
      helpFormatter0.printHelp("lRsJa&VA1#{O^+Z8", ")pj>&o,<9hLAq?P6", options0, "", true);
      mockPrintWriter0.checkError();
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 74, ")pj>&o,<9hLAq?P6", ")pj>&o,<9hLAq?P6", options0, (-891), 74, ")pj>&o,<9hLAq?P6");
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
      HelpFormatter helpFormatter0 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer();
      int int0 = 249;
      StringBuffer stringBuffer1 = helpFormatter0.renderWrappedText(stringBuffer0, 249, 249, "(s");
      int int1 = 32;
      // Undeclared exception!
      try { 
        stringBuffer1.insert(3, '6');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      StringBuffer stringBuffer0 = new StringBuffer(0);
      int int1 = 1;
      // Undeclared exception!
      try { 
        helpFormatter0.renderWrappedText(stringBuffer0, 1, 0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 1212;
      Options options0 = new Options();
      boolean boolean0 = false;
      helpFormatter0.printHelp(1212, "kV", "org.apache.commons.cli.HelpFormatter$OptionComparator", options0, "kV", false);
      MockFile mockFile0 = new MockFile("[G%6|-eQ3:SPR$ET&");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      int int1 = (-3029);
      mockPrintWriter0.write("org.apache.commons.cli.HelpFormatter$OptionComparator", 919, (-3029));
      // Undeclared exception!
      try { 
        mockPrintWriter0.append((CharSequence) "--", 3, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      boolean boolean0 = false;
      helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter0.getDescPadding();
      helpFormatter1.setLongOptSeparator("arg");
      helpFormatter0.getLongOptSeparator();
      helpFormatter1.setNewLine("-");
      helpFormatter_Builder0.get();
      HelpFormatter.builder();
      String string0 = "";
      Options options0 = new Options();
      Option option0 = null;
      try {
        option0 = new Option("-", "\n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '-'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintStream mockPrintStream0 = new MockPrintStream(" ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      Object[] objectArray0 = new Object[8];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) helpFormatter0;
      objectArray0[2] = (Object) mockPrintStream0;
      objectArray0[3] = (Object) "(K*oL{3lx+Vu&CglA";
      objectArray0[4] = (Object) helpFormatter0;
      objectArray0[5] = (Object) "(K*oL{3lx+Vu&CglA";
      objectArray0[6] = (Object) mockPrintWriter0;
      objectArray0[7] = (Object) mockPrintStream0;
      PrintWriter printWriter0 = mockPrintWriter0.format("(K*oL{3lx+Vu&CglA", objectArray0);
      // Undeclared exception!
      helpFormatter0.printUsage(printWriter0, 1, "(K*oL{3lx+Vu&CglA");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getSyntaxPrefix();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("3?,]>");
      Options options0 = new Options();
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 1283, "3?,]>", "3?,]>", options0, 1283, 1283, "3?,]>");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.defaultOptPrefix = ",5EH4-XWZ44u\"E0d\"";
      helpFormatter0.getArgName();
      String string0 = null;
      String string1 = "org.apache.commons.cli.HelpFormatter";
      Options options0 = new Options();
      options0.getOption(",5EH4-XWZ44u\"E0d\"");
      helpFormatter0.setLeftPadding(61);
      options0.addOption("arg", false, "");
      // Undeclared exception!
      try { 
        options0.addOption("usage: ", "arg", false, "usage: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'usage: ' contains an illegal character : ':'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-");
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, false);
      Locale locale0 = Locale.US;
      mockPrintWriter0.flush();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      mockPrintWriter1.println(true);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null, locale_FilteringMode0);
      Locale.FilteringMode locale_FilteringMode1 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0, locale_FilteringMode1);
      Locale.lookup(linkedList0, list1);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) helpFormatter_Builder1;
      objectArray0[1] = (Object) helpFormatter_Builder0;
      objectArray0[2] = (Object) helpFormatter_Builder1;
      PrintWriter printWriter0 = mockPrintWriter1.printf(locale0, "", objectArray0);
      helpFormatter_Builder1.setPrintWriter(printWriter0);
      helpFormatter0.rtrim(" \"?ST");
      HelpFormatter helpFormatter1 = helpFormatter_Builder1.get();
      helpFormatter1.getLongOptSeparator();
      helpFormatter1.getOptPrefix();
      helpFormatter1.setDescPadding((-717));
      helpFormatter1.getLongOptSeparator();
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printUsage(printWriter0, 1, (String) null, options0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      String string0 = "";
      helpFormatter0.rtrim("");
      ByteArrayOutputStream byteArrayOutputStream0 = null;
      try {
        byteArrayOutputStream0 = new ByteArrayOutputStream((-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -2
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      Locale locale0 = Locale.CHINA;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "--", (Object[]) null);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      PrintWriter printWriter1 = mockPrintWriter1.printf("--", (Object[]) null);
      helpFormatter0.printWrapped(printWriter1, 3, 0, "Ar \"?lJ");
      helpFormatter0.findWrapPos("Ar \"?lJ", 0, 2);
      Options options0 = new Options();
      helpFormatter0.printOptions(mockPrintWriter0, 2, options0, 0, 2);
      helpFormatter0.printHelp("org.apache.commons.cli.HelpFormatter$OptionComparator", (String) null, options0, "Ar \"?lJ", false);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter0.getWidth();
      helpFormatter0.setOptPrefix((String) null);
      helpFormatter0.setLeftPadding(74);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.defaultNewLine = "a";
      helpFormatter0.setArgName("9=?<uPx;2S$^E#bE");
      helpFormatter0.createPadding(0);
      String string0 = null;
      Options options0 = new Options();
      helpFormatter_Builder0.get();
      options0.getMatchingOptions("Option '");
      Option option0 = new Option((String) null, "--", false, "a");
      options0.addOption(option0);
      options0.getMatchingOptions("usage: ");
      // Undeclared exception!
      try { 
        options0.addOption("org.apache.commons.cli.ParseException", "a", false, "usage: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'org.apache.commons.cli.ParseException' contains an illegal character : '.'.
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockFile mockFile0 = new MockFile("arg", "");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      Options options0 = new Options();
      helpFormatter0.printOptions(mockPrintWriter0, 44, options0, 44, 44);
      helpFormatter0.getNewLine();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "";
      StringWriter stringWriter0 = new StringWriter(3);
      char char0 = 'J';
      StringWriter stringWriter1 = stringWriter0.append('J');
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter1, false);
      int int0 = (-1143);
      String string1 = "W$3SzYkT:7>`";
      stringWriter0.write(74);
      // Undeclared exception!
      try { 
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-1143), "W$3SzYkT:7>`");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      options0.hasShortOption((String) null);
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp(0, (String) null, "", options0, "");
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
      HelpFormatter helpFormatter0 = new HelpFormatter();
      MockPrintStream mockPrintStream0 = new MockPrintStream("--");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "\n");
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0, false);
      helpFormatter0.printWrapped((PrintWriter) mockPrintWriter1, 3565, "--");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.setLongOptSeparator(">");
      helpFormatter0.setOptionComparator((Comparator<Option>) null);
      helpFormatter0.setOptionComparator((Comparator<Option>) null);
      helpFormatter0.rtrim(">");
      MockFile mockFile0 = new MockFile("l3dui7*Ze_@Bcv@1FF4");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      Object object0 = new Object();
      char[] charArray0 = new char[7];
      charArray0[0] = '6';
      charArray0[1] = 'c';
      charArray0[2] = 'c';
      charArray0[3] = 's';
      charArray0[4] = '%';
      charArray0[5] = 'A';
      charArray0[6] = ')';
      mockPrintWriter0.print(charArray0);
      mockPrintWriter0.print(object0);
      int int0 = (-1394);
      // Undeclared exception!
      try { 
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, (-1394), (-1394), ">");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      boolean boolean0 = false;
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      helpFormatter_Builder0.get();
      Options options0 = new Options();
      options0.helpOptions();
      helpFormatter0.printHelp("Qsm>PS", options0, false);
      HelpFormatter helpFormatter1 = new HelpFormatter();
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "--");
      StringBuffer stringBuffer1 = helpFormatter1.renderOptions(stringBuffer0, 74, options0, 1, 74);
      stringBuffer1.codePoints();
      stringBuffer1.setCharAt(1, '*');
      // Undeclared exception!
      try { 
        helpFormatter1.renderWrappedText(stringBuffer1, (-5463), 2821, "E&}VJT");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      StringWriter stringWriter0 = new StringWriter(0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder1.get();
      helpFormatter0.createPadding(209);
      Comparator<Option> comparator0 = helpFormatter1.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setShowDeprecated(true);
      HelpFormatter helpFormatter2 = helpFormatter_Builder2.get();
      helpFormatter2.getSyntaxPrefix();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      stringBuffer0.ensureCapacity(74);
      int int0 = (-1416);
      helpFormatter_Builder1.get();
      // Undeclared exception!
      try { 
        helpFormatter2.renderWrappedText(stringBuffer0, 0, (-1416), "usage: ");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      String string0 = "J7`~o\"W<J/^rb2qJ";
      Options options0 = new Options();
      String string1 = "G%d:Z)n4(ugb_";
      // Undeclared exception!
      try { 
        helpFormatter0.printHelp((-1998), "", "Duplicate key: ", options0, "G%d:Z)n4(ugb_", true);
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
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      helpFormatter0.defaultLongOptPrefix = "";
      helpFormatter0.setSyntaxPrefix((String) null);
      helpFormatter_Builder0.get();
      HelpFormatter helpFormatter1 = helpFormatter_Builder0.get();
      helpFormatter0.setWidth(0);
      StringBuffer stringBuffer0 = new StringBuffer();
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter1.renderOptions(stringBuffer0, 1, options0, (-1392), 1540);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      Options options0 = new Options();
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter1, 44, "The addValue method is not intended for client use. Subclasses should use the processValue method instead.", "tcv];n`)vm", options0, 44, 44, "", true);
      MockPrintWriter mockPrintWriter2 = null;
      try {
        mockPrintWriter2 = new MockPrintWriter("-", "\n");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("#$Td");
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      int int0 = 0;
      String string0 = "\"u1G{]}m`wf3N&V_k1";
      Options options0 = new Options();
      int int1 = 840;
      // Undeclared exception!
      helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 0, "#$Td", "\"u1G{]}m`wf3N&V_k1", options0, 840, 0, "\"u1G{]}m`wf3N&V_k1", false);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      HelpFormatter helpFormatter0 = helpFormatter_Builder1.get();
      StringBuffer stringBuffer0 = new StringBuffer("\n");
      int int0 = 0;
      Options options0 = null;
      int int1 = 0;
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, 0, (Options) null, 1706, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = new HelpFormatter.Builder();
      HelpFormatter.Builder helpFormatter_Builder1 = helpFormatter_Builder0.setShowDeprecated(true);
      MockFile mockFile0 = new MockFile("!{", "");
      File file0 = MockFile.createTempFile("IpG:,,q].]*,T}V-!@", "!{", (File) mockFile0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      HelpFormatter.Builder helpFormatter_Builder2 = helpFormatter_Builder1.setPrintWriter(mockPrintWriter0);
      HelpFormatter helpFormatter0 = helpFormatter_Builder2.get();
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printHelp(0, "IpG:,,q].]*,T}V-!@", (String) null, options0, "(Qfr(p+M*xPJnA+i|", false);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      int int0 = 0;
      helpFormatter0.setDescPadding(0);
      String string0 = "";
      Options options0 = new Options();
      boolean boolean0 = true;
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
  public void test62()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      HelpFormatter helpFormatter1 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter1.printHelp("-", (String) null, options0, "*w:+A");
      Comparator<Option> comparator0 = helpFormatter1.optionComparator;
      helpFormatter0.setOptionComparator(comparator0);
      int int0 = (-426);
      helpFormatter0.setLeftPadding((-426));
      helpFormatter1.getLeftPadding();
      helpFormatter0.getNewLine();
      int int1 = 46;
      helpFormatter0.setLeftPadding(46);
      helpFormatter0.printHelp("usage: ", options0);
      helpFormatter1.setLongOptSeparator((String) null);
      StringBuffer stringBuffer0 = new StringBuffer("Yg%w]h02jg^ow");
      Options options1 = new Options();
      // Undeclared exception!
      try { 
        helpFormatter0.renderOptions(stringBuffer0, (-536), options1, (-2218), (-426));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.HelpFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      helpFormatter0.getLongOptSeparator();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("--");
      mockPrintWriter0.close();
      Locale locale0 = Locale.CANADA_FRENCH;
      mockPrintWriter0.append('9');
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) " ";
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) locale0;
      objectArray0[3] = (Object) helpFormatter0;
      PrintWriter printWriter0 = mockPrintWriter0.printf(locale0, "usage: ", objectArray0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.setDefault(locale_Category0, locale0);
      int int0 = 1883;
      Options options0 = new Options();
      helpFormatter0.printHelp(printWriter0, 1883, " ", " ", options0, 0, 0, (String) null, true);
      helpFormatter0.setLongOptPrefix(" ");
      helpFormatter0.getOptionComparator();
      helpFormatter0.getWidth();
      // Undeclared exception!
      helpFormatter0.printWrapped(printWriter0, 0, " ");
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HelpFormatter helpFormatter0 = new HelpFormatter();
      Options options0 = new Options();
      helpFormatter0.printHelp("i+&V9AZ><p", "i+&V9AZ><p", options0, "org.apache.commons.cli.ParseException");
      helpFormatter0.setSyntaxPrefix("kYG~~P90,l45B&,C4/");
      helpFormatter0.defaultSyntaxPrefix = "kYG~~P90,l45B&,C4/";
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, true);
      Options options1 = new Options();
      helpFormatter0.printHelp("org.apache.commons.cli.HelpFormatter$Builder", options1, true);
      helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, 177, "kYG~~P90,l45B&,C4/");
      Options options2 = new Options();
      helpFormatter0.printHelp("kYG~~P90,l45B&,C4/", "kYG~~P90,l45B&,C4/", options2, "kYG~~P90,l45B&,C4/");
      helpFormatter0.setNewLine("kYG~~P90,l45B&,C4/");
      helpFormatter0.printHelp("kYG~~P90,l45B&,C4/", options2);
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.setShowDeprecated(true);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HelpFormatter.Builder helpFormatter_Builder0 = HelpFormatter.builder();
      helpFormatter_Builder0.get();
      HelpFormatter helpFormatter0 = helpFormatter_Builder0.get();
      MockFile mockFile0 = new MockFile("arg");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      helpFormatter0.defaultSyntaxPrefix = "5y@dJ$G0$:SNl{";
      Object[] objectArray0 = new Object[0];
      PrintWriter printWriter0 = mockPrintWriter0.printf("5y@dJ$G0$:SNl{", objectArray0);
      Options options0 = new Options();
      // Undeclared exception!
      helpFormatter0.printUsage(printWriter0, 1, "3u|uKGT}e:?a Bu", options0);
  }
}
