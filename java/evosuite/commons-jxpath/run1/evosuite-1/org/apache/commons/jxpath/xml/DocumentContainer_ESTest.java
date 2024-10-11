
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
import java.net.URL;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.xml.XMLParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DocumentContainer_ESTest extends DocumentContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentContainer.registerXMLParser("JDOM", "DOM");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
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
  public void test2()  throws Throwable  {
      DocumentContainer documentContainer0 = null;
      try {
        documentContainer0 = new DocumentContainer((URL) null, "org.apache.commons.jxpath.xml.XMLParser2");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // XML URL is null
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      DocumentContainer.registerXMLParser("", (XMLParser) documentContainer0);
      assertFalse(documentContainer0.isIgnoringElementContentWhitespace());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockFile mockFile0 = new MockFile("-$DTuK&x~Z9zvm");
      URL uRL0 = mockFile0.toURL();
      DocumentContainer documentContainer0 = new DocumentContainer(uRL0);
      // Undeclared exception!
      try { 
        documentContainer0.setValue(mockFile0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.xml.DocumentContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
}
