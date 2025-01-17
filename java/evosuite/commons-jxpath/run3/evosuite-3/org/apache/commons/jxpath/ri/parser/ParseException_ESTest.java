
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


package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.ri.parser.ParseException;
import org.apache.commons.jxpath.ri.parser.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParseException_ESTest extends ParseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      String string0 = parseException0.add_escapes("Mfv.MX84(,f4b~:v");
      assertEquals("Mfv.MX84(,f4b~:v", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Token token0 = Token.newToken(0);
      int[][] intArray0 = new int[9][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      String[] stringArray0 = new String[4];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      // Undeclared exception!
      try { 
        parseException0.getMessage();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseException parseException0 = new ParseException();
      String string0 = parseException0.add_escapes("-C,4M4l%ol5=:7'Z^v");
      assertEquals("-C,4M4l%ol5=:7\\'Z^v", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      String string0 = parseException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      String string0 = parseException0.add_escapes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Token token0 = Token.newToken(0);
      int[][] intArray0 = new int[9][0];
      String[] stringArray0 = new String[4];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      // Undeclared exception!
      try { 
        parseException0.getMessage();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      // Undeclared exception!
      try { 
        parseException0.add_escapes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      String string0 = parseException0.add_escapes("lG_@,");
      assertEquals("lG_\\u007f@,", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParseException parseException0 = new ParseException("zxpYuL3;uWhCFz\"9");
      String string0 = parseException0.add_escapes("zxpYuL3;uWhCFz\"9");
      assertEquals("zxpYuL3;uWhCFz\\\"9", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParseException parseException0 = new ParseException();
      String string0 = parseException0.add_escapes("\n");
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Token token0 = Token.newToken(39);
      int[][] intArray0 = new int[3][4];
      String[] stringArray0 = new String[5];
      token0.next = token0;
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      String string0 = parseException0.getMessage();
      assertEquals("Encountered \"null\" at line 0, column 0.\nWas expecting one of:\n    null null null null \n    null null null null \n    null null null null \n    ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Token token0 = new Token();
      int[][] intArray0 = new int[1][8];
      String[] stringArray0 = new String[9];
      token0.image = "\t";
      token0.kind = 7;
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      token0.next = parseException0.currentToken;
      String string0 = parseException0.getMessage();
      assertEquals("Encountered \"\\t \\t \\t \\t \\t \\t \\t \\t\" at line 0, column 0.\nWas expecting:\n    null null null null null null null null \n    ", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Token token0 = Token.newToken(39);
      int[][] intArray0 = new int[3][4];
      int[] intArray1 = new int[6];
      intArray1[5] = 1;
      intArray0[2] = intArray1;
      String[] stringArray0 = new String[5];
      ParseException parseException0 = new ParseException(token0, intArray0, stringArray0);
      // Undeclared exception!
      try { 
        parseException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParseException parseException0 = new ParseException();
      String string0 = parseException0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParseException parseException0 = new ParseException("");
      String string0 = parseException0.add_escapes("Ehn_iv'RN JKeL@NZY");
      assertEquals("Ehn_iv\\'RN JKeL@NZY", string0);
  }
}
