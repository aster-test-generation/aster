/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:09:07 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Location;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RouteCandidate_ESTest extends RouteCandidate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      RouteCandidate routeCandidate0 = new RouteCandidate(linkedList0);
      List<Leg> list0 = routeCandidate0.getLegs();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      Leg leg0 = new Leg("r*Rks4", (Location) null, (Location) null, localDateTime0, localDateTime0);
      List<Leg> list0 = List.of(leg0, leg0, leg0, leg0, leg0, leg0, leg0, leg0, leg0, leg0);
      RouteCandidate routeCandidate0 = new RouteCandidate(list0);
      // Undeclared exception!
      try { 
        routeCandidate0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      RouteCandidate routeCandidate0 = new RouteCandidate(linkedList0);
      String string0 = routeCandidate0.toString();
      assertEquals("RouteCandidate{legs=[]}", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RouteCandidate routeCandidate0 = new RouteCandidate((List<Leg>) null);
      // Undeclared exception!
      try { 
        routeCandidate0.getLegs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }
}