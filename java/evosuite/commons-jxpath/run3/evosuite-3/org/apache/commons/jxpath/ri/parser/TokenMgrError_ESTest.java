
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
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 424, 750, 424, "uN/Dj8k~aT7s", 'w', 5054);
      int int0 = tokenMgrError0.getPosition();
      assertEquals('w', tokenMgrError0.getCharacter());
      assertEquals(423, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, 0, 0, 0, "nmR_T0H)ulPL(*", 'k', 0);
      int int0 = tokenMgrError0.getPosition();
      assertEquals('k', tokenMgrError0.getCharacter());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("", (-341));
      String string0 = tokenMgrError0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(false, 0, 0, 0, "", '7', 458);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals((-1), tokenMgrError0.getPosition());
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, 0, 0, 0, "nmR_T0H)ulPL(*", 'k', 0);
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('k', char0);
      assertEquals((-1), tokenMgrError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        TokenMgrError.LexicalError(false, 0, 9, 506, (String) null, '1');
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
        tokenMgrError0 = new TokenMgrError(true, 0, 0, 0, (String) null, 'e', 0);
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
      TokenMgrError tokenMgrError0 = new TokenMgrError(true, (-970), (-970), (-3708), "", '\u0083', (-970));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("r`4xT\"5[yw9R`/vSUm");
      assertEquals("r`4xT\\\"5[yw9R\\u007f`/vSUm", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("F@~'~>F");
      assertEquals("F@~\\'~>F", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TokenMgrError.addEscapes("Lexical error at line 13, column 83.  Encountered: \"\u0011\" (17), after : \"H\\~w._*U^XyJ<-\"");
      assertEquals("Lexical error at line 13, column 83.  Encountered: \\\"\\u0011\\\" (17), after : \\\"H\\\\~w._*U^XyJ<-\\\"", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 83, '\r', '\r', "I,-:TR@ KR}]%[Q", '\r');
      assertEquals("Lexical error at line 13, column 13.  Encountered: \"\\r\" (13), after : \"I,-:TR@ KR}]%[Q\"", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 83, '\n', 83, "y^nFWck,\u0005!@~", '\f');
      assertEquals("Lexical error at line 10, column 83.  Encountered: \"\\f\" (12), after : \"y^nFWck,\\u0005!@~\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, '\b', '\b', '\b', "I,-:TR@ KR}]%[Q", '\n');
      assertEquals("Lexical error at line 8, column 8.  Encountered: \"\\n\" (10), after : \"I,-:TR@ KR}]%[Q\"", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 0, 0, 0, "I,-:TR@ KR}]%[Q", '\t');
      assertEquals("Lexical error at line 0, column 0.  Encountered: \"\\t\" (9), after : \"I,-:TR@ KR}]%[Q\"", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 83, '\n', 83, "I,-:TR@ KR}]%[Q", '\b');
      assertEquals("Lexical error at line 10, column 83.  Encountered: \"\\b\" (8), after : \"I,-:TR@ KR}]%[Q\"", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = TokenMgrError.LexicalError(false, 0, 0, 0, "U_`@JVdyG`)`Eo", '\u0000');
      assertEquals("Lexical error at line 0, column 0.  Encountered: \"\" (0), after : \"U_`@JVdyG`)`Eo\"", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("U_`@JVdyG`)`Eo", (-1));
      char char0 = tokenMgrError0.getCharacter();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("U_`@JVdyG`)`Eo", (-1));
      String string0 = tokenMgrError0.getMessage();
      assertEquals("U_`@JVdyG`)`Eo", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError();
      String string0 = tokenMgrError0.getMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TokenMgrError tokenMgrError0 = new TokenMgrError("U_`@JVdyG`)`Eo", (-1));
      int int0 = tokenMgrError0.getPosition();
      assertEquals(0, int0);
  }
}
