
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


package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.Date;
import java.util.Map;
import org.apache.commons.cli.Converter;
import org.apache.commons.cli.TypeHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TypeHandler_ESTest extends TypeHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Number number0 = TypeHandler.createNumber("6");
      assertEquals(6L, number0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = TypeHandler.createValue((String) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = TypeHandler.createValue("qOWB]Z", (Object) null);
      assertEquals("qOWB]Z", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = TypeHandler.createObject("org.apache.commons.cli.TypeHandler");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = TypeHandler.createFile(".Cq");
      assertNull(file0.getParent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = TypeHandler.createFile("");
      assertFalse(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Map<Class<?>, Converter<?, ? extends Throwable>> map0 = TypeHandler.createDefaultMap();
      TypeHandler typeHandler0 = new TypeHandler(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.Converter");
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.ParseException");
      assertEquals(1, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        TypeHandler.createValue("EEE MMM dd HH:mm:ss zzz yyyy", (Object) mockDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockDate cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Date> class0 = Date.class;
      try { 
        TypeHandler.createValue("", class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.text.ParseException: Unparseable date: \"\"
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFile((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: java.lang.NullPointerException
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Throwable> class0 = Throwable.class;
      Throwable throwable0 = TypeHandler.createValue((String) null, class0);
      assertNull(throwable0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createDate("B-5/#E+O2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: java.text.ParseException: Unparseable date: \"B-5/#E+O2\"
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        TypeHandler.createURL("Q~cXa[ka=V(e{:");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.net.MalformedURLException: no protocol: Q~cXa[ka=V(e{:
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        TypeHandler.createNumber("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NumberFormatException: For input string: \"\"
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFiles("Ye-%Vl f5");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not yet implemented
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        TypeHandler.openFile((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException: name can't be null
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Date> class0 = Date.class;
      try { 
        TypeHandler.createValue("", (Object) class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.text.ParseException: Unparseable date: \"\"
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = TypeHandler.createFile("/_;-L(>|xkU[h(+49<d");
      assertEquals(0L, file0.getFreeSpace());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TypeHandler typeHandler0 = new TypeHandler();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        TypeHandler.createClass("/_;-L(>|xkU[h(+49<d");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: /_;-L(>|xkU[h(+49<d
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        TypeHandler.createObject((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }
}
