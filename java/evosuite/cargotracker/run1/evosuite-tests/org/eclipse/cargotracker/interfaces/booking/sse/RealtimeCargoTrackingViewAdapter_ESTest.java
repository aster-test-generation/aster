/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:06:12 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.sse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.eclipse.cargotracker.domain.model.cargo.Cargo;
import org.eclipse.cargotracker.interfaces.booking.sse.LocationViewAdapter;
import org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RealtimeCargoTrackingViewAdapter_ESTest extends RealtimeCargoTrackingViewAdapter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter(cargo0);
      LocationViewAdapter locationViewAdapter0 = realtimeCargoTrackingViewAdapter0.getOrigin();
      assertNotNull(locationViewAdapter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter((Cargo) null);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.getStatusCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter((Cargo) null);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.getLocation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter((Cargo) null);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.getOrigin();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter(cargo0);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.getLastKnownLocation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter(cargo0);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.isMisdirected();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter(cargo0);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.getTrackingId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter((Cargo) null);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.isAtDestination();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter(cargo0);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.getTransportStatus();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Cargo cargo0 = new Cargo();
      RealtimeCargoTrackingViewAdapter realtimeCargoTrackingViewAdapter0 = new RealtimeCargoTrackingViewAdapter(cargo0);
      // Undeclared exception!
      try { 
        realtimeCargoTrackingViewAdapter0.getRoutingStatus();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.sse.RealtimeCargoTrackingViewAdapter", e);
      }
  }
}
