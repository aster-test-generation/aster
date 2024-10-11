
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
  public void test000()  throws Throwable  {
      long long0 = MurmurHash3.hash64((-1L));
      assertEquals((-6995933311723732776L), long0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte) (-95);
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals((-8772831777792709707L), long0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)78;
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)0, (int) (byte)78, (int) (byte)126);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)1;
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-1830833681), int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)3;
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-1545644497), int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-9);
      byteArray0[5] = (byte)21;
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals((-1918665957), int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-109);
      byteArray0[6] = (byte) (-23);
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals((-354084766), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-55);
      int int0 = murmurHash3_IncrementalHash32x86_0.finalise((-7), 1, byteArray0, (byte) (-55));
      assertEquals((-595509947), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)4, (byte)4);
      assertEquals(593689054, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[1];
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, (byte)0);
      assertEquals(0, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)27;
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 0, 3);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1518);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)1;
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, (byte)1);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)1, 1074);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-58);
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 0, 3);
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)0, 1518);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = MurmurHash3.hash64((byte[]) null, 0, 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long long0 = MurmurHash3.hash64(byteArray0, 1, 0, (int) (byte) (-91));
      assertEquals((-4411139980367603026L), long0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long long0 = MurmurHash3.hash64(byteArray0, (int) (byte)5, 0);
      assertEquals(8404154273843829576L, long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      long long0 = MurmurHash3.hash64(byteArray0, 1051, (int) (byte) (-80));
      assertEquals((-5324867338891841683L), long0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short) (-463));
      assertEquals((-1891553162187308712L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      long long0 = MurmurHash3.hash64(1L);
      assertEquals(6840239832827182823L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      long long0 = MurmurHash3.hash64((-2153));
      assertEquals((-501725405897608999L), long0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = MurmurHash3.hash32x86(byteArray0, (-1), (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-71);
      int int0 = MurmurHash3.hash32x86(byteArray0, 0, (int) (byte)1, 0);
      assertEquals((-1656075834), int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash3.hash32(byteArray0, (-1416), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      int int0 = MurmurHash3.hash32(byteArray0, (-1), 0, 44);
      assertEquals(2129619989, int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32(byteArray0, 0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = MurmurHash3.hash32(byteArray0, (-272), (int) (byte)0);
      assertEquals(979059560, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = MurmurHash3.hash32(byteArray0, 8);
      assertEquals(1754797035, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-113);
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals((-1210822732), int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) (byte)126, (long) (byte)126, (int) (byte)105);
      assertEquals(879628560, int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) 1843924902, (long) 1843924902);
      assertEquals(1686579094, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = MurmurHash3.hash32(0L, (-965378730));
      assertEquals((-274369748), int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) (byte) (-113));
      assertEquals((-1026479100), int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0, (int) (byte)5, (int) (byte)1, (-1398));
      assertArrayEquals(new long[] {3959542805077060281L, 1755884286147430877L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long[] longArray0 = MurmurHash3.hash128(byteArray0, (-1913), (int) (byte)0, (int) (byte)0);
      assertArrayEquals(new long[] {0L, 0L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, (-1689), 1754, (-1689));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 1230060845, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1230060845
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
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
  public void test037()  throws Throwable  {
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
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 2577, 1143, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (byte) (-17), (int) (byte) (-17));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -18
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32((byte[]) null, 944331445);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-1067));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1068
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64((byte[]) null, 911036041, 911036041, (-433));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash128((byte[]) null, (-1396769749), (-7), (-7));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)0, (-3564), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3565
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-314), (int) (byte) (-71), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -386
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 24, (-1), (int) (byte) (-69));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (-422744173), (-1277), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -422745451
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, 12, (-27), (int) (byte)30);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -16
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)116, (int) (byte) (-38), (-9));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 77
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = MurmurHash3.hash32x86(byteArray0, 0, (int) (byte)1, 0);
      assertEquals(1364076727, int0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null, (-4194), (-1), 1842);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86(byteArray0, 24, (-446), 24);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -423
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (int) (short) (-1), 1, (-1678));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, (-1458), (-1546), 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3005
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = MurmurHash3.hash32(byteArray0, (-2480), 0, 5);
      assertEquals((-871541811), int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash32(byteArray0, 9, (int) (byte)3, (int) (byte)1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 11
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = MurmurHash3.hash32(byteArray0, 0, 2139);
      assertEquals((-423416540), int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = MurmurHash3.hash32(5545529020109919103L, (long) (-1994), (-1994));
      assertEquals((-467123375), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) (byte) (-113), (int) (byte) (-113));
      assertEquals(545180443, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      long long0 = MurmurHash3.hash64(byteArray0, 348300725, (int) (byte)0, 4312);
      assertEquals(2168534395917468363L, long0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        MurmurHash3.hash64(byteArray0, (int) (byte)72, (-1226), 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1155
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      long long0 = MurmurHash3.hash64(byteArray0);
      assertEquals(1187580377513868106L, long0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals((-111685489), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MurmurHash3.hash32("+^nf:QX");
      assertEquals(911036041, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = MurmurHash3.hash32(byteArray0);
      assertEquals(635985630, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {5457549051747178710L, (-5447761339710104394L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128x64(byteArray0, (int) (byte)0, (int) (byte) (-1), (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        MurmurHash3.hash128(byteArray0, (-835), (-2754), (int) (byte) (-13));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3590
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("NCP@QOa^-10q");
      assertArrayEquals(new long[] {3637858125776797433L, 4775128236970720474L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {(-1826237121627192382L), (-1808625779244683253L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("org.apache.commons.codec.binary.StringUtils");
      assertArrayEquals(new long[] {7334797136032526111L, 2607759571605985156L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {2945182322382062539L, (-984742418921750958L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {(-863911184844273265L), 3307197894665247746L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("duz:*");
      assertArrayEquals(new long[] {(-8207054066794437613L), 1682285310045395992L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {4464299780005672250L, 1695411446468745063L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        murmurHash3_IncrementalHash32x86_0.finalise(0, 3, byteArray0, (byte) (-53));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3$IncrementalHash32x86", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 6, 6);
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, (byte)4, 6);
      assertEquals((-650046389), murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.add(byteArray0, 0, (byte) (-14));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      murmurHash3_IncrementalHash32x86_0.start((byte)42);
      assertEquals(142593372, murmurHash3_IncrementalHash32x86_0.end());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      MurmurHash3.IncrementalHash32x86 murmurHash3_IncrementalHash32x86_0 = new MurmurHash3.IncrementalHash32x86();
      int int0 = murmurHash3_IncrementalHash32x86_0.end();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("4X=8=[aDEVd\"Ls$I`XV");
      assertArrayEquals(new long[] {8798206937649689455L, (-4848141336759828567L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      long long0 = MurmurHash3.hash64((short)0);
      assertEquals(1896840250637076998L, long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      int int0 = MurmurHash3.hash32("J");
      assertEquals((-1044388420), int0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      long[] longArray0 = MurmurHash3.hash128("H>|r)~lS@");
      assertArrayEquals(new long[] {3905179349219105251L, (-4834556514073943274L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      long[] longArray0 = MurmurHash3.hash128x64(byteArray0);
      assertArrayEquals(new long[] {(-3485513579396041028L), 6383328099726337777L}, longArray0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = MurmurHash3.hash32(byteArray0, (int) (byte)0);
      assertEquals((-965378730), int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      long long0 = MurmurHash3.hash64((int) (byte)42);
      assertEquals(8831750612535747064L, long0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
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
  public void test095()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long[] longArray0 = MurmurHash3.hash128(byteArray0);
      assertArrayEquals(new long[] {8478934883742226405L, (-1017287513161072006L)}, longArray0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash32x86((byte[]) null, (-1044), 564, 564);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      // Undeclared exception!
      try { 
        MurmurHash3.hash64((byte[]) null, 634, (-1462));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.MurmurHash3", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int int0 = MurmurHash3.hash32((long) 1582, (long) (byte)42);
      assertEquals((-154665125), int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = MurmurHash3.hash32x86(byteArray0);
      assertEquals(821347078, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = MurmurHash3.hash32((-8663945395140668459L));
      assertEquals(1171583124, int0);
  }
}
