
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
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.apache.commons.codec.binary.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("", "&%G'7{Ai)U=a${R~");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // &%G'7{Ai)U=a${R~: java.io.UnsupportedEncodingException: &%G'7{Ai)U=a${R~
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = StringUtils.newStringUtf8((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("");
      String string0 = StringUtils.newStringUtf8(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtils.newStringUtf16Le((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1("");
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = StringUtils.newStringUtf16Be((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = StringUtils.newStringUtf16(byteArray0);
      assertEquals("\u0000\u0000\u0000\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = StringUtils.newStringUsAscii((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      String string0 = StringUtils.newStringIso8859_1(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("");
      String string0 = StringUtils.newStringIso8859_1(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Le("oK+(8m21x]eHB#M~");
      assertEquals(32, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Le("");
      String string0 = StringUtils.newStringUsAscii(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16("MJ7(T;_*uX");
      assertEquals(22, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii(": ");
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii("");
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1("WpyZ<,BjpTB~");
      assertEquals(13, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("|-", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = StringUtils.newString((byte[]) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUnchecked((String) null, (String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8("");
      assertFalse(byteBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      boolean boolean0 = StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "R");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      charBuffer0.clear();
      CharBuffer charBuffer1 = charBuffer0.put(charArray0);
      boolean boolean0 = StringUtils.equals((CharSequence) charBuffer1, (CharSequence) "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) "\u0000\u0000\u0000", (CharSequence) "\u0000\u0000\u0000");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, (int) (byte)0, (int) '\u0000');
      boolean boolean0 = StringUtils.equals((CharSequence) "\u0000\u0000\u0000", (CharSequence) charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      boolean boolean0 = StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "\u0000F\u0000u\u00009\u0000D\u00008\u0000T\u0000b\u0000{\u0000*\u0000p\u0000=\u0000o\u0000K");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) null, (CharSequence) "\u7C5E\u3267\u4872\u3423\u746C\u5149\u5C57\uFFFD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      boolean boolean0 = StringUtils.equals((CharSequence) charBuffer0, (CharSequence) charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) "", (CharSequence) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Fu9D8Tb{*p=oK");
      String string0 = StringUtils.newStringUtf8(byteArray0);
      assertEquals("\u0000F\u0000u\u00009\u0000D\u00008\u0000T\u0000b\u0000{\u0000*\u0000p\u0000=\u0000o\u0000K", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8((String) null);
      assertNull(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1("");
      String string0 = StringUtils.newStringUtf16(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = StringUtils.newStringUtf16((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Le((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("|^2gHr4#tlQIW ");
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      assertEquals("\u7C5E\u3267\u4872\u3423\u746C\u5149\u5720", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Fu9D8Tb{*p=oK");
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      assertEquals("\u4600\u7500\u3900\u4400\u3800\u5400\u6200\u7B00\u2A00\u7000\u3D00\u6F00\u4B00", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii((String) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = StringUtils.newStringIso8859_1((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("R@=qp\"+");
      String string0 = StringUtils.newStringUsAscii(byteArray0);
      assertEquals("R@=qp\"+", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Fu9D8Tb{*p=oK");
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, "\u0000F\u0000u\u00009\u0000D\u00008\u0000T\u0000b\u0000{\u0000*\u0000p\u0000=\u0000o\u0000K");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // \u0000F\u0000u\u00009\u0000D\u00008\u0000T\u0000b\u0000{\u0000*\u0000p\u0000=\u0000o\u0000K: java.io.UnsupportedEncodingException: \u0000F\u0000u\u00009\u0000D\u00008\u0000T\u0000b\u0000{\u0000*\u0000p\u0000=\u0000o\u0000K
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be((String) null);
      assertNull(byteArray0);
  }
}
