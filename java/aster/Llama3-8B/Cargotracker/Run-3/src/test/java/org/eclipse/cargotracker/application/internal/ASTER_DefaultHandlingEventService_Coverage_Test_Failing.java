/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.application.internal;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.CannotCreateHandlingEventException;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DefaultHandlingEventService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventNullType_PKaw4() throws org.eclipse.cargotracker.domain.model.handling.CannotCreateHandlingEventException {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("trackingId");
    VoyageNumber voyageNumber = new VoyageNumber("voyageNumber");
    UnLocode unLocode = new UnLocode("countryAndLocation");
    try {
      service.registerHandlingEvent(completionTime, trackingId, voyageNumber, unLocode, null);
      fail("Expected CannotCreateHandlingEventException");
    } catch (CannotCreateHandlingEventException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testRegisterHandlingEventNullUnLocode_Fyif3_tkKn0() throws org.eclipse.cargotracker.domain.model.handling.CannotCreateHandlingEventException {
    DefaultHandlingEventService service = new DefaultHandlingEventService();
    LocalDateTime completionTime = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("trackingId");
    VoyageNumber voyageNumber = new VoyageNumber("voyageNumber");
    org.eclipse.cargotracker.domain.model.handling.HandlingEvent.Type type = org.eclipse.cargotracker.domain.model.handling.HandlingEvent.Type.LOAD;
    try {
      service.registerHandlingEvent(completionTime, trackingId, voyageNumber, null, type);
      fail("Expected CannotCreateHandlingEventException");
    } catch (CannotCreateHandlingEventException e) {
    }
  }
}