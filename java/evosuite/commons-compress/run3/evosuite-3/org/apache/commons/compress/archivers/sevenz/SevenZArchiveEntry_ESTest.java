
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SevenZArchiveEntry_ESTest extends SevenZArchiveEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setSize((-959L));
      long long0 = sevenZArchiveEntry0.getSize();
      assertEquals((-959L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setName("8MyBqJe[");
      String string0 = sevenZArchiveEntry0.getName();
      assertEquals("8MyBqJe[", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      FileTime fileTime0 = FileTime.from(19L, timeUnit0);
      sevenZArchiveEntry0.setLastModifiedTime(fileTime0);
      FileTime fileTime1 = sevenZArchiveEntry0.getLastModifiedTime();
      assertSame(fileTime1, fileTime0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      sevenZArchiveEntry0.setCreationTime(fileTime0);
      boolean boolean0 = sevenZArchiveEntry0.getHasCreationDate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasCrc(true);
      boolean boolean0 = sevenZArchiveEntry0.getHasCrc();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      FileTime fileTime0 = FileTime.fromMillis((-959L));
      sevenZArchiveEntry0.setAccessTime(fileTime0);
      boolean boolean0 = sevenZArchiveEntry0.getHasAccessDate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      sevenZArchiveEntry0.setCreationTime(fileTime0);
      FileTime fileTime1 = sevenZArchiveEntry0.getCreationTime();
      assertSame(fileTime1, fileTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCrc(1622);
      long long0 = sevenZArchiveEntry0.getCrcValue();
      assertEquals(1622L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCrc((-2051));
      long long0 = sevenZArchiveEntry0.getCrcValue();
      assertEquals((-2051L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCrcValue(180L);
      int int0 = sevenZArchiveEntry0.getCrc();
      assertEquals(180, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCrcValue((-2895L));
      int int0 = sevenZArchiveEntry0.getCrc();
      assertEquals((-2895), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      Class<SevenZMethodConfiguration> class0 = SevenZMethodConfiguration.class;
      ServiceLoader<SevenZMethodConfiguration> serviceLoader0 = ServiceLoader.loadInstalled(class0);
      sevenZArchiveEntry0.setContentMethods((Iterable<? extends SevenZMethodConfiguration>) serviceLoader0);
      Iterable<? extends SevenZMethodConfiguration> iterable0 = sevenZArchiveEntry0.getContentMethods();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCompressedCrc(1);
      long long0 = sevenZArchiveEntry0.getCompressedCrcValue();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCompressedCrcValue((-1L));
      long long0 = sevenZArchiveEntry0.getCompressedCrcValue();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCompressedCrc(7);
      int int0 = sevenZArchiveEntry0.getCompressedCrc();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCompressedCrc((-132));
      int int0 = sevenZArchiveEntry0.getCompressedCrc();
      assertEquals((-132), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasAccessDate(true);
      FileTime fileTime0 = sevenZArchiveEntry0.getAccessTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.setContentMethods((SevenZMethodConfiguration[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasCreationDate(true);
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getCreationDate();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasAccessDate(true);
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getAccessDate();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getLastModifiedTime();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The entry doesn't have this timestamp
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasLastModifiedDate(true);
      FileTime fileTime0 = sevenZArchiveEntry0.getLastModifiedTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getCreationTime();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The entry doesn't have this timestamp
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getAccessTime();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The entry doesn't have this timestamp
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      FileTime fileTime0 = FileTime.fromMillis(0L);
      sevenZArchiveEntry0.setLastModifiedTime(fileTime0);
      boolean boolean0 = sevenZArchiveEntry0.getHasLastModifiedDate();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setLastModifiedTime((FileTime) null);
      assertFalse(sevenZArchiveEntry0.getHasLastModifiedDate());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCreationTime((FileTime) null);
      assertFalse(sevenZArchiveEntry0.getHasCreationDate());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setContentMethods((Iterable<? extends SevenZMethodConfiguration>) null);
      assertFalse(sevenZArchiveEntry0.hasStream());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setAccessTime((FileTime) null);
      assertFalse(sevenZArchiveEntry0.getHasAccessDate());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasLastModifiedDate(true);
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getLastModifiedDate();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      FileTime fileTime0 = FileTime.fromMillis((-959L));
      sevenZArchiveEntry0.setAccessTime(fileTime0);
      FileTime fileTime1 = sevenZArchiveEntry0.getAccessTime();
      assertSame(fileTime1, fileTime0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      Object object0 = new Object();
      boolean boolean0 = sevenZArchiveEntry0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getAccessDate();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The entry doesn't have this timestamp
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasWindowsAttributes(true);
      assertTrue(sevenZArchiveEntry0.getHasWindowsAttributes());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      long long0 = sevenZArchiveEntry0.getCompressedSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      // Undeclared exception!
      try { 
        SevenZArchiveEntry.javaTimeToNtfsTime(mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.getHasCrc();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setDirectory(true);
      boolean boolean0 = sevenZArchiveEntry0.isDirectory();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.hasStream();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.getHasLastModifiedDate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      MockDate mockDate0 = new MockDate(0, 0, 0);
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.setCreationDate((Date) mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setAntiItem(true);
      assertTrue(sevenZArchiveEntry0.isAntiItem());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.setLastModifiedDate((Date) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.setLastModifiedDate(0L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      int int0 = sevenZArchiveEntry0.getWindowsAttributes();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      int int0 = sevenZArchiveEntry0.getCrc();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      Iterable<? extends SevenZMethodConfiguration> iterable0 = sevenZArchiveEntry0.getContentMethods();
      assertNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        SevenZArchiveEntry.ntfsTimeToJavaTime((-359L));
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      int int0 = sevenZArchiveEntry0.getCompressedCrc();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      SevenZMethodConfiguration[] sevenZMethodConfigurationArray0 = new SevenZMethodConfiguration[1];
      sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray0);
      assertFalse(sevenZArchiveEntry0.getHasLastModifiedDate());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      String string0 = sevenZArchiveEntry0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setSize(685L);
      long long0 = sevenZArchiveEntry0.getSize();
      assertEquals(685L, long0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      MockDate mockDate0 = new MockDate(1856, 0, 2347, 0, 1856);
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.setAccessDate((Date) mockDate0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getCreationDate();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The entry doesn't have this timestamp
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setWindowsAttributes((-1057));
      assertEquals((-1057), sevenZArchiveEntry0.getWindowsAttributes());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasCreationDate(true);
      FileTime fileTime0 = sevenZArchiveEntry0.getCreationTime();
      assertNull(fileTime0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.getHasCreationDate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.getHasAccessDate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setHasStream(true);
      boolean boolean0 = sevenZArchiveEntry0.hasStream();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCompressedCrcValue(0L);
      assertEquals(0L, sevenZArchiveEntry0.getCrcValue());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.setCreationDate(237L);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      long long0 = sevenZArchiveEntry0.getCompressedCrcValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      long long0 = sevenZArchiveEntry0.getCrcValue();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setName("x");
      sevenZArchiveEntry0.hashCode();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      sevenZArchiveEntry0.setCompressedSize((-953L));
      long long0 = sevenZArchiveEntry0.getCompressedSize();
      assertEquals((-953L), long0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.isAntiItem();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.getHasWindowsAttributes();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      boolean boolean0 = sevenZArchiveEntry0.isDirectory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      long long0 = sevenZArchiveEntry0.getSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.getLastModifiedDate();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The entry doesn't have this timestamp
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      // Undeclared exception!
      try { 
        sevenZArchiveEntry0.setAccessDate((long) 0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/io/file/attribute/FileTimes
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
      }
  }
}
