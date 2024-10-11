
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
import org.apache.commons.codec.digest.MurmurHash2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MurmurHash2_ESTest extends MurmurHash2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64("", 0, (-492));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = MurmurHash2.hash64("}D8|:bKpno^$6oy`%1");
      assertEquals(2736242395000428613L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = MurmurHash2.hash32("]I71C5;$0/");
      assertEquals(1053346167, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long long0 = MurmurHash2.hash64(byteArray0, 1, (int) (byte) (-1));
      assertEquals((-3985179870062905467L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-1);
      long long0 = MurmurHash2.hash64(byteArray0, 1);
      assertEquals(4036896371686324753L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long long0 = MurmurHash2.hash64("(\"<<}*ju\"3ofiF", 0, 0);
      assertEquals((-7207201254813729732L), long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash2.hash32(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash2.hash32(byteArray0, (int) (byte)0, (-2910));
      assertEquals(329475431, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash2.hash32(byteArray0, (-1756908916));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = MurmurHash2.hash32(byteArray0, (int) (byte)0);
      assertEquals(275646681, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = MurmurHash2.hash32(byteArray0, (-1852));
      assertEquals((-206618097), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = MurmurHash2.hash32("D|62?h");
      assertEquals((-981226102), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((byte[]) null, 260);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((String) null, (-1529), (-1529));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash64((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((byte[]) null, 2124);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32("", 0, (-718));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((String) null, (-2130), (-919));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (int) (byte)5, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (int) (byte) (-38), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -39
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long long0 = MurmurHash2.hash64(byteArray0, 6, 275646681);
      assertEquals(7542726337742270489L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      long long0 = MurmurHash2.hash64(byteArray0, (int) (byte)3, 156);
      assertEquals(3631881734794683060L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (-1572), 679);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1573
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (int) (byte) (-1), (int) (byte) (-28));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash2.hash64(byteArray0, (int) (byte)12, 3196);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long long0 = MurmurHash2.hash64(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash2.hash32((byte[]) null, (-3527), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (int) (byte) (-94), (int) (byte) (-6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -95
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (-1), (int) (byte) (-46));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = MurmurHash2.hash32(byteArray0, (int) (byte)0, (int) (byte) (-1));
      assertEquals((-1285986640), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, 2527, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash2.hash32(byteArray0, (int) (byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash2", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      long long0 = MurmurHash2.hash64(byteArray0, 0);
      assertEquals((-7207201254813729732L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long long0 = MurmurHash2.hash64("X;:I[FFU|6RCk");
      assertEquals((-129034503640629959L), long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = MurmurHash2.hash32("X;:I[FFU|6RCk", 4, 4);
      assertEquals((-243383028), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = MurmurHash2.hash32("hGO");
      assertEquals(1516878047, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = MurmurHash2.hash32("=K3,4,YF;@_~]mq", 1, 1);
      assertEquals(1712047042, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long long0 = MurmurHash2.hash64("=K3,4,YF;@_~]mq");
      assertEquals(7473398494243123511L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long long0 = MurmurHash2.hash64("D|62?h", 1, 1);
      assertEquals(9034721130353681291L, long0);
  }
}
