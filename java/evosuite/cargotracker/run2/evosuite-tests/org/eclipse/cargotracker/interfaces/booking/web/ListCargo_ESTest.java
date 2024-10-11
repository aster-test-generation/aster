/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:04:01 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.web.ListCargo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ListCargo_ESTest extends ListCargo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListCargo listCargo0 = new ListCargo();
      List<CargoRoute> list0 = listCargo0.getClaimedCargos();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ListCargo listCargo0 = new ListCargo();
      List<CargoRoute> list0 = listCargo0.getNotRoutedCargos();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ListCargo listCargo0 = new ListCargo();
      List<CargoRoute> list0 = listCargo0.getRoutedUnclaimedCargos();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ListCargo listCargo0 = new ListCargo();
      // Undeclared exception!
      try { 
        listCargo0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.web.ListCargo", e);
      }
  }
}
