/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:48:32 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.websocket;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.web.websocket.JsonMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonMessage_ESTest extends JsonMessage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonMessage jsonMessage0 = new JsonMessage();
      jsonMessage0.setValue("B~ut`L+Mp$0>PFOwG=");
      String string0 = jsonMessage0.getValue();
      assertEquals("B~ut`L+Mp$0>PFOwG=", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JsonMessage jsonMessage0 = new JsonMessage();
      jsonMessage0.setKey("B~ut`L+Mp$0>PFOwG=");
      String string0 = jsonMessage0.getKey();
      assertEquals("B~ut`L+Mp$0>PFOwG=", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JsonMessage jsonMessage0 = new JsonMessage();
      jsonMessage0.setKey("");
      String string0 = jsonMessage0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JsonMessage jsonMessage0 = new JsonMessage();
      String string0 = jsonMessage0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JsonMessage jsonMessage0 = new JsonMessage();
      jsonMessage0.setValue("");
      String string0 = jsonMessage0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JsonMessage jsonMessage0 = new JsonMessage();
      String string0 = jsonMessage0.getValue();
      assertNull(string0);
  }
}
