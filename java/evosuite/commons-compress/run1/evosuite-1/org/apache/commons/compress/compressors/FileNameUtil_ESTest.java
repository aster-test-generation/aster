
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


package org.apache.commons.compress.compressors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.compressors.FileNameUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileNameUtil_ESTest extends FileNameUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("q", "0GE1;[Z");
      hashMap0.put("", "b3o8Yr8`f {d6q4tiL");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("g.apache.commons.compress.compressors.filenameutil", "g.apache.commons.compress.compressors.filenameutil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getUncompressedFilename("org.apache.commons.compress.compressors.filenameutil");
      assertEquals("org.apache.commons.compress.compressors.filenameutil", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("q", "0GE1;[Z");
      hashMap0.put("", "b3o8Yr8`f {d6q4tiL");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      String string0 = fileNameUtil0.getUncompressedFilename("0GE1;[Z");
      assertEquals("0GE1;[Zb3o8Yr8`f {d6q4tiL", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(1502, 587.72F);
      hashMap0.put("", "s{{w");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "o#%wX+");
      String string0 = fileNameUtil0.getCompressedFileName("o#%wX+s{{w");
      assertEquals("o#%wX+", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("q", "0GE1;[Z");
      hashMap0.put("", "b3o8Yr8`f {d6q4tiL");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      String string0 = fileNameUtil0.getCompressedFilename("EsH#EEsH#E");
      assertEquals("EsH#EEsH#EEsH#E", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("h>Z*)I{M,qgy7aV&", "h>Z*)I{M,qgy7aV&");
      hashMap0.put("org.apache.commons.compress.compressors.FileNameUtil", "h>Z*)I{M,qgy7aV&");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "h>Z*)I{M,qgy7aV&");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("^v7oj,4", "64Us+&");
      hashMap0.put("64Us+&", "^v7oj,4");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "SA|v%F`:8PQ");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, (String) null);
      String string0 = fileNameUtil0.getUncompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "3");
      // Undeclared exception!
      try { 
        fileNameUtil0.isCompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      // Undeclared exception!
      try { 
        fileNameUtil0.isCompressedFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "_da$/*Se2(-");
      // Undeclared exception!
      try { 
        fileNameUtil0.getUncompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "y--Ls?ao");
      // Undeclared exception!
      try { 
        fileNameUtil0.getUncompressedFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, (String) null);
      // Undeclared exception!
      try { 
        fileNameUtil0.getCompressedFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, (String) null);
      // Undeclared exception!
      try { 
        fileNameUtil0.getCompressedFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileNameUtil fileNameUtil0 = null;
      try {
        fileNameUtil0 = new FileNameUtil((Map<String, String>) null, "O.Si7\"nU~l|");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("^v7oj,4", "64Us+&");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "SA|v%F`:8PQ");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("SA|v%F`:8PQ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(1502, 587.72F);
      hashMap0.put("", "s{{w");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "o#%wX+");
      boolean boolean0 = fileNameUtil0.isCompressedFileName(":M&mSmH");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("6O]=Z^h3", "6O]=Z^h3");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "]=W#`?c!(");
      String string0 = fileNameUtil0.getUncompressedFileName("]=W#`?c!(");
      assertEquals("]=W#`?c!(", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "b3o8Yr8`f {d6q4tiL");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      String string0 = fileNameUtil0.getUncompressedFileName("q");
      assertEquals("qb3o8Yr8`f {d6q4tiL", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("g.apache.commons.compress.compressors.filenameutil", "g.apache.commons.compress.compressors.filenameutil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getUncompressedFileName("} =<]ZOt@wc|uX:zk");
      assertEquals("} =<]ZOt@wc|uX:zk", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("q", "0GE1;[Z");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      String string0 = fileNameUtil0.getCompressedFileName("EsH#EEsH#EEsH#E");
      assertEquals("EsH#EEsH#EEsH#EEsH#E", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("2", "g.apache.commons.compress.compressors.filenameutil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      String string0 = fileNameUtil0.getCompressedFileName("EsH#EEsH#EEsH#E");
      assertEquals("EsH#EEsH#EEsH#EEsH#E", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "b3o8Yr8`f {d6q4tiL");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("0GE1;[Z%/YW>!7LJ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("q", "0GE1;[Z");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("q", "0GE1;[Z");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("0GE1;[Z%/YW>!7LJ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(1502, 587.72F);
      hashMap0.put("", "s{{w");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "o#%wX+");
      String string0 = fileNameUtil0.getUncompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Og'WCC", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "Og'WCC");
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("q", "0GE1;[Z");
      hashMap0.put("2", "g.apache.commons.compress.compressors.filenameutil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "EsH#E");
  }
}
