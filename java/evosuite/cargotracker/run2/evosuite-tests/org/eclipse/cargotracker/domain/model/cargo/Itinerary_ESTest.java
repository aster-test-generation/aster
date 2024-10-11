/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:39:19 GMT 2024
 */

package org.eclipse.cargotracker.domain.model.cargo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import java.util.List;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.Leg;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Itinerary_ESTest extends Itinerary_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Itinerary itinerary0 = new Itinerary();
      itinerary0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Itinerary itinerary0 = new Itinerary();
      Leg leg0 = itinerary0.getLastLeg();
      assertNull(leg0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      List<Leg> list0 = itinerary0.getLegs();
      boolean boolean0 = itinerary0.equals(list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      boolean boolean0 = itinerary0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      boolean boolean0 = itinerary0.equals(itinerary0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      Itinerary itinerary1 = new Itinerary();
      boolean boolean0 = itinerary0.equals(itinerary1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      LocalDateTime localDateTime0 = itinerary0.getFinalArrivalDate();
      assertNotNull(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      // Undeclared exception!
      try { 
        itinerary0.getFinalArrivalLocation();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.eclipse.cargotracker.domain.model.location.Location
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Itinerary", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      // Undeclared exception!
      try { 
        itinerary0.getInitialDepartureLocation();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.eclipse.cargotracker.domain.model.location.Location
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Itinerary", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      HandlingEvent handlingEvent0 = new HandlingEvent();
      boolean boolean0 = itinerary0.EMPTY_ITINERARY.isExpected(handlingEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Itinerary itinerary0 = new Itinerary();
      String string0 = itinerary0.toString();
      assertEquals("Itinerary{legs=[]}", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Itinerary itinerary0 = null;
      try {
        itinerary0 = new Itinerary((List<Leg>) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Itinerary", e);
      }
  }
}
