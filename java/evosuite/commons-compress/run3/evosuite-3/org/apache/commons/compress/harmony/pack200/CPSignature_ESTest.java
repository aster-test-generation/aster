
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
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPSignature_ESTest extends CPSignature_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";cs-1ElHK");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      String string0 = cPSignature0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";cs-1ElHK");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      String string0 = cPSignature0.getUnderlyingString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.getUnderlyingString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      cPUTF8_0.setIndex(0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertEquals("", cPUTF8_1.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";cs-1ElHK");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      cPUTF8_0.setIndex(2078);
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertEquals(";cs-1ElHK", cPUTF8_1.getUnderlyingString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      cPUTF8_0.setIndex(0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("K0P");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      cPUTF8_0.setIndex(1462);
      CPSignature cPSignature0 = new CPSignature("K0P", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals(1462, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")erZSY(a");
      CPSignature cPSignature0 = new CPSignature(")erZSY(a", cPUTF8_0, (List<CPClass>) null);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList0.add(cPClass0);
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")erZSY(a");
      CPSignature cPSignature0 = new CPSignature(")erZSY(a", cPUTF8_0, (List<CPClass>) null);
      // Undeclared exception!
      try { 
        cPSignature0.compareTo((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPSignature", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";cs-1ElHK");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        cPSignature0.compareTo(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.compress.harmony.pack200.CPSignature
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPSignature", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = null;
      try {
        cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("VE^7*");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("VE^7*", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.compareTo(cPSignature0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("JuJA4x-;e*w1L(");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("JuJA4x-;e*w1L(", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.toString();
      assertEquals("JuJA4x-;e*w1L(", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("VE^7*");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("VE^7*", cPUTF8_0, linkedList0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertSame(cPUTF8_1, cPUTF8_0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("VE^7*");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("VE^7*", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("VE^7*");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("VE^7*", cPUTF8_0, linkedList0);
      String string0 = cPSignature0.getUnderlyingString();
      assertEquals("VE^7*", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("VE^7*");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("VE^7*", cPUTF8_0, linkedList0);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertEquals(0, list0.size());
  }
}
