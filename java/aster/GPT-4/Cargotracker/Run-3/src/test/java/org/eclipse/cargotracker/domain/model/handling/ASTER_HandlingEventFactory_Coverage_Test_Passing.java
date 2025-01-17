/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.domain.model.handling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Aster_HandlingEventFactory_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCreateHandlingEventWithCargoNotFound_FGCH3_PhEg0() throws org.eclipse.cargotracker.domain.model.handling.CannotCreateHandlingEventException {
    HandlingEventFactory factory = mock(HandlingEventFactory.class);
    TrackingId trackingId = new TrackingId("TRACK123");
    VoyageNumber voyageNumber = new VoyageNumber("VOY123");
    UnLocode unlocode = new UnLocode("USNYC");
    LocalDateTime registrationTime = LocalDateTime.now();
    LocalDateTime completionTime = LocalDateTime.now().plusHours(2);
    HandlingEvent.Type type = HandlingEvent.Type.CUSTOMS;
    when(factory.createHandlingEvent(registrationTime, completionTime, trackingId, voyageNumber, unlocode, type)).thenThrow(new CannotCreateHandlingEventException(new Exception("Cargo not found")));
    try {
      factory.createHandlingEvent(registrationTime, completionTime, trackingId, voyageNumber, unlocode, type);
      fail("Expected an CannotCreateHandlingEventException to be thrown");
    } catch (CannotCreateHandlingEventException e) {
      assertTrue(e.getCause() instanceof Exception);
      assertEquals("Cargo not found", e.getCause().getMessage());
    }
  }
}