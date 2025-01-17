/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:02:57 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.web.CargoDetails;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CargoDetails_ESTest extends CargoDetails_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CargoDetails cargoDetails0 = new CargoDetails();
      cargoDetails0.setTrackingId("LAkg.~k82olN]s");
      String string0 = cargoDetails0.getTrackingId();
      assertEquals("LAkg.~k82olN]s", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CargoDetails cargoDetails0 = new CargoDetails();
      // Undeclared exception!
      try { 
        cargoDetails0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.web.CargoDetails", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CargoDetails cargoDetails0 = new CargoDetails();
      cargoDetails0.setTrackingId("");
      String string0 = cargoDetails0.getTrackingId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CargoDetails cargoDetails0 = new CargoDetails();
      String string0 = cargoDetails0.getTrackingId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CargoDetails cargoDetails0 = new CargoDetails();
      CargoRoute cargoRoute0 = cargoDetails0.getCargo();
      assertNull(cargoRoute0);
  }
}
