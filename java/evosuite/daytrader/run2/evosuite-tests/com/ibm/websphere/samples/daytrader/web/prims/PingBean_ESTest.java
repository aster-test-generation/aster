/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:54:29 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.prims;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.web.prims.PingBean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PingBean_ESTest extends PingBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PingBean pingBean0 = new PingBean();
      pingBean0.setMsg("a*5rA]SHFd)QS}");
      String string0 = pingBean0.getMsg();
      assertEquals("a*5rA]SHFd)QS}", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PingBean pingBean0 = new PingBean();
      pingBean0.setMsg("");
      String string0 = pingBean0.getMsg();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PingBean pingBean0 = new PingBean();
      String string0 = pingBean0.getMsg();
      assertNull(string0);
  }
}