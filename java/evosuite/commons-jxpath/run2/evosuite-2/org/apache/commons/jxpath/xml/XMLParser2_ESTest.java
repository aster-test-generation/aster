
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


package org.apache.commons.jxpath.xml;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.net.URL;
import org.apache.commons.jxpath.xml.DOMParser;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.JDOMParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XMLParser2_ESTest extends XMLParser2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "Unsupported XML model: ");
      assertFalse(documentContainer0.isValidating());
      
      documentContainer0.setValidating(true);
      boolean boolean0 = documentContainer0.isValidating();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      boolean boolean0 = dOMParser0.isValidating();
      assertFalse(dOMParser0.isIgnoringComments());
      assertFalse(dOMParser0.isIgnoringElementContentWhitespace());
      assertFalse(boolean0);
      assertTrue(dOMParser0.isExpandEntityReferences());
      assertFalse(dOMParser0.isCoalescing());
      assertTrue(dOMParser0.isNamespaceAware());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      boolean boolean0 = documentContainer0.isNamespaceAware();
      assertFalse(documentContainer0.isIgnoringComments());
      assertFalse(documentContainer0.isValidating());
      assertTrue(boolean0);
      assertTrue(documentContainer0.isExpandEntityReferences());
      assertFalse(documentContainer0.isCoalescing());
      assertFalse(documentContainer0.isIgnoringElementContentWhitespace());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      assertTrue(jDOMParser0.isNamespaceAware());
      
      jDOMParser0.setNamespaceAware(false);
      boolean boolean0 = jDOMParser0.isNamespaceAware();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      assertFalse(dOMParser0.isIgnoringElementContentWhitespace());
      
      dOMParser0.setIgnoringElementContentWhitespace(true);
      boolean boolean0 = dOMParser0.isIgnoringElementContentWhitespace();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      boolean boolean0 = documentContainer0.isIgnoringElementContentWhitespace();
      assertFalse(documentContainer0.isValidating());
      assertTrue(documentContainer0.isNamespaceAware());
      assertTrue(documentContainer0.isExpandEntityReferences());
      assertFalse(boolean0);
      assertFalse(documentContainer0.isIgnoringComments());
      assertFalse(documentContainer0.isCoalescing());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      assertFalse(dOMParser0.isIgnoringComments());
      
      dOMParser0.setIgnoringComments(true);
      boolean boolean0 = dOMParser0.isIgnoringComments();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      boolean boolean0 = dOMParser0.isIgnoringComments();
      assertFalse(dOMParser0.isCoalescing());
      assertFalse(boolean0);
      assertTrue(dOMParser0.isNamespaceAware());
      assertTrue(dOMParser0.isExpandEntityReferences());
      assertFalse(dOMParser0.isValidating());
      assertFalse(dOMParser0.isIgnoringElementContentWhitespace());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      boolean boolean0 = jDOMParser0.isExpandEntityReferences();
      assertTrue(jDOMParser0.isNamespaceAware());
      assertFalse(jDOMParser0.isIgnoringElementContentWhitespace());
      assertFalse(jDOMParser0.isCoalescing());
      assertFalse(jDOMParser0.isIgnoringComments());
      assertFalse(jDOMParser0.isValidating());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      assertTrue(dOMParser0.isExpandEntityReferences());
      
      dOMParser0.setExpandEntityReferences(false);
      boolean boolean0 = dOMParser0.isExpandEntityReferences();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDOMParser jDOMParser0 = new JDOMParser();
      assertFalse(jDOMParser0.isCoalescing());
      
      jDOMParser0.setCoalescing(true);
      boolean boolean0 = jDOMParser0.isCoalescing();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DOMParser dOMParser0 = new DOMParser();
      boolean boolean0 = dOMParser0.isCoalescing();
      assertFalse(dOMParser0.isValidating());
      assertFalse(boolean0);
      assertFalse(dOMParser0.isIgnoringComments());
      assertTrue(dOMParser0.isNamespaceAware());
      assertTrue(dOMParser0.isExpandEntityReferences());
      assertFalse(dOMParser0.isIgnoringElementContentWhitespace());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(byteArrayInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // DOM parser error; Premature end of file.
         //
         verifyException("org.apache.commons.jxpath.xml.DOMParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(pipedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: 
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }
}
