
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
      Hex hex0 = new Hex();
      Object object0 = new Object();
      try { 
        hex0.decode(object0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.Object cannot be cast to [C
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Hex.toDigit('d', 0);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      Hex hex0 = new Hex(charset0);
      String string0 = hex0.getCharsetName();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      Charset charset0 = hex0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Hex.encodeHexString(byteArray0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = Hex.encodeHexString(byteArray0);
      assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = Hex.encodeHexString(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      String string0 = Hex.encodeHexString(byteBuffer0, true);
      assertEquals("00", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, 0);
      String string0 = Hex.encodeHexString(byteBuffer0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = Hex.encodeHex(byteArray0, true);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      char[] charArray0 = Hex.encodeHex(byteArray0, (int) (byte)4, (int) (byte)4, true);
      assertArrayEquals(new char[] {'0', '0', '0', '0', '0', '0', '0', '0'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("UTF-8");
      hex0.encode(byteBuffer0);
      char[] charArray0 = new char[9];
      char[] charArray1 = Hex.encodeHex(byteBuffer0, charArray0);
      assertNotSame(charArray0, charArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byteBuffer0.compact();
      char[] charArray0 = Hex.encodeHex(byteBuffer0, false);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = Hex.encodeHex(byteBuffer0);
      assertArrayEquals(new char[] {'0', '0'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = hex0.encode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = Hex.encodeHex(byteArray0, false);
      assertArrayEquals(new char[] {'0', '0', '0', '0', '0', '0'}, charArray0);
      
      byte[] byteArray1 = Hex.decodeHex(charArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = Hex.decodeHex(charArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = Hex.decodeHex("f90000");
      assertArrayEquals(new byte[] {(byte) (-7), (byte)0, (byte)0}, byteArray0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
      Hex hex0 = new Hex(charset0);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = hex0.decode(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hex hex0 = new Hex();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)51;
      byteArray0[1] = (byte)51;
      byteArray0[2] = (byte)51;
      byteArray0[3] = (byte)51;
      byteArray0[4] = (byte)51;
      byteArray0[5] = (byte)51;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byte[] byteArray1 = hex0.decode(byteBuffer0);
      assertEquals(3, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)51, (byte)51, (byte)51}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, 0);
      Hex hex0 = new Hex();
      byte[] byteArray1 = hex0.decode(byteBuffer0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Hex.toDigit('n', 413);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character n at index 413
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((byte[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHexString((ByteBuffer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, charArray0);
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
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, true);
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
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, 52, 1258, false, charArray0, 52);
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
      byte[] byteArray0 = new byte[6];
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, 1891, (int) (byte)1, true, charArray0, 1571);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1891
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((byte[]) null, 76, 88, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, 0, (int) (byte) (-43), true);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteArray0, 1, 16, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-10);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        Hex.encodeHex(byteBuffer0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hex.encodeHex((ByteBuffer) null, true);
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
      Hex hex0 = new Hex();
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
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        Hex.decodeHex(charArray0, (byte[]) null, 1113);
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
      char[] charArray0 = new char[6];
      charArray0[0] = 'd';
      charArray0[1] = 'd';
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Hex.decodeHex(charArray0, byteArray0, (int) (byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      try { 
        Hex.decodeHex("HH");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character H at index 0
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        hex0.decode(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("UTF-8");
      try { 
        hex0.decode(byteBuffer0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hex hex0 = new Hex();
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
  public void test48()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex("9J");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // 9J
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[6];
      char[] charArray1 = Hex.encodeHex(byteArray0, charArray0);
      int int0 = Hex.decodeHex(charArray1, byteArray0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = new byte[5];
      try { 
        Hex.decodeHex(charArray0, byteArray0, (int) (byte) (-1));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character \u0000 at index 0
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[7];
      try { 
        Hex.decodeHex(charArray0, (byte[]) null, 62);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Odd number of characters.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = Hex.encodeHex(byteBuffer0, true);
      assertEquals(14, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Hex hex0 = new Hex("UTF-8");
      assertEquals("UTF-8", hex0.getCharsetName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("UTF-8");
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      //  // Unstable assertion: assertEquals(10, byteArray0.length);
      
      char[] charArray0 = new char[9];
      Hex.encodeHex(byteArray0, charArray0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)53, (byte)53, (byte)53, (byte)48, (byte)48, (byte)54, (byte)48, (byte)100, (byte)51, (byte)56}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = Hex.encodeHex(byteArray0);
      assertArrayEquals(new char[] {'0', '0', '0', '0'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[5];
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
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[6];
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(70);
      char[] charArray1 = Hex.encodeHex(byteBuffer0, charArray0);
      assertEquals(140, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      try { 
        hex0.encode((Object) charset0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // sun.nio.cs.UTF_8 cannot be cast to [B
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Hex hex0 = new Hex();
      Object object0 = hex0.encode((Object) "");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Hex hex0 = new Hex();
      try { 
        hex0.decode((Object) "org.apache.commons.codec.binary.Hex@1[charsetName=UTF-8]");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Illegal hexadecimal character o at index 0
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      byteBuffer0.putInt(5663);
      String string0 = Hex.encodeHexString(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)0);
      byte[] byteArray0 = hex0.encode(byteBuffer0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      Hex hex0 = new Hex();
      Object object0 = hex0.encode((Object) byteBuffer0);
      Object object1 = hex0.decode(object0);
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[8];
      try { 
        Hex.decodeHex(charArray0, byteArray0, (int) (byte)0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Output array is not large enough to accommodate decoded data.
         //
         verifyException("org.apache.commons.codec.binary.Hex", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      byte[] byteArray0 = new byte[1];
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
  public void test69()  throws Throwable  {
      Hex hex0 = new Hex((Charset) null);
      String string0 = hex0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
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
  public void test71()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("");
      String string0 = Hex.encodeHexString(byteBuffer0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      String string0 = Hex.encodeHexString(byteArray0, false);
      assertEquals("00", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Hex hex0 = new Hex(charset0);
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = hex0.encode(byteArray0);
      byte[] byteArray2 = hex0.decode(byteArray1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray2);
      assertArrayEquals(new byte[] {(byte)48, (byte)48}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = Hex.encodeHex(byteArray0, (int) (byte)0, (int) (byte)0, true);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
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
  public void test76()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      Hex.encodeHexString(byteBuffer0);
      char[] charArray0 = Hex.encodeHex(byteBuffer0);
      assertEquals(0, byteBuffer0.remaining());
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = Hex.decodeHex("");
      char[] charArray0 = new char[7];
      Hex.encodeHex(byteArray0, 0, (-5334), true, charArray0, (-5334));
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Hex hex0 = new Hex();
      ByteBuffer byteBuffer0 = hex0.DEFAULT_CHARSET.encode("");
      Object object0 = hex0.decode((Object) byteBuffer0);
      Object object1 = hex0.decode(object0);
      assertNotSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Charset charset0 = Hex.DEFAULT_CHARSET;
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
  public void test80()  throws Throwable  {
      Hex hex0 = null;
      try {
        hex0 = new Hex("[Pyzi");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // [Pyzi
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
