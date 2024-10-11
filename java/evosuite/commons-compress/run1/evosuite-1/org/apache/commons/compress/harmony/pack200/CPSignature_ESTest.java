
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
      CPUTF8 cPUTF8_0 = new CPUTF8("?P'#Q.rVV>7?>upbk'I");
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
      CPUTF8 cPUTF8_0 = new CPUTF8("?P'#Q.rVV>7?>upbk'I");
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
      CPUTF8 cPUTF8_0 = new CPUTF8("!4w&m");
      CPSignature cPSignature0 = new CPSignature("n~Rs[]VT)7OMd?e;T4", cPUTF8_0, (List<CPClass>) null);
      cPUTF8_0.setIndex(0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertSame(cPUTF8_0, cPUTF8_1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!4w&m");
      cPUTF8_0.setIndex(259);
      CPSignature cPSignature0 = new CPSignature("n~Rs[]VT)7OMd?e;T4", cPUTF8_0, (List<CPClass>) null);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertEquals("!4w&m", cPUTF8_1.getUnderlyingString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!4w&m");
      CPSignature cPSignature0 = new CPSignature("n~Rs[]VT)7OMd?e;T4", cPUTF8_0, (List<CPClass>) null);
      cPUTF8_0.setIndex(0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      cPUTF8_0.setIndex(556);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals(556, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("?P'#Q.rVV>7?>upbk'I");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      linkedList0.offerLast(cPClass0);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("l[et?;:");
      CPSignature cPSignature0 = new CPSignature("l[et?;:", cPUTF8_0, (List<CPClass>) null);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      // Undeclared exception!
      try { 
        cPSignature0.compareTo(cPUTF8_0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.compress.harmony.pack200.CPUTF8 cannot be cast to org.apache.commons.compress.harmony.pack200.CPSignature
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPSignature", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPSignature cPSignature0 = null;
      try {
        cPSignature0 = new CPSignature("(", (CPUTF8) null, (List<CPClass>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPSignature", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+27=hC{)>xJ#]B6-t");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("+27=hC{)>xJ#]B6-t", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.compareTo(cPSignature0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.comress.harmony.pack200.CPConstant");
      CPSignature cPSignature0 = new CPSignature("org.apache.commons.comress.harmony.pack200.CPConstant", cPUTF8_0, (List<CPClass>) null);
      String string0 = cPSignature0.toString();
      assertEquals("org.apache.commons.comress.harmony.pack200.CPConstant", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("RfC");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("RfC", cPUTF8_0, linkedList0);
      CPUTF8 cPUTF8_1 = cPSignature0.getSignatureForm();
      assertEquals("RfC", cPUTF8_1.getUnderlyingString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+27=hC{)>xJ#]B6-t");
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("+27=hC{)>xJ#]B6-t", cPUTF8_0, linkedList0);
      int int0 = cPSignature0.getIndexInCpUtf8();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.comress.harmony.pack200.CPConstant");
      CPSignature cPSignature0 = new CPSignature("org.apache.commons.comress.harmony.pack200.CPConstant", cPUTF8_0, (List<CPClass>) null);
      String string0 = cPSignature0.getUnderlyingString();
      assertEquals("org.apache.commons.comress.harmony.pack200.CPConstant", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.comress.harmony.pack200.CPConstant");
      CPSignature cPSignature0 = new CPSignature("org.apache.commons.comress.harmony.pack200.CPConstant", cPUTF8_0, (List<CPClass>) null);
      List<CPClass> list0 = cPSignature0.getClasses();
      assertNull(list0);
  }
}
