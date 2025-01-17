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

public class Aster_HandlingEventRegistrationAttempt_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnLocode_srFY0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("12345");
    VoyageNumber voyageNumber = new VoyageNumber("VN123");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    UnLocode result = attempt.getUnLocode();
    assertEquals(unLocode, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_MkMz0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("12345");
    VoyageNumber voyageNumber = new VoyageNumber("VN123");
    HandlingEvent.Type expectedType = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, expectedType, unLocode);
    HandlingEvent.Type resultType = attempt.getType();
    assertEquals(expectedType, resultType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_DUcV0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("12345");
    VoyageNumber voyageNumber = new VoyageNumber("VN123");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    VoyageNumber result = attempt.getVoyageNumber();
    assertEquals(voyageNumber, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTime_yGWa0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.of(2023, 3, 15, 10, 0);
    LocalDateTime completionDate = LocalDateTime.of(2023, 3, 15, 12, 0);
    TrackingId trackingId = new TrackingId("12345");
    VoyageNumber voyageNumber = new VoyageNumber("VN1001");
    HandlingEvent.Type eventType = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, eventType, unLocode);
    LocalDateTime result = attempt.getRegistrationTime();
    assertEquals(registrationDate, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_iQRZ0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("ABC123");
    VoyageNumber voyageNumber = new VoyageNumber("VN123");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    TrackingId result = attempt.getTrackingId();
    assertEquals(trackingId, result);
  }
}