/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:26:52 GMT 2024
 */

package com.ibm.websphere.samples.daytrader.impl.ejb3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.websphere.samples.daytrader.impl.ejb3.AsyncScheduledOrderSubmitter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AsyncScheduledOrderSubmitter_ESTest extends AsyncScheduledOrderSubmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncScheduledOrderSubmitter asyncScheduledOrderSubmitter0 = new AsyncScheduledOrderSubmitter();
      // Undeclared exception!
      try { 
        asyncScheduledOrderSubmitter0.submitOrder((Integer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ibm.websphere.samples.daytrader.impl.ejb3.AsyncScheduledOrderSubmitter", e);
      }
  }
}
