
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
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.SequenceInputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Enumeration;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.JDOMParser;
import org.apache.commons.jxpath.xml.XMLParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DocumentContainer_ESTest extends DocumentContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URL uRL1 = MockURL.URL(uRL0, "(q &*S/");
      DocumentContainer documentContainer0 = new DocumentContainer(uRL1);
      // Undeclared exception!
      try { 
        documentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: http://www.someFakeButWellFormedURL.org/(q &*S/(q &*S/; Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DocumentContainer.registerXMLParser("org.apache.commons.jxpath.xml.DocumentContainer", "org.apache.commons.jxpath.xml.DocumentContainer");
      URL uRL0 = MockURL.getFileExample();
      URL uRL1 = MockURL.URL(uRL0, "Lsjoa$z");
      DocumentContainer documentContainer0 = new DocumentContainer(uRL1, "P%Eu`");
      Enumeration<FilterInputStream> enumeration0 = (Enumeration<FilterInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(bufferedInputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: P%Eu`
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, ".65pXMqO");
      // Undeclared exception!
      try { 
        documentContainer0.parseXML((InputStream) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported XML model: .65pXMqO
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">S", ">S");
      URL uRL0 = mockFile0.toURL();
      URL uRL1 = MockURL.URL(uRL0, ">S");
      mockFile0.setReadable(true, true);
      DocumentContainer documentContainer0 = new DocumentContainer(uRL1);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = "";
      DocumentContainer.registerXMLParser("", "");
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "");
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
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "");
      DocumentContainer.registerXMLParser("JDOM", "");
      // Undeclared exception!
      try { 
        documentContainer0.setValue("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      String string0 = "?Z*?hz4nLFjB";
      MockFile mockFile0 = new MockFile("?Z*?hz4nLFjB");
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
  public void test09()  throws Throwable  {
      String string0 = "org.apache.commons.jxpath.xml.DOMParser";
      JDOMParser jDOMParser0 = new JDOMParser();
      boolean boolean0 = true;
      jDOMParser0.setIgnoringComments(true);
      jDOMParser0.setIgnoringElementContentWhitespace(true);
      DocumentContainer.registerXMLParser("org.apache.commons.jxpath.xml.DOMParser", (XMLParser) jDOMParser0);
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
  public void test10()  throws Throwable  {
      try { 
        MockURL.URL("DOM", "DOM", "DOM");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: dom
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DocumentContainer.registerXMLParser("", "");
      DocumentContainer.registerXMLParser("H]>_UlPmVDfc#'^", (String) null);
      String string0 = "\"rnuS-u+(DBf\"G";
      DocumentContainer.registerXMLParser("HqIjwI\"M_dvgXW[[&@", "\"rnuS-u+(DBf\"G");
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "H]>_UlPmVDfc#'^");
      // Undeclared exception!
      try { 
        documentContainer0.setValue("HqIjwI\"M_dvgXW[[&@");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "MnC$TfmB#*");
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
  public void test13()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0, "{BWqDAM*JAi");
      boolean boolean0 = false;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)73;
      byteArray0[1] = (byte) (-45);
      byteArray0[2] = (byte) (-12);
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte) (-107);
      byteArray0[6] = (byte)83;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        documentContainer0.parseXML(byteArrayInputStream0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // DOM parser error; Invalid byte 2 of 2-byte UTF-8 sequence.
         //
         verifyException("org.apache.commons.jxpath.xml.DOMParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      MockFile mockFile0 = null;
      try {
        mockFile0 = new MockFile(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI scheme is not \"file\"
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "";
      try { 
        MockURL.URL("", "org.apache.commons.jxpath.xml.JDOMParser", "l,x~uhtsFal('e=e8");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: 
         //
         verifyException("java.net.URL", e);
      }
  }
}
