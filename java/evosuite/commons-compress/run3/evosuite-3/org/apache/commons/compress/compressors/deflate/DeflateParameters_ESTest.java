
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


package org.apache.commons.compress.compressors.deflate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.compressors.deflate.DeflateParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DeflateParameters_ESTest extends DeflateParameters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      assertEquals((-1), deflateParameters0.getCompressionLevel());
      
      deflateParameters0.setCompressionLevel(9);
      int int0 = deflateParameters0.getCompressionLevel();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      // Undeclared exception!
      try { 
        deflateParameters0.setCompressionLevel(2901);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Deflate compression level: 2901
         //
         verifyException("org.apache.commons.compress.compressors.deflate.DeflateParameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      assertEquals((-1), deflateParameters0.getCompressionLevel());
      
      deflateParameters0.setCompressionLevel(0);
      int int0 = deflateParameters0.getCompressionLevel();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      // Undeclared exception!
      try { 
        deflateParameters0.setCompressionLevel((-998));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid Deflate compression level: -998
         //
         verifyException("org.apache.commons.compress.compressors.deflate.DeflateParameters", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      int int0 = deflateParameters0.getCompressionLevel();
      assertEquals((-1), int0);
      assertTrue(deflateParameters0.withZlibHeader());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      boolean boolean0 = deflateParameters0.withZlibHeader();
      assertEquals((-1), deflateParameters0.getCompressionLevel());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DeflateParameters deflateParameters0 = new DeflateParameters();
      assertTrue(deflateParameters0.withZlibHeader());
      
      deflateParameters0.setWithZlibHeader(false);
      boolean boolean0 = deflateParameters0.withZlibHeader();
      assertFalse(boolean0);
  }
}
