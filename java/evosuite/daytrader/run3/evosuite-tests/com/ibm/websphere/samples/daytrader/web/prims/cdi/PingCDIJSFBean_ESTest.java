/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:58:36 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ibm.websphere.samples.daytrader.web.prims.cdi.PingCDIJSFBean;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PingCDIJSFBean_ESTest extends PingCDIJSFBean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PingCDIJSFBean pingCDIJSFBean0 = new PingCDIJSFBean();
      int int0 = pingCDIJSFBean0.getHitCount();
      assertEquals(1, int0);
  }
}
