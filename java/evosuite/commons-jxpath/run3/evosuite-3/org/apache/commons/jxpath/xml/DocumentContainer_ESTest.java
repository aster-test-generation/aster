
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.XMLParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DocumentContainer_ESTest extends DocumentContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      String string0 = "org.apache.commons.jxpath.xml.XMLParser2";
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "org.apache.commons.jxpath.xml.XMLParser2");
      documentContainer0.setExpandEntityReferences(true);
      documentContainer0.setCoalescing(true);
      InputStream inputStream0 = null;
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(inputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: org.apache.commons.jxpath.xml.XMLParser2
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = null;
      String string0 = "org.apache.commons.jxpath.xml.DocumentContainer";
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null, "org.apache.commons.jxpath.xml.DocumentContainer");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/fooExample; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "JRN";
      int int0 = 0;
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("", "JRN", 0, "JRN", uRLStreamHandler0);
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      DocumentContainer.registerXMLParser("Cannot allocate XMLParser: ", (XMLParser) documentContainer0);
      String string0 = "DOM parser error";
      DocumentContainer.registerXMLParser("DOM", "DOM parser error");
      // Undeclared exception!
      try { 
        documentContainer0.setValue((Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = "F\\";
      String string1 = "";
      DocumentContainer.registerXMLParser("F", "");
      URI uRI0 = MockURI.aFTPURI;
      URI uRI1 = MockURI.resolve(uRI0, "F");
      URL uRL0 = MockURI.toURL(uRI1);
      String string2 = " (3'!Z";
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, string2);
      boolean boolean0 = false;
      documentContainer0.setValidating(boolean0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      boolean boolean1 = true;
      documentContainer0.setCoalescing(boolean1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      int int0 = 0;
      PipedInputStream pipedInputStream1 = null;
      try {
        pipedInputStream1 = new PipedInputStream(pipedOutputStream0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "QeW>nUu_");
      try { 
        MockURL.openStream(uRL0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = null;
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DocumentContainer.registerXMLParser("PzW*R", "1zy");
      MockFile mockFile0 = new MockFile("L%TUs+Mt", "");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, (String) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        documentContainer0.setValue(object0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }
}
