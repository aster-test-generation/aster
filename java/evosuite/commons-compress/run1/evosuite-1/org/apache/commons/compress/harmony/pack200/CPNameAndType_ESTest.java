
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


package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.pack200.CPClass;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPNameAndType_ESTest extends CPNameAndType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_0, cPSignature0);
      int int0 = cPNameAndType0.compareTo(cPNameAndType1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("d\"auK[l`CW>Y'@x6eFZ");
      CPSignature cPSignature0 = new CPSignature("&PKs", cPUTF8_0, (List<CPClass>) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      cPSignature0.setIndex(0);
      int int0 = cPNameAndType0.getTypeIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("P");
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, (List<CPClass>) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      cPSignature0.setIndex(2384);
      int int0 = cPNameAndType0.getTypeIndex();
      assertEquals(2384, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      int int0 = cPNameAndType0.getTypeIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      cPUTF8_0.setIndex(0);
      int int0 = cPNameAndType0.getNameIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPSignature cPSignature0 = new CPSignature("Mv=L=arIPw[", cPUTF8_0, (List<CPClass>) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      cPUTF8_0.setIndex(1826);
      int int0 = cPNameAndType0.getNameIndex();
      assertEquals(1826, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      String string0 = cPNameAndType0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPSignature cPSignature0 = new CPSignature("Mv=L=arIPw[", cPUTF8_0, (List<CPClass>) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      String string0 = cPNameAndType0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPSignature cPSignature1 = new CPSignature("8}i/Xa@ji_,r'Hyb", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_0, cPSignature1);
      int int0 = cPNameAndType0.compareTo(cPNameAndType1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPNameAndType cPNameAndType0 = new CPNameAndType((CPUTF8) null, (CPSignature) null);
      // Undeclared exception!
      try { 
        cPNameAndType0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPNameAndType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      // Undeclared exception!
      try { 
        cPNameAndType0.compareTo(cPNameAndType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPNameAndType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPSignature cPSignature1 = new CPSignature("<5l.$kKBwT2$kJvC+:<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_0, cPSignature1);
      int int0 = cPNameAndType0.compareTo(cPNameAndType1);
      assertEquals((-18), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      Object object0 = new Object();
      int int0 = cPNameAndType0.compareTo(object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      String string0 = cPNameAndType0.toString();
      assertEquals("<5l.$kKBwT2$kJvC+:<5l.$kKBwT2$kJvC+", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<5l.$kKBwT2$kJvC+");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("<5l.$kKBwT2$kJvC+", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      int int0 = cPNameAndType0.getNameIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("#2nFj-){A~1V+7 cQ+;");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      String string0 = cPNameAndType0.getName();
      assertEquals("#2nFj-){A~1V+7 cQ+;", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("#2nFj-){A~1V+7 cQ+;");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      // Undeclared exception!
      try { 
        cPNameAndType0.getTypeIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPNameAndType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType((CPUTF8) null, cPSignature0);
      // Undeclared exception!
      try { 
        cPNameAndType0.getNameIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPNameAndType", e);
      }
  }
}
