/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:17:34 GMT 2024
 */

package org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.eclipse.cargotracker.domain.model.cargo.Itinerary;
import org.eclipse.cargotracker.infrastructure.persistence.jpa.JpaLocationRepository;
import org.eclipse.cargotracker.infrastructure.persistence.jpa.JpaVoyageRepository;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.Leg;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.RouteCandidate;
import org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler.ItineraryCandidateDtoAssembler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ItineraryCandidateDtoAssembler_ESTest extends ItineraryCandidateDtoAssembler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItineraryCandidateDtoAssembler itineraryCandidateDtoAssembler0 = new ItineraryCandidateDtoAssembler();
      LinkedList<Leg> linkedList0 = new LinkedList<Leg>();
      linkedList0.add((Leg) null);
      RouteCandidate routeCandidate0 = new RouteCandidate(linkedList0);
      JpaVoyageRepository jpaVoyageRepository0 = new JpaVoyageRepository();
      JpaLocationRepository jpaLocationRepository0 = new JpaLocationRepository();
      // Undeclared exception!
      try { 
        itineraryCandidateDtoAssembler0.fromDTO(routeCandidate0, jpaVoyageRepository0, jpaLocationRepository0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler.ItineraryCandidateDtoAssembler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItineraryCandidateDtoAssembler itineraryCandidateDtoAssembler0 = new ItineraryCandidateDtoAssembler();
      Itinerary itinerary0 = Itinerary.EMPTY_ITINERARY;
      RouteCandidate routeCandidate0 = itineraryCandidateDtoAssembler0.toDto(itinerary0);
      JpaLocationRepository jpaLocationRepository0 = new JpaLocationRepository();
      JpaVoyageRepository jpaVoyageRepository0 = new JpaVoyageRepository();
      // Undeclared exception!
      try { 
        itineraryCandidateDtoAssembler0.fromDTO(routeCandidate0, jpaVoyageRepository0, jpaLocationRepository0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/Validate
         //
         verifyException("org.eclipse.cargotracker.domain.model.cargo.Itinerary", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ItineraryCandidateDtoAssembler itineraryCandidateDtoAssembler0 = new ItineraryCandidateDtoAssembler();
      // Undeclared exception!
      try { 
        itineraryCandidateDtoAssembler0.toDto((Itinerary) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler.ItineraryCandidateDtoAssembler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ItineraryCandidateDtoAssembler itineraryCandidateDtoAssembler0 = new ItineraryCandidateDtoAssembler();
      org.eclipse.cargotracker.domain.model.cargo.Leg leg0 = new org.eclipse.cargotracker.domain.model.cargo.Leg();
      // Undeclared exception!
      try { 
        itineraryCandidateDtoAssembler0.toLegDTO(leg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.interfaces.booking.facade.internal.assembler.ItineraryCandidateDtoAssembler", e);
      }
  }
}
