
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
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.codec.binary.Hex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Hex_ESTest extends Hex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      String string0 = hex0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      char[] charArray0 = new char[4];
      Hex.encodeHex(byteArray0, (int) (byte)0, (int) (byte) (-1), false, charArray0, 0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = new char[0];
      Hex.encodeHex(byteArray0, (int) (byte)0, (int) (byte)0, false, charArray0, 56);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Hex.toDigit('0', 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Hex.toDigit('d', 0);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = Hex.encodeHex(byteArray0, (int) (byte)56, 0, true);
      byte[] byteArray1 = Hex.decodeHex(charArray0);
      String string0 = Hex.encodeHexString(byteArray1, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      String string0 = Hex.encodeHexString(byteArray0);
      //  // Unstable assertion: assertEquals("6666666666666666", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      String string0 = Hex.encodeHexString(byteBuffer0, false);
      assertEquals("0000", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[2];
      char[] charArray1 = Hex.encodeHex(byteArray0, charArray0);
      assertNotSame(charArray1, charArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = Hex.encodeHex(byteArray0, true);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      char[] charArray0 = Hex.encodeHex(byteArray0, (int) (byte)0, 1, false);
      assertArrayEquals(new char[] {'0', '0'}, charArray0);
      assertEquals(2, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hex hex0 = new Hex();
      CharBuffer charBuffer0 = CharBuffer.allocate((byte)0);
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode(charBuffer0);
      char[] charArray0 = new char[5];
      char[] charArray1 = Hex.encodeHex(byteBuffer0, charArray0);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hex hex0 = new Hex();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode(charBuffer0);
      char[] charArray1 = Hex.encodeHex(byteBuffer0);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = hex0.encode(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray1, 0, 0);
      String string0 = Hex.encodeHexString(byteBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hex hex0 = new Hex();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode(charBuffer0);
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[2];
      int int0 = Hex.decodeHex(charArray0, byteArray0, (-454));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      byte[] byteArray1 = Hex.decodeHex(charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'6', '6'}, charArray0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)102}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      char[] charArray0 = Hex.encodeHex(byteBuffer0, true);
      byte[] byteArray0 = Hex.decodeHex(charArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = Hex.decodeHex("3ac5000064");
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)58, (byte) (-59), (byte)0, (byte)0, (byte)100}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = Hex.decodeHex("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Hex hex0 = new Hex();
      byte[] byteArray1 = hex0.encode(byteArray0);
      byte[] byteArray2 = hex0.decode(byteArray1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)102, (byte)102, (byte)102, (byte)102, (byte)102}, byteArray2);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)54, (byte)54, (byte)54, (byte)54, (byte)54, (byte)54, (byte)54, (byte)54, (byte)54, (byte)54}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = hex0.decode(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      Hex hex0 = new Hex(charset0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      byte[] byteArray0 = hex0.decode(byteBuffer0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Hex.toDigit('|', (-1808));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character | at index -1808
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      // Undeclared exception!
      try { 
        hex0.getCharsetName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((ByteBuffer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)58;
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, (int) (byte) (-1), 721, false, charArray0, (-3184));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, 1624, 1624, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, (int) (byte) (-91), (int) (byte) (-91), false);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, (int) (byte)0, 5317, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("KJ(K");
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteBuffer0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.encode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Hex hex0 = new Hex();
      // Undeclared exception!
      try { 
        hex0.encode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        Hex.decodeHex((char[]) null, byteArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      // Undeclared exception!
      try { 
        Hex.decodeHex(charArray0, byteArray0, (-1387));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1387
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.decodeHex((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.decodeHex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Hex hex0 = new Hex();
      try { 
        hex0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      // Undeclared exception!
      try { 
        hex0.decode((ByteBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      // Undeclared exception!
      try { 
        hex0.decode((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex("og.apache.commons.codec.DecoderException");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // og.apache.commons.codec.DecoderException
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      try { 
        hex0.decode((Object) charset0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // sun.nio.cs.UTF_8 cannot be cast to [C
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      byte[] byteArray1 = new byte[6];
      int int0 = Hex.decodeHex(charArray0, byteArray1, 4);
      //  // Unstable assertion: assertArrayEquals(new char[] {'6', '6'}, charArray0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)102, (byte)0}, byteArray1);
      //  // Unstable assertion: assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[4];
      try { 
        Hex.decodeHex(charArray0, byteArray0, (int) (byte)120);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(69);
      char[] charArray0 = Hex.encodeHex(byteBuffer0, true);
      assertEquals(138, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Hex hex0 = new Hex("UTF-8");
      assertEquals("UTF-8", hex0.getCharsetName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Hex.encodeHexString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      Charset charset0 = hex0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        hex0.decode(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[9];
      char[] charArray1 = Hex.encodeHex(byteArray0, charArray0);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[9];
      try { 
        Hex.decodeHex(charArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[27];
      char[] charArray1 = Hex.encodeHex(byteBuffer0, charArray0);
      assertEquals(8, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("~^[\"`Y'it");
      String string0 = Hex.encodeHexString(byteBuffer0);
      //  // Unstable assertion: assertEquals("ee6e66eee66feeefe6", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = new Object();
      try { 
        hex0.encode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.Object cannot be cast to [B
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      Hex hex0 = new Hex(charset0);
      Object object0 = hex0.encode((Object) "");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      Hex hex0 = new Hex(charset0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      Object object0 = hex0.encode((Object) byteBuffer0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = hex0.decode((Object) "000000000000000000000000000000");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      Hex hex0 = new Hex(charset0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "org.apache.commons.codec.binary.Hex@1[charsetName=UTF-8]");
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode(charBuffer0);
      char[] charArray0 = Hex.encodeHex(byteBuffer0);
      assertEquals(112, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      char[] charArray0 = Hex.encodeHex(byteArray0, false);
      try { 
        Hex.decodeHex(charArray0, byteArray0, (int) (byte)84);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Output array is not large enough to accommodate decoded data.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      String string0 = Hex.encodeHexString(byteBuffer0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      String string0 = Hex.encodeHexString(byteArray0, true);
      //  // Unstable assertion: assertEquals("666666666666", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      try { 
        Hex.decodeHex("UTF-8");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      // Undeclared exception!
      try { 
        hex0.encode((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      String string0 = hex0.getCharsetName();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("UTF-8");
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      assertEquals(10, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)53, (byte)53, (byte)53, (byte)52, (byte)52, (byte)54, (byte)50, (byte)100, (byte)51, (byte)56}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, 0, (int) (byte)81, true, charArray0, 2809);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2809
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("");
      Object object0 = hex0.decode((Object) byteBuffer0);
      Object object1 = hex0.decode(object0);
      assertNotSame(object0, object1);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      try { 
        hex0.decode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character \u0000 at index 0
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex("Output array is not large enough to accommodate decoded data.");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // Output array is not large enough to accommodate decoded data.
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
