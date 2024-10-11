
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
  public void test00()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3394);
      CharBuffer charBuffer1 = charBuffer0.put(1, 'G');
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer1, true, 0, charBuffer0, 1, 3414);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3394);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches(charBuffer0, true, 1, charBuffer1, 0, 3394);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3394);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, false, 679, charBuffer0, 3394, (-664));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = CharSequenceUtils.regionMatches("", true, 39, "", 0, 10);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = CharSequenceUtils.regionMatches("A", true, 0, "B", 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches((CharSequence) null, true, 0, (CharSequence) null, 513, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.CharSequenceUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3394);
      CharBuffer charBuffer1 = charBuffer0.put(1, '\u0003');
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer1, true, 1, charBuffer1, '\u0003', 3394);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3381);
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer0, false, 'Y', charBuffer0, 'Y', 'Y');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3381);
      CharBuffer charBuffer1 = charBuffer0.put(0, 'Y');
      boolean boolean0 = CharSequenceUtils.regionMatches(charBuffer1, false, 1, charBuffer0, 0, 3381);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        CharSequenceUtils.regionMatches("", true, 114, charBuffer0, 3413, 2071);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharSequenceUtils charSequenceUtils0 = new CharSequenceUtils();
  }
}
