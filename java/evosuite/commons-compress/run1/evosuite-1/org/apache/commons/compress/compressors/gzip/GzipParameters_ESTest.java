
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


package org.apache.commons.compress.compressors.gzip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.gzip.GzipParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GzipParameters_ESTest extends GzipParameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel(9);
      assertEquals(9, gzipParameters0.getCompressionLevel());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setCompressionLevel((-1));
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(255, gzipParameters0.getOperatingSystem());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      // Undeclared exception!
      try { 
        gzipParameters0.setBufferSize(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid buffer size: 0
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipParameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      assertEquals(255, gzipParameters0.getOperatingSystem());
      
      gzipParameters0.setOperatingSystem(0);
      int int0 = gzipParameters0.getOperatingSystem();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setOperatingSystem((-24));
      int int0 = gzipParameters0.getOperatingSystem();
      assertEquals((-24), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setModificationTime(3331);
      long long0 = gzipParameters0.getModificationTime();
      assertEquals(3331L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setModificationTime((-1683));
      long long0 = gzipParameters0.getModificationTime();
      assertEquals((-1683L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setFileName("d8@$7\"6Q` G\"");
      gzipParameters0.getFilename();
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setFileName("");
      gzipParameters0.getFilename();
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(512, gzipParameters0.getBufferSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setFileName("");
      gzipParameters0.getFileName();
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setDeflateStrategy(596);
      int int0 = gzipParameters0.getDeflateStrategy();
      assertEquals(596, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setDeflateStrategy((-1));
      int int0 = gzipParameters0.getDeflateStrategy();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      
      gzipParameters0.setCompressionLevel(1);
      int int0 = gzipParameters0.getCompressionLevel();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setComment("ZZWwx0Xt");
      gzipParameters0.getComment();
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(255, gzipParameters0.getOperatingSystem());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setComment("");
      gzipParameters0.getComment();
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      // Undeclared exception!
      try { 
        gzipParameters0.setCompressionLevel(2375);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid gzip compression level: 2375
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipParameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      
      gzipParameters0.setCompressionLevel(0);
      int int0 = gzipParameters0.getCompressionLevel();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      // Undeclared exception!
      try { 
        gzipParameters0.setCompressionLevel((-857));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid gzip compression level: -857
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipParameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      // Undeclared exception!
      try { 
        gzipParameters0.setBufferSize((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid buffer size: -1
         //
         verifyException("org.apache.commons.compress.compressors.gzip.GzipParameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      assertEquals(512, gzipParameters0.getBufferSize());
      
      gzipParameters0.setBufferSize(1);
      assertEquals(1, gzipParameters0.getBufferSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      int int0 = gzipParameters0.getCompressionLevel();
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals((-1), int0);
      assertEquals(512, gzipParameters0.getBufferSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      int int0 = gzipParameters0.getOperatingSystem();
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(255, int0);
      assertEquals(512, gzipParameters0.getBufferSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.getFileName();
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(512, gzipParameters0.getBufferSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      int int0 = gzipParameters0.getBufferSize();
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(512, int0);
      assertEquals(255, gzipParameters0.getOperatingSystem());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      int int0 = gzipParameters0.getDeflateStrategy();
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals(0, int0);
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(512, gzipParameters0.getBufferSize());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.getComment();
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(512, gzipParameters0.getBufferSize());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.getFilename();
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(255, gzipParameters0.getOperatingSystem());
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.setFilename("Invalid gzip compression level: ");
      gzipParameters0.getFileName();
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals(255, gzipParameters0.getOperatingSystem());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GzipParameters gzipParameters0 = new GzipParameters();
      gzipParameters0.getModificationTime();
      assertEquals(512, gzipParameters0.getBufferSize());
      assertEquals((-1), gzipParameters0.getCompressionLevel());
      assertEquals(0, gzipParameters0.getDeflateStrategy());
      assertEquals(255, gzipParameters0.getOperatingSystem());
  }
}
