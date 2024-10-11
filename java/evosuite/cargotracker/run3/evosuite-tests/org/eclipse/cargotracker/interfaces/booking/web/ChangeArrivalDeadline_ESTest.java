/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:00:23 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.web;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.eclipse.cargotracker.interfaces.booking.web.ChangeArrivalDeadline;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChangeArrivalDeadline_ESTest extends ChangeArrivalDeadline_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      changeArrivalDeadline0.setTrackingId("lGvK/Qi8kaNgoAp/u");
      String string0 = changeArrivalDeadline0.getTrackingId();
      assertEquals("lGvK/Qi8kaNgoAp/u", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      CargoRoute cargoRoute0 = changeArrivalDeadline0.getCargo();
      assertNull(cargoRoute0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      // Undeclared exception!
      try { 
        changeArrivalDeadline0.load();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.web.ChangeArrivalDeadline", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      changeArrivalDeadline0.setTrackingId("");
      String string0 = changeArrivalDeadline0.getTrackingId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      LocalDate localDate0 = changeArrivalDeadline0.getArrivalDeadline();
      assertNull(localDate0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      // Undeclared exception!
      try { 
        changeArrivalDeadline0.changeArrivalDeadline();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.web.ChangeArrivalDeadline", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      LocalDate localDate0 = MockLocalDate.now();
      changeArrivalDeadline0.setArrivalDeadline(localDate0);
      LocalDate localDate1 = changeArrivalDeadline0.getArrivalDeadline();
      assertSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChangeArrivalDeadline changeArrivalDeadline0 = new ChangeArrivalDeadline();
      String string0 = changeArrivalDeadline0.getTrackingId();
      assertNull(string0);
  }
}
