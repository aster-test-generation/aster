
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
      hashMap0.put("Zth6)[s\"ObC", "");
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("&}O`V#Cz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Zth6)[s\"ObC", "");
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Zth6)[s\"ObC", "");
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      String string0 = fileNameUtil0.getUncompressedFileName("pnF?ztQT{\"");
      assertEquals("pnF?ztQT{\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("dHy1s@#bb k]Z*", "dHy1s@#bb k]Z*");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "e#Bxm0i]`*hL");
      String string0 = fileNameUtil0.getCompressedFileName("dHy1s@#bb k]Z*");
      assertEquals("dHy1s@#bb k]Z*e#Bxm0i]`*hL", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("ai)'b3wI", "r37<)HMrO");
      hashMap0.put("Hya6p)aG/)2sAs;E+Up", "Hya6p)aG/)2sAs;E+Up");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getCompressedFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("[+?Y{&JD>%5\"o]l8", "ijpm4*AxM");
      hashMap0.put("", "[+?Y{&JD>%5\"o]l8");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "ijpm4*AxM");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("ijpm4*AxM", "[+?Y{&JD>%5\"o]l8");
      hashMap0.put("[+?Y{&JD>%5\"o]l8", "ijpm4*AxM");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "ijpm4*AxM");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
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
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "e#Bxm0i]`*hL");
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "E|aPWk*6zZ8");
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put((String) null, (String) null);
      FileNameUtil fileNameUtil0 = null;
      try {
        fileNameUtil0 = new FileNameUtil(hashMap0, "WY0,");
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
      hashMap0.put("", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("Hya6p)aG/)2sAs;E+Up");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Zth6)[s\"ObC", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      boolean boolean0 = fileNameUtil0.isCompressedFileName("KF,.h2;b='!~!VAR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "");
      String string0 = fileNameUtil0.getUncompressedFileName("Hya6p)aG/)2sAs;E+Up");
      assertEquals("Hya6p)aG/)2sAs;E+Up", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      String string0 = fileNameUtil0.getCompressedFileName("KF,.h2;b='!~!VAR|m9d");
      assertEquals("KF,.h2;b='!~!VAR|m9d", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      String string0 = fileNameUtil0.getCompressedFileName("KF,.h2;b='!~!VAR");
      assertEquals("KF,.h2;b='!~!VAR|m9d", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("KF,.h2;b='!~!VA;|m9d");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("d3k5", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      boolean boolean0 = fileNameUtil0.isCompressedFilename("KF,.h2;b='!~!VA;");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      String string0 = fileNameUtil0.getUncompressedFilename("KF,.h2;b='!~!VA;|m9d");
      assertEquals("KF,.h2;b='!~!VA;|m9d", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("d3k5", "");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      String string0 = fileNameUtil0.getUncompressedFilename("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("|m9d", "|m9d");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "|m9d");
      String string0 = fileNameUtil0.getCompressedFilename("KF,.h2;b='!~!VA;|m9d");
      assertEquals("KF,.h2;b='!~!VA;|m9d", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Djyo", "pId{");
      hashMap0.put("pId{", "Djyo");
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "Djyo");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      FileNameUtil fileNameUtil0 = new FileNameUtil(hashMap0, "fnIxycTc17");
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
}
