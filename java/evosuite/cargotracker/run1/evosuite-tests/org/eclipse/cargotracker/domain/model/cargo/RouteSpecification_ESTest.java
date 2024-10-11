/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:45:14 GMT 2024
 */

package org.eclipse.cargotracker.domain.model.cargo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDate;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.RouteSpecification;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RouteSpecification_ESTest extends RouteSpecification_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RouteSpecification routeSpecification0 = null;
      try {
        routeSpecification0 = new RouteSpecification((Location) null, (Location) null, (LocalDate) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.RouteSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      Location location0 = routeSpecification0.getOrigin();
      assertNull(location0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      Object object0 = new Object();
      boolean boolean0 = routeSpecification0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      boolean boolean0 = routeSpecification0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      boolean boolean0 = routeSpecification0.equals(routeSpecification0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      RouteSpecification routeSpecification1 = new RouteSpecification();
      // Undeclared exception!
      try { 
        routeSpecification0.equals(routeSpecification1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/builder/EqualsBuilder
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.RouteSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      boolean boolean0 = routeSpecification0.isSatisfiedBy((Itinerary) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      // Undeclared exception!
      try { 
        routeSpecification0.isSatisfiedBy(itinerary0);
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
      RouteSpecification routeSpecification0 = new RouteSpecification();
      Location location0 = routeSpecification0.getDestination();
      assertNull(location0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      // Undeclared exception!
      try { 
        routeSpecification0.hashCode();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/builder/HashCodeBuilder
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.RouteSpecification", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      LocalDate localDate0 = routeSpecification0.getArrivalDeadline();
      assertNull(localDate0);
  }
}
