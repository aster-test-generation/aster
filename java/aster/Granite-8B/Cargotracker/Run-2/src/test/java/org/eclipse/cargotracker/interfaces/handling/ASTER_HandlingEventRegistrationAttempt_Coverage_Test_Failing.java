/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.domain.model.cargo.TrackingId;
import org.eclipse.cargotracker.domain.model.handling.HandlingEvent;
import org.eclipse.cargotracker.domain.model.location.UnLocode;
import org.eclipse.cargotracker.domain.model.voyage.VoyageNumber;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingEventRegistrationAttempt_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_EJOn0() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId("id"), new VoyageNumber("123"), HandlingEvent.Type.LOAD, new UnLocode("countryAndLocation"));
    assertEquals("HandlingEventRegistrationAttempt{" + "registrationTime=" + handlingEventRegistrationAttempt.getRegistrationTime() + ", completionTime=" + handlingEventRegistrationAttempt.getCompletionTime() + ", trackingId=" + handlingEventRegistrationAttempt.getTrackingId() + ", voyageNumber=" + handlingEventRegistrationAttempt.getVoyageNumber() + ", type=" + handlingEventRegistrationAttempt.getType() + ", unLocode=" + handlingEventRegistrationAttempt.getUnLocode() + "}", handlingEventRegistrationAttempt.toString());
  }
}