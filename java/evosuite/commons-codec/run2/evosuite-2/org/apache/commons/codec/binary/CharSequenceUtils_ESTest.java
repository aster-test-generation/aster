
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


package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.apache.commons.codec.binary.CharSequenceUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CharSequenceUtils_ESTest extends CharSequenceUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '^';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, true, 1, charBuffer0, 0, 2243);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[15];
      charArray0[1] = '2';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, false, 1, charBuffer0, 0, 2243);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1219);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches(charBuffer0, true, '^', "vZqPr|(o", 1673, 2150);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches((CharSequence) null, false, 2582, (CharSequence) null, 0, 195);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.CharSequenceUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = 'F';
      charArray0[0] = 'f';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, true, 1, charBuffer0, 0, 2243);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[15];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches(charBuffer0, false, 1, charBuffer0, 0, 2243);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[15];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = CharSequenceUtils.regionMatches("vZqPr|(o", true, 753, charBuffer0, 0, (-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean boolean0 = CharSequenceUtils.regionMatches("vZqPr|(o", true, 0, "vZqPr|(o", 1041, (-3401));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      char[] charArray0 = new char[15];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, false, 1, charBuffer0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CharSequenceUtils charSequenceUtils0 = new CharSequenceUtils();
  }
}
