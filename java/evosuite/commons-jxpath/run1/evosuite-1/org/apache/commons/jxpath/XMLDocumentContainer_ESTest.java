
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


package org.apache.commons.jxpath;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URL;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XMLDocumentContainer_ESTest extends XMLDocumentContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XMLDocumentContainer xMLDocumentContainer0 = null;
      try {
        xMLDocumentContainer0 = new XMLDocumentContainer((URL) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource("");
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      // Undeclared exception!
      try { 
        xMLDocumentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ; org.xml.sax.SAXParseException; systemId: file:///Users/mkim754/IdeaProjects/aster-benchmark/commons-jxpath-1.3/; lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SAXSource sAXSource0 = new SAXSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(sAXSource0);
      Object object0 = xMLDocumentContainer0.getValue();
      Object object1 = xMLDocumentContainer0.getValue();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XMLDocumentContainer xMLDocumentContainer0 = null;
      try {
        xMLDocumentContainer0 = new XMLDocumentContainer((Source) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Source is null
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StreamSource streamSource0 = new StreamSource();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      // Undeclared exception!
      try { 
        xMLDocumentContainer0.setValue(xMLDocumentContainer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        xMLDocumentContainer0.getValue();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot read XML from: ftp://ftp.someFakeButWellFormedURL.org/fooExample; java.lang.NullPointerException
         //
         verifyException("org.apache.commons.jxpath.XMLDocumentContainer", e);
      }
  }
}
