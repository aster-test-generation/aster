/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:06:58 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.prims.jaxrs;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.web.prims.jaxrs.JAXRSSyncService;
import com.ibm.websphere.samples.daytrader.web.prims.jaxrs.TestJSONObject;
import com.ibm.websphere.samples.daytrader.web.prims.jaxrs.XMLObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JAXRSSyncService_ESTest extends JAXRSSyncService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JAXRSSyncService jAXRSSyncService0 = new JAXRSSyncService();
      String string0 = jAXRSSyncService0.echoString((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JAXRSSyncService jAXRSSyncService0 = new JAXRSSyncService();
      String string0 = jAXRSSyncService0.echoString("com.ibm.websphere.samples.daytrader.web.prims.jaxrs.TestJSONObject");
      assertEquals("com.ibm.websphere.samples.daytrader.web.prims.jaxrs.TestJSONObject", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JAXRSSyncService jAXRSSyncService0 = new JAXRSSyncService();
      XMLObject xMLObject0 = jAXRSSyncService0.echoObject((XMLObject) null);
      assertNull(xMLObject0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JAXRSSyncService jAXRSSyncService0 = new JAXRSSyncService();
      TestJSONObject testJSONObject0 = jAXRSSyncService0.echoObject((TestJSONObject) null);
      assertNull(testJSONObject0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JAXRSSyncService jAXRSSyncService0 = new JAXRSSyncService();
      TestJSONObject testJSONObject0 = new TestJSONObject();
      TestJSONObject testJSONObject1 = jAXRSSyncService0.echoObject(testJSONObject0);
      assertNull(testJSONObject1.getProp0004());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JAXRSSyncService jAXRSSyncService0 = new JAXRSSyncService();
      XMLObject xMLObject0 = new XMLObject();
      XMLObject xMLObject1 = jAXRSSyncService0.echoObject(xMLObject0);
      assertSame(xMLObject1, xMLObject0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JAXRSSyncService jAXRSSyncService0 = new JAXRSSyncService();
      String string0 = jAXRSSyncService0.echoString("");
      assertEquals("", string0);
  }
}