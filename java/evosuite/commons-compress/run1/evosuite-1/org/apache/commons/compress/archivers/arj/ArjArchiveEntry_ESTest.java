
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


package org.apache.commons.compress.archivers.arj;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.apache.commons.compress.archivers.arj.ArjArchiveEntry;
import org.apache.commons.compress.archivers.arj.LocalFileHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ArjArchiveEntry_ESTest extends ArjArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = 98;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getUnixMode();
      assertEquals(98, arjArchiveEntry0.getHostOs());
      assertFalse(arjArchiveEntry0.isHostOsUnix());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileType = 16;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = 8;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.dateTimeModified = 8;
      Date date0 = arjArchiveEntry0.getLastModifiedDate();
      assertEquals("Thu Jan 01 00:00:08 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileAccessMode = 7;
      localFileHeader0.hostOS = 2;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getUnixMode();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = 2;
      localFileHeader0.fileAccessMode = (-24);
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getUnixMode();
      assertEquals((-24), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.originalSize = 1454L;
      long long0 = arjArchiveEntry0.getSize();
      assertEquals(1454L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.originalSize = (-420L);
      long long0 = arjArchiveEntry0.getSize();
      assertEquals((-420L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.name = "U:PV8W0aUKx10u+";
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      String string0 = arjArchiveEntry0.getName();
      assertEquals("U:PV8W0aUKx10u+", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.name = "";
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      String string0 = arjArchiveEntry0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.fileAccessMode = 1935;
      int int0 = arjArchiveEntry0.getMode();
      assertEquals(1935, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.fileAccessMode = (-1002);
      int int0 = arjArchiveEntry0.getMode();
      assertEquals((-1002), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.method = 7;
      int int0 = arjArchiveEntry0.getMethod();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.method = 272;
      localFileHeader0.method = (-3154);
      int int0 = arjArchiveEntry0.getMethod();
      assertEquals((-3154), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.hostOS = 2945;
      int int0 = arjArchiveEntry0.getHostOs();
      assertEquals(2945, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = (-1616);
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      int int0 = arjArchiveEntry0.getHostOs();
      assertEquals((-1616), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.isHostOsUnix();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.isDirectory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.arjFlags = 16;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getUnixMode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getLastModifiedDate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getHostOs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry((LocalFileHeader) null);
      ArjArchiveEntry arjArchiveEntry1 = new ArjArchiveEntry();
      // Undeclared exception!
      try { 
        arjArchiveEntry0.equals(arjArchiveEntry1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = 2;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.isHostOsUnix();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      boolean boolean0 = arjArchiveEntry0.isHostOsUnix();
      assertFalse(boolean0);
      assertEquals(0, arjArchiveEntry0.getHostOs());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.hostOS = 8;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.isHostOsUnix();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      String string0 = arjArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.fileType = 3;
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      boolean boolean0 = arjArchiveEntry0.isDirectory();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      boolean boolean0 = arjArchiveEntry0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      localFileHeader0.name = "U:PV8W0aUKx10u+";
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      arjArchiveEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      arjArchiveEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      Date date0 = arjArchiveEntry0.getLastModifiedDate();
      assertEquals(0, arjArchiveEntry0.getHostOs());
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      ArjArchiveEntry arjArchiveEntry1 = new ArjArchiveEntry();
      boolean boolean0 = arjArchiveEntry0.equals(arjArchiveEntry1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      boolean boolean0 = arjArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      boolean boolean0 = arjArchiveEntry0.equals(arjArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      Object object0 = new Object();
      boolean boolean0 = arjArchiveEntry0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ArjArchiveEntry.HostOs arjArchiveEntry_HostOs0 = new ArjArchiveEntry.HostOs();
      assertEquals(5, ArjArchiveEntry.HostOs.OS_2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      int int0 = arjArchiveEntry0.getHostOs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      int int0 = arjArchiveEntry0.getMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalFileHeader localFileHeader0 = new LocalFileHeader();
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry(localFileHeader0);
      localFileHeader0.arjFlags = (-1);
      // Undeclared exception!
      try { 
        arjArchiveEntry0.getName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.arj.ArjArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      long long0 = arjArchiveEntry0.getSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ArjArchiveEntry arjArchiveEntry0 = new ArjArchiveEntry();
      int int0 = arjArchiveEntry0.getMethod();
      assertEquals(0, int0);
  }
}
