
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
import org.apache.commons.compress.compressors.FileNameUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FileNameUtil_ESTest extends FileNameUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      hashMap0.put("", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("opCGr");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("ors.filenameutil", "ors.filenameutil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "8Dd3e;6>g'C/lNk");
      String string0 = fileNameUtil0.getUncompressedFilename("org.apache.commons.compress.compressors.FileNameUtil");
      assertEquals("org.apache.commons.compress.compressors.filenameutil", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("ixLQi]oIe(d&P2Nk&", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFilename("ixLQi]oIe(d&P2Nk&");
      assertEquals("ixLQi]oIe(d&P2Nk&", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "x[");
      hashMap0.put("org.apache.commons.compress.compressors.FileNameUtil", "org.apache.commons.compress.compressors.FileNameUtil");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "x[");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(">2%t", "CE)xbj1'xJ");
      hashMap0.put("CE)xbj1'xJ", "Qo");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "ch?9.<dfW");
      String string0 = fileNameUtil0.getCompressedFilename("ch?9.<dfW");
      assertEquals("ch?9.<dfWch?9.<dfW", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("FdfH-e", "");
      hashMap0.put("}!4;pK", "}!4;pK");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, (String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("2oe6Jk>Z[S d6wXar ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "IbSd5\"E:CqnW#6D,JcP");
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
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, (String) null);
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
  public void test13()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
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
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
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
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "(+).I(p+FI>k0");
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
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
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
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      FileNameUtil fileNameUtil0 = null;
      try {
        fileNameUtil0 = new FileNameUtil(hashMap0, "f1'pTm\u0003");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.compressors.FileNameUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("opCGr");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getUncompressedFileName("org.apache.commons.compress.compressors.FileNameUtil");
      assertEquals("org.apache.commons.compress.compressors.FileNameUtil}$", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("x.", "x.");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getUncompressedFileName("org.apache.commons.compress.compressors.FileNameUtil");
      assertEquals("org.apache.commons.compress.compressors.FileNameUtil", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getCompressedFileName("$?0'2hbhorg.apache.commons.compress.compressors.FileNameUtil}$");
      assertEquals("$?0'2hbhorg.apache.commons.compress.compressors.FileNameUtil}$", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getCompressedFileName("");
      assertEquals("org.apache.commons.compress.compressors.FileNameUtil", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      hashMap0.put("", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getUncompressedFileName("org.apache.commons.compress.compressors.FileNameUtil");
      assertEquals("org.apache.commons.compress.compressors.FileNameUtil}$", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("ZC`aE|9m<J", "ZC`aE|9m<J");
      hashMap0.put("ixLQi]oIe(d&P2Nk&", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("}$", "}$");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "org.apache.commons.compress.compressors.FileNameUtil");
      String string0 = fileNameUtil0.getCompressedFileName("$?0'2hbh");
      assertEquals("$?0'2hbhorg.apache.commons.compress.compressors.FileNameUtil", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("");
      assertFalse(boolean0);
  }
}
