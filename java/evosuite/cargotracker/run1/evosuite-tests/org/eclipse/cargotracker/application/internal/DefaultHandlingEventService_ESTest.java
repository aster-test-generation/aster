/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 16:30:01 GMT 2024
 */

package org.eclipse.cargotracker.application.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.LocalDateTime;
import org.eclipse.cargotracker.application.internal.DefaultHandlingEventService;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultHandlingEventService_ESTest extends DefaultHandlingEventService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TrackingId trackingId0 = new TrackingId();
      VoyageNumber voyageNumber0 = new VoyageNumber();
      UnLocode unLocode0 = new UnLocode();
      HandlingEvent.Type handlingEvent_Type0 = HandlingEvent.Type.CLAIM;
      DefaultHandlingEventService defaultHandlingEventService0 = new DefaultHandlingEventService();
      // Undeclared exception!
      try { 
        defaultHandlingEventService0.registerHandlingEvent((LocalDateTime) null, trackingId0, voyageNumber0, unLocode0, handlingEvent_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.cargotracker.application.internal.DefaultHandlingEventService", e);
      }
  }
}
