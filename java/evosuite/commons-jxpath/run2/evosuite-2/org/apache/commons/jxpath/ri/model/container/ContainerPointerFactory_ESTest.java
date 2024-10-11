
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


package org.apache.commons.jxpath.ri.model.container;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URL;
import java.util.Locale;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.jxpath.XMLDocumentContainer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ContainerPointerFactory_ESTest extends ContainerPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory", "org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory");
      MockFile mockFile0 = new MockFile("");
      StreamSource streamSource0 = new StreamSource(mockFile0);
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(streamSource0);
      Locale locale0 = Locale.ITALIAN;
      NodePointer nodePointer0 = containerPointerFactory0.createNodePointer(qName0, (Object) xMLDocumentContainer0, locale0);
      NodePointer nodePointer1 = containerPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) xMLDocumentContainer0);
      assertNotSame(nodePointer0, nodePointer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName("UN/E");
      URL uRL0 = MockURL.getFtpExample();
      XMLDocumentContainer xMLDocumentContainer0 = new XMLDocumentContainer(uRL0);
      NodePointer nodePointer0 = containerPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) xMLDocumentContainer0);
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName("UN/E");
      URL uRL0 = MockURL.getFtpExample();
      NodePointer nodePointer0 = containerPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) uRL0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      QName qName0 = new QName("UN/E");
      Locale locale0 = Locale.KOREAN;
      NodePointer nodePointer0 = containerPointerFactory0.createNodePointer(qName0, (Object) "UN/E", locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContainerPointerFactory containerPointerFactory0 = new ContainerPointerFactory();
      int int0 = containerPointerFactory0.getOrder();
      assertEquals(200, int0);
  }
}
