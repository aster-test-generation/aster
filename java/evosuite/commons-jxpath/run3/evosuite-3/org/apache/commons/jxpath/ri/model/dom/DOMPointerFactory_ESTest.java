
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


package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DOMPointerFactory_ESTest extends DOMPointerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName("");
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      NodePointer nodePointer0 = dOMPointerFactory0.createNodePointer((NodePointer) null, qName0, (Object) iIOMetadataNode0);
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName("");
      Locale locale0 = Locale.GERMAN;
      NodePointer nodePointer0 = dOMPointerFactory0.createNodePointer(qName0, (Object) "", locale0);
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName(" iWF#0Q9}w6$`");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, dOMPointerFactory0, locale0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer1 = dOMPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) iIOMetadataNode0);
      assertFalse(nodePointer1.isRoot());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName(" iWF#0Q9}w6$`");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      NodePointer nodePointer0 = dOMPointerFactory0.createNodePointer(qName0, (Object) iIOMetadataNode0, locale0);
      assertTrue(nodePointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      QName qName0 = new QName(" iWF#0Q9}w6$`");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, dOMPointerFactory0, locale0);
      dOMPointerFactory0.createNodePointer(nodePointer0, qName0, (Object) locale0);
      assertEquals(100, dOMPointerFactory0.getOrder());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DOMPointerFactory dOMPointerFactory0 = new DOMPointerFactory();
      int int0 = dOMPointerFactory0.getOrder();
      assertEquals(100, int0);
  }
}
