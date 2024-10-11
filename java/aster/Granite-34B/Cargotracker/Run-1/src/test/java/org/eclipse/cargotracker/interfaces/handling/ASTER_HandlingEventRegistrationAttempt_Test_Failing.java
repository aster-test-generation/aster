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

public class Aster_HandlingEventRegistrationAttempt_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithEmptyValues_KSrY2() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId(""), new VoyageNumber(""), HandlingEvent.Type.LOAD, new UnLocode(""));
    assertEquals("HandlingEventRegistrationAttempt{" + "registrationTime=" + attempt.getRegistrationTime() + ", completionTime=" + attempt.getCompletionTime() + ", trackingId=" + attempt.getTrackingId() + ", voyageNumber=" + attempt.getVoyageNumber() + ", type=" + attempt.getType() + ", unLocode=" + attempt.getUnLocode() + "}", attempt.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getRegistrationTime_returns_the_correct_registration_time_for_another_case_WRmX1() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.of(2022, 3, 1, 12, 0),
            LocalDateTime.of(2022, 4, 1, 12, 0),
            new TrackingId("XYZ789"),
            new VoyageNumber("CD456"),
            HandlingEvent.Type.UNLOAD,
            new UnLocode("JPNTOK")
    );
    assertEquals(LocalDateTime.of(2022, 3, 1, 12, 0), attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getCompletionTime_nullCompletionDate_Jyxt1() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.of(2022, 1, 1, 10, 0),
            null,
            new TrackingId("123"),
            new VoyageNumber("AB123"),
            HandlingEvent.Type.LOAD,
            new UnLocode("USCHI")
    );
    assertEquals(LocalDateTime.of(2022, 1, 1, 10, 0), attempt.getCompletionTime());
  }
}