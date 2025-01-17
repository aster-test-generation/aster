/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 15:58:23 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.web.prims.cdi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.web.prims.cdi.PingEJBIFace;
import com.ibm.websphere.samples.daytrader.web.prims.cdi.PingEJBLocal;
import com.ibm.websphere.samples.daytrader.web.prims.cdi.PingEJBLocalDecorator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PingEJBLocalDecorator_ESTest extends PingEJBLocalDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PingEJBLocalDecorator pingEJBLocalDecorator0 = new PingEJBLocalDecorator();
      PingEJBLocal pingEJBLocal0 = new PingEJBLocal();
      pingEJBLocalDecorator0.ejb = (PingEJBIFace) pingEJBLocal0;
      String string0 = pingEJBLocalDecorator0.getMsg();
      assertEquals("Decorated PingEJBLocal: 0", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PingEJBLocalDecorator pingEJBLocalDecorator0 = new PingEJBLocalDecorator();
      // Undeclared exception!
      try { 
        pingEJBLocalDecorator0.getMsg();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.web.prims.cdi.PingEJBLocalDecorator", e);
      }
  }
}
