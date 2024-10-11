
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
import org.apache.commons.jxpath.ri.parser.TokenMgrError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TokenMgrError_ESTest extends TokenMgrError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 39, 39, (-228), "", '4', 39);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, 0, 0, 0, "), ", 'I', 0);
      int int0 = tokenMgrError0.getPosition();
      assertEquals((-1), int0);
      assertEquals('I', tokenMgrError0.getCharacter());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, 0, 0, 0, "), ", 'I', 0);
      String string0 = tokenMgrError0.getMessage();
      assertEquals('I', tokenMgrError0.getCharacter());
      assertEquals("Lexical error at line 0, column 0.  Encountered: <EOF> after : \"), \"", string0);
      assertEquals((-1), tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("", 1);
      String string0 = tokenMgrError0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 0, (-1461), 0, "", '9', (-2223));
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('9', char0);
      assertEquals((-1), tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, 0, 0, 0, "), ", 'I', 0);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('I', char0);
      assertEquals((-1), tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        TokenMgrError.addEscapes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TokenMgrError tokenMgrError0 = null;
      try {
        tokenMgrError0 = new TokenMgrError(false, 0, (-1923), (-1923), (String) null, 'R', 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("Lexical error at line 61, column 0.  Encountered: \"=\" (61), after : \"z>WCN?&T04j!~&8:\"");
      assertEquals("Lexical error at line 61, column 0.  Encountered: \\\"=\\\" (61), after : \\\"z>WCN?&T04j!\\u007f~&8:\\\"", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("Lexical error at line 1430, column -4846.  Encountered: <EOF> after : \"'Do_'`W:82{Bo9}V\"");
      assertEquals("Lexical error at line 1430, column -4846.  Encountered: <EOF> after : \\\"\\'Do_\\'`W:82{Bo9}V\\\"", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 0, '=', 0, "z>WCN?&T04j!~&8:", '=');
      assertEquals("Lexical error at line 61, column 0.  Encountered: \"=\" (61), after : \"z>WCN?&T04j!\\u007f~&8:\"", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 74, '\u0013', '\u0013', "v5Y}wsX)", '\u0013');
      assertEquals("Lexical error at line 19, column 19.  Encountered: \"\\u0013\" (19), after : \"v5Y}wsX)\"", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("Lexical error at line -34, column -34.  Encountered: \"\n\" (10), after : \"x2*#7($wG ZVk\"");
      assertEquals("Lexical error at line -34, column -34.  Encountered: \\\"\\n\\\" (10), after : \\\"x2*#7($wG ZVk\\\"", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, '\u0000', '\u0000', '\r', "", '\r');
      assertEquals("Lexical error at line 0, column 13.  Encountered: \"\\r\" (13), after : \"\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 74, '\f', '\f', "v5YfwsX)", '\f');
      assertEquals("Lexical error at line 12, column 12.  Encountered: \"\\f\" (12), after : \"v5YfwsX)\"", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TokenMgrError.LexicalError(false, 0, 0, '\t', (String) null, '\t');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, '\u0000', '\u0000', '\b', "", '\b');
      assertEquals("Lexical error at line 0, column 8.  Encountered: \"\\b\" (8), after : \"\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        TokenMgrError.LexicalError(false, '\b', '\u0000', 0, (String) null, '\u0000');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      String string0 = tokenMgrError0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, 10, 0, 10, "4ciu4LCiy#D}z^?kI", '5', (-3049));
      int int0 = tokenMgrError0.getPosition();
      assertEquals(9, int0);
      assertEquals('5', tokenMgrError0.getCharacter());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      int int0 = tokenMgrError0.getPosition();
      assertEquals(0, int0);
  }
}
