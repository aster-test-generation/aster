/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:42:43 GMT 2024
 */

package org.eclipse.cargotracker.domain.model.cargo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.domain.model.cargo.Delivery;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.domain.model.cargo.RouteSpecification;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingHistory;
import org.eclipse.cargotracker.domain.model.location.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Cargo_ESTest extends Cargo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      Object object0 = new Object();
      boolean boolean0 = cargo0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      boolean boolean0 = cargo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      boolean boolean0 = cargo0.equals(cargo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      Cargo cargo1 = new Cargo();
      // Undeclared exception!
      try { 
        cargo0.equals(cargo1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Cargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RouteSpecification routeSpecification0 = new RouteSpecification();
      Cargo cargo0 = new Cargo();
      // Undeclared exception!
      try { 
        cargo0.specifyNewRoute(routeSpecification0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Cargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      Location location0 = cargo0.getOrigin();
      assertNull(location0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      // Undeclared exception!
      try { 
        cargo0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Cargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      RouteSpecification routeSpecification0 = new RouteSpecification();
      Cargo cargo0 = null;
      try {
        cargo0 = new Cargo(trackingId0, routeSpecification0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Cargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      // Undeclared exception!
      try { 
        cargo0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Cargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      cargo0.setOrigin((Location) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      Delivery delivery0 = cargo0.getDelivery();
      assertNull(delivery0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      Itinerary itinerary0 = cargo0.getItinerary();
      // Undeclared exception!
      try { 
        cargo0.assignToRoute(itinerary0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Cargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      // Undeclared exception!
      try { 
        cargo0.deriveDeliveryProgress((HandlingHistory) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Delivery", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      RouteSpecification routeSpecification0 = cargo0.getRouteSpecification();
      assertNull(routeSpecification0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      TrackingId trackingId0 = cargo0.getTrackingId();
      assertNull(trackingId0);
  }
}
