
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.digest.MurmurHash3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MurmurHash3_ESTest extends MurmurHash3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short) (-239));
      assertEquals(5718757154884049288L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = MurmurHash3.hash64(2106);
      assertEquals(6309314866797894544L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)2;
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals((-3505139826337110930L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-39);
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals((-7232142413255735476L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)68;
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-853462855), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte)32;
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(1415135397, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, 0, 668, (int) (byte)107);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) 3266, (-106L), (-603067852));
      assertEquals(820959952, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-125);
      byteArray0[5] = (byte)1;
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals(37396155, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-78);
      byteArray0[6] = (byte) (-1);
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals((-1624610033), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise((-1276), 1, byteArray0, 11);
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
      assertEquals(1981491096, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[9];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (-1), (byte)0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)1;
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)2, (byte)2);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, 193272463);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)2;
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)2, (byte)2);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, 193272463);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)2;
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)2, (byte)2);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, 193272463);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte) (-1), 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long long0 = MurmurHash3.hash64(byteArray0, (-2532), (int) (byte)0, (-1));
      assertEquals(7256831767414464289L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long long0 = MurmurHash3.hash64(byteArray0, 1692, (-224));
      assertEquals((-3086907447183561766L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short) (byte)54);
      assertEquals((-4176102861798359085L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = MurmurHash3.hash64(913L);
      assertEquals(7161721097293301434L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long long0 = MurmurHash3.hash64(2024647540);
      assertEquals((-1449897768003866316L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32x86(byteArray0, (int) (byte)1, (int) (byte)1, (int) (byte) (-12));
      assertEquals((-991110687), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0, 0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)34, 0, 3167);
      assertEquals(966830252, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32(byteArray0, 0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32(byteArray0, 0, 1);
      assertEquals(1364076727, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = MurmurHash3.hash32(byteArray0, 1);
      assertEquals(500407381, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash3.hash32(byteArray0, 0);
      assertEquals((-965378730), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = MurmurHash3.hash32("org.apache.commons.codec.digest.MurmurHash3");
      assertEquals(794771396, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = MurmurHash3.hash32(9L, (long) (byte)1, 16);
      assertEquals(78199091, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-146L), (-146L));
      assertEquals(1003285799, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L, (-801));
      assertEquals(2024647540, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-146L));
      assertEquals(233947601, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long[] longArray0 = MurmurHash3.hash128(byteArray0, 0, (int) (byte)0, (int) (byte)0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, (-4584), (int) (byte)2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte) (-9), (-1133));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1143
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null, (int) (byte)0, 501150701, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 1657, 1657);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, 33894123, (-86));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, 1364076727);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null, 181, (-26), (-2));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)0, (-430675100), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -430675101
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 31, (int) (byte) (-79), (int) (byte)111);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -49
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 0, (-1593), (-851));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1594
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte) (-84), (-2421), 1013);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2506
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte) (-38), (int) (byte) (-38), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -77
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long long0 = MurmurHash3.hash64(byteArray0, 1888, 0, (int) (byte)6);
      assertEquals((-1678519184964958861L), long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)0, 909, (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, 0, (-1), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash3.hash32x86(byteArray0, 0, (int) (byte)2, (int) (byte)25);
      assertEquals(1159698088, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 104729, (-4291), 24);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte) (-79), (-801), 1203);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -881
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte) (-1), 0, (int) (byte) (-19));
      assertEquals((-82958891), int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, (int) (byte)120, (int) (byte)2, (int) (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-1212), (int) (byte)115, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0, (-1679532753));
      assertEquals((-167203969), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L, 0L, (int) (byte)14);
      assertEquals((-1684485123), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) 1754797035, 16);
      assertEquals((-1913481014), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, 0, (int) (byte) (-58), 2197);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-1028477387), (-1028477387), (-3999));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2056954775
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals(8196844538399943790L, long0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = MurmurHash3.hash32x86(byteArray0, 0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0, (int) (byte)56, (int) (byte)0, (-1));
      assertArrayEquals(new long[] {7706185961851046380L, (-8830396607655164821L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64(byteArray0, (int) (byte) (-39), (-1), 130);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -41
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64(byteArray0, 0, (-2306), (-2349));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2307
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null, (-26), (-19), (-19));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("]$:c1=TU2;Pw");
      assertArrayEquals(new long[] {(-1165006205540261430L), 5472347439193632977L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128(byteArray0, (-167203969), (int) (byte) (-118), 221758722);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -167204088
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {8297479994805284640L, (-1010425036434519540L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-2613151768389018909L), 2529546424875844979L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {4464299780005672250L, 1695411446468745063L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {(-3485513579396041028L), 6383328099726337777L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-8134343811225465012L), 4068162993924431541L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {8478934883742226405L, (-1017287513161072006L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128(byteArray0, 104729, (int) (byte)1, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 104729
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise(2, 2, byteArray0, 65280);
      assertEquals((-2091029602), int0);
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 7);
      assertEquals((-720425247), murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[21];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, (byte)1);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, 4166, 193272463);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4166
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3$IncrementalHash32x86", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 2459, (byte) (-63));
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.start((-802843523));
      assertEquals(1702658556, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[8];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)2, (byte)2);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, (byte)2);
      assertEquals(593689054, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.end();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      int int0 = MurmurHash3.hash32("");
      assertEquals((-965378730), int0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-6740669540557935164L), 6418926938960070244L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      long long0 = MurmurHash3.hash64((long) 0);
      assertEquals((-8620514229188030809L), long0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, (int) (byte)43);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("org.apache.commons.codec.digest.MurmurHash3");
      assertArrayEquals(new long[] {7857037817036204021L, 6968258762365418411L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)2, (int) (byte)2);
      assertEquals(1896840250637076998L, long0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L, (long) (-451195125));
      assertEquals((-1049789089), int0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      int int0 = MurmurHash3.hash32(1L);
      assertEquals((-913662660), int0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }
}
