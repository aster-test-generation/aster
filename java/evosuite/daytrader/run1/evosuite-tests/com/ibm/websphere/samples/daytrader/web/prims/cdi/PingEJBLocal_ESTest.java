/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:54:45 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.web.prims.cdi.PingEJBLocal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PingEJBLocal_ESTest extends PingEJBLocal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PingEJBLocal pingEJBLocal0 = new PingEJBLocal();
      String string0 = pingEJBLocal0.getMsg();
      assertEquals("PingEJBLocal: 0", string0);
  }
}
