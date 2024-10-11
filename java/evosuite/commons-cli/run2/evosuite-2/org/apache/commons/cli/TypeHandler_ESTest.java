
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
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TypeHandler_ESTest extends TypeHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = TypeHandler.createValue((String) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<MockThrowable> class0 = MockThrowable.class;
      MockThrowable mockThrowable0 = TypeHandler.createValue((String) null, class0);
      assertNull(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = TypeHandler.createObject("org.apache.commons.cli.TypeHandler");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = TypeHandler.createFile(".~N'");
      assertEquals(0L, file0.getTotalSpace());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = TypeHandler.createFile("/");
      assertEquals(994662584320L, file0.getTotalSpace());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Map<Class<?>, Converter<?, ? extends Throwable>> map0 = TypeHandler.createDefaultMap();
      TypeHandler typeHandler0 = new TypeHandler(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.Converter");
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockDate mockDate0 = new MockDate(2, 2, (-1), (-1273), 0, 16);
      // Undeclared exception!
      try { 
        TypeHandler.createValue("V6BJ|c0\"V9OeztkH[a", (Object) mockDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockDate cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      try { 
        TypeHandler.createClass("uxts");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'uxts.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TypeHandler typeHandler0 = TypeHandler.getDefault();
      Class<MockThrowable> class0 = MockThrowable.class;
      Converter<MockThrowable, ?> converter0 = typeHandler0.getConverter(class0);
      assertNotNull(converter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createDate("^I8c:LNJWQ|gP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: java.text.ParseException: Unparseable date: \"^I8c:LNJWQ|gP\"
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      try { 
        TypeHandler.createURL("org.apache.commons.cli.ParseException");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.net.MalformedURLException: no protocol: org.apache.commons.cli.ParseException
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      try { 
        TypeHandler.createNumber((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFiles("org.apache.commons.cli.ParseException");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not yet implemented
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        TypeHandler.openFile("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.io.FileNotFoundException:  (No such file or directory)
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        TypeHandler.createObject("p 6Wws");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'p 6Wws.class' should be in target project, but could not be found!
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TypeHandler typeHandler0 = new TypeHandler();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.ParseException");
      Object object0 = TypeHandler.createValue("org.apache.commons.cli.ParseException", (Object) class0);
      assertEquals("org.apache.commons.cli.ParseException", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Date> class0 = Date.class;
      try { 
        TypeHandler.createValue("_yI8k6$mw", class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.text.ParseException: Unparseable date: \"_yI8k6$mw\"
         //
         verifyException("org.apache.commons.cli.ParseException", e);
      }
  }
}
