
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


package org.apache.commons.codec.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.net.URLCodec;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class URLCodec_ESTest extends URLCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)23;
      BitSet bitSet0 = BitSet.valueOf(byteArray0);
      byte[] byteArray1 = URLCodec.encodeUrl(bitSet0, byteArray0);
      assertEquals(11, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte)39;
      byte[] byteArray1 = uRLCodec0.encode(byteArray0);
      byte[] byteArray2 = uRLCodec0.decode(byteArray1);
      assertEquals(60, byteArray1.length);
      assertEquals(20, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      String string0 = uRLCodec0.getEncoding();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("");
      String string0 = uRLCodec0.getEncoding();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      String string0 = uRLCodec0.getDefaultCharset();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("");
      String string0 = uRLCodec0.getDefaultCharset();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("mA]IKOJR");
      byte[] byteArray0 = uRLCodec0.encode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.encode("R+", "UTF-8");
      assertEquals("R%2B", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.encode("", "UTF-8");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.encode("Z5h332hWwDYPKEU{`");
      assertNotNull(string0);
      assertEquals("Z5h332hWwDYPKEU%7B%60", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.encode("");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = URLCodec.decodeUrl(byteArray0);
      byte[] byteArray2 = new byte[0];
      byte[] byteArray3 = URLCodec.decodeUrl(byteArray2);
      BitSet bitSet0 = BitSet.valueOf(byteArray3);
      byte[] byteArray4 = URLCodec.encodeUrl(bitSet0, byteArray1);
      assertArrayEquals(new byte[] {}, byteArray4);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      byte[] byteArray0 = uRLCodec0.decode((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = uRLCodec0.decode(byteArray0);
      byte[] byteArray2 = uRLCodec0.encode(byteArray1);
      assertNotSame(byteArray0, byteArray2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.decode("UTF-8", "UTF-8");
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.decode("", "UTF-8");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.decode("");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      try { 
        uRLCodec0.encode(" cannot be URL decoded", " cannot be URL decoded");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("N2Wrk:ye-uqG=J");
      try { 
        uRLCodec0.encode("N2Wrk:ye-uqG=J");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // N2Wrk:ye-uqG=J
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      // Undeclared exception!
      try { 
        uRLCodec0.encode((Object) "1I.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)37;
      try { 
        URLCodec.decodeUrl(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: 
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)37;
      try { 
        uRLCodec0.decode(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 0
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("org.apache.commons.codec.DecoderException");
      try { 
        uRLCodec0.decode("Y#c_&K%xAS*hbq5f ", "org.apache.commons.codec.DecoderException");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL encoding: not a valid digit (radix 16): 120
         //
         verifyException("org.apache.commons.codec.net.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("k ujc_>^~$R,M");
      try { 
        uRLCodec0.decode("org.apache.commons.codec.DecoderException", "AlkO.CZx3')`euY7xF");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec("mA]IKOJR");
      try { 
        uRLCodec0.decode("mA]IKOJR");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mA]IKOJR
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      // Undeclared exception!
      try { 
        uRLCodec0.decode("R=zjVRLRz.vvx,s/~22");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      // Undeclared exception!
      try { 
        uRLCodec0.decode((Object) " cannot be URL encoded");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      // Undeclared exception!
      try { 
        uRLCodec0.encode("O", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      // Undeclared exception!
      try { 
        uRLCodec0.encode("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      // Undeclared exception!
      try { 
        uRLCodec0.decode("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.decode("suH9r`KHM=W=");
      assertNotNull(string0);
      assertEquals("suH9r`KHM=W=", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)32;
      byte[] byteArray1 = URLCodec.encodeUrl((BitSet) null, byteArray0);
      assertEquals(16, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = uRLCodec0.encode(byteArray0);
      byte[] byteArray2 = URLCodec.decodeUrl(byteArray1);
      assertArrayEquals(new byte[] {(byte)37, (byte)48, (byte)48, (byte)37, (byte)48, (byte)48}, byteArray1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)43;
      byte[] byteArray1 = URLCodec.decodeUrl(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)32, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.getDefaultCharset();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.encode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      String string0 = uRLCodec0.encode((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      try { 
        uRLCodec0.encode((Object) uRLCodec0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type org.apache.commons.codec.net.URLCodec cannot be URL encoded
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      Object object0 = uRLCodec0.encode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.decode((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      BitSet bitSet0 = URLCodec.WWW_FORM_URL;
      try { 
        uRLCodec0.decode((Object) bitSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Objects of type java.util.BitSet cannot be URL decoded
         //
         verifyException("org.apache.commons.codec.net.URLCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      Object object0 = uRLCodec0.decode((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      Object object0 = uRLCodec0.encode((Object) " cannot be URL decoded");
      assertEquals("+cannot+be+URL+decoded", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-15);
      byte[] byteArray1 = URLCodec.encodeUrl((BitSet) null, byteArray0);
      assertArrayEquals(new byte[] {(byte)37, (byte)48, (byte)48, (byte)37, (byte)70, (byte)49}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BitSet bitSet0 = new BitSet();
      byte[] byteArray0 = URLCodec.encodeUrl(bitSet0, (byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      Object object0 = uRLCodec0.decode((Object) "R+");
      assertEquals("R ", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = URLCodec.decodeUrl((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec();
      String string0 = uRLCodec0.getEncoding();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      URLCodec uRLCodec0 = new URLCodec((String) null);
      String string0 = uRLCodec0.decode((String) null);
      assertNull(string0);
  }
}
