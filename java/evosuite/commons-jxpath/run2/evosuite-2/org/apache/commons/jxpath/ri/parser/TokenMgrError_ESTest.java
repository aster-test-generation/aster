
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
      String string0 = TokenMgrError.LexicalError(false, (-2586), (-2586), (-2586), "c!~EJIAu)p", '=');
      assertEquals("Lexical error at line -2586, column -2586.  Encountered: \"=\" (61), after : \"c!~EJIAu)p\"", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 2948, (-1), 2633, "OGCJTigv4LO0", 's', 39);
      int int0 = tokenMgrError0.getPosition();
      assertEquals('s', tokenMgrError0.getCharacter());
      assertEquals(2632, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("Lexical error at line -1, column 0.  Encountered: <EOF> after : \"\"", (-1));
      String string0 = tokenMgrError0.getMessage();
      assertEquals("Lexical error at line -1, column 0.  Encountered: <EOF> after : \"\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("", 157);
      String string0 = tokenMgrError0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, (-1398), 2248, 519, "", '1', 16);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('1', char0);
      assertEquals(518, tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 678, 678, 678, "W*", 'C', 678);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals(677, tokenMgrError0.getPosition());
      assertEquals('C', char0);
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
      // Undeclared exception!
      try { 
        TokenMgrError.LexicalError(false, 0, 1284, 0, (String) null, 'P');
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
      TokenMgrError tokenMgrError0 = null;
      try {
        tokenMgrError0 = new TokenMgrError(false, 1372, 1, 1372, (String) null, '+', 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.TokenMgrError", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("(_5");
      assertEquals("(_\\u007f5", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, (-1533), '\u000B', (-1533), "_Bn", '\u000B', '\u000B');
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("4N%Hp9t\"(#*>\"'N");
      assertEquals("4N%Hp9t\\\"(#*>\\\"\\'N", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(true, (-956), (-956), 12, "Lexical error at line -956, column -956.  Encountered: <EOF> after : \"\"", 'N');
      assertEquals("Lexical error at line -956, column 12.  Encountered: <EOF> after : \"Lexical error at line -956, column -956.  Encountered: <EOF> after : \\\"\\\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, (-1532), (-1532), (-1532), "_Bn", '\r');
      assertEquals("Lexical error at line -1532, column -1532.  Encountered: \"\\r\" (13), after : \"_Bn\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, (-1533), '\f', (-1533), "_Bn", '\f', '\f');
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("\n");
      assertEquals("\\n", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 0, '\t', 0, "", '\t', '\t');
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 0, '\b', 0, "", '\b', '\b');
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, (-171), (-171), (-275), "\\n", '\u0000');
      assertEquals("Lexical error at line -171, column -275.  Encountered: \"\" (0), after : \"\\\\n\"", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      String string0 = tokenMgrError0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 0, 0, 0, "cWT^`S1ITv-f", '', 0);
      int int0 = tokenMgrError0.getPosition();
      assertEquals((-1), int0);
      assertEquals('', tokenMgrError0.getCharacter());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("\f", 1);
      int int0 = tokenMgrError0.getPosition();
      assertEquals(0, int0);
  }
}
