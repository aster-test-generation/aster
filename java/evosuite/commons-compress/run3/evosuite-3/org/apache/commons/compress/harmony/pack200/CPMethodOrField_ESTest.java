
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
import org.apache.commons.compress.harmony.pack200.CPMethodOrField;
import org.apache.commons.compress.harmony.pack200.CPNameAndType;
import org.apache.commons.compress.harmony.pack200.CPSignature;
import org.apache.commons.compress.harmony.pack200.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMethodOrField_ESTest extends CPMethodOrField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(SIZg");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      CPMethodOrField cPMethodOrField1 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      // Undeclared exception!
      try { 
        cPMethodOrField0.compareTo(cPMethodOrField1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPMethodOrField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p`U");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("%w8:Nyw", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      
      cPMethodOrField0.setIndexInClassForConstructor(0);
      int int0 = cPMethodOrField0.getIndexInClassForConstructor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("_%6d],]k J;_;j_");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("_%6d],]k J;_;j_", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.setIndexInClassForConstructor(3420);
      int int0 = cPMethodOrField0.getIndexInClassForConstructor();
      assertEquals(3420, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature((String) null, cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      
      cPMethodOrField0.setIndexInClass(0);
      int int0 = cPMethodOrField0.getIndexInClass();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("mKMpf");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      cPMethodOrField0.setIndexInClass(45);
      int int0 = cPMethodOrField0.getIndexInClass();
      assertEquals(45, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPNameAndType0.setIndex(0);
      cPMethodOrField0.getDescIndex();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature(":", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPNameAndType0.setIndex(1176);
      cPMethodOrField0.getDescIndex();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      cPMethodOrField0.getDesc();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      cPSignature0.setIndex(0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.getDesc();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("8+CLb/y;f=s'hAa8O[a");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, (List<CPClass>) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPSignature0.setIndex(3155);
      cPMethodOrField0.getDesc();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      cPUTF8_0.setIndex(0);
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.getDesc();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("8+CLb/y;f=s'hAa8O[a");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, (List<CPClass>) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      cPUTF8_0.setIndex(3155);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.getDesc();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPNameAndType0.setIndex(0);
      cPMethodOrField0.getDesc();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("*]");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPNameAndType0.setIndex(312);
      cPMethodOrField0.getDesc();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8((String) null);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, (CPSignature) null);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField((CPClass) null, cPNameAndType0);
      cPMethodOrField0.getClassName();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(SIZg");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPUTF8_0.setIndex(0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      cPMethodOrField0.getClassName();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("mKMpf");
      cPUTF8_0.setIndex(45);
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      cPMethodOrField0.getClassName();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(SIZg");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.setIndex(0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      cPMethodOrField0.getClassName();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      cPClass0.setIndex(459);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.getClassName();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("_%6d],]k J;_;j_");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("_%6d],]k J;_;j_", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPClass0.setIndex(0);
      cPMethodOrField0.getClassIndex();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("mKMpf");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      cPClass0.setIndex(45);
      cPMethodOrField0.getClassIndex();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.getClassIndex();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      CPUTF8 cPUTF8_1 = new CPUTF8("(HN$t");
      CPClass cPClass1 = new CPClass(cPUTF8_1);
      CPMethodOrField cPMethodOrField1 = new CPMethodOrField(cPClass1, cPNameAndType0);
      int int0 = cPMethodOrField1.compareTo(cPMethodOrField0);
      assertEquals((-1), cPMethodOrField1.getIndexInClass());
      assertEquals(8, int0);
      assertEquals((-1), cPMethodOrField1.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("=]9oCds7-%JpX7.&[m<");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, (CPNameAndType) null);
      // Undeclared exception!
      try { 
        cPMethodOrField0.getDescIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPMethodOrField", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      CPUTF8 cPUTF8_1 = new CPUTF8("(HN$t");
      CPClass cPClass1 = new CPClass(cPUTF8_1);
      CPMethodOrField cPMethodOrField1 = new CPMethodOrField(cPClass1, cPNameAndType0);
      int int0 = cPMethodOrField0.compareTo(cPMethodOrField1);
      assertEquals((-8), int0);
      assertEquals((-1), cPMethodOrField1.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField1.getIndexInClass());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      int int0 = cPMethodOrField0.compareTo(cPMethodOrField0);
      assertEquals(0, int0);
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      int int0 = cPMethodOrField0.compareTo(cPUTF8_0);
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      int int0 = cPMethodOrField0.getIndexInClassForConstructor();
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField((CPClass) null, (CPNameAndType) null);
      // Undeclared exception!
      try { 
        cPMethodOrField0.getClassIndex();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.pack200.CPMethodOrField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      String string0 = cPMethodOrField0.toString();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
      assertEquals(" cqOcV%NT_2vV`:  cqOcV%NT_2vV`:(HN$t", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.pack200.ConstantPoolEntry");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("org.apache.commons.compress.harmony.pack200.ConstantPoolEntry", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      int int0 = cPMethodOrField0.getIndexInClass();
      assertEquals((-1), int0);
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" cqOcV%NT_2vV`");
      CPClass cPClass0 = new CPClass(cPUTF8_0);
      LinkedList<CPClass> linkedList0 = new LinkedList<CPClass>();
      CPSignature cPSignature0 = new CPSignature("(HN$t", cPUTF8_0, linkedList0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPSignature0);
      CPMethodOrField cPMethodOrField0 = new CPMethodOrField(cPClass0, cPNameAndType0);
      cPMethodOrField0.getDescIndex();
      assertEquals((-1), cPMethodOrField0.getIndexInClassForConstructor());
      assertEquals((-1), cPMethodOrField0.getIndexInClass());
  }
}
