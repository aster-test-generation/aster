/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:50:15 GMT 2024
 */

package org.eclipse.cargotracker.domain.model.handling;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.UnknownCargoException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnknownCargoException_ESTest extends UnknownCargoException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      UnknownCargoException unknownCargoException0 = new UnknownCargoException(trackingId0);
      String string0 = unknownCargoException0.getMessage();
      assertEquals("No cargo with tracking id null exists in the system.", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnknownCargoException unknownCargoException0 = new UnknownCargoException((TrackingId) null);
      // Undeclared exception!
      try { 
        unknownCargoException0.getMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.domain.model.handling.UnknownCargoException", e);
      }
  }
}
